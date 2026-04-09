package u4;

import B4.p;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import o4.InterfaceC7066a;
import o4.r;
import org.conscrypt.PSKKeyManager;

/* renamed from: u4.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8133c implements r {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f62693c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final String f62694d = "c";

    /* renamed from: a, reason: collision with root package name */
    private final String f62695a;

    /* renamed from: b, reason: collision with root package name */
    private KeyStore f62696b;

    /* renamed from: u4.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f62697a = null;

        /* renamed from: b, reason: collision with root package name */
        KeyStore f62698b;

        public a() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            this.f62698b = null;
            if (!C8133c.g()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f62698b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C8133c() {
        this(new a());
    }

    static boolean d(String str) {
        C8133c c8133c = new C8133c();
        synchronized (f62693c) {
            try {
                if (c8133c.f(str)) {
                    return false;
                }
                e(str);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void e(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strB = B4.r.b("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strB, 3).setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g() {
        return true;
    }

    private static void h() throws InterruptedException {
        try {
            Thread.sleep((int) (Math.random() * 40.0d));
        } catch (InterruptedException unused) {
        }
    }

    private static InterfaceC7066a i(InterfaceC7066a interfaceC7066a) throws KeyStoreException {
        byte[] bArrC = p.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrC, interfaceC7066a.b(interfaceC7066a.a(bArrC, bArr), bArr))) {
            return interfaceC7066a;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    @Override // o4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f62695a     // Catch: java.lang.Throwable -> Le
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            monitor-exit(r2)
            return r1
        Le:
            r3 = move-exception
            goto L27
        L10:
            java.lang.String r0 = r2.f62695a     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L24
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L24
            goto L25
        L24:
            r1 = 0
        L25:
            monitor-exit(r2)
            return r1
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.C8133c.a(java.lang.String):boolean");
    }

    @Override // o4.r
    public synchronized InterfaceC7066a b(String str) {
        try {
            String str2 = this.f62695a;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f62695a, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i(new C8132b(B4.r.b("android-keystore://", str), this.f62696b));
    }

    synchronized boolean f(String str) {
        String strB;
        strB = B4.r.b("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(f62694d, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                h();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f62696b = keyStore;
                keyStore.load(null);
                return this.f62696b.containsAlias(strB);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            }
        }
        return this.f62696b.containsAlias(strB);
    }

    private C8133c(a aVar) {
        this.f62695a = aVar.f62697a;
        this.f62696b = aVar.f62698b;
    }
}
