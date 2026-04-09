package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class je0 extends ev {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ke0 f12738a;

    public je0(ke0 ke0Var) {
        this.f12738a = ke0Var;
    }

    @Override // com.google.android.gms.internal.ads.fv
    public final void A1() {
        ke0 ke0Var = this.f12738a;
        mx0 mx0Var = ke0Var.f13143b;
        long j = ke0Var.f13142a;
        ai aiVar = new ai("rewarded");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onAdImpression";
        mx0Var.w(aiVar);
    }

    @Override // com.google.android.gms.internal.ads.fv
    public final void D1() {
        ke0 ke0Var = this.f12738a;
        mx0 mx0Var = ke0Var.f13143b;
        long j = ke0Var.f13142a;
        ai aiVar = new ai("rewarded");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onAdClicked";
        mx0Var.w(aiVar);
    }

    @Override // com.google.android.gms.internal.ads.fv
    public final void b3(zu zuVar) {
        ke0 ke0Var = this.f12738a;
        mx0 mx0Var = ke0Var.f13143b;
        long j = ke0Var.f13142a;
        ai aiVar = new ai("rewarded");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onUserEarnedReward";
        aiVar.f9334e = zuVar.c();
        aiVar.f9335f = Integer.valueOf(zuVar.d());
        mx0Var.w(aiVar);
    }

    @Override // com.google.android.gms.internal.ads.fv
    public final void c() {
        ke0 ke0Var = this.f12738a;
        mx0 mx0Var = ke0Var.f13143b;
        long j = ke0Var.f13142a;
        ai aiVar = new ai("rewarded");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onRewardedAdOpened";
        mx0Var.w(aiVar);
    }

    @Override // com.google.android.gms.internal.ads.fv
    public final void d() {
        ke0 ke0Var = this.f12738a;
        mx0 mx0Var = ke0Var.f13143b;
        long j = ke0Var.f13142a;
        ai aiVar = new ai("rewarded");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onRewardedAdClosed";
        mx0Var.w(aiVar);
    }

    @Override // com.google.android.gms.internal.ads.fv
    public final void n(int i4) {
        ke0 ke0Var = this.f12738a;
        mx0 mx0Var = ke0Var.f13143b;
        long j = ke0Var.f13142a;
        ai aiVar = new ai("rewarded");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onRewardedAdFailedToShow";
        aiVar.f9333d = Integer.valueOf(i4);
        mx0Var.w(aiVar);
    }

    @Override // com.google.android.gms.internal.ads.fv
    public final void u0(va.w1 w1Var) {
        ke0 ke0Var = this.f12738a;
        mx0 mx0Var = ke0Var.f13143b;
        long j = ke0Var.f13142a;
        int i4 = w1Var.f36177a;
        ai aiVar = new ai("rewarded");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onRewardedAdFailedToShow";
        aiVar.f9333d = Integer.valueOf(i4);
        mx0Var.w(aiVar);
    }
}
