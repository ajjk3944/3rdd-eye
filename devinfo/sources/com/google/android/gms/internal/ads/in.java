package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class in extends ac.a implements jn {
    public in(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd", 1);
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final vb.a K2() {
        return r5.c.p(r0(T(), 9));
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final boolean V(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        Parcel parcelR0 = r0(parcelT, 17);
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final boolean v(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        Parcel parcelR0 = r0(parcelT, 10);
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final String z1() {
        Parcel parcelR0 = r0(T(), 4);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }
}
