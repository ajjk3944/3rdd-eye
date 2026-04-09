package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzawa {
    private static Cipher zza;
    private static final Object zzb = new Object();
    private static final Object zzc = new Object();

    public zzawa(SecureRandom secureRandom) {
    }

    private static final Cipher zzc() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher;
        synchronized (zzc) {
            try {
                if (zza == null) {
                    zza = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                }
                cipher = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public final String zza(byte[] bArr, byte[] bArr2) throws zzavz {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = zzc().doFinal(bArr2);
                iv = zzc().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return zzauj.zza(bArr3, false);
        } catch (InvalidKeyException e4) {
            throw new zzavz(this, e4);
        } catch (NoSuchAlgorithmException e10) {
            throw new zzavz(this, e10);
        } catch (BadPaddingException e11) {
            throw new zzavz(this, e11);
        } catch (IllegalBlockSizeException e12) {
            throw new zzavz(this, e12);
        } catch (NoSuchPaddingException e13) {
            throw new zzavz(this, e13);
        }
    }

    public final byte[] zzb(byte[] bArr, String str) throws zzavz {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrZzb = zzauj.zzb(str, false);
            int length2 = bArrZzb.length;
            if (length2 <= 16) {
                throw new zzavz(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrZzb);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = zzc().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e4) {
            throw new zzavz(this, e4);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new zzavz(this, e10);
        } catch (InvalidKeyException e11) {
            throw new zzavz(this, e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new zzavz(this, e12);
        } catch (BadPaddingException e13) {
            throw new zzavz(this, e13);
        } catch (IllegalBlockSizeException e14) {
            throw new zzavz(this, e14);
        } catch (NoSuchPaddingException e15) {
            throw new zzavz(this, e15);
        }
    }
}
