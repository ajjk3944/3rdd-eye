package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5089p f38588a = new C5090q();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC5089p f38589b = c();

    static AbstractC5089p a() {
        AbstractC5089p abstractC5089p = f38589b;
        if (abstractC5089p != null) {
            return abstractC5089p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC5089p b() {
        return f38588a;
    }

    private static AbstractC5089p c() {
        try {
            return (AbstractC5089p) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
