package com.yandex.mobile.ads.impl;

import b9.C1992A;

/* renamed from: com.yandex.mobile.ads.impl.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4237y1 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f35587c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final cs0 f35588a;

    /* renamed from: b, reason: collision with root package name */
    private volatile C4230x1 f35589b;

    public C4237y1(cs0 localStorage) {
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        this.f35588a = localStorage;
    }

    public static void a(C4237y1 c4237y1, Integer num) {
        c4237y1.getClass();
        synchronized (f35587c) {
            C4230x1 c4230x1 = new C4230x1(c4237y1.b().d(), c4237y1.b().c(), c4237y1.b().b(), num.intValue());
            c4237y1.f35588a.b("AdBlockerDetected", c4230x1.d());
            c4237y1.f35588a.a("AdBlockerRequestPolicy", c4230x1.c().name());
            c4237y1.f35588a.a("AdBlockerLastUpdate", c4230x1.b());
            c4237y1.f35588a.a(c4230x1.a(), "AdBlockerFailedRequestsCount");
            c4237y1.f35589b = c4230x1;
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final C4230x1 b() {
        C4230x1 c4230x1;
        C4230x1 c4230x12 = this.f35589b;
        if (c4230x12 != null) {
            return c4230x12;
        }
        synchronized (f35587c) {
            try {
                c4230x1 = this.f35589b;
                if (c4230x1 == null) {
                    boolean zA = this.f35588a.a("AdBlockerDetected", false);
                    String strD = this.f35588a.d("AdBlockerRequestPolicy");
                    if (strD == null) {
                        strD = "TCP";
                    }
                    C4230x1 c4230x13 = new C4230x1(zA, EnumC4223w1.valueOf(strD), this.f35588a.b("AdBlockerLastUpdate"), this.f35588a.b(0, "AdBlockerFailedRequestsCount"));
                    this.f35589b = c4230x13;
                    c4230x1 = c4230x13;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4230x1;
    }

    public final void c() {
        synchronized (f35587c) {
            a(this, Integer.valueOf(b().a() + 1));
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final void a() {
        synchronized (f35587c) {
            a(this, 0);
            C1992A c1992a = C1992A.f18074a;
        }
    }
}
