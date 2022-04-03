# Useful links

https://packages.confluent.io/maven/io/confluent/kafka-schema-registry-client/7.0.1/
https://github.com/confluentinc/examples/tree/7.0.2-post/clients/avro/src/main/resources/avro/io/confluent/examples/clients/basicavro
https://docs.confluent.io/platform/current/schema-registry/schema_registry_onprem_tutorial.html#schema-registry-onprem-tutorial
https://github.com/confluentinc/springboot-kafka-avro/blob/master/src/main/java/io/confluent/developer/spring/avro/Producer.java

# Debug logs
2022-04-03 22:42:54.916  INFO 175592 --- [nio-8080-exec-4] a.k.s.enrolment.EnrolmentController      : Received POST request to create enrolment
2022-04-03 22:42:54.916  INFO 175592 --- [nio-8080-exec-4] a.k.s.enrolment.EnrolmentProducer        : Produced enrolment -> {"header": {"eventName": "CreateEnrolmentEvent"}, "payload": {"entityId": 1000, "rewardName": "MindfulChef", "rewardMembershipId": "MC1234"}}
2022-04-03 22:42:54.917 DEBUG 175592 --- [nio-8080-exec-4] m.m.a.RequestResponseBodyMethodProcessor : Using 'application/json', given [*/*] and supported [application/json, application/*+json, application/json, application/*+json]
2022-04-03 22:42:54.917 DEBUG 175592 --- [nio-8080-exec-4] m.m.a.RequestResponseBodyMethodProcessor : Nothing to write: null body
2022-04-03 22:42:54.917 DEBUG 175592 --- [nio-8080-exec-4] o.s.web.servlet.DispatcherServlet        : Completed 200 OK
2022-04-03 22:42:57.170 DEBUG 175592 --- [nio-8080-exec-5] o.s.web.servlet.DispatcherServlet        : POST "/api/enrolments", parameters={}
2022-04-03 22:42:57.171 DEBUG 175592 --- [nio-8080-exec-5] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to app.kafka.schemaapp.enrolment.EnrolmentController#CreateEnrolment(EnrolmentRequest)
2022-04-03 22:42:57.172 DEBUG 175592 --- [nio-8080-exec-5] m.m.a.RequestResponseBodyMethodProcessor : Read "application/json;charset=UTF-8" to [EnrolmentRequest[entityId=1000, rewardName=MindfulChef, rewardMembershipId=MC1234]]
2022-04-03 22:42:57.172  INFO 175592 --- [nio-8080-exec-5] a.k.s.enrolment.EnrolmentController      : Received POST request to create enrolment
2022-04-03 22:42:57.172  INFO 175592 --- [nio-8080-exec-5] a.k.s.enrolment.EnrolmentProducer        : Produced enrolment -> {"header": {"eventName": "CreateEnrolmentEvent"}, "payload": {"entityId": 1000, "rewardName": "MindfulChef", "rewardMembershipId": "MC1234"}}
2022-04-03 22:42:57.173 DEBUG 175592 --- [nio-8080-exec-5] m.m.a.RequestResponseBodyMethodProcessor : Using 'application/json', given [*/*] and supported [application/json, application/*+json, application/json, application/*+json]
2022-04-03 22:42:57.173 DEBUG 175592 --- [nio-8080-exec-5] m.m.a.RequestResponseBodyMethodProcessor : Nothing to write: null body
2022-04-03 22:42:57.173 DEBUG 175592 --- [nio-8080-exec-5] o.s.web.servlet.DispatcherServlet        : Completed 200 OK
2022-04-03 22:43:01.160  INFO 175592 --- [enrolment-0-C-1] a.k.s.enrolment.EnrolmentConsumer        : Received {"header": {"eventName": "CreateEnrolmentEvent"}, "payload": {"entityId": 1000, "rewardName": "MindfulChef", "rewardMembershipId": "MC1234"}}
2022-04-03 22:43:01.160  INFO 175592 --- [enrolment-0-C-1] a.k.s.enrolment.EnrolmentConsumer        : Received {"header": {"eventName": "CreateEnrolmentEvent"}, "payload": {"entityId": 1000, "rewardName": "MindfulChef", "rewardMembershipId": "MC1234"}}
2022-04-03 22:43:01.160  INFO 175592 --- [enrolment-0-C-1] a.k.s.enrolment.EnrolmentConsumer        : Received {"header": {"eventName": "CreateEnrolmentEvent"}, "payload": {"entityId": 1000, "rewardName": "MindfulChef", "rewardMembershipId": "MC1234"}}
2022-04-03 22:44:19.317 DEBUG 175592 --- [nio-8080-exec-8] o.s.web.servlet.DispatcherServlet        : PATCH "/api/enrolments", parameters={}
2022-04-03 22:44:19.317 DEBUG 175592 --- [nio-8080-exec-8] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to app.kafka.schemaapp.enrolment.EnrolmentController#CancelEnrolment(CancelEnrolmentRequest)
2022-04-03 22:44:19.323 DEBUG 175592 --- [nio-8080-exec-8] m.m.a.RequestResponseBodyMethodProcessor : Read "application/json;charset=UTF-8" to [CancelEnrolmentRequest[entityId=1000, rewardName=MindfulChef]]
2022-04-03 22:44:19.324  INFO 175592 --- [nio-8080-exec-8] a.k.s.enrolment.EnrolmentController      : Received PATCH request to cancel enrolment
2022-04-03 22:44:19.327  INFO 175592 --- [nio-8080-exec-8] a.k.s.enrolment.EnrolmentProducer        : Produced cancelEnrolment -> {"header": {"eventName": "CancelEnrolmentEvent"}, "payload": {"entityId": 1000, "rewardName": "MindfulChef", "reasonCode": "MemberRequested"}}
2022-04-03 22:44:19.331  INFO 175592 --- [enrolment-0-C-1] a.k.s.enrolment.EnrolmentConsumer        : Received {"header": {"eventName": "CancelEnrolmentEvent"}, "payload": {"entityId": 1000, "rewardName": "MindfulChef", "reasonCode": "MemberRequested"}}
2022-04-03 22:44:19.340 DEBUG 175592 --- [nio-8080-exec-8] m.m.a.RequestResponseBodyMethodProcessor : Using 'application/json', given [*/*] and supported [application/json, application/*+json, application/json, application/*+json]
2022-04-03 22:44:19.341 DEBUG 175592 --- [nio-8080-exec-8] m.m.a.RequestResponseBodyMethodProcessor : Nothing to write: null body
2022-04-03 22:44:19.342 DEBUG 175592 --- [nio-8080-exec-8] o.s.web.servlet.DispatcherServlet        : Completed 200 OK
^C2022-04-03 22:44:35.832 DEBUG 175592 --- [ionShutdownHook] o.s.b.a.ApplicationAvailabilityBean      : Application availability state ReadinessState changed from ACCEPTING_TRAFFIC to REFUSING_TRAFFIC
2022-04-03 22:44:35.832 DEBUG 175592 --- [ionShutdownHook] ConfigServletWebServerApplicationContext : Closing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@624ea3ad, started on Sun Apr 03 22:42:38 UTC 2022

# Registered schema
{
  "fields": [
    {
      "name": "header",
      "type": {
        "fields": [
          {
            "name": "eventName",
            "type": {
              "name": "EventName",
              "symbols": [
                "CreateEnrolmentEvent",
                "CancelEnrolmentEvent"
              ],
              "type": "enum"
            }
          }
        ],
        "name": "MessageHeader",
        "type": "record"
      }
    },
    {
      "name": "payload",
      "type": [
        {
          "fields": [
            {
              "name": "entityId",
              "type": "int"
            },
            {
              "name": "rewardName",
              "type": {
                "avro.java.string": "String",
                "type": "string"
              }
            },
            {
              "name": "rewardMembershipId",
              "type": [
                "null",
                {
                  "avro.java.string": "String",
                  "type": "string"
                }
              ]
            }
          ],
          "name": "CreateEnrolment",
          "type": "record"
        },
        {
          "fields": [
            {
              "name": "entityId",
              "type": "int"
            },
            {
              "name": "rewardName",
              "type": {
                "avro.java.string": "String",
                "type": "string"
              }
            },
            {
              "name": "reasonCode",
              "type": [
                "null",
                {
                  "name": "ReasonCode",
                  "symbols": [
                    "MemberRequested",
                    "PolicyCancelled",
                    "PartnerMembershipCancelled"
                  ],
                  "type": "enum"
                }
              ]
            }
          ],
          "name": "CancelEnrolment",
          "type": "record"
        }
      ]
    }
  ],
  "name": "BaselineEventStructure",
  "namespace": "app.kafka.schemaapp.schema",
  "type": "record"
}