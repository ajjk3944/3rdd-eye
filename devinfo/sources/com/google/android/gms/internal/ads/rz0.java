package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rz0 {

    /* renamed from: a, reason: collision with root package name */
    public static Cipher f15794a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f15795b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f15796c = new Object();

    public static byte[] a(String str, byte[] bArr) throws qz0 {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrV = yo0.v(str, false);
            int length2 = bArrV.length;
            if (length2 <= 16) {
                throw new qz0();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrV);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f15795b) {
                b().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = b().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            throw new qz0(e2);
        }
    }

    public static final Cipher b() {
        Cipher cipher;
        synchronized (f15796c) {
            try {
                if (f15794a == null) {
                    f15794a = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f15794a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cipher;
    }
}
