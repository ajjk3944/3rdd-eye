package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class h9 {

    /* renamed from: c, reason: collision with root package name */
    private static final ExecutorService f28140c = Executors.newCachedThreadPool(new v31(v31.f34327b));

    /* renamed from: a, reason: collision with root package name */
    private C4072a3 f28141a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f28142b;

    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final String f28143b;

        /* renamed from: c, reason: collision with root package name */
        private final h82 f28144c;

        public a(String url, h82 tracker) {
            kotlin.jvm.internal.l.f(url, "url");
            kotlin.jvm.internal.l.f(tracker, "tracker");
            this.f28143b = url;
            this.f28144c = tracker;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f28143b.length() > 0) {
                this.f28144c.a(this.f28143b);
            }
        }
    }

    public h9(Context context, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f28141a = adConfiguration;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f28142b = applicationContext;
    }

    public final void a(String str, a8 adResponse, C4182q1 handler) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(handler, "handler");
        a(str, handler, new yo(this.f28142b, adResponse, this.f28141a, null));
    }

    public final void a(String str, t32 handler, np1 reporter) {
        kotlin.jvm.internal.l.f(handler, "handler");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        Context context = this.f28142b;
        yj1 yj1Var = new yj1(context, reporter, handler, new f82(context));
        if (str == null || str.length() <= 0) {
            return;
        }
        f28140c.execute(new a(str, yj1Var));
    }

    public final void a(String str, m62 trackingUrlType) {
        kotlin.jvm.internal.l.f(trackingUrlType, "trackingUrlType");
        fh1 fh1Var = new fh1(this.f28142b, this.f28141a, trackingUrlType);
        if (str == null || str.length() <= 0) {
            return;
        }
        f28140c.execute(new a(str, fh1Var));
    }
}
