package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yu extends ac.a implements zu {
    public yu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem", 1);
    }

    @Override // com.google.android.gms.internal.ads.zu
    public final String c() {
        Parcel parcelR0 = r0(T(), 1);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zu
    public final int d() {
        Parcel parcelR0 = r0(T(), 2);
        int i4 = parcelR0.readInt();
        parcelR0.recycle();
        return i4;
    }
}
