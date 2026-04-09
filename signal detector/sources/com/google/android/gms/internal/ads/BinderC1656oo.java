package com.google.android.gms.internal.ads;

import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.oo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1656oo extends AbstractBinderC0707Re {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1764qo f16061a;

    public BinderC1656oo(C1764qo c1764qo) {
        this.f16061a = c1764qo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0724Se
    public final void a(C2852x0 c2852x0) {
        C1764qo c1764qo = this.f16061a;
        C1283hr c1283hr = c1764qo.f16401b;
        long j6 = c1764qo.f16400a;
        int i = c2852x0.f23273a;
        C1677p8 c1677p8 = new C1677p8("rewarded");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onRewardedAdFailedToLoad";
        c1677p8.f16140d = Integer.valueOf(i);
        c1283hr.x(c1677p8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0724Se
    public final void b() {
        C1764qo c1764qo = this.f16061a;
        C1283hr c1283hr = c1764qo.f16401b;
        long j6 = c1764qo.f16400a;
        C1677p8 c1677p8 = new C1677p8("rewarded");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onRewardedAdLoaded";
        c1283hr.x(c1677p8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0724Se
    public final void t(int i) {
        C1764qo c1764qo = this.f16061a;
        C1283hr c1283hr = c1764qo.f16401b;
        long j6 = c1764qo.f16400a;
        C1677p8 c1677p8 = new C1677p8("rewarded");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onRewardedAdFailedToLoad";
        c1677p8.f16140d = Integer.valueOf(i);
        c1283hr.x(c1677p8);
    }
}
