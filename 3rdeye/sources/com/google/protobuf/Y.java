package com.google.protobuf;

import com.google.protobuf.A0;
import com.google.protobuf.C4038v;
import com.google.protobuf.F;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema.java */
/* loaded from: classes2.dex */
public final class Y<T> implements n0<T> {
    private final U defaultInstance;
    private final r<?> extensionSchema;
    private final boolean hasExtensions;
    private final u0<?, ?> unknownFieldSchema;

    private Y(u0<?, ?> u0Var, r<?> rVar, U u8) {
        this.unknownFieldSchema = u0Var;
        this.hasExtensions = rVar.hasExtensions(u8);
        this.extensionSchema = rVar;
        this.defaultInstance = u8;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(u0<UT, UB> u0Var, T t10) {
        return u0Var.getSerializedSizeAsMessageSet(u0Var.getFromMessage(t10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends C4038v.c<ET>> void mergeFromHelper(u0<UT, UB> u0Var, r<ET> rVar, T t10, l0 l0Var, C4034q c4034q) throws Throwable {
        u0<UT, UB> u0Var2;
        r<ET> rVar2;
        l0 l0Var2;
        C4034q c4034q2;
        UB builderFromMessage = u0Var.getBuilderFromMessage(t10);
        Object mutableExtensions = rVar.getMutableExtensions(t10);
        while (l0Var.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                u0Var2 = u0Var;
                rVar2 = rVar;
                l0Var2 = l0Var;
                c4034q2 = c4034q;
            } catch (Throwable th) {
                th = th;
                u0Var2 = u0Var;
            }
            try {
                if (!parseMessageSetItemOrUnknownField(l0Var2, c4034q2, rVar2, mutableExtensions, u0Var2, builderFromMessage)) {
                    u0Var2.setBuilderToMessage(t10, builderFromMessage);
                    return;
                }
                l0Var = l0Var2;
                c4034q = c4034q2;
                rVar = rVar2;
                u0Var = u0Var2;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                u0Var2.setBuilderToMessage(t10, builderFromMessage);
                throw th3;
            }
        }
        u0Var.setBuilderToMessage(t10, builderFromMessage);
    }

    public static <T> Y<T> newSchema(u0<?, ?> u0Var, r<?> rVar, U u8) {
        return new Y<>(u0Var, rVar, u8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends C4038v.c<ET>> boolean parseMessageSetItemOrUnknownField(l0 l0Var, C4034q c4034q, r<ET> rVar, C4038v<ET> c4038v, u0<UT, UB> u0Var, UB ub) throws IOException {
        int tag = l0Var.getTag();
        if (tag != A0.MESSAGE_SET_ITEM_TAG) {
            if (A0.getTagWireType(tag) != 2) {
                return l0Var.skipField();
            }
            Object objFindExtensionByNumber = rVar.findExtensionByNumber(c4034q, this.defaultInstance, A0.getTagFieldNumber(tag));
            if (objFindExtensionByNumber == null) {
                return u0Var.mergeOneFieldFrom(ub, l0Var);
            }
            rVar.parseLengthPrefixedMessageSetItem(l0Var, objFindExtensionByNumber, c4034q, c4038v);
            return true;
        }
        Object objFindExtensionByNumber2 = null;
        int uInt32 = 0;
        AbstractC4026i bytes = null;
        while (l0Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = l0Var.getTag();
            if (tag2 == A0.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = l0Var.readUInt32();
                objFindExtensionByNumber2 = rVar.findExtensionByNumber(c4034q, this.defaultInstance, uInt32);
            } else if (tag2 == A0.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    rVar.parseLengthPrefixedMessageSetItem(l0Var, objFindExtensionByNumber2, c4034q, c4038v);
                } else {
                    bytes = l0Var.readBytes();
                }
            } else if (!l0Var.skipField()) {
                break;
            }
        }
        if (l0Var.getTag() != A0.MESSAGE_SET_ITEM_END_TAG) {
            throw C.invalidEndTag();
        }
        if (bytes != null) {
            if (objFindExtensionByNumber2 != null) {
                rVar.parseMessageSetItem(bytes, objFindExtensionByNumber2, c4034q, c4038v);
            } else {
                u0Var.addLengthDelimited(ub, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(u0<UT, UB> u0Var, T t10, B0 b02) throws IOException {
        u0Var.writeAsMessageSetTo(u0Var.getFromMessage(t10), b02);
    }

    @Override // com.google.protobuf.n0
    public boolean equals(T t10, T t11) {
        if (!this.unknownFieldSchema.getFromMessage(t10).equals(this.unknownFieldSchema.getFromMessage(t11))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t10).equals(this.extensionSchema.getExtensions(t11));
        }
        return true;
    }

    @Override // com.google.protobuf.n0
    public int getSerializedSize(T t10) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, t10);
        return this.hasExtensions ? this.extensionSchema.getExtensions(t10).getMessageSetSerializedSize() + unknownFieldsSerializedSize : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.n0
    public int hashCode(T t10) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(t10).hashCode();
        if (!this.hasExtensions) {
            return iHashCode;
        }
        return this.extensionSchema.getExtensions(t10).hashCode() + (iHashCode * 53);
    }

    @Override // com.google.protobuf.n0
    public final boolean isInitialized(T t10) {
        return this.extensionSchema.getExtensions(t10).isInitialized();
    }

    @Override // com.google.protobuf.n0
    public void makeImmutable(T t10) {
        this.unknownFieldSchema.makeImmutable(t10);
        this.extensionSchema.makeImmutable(t10);
    }

    @Override // com.google.protobuf.n0
    public void mergeFrom(T t10, T t11) {
        p0.mergeUnknownFields(this.unknownFieldSchema, t10, t11);
        if (this.hasExtensions) {
            p0.mergeExtensions(this.extensionSchema, t10, t11);
        }
    }

    @Override // com.google.protobuf.n0
    public T newInstance() {
        U u8 = this.defaultInstance;
        return u8 instanceof AbstractC4042z ? (T) ((AbstractC4042z) u8).newMutableInstance() : (T) u8.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.n0
    public void writeTo(T t10, B0 b02) throws IOException {
        Iterator it = this.extensionSchema.getExtensions(t10).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C4038v.c cVar = (C4038v.c) entry.getKey();
            if (cVar.getLiteJavaType() != A0.c.MESSAGE || cVar.isRepeated() || cVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof F.b) {
                b02.writeMessageSetItem(cVar.getNumber(), ((F.b) entry).getField().toByteString());
            } else {
                b02.writeMessageSetItem(cVar.getNumber(), entry.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, t10, b02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    @Override // com.google.protobuf.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mergeFrom(T r11, byte[] r12, int r13, int r14, com.google.protobuf.C4022e.b r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Y.mergeFrom(java.lang.Object, byte[], int, int, com.google.protobuf.e$b):void");
    }

    @Override // com.google.protobuf.n0
    public void mergeFrom(T t10, l0 l0Var, C4034q c4034q) throws Throwable {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t10, l0Var, c4034q);
    }
}
