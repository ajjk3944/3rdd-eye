package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wn extends ac.a implements xn {
    @Override // com.google.android.gms.internal.ads.xn
    public final String A1() {
        Parcel parcelR0 = r0(T(), 7);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final String B1() {
        Parcel parcelR0 = r0(T(), 9);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final String C1() {
        Parcel parcelR0 = r0(T(), 6);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final double D1() {
        Parcel parcelR0 = r0(T(), 8);
        double d10 = parcelR0.readDouble();
        parcelR0.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final tm E1() {
        tm rmVar;
        Parcel parcelR0 = r0(T(), 14);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            rmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            rmVar = iInterfaceQueryLocalInterface instanceof tm ? (tm) iInterfaceQueryLocalInterface : new rm(strongBinder);
        }
        parcelR0.recycle();
        return rmVar;
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final String F1() {
        Parcel parcelR0 = r0(T(), 10);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final va.a2 G1() {
        Parcel parcelR0 = r0(T(), 11);
        va.a2 a2VarH4 = va.z1.h4(parcelR0.readStrongBinder());
        parcelR0.recycle();
        return a2VarH4;
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final void J2(Bundle bundle) {
        Parcel parcelT = T();
        ng.c(parcelT, bundle);
        g1(parcelT, 33);
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final vb.a M1() {
        return r5.c.p(r0(T(), 18));
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final String c() {
        Parcel parcelR0 = r0(T(), 2);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final List d() {
        Parcel parcelR0 = r0(T(), 3);
        ArrayList arrayList = parcelR0.readArrayList(ng.f14287a);
        parcelR0.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final void d2(va.r1 r1Var) {
        Parcel parcelT = T();
        ng.e(parcelT, r1Var);
        g1(parcelT, 32);
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final String e() {
        Parcel parcelR0 = r0(T(), 4);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final vb.a i() {
        return r5.c.p(r0(T(), 19));
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final va.x1 t() {
        Parcel parcelR0 = r0(T(), 31);
        va.x1 x1VarH4 = c60.h4(parcelR0.readStrongBinder());
        parcelR0.recycle();
        return x1VarH4;
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final List z() {
        Parcel parcelR0 = r0(T(), 23);
        ArrayList arrayList = parcelR0.readArrayList(ng.f14287a);
        parcelR0.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.xn
    public final xm z1() {
        xm wmVar;
        Parcel parcelR0 = r0(T(), 5);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            wmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            wmVar = iInterfaceQueryLocalInterface instanceof xm ? (xm) iInterfaceQueryLocalInterface : new wm(strongBinder);
        }
        parcelR0.recycle();
        return wmVar;
    }
}
