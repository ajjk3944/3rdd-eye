package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import o4.AbstractC2763b;

/* renamed from: com.google.android.gms.internal.ads.Mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0620Mc extends W2.a implements InterfaceC0637Nc {
    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final boolean G() {
        Parcel parcelK0 = k0(h0(), 22);
        ClassLoader classLoader = C7.f7544a;
        boolean z6 = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final q2.B0 H() {
        Parcel parcelK0 = k0(h0(), 26);
        q2.B0 b0K3 = q2.A0.K3(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return b0K3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void I() {
        I0(h0(), 12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final InterfaceC0790Wc J() {
        InterfaceC0790Wc c0773Vc;
        Parcel parcelK0 = k0(h0(), 27);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c0773Vc = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            c0773Vc = iInterfaceQueryLocalInterface instanceof InterfaceC0790Wc ? (InterfaceC0790Wc) iInterfaceQueryLocalInterface : new C0773Vc(strongBinder);
        }
        parcelK0.recycle();
        return c0773Vc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final C2184yd K() {
        Parcel parcelK0 = k0(h0(), 33);
        C2184yd c2184yd = (C2184yd) C7.b(parcelK0, C2184yd.CREATOR);
        parcelK0.recycle();
        return c2184yd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void M2(String str, q2.a1 a1Var) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, a1Var);
        parcelH0.writeString(str);
        I0(parcelH0, 11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void O1(boolean z6) {
        Parcel parcelH0 = h0();
        ClassLoader classLoader = C7.f7544a;
        parcelH0.writeInt(z6 ? 1 : 0);
        I0(parcelH0, 25);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void P1(S2.a aVar, q2.a1 a1Var, String str, InterfaceC0688Qc interfaceC0688Qc) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.c(parcelH0, a1Var);
        parcelH0.writeString(str);
        C7.e(parcelH0, interfaceC0688Qc);
        I0(parcelH0, 32);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void Q0(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        I0(parcelH0, 30);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final C0739Tc R() {
        C0739Tc c0739Tc;
        Parcel parcelK0 = k0(h0(), 15);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c0739Tc = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            c0739Tc = iInterfaceQueryLocalInterface instanceof C0739Tc ? (C0739Tc) iInterfaceQueryLocalInterface : new C0739Tc(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper", 2);
        }
        parcelK0.recycle();
        return c0739Tc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void U2(S2.a aVar, q2.d1 d1Var, q2.a1 a1Var, String str, String str2, InterfaceC0688Qc interfaceC0688Qc) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.c(parcelH0, d1Var);
        C7.c(parcelH0, a1Var);
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        C7.e(parcelH0, interfaceC0688Qc);
        I0(parcelH0, 35);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void V0(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        I0(parcelH0, 39);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void Z1(S2.a aVar, q2.d1 d1Var, q2.a1 a1Var, String str, String str2, InterfaceC0688Qc interfaceC0688Qc) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.c(parcelH0, d1Var);
        C7.c(parcelH0, a1Var);
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        C7.e(parcelH0, interfaceC0688Qc);
        I0(parcelH0, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void b2(S2.a aVar, q2.a1 a1Var, String str, String str2, InterfaceC0688Qc interfaceC0688Qc) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.c(parcelH0, a1Var);
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        C7.e(parcelH0, interfaceC0688Qc);
        I0(parcelH0, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final S2.a d() {
        return AbstractC2763b.c(k0(h0(), 2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void e1(S2.a aVar, q2.a1 a1Var, InterfaceC0503Fe interfaceC0503Fe, String str) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.c(parcelH0, a1Var);
        parcelH0.writeString(null);
        C7.e(parcelH0, interfaceC0503Fe);
        parcelH0.writeString(str);
        I0(parcelH0, 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void e2(S2.a aVar, InterfaceC0806Xb interfaceC0806Xb, ArrayList arrayList) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.e(parcelH0, interfaceC0806Xb);
        parcelH0.writeTypedList(arrayList);
        I0(parcelH0, 31);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void g() {
        I0(h0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void g3(S2.a aVar, InterfaceC0503Fe interfaceC0503Fe, List list) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.e(parcelH0, interfaceC0503Fe);
        parcelH0.writeStringList(list);
        I0(parcelH0, 23);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void h3(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        I0(parcelH0, 37);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void i() {
        I0(h0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final C0705Rc i0() {
        C0705Rc c0705Rc;
        Parcel parcelK0 = k0(h0(), 36);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c0705Rc = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            c0705Rc = iInterfaceQueryLocalInterface instanceof C0705Rc ? (C0705Rc) iInterfaceQueryLocalInterface : new C0705Rc(strongBinder);
        }
        parcelK0.recycle();
        return c0705Rc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void j() {
        I0(h0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void k3(S2.a aVar, q2.a1 a1Var, String str, String str2, InterfaceC0688Qc interfaceC0688Qc, C0499Fa c0499Fa, ArrayList arrayList) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.c(parcelH0, a1Var);
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        C7.e(parcelH0, interfaceC0688Qc);
        C7.c(parcelH0, c0499Fa);
        parcelH0.writeStringList(arrayList);
        I0(parcelH0, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final boolean l() {
        Parcel parcelK0 = k0(h0(), 13);
        ClassLoader classLoader = C7.f7544a;
        boolean z6 = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final C0756Uc l0() {
        C0756Uc c0756Uc;
        Parcel parcelK0 = k0(h0(), 16);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c0756Uc = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            c0756Uc = iInterfaceQueryLocalInterface instanceof C0756Uc ? (C0756Uc) iInterfaceQueryLocalInterface : new C0756Uc(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper", 2);
        }
        parcelK0.recycle();
        return c0756Uc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void m0(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        I0(parcelH0, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void n() {
        I0(h0(), 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final C2184yd s3() {
        Parcel parcelK0 = k0(h0(), 34);
        C2184yd c2184yd = (C2184yd) C7.b(parcelK0, C2184yd.CREATOR);
        parcelK0.recycle();
        return c2184yd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void w0(S2.a aVar, q2.a1 a1Var, String str, InterfaceC0688Qc interfaceC0688Qc) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.c(parcelH0, a1Var);
        parcelH0.writeString(str);
        C7.e(parcelH0, interfaceC0688Qc);
        I0(parcelH0, 38);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0637Nc
    public final void y0(S2.a aVar, q2.a1 a1Var, String str, InterfaceC0688Qc interfaceC0688Qc) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.c(parcelH0, a1Var);
        parcelH0.writeString(str);
        C7.e(parcelH0, interfaceC0688Qc);
        I0(parcelH0, 28);
    }
}
