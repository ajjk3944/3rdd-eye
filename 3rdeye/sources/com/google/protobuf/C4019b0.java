package com.google.protobuf;

/* compiled from: NewInstanceSchemas.java */
/* renamed from: com.google.protobuf.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4019b0 {
    private static final Z FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final Z LITE_SCHEMA = new C4017a0();

    public static Z full() {
        return FULL_SCHEMA;
    }

    public static Z lite() {
        return LITE_SCHEMA;
    }

    private static Z loadSchemaForFullRuntime() {
        try {
            return (Z) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
