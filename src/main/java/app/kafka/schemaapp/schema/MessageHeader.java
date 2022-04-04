/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package app.kafka.schemaapp.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class MessageHeader extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6366542530731485891L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MessageHeader\",\"namespace\":\"app.kafka.schemaapp.schema\",\"fields\":[{\"name\":\"eventName\",\"type\":{\"type\":\"enum\",\"name\":\"EventName\",\"symbols\":[\"CreateEnrolmentEvent\",\"CancelEnrolmentEvent\",\"UpdateEnrolment\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MessageHeader> ENCODER =
      new BinaryMessageEncoder<MessageHeader>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MessageHeader> DECODER =
      new BinaryMessageDecoder<MessageHeader>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<MessageHeader> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<MessageHeader> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<MessageHeader> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MessageHeader>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this MessageHeader to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a MessageHeader from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a MessageHeader instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static MessageHeader fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private app.kafka.schemaapp.schema.EventName eventName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MessageHeader() {}

  /**
   * All-args constructor.
   * @param eventName The new value for eventName
   */
  public MessageHeader(app.kafka.schemaapp.schema.EventName eventName) {
    this.eventName = eventName;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return eventName;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: eventName = (app.kafka.schemaapp.schema.EventName)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'eventName' field.
   * @return The value of the 'eventName' field.
   */
  public app.kafka.schemaapp.schema.EventName getEventName() {
    return eventName;
  }


  /**
   * Sets the value of the 'eventName' field.
   * @param value the value to set.
   */
  public void setEventName(app.kafka.schemaapp.schema.EventName value) {
    this.eventName = value;
  }

  /**
   * Creates a new MessageHeader RecordBuilder.
   * @return A new MessageHeader RecordBuilder
   */
  public static app.kafka.schemaapp.schema.MessageHeader.Builder newBuilder() {
    return new app.kafka.schemaapp.schema.MessageHeader.Builder();
  }

  /**
   * Creates a new MessageHeader RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MessageHeader RecordBuilder
   */
  public static app.kafka.schemaapp.schema.MessageHeader.Builder newBuilder(app.kafka.schemaapp.schema.MessageHeader.Builder other) {
    if (other == null) {
      return new app.kafka.schemaapp.schema.MessageHeader.Builder();
    } else {
      return new app.kafka.schemaapp.schema.MessageHeader.Builder(other);
    }
  }

  /**
   * Creates a new MessageHeader RecordBuilder by copying an existing MessageHeader instance.
   * @param other The existing instance to copy.
   * @return A new MessageHeader RecordBuilder
   */
  public static app.kafka.schemaapp.schema.MessageHeader.Builder newBuilder(app.kafka.schemaapp.schema.MessageHeader other) {
    if (other == null) {
      return new app.kafka.schemaapp.schema.MessageHeader.Builder();
    } else {
      return new app.kafka.schemaapp.schema.MessageHeader.Builder(other);
    }
  }

  /**
   * RecordBuilder for MessageHeader instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MessageHeader>
    implements org.apache.avro.data.RecordBuilder<MessageHeader> {

    private app.kafka.schemaapp.schema.EventName eventName;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(app.kafka.schemaapp.schema.MessageHeader.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.eventName)) {
        this.eventName = data().deepCopy(fields()[0].schema(), other.eventName);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing MessageHeader instance
     * @param other The existing instance to copy.
     */
    private Builder(app.kafka.schemaapp.schema.MessageHeader other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.eventName)) {
        this.eventName = data().deepCopy(fields()[0].schema(), other.eventName);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'eventName' field.
      * @return The value.
      */
    public app.kafka.schemaapp.schema.EventName getEventName() {
      return eventName;
    }


    /**
      * Sets the value of the 'eventName' field.
      * @param value The value of 'eventName'.
      * @return This builder.
      */
    public app.kafka.schemaapp.schema.MessageHeader.Builder setEventName(app.kafka.schemaapp.schema.EventName value) {
      validate(fields()[0], value);
      this.eventName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'eventName' field has been set.
      * @return True if the 'eventName' field has been set, false otherwise.
      */
    public boolean hasEventName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'eventName' field.
      * @return This builder.
      */
    public app.kafka.schemaapp.schema.MessageHeader.Builder clearEventName() {
      eventName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MessageHeader build() {
      try {
        MessageHeader record = new MessageHeader();
        record.eventName = fieldSetFlags()[0] ? this.eventName : (app.kafka.schemaapp.schema.EventName) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MessageHeader>
    WRITER$ = (org.apache.avro.io.DatumWriter<MessageHeader>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MessageHeader>
    READER$ = (org.apache.avro.io.DatumReader<MessageHeader>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeEnum(this.eventName.ordinal());

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.eventName = app.kafka.schemaapp.schema.EventName.values()[in.readEnum()];

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.eventName = app.kafka.schemaapp.schema.EventName.values()[in.readEnum()];
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










