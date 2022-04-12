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
public class CancelEnrolment extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1872227268350452900L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CancelEnrolment\",\"namespace\":\"app.kafka.avrodemo.schema\",\"fields\":[{\"name\":\"customerId\",\"type\":\"int\"},{\"name\":\"programme\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"reason\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"Reason\",\"symbols\":[\"NotUsed\",\"EnrolledElseWhere\",\"TooExpensive\",\"PoorCustomerService\"]}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CancelEnrolment> ENCODER =
      new BinaryMessageEncoder<CancelEnrolment>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CancelEnrolment> DECODER =
      new BinaryMessageDecoder<CancelEnrolment>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CancelEnrolment> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CancelEnrolment> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CancelEnrolment> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CancelEnrolment>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CancelEnrolment to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CancelEnrolment from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CancelEnrolment instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CancelEnrolment fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private int customerId;
  private java.lang.String programme;
  private app.kafka.avrodemo.schema.Reason reason;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CancelEnrolment() {}

  /**
   * All-args constructor.
   * @param customerId The new value for customerId
   * @param programme The new value for programme
   * @param reason The new value for reason
   */
  public CancelEnrolment(java.lang.Integer customerId, java.lang.String programme, app.kafka.avrodemo.schema.Reason reason) {
    this.customerId = customerId;
    this.programme = programme;
    this.reason = reason;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return customerId;
    case 1: return programme;
    case 2: return reason;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: customerId = (java.lang.Integer)value$; break;
    case 1: programme = value$ != null ? value$.toString() : null; break;
    case 2: reason = (app.kafka.avrodemo.schema.Reason)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'customerId' field.
   * @return The value of the 'customerId' field.
   */
  public int getCustomerId() {
    return customerId;
  }


  /**
   * Sets the value of the 'customerId' field.
   * @param value the value to set.
   */
  public void setCustomerId(int value) {
    this.customerId = value;
  }

  /**
   * Gets the value of the 'programme' field.
   * @return The value of the 'programme' field.
   */
  public java.lang.String getProgramme() {
    return programme;
  }


  /**
   * Sets the value of the 'programme' field.
   * @param value the value to set.
   */
  public void setProgramme(java.lang.String value) {
    this.programme = value;
  }

  /**
   * Gets the value of the 'reason' field.
   * @return The value of the 'reason' field.
   */
  public app.kafka.avrodemo.schema.Reason getReason() {
    return reason;
  }


  /**
   * Sets the value of the 'reason' field.
   * @param value the value to set.
   */
  public void setReason(app.kafka.avrodemo.schema.Reason value) {
    this.reason = value;
  }

  /**
   * Creates a new CancelEnrolment RecordBuilder.
   * @return A new CancelEnrolment RecordBuilder
   */
  public static app.kafka.avrodemo.schema.CancelEnrolment.Builder newBuilder() {
    return new app.kafka.avrodemo.schema.CancelEnrolment.Builder();
  }

  /**
   * Creates a new CancelEnrolment RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CancelEnrolment RecordBuilder
   */
  public static app.kafka.avrodemo.schema.CancelEnrolment.Builder newBuilder(app.kafka.avrodemo.schema.CancelEnrolment.Builder other) {
    if (other == null) {
      return new app.kafka.avrodemo.schema.CancelEnrolment.Builder();
    } else {
      return new app.kafka.avrodemo.schema.CancelEnrolment.Builder(other);
    }
  }

  /**
   * Creates a new CancelEnrolment RecordBuilder by copying an existing CancelEnrolment instance.
   * @param other The existing instance to copy.
   * @return A new CancelEnrolment RecordBuilder
   */
  public static app.kafka.avrodemo.schema.CancelEnrolment.Builder newBuilder(app.kafka.avrodemo.schema.CancelEnrolment other) {
    if (other == null) {
      return new app.kafka.avrodemo.schema.CancelEnrolment.Builder();
    } else {
      return new app.kafka.avrodemo.schema.CancelEnrolment.Builder(other);
    }
  }

  /**
   * RecordBuilder for CancelEnrolment instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CancelEnrolment>
    implements org.apache.avro.data.RecordBuilder<CancelEnrolment> {

    private int customerId;
    private java.lang.String programme;
    private app.kafka.avrodemo.schema.Reason reason;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(app.kafka.avrodemo.schema.CancelEnrolment.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.customerId)) {
        this.customerId = data().deepCopy(fields()[0].schema(), other.customerId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.programme)) {
        this.programme = data().deepCopy(fields()[1].schema(), other.programme);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.reason)) {
        this.reason = data().deepCopy(fields()[2].schema(), other.reason);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing CancelEnrolment instance
     * @param other The existing instance to copy.
     */
    private Builder(app.kafka.avrodemo.schema.CancelEnrolment other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.customerId)) {
        this.customerId = data().deepCopy(fields()[0].schema(), other.customerId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.programme)) {
        this.programme = data().deepCopy(fields()[1].schema(), other.programme);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.reason)) {
        this.reason = data().deepCopy(fields()[2].schema(), other.reason);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'customerId' field.
      * @return The value.
      */
    public int getCustomerId() {
      return customerId;
    }


    /**
      * Sets the value of the 'customerId' field.
      * @param value The value of 'customerId'.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.CancelEnrolment.Builder setCustomerId(int value) {
      validate(fields()[0], value);
      this.customerId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'customerId' field has been set.
      * @return True if the 'customerId' field has been set, false otherwise.
      */
    public boolean hasCustomerId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'customerId' field.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.CancelEnrolment.Builder clearCustomerId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'programme' field.
      * @return The value.
      */
    public java.lang.String getProgramme() {
      return programme;
    }


    /**
      * Sets the value of the 'programme' field.
      * @param value The value of 'programme'.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.CancelEnrolment.Builder setProgramme(java.lang.String value) {
      validate(fields()[1], value);
      this.programme = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'programme' field has been set.
      * @return True if the 'programme' field has been set, false otherwise.
      */
    public boolean hasProgramme() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'programme' field.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.CancelEnrolment.Builder clearProgramme() {
      programme = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'reason' field.
      * @return The value.
      */
    public app.kafka.avrodemo.schema.Reason getReason() {
      return reason;
    }


    /**
      * Sets the value of the 'reason' field.
      * @param value The value of 'reason'.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.CancelEnrolment.Builder setReason(app.kafka.avrodemo.schema.Reason value) {
      validate(fields()[2], value);
      this.reason = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'reason' field has been set.
      * @return True if the 'reason' field has been set, false otherwise.
      */
    public boolean hasReason() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'reason' field.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.CancelEnrolment.Builder clearReason() {
      reason = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CancelEnrolment build() {
      try {
        CancelEnrolment record = new CancelEnrolment();
        record.customerId = fieldSetFlags()[0] ? this.customerId : (java.lang.Integer) defaultValue(fields()[0]);
        record.programme = fieldSetFlags()[1] ? this.programme : (java.lang.String) defaultValue(fields()[1]);
        record.reason = fieldSetFlags()[2] ? this.reason : (app.kafka.avrodemo.schema.Reason) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CancelEnrolment>
    WRITER$ = (org.apache.avro.io.DatumWriter<CancelEnrolment>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CancelEnrolment>
    READER$ = (org.apache.avro.io.DatumReader<CancelEnrolment>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.customerId);

    out.writeString(this.programme);

    if (this.reason == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeEnum(this.reason.ordinal());
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.customerId = in.readInt();

      this.programme = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.reason = null;
      } else {
        this.reason = app.kafka.avrodemo.schema.Reason.values()[in.readEnum()];
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.customerId = in.readInt();
          break;

        case 1:
          this.programme = in.readString();
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.reason = null;
          } else {
            this.reason = app.kafka.avrodemo.schema.Reason.values()[in.readEnum()];
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










