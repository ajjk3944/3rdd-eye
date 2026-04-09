package com.facebook.ads.redexgen.core;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Hy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2606Hy {
    public final int A00;
    public final long A01;

    public C2606Hy(int i, long j4) {
        this.A00 = i;
        this.A01 = j4;
    }

    public /* synthetic */ C2606Hy(int i, long j4, C2605Hx c2605Hx) {
        this(i, j4);
    }

    public static C2606Hy A00(Parcel parcel) {
        return new C2606Hy(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
