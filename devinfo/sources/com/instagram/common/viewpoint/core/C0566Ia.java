package com.instagram.common.viewpoint.core;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Ia, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0566Ia {
    public final int A00;
    public final long A01;

    public C0566Ia(int i4, long j) {
        this.A00 = i4;
        this.A01 = j;
    }

    public /* synthetic */ C0566Ia(int i4, long j, IZ iz) {
        this(i4, j);
    }

    public static C0566Ia A00(Parcel parcel) {
        return new C0566Ia(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
