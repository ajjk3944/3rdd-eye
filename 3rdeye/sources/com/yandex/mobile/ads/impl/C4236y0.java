package com.yandex.mobile.ads.impl;

import android.content.Intent;

/* renamed from: com.yandex.mobile.ads.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4236y0 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f35562a;

    /* renamed from: b, reason: collision with root package name */
    private final C4072a3 f35563b;

    /* renamed from: c, reason: collision with root package name */
    private final av1 f35564c;

    /* renamed from: d, reason: collision with root package name */
    private final h61 f35565d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35566e;

    /* renamed from: f, reason: collision with root package name */
    private final f8 f35567f;

    /* renamed from: g, reason: collision with root package name */
    private final Intent f35568g;

    /* renamed from: com.yandex.mobile.ads.impl.y0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final a8<?> f35569a;

        /* renamed from: b, reason: collision with root package name */
        private final C4072a3 f35570b;

        /* renamed from: c, reason: collision with root package name */
        private final f8 f35571c;

        /* renamed from: d, reason: collision with root package name */
        private av1 f35572d;

        /* renamed from: e, reason: collision with root package name */
        private h61 f35573e;

        /* renamed from: f, reason: collision with root package name */
        private int f35574f;

        /* renamed from: g, reason: collision with root package name */
        private Intent f35575g;

        public a(a8<?> adResponse, C4072a3 adConfiguration, f8 adResultReceiver) {
            kotlin.jvm.internal.l.f(adResponse, "adResponse");
            kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
            kotlin.jvm.internal.l.f(adResultReceiver, "adResultReceiver");
            this.f35569a = adResponse;
            this.f35570b = adConfiguration;
            this.f35571c = adResultReceiver;
        }

        public final Intent a() {
            return this.f35575g;
        }

        public final C4072a3 b() {
            return this.f35570b;
        }

        public final a8<?> c() {
            return this.f35569a;
        }

        public final f8 d() {
            return this.f35571c;
        }

        public final h61 e() {
            return this.f35573e;
        }

        public final int f() {
            return this.f35574f;
        }

        public final av1 g() {
            return this.f35572d;
        }

        public final a a(Intent activityResultIntent) {
            kotlin.jvm.internal.l.f(activityResultIntent, "activityResultIntent");
            this.f35575g = activityResultIntent;
            return this;
        }

        public final a a(h61 nativeAd) {
            kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
            this.f35573e = nativeAd;
            return this;
        }

        public final a a(int i) {
            this.f35574f = i;
            return this;
        }

        public final a a(av1 contentController) {
            kotlin.jvm.internal.l.f(contentController, "contentController");
            this.f35572d = contentController;
            return this;
        }
    }

    public C4236y0(a builder) {
        kotlin.jvm.internal.l.f(builder, "builder");
        this.f35562a = builder.c();
        this.f35563b = builder.b();
        this.f35564c = builder.g();
        this.f35565d = builder.e();
        this.f35566e = builder.f();
        this.f35567f = builder.d();
        this.f35568g = builder.a();
    }

    public final Intent a() {
        return this.f35568g;
    }

    public final C4072a3 b() {
        return this.f35563b;
    }

    public final a8<?> c() {
        return this.f35562a;
    }

    public final f8 d() {
        return this.f35567f;
    }

    public final h61 e() {
        return this.f35565d;
    }

    public final int f() {
        return this.f35566e;
    }

    public final av1 g() {
        return this.f35564c;
    }
}
