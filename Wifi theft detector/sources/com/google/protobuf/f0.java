package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import com.google.protobuf.c;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class f0 implements q0 {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final j extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final w listFieldSchema;
    private final boolean lite;
    private final z mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final h0 newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final v0 unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = x0.getUnsafe();

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private f0(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z10, int[] iArr2, int i12, int i13, h0 h0Var, w wVar, v0 v0Var, j jVar, z zVar) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i10;
        this.maxFieldNumber = i11;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = jVar != null && jVar.hasExtensions(messageLite);
        this.useCachedSizeField = z10;
        this.intArray = iArr2;
        this.checkInitializedCount = i12;
        this.repeatedFieldOffsetStart = i13;
        this.newInstanceSchema = h0Var;
        this.listFieldSchema = wVar;
        this.unknownFieldSchema = v0Var;
        this.extensionSchema = jVar;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = zVar;
    }

    private boolean arePresentForEquals(Object obj, Object obj2, int i10) {
        return isFieldPresent(obj, i10) == isFieldPresent(obj2, i10);
    }

    private static <T> boolean booleanAt(T t10, long j10) {
        return x0.getBoolean(t10, j10);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i10, int i11, MapEntryLite.b bVar, Map<K, V> map, c.b bVar2) throws IOException {
        int iDecodeVarint32 = c.decodeVarint32(bArr, i10, bVar2);
        int i12 = bVar2.int1;
        if (i12 < 0 || i12 > i11 - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i13 = iDecodeVarint32 + i12;
        Object obj = bVar.defaultKey;
        Object obj2 = bVar.defaultValue;
        while (iDecodeVarint32 < i13) {
            int iDecodeVarint322 = iDecodeVarint32 + 1;
            int i14 = bArr[iDecodeVarint32];
            if (i14 < 0) {
                iDecodeVarint322 = c.decodeVarint32(i14, bArr, iDecodeVarint322, bVar2);
                i14 = bVar2.int1;
            }
            int i15 = iDecodeVarint322;
            int i16 = i14 >>> 3;
            int i17 = i14 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == bVar.valueType.getWireType()) {
                    iDecodeVarint32 = decodeMapEntryValue(bArr, i15, i11, bVar.valueType, bVar.defaultValue.getClass(), bVar2);
                    obj2 = bVar2.object1;
                } else {
                    iDecodeVarint32 = c.skipField(i14, bArr, i15, i11, bVar2);
                }
            } else if (i17 == bVar.keyType.getWireType()) {
                iDecodeVarint32 = decodeMapEntryValue(bArr, i15, i11, bVar.keyType, null, bVar2);
                obj = bVar2.object1;
            } else {
                iDecodeVarint32 = c.skipField(i14, bArr, i15, i11, bVar2);
            }
        }
        if (iDecodeVarint32 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i13;
    }

    private int decodeMapEntryValue(byte[] bArr, int i10, int i11, WireFormat.FieldType fieldType, Class<?> cls, c.b bVar) throws IOException {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = c.decodeVarint64(bArr, i10, bVar);
                bVar.object1 = Boolean.valueOf(bVar.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return c.decodeBytes(bArr, i10, bVar);
            case 3:
                bVar.object1 = Double.valueOf(c.decodeDouble(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                bVar.object1 = Integer.valueOf(c.decodeFixed32(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                bVar.object1 = Long.valueOf(c.decodeFixed64(bArr, i10));
                return i10 + 8;
            case 8:
                bVar.object1 = Float.valueOf(c.decodeFloat(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = c.decodeVarint32(bArr, i10, bVar);
                bVar.object1 = Integer.valueOf(bVar.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint642 = c.decodeVarint64(bArr, i10, bVar);
                bVar.object1 = Long.valueOf(bVar.long1);
                return iDecodeVarint642;
            case 14:
                return c.decodeMessageField(m0.getInstance().schemaFor((Class) cls), bArr, i10, i11, bVar);
            case 15:
                int iDecodeVarint322 = c.decodeVarint32(bArr, i10, bVar);
                bVar.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.int1));
                return iDecodeVarint322;
            case 16:
                int iDecodeVarint643 = c.decodeVarint64(bArr, i10, bVar);
                bVar.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(bVar.long1));
                return iDecodeVarint643;
            case 17:
                return c.decodeStringRequireUtf8(bArr, i10, bVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t10, long j10) {
        return x0.getDouble(t10, j10);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i10, UB ub, v0 v0Var, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i10);
        Object object = x0.getObject(obj, offset(typeAndOffsetAt(i10)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i10)) == null) ? ub : (UB) filterUnknownEnumMap(i10, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, v0Var, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i10, int i11, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, v0 v0Var, Object obj) {
        MapEntryLite.b bVarForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = (UB) v0Var.getBuilderFromMessage(obj);
                }
                ByteString.f fVarNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(bVarForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(fVarNewCodedBuilder.getCodedOutput(), bVarForMapMetadata, next.getKey(), next.getValue());
                    v0Var.addLengthDelimited(ub, i11, fVarNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t10, long j10) {
        return x0.getFloat(t10, j10);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i10) {
        return (Internal.EnumVerifier) this.objects[((i10 / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i10) {
        return this.objects[(i10 / 3) * 2];
    }

    private q0 getMessageFieldSchema(int i10) {
        int i11 = (i10 / 3) * 2;
        q0 q0Var = (q0) this.objects[i11];
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0VarSchemaFor = m0.getInstance().schemaFor((Class) this.objects[i11 + 1]);
        this.objects[i11] = q0VarSchemaFor;
        return q0VarSchemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(v0 v0Var, Object obj) {
        return v0Var.getSerializedSize(v0Var.getFromMessage(obj));
    }

    private static <T> int intAt(T t10, long j10) {
        return x0.getInt(t10, j10);
    }

    private static boolean isEnforceUtf8(int i10) {
        return (i10 & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? isFieldPresent(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i10) {
        return (i10 & Integer.MIN_VALUE) != 0;
    }

    private <N> boolean isListInitialized(Object obj, int i10, int i11) {
        List list = (List) x0.getObject(obj, offset(i10));
        if (list.isEmpty()) {
            return true;
        }
        q0 messageFieldSchema = getMessageFieldSchema(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!messageFieldSchema.isInitialized(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean isMapInitialized(Object obj, int i10, int i11) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(x0.getObject(obj, offset(i10)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        q0 q0VarSchemaFor = null;
        for (Object obj2 : mapForMapData.values()) {
            if (q0VarSchemaFor == null) {
                q0VarSchemaFor = m0.getInstance().schemaFor((Class) obj2.getClass());
            }
            if (!q0VarSchemaFor.isInitialized(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(Object obj, Object obj2, int i10) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10) & 1048575;
        return x0.getInt(obj, jPresenceMaskAndOffsetAt) == x0.getInt(obj2, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(Object obj, int i10, int i11) {
        return x0.getInt(obj, (long) (presenceMaskAndOffsetAt(i11) & 1048575)) == i10;
    }

    private static boolean isRequired(int i10) {
        return (i10 & REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T t10, long j10) {
        return x0.getLong(t10, j10);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.v0 r18, com.google.protobuf.j r19, java.lang.Object r20, com.google.protobuf.p0 r21, com.google.protobuf.ExtensionRegistryLite r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f0.mergeFromHelper(com.google.protobuf.v0, com.google.protobuf.j, java.lang.Object, com.google.protobuf.p0, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i10, Object obj2, ExtensionRegistryLite extensionRegistryLite, p0 p0Var) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i10));
        Object object = x0.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            x0.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            x0.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        p0Var.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    private void mergeMessage(Object obj, Object obj2, int i10) {
        if (isFieldPresent(obj2, i10)) {
            long jOffset = offset(typeAndOffsetAt(i10));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(obj2, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + obj2);
            }
            q0 messageFieldSchema = getMessageFieldSchema(i10);
            if (!isFieldPresent(obj, i10)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(obj, jOffset, object);
                }
                setFieldPresent(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeOneofMessage(Object obj, Object obj2, int i10) {
        int iNumberAt = numberAt(i10);
        if (isOneofPresent(obj2, iNumberAt, i10)) {
            long jOffset = offset(typeAndOffsetAt(i10));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(obj2, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + obj2);
            }
            q0 messageFieldSchema = getMessageFieldSchema(i10);
            if (!isOneofPresent(obj, iNumberAt, i10)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(obj, jOffset, object);
                }
                setOneofPresent(obj, iNumberAt, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(Object obj, Object obj2, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i10);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(obj2, i10)) {
                    x0.putDouble(obj, jOffset, x0.getDouble(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 1:
                if (isFieldPresent(obj2, i10)) {
                    x0.putFloat(obj, jOffset, x0.getFloat(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 2:
                if (isFieldPresent(obj2, i10)) {
                    x0.putLong(obj, jOffset, x0.getLong(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 3:
                if (isFieldPresent(obj2, i10)) {
                    x0.putLong(obj, jOffset, x0.getLong(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 4:
                if (isFieldPresent(obj2, i10)) {
                    x0.putInt(obj, jOffset, x0.getInt(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 5:
                if (isFieldPresent(obj2, i10)) {
                    x0.putLong(obj, jOffset, x0.getLong(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 6:
                if (isFieldPresent(obj2, i10)) {
                    x0.putInt(obj, jOffset, x0.getInt(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 7:
                if (isFieldPresent(obj2, i10)) {
                    x0.putBoolean(obj, jOffset, x0.getBoolean(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 8:
                if (isFieldPresent(obj2, i10)) {
                    x0.putObject(obj, jOffset, x0.getObject(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 9:
                mergeMessage(obj, obj2, i10);
                break;
            case 10:
                if (isFieldPresent(obj2, i10)) {
                    x0.putObject(obj, jOffset, x0.getObject(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 11:
                if (isFieldPresent(obj2, i10)) {
                    x0.putInt(obj, jOffset, x0.getInt(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 12:
                if (isFieldPresent(obj2, i10)) {
                    x0.putInt(obj, jOffset, x0.getInt(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 13:
                if (isFieldPresent(obj2, i10)) {
                    x0.putInt(obj, jOffset, x0.getInt(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 14:
                if (isFieldPresent(obj2, i10)) {
                    x0.putLong(obj, jOffset, x0.getLong(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 15:
                if (isFieldPresent(obj2, i10)) {
                    x0.putInt(obj, jOffset, x0.getInt(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 16:
                if (isFieldPresent(obj2, i10)) {
                    x0.putLong(obj, jOffset, x0.getLong(obj2, jOffset));
                    setFieldPresent(obj, i10);
                    break;
                }
                break;
            case 17:
                mergeMessage(obj, obj2, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(obj, obj2, jOffset);
                break;
            case 50:
                s0.mergeMap(this.mapFieldSchema, obj, obj2, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(obj2, iNumberAt, i10)) {
                    x0.putObject(obj, jOffset, x0.getObject(obj2, jOffset));
                    setOneofPresent(obj, iNumberAt, i10);
                    break;
                }
                break;
            case 60:
                mergeOneofMessage(obj, obj2, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(obj2, iNumberAt, i10)) {
                    x0.putObject(obj, jOffset, x0.getObject(obj2, jOffset));
                    setOneofPresent(obj, iNumberAt, i10);
                    break;
                }
                break;
            case 68:
                mergeOneofMessage(obj, obj2, i10);
                break;
        }
    }

    private Object mutableMessageFieldForMerge(Object obj, int i10) {
        q0 messageFieldSchema = getMessageFieldSchema(i10);
        long jOffset = offset(typeAndOffsetAt(i10));
        if (!isFieldPresent(obj, i10)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    private Object mutableOneofMessageFieldForMerge(Object obj, int i10, int i11) {
        q0 messageFieldSchema = getMessageFieldSchema(i11);
        if (!isOneofPresent(obj, i10, i11)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, offset(typeAndOffsetAt(i11)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> f0 newSchema(Class<T> cls, c0 c0Var, h0 h0Var, w wVar, v0 v0Var, j jVar, z zVar) {
        return c0Var instanceof o0 ? newSchemaForRawMessageInfo((o0) c0Var, h0Var, wVar, v0Var, jVar, zVar) : newSchemaForMessageInfo((StructuralMessageInfo) c0Var, h0Var, wVar, v0Var, jVar, zVar);
    }

    public static <T> f0 newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, h0 h0Var, w wVar, v0 v0Var, j jVar, z zVar) {
        int fieldNumber;
        int fieldNumber2;
        int i10;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i11 = 0;
        int i12 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i11++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i12++;
            }
        }
        int[] iArr2 = i11 > 0 ? new int[i11] : null;
        int[] iArr3 = i12 > 0 ? new int[i12] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i13 < fields.length) {
            FieldInfo fieldInfo2 = fields[i13];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i14, objArr);
            if (i15 < checkInitialized.length && checkInitialized[i15] == fieldNumber3) {
                checkInitialized[i15] = i14;
                i15++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i16] = i14;
                i16++;
            } else {
                if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                    i10 = i14;
                    iArr3[i17] = (int) x0.objectFieldOffset(fieldInfo2.getField());
                    i17++;
                }
                i13++;
                i14 = i10 + 3;
            }
            i10 = i14;
            i13++;
            i14 = i10 + 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new f0(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, h0Var, wVar, v0Var, jVar, zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.protobuf.f0 newSchemaForRawMessageInfo(com.google.protobuf.o0 r33, com.google.protobuf.h0 r34, com.google.protobuf.w r35, com.google.protobuf.v0 r36, com.google.protobuf.j r37, com.google.protobuf.z r38) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f0.newSchemaForRawMessageInfo(com.google.protobuf.o0, com.google.protobuf.h0, com.google.protobuf.w, com.google.protobuf.v0, com.google.protobuf.j, com.google.protobuf.z):com.google.protobuf.f0");
    }

    private int numberAt(int i10) {
        return this.buffer[i10];
    }

    private static long offset(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t10, long j10) {
        return ((Boolean) x0.getObject(t10, j10)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t10, long j10) {
        return ((Double) x0.getObject(t10, j10)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t10, long j10) {
        return ((Float) x0.getObject(t10, j10)).floatValue();
    }

    private static <T> int oneofIntAt(T t10, long j10) {
        return ((Integer) x0.getObject(t10, j10)).intValue();
    }

    private static <T> long oneofLongAt(T t10, long j10) {
        return ((Long) x0.getObject(t10, j10)).longValue();
    }

    private <K, V> int parseMapField(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, c.b bVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i12);
        Object object = unsafe.getObject(obj, j10);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(obj, j10, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i10, i11, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), bVar);
    }

    private int parseOneofField(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, c.b bVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j11 = this.buffer[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(c.decodeDouble(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(c.decodeFloat(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint64 = c.decodeVarint64(bArr, i10, bVar);
                unsafe.putObject(obj, j10, Long.valueOf(bVar.long1));
                unsafe.putInt(obj, j11, i13);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint32 = c.decodeVarint32(bArr, i10, bVar);
                unsafe.putObject(obj, j10, Integer.valueOf(bVar.int1));
                unsafe.putInt(obj, j11, i13);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(c.decodeFixed64(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(c.decodeFixed32(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint642 = c.decodeVarint64(bArr, i10, bVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(bVar.long1 != 0));
                unsafe.putInt(obj, j11, i13);
                return iDecodeVarint642;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeVarint322 = c.decodeVarint32(bArr, i10, bVar);
                int i22 = bVar.int1;
                if (i22 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & ENFORCE_UTF8_MASK) != 0 && !Utf8.isValidUtf8(bArr, iDecodeVarint322, iDecodeVarint322 + i22)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iDecodeVarint322, i22, Internal.UTF_8));
                    iDecodeVarint322 += i22;
                }
                unsafe.putInt(obj, j11, i13);
                return iDecodeVarint322;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(obj, i13, i17);
                int iMergeMessageField = c.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i17), bArr, i10, i11, bVar);
                storeOneofMessageField(obj, i13, i17, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeBytes = c.decodeBytes(bArr, i10, bVar);
                unsafe.putObject(obj, j10, bVar.object1);
                unsafe.putInt(obj, j11, i13);
                return iDecodeBytes;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint323 = c.decodeVarint32(bArr, i10, bVar);
                int i23 = bVar.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i17);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i23)) {
                    getMutableUnknownFields(obj).storeField(i12, Long.valueOf(i23));
                    return iDecodeVarint323;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(i23));
                unsafe.putInt(obj, j11, i13);
                return iDecodeVarint323;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint324 = c.decodeVarint32(bArr, i10, bVar);
                unsafe.putObject(obj, j10, Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.int1)));
                unsafe.putInt(obj, j11, i13);
                return iDecodeVarint324;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint643 = c.decodeVarint64(bArr, i10, bVar);
                unsafe.putObject(obj, j10, Long.valueOf(CodedInputStream.decodeZigZag64(bVar.long1)));
                unsafe.putInt(obj, j11, i13);
                return iDecodeVarint643;
            case 68:
                if (i14 == 3) {
                    Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(obj, i13, i17);
                    int iMergeGroupField = c.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                    storeOneofMessageField(obj, i13, i17, objMutableOneofMessageFieldForMerge2);
                    return iMergeGroupField;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, c.b bVar) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(obj, j11);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j11, protobufListMutableCopyWithCapacity2);
        }
        Internal.ProtobufList protobufList = protobufListMutableCopyWithCapacity2;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return c.decodePackedDoubleList(bArr, i10, protobufList, bVar);
                }
                if (i14 == 1) {
                    return c.decodeDoubleList(i12, bArr, i10, i11, protobufList, bVar);
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return c.decodePackedFloatList(bArr, i10, protobufList, bVar);
                }
                if (i14 == 5) {
                    return c.decodeFloatList(i12, bArr, i10, i11, protobufList, bVar);
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return c.decodePackedVarint64List(bArr, i10, protobufList, bVar);
                }
                if (i14 == 0) {
                    return c.decodeVarint64List(i12, bArr, i10, i11, protobufList, bVar);
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return c.decodePackedVarint32List(bArr, i10, protobufList, bVar);
                }
                if (i14 == 0) {
                    return c.decodeVarint32List(i12, bArr, i10, i11, protobufList, bVar);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return c.decodePackedFixed64List(bArr, i10, protobufList, bVar);
                }
                if (i14 == 1) {
                    return c.decodeFixed64List(i12, bArr, i10, i11, protobufList, bVar);
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return c.decodePackedFixed32List(bArr, i10, protobufList, bVar);
                }
                if (i14 == 5) {
                    return c.decodeFixed32List(i12, bArr, i10, i11, protobufList, bVar);
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return c.decodePackedBoolList(bArr, i10, protobufList, bVar);
                }
                if (i14 == 0) {
                    return c.decodeBoolList(i12, bArr, i10, i11, protobufList, bVar);
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? c.decodeStringList(i12, bArr, i10, i11, protobufList, bVar) : c.decodeStringListRequireUtf8(i12, bArr, i10, i11, protobufList, bVar);
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return c.decodeMessageList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufList, bVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    return c.decodeBytesList(i12, bArr, i10, i11, protobufList, bVar);
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iDecodeVarint32List = c.decodeVarint32List(i12, bArr, i10, i11, protobufList, bVar);
                    }
                    return i10;
                }
                iDecodeVarint32List = c.decodePackedVarint32List(bArr, i10, protobufList, bVar);
                s0.filterUnknownEnumList(obj, i13, protobufList, getEnumFieldVerifier(i15), (Object) null, this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i14 == 2) {
                    return c.decodePackedSInt32List(bArr, i10, protobufList, bVar);
                }
                if (i14 == 0) {
                    return c.decodeSInt32List(i12, bArr, i10, i11, protobufList, bVar);
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return c.decodePackedSInt64List(bArr, i10, protobufList, bVar);
                }
                if (i14 == 0) {
                    return c.decodeSInt64List(i12, bArr, i10, i11, protobufList, bVar);
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    return c.decodeGroupList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufList, bVar);
                }
                return i10;
            default:
                return i10;
        }
    }

    private int positionForFieldNumber(int i10) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, 0);
    }

    private int presenceMaskAndOffsetAt(int i10) {
        return this.buffer[i10 + 2];
    }

    private <E> void readGroupList(Object obj, long j10, p0 p0Var, q0 q0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        p0Var.readGroupList(this.listFieldSchema.mutableListAt(obj, j10), q0Var, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i10, p0 p0Var, q0 q0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        p0Var.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i10)), q0Var, extensionRegistryLite);
    }

    private void readString(Object obj, int i10, p0 p0Var) throws IOException {
        if (isEnforceUtf8(i10)) {
            x0.putObject(obj, offset(i10), p0Var.readStringRequireUtf8());
        } else if (this.lite) {
            x0.putObject(obj, offset(i10), p0Var.readString());
        } else {
            x0.putObject(obj, offset(i10), p0Var.readBytes());
        }
    }

    private void readStringList(Object obj, int i10, p0 p0Var) throws IOException {
        if (isEnforceUtf8(i10)) {
            p0Var.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        } else {
            p0Var.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(Object obj, int i10) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j10 == 1048575) {
            return;
        }
        x0.putInt(obj, j10, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | x0.getInt(obj, j10));
    }

    private void setOneofPresent(Object obj, int i10, int i11) {
        x0.putInt(obj, presenceMaskAndOffsetAt(i11) & 1048575, i10);
    }

    private int slowPositionForFieldNumber(int i10, int i11) {
        int length = (this.buffer.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iNumberAt = numberAt(i13);
            if (i10 == iNumberAt) {
                return i13;
            }
            if (i10 < iNumberAt) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void storeFieldData(com.google.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            com.google.protobuf.k0 r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            com.google.protobuf.FieldType r2 = r8.getType()
            int r2 = r2.id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = com.google.protobuf.x0.objectFieldOffset(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r4 = com.google.protobuf.x0.objectFieldOffset(r0)
        L22:
            int r0 = (int) r4
            r4 = r1
            goto L6c
        L25:
            com.google.protobuf.FieldType r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = com.google.protobuf.x0.objectFieldOffset(r2)
            int r3 = (int) r2
            int r2 = r0.id()
            boolean r4 = r0.isList()
            if (r4 != 0) goto L5a
            boolean r0 = r0.isMap()
            if (r0 != 0) goto L5a
            java.lang.reflect.Field r0 = r8.getPresenceField()
            if (r0 != 0) goto L4c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L51
        L4c:
            long r4 = com.google.protobuf.x0.objectFieldOffset(r0)
            int r0 = (int) r4
        L51:
            int r4 = r8.getPresenceMask()
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            goto L6c
        L5a:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            if (r0 != 0) goto L63
            r0 = r1
            r4 = r0
            goto L6c
        L63:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            long r4 = com.google.protobuf.x0.objectFieldOffset(r0)
            goto L22
        L6c:
            int r5 = r8.getFieldNumber()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.isEnforceUtf8()
            if (r6 == 0) goto L7d
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7e
        L7d:
            r6 = r1
        L7e:
            boolean r7 = r8.isRequired()
            if (r7 == 0) goto L86
            r1 = 268435456(0x10000000, float:2.524355E-29)
        L86:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r3
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r4 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.getMessageFieldClass()
            java.lang.Object r0 = r8.getMapDefaultEntry()
            if (r0 == 0) goto Lbe
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r11[r10] = r0
            if (r9 == 0) goto Laf
            int r10 = r10 + 1
            r11[r10] = r9
            return
        Laf:
            com.google.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
            return
        Lbe:
            if (r9 == 0) goto Lc9
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r11[r10] = r9
            return
        Lc9:
            com.google.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f0.storeFieldData(com.google.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(Object obj, int i10, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i10)), obj2);
        setFieldPresent(obj, i10);
    }

    private void storeOneofMessageField(Object obj, int i10, int i11, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i11)), obj2);
        setOneofPresent(obj, i10, i11);
    }

    private static int type(int i10) {
        return (i10 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i10) {
        return this.buffer[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrder(java.lang.Object r19, com.google.protobuf.Writer r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f0.writeFieldsInAscendingOrder(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInDescendingOrder(java.lang.Object r11, com.google.protobuf.Writer r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f0.writeFieldsInDescendingOrder(java.lang.Object, com.google.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            writer.writeMap(i10, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i10, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i10, (String) obj);
        } else {
            writer.writeBytes(i10, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(v0 v0Var, Object obj, Writer writer) throws IOException {
        v0Var.writeTo(v0Var.getFromMessage(obj), writer);
    }

    @Override // com.google.protobuf.q0
    public boolean equals(Object obj, Object obj2) {
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!equals(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(obj).equals(this.unknownFieldSchema.getFromMessage(obj2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(obj).equals(this.extensionSchema.getExtensions(obj2));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.q0
    public int getSerializedSize(Object obj) {
        int i10;
        int iComputeDoubleSize;
        int iComputeFloatSize;
        int iComputeInt64Size;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        f0 f0Var = this;
        Object obj2 = obj;
        Unsafe unsafe = UNSAFE;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i12 < f0Var.buffer.length) {
            int iTypeAndOffsetAt = f0Var.typeAndOffsetAt(i12);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = f0Var.numberAt(i12);
            int i16 = f0Var.buffer[i12 + 2];
            int i17 = i16 & i11;
            if (iType <= 17) {
                if (i17 != i15) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(obj2, i17);
                    i15 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            int i18 = i14;
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) {
                i17 = 0;
            }
            switch (iType) {
                case 0:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 1:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i14 = i18 + iComputeFloatSize;
                        f0Var = this;
                        obj2 = obj;
                        break;
                    }
                    f0Var = this;
                    obj2 = obj;
                    i14 = i18;
                    break;
                case 2:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        f0Var = this;
                        break;
                    }
                    f0Var = this;
                    i14 = i18;
                    break;
                case 3:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        f0Var = this;
                        break;
                    }
                    f0Var = this;
                    i14 = i18;
                    break;
                case 4:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        f0Var = this;
                        break;
                    }
                    f0Var = this;
                    i14 = i18;
                    break;
                case 5:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i14 = i18 + iComputeFloatSize;
                        f0Var = this;
                        obj2 = obj;
                        break;
                    }
                    f0Var = this;
                    obj2 = obj;
                    i14 = i18;
                    break;
                case 6:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i14 = i18 + iComputeFloatSize;
                        f0Var = this;
                        obj2 = obj;
                        break;
                    }
                    f0Var = this;
                    obj2 = obj;
                    i14 = i18;
                    break;
                case 7:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i14 = i18 + iComputeFloatSize;
                        f0Var = this;
                        obj2 = obj;
                        break;
                    }
                    f0Var = this;
                    obj2 = obj;
                    i14 = i18;
                    break;
                case 8:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        Object object = unsafe.getObject(obj2, jOffset);
                        iComputeInt64Size = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        i14 = i18 + iComputeInt64Size;
                        f0Var = this;
                        break;
                    }
                    f0Var = this;
                    i14 = i18;
                    break;
                case 9:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeDoubleSize = s0.computeSizeMessage(iNumberAt, unsafe.getObject(obj2, jOffset), f0Var.getMessageFieldSchema(i12));
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 10:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        f0Var = this;
                        break;
                    }
                    f0Var = this;
                    i14 = i18;
                    break;
                case 11:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        f0Var = this;
                        break;
                    }
                    f0Var = this;
                    i14 = i18;
                    break;
                case 12:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        f0Var = this;
                        break;
                    }
                    f0Var = this;
                    i14 = i18;
                    break;
                case 13:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i14 = i18 + iComputeFloatSize;
                        f0Var = this;
                        obj2 = obj;
                        break;
                    }
                    f0Var = this;
                    obj2 = obj;
                    i14 = i18;
                    break;
                case 14:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i14 = i18 + iComputeFloatSize;
                        f0Var = this;
                        obj2 = obj;
                        break;
                    }
                    f0Var = this;
                    obj2 = obj;
                    i14 = i18;
                    break;
                case 15:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        f0Var = this;
                        break;
                    }
                    f0Var = this;
                    i14 = i18;
                    break;
                case 16:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(obj2, jOffset));
                        i14 = i18 + iComputeInt64Size;
                        f0Var = this;
                        break;
                    }
                    f0Var = this;
                    i14 = i18;
                    break;
                case 17:
                    if (f0Var.isFieldPresent(obj2, i12, i15, i13, i10)) {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(obj2, jOffset), f0Var.getMessageFieldSchema(i12));
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 18:
                    iComputeDoubleSize = s0.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 19:
                    iComputeDoubleSize = s0.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 20:
                    iComputeDoubleSize = s0.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 21:
                    iComputeDoubleSize = s0.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 22:
                    iComputeDoubleSize = s0.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 23:
                    iComputeDoubleSize = s0.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 24:
                    iComputeDoubleSize = s0.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 25:
                    iComputeDoubleSize = s0.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 26:
                    iComputeDoubleSize = s0.computeSizeStringList(iNumberAt, (List) unsafe.getObject(obj2, jOffset));
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 27:
                    iComputeDoubleSize = s0.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(obj2, jOffset), f0Var.getMessageFieldSchema(i12));
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 28:
                    iComputeDoubleSize = s0.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(obj2, jOffset));
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 29:
                    iComputeDoubleSize = s0.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 30:
                    iComputeDoubleSize = s0.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 31:
                    iComputeDoubleSize = s0.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 32:
                    iComputeDoubleSize = s0.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 33:
                    iComputeDoubleSize = s0.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 34:
                    iComputeDoubleSize = s0.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(obj2, jOffset), false);
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = s0.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (f0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = s0.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (f0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = s0.computeSizeInt64ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (f0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = s0.computeSizeUInt64ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (f0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = s0.computeSizeInt32ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (f0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = s0.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (f0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = s0.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (f0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = s0.computeSizeBoolListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (f0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = s0.computeSizeUInt32ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (f0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = s0.computeSizeEnumListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (f0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = s0.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (f0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = s0.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (f0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 47:
                    iComputeSizeFixed64ListNoTag = s0.computeSizeSInt32ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (f0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = s0.computeSizeSInt64ListNoTag((List) unsafe.getObject(obj2, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (f0Var.useCachedSizeField) {
                            unsafe.putInt(obj2, i17, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i14 = i18 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        break;
                    }
                    i14 = i18;
                    break;
                case 49:
                    iComputeDoubleSize = s0.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(obj2, jOffset), f0Var.getMessageFieldSchema(i12));
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 50:
                    iComputeDoubleSize = f0Var.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(obj2, jOffset), f0Var.getMapFieldDefaultEntry(i12));
                    i14 = i18 + iComputeDoubleSize;
                    break;
                case 51:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 52:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 53:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 54:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 55:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 56:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 57:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 58:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 59:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        Object object2 = unsafe.getObject(obj2, jOffset);
                        iComputeDoubleSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 60:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = s0.computeSizeMessage(iNumberAt, unsafe.getObject(obj2, jOffset), f0Var.getMessageFieldSchema(i12));
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 61:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 62:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 63:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 64:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 65:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 66:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 67:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(obj2, jOffset));
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                case 68:
                    if (f0Var.isOneofPresent(obj2, iNumberAt, i12)) {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(obj2, jOffset), f0Var.getMessageFieldSchema(i12));
                        i14 = i18 + iComputeDoubleSize;
                        break;
                    }
                    i14 = i18;
                    break;
                default:
                    i14 = i18;
                    break;
            }
            i12 += 3;
            i11 = 1048575;
        }
        int unknownFieldsSerializedSize = i14 + f0Var.getUnknownFieldsSerializedSize(f0Var.unknownFieldSchema, obj2);
        return f0Var.hasExtensions ? unknownFieldsSerializedSize + f0Var.extensionSchema.getExtensions(obj2).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.q0
    public int hashCode(Object obj) {
        int i10;
        int iHashLong;
        int length = this.buffer.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i12);
            int iNumberAt = numberAt(i12);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(x0.getDouble(obj, jOffset)));
                    i11 = i10 + iHashLong;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iHashLong = Float.floatToIntBits(x0.getFloat(obj, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(x0.getLong(obj, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(x0.getLong(obj, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iHashLong = x0.getInt(obj, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(x0.getLong(obj, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iHashLong = x0.getInt(obj, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashBoolean(x0.getBoolean(obj, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iHashLong = ((String) x0.getObject(obj, jOffset)).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 9:
                    Object object = x0.getObject(obj, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iHashLong = x0.getObject(obj, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iHashLong = x0.getInt(obj, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iHashLong = x0.getInt(obj, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iHashLong = x0.getInt(obj, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(x0.getLong(obj, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iHashLong = x0.getInt(obj, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(x0.getLong(obj, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 17:
                    Object object2 = x0.getObject(obj, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iHashLong = x0.getObject(obj, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iHashLong = x0.getObject(obj, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 51:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(obj, jOffset)));
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(obj, jOffset));
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(obj, jOffset));
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(obj, jOffset));
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(obj, jOffset);
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(obj, jOffset));
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(obj, jOffset);
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(obj, jOffset));
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = ((String) x0.getObject(obj, jOffset)).hashCode();
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = x0.getObject(obj, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = x0.getObject(obj, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(obj, jOffset);
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(obj, jOffset);
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(obj, jOffset);
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(obj, jOffset));
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(obj, jOffset);
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(obj, jOffset));
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(obj, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = x0.getObject(obj, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i11 * 53) + this.unknownFieldSchema.getFromMessage(obj).hashCode();
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(obj).hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    @Override // com.google.protobuf.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isInitialized(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r3 = r0
            r2 = r1
            r4 = r2
        L7:
            int r5 = r14.checkInitializedCount
            r6 = 1
            if (r2 >= r5) goto L9b
            int[] r5 = r14.intArray
            r9 = r5[r2]
            int r5 = r14.numberAt(r9)
            int r13 = r14.typeAndOffsetAt(r9)
            int[] r7 = r14.buffer
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r0
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L32
            if (r8 == r0) goto L2f
            sun.misc.Unsafe r3 = com.google.protobuf.f0.UNSAFE
            long r6 = (long) r8
            int r4 = r3.getInt(r15, r6)
        L2f:
            r11 = r4
            r10 = r8
            goto L34
        L32:
            r10 = r3
            r11 = r4
        L34:
            boolean r3 = isRequired(r13)
            r7 = r14
            r8 = r15
            if (r3 == 0) goto L43
            boolean r15 = r7.isFieldPresent(r8, r9, r10, r11, r12)
            if (r15 != 0) goto L43
            return r1
        L43:
            int r15 = type(r13)
            r3 = 9
            if (r15 == r3) goto L83
            r3 = 17
            if (r15 == r3) goto L83
            r3 = 27
            if (r15 == r3) goto L7c
            r3 = 60
            if (r15 == r3) goto L6b
            r3 = 68
            if (r15 == r3) goto L6b
            r3 = 49
            if (r15 == r3) goto L7c
            r3 = 50
            if (r15 == r3) goto L64
            goto L94
        L64:
            boolean r15 = r14.isMapInitialized(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L6b:
            boolean r15 = r14.isOneofPresent(r8, r5, r9)
            if (r15 == 0) goto L94
            com.google.protobuf.q0 r15 = r14.getMessageFieldSchema(r9)
            boolean r15 = isInitialized(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L7c:
            boolean r15 = r14.isListInitialized(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L83:
            boolean r15 = r7.isFieldPresent(r8, r9, r10, r11, r12)
            if (r15 == 0) goto L94
            com.google.protobuf.q0 r15 = r14.getMessageFieldSchema(r9)
            boolean r15 = isInitialized(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L94:
            int r2 = r2 + 1
            r15 = r8
            r3 = r10
            r4 = r11
            goto L7
        L9b:
            r7 = r14
            r8 = r15
            boolean r15 = r7.hasExtensions
            if (r15 == 0) goto Lae
            com.google.protobuf.j r15 = r7.extensionSchema
            com.google.protobuf.FieldSet r15 = r15.getExtensions(r8)
            boolean r15 = r15.isInitialized()
            if (r15 != 0) goto Lae
            return r1
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f0.isInitialized(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // com.google.protobuf.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void makeImmutable(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = isMutable(r8)
            if (r0 != 0) goto L8
            goto L8e
        L8:
            boolean r0 = r8 instanceof com.google.protobuf.GeneratedMessageLite
            if (r0 == 0) goto L18
            r0 = r8
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            r0.clearMemoizedSerializedSize()
            r0.clearMemoizedHashCode()
            r0.markImmutable()
        L18:
            int[] r0 = r7.buffer
            int r0 = r0.length
            r1 = 0
        L1c:
            if (r1 >= r0) goto L80
            int r2 = r7.typeAndOffsetAt(r1)
            long r3 = offset(r2)
            int r2 = type(r2)
            r5 = 9
            if (r2 == r5) goto L6a
            r5 = 60
            if (r2 == r5) goto L52
            r5 = 68
            if (r2 == r5) goto L52
            switch(r2) {
                case 17: goto L6a;
                case 18: goto L4c;
                case 19: goto L4c;
                case 20: goto L4c;
                case 21: goto L4c;
                case 22: goto L4c;
                case 23: goto L4c;
                case 24: goto L4c;
                case 25: goto L4c;
                case 26: goto L4c;
                case 27: goto L4c;
                case 28: goto L4c;
                case 29: goto L4c;
                case 30: goto L4c;
                case 31: goto L4c;
                case 32: goto L4c;
                case 33: goto L4c;
                case 34: goto L4c;
                case 35: goto L4c;
                case 36: goto L4c;
                case 37: goto L4c;
                case 38: goto L4c;
                case 39: goto L4c;
                case 40: goto L4c;
                case 41: goto L4c;
                case 42: goto L4c;
                case 43: goto L4c;
                case 44: goto L4c;
                case 45: goto L4c;
                case 46: goto L4c;
                case 47: goto L4c;
                case 48: goto L4c;
                case 49: goto L4c;
                case 50: goto L3a;
                default: goto L39;
            }
        L39:
            goto L7d
        L3a:
            sun.misc.Unsafe r2 = com.google.protobuf.f0.UNSAFE
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7d
            com.google.protobuf.z r6 = r7.mapFieldSchema
            java.lang.Object r5 = r6.toImmutable(r5)
            r2.putObject(r8, r3, r5)
            goto L7d
        L4c:
            com.google.protobuf.w r2 = r7.listFieldSchema
            r2.makeImmutableListAt(r8, r3)
            goto L7d
        L52:
            int r2 = r7.numberAt(r1)
            boolean r2 = r7.isOneofPresent(r8, r2, r1)
            if (r2 == 0) goto L7d
            com.google.protobuf.q0 r2 = r7.getMessageFieldSchema(r1)
            sun.misc.Unsafe r5 = com.google.protobuf.f0.UNSAFE
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.makeImmutable(r3)
            goto L7d
        L6a:
            boolean r2 = r7.isFieldPresent(r8, r1)
            if (r2 == 0) goto L7d
            com.google.protobuf.q0 r2 = r7.getMessageFieldSchema(r1)
            sun.misc.Unsafe r5 = com.google.protobuf.f0.UNSAFE
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.makeImmutable(r3)
        L7d:
            int r1 = r1 + 3
            goto L1c
        L80:
            com.google.protobuf.v0 r0 = r7.unknownFieldSchema
            r0.makeImmutable(r8)
            boolean r0 = r7.hasExtensions
            if (r0 == 0) goto L8e
            com.google.protobuf.j r0 = r7.extensionSchema
            r0.makeImmutable(r8)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f0.makeImmutable(java.lang.Object):void");
    }

    @Override // com.google.protobuf.q0
    public void mergeFrom(Object obj, Object obj2) {
        checkMutable(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.buffer.length; i10 += 3) {
            mergeSingleField(obj, obj2, i10);
        }
        s0.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            s0.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    @Override // com.google.protobuf.q0
    public Object newInstance() {
        return this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x043e  */
    @com.google.protobuf.CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int parseMessage(java.lang.Object r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.c.b r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f0.parseMessage(java.lang.Object, byte[], int, int, int, com.google.protobuf.c$b):int");
    }

    @Override // com.google.protobuf.q0
    public void writeTo(Object obj, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(obj, writer);
        } else {
            writeFieldsInAscendingOrder(obj, writer);
        }
    }

    private boolean isFieldPresent(Object obj, int i10) {
        boolean zEquals;
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j10 != 1048575) {
            return (x0.getInt(obj, j10) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(x0.getDouble(obj, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(x0.getFloat(obj, jOffset)) != 0;
            case 2:
                return x0.getLong(obj, jOffset) != 0;
            case 3:
                return x0.getLong(obj, jOffset) != 0;
            case 4:
                return x0.getInt(obj, jOffset) != 0;
            case 5:
                return x0.getLong(obj, jOffset) != 0;
            case 6:
                return x0.getInt(obj, jOffset) != 0;
            case 7:
                return x0.getBoolean(obj, jOffset);
            case 8:
                Object object = x0.getObject(obj, jOffset);
                if (object instanceof String) {
                    zEquals = ((String) object).isEmpty();
                    break;
                } else {
                    if (!(object instanceof ByteString)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = ByteString.EMPTY.equals(object);
                    break;
                }
            case 9:
                return x0.getObject(obj, jOffset) != null;
            case 10:
                zEquals = ByteString.EMPTY.equals(x0.getObject(obj, jOffset));
                break;
            case 11:
                return x0.getInt(obj, jOffset) != 0;
            case 12:
                return x0.getInt(obj, jOffset) != 0;
            case 13:
                return x0.getInt(obj, jOffset) != 0;
            case 14:
                return x0.getLong(obj, jOffset) != 0;
            case 15:
                return x0.getInt(obj, jOffset) != 0;
            case 16:
                return x0.getLong(obj, jOffset) != 0;
            case 17:
                return x0.getObject(obj, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private int positionForFieldNumber(int i10, int i11) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, i11);
    }

    @Override // com.google.protobuf.q0
    public void mergeFrom(Object obj, p0 p0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        extensionRegistryLite.getClass();
        checkMutable(obj);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, p0Var, extensionRegistryLite);
    }

    private boolean equals(Object obj, Object obj2, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (!arePresentForEquals(obj, obj2, i10) || Double.doubleToLongBits(x0.getDouble(obj, jOffset)) != Double.doubleToLongBits(x0.getDouble(obj2, jOffset))) {
                }
                break;
            case 1:
                if (!arePresentForEquals(obj, obj2, i10) || Float.floatToIntBits(x0.getFloat(obj, jOffset)) != Float.floatToIntBits(x0.getFloat(obj2, jOffset))) {
                }
                break;
            case 2:
                if (!arePresentForEquals(obj, obj2, i10) || x0.getLong(obj, jOffset) != x0.getLong(obj2, jOffset)) {
                }
                break;
            case 3:
                if (!arePresentForEquals(obj, obj2, i10) || x0.getLong(obj, jOffset) != x0.getLong(obj2, jOffset)) {
                }
                break;
            case 4:
                if (!arePresentForEquals(obj, obj2, i10) || x0.getInt(obj, jOffset) != x0.getInt(obj2, jOffset)) {
                }
                break;
            case 5:
                if (!arePresentForEquals(obj, obj2, i10) || x0.getLong(obj, jOffset) != x0.getLong(obj2, jOffset)) {
                }
                break;
            case 6:
                if (!arePresentForEquals(obj, obj2, i10) || x0.getInt(obj, jOffset) != x0.getInt(obj2, jOffset)) {
                }
                break;
            case 7:
                if (!arePresentForEquals(obj, obj2, i10) || x0.getBoolean(obj, jOffset) != x0.getBoolean(obj2, jOffset)) {
                }
                break;
            case 8:
                if (!arePresentForEquals(obj, obj2, i10) || !s0.safeEquals(x0.getObject(obj, jOffset), x0.getObject(obj2, jOffset))) {
                }
                break;
            case 9:
                if (!arePresentForEquals(obj, obj2, i10) || !s0.safeEquals(x0.getObject(obj, jOffset), x0.getObject(obj2, jOffset))) {
                }
                break;
            case 10:
                if (!arePresentForEquals(obj, obj2, i10) || !s0.safeEquals(x0.getObject(obj, jOffset), x0.getObject(obj2, jOffset))) {
                }
                break;
            case 11:
                if (!arePresentForEquals(obj, obj2, i10) || x0.getInt(obj, jOffset) != x0.getInt(obj2, jOffset)) {
                }
                break;
            case 12:
                if (!arePresentForEquals(obj, obj2, i10) || x0.getInt(obj, jOffset) != x0.getInt(obj2, jOffset)) {
                }
                break;
            case 13:
                if (!arePresentForEquals(obj, obj2, i10) || x0.getInt(obj, jOffset) != x0.getInt(obj2, jOffset)) {
                }
                break;
            case 14:
                if (!arePresentForEquals(obj, obj2, i10) || x0.getLong(obj, jOffset) != x0.getLong(obj2, jOffset)) {
                }
                break;
            case 15:
                if (!arePresentForEquals(obj, obj2, i10) || x0.getInt(obj, jOffset) != x0.getInt(obj2, jOffset)) {
                }
                break;
            case 16:
                if (!arePresentForEquals(obj, obj2, i10) || x0.getLong(obj, jOffset) != x0.getLong(obj2, jOffset)) {
                }
                break;
            case 17:
                if (!arePresentForEquals(obj, obj2, i10) || !s0.safeEquals(x0.getObject(obj, jOffset), x0.getObject(obj2, jOffset))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!isOneofCaseEqual(obj, obj2, i10) || !s0.safeEquals(x0.getObject(obj, jOffset), x0.getObject(obj2, jOffset))) {
                }
                break;
        }
        return true;
    }

    @Override // com.google.protobuf.q0
    public void mergeFrom(Object obj, byte[] bArr, int i10, int i11, c.b bVar) throws IOException {
        parseMessage(obj, bArr, i10, i11, 0, bVar);
    }

    private static boolean isInitialized(Object obj, int i10, q0 q0Var) {
        return q0Var.isInitialized(x0.getObject(obj, offset(i10)));
    }
}
