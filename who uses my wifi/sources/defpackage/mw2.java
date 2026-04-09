package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mw2 {
    public final long d;
    public final Context f;
    public final WeakReference g;
    public final yu2 h;
    public final Executor i;
    public final Executor j;
    public final ScheduledExecutorService k;
    public final rv2 l;
    public final e51 m;
    public final kp2 o;
    public final ea3 p;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public final pd2 e = new pd2();
    public final ConcurrentHashMap n = new ConcurrentHashMap();
    public boolean q = true;

    public mw2(Executor executor, Context context, WeakReference weakReference, ld2 ld2Var, yu2 yu2Var, ScheduledExecutorService scheduledExecutorService, rv2 rv2Var, e51 e51Var, kp2 kp2Var, ea3 ea3Var) {
        this.h = yu2Var;
        this.f = context;
        this.g = weakReference;
        this.i = ld2Var;
        this.k = scheduledExecutorService;
        this.j = executor;
        this.l = rv2Var;
        this.m = e51Var;
        this.o = kp2Var;
        this.p = ea3Var;
        hg4.C.k.getClass();
        this.d = SystemClock.elapsedRealtime();
        d("com.google.android.gms.ads.MobileAds", 0, "", false);
    }

    public final void a() {
        if (!((Boolean) c12.a.w()).booleanValue()) {
            int i = this.m.h;
            iz1 iz1Var = mz1.V1;
            tw1 tw1Var = tw1.e;
            if (i >= ((Integer) tw1Var.c.a(iz1Var)).intValue() && this.q) {
                if (this.a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.a) {
                            return;
                        }
                        this.l.d();
                        this.o.b();
                        pd2 pd2Var = this.e;
                        final int i2 = 0;
                        Runnable runnable = new Runnable(this) { // from class: kw2
                            public final /* synthetic */ mw2 g;

                            {
                                this.g = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        mw2 mw2Var = this.g;
                                        rv2 rv2Var = mw2Var.l;
                                        synchronized (rv2Var) {
                                            try {
                                                if (((Boolean) tw1.e.c.a(mz1.h2)).booleanValue() && !rv2Var.d) {
                                                    HashMap mapE = rv2Var.e();
                                                    mapE.put("action", "init_finished");
                                                    ArrayList arrayList = rv2Var.b;
                                                    arrayList.add(mapE);
                                                    int size = arrayList.size();
                                                    int i3 = 0;
                                                    while (i3 < size) {
                                                        Object obj = arrayList.get(i3);
                                                        i3++;
                                                        rv2Var.f.a((Map) obj, false);
                                                    }
                                                    rv2Var.d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        mw2Var.o.c();
                                        mw2Var.b = true;
                                        return;
                                    default:
                                        mw2 mw2Var2 = this.g;
                                        synchronized (mw2Var2) {
                                            try {
                                                if (mw2Var2.c) {
                                                    return;
                                                }
                                                hg4.C.k.getClass();
                                                mw2Var2.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - mw2Var2.d), "Timeout.", false);
                                                mw2Var2.l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                mw2Var2.o.s("com.google.android.gms.ads.MobileAds", "timeout");
                                                mw2Var2.e.b(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        };
                        Executor executor = this.i;
                        pd2Var.f.c(runnable, executor);
                        this.a = true;
                        n70 n70VarC = c();
                        final int i3 = 1;
                        this.k.schedule(new Runnable(this) { // from class: kw2
                            public final /* synthetic */ mw2 g;

                            {
                                this.g = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        mw2 mw2Var = this.g;
                                        rv2 rv2Var = mw2Var.l;
                                        synchronized (rv2Var) {
                                            try {
                                                if (((Boolean) tw1.e.c.a(mz1.h2)).booleanValue() && !rv2Var.d) {
                                                    HashMap mapE = rv2Var.e();
                                                    mapE.put("action", "init_finished");
                                                    ArrayList arrayList = rv2Var.b;
                                                    arrayList.add(mapE);
                                                    int size = arrayList.size();
                                                    int i32 = 0;
                                                    while (i32 < size) {
                                                        Object obj = arrayList.get(i32);
                                                        i32++;
                                                        rv2Var.f.a((Map) obj, false);
                                                    }
                                                    rv2Var.d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        mw2Var.o.c();
                                        mw2Var.b = true;
                                        return;
                                    default:
                                        mw2 mw2Var2 = this.g;
                                        synchronized (mw2Var2) {
                                            try {
                                                if (mw2Var2.c) {
                                                    return;
                                                }
                                                hg4.C.k.getClass();
                                                mw2Var2.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - mw2Var2.d), "Timeout.", false);
                                                mw2Var2.l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                mw2Var2.o.s("com.google.android.gms.ads.MobileAds", "timeout");
                                                mw2Var2.e.b(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        }, ((Long) tw1Var.c.a(mz1.X1)).longValue(), TimeUnit.SECONDS);
                        n70VarC.c(new jq3(n70VarC, new ug0(this), 0), executor);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.a) {
            return;
        }
        d("com.google.android.gms.ads.MobileAds", 0, "", true);
        this.e.a(Boolean.FALSE);
        this.a = true;
        this.b = true;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.n;
        for (String str : concurrentHashMap.keySet()) {
            w42 w42Var = (w42) concurrentHashMap.get(str);
            arrayList.add(new w42(str, w42Var.h, w42Var.i, w42Var.g));
        }
        return arrayList;
    }

    public final synchronized n70 c() {
        hg4 hg4Var = hg4.C;
        String str = hg4Var.h.g().m().e;
        if (!TextUtils.isEmpty(str)) {
            return pu1.r(str);
        }
        pd2 pd2Var = new pd2();
        ra4 ra4VarG = hg4Var.h.g();
        ra4VarG.c.add(new n62(this, pd2Var, 23));
        return pd2Var;
    }

    public final void d(String str, int i, String str2, boolean z) {
        this.n.put(str, new w42(str, i, str2, z));
    }
}
