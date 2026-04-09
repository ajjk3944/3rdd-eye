package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
abstract class J {

    /* renamed from: a, reason: collision with root package name */
    private static final H f38446a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final H f38447b = new I();

    static H a() {
        return f38446a;
    }

    static H b() {
        return f38447b;
    }

    private static H c() {
        try {
            return (H) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
