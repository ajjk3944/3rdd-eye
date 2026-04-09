package com.google.protobuf;

/* loaded from: classes3.dex */
public final class j0 {
    private static final h0 FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final h0 LITE_SCHEMA = new i0();

    public static h0 full() {
        return FULL_SCHEMA;
    }

    public static h0 lite() {
        return LITE_SCHEMA;
    }

    private static h0 loadSchemaForFullRuntime() {
        try {
            return (h0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
