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
public class UpdateEnrolment extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8064218412975014693L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UpdateEnrolment\",\"namespace\":\"app.kafka.schemaapp.schema\",\"fields\":[{\"name\":\"rewardName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"rewardMembershipId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"rewardMembershipEmail\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UpdateEnrolment> ENCODER =
      new BinaryMessageEncoder<UpdateEnrolment>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UpdateEnrolment> DECODER =
      new BinaryMessageDecoder<UpdateEnrolment>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<UpdateEnrolment> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<UpdateEnrolment> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<UpdateEnrolment> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<UpdateEnrolment>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this UpdateEnrolment to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a UpdateEnrolment from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a UpdateEnrolment instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static UpdateEnrolment fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String rewardName;
  private java.lang.String rewardMembershipId;
  private java.lang.String rewardMembershipEmail;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UpdateEnrolment() {}

  /**
   * All-args constructor.
   * @param rewardName The new value for rewardName
   * @param rewardMembershipId The new value for rewardMembershipId
   * @param rewardMembershipEmail The new value for rewardMembershipEmail
   */
  public UpdateEnrolment(java.lang.String rewardName, java.lang.String rewardMembershipId, java.lang.String rewardMembershipEmail) {
    this.rewardName = rewardName;
    this.rewardMembershipId = rewardMembershipId;
    this.rewardMembershipEmail = rewardMembershipEmail;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return rewardName;
    case 1: return rewardMembershipId;
    case 2: return rewardMembershipEmail;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: rewardName = value$ != null ? value$.toString() : null; break;
    case 1: rewardMembershipId = value$ != null ? value$.toString() : null; break;
    case 2: rewardMembershipEmail = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'rewardName' field.
   * @return The value of the 'rewardName' field.
   */
  public java.lang.String getRewardName() {
    return rewardName;
  }


  /**
   * Sets the value of the 'rewardName' field.
   * @param value the value to set.
   */
  public void setRewardName(java.lang.String value) {
    this.rewardName = value;
  }

  /**
   * Gets the value of the 'rewardMembershipId' field.
   * @return The value of the 'rewardMembershipId' field.
   */
  public java.lang.String getRewardMembershipId() {
    return rewardMembershipId;
  }


  /**
   * Sets the value of the 'rewardMembershipId' field.
   * @param value the value to set.
   */
  public void setRewardMembershipId(java.lang.String value) {
    this.rewardMembershipId = value;
  }

  /**
   * Gets the value of the 'rewardMembershipEmail' field.
   * @return The value of the 'rewardMembershipEmail' field.
   */
  public java.lang.String getRewardMembershipEmail() {
    return rewardMembershipEmail;
  }


  /**
   * Sets the value of the 'rewardMembershipEmail' field.
   * @param value the value to set.
   */
  public void setRewardMembershipEmail(java.lang.String value) {
    this.rewardMembershipEmail = value;
  }

  /**
   * Creates a new UpdateEnrolment RecordBuilder.
   * @return A new UpdateEnrolment RecordBuilder
   */
  public static app.kafka.schemaapp.schema.UpdateEnrolment.Builder newBuilder() {
    return new app.kafka.schemaapp.schema.UpdateEnrolment.Builder();
  }

  /**
   * Creates a new UpdateEnrolment RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UpdateEnrolment RecordBuilder
   */
  public static app.kafka.schemaapp.schema.UpdateEnrolment.Builder newBuilder(app.kafka.schemaapp.schema.UpdateEnrolment.Builder other) {
    if (other == null) {
      return new app.kafka.schemaapp.schema.UpdateEnrolment.Builder();
    } else {
      return new app.kafka.schemaapp.schema.UpdateEnrolment.Builder(other);
    }
  }

  /**
   * Creates a new UpdateEnrolment RecordBuilder by copying an existing UpdateEnrolment instance.
   * @param other The existing instance to copy.
   * @return A new UpdateEnrolment RecordBuilder
   */
  public static app.kafka.schemaapp.schema.UpdateEnrolment.Builder newBuilder(app.kafka.schemaapp.schema.UpdateEnrolment other) {
    if (other == null) {
      return new app.kafka.schemaapp.schema.UpdateEnrolment.Builder();
    } else {
      return new app.kafka.schemaapp.schema.UpdateEnrolment.Builder(other);
    }
  }

  /**
   * RecordBuilder for UpdateEnrolment instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UpdateEnrolment>
    implements org.apache.avro.data.RecordBuilder<UpdateEnrolment> {

    private java.lang.String rewardName;
    private java.lang.String rewardMembershipId;
    private java.lang.String rewardMembershipEmail;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(app.kafka.schemaapp.schema.UpdateEnrolment.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.rewardName)) {
        this.rewardName = data().deepCopy(fields()[0].schema(), other.rewardName);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.rewardMembershipId)) {
        this.rewardMembershipId = data().deepCopy(fields()[1].schema(), other.rewardMembershipId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.rewardMembershipEmail)) {
        this.rewardMembershipEmail = data().deepCopy(fields()[2].schema(), other.rewardMembershipEmail);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing UpdateEnrolment instance
     * @param other The existing instance to copy.
     */
    private Builder(app.kafka.schemaapp.schema.UpdateEnrolment other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.rewardName)) {
        this.rewardName = data().deepCopy(fields()[0].schema(), other.rewardName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.rewardMembershipId)) {
        this.rewardMembershipId = data().deepCopy(fields()[1].schema(), other.rewardMembershipId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.rewardMembershipEmail)) {
        this.rewardMembershipEmail = data().deepCopy(fields()[2].schema(), other.rewardMembershipEmail);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'rewardName' field.
      * @return The value.
      */
    public java.lang.String getRewardName() {
      return rewardName;
    }


    /**
      * Sets the value of the 'rewardName' field.
      * @param value The value of 'rewardName'.
      * @return This builder.
      */
    public app.kafka.schemaapp.schema.UpdateEnrolment.Builder setRewardName(java.lang.String value) {
      validate(fields()[0], value);
      this.rewardName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'rewardName' field has been set.
      * @return True if the 'rewardName' field has been set, false otherwise.
      */
    public boolean hasRewardName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'rewardName' field.
      * @return This builder.
      */
    public app.kafka.schemaapp.schema.UpdateEnrolment.Builder clearRewardName() {
      rewardName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'rewardMembershipId' field.
      * @return The value.
      */
    public java.lang.String getRewardMembershipId() {
      return rewardMembershipId;
    }


    /**
      * Sets the value of the 'rewardMembershipId' field.
      * @param value The value of 'rewardMembershipId'.
      * @return This builder.
      */
    public app.kafka.schemaapp.schema.UpdateEnrolment.Builder setRewardMembershipId(java.lang.String value) {
      validate(fields()[1], value);
      this.rewardMembershipId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'rewardMembershipId' field has been set.
      * @return True if the 'rewardMembershipId' field has been set, false otherwise.
      */
    public boolean hasRewardMembershipId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'rewardMembershipId' field.
      * @return This builder.
      */
    public app.kafka.schemaapp.schema.UpdateEnrolment.Builder clearRewardMembershipId() {
      rewardMembershipId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'rewardMembershipEmail' field.
      * @return The value.
      */
    public java.lang.String getRewardMembershipEmail() {
      return rewardMembershipEmail;
    }


    /**
      * Sets the value of the 'rewardMembershipEmail' field.
      * @param value The value of 'rewardMembershipEmail'.
      * @return This builder.
      */
    public app.kafka.schemaapp.schema.UpdateEnrolment.Builder setRewardMembershipEmail(java.lang.String value) {
      validate(fields()[2], value);
      this.rewardMembershipEmail = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'rewardMembershipEmail' field has been set.
      * @return True if the 'rewardMembershipEmail' field has been set, false otherwise.
      */
    public boolean hasRewardMembershipEmail() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'rewardMembershipEmail' field.
      * @return This builder.
      */
    public app.kafka.schemaapp.schema.UpdateEnrolment.Builder clearRewardMembershipEmail() {
      rewardMembershipEmail = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UpdateEnrolment build() {
      try {
        UpdateEnrolment record = new UpdateEnrolment();
        record.rewardName = fieldSetFlags()[0] ? this.rewardName : (java.lang.String) defaultValue(fields()[0]);
        record.rewardMembershipId = fieldSetFlags()[1] ? this.rewardMembershipId : (java.lang.String) defaultValue(fields()[1]);
        record.rewardMembershipEmail = fieldSetFlags()[2] ? this.rewardMembershipEmail : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UpdateEnrolment>
    WRITER$ = (org.apache.avro.io.DatumWriter<UpdateEnrolment>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UpdateEnrolment>
    READER$ = (org.apache.avro.io.DatumReader<UpdateEnrolment>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.rewardName);

    out.writeString(this.rewardMembershipId);

    if (this.rewardMembershipEmail == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.rewardMembershipEmail);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.rewardName = in.readString();

      this.rewardMembershipId = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.rewardMembershipEmail = null;
      } else {
        this.rewardMembershipEmail = in.readString();
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.rewardName = in.readString();
          break;

        case 1:
          this.rewardMembershipId = in.readString();
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.rewardMembershipEmail = null;
          } else {
            this.rewardMembershipEmail = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










