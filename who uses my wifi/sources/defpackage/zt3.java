package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zt3 implements cr3 {
    public static final byte[] d = ou1.K("7a806c");
    public static final byte[] e = ou1.K("46bb91c3c5");
    public static final byte[] f = ou1.K("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] g = ou1.K("bae8e37fc83441b16034566b");
    public static final byte[] h = ou1.K("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    public final tt3 a;
    public final SecretKeySpec b;
    public final byte[] c;

    public zt3(byte[] bArr, byte[] bArr2) {
        tt3 tt3Var = tt3.r;
        this.c = bArr2;
        bd2.H(bArr.length);
        this.b = new SecretKeySpec(bArr, "AES");
        this.a = tt3Var;
    }

    public static boolean a(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArr = g;
            cipher.init(2, new SecretKeySpec(f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(e);
            byte[] bArr2 = h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // defpackage.cr3
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.c;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ow3.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        this.a.getClass();
        try {
            Cipher cipher = (Cipher) ku3.a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            cipher.init(2, this.b, new GCMParameterSpec(128, bArr, length2, 12));
            if (bArr2 != null && bArr2.length != 0) {
                cipher.updateAAD(bArr2);
            }
            return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
        } catch (IllegalStateException e2) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e2);
        }
    }
}
