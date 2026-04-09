package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.yandex.mobile.ads.impl.cs0;
import com.yandex.mobile.ads.impl.hq;

/* loaded from: classes3.dex */
public final class eq implements cq, cs0.a {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f26980j = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final s62 f26981b;

    /* renamed from: c, reason: collision with root package name */
    private final s62 f26982c;

    /* renamed from: d, reason: collision with root package name */
    private String f26983d;

    /* renamed from: e, reason: collision with root package name */
    private String f26984e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26985f;

    /* renamed from: g, reason: collision with root package name */
    private String f26986g;

    /* renamed from: h, reason: collision with root package name */
    private String f26987h;
    private String i;

    public eq(fq cmpV1, gq cmpV2, cs0 preferences) {
        kotlin.jvm.internal.l.f(cmpV1, "cmpV1");
        kotlin.jvm.internal.l.f(cmpV2, "cmpV2");
        kotlin.jvm.internal.l.f(preferences, "preferences");
        this.f26981b = cmpV1;
        this.f26982c = cmpV2;
        for (aq aqVar : aq.values()) {
            a(preferences, aqVar);
        }
        preferences.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.cq
    public final String a() {
        String str;
        synchronized (f26980j) {
            str = this.f26984e;
        }
        return str;
    }

    @Override // com.yandex.mobile.ads.impl.cq
    public final String b() {
        String str;
        synchronized (f26980j) {
            str = this.f26983d;
        }
        return str;
    }

    @Override // com.yandex.mobile.ads.impl.cq
    public final String c() {
        String str;
        synchronized (f26980j) {
            str = this.f26986g;
        }
        return str;
    }

    public final String d() {
        String str;
        synchronized (f26980j) {
            str = this.i;
        }
        return str;
    }

    public final boolean e() {
        boolean z10;
        synchronized (f26980j) {
            z10 = this.f26985f;
        }
        return z10;
    }

    public final String f() {
        String str;
        synchronized (f26980j) {
            str = this.f26987h;
        }
        return str;
    }

    @Override // com.yandex.mobile.ads.impl.cs0.a
    public final void a(cs0 localStorage, String key) {
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        kotlin.jvm.internal.l.f(key, "key");
        synchronized (f26980j) {
            try {
                hq hqVarA = this.f26982c.a(localStorage, key);
                if (hqVarA == null) {
                    hqVarA = this.f26981b.a(localStorage, key);
                }
                if (hqVarA != null) {
                    a(hqVarA);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void a(cs0 cs0Var, aq aqVar) {
        hq hqVarA = this.f26982c.a(cs0Var, aqVar);
        if (hqVarA == null) {
            hqVarA = this.f26981b.a(cs0Var, aqVar);
        }
        a(hqVarA);
    }

    private final void a(hq hqVar) {
        if (hqVar instanceof hq.b) {
            this.f26985f = ((hq.b) hqVar).a();
            return;
        }
        if (hqVar instanceof hq.c) {
            this.f26983d = ((hq.c) hqVar).a();
            return;
        }
        if (hqVar instanceof hq.d) {
            this.f26984e = ((hq.d) hqVar).a();
            return;
        }
        if (hqVar instanceof hq.e) {
            this.f26986g = ((hq.e) hqVar).a();
        } else if (hqVar instanceof hq.f) {
            this.f26987h = ((hq.f) hqVar).a();
        } else if (hqVar instanceof hq.a) {
            this.i = ((hq.a) hqVar).a();
        }
    }
}
