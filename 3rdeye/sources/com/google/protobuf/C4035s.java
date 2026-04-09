package com.google.protobuf;

import com.google.protobuf.A0;
import com.google.protobuf.AbstractC4042z;
import com.google.protobuf.U;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ExtensionSchemaLite.java */
/* renamed from: com.google.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4035s extends r<AbstractC4042z.f> {

    /* compiled from: ExtensionSchemaLite.java */
    /* renamed from: com.google.protobuf.s$a */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SFIXED64.ordinal()] = 11;
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

    @Override // com.google.protobuf.r
    public int extensionNumber(Map.Entry<?, ?> entry) {
        return ((AbstractC4042z.f) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.r
    public Object findExtensionByNumber(C4034q c4034q, U u8, int i) {
        return c4034q.findLiteExtensionByNumber(u8, i);
    }

    @Override // com.google.protobuf.r
    public C4038v<AbstractC4042z.f> getExtensions(Object obj) {
        return ((AbstractC4042z.d) obj).extensions;
    }

    @Override // com.google.protobuf.r
    public C4038v<AbstractC4042z.f> getMutableExtensions(Object obj) {
        return ((AbstractC4042z.d) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.r
    public boolean hasExtensions(U u8) {
        return u8 instanceof AbstractC4042z.d;
    }

    @Override // com.google.protobuf.r
    public void makeImmutable(Object obj) {
        getExtensions(obj).makeImmutable();
    }

    @Override // com.google.protobuf.r
    public <UT, UB> UB parseExtension(Object obj, l0 l0Var, Object obj2, C4034q c4034q, C4038v<AbstractC4042z.f> c4038v, UB ub, u0<UT, UB> u0Var) throws IOException {
        Object objValueOf;
        Object field;
        ArrayList arrayList;
        AbstractC4042z.g gVar = (AbstractC4042z.g) obj2;
        int number = gVar.getNumber();
        if (gVar.descriptor.isRepeated() && gVar.descriptor.isPacked()) {
            switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[gVar.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    l0Var.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    l0Var.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    l0Var.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    l0Var.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    l0Var.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    l0Var.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    l0Var.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    l0Var.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    l0Var.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    l0Var.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    l0Var.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    l0Var.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    l0Var.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    l0Var.readEnumList(arrayList);
                    ub = (UB) p0.filterUnknownEnumList(obj, number, arrayList, gVar.descriptor.getEnumType(), ub, u0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + gVar.descriptor.getLiteType());
            }
            c4038v.setField(gVar.descriptor, arrayList);
            return ub;
        }
        if (gVar.getLiteType() != A0.b.ENUM) {
            switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[gVar.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(l0Var.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(l0Var.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(l0Var.readInt64());
                    break;
                case 4:
                    objValueOf = Long.valueOf(l0Var.readUInt64());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(l0Var.readInt32());
                    break;
                case 6:
                    objValueOf = Long.valueOf(l0Var.readFixed64());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(l0Var.readFixed32());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(l0Var.readBool());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(l0Var.readUInt32());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(l0Var.readSFixed32());
                    break;
                case 11:
                    objValueOf = Long.valueOf(l0Var.readSFixed64());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(l0Var.readSInt32());
                    break;
                case 13:
                    objValueOf = Long.valueOf(l0Var.readSInt64());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = l0Var.readBytes();
                    break;
                case 16:
                    objValueOf = l0Var.readString();
                    break;
                case 17:
                    if (!gVar.isRepeated()) {
                        Object field2 = c4038v.getField(gVar.descriptor);
                        if (field2 instanceof AbstractC4042z) {
                            n0 n0VarSchemaFor = h0.getInstance().schemaFor((h0) field2);
                            if (!((AbstractC4042z) field2).isMutable()) {
                                Object objNewInstance = n0VarSchemaFor.newInstance();
                                n0VarSchemaFor.mergeFrom(objNewInstance, field2);
                                c4038v.setField(gVar.descriptor, objNewInstance);
                                field2 = objNewInstance;
                            }
                            l0Var.mergeGroupField(field2, n0VarSchemaFor, c4034q);
                            return ub;
                        }
                    }
                    objValueOf = l0Var.readGroup(gVar.getMessageDefaultInstance().getClass(), c4034q);
                    break;
                case 18:
                    if (!gVar.isRepeated()) {
                        Object field3 = c4038v.getField(gVar.descriptor);
                        if (field3 instanceof AbstractC4042z) {
                            n0 n0VarSchemaFor2 = h0.getInstance().schemaFor((h0) field3);
                            if (!((AbstractC4042z) field3).isMutable()) {
                                Object objNewInstance2 = n0VarSchemaFor2.newInstance();
                                n0VarSchemaFor2.mergeFrom(objNewInstance2, field3);
                                c4038v.setField(gVar.descriptor, objNewInstance2);
                                field3 = objNewInstance2;
                            }
                            l0Var.mergeMessageField(field3, n0VarSchemaFor2, c4034q);
                            return ub;
                        }
                    }
                    objValueOf = l0Var.readMessage(gVar.getMessageDefaultInstance().getClass(), c4034q);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int int32 = l0Var.readInt32();
            if (gVar.descriptor.getEnumType().findValueByNumber(int32) == null) {
                return (UB) p0.storeUnknownEnum(obj, number, int32, ub, u0Var);
            }
            objValueOf = Integer.valueOf(int32);
        }
        if (gVar.isRepeated()) {
            c4038v.addRepeatedField(gVar.descriptor, objValueOf);
            return ub;
        }
        int i = a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[gVar.getLiteType().ordinal()];
        if ((i == 17 || i == 18) && (field = c4038v.getField(gVar.descriptor)) != null) {
            objValueOf = B.mergeMessage(field, objValueOf);
        }
        c4038v.setField(gVar.descriptor, objValueOf);
        return ub;
    }

    @Override // com.google.protobuf.r
    public void parseLengthPrefixedMessageSetItem(l0 l0Var, Object obj, C4034q c4034q, C4038v<AbstractC4042z.f> c4038v) throws IOException {
        AbstractC4042z.g gVar = (AbstractC4042z.g) obj;
        c4038v.setField(gVar.descriptor, l0Var.readMessage(gVar.getMessageDefaultInstance().getClass(), c4034q));
    }

    @Override // com.google.protobuf.r
    public void parseMessageSetItem(AbstractC4026i abstractC4026i, Object obj, C4034q c4034q, C4038v<AbstractC4042z.f> c4038v) throws IOException {
        AbstractC4042z.g gVar = (AbstractC4042z.g) obj;
        U.a aVarNewBuilderForType = gVar.getMessageDefaultInstance().newBuilderForType();
        AbstractC4027j abstractC4027jNewCodedInput = abstractC4026i.newCodedInput();
        aVarNewBuilderForType.mergeFrom(abstractC4027jNewCodedInput, c4034q);
        c4038v.setField(gVar.descriptor, aVarNewBuilderForType.buildPartial());
        abstractC4027jNewCodedInput.checkLastTagWas(0);
    }

    @Override // com.google.protobuf.r
    public void serializeExtension(B0 b02, Map.Entry<?, ?> entry) throws IOException {
        AbstractC4042z.f fVar = (AbstractC4042z.f) entry.getKey();
        if (!fVar.isRepeated()) {
            switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fVar.getLiteType().ordinal()]) {
                case 1:
                    b02.writeDouble(fVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    b02.writeFloat(fVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    b02.writeInt64(fVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    b02.writeUInt64(fVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    b02.writeInt32(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    b02.writeFixed64(fVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    b02.writeFixed32(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    b02.writeBool(fVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    b02.writeUInt32(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    b02.writeSFixed32(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    b02.writeSFixed64(fVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    b02.writeSInt32(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    b02.writeSInt64(fVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    b02.writeInt32(fVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    b02.writeBytes(fVar.getNumber(), (AbstractC4026i) entry.getValue());
                    break;
                case 16:
                    b02.writeString(fVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    b02.writeGroup(fVar.getNumber(), entry.getValue(), h0.getInstance().schemaFor((Class) entry.getValue().getClass()));
                    break;
                case 18:
                    b02.writeMessage(fVar.getNumber(), entry.getValue(), h0.getInstance().schemaFor((Class) entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fVar.getLiteType().ordinal()]) {
            case 1:
                p0.writeDoubleList(fVar.getNumber(), (List) entry.getValue(), b02, fVar.isPacked());
                break;
            case 2:
                p0.writeFloatList(fVar.getNumber(), (List) entry.getValue(), b02, fVar.isPacked());
                break;
            case 3:
                p0.writeInt64List(fVar.getNumber(), (List) entry.getValue(), b02, fVar.isPacked());
                break;
            case 4:
                p0.writeUInt64List(fVar.getNumber(), (List) entry.getValue(), b02, fVar.isPacked());
                break;
            case 5:
                p0.writeInt32List(fVar.getNumber(), (List) entry.getValue(), b02, fVar.isPacked());
                break;
            case 6:
                p0.writeFixed64List(fVar.getNumber(), (List) entry.getValue(), b02, fVar.isPacked());
                break;
            case 7:
                p0.writeFixed32List(fVar.getNumber(), (List) entry.getValue(), b02, fVar.isPacked());
                break;
            case 8:
                p0.writeBoolList(fVar.getNumber(), (List) entry.getValue(), b02, fVar.isPacked());
                break;
            case 9:
                p0.writeUInt32List(fVar.getNumber(), (List) entry.getValue(), b02, fVar.isPacked());
                break;
            case 10:
                p0.writeSFixed32List(fVar.getNumber(), (List) entry.getValue(), b02, fVar.isPacked());
                break;
            case 11:
                p0.writeSFixed64List(fVar.getNumber(), (List) entry.getValue(), b02, fVar.isPacked());
                break;
            case 12:
                p0.writeSInt32List(fVar.getNumber(), (List) entry.getValue(), b02, fVar.isPacked());
                break;
            case 13:
                p0.writeSInt64List(fVar.getNumber(), (List) entry.getValue(), b02, fVar.isPacked());
                break;
            case 14:
                p0.writeInt32List(fVar.getNumber(), (List) entry.getValue(), b02, fVar.isPacked());
                break;
            case 15:
                p0.writeBytesList(fVar.getNumber(), (List) entry.getValue(), b02);
                break;
            case 16:
                p0.writeStringList(fVar.getNumber(), (List) entry.getValue(), b02);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    p0.writeGroupList(fVar.getNumber(), (List) entry.getValue(), b02, h0.getInstance().schemaFor((Class) list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    p0.writeMessageList(fVar.getNumber(), (List) entry.getValue(), b02, h0.getInstance().schemaFor((Class) list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // com.google.protobuf.r
    public void setExtensions(Object obj, C4038v<AbstractC4042z.f> c4038v) {
        ((AbstractC4042z.d) obj).extensions = c4038v;
    }
}
