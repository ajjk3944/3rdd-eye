package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ie0 extends iv {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ke0 f12315a;

    public ie0(ke0 ke0Var) {
        this.f12315a = ke0Var;
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void K1(int i4) {
        ke0 ke0Var = this.f12315a;
        mx0 mx0Var = ke0Var.f13143b;
        long j = ke0Var.f13142a;
        ai aiVar = new ai("rewarded");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onRewardedAdFailedToLoad";
        aiVar.f9333d = Integer.valueOf(i4);
        mx0Var.w(aiVar);
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void b(va.w1 w1Var) {
        ke0 ke0Var = this.f12315a;
        mx0 mx0Var = ke0Var.f13143b;
        long j = ke0Var.f13142a;
        int i4 = w1Var.f36177a;
        ai aiVar = new ai("rewarded");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onRewardedAdFailedToLoad";
        aiVar.f9333d = Integer.valueOf(i4);
        mx0Var.w(aiVar);
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void c() {
        ke0 ke0Var = this.f12315a;
        mx0 mx0Var = ke0Var.f13143b;
        long j = ke0Var.f13142a;
        ai aiVar = new ai("rewarded");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onRewardedAdLoaded";
        mx0Var.w(aiVar);
    }
}
