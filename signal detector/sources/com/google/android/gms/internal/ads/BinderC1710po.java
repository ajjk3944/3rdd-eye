package com.google.android.gms.internal.ads;

import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.po, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1710po extends AbstractBinderC0639Ne {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1764qo f16224a;

    public BinderC1710po(C1764qo c1764qo) {
        this.f16224a = c1764qo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0656Oe
    public final void B(int i) {
        C1764qo c1764qo = this.f16224a;
        C1283hr c1283hr = c1764qo.f16401b;
        long j6 = c1764qo.f16400a;
        C1677p8 c1677p8 = new C1677p8("rewarded");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onRewardedAdFailedToShow";
        c1677p8.f16140d = Integer.valueOf(i);
        c1283hr.x(c1677p8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0656Oe
    public final void G0(C2852x0 c2852x0) {
        C1764qo c1764qo = this.f16224a;
        C1283hr c1283hr = c1764qo.f16401b;
        long j6 = c1764qo.f16400a;
        int i = c2852x0.f23273a;
        C1677p8 c1677p8 = new C1677p8("rewarded");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onRewardedAdFailedToShow";
        c1677p8.f16140d = Integer.valueOf(i);
        c1283hr.x(c1677p8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0656Oe
    public final void H2(InterfaceC0554Ie interfaceC0554Ie) {
        C1764qo c1764qo = this.f16224a;
        C1283hr c1283hr = c1764qo.f16401b;
        long j6 = c1764qo.f16400a;
        C1677p8 c1677p8 = new C1677p8("rewarded");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onUserEarnedReward";
        c1677p8.f16141e = interfaceC0554Ie.b();
        c1677p8.f16142f = Integer.valueOf(interfaceC0554Ie.d());
        c1283hr.x(c1677p8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0656Oe
    public final void b() {
        C1764qo c1764qo = this.f16224a;
        C1283hr c1283hr = c1764qo.f16401b;
        long j6 = c1764qo.f16400a;
        C1677p8 c1677p8 = new C1677p8("rewarded");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onRewardedAdOpened";
        c1283hr.x(c1677p8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0656Oe
    public final void d() {
        C1764qo c1764qo = this.f16224a;
        C1283hr c1283hr = c1764qo.f16401b;
        long j6 = c1764qo.f16400a;
        C1677p8 c1677p8 = new C1677p8("rewarded");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onRewardedAdClosed";
        c1283hr.x(c1677p8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0656Oe
    public final void h() {
        C1764qo c1764qo = this.f16224a;
        C1283hr c1283hr = c1764qo.f16401b;
        long j6 = c1764qo.f16400a;
        C1677p8 c1677p8 = new C1677p8("rewarded");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onAdImpression";
        c1283hr.x(c1677p8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0656Oe
    public final void k() {
        C1764qo c1764qo = this.f16224a;
        C1283hr c1283hr = c1764qo.f16401b;
        long j6 = c1764qo.f16400a;
        C1677p8 c1677p8 = new C1677p8("rewarded");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onAdClicked";
        c1283hr.x(c1677p8);
    }
}
