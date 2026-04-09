package com.facebook.ads.redexgen.core;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Hv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2603Hv {
    public final int A00;
    public final long A01;
    public final long A02;

    public C2603Hv(int i, long j4, long j10) {
        this.A00 = i;
        this.A02 = j4;
        this.A01 = j10;
    }

    public /* synthetic */ C2603Hv(int i, long j4, long j10, C2602Hu c2602Hu) {
        this(i, j4, j10);
    }

    public static C2603Hv A00(Parcel parcel) {
        return new C2603Hv(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
