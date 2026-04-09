package kg;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import io.sentry.android.core.e0;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14355a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f14356b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f14357c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f14358d;

    /* renamed from: e, reason: collision with root package name */
    public b0 f14359e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14360f;

    public d0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new hc.a("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f14358d = new ArrayDeque();
        this.f14360f = false;
        Context applicationContext = context.getApplicationContext();
        this.f14355a = applicationContext;
        this.f14356b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f14357c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            Log.isLoggable("FirebaseMessaging", 3);
            while (!this.f14358d.isEmpty()) {
                Log.isLoggable("FirebaseMessaging", 3);
                b0 b0Var = this.f14359e;
                if (b0Var == null || !b0Var.isBinderAlive()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (!this.f14360f) {
                        this.f14360f = true;
                        try {
                        } catch (SecurityException e4) {
                            e0.c("FirebaseMessaging", "Exception while binding the service", e4);
                        }
                        if (!fc.a.b().a(this.f14355a, this.f14356b, this, 65)) {
                            e0.d("FirebaseMessaging", "binding to the service failed");
                            this.f14360f = false;
                            ArrayDeque arrayDeque = this.f14358d;
                            while (!arrayDeque.isEmpty()) {
                                ((c0) arrayDeque.poll()).f14352b.c(null);
                            }
                        }
                    }
                    return;
                }
                Log.isLoggable("FirebaseMessaging", 3);
                this.f14359e.a((c0) this.f14358d.poll());
            }
        } finally {
        }
    }

    public final synchronized dd.r b(Intent intent) {
        c0 c0Var;
        Log.isLoggable("FirebaseMessaging", 3);
        c0Var = new c0(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f14357c;
        c0Var.f14352b.f7294a.b(scheduledThreadPoolExecutor, new io.sentry.android.replay.capture.e(13, scheduledThreadPoolExecutor.schedule(new j4.o(7, c0Var), 20L, TimeUnit.SECONDS)));
        this.f14358d.add(c0Var);
        a();
        return c0Var.f14352b.f7294a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f14360f = false;
            if (iBinder instanceof b0) {
                this.f14359e = (b0) iBinder;
                a();
                return;
            }
            e0.d("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f14358d;
            while (!arrayDeque.isEmpty()) {
                ((c0) arrayDeque.poll()).f14352b.c(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
