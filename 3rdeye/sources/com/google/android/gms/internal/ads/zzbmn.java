package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
@SafeParcelable.Class(creator = "InstreamAdConfigurationParcelCreator")
/* loaded from: classes2.dex */
public final class zzbmn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbmn> CREATOR = new zzbmo();

    @SafeParcelable.VersionField(id = 1000)
    public final int zza;

    @SafeParcelable.Field(id = 1)
    public final int zzb;

    @SafeParcelable.Field(id = 2)
    public final String zzc;

    @SafeParcelable.Field(id = 3)
    public final int zzd;

    @SafeParcelable.Constructor
    public zzbmn(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i11) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i10 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i10);
        SafeParcelWriter.writeString(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
