package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgla implements zzgeh {
    private final zzgeh zza;
    private final byte[] zzb;

    private zzgla(zzgeh zzgehVar, byte[] bArr) {
        this.zza = zzgehVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzgeh zzb(zzgmr zzgmrVar) throws GeneralSecurityException {
        byte[] bArrZzd;
        zzgol zzgolVarZzb = zzgmrVar.zzb(zzgem.zza());
        zzgeh zzgehVar = (zzgeh) zzgmd.zzc().zza(zzgolVarZzb.zzg(), zzgeh.class).zzc(zzgolVarZzb.zze());
        zzgut zzgutVarZzc = zzgolVarZzb.zzc();
        int iOrdinal = zzgutVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzd = zzgnn.zzb(zzgmrVar.zzd().intValue()).zzd();
        } else if (iOrdinal == 2) {
            bArrZzd = zzgnn.zza(zzgmrVar.zzd().intValue()).zzd();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzgutVarZzc)));
            }
            bArrZzd = zzgnn.zza(zzgmrVar.zzd().intValue()).zzd();
        } else {
            bArrZzd = zzgnn.zza.zzd();
        }
        return new zzgla(zzgehVar, bArrZzd);
    }

    public static zzgeh zzc(zzgeh zzgehVar, zzgws zzgwsVar) {
        return new zzgla(zzgehVar, zzgwsVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgox.zzc(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
