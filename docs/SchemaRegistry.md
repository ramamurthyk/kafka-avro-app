# Confluent Schema Registry integration

## Avro Schemas
MessageHeader.avsc
```JSON
{
    "namespace": "app.kafka.avrodemo.schema",
    "type": "record",
    "name": "MessageHeader",
    "fields": [
        {
            "name": "eventName",
            "type": {
                "type": "enum",
                "name": "EventName",
                "symbols": [
                    "CreateEnrolment",
                    "CancelEnrolment",
                    "UpdateEnrolment"
                ]
            }
        }
    ]
}
```
CreateEnrolment.avsc
```JSON
{
    "namespace": "app.kafka.avrodemo.schema",
    "type": "record",
    "name": "CreateEnrolment",
    "fields": [
        {
            "name": "entityId",
            "type": "int"
        },
        {
            "name": "rewardName",
            "type": "string"
        },
        {
            "name": "rewardMembershipId",
            "type": [
                "null",
                "string"
            ]
        }
    ]
}
```
CancelEnrolment.avsc
```JSON
{
    "namespace": "app.kafka.avrodemo.schema",
    "type": "record",
    "name": "CancelEnrolment",
    "fields": [
        {
            "name": "entityId",
            "type": "int"
        },
        {
            "name": "rewardName",
            "type": "string"
        },
        {
            "name": "reasonCode",
            "type": [
                "null",
                {
                    "type": "enum",
                    "name": "ReasonCode",
                    "symbols": [
                        "MemberRequested",
                        "PolicyCancelled",
                        "PartnerMembershipCancelled"
                    ]
                }
            ]
        }
    ]
}
```
EnrolmentRequest.avsc
```JSON
{
    "namespace": "app.kafka.avrodemo.schema",
    "type": "record",
    "name": "EnrolmentRequest",
    "fields": [
        {
            "name": "header",
            "type": "app.kafka.avrodemo.schema.MessageHeader"
        },
        {
            "name": "payload",
            "type": [
                "app.kafka.avrodemo.schema.CreateEnrolment",
                "app.kafka.avrodemo.schema.CancelEnrolment",
                "app.kafka.avrodemo.schema.UpdateEnrolment"
            ]
        }
    ]
}
```

## Code Generation
Avro maven plugin configuration in pom.xml
```XML
<plugin>
    <groupId>org.apache.avro</groupId>
    <artifactId>avro-maven-plugin</artifactId>
    <version>1.11.0</version>
    <executions>
        <execution>
            <phase>generate-sources</phase>
            <goals>
                <goal>schema</goal>
            </goals>
            <configuration>
                <sourceDirectory>src/main/avro</sourceDirectory>
                <imports>
                    <import>src/main/avro/MessageHeader.avsc</import>
                    <import>src/main/avro/CreateEnrolment.avsc</import>
                    <import>src/main/avro/CancelEnrolment.avsc</import>
                    <import>src/main/avro/UpdateEnrolment.avsc</import>
                    <import>src/main/avro/EnrolmentRequestMessageTypes.avsc</import>
                </imports>
                <outputDirectory>src/main/java</outputDirectory>
                <stringType>String</stringType>
            </configuration>
        </execution>
    </executions>
</plugin>
```

## Schema Registration
### Maven Configuration
Kafka schema registry maven plugin configuration in pom.xml
```XML
<plugin>
    <groupId>io.confluent</groupId>
    <artifactId>kafka-schema-registry-maven-plugin</artifactId>
    <version>7.1.0</version>
    <configuration>
        <schemaRegistryUrls>
            <param>http://localhost:8081</param>
        </schemaRegistryUrls>
        <subjects>
            <enrolment-request-value>src/main/avro/EnrolmentRequest.avsc</enrolment-request-value>
            <messageheader>src/main/avro/MessageHeader.avsc</messageheader>
            <createenrolment>src/main/avro/CreateEnrolment.avsc</createenrolment>
            <cancelenrolment>src/main/avro/CancelEnrolment.avsc</cancelenrolment>
            <updateenrolment>src/main/avro/UpdateEnrolment.avsc</updateenrolment>					
        </subjects>
        <schemaTypes>
            <enrolment-request-value>AVRO</enrolment-request-value>
            <messageheader>AVRO</messageheader>
            <createenrolment>AVRO</createenrolment>
            <cancelenrolment>AVRO</cancelenrolment>
            <updateenrolment>AVRO</updateenrolment>
        </schemaTypes>
        <references>
            <enrolment-request-value>
                <reference>
                    <name>app.kafka.avrodemo.schema.MessageHeader</name>
                    <subject>messageheader</subject>
                </reference>
                <reference>
                    <name>app.kafka.avrodemo.schema.CreateEnrolment</name>
                    <subject>createenrolment</subject>
                </reference>
                <reference>
                    <name>app.kafka.avrodemo.schema.CancelEnrolment</name>
                    <subject>cancelenrolment</subject>
                </reference>
                <reference>
                    <name>app.kafka.avrodemo.schema.UpdateEnrolment</name>
                    <subject>updateenrolment</subject>
                </reference>						
            </enrolment-request-value>
        </references>
    </configuration>
    <goals>
        <goal>register</goal>
    </goals>
</plugin>
```

### Register Command
```Bash
$ mvn schema-registry:register

[INFO] Registered subject(cancelenrolment) with id 3 version 1
[INFO] Registered subject(updateenrolment) with id 4 version 1
[INFO] Registered subject(messageheader) with id 5 version 1
[INFO] Registered subject(createenrolment) with id 6 version 1
[INFO] Registered subject(enrolment-request-value) with id 7 version 5
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  44.492 s
[INFO] Finished at: 2022-04-05T22:14:57Z
[INFO] ------------------------------------------------------------------------
```

