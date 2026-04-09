package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import b9.C1992A;

/* loaded from: classes3.dex */
public final class w21 {

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f34780g = {fa.a(w21.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final h31 f34781a;

    /* renamed from: b, reason: collision with root package name */
    private final a31 f34782b;

    /* renamed from: c, reason: collision with root package name */
    private final ys0 f34783c;

    /* renamed from: d, reason: collision with root package name */
    private final ao1 f34784d;

    /* renamed from: e, reason: collision with root package name */
    private xs0 f34785e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f34786f;

    public w21(Q1.f viewPager, h31 multiBannerSwiper, a31 multiBannerEventTracker, ys0 jobSchedulerFactory) {
        kotlin.jvm.internal.l.f(viewPager, "viewPager");
        kotlin.jvm.internal.l.f(multiBannerSwiper, "multiBannerSwiper");
        kotlin.jvm.internal.l.f(multiBannerEventTracker, "multiBannerEventTracker");
        kotlin.jvm.internal.l.f(jobSchedulerFactory, "jobSchedulerFactory");
        this.f34781a = multiBannerSwiper;
        this.f34782b = multiBannerEventTracker;
        this.f34783c = jobSchedulerFactory;
        this.f34784d = bo1.a(viewPager);
        this.f34786f = true;
    }

    public final void a() {
        b();
        this.f34786f = false;
    }

    public final void b() {
        xs0 xs0Var = this.f34785e;
        if (xs0Var != null) {
            xs0Var.a();
        }
        this.f34785e = null;
    }

    public final void a(long j4) {
        C1992A c1992a;
        if (j4 <= 0 || !this.f34786f) {
            return;
        }
        b();
        Q1.f fVar = (Q1.f) this.f34784d.getValue(this, f34780g[0]);
        if (fVar != null) {
            x21 x21Var = new x21(fVar, this.f34781a, this.f34782b);
            this.f34783c.getClass();
            xs0 xs0Var = new xs0(new Handler(Looper.getMainLooper()));
            this.f34785e = xs0Var;
            xs0Var.a(j4, x21Var);
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            b();
            this.f34786f = false;
        }
    }
}
