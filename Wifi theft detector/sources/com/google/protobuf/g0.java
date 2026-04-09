package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.LazyField;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class g0 implements q0 {
    private final MessageLite defaultInstance;
    private final j extensionSchema;
    private final boolean hasExtensions;
    private final v0 unknownFieldSchema;

    private g0(v0 v0Var, j jVar, MessageLite messageLite) {
        this.unknownFieldSchema = v0Var;
        this.hasExtensions = jVar.hasExtensions(messageLite);
        this.extensionSchema = jVar;
        this.defaultInstance = messageLite;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(v0 v0Var, Object obj) {
        return v0Var.getSerializedSizeAsMessageSet(v0Var.getFromMessage(obj));
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(v0 v0Var, j jVar, Object obj, p0 p0Var, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        v0 v0Var2;
        j jVar2;
        p0 p0Var2;
        ExtensionRegistryLite extensionRegistryLite2;
        Object builderFromMessage = v0Var.getBuilderFromMessage(obj);
        FieldSet mutableExtensions = jVar.getMutableExtensions(obj);
        while (p0Var.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                v0Var2 = v0Var;
                jVar2 = jVar;
                p0Var2 = p0Var;
                extensionRegistryLite2 = extensionRegistryLite;
            } catch (Throwable th) {
                th = th;
                v0Var2 = v0Var;
            }
            try {
                if (!parseMessageSetItemOrUnknownField(p0Var2, extensionRegistryLite2, jVar2, mutableExtensions, v0Var2, builderFromMessage)) {
                    v0Var2.setBuilderToMessage(obj, builderFromMessage);
                    return;
                }
                p0Var = p0Var2;
                extensionRegistryLite = extensionRegistryLite2;
                jVar = jVar2;
                v0Var = v0Var2;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                v0Var2.setBuilderToMessage(obj, builderFromMessage);
                throw th3;
            }
        }
        v0Var.setBuilderToMessage(obj, builderFromMessage);
    }

    public static <T> g0 newSchema(v0 v0Var, j jVar, MessageLite messageLite) {
        return new g0(v0Var, jVar, messageLite);
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(p0 p0Var, ExtensionRegistryLite extensionRegistryLite, j jVar, FieldSet fieldSet, v0 v0Var, UB ub) throws IOException {
        int tag = p0Var.getTag();
        int uInt32 = 0;
        if (tag != WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (WireFormat.getTagWireType(tag) != 2) {
                return p0Var.skipField();
            }
            Object objFindExtensionByNumber = jVar.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, WireFormat.getTagFieldNumber(tag));
            if (objFindExtensionByNumber == null) {
                return v0Var.mergeOneFieldFrom(ub, p0Var, 0);
            }
            jVar.parseLengthPrefixedMessageSetItem(p0Var, objFindExtensionByNumber, extensionRegistryLite, fieldSet);
            return true;
        }
        Object objFindExtensionByNumber2 = null;
        ByteString bytes = null;
        while (p0Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = p0Var.getTag();
            if (tag2 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = p0Var.readUInt32();
                objFindExtensionByNumber2 = jVar.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, uInt32);
            } else if (tag2 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    jVar.parseLengthPrefixedMessageSetItem(p0Var, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
                } else {
                    bytes = p0Var.readBytes();
                }
            } else if (!p0Var.skipField()) {
                break;
            }
        }
        if (p0Var.getTag() != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objFindExtensionByNumber2 != null) {
                jVar.parseMessageSetItem(bytes, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
            } else {
                v0Var.addLengthDelimited(ub, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(v0 v0Var, Object obj, Writer writer) throws IOException {
        v0Var.writeAsMessageSetTo(v0Var.getFromMessage(obj), writer);
    }

    @Override // com.google.protobuf.q0
    public boolean equals(Object obj, Object obj2) {
        if (!this.unknownFieldSchema.getFromMessage(obj).equals(this.unknownFieldSchema.getFromMessage(obj2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(obj).equals(this.extensionSchema.getExtensions(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.q0
    public int getSerializedSize(Object obj) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(obj).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.q0
    public int hashCode(Object obj) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(obj).hashCode();
        return this.hasExtensions ? (iHashCode * 53) + this.extensionSchema.getExtensions(obj).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.q0
    public final boolean isInitialized(Object obj) {
        return this.extensionSchema.getExtensions(obj).isInitialized();
    }

    @Override // com.google.protobuf.q0
    public void makeImmutable(Object obj) {
        this.unknownFieldSchema.makeImmutable(obj);
        this.extensionSchema.makeImmutable(obj);
    }

    @Override // com.google.protobuf.q0
    public void mergeFrom(Object obj, Object obj2) {
        s0.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            s0.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    @Override // com.google.protobuf.q0
    public Object newInstance() {
        MessageLite messageLite = this.defaultInstance;
        return messageLite instanceof GeneratedMessageLite ? ((GeneratedMessageLite) messageLite).newMutableInstance() : messageLite.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.q0
    public void writeTo(Object obj, Writer writer) throws IOException {
        Iterator<Map.Entry<FieldSet.FieldDescriptorLite<Object>, Object>> it = this.extensionSchema.getExtensions(obj).iterator();
        while (it.hasNext()) {
            Map.Entry<FieldSet.FieldDescriptorLite<Object>, Object> next = it.next();
            FieldSet.FieldDescriptorLite<Object> key = next.getKey();
            if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof LazyField.b) {
                writer.writeMessageSetItem(key.getNumber(), ((LazyField.b) next).getField().toByteString());
            } else {
                writer.writeMessageSetItem(key.getNumber(), next.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, obj, writer);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    @Override // com.google.protobuf.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mergeFrom(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.protobuf.c.b r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.g0.mergeFrom(java.lang.Object, byte[], int, int, com.google.protobuf.c$b):void");
    }

    @Override // com.google.protobuf.q0
    public void mergeFrom(Object obj, p0 p0Var, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, p0Var, extensionRegistryLite);
    }
}
