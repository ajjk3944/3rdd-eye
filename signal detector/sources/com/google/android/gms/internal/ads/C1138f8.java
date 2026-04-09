package com.google.android.gms.internal.ads;

import android.os.Parcel;
import q2.InterfaceC2854y0;

/* renamed from: com.google.android.gms.internal.ads.f8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1138f8 extends W2.a implements InterfaceC1193g8 {
    @Override // com.google.android.gms.internal.ads.InterfaceC1193g8
    public final void X2(S2.a aVar, InterfaceC1569n8 interfaceC1569n8) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.e(parcelH0, interfaceC1569n8);
        I0(parcelH0, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1193g8
    public final InterfaceC2854y0 e() {
        Parcel parcelK0 = k0(h0(), 5);
        InterfaceC2854y0 interfaceC2854y0K3 = BinderC1168fk.K3(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return interfaceC2854y0K3;
    }
}
