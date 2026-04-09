package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nh extends th {

    /* renamed from: a, reason: collision with root package name */
    public final ab.b f14288a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14289b;

    public nh(ab.b bVar, String str) {
        this.f14288a = bVar;
        this.f14289b = str;
    }

    @Override // com.google.android.gms.internal.ads.vh
    public final void W(va.w1 w1Var) {
        ab.b bVar = this.f14288a;
        if (bVar != null) {
            bVar.c(w1Var.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.vh
    public final void t2(rh rhVar) {
        ab.b bVar = this.f14288a;
        if (bVar != null) {
            bVar.f(new oh(rhVar, this.f14289b));
        }
    }

    @Override // com.google.android.gms.internal.ads.vh
    public final void p(int i4) {
    }
}
