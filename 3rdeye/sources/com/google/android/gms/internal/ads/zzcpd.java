package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcpd implements zzhfy {
    private final zzcou zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;
    private final zzhgh zze;

    public zzcpd(zzcou zzcouVar, zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4) {
        this.zza = zzcouVar;
        this.zzb = zzhghVar;
        this.zzc = zzhghVar2;
        this.zzd = zzhghVar3;
        this.zze = zzhghVar4;
    }

    public static zzddo zza(zzcou zzcouVar, final Context context, final VersionInfoParcel versionInfoParcel, final zzfbt zzfbtVar, final zzfco zzfcoVar) {
        return new zzddo(new zzcxf() { // from class: com.google.android.gms.internal.ads.zzcos
            @Override // com.google.android.gms.internal.ads.zzcxf
            public final void zzt() {
                com.google.android.gms.ads.internal.util.zzay zzayVarZzu = com.google.android.gms.ads.internal.zzv.zzu();
                Context context2 = context;
                zzfco zzfcoVar2 = zzfcoVar;
                zzayVarZzu.zzn(context2, versionInfoParcel.afmaVersion, zzfbtVar.zzC.toString(), zzfcoVar2.zzf);
            }
        }, zzcad.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (Context) this.zzb.zzb(), ((zzchu) this.zzc).zza(), ((zzcrm) this.zzd).zza(), ((zzcvi) this.zze).zza());
    }
}
