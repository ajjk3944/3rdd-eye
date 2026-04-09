package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgvu implements zzgeh {
    private final zzgwk zza;
    private final zzgez zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzgvu(zzgwk zzgwkVar, zzgez zzgezVar, int i, byte[] bArr) {
        this.zza = zzgwkVar;
        this.zzb = zzgezVar;
        this.zzc = i;
        this.zzd = bArr;
    }

    public static zzgeh zzb(zzgfw zzgfwVar) throws GeneralSecurityException {
        zzgvn zzgvnVar = new zzgvn(zzgfwVar.zze().zzd(zzgem.zza()), zzgfwVar.zzd().zzd());
        String strValueOf = String.valueOf(zzgfwVar.zzd().zzg());
        return new zzgvu(zzgvnVar, new zzgwp(new zzgwo("HMAC".concat(strValueOf), new SecretKeySpec(zzgfwVar.zzf().zzd(zzgem.zza()), "HMAC")), zzgfwVar.zzd().zze()), zzgfwVar.zzd().zze(), zzgfwVar.zzb().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i = this.zzc;
        int length2 = bArr3.length;
        if (length < i + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzgox.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i10 = length - i;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i10, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zzgwp) this.zzb).zzc(zzgvs.zzb(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), bArrCopyOfRange2)) {
            return this.zza.zza(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
