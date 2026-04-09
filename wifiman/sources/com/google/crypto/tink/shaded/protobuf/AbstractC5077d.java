package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5077d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f38487a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f38488b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f38489c;

    static {
        f38489c = (f38487a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f38488b;
    }

    static boolean c() {
        return f38487a || !(f38488b == null || f38489c);
    }
}
