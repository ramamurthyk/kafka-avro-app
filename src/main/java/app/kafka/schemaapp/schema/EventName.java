/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package app.kafka.schemaapp.schema;
@org.apache.avro.specific.AvroGenerated
public enum EventName implements org.apache.avro.generic.GenericEnumSymbol<EventName> {
  CreateEnrolmentEvent, CancelEnrolmentEvent  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"EventName\",\"namespace\":\"app.kafka.schemaapp.schema\",\"symbols\":[\"CreateEnrolmentEvent\",\"CancelEnrolmentEvent\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
