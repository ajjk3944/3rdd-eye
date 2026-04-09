package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzezm implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;

    public zzezm(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzezk zzb() {
        Context context = (Context) this.zza.zzb();
        zzfdx zzfdxVar = (zzfdx) this.zzb.zzb();
        zzfep zzfepVar = (zzfep) this.zzc.zzb();
        zzbzk zzbzkVarZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgv)).booleanValue() ? com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg() : com.google.android.gms.ads.internal.zzv.zzp().zzi().zzh();
        boolean z10 = false;
        if (zzbzkVarZzg != null && zzbzkVarZzg.zzh()) {
            z10 = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgL)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgu)).booleanValue() || z10) {
                zzfeo zzfeoVarZza = zzfepVar.zza(zzfef.AppOpen, context, zzfdxVar, new zzeyo(new zzeyl()));
                zzeza zzezaVar = new zzeza(new zzeyz());
                zzfeb zzfebVar = zzfeoVarZza.zza;
                zzgdm zzgdmVar = zzcad.zza;
                return new zzeyq(zzezaVar, new zzeyw(zzfebVar, zzgdmVar), zzfeoVarZza.zzb, zzfebVar.zza().zzf, zzgdmVar);
            }
        }
        return new zzeyz();
    }
}
