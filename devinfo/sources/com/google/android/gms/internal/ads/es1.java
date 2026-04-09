package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class es1 implements js1, cs1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f10852c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile js1 f10853a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f10854b = f10852c;

    public es1(js1 js1Var) {
        this.f10853a = js1Var;
    }

    public static es1 b(js1 js1Var) {
        return js1Var instanceof es1 ? (es1) js1Var : new es1(js1Var);
    }

    public static cs1 c(js1 js1Var) {
        if (js1Var instanceof cs1) {
            return (cs1) js1Var;
        }
        js1Var.getClass();
        return new es1(js1Var);
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        Object obj = this.f10854b;
        Object obj2 = f10852c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f10854b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objA = this.f10853a.a();
                Object obj4 = this.f10854b;
                if (obj4 != obj2 && obj4 != objA) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objA + ". This is likely due to a circular dependency.");
                }
                this.f10854b = objA;
                this.f10853a = null;
                return objA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
