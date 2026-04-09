package u4;

import B4.k;
import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import o4.AbstractC7068c;
import o4.C7067b;
import o4.InterfaceC7066a;
import o4.l;
import o4.n;
import o4.o;
import o4.q;

/* renamed from: u4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8131a {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f62678d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final String f62679e = "a";

    /* renamed from: a, reason: collision with root package name */
    private final q f62680a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7066a f62681b;

    /* renamed from: c, reason: collision with root package name */
    private o f62682c;

    /* renamed from: u4.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Context f62683a = null;

        /* renamed from: b, reason: collision with root package name */
        private String f62684b = null;

        /* renamed from: c, reason: collision with root package name */
        private String f62685c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f62686d = null;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC7066a f62687e = null;

        /* renamed from: f, reason: collision with root package name */
        private boolean f62688f = true;

        /* renamed from: g, reason: collision with root package name */
        private l f62689g = null;

        /* renamed from: h, reason: collision with root package name */
        private o f62690h;

        private o g() throws GeneralSecurityException {
            if (this.f62689g == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            o oVarA = o.i().a(this.f62689g);
            o oVarH = oVarA.h(oVarA.d().i().Y(0).Y());
            C8134d c8134d = new C8134d(this.f62683a, this.f62684b, this.f62685c);
            if (this.f62687e != null) {
                oVarH.d().r(c8134d, this.f62687e);
            } else {
                AbstractC7068c.b(oVarH.d(), c8134d);
            }
            return oVarH;
        }

        private static byte[] h(Context context, String str, String str2) throws CharConversionException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return k.a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        private o i(byte[] bArr) {
            return o.j(AbstractC7068c.a(C7067b.c(bArr)));
        }

        private o j(byte[] bArr) {
            try {
                this.f62687e = new C8133c().b(this.f62686d);
                try {
                    return o.j(n.n(C7067b.c(bArr), this.f62687e));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return i(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    o oVarI = i(bArr);
                    Log.w(C8131a.f62679e, "cannot use Android Keystore, it'll be disabled", e11);
                    return oVarI;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        private InterfaceC7066a k() throws KeyStoreException {
            if (!C8131a.e()) {
                Log.w(C8131a.f62679e, "Android Keystore requires at least Android M");
                return null;
            }
            C8133c c8133c = new C8133c();
            try {
                boolean zD = C8133c.d(this.f62686d);
                try {
                    return c8133c.b(this.f62686d);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!zD) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f62686d), e10);
                    }
                    Log.w(C8131a.f62679e, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(C8131a.f62679e, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public synchronized C8131a f() {
            C8131a c8131a;
            try {
                if (this.f62684b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                synchronized (C8131a.f62678d) {
                    try {
                        byte[] bArrH = h(this.f62683a, this.f62684b, this.f62685c);
                        if (bArrH == null) {
                            if (this.f62686d != null) {
                                this.f62687e = k();
                            }
                            this.f62690h = g();
                        } else if (this.f62686d == null || !C8131a.e()) {
                            this.f62690h = i(bArrH);
                        } else {
                            this.f62690h = j(bArrH);
                        }
                        c8131a = new C8131a(this);
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return c8131a;
        }

        public b l(l lVar) {
            this.f62689g = lVar;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f62688f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f62686d = str;
            return this;
        }

        public b n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f62683a = context;
            this.f62684b = str;
            this.f62685c = str2;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e() {
        return true;
    }

    public synchronized n d() {
        return this.f62682c.d();
    }

    private C8131a(b bVar) {
        this.f62680a = new C8134d(bVar.f62683a, bVar.f62684b, bVar.f62685c);
        this.f62681b = bVar.f62687e;
        this.f62682c = bVar.f62690h;
    }
}
