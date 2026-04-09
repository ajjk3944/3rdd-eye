package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import o4.AbstractC2763b;

/* renamed from: com.google.android.gms.internal.ads.Ya, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0822Ya extends W2.a implements InterfaceC0839Za {
    public C0822Ya(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0839Za
    public final boolean L(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        Parcel parcelK0 = k0(parcelH0, 10);
        boolean z6 = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0839Za
    public final String g() {
        Parcel parcelK0 = k0(h0(), 4);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0839Za
    public final S2.a o2() {
        return AbstractC2763b.c(k0(h0(), 9));
    }
}
