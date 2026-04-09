package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.f;
import qb.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zzc extends a {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();
    private final String zza;
    private final int zzb;

    public zzc(String str, int i4) {
        this.zza = str;
        this.zzb = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = f.O(parcel, 20293);
        f.I(parcel, 1, this.zza);
        int i10 = this.zzb;
        f.N(parcel, 2, 4);
        parcel.writeInt(i10);
        f.P(parcel, iO);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
