package r3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import s3.AbstractC7901p;
import s3.S;
import s3.T;

/* loaded from: classes.dex */
abstract class y {

    /* renamed from: e, reason: collision with root package name */
    private static volatile T f60114e;

    /* renamed from: g, reason: collision with root package name */
    private static Context f60116g;

    /* renamed from: a, reason: collision with root package name */
    static final w f60110a = new q(u.f("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b, reason: collision with root package name */
    static final w f60111b = new r(u.f("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c, reason: collision with root package name */
    static final w f60112c = new s(u.f("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d, reason: collision with root package name */
    static final w f60113d = new t(u.f("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f, reason: collision with root package name */
    private static final Object f60115f = new Object();

    static H a(String str, u uVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, uVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static H b(String str, boolean z10, boolean z11, boolean z12) {
        return g(str, z10, false, false, true);
    }

    static /* synthetic */ String c(boolean z10, String str, u uVar) throws NoSuchAlgorithmException {
        String str2 = (z10 || !f(str, uVar, true, false).f60064a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = com.google.android.gms.common.util.a.b("SHA-256");
        AbstractC7901p.l(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.i.a(messageDigestB.digest(uVar.n0())), Boolean.valueOf(z10), "12451000.false");
    }

    static synchronized void d(Context context) {
        if (f60116g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f60116g = context.getApplicationContext();
        }
    }

    static boolean e() {
        boolean zZzi;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                zZzi = f60114e.zzi();
            } catch (RemoteException | DynamiteModule.LoadingException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                zZzi = false;
            }
            return zZzi;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static H f(final String str, final u uVar, final boolean z10, boolean z11) {
        try {
            h();
            AbstractC7901p.l(f60116g);
            try {
                return f60114e.C(new D(str, uVar, z10, z11), x3.b.n0(f60116g.getPackageManager())) ? H.b() : new F(new Callable() { // from class: r3.p
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return y.c(z10, str, uVar);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return H.d("module call", e10);
            }
        } catch (DynamiteModule.LoadingException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return H.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, x3.a] */
    private static H g(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        H hD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            AbstractC7901p.l(f60116g);
            try {
                h();
                z zVar = new z(str, z10, false, x3.b.n0(f60116g), false, true);
                try {
                    B bW = z13 ? f60114e.w(zVar) : f60114e.j(zVar);
                    if (bW.e()) {
                        hD = H.f(bW.f());
                    } else {
                        String strB = bW.b();
                        PackageManager.NameNotFoundException nameNotFoundException = bW.g() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strB == null) {
                            strB = "error checking package certificate";
                        }
                        hD = H.g(bW.f(), bW.g(), strB, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    hD = H.d("module call", e10);
                }
            } catch (DynamiteModule.LoadingException e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                hD = H.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return hD;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    private static void h() {
        if (f60114e != null) {
            return;
        }
        AbstractC7901p.l(f60116g);
        synchronized (f60115f) {
            try {
                if (f60114e == null) {
                    f60114e = S.c(DynamiteModule.e(f60116g, DynamiteModule.f34900f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
