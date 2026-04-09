package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class re0 {

    /* renamed from: d, reason: collision with root package name */
    public final long f15620d;

    /* renamed from: f, reason: collision with root package name */
    public final Context f15622f;
    public final WeakReference g;

    /* renamed from: h, reason: collision with root package name */
    public final ed0 f15623h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f15624i;
    public final Executor j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f15625k;

    /* renamed from: l, reason: collision with root package name */
    public final wd0 f15626l;

    /* renamed from: m, reason: collision with root package name */
    public final za.a f15627m;

    /* renamed from: o, reason: collision with root package name */
    public final i80 f15629o;

    /* renamed from: p, reason: collision with root package name */
    public final cs0 f15630p;

    /* renamed from: a, reason: collision with root package name */
    public boolean f15617a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15618b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15619c = false;

    /* renamed from: e, reason: collision with root package name */
    public final gx f15621e = new gx();

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f15628n = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public boolean f15631q = true;

    public re0(Executor executor, Context context, WeakReference weakReference, ex exVar, ed0 ed0Var, ScheduledExecutorService scheduledExecutorService, wd0 wd0Var, za.a aVar, i80 i80Var, cs0 cs0Var) {
        this.f15623h = ed0Var;
        this.f15622f = context;
        this.g = weakReference;
        this.f15624i = exVar;
        this.f15625k = scheduledExecutorService;
        this.j = executor;
        this.f15626l = wd0Var;
        this.f15627m = aVar;
        this.f15629o = i80Var;
        this.f15630p = cs0Var;
        ua.j.C.f35267k.getClass();
        this.f15620d = SystemClock.elapsedRealtime();
        d("com.google.android.gms.ads.MobileAds", 0, "", false);
    }

    public final void a() {
        if (!((Boolean) am.f9356a.u()).booleanValue()) {
            int i4 = this.f15627m.f38131c;
            pk pkVar = sk.k2;
            va.s sVar = va.s.f36163e;
            if (i4 >= ((Integer) sVar.f36166c.a(pkVar)).intValue() && this.f15631q) {
                if (this.f15617a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f15617a) {
                            return;
                        }
                        this.f15626l.d();
                        this.f15629o.c();
                        gx gxVar = this.f15621e;
                        final int i10 = 0;
                        Runnable runnable = new Runnable(this) { // from class: com.google.android.gms.internal.ads.pe0

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ re0 f14981b;

                            {
                                this.f14981b = this;
                            }

                            private final void a() {
                                re0 re0Var = this.f14981b;
                                wd0 wd0Var = re0Var.f15626l;
                                synchronized (wd0Var) {
                                    try {
                                        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16379w2)).booleanValue() && !wd0Var.f17986d) {
                                            HashMap mapE = wd0Var.e();
                                            mapE.put("action", "init_finished");
                                            ArrayList arrayList = wd0Var.f17984b;
                                            arrayList.add(mapE);
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj = arrayList.get(i11);
                                                i11++;
                                                wd0Var.f17988f.a((Map) obj, false);
                                            }
                                            wd0Var.f17986d = true;
                                        }
                                    } finally {
                                    }
                                }
                                re0Var.f15629o.d();
                                re0Var.f15618b = true;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        a();
                                        return;
                                    default:
                                        re0 re0Var = this.f14981b;
                                        synchronized (re0Var) {
                                            try {
                                                if (re0Var.f15619c) {
                                                    return;
                                                }
                                                ua.j.C.f35267k.getClass();
                                                re0Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - re0Var.f15620d), "Timeout.", false);
                                                re0Var.f15626l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                re0Var.f15629o.f("com.google.android.gms.ads.MobileAds", "timeout");
                                                re0Var.f15621e.d(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        };
                        Executor executor = this.f15624i;
                        gxVar.f11625a.a(runnable, executor);
                        this.f15617a = true;
                        vd.b bVarC = c();
                        final int i11 = 1;
                        this.f15625k.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.pe0

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ re0 f14981b;

                            {
                                this.f14981b = this;
                            }

                            private final void a() {
                                re0 re0Var = this.f14981b;
                                wd0 wd0Var = re0Var.f15626l;
                                synchronized (wd0Var) {
                                    try {
                                        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16379w2)).booleanValue() && !wd0Var.f17986d) {
                                            HashMap mapE = wd0Var.e();
                                            mapE.put("action", "init_finished");
                                            ArrayList arrayList = wd0Var.f17984b;
                                            arrayList.add(mapE);
                                            int size = arrayList.size();
                                            int i112 = 0;
                                            while (i112 < size) {
                                                Object obj = arrayList.get(i112);
                                                i112++;
                                                wd0Var.f17988f.a((Map) obj, false);
                                            }
                                            wd0Var.f17986d = true;
                                        }
                                    } finally {
                                    }
                                }
                                re0Var.f15629o.d();
                                re0Var.f15618b = true;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        a();
                                        return;
                                    default:
                                        re0 re0Var = this.f14981b;
                                        synchronized (re0Var) {
                                            try {
                                                if (re0Var.f15619c) {
                                                    return;
                                                }
                                                ua.j.C.f35267k.getClass();
                                                re0Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - re0Var.f15620d), "Timeout.", false);
                                                re0Var.f15626l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                re0Var.f15629o.f("com.google.android.gms.ads.MobileAds", "timeout");
                                                re0Var.f15621e.d(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        }, ((Long) sVar.f36166c.a(sk.f16222m2)).longValue(), TimeUnit.SECONDS);
                        bVarC.a(new q81(0, bVarC, new ne0(this)), executor);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        if (this.f15617a) {
            return;
        }
        d("com.google.android.gms.ads.MobileAds", 0, "", true);
        this.f15621e.b(Boolean.FALSE);
        this.f15617a = true;
        this.f15618b = true;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.f15628n;
        for (String str : concurrentHashMap.keySet()) {
            ip ipVar = (ip) concurrentHashMap.get(str);
            arrayList.add(new ip(str, ipVar.f12407c, ipVar.f12408d, ipVar.f12406b));
        }
        return arrayList;
    }

    public final synchronized vd.b c() {
        ua.j jVar = ua.j.C;
        String str = jVar.f35265h.i().s().f18213e;
        if (!TextUtils.isEmpty(str)) {
            return yo0.e(str);
        }
        gx gxVar = new gx();
        ya.c0 c0VarI = jVar.f35265h.i();
        c0VarI.f37404c.add(new q81(26, this, gxVar));
        return gxVar;
    }

    public final void d(String str, int i4, String str2, boolean z3) {
        this.f15628n.put(str, new ip(str, i4, str2, z3));
    }
}
