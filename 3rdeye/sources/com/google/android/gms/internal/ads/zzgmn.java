package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgmn implements zzgeo {
    final String zza;
    final Class zzb;
    final zzgtn zzc;

    public zzgmn(String str, Class cls, zzgtn zzgtnVar, zzhao zzhaoVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzgtnVar;
    }

    public static zzgeo zzd(String str, Class cls, zzgtn zzgtnVar, zzhao zzhaoVar) {
        return new zzgmn(str, cls, zzgtnVar, zzhaoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgeo
    public final zzgtp zza(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgtr zzgtrVarZza = zzgtt.zza();
        zzgtrVarZza.zzb(this.zza);
        zzgtrVarZza.zzc(zzgxnVar);
        zzgtrVarZza.zza(zzgut.RAW);
        zzgol zzgolVar = (zzgol) zzgnm.zzc().zzd(zzgnc.zzb().zza(zzgnm.zzc().zzb(zzgom.zza((zzgtt) zzgtrVarZza.zzbr())), null), zzgol.class, zzgem.zza());
        zzgtm zzgtmVarZza = zzgtp.zza();
        zzgtmVarZza.zzb(zzgolVar.zzg());
        zzgtmVarZza.zzc(zzgolVar.zze());
        zzgtmVarZza.zza(zzgolVar.zzb());
        return (zzgtp) zzgtmVarZza.zzbr();
    }

    @Override // com.google.android.gms.internal.ads.zzgeo
    public final Class zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgeo
    public final Object zzc(zzgxn zzgxnVar) throws GeneralSecurityException {
        return zzgnj.zza().zzb(zzgnm.zzc().zza(zzgol.zza(this.zza, zzgxnVar, this.zzc, zzgut.RAW, null), zzgem.zza()), this.zzb);
    }
}
