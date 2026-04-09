package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC4298a0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4967u2 extends com.google.android.gms.internal.measurement.Y implements InterfaceC4951s2 {
    C4967u2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void D(t7 t7Var) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, t7Var);
        f(25, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void G(long j10, String str, String str2, String str3) {
        Parcel parcelB = b();
        parcelB.writeLong(j10);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        f(10, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final C4917o H(t7 t7Var) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, t7Var);
        Parcel parcelC = c(21, parcelB);
        C4917o c4917o = (C4917o) AbstractC4298a0.a(parcelC, C4917o.CREATOR);
        parcelC.recycle();
        return c4917o;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final List I(String str, String str2, String str3) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        Parcel parcelC = c(17, parcelB);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(C4877j.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void J(Bundle bundle, t7 t7Var) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, bundle);
        AbstractC4298a0.d(parcelB, t7Var);
        f(19, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void N(t7 t7Var, C4861h c4861h) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, t7Var);
        AbstractC4298a0.d(parcelB, c4861h);
        f(30, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void O(t7 t7Var, Q6 q62, InterfaceC4999y2 interfaceC4999y2) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, t7Var);
        AbstractC4298a0.d(parcelB, q62);
        AbstractC4298a0.c(parcelB, interfaceC4999y2);
        f(29, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void Q(t7 t7Var) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, t7Var);
        f(26, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void X(L l10, t7 t7Var) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, l10);
        AbstractC4298a0.d(parcelB, t7Var);
        f(1, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void a0(t7 t7Var) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, t7Var);
        f(6, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final List c0(String str, String str2, t7 t7Var) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC4298a0.d(parcelB, t7Var);
        Parcel parcelC = c(16, parcelB);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(C4877j.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void d0(t7 t7Var) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, t7Var);
        f(18, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final String e(t7 t7Var) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, t7Var);
        Parcel parcelC = c(11, parcelB);
        String string = parcelC.readString();
        parcelC.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void g(C4877j c4877j) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, c4877j);
        f(13, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void g0(t7 t7Var, Bundle bundle, InterfaceC4959t2 interfaceC4959t2) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, t7Var);
        AbstractC4298a0.d(parcelB, bundle);
        AbstractC4298a0.c(parcelB, interfaceC4959t2);
        f(31, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final List h(t7 t7Var, Bundle bundle) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, t7Var);
        AbstractC4298a0.d(parcelB, bundle);
        Parcel parcelC = c(24, parcelB);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(K6.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void i(C4877j c4877j, t7 t7Var) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, c4877j);
        AbstractC4298a0.d(parcelB, t7Var);
        f(12, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void j0(L l10, String str, String str2) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, l10);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        f(5, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void k0(t7 t7Var) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, t7Var);
        f(20, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final List m0(String str, String str2, boolean z10, t7 t7Var) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC4298a0.e(parcelB, z10);
        AbstractC4298a0.d(parcelB, t7Var);
        Parcel parcelC = c(14, parcelB);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(r7.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void o(r7 r7Var, t7 t7Var) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, r7Var);
        AbstractC4298a0.d(parcelB, t7Var);
        f(2, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final List p(String str, String str2, String str3, boolean z10) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        AbstractC4298a0.e(parcelB, z10);
        Parcel parcelC = c(15, parcelB);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(r7.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void t(t7 t7Var) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, t7Var);
        f(27, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final void u(t7 t7Var) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, t7Var);
        f(4, parcelB);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4951s2
    public final byte[] x(L l10, String str) {
        Parcel parcelB = b();
        AbstractC4298a0.d(parcelB, l10);
        parcelB.writeString(str);
        Parcel parcelC = c(9, parcelB);
        byte[] bArrCreateByteArray = parcelC.createByteArray();
        parcelC.recycle();
        return bArrCreateByteArray;
    }
}
