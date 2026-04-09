package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dt extends ac.a implements ft {
    public dt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay", 1);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void A1() {
        g1(T(), 3);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void B1() {
        g1(T(), 5);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void C1() {
        g1(T(), 2);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void D(Bundle bundle) {
        Parcel parcelT = T();
        ng.c(parcelT, bundle);
        Parcel parcelR0 = r0(parcelT, 6);
        if (parcelR0.readInt() != 0) {
            bundle.readFromParcel(parcelR0);
        }
        parcelR0.recycle();
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void D1() {
        g1(T(), 4);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void J1() {
        g1(T(), 9);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void P0(int i4, String[] strArr, int[] iArr) {
        Parcel parcelT = T();
        parcelT.writeInt(i4);
        parcelT.writeStringArray(strArr);
        parcelT.writeIntArray(iArr);
        g1(parcelT, 15);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void P3(Bundle bundle) {
        Parcel parcelT = T();
        ng.c(parcelT, bundle);
        g1(parcelT, 1);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void R() {
        g1(T(), 7);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void Z0(int i4, int i10, Intent intent) {
        Parcel parcelT = T();
        parcelT.writeInt(i4);
        parcelT.writeInt(i10);
        ng.c(parcelT, intent);
        g1(parcelT, 12);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void c() {
        g1(T(), 10);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void d() {
        g1(T(), 14);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final boolean e() {
        Parcel parcelR0 = r0(T(), 11);
        ClassLoader classLoader = ng.f14287a;
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void l() {
        g1(T(), 8);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void v(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        g1(parcelT, 13);
    }
}
