package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgrb implements zzgez {
    private zzgrb(zzgez zzgezVar, zzgut zzgutVar, byte[] bArr) {
    }

    public static zzgez zza(zzgmr zzgmrVar) throws GeneralSecurityException {
        byte[] bArrZzd;
        zzgol zzgolVarZzb = zzgmrVar.zzb(zzgem.zza());
        zzgez zzgezVar = (zzgez) zzgmd.zzc().zza(zzgolVarZzb.zzg(), zzgez.class).zzc(zzgolVarZzb.zze());
        zzgut zzgutVarZzc = zzgolVarZzb.zzc();
        int iOrdinal = zzgutVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzd = zzgnn.zzb(zzgmrVar.zzd().intValue()).zzd();
        } else if (iOrdinal == 2) {
            bArrZzd = zzgnn.zza(zzgmrVar.zzd().intValue()).zzd();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzd = zzgnn.zza(zzgmrVar.zzd().intValue()).zzd();
        } else {
            bArrZzd = zzgnn.zza.zzd();
        }
        return new zzgrb(zzgezVar, zzgutVarZzc, bArrZzd);
    }
}
