package com.google.android.gms.internal.ads;

import android.os.Parcel;
import q2.AbstractBinderC2851x;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.mo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1548mo extends AbstractBinderC2851x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1283hr f15670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1602no f15671b;

    public BinderC1548mo(C1602no c1602no, C1283hr c1283hr) {
        this.f15670a = c1283hr;
        this.f15671b = c1602no;
    }

    @Override // q2.InterfaceC2853y
    public final void E(int i) {
        long j6 = this.f15671b.f15815a;
        C1677p8 c1677p8 = new C1677p8("interstitial");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onAdFailedToLoad";
        c1677p8.f16140d = Integer.valueOf(i);
        this.f15670a.x(c1677p8);
    }

    @Override // q2.InterfaceC2853y
    public final void b() {
    }

    @Override // q2.InterfaceC2853y
    public final void d() {
        long j6 = this.f15671b.f15815a;
        C1677p8 c1677p8 = new C1677p8("interstitial");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onAdLoaded";
        this.f15670a.x(c1677p8);
    }

    @Override // q2.InterfaceC2853y
    public final void e() {
        long j6 = this.f15671b.f15815a;
        C1677p8 c1677p8 = new C1677p8("interstitial");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onAdOpened";
        this.f15670a.x(c1677p8);
    }

    @Override // q2.InterfaceC2853y
    public final void g() {
        long j6 = this.f15671b.f15815a;
        C1677p8 c1677p8 = new C1677p8("interstitial");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onAdClicked";
        String strA = c1677p8.a();
        C0636Nb c0636Nb = (C0636Nb) this.f15670a.f14592b;
        Parcel parcelH0 = c0636Nb.h0();
        parcelH0.writeString(strA);
        c0636Nb.I0(parcelH0, 1);
    }

    @Override // q2.InterfaceC2853y
    public final void h() {
    }

    @Override // q2.InterfaceC2853y
    public final void j() {
    }

    @Override // q2.InterfaceC2853y
    public final void j0(C2852x0 c2852x0) {
        long j6 = this.f15671b.f15815a;
        int i = c2852x0.f23273a;
        C1677p8 c1677p8 = new C1677p8("interstitial");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onAdFailedToLoad";
        c1677p8.f16140d = Integer.valueOf(i);
        this.f15670a.x(c1677p8);
    }

    @Override // q2.InterfaceC2853y
    public final void z() {
        long j6 = this.f15671b.f15815a;
        C1677p8 c1677p8 = new C1677p8("interstitial");
        c1677p8.f16137a = Long.valueOf(j6);
        c1677p8.f16139c = "onAdClosed";
        this.f15670a.x(c1677p8);
    }
}
