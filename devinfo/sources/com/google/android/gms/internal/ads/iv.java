package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class iv extends mg implements jv {
    public iv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            c();
        } else if (i4 == 2) {
            int i10 = parcel.readInt();
            ng.f(parcel);
            K1(i10);
        } else {
            if (i4 != 3) {
                return false;
            }
            va.w1 w1Var = (va.w1) ng.b(parcel, va.w1.CREATOR);
            ng.f(parcel);
            b(w1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
