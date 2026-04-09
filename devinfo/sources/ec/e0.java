package ec;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e0 extends ac.a implements g0 {
    public e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 2);
    }

    @Override // ec.g0
    public final void B2(i4 i4Var, n4 n4Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, i4Var);
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        e0(parcelT, 2);
    }

    @Override // ec.g0
    public final void H3(n4 n4Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        e0(parcelT, 26);
    }

    @Override // ec.g0
    public final void J3(n4 n4Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        e0(parcelT, 6);
    }

    @Override // ec.g0
    public final void M0(long j, String str, String str2, String str3) {
        Parcel parcelT = T();
        parcelT.writeLong(j);
        parcelT.writeString(str);
        parcelT.writeString(str2);
        parcelT.writeString(str3);
        e0(parcelT, 10);
    }

    @Override // ec.g0
    public final void O0(n4 n4Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        e0(parcelT, 25);
    }

    @Override // ec.g0
    public final void R3(n4 n4Var, d dVar) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        com.google.android.gms.internal.measurement.y.b(parcelT, dVar);
        e0(parcelT, 30);
    }

    @Override // ec.g0
    public final void X0(Bundle bundle, n4 n4Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, bundle);
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        e0(parcelT, 19);
    }

    @Override // ec.g0
    public final List b1(String str, String str2, boolean z3, n4 n4Var) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.y.f20039a;
        parcelT.writeInt(z3 ? 1 : 0);
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        Parcel parcelS = S(parcelT, 14);
        ArrayList arrayListCreateTypedArrayList = parcelS.createTypedArrayList(i4.CREATOR);
        parcelS.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ec.g0
    public final void c3(n4 n4Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        e0(parcelT, 18);
    }

    @Override // ec.g0
    public final void e2(e eVar, n4 n4Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, eVar);
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        e0(parcelT, 12);
    }

    @Override // ec.g0
    public final void e3(n4 n4Var, z3 z3Var, k0 k0Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        com.google.android.gms.internal.measurement.y.b(parcelT, z3Var);
        com.google.android.gms.internal.measurement.y.c(parcelT, k0Var);
        e0(parcelT, 29);
    }

    @Override // ec.g0
    public final void f3(n4 n4Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        e0(parcelT, 27);
    }

    @Override // ec.g0
    public final List h0(String str, String str2, String str3, boolean z3) {
        Parcel parcelT = T();
        parcelT.writeString(null);
        parcelT.writeString(str2);
        parcelT.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.y.f20039a;
        parcelT.writeInt(z3 ? 1 : 0);
        Parcel parcelS = S(parcelT, 15);
        ArrayList arrayListCreateTypedArrayList = parcelS.createTypedArrayList(i4.CREATOR);
        parcelS.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ec.g0
    public final void i1(n4 n4Var, Bundle bundle, i0 i0Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        com.google.android.gms.internal.measurement.y.b(parcelT, bundle);
        com.google.android.gms.internal.measurement.y.c(parcelT, i0Var);
        e0(parcelT, 31);
    }

    @Override // ec.g0
    public final byte[] j2(u uVar, String str) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, uVar);
        parcelT.writeString(str);
        Parcel parcelS = S(parcelT, 9);
        byte[] bArrCreateByteArray = parcelS.createByteArray();
        parcelS.recycle();
        return bArrCreateByteArray;
    }

    @Override // ec.g0
    public final List k1(String str, String str2, n4 n4Var) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        Parcel parcelS = S(parcelT, 16);
        ArrayList arrayListCreateTypedArrayList = parcelS.createTypedArrayList(e.CREATOR);
        parcelS.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ec.g0
    public final void m0(n4 n4Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        e0(parcelT, 4);
    }

    @Override // ec.g0
    public final String m1(n4 n4Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        Parcel parcelS = S(parcelT, 11);
        String string = parcelS.readString();
        parcelS.recycle();
        return string;
    }

    @Override // ec.g0
    public final i m2(n4 n4Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        Parcel parcelS = S(parcelT, 21);
        i iVar = (i) com.google.android.gms.internal.measurement.y.a(parcelS, i.CREATOR);
        parcelS.recycle();
        return iVar;
    }

    @Override // ec.g0
    public final List n1(String str, String str2, String str3) {
        Parcel parcelT = T();
        parcelT.writeString(null);
        parcelT.writeString(str2);
        parcelT.writeString(str3);
        Parcel parcelS = S(parcelT, 17);
        ArrayList arrayListCreateTypedArrayList = parcelS.createTypedArrayList(e.CREATOR);
        parcelS.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ec.g0
    public final void v0(u uVar, n4 n4Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, uVar);
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        e0(parcelT, 1);
    }

    @Override // ec.g0
    public final void w1(n4 n4Var) {
        Parcel parcelT = T();
        com.google.android.gms.internal.measurement.y.b(parcelT, n4Var);
        e0(parcelT, 20);
    }
}
