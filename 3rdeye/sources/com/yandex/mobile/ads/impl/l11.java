package com.yandex.mobile.ads.impl;

import b9.C1992A;
import c9.C2087h;
import c9.C2097r;
import java.util.List;

/* loaded from: classes3.dex */
public final class l11 {

    /* renamed from: b, reason: collision with root package name */
    private static l11 f29859b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f29860c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f29861d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final C2087h<k11> f29862a;

    public static final class a {
        public static l11 a() {
            l11 l11Var;
            l11 l11Var2 = l11.f29859b;
            if (l11Var2 != null) {
                return l11Var2;
            }
            synchronized (l11.f29860c) {
                l11Var = l11.f29859b;
                if (l11Var == null) {
                    l11Var = new l11(0);
                    l11.f29859b = l11Var;
                }
            }
            return l11Var;
        }
    }

    private l11() {
        this.f29862a = new C2087h<>();
    }

    public final void c() {
        synchronized (f29860c) {
            this.f29862a.clear();
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final List<k11> d() {
        List<k11> listG0;
        synchronized (f29860c) {
            listG0 = C2097r.G0(this.f29862a);
        }
        return listG0;
    }

    public final void a(z01 type, String tag, String text) {
        kotlin.jvm.internal.l.f(type, "type");
        kotlin.jvm.internal.l.f(tag, "tag");
        kotlin.jvm.internal.l.f(text, "text");
        if (a11.f24364a.a()) {
            k11 k11Var = new k11(System.currentTimeMillis(), type.name(), tag, text);
            synchronized (f29860c) {
                try {
                    if (this.f29862a.c() > 5000) {
                        this.f29862a.n();
                    }
                    this.f29862a.e(k11Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ l11(int i) {
        this();
    }
}
