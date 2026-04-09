package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wm extends ac.a implements xm {
    public wm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage", 1);
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final vb.a a() {
        return r5.c.p(r0(T(), 1));
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final int c() {
        Parcel parcelR0 = r0(T(), 4);
        int i4 = parcelR0.readInt();
        parcelR0.recycle();
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final int d() {
        Parcel parcelR0 = r0(T(), 5);
        int i4 = parcelR0.readInt();
        parcelR0.recycle();
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final Map e() {
        Parcel parcelR0 = r0(T(), 6);
        HashMap hashMap = parcelR0.readHashMap(ng.f14287a);
        parcelR0.recycle();
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final double f() {
        Parcel parcelR0 = r0(T(), 3);
        double d10 = parcelR0.readDouble();
        parcelR0.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final Uri zzc() {
        Parcel parcelR0 = r0(T(), 2);
        Uri uri = (Uri) ng.b(parcelR0, Uri.CREATOR);
        parcelR0.recycle();
        return uri;
    }
}
