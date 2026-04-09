package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
abstract class U {

    /* renamed from: a, reason: collision with root package name */
    private static final S f38472a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final S f38473b = new T();

    static S a() {
        return f38472a;
    }

    static S b() {
        return f38473b;
    }

    private static S c() {
        try {
            return (S) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
