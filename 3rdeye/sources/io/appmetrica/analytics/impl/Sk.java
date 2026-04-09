package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class Sk {

    /* renamed from: d, reason: collision with root package name */
    public static final String f40126d = "SESSION_SLEEP_START";

    /* renamed from: e, reason: collision with root package name */
    public static final String f40127e = "SESSION_LAST_EVENT_OFFSET";

    /* renamed from: f, reason: collision with root package name */
    public static final String f40128f = "SESSION_ID";

    /* renamed from: g, reason: collision with root package name */
    public static final String f40129g = "SESSION_COUNTER_ID";

    /* renamed from: h, reason: collision with root package name */
    public static final String f40130h = "SESSION_INIT_TIME";
    public static final String i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* renamed from: a, reason: collision with root package name */
    public final String f40131a;

    /* renamed from: b, reason: collision with root package name */
    protected final Cif f40132b;

    /* renamed from: c, reason: collision with root package name */
    public C5097yb f40133c;

    public Sk(Cif cif, String str) {
        this.f40132b = cif;
        this.f40131a = str;
        C5097yb c5097yb = new C5097yb();
        try {
            String strH = cif.h(str);
            if (!TextUtils.isEmpty(strH)) {
                c5097yb = new C5097yb(strH);
            }
        } catch (Throwable unused) {
        }
        this.f40133c = c5097yb;
    }

    public final Sk a(long j4) {
        a(f40130h, Long.valueOf(j4));
        return this;
    }

    public final Sk b(long j4) {
        a(f40127e, Long.valueOf(j4));
        return this;
    }

    public final Long c() {
        return this.f40133c.a(f40130h);
    }

    public final Sk d(long j4) {
        a(f40128f, Long.valueOf(j4));
        return this;
    }

    public final Long e() {
        return this.f40133c.a(f40129g);
    }

    public final Long f() {
        return this.f40133c.a(f40128f);
    }

    public final Long g() {
        return this.f40133c.a(f40126d);
    }

    public final boolean h() {
        return this.f40133c.length() > 0;
    }

    public final Boolean i() {
        C5097yb c5097yb = this.f40133c;
        c5097yb.getClass();
        try {
            return Boolean.valueOf(c5097yb.getBoolean(i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Sk a(boolean z10) {
        a(i, Boolean.valueOf(z10));
        return this;
    }

    public final void b() {
        this.f40132b.e(this.f40131a, this.f40133c.toString());
        this.f40132b.b();
    }

    public final Sk c(long j4) {
        a(f40129g, Long.valueOf(j4));
        return this;
    }

    public final Long d() {
        return this.f40133c.a(f40127e);
    }

    public final Sk e(long j4) {
        a(f40126d, Long.valueOf(j4));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.f40133c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.f40133c = new C5097yb();
        b();
    }
}
