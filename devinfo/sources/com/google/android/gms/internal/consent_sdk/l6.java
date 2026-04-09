package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l6 implements q6 {

    /* renamed from: a, reason: collision with root package name */
    public final l5 f19411a;

    /* renamed from: b, reason: collision with root package name */
    public final w6 f19412b;

    public l6(w6 w6Var, l5 l5Var) {
        q4 q4Var = s5.f19509a;
        this.f19412b = w6Var;
        this.f19411a = l5Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.q6
    public final void a(Object obj) {
        this.f19412b.getClass();
        v6 v6Var = ((w5) obj).zzc;
        if (v6Var.f19551d) {
            v6Var.f19551d = false;
        }
        q4 q4Var = s5.f19509a;
        throw a0.g.h(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.q6
    public final int b(w5 w5Var) {
        w5Var.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.consent_sdk.q6
    public final boolean c(w5 w5Var, w5 w5Var2) {
        return w5Var.zzc.equals(w5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.consent_sdk.q6
    public final void d(Object obj, e6 e6Var) {
        throw a0.g.h(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.q6
    public final void e(Object obj, Object obj2) {
        r6.o(obj, obj2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.q6
    public final int f(l5 l5Var) {
        v6 v6Var = ((w5) l5Var).zzc;
        int i4 = v6Var.f19550c;
        if (i4 != -1) {
            return i4;
        }
        v6Var.f19550c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.q6
    public final boolean g(Object obj) {
        throw a0.g.h(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.q6
    public final w5 zzc() {
        l5 l5Var = this.f19411a;
        return l5Var instanceof w5 ? (w5) ((w5) l5Var).f(4) : ((v5) ((w5) l5Var).f(5)).b();
    }
}
