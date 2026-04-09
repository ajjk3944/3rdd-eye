package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pu extends mg {

    /* renamed from: a, reason: collision with root package name */
    public final String f15106a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15107b;

    public pu(String str, int i4) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f15106a = str;
        this.f15107b = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pu)) {
            return false;
        }
        pu puVar = (pu) obj;
        if (pb.y.l(this.f15106a, puVar.f15106a)) {
            if (pb.y.l(Integer.valueOf(this.f15107b), Integer.valueOf(puVar.f15107b))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f15106a);
            return true;
        }
        if (i4 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f15107b);
        return true;
    }
}
