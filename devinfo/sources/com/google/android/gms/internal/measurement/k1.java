package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k1 {
    public static volatile k1 g;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f19794a;

    /* renamed from: b, reason: collision with root package name */
    public final o7.d f19795b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f19796c;

    /* renamed from: d, reason: collision with root package name */
    public int f19797d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19798e;

    /* renamed from: f, reason: collision with root package name */
    public volatile j0 f19799f;

    public k1(Context context, Bundle bundle) throws ClassNotFoundException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new f1(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f19794a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f19795b = new o7.d(12, this);
        this.f19796c = new ArrayList();
        try {
            if (ec.b2.b(context, ec.b2.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, k1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f19798e = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new w0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new j1(this));
        }
    }

    public static k1 e(Context context, Bundle bundle) {
        pb.y.h(context);
        if (g == null) {
            synchronized (k1.class) {
                try {
                    if (g == null) {
                        g = new k1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final Map a(String str, String str2, boolean z3) {
        g0 g0Var = new g0();
        c(new e1(this, str, str2, z3, g0Var));
        Bundle bundleS = g0Var.S(5000L);
        if (bundleS == null || bundleS.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleS.size());
        for (String str3 : bundleS.keySet()) {
            Object obj = bundleS.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final int b(String str) {
        g0 g0Var = new g0();
        c(new w0(this, str, g0Var));
        Integer num = (Integer) g0.T(Integer.class, g0Var.S(10000L));
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void c(g1 g1Var) {
        this.f19794a.execute(g1Var);
    }

    public final void d(Exception exc, boolean z3, boolean z10) {
        this.f19798e |= z3;
        if (z3) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z10) {
            c(new z0(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final List f(String str, String str2) {
        g0 g0Var = new g0();
        c(new y0(this, str, str2, g0Var));
        List list = (List) g0.T(List.class, g0Var.S(5000L));
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
