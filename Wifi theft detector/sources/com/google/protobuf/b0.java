package com.google.protobuf;

/* loaded from: classes3.dex */
public final class b0 {
    private static final z FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final z LITE_SCHEMA = new a0();

    public static z full() {
        return FULL_SCHEMA;
    }

    public static z lite() {
        return LITE_SCHEMA;
    }

    private static z loadSchemaForFullRuntime() {
        try {
            return (z) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
