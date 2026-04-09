package androidx.security.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f32333a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyGenParameterSpec f32334b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32335a;

        static {
            int[] iArr = new int[c.values().length];
            f32335a = iArr;
            try {
                iArr[c.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: androidx.security.crypto.b$b, reason: collision with other inner class name */
    public static final class C1126b {

        /* renamed from: a, reason: collision with root package name */
        final String f32336a;

        /* renamed from: b, reason: collision with root package name */
        KeyGenParameterSpec f32337b;

        /* renamed from: c, reason: collision with root package name */
        c f32338c;

        /* renamed from: d, reason: collision with root package name */
        boolean f32339d;

        /* renamed from: e, reason: collision with root package name */
        int f32340e;

        /* renamed from: f, reason: collision with root package name */
        boolean f32341f;

        /* renamed from: g, reason: collision with root package name */
        final Context f32342g;

        /* renamed from: androidx.security.crypto.b$b$a */
        static class a {

            /* renamed from: androidx.security.crypto.b$b$a$a, reason: collision with other inner class name */
            static class C1127a {
                static void a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* renamed from: androidx.security.crypto.b$b$a$b, reason: collision with other inner class name */
            static class C1128b {
                static void a(KeyGenParameterSpec.Builder builder, int i10, int i11) {
                    builder.setUserAuthenticationParameters(i10, i11);
                }
            }

            static b a(C1126b c1126b) {
                c cVar = c1126b.f32338c;
                if (cVar == null && c1126b.f32337b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (cVar == c.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(c1126b.f32336a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    if (c1126b.f32339d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            C1128b.a(keySize, c1126b.f32340e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(c1126b.f32340e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && c1126b.f32341f && c1126b.f32342g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C1127a.a(keySize);
                    }
                    c1126b.f32337b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = c1126b.f32337b;
                if (keyGenParameterSpec != null) {
                    return new b(e.c(keyGenParameterSpec), c1126b.f32337b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            static String b(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public C1126b(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public b a() {
            return a.a(this);
        }

        public C1126b b(c cVar) {
            if (a.f32335a[cVar.ordinal()] == 1) {
                if (this.f32337b != null) {
                    throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                }
                this.f32338c = cVar;
                return this;
            }
            throw new IllegalArgumentException("Unsupported scheme: " + cVar);
        }

        public C1126b c(boolean z10) {
            this.f32341f = z10;
            return this;
        }

        public C1126b(Context context, String str) {
            this.f32342g = context.getApplicationContext();
            this.f32336a = str;
        }
    }

    public enum c {
        AES256_GCM
    }

    b(String str, Object obj) {
        this.f32333a = str;
        this.f32334b = (KeyGenParameterSpec) obj;
    }

    String a() {
        return this.f32333a;
    }

    public boolean b() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f32333a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f32333a + ", isKeyStoreBacked=" + b() + "}";
    }
}
