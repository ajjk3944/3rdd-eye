package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lx3 implements kx3 {
    public static final du i = new du(11);
    public final SecretKeySpec f;
    public final byte[] g;
    public final byte[] h;

    public lx3(byte[] bArr) throws GeneralSecurityException {
        bd2.H(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f = secretKeySpec;
        if (!yb.x(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) i.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrZ = qb1.z(cipher.doFinal(new byte[16]));
        this.g = bArrZ;
        this.h = qb1.z(bArrZ);
    }

    @Override // defpackage.kx3
    public final byte[] b(int i2, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrN;
        if (i2 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!yb.x(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) i.get();
        cipher.init(1, this.f);
        int length = bArr.length;
        int i3 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i4 = i3 - 1;
        int i5 = i4 * 16;
        if (i3 * 16 == length) {
            bArrN = i41.N(i5, bArr, this.g);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            if (bArrCopyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrN = i41.N(0, bArrCopyOf, this.h);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = i6 * 16;
            for (int i8 = 0; i8 < 16; i8++) {
                bArr3[i8] = (byte) (bArr2[i8] ^ bArr[i8 + i7]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i9 = 0; i9 < 16; i9++) {
            bArr3[i9] = (byte) (bArr2[i9] ^ bArrN[i9]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i2 == 16 ? bArr2 : Arrays.copyOf(bArr2, i2);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
