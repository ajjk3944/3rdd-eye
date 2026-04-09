package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.He, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537He extends W2.a implements InterfaceC0554Ie {
    public C0537He(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0554Ie
    public final String b() {
        Parcel parcelK0 = k0(h0(), 1);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0554Ie
    public final int d() {
        Parcel parcelK0 = k0(h0(), 2);
        int i = parcelK0.readInt();
        parcelK0.recycle();
        return i;
    }
}
