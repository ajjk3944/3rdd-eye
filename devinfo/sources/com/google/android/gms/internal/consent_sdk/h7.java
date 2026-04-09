package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h7 implements j7 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f19371c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile i7 f19372a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f19373b;

    /* JADX WARN: Multi-variable type inference failed */
    public static h7 b(i7 i7Var) {
        if (i7Var instanceof h7) {
            return (h7) i7Var;
        }
        h7 h7Var = new h7();
        h7Var.f19373b = f19371c;
        h7Var.f19372a = i7Var;
        return h7Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j7
    public final Object a() {
        Object obj = this.f19373b;
        Object obj2 = f19371c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f19373b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objA = this.f19372a.a();
                Object obj4 = this.f19373b;
                if (obj4 != obj2 && obj4 != objA) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objA + ". This is likely due to a circular dependency.");
                }
                this.f19373b = objA;
                this.f19372a = null;
                return objA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
