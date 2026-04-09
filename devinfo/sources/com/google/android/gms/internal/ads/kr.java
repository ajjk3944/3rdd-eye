package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kr extends ac.a implements lr {
    public kr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper", 1);
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final String A1() {
        Parcel parcelR0 = r0(T(), 7);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final String B1() {
        Parcel parcelR0 = r0(T(), 9);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final String C1() {
        Parcel parcelR0 = r0(T(), 6);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final double D1() {
        Parcel parcelR0 = r0(T(), 8);
        double d10 = parcelR0.readDouble();
        parcelR0.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final vb.a E1() {
        return r5.c.p(r0(T(), 14));
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final String F1() {
        Parcel parcelR0 = r0(T(), 10);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final boolean G() {
        Parcel parcelR0 = r0(T(), 18);
        ClassLoader classLoader = ng.f14287a;
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final va.a2 G1() {
        Parcel parcelR0 = r0(T(), 11);
        va.a2 a2VarH4 = va.z1.h4(parcelR0.readStrongBinder());
        parcelR0.recycle();
        return a2VarH4;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final tm H1() {
        Parcel parcelR0 = r0(T(), 12);
        tm tmVarH4 = sm.h4(parcelR0.readStrongBinder());
        parcelR0.recycle();
        return tmVarH4;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final vb.a I1() {
        return r5.c.p(r0(T(), 13));
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final Bundle J1() {
        Parcel parcelR0 = r0(T(), 16);
        Bundle bundle = (Bundle) ng.b(parcelR0, Bundle.CREATOR);
        parcelR0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final vb.a L1() {
        return r5.c.p(r0(T(), 15));
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final boolean N1() {
        Parcel parcelR0 = r0(T(), 17);
        ClassLoader classLoader = ng.f14287a;
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final String c() {
        Parcel parcelR0 = r0(T(), 2);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final List d() {
        Parcel parcelR0 = r0(T(), 3);
        ArrayList arrayList = parcelR0.readArrayList(ng.f14287a);
        parcelR0.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final String e() {
        Parcel parcelR0 = r0(T(), 4);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final void e1(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        g1(parcelT, 22);
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final void i() {
        g1(T(), 19);
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final void k0(vb.a aVar, vb.a aVar2, vb.a aVar3) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.e(parcelT, aVar2);
        ng.e(parcelT, aVar3);
        g1(parcelT, 21);
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final float r() {
        Parcel parcelR0 = r0(T(), 25);
        float f10 = parcelR0.readFloat();
        parcelR0.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final void s() {
        g1(T(), 26);
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final float u() {
        Parcel parcelR0 = r0(T(), 24);
        float f10 = parcelR0.readFloat();
        parcelR0.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final void w(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        g1(parcelT, 20);
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final float z() {
        Parcel parcelR0 = r0(T(), 23);
        float f10 = parcelR0.readFloat();
        parcelR0.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final xm z1() {
        Parcel parcelR0 = r0(T(), 5);
        xm xmVarH4 = om.h4(parcelR0.readStrongBinder());
        parcelR0.recycle();
        return xmVarH4;
    }
}
