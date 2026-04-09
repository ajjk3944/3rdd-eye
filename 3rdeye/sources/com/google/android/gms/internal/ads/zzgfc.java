package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgfc {
    public static zzgfa zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgtt zzgttVarZzf = zzgtt.zzf(bArr, zzgyf.zza());
            zzgnm zzgnmVarZzc = zzgnm.zzc();
            zzgom zzgomVarZza = zzgom.zza(zzgttVarZzf);
            return !zzgnmVarZzc.zzk(zzgomVarZza) ? new zzgms(zzgomVarZza) : zzgnmVarZzc.zzb(zzgomVarZza);
        } catch (IOException e4) {
            throw new GeneralSecurityException("Failed to parse proto", e4);
        }
    }

    public static byte[] zzb(zzgfa zzgfaVar) throws GeneralSecurityException {
        return ((zzgom) zzgnm.zzc().zze(zzgfaVar, zzgom.class)).zzc().zzaV();
    }
}
