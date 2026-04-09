package com.yandex.mobile.ads.impl;

import b9.C1992A;
import c9.C2087h;
import c9.C2097r;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c11 {

    /* renamed from: b, reason: collision with root package name */
    private static c11 f25497b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f25498c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f25499d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final C2087h<b11> f25500a;

    public static final class a {
        public static c11 a() {
            c11 c11Var;
            c11 c11Var2 = c11.f25497b;
            if (c11Var2 != null) {
                return c11Var2;
            }
            synchronized (c11.f25498c) {
                c11Var = c11.f25497b;
                if (c11Var == null) {
                    c11Var = new c11(0);
                    c11.f25497b = c11Var;
                }
            }
            return c11Var;
        }
    }

    private c11() {
        this.f25500a = new C2087h<>();
    }

    public final void c() {
        synchronized (f25498c) {
            this.f25500a.clear();
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final List<b11> d() {
        List<b11> listG0;
        synchronized (f25498c) {
            listG0 = C2097r.G0(this.f25500a);
        }
        return listG0;
    }

    public final void a(long j4, String requestMethod, String requestUrl, Map<String, String> map, String str, Integer num, Map<String, String> map2, String str2) {
        kotlin.jvm.internal.l.f(requestMethod, "requestMethod");
        kotlin.jvm.internal.l.f(requestUrl, "requestUrl");
        if (a11.f24364a.a()) {
            b11 b11Var = new b11(new d11(j4, requestMethod, requestUrl, map, str), (num == null && map2 == null && str2 == null) ? null : new e11(System.currentTimeMillis(), num, map2, str2));
            synchronized (f25498c) {
                try {
                    if (this.f25500a.c() > 100) {
                        this.f25500a.n();
                    }
                    this.f25500a.e(b11Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ c11(int i) {
        this();
    }
}
