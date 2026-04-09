package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ge0 extends va.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mx0 f11506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ he0 f11507b;

    public ge0(he0 he0Var, mx0 mx0Var) {
        this.f11506a = mx0Var;
        this.f11507b = he0Var;
    }

    @Override // va.y
    public final void W(va.w1 w1Var) {
        long j = this.f11507b.f11845a;
        int i4 = w1Var.f36177a;
        ai aiVar = new ai("interstitial");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onAdFailedToLoad";
        aiVar.f9333d = Integer.valueOf(i4);
        this.f11506a.w(aiVar);
    }

    @Override // va.y
    public final void d() {
        long j = this.f11507b.f11845a;
        ai aiVar = new ai("interstitial");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onAdLoaded";
        this.f11506a.w(aiVar);
    }

    @Override // va.y
    public final void e() {
        long j = this.f11507b.f11845a;
        ai aiVar = new ai("interstitial");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onAdOpened";
        this.f11506a.w(aiVar);
    }

    @Override // va.y
    public final void m() {
        long j = this.f11507b.f11845a;
        ai aiVar = new ai("interstitial");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onAdClosed";
        this.f11506a.w(aiVar);
    }

    @Override // va.y
    public final void p(int i4) {
        long j = this.f11507b.f11845a;
        ai aiVar = new ai("interstitial");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onAdFailedToLoad";
        aiVar.f9333d = Integer.valueOf(i4);
        this.f11506a.w(aiVar);
    }

    @Override // va.y
    public final void z1() {
        long j = this.f11507b.f11845a;
        ai aiVar = new ai("interstitial");
        aiVar.f9330a = Long.valueOf(j);
        aiVar.f9332c = "onAdClicked";
        String strB = aiVar.b();
        zo zoVar = (zo) this.f11506a.f14041b;
        Parcel parcelT = zoVar.T();
        parcelT.writeString(strB);
        zoVar.g1(parcelT, 1);
    }

    @Override // va.y
    public final void A1() {
    }

    @Override // va.y
    public final void C1() {
    }

    @Override // va.y
    public final void c() {
    }
}
