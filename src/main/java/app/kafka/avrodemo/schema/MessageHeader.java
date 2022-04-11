/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package app.kafka.avrodemo.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class MessageHeader extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2385213335350476713L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MessageHeader\",\"namespace\":\"app.kafka.avrodemo.schema\",\"fields\":[{\"name\":\"messageId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"messageType\",\"type\":{\"type\":\"enum\",\"name\":\"MessageType\",\"symbols\":[\"CreateEnrolment\",\"CancelEnrolment\"]}}],\"subject\":\"messageHeader\",\"version\":1}");
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

  private java.lang.String messageId;
  private app.kafka.avrodemo.schema.MessageType messageType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MessageHeader() {}

  /**
   * All-args constructor.
   * @param messageId The new value for messageId
   * @param messageType The new value for messageType
   */
  public MessageHeader(java.lang.String messageId, app.kafka.avrodemo.schema.MessageType messageType) {
    this.messageId = messageId;
    this.messageType = messageType;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return messageId;
    case 1: return messageType;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: messageId = value$ != null ? value$.toString() : null; break;
    case 1: messageType = (app.kafka.avrodemo.schema.MessageType)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'messageId' field.
   * @return The value of the 'messageId' field.
   */
  public java.lang.String getMessageId() {
    return messageId;
  }


  /**
   * Sets the value of the 'messageId' field.
   * @param value the value to set.
   */
  public void setMessageId(java.lang.String value) {
    this.messageId = value;
  }

  /**
   * Gets the value of the 'messageType' field.
   * @return The value of the 'messageType' field.
   */
  public app.kafka.avrodemo.schema.MessageType getMessageType() {
    return messageType;
  }


  /**
   * Sets the value of the 'messageType' field.
   * @param value the value to set.
   */
  public void setMessageType(app.kafka.avrodemo.schema.MessageType value) {
    this.messageType = value;
  }

  /**
   * Creates a new MessageHeader RecordBuilder.
   * @return A new MessageHeader RecordBuilder
   */
  public static app.kafka.avrodemo.schema.MessageHeader.Builder newBuilder() {
    return new app.kafka.avrodemo.schema.MessageHeader.Builder();
  }

  /**
   * Creates a new MessageHeader RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MessageHeader RecordBuilder
   */
  public static app.kafka.avrodemo.schema.MessageHeader.Builder newBuilder(app.kafka.avrodemo.schema.MessageHeader.Builder other) {
    if (other == null) {
      return new app.kafka.avrodemo.schema.MessageHeader.Builder();
    } else {
      return new app.kafka.avrodemo.schema.MessageHeader.Builder(other);
    }
  }

  /**
   * Creates a new MessageHeader RecordBuilder by copying an existing MessageHeader instance.
   * @param other The existing instance to copy.
   * @return A new MessageHeader RecordBuilder
   */
  public static app.kafka.avrodemo.schema.MessageHeader.Builder newBuilder(app.kafka.avrodemo.schema.MessageHeader other) {
    if (other == null) {
      return new app.kafka.avrodemo.schema.MessageHeader.Builder();
    } else {
      return new app.kafka.avrodemo.schema.MessageHeader.Builder(other);
    }
  }

  /**
   * RecordBuilder for MessageHeader instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MessageHeader>
    implements org.apache.avro.data.RecordBuilder<MessageHeader> {

    private java.lang.String messageId;
    private app.kafka.avrodemo.schema.MessageType messageType;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(app.kafka.avrodemo.schema.MessageHeader.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.messageId)) {
        this.messageId = data().deepCopy(fields()[0].schema(), other.messageId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.messageType)) {
        this.messageType = data().deepCopy(fields()[1].schema(), other.messageType);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing MessageHeader instance
     * @param other The existing instance to copy.
     */
    private Builder(app.kafka.avrodemo.schema.MessageHeader other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.messageId)) {
        this.messageId = data().deepCopy(fields()[0].schema(), other.messageId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.messageType)) {
        this.messageType = data().deepCopy(fields()[1].schema(), other.messageType);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'messageId' field.
      * @return The value.
      */
    public java.lang.String getMessageId() {
      return messageId;
    }


    /**
      * Sets the value of the 'messageId' field.
      * @param value The value of 'messageId'.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.MessageHeader.Builder setMessageId(java.lang.String value) {
      validate(fields()[0], value);
      this.messageId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'messageId' field has been set.
      * @return True if the 'messageId' field has been set, false otherwise.
      */
    public boolean hasMessageId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'messageId' field.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.MessageHeader.Builder clearMessageId() {
      messageId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'messageType' field.
      * @return The value.
      */
    public app.kafka.avrodemo.schema.MessageType getMessageType() {
      return messageType;
    }


    /**
      * Sets the value of the 'messageType' field.
      * @param value The value of 'messageType'.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.MessageHeader.Builder setMessageType(app.kafka.avrodemo.schema.MessageType value) {
      validate(fields()[1], value);
      this.messageType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'messageType' field has been set.
      * @return True if the 'messageType' field has been set, false otherwise.
      */
    public boolean hasMessageType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'messageType' field.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.MessageHeader.Builder clearMessageType() {
      messageType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MessageHeader build() {
      try {
        MessageHeader record = new MessageHeader();
        record.messageId = fieldSetFlags()[0] ? this.messageId : (java.lang.String) defaultValue(fields()[0]);
        record.messageType = fieldSetFlags()[1] ? this.messageType : (app.kafka.avrodemo.schema.MessageType) defaultValue(fields()[1]);
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
    out.writeString(this.messageId);

    out.writeEnum(this.messageType.ordinal());

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.messageId = in.readString();

      this.messageType = app.kafka.avrodemo.schema.MessageType.values()[in.readEnum()];

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.messageId = in.readString();
          break;

        case 1:
          this.messageType = app.kafka.avrodemo.schema.MessageType.values()[in.readEnum()];
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










