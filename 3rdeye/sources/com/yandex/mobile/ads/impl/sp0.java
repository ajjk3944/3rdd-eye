package com.yandex.mobile.ads.impl;

import b9.C1992A;

/* loaded from: classes3.dex */
public final class sp0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f33174c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static sp0 f33175d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f33176e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final rk1<qd0, ft> f33177a;

    /* renamed from: b, reason: collision with root package name */
    private final rd0 f33178b;

    public static final class a {
        public static sp0 a() {
            if (sp0.f33175d == null) {
                synchronized (sp0.f33174c) {
                    try {
                        if (sp0.f33175d == null) {
                            sp0.f33175d = new sp0(new rk1(), new rd0());
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            sp0 sp0Var = sp0.f33175d;
            if (sp0Var != null) {
                return sp0Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public sp0(rk1<qd0, ft> preloadingCache, rd0 cacheParamsMapper) {
        kotlin.jvm.internal.l.f(preloadingCache, "preloadingCache");
        kotlin.jvm.internal.l.f(cacheParamsMapper, "cacheParamsMapper");
        this.f33177a = preloadingCache;
        this.f33178b = cacheParamsMapper;
    }

    public final synchronized boolean c() {
        return this.f33177a.b();
    }

    public final synchronized void a(h7 adRequestData, ft item) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        kotlin.jvm.internal.l.f(item, "item");
        rk1<qd0, ft> rk1Var = this.f33177a;
        this.f33178b.getClass();
        rk1Var.a(rd0.a(adRequestData), item);
    }

    public final synchronized ft a(h7 adRequestData) {
        rk1<qd0, ft> rk1Var;
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        rk1Var = this.f33177a;
        this.f33178b.getClass();
        return (ft) rk1Var.a(rd0.a(adRequestData));
    }
}
