package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hs extends ac.a implements is {
    @Override // com.google.android.gms.internal.ads.is
    public final void B0(String str, String str2, va.z2 z2Var, vb.a aVar, gs gsVar, fr frVar) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ng.c(parcelT, z2Var);
        ng.e(parcelT, aVar);
        ng.e(parcelT, gsVar);
        ng.e(parcelT, frVar);
        g1(parcelT, 16);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final boolean F3(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        Parcel parcelR0 = r0(parcelT, 17);
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void K0(String str, String str2, va.z2 z2Var, vb.a aVar, cs csVar, fr frVar) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ng.c(parcelT, z2Var);
        ng.e(parcelT, aVar);
        ng.e(parcelT, csVar);
        ng.e(parcelT, frVar);
        g1(parcelT, 14);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final boolean O2(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        Parcel parcelR0 = r0(parcelT, 15);
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void U2(String str) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        g1(parcelT, 19);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final boolean V(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        Parcel parcelR0 = r0(parcelT, 24);
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void W2(String str, String str2, va.z2 z2Var, vb.a aVar, as asVar, fr frVar, va.c3 c3Var) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ng.c(parcelT, z2Var);
        ng.e(parcelT, aVar);
        ng.e(parcelT, asVar);
        ng.e(parcelT, frVar);
        ng.c(parcelT, c3Var);
        g1(parcelT, 13);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final os d() {
        Parcel parcelR0 = r0(T(), 2);
        os osVar = (os) ng.b(parcelR0, os.CREATOR);
        parcelR0.recycle();
        return osVar;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final os e() {
        Parcel parcelR0 = r0(T(), 3);
        os osVar = (os) ng.b(parcelR0, os.CREATOR);
        parcelR0.recycle();
        return osVar;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void h1(String str, String str2, va.z2 z2Var, vb.b bVar, dj0 dj0Var, fr frVar) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ng.c(parcelT, z2Var);
        ng.e(parcelT, bVar);
        ng.e(parcelT, dj0Var);
        ng.e(parcelT, frVar);
        g1(parcelT, 18);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void k3(String str, String str2, va.z2 z2Var, vb.a aVar, as asVar, fr frVar, va.c3 c3Var) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ng.c(parcelT, z2Var);
        ng.e(parcelT, aVar);
        ng.e(parcelT, asVar);
        ng.e(parcelT, frVar);
        ng.c(parcelT, c3Var);
        g1(parcelT, 21);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void l0(String str, String str2, va.z2 z2Var, vb.a aVar, es esVar, fr frVar, qm qmVar) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ng.c(parcelT, z2Var);
        ng.e(parcelT, aVar);
        ng.e(parcelT, esVar);
        ng.e(parcelT, frVar);
        ng.c(parcelT, qmVar);
        g1(parcelT, 22);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void l2(String str, String str2, va.z2 z2Var, vb.a aVar, yr yrVar, fr frVar) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ng.c(parcelT, z2Var);
        ng.e(parcelT, aVar);
        ng.e(parcelT, yrVar);
        ng.e(parcelT, frVar);
        g1(parcelT, 23);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void q3(String str, String str2, va.z2 z2Var, vb.a aVar, gs gsVar, fr frVar) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ng.c(parcelT, z2Var);
        ng.e(parcelT, aVar);
        ng.e(parcelT, gsVar);
        ng.e(parcelT, frVar);
        g1(parcelT, 20);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void x0(vb.a aVar, String str, Bundle bundle, Bundle bundle2, va.c3 c3Var, ks ksVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        parcelT.writeString(str);
        ng.c(parcelT, bundle);
        ng.c(parcelT, bundle2);
        ng.c(parcelT, c3Var);
        ng.e(parcelT, ksVar);
        g1(parcelT, 1);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final va.a2 z1() {
        Parcel parcelR0 = r0(T(), 5);
        va.a2 a2VarH4 = va.z1.h4(parcelR0.readStrongBinder());
        parcelR0.recycle();
        return a2VarH4;
    }
}
