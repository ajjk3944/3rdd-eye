package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Q1 {

    /* renamed from: a, reason: collision with root package name */
    public final Ia f40000a = new Ia();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f40001b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f40002c = new LinkedHashMap();

    public final void a() {
    }

    public final void b() {
    }

    public final void c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f40000a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f40001b.entrySet()) {
                P1 p12 = (P1) entry.getKey();
                if (((O1) entry.getValue()).a(intent)) {
                    p12.a(intent);
                }
            }
        }
    }

    public final void d(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                Ia ia2 = this.f40000a;
                Integer numValueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) ia2.f39621a.get(action);
                if (collection != null && collection.remove(numValueOf)) {
                    if (collection.isEmpty() && ia2.f39622b) {
                        ia2.f39621a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f40002c.entrySet()) {
                P1 p12 = (P1) entry.getKey();
                if (((O1) entry.getValue()).a(intent)) {
                    p12.a(intent);
                }
            }
        }
    }

    public final void a(Intent intent, int i) {
    }

    public final void b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f40000a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f40001b.entrySet()) {
                P1 p12 = (P1) entry.getKey();
                if (((O1) entry.getValue()).a(intent)) {
                    p12.a(intent);
                }
            }
        }
    }

    public final void a(Intent intent, int i, int i10) {
    }

    public final void a(Configuration configuration) {
    }

    public final void a(P1 p12) {
        this.f40002c.put(p12, new O1() { // from class: io.appmetrica.analytics.impl.Ho
            @Override // io.appmetrica.analytics.impl.O1
            public final boolean a(Intent intent) {
                return Q1.a(this.f39590a, intent);
            }
        });
    }

    public static final boolean a(Q1 q12, Intent intent) {
        q12.getClass();
        if (!"io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction())) {
            return false;
        }
        Collection collection = (Collection) q12.f40000a.f39621a.get("io.appmetrica.analytics.IAppMetricaService");
        return collection == null || collection.size() == 0;
    }

    public final void c(P1 p12) {
        this.f40001b.put(p12, new O1() { // from class: io.appmetrica.analytics.impl.Go
            @Override // io.appmetrica.analytics.impl.O1
            public final boolean a(Intent intent) {
                return Q1.c(this.f39552a, intent);
            }
        });
    }

    public static final boolean c(Q1 q12, Intent intent) {
        q12.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction());
    }

    public final void b(P1 p12) {
        this.f40001b.put(p12, new O1() { // from class: io.appmetrica.analytics.impl.Fo
            @Override // io.appmetrica.analytics.impl.O1
            public final boolean a(Intent intent) {
                return Q1.b(this.f39463a, intent);
            }
        });
    }

    public static final boolean b(Q1 q12, Intent intent) {
        Collection collection;
        q12.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction()) && (collection = (Collection) q12.f40000a.f39621a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data == null || !kotlin.jvm.internal.l.b(data.getPath(), "/client")) {
            return -1;
        }
        try {
            String queryParameter = data.getQueryParameter("pid");
            kotlin.jvm.internal.l.c(queryParameter);
            return Integer.parseInt(queryParameter);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
