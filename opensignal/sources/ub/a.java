package ub;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import c5.h;
import cc.f0;
import cc.s;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import lc.c;
import lc.d;
import zb.e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public zb.a f23508a;

    /* renamed from: b, reason: collision with root package name */
    public d f23509b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23510c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23511d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public b f23512e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f23513f;

    /* renamed from: g, reason: collision with root package name */
    public final long f23514g;

    public a(Context context) {
        s.h(context);
        Context applicationContext = context.getApplicationContext();
        this.f23513f = applicationContext != null ? applicationContext : context;
        this.f23510c = false;
        this.f23514g = -1L;
    }

    public static f0 a(Context context) {
        a aVar = new a(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c();
            f0 f0VarE = aVar.e();
            d(f0VarE, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            return f0VarE;
        } finally {
        }
    }

    public static void d(f0 f0Var, long j, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (f0Var != null) {
                map.put("limit_ad_tracking", true != f0Var.f3648b ? "0" : "1");
                String str = f0Var.f3649c;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th2 != null) {
                map.put("error", th2.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new h(map).start();
        }
    }

    public final void b() {
        s.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f23513f == null || this.f23508a == null) {
                    return;
                }
                try {
                    if (this.f23510c) {
                        fc.a.b().c(this.f23513f, this.f23508a);
                    }
                } catch (Throwable unused) {
                }
                this.f23510c = false;
                this.f23509b = null;
                this.f23508a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        s.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f23510c) {
                    b();
                }
                Context context = this.f23513f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iB = zb.d.f26817b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    zb.a aVar = new zb.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!fc.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f23508a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder iBinderA = aVar.a();
                            int i10 = c.f15134d;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f23509b = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new lc.b(iBinderA);
                            this.f23510c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } finally {
                        IOException iOException = new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new e(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final f0 e() {
        f0 f0Var;
        s.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f23510c) {
                    synchronized (this.f23511d) {
                        b bVar = this.f23512e;
                        if (bVar == null || !bVar.f23518r) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.f23510c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e4) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e4);
                    }
                }
                s.h(this.f23508a);
                s.h(this.f23509b);
                try {
                    lc.b bVar2 = (lc.b) this.f23509b;
                    bVar2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z10 = true;
                    Parcel parcelD = bVar2.d(parcelObtain, 1);
                    String string = parcelD.readString();
                    parcelD.recycle();
                    lc.b bVar3 = (lc.b) this.f23509b;
                    bVar3.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i10 = lc.a.f15132a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelD2 = bVar3.d(parcelObtain2, 2);
                    if (parcelD2.readInt() == 0) {
                        z10 = false;
                    }
                    parcelD2.recycle();
                    f0Var = new f0(string, z10, 3);
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f23511d) {
            b bVar4 = this.f23512e;
            if (bVar4 != null) {
                bVar4.f23517g.countDown();
                try {
                    this.f23512e.join();
                } catch (InterruptedException unused2) {
                }
            }
            long j = this.f23514g;
            if (j > 0) {
                this.f23512e = new b(this, j);
            }
        }
        return f0Var;
    }

    public final void finalize() throws Throwable {
        b();
        super.finalize();
    }
}
