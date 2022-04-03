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
public class CreateEnrolment extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7350511018512236828L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CreateEnrolment\",\"namespace\":\"app.kafka.schemaapp.schema\",\"fields\":[{\"name\":\"entityId\",\"type\":\"int\"},{\"name\":\"rewardName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"rewardMembershipId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}");
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

  private int entityId;
  private java.lang.String rewardName;
  private java.lang.String rewardMembershipId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CreateEnrolment() {}

  /**
   * All-args constructor.
   * @param entityId The new value for entityId
   * @param rewardName The new value for rewardName
   * @param rewardMembershipId The new value for rewardMembershipId
   */
  public CreateEnrolment(java.lang.Integer entityId, java.lang.String rewardName, java.lang.String rewardMembershipId) {
    this.entityId = entityId;
    this.rewardName = rewardName;
    this.rewardMembershipId = rewardMembershipId;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return entityId;
    case 1: return rewardName;
    case 2: return rewardMembershipId;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: entityId = (java.lang.Integer)value$; break;
    case 1: rewardName = value$ != null ? value$.toString() : null; break;
    case 2: rewardMembershipId = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'entityId' field.
   * @return The value of the 'entityId' field.
   */
  public int getEntityId() {
    return entityId;
  }


  /**
   * Sets the value of the 'entityId' field.
   * @param value the value to set.
   */
  public void setEntityId(int value) {
    this.entityId = value;
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
   * Creates a new CreateEnrolment RecordBuilder.
   * @return A new CreateEnrolment RecordBuilder
   */
  public static app.kafka.schemaapp.schema.CreateEnrolment.Builder newBuilder() {
    return new app.kafka.schemaapp.schema.CreateEnrolment.Builder();
  }

  /**
   * Creates a new CreateEnrolment RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CreateEnrolment RecordBuilder
   */
  public static app.kafka.schemaapp.schema.CreateEnrolment.Builder newBuilder(app.kafka.schemaapp.schema.CreateEnrolment.Builder other) {
    if (other == null) {
      return new app.kafka.schemaapp.schema.CreateEnrolment.Builder();
    } else {
      return new app.kafka.schemaapp.schema.CreateEnrolment.Builder(other);
    }
  }

  /**
   * Creates a new CreateEnrolment RecordBuilder by copying an existing CreateEnrolment instance.
   * @param other The existing instance to copy.
   * @return A new CreateEnrolment RecordBuilder
   */
  public static app.kafka.schemaapp.schema.CreateEnrolment.Builder newBuilder(app.kafka.schemaapp.schema.CreateEnrolment other) {
    if (other == null) {
      return new app.kafka.schemaapp.schema.CreateEnrolment.Builder();
    } else {
      return new app.kafka.schemaapp.schema.CreateEnrolment.Builder(other);
    }
  }

  /**
   * RecordBuilder for CreateEnrolment instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CreateEnrolment>
    implements org.apache.avro.data.RecordBuilder<CreateEnrolment> {

    private int entityId;
    private java.lang.String rewardName;
    private java.lang.String rewardMembershipId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(app.kafka.schemaapp.schema.CreateEnrolment.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.entityId)) {
        this.entityId = data().deepCopy(fields()[0].schema(), other.entityId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.rewardName)) {
        this.rewardName = data().deepCopy(fields()[1].schema(), other.rewardName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.rewardMembershipId)) {
        this.rewardMembershipId = data().deepCopy(fields()[2].schema(), other.rewardMembershipId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing CreateEnrolment instance
     * @param other The existing instance to copy.
     */
    private Builder(app.kafka.schemaapp.schema.CreateEnrolment other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.entityId)) {
        this.entityId = data().deepCopy(fields()[0].schema(), other.entityId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.rewardName)) {
        this.rewardName = data().deepCopy(fields()[1].schema(), other.rewardName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.rewardMembershipId)) {
        this.rewardMembershipId = data().deepCopy(fields()[2].schema(), other.rewardMembershipId);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'entityId' field.
      * @return The value.
      */
    public int getEntityId() {
      return entityId;
    }


    /**
      * Sets the value of the 'entityId' field.
      * @param value The value of 'entityId'.
      * @return This builder.
      */
    public app.kafka.schemaapp.schema.CreateEnrolment.Builder setEntityId(int value) {
      validate(fields()[0], value);
      this.entityId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'entityId' field has been set.
      * @return True if the 'entityId' field has been set, false otherwise.
      */
    public boolean hasEntityId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'entityId' field.
      * @return This builder.
      */
    public app.kafka.schemaapp.schema.CreateEnrolment.Builder clearEntityId() {
      fieldSetFlags()[0] = false;
      return this;
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
    public app.kafka.schemaapp.schema.CreateEnrolment.Builder setRewardName(java.lang.String value) {
      validate(fields()[1], value);
      this.rewardName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'rewardName' field has been set.
      * @return True if the 'rewardName' field has been set, false otherwise.
      */
    public boolean hasRewardName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'rewardName' field.
      * @return This builder.
      */
    public app.kafka.schemaapp.schema.CreateEnrolment.Builder clearRewardName() {
      rewardName = null;
      fieldSetFlags()[1] = false;
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
    public app.kafka.schemaapp.schema.CreateEnrolment.Builder setRewardMembershipId(java.lang.String value) {
      validate(fields()[2], value);
      this.rewardMembershipId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'rewardMembershipId' field has been set.
      * @return True if the 'rewardMembershipId' field has been set, false otherwise.
      */
    public boolean hasRewardMembershipId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'rewardMembershipId' field.
      * @return This builder.
      */
    public app.kafka.schemaapp.schema.CreateEnrolment.Builder clearRewardMembershipId() {
      rewardMembershipId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CreateEnrolment build() {
      try {
        CreateEnrolment record = new CreateEnrolment();
        record.entityId = fieldSetFlags()[0] ? this.entityId : (java.lang.Integer) defaultValue(fields()[0]);
        record.rewardName = fieldSetFlags()[1] ? this.rewardName : (java.lang.String) defaultValue(fields()[1]);
        record.rewardMembershipId = fieldSetFlags()[2] ? this.rewardMembershipId : (java.lang.String) defaultValue(fields()[2]);
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
    out.writeInt(this.entityId);

    out.writeString(this.rewardName);

    if (this.rewardMembershipId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.rewardMembershipId);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.entityId = in.readInt();

      this.rewardName = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.rewardMembershipId = null;
      } else {
        this.rewardMembershipId = in.readString();
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.entityId = in.readInt();
          break;

        case 1:
          this.rewardName = in.readString();
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.rewardMembershipId = null;
          } else {
            this.rewardMembershipId = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









