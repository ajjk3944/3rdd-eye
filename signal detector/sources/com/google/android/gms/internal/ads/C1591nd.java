package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.nd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1591nd extends W2.a implements InterfaceC1645od {
    public C1591nd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1645od
    public final void R2(InterfaceC0790Wc interfaceC0790Wc) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC0790Wc);
        I0(parcelH0, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1645od
    public final void a(C2852x0 c2852x0) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, c2852x0);
        I0(parcelH0, 3);
    }
}
