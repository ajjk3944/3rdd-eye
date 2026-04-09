package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import f4.InterfaceFutureC2326a;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import q2.C2841s;
import t2.C2909E;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.wo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2087wo {

    /* renamed from: d, reason: collision with root package name */
    public final long f17476d;

    /* renamed from: f, reason: collision with root package name */
    public final Context f17478f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakReference f17479g;

    /* renamed from: h, reason: collision with root package name */
    public final C0563In f17480h;
    public final Executor i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f17481j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f17482k;

    /* renamed from: l, reason: collision with root package name */
    public final C0954bo f17483l;

    /* renamed from: m, reason: collision with root package name */
    public final C2951a f17484m;

    /* renamed from: o, reason: collision with root package name */
    public final C1491ll f17486o;

    /* renamed from: p, reason: collision with root package name */
    public final Yu f17487p;

    /* renamed from: a, reason: collision with root package name */
    public boolean f17473a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17474b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17475c = false;

    /* renamed from: e, reason: collision with root package name */
    public final C0657Of f17477e = new C0657Of();

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f17485n = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public boolean f17488q = true;

    public C2087wo(Executor executor, Context context, WeakReference weakReference, C0623Mf c0623Mf, C0563In c0563In, ScheduledExecutorService scheduledExecutorService, C0954bo c0954bo, C2951a c2951a, C1491ll c1491ll, Yu yu) {
        this.f17480h = c0563In;
        this.f17478f = context;
        this.f17479g = weakReference;
        this.i = c0623Mf;
        this.f17482k = scheduledExecutorService;
        this.f17481j = executor;
        this.f17483l = c0954bo;
        this.f17484m = c2951a;
        this.f17486o = c1491ll;
        this.f17487p = yu;
        p2.j.f22785C.f22797k.getClass();
        this.f17476d = SystemClock.elapsedRealtime();
        d("com.google.android.gms.ads.MobileAds", 0, "", false);
    }

    public final void a() {
        if (!((Boolean) AbstractC1696pa.f16171a.v()).booleanValue()) {
            int i = this.f17484m.f23786c;
            E9 e9 = H9.f8772k2;
            C2841s c2841s = C2841s.f23267e;
            if (i >= ((Integer) c2841s.f23270c.a(e9)).intValue() && this.f17488q) {
                if (this.f17473a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f17473a) {
                            return;
                        }
                        this.f17483l.d();
                        this.f17486o.b();
                        C0657Of c0657Of = this.f17477e;
                        final int i3 = 0;
                        Runnable runnable = new Runnable(this) { // from class: com.google.android.gms.internal.ads.uo

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ C2087wo f17168b;

                            {
                                this.f17168b = this;
                            }

                            private final void a() {
                                C2087wo c2087wo = this.f17168b;
                                C0954bo c0954bo = c2087wo.f17483l;
                                synchronized (c0954bo) {
                                    try {
                                        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8850w2)).booleanValue() && !c0954bo.f13469d) {
                                            HashMap mapE = c0954bo.e();
                                            mapE.put("action", "init_finished");
                                            ArrayList arrayList = c0954bo.f13467b;
                                            arrayList.add(mapE);
                                            int size = arrayList.size();
                                            int i6 = 0;
                                            while (i6 < size) {
                                                Object obj = arrayList.get(i6);
                                                i6++;
                                                c0954bo.f13471f.a((Map) obj, false);
                                            }
                                            c0954bo.f13469d = true;
                                        }
                                    } finally {
                                    }
                                }
                                c2087wo.f17486o.d();
                                c2087wo.f17474b = true;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        a();
                                        return;
                                    default:
                                        C2087wo c2087wo = this.f17168b;
                                        synchronized (c2087wo) {
                                            try {
                                                if (c2087wo.f17475c) {
                                                    return;
                                                }
                                                p2.j.f22785C.f22797k.getClass();
                                                c2087wo.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2087wo.f17476d), "Timeout.", false);
                                                c2087wo.f17483l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2087wo.f17486o.f("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2087wo.f17477e.c(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        };
                        Executor executor = this.i;
                        c0657Of.f10212a.a(runnable, executor);
                        this.f17473a = true;
                        InterfaceFutureC2326a interfaceFutureC2326aC = c();
                        final int i6 = 1;
                        this.f17482k.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.uo

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ C2087wo f17168b;

                            {
                                this.f17168b = this;
                            }

                            private final void a() {
                                C2087wo c2087wo = this.f17168b;
                                C0954bo c0954bo = c2087wo.f17483l;
                                synchronized (c0954bo) {
                                    try {
                                        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8850w2)).booleanValue() && !c0954bo.f13469d) {
                                            HashMap mapE = c0954bo.e();
                                            mapE.put("action", "init_finished");
                                            ArrayList arrayList = c0954bo.f13467b;
                                            arrayList.add(mapE);
                                            int size = arrayList.size();
                                            int i62 = 0;
                                            while (i62 < size) {
                                                Object obj = arrayList.get(i62);
                                                i62++;
                                                c0954bo.f13471f.a((Map) obj, false);
                                            }
                                            c0954bo.f13469d = true;
                                        }
                                    } finally {
                                    }
                                }
                                c2087wo.f17486o.d();
                                c2087wo.f17474b = true;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        a();
                                        return;
                                    default:
                                        C2087wo c2087wo = this.f17168b;
                                        synchronized (c2087wo) {
                                            try {
                                                if (c2087wo.f17475c) {
                                                    return;
                                                }
                                                p2.j.f22785C.f22797k.getClass();
                                                c2087wo.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2087wo.f17476d), "Timeout.", false);
                                                c2087wo.f17483l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2087wo.f17486o.f("com.google.android.gms.ads.MobileAds", "timeout");
                                                c2087wo.f17477e.c(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        }, ((Long) c2841s.f23270c.a(H9.f8785m2)).longValue(), TimeUnit.SECONDS);
                        interfaceFutureC2326aC.a(new CD(interfaceFutureC2326aC, 0, new Nx(this)), executor);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f17473a) {
            return;
        }
        d("com.google.android.gms.ads.MobileAds", 0, "", true);
        this.f17477e.b(Boolean.FALSE);
        this.f17473a = true;
        this.f17474b = true;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.f17485n;
        for (String str : concurrentHashMap.keySet()) {
            C0772Vb c0772Vb = (C0772Vb) concurrentHashMap.get(str);
            arrayList.add(new C0772Vb(str, c0772Vb.f12035c, c0772Vb.f12036d, c0772Vb.f12034b));
        }
        return arrayList;
    }

    public final synchronized InterfaceFutureC2326a c() {
        p2.j jVar = p2.j.f22785C;
        String str = jVar.f22795h.i().s().f7976e;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC1984ut.e(str);
        }
        C0657Of c0657Of = new C0657Of();
        C2909E c2909eI = jVar.f22795h.i();
        c2909eI.f23550c.add(new CD(this, 27, c0657Of));
        return c0657Of;
    }

    public final void d(String str, int i, String str2, boolean z6) {
        this.f17485n.put(str, new C0772Vb(str, i, str2, z6));
    }
}
