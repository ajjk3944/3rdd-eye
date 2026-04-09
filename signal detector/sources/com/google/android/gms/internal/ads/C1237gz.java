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

/* renamed from: com.google.android.gms.internal.ads.gz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1237gz {

    /* renamed from: a, reason: collision with root package name */
    public static Cipher f14403a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f14404b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f14405c = new Object();

    public static byte[] a(String str, byte[] bArr) throws C1183fz {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrV = AbstractC1984ut.v(str, false);
            int length2 = bArrV.length;
            if (length2 <= 16) {
                throw new C1183fz();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrV);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f14404b) {
                b().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = b().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e6) {
            throw new C1183fz(e6);
        }
    }

    public static final Cipher b() {
        Cipher cipher;
        synchronized (f14405c) {
            try {
                if (f14403a == null) {
                    f14403a = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f14403a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }
}
