package n2;

import J2.f;
import J2.g;
import M2.u;
import U2.d;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import g5.C2340a;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2687b {

    /* renamed from: a, reason: collision with root package name */
    public J2.a f22312a;

    /* renamed from: b, reason: collision with root package name */
    public d f22313b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22314c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22315d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public c f22316e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f22317f;

    /* renamed from: g, reason: collision with root package name */
    public final long f22318g;

    public C2687b(Context context, long j6, boolean z6) {
        Context applicationContext;
        u.e(context);
        if (z6 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f22317f = context;
        this.f22314c = false;
        this.f22318g = j6;
    }

    public static C2686a a(Context context) {
        C2687b c2687b = new C2687b(context, -1L, true);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c2687b.d(false);
            C2686a c2686aF = c2687b.f();
            e(c2686aF, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            return c2686aF;
        } finally {
        }
    }

    public static boolean b(Context context) {
        boolean z6;
        C2687b c2687b = new C2687b(context, -1L, false);
        try {
            c2687b.d(false);
            u.d("Calling this from your main thread can lead to deadlock");
            synchronized (c2687b) {
                try {
                    if (!c2687b.f22314c) {
                        synchronized (c2687b.f22315d) {
                            c cVar = c2687b.f22316e;
                            if (cVar == null || !cVar.f22322d) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            c2687b.d(false);
                            if (!c2687b.f22314c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e6) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e6);
                        }
                    }
                    u.e(c2687b.f22312a);
                    u.e(c2687b.f22313b);
                    try {
                        U2.b bVar = (U2.b) c2687b.f22313b;
                        bVar.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel parcelG0 = bVar.g0(parcelObtain, 6);
                        int i = U2.a.f3699a;
                        z6 = parcelG0.readInt() != 0;
                        parcelG0.recycle();
                    } catch (RemoteException e7) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e7);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c2687b.g();
            return z6;
        } finally {
            c2687b.c();
        }
    }

    public static void e(C2686a c2686a, long j6, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (c2686a != null) {
                map.put("limit_ad_tracking", true != c2686a.f22311b ? "0" : "1");
                String str = c2686a.f22310a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j6));
            new C2340a(1, map).start();
        }
    }

    public final void c() {
        u.d("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f22317f == null || this.f22312a == null) {
                    return;
                }
                try {
                    if (this.f22314c) {
                        P2.a.a().b(this.f22317f, this.f22312a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f22314c = false;
                this.f22313b = null;
                this.f22312a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(boolean z6) {
        u.d("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f22314c) {
                    c();
                }
                Context context = this.f22317f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC = f.f2059b.c(context, 12451000);
                    if (iC != 0 && iC != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    J2.a aVar = new J2.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!P2.a.a().c(context, context.getClass().getName(), intent, aVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f22312a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder iBinderA = aVar.a();
                            int i = U2.c.f3701a;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f22313b = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new U2.b(iBinderA);
                            this.f22314c = true;
                            if (z6) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C2686a f() {
        C2686a c2686a;
        u.d("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f22314c) {
                    synchronized (this.f22315d) {
                        c cVar = this.f22316e;
                        if (cVar == null || !cVar.f22322d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f22314c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e6) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e6);
                    }
                }
                u.e(this.f22312a);
                u.e(this.f22313b);
                try {
                    U2.b bVar = (U2.b) this.f22313b;
                    bVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelG0 = bVar.g0(parcelObtain, 1);
                    String string = parcelG0.readString();
                    parcelG0.recycle();
                    U2.b bVar2 = (U2.b) this.f22313b;
                    bVar2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = U2.a.f3699a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelG02 = bVar2.g0(parcelObtain2, 2);
                    boolean z6 = parcelG02.readInt() != 0;
                    parcelG02.recycle();
                    c2686a = new C2686a(string, z6);
                } catch (RemoteException e7) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e7);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return c2686a;
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f22315d) {
            c cVar = this.f22316e;
            if (cVar != null) {
                cVar.f22321c.countDown();
                try {
                    this.f22316e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j6 = this.f22318g;
            if (j6 > 0) {
                this.f22316e = new c(this, j6);
            }
        }
    }
}
