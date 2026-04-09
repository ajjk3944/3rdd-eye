package com.yandex.mobile.ads.impl;

import b9.C1992A;

/* loaded from: classes3.dex */
public final class rf {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f32604c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static rf f32605d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f32606e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final rk1<qd0, os> f32607a;

    /* renamed from: b, reason: collision with root package name */
    private final rd0 f32608b;

    public static final class a {
        public static rf a() {
            if (rf.f32605d == null) {
                synchronized (rf.f32604c) {
                    try {
                        if (rf.f32605d == null) {
                            rf.f32605d = new rf(new rk1(), new rd0());
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            rf rfVar = rf.f32605d;
            if (rfVar != null) {
                return rfVar;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public rf(rk1<qd0, os> preloadingCache, rd0 cacheParamsMapper) {
        kotlin.jvm.internal.l.f(preloadingCache, "preloadingCache");
        kotlin.jvm.internal.l.f(cacheParamsMapper, "cacheParamsMapper");
        this.f32607a = preloadingCache;
        this.f32608b = cacheParamsMapper;
    }

    public final synchronized boolean c() {
        return this.f32607a.b();
    }

    public final synchronized void a(h7 adRequestData, os item) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        kotlin.jvm.internal.l.f(item, "item");
        rk1<qd0, os> rk1Var = this.f32607a;
        this.f32608b.getClass();
        rk1Var.a(rd0.a(adRequestData), item);
    }

    public final synchronized os a(h7 adRequestData) {
        rk1<qd0, os> rk1Var;
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        rk1Var = this.f32607a;
        this.f32608b.getClass();
        return (os) rk1Var.a(rd0.a(adRequestData));
    }
}
