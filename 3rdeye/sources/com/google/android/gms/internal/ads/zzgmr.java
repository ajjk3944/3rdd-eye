package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgmr extends zzgen {
    private final zzgol zza;
    private final zzgws zzb;

    public zzgmr(zzgol zzgolVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        zzgws zzgwsVarZza;
        zze(zzgolVar, zzgfbVar);
        this.zza = zzgolVar;
        if (zzgolVar.zzc().equals(zzgut.RAW)) {
            zzgwsVarZza = zzgws.zzb(new byte[0]);
        } else if (zzgolVar.zzc().equals(zzgut.TINK)) {
            zzgwsVarZza = zzgnn.zzb(zzgolVar.zzf().intValue());
        } else {
            if (!zzgolVar.zzc().equals(zzgut.LEGACY) && !zzgolVar.zzc().equals(zzgut.CRUNCHY)) {
                throw new GeneralSecurityException("Unknown output prefix type");
            }
            zzgwsVarZza = zzgnn.zza(zzgolVar.zzf().intValue());
        }
        this.zzb = zzgwsVarZza;
    }

    private static void zze(zzgol zzgolVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        int i = zzgmo.zzb[zzgolVar.zzb().ordinal()];
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final zzgfa zza() {
        zzgol zzgolVar = this.zza;
        return new zzgmp(zzgolVar.zzg(), zzgolVar.zzc(), null);
    }

    public final zzgol zzb(zzgfb zzgfbVar) throws GeneralSecurityException {
        zzgol zzgolVar = this.zza;
        zze(zzgolVar, zzgfbVar);
        return zzgolVar;
    }

    public final zzgws zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zza.zzf();
    }
}
