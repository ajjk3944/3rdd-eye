package org.libsodium.jni;

/* loaded from: classes3.dex */
public abstract class SodiumJNI {
    public static final native int crypto_generichash_bytes();

    public static final native int crypto_generichash_final(byte[] bArr, byte[] bArr2, int i10);

    public static final native int crypto_generichash_init(byte[] bArr, byte[] bArr2, int i10, int i11);

    public static final native int crypto_generichash_statebytes();

    public static final native int crypto_generichash_update(byte[] bArr, byte[] bArr2, int i10);

    public static final native int crypto_scalarmult(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static final native int crypto_scalarmult_base(byte[] bArr, byte[] bArr2);

    public static final native int crypto_scalarmult_bytes();

    public static final native int crypto_secretbox_xsalsa20poly1305(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4);

    public static final native int crypto_secretbox_xsalsa20poly1305_open(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4);

    public static final native void randombytes(byte[] bArr, int i10);

    public static final native int sodium_init();
}
