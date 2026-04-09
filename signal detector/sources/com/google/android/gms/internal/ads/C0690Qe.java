package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.Qe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690Qe extends W2.a implements InterfaceC0724Se {
    public C0690Qe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0724Se
    public final void a(C2852x0 c2852x0) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, c2852x0);
        I0(parcelH0, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0724Se
    public final void b() {
        I0(h0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0724Se
    public final void t(int i) {
        Parcel parcelH0 = h0();
        parcelH0.writeInt(i);
        I0(parcelH0, 2);
    }
}
