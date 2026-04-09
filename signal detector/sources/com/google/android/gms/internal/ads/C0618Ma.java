package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;
import o4.AbstractC2763b;

/* renamed from: com.google.android.gms.internal.ads.Ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618Ma extends W2.a implements InterfaceC0635Na {
    public C0618Ma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0635Na
    public final int b() {
        Parcel parcelK0 = k0(h0(), 4);
        int i = parcelK0.readInt();
        parcelK0.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0635Na
    public final S2.a c() {
        return AbstractC2763b.c(k0(h0(), 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0635Na
    public final int d() {
        Parcel parcelK0 = k0(h0(), 5);
        int i = parcelK0.readInt();
        parcelK0.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0635Na
    public final Map e() {
        Parcel parcelK0 = k0(h0(), 6);
        HashMap hashMap = parcelK0.readHashMap(C7.f7544a);
        parcelK0.recycle();
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0635Na
    public final Uri f() {
        Parcel parcelK0 = k0(h0(), 2);
        Uri uri = (Uri) C7.b(parcelK0, Uri.CREATOR);
        parcelK0.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0635Na
    public final double m() {
        Parcel parcelK0 = k0(h0(), 3);
        double d6 = parcelK0.readDouble();
        parcelK0.recycle();
        return d6;
    }
}
