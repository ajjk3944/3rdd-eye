package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.pd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1699pd extends W2.a implements InterfaceC1753qd {
    public C1699pd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1753qd
    public final void a(C2852x0 c2852x0) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, c2852x0);
        I0(parcelH0, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1753qd
    public final void b() {
        I0(h0(), 2);
    }
}