## Schema Registry
Inspect the registered schemas and subjects via REST interface.

### Schemas
http://localhost:8081/schemas

```JSON
[
  {
    "subject": "cancelenrolment",
    "version": 1,
    "id": 3,
    "schema": "{\"type\":\"record\",\"name\":\"CancelEnrolment\",\"namespace\":\"app.kafka.avrodemo.schema\",\"fields\":[{\"name\":\"entityId\",\"type\":\"int\"},{\"name\":\"rewardName\",\"type\":\"string\"},{\"name\":\"reasonCode\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"ReasonCode\",\"symbols\":[\"MemberRequested\",\"PolicyCancelled\",\"PartnerMembershipCancelled\"]}]}]}"
  },
  {
    "subject": "createenrolment",
    "version": 1,
    "id": 6,
    "schema": "{\"type\":\"record\",\"name\":\"CreateEnrolment\",\"namespace\":\"app.kafka.avrodemo.schema\",\"fields\":[{\"name\":\"entityId\",\"type\":\"int\"},{\"name\":\"rewardName\",\"type\":\"string\"},{\"name\":\"rewardMembershipId\",\"type\":[\"null\",\"string\"]}]}"
  },
  {
    "subject": "enrolment-request-value",
    "version": 5,
    "id": 7,
    "references": [
      {
        "name": "app.kafka.avrodemo.schema.MessageHeader",
        "subject": "messageheader",
        "version": 1
      },
      {
        "name": "app.kafka.avrodemo.schema.CreateEnrolment",
        "subject": "createenrolment",
        "version": 1
      },
      {
        "name": "app.kafka.avrodemo.schema.CancelEnrolment",
        "subject": "cancelenrolment",
        "version": 1
      },
      {
        "name": "app.kafka.avrodemo.schema.UpdateEnrolment",
        "subject": "updateenrolment",
        "version": 1
      }
    ],
    "schema": "{\"type\":\"record\",\"name\":\"EnrolmentRequest\",\"namespace\":\"app.kafka.avrodemo.schema\",\"fields\":[{\"name\":\"header\",\"type\":\"MessageHeader\"},{\"name\":\"payload\",\"type\":[\"CreateEnrolment\",\"CancelEnrolment\",\"UpdateEnrolment\"]}]}"
  },
  {
    "subject": "messageheader",
    "version": 1,
    "id": 5,
    "schema": "{\"type\":\"record\",\"name\":\"MessageHeader\",\"namespace\":\"app.kafka.avrodemo.schema\",\"fields\":[{\"name\":\"eventName\",\"type\":{\"type\":\"enum\",\"name\":\"EventName\",\"symbols\":[\"CreateEnrolment\",\"CancelEnrolment\",\"UpdateEnrolment\"]}}]}"
  },
  {
    "subject": "updateenrolment",
    "version": 1,
    "id": 4,
    "schema": "{\"type\":\"record\",\"name\":\"UpdateEnrolment\",\"namespace\":\"app.kafka.avrodemo.schema\",\"fields\":[{\"name\":\"rewardName\",\"type\":\"string\"},{\"name\":\"rewardMembershipId\",\"type\":\"string\"},{\"name\":\"rewardMembershipEmail\",\"type\":[\"null\",\"string\"]}]}"
  }
]
```
### Subjects
http://localhost:8081/subjects

```JSON
[
  "cancelenrolment",
  "createenrolment",
  "enrolment-request-value",
  "messageheader",
  "updateenrolment"
]
```

## Control Centre
Inspect the schema recorded against the topic in the control centre.

```JSON
{
  "fields": [
    {
      "name": "header",
      "type": "MessageHeader"
    },
    {
      "name": "payload",
      "type": [
        "CreateEnrolment",
        "CancelEnrolment",
        "UpdateEnrolment"
      ]
    }
  ],
  "name": "EnrolmentRequest",
  "namespace": "app.kafka.avrodemo.schema",
  "type": "record"
}
```
## Execute Application
### Enrolment

Send a RESTful request to the API controller.

```Bash
POST http://localhost:8080/api/enrolments
```
```JSON
{
    "entityId": 1000,
    "rewardName": "MindfulChef",
    "rewardMembershipId": "MC1234"
}
```
Inspect the message in the topic: enrolment-request

```JSON
{
  "header": {
    "eventName": "CreateEnrolment"
  },
  "payload": {
    "app.kafka.avrodemo.schema.CreateEnrolment": {
      "entityId": 1000,
      "rewardName": "MindfulChef",
      "rewardMembershipId": {
        "string": "MC1234"
      }
    }
  }
}
```

### Cancel Enrolment

Send a RESTful request to the API controller.

```Bash
PATCH http://localhost:8080/api/enrolments
```
```JSON
{
    "entityId": 1000,
    "rewardName": "MindfulChef"
}
```
Inspect the message in the topic: enrolment-request

```JSON
{
  "header": {
    "eventName": "CancelEnrolment"
  },
  "payload": {
    "app.kafka.avrodemo.schema.CancelEnrolment": {
      "entityId": 1000,
      "rewardName": "MindfulChef",
      "reasonCode": {
        "app.kafka.avrodemo.schema.ReasonCode": "MemberRequested"
      }
    }
  }
}
```
