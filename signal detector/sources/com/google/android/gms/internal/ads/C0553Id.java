package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import r2.C2876a;

/* renamed from: com.google.android.gms.internal.ads.Id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0553Id extends W2.a implements InterfaceC0570Jd {
    public C0553Id(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570Jd
    public final void Q(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        I0(parcelH0, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570Jd
    public final void e() {
        I0(h0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570Jd
    public final void h1(String[] strArr, int[] iArr, S2.a aVar) {
        Parcel parcelH0 = h0();
        parcelH0.writeStringArray(strArr);
        parcelH0.writeIntArray(iArr);
        C7.e(parcelH0, aVar);
        I0(parcelH0, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570Jd
    public final void t3(S2.a aVar, C2876a c2876a) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.c(parcelH0, c2876a);
        I0(parcelH0, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570Jd
    public final void u0(Intent intent) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, intent);
        I0(parcelH0, 1);
    }
}
