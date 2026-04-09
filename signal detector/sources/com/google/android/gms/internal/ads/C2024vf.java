package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.vf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2024vf extends W2.a implements InterfaceC2132xf {
    public C2024vf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2132xf
    public final void T2(S2.a aVar, C0436Bf c0436Bf, InterfaceC1970uf interfaceC1970uf) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.c(parcelH0, c0436Bf);
        C7.e(parcelH0, interfaceC1970uf);
        I0(parcelH0, 1);
    }
}
