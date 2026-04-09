package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.f;
import qb.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zza extends a {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    private final String zza;
    private final String zzb;

    public zza(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = f.O(parcel, 20293);
        f.I(parcel, 1, this.zza);
        f.I(parcel, 2, this.zzb);
        f.P(parcel, iO);
    }
}
