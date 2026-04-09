package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.sf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1862sf extends W2.a implements InterfaceC1970uf {
    @Override // com.google.android.gms.internal.ads.InterfaceC1970uf
    public final void F3(String str, Bundle bundle, String str2) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        C7.c(parcelH0, bundle);
        I0(parcelH0, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1970uf
    public final void v(String str) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        I0(parcelH0, 2);
    }
}
