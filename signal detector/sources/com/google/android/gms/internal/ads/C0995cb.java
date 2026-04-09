package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.cb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0995cb extends W2.a implements InterfaceC1050db {
    @Override // com.google.android.gms.internal.ads.InterfaceC1050db
    public final void E1(InterfaceC0839Za interfaceC0839Za, String str) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC0839Za);
        parcelH0.writeString(str);
        I0(parcelH0, 1);
    }
}
