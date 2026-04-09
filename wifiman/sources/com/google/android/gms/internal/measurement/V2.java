package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class V2 {

    /* renamed from: a, reason: collision with root package name */
    private static U2 f35127a;

    public static synchronized U2 a() {
        try {
            if (f35127a == null) {
                b(new X2());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f35127a;
    }

    private static synchronized void b(U2 u22) {
        if (f35127a != null) {
            throw new IllegalStateException("init() already called");
        }
        f35127a = u22;
    }
}
