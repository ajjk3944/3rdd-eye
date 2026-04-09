package com.google.protobuf;

/* compiled from: ExtensionSchemas.java */
/* renamed from: com.google.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4036t {
    private static final r<?> LITE_SCHEMA = new C4035s();
    private static final r<?> FULL_SCHEMA = loadSchemaForFullRuntime();

    public static r<?> full() {
        r<?> rVar = FULL_SCHEMA;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static r<?> lite() {
        return LITE_SCHEMA;
    }

    private static r<?> loadSchemaForFullRuntime() {
        try {
            return (r) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
