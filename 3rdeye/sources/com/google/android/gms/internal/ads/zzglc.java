package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzglc implements zzgeh {
    private final byte[] zza;
    private final int zzb;
    private final zzgrc zzc;

    private zzglc(byte[] bArr, zzgws zzgwsVar, int i) throws GeneralSecurityException {
        this.zzc = new zzgwm(bArr);
        this.zza = zzgwsVar.zzd();
        this.zzb = i;
    }

    public static zzgeh zzb(zzgjc zzgjcVar) throws GeneralSecurityException {
        return new zzglc(zzgjcVar.zze().zzd(zzgem.zza()), zzgjcVar.zzb(), zzgjcVar.zzd().zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zza;
        int i = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i10 = i + length2;
        if (length < i10 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgox.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i10);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        zzgrc zzgrcVar = this.zzc;
        byte[] bArr6 = new byte[32];
        System.arraycopy(zzgrcVar.zza(bArr4, 16), 0, bArr6, 0, 16);
        System.arraycopy(zzgrcVar.zza(bArr5, 16), 0, bArr6, 16, 16);
        if (!zzglu.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKeyZzc = zzgka.zzc(bArr6);
        int i11 = i10 + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i10, i11);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i10 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecZza = zzgka.zza(bArrCopyOfRange2, 0, 12);
        Cipher cipherZzb = zzgka.zzb();
        cipherZzb.init(2, secretKeyZzc, algorithmParameterSpecZza);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZzb.updateAAD(bArr2);
        }
        return cipherZzb.doFinal(bArr, i11, length - i11);
    }
}
