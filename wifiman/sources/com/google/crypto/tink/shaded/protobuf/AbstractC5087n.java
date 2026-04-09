package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5087n {

    /* renamed from: a, reason: collision with root package name */
    static final Class f38577a = c();

    public static C5088o a() {
        C5088o c5088oB = b("getEmptyRegistry");
        return c5088oB != null ? c5088oB : C5088o.f38584d;
    }

    private static final C5088o b(String str) {
        Class cls = f38577a;
        if (cls == null) {
            return null;
        }
        try {
            return (C5088o) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
