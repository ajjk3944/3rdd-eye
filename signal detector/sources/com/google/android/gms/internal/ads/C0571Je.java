package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import q2.InterfaceC2854y0;

/* renamed from: com.google.android.gms.internal.ads.Je, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571Je extends W2.a implements InterfaceC0605Le {
    public C0571Je(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final void C0(q2.a1 a1Var, InterfaceC0724Se interfaceC0724Se) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, a1Var);
        C7.e(parcelH0, interfaceC0724Se);
        I0(parcelH0, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final void F2(InterfaceC0656Oe interfaceC0656Oe) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC0656Oe);
        I0(parcelH0, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final void X0(q2.a1 a1Var, InterfaceC0724Se interfaceC0724Se) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, a1Var);
        C7.e(parcelH0, interfaceC0724Se);
        I0(parcelH0, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final InterfaceC2854y0 n() {
        Parcel parcelK0 = k0(h0(), 12);
        InterfaceC2854y0 interfaceC2854y0K3 = BinderC1168fk.K3(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return interfaceC2854y0K3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0605Le
    public final void o1(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        I0(parcelH0, 5);
    }
}
