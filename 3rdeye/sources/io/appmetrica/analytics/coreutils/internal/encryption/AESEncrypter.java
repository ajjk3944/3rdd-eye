package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class AESEncrypter implements Encrypter {
    public static final String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final String TAG = "[AESEncrypter]";

    /* renamed from: a, reason: collision with root package name */
    private final String f38949a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f38950b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f38951c;

    public AESEncrypter(String str, byte[] bArr, byte[] bArr2) {
        this.f38949a = str;
        this.f38950b = bArr;
        this.f38951c = bArr2;
    }

    @SuppressLint({"TrulyRandom"})
    public byte[] decrypt(byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @SuppressLint({"TrulyRandom"})
    public byte[] encrypt(byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f38950b, "AES");
            Cipher cipher = Cipher.getInstance(this.f38949a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(this.f38951c));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getAlgorithm() {
        return this.f38949a;
    }

    public byte[] getIV() {
        return this.f38951c;
    }

    public byte[] getPassword() {
        return this.f38950b;
    }

    public byte[] decrypt(byte[] bArr, int i, int i10) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f38950b, "AES");
            Cipher cipher = Cipher.getInstance(this.f38949a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(this.f38951c));
            return cipher.doFinal(bArr, i, i10);
        } catch (Throwable unused) {
            return null;
        }
    }
}
