package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ep extends mg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx f10841a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep(fp fpVar, gx gxVar) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.f10841a = gxVar;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ng.b(parcel, ParcelFileDescriptor.CREATOR);
        ng.f(parcel);
        this.f10841a.b(parcelFileDescriptor);
        return true;
    }
}
