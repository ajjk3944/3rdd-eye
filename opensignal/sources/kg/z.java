package kg;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Log;
import io.sentry.android.core.e0;
import java.io.IOException;

/* loaded from: classes.dex */
public final class z implements Runnable {
    public static Boolean B;
    public static Boolean D;

    /* renamed from: y, reason: collision with root package name */
    public static final Object f14429y = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f14430a;

    /* renamed from: d, reason: collision with root package name */
    public final n f14431d;

    /* renamed from: g, reason: collision with root package name */
    public final PowerManager.WakeLock f14432g;

    /* renamed from: r, reason: collision with root package name */
    public final x f14433r;

    /* renamed from: x, reason: collision with root package name */
    public final long f14434x;

    public z(x xVar, Context context, n nVar, long j) {
        this.f14433r = xVar;
        this.f14430a = context;
        this.f14434x = j;
        this.f14431d = nVar;
        this.f14432g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f14429y) {
            try {
                Boolean bool = D;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                D = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context) {
        boolean zBooleanValue;
        synchronized (f14429y) {
            try {
                Boolean bool = B;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                B = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean c() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f14430a     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.z.c():boolean");
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f14433r;
        Context context = this.f14430a;
        boolean zB = b(context);
        PowerManager.WakeLock wakeLock = this.f14432g;
        if (zB) {
            wakeLock.acquire(g.f14362a);
        }
        try {
            try {
                try {
                    xVar.d(true);
                    if (!this.f14431d.e()) {
                        xVar.d(false);
                        if (b(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (!a(context) || c()) {
                        if (xVar.e()) {
                            xVar.d(false);
                        } else {
                            xVar.f(this.f14434x);
                        }
                        if (b(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    y yVar = new y();
                    yVar.f14428a = this;
                    Log.isLoggable("FirebaseMessaging", 3);
                    context.registerReceiver(yVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    if (b(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                } catch (IOException e4) {
                    e0.d("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e4.getMessage());
                    xVar.d(false);
                    if (b(context)) {
                        wakeLock.release();
                    }
                }
            } catch (RuntimeException unused3) {
            }
        } catch (Throwable th2) {
            if (b(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th2;
        }
    }
}
