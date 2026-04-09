package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
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

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: g, reason: collision with root package name */
    public static volatile i1 f5066g;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f5067a;

    /* renamed from: b, reason: collision with root package name */
    public final y9.u f5068b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5069c;

    /* renamed from: d, reason: collision with root package name */
    public int f5070d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5071e;

    /* renamed from: f, reason: collision with root package name */
    public volatile k0 f5072f;

    public i1(Context context, Bundle bundle) throws ClassNotFoundException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new d1(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5067a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f5068b = new y9.u(1, this);
        this.f5069c = new ArrayList();
        try {
            if (zc.p1.b(context, zc.p1.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, i1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f5071e = true;
                    io.sentry.android.core.e0.p("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new x0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            io.sentry.android.core.e0.p("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new h1(this));
        }
    }

    public static i1 e(Context context, Bundle bundle) {
        cc.s.h(context);
        if (f5066g == null) {
            synchronized (i1.class) {
                try {
                    if (f5066g == null) {
                        f5066g = new i1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f5066g;
    }

    public final Map a(String str, String str2, boolean z10) {
        h0 h0Var = new h0();
        c(new c1(this, str, str2, z10, h0Var));
        Bundle bundleE = h0Var.e(5000L);
        if (bundleE == null || bundleE.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleE.size());
        for (String str3 : bundleE.keySet()) {
            Object obj = bundleE.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final int b(String str) {
        h0 h0Var = new h0();
        c(new x0(this, str, h0Var));
        Integer num = (Integer) h0.f(h0Var.e(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void c(e1 e1Var) {
        this.f5067a.execute(e1Var);
    }

    public final void d(Exception exc, boolean z10, boolean z11) {
        this.f5071e |= z10;
        if (z10) {
            io.sentry.android.core.e0.q("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            c(new v0(this, exc));
        }
        io.sentry.android.core.e0.q("FA", "Error with data collection. Data lost.", exc);
    }

    public final List f(String str, String str2) {
        h0 h0Var = new h0();
        c(new w0(this, str, str2, h0Var));
        List list = (List) h0.f(h0Var.e(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
