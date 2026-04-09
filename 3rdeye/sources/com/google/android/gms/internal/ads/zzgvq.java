package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgvq implements zzgeh {
    private static final ThreadLocal zza = new zzgvo();
    private static final ThreadLocal zzb = new zzgvp();
    private final byte[] zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final SecretKeySpec zzf;
    private final int zzg;

    private zzgvq(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (!zzglu.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzg = i;
        zzgwq.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzf = secretKeySpec;
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrZzd = zzd(cipher.doFinal(new byte[16]));
        this.zzc = bArrZzd;
        this.zzd = zzd(bArrZzd);
        this.zze = bArr2;
    }

    public static zzgeh zzb(zzggi zzggiVar) throws GeneralSecurityException {
        if (zzglu.zza(1)) {
            return new zzgvq(zzggiVar.zze().zzd(zzgem.zza()), zzggiVar.zzd().zzb(), zzggiVar.zzb().zzd());
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    private static void zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    private static byte[] zzd(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b10 = bArr[i];
            int i10 = i + 1;
            bArr2[i] = (byte) (((b10 + b10) ^ ((bArr[i10] & 255) >>> 7)) & KotlinVersion.MAX_COMPONENT_VALUE);
            i = i10;
        }
        byte b11 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b11 + b11));
        return bArr2;
    }

    private final byte[] zze(Cipher cipher, int i, byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i11 == 0) {
            zzc(bArr2, this.zzc);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        byte[] bArr4 = bArr3;
        byte[] bArr5 = bArr2;
        int i12 = 0;
        while (i11 - i12 > 16) {
            for (int i13 = 0; i13 < 16; i13++) {
                bArr4[i13] = (byte) (bArr[(i10 + i12) + i13] ^ bArr4[i13]);
            }
            cipher.doFinal(bArr4, 0, 16, bArr5);
            i12 += 16;
            byte[] bArr6 = bArr4;
            bArr4 = bArr5;
            bArr5 = bArr6;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i12 + i10, i10 + i11);
        if (bArrCopyOfRange.length == 16) {
            zzc(bArrCopyOfRange, this.zzc);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.zzd, 16);
            int i14 = 0;
            while (true) {
                length = bArrCopyOfRange.length;
                if (i14 >= length) {
                    break;
                }
                bArrCopyOf[i14] = (byte) (bArrCopyOf[i14] ^ bArrCopyOfRange[i14]);
                i14++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrCopyOfRange = bArrCopyOf;
        }
        zzc(bArr4, bArrCopyOfRange);
        cipher.doFinal(bArr4, 0, 16, bArr5);
        return bArr5;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i = this.zzg;
        int i10 = ((length - length2) - i) - 16;
        if (i10 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgox.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) zza.get();
        SecretKeySpec secretKeySpec = this.zzf;
        cipher.init(1, secretKeySpec);
        byte[] bArrZze = zze(cipher, 0, bArr, length2, i);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrZze2 = zze(cipher, 1, bArr4, 0, bArr4.length);
        byte[] bArrZze3 = zze(cipher, 2, bArr, length2 + i, i10);
        int i11 = length - 16;
        byte b10 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            b10 = (byte) (b10 | (((bArr[i11 + i12] ^ bArrZze2[i12]) ^ bArrZze[i12]) ^ bArrZze3[i12]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) zzb.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrZze));
        return cipher2.doFinal(bArr, bArr3.length + i, i10);
    }
}
