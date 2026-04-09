package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgvr implements zzgeh {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzgvr(byte[] bArr, zzgws zzgwsVar) throws GeneralSecurityException {
        if (!zzglu.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = zzgka.zzc(bArr);
        this.zzb = zzgwsVar.zzd();
    }

    public static zzgeh zzb(zzggs zzggsVar) throws GeneralSecurityException {
        return new zzgvr(zzggsVar.zze().zzd(zzgem.zza()), zzggsVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgox.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecZza = zzgka.zza(bArr, length2, 12);
        SecretKey secretKey = this.zza;
        Cipher cipherZzb = zzgka.zzb();
        cipherZzb.init(2, secretKey, algorithmParameterSpecZza);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZzb.updateAAD(bArr2);
        }
        return cipherZzb.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
