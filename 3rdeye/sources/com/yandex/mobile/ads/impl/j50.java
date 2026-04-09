package com.yandex.mobile.ads.impl;

import b9.C1992A;
import c9.C2099t;
import c9.C2100u;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class j50 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f28962h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private String f28963a;

    /* renamed from: b, reason: collision with root package name */
    private List<? extends bn1> f28964b = C2099t.f18581b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f28965c = C2100u.f18582b;

    /* renamed from: d, reason: collision with root package name */
    private String f28966d;

    /* renamed from: e, reason: collision with root package name */
    private String f28967e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f28968f;

    /* renamed from: g, reason: collision with root package name */
    private String f28969g;

    public final String a() {
        return this.f28967e;
    }

    public final String b() {
        return this.f28963a;
    }

    public final boolean c() {
        return this.f28968f;
    }

    public final Map<String, String> d() {
        return this.f28965c;
    }

    public final String e() {
        return this.f28966d;
    }

    public final List<bn1> f() {
        return this.f28964b;
    }

    public final String g() {
        String str;
        synchronized (f28962h) {
            str = this.f28969g;
        }
        return str;
    }

    public final void h() {
        this.f28968f = true;
    }

    public final void a(String str) {
        this.f28967e = str;
    }

    public final void b(String str) {
        this.f28963a = str;
    }

    public final void c(String str) {
        this.f28966d = str;
    }

    public final void d(String str) {
        synchronized (f28962h) {
            if (str != null) {
                try {
                    if (str.length() != 0) {
                        this.f28969g = str;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C1992A c1992a = C1992A.f18074a;
        }
    }
}
