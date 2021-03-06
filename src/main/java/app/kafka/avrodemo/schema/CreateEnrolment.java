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
public class CreateEnrolment extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 387012563786549227L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CreateEnrolment\",\"namespace\":\"app.kafka.avrodemo.schema\",\"fields\":[{\"name\":\"customerId\",\"type\":\"int\"},{\"name\":\"membershipId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"programme\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CreateEnrolment> ENCODER =
      new BinaryMessageEncoder<CreateEnrolment>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CreateEnrolment> DECODER =
      new BinaryMessageDecoder<CreateEnrolment>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CreateEnrolment> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CreateEnrolment> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CreateEnrolment> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CreateEnrolment>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CreateEnrolment to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CreateEnrolment from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CreateEnrolment instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CreateEnrolment fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private int customerId;
  private java.lang.String membershipId;
  private java.lang.String programme;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CreateEnrolment() {}

  /**
   * All-args constructor.
   * @param customerId The new value for customerId
   * @param membershipId The new value for membershipId
   * @param programme The new value for programme
   */
  public CreateEnrolment(java.lang.Integer customerId, java.lang.String membershipId, java.lang.String programme) {
    this.customerId = customerId;
    this.membershipId = membershipId;
    this.programme = programme;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return customerId;
    case 1: return membershipId;
    case 2: return programme;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: customerId = (java.lang.Integer)value$; break;
    case 1: membershipId = value$ != null ? value$.toString() : null; break;
    case 2: programme = value$ != null ? value$.toString() : null; break;
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
   * Gets the value of the 'membershipId' field.
   * @return The value of the 'membershipId' field.
   */
  public java.lang.String getMembershipId() {
    return membershipId;
  }


  /**
   * Sets the value of the 'membershipId' field.
   * @param value the value to set.
   */
  public void setMembershipId(java.lang.String value) {
    this.membershipId = value;
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
   * Creates a new CreateEnrolment RecordBuilder.
   * @return A new CreateEnrolment RecordBuilder
   */
  public static app.kafka.avrodemo.schema.CreateEnrolment.Builder newBuilder() {
    return new app.kafka.avrodemo.schema.CreateEnrolment.Builder();
  }

  /**
   * Creates a new CreateEnrolment RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CreateEnrolment RecordBuilder
   */
  public static app.kafka.avrodemo.schema.CreateEnrolment.Builder newBuilder(app.kafka.avrodemo.schema.CreateEnrolment.Builder other) {
    if (other == null) {
      return new app.kafka.avrodemo.schema.CreateEnrolment.Builder();
    } else {
      return new app.kafka.avrodemo.schema.CreateEnrolment.Builder(other);
    }
  }

  /**
   * Creates a new CreateEnrolment RecordBuilder by copying an existing CreateEnrolment instance.
   * @param other The existing instance to copy.
   * @return A new CreateEnrolment RecordBuilder
   */
  public static app.kafka.avrodemo.schema.CreateEnrolment.Builder newBuilder(app.kafka.avrodemo.schema.CreateEnrolment other) {
    if (other == null) {
      return new app.kafka.avrodemo.schema.CreateEnrolment.Builder();
    } else {
      return new app.kafka.avrodemo.schema.CreateEnrolment.Builder(other);
    }
  }

  /**
   * RecordBuilder for CreateEnrolment instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CreateEnrolment>
    implements org.apache.avro.data.RecordBuilder<CreateEnrolment> {

    private int customerId;
    private java.lang.String membershipId;
    private java.lang.String programme;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(app.kafka.avrodemo.schema.CreateEnrolment.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.customerId)) {
        this.customerId = data().deepCopy(fields()[0].schema(), other.customerId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.membershipId)) {
        this.membershipId = data().deepCopy(fields()[1].schema(), other.membershipId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.programme)) {
        this.programme = data().deepCopy(fields()[2].schema(), other.programme);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing CreateEnrolment instance
     * @param other The existing instance to copy.
     */
    private Builder(app.kafka.avrodemo.schema.CreateEnrolment other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.customerId)) {
        this.customerId = data().deepCopy(fields()[0].schema(), other.customerId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.membershipId)) {
        this.membershipId = data().deepCopy(fields()[1].schema(), other.membershipId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.programme)) {
        this.programme = data().deepCopy(fields()[2].schema(), other.programme);
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
    public app.kafka.avrodemo.schema.CreateEnrolment.Builder setCustomerId(int value) {
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
    public app.kafka.avrodemo.schema.CreateEnrolment.Builder clearCustomerId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'membershipId' field.
      * @return The value.
      */
    public java.lang.String getMembershipId() {
      return membershipId;
    }


    /**
      * Sets the value of the 'membershipId' field.
      * @param value The value of 'membershipId'.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.CreateEnrolment.Builder setMembershipId(java.lang.String value) {
      validate(fields()[1], value);
      this.membershipId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'membershipId' field has been set.
      * @return True if the 'membershipId' field has been set, false otherwise.
      */
    public boolean hasMembershipId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'membershipId' field.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.CreateEnrolment.Builder clearMembershipId() {
      membershipId = null;
      fieldSetFlags()[1] = false;
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
    public app.kafka.avrodemo.schema.CreateEnrolment.Builder setProgramme(java.lang.String value) {
      validate(fields()[2], value);
      this.programme = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'programme' field has been set.
      * @return True if the 'programme' field has been set, false otherwise.
      */
    public boolean hasProgramme() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'programme' field.
      * @return This builder.
      */
    public app.kafka.avrodemo.schema.CreateEnrolment.Builder clearProgramme() {
      programme = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CreateEnrolment build() {
      try {
        CreateEnrolment record = new CreateEnrolment();
        record.customerId = fieldSetFlags()[0] ? this.customerId : (java.lang.Integer) defaultValue(fields()[0]);
        record.membershipId = fieldSetFlags()[1] ? this.membershipId : (java.lang.String) defaultValue(fields()[1]);
        record.programme = fieldSetFlags()[2] ? this.programme : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CreateEnrolment>
    WRITER$ = (org.apache.avro.io.DatumWriter<CreateEnrolment>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CreateEnrolment>
    READER$ = (org.apache.avro.io.DatumReader<CreateEnrolment>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.customerId);

    if (this.membershipId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.membershipId);
    }

    out.writeString(this.programme);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.customerId = in.readInt();

      if (in.readIndex() != 1) {
        in.readNull();
        this.membershipId = null;
      } else {
        this.membershipId = in.readString();
      }

      this.programme = in.readString();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.customerId = in.readInt();
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.membershipId = null;
          } else {
            this.membershipId = in.readString();
          }
          break;

        case 2:
          this.programme = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










