package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v62 extends sb1 implements w62 {
    @Override // defpackage.w62
    public final void A0(u10 u10Var, pc4 pc4Var, String str, String str2, z62 z62Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.c(parcelU, pc4Var);
        parcelU.writeString(str);
        parcelU.writeString(str2);
        iv1.e(parcelU, z62Var);
        M0(parcelU, 7);
    }

    @Override // defpackage.w62
    public final py2 C() {
        Parcel parcelY = Y(U(), 26);
        py2 py2VarB3 = hy2.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return py2VarB3;
    }

    @Override // defpackage.w62
    public final e72 F() {
        e72 d72Var;
        Parcel parcelY = Y(U(), 27);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            d72Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            d72Var = iInterfaceQueryLocalInterface instanceof e72 ? (e72) iInterfaceQueryLocalInterface : new d72(strongBinder);
        }
        parcelY.recycle();
        return d72Var;
    }

    @Override // defpackage.w62
    public final i82 H() {
        Parcel parcelY = Y(U(), 33);
        i82 i82Var = (i82) iv1.b(parcelY, i82.CREATOR);
        parcelY.recycle();
        return i82Var;
    }

    @Override // defpackage.w62
    public final void J0(u10 u10Var, b52 b52Var, ArrayList arrayList) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, b52Var);
        parcelU.writeTypedList(arrayList);
        M0(parcelU, 31);
    }

    @Override // defpackage.w62
    public final boolean K() {
        Parcel parcelY = Y(U(), 22);
        ClassLoader classLoader = iv1.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.w62
    public final void P0(u10 u10Var, xe4 xe4Var, pc4 pc4Var, String str, String str2, z62 z62Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.c(parcelU, xe4Var);
        iv1.c(parcelU, pc4Var);
        parcelU.writeString(str);
        parcelU.writeString(str2);
        iv1.e(parcelU, z62Var);
        M0(parcelU, 6);
    }

    @Override // defpackage.w62
    public final void S() {
        M0(U(), 12);
    }

    @Override // defpackage.w62
    public final void S0(u10 u10Var, pc4 pc4Var, String str, z62 z62Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.c(parcelU, pc4Var);
        parcelU.writeString(str);
        iv1.e(parcelU, z62Var);
        M0(parcelU, 38);
    }

    @Override // defpackage.w62
    public final void U1(String str, pc4 pc4Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, pc4Var);
        parcelU.writeString(str);
        M0(parcelU, 11);
    }

    @Override // defpackage.w62
    public final b72 V() {
        b72 b72Var;
        Parcel parcelY = Y(U(), 15);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            b72Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            b72Var = iInterfaceQueryLocalInterface instanceof b72 ? (b72) iInterfaceQueryLocalInterface : new b72(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper", 2);
        }
        parcelY.recycle();
        return b72Var;
    }

    @Override // defpackage.w62
    public final void V2(u10 u10Var, sa2 sa2Var, List list) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.e(parcelU, sa2Var);
        parcelU.writeStringList(list);
        M0(parcelU, 23);
    }

    @Override // defpackage.w62
    public final i82 Z2() {
        Parcel parcelY = Y(U(), 34);
        i82 i82Var = (i82) iv1.b(parcelY, i82.CREATOR);
        parcelY.recycle();
        return i82Var;
    }

    @Override // defpackage.w62
    public final a72 a0() {
        a72 a72Var;
        Parcel parcelY = Y(U(), 36);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            a72Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            a72Var = iInterfaceQueryLocalInterface instanceof a72 ? (a72) iInterfaceQueryLocalInterface : new a72(strongBinder);
        }
        parcelY.recycle();
        return a72Var;
    }

    @Override // defpackage.w62
    public final void b3(u10 u10Var, pc4 pc4Var, String str, z62 z62Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.c(parcelU, pc4Var);
        parcelU.writeString(str);
        iv1.e(parcelU, z62Var);
        M0(parcelU, 32);
    }

    @Override // defpackage.w62
    public final u10 c() {
        return ga1.j(Y(U(), 2));
    }

    @Override // defpackage.w62
    public final c72 e0() {
        c72 c72Var;
        Parcel parcelY = Y(U(), 16);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            c72Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            c72Var = iInterfaceQueryLocalInterface instanceof c72 ? (c72) iInterfaceQueryLocalInterface : new c72(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper", 2);
        }
        parcelY.recycle();
        return c72Var;
    }

    @Override // defpackage.w62
    public final void e1(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        M0(parcelU, 37);
    }

    @Override // defpackage.w62
    public final void e3(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        M0(parcelU, 39);
    }

    @Override // defpackage.w62
    public final void f() {
        M0(U(), 4);
    }

    @Override // defpackage.w62
    public final void i() {
        M0(U(), 8);
    }

    @Override // defpackage.w62
    public final void i3(boolean z) {
        Parcel parcelU = U();
        ClassLoader classLoader = iv1.a;
        parcelU.writeInt(z ? 1 : 0);
        M0(parcelU, 25);
    }

    @Override // defpackage.w62
    public final void j() {
        M0(U(), 5);
    }

    @Override // defpackage.w62
    public final void l0(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        M0(parcelU, 21);
    }

    @Override // defpackage.w62
    public final void l3(u10 u10Var, pc4 pc4Var, String str, String str2, z62 z62Var, r12 r12Var, ArrayList arrayList) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.c(parcelU, pc4Var);
        parcelU.writeString(str);
        parcelU.writeString(str2);
        iv1.e(parcelU, z62Var);
        iv1.c(parcelU, r12Var);
        parcelU.writeStringList(arrayList);
        M0(parcelU, 14);
    }

    @Override // defpackage.w62
    public final boolean m() {
        Parcel parcelY = Y(U(), 13);
        ClassLoader classLoader = iv1.a;
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.w62
    public final void n() {
        M0(U(), 9);
    }

    @Override // defpackage.w62
    public final void r2(u10 u10Var, xe4 xe4Var, pc4 pc4Var, String str, String str2, z62 z62Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.c(parcelU, xe4Var);
        iv1.c(parcelU, pc4Var);
        parcelU.writeString(str);
        parcelU.writeString(str2);
        iv1.e(parcelU, z62Var);
        M0(parcelU, 35);
    }

    @Override // defpackage.w62
    public final void u1(u10 u10Var, pc4 pc4Var, sa2 sa2Var, String str) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.c(parcelU, pc4Var);
        parcelU.writeString(null);
        iv1.e(parcelU, sa2Var);
        parcelU.writeString(str);
        M0(parcelU, 10);
    }

    @Override // defpackage.w62
    public final void y0(u10 u10Var, pc4 pc4Var, String str, z62 z62Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        iv1.c(parcelU, pc4Var);
        parcelU.writeString(str);
        iv1.e(parcelU, z62Var);
        M0(parcelU, 28);
    }

    @Override // defpackage.w62
    public final void z3(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        M0(parcelU, 30);
    }
}
