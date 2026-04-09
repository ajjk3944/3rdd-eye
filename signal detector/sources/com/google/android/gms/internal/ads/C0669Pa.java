package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import o4.AbstractC2763b;

/* renamed from: com.google.android.gms.internal.ads.Pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0669Pa extends W2.a implements InterfaceC0703Ra {
    public C0669Pa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final void B0(S2.a aVar, String str) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        C7.e(parcelH0, aVar);
        I0(parcelH0, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final void D(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        I0(parcelH0, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final void I3(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        I0(parcelH0, 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final S2.a O(String str) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        return AbstractC2763b.c(k0(parcelH0, 2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final void g2(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        I0(parcelH0, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final void n0(S2.a aVar, int i) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        parcelH0.writeInt(i);
        I0(parcelH0, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final void r2(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        I0(parcelH0, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0703Ra
    public final void w3(InterfaceC0601La interfaceC0601La) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC0601La);
        I0(parcelH0, 8);
    }
}
