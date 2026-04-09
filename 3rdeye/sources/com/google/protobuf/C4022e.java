package com.google.protobuf;

import com.google.protobuf.A0;
import com.google.protobuf.AbstractC4042z;
import com.google.protobuf.B;
import java.io.IOException;
import java.util.List;

/* compiled from: ArrayDecoders.java */
/* renamed from: com.google.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4022e {

    /* compiled from: ArrayDecoders.java */
    /* renamed from: com.google.protobuf.e$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[A0.b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[A0.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private C4022e() {
    }

    public static int decodeBoolList(int i, byte[] bArr, int i10, int i11, B.i<?> iVar, b bVar) {
        C4023f c4023f = (C4023f) iVar;
        int iDecodeVarint64 = decodeVarint64(bArr, i10, bVar);
        c4023f.addBoolean(bVar.long1 != 0);
        while (iDecodeVarint64 < i11) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, bVar);
            if (i != bVar.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, bVar);
            c4023f.addBoolean(bVar.long1 != 0);
        }
        return iDecodeVarint64;
    }

    public static int decodeBytes(byte[] bArr, int i, b bVar) throws C {
        int iDecodeVarint32 = decodeVarint32(bArr, i, bVar);
        int i10 = bVar.int1;
        if (i10 < 0) {
            throw C.negativeSize();
        }
        if (i10 > bArr.length - iDecodeVarint32) {
            throw C.truncatedMessage();
        }
        if (i10 == 0) {
            bVar.object1 = AbstractC4026i.EMPTY;
            return iDecodeVarint32;
        }
        bVar.object1 = AbstractC4026i.copyFrom(bArr, iDecodeVarint32, i10);
        return iDecodeVarint32 + i10;
    }

    public static int decodeBytesList(int i, byte[] bArr, int i10, int i11, B.i<?> iVar, b bVar) throws C {
        int iDecodeVarint32 = decodeVarint32(bArr, i10, bVar);
        int i12 = bVar.int1;
        if (i12 < 0) {
            throw C.negativeSize();
        }
        if (i12 > bArr.length - iDecodeVarint32) {
            throw C.truncatedMessage();
        }
        if (i12 == 0) {
            iVar.add(AbstractC4026i.EMPTY);
        } else {
            iVar.add(AbstractC4026i.copyFrom(bArr, iDecodeVarint32, i12));
            iDecodeVarint32 += i12;
        }
        while (iDecodeVarint32 < i11) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, bVar);
            if (i != bVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, bVar);
            int i13 = bVar.int1;
            if (i13 < 0) {
                throw C.negativeSize();
            }
            if (i13 > bArr.length - iDecodeVarint32) {
                throw C.truncatedMessage();
            }
            if (i13 == 0) {
                iVar.add(AbstractC4026i.EMPTY);
            } else {
                iVar.add(AbstractC4026i.copyFrom(bArr, iDecodeVarint32, i13));
                iDecodeVarint32 += i13;
            }
        }
        return iDecodeVarint32;
    }

    public static double decodeDouble(byte[] bArr, int i) {
        return Double.longBitsToDouble(decodeFixed64(bArr, i));
    }

    public static int decodeDoubleList(int i, byte[] bArr, int i10, int i11, B.i<?> iVar, b bVar) {
        C4031n c4031n = (C4031n) iVar;
        c4031n.addDouble(decodeDouble(bArr, i10));
        int i12 = i10 + 8;
        while (i12 < i11) {
            int iDecodeVarint32 = decodeVarint32(bArr, i12, bVar);
            if (i != bVar.int1) {
                break;
            }
            c4031n.addDouble(decodeDouble(bArr, iDecodeVarint32));
            i12 = iDecodeVarint32 + 8;
        }
        return i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int decodeExtension(int i, byte[] bArr, int i10, int i11, AbstractC4042z.d<?, ?> dVar, AbstractC4042z.g<?, ?> gVar, u0<v0, v0> u0Var, b bVar) throws IOException {
        int i12;
        int i13;
        C4038v<AbstractC4042z.f> c4038v = dVar.extensions;
        int i14 = i >>> 3;
        if (gVar.descriptor.isRepeated() && gVar.descriptor.isPacked()) {
            switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[gVar.getLiteType().ordinal()]) {
                case 1:
                    C4031n c4031n = new C4031n();
                    int iDecodePackedDoubleList = decodePackedDoubleList(bArr, i10, c4031n, bVar);
                    c4038v.setField(gVar.descriptor, c4031n);
                    return iDecodePackedDoubleList;
                case 2:
                    C4040x c4040x = new C4040x();
                    int iDecodePackedFloatList = decodePackedFloatList(bArr, i10, c4040x, bVar);
                    c4038v.setField(gVar.descriptor, c4040x);
                    return iDecodePackedFloatList;
                case 3:
                case 4:
                    K k10 = new K();
                    int iDecodePackedVarint64List = decodePackedVarint64List(bArr, i10, k10, bVar);
                    c4038v.setField(gVar.descriptor, k10);
                    return iDecodePackedVarint64List;
                case 5:
                case 6:
                    A a10 = new A();
                    int iDecodePackedVarint32List = decodePackedVarint32List(bArr, i10, a10, bVar);
                    c4038v.setField(gVar.descriptor, a10);
                    return iDecodePackedVarint32List;
                case 7:
                case 8:
                    K k11 = new K();
                    int iDecodePackedFixed64List = decodePackedFixed64List(bArr, i10, k11, bVar);
                    c4038v.setField(gVar.descriptor, k11);
                    return iDecodePackedFixed64List;
                case 9:
                case 10:
                    A a11 = new A();
                    int iDecodePackedFixed32List = decodePackedFixed32List(bArr, i10, a11, bVar);
                    c4038v.setField(gVar.descriptor, a11);
                    return iDecodePackedFixed32List;
                case 11:
                    C4023f c4023f = new C4023f();
                    int iDecodePackedBoolList = decodePackedBoolList(bArr, i10, c4023f, bVar);
                    c4038v.setField(gVar.descriptor, c4023f);
                    return iDecodePackedBoolList;
                case 12:
                    A a12 = new A();
                    int iDecodePackedSInt32List = decodePackedSInt32List(bArr, i10, a12, bVar);
                    c4038v.setField(gVar.descriptor, a12);
                    return iDecodePackedSInt32List;
                case 13:
                    K k12 = new K();
                    int iDecodePackedSInt64List = decodePackedSInt64List(bArr, i10, k12, bVar);
                    c4038v.setField(gVar.descriptor, k12);
                    return iDecodePackedSInt64List;
                case 14:
                    A a13 = new A();
                    int iDecodePackedVarint32List2 = decodePackedVarint32List(bArr, i10, a13, bVar);
                    p0.filterUnknownEnumList((Object) dVar, i14, (List<Integer>) a13, gVar.descriptor.getEnumType(), (Object) null, (u0<UT, Object>) u0Var);
                    c4038v.setField(gVar.descriptor, a13);
                    return iDecodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + gVar.descriptor.getLiteType());
            }
        }
        Object objValueOf = null;
        if (gVar.getLiteType() == A0.b.ENUM) {
            i10 = decodeVarint32(bArr, i10, bVar);
            if (gVar.descriptor.getEnumType().findValueByNumber(bVar.int1) == null) {
                p0.storeUnknownEnum(dVar, i14, bVar.int1, null, u0Var);
                return i10;
            }
            objValueOf = Integer.valueOf(bVar.int1);
        } else {
            switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[gVar.getLiteType().ordinal()]) {
                case 1:
                    i12 = i10;
                    objValueOf = Double.valueOf(decodeDouble(bArr, i12));
                    i10 = i12 + 8;
                    break;
                case 2:
                    i13 = i10;
                    objValueOf = Float.valueOf(decodeFloat(bArr, i13));
                    i10 = i13 + 4;
                    break;
                case 3:
                case 4:
                    i10 = decodeVarint64(bArr, i10, bVar);
                    objValueOf = Long.valueOf(bVar.long1);
                    break;
                case 5:
                case 6:
                    i10 = decodeVarint32(bArr, i10, bVar);
                    objValueOf = Integer.valueOf(bVar.int1);
                    break;
                case 7:
                case 8:
                    i12 = i10;
                    objValueOf = Long.valueOf(decodeFixed64(bArr, i12));
                    i10 = i12 + 8;
                    break;
                case 9:
                case 10:
                    i13 = i10;
                    objValueOf = Integer.valueOf(decodeFixed32(bArr, i13));
                    i10 = i13 + 4;
                    break;
                case 11:
                    i10 = decodeVarint64(bArr, i10, bVar);
                    objValueOf = Boolean.valueOf(bVar.long1 != 0);
                    break;
                case 12:
                    i10 = decodeVarint32(bArr, i10, bVar);
                    objValueOf = Integer.valueOf(AbstractC4027j.decodeZigZag32(bVar.int1));
                    break;
                case 13:
                    i10 = decodeVarint64(bArr, i10, bVar);
                    objValueOf = Long.valueOf(AbstractC4027j.decodeZigZag64(bVar.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i10 = decodeBytes(bArr, i10, bVar);
                    objValueOf = bVar.object1;
                    break;
                case 16:
                    i10 = decodeString(bArr, i10, bVar);
                    objValueOf = bVar.object1;
                    break;
                case 17:
                    int i15 = (i14 << 3) | 4;
                    n0 n0VarSchemaFor = h0.getInstance().schemaFor((Class) gVar.getMessageDefaultInstance().getClass());
                    if (gVar.isRepeated()) {
                        int iDecodeGroupField = decodeGroupField(n0VarSchemaFor, bArr, i10, i11, i15, bVar);
                        c4038v.addRepeatedField(gVar.descriptor, bVar.object1);
                        return iDecodeGroupField;
                    }
                    Object field = c4038v.getField(gVar.descriptor);
                    if (field == null) {
                        field = n0VarSchemaFor.newInstance();
                        c4038v.setField(gVar.descriptor, field);
                    }
                    return mergeGroupField(field, n0VarSchemaFor, bArr, i10, i11, i15, bVar);
                case 18:
                    n0 n0VarSchemaFor2 = h0.getInstance().schemaFor((Class) gVar.getMessageDefaultInstance().getClass());
                    if (gVar.isRepeated()) {
                        int iDecodeMessageField = decodeMessageField(n0VarSchemaFor2, bArr, i10, i11, bVar);
                        c4038v.addRepeatedField(gVar.descriptor, bVar.object1);
                        return iDecodeMessageField;
                    }
                    Object field2 = c4038v.getField(gVar.descriptor);
                    if (field2 == null) {
                        field2 = n0VarSchemaFor2.newInstance();
                        c4038v.setField(gVar.descriptor, field2);
                    }
                    return mergeMessageField(field2, n0VarSchemaFor2, bArr, i10, i11, bVar);
            }
        }
        if (gVar.isRepeated()) {
            c4038v.addRepeatedField(gVar.descriptor, objValueOf);
            return i10;
        }
        c4038v.setField(gVar.descriptor, objValueOf);
        return i10;
    }

    public static int decodeExtensionOrUnknownField(int i, byte[] bArr, int i10, int i11, Object obj, U u8, u0<v0, v0> u0Var, b bVar) throws IOException {
        AbstractC4042z.g gVarFindLiteExtensionByNumber = bVar.extensionRegistry.findLiteExtensionByNumber(u8, i >>> 3);
        if (gVarFindLiteExtensionByNumber == null) {
            return decodeUnknownField(i, bArr, i10, i11, X.getMutableUnknownFields(obj), bVar);
        }
        AbstractC4042z.d dVar = (AbstractC4042z.d) obj;
        dVar.ensureExtensionsAreMutable();
        return decodeExtension(i, bArr, i10, i11, dVar, gVarFindLiteExtensionByNumber, u0Var, bVar);
    }

    public static int decodeFixed32(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int decodeFixed32List(int i, byte[] bArr, int i10, int i11, B.i<?> iVar, b bVar) {
        A a10 = (A) iVar;
        a10.addInt(decodeFixed32(bArr, i10));
        int i12 = i10 + 4;
        while (i12 < i11) {
            int iDecodeVarint32 = decodeVarint32(bArr, i12, bVar);
            if (i != bVar.int1) {
                break;
            }
            a10.addInt(decodeFixed32(bArr, iDecodeVarint32));
            i12 = iDecodeVarint32 + 4;
        }
        return i12;
    }

    public static long decodeFixed64(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int decodeFixed64List(int i, byte[] bArr, int i10, int i11, B.i<?> iVar, b bVar) {
        K k10 = (K) iVar;
        k10.addLong(decodeFixed64(bArr, i10));
        int i12 = i10 + 8;
        while (i12 < i11) {
            int iDecodeVarint32 = decodeVarint32(bArr, i12, bVar);
            if (i != bVar.int1) {
                break;
            }
            k10.addLong(decodeFixed64(bArr, iDecodeVarint32));
            i12 = iDecodeVarint32 + 8;
        }
        return i12;
    }

    public static float decodeFloat(byte[] bArr, int i) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i));
    }

    public static int decodeFloatList(int i, byte[] bArr, int i10, int i11, B.i<?> iVar, b bVar) {
        C4040x c4040x = (C4040x) iVar;
        c4040x.addFloat(decodeFloat(bArr, i10));
        int i12 = i10 + 4;
        while (i12 < i11) {
            int iDecodeVarint32 = decodeVarint32(bArr, i12, bVar);
            if (i != bVar.int1) {
                break;
            }
            c4040x.addFloat(decodeFloat(bArr, iDecodeVarint32));
            i12 = iDecodeVarint32 + 4;
        }
        return i12;
    }

    public static int decodeGroupField(n0 n0Var, byte[] bArr, int i, int i10, int i11, b bVar) throws IOException {
        Object objNewInstance = n0Var.newInstance();
        int iMergeGroupField = mergeGroupField(objNewInstance, n0Var, bArr, i, i10, i11, bVar);
        n0Var.makeImmutable(objNewInstance);
        bVar.object1 = objNewInstance;
        return iMergeGroupField;
    }

    public static int decodeGroupList(n0 n0Var, int i, byte[] bArr, int i10, int i11, B.i<?> iVar, b bVar) throws IOException {
        int i12 = (i & (-8)) | 4;
        int iDecodeGroupField = decodeGroupField(n0Var, bArr, i10, i11, i12, bVar);
        iVar.add(bVar.object1);
        while (iDecodeGroupField < i11) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeGroupField, bVar);
            if (i != bVar.int1) {
                break;
            }
            iDecodeGroupField = decodeGroupField(n0Var, bArr, iDecodeVarint32, i11, i12, bVar);
            iVar.add(bVar.object1);
        }
        return iDecodeGroupField;
    }

    public static int decodeMessageField(n0 n0Var, byte[] bArr, int i, int i10, b bVar) throws IOException {
        Object objNewInstance = n0Var.newInstance();
        int iMergeMessageField = mergeMessageField(objNewInstance, n0Var, bArr, i, i10, bVar);
        n0Var.makeImmutable(objNewInstance);
        bVar.object1 = objNewInstance;
        return iMergeMessageField;
    }

    public static int decodeMessageList(n0<?> n0Var, int i, byte[] bArr, int i10, int i11, B.i<?> iVar, b bVar) throws IOException {
        int iDecodeMessageField = decodeMessageField(n0Var, bArr, i10, i11, bVar);
        iVar.add(bVar.object1);
        while (iDecodeMessageField < i11) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeMessageField, bVar);
            if (i != bVar.int1) {
                break;
            }
            iDecodeMessageField = decodeMessageField(n0Var, bArr, iDecodeVarint32, i11, bVar);
            iVar.add(bVar.object1);
        }
        return iDecodeMessageField;
    }

    public static int decodePackedBoolList(byte[] bArr, int i, B.i<?> iVar, b bVar) throws IOException {
        C4023f c4023f = (C4023f) iVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, bVar);
        int i10 = bVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i10) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, bVar);
            c4023f.addBoolean(bVar.long1 != 0);
        }
        if (iDecodeVarint32 == i10) {
            return iDecodeVarint32;
        }
        throw C.truncatedMessage();
    }

    public static int decodePackedDoubleList(byte[] bArr, int i, B.i<?> iVar, b bVar) throws IOException {
        C4031n c4031n = (C4031n) iVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, bVar);
        int i10 = bVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i10) {
            c4031n.addDouble(decodeDouble(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i10) {
            return iDecodeVarint32;
        }
        throw C.truncatedMessage();
    }

    public static int decodePackedFixed32List(byte[] bArr, int i, B.i<?> iVar, b bVar) throws IOException {
        A a10 = (A) iVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, bVar);
        int i10 = bVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i10) {
            a10.addInt(decodeFixed32(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i10) {
            return iDecodeVarint32;
        }
        throw C.truncatedMessage();
    }

    public static int decodePackedFixed64List(byte[] bArr, int i, B.i<?> iVar, b bVar) throws IOException {
        K k10 = (K) iVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, bVar);
        int i10 = bVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i10) {
            k10.addLong(decodeFixed64(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i10) {
            return iDecodeVarint32;
        }
        throw C.truncatedMessage();
    }

    public static int decodePackedFloatList(byte[] bArr, int i, B.i<?> iVar, b bVar) throws IOException {
        C4040x c4040x = (C4040x) iVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, bVar);
        int i10 = bVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i10) {
            c4040x.addFloat(decodeFloat(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i10) {
            return iDecodeVarint32;
        }
        throw C.truncatedMessage();
    }

    public static int decodePackedSInt32List(byte[] bArr, int i, B.i<?> iVar, b bVar) throws IOException {
        A a10 = (A) iVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, bVar);
        int i10 = bVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i10) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, bVar);
            a10.addInt(AbstractC4027j.decodeZigZag32(bVar.int1));
        }
        if (iDecodeVarint32 == i10) {
            return iDecodeVarint32;
        }
        throw C.truncatedMessage();
    }

    public static int decodePackedSInt64List(byte[] bArr, int i, B.i<?> iVar, b bVar) throws IOException {
        K k10 = (K) iVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, bVar);
        int i10 = bVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i10) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, bVar);
            k10.addLong(AbstractC4027j.decodeZigZag64(bVar.long1));
        }
        if (iDecodeVarint32 == i10) {
            return iDecodeVarint32;
        }
        throw C.truncatedMessage();
    }

    public static int decodePackedVarint32List(byte[] bArr, int i, B.i<?> iVar, b bVar) throws IOException {
        A a10 = (A) iVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, bVar);
        int i10 = bVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i10) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, bVar);
            a10.addInt(bVar.int1);
        }
        if (iDecodeVarint32 == i10) {
            return iDecodeVarint32;
        }
        throw C.truncatedMessage();
    }

    public static int decodePackedVarint64List(byte[] bArr, int i, B.i<?> iVar, b bVar) throws IOException {
        K k10 = (K) iVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i, bVar);
        int i10 = bVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i10) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, bVar);
            k10.addLong(bVar.long1);
        }
        if (iDecodeVarint32 == i10) {
            return iDecodeVarint32;
        }
        throw C.truncatedMessage();
    }

    public static int decodeSInt32List(int i, byte[] bArr, int i10, int i11, B.i<?> iVar, b bVar) {
        A a10 = (A) iVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i10, bVar);
        a10.addInt(AbstractC4027j.decodeZigZag32(bVar.int1));
        while (iDecodeVarint32 < i11) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, bVar);
            if (i != bVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, bVar);
            a10.addInt(AbstractC4027j.decodeZigZag32(bVar.int1));
        }
        return iDecodeVarint32;
    }

    public static int decodeSInt64List(int i, byte[] bArr, int i10, int i11, B.i<?> iVar, b bVar) {
        K k10 = (K) iVar;
        int iDecodeVarint64 = decodeVarint64(bArr, i10, bVar);
        k10.addLong(AbstractC4027j.decodeZigZag64(bVar.long1));
        while (iDecodeVarint64 < i11) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, bVar);
            if (i != bVar.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, bVar);
            k10.addLong(AbstractC4027j.decodeZigZag64(bVar.long1));
        }
        return iDecodeVarint64;
    }

    public static int decodeString(byte[] bArr, int i, b bVar) throws C {
        int iDecodeVarint32 = decodeVarint32(bArr, i, bVar);
        int i10 = bVar.int1;
        if (i10 < 0) {
            throw C.negativeSize();
        }
        if (i10 == 0) {
            bVar.object1 = "";
            return iDecodeVarint32;
        }
        bVar.object1 = new String(bArr, iDecodeVarint32, i10, B.UTF_8);
        return iDecodeVarint32 + i10;
    }

    public static int decodeStringList(int i, byte[] bArr, int i10, int i11, B.i<?> iVar, b bVar) throws C {
        int iDecodeVarint32 = decodeVarint32(bArr, i10, bVar);
        int i12 = bVar.int1;
        if (i12 < 0) {
            throw C.negativeSize();
        }
        if (i12 == 0) {
            iVar.add("");
        } else {
            iVar.add(new String(bArr, iDecodeVarint32, i12, B.UTF_8));
            iDecodeVarint32 += i12;
        }
        while (iDecodeVarint32 < i11) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, bVar);
            if (i != bVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, bVar);
            int i13 = bVar.int1;
            if (i13 < 0) {
                throw C.negativeSize();
            }
            if (i13 == 0) {
                iVar.add("");
            } else {
                iVar.add(new String(bArr, iDecodeVarint32, i13, B.UTF_8));
                iDecodeVarint32 += i13;
            }
        }
        return iDecodeVarint32;
    }

    public static int decodeStringListRequireUtf8(int i, byte[] bArr, int i10, int i11, B.i<?> iVar, b bVar) throws C {
        int iDecodeVarint32 = decodeVarint32(bArr, i10, bVar);
        int i12 = bVar.int1;
        if (i12 < 0) {
            throw C.negativeSize();
        }
        if (i12 == 0) {
            iVar.add("");
        } else {
            int i13 = iDecodeVarint32 + i12;
            if (!z0.isValidUtf8(bArr, iDecodeVarint32, i13)) {
                throw C.invalidUtf8();
            }
            iVar.add(new String(bArr, iDecodeVarint32, i12, B.UTF_8));
            iDecodeVarint32 = i13;
        }
        while (iDecodeVarint32 < i11) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, bVar);
            if (i != bVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, bVar);
            int i14 = bVar.int1;
            if (i14 < 0) {
                throw C.negativeSize();
            }
            if (i14 == 0) {
                iVar.add("");
            } else {
                int i15 = iDecodeVarint32 + i14;
                if (!z0.isValidUtf8(bArr, iDecodeVarint32, i15)) {
                    throw C.invalidUtf8();
                }
                iVar.add(new String(bArr, iDecodeVarint32, i14, B.UTF_8));
                iDecodeVarint32 = i15;
            }
        }
        return iDecodeVarint32;
    }

    public static int decodeStringRequireUtf8(byte[] bArr, int i, b bVar) throws C {
        int iDecodeVarint32 = decodeVarint32(bArr, i, bVar);
        int i10 = bVar.int1;
        if (i10 < 0) {
            throw C.negativeSize();
        }
        if (i10 == 0) {
            bVar.object1 = "";
            return iDecodeVarint32;
        }
        bVar.object1 = z0.decodeUtf8(bArr, iDecodeVarint32, i10);
        return iDecodeVarint32 + i10;
    }

    public static int decodeUnknownField(int i, byte[] bArr, int i10, int i11, v0 v0Var, b bVar) throws C {
        if (A0.getTagFieldNumber(i) == 0) {
            throw C.invalidTag();
        }
        int tagWireType = A0.getTagWireType(i);
        if (tagWireType == 0) {
            int iDecodeVarint64 = decodeVarint64(bArr, i10, bVar);
            v0Var.storeField(i, Long.valueOf(bVar.long1));
            return iDecodeVarint64;
        }
        if (tagWireType == 1) {
            v0Var.storeField(i, Long.valueOf(decodeFixed64(bArr, i10)));
            return i10 + 8;
        }
        if (tagWireType == 2) {
            int iDecodeVarint32 = decodeVarint32(bArr, i10, bVar);
            int i12 = bVar.int1;
            if (i12 < 0) {
                throw C.negativeSize();
            }
            if (i12 > bArr.length - iDecodeVarint32) {
                throw C.truncatedMessage();
            }
            if (i12 == 0) {
                v0Var.storeField(i, AbstractC4026i.EMPTY);
            } else {
                v0Var.storeField(i, AbstractC4026i.copyFrom(bArr, iDecodeVarint32, i12));
            }
            return iDecodeVarint32 + i12;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw C.invalidTag();
            }
            v0Var.storeField(i, Integer.valueOf(decodeFixed32(bArr, i10)));
            return i10 + 4;
        }
        v0 v0VarNewInstance = v0.newInstance();
        int i13 = (i & (-8)) | 4;
        int i14 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iDecodeVarint322 = decodeVarint32(bArr, i10, bVar);
            i14 = bVar.int1;
            if (i14 == i13) {
                i10 = iDecodeVarint322;
                break;
            }
            i10 = decodeUnknownField(i14, bArr, iDecodeVarint322, i11, v0VarNewInstance, bVar);
        }
        if (i10 > i11 || i14 != i13) {
            throw C.parseFailure();
        }
        v0Var.storeField(i, v0VarNewInstance);
        return i10;
    }

    public static int decodeVarint32(byte[] bArr, int i, b bVar) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 < 0) {
            return decodeVarint32(b10, bArr, i10, bVar);
        }
        bVar.int1 = b10;
        return i10;
    }

    public static int decodeVarint32List(int i, byte[] bArr, int i10, int i11, B.i<?> iVar, b bVar) {
        A a10 = (A) iVar;
        int iDecodeVarint32 = decodeVarint32(bArr, i10, bVar);
        a10.addInt(bVar.int1);
        while (iDecodeVarint32 < i11) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, bVar);
            if (i != bVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, bVar);
            a10.addInt(bVar.int1);
        }
        return iDecodeVarint32;
    }

    public static int decodeVarint64(byte[] bArr, int i, b bVar) {
        int i10 = i + 1;
        long j4 = bArr[i];
        if (j4 < 0) {
            return decodeVarint64(j4, bArr, i10, bVar);
        }
        bVar.long1 = j4;
        return i10;
    }

    public static int decodeVarint64List(int i, byte[] bArr, int i10, int i11, B.i<?> iVar, b bVar) {
        K k10 = (K) iVar;
        int iDecodeVarint64 = decodeVarint64(bArr, i10, bVar);
        k10.addLong(bVar.long1);
        while (iDecodeVarint64 < i11) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, bVar);
            if (i != bVar.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, bVar);
            k10.addLong(bVar.long1);
        }
        return iDecodeVarint64;
    }

    public static int mergeGroupField(Object obj, n0 n0Var, byte[] bArr, int i, int i10, int i11, b bVar) throws IOException {
        int proto2Message = ((X) n0Var).parseProto2Message(obj, bArr, i, i10, i11, bVar);
        bVar.object1 = obj;
        return proto2Message;
    }

    public static int mergeMessageField(Object obj, n0 n0Var, byte[] bArr, int i, int i10, b bVar) throws IOException {
        int iDecodeVarint32 = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            iDecodeVarint32 = decodeVarint32(i11, bArr, iDecodeVarint32, bVar);
            i11 = bVar.int1;
        }
        int i12 = iDecodeVarint32;
        if (i11 < 0 || i11 > i10 - i12) {
            throw C.truncatedMessage();
        }
        int i13 = i12 + i11;
        n0Var.mergeFrom(obj, bArr, i12, i13, bVar);
        bVar.object1 = obj;
        return i13;
    }

    public static int skipField(int i, byte[] bArr, int i10, int i11, b bVar) throws C {
        if (A0.getTagFieldNumber(i) == 0) {
            throw C.invalidTag();
        }
        int tagWireType = A0.getTagWireType(i);
        if (tagWireType == 0) {
            return decodeVarint64(bArr, i10, bVar);
        }
        if (tagWireType == 1) {
            return i10 + 8;
        }
        if (tagWireType == 2) {
            return decodeVarint32(bArr, i10, bVar) + bVar.int1;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i10 + 4;
            }
            throw C.invalidTag();
        }
        int i12 = (i & (-8)) | 4;
        int i13 = 0;
        while (i10 < i11) {
            i10 = decodeVarint32(bArr, i10, bVar);
            i13 = bVar.int1;
            if (i13 == i12) {
                break;
            }
            i10 = skipField(i13, bArr, i10, i11, bVar);
        }
        if (i10 > i11 || i13 != i12) {
            throw C.parseFailure();
        }
        return i10;
    }

    /* compiled from: ArrayDecoders.java */
    /* renamed from: com.google.protobuf.e$b */
    public static final class b {
        public final C4034q extensionRegistry;
        public int int1;
        public long long1;
        public Object object1;

        public b() {
            this.extensionRegistry = C4034q.getEmptyRegistry();
        }

        public b(C4034q c4034q) {
            c4034q.getClass();
            this.extensionRegistry = c4034q;
        }
    }

    public static int decodeVarint32(int i, byte[] bArr, int i10, b bVar) {
        int i11 = i & 127;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            bVar.int1 = i11 | (b10 << 7);
            return i12;
        }
        int i13 = i11 | ((b10 & 127) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            bVar.int1 = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            bVar.int1 = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            bVar.int1 = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                bVar.int1 = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int decodeVarint64(long j4, byte[] bArr, int i, b bVar) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        long j10 = (j4 & 127) | ((b10 & 127) << 7);
        int i11 = 7;
        while (b10 < 0) {
            int i12 = i10 + 1;
            byte b11 = bArr[i10];
            i11 += 7;
            j10 |= (b11 & 127) << i11;
            i10 = i12;
            b10 = b11;
        }
        bVar.long1 = j10;
        return i10;
    }
}
