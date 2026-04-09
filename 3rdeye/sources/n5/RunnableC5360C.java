package n5;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: TopicsSyncTask.java */
/* renamed from: n5.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC5360C implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f44295g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f44296h;
    public static Boolean i;

    /* renamed from: b, reason: collision with root package name */
    public final Context f44297b;

    /* renamed from: c, reason: collision with root package name */
    public final o f44298c;

    /* renamed from: d, reason: collision with root package name */
    public final PowerManager.WakeLock f44299d;

    /* renamed from: e, reason: collision with root package name */
    public final C5359B f44300e;

    /* renamed from: f, reason: collision with root package name */
    public final long f44301f;

    /* compiled from: TopicsSyncTask.java */
    /* renamed from: n5.C$a */
    public class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public RunnableC5360C f44302a;

        public a(RunnableC5360C runnableC5360C) {
            this.f44302a = runnableC5360C;
        }

        public final void a() {
            if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC5360C runnableC5360C = RunnableC5360C.this;
            runnableC5360C.f44297b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final synchronized void onReceive(Context context, Intent intent) {
            try {
                RunnableC5360C runnableC5360C = this.f44302a;
                if (runnableC5360C == null) {
                    return;
                }
                if (runnableC5360C.d()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    RunnableC5360C runnableC5360C2 = this.f44302a;
                    runnableC5360C2.f44300e.f44292f.schedule(runnableC5360C2, 0L, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.f44302a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public RunnableC5360C(C5359B c5359b, Context context, o oVar, long j4) {
        this.f44300e = c5359b;
        this.f44297b = context;
        this.f44301f = j4;
        this.f44298c = oVar;
        this.f44299d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f44295g) {
            try {
                Boolean bool = i;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                i = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (f44295g) {
            try {
                Boolean bool = f44296h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f44296h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean d() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f44297b     // Catch: java.lang.Throwable -> L12
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
        throw new UnsupportedOperationException("Method not decompiled: n5.RunnableC5360C.d():boolean");
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        C5359B c5359b = this.f44300e;
        Context context = this.f44297b;
        boolean zC = c(context);
        PowerManager.WakeLock wakeLock = this.f44299d;
        if (zC) {
            wakeLock.acquire(C5369f.f44338a);
        }
        try {
            try {
                try {
                    c5359b.f(true);
                    if (!this.f44298c.e()) {
                        c5359b.f(false);
                        if (!c(context)) {
                            return;
                        }
                    } else if (!a(context) || d()) {
                        if (c5359b.g()) {
                            c5359b.f(false);
                        } else {
                            c5359b.h(this.f44301f);
                        }
                        if (!c(context)) {
                            return;
                        }
                    } else {
                        new a(this).a();
                        if (!c(context)) {
                            return;
                        }
                    }
                    wakeLock.release();
                } catch (Throwable th) {
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e4.getMessage());
                c5359b.f(false);
                if (c(context)) {
                    wakeLock.release();
                }
            }
        } catch (RuntimeException unused2) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
