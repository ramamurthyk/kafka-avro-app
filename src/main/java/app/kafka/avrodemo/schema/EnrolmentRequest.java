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
public class EnrolmentRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4267226274871800760L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EnrolmentRequest\",\"namespace\":\"app.kafka.avrodemo.schema\",\"fields\":[{\"name\":\"header\",\"type\":{\"type\":\"record\",\"name\":\"MessageHeader\",\"fields\":[{\"name\":\"messageId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"messageType\",\"type\":{\"type\":\"enum\",\"name\":\"MessageType\",\"symbols\":[\"CreateEnrolment\",\"CancelEnrolment\"]}}]}},{\"name\":\"payload\",\"type\":[{\"type\":\"record\",\"name\":\"CreateEnrolment\",\"fields\":[{\"name\":\"customerId\",\"type\":\"int\"},{\"name\":\"membershipId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"programme\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"CancelEnrolment\",\"fields\":[{\"name\":\"customerId\",\"type\":\"int\"},{\"name\":\"programme\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"reason\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"Reason\",\"symbols\":[\"NotUsed\",\"EnrolledElseWhere\",\"TooExpensive\",\"PoorCustomerService\"]}]}]}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<EnrolmentRequest> ENCODER =
      new BinaryMessageEncoder<EnrolmentRequest>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EnrolmentRequest> DECODER =
      new BinaryMessageDecoder<EnrolmentRequest>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<EnrolmentRequest> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<EnrolmentRequest> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<EnrolmentRequest> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<EnrolmentRequest>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this EnrolmentRequest to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a EnrolmentRequest from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a EnrolmentRequest instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static EnrolmentRequest fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private app.kafka.avrodemo.schema.MessageHeader header;
  private java.lang.Object payload;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EnrolmentRequest() {}

  /**
   * All-args constructor.
   * @param header The new value for header
   * @param payload The new value for payload
   */
  public EnrolmentRequest(app.kafka.avrodemo.schema.MessageHeader header, java.lang.Object payload) {
    this.header = header;
    this.payload = payload;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return header;
    case 1: return payload;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: header = (app.kafka.avrodemo.schema.MessageHeader)value$; break;
    case 1: payload = value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'header' field.
   * @return The value of the 'header' field.
   */
  public app.kafka.avrodemo.schema.MessageHeader getHeader() {
    return header;
  }


  /**
   * Sets the value of the 'header' field.
   * @param value the value to set.
   */
  public void setHeader(app.kafka.avrodemo.schema.MessageHeader value) {
    this.header = value;
  }

  /**
   * Gets the value of the 'payload' field.
   * @return The value of the 'payload' field.
   */
  public java.lang.Object getPayload() {
    return payload;
  }


  /**
   * Sets the value of the 'payload' field.
   * @param value the value to set.
   */
  public void setPayload(java.lang.Object value) {
    this.payload = value;
  }

  /**
   * Creates a new EnrolmentRequest RecordBuilder.
   * @return A new EnrolmentRequest RecordBuilder
   */
  public static app.kafka.avrodemo.schema.EnrolmentRequest.Builder newBuilder() {
    return new app.kafka.avrodemo.schema.EnrolmentRequest.Builder();
  }

  /**
   * Creates a new EnrolmentRequest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EnrolmentRequest RecordBuilder
   */
  public static app.kafka.avrodemo.schema.EnrolmentRequest.Builder newBuilder(app.kafka.avrodemo.schema.EnrolmentRequest.Builder other) {
    if (other == null) {
      return new app.kafka.avrodemo.schema.EnrolmentRequest.Builder();
    } else {
      return new app.kafka.avrodemo.schema.EnrolmentRequest.Builder(other);
    }
  }

  /**
   * Creates a new EnrolmentRequest RecordBuilder by copying an existing EnrolmentRequest instance.
   * @param other The existing instance to copy.
   * @return A new EnrolmentRequest RecordBuilder
   */
  public static app.kafka.avrodemo.schema.EnrolmentRequest.Builder newBuilder(app.kafka.avrodemo.schema.EnrolmentRequest other) {
    if (other == null) {
      return new app.kafka.avrodemo.schema.EnrolmentRequest.Builder();
    } else {
      return new app.kafka.avrodemo.schema.EnrolmentRequest.Builder(other);
    }
  }

  /**
   * RecordBuilder for EnrolmentRequest instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EnrolmentRequest>
    implements org.apache.avro.data.RecordBuilder<EnrolmentRequest> {

    private app.kafka.avrodemo.schema.MessageHeader header;
    private app.kafka.avrodemo.schema.MessageHeader.Builder headerBuilder;
    private java.lang.Object payload;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(app.kafka.avrodemo.schema.EnrolmentRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.header)) {
        this.header = data().deepCopy(fields()[0].schema(), other.header);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasHeaderBuilder()) {
        this.headerBuilder = app.kafka.avrodemo.schema.MessageHeader.newBuilder(other.getHeaderBuilder());
      }
      if (isValidValue(fields()[1], other.payload)) {
        this.payload = data().deepCopy(fields()[1].schema(), other.payload);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing EnrolmentRequest instance
     * @param other The existing instance to copy.
     */
    private Builder(app.kafka.avrodemo.schema.EnrolmentRequest other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.header)) {
        this.header = data().deepCopy(fields()[0].schema(), other.header);
        fieldSetFlags()[0] = true;
      }
      this.headerBuilder = null;
      if (isValidValue(fields()[1], other.payload)) {
        this.payload = data().deepCopy(fields()[1].schema(), other.payload);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'header' field.
      * @return The value.
      */
    public app.kafka.avrodemo.schema.MessageHeader getHeader() {
      return header;
    }


    /**
      * Sets the value of the 'header' field.
      * @param value The value of 'header'.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.EnrolmentRequest.Builder setHeader(app.kafka.avrodemo.schema.MessageHeader value) {
      validate(fields()[0], value);
      this.headerBuilder = null;
      this.header = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'header' field has been set.
      * @return True if the 'header' field has been set, false otherwise.
      */
    public boolean hasHeader() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'header' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public app.kafka.avrodemo.schema.MessageHeader.Builder getHeaderBuilder() {
      if (headerBuilder == null) {
        if (hasHeader()) {
          setHeaderBuilder(app.kafka.avrodemo.schema.MessageHeader.newBuilder(header));
        } else {
          setHeaderBuilder(app.kafka.avrodemo.schema.MessageHeader.newBuilder());
        }
      }
      return headerBuilder;
    }

    /**
     * Sets the Builder instance for the 'header' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public app.kafka.avrodemo.schema.EnrolmentRequest.Builder setHeaderBuilder(app.kafka.avrodemo.schema.MessageHeader.Builder value) {
      clearHeader();
      headerBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'header' field has an active Builder instance
     * @return True if the 'header' field has an active Builder instance
     */
    public boolean hasHeaderBuilder() {
      return headerBuilder != null;
    }

    /**
      * Clears the value of the 'header' field.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.EnrolmentRequest.Builder clearHeader() {
      header = null;
      headerBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'payload' field.
      * @return The value.
      */
    public java.lang.Object getPayload() {
      return payload;
    }


    /**
      * Sets the value of the 'payload' field.
      * @param value The value of 'payload'.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.EnrolmentRequest.Builder setPayload(java.lang.Object value) {
      validate(fields()[1], value);
      this.payload = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'payload' field has been set.
      * @return True if the 'payload' field has been set, false otherwise.
      */
    public boolean hasPayload() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'payload' field.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.EnrolmentRequest.Builder clearPayload() {
      payload = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EnrolmentRequest build() {
      try {
        EnrolmentRequest record = new EnrolmentRequest();
        if (headerBuilder != null) {
          try {
            record.header = this.headerBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("header"));
            throw e;
          }
        } else {
          record.header = fieldSetFlags()[0] ? this.header : (app.kafka.avrodemo.schema.MessageHeader) defaultValue(fields()[0]);
        }
        record.payload = fieldSetFlags()[1] ? this.payload :  defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EnrolmentRequest>
    WRITER$ = (org.apache.avro.io.DatumWriter<EnrolmentRequest>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EnrolmentRequest>
    READER$ = (org.apache.avro.io.DatumReader<EnrolmentRequest>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










