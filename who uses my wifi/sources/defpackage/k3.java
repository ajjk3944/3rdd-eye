package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k3 {
    public ab a;
    public h63 b;
    public boolean c;
    public final Object d = new Object();
    public ru1 e;
    public final Context f;
    public final long g;

    public k3(Context context, long j, boolean z) {
        Context applicationContext;
        ou1.j(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.c = false;
        this.g = j;
    }

    public static j3 a(Context context) {
        k3 k3Var = new k3(context, -1L, true);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            k3Var.d(false);
            j3 j3VarF = k3Var.f();
            e(j3VarF, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            return j3VarF;
        } finally {
        }
    }

    public static boolean b(Context context) {
        boolean z;
        k3 k3Var = new k3(context, -1L, false);
        try {
            k3Var.d(false);
            ou1.i("Calling this from your main thread can lead to deadlock");
            synchronized (k3Var) {
                try {
                    if (!k3Var.c) {
                        synchronized (k3Var.d) {
                            ru1 ru1Var = k3Var.e;
                            if (ru1Var == null || !ru1Var.i) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            k3Var.d(false);
                            if (!k3Var.c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                        }
                    }
                    ou1.j(k3Var.a);
                    ou1.j(k3Var.b);
                    try {
                        jn2 jn2Var = (jn2) k3Var.b;
                        jn2Var.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel parcelT = jn2Var.T(parcelObtain, 6);
                        int i = ac2.a;
                        z = parcelT.readInt() != 0;
                        parcelT.recycle();
                    } catch (RemoteException unused) {
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            k3Var.g();
            return z;
        } finally {
            k3Var.c();
        }
    }

    public static void e(j3 j3Var, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (j3Var != null) {
                map.put("limit_ad_tracking", true != j3Var.b ? "0" : "1");
                String str = j3Var.a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new ed1(map).start();
        }
    }

    public final void c() {
        ou1.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        sq0.n().o(this.f, this.a);
                    }
                } catch (Throwable unused) {
                }
                this.c = false;
                this.b = null;
                this.a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(boolean z) {
        ou1.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    c();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC = gz.b.c(context, 12451000);
                    if (iC != 0 && iC != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ab abVar = new ab();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!sq0.n().s(context, context.getClass().getName(), intent, abVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.a = abVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder iBinderA = abVar.a();
                            int i = kx2.f;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.b = iInterfaceQueryLocalInterface instanceof h63 ? (h63) iInterfaceQueryLocalInterface : new jn2(iBinderA);
                            this.c = true;
                            if (z) {
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
                    throw new nz();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final j3 f() {
        j3 j3Var;
        ou1.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        ru1 ru1Var = this.e;
                        if (ru1Var == null || !ru1Var.i) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                ou1.j(this.a);
                ou1.j(this.b);
                try {
                    jn2 jn2Var = (jn2) this.b;
                    jn2Var.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelT = jn2Var.T(parcelObtain, 1);
                    String string = parcelT.readString();
                    parcelT.recycle();
                    jn2 jn2Var2 = (jn2) this.b;
                    jn2Var2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = ac2.a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelT2 = jn2Var2.T(parcelObtain2, 2);
                    boolean z = parcelT2.readInt() != 0;
                    parcelT2.recycle();
                    j3Var = new j3(string, z);
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return j3Var;
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.d) {
            ru1 ru1Var = this.e;
            if (ru1Var != null) {
                ru1Var.h.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new ru1(this, j);
            }
        }
    }
}
