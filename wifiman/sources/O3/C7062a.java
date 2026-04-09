package o3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import r3.C7568f;
import r3.ServiceConnectionC7563a;
import s3.AbstractC7901p;
import z3.e;
import z3.f;

/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7062a {

    /* renamed from: a, reason: collision with root package name */
    ServiceConnectionC7563a f55253a;

    /* renamed from: b, reason: collision with root package name */
    f f55254b;

    /* renamed from: c, reason: collision with root package name */
    boolean f55255c;

    /* renamed from: d, reason: collision with root package name */
    final Object f55256d = new Object();

    /* renamed from: e, reason: collision with root package name */
    C7064c f55257e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f55258f;

    /* renamed from: g, reason: collision with root package name */
    final long f55259g;

    /* renamed from: o3.a$a, reason: collision with other inner class name */
    public static final class C1997a {

        /* renamed from: a, reason: collision with root package name */
        private final String f55260a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f55261b;

        public C1997a(String str, boolean z10) {
            this.f55260a = str;
            this.f55261b = z10;
        }

        public String a() {
            return this.f55260a;
        }

        public boolean b() {
            return this.f55261b;
        }

        public String toString() {
            String str = this.f55260a;
            boolean z10 = this.f55261b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public C7062a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        AbstractC7901p.l(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f55258f = context;
        this.f55255c = false;
        this.f55259g = j10;
    }

    public static C1997a a(Context context) {
        C7062a c7062a = new C7062a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c7062a.d(false);
            C1997a c1997aF = c7062a.f(-1);
            c7062a.e(c1997aF, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return c1997aF;
        } finally {
        }
    }

    public static void b(boolean z10) {
    }

    private final C1997a f(int i10) {
        C1997a c1997a;
        AbstractC7901p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f55255c) {
                    synchronized (this.f55256d) {
                        C7064c c7064c = this.f55257e;
                        if (c7064c == null || !c7064c.f55266d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f55255c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                AbstractC7901p.l(this.f55253a);
                AbstractC7901p.l(this.f55254b);
                try {
                    c1997a = new C1997a(this.f55254b.zzc(), this.f55254b.s(true));
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g();
        return c1997a;
    }

    private final void g() {
        synchronized (this.f55256d) {
            C7064c c7064c = this.f55257e;
            if (c7064c != null) {
                c7064c.f55265c.countDown();
                try {
                    this.f55257e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f55259g;
            if (j10 > 0) {
                this.f55257e = new C7064c(this, j10);
            }
        }
    }

    public final void c() {
        AbstractC7901p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f55258f == null || this.f55253a == null) {
                    return;
                }
                try {
                    if (this.f55255c) {
                        v3.b.b().c(this.f55258f, this.f55253a);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.f55255c = false;
                this.f55254b = null;
                this.f55253a = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    protected final void d(boolean z10) {
        AbstractC7901p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f55255c) {
                    c();
                }
                Context context = this.f55258f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iH = C7568f.f().h(context, 12451000);
                    if (iH != 0 && iH != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC7563a serviceConnectionC7563a = new ServiceConnectionC7563a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!v3.b.b().a(context, intent, serviceConnectionC7563a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f55253a = serviceConnectionC7563a;
                        try {
                            this.f55254b = e.b(serviceConnectionC7563a.a(10000L, TimeUnit.MILLISECONDS));
                            this.f55255c = true;
                            if (z10) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } finally {
                        IOException iOException = new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    final boolean e(C1997a c1997a, boolean z10, float f10, long j10, String str, Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (c1997a != null) {
            map.put("limit_ad_tracking", true != c1997a.b() ? "0" : "1");
            String strA = c1997a.a();
            if (strA != null) {
                map.put("ad_id_size", Integer.toString(strA.length()));
            }
        }
        if (th2 != null) {
            map.put("error", th2.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j10));
        new C7063b(this, map).start();
        return true;
    }

    protected final void finalize() throws Throwable {
        c();
        super.finalize();
    }
}
