package com.yandex.mobile.ads.impl;

import b9.C1992A;
import c9.C2101v;
import java.util.Set;

/* loaded from: classes3.dex */
public final class nn0 {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f30943e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static volatile nn0 f30944f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f30945g = 0;

    /* renamed from: a, reason: collision with root package name */
    private boolean f30946a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f30947b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30948c;

    /* renamed from: d, reason: collision with root package name */
    private Set<String> f30949d;

    public static final class a {
        public static nn0 a() {
            if (nn0.f30944f == null) {
                synchronized (nn0.f30943e) {
                    try {
                        if (nn0.f30944f == null) {
                            nn0.f30944f = new nn0(0);
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            nn0 nn0Var = nn0.f30944f;
            if (nn0Var != null) {
                return nn0Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    private nn0() {
        this.f30946a = true;
        this.f30947b = true;
        this.f30948c = true;
        this.f30949d = C2101v.f18583b;
    }

    public final void b(boolean z10) {
        this.f30946a = z10;
    }

    public final Set<String> c() {
        return this.f30949d;
    }

    public final boolean d() {
        return this.f30948c;
    }

    public final boolean e() {
        return this.f30946a;
    }

    public final boolean f() {
        return this.f30947b;
    }

    public final void a(boolean z10) {
        this.f30948c = z10;
    }

    public final void c(boolean z10) {
        this.f30947b = z10;
    }

    public /* synthetic */ nn0(int i) {
        this();
    }
}
