package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdff implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;

    public zzdff(zzdey zzdeyVar, zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
        this.zzd = zzhghVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel versionInfoParcelZza = ((zzchu) this.zzb).zza();
        final zzfbt zzfbtVarZza = ((zzcrm) this.zzc).zza();
        final zzfco zzfcoVarZza = ((zzcvi) this.zzd).zza();
        return new zzddo(new zzcxf() { // from class: com.google.android.gms.internal.ads.zzdew
            @Override // com.google.android.gms.internal.ads.zzcxf
            public final void zzt() {
                com.google.android.gms.ads.internal.util.zzay zzayVarZzu = com.google.android.gms.ads.internal.zzv.zzu();
                Context context2 = context;
                zzfco zzfcoVar = zzfcoVarZza;
                zzayVarZzu.zzn(context2, versionInfoParcelZza.afmaVersion, zzfbtVarZza.zzC.toString(), zzfcoVar.zzf);
            }
        }, zzcad.zzg);
    }
}
