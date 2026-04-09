package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pv extends mg implements zu {

    /* renamed from: a, reason: collision with root package name */
    public final String f15117a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15118b;

    public pv(String str, int i4) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.f15117a = str;
        this.f15118b = i4;
    }

    @Override // com.google.android.gms.internal.ads.zu
    public final String c() {
        return this.f15117a;
    }

    @Override // com.google.android.gms.internal.ads.zu
    public final int d() {
        return this.f15118b;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f15117a);
            return true;
        }
        if (i4 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f15118b);
        return true;
    }
}
