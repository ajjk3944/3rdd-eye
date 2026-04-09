package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* loaded from: classes3.dex */
public final class l01 {

    /* renamed from: a, reason: collision with root package name */
    private final String f29839a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29840b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l01(int i, String publicKey) {
        this(i, publicKey, 0);
        kotlin.jvm.internal.l.f(publicKey, "publicKey");
    }

    @SuppressLint({"TrulyRandom"})
    public final byte[] a(byte[] input) {
        kotlin.jvm.internal.l.f(input, "input");
        try {
            byte[] bArrDecode = Base64.decode(this.f29839a, 0);
            if (bArrDecode == null) {
                return null;
            }
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[16];
            secureRandom.nextBytes(bArr2);
            secureRandom.nextBytes(bArr);
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
            kotlin.jvm.internal.l.c(publicKeyGeneratePublic);
            return a(input, bArr2, bArr, publicKeyGeneratePublic);
        } catch (Throwable th) {
            fp0.b(th);
            return null;
        }
    }

    private l01(int i, String str, int i10) {
        this.f29839a = str;
        this.f29840b = i;
    }

    private final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, PublicKey publicKey) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr2.length + bArr3.length);
            try {
                byteArrayOutputStream.write(bArr2);
                byteArrayOutputStream.write(bArr3);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.l.e(byteArray, "toByteArray(...)");
                byteArrayOutputStream.close();
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                qc qcVar = new qc(AESEncrypter.DEFAULT_ALGORITHM, bArr2, bArr3);
                cipher.init(1, publicKey);
                byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
                try {
                    byteArrayOutputStream.write(ByteBuffer.allocate(4).putInt(this.f29840b).array());
                    byteArrayOutputStream.write(cipher.doFinal(byteArray));
                    byteArrayOutputStream.write(qcVar.a(bArr));
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray2;
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th) {
            fp0.b(th);
            return null;
        }
    }
}
