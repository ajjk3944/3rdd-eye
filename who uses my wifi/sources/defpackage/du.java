package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class du extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ du(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws NoSuchAlgorithmException {
        SecureRandom secureRandom;
        Provider provider = null;
        switch (this.a) {
            case 0:
                return new Random();
            case 1:
                return new PathMeasure();
            case 2:
                return new Path();
            case 3:
                return new Path();
            case 4:
                return new float[4];
            case 5:
                return ByteBuffer.allocate(32);
            case 6:
                return 0L;
            case 7:
                try {
                    return (Cipher) m34.b.a.l("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case 8:
                try {
                    Cipher cipher = (Cipher) m34.b.a.l("ChaCha20-Poly1305");
                    if (bu3.a(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException unused) {
                    return null;
                }
            case 9:
                try {
                    Cipher cipher2 = (Cipher) m34.b.a.l("AES/GCM-SIV/NoPadding");
                    if (zt3.a(cipher2)) {
                        return cipher2;
                    }
                    return null;
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            case 10:
                Provider providerT = ob1.t();
                if (providerT != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", providerT);
                    } catch (GeneralSecurityException unused2) {
                    }
                } else {
                    try {
                        provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused3) {
                    }
                    if (provider != null) {
                        try {
                            secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                        } catch (GeneralSecurityException unused4) {
                        }
                    } else {
                        secureRandom = new SecureRandom();
                    }
                }
                secureRandom.nextLong();
                return secureRandom;
            case 11:
                try {
                    return (Cipher) m34.b.a.l("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e3) {
                    throw new IllegalStateException(e3);
                }
            case 12:
                try {
                    return (Cipher) m34.b.a.l("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e4) {
                    throw new IllegalStateException(e4);
                }
            default:
                try {
                    return (Cipher) m34.b.a.l("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
        }
    }
}
