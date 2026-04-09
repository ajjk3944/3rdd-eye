package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
@SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* loaded from: classes2.dex */
public final class zzfei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfei> CREATOR = new zzfej();
    public final Context zza;
    public final zzfef zzb;

    @SafeParcelable.Field(id = 2)
    public final int zzc;

    @SafeParcelable.Field(id = 3)
    public final int zzd;

    @SafeParcelable.Field(id = 4)
    public final int zze;

    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfef[] zzh;

    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;

    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;

    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfei(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) int i12, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i13, @SafeParcelable.Param(id = 7) int i14) {
        zzfef[] zzfefVarArrValues = zzfef.values();
        this.zzh = zzfefVarArrValues;
        int[] iArrZza = zzfeg.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfeh.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = zzfefVarArrValues[i];
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str;
        this.zzj = i13;
        this.zzg = iArrZza[i13];
        this.zzk = i14;
        int i15 = iArrZza2[i14];
    }

    public static zzfei zza(zzfef zzfefVar, Context context) {
        if (zzfefVar == zzfef.Rewarded) {
            return new zzfei(context, zzfefVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgx)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgD)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgF)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgH), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgz), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgB));
        }
        if (zzfefVar == zzfef.Interstitial) {
            return new zzfei(context, zzfefVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgy)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgE)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgG)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgI), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgA), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgC));
        }
        if (zzfefVar != zzfef.AppOpen) {
            return null;
        }
        return new zzfei(context, zzfefVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgL)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgN)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgO)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgJ), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgK), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgM));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i10 = this.zzi;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i10);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzfei(Context context, zzfef zzfefVar, int i, int i10, int i11, String str, String str2, String str3) {
        int i12;
        this.zzh = zzfef.values();
        this.zzl = zzfeg.zza();
        this.zzm = zzfeh.zza();
        this.zza = context;
        this.zzi = zzfefVar.ordinal();
        this.zzb = zzfefVar;
        this.zzc = i;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i12 = 1;
        } else {
            i12 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i12;
        this.zzj = i12 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
