package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Wb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0789Wb extends W2.a implements InterfaceC0806Xb {
    @Override // com.google.android.gms.internal.ads.InterfaceC0806Xb
    public final void K2(String str) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        I0(parcelH0, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0806Xb
    public final void b() {
        I0(h0(), 2);
    }
}
