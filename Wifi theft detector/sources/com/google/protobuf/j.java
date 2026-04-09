package com.google.protobuf;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class j {
    public abstract int extensionNumber(Map.Entry<?, ?> entry);

    public abstract Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i10);

    public abstract FieldSet getExtensions(Object obj);

    public abstract FieldSet getMutableExtensions(Object obj);

    public abstract boolean hasExtensions(MessageLite messageLite);

    public abstract void makeImmutable(Object obj);

    public abstract <UT, UB> UB parseExtension(Object obj, p0 p0Var, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, UB ub, v0 v0Var) throws IOException;

    public abstract void parseLengthPrefixedMessageSetItem(p0 p0Var, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) throws IOException;

    public abstract void parseMessageSetItem(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) throws IOException;

    public abstract void serializeExtension(Writer writer, Map.Entry<?, ?> entry) throws IOException;

    public abstract void setExtensions(Object obj, FieldSet fieldSet);
}
