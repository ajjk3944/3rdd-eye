package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import bf.g;
import bg.c;
import cc.s;
import com.google.android.gms.internal.measurement.e5;
import com.google.firebase.messaging.FirebaseMessaging;
import d8.a;
import dd.r;
import eg.b;
import fg.e;
import h7.r1;
import h9.r2;
import io.sentry.android.core.e0;
import io.sentry.h4;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kg.i;
import kg.j;
import kg.l;
import kg.n;
import kg.q;
import kg.t;
import kg.x;
import lf.t1;
import se.f;
import yb.k;

/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static r1 k;

    /* renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f5821m;

    /* renamed from: a, reason: collision with root package name */
    public final f f5822a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5823b;

    /* renamed from: c, reason: collision with root package name */
    public final r2 f5824c;

    /* renamed from: d, reason: collision with root package name */
    public final i f5825d;

    /* renamed from: e, reason: collision with root package name */
    public final a f5826e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f5827f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f5828g;

    /* renamed from: h, reason: collision with root package name */
    public final n f5829h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5830i;
    public static final long j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: l, reason: collision with root package name */
    public static b f5820l = new g(6);

    public FirebaseMessaging(f fVar, b bVar, b bVar2, e eVar, b bVar3, c cVar) {
        fVar.a();
        Context context = fVar.f22007a;
        final n nVar = new n();
        final int i10 = 0;
        nVar.f14382b = 0;
        nVar.f14383c = context;
        fVar.a();
        yb.a aVar = new yb.a(fVar.f22007a);
        final r2 r2Var = new r2();
        r2Var.f10470a = fVar;
        r2Var.f10471d = nVar;
        r2Var.f10472g = aVar;
        r2Var.f10473r = bVar;
        r2Var.f10474x = bVar2;
        r2Var.f10475y = eVar;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new hc.a("Firebase-Messaging-Task"));
        final int i11 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new hc.a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new hc.a("Firebase-Messaging-File-Io"));
        this.f5830i = false;
        f5820l = bVar3;
        this.f5822a = fVar;
        a aVar2 = new a();
        aVar2.f7150d = this;
        aVar2.f7149c = cVar;
        this.f5826e = aVar2;
        fVar.a();
        final Context context2 = fVar.f22007a;
        this.f5823b = context2;
        j jVar = new j();
        this.f5829h = nVar;
        this.f5824c = r2Var;
        this.f5825d = new i(executorServiceNewSingleThreadExecutor);
        this.f5827f = scheduledThreadPoolExecutor;
        this.f5828g = threadPoolExecutor;
        fVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(jVar);
        } else {
            e0.p("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: kg.k

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f14375d;

            {
                this.f14375d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dd.r rVarT;
                int i12;
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f14375d;
                        if (firebaseMessaging.f5826e.j() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f5830i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f14375d;
                        Context context3 = firebaseMessaging2.f5823b;
                        t1.x(context3);
                        r2 r2Var2 = firebaseMessaging2.f5824c;
                        boolean zF = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesC = se.b.C(context3);
                            if (!sharedPreferencesC.contains("proxy_retention") || sharedPreferencesC.getBoolean("proxy_retention", false) != zF) {
                                yb.a aVar3 = (yb.a) r2Var2.f10472g;
                                if (aVar3.f26207c.s() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    yb.k kVarG = yb.k.g(aVar3.f26206b);
                                    synchronized (kVarG) {
                                        i12 = kVarG.f26240a;
                                        kVarG.f26240a = i12 + 1;
                                    }
                                    rVarT = kVarG.h(new yb.j(i12, 4, bundle, 0));
                                } else {
                                    rVarT = e5.t(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                rVarT.d(new e7.d(0), new e5.g(context3, zF, 4));
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new hc.a("Firebase-Messaging-Topics-Io"));
        int i12 = x.j;
        e5.n(scheduledThreadPoolExecutor2, new Callable() { // from class: kg.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                v vVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                n nVar2 = nVar;
                r2 r2Var2 = r2Var;
                synchronized (v.class) {
                    try {
                        WeakReference weakReference = v.f14412b;
                        vVar = weakReference != null ? (v) weakReference.get() : null;
                        if (vVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            v vVar2 = new v();
                            synchronized (vVar2) {
                                vVar2.f14413a = cj.a.t(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            v.f14412b = new WeakReference(vVar2);
                            vVar = vVar2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new x(firebaseMessaging, nVar2, vVar, r2Var2, context3, scheduledThreadPoolExecutor3);
            }
        }).d(scheduledThreadPoolExecutor, new l(this, i10));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: kg.k

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f14375d;

            {
                this.f14375d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dd.r rVarT;
                int i122;
                switch (i11) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f14375d;
                        if (firebaseMessaging.f5826e.j() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f5830i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f14375d;
                        Context context3 = firebaseMessaging2.f5823b;
                        t1.x(context3);
                        r2 r2Var2 = firebaseMessaging2.f5824c;
                        boolean zF = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesC = se.b.C(context3);
                            if (!sharedPreferencesC.contains("proxy_retention") || sharedPreferencesC.getBoolean("proxy_retention", false) != zF) {
                                yb.a aVar3 = (yb.a) r2Var2.f10472g;
                                if (aVar3.f26207c.s() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    yb.k kVarG = yb.k.g(aVar3.f26206b);
                                    synchronized (kVarG) {
                                        i122 = kVarG.f26240a;
                                        kVarG.f26240a = i122 + 1;
                                    }
                                    rVarT = kVarG.h(new yb.j(i122, 4, bundle, 0));
                                } else {
                                    rVarT = e5.t(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                rVarT.d(new e7.d(0), new e5.g(context3, zF, 4));
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j7) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f5821m == null) {
                    f5821m = new ScheduledThreadPoolExecutor(1, new hc.a("TAG"));
                }
                f5821m.schedule(runnable, j7, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized r1 c(Context context) {
        try {
            if (k == null) {
                k = new r1(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return k;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(f fVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) fVar.b(FirebaseMessaging.class);
        s.i(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        r rVarF;
        kg.s sVarD = d();
        if (!h(sVarD)) {
            return sVarD.f14400a;
        }
        String strC = n.c(this.f5822a);
        i iVar = this.f5825d;
        synchronized (iVar) {
            rVarF = (r) ((u.e) iVar.f14371b).get(strC);
            if (rVarF != null) {
                Log.isLoggable("FirebaseMessaging", 3);
            } else {
                Log.isLoggable("FirebaseMessaging", 3);
                r2 r2Var = this.f5824c;
                rVarF = r2Var.V(r2Var.j1(n.c((f) r2Var.f10470a), "*", new Bundle())).k(this.f5828g, new h4(this, strC, sVarD, 4)).f((Executor) iVar.f14370a, new q(iVar, 0, strC));
                ((u.e) iVar.f14371b).put(strC, rVarF);
            }
        }
        try {
            return (String) e5.g(rVarF);
        } catch (InterruptedException | ExecutionException e4) {
            throw new IOException(e4);
        }
    }

    public final kg.s d() {
        kg.s sVarB;
        r1 r1VarC = c(this.f5823b);
        f fVar = this.f5822a;
        fVar.a();
        String strD = "[DEFAULT]".equals(fVar.f22008b) ? "" : fVar.d();
        String strC = n.c(this.f5822a);
        synchronized (r1VarC) {
            sVarB = kg.s.b(((SharedPreferences) r1VarC.f10199d).getString(strD + "|T|" + strC + "|*", null));
        }
        return sVarB;
    }

    public final void e() {
        r rVarT;
        int i10;
        yb.a aVar = (yb.a) this.f5824c.f10472g;
        if (aVar.f26207c.s() >= 241100000) {
            k kVarG = k.g(aVar.f26206b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (kVarG) {
                i10 = kVarG.f26240a;
                kVarG.f26240a = i10 + 1;
            }
            rVarT = kVarG.h(new yb.j(i10, 5, bundle, 1)).e(yb.f.f26219g, yb.c.f26214g);
        } else {
            rVarT = e5.t(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        rVarT.d(this.f5827f, new l(this, 1));
    }

    public final boolean f() {
        Context context = this.f5823b;
        t1.x(context);
        if (Build.VERSION.SDK_INT < 29) {
            Log.isLoggable("FirebaseMessaging", 3);
            return false;
        }
        if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
            e0.d("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            Log.isLoggable("FirebaseMessaging", 3);
            if (this.f5822a.b(we.b.class) != null) {
                return true;
            }
            if (kc.f.r() && f5820l != null) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void g(long j7) {
        b(new t(this, Math.min(Math.max(30L, 2 * j7), j)), j7);
        this.f5830i = true;
    }

    public final boolean h(kg.s sVar) {
        if (sVar != null) {
            return System.currentTimeMillis() > sVar.f14402c + kg.s.f14399d || !this.f5829h.b().equals(sVar.f14401b);
        }
        return true;
    }
}
