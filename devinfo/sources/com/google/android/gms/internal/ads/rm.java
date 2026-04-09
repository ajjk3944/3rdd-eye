package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rm extends ac.a implements tm {
    public rm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo", 1);
    }

    @Override // com.google.android.gms.internal.ads.tm
    public final String a() {
        Parcel parcelR0 = r0(T(), 2);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.tm
    public final ArrayList zzc() {
        Parcel parcelR0 = r0(T(), 3);
        ArrayList arrayList = parcelR0.readArrayList(ng.f14287a);
        parcelR0.recycle();
        return arrayList;
    }
}
