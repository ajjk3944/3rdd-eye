package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gu3 implements cr3 {
    public final /* synthetic */ int a;
    public final byte[] b;
    public final Object c;

    public gu3(int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.a = i;
        switch (i) {
            case 3:
                this.c = new fu3(0, bArr);
                this.b = bArr2;
                return;
            case 4:
                this.c = new fu3(1, bArr);
                this.b = bArr2;
                return;
            default:
                if (!yb.x(1)) {
                    throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
                }
                if (((Cipher) bu3.f.get()) == null) {
                    throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
                }
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                this.b = bArr;
                this.c = bArr2;
                return;
        }
    }

    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((fu3) this.c).s(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    @Override // defpackage.cr3
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.a;
        Object obj = this.c;
        byte[] bArr3 = this.b;
        switch (i) {
            case 0:
                cr3 cr3Var = (cr3) obj;
                if (bArr3.length == 0) {
                    return cr3Var.b(bArr, bArr2);
                }
                if (ow3.c(bArr3, bArr)) {
                    return cr3Var.b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("wrong prefix");
            case 1:
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                byte[] bArr4 = (byte[]) obj;
                int length = bArr.length;
                int length2 = bArr4.length;
                if (length < length2 + 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!ow3.c(bArr4, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                byte[] bArr5 = new byte[24];
                System.arraycopy(bArr, length2, bArr5, 0, 24);
                int[] iArrD = du3.d(du3.c(bArr3), du3.c(bArr5));
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArrD.length * 4).order(ByteOrder.LITTLE_ENDIAN);
                byteBufferOrder.asIntBuffer().put(iArrD);
                SecretKeySpec secretKeySpec = new SecretKeySpec(byteBufferOrder.array(), "ChaCha20");
                byte[] bArr6 = new byte[12];
                System.arraycopy(bArr5, 16, bArr6, 4, 8);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr6);
                Cipher cipher = (Cipher) bu3.f.get();
                cipher.init(2, secretKeySpec, ivParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher.updateAAD(bArr2);
                }
                return cipher.doFinal(bArr, length2 + 24, (length - length2) - 24);
            case 2:
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                int length3 = bArr.length;
                int length4 = bArr3.length;
                if (length3 < length4 + 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!ow3.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                du duVar = xt3.a;
                Objects.equals(System.getProperty("java.vendor"), "The Android Project");
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length4, 12);
                Cipher cipher2 = (Cipher) xt3.a.get();
                cipher2.init(2, (SecretKeySpec) obj, gCMParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher2.updateAAD(bArr2);
                }
                return cipher2.doFinal(bArr, length4 + 12, (length3 - length4) - 12);
            case 3:
                int length5 = bArr3.length;
                if (length5 == 0) {
                    return a(bArr, bArr2);
                }
                if (ow3.c(bArr3, bArr)) {
                    return a(Arrays.copyOfRange(bArr, length5, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            default:
                int length6 = bArr3.length;
                if (length6 == 0) {
                    return c(bArr, bArr2);
                }
                if (ow3.c(bArr3, bArr)) {
                    return c(Arrays.copyOfRange(bArr, length6, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }

    public byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((fu3) this.c).s(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    public gu3(cr3 cr3Var, byte[] bArr) {
        this.a = 0;
        this.c = cr3Var;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.b = bArr;
    }

    public gu3(byte[] bArr, v34 v34Var) throws GeneralSecurityException {
        this.a = 2;
        if (yb.x(2)) {
            du duVar = xt3.a;
            bd2.H(bArr.length);
            this.c = new SecretKeySpec(bArr, "AES");
            this.b = v34Var.b();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
