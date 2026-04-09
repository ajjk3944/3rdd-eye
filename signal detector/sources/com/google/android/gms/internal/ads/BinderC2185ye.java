package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2185ye extends B7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17728a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17729b;

    public BinderC2185ye(String str, int i) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f17728a = str;
        this.f17729b = i;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f17728a);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f17729b);
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BinderC2185ye)) {
            return false;
        }
        BinderC2185ye binderC2185ye = (BinderC2185ye) obj;
        if (M2.u.g(this.f17728a, binderC2185ye.f17728a)) {
            if (M2.u.g(Integer.valueOf(this.f17729b), Integer.valueOf(binderC2185ye.f17729b))) {
                return true;
            }
        }
        return false;
    }
}
