package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgkg implements zzgeh {
    private static final byte[] zza = zzgwj.zza("7a806c");
    private static final byte[] zzb = zzgwj.zza("46bb91c3c5");
    private static final byte[] zzc = zzgwj.zza("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] zzd = zzgwj.zza("bae8e37fc83441b16034566b");
    private static final byte[] zze = zzgwj.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private final SecretKey zzf;
    private final byte[] zzg;

    private zzgkg(byte[] bArr, byte[] bArr2, zzglo zzgloVar) throws GeneralSecurityException {
        this.zzg = bArr2;
        zzgwq.zza(bArr.length);
        this.zzf = new SecretKeySpec(bArr, "AES");
    }

    public static boolean zzb(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArr = zzd;
            cipher.init(2, new SecretKeySpec(zzc, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(zzb);
            byte[] bArr2 = zze;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), zza);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static zzgeh zzc(zzghd zzghdVar, zzglo zzgloVar) throws GeneralSecurityException {
        if (zzb(zzglq.zzc())) {
            return new zzgkg(zzghdVar.zze().zzd(zzgem.zza()), zzghdVar.zzb().zzd(), zzgloVar);
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.zzg;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgox.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipherZzc = zzglq.zzc();
        cipherZzc.init(2, this.zzf, new GCMParameterSpec(128, bArr, length2, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipherZzc.updateAAD(bArr2);
        }
        return cipherZzc.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
