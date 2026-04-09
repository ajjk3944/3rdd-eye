package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* renamed from: io.appmetrica.analytics.impl.d9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4557d9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f40722a;

    /* renamed from: b, reason: collision with root package name */
    public String f40723b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f40724c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f40725d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f40726e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f40727f;

    /* renamed from: g, reason: collision with root package name */
    public final B7 f40728g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC4997ub f40729h;
    public final Integer i;

    /* renamed from: j, reason: collision with root package name */
    public final String f40730j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f40731k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f40732l;

    /* renamed from: m, reason: collision with root package name */
    public final String f40733m;

    /* renamed from: n, reason: collision with root package name */
    public final String f40734n;

    /* renamed from: o, reason: collision with root package name */
    public final Y8 f40735o;

    /* renamed from: p, reason: collision with root package name */
    public final EnumC5046wa f40736p;

    /* renamed from: q, reason: collision with root package name */
    public final E9 f40737q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f40738r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f40739s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f40740t;

    public C4557d9(ContentValues contentValues) {
        C5068x7 model = new C5093y7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f40722a = model.a().j();
        this.f40723b = model.a().p();
        this.f40724c = model.c();
        this.f40725d = model.b();
        this.f40726e = model.a().k();
        this.f40727f = model.d();
        this.f40728g = model.a().i();
        this.f40729h = model.e();
        this.i = model.a().d();
        this.f40730j = model.a().f();
        this.f40731k = model.a().o();
        this.f40732l = model.a().c();
        this.f40733m = model.a().b();
        this.f40734n = model.a().m();
        Y8 y8E = model.a().e();
        this.f40735o = y8E == null ? Y8.a(null) : y8E;
        EnumC5046wa enumC5046waH = model.a().h();
        this.f40736p = enumC5046waH == null ? EnumC5046wa.a(null) : enumC5046waH;
        this.f40737q = model.a().n();
        this.f40738r = model.a().a();
        this.f40739s = model.a().l();
        this.f40740t = model.a().g();
    }
}
