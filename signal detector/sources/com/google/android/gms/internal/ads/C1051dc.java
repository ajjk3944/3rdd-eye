package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.dc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1051dc extends W2.a implements InterfaceC1105ec {
    @Override // com.google.android.gms.internal.ads.InterfaceC1105ec
    public final void b() {
        I0(h0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1105ec
    public final void t(int i) {
        Parcel parcelH0 = h0();
        parcelH0.writeInt(i);
        I0(parcelH0, 2);
    }
}
