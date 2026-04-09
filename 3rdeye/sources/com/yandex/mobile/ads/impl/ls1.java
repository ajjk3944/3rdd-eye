package com.yandex.mobile.ads.impl;

import b9.C1992A;

/* loaded from: classes3.dex */
public final class ls1 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f30094c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ls1 f30095d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f30096e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final rk1<qd0, zt> f30097a;

    /* renamed from: b, reason: collision with root package name */
    private final rd0 f30098b;

    public static final class a {
        public static ls1 a() {
            if (ls1.f30095d == null) {
                synchronized (ls1.f30094c) {
                    try {
                        if (ls1.f30095d == null) {
                            ls1.f30095d = new ls1(new rk1(), new rd0());
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ls1 ls1Var = ls1.f30095d;
            if (ls1Var != null) {
                return ls1Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public ls1(rk1<qd0, zt> preloadingCache, rd0 cacheParamsMapper) {
        kotlin.jvm.internal.l.f(preloadingCache, "preloadingCache");
        kotlin.jvm.internal.l.f(cacheParamsMapper, "cacheParamsMapper");
        this.f30097a = preloadingCache;
        this.f30098b = cacheParamsMapper;
    }

    public final synchronized boolean c() {
        return this.f30097a.b();
    }

    public final synchronized void a(h7 adRequestData, zt item) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        kotlin.jvm.internal.l.f(item, "item");
        rk1<qd0, zt> rk1Var = this.f30097a;
        this.f30098b.getClass();
        rk1Var.a(rd0.a(adRequestData), item);
    }

    public final synchronized zt a(h7 adRequestData) {
        rk1<qd0, zt> rk1Var;
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        rk1Var = this.f30097a;
        this.f30098b.getClass();
        return (zt) rk1Var.a(rd0.a(adRequestData));
    }
}
