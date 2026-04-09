package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dr extends ac.a implements fr {
    public dr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener", 1);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void A1() {
        g1(T(), 6);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void B3(String str, String str2) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        g1(parcelT, 9);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void C() {
        g1(T(), 25);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void C1() {
        g1(T(), 5);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void D1() {
        g1(T(), 8);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void E2() {
        g1(T(), 18);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void F(int i4) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void G() {
        g1(T(), 20);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void H(String str) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        g1(parcelT, 21);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void H1() {
        g1(T(), 13);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void I3(va.w1 w1Var) {
        Parcel parcelT = T();
        ng.c(parcelT, w1Var);
        g1(parcelT, 23);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void K() {
        g1(T(), 11);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void P1(int i4) {
        Parcel parcelT = T();
        parcelT.writeInt(i4);
        g1(parcelT, 3);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void Z1(zu zuVar) {
        Parcel parcelT = T();
        ng.e(parcelT, zuVar);
        g1(parcelT, 16);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void a1(xu xuVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void a4(int i4, String str) {
        Parcel parcelT = T();
        parcelT.writeInt(i4);
        parcelT.writeString(str);
        g1(parcelT, 22);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void c() {
        g1(T(), 1);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void c1(va.w1 w1Var) {
        Parcel parcelT = T();
        ng.c(parcelT, w1Var);
        g1(parcelT, 24);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void d() {
        g1(T(), 2);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void l() {
        g1(T(), 15);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void q1(jn jnVar, String str) {
        Parcel parcelT = T();
        ng.e(parcelT, jnVar);
        parcelT.writeString(str);
        g1(parcelT, 10);
    }

    @Override // com.google.android.gms.internal.ads.fr
    public final void z1() {
        g1(T(), 4);
    }
}
