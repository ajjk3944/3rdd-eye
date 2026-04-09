package zc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v extends com.google.android.gms.internal.measurement.x implements x {
    public v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 0);
    }

    @Override // zc.x
    public final zzao A(zzr zzrVar) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        Parcel parcelF = f(parcelR, 21);
        zzao zzaoVar = (zzao) com.google.android.gms.internal.measurement.z.a(parcelF, zzao.CREATOR);
        parcelF.recycle();
        return zzaoVar;
    }

    @Override // zc.x
    public final void B(Bundle bundle, zzr zzrVar) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, bundle);
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        S(parcelR, 19);
    }

    @Override // zc.x
    public final void D(zzr zzrVar, Bundle bundle, z zVar) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        com.google.android.gms.internal.measurement.z.b(parcelR, bundle);
        com.google.android.gms.internal.measurement.z.c(parcelR, zVar);
        S(parcelR, 31);
    }

    @Override // zc.x
    public final void E(zzr zzrVar) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        S(parcelR, 4);
    }

    @Override // zc.x
    public final void G(zzr zzrVar) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        S(parcelR, 27);
    }

    @Override // zc.x
    public final List I(String str, String str2, boolean z10, zzr zzrVar) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f5276a;
        parcelR.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        Parcel parcelF = f(parcelR, 14);
        ArrayList arrayListCreateTypedArrayList = parcelF.createTypedArrayList(zzpl.CREATOR);
        parcelF.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // zc.x
    public final String M(zzr zzrVar) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        Parcel parcelF = f(parcelR, 11);
        String string = parcelF.readString();
        parcelF.recycle();
        return string;
    }

    @Override // zc.x
    public final List N(String str, String str2, zzr zzrVar) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        Parcel parcelF = f(parcelR, 16);
        ArrayList arrayListCreateTypedArrayList = parcelF.createTypedArrayList(zzah.CREATOR);
        parcelF.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // zc.x
    public final void Q(zzr zzrVar) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        S(parcelR, 20);
    }

    @Override // zc.x
    public final List g(String str, String str2, String str3, boolean z10) {
        Parcel parcelR = R();
        parcelR.writeString(null);
        parcelR.writeString(str2);
        parcelR.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f5276a;
        parcelR.writeInt(z10 ? 1 : 0);
        Parcel parcelF = f(parcelR, 15);
        ArrayList arrayListCreateTypedArrayList = parcelF.createTypedArrayList(zzpl.CREATOR);
        parcelF.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // zc.x
    public final void h(zzah zzahVar, zzr zzrVar) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzahVar);
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        S(parcelR, 12);
    }

    @Override // zc.x
    public final void k(long j, String str, String str2, String str3) {
        Parcel parcelR = R();
        parcelR.writeLong(j);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        parcelR.writeString(str3);
        S(parcelR, 10);
    }

    @Override // zc.x
    public final void m(zzr zzrVar) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        S(parcelR, 18);
    }

    @Override // zc.x
    public final List o(String str, String str2, String str3) {
        Parcel parcelR = R();
        parcelR.writeString(null);
        parcelR.writeString(str2);
        parcelR.writeString(str3);
        Parcel parcelF = f(parcelR, 17);
        ArrayList arrayListCreateTypedArrayList = parcelF.createTypedArrayList(zzah.CREATOR);
        parcelF.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // zc.x
    public final void p(zzr zzrVar) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        S(parcelR, 25);
    }

    @Override // zc.x
    public final void q(zzr zzrVar, zzoo zzooVar, b0 b0Var) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        com.google.android.gms.internal.measurement.z.b(parcelR, zzooVar);
        com.google.android.gms.internal.measurement.z.c(parcelR, b0Var);
        S(parcelR, 29);
    }

    @Override // zc.x
    public final void s(zzbg zzbgVar, zzr zzrVar) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzbgVar);
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        S(parcelR, 1);
    }

    @Override // zc.x
    public final void t(zzr zzrVar) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        S(parcelR, 6);
    }

    @Override // zc.x
    public final void u(zzr zzrVar) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        S(parcelR, 26);
    }

    @Override // zc.x
    public final void w(zzr zzrVar, zzaf zzafVar) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        com.google.android.gms.internal.measurement.z.b(parcelR, zzafVar);
        S(parcelR, 30);
    }

    @Override // zc.x
    public final byte[] x(zzbg zzbgVar, String str) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzbgVar);
        parcelR.writeString(str);
        Parcel parcelF = f(parcelR, 9);
        byte[] bArrCreateByteArray = parcelF.createByteArray();
        parcelF.recycle();
        return bArrCreateByteArray;
    }

    @Override // zc.x
    public final void z(zzpl zzplVar, zzr zzrVar) {
        Parcel parcelR = R();
        com.google.android.gms.internal.measurement.z.b(parcelR, zzplVar);
        com.google.android.gms.internal.measurement.z.b(parcelR, zzrVar);
        S(parcelR, 2);
    }
}
