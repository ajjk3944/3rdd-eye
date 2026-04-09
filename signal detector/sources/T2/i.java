package T2;

import com.google.android.gms.internal.ads.AbstractC1114el;
import com.google.android.gms.internal.ads.C1200gF;
import com.google.android.gms.internal.ads.YJ;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class i extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3587a;

    public /* synthetic */ i(int i) {
        this.f3587a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws NoSuchAlgorithmException {
        SecureRandom secureRandom;
        Provider provider = null;
        switch (this.f3587a) {
            case 0:
                return 0L;
            case 1:
                return ByteBuffer.allocate(32);
            case 2:
                try {
                    return (Cipher) YJ.f12626b.f12632a.c("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e6) {
                    throw new IllegalStateException(e6);
                }
            case 3:
                try {
                    Cipher cipher = (Cipher) YJ.f12626b.f12632a.c("AES/GCM-SIV/NoPadding");
                    if (C1200gF.b(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException e7) {
                    throw new IllegalStateException(e7);
                }
            case 4:
                Provider providerD = AbstractC1114el.d();
                if (providerD != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", providerD);
                    } catch (GeneralSecurityException unused) {
                    }
                } else {
                    try {
                        provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    } catch (Throwable unused2) {
                    }
                    if (provider != null) {
                        try {
                            secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                        } catch (GeneralSecurityException unused3) {
                        }
                    } else {
                        secureRandom = new SecureRandom();
                    }
                }
                secureRandom.nextLong();
                return secureRandom;
            case 5:
                try {
                    return (Cipher) YJ.f12626b.f12632a.c("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e8) {
                    throw new IllegalStateException(e8);
                }
            case 6:
                try {
                    return (Cipher) YJ.f12626b.f12632a.c("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException(e9);
                }
            case 7:
                try {
                    return (Cipher) YJ.f12626b.f12632a.c("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            default:
                return new Random();
        }
    }
}
