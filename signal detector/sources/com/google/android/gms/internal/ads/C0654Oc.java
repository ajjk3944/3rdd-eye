package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.Oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654Oc extends W2.a implements InterfaceC0688Qc {
    public C0654Oc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void D3(int i, String str) {
        Parcel parcelH0 = h0();
        parcelH0.writeInt(i);
        parcelH0.writeString(str);
        I0(parcelH0, 22);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void I1(InterfaceC0554Ie interfaceC0554Ie) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC0554Ie);
        I0(parcelH0, 16);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void T() {
        I0(h0(), 25);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void U(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void W() {
        I0(h0(), 20);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void X(String str) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        I0(parcelH0, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void Z() {
        I0(h0(), 11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void Z0(C2852x0 c2852x0) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, c2852x0);
        I0(parcelH0, 24);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void b() {
        I0(h0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void d() {
        I0(h0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void d3(C2852x0 c2852x0) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, c2852x0);
        I0(parcelH0, 23);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void f3(String str, String str2) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        I0(parcelH0, 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void g() {
        I0(h0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void h() {
        I0(h0(), 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void j() {
        I0(h0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void k() {
        I0(h0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void k2() {
        I0(h0(), 18);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void m1(C0520Ge c0520Ge) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void o0(int i) {
        Parcel parcelH0 = h0();
        parcelH0.writeInt(i);
        I0(parcelH0, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void p() {
        I0(h0(), 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void t1(InterfaceC0839Za interfaceC0839Za, String str) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC0839Za);
        parcelH0.writeString(str);
        I0(parcelH0, 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0688Qc
    public final void y() {
        I0(h0(), 15);
    }
}
