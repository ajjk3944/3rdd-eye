package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class br extends ac.a implements cr {
    @Override // com.google.android.gms.internal.ads.cr
    public final ir B() {
        ir irVar;
        Parcel parcelR0 = r0(T(), 15);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            irVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            irVar = iInterfaceQueryLocalInterface instanceof ir ? (ir) iInterfaceQueryLocalInterface : new ir(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper", 1);
        }
        parcelR0.recycle();
        return irVar;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void B1() {
        g1(T(), 8);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void C0(vb.a aVar, va.z2 z2Var, String str, fr frVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.c(parcelT, z2Var);
        parcelT.writeString(str);
        ng.e(parcelT, frVar);
        g1(parcelT, 38);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void C1() {
        g1(T(), 5);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final boolean E1() {
        Parcel parcelR0 = r0(T(), 13);
        ClassLoader classLoader = ng.f14287a;
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void F1() {
        g1(T(), 9);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void F2(vb.a aVar, va.z2 z2Var, String str, fr frVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.c(parcelT, z2Var);
        parcelT.writeString(str);
        ng.e(parcelT, frVar);
        g1(parcelT, 32);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void G0(vb.a aVar, va.z2 z2Var, wu wuVar, String str) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.c(parcelT, z2Var);
        parcelT.writeString(null);
        ng.e(parcelT, wuVar);
        parcelT.writeString(str);
        g1(parcelT, 10);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void I0(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        g1(parcelT, 30);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final boolean O1() {
        Parcel parcelR0 = r0(T(), 22);
        ClassLoader classLoader = ng.f14287a;
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void Q2(vb.a aVar, va.z2 z2Var, String str, String str2, fr frVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.c(parcelT, z2Var);
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ng.e(parcelT, frVar);
        g1(parcelT, 7);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void R() {
        g1(T(), 12);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void R0(vb.a aVar, va.z2 z2Var, String str, fr frVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.c(parcelT, z2Var);
        parcelT.writeString(str);
        ng.e(parcelT, frVar);
        g1(parcelT, 28);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void S0(vb.a aVar, va.c3 c3Var, va.z2 z2Var, String str, String str2, fr frVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.c(parcelT, c3Var);
        ng.c(parcelT, z2Var);
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ng.e(parcelT, frVar);
        g1(parcelT, 35);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final gr U() {
        gr grVar;
        Parcel parcelR0 = r0(T(), 36);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            grVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            grVar = iInterfaceQueryLocalInterface instanceof gr ? (gr) iInterfaceQueryLocalInterface : new gr(strongBinder);
        }
        parcelR0.recycle();
        return grVar;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void V0(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        g1(parcelT, 39);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final jr X() {
        jr jrVar;
        Parcel parcelR0 = r0(T(), 16);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            jrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            jrVar = iInterfaceQueryLocalInterface instanceof jr ? (jr) iInterfaceQueryLocalInterface : new jr(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper", 1);
        }
        parcelR0.recycle();
        return jrVar;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void Y3(vb.a aVar, va.c3 c3Var, va.z2 z2Var, String str, String str2, fr frVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.c(parcelT, c3Var);
        ng.c(parcelT, z2Var);
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ng.e(parcelT, frVar);
        g1(parcelT, 6);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final os a0() {
        Parcel parcelR0 = r0(T(), 34);
        os osVar = (os) ng.b(parcelR0, os.CREATOR);
        parcelR0.recycle();
        return osVar;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final vb.a d() {
        return r5.c.p(r0(T(), 2));
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void f0(vb.a aVar, wu wuVar, List list) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.e(parcelT, wuVar);
        parcelT.writeStringList(list);
        g1(parcelT, 23);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void f4(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        g1(parcelT, 37);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void g2(boolean z3) {
        Parcel parcelT = T();
        ClassLoader classLoader = ng.f14287a;
        parcelT.writeInt(z3 ? 1 : 0);
        g1(parcelT, 25);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void i2(vb.a aVar, va.z2 z2Var, String str, String str2, fr frVar, qm qmVar, ArrayList arrayList) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.c(parcelT, z2Var);
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ng.e(parcelT, frVar);
        ng.c(parcelT, qmVar);
        parcelT.writeStringList(arrayList);
        g1(parcelT, 14);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void o3(String str, va.z2 z2Var) {
        Parcel parcelT = T();
        ng.c(parcelT, z2Var);
        parcelT.writeString(str);
        g1(parcelT, 11);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void p2(vb.a aVar, kp kpVar, ArrayList arrayList) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.e(parcelT, kpVar);
        parcelT.writeTypedList(arrayList);
        g1(parcelT, 31);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final va.a2 r() {
        Parcel parcelR0 = r0(T(), 26);
        va.a2 a2VarH4 = va.z1.h4(parcelR0.readStrongBinder());
        parcelR0.recycle();
        return a2VarH4;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final lr s() {
        lr krVar;
        Parcel parcelR0 = r0(T(), 27);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            krVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            krVar = iInterfaceQueryLocalInterface instanceof lr ? (lr) iInterfaceQueryLocalInterface : new kr(strongBinder);
        }
        parcelR0.recycle();
        return krVar;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final os t() {
        Parcel parcelR0 = r0(T(), 33);
        os osVar = (os) ng.b(parcelR0, os.CREATOR);
        parcelR0.recycle();
        return osVar;
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void w(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        g1(parcelT, 21);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void z1() {
        g1(T(), 4);
    }
}
