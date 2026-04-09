package com.google.firebase.messaging;

import B4.e;
import C.C0635w;
import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.applovin.impl.A0;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import d5.C4276a;
import d5.b;
import d5.d;
import e5.g;
import f2.RunnableC4331a;
import f5.InterfaceC4335a;
import g5.InterfaceC4392b;
import h5.c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n5.C5359B;
import n5.j;
import n5.l;
import n5.n;
import n5.o;
import n5.q;
import n5.u;
import n5.x;
import q5.f;
import v3.i;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: l, reason: collision with root package name */
    public static com.google.firebase.messaging.a f23255l;

    /* renamed from: n, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f23257n;

    /* renamed from: a, reason: collision with root package name */
    public final e f23258a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4335a f23259b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f23260c;

    /* renamed from: d, reason: collision with root package name */
    public final l f23261d;

    /* renamed from: e, reason: collision with root package name */
    public final u f23262e;

    /* renamed from: f, reason: collision with root package name */
    public final a f23263f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f23264g;

    /* renamed from: h, reason: collision with root package name */
    public final ThreadPoolExecutor f23265h;
    public final o i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23266j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f23254k = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: m, reason: collision with root package name */
    public static InterfaceC4392b<i> f23256m = new J4.l(1);

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final d f23267a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f23268b;

        /* renamed from: c, reason: collision with root package name */
        public Boolean f23269c;

        public a(d dVar) {
            this.f23267a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [n5.k] */
        public final synchronized void a() {
            try {
                if (this.f23268b) {
                    return;
                }
                Boolean boolC = c();
                this.f23269c = boolC;
                if (boolC == null) {
                    this.f23267a.b(new b() { // from class: n5.k
                        @Override // d5.b
                        public final void a(C4276a c4276a) {
                            FirebaseMessaging.a aVar = this.f44354a;
                            if (aVar.b()) {
                                com.google.firebase.messaging.a aVar2 = FirebaseMessaging.f23255l;
                                FirebaseMessaging.this.g();
                            }
                        }
                    });
                }
                this.f23268b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized boolean b() {
            Boolean bool;
            try {
                a();
                bool = this.f23269c;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f23258a.h();
        }

        public final Boolean c() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            e eVar = FirebaseMessaging.this.f23258a;
            eVar.a();
            Context context = eVar.f487a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(e eVar, InterfaceC4335a interfaceC4335a, InterfaceC4392b<f> interfaceC4392b, InterfaceC4392b<g> interfaceC4392b2, c cVar, InterfaceC4392b<i> interfaceC4392b3, d dVar) {
        eVar.a();
        Context context = eVar.f487a;
        final o oVar = new o(context);
        final l lVar = new l(eVar, oVar, interfaceC4392b, interfaceC4392b2, cVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        this.f23266j = false;
        f23256m = interfaceC4392b3;
        this.f23258a = eVar;
        this.f23259b = interfaceC4335a;
        this.f23263f = new a(dVar);
        eVar.a();
        final Context context2 = eVar.f487a;
        this.f23260c = context2;
        j jVar = new j();
        this.i = oVar;
        this.f23261d = lVar;
        this.f23262e = new u(executorServiceNewSingleThreadExecutor);
        this.f23264g = scheduledThreadPoolExecutor;
        this.f23265h = threadPoolExecutor;
        eVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(jVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC4335a != null) {
            interfaceC4335a.c();
        }
        scheduledThreadPoolExecutor.execute(new com.vungle.ads.internal.util.a(this, 7));
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i = C5359B.f44286j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: n5.A
            @Override // java.util.concurrent.Callable
            public final Object call() {
                z zVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                o oVar2 = oVar;
                l lVar2 = lVar;
                synchronized (z.class) {
                    try {
                        WeakReference<z> weakReference = z.f44394d;
                        zVar = weakReference != null ? weakReference.get() : null;
                        if (zVar == null) {
                            z zVar2 = new z(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            zVar2.b();
                            z.f44394d = new WeakReference<>(zVar2);
                            zVar = zVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new C5359B(firebaseMessaging, oVar2, zVar, lVar2, context3, scheduledThreadPoolExecutor3);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new M8.a(this, 13));
        scheduledThreadPoolExecutor.execute(new RunnableC4331a(this, 3));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static void b(Runnable runnable, long j4) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f23257n == null) {
                    f23257n = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                f23257n.schedule(runnable, j4, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized com.google.firebase.messaging.a c(Context context) {
        try {
            if (f23255l == null) {
                f23255l = new com.google.firebase.messaging.a(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f23255l;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(e eVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) eVar.b(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() throws IOException {
        Task taskContinueWithTask;
        InterfaceC4335a interfaceC4335a = this.f23259b;
        if (interfaceC4335a != null) {
            try {
                return (String) Tasks.await(interfaceC4335a.b());
            } catch (InterruptedException | ExecutionException e4) {
                throw new IOException(e4);
            }
        }
        a.C0348a c0348aD = d();
        if (!i(c0348aD)) {
            return c0348aD.f23274a;
        }
        String strC = o.c(this.f23258a);
        u uVar = this.f23262e;
        synchronized (uVar) {
            taskContinueWithTask = (Task) uVar.f44374b.get(strC);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strC);
                }
                l lVar = this.f23261d;
                taskContinueWithTask = lVar.a(lVar.c(o.c(lVar.f44355a), "*", new Bundle())).onSuccessTask(this.f23265h, new A0(this, strC, c0348aD)).continueWithTask(uVar.f44373a, new C0635w(9, uVar, strC));
                uVar.f44374b.put(strC, taskContinueWithTask);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strC);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public final a.C0348a d() {
        a.C0348a c0348aB;
        com.google.firebase.messaging.a aVarC = c(this.f23260c);
        e eVar = this.f23258a;
        eVar.a();
        String strD = "[DEFAULT]".equals(eVar.f488b) ? "" : eVar.d();
        String strC = o.c(this.f23258a);
        synchronized (aVarC) {
            c0348aB = a.C0348a.b(aVarC.f23272a.getString(strD + "|T|" + strC + "|*", null));
        }
        return c0348aB;
    }

    public final synchronized void e(boolean z10) {
        this.f23266j = z10;
    }

    public final boolean f() {
        Context context = this.f23260c;
        q.a(context);
        if (PlatformVersion.isAtLeastQ()) {
            if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                if (this.f23258a.b(F4.a.class) != null || (n.a() && f23256m != null)) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
        return false;
    }

    public final void g() {
        InterfaceC4335a interfaceC4335a = this.f23259b;
        if (interfaceC4335a != null) {
            interfaceC4335a.a();
        } else if (i(d())) {
            synchronized (this) {
                if (!this.f23266j) {
                    h(0L);
                }
            }
        }
    }

    public final synchronized void h(long j4) {
        b(new x(this, Math.min(Math.max(30L, 2 * j4), f23254k)), j4);
        this.f23266j = true;
    }

    public final boolean i(a.C0348a c0348a) {
        if (c0348a != null) {
            return System.currentTimeMillis() > c0348a.f23276c + a.C0348a.f23273d || !this.i.a().equals(c0348a.f23275b);
        }
        return true;
    }
}
