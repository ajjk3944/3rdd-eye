package com.google.android.gms.internal.ads;

import android.os.Parcel;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.h8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1247h8 extends W2.a implements InterfaceC1407k8 {
    @Override // com.google.android.gms.internal.ads.InterfaceC1407k8
    public final void E(int i) {
        Parcel parcelH0 = h0();
        parcelH0.writeInt(i);
        I0(parcelH0, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1407k8
    public final void c2(InterfaceC1193g8 interfaceC1193g8) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC1193g8);
        I0(parcelH0, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1407k8
    public final void j0(C2852x0 c2852x0) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, c2852x0);
        I0(parcelH0, 3);
    }
}
