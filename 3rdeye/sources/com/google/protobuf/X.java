package com.google.protobuf;

import N7.B8;
import N7.C1094a9;
import com.google.protobuf.A0;
import com.google.protobuf.AbstractC4026i;
import com.google.protobuf.B;
import com.google.protobuf.B0;
import com.google.protobuf.C4022e;
import com.google.protobuf.M;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: MessageSchema.java */
/* loaded from: classes2.dex */
public final class X<T> implements n0<T> {
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final U defaultInstance;
    private final r<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final J listFieldSchema;
    private final boolean lite;
    private final O mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final Z newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final u0<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = y0.getUnsafe();

    /* compiled from: MessageSchema.java */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[A0.b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[A0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private X(int[] iArr, Object[] objArr, int i, int i10, U u8, boolean z10, boolean z11, int[] iArr2, int i11, int i12, Z z12, J j4, u0<?, ?> u0Var, r<?> rVar, O o10) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i10;
        this.lite = u8 instanceof AbstractC4042z;
        this.proto3 = z10;
        this.hasExtensions = rVar != null && rVar.hasExtensions(u8);
        this.useCachedSizeField = z11;
        this.intArray = iArr2;
        this.checkInitializedCount = i11;
        this.repeatedFieldOffsetStart = i12;
        this.newInstanceSchema = z12;
        this.listFieldSchema = j4;
        this.unknownFieldSchema = u0Var;
        this.extensionSchema = rVar;
        this.defaultInstance = u8;
        this.mapFieldSchema = o10;
    }

    private boolean arePresentForEquals(T t10, T t11, int i) {
        return isFieldPresent(t10, i) == isFieldPresent(t11, i);
    }

    private static <T> boolean booleanAt(T t10, long j4) {
        return y0.getBoolean(t10, j4);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i, int i10, M.b<K, V> bVar, Map<K, V> map, C4022e.b bVar2) throws IOException {
        int iDecodeVarint32 = C4022e.decodeVarint32(bArr, i, bVar2);
        int i11 = bVar2.int1;
        if (i11 < 0 || i11 > i10 - iDecodeVarint32) {
            throw C.truncatedMessage();
        }
        int i12 = iDecodeVarint32 + i11;
        Object obj = bVar.defaultKey;
        Object obj2 = bVar.defaultValue;
        while (iDecodeVarint32 < i12) {
            int iDecodeVarint322 = iDecodeVarint32 + 1;
            int i13 = bArr[iDecodeVarint32];
            if (i13 < 0) {
                iDecodeVarint322 = C4022e.decodeVarint32(i13, bArr, iDecodeVarint322, bVar2);
                i13 = bVar2.int1;
            }
            int i14 = iDecodeVarint322;
            int i15 = i13 >>> 3;
            int i16 = i13 & 7;
            if (i15 != 1) {
                if (i15 == 2 && i16 == bVar.valueType.getWireType()) {
                    iDecodeVarint32 = decodeMapEntryValue(bArr, i14, i10, bVar.valueType, bVar.defaultValue.getClass(), bVar2);
                    obj2 = bVar2.object1;
                } else {
                    iDecodeVarint32 = C4022e.skipField(i13, bArr, i14, i10, bVar2);
                }
            } else if (i16 == bVar.keyType.getWireType()) {
                iDecodeVarint32 = decodeMapEntryValue(bArr, i14, i10, bVar.keyType, null, bVar2);
                obj = bVar2.object1;
            } else {
                iDecodeVarint32 = C4022e.skipField(i13, bArr, i14, i10, bVar2);
            }
        }
        if (iDecodeVarint32 != i12) {
            throw C.parseFailure();
        }
        map.put(obj, obj2);
        return i12;
    }

    private int decodeMapEntryValue(byte[] bArr, int i, int i10, A0.b bVar, Class<?> cls, C4022e.b bVar2) throws IOException {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()]) {
            case 1:
                int iDecodeVarint64 = C4022e.decodeVarint64(bArr, i, bVar2);
                bVar2.object1 = Boolean.valueOf(bVar2.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return C4022e.decodeBytes(bArr, i, bVar2);
            case 3:
                bVar2.object1 = Double.valueOf(C4022e.decodeDouble(bArr, i));
                return i + 8;
            case 4:
            case 5:
                bVar2.object1 = Integer.valueOf(C4022e.decodeFixed32(bArr, i));
                return i + 4;
            case 6:
            case 7:
                bVar2.object1 = Long.valueOf(C4022e.decodeFixed64(bArr, i));
                return i + 8;
            case 8:
                bVar2.object1 = Float.valueOf(C4022e.decodeFloat(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = C4022e.decodeVarint32(bArr, i, bVar2);
                bVar2.object1 = Integer.valueOf(bVar2.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint642 = C4022e.decodeVarint64(bArr, i, bVar2);
                bVar2.object1 = Long.valueOf(bVar2.long1);
                return iDecodeVarint642;
            case 14:
                return C4022e.decodeMessageField(h0.getInstance().schemaFor((Class) cls), bArr, i, i10, bVar2);
            case 15:
                int iDecodeVarint322 = C4022e.decodeVarint32(bArr, i, bVar2);
                bVar2.object1 = Integer.valueOf(AbstractC4027j.decodeZigZag32(bVar2.int1));
                return iDecodeVarint322;
            case 16:
                int iDecodeVarint643 = C4022e.decodeVarint64(bArr, i, bVar2);
                bVar2.object1 = Long.valueOf(AbstractC4027j.decodeZigZag64(bVar2.long1));
                return iDecodeVarint643;
            case 17:
                return C4022e.decodeStringRequireUtf8(bArr, i, bVar2);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t10, long j4) {
        return y0.getDouble(t10, j4);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, u0<UT, UB> u0Var, Object obj2) {
        B.e enumFieldVerifier;
        int iNumberAt = numberAt(i);
        Object object = y0.getObject(obj, offset(typeAndOffsetAt(i)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, u0Var, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i10, Map<K, V> map, B.e eVar, UB ub, u0<UT, UB> u0Var, Object obj) {
        M.b<?, ?> bVarForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = u0Var.getBuilderFromMessage(obj);
                }
                AbstractC4026i.h hVarNewCodedBuilder = AbstractC4026i.newCodedBuilder(M.computeSerializedSize(bVarForMapMetadata, next.getKey(), next.getValue()));
                try {
                    M.writeTo(hVarNewCodedBuilder.getCodedOutput(), bVarForMapMetadata, next.getKey(), next.getValue());
                    u0Var.addLengthDelimited(ub, i10, hVarNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t10, long j4) {
        return y0.getFloat(t10, j4);
    }

    private B.e getEnumFieldVerifier(int i) {
        return (B.e) this.objects[((i / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private n0 getMessageFieldSchema(int i) {
        int i10 = (i / 3) * 2;
        n0 n0Var = (n0) this.objects[i10];
        if (n0Var != null) {
            return n0Var;
        }
        n0<T> n0VarSchemaFor = h0.getInstance().schemaFor((Class) this.objects[i10 + 1]);
        this.objects[i10] = n0VarSchemaFor;
        return n0VarSchemaFor;
    }

    public static v0 getMutableUnknownFields(Object obj) {
        AbstractC4042z abstractC4042z = (AbstractC4042z) obj;
        v0 v0Var = abstractC4042z.unknownFields;
        if (v0Var != v0.getDefaultInstance()) {
            return v0Var;
        }
        v0 v0VarNewInstance = v0.newInstance();
        abstractC4042z.unknownFields = v0VarNewInstance;
        return v0VarNewInstance;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int getSerializedSizeProto2(T t10) {
        int i;
        int i10;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeBytesSize;
        boolean z10;
        int iComputeSizeFixed32List;
        Unsafe unsafe = UNSAFE;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int iN = 0;
        int i14 = 0;
        while (i13 < this.buffer.length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i13);
            int iNumberAt = numberAt(i13);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                i = this.buffer[i13 + 2];
                int i15 = i & i11;
                i10 = 1 << (i >>> 20);
                if (i15 != i12) {
                    i14 = unsafe.getInt(t10, i15);
                    i12 = i15;
                }
            } else {
                i = (!this.useCachedSizeField || iType < EnumC4039w.DOUBLE_LIST_PACKED.id() || iType > EnumC4039w.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i13 + 2] & i11;
                i10 = 0;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = AbstractC4029l.computeDoubleSize(iNumberAt, 0.0d);
                        iN += iComputeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = AbstractC4029l.computeFloatSize(iNumberAt, 0.0f);
                        iN += iComputeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = AbstractC4029l.computeInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = AbstractC4029l.computeUInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = AbstractC4029l.computeInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        iComputeDoubleSize = AbstractC4029l.computeFixed64Size(iNumberAt, 0L);
                        iN += iComputeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i14 & i10) != 0) {
                        iComputeDoubleSize = AbstractC4029l.computeFixed32Size(iNumberAt, 0);
                        iN += iComputeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if ((i14 & i10) != 0) {
                        iComputeBoolSize = AbstractC4029l.computeBoolSize(iNumberAt, true);
                        iN += iComputeBoolSize;
                    }
                    break;
                case 8:
                    if ((i14 & i10) != 0) {
                        Object object = unsafe.getObject(t10, jOffset);
                        iComputeBytesSize = object instanceof AbstractC4026i ? AbstractC4029l.computeBytesSize(iNumberAt, (AbstractC4026i) object) : AbstractC4029l.computeStringSize(iNumberAt, (String) object);
                        iN = iComputeBytesSize + iN;
                    }
                    break;
                case 9:
                    if ((i14 & i10) != 0) {
                        iComputeBoolSize = p0.computeSizeMessage(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 10:
                    if ((i14 & i10) != 0) {
                        iComputeBoolSize = AbstractC4029l.computeBytesSize(iNumberAt, (AbstractC4026i) unsafe.getObject(t10, jOffset));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 11:
                    if ((i14 & i10) != 0) {
                        iComputeBoolSize = AbstractC4029l.computeUInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 12:
                    if ((i14 & i10) != 0) {
                        iComputeBoolSize = AbstractC4029l.computeEnumSize(iNumberAt, unsafe.getInt(t10, jOffset));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 13:
                    if ((i14 & i10) != 0) {
                        iComputeBoolSize = AbstractC4029l.computeSFixed32Size(iNumberAt, 0);
                        iN += iComputeBoolSize;
                    }
                    break;
                case 14:
                    if ((i14 & i10) != 0) {
                        iComputeBoolSize = AbstractC4029l.computeSFixed64Size(iNumberAt, 0L);
                        iN += iComputeBoolSize;
                    }
                    break;
                case 15:
                    if ((i14 & i10) != 0) {
                        iComputeBoolSize = AbstractC4029l.computeSInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 16:
                    if ((i14 & i10) != 0) {
                        iComputeBoolSize = AbstractC4029l.computeSInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 17:
                    if ((i14 & i10) != 0) {
                        iComputeBoolSize = AbstractC4029l.computeGroupSize(iNumberAt, (U) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 18:
                    iComputeBoolSize = p0.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iN += iComputeBoolSize;
                    break;
                case 19:
                    z10 = false;
                    iComputeSizeFixed32List = p0.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iN += iComputeSizeFixed32List;
                    break;
                case 20:
                    z10 = false;
                    iComputeSizeFixed32List = p0.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iN += iComputeSizeFixed32List;
                    break;
                case 21:
                    z10 = false;
                    iComputeSizeFixed32List = p0.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iN += iComputeSizeFixed32List;
                    break;
                case 22:
                    z10 = false;
                    iComputeSizeFixed32List = p0.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iN += iComputeSizeFixed32List;
                    break;
                case 23:
                    z10 = false;
                    iComputeSizeFixed32List = p0.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iN += iComputeSizeFixed32List;
                    break;
                case 24:
                    z10 = false;
                    iComputeSizeFixed32List = p0.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iN += iComputeSizeFixed32List;
                    break;
                case 25:
                    z10 = false;
                    iComputeSizeFixed32List = p0.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iN += iComputeSizeFixed32List;
                    break;
                case 26:
                    iComputeBoolSize = p0.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t10, jOffset));
                    iN += iComputeBoolSize;
                    break;
                case 27:
                    iComputeBoolSize = p0.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                    iN += iComputeBoolSize;
                    break;
                case 28:
                    iComputeBoolSize = p0.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t10, jOffset));
                    iN += iComputeBoolSize;
                    break;
                case 29:
                    iComputeBoolSize = p0.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iN += iComputeBoolSize;
                    break;
                case 30:
                    z10 = false;
                    iComputeSizeFixed32List = p0.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iN += iComputeSizeFixed32List;
                    break;
                case 31:
                    z10 = false;
                    iComputeSizeFixed32List = p0.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iN += iComputeSizeFixed32List;
                    break;
                case 32:
                    z10 = false;
                    iComputeSizeFixed32List = p0.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iN += iComputeSizeFixed32List;
                    break;
                case 33:
                    z10 = false;
                    iComputeSizeFixed32List = p0.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iN += iComputeSizeFixed32List;
                    break;
                case 34:
                    z10 = false;
                    iComputeSizeFixed32List = p0.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iN += iComputeSizeFixed32List;
                    break;
                case 35:
                    int iComputeSizeFixed64ListNoTag = p0.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i, iComputeSizeFixed64ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeFixed64ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag, iN);
                    }
                    break;
                case 36:
                    int iComputeSizeFixed32ListNoTag = p0.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i, iComputeSizeFixed32ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeFixed32ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag, iN);
                    }
                    break;
                case 37:
                    int iComputeSizeInt64ListNoTag = p0.computeSizeInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i, iComputeSizeInt64ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeInt64ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeInt64ListNoTag, iN);
                    }
                    break;
                case 38:
                    int iComputeSizeUInt64ListNoTag = p0.computeSizeUInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeUInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i, iComputeSizeUInt64ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeUInt64ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeUInt64ListNoTag, iN);
                    }
                    break;
                case 39:
                    int iComputeSizeInt32ListNoTag = p0.computeSizeInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i, iComputeSizeInt32ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeInt32ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeInt32ListNoTag, iN);
                    }
                    break;
                case 40:
                    int iComputeSizeFixed64ListNoTag2 = p0.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i, iComputeSizeFixed64ListNoTag2);
                        }
                        iN = C1094a9.n(iComputeSizeFixed64ListNoTag2, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag2, iN);
                    }
                    break;
                case 41:
                    int iComputeSizeFixed32ListNoTag2 = p0.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed32ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i, iComputeSizeFixed32ListNoTag2);
                        }
                        iN = C1094a9.n(iComputeSizeFixed32ListNoTag2, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag2, iN);
                    }
                    break;
                case 42:
                    int iComputeSizeBoolListNoTag = p0.computeSizeBoolListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeBoolListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i, iComputeSizeBoolListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeBoolListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeBoolListNoTag, iN);
                    }
                    break;
                case 43:
                    int iComputeSizeUInt32ListNoTag = p0.computeSizeUInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeUInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i, iComputeSizeUInt32ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeUInt32ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeUInt32ListNoTag, iN);
                    }
                    break;
                case 44:
                    int iComputeSizeEnumListNoTag = p0.computeSizeEnumListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeEnumListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i, iComputeSizeEnumListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeEnumListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeEnumListNoTag, iN);
                    }
                    break;
                case 45:
                    int iComputeSizeFixed32ListNoTag3 = p0.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed32ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i, iComputeSizeFixed32ListNoTag3);
                        }
                        iN = C1094a9.n(iComputeSizeFixed32ListNoTag3, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag3, iN);
                    }
                    break;
                case 46:
                    int iComputeSizeFixed64ListNoTag3 = p0.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i, iComputeSizeFixed64ListNoTag3);
                        }
                        iN = C1094a9.n(iComputeSizeFixed64ListNoTag3, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag3, iN);
                    }
                    break;
                case 47:
                    int iComputeSizeSInt32ListNoTag = p0.computeSizeSInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeSInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i, iComputeSizeSInt32ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeSInt32ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeSInt32ListNoTag, iN);
                    }
                    break;
                case 48:
                    int iComputeSizeSInt64ListNoTag = p0.computeSizeSInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i, iComputeSizeSInt64ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeSInt64ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeSInt64ListNoTag, iN);
                    }
                    break;
                case 49:
                    iComputeBoolSize = p0.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                    iN += iComputeBoolSize;
                    break;
                case 50:
                    iComputeBoolSize = this.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t10, jOffset), getMapFieldDefaultEntry(i13));
                    iN += iComputeBoolSize;
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeDoubleSize(iNumberAt, 0.0d);
                        iN += iComputeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeFloatSize(iNumberAt, 0.0f);
                        iN += iComputeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeUInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeFixed64Size(iNumberAt, 0L);
                        iN += iComputeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeFixed32Size(iNumberAt, 0);
                        iN += iComputeBoolSize;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeBoolSize(iNumberAt, true);
                        iN += iComputeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        Object object2 = unsafe.getObject(t10, jOffset);
                        iComputeBytesSize = object2 instanceof AbstractC4026i ? AbstractC4029l.computeBytesSize(iNumberAt, (AbstractC4026i) object2) : AbstractC4029l.computeStringSize(iNumberAt, (String) object2);
                        iN = iComputeBytesSize + iN;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = p0.computeSizeMessage(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeBytesSize(iNumberAt, (AbstractC4026i) unsafe.getObject(t10, jOffset));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeUInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeEnumSize(iNumberAt, oneofIntAt(t10, jOffset));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeSFixed32Size(iNumberAt, 0);
                        iN += iComputeBoolSize;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeSFixed64Size(iNumberAt, 0L);
                        iN += iComputeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeSInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeSInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iN += iComputeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeBoolSize = AbstractC4029l.computeGroupSize(iNumberAt, (U) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                        iN += iComputeBoolSize;
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        int unknownFieldsSerializedSize = iN + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t10);
        return this.hasExtensions ? this.extensionSchema.getExtensions(t10).getSerializedSize() + unknownFieldsSerializedSize : unknownFieldsSerializedSize;
    }

    private int getSerializedSizeProto3(T t10) {
        int iComputeDoubleSize;
        int iComputeBytesSize;
        Unsafe unsafe = UNSAFE;
        int iN = 0;
        for (int i = 0; i < this.buffer.length; i += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i);
            long jOffset = offset(iTypeAndOffsetAt);
            int i10 = (iType < EnumC4039w.DOUBLE_LIST_PACKED.id() || iType > EnumC4039w.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i + 2] & 1048575;
            switch (iType) {
                case 0:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeDoubleSize(iNumberAt, 0.0d);
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeFloatSize(iNumberAt, 0.0f);
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeInt64Size(iNumberAt, y0.getLong(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeUInt64Size(iNumberAt, y0.getLong(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeInt32Size(iNumberAt, y0.getInt(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeFixed64Size(iNumberAt, 0L);
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeFixed32Size(iNumberAt, 0);
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeBoolSize(iNumberAt, true);
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (isFieldPresent(t10, i)) {
                        Object object = y0.getObject(t10, jOffset);
                        iComputeBytesSize = object instanceof AbstractC4026i ? AbstractC4029l.computeBytesSize(iNumberAt, (AbstractC4026i) object) : AbstractC4029l.computeStringSize(iNumberAt, (String) object);
                        iN = iComputeBytesSize + iN;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = p0.computeSizeMessage(iNumberAt, y0.getObject(t10, jOffset), getMessageFieldSchema(i));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeBytesSize(iNumberAt, (AbstractC4026i) y0.getObject(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeUInt32Size(iNumberAt, y0.getInt(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeEnumSize(iNumberAt, y0.getInt(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeSFixed32Size(iNumberAt, 0);
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeSFixed64Size(iNumberAt, 0L);
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeSInt32Size(iNumberAt, y0.getInt(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeSInt64Size(iNumberAt, y0.getLong(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (isFieldPresent(t10, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeGroupSize(iNumberAt, (U) y0.getObject(t10, jOffset), getMessageFieldSchema(i));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iComputeDoubleSize = p0.computeSizeFixed64List(iNumberAt, listAt(t10, jOffset), false);
                    iN += iComputeDoubleSize;
                    break;
                case 19:
                    iComputeDoubleSize = p0.computeSizeFixed32List(iNumberAt, listAt(t10, jOffset), false);
                    iN += iComputeDoubleSize;
                    break;
                case 20:
                    iComputeDoubleSize = p0.computeSizeInt64List(iNumberAt, listAt(t10, jOffset), false);
                    iN += iComputeDoubleSize;
                    break;
                case 21:
                    iComputeDoubleSize = p0.computeSizeUInt64List(iNumberAt, listAt(t10, jOffset), false);
                    iN += iComputeDoubleSize;
                    break;
                case 22:
                    iComputeDoubleSize = p0.computeSizeInt32List(iNumberAt, listAt(t10, jOffset), false);
                    iN += iComputeDoubleSize;
                    break;
                case 23:
                    iComputeDoubleSize = p0.computeSizeFixed64List(iNumberAt, listAt(t10, jOffset), false);
                    iN += iComputeDoubleSize;
                    break;
                case 24:
                    iComputeDoubleSize = p0.computeSizeFixed32List(iNumberAt, listAt(t10, jOffset), false);
                    iN += iComputeDoubleSize;
                    break;
                case 25:
                    iComputeDoubleSize = p0.computeSizeBoolList(iNumberAt, listAt(t10, jOffset), false);
                    iN += iComputeDoubleSize;
                    break;
                case 26:
                    iComputeDoubleSize = p0.computeSizeStringList(iNumberAt, listAt(t10, jOffset));
                    iN += iComputeDoubleSize;
                    break;
                case 27:
                    iComputeDoubleSize = p0.computeSizeMessageList(iNumberAt, listAt(t10, jOffset), getMessageFieldSchema(i));
                    iN += iComputeDoubleSize;
                    break;
                case 28:
                    iComputeDoubleSize = p0.computeSizeByteStringList(iNumberAt, listAt(t10, jOffset));
                    iN += iComputeDoubleSize;
                    break;
                case 29:
                    iComputeDoubleSize = p0.computeSizeUInt32List(iNumberAt, listAt(t10, jOffset), false);
                    iN += iComputeDoubleSize;
                    break;
                case 30:
                    iComputeDoubleSize = p0.computeSizeEnumList(iNumberAt, listAt(t10, jOffset), false);
                    iN += iComputeDoubleSize;
                    break;
                case 31:
                    iComputeDoubleSize = p0.computeSizeFixed32List(iNumberAt, listAt(t10, jOffset), false);
                    iN += iComputeDoubleSize;
                    break;
                case 32:
                    iComputeDoubleSize = p0.computeSizeFixed64List(iNumberAt, listAt(t10, jOffset), false);
                    iN += iComputeDoubleSize;
                    break;
                case 33:
                    iComputeDoubleSize = p0.computeSizeSInt32List(iNumberAt, listAt(t10, jOffset), false);
                    iN += iComputeDoubleSize;
                    break;
                case 34:
                    iComputeDoubleSize = p0.computeSizeSInt64List(iNumberAt, listAt(t10, jOffset), false);
                    iN += iComputeDoubleSize;
                    break;
                case 35:
                    int iComputeSizeFixed64ListNoTag = p0.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeFixed64ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag, iN);
                        break;
                    }
                case 36:
                    int iComputeSizeFixed32ListNoTag = p0.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed32ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeFixed32ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag, iN);
                        break;
                    }
                case 37:
                    int iComputeSizeInt64ListNoTag = p0.computeSizeInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeInt64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeInt64ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeInt64ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeInt64ListNoTag, iN);
                        break;
                    }
                case 38:
                    int iComputeSizeUInt64ListNoTag = p0.computeSizeUInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeUInt64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeUInt64ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeUInt64ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeUInt64ListNoTag, iN);
                        break;
                    }
                case 39:
                    int iComputeSizeInt32ListNoTag = p0.computeSizeInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeInt32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeInt32ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeInt32ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeInt32ListNoTag, iN);
                        break;
                    }
                case 40:
                    int iComputeSizeFixed64ListNoTag2 = p0.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag2 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag2);
                        }
                        iN = C1094a9.n(iComputeSizeFixed64ListNoTag2, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag2, iN);
                        break;
                    }
                case 41:
                    int iComputeSizeFixed32ListNoTag2 = p0.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed32ListNoTag2 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed32ListNoTag2);
                        }
                        iN = C1094a9.n(iComputeSizeFixed32ListNoTag2, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag2, iN);
                        break;
                    }
                case 42:
                    int iComputeSizeBoolListNoTag = p0.computeSizeBoolListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeBoolListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeBoolListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeBoolListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeBoolListNoTag, iN);
                        break;
                    }
                case 43:
                    int iComputeSizeUInt32ListNoTag = p0.computeSizeUInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeUInt32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeUInt32ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeUInt32ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeUInt32ListNoTag, iN);
                        break;
                    }
                case 44:
                    int iComputeSizeEnumListNoTag = p0.computeSizeEnumListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeEnumListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeEnumListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeEnumListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeEnumListNoTag, iN);
                        break;
                    }
                case 45:
                    int iComputeSizeFixed32ListNoTag3 = p0.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed32ListNoTag3 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed32ListNoTag3);
                        }
                        iN = C1094a9.n(iComputeSizeFixed32ListNoTag3, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag3, iN);
                        break;
                    }
                case 46:
                    int iComputeSizeFixed64ListNoTag3 = p0.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag3 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag3);
                        }
                        iN = C1094a9.n(iComputeSizeFixed64ListNoTag3, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag3, iN);
                        break;
                    }
                case 47:
                    int iComputeSizeSInt32ListNoTag = p0.computeSizeSInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeSInt32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeSInt32ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeSInt32ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeSInt32ListNoTag, iN);
                        break;
                    }
                case 48:
                    int iComputeSizeSInt64ListNoTag = p0.computeSizeSInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeSInt64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeSInt64ListNoTag);
                        }
                        iN = C1094a9.n(iComputeSizeSInt64ListNoTag, AbstractC4029l.computeTagSize(iNumberAt), iComputeSizeSInt64ListNoTag, iN);
                        break;
                    }
                case 49:
                    iComputeDoubleSize = p0.computeSizeGroupList(iNumberAt, listAt(t10, jOffset), getMessageFieldSchema(i));
                    iN += iComputeDoubleSize;
                    break;
                case 50:
                    iComputeDoubleSize = this.mapFieldSchema.getSerializedSize(iNumberAt, y0.getObject(t10, jOffset), getMapFieldDefaultEntry(i));
                    iN += iComputeDoubleSize;
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeDoubleSize(iNumberAt, 0.0d);
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeFloatSize(iNumberAt, 0.0f);
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeUInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeFixed64Size(iNumberAt, 0L);
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeFixed32Size(iNumberAt, 0);
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeBoolSize(iNumberAt, true);
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        Object object2 = y0.getObject(t10, jOffset);
                        iComputeBytesSize = object2 instanceof AbstractC4026i ? AbstractC4029l.computeBytesSize(iNumberAt, (AbstractC4026i) object2) : AbstractC4029l.computeStringSize(iNumberAt, (String) object2);
                        iN = iComputeBytesSize + iN;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = p0.computeSizeMessage(iNumberAt, y0.getObject(t10, jOffset), getMessageFieldSchema(i));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeBytesSize(iNumberAt, (AbstractC4026i) y0.getObject(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeUInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeEnumSize(iNumberAt, oneofIntAt(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeSFixed32Size(iNumberAt, 0);
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeSFixed64Size(iNumberAt, 0L);
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeSInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeSInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t10, iNumberAt, i)) {
                        iComputeDoubleSize = AbstractC4029l.computeGroupSize(iNumberAt, (U) y0.getObject(t10, jOffset), getMessageFieldSchema(i));
                        iN += iComputeDoubleSize;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return iN + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t10);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(u0<UT, UB> u0Var, T t10) {
        return u0Var.getSerializedSize(u0Var.getFromMessage(t10));
    }

    private static <T> int intAt(T t10, long j4) {
        return y0.getInt(t10, j4);
    }

    private static boolean isEnforceUtf8(int i) {
        return (i & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(T t10, int i, int i10, int i11, int i12) {
        return i10 == 1048575 ? isFieldPresent(t10, i) : (i11 & i12) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i, int i10) {
        List list = (List) y0.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        n0 messageFieldSchema = getMessageFieldSchema(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (!messageFieldSchema.isInitialized(list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.n0] */
    private boolean isMapInitialized(T t10, int i, int i10) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(y0.getObject(t10, offset(i)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i10)).valueType.getJavaType() != A0.c.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            SchemaFor = SchemaFor;
            if (SchemaFor == 0) {
                SchemaFor = h0.getInstance().schemaFor((Class) obj.getClass());
            }
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC4042z) {
            return ((AbstractC4042z) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t10, T t11, int i) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        return y0.getInt(t10, jPresenceMaskAndOffsetAt) == y0.getInt(t11, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t10, int i, int i10) {
        return y0.getInt(t10, (long) (presenceMaskAndOffsetAt(i10) & 1048575)) == i;
    }

    private static boolean isRequired(int i) {
        return (i & REQUIRED_MASK) != 0;
    }

    private static List<?> listAt(Object obj, long j4) {
        return (List) y0.getObject(obj, j4);
    }

    private static <T> long longAt(T t10, long j4) {
        return y0.getLong(t10, j4);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private <UT, UB, ET extends com.google.protobuf.C4038v.c<ET>> void mergeFromHelper(com.google.protobuf.u0<UT, UB> r17, com.google.protobuf.r<ET> r18, T r19, com.google.protobuf.l0 r20, com.google.protobuf.C4034q r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.X.mergeFromHelper(com.google.protobuf.u0, com.google.protobuf.r, java.lang.Object, com.google.protobuf.l0, com.google.protobuf.q):void");
    }

    private final <K, V> void mergeMap(Object obj, int i, Object obj2, C4034q c4034q, l0 l0Var) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i));
        Object object = y0.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            y0.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            y0.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        l0Var.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), c4034q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t10, T t11, int i) {
        if (isFieldPresent(t11, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t11, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t11);
            }
            n0 messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(t10, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t10, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t10, jOffset, object);
                }
                setFieldPresent(t10, i);
                return;
            }
            Object object2 = unsafe.getObject(t10, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t10, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t10, T t11, int i) {
        int iNumberAt = numberAt(i);
        if (isOneofPresent(t11, iNumberAt, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t11, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t11);
            }
            n0 messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(t10, iNumberAt, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t10, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t10, jOffset, object);
                }
                setOneofPresent(t10, iNumberAt, i);
                return;
            }
            Object object2 = unsafe.getObject(t10, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t10, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t10, T t11, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t11, i)) {
                    y0.putDouble(t10, jOffset, y0.getDouble(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 1:
                if (isFieldPresent(t11, i)) {
                    y0.putFloat(t10, jOffset, y0.getFloat(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 2:
                if (isFieldPresent(t11, i)) {
                    y0.putLong(t10, jOffset, y0.getLong(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 3:
                if (isFieldPresent(t11, i)) {
                    y0.putLong(t10, jOffset, y0.getLong(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 4:
                if (isFieldPresent(t11, i)) {
                    y0.putInt(t10, jOffset, y0.getInt(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 5:
                if (isFieldPresent(t11, i)) {
                    y0.putLong(t10, jOffset, y0.getLong(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 6:
                if (isFieldPresent(t11, i)) {
                    y0.putInt(t10, jOffset, y0.getInt(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 7:
                if (isFieldPresent(t11, i)) {
                    y0.putBoolean(t10, jOffset, y0.getBoolean(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 8:
                if (isFieldPresent(t11, i)) {
                    y0.putObject(t10, jOffset, y0.getObject(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 9:
                mergeMessage(t10, t11, i);
                break;
            case 10:
                if (isFieldPresent(t11, i)) {
                    y0.putObject(t10, jOffset, y0.getObject(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 11:
                if (isFieldPresent(t11, i)) {
                    y0.putInt(t10, jOffset, y0.getInt(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 12:
                if (isFieldPresent(t11, i)) {
                    y0.putInt(t10, jOffset, y0.getInt(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 13:
                if (isFieldPresent(t11, i)) {
                    y0.putInt(t10, jOffset, y0.getInt(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 14:
                if (isFieldPresent(t11, i)) {
                    y0.putLong(t10, jOffset, y0.getLong(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 15:
                if (isFieldPresent(t11, i)) {
                    y0.putInt(t10, jOffset, y0.getInt(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 16:
                if (isFieldPresent(t11, i)) {
                    y0.putLong(t10, jOffset, y0.getLong(t11, jOffset));
                    setFieldPresent(t10, i);
                    break;
                }
                break;
            case 17:
                mergeMessage(t10, t11, i);
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
                this.listFieldSchema.mergeListsAt(t10, t11, jOffset);
                break;
            case 50:
                p0.mergeMap(this.mapFieldSchema, t10, t11, jOffset);
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
                if (isOneofPresent(t11, iNumberAt, i)) {
                    y0.putObject(t10, jOffset, y0.getObject(t11, jOffset));
                    setOneofPresent(t10, iNumberAt, i);
                    break;
                }
                break;
            case 60:
                mergeOneofMessage(t10, t11, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t11, iNumberAt, i)) {
                    y0.putObject(t10, jOffset, y0.getObject(t11, jOffset));
                    setOneofPresent(t10, iNumberAt, i);
                    break;
                }
                break;
            case 68:
                mergeOneofMessage(t10, t11, i);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t10, int i) {
        n0 messageFieldSchema = getMessageFieldSchema(i);
        long jOffset = offset(typeAndOffsetAt(i));
        if (!isFieldPresent(t10, i)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t10, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t10, int i, int i10) {
        n0 messageFieldSchema = getMessageFieldSchema(i10);
        if (!isOneofPresent(t10, i, i10)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t10, offset(typeAndOffsetAt(i10)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> X<T> newSchema(Class<T> cls, S s10, Z z10, J j4, u0<?, ?> u0Var, r<?> rVar, O o10) {
        return s10 instanceof k0 ? newSchemaForRawMessageInfo((k0) s10, z10, j4, u0Var, rVar, o10) : newSchemaForMessageInfo((r0) s10, z10, j4, u0Var, rVar, o10);
    }

    public static <T> X<T> newSchemaForMessageInfo(r0 r0Var, Z z10, J j4, u0<?, ?> u0Var, r<?> rVar, O o10) {
        int fieldNumber;
        int fieldNumber2;
        int i;
        boolean z11 = r0Var.getSyntax() == g0.PROTO3;
        C4037u[] fields = r0Var.getFields();
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
        int i10 = 0;
        int i11 = 0;
        for (C4037u c4037u : fields) {
            if (c4037u.getType() == EnumC4039w.MAP) {
                i10++;
            } else if (c4037u.getType().id() >= 18 && c4037u.getType().id() <= 49) {
                i11++;
            }
        }
        int[] iArr2 = i10 > 0 ? new int[i10] : null;
        int[] iArr3 = i11 > 0 ? new int[i11] : null;
        int[] checkInitialized = r0Var.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i12 < fields.length) {
            C4037u c4037u2 = fields[i12];
            int fieldNumber3 = c4037u2.getFieldNumber();
            storeFieldData(c4037u2, iArr, i13, objArr);
            if (i14 < checkInitialized.length && checkInitialized[i14] == fieldNumber3) {
                checkInitialized[i14] = i13;
                i14++;
            }
            if (c4037u2.getType() == EnumC4039w.MAP) {
                iArr2[i15] = i13;
                i15++;
            } else {
                if (c4037u2.getType().id() >= 18 && c4037u2.getType().id() <= 49) {
                    i = i13;
                    iArr3[i16] = (int) y0.objectFieldOffset(c4037u2.getField());
                    i16++;
                }
                i12++;
                i13 = i + 3;
            }
            i = i13;
            i12++;
            i13 = i + 3;
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
        return new X<>(iArr, objArr, fieldNumber, fieldNumber2, r0Var.getDefaultInstance(), z11, true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, z10, j4, u0Var, rVar, o10);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0361  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.protobuf.X<T> newSchemaForRawMessageInfo(com.google.protobuf.k0 r32, com.google.protobuf.Z r33, com.google.protobuf.J r34, com.google.protobuf.u0<?, ?> r35, com.google.protobuf.r<?> r36, com.google.protobuf.O r37) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.X.newSchemaForRawMessageInfo(com.google.protobuf.k0, com.google.protobuf.Z, com.google.protobuf.J, com.google.protobuf.u0, com.google.protobuf.r, com.google.protobuf.O):com.google.protobuf.X");
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t10, long j4) {
        return ((Boolean) y0.getObject(t10, j4)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t10, long j4) {
        return ((Double) y0.getObject(t10, j4)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t10, long j4) {
        return ((Float) y0.getObject(t10, j4)).floatValue();
    }

    private static <T> int oneofIntAt(T t10, long j4) {
        return ((Integer) y0.getObject(t10, j4)).intValue();
    }

    private static <T> long oneofLongAt(T t10, long j4) {
        return ((Long) y0.getObject(t10, j4)).longValue();
    }

    private <K, V> int parseMapField(T t10, byte[] bArr, int i, int i10, int i11, long j4, C4022e.b bVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i11);
        Object object = unsafe.getObject(t10, j4);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t10, j4, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i, i10, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), bVar);
    }

    private int parseOneofField(T t10, byte[] bArr, int i, int i10, int i11, int i12, int i13, int i14, int i15, long j4, int i16, C4022e.b bVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j10 = this.buffer[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                if (i13 != 1) {
                    return i;
                }
                unsafe.putObject(t10, j4, Double.valueOf(C4022e.decodeDouble(bArr, i)));
                int i17 = i + 8;
                unsafe.putInt(t10, j10, i12);
                return i17;
            case 52:
                if (i13 != 5) {
                    return i;
                }
                unsafe.putObject(t10, j4, Float.valueOf(C4022e.decodeFloat(bArr, i)));
                int i18 = i + 4;
                unsafe.putInt(t10, j10, i12);
                return i18;
            case 53:
            case 54:
                if (i13 != 0) {
                    return i;
                }
                int iDecodeVarint64 = C4022e.decodeVarint64(bArr, i, bVar);
                unsafe.putObject(t10, j4, Long.valueOf(bVar.long1));
                unsafe.putInt(t10, j10, i12);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i13 != 0) {
                    return i;
                }
                int iDecodeVarint32 = C4022e.decodeVarint32(bArr, i, bVar);
                unsafe.putObject(t10, j4, Integer.valueOf(bVar.int1));
                unsafe.putInt(t10, j10, i12);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i13 != 1) {
                    return i;
                }
                unsafe.putObject(t10, j4, Long.valueOf(C4022e.decodeFixed64(bArr, i)));
                int i19 = i + 8;
                unsafe.putInt(t10, j10, i12);
                return i19;
            case 57:
            case 64:
                if (i13 != 5) {
                    return i;
                }
                unsafe.putObject(t10, j4, Integer.valueOf(C4022e.decodeFixed32(bArr, i)));
                int i20 = i + 4;
                unsafe.putInt(t10, j10, i12);
                return i20;
            case 58:
                if (i13 != 0) {
                    return i;
                }
                int iDecodeVarint642 = C4022e.decodeVarint64(bArr, i, bVar);
                unsafe.putObject(t10, j4, Boolean.valueOf(bVar.long1 != 0));
                unsafe.putInt(t10, j10, i12);
                return iDecodeVarint642;
            case 59:
                if (i13 != 2) {
                    return i;
                }
                int iDecodeVarint322 = C4022e.decodeVarint32(bArr, i, bVar);
                int i21 = bVar.int1;
                if (i21 == 0) {
                    unsafe.putObject(t10, j4, "");
                } else {
                    if ((i14 & ENFORCE_UTF8_MASK) != 0 && !z0.isValidUtf8(bArr, iDecodeVarint322, iDecodeVarint322 + i21)) {
                        throw C.invalidUtf8();
                    }
                    unsafe.putObject(t10, j4, new String(bArr, iDecodeVarint322, i21, B.UTF_8));
                    iDecodeVarint322 += i21;
                }
                unsafe.putInt(t10, j10, i12);
                return iDecodeVarint322;
            case 60:
                if (i13 != 2) {
                    return i;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t10, i12, i16);
                int iMergeMessageField = C4022e.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i16), bArr, i, i10, bVar);
                storeOneofMessageField(t10, i12, i16, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (i13 != 2) {
                    return i;
                }
                int iDecodeBytes = C4022e.decodeBytes(bArr, i, bVar);
                unsafe.putObject(t10, j4, bVar.object1);
                unsafe.putInt(t10, j10, i12);
                return iDecodeBytes;
            case 63:
                if (i13 != 0) {
                    return i;
                }
                int iDecodeVarint323 = C4022e.decodeVarint32(bArr, i, bVar);
                int i22 = bVar.int1;
                B.e enumFieldVerifier = getEnumFieldVerifier(i16);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i22)) {
                    getMutableUnknownFields(t10).storeField(i11, Long.valueOf(i22));
                    return iDecodeVarint323;
                }
                unsafe.putObject(t10, j4, Integer.valueOf(i22));
                unsafe.putInt(t10, j10, i12);
                return iDecodeVarint323;
            case 66:
                if (i13 != 0) {
                    return i;
                }
                int iDecodeVarint324 = C4022e.decodeVarint32(bArr, i, bVar);
                unsafe.putObject(t10, j4, Integer.valueOf(AbstractC4027j.decodeZigZag32(bVar.int1)));
                unsafe.putInt(t10, j10, i12);
                return iDecodeVarint324;
            case 67:
                if (i13 != 0) {
                    return i;
                }
                int iDecodeVarint643 = C4022e.decodeVarint64(bArr, i, bVar);
                unsafe.putObject(t10, j4, Long.valueOf(AbstractC4027j.decodeZigZag64(bVar.long1)));
                unsafe.putInt(t10, j10, i12);
                return iDecodeVarint643;
            case 68:
                if (i13 == 3) {
                    Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t10, i12, i16);
                    int iMergeGroupField = C4022e.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i16), bArr, i, i10, (i11 & (-8)) | 4, bVar);
                    storeOneofMessageField(t10, i12, i16, objMutableOneofMessageFieldForMerge2);
                    return iMergeGroupField;
                }
                break;
        }
        return i;
    }

    private int parseProto3Message(T t10, byte[] bArr, int i, int i10, C4022e.b bVar) throws IOException {
        T t11;
        Unsafe unsafe;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[] bArr2;
        C4022e.b bVar2;
        int i16;
        int i17;
        int iDecodeVarint32;
        T t12;
        Unsafe unsafe2;
        int i18;
        C4022e.b bVar3;
        byte[] bArr3;
        int iDecodeVarint64;
        int i19;
        int i20;
        int i21;
        int i22;
        X<T> x10 = this;
        T t13 = t10;
        byte[] bArr4 = bArr;
        int i23 = i10;
        C4022e.b bVar4 = bVar;
        checkMutable(t13);
        Unsafe unsafe3 = UNSAFE;
        int i24 = -1;
        int i25 = i;
        int i26 = -1;
        int i27 = 0;
        int i28 = 0;
        int i29 = 1048575;
        while (i25 < i23) {
            int iDecodeVarint322 = i25 + 1;
            int i30 = bArr4[i25];
            if (i30 < 0) {
                iDecodeVarint322 = C4022e.decodeVarint32(i30, bArr4, iDecodeVarint322, bVar4);
                i30 = bVar4.int1;
            }
            int i31 = i30 >>> 3;
            int i32 = i30 & 7;
            int iPositionForFieldNumber = i31 > i26 ? x10.positionForFieldNumber(i31, i27 / 3) : x10.positionForFieldNumber(i31);
            if (iPositionForFieldNumber == i24) {
                t11 = t13;
                unsafe = unsafe3;
                i11 = i30;
                i12 = iDecodeVarint322;
                i13 = i24;
                i14 = i31;
                i15 = 0;
            } else {
                int i33 = x10.buffer[iPositionForFieldNumber + 1];
                int iType = type(i33);
                i11 = i30;
                int i34 = iPositionForFieldNumber;
                long jOffset = offset(i33);
                if (iType <= 17) {
                    int i35 = x10.buffer[i34 + 2];
                    int i36 = 1 << (i35 >>> 20);
                    int i37 = i35 & 1048575;
                    if (i37 != i29) {
                        int i38 = 1048575;
                        if (i29 != 1048575) {
                            unsafe3.putInt(t13, i29, i28);
                            i37 = i37;
                            i38 = 1048575;
                        }
                        if (i37 != i38) {
                            i28 = unsafe3.getInt(t13, i37);
                        }
                        i29 = i37;
                    }
                    switch (iType) {
                        case 0:
                            byte[] bArr5 = bArr4;
                            i16 = iDecodeVarint322;
                            i17 = i34;
                            if (i32 != 1) {
                                unsafe = unsafe3;
                                i12 = i16;
                                i15 = i17;
                                i14 = i31;
                                i13 = -1;
                                t11 = t13;
                                break;
                            } else {
                                y0.putDouble(t13, jOffset, C4022e.decodeDouble(bArr5, i16));
                                i25 = i16 + 8;
                                i28 |= i36;
                                i23 = i10;
                                i27 = i17;
                                i26 = i31;
                                bArr4 = bArr5;
                                i24 = -1;
                                bVar4 = bVar;
                                break;
                            }
                        case 1:
                            C4022e.b bVar5 = bVar4;
                            bArr2 = bArr4;
                            bVar2 = bVar5;
                            i16 = iDecodeVarint322;
                            i17 = i34;
                            if (i32 != 5) {
                                unsafe = unsafe3;
                                i12 = i16;
                                i15 = i17;
                                i14 = i31;
                                i13 = -1;
                                t11 = t13;
                                break;
                            } else {
                                y0.putFloat(t13, jOffset, C4022e.decodeFloat(bArr2, i16));
                                i25 = i16 + 4;
                                i28 |= i36;
                                byte[] bArr6 = bArr2;
                                bVar4 = bVar2;
                                bArr4 = bArr6;
                                i23 = i10;
                                i27 = i17;
                                i26 = i31;
                                i24 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            C4022e.b bVar6 = bVar4;
                            byte[] bArr7 = bArr4;
                            i16 = iDecodeVarint322;
                            i17 = i34;
                            if (i32 != 0) {
                                unsafe = unsafe3;
                                i12 = i16;
                                i15 = i17;
                                i14 = i31;
                                i13 = -1;
                                t11 = t13;
                                break;
                            } else {
                                int iDecodeVarint642 = C4022e.decodeVarint64(bArr7, i16, bVar6);
                                Unsafe unsafe4 = unsafe3;
                                T t14 = t13;
                                unsafe4.putLong(t14, jOffset, bVar6.long1);
                                unsafe3 = unsafe4;
                                t13 = t14;
                                i28 |= i36;
                                bVar4 = bVar6;
                                bArr4 = bArr7;
                                i25 = iDecodeVarint642;
                                i27 = i17;
                                i26 = i31;
                                i24 = -1;
                                i23 = i10;
                                break;
                            }
                        case 4:
                        case 11:
                            C4022e.b bVar7 = bVar4;
                            byte[] bArr8 = bArr4;
                            i16 = iDecodeVarint322;
                            i17 = i34;
                            if (i32 != 0) {
                                unsafe = unsafe3;
                                i12 = i16;
                                i15 = i17;
                                i14 = i31;
                                i13 = -1;
                                t11 = t13;
                                break;
                            } else {
                                iDecodeVarint32 = C4022e.decodeVarint32(bArr8, i16, bVar7);
                                unsafe3.putInt(t13, jOffset, bVar7.int1);
                                i28 |= i36;
                                bVar4 = bVar7;
                                bArr4 = bArr8;
                                i23 = i10;
                                i25 = iDecodeVarint32;
                                i27 = i17;
                                i26 = i31;
                                i24 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            byte[] bArr9 = bArr4;
                            T t15 = t13;
                            C4022e.b bVar8 = bVar4;
                            bArr2 = bArr9;
                            Unsafe unsafe5 = unsafe3;
                            int i39 = iDecodeVarint322;
                            i17 = i34;
                            if (i32 != 1) {
                                t13 = t15;
                                i16 = i39;
                                unsafe3 = unsafe5;
                                unsafe = unsafe3;
                                i12 = i16;
                                i15 = i17;
                                i14 = i31;
                                i13 = -1;
                                t11 = t13;
                                break;
                            } else {
                                bVar2 = bVar8;
                                unsafe5.putLong(t15, jOffset, C4022e.decodeFixed64(bArr2, i39));
                                unsafe3 = unsafe5;
                                t13 = t15;
                                i25 = i39 + 8;
                                i28 |= i36;
                                byte[] bArr62 = bArr2;
                                bVar4 = bVar2;
                                bArr4 = bArr62;
                                i23 = i10;
                                i27 = i17;
                                i26 = i31;
                                i24 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            byte[] bArr10 = bArr4;
                            t12 = t13;
                            C4022e.b bVar9 = bVar4;
                            unsafe2 = unsafe3;
                            i18 = iDecodeVarint322;
                            i17 = i34;
                            if (i32 != 5) {
                                Unsafe unsafe6 = unsafe2;
                                i16 = i18;
                                unsafe3 = unsafe6;
                                t13 = t12;
                                unsafe = unsafe3;
                                i12 = i16;
                                i15 = i17;
                                i14 = i31;
                                i13 = -1;
                                t11 = t13;
                                break;
                            } else {
                                unsafe2.putInt(t12, jOffset, C4022e.decodeFixed32(bArr10, i18));
                                i25 = i18 + 4;
                                i28 |= i36;
                                bVar4 = bVar9;
                                t13 = t12;
                                bArr4 = bArr10;
                                unsafe3 = unsafe2;
                                i27 = i17;
                                i26 = i31;
                                i24 = -1;
                                i23 = i10;
                                break;
                            }
                        case 7:
                            byte[] bArr11 = bArr4;
                            t12 = t13;
                            bVar3 = bVar4;
                            bArr3 = bArr11;
                            unsafe2 = unsafe3;
                            i18 = iDecodeVarint322;
                            i17 = i34;
                            if (i32 != 0) {
                                Unsafe unsafe62 = unsafe2;
                                i16 = i18;
                                unsafe3 = unsafe62;
                                t13 = t12;
                                unsafe = unsafe3;
                                i12 = i16;
                                i15 = i17;
                                i14 = i31;
                                i13 = -1;
                                t11 = t13;
                                break;
                            } else {
                                iDecodeVarint64 = C4022e.decodeVarint64(bArr3, i18, bVar3);
                                y0.putBoolean(t12, jOffset, bVar3.long1 != 0);
                                i28 |= i36;
                                byte[] bArr12 = bArr3;
                                bVar4 = bVar3;
                                t13 = t12;
                                bArr4 = bArr12;
                                i25 = iDecodeVarint64;
                                unsafe3 = unsafe2;
                                i27 = i17;
                                i26 = i31;
                                i24 = -1;
                                i23 = i10;
                                break;
                            }
                        case 8:
                            byte[] bArr13 = bArr4;
                            t12 = t13;
                            bVar3 = bVar4;
                            bArr3 = bArr13;
                            unsafe2 = unsafe3;
                            i18 = iDecodeVarint322;
                            i17 = i34;
                            if (i32 != 2) {
                                Unsafe unsafe622 = unsafe2;
                                i16 = i18;
                                unsafe3 = unsafe622;
                                t13 = t12;
                                unsafe = unsafe3;
                                i12 = i16;
                                i15 = i17;
                                i14 = i31;
                                i13 = -1;
                                t11 = t13;
                                break;
                            } else {
                                iDecodeVarint64 = (i33 & ENFORCE_UTF8_MASK) == 0 ? C4022e.decodeString(bArr3, i18, bVar3) : C4022e.decodeStringRequireUtf8(bArr3, i18, bVar3);
                                unsafe2.putObject(t12, jOffset, bVar3.object1);
                                i28 |= i36;
                                byte[] bArr122 = bArr3;
                                bVar4 = bVar3;
                                t13 = t12;
                                bArr4 = bArr122;
                                i25 = iDecodeVarint64;
                                unsafe3 = unsafe2;
                                i27 = i17;
                                i26 = i31;
                                i24 = -1;
                                i23 = i10;
                                break;
                            }
                        case 9:
                            i17 = i34;
                            if (i32 != 2) {
                                t13 = t13;
                                i16 = iDecodeVarint322;
                                unsafe = unsafe3;
                                i12 = i16;
                                i15 = i17;
                                i14 = i31;
                                i13 = -1;
                                t11 = t13;
                                break;
                            } else {
                                T t16 = t13;
                                Object objMutableMessageFieldForMerge = x10.mutableMessageFieldForMerge(t16, i17);
                                byte[] bArr14 = bArr4;
                                t12 = t16;
                                int i40 = i23;
                                unsafe2 = unsafe3;
                                int i41 = iDecodeVarint322;
                                C4022e.b bVar10 = bVar4;
                                iDecodeVarint64 = C4022e.mergeMessageField(objMutableMessageFieldForMerge, x10.getMessageFieldSchema(i17), bArr14, i41, i40, bVar10);
                                bArr3 = bArr14;
                                bVar3 = bVar10;
                                x10.storeMessageField(t12, i17, objMutableMessageFieldForMerge);
                                i28 |= i36;
                                byte[] bArr1222 = bArr3;
                                bVar4 = bVar3;
                                t13 = t12;
                                bArr4 = bArr1222;
                                i25 = iDecodeVarint64;
                                unsafe3 = unsafe2;
                                i27 = i17;
                                i26 = i31;
                                i24 = -1;
                                i23 = i10;
                                break;
                            }
                        case 10:
                            i17 = i34;
                            if (i32 != 2) {
                                i16 = iDecodeVarint322;
                                unsafe = unsafe3;
                                i12 = i16;
                                i15 = i17;
                                i14 = i31;
                                i13 = -1;
                                t11 = t13;
                                break;
                            } else {
                                iDecodeVarint32 = C4022e.decodeBytes(bArr4, iDecodeVarint322, bVar4);
                                unsafe3.putObject(t13, jOffset, bVar4.object1);
                                i28 |= i36;
                                i25 = iDecodeVarint32;
                                i27 = i17;
                                i26 = i31;
                                i24 = -1;
                                break;
                            }
                        case 12:
                            i17 = i34;
                            if (i32 != 0) {
                                i16 = iDecodeVarint322;
                                unsafe = unsafe3;
                                i12 = i16;
                                i15 = i17;
                                i14 = i31;
                                i13 = -1;
                                t11 = t13;
                                break;
                            } else {
                                iDecodeVarint32 = C4022e.decodeVarint32(bArr4, iDecodeVarint322, bVar4);
                                unsafe3.putInt(t13, jOffset, bVar4.int1);
                                i28 |= i36;
                                i25 = iDecodeVarint32;
                                i27 = i17;
                                i26 = i31;
                                i24 = -1;
                                break;
                            }
                        case 15:
                            i17 = i34;
                            if (i32 != 0) {
                                i16 = iDecodeVarint322;
                                unsafe = unsafe3;
                                i12 = i16;
                                i15 = i17;
                                i14 = i31;
                                i13 = -1;
                                t11 = t13;
                                break;
                            } else {
                                iDecodeVarint32 = C4022e.decodeVarint32(bArr4, iDecodeVarint322, bVar4);
                                unsafe3.putInt(t13, jOffset, AbstractC4027j.decodeZigZag32(bVar4.int1));
                                i28 |= i36;
                                i25 = iDecodeVarint32;
                                i27 = i17;
                                i26 = i31;
                                i24 = -1;
                                break;
                            }
                        case 16:
                            if (i32 != 0) {
                                i16 = iDecodeVarint322;
                                i17 = i34;
                                unsafe = unsafe3;
                                i12 = i16;
                                i15 = i17;
                                i14 = i31;
                                i13 = -1;
                                t11 = t13;
                                break;
                            } else {
                                int iDecodeVarint643 = C4022e.decodeVarint64(bArr4, iDecodeVarint322, bVar4);
                                Unsafe unsafe7 = unsafe3;
                                T t17 = t13;
                                unsafe7.putLong(t17, jOffset, AbstractC4027j.decodeZigZag64(bVar4.long1));
                                unsafe3 = unsafe7;
                                t13 = t17;
                                i28 |= i36;
                                i25 = iDecodeVarint643;
                                i26 = i31;
                                i27 = i34;
                                i24 = -1;
                                break;
                            }
                        default:
                            i16 = iDecodeVarint322;
                            i17 = i34;
                            unsafe = unsafe3;
                            i12 = i16;
                            i15 = i17;
                            i14 = i31;
                            i13 = -1;
                            t11 = t13;
                            break;
                    }
                } else {
                    int i42 = iDecodeVarint322;
                    byte[] bArr15 = bArr4;
                    if (iType != 27) {
                        Unsafe unsafe8 = unsafe3;
                        if (iType <= 49) {
                            i20 = i28;
                            unsafe = unsafe8;
                            i13 = -1;
                            i22 = i29;
                            int repeatedField = x10.parseRepeatedField(t10, bArr, i42, i10, i11, i31, i32, i34, i33, iType, jOffset, bVar);
                            i21 = i31;
                            i15 = i34;
                            if (repeatedField != i42) {
                                x10 = this;
                                t13 = t10;
                                i23 = i10;
                                bVar4 = bVar;
                                i25 = repeatedField;
                                i26 = i21;
                                i29 = i22;
                                i24 = -1;
                                i27 = i15;
                                i28 = i20;
                                unsafe3 = unsafe;
                                bArr4 = bArr;
                            } else {
                                t11 = t10;
                                i12 = repeatedField;
                                i14 = i21;
                            }
                        } else {
                            unsafe = unsafe8;
                            i20 = i28;
                            i15 = i34;
                            i13 = -1;
                            i22 = i29;
                            i21 = i31;
                            i19 = i42;
                            if (iType != 50) {
                                i14 = i21;
                                int oneofField = parseOneofField(t10, bArr, i19, i10, i11, i14, i32, i33, iType, jOffset, i15, bVar);
                                t11 = t10;
                                if (oneofField != i19) {
                                    x10 = this;
                                    bVar4 = bVar;
                                    i26 = i14;
                                    i25 = oneofField;
                                    t13 = t11;
                                    i29 = i22;
                                    i24 = -1;
                                    i27 = i15;
                                    i28 = i20;
                                    unsafe3 = unsafe;
                                    bArr4 = bArr;
                                    i23 = i10;
                                } else {
                                    i12 = oneofField;
                                }
                            } else if (i32 == 2) {
                                int mapField = parseMapField(t10, bArr, i19, i10, i15, jOffset, bVar);
                                if (mapField != i19) {
                                    x10 = this;
                                    t13 = t10;
                                    bArr4 = bArr;
                                    i23 = i10;
                                    bVar4 = bVar;
                                    i25 = mapField;
                                    i26 = i21;
                                    i29 = i22;
                                    i24 = -1;
                                    i27 = i15;
                                    i28 = i20;
                                    unsafe3 = unsafe;
                                } else {
                                    t11 = t10;
                                    i12 = mapField;
                                    i14 = i21;
                                }
                            } else {
                                t11 = t10;
                                i12 = i19;
                                i14 = i21;
                            }
                        }
                    } else if (i32 == 2) {
                        B.i iVarMutableCopyWithCapacity = (B.i) unsafe3.getObject(t13, jOffset);
                        if (!iVarMutableCopyWithCapacity.isModifiable()) {
                            int size = iVarMutableCopyWithCapacity.size();
                            iVarMutableCopyWithCapacity = iVarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                            unsafe3.putObject(t13, jOffset, iVarMutableCopyWithCapacity);
                        }
                        int iDecodeMessageList = C4022e.decodeMessageList(x10.getMessageFieldSchema(i34), i11, bArr15, i42, i10, iVarMutableCopyWithCapacity, bVar);
                        bArr4 = bArr;
                        bVar4 = bVar;
                        i25 = iDecodeMessageList;
                        unsafe3 = unsafe3;
                        i26 = i31;
                        i27 = i34;
                        i24 = -1;
                        t13 = t10;
                        i23 = i10;
                    } else {
                        i19 = i42;
                        unsafe = unsafe3;
                        i20 = i28;
                        i21 = i31;
                        i15 = i34;
                        i13 = -1;
                        i22 = i29;
                        t11 = t10;
                        i12 = i19;
                        i14 = i21;
                    }
                    i29 = i22;
                    i28 = i20;
                }
            }
            int iDecodeUnknownField = C4022e.decodeUnknownField(i11, bArr, i12, i10, getMutableUnknownFields(t11), bVar);
            bArr4 = bArr;
            bVar4 = bVar;
            i26 = i14;
            t13 = t11;
            i24 = i13;
            i27 = i15;
            unsafe3 = unsafe;
            i23 = i10;
            i25 = iDecodeUnknownField;
            x10 = this;
        }
        Unsafe unsafe9 = unsafe3;
        int i43 = i23;
        int i44 = i29;
        int i45 = i28;
        T t18 = t13;
        if (i44 != 1048575) {
            unsafe9.putInt(t18, i44, i45);
        }
        if (i25 == i43) {
            return i25;
        }
        throw C.parseFailure();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(T t10, byte[] bArr, int i, int i10, int i11, int i12, int i13, int i14, long j4, int i15, long j10, C4022e.b bVar) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        B.i iVarMutableCopyWithCapacity = (B.i) unsafe.getObject(t10, j10);
        if (!iVarMutableCopyWithCapacity.isModifiable()) {
            int size = iVarMutableCopyWithCapacity.size();
            iVarMutableCopyWithCapacity = iVarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j10, iVarMutableCopyWithCapacity);
        }
        B.i iVar = iVarMutableCopyWithCapacity;
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    return C4022e.decodePackedDoubleList(bArr, i, iVar, bVar);
                }
                if (i13 == 1) {
                    return C4022e.decodeDoubleList(i11, bArr, i, i10, iVar, bVar);
                }
                return i;
            case 19:
            case 36:
                if (i13 == 2) {
                    return C4022e.decodePackedFloatList(bArr, i, iVar, bVar);
                }
                if (i13 == 5) {
                    return C4022e.decodeFloatList(i11, bArr, i, i10, iVar, bVar);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 == 2) {
                    return C4022e.decodePackedVarint64List(bArr, i, iVar, bVar);
                }
                if (i13 == 0) {
                    return C4022e.decodeVarint64List(i11, bArr, i, i10, iVar, bVar);
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return C4022e.decodePackedVarint32List(bArr, i, iVar, bVar);
                }
                if (i13 == 0) {
                    return C4022e.decodeVarint32List(i11, bArr, i, i10, iVar, bVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    return C4022e.decodePackedFixed64List(bArr, i, iVar, bVar);
                }
                if (i13 == 1) {
                    return C4022e.decodeFixed64List(i11, bArr, i, i10, iVar, bVar);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    return C4022e.decodePackedFixed32List(bArr, i, iVar, bVar);
                }
                if (i13 == 5) {
                    return C4022e.decodeFixed32List(i11, bArr, i, i10, iVar, bVar);
                }
                return i;
            case 25:
            case 42:
                if (i13 == 2) {
                    return C4022e.decodePackedBoolList(bArr, i, iVar, bVar);
                }
                if (i13 == 0) {
                    return C4022e.decodeBoolList(i11, bArr, i, i10, iVar, bVar);
                }
                return i;
            case 26:
                if (i13 == 2) {
                    return (j4 & 536870912) == 0 ? C4022e.decodeStringList(i11, bArr, i, i10, iVar, bVar) : C4022e.decodeStringListRequireUtf8(i11, bArr, i, i10, iVar, bVar);
                }
                return i;
            case 27:
                if (i13 == 2) {
                    return C4022e.decodeMessageList(getMessageFieldSchema(i14), i11, bArr, i, i10, iVar, bVar);
                }
                return i;
            case 28:
                if (i13 == 2) {
                    return C4022e.decodeBytesList(i11, bArr, i, i10, iVar, bVar);
                }
                return i;
            case 30:
            case 44:
                if (i13 != 2) {
                    if (i13 == 0) {
                        iDecodeVarint32List = C4022e.decodeVarint32List(i11, bArr, i, i10, iVar, bVar);
                    }
                    return i;
                }
                iDecodeVarint32List = C4022e.decodePackedVarint32List(bArr, i, iVar, bVar);
                p0.filterUnknownEnumList((Object) t10, i12, (List<Integer>) iVar, getEnumFieldVerifier(i14), (Object) null, (u0<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i13 == 2) {
                    return C4022e.decodePackedSInt32List(bArr, i, iVar, bVar);
                }
                if (i13 == 0) {
                    return C4022e.decodeSInt32List(i11, bArr, i, i10, iVar, bVar);
                }
                return i;
            case 34:
            case 48:
                if (i13 == 2) {
                    return C4022e.decodePackedSInt64List(bArr, i, iVar, bVar);
                }
                if (i13 == 0) {
                    return C4022e.decodeSInt64List(i11, bArr, i, i10, iVar, bVar);
                }
                return i;
            case 49:
                if (i13 == 3) {
                    return C4022e.decodeGroupList(getMessageFieldSchema(i14), i11, bArr, i, i10, iVar, bVar);
                }
                return i;
            default:
                return i;
        }
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private <E> void readGroupList(Object obj, long j4, l0 l0Var, n0<E> n0Var, C4034q c4034q) throws IOException {
        l0Var.readGroupList(this.listFieldSchema.mutableListAt(obj, j4), n0Var, c4034q);
    }

    private <E> void readMessageList(Object obj, int i, l0 l0Var, n0<E> n0Var, C4034q c4034q) throws IOException {
        l0Var.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), n0Var, c4034q);
    }

    private void readString(Object obj, int i, l0 l0Var) throws IOException {
        if (isEnforceUtf8(i)) {
            y0.putObject(obj, offset(i), l0Var.readStringRequireUtf8());
        } else if (this.lite) {
            y0.putObject(obj, offset(i), l0Var.readString());
        } else {
            y0.putObject(obj, offset(i), l0Var.readBytes());
        }
    }

    private void readStringList(Object obj, int i, l0 l0Var) throws IOException {
        if (isEnforceUtf8(i)) {
            l0Var.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            l0Var.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
        }
    }

    private static Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbK = B8.k("Field ", str, " for ");
            sbK.append(cls.getName());
            sbK.append(" not found. Known fields are ");
            sbK.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbK.toString());
        }
    }

    private void setFieldPresent(T t10, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j4 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j4 == 1048575) {
            return;
        }
        y0.putInt(t10, j4, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | y0.getInt(t10, j4));
    }

    private void setOneofPresent(T t10, int i, int i10) {
        y0.putInt(t10, presenceMaskAndOffsetAt(i10) & 1048575, i);
    }

    private int slowPositionForFieldNumber(int i, int i10) {
        int length = (this.buffer.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int iNumberAt = numberAt(i12);
            if (i == iNumberAt) {
                return i12;
            }
            if (i < iNumberAt) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
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
    private static void storeFieldData(com.google.protobuf.C4037u r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            com.google.protobuf.d0 r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            com.google.protobuf.w r2 = r8.getType()
            int r2 = r2.id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = com.google.protobuf.y0.objectFieldOffset(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r4 = com.google.protobuf.y0.objectFieldOffset(r0)
        L22:
            int r0 = (int) r4
            r4 = r1
            goto L6c
        L25:
            com.google.protobuf.w r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = com.google.protobuf.y0.objectFieldOffset(r2)
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
            long r4 = com.google.protobuf.y0.objectFieldOffset(r0)
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
            long r4 = com.google.protobuf.y0.objectFieldOffset(r0)
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
            com.google.protobuf.B$e r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 + 1
            com.google.protobuf.B$e r8 = r8.getEnumVerifier()
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
            com.google.protobuf.B$e r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            com.google.protobuf.B$e r8 = r8.getEnumVerifier()
            r11[r10] = r8
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.X.storeFieldData(com.google.protobuf.u, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(T t10, int i, Object obj) {
        UNSAFE.putObject(t10, offset(typeAndOffsetAt(i)), obj);
        setFieldPresent(t10, i);
    }

    private void storeOneofMessageField(T t10, int i, int i10, Object obj) {
        UNSAFE.putObject(t10, offset(typeAndOffsetAt(i10)), obj);
        setOneofPresent(t10, i, i10);
    }

    private static int type(int i) {
        return (i & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto2(T r19, com.google.protobuf.B0 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.X.writeFieldsInAscendingOrderProto2(java.lang.Object, com.google.protobuf.B0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto3(T r13, com.google.protobuf.B0 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.X.writeFieldsInAscendingOrderProto3(java.lang.Object, com.google.protobuf.B0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInDescendingOrder(T r11, com.google.protobuf.B0 r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.X.writeFieldsInDescendingOrder(java.lang.Object, com.google.protobuf.B0):void");
    }

    private <K, V> void writeMapHelper(B0 b02, int i, Object obj, int i10) throws IOException {
        if (obj != null) {
            b02.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i10)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i, Object obj, B0 b02) throws IOException {
        if (obj instanceof String) {
            b02.writeString(i, (String) obj);
        } else {
            b02.writeBytes(i, (AbstractC4026i) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(u0<UT, UB> u0Var, T t10, B0 b02) throws IOException {
        u0Var.writeTo(u0Var.getFromMessage(t10), b02);
    }

    @Override // com.google.protobuf.n0
    public boolean equals(T t10, T t11) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(t10, t11, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t10).equals(this.unknownFieldSchema.getFromMessage(t11))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t10).equals(this.extensionSchema.getExtensions(t11));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    @Override // com.google.protobuf.n0
    public int getSerializedSize(T t10) {
        return this.proto3 ? getSerializedSizeProto3(t10) : getSerializedSizeProto2(t10);
    }

    @Override // com.google.protobuf.n0
    public int hashCode(T t10) {
        int i;
        int iHashLong;
        int i10;
        int iOneofIntAt;
        int length = this.buffer.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i12);
            int iNumberAt = numberAt(i12);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i = i11 * 53;
                    iHashLong = B.hashLong(Double.doubleToLongBits(y0.getDouble(t10, jOffset)));
                    i11 = iHashLong + i;
                    break;
                case 1:
                    i = i11 * 53;
                    iHashLong = Float.floatToIntBits(y0.getFloat(t10, jOffset));
                    i11 = iHashLong + i;
                    break;
                case 2:
                    i = i11 * 53;
                    iHashLong = B.hashLong(y0.getLong(t10, jOffset));
                    i11 = iHashLong + i;
                    break;
                case 3:
                    i = i11 * 53;
                    iHashLong = B.hashLong(y0.getLong(t10, jOffset));
                    i11 = iHashLong + i;
                    break;
                case 4:
                    i = i11 * 53;
                    iHashLong = y0.getInt(t10, jOffset);
                    i11 = iHashLong + i;
                    break;
                case 5:
                    i = i11 * 53;
                    iHashLong = B.hashLong(y0.getLong(t10, jOffset));
                    i11 = iHashLong + i;
                    break;
                case 6:
                    i = i11 * 53;
                    iHashLong = y0.getInt(t10, jOffset);
                    i11 = iHashLong + i;
                    break;
                case 7:
                    i = i11 * 53;
                    iHashLong = B.hashBoolean(y0.getBoolean(t10, jOffset));
                    i11 = iHashLong + i;
                    break;
                case 8:
                    i = i11 * 53;
                    iHashLong = ((String) y0.getObject(t10, jOffset)).hashCode();
                    i11 = iHashLong + i;
                    break;
                case 9:
                    Object object = y0.getObject(t10, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i = i11 * 53;
                    iHashLong = y0.getObject(t10, jOffset).hashCode();
                    i11 = iHashLong + i;
                    break;
                case 11:
                    i = i11 * 53;
                    iHashLong = y0.getInt(t10, jOffset);
                    i11 = iHashLong + i;
                    break;
                case 12:
                    i = i11 * 53;
                    iHashLong = y0.getInt(t10, jOffset);
                    i11 = iHashLong + i;
                    break;
                case 13:
                    i = i11 * 53;
                    iHashLong = y0.getInt(t10, jOffset);
                    i11 = iHashLong + i;
                    break;
                case 14:
                    i = i11 * 53;
                    iHashLong = B.hashLong(y0.getLong(t10, jOffset));
                    i11 = iHashLong + i;
                    break;
                case 15:
                    i = i11 * 53;
                    iHashLong = y0.getInt(t10, jOffset);
                    i11 = iHashLong + i;
                    break;
                case 16:
                    i = i11 * 53;
                    iHashLong = B.hashLong(y0.getLong(t10, jOffset));
                    i11 = iHashLong + i;
                    break;
                case 17:
                    Object object2 = y0.getObject(t10, jOffset);
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
                    i = i11 * 53;
                    iHashLong = y0.getObject(t10, jOffset).hashCode();
                    i11 = iHashLong + i;
                    break;
                case 50:
                    i = i11 * 53;
                    iHashLong = y0.getObject(t10, jOffset).hashCode();
                    i11 = iHashLong + i;
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i = i11 * 53;
                        iHashLong = B.hashLong(Double.doubleToLongBits(oneofDoubleAt(t10, jOffset)));
                        i11 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i = i11 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t10, jOffset));
                        i11 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i = i11 * 53;
                        iHashLong = B.hashLong(oneofLongAt(t10, jOffset));
                        i11 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i = i11 * 53;
                        iHashLong = B.hashLong(oneofLongAt(t10, jOffset));
                        i11 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iOneofIntAt = oneofIntAt(t10, jOffset);
                        i11 = i10 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i = i11 * 53;
                        iHashLong = B.hashLong(oneofLongAt(t10, jOffset));
                        i11 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iOneofIntAt = oneofIntAt(t10, jOffset);
                        i11 = i10 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i = i11 * 53;
                        iHashLong = B.hashBoolean(oneofBooleanAt(t10, jOffset));
                        i11 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i = i11 * 53;
                        iHashLong = ((String) y0.getObject(t10, jOffset)).hashCode();
                        i11 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i = i11 * 53;
                        iHashLong = y0.getObject(t10, jOffset).hashCode();
                        i11 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i = i11 * 53;
                        iHashLong = y0.getObject(t10, jOffset).hashCode();
                        i11 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iOneofIntAt = oneofIntAt(t10, jOffset);
                        i11 = i10 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iOneofIntAt = oneofIntAt(t10, jOffset);
                        i11 = i10 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iOneofIntAt = oneofIntAt(t10, jOffset);
                        i11 = i10 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i = i11 * 53;
                        iHashLong = B.hashLong(oneofLongAt(t10, jOffset));
                        i11 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iOneofIntAt = oneofIntAt(t10, jOffset);
                        i11 = i10 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i = i11 * 53;
                        iHashLong = B.hashLong(oneofLongAt(t10, jOffset));
                        i11 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i = i11 * 53;
                        iHashLong = y0.getObject(t10, jOffset).hashCode();
                        i11 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.unknownFieldSchema.getFromMessage(t10).hashCode() + (i11 * 53);
        if (!this.hasExtensions) {
            return iHashCode2;
        }
        return this.extensionSchema.getExtensions(t10).hashCode() + (iHashCode2 * 53);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    @Override // com.google.protobuf.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isInitialized(T r15) {
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
            sun.misc.Unsafe r3 = com.google.protobuf.X.UNSAFE
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
            com.google.protobuf.n0 r15 = r14.getMessageFieldSchema(r9)
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
            com.google.protobuf.n0 r15 = r14.getMessageFieldSchema(r9)
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
            com.google.protobuf.r<?> r15 = r7.extensionSchema
            com.google.protobuf.v r15 = r15.getExtensions(r8)
            boolean r15 = r15.isInitialized()
            if (r15 != 0) goto Lae
            return r1
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.X.isInitialized(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    @Override // com.google.protobuf.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void makeImmutable(T r8) {
        /*
            r7 = this;
            boolean r0 = isMutable(r8)
            if (r0 != 0) goto L7
            goto L6d
        L7:
            boolean r0 = r8 instanceof com.google.protobuf.AbstractC4042z
            if (r0 == 0) goto L17
            r0 = r8
            com.google.protobuf.z r0 = (com.google.protobuf.AbstractC4042z) r0
            r0.clearMemoizedSerializedSize()
            r0.clearMemoizedHashCode()
            r0.markImmutable()
        L17:
            int[] r0 = r7.buffer
            int r0 = r0.length
            r1 = 0
        L1b:
            if (r1 >= r0) goto L5f
            int r2 = r7.typeAndOffsetAt(r1)
            long r3 = offset(r2)
            int r2 = type(r2)
            r5 = 9
            if (r2 == r5) goto L49
            switch(r2) {
                case 17: goto L49;
                case 18: goto L43;
                case 19: goto L43;
                case 20: goto L43;
                case 21: goto L43;
                case 22: goto L43;
                case 23: goto L43;
                case 24: goto L43;
                case 25: goto L43;
                case 26: goto L43;
                case 27: goto L43;
                case 28: goto L43;
                case 29: goto L43;
                case 30: goto L43;
                case 31: goto L43;
                case 32: goto L43;
                case 33: goto L43;
                case 34: goto L43;
                case 35: goto L43;
                case 36: goto L43;
                case 37: goto L43;
                case 38: goto L43;
                case 39: goto L43;
                case 40: goto L43;
                case 41: goto L43;
                case 42: goto L43;
                case 43: goto L43;
                case 44: goto L43;
                case 45: goto L43;
                case 46: goto L43;
                case 47: goto L43;
                case 48: goto L43;
                case 49: goto L43;
                case 50: goto L31;
                default: goto L30;
            }
        L30:
            goto L5c
        L31:
            sun.misc.Unsafe r2 = com.google.protobuf.X.UNSAFE
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L5c
            com.google.protobuf.O r6 = r7.mapFieldSchema
            java.lang.Object r5 = r6.toImmutable(r5)
            r2.putObject(r8, r3, r5)
            goto L5c
        L43:
            com.google.protobuf.J r2 = r7.listFieldSchema
            r2.makeImmutableListAt(r8, r3)
            goto L5c
        L49:
            boolean r2 = r7.isFieldPresent(r8, r1)
            if (r2 == 0) goto L5c
            com.google.protobuf.n0 r2 = r7.getMessageFieldSchema(r1)
            sun.misc.Unsafe r5 = com.google.protobuf.X.UNSAFE
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.makeImmutable(r3)
        L5c:
            int r1 = r1 + 3
            goto L1b
        L5f:
            com.google.protobuf.u0<?, ?> r0 = r7.unknownFieldSchema
            r0.makeImmutable(r8)
            boolean r0 = r7.hasExtensions
            if (r0 == 0) goto L6d
            com.google.protobuf.r<?> r0 = r7.extensionSchema
            r0.makeImmutable(r8)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.X.makeImmutable(java.lang.Object):void");
    }

    @Override // com.google.protobuf.n0
    public void mergeFrom(T t10, T t11) {
        checkMutable(t10);
        t11.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(t10, t11, i);
        }
        p0.mergeUnknownFields(this.unknownFieldSchema, t10, t11);
        if (this.hasExtensions) {
            p0.mergeExtensions(this.extensionSchema, t10, t11);
        }
    }

    @Override // com.google.protobuf.n0
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0094. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x041c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int parseProto2Message(T r26, byte[] r27, int r28, int r29, int r30, com.google.protobuf.C4022e.b r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.X.parseProto2Message(java.lang.Object, byte[], int, int, int, com.google.protobuf.e$b):int");
    }

    @Override // com.google.protobuf.n0
    public void writeTo(T t10, B0 b02) throws IOException {
        if (b02.fieldOrder() == B0.a.DESCENDING) {
            writeFieldsInDescendingOrder(t10, b02);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(t10, b02);
        } else {
            writeFieldsInAscendingOrderProto2(t10, b02);
        }
    }

    private boolean isFieldPresent(T t10, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j4 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j4 != 1048575) {
            return (y0.getInt(t10, j4) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(y0.getDouble(t10, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(y0.getFloat(t10, jOffset)) != 0;
            case 2:
                return y0.getLong(t10, jOffset) != 0;
            case 3:
                return y0.getLong(t10, jOffset) != 0;
            case 4:
                return y0.getInt(t10, jOffset) != 0;
            case 5:
                return y0.getLong(t10, jOffset) != 0;
            case 6:
                return y0.getInt(t10, jOffset) != 0;
            case 7:
                return y0.getBoolean(t10, jOffset);
            case 8:
                Object object = y0.getObject(t10, jOffset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof AbstractC4026i) {
                    return !AbstractC4026i.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return y0.getObject(t10, jOffset) != null;
            case 10:
                return !AbstractC4026i.EMPTY.equals(y0.getObject(t10, jOffset));
            case 11:
                return y0.getInt(t10, jOffset) != 0;
            case 12:
                return y0.getInt(t10, jOffset) != 0;
            case 13:
                return y0.getInt(t10, jOffset) != 0;
            case 14:
                return y0.getLong(t10, jOffset) != 0;
            case 15:
                return y0.getInt(t10, jOffset) != 0;
            case 16:
                return y0.getLong(t10, jOffset) != 0;
            case 17:
                return y0.getObject(t10, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i, int i10) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, i10);
    }

    @Override // com.google.protobuf.n0
    public void mergeFrom(T t10, l0 l0Var, C4034q c4034q) throws IOException {
        c4034q.getClass();
        checkMutable(t10);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t10, l0Var, c4034q);
    }

    private boolean equals(T t10, T t11, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (!arePresentForEquals(t10, t11, i) || Double.doubleToLongBits(y0.getDouble(t10, jOffset)) != Double.doubleToLongBits(y0.getDouble(t11, jOffset))) {
                }
                break;
            case 1:
                if (!arePresentForEquals(t10, t11, i) || Float.floatToIntBits(y0.getFloat(t10, jOffset)) != Float.floatToIntBits(y0.getFloat(t11, jOffset))) {
                }
                break;
            case 2:
                if (!arePresentForEquals(t10, t11, i) || y0.getLong(t10, jOffset) != y0.getLong(t11, jOffset)) {
                }
                break;
            case 3:
                if (!arePresentForEquals(t10, t11, i) || y0.getLong(t10, jOffset) != y0.getLong(t11, jOffset)) {
                }
                break;
            case 4:
                if (!arePresentForEquals(t10, t11, i) || y0.getInt(t10, jOffset) != y0.getInt(t11, jOffset)) {
                }
                break;
            case 5:
                if (!arePresentForEquals(t10, t11, i) || y0.getLong(t10, jOffset) != y0.getLong(t11, jOffset)) {
                }
                break;
            case 6:
                if (!arePresentForEquals(t10, t11, i) || y0.getInt(t10, jOffset) != y0.getInt(t11, jOffset)) {
                }
                break;
            case 7:
                if (!arePresentForEquals(t10, t11, i) || y0.getBoolean(t10, jOffset) != y0.getBoolean(t11, jOffset)) {
                }
                break;
            case 8:
                if (!arePresentForEquals(t10, t11, i) || !p0.safeEquals(y0.getObject(t10, jOffset), y0.getObject(t11, jOffset))) {
                }
                break;
            case 9:
                if (!arePresentForEquals(t10, t11, i) || !p0.safeEquals(y0.getObject(t10, jOffset), y0.getObject(t11, jOffset))) {
                }
                break;
            case 10:
                if (!arePresentForEquals(t10, t11, i) || !p0.safeEquals(y0.getObject(t10, jOffset), y0.getObject(t11, jOffset))) {
                }
                break;
            case 11:
                if (!arePresentForEquals(t10, t11, i) || y0.getInt(t10, jOffset) != y0.getInt(t11, jOffset)) {
                }
                break;
            case 12:
                if (!arePresentForEquals(t10, t11, i) || y0.getInt(t10, jOffset) != y0.getInt(t11, jOffset)) {
                }
                break;
            case 13:
                if (!arePresentForEquals(t10, t11, i) || y0.getInt(t10, jOffset) != y0.getInt(t11, jOffset)) {
                }
                break;
            case 14:
                if (!arePresentForEquals(t10, t11, i) || y0.getLong(t10, jOffset) != y0.getLong(t11, jOffset)) {
                }
                break;
            case 15:
                if (!arePresentForEquals(t10, t11, i) || y0.getInt(t10, jOffset) != y0.getInt(t11, jOffset)) {
                }
                break;
            case 16:
                if (!arePresentForEquals(t10, t11, i) || y0.getLong(t10, jOffset) != y0.getLong(t11, jOffset)) {
                }
                break;
            case 17:
                if (!arePresentForEquals(t10, t11, i) || !p0.safeEquals(y0.getObject(t10, jOffset), y0.getObject(t11, jOffset))) {
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
                if (!isOneofCaseEqual(t10, t11, i) || !p0.safeEquals(y0.getObject(t10, jOffset), y0.getObject(t11, jOffset))) {
                }
                break;
        }
        return true;
    }

    @Override // com.google.protobuf.n0
    public void mergeFrom(T t10, byte[] bArr, int i, int i10, C4022e.b bVar) throws IOException {
        if (this.proto3) {
            parseProto3Message(t10, bArr, i, i10, bVar);
        } else {
            parseProto2Message(t10, bArr, i, i10, 0, bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i, n0 n0Var) {
        return n0Var.isInitialized(y0.getObject(obj, offset(i)));
    }
}
