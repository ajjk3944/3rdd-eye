package com.google.protobuf;

/* compiled from: MapFieldSchemas.java */
/* loaded from: classes2.dex */
public final class Q {
    private static final O FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final O LITE_SCHEMA = new P();

    public static O full() {
        return FULL_SCHEMA;
    }

    public static O lite() {
        return LITE_SCHEMA;
    }

    private static O loadSchemaForFullRuntime() {
        try {
            return (O) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
