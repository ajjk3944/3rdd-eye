package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbch;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdqb implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;
    private final zzhgh zze;

    public zzdqb(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4, zzhgh zzhghVar5) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
        this.zzd = zzhghVar4;
        this.zze = zzhghVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzchg) this.zza).zza();
        final String strZzb = ((zzdwz) this.zzb).zzb();
        VersionInfoParcel versionInfoParcelZza = ((zzchu) this.zzc).zza();
        final zzbch.zza.EnumC0333zza enumC0333zza = (zzbch.zza.EnumC0333zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbca zzbcaVar = new zzbca(new zzbcg(contextZza));
        zzbch.zzar.zza zzaVarZzd = zzbch.zzar.zzd();
        zzaVarZzd.zzg(versionInfoParcelZza.buddyApkVersion);
        zzaVarZzd.zzi(versionInfoParcelZza.clientJarVersion);
        zzaVarZzd.zzh(true != versionInfoParcelZza.isClientJar ? 2 : 0);
        final zzbch.zzar zzarVarZzbr = zzaVarZzd.zzbr();
        zzbcaVar.zzb(new zzbbz() { // from class: com.google.android.gms.internal.ads.zzdqa
            @Override // com.google.android.gms.internal.ads.zzbbz
            public final void zza(zzbch.zzt.zza zzaVar) {
                zzbch.zza.zzb zzbVarZzbM = zzaVar.zze().zzbM();
                zzbVarZzbM.zzH(enumC0333zza);
                zzaVar.zzG(zzbVarZzbM);
                zzbch.zzm.zza zzaVarZzbM = zzaVar.zzg().zzbM();
                zzaVarZzbM.zzm(strZzb);
                zzaVarZzbM.zzw(zzarVarZzbr);
                zzaVar.zzK(zzaVarZzbM);
                zzaVar.zzO(str);
            }
        });
        return zzbcaVar;
    }
}
