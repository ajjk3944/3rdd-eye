package n5;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WithinAppServiceConnection.java */
/* renamed from: n5.F, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC5363F implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f44308a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f44309b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f44310c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f44311d;

    /* renamed from: e, reason: collision with root package name */
    public BinderC5362E f44312e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f44313f;

    /* compiled from: WithinAppServiceConnection.java */
    /* renamed from: n5.F$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f44314a;

        /* renamed from: b, reason: collision with root package name */
        public final TaskCompletionSource<Void> f44315b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.f44314a = intent;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public ServiceConnectionC5363F(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f44311d = new ArrayDeque();
        this.f44313f = false;
        Context applicationContext = context.getApplicationContext();
        this.f44308a = applicationContext;
        this.f44309b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f44310c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f44311d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                BinderC5362E binderC5362E = this.f44312e;
                if (binderC5362E == null || !binderC5362E.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f44312e.a((a) this.f44311d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Task<Void> b(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f44310c;
            aVar.f44315b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new B.f(scheduledThreadPoolExecutor.schedule(new C8.a(aVar, 20), 20L, TimeUnit.SECONDS), 17));
            this.f44311d.add(aVar);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.f44315b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f44313f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f44313f) {
            return;
        }
        this.f44313f = true;
        try {
        } catch (SecurityException e4) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e4);
        }
        if (ConnectionTracker.getInstance().bindService(this.f44308a, this.f44309b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f44313f = false;
        while (true) {
            ArrayDeque arrayDeque = this.f44311d;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((a) arrayDeque.poll()).f44315b.trySetResult(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f44313f = false;
            if (iBinder instanceof BinderC5362E) {
                this.f44312e = (BinderC5362E) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f44311d;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((a) arrayDeque.poll()).f44315b.trySetResult(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
