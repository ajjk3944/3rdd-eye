package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bz implements pt1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.k f9855a = new androidx.datastore.preferences.protobuf.k(2);

    /* renamed from: b, reason: collision with root package name */
    public long f9856b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    public long f9857c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    public long f9858d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    public long f9859e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    public int f9860f;
    public boolean g;

    @Override // com.google.android.gms.internal.ads.pt1
    public final boolean A1() {
        ls.t("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final void a(cv1 cv1Var) {
        this.f9860f = 0;
        this.g = false;
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final void b(cv1 cv1Var) {
        this.f9860f = 0;
        this.g = false;
        androidx.datastore.preferences.protobuf.k kVar = this.f9855a;
        synchronized (kVar) {
            kVar.g0(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final boolean c(ot1 ot1Var) {
        long j = ot1Var.f14799f ? this.f9859e : this.f9858d;
        return j <= 0 || ot1Var.f14797d >= j;
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final long d() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final void e(cv1 cv1Var) {
        this.f9860f = 0;
        this.g = false;
        androidx.datastore.preferences.protobuf.k kVar = this.f9855a;
        synchronized (kVar) {
            kVar.g0(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final boolean f(ot1 ot1Var) {
        int i4;
        long j = ot1Var.f14797d;
        boolean z3 = true;
        char c9 = j > this.f9857c ? (char) 0 : j < this.f9856b ? (char) 2 : (char) 1;
        androidx.datastore.preferences.protobuf.k kVar = this.f9855a;
        synchronized (kVar) {
            i4 = kVar.f1001b * 65536;
        }
        int i10 = this.f9860f;
        if (c9 != 2 && (c9 != 1 || !this.g || i4 >= i10)) {
            z3 = false;
        }
        this.g = z3;
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final void g(ot1 ot1Var, d[] dVarArr) {
        int i4;
        this.f9860f = 0;
        for (d dVar : dVarArr) {
            if (dVar != null) {
                int i10 = this.f9860f;
                int i11 = dVar.b().f12339c;
                if (i11 == 0) {
                    i4 = 144310272;
                } else if (i11 == 1) {
                    i4 = 13107200;
                } else if (i11 != 2) {
                    i4 = 131072;
                    if (i11 != 3 && i11 != 5 && i11 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i4 = 131072000;
                }
                this.f9860f = i10 + i4;
            }
        }
        this.f9855a.g0(this.f9860f);
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final i h(cv1 cv1Var) {
        return this.f9855a;
    }
}
