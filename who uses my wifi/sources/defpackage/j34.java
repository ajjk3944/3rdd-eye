package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j34 implements cr3 {
    public final e34 a;
    public final r34 b;
    public final int c;
    public final byte[] d;

    public j34(e34 e34Var, r34 r34Var, int i, byte[] bArr) {
        this.a = e34Var;
        this.b = r34Var;
        this.c = i;
        this.d = bArr;
    }

    public static j34 a(xr3 xr3Var) {
        byte[] bArrB = ((v34) xr3Var.k.f).b();
        ds3 ds3Var = xr3Var.j;
        e34 e34Var = new e34(ds3Var.c, bArrB);
        String strValueOf = String.valueOf(ds3Var.f);
        r2 r2Var = new r2("HMAC".concat(strValueOf), new SecretKeySpec(((v34) xr3Var.l.f).b(), "HMAC"));
        int i = ds3Var.d;
        return new j34(e34Var, new r34(r2Var, i), i, xr3Var.m.b());
    }

    @Override // defpackage.cr3
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.d;
        int length2 = bArr3.length;
        int i = this.c;
        if (length < i + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!ow3.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i2 = length - i;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i2);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i2, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrL = i41.L(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8));
        r34 r34Var = this.b;
        int i3 = r34Var.b;
        kx3 kx3Var = r34Var.a;
        byte[] bArr4 = r34Var.c;
        byte[] bArr5 = r34Var.d;
        if (!MessageDigest.isEqual(bArr5.length > 0 ? i41.L(bArr4, kx3Var.b(i3, i41.L(bArrL, bArr5))) : i41.L(bArr4, kx3Var.b(i3, bArrL)), bArrCopyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        int length3 = bArrCopyOfRange.length;
        e34 e34Var = this.a;
        int i4 = e34Var.b;
        if (length3 < i4) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr6 = new byte[i4];
        System.arraycopy(bArrCopyOfRange, 0, bArr6, 0, i4);
        int i5 = length3 - i4;
        byte[] bArr7 = new byte[i5];
        Cipher cipher = (Cipher) e34.d.get();
        byte[] bArr8 = new byte[e34Var.c];
        System.arraycopy(bArr6, 0, bArr8, 0, i4);
        cipher.init(2, e34Var.a, new IvParameterSpec(bArr8));
        if (cipher.doFinal(bArrCopyOfRange, i4, i5, bArr7, 0) == i5) {
            return bArr7;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
