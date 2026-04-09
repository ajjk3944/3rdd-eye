package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0721Sb extends B7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0657Of f11187a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0721Sb(C0738Tb c0738Tb, C0657Of c0657Of) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.f11187a = c0657Of;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C7.b(parcel, ParcelFileDescriptor.CREATOR);
        C7.f(parcel);
        this.f11187a.b(parcelFileDescriptor);
        return true;
    }
}
