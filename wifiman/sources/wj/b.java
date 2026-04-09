package wj;

import org.libsodium.jni.SodiumJNI;

/* loaded from: classes3.dex */
public class b {
    public static int a() {
        return SodiumJNI.crypto_generichash_bytes();
    }

    public static int b(byte[] bArr, byte[] bArr2, int i10) {
        return SodiumJNI.crypto_generichash_final(bArr, bArr2, i10);
    }

    public static int c(byte[] bArr, byte[] bArr2, int i10, int i11) {
        return SodiumJNI.crypto_generichash_init(bArr, bArr2, i10, i11);
    }

    public static int d() {
        return SodiumJNI.crypto_generichash_statebytes();
    }

    public static int e(byte[] bArr, byte[] bArr2, int i10) {
        return SodiumJNI.crypto_generichash_update(bArr, bArr2, i10);
    }

    public static int f(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return SodiumJNI.crypto_scalarmult(bArr, bArr2, bArr3);
    }

    public static int g(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_scalarmult_base(bArr, bArr2);
    }

    public static int h() {
        return SodiumJNI.crypto_scalarmult_bytes();
    }

    public static int i(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_secretbox_xsalsa20poly1305(bArr, bArr2, i10, bArr3, bArr4);
    }

    public static int j(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_secretbox_xsalsa20poly1305_open(bArr, bArr2, i10, bArr3, bArr4);
    }

    public static void k(byte[] bArr, int i10) {
        SodiumJNI.randombytes(bArr, i10);
    }

    public static int l() {
        return SodiumJNI.sodium_init();
    }
}
