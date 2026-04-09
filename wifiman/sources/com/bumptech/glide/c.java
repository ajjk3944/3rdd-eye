package com.bumptech.glide;

import G2.a;
import G2.i;
import Q2.o;
import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C7010a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.j f34179c;

    /* renamed from: d, reason: collision with root package name */
    private F2.d f34180d;

    /* renamed from: e, reason: collision with root package name */
    private F2.b f34181e;

    /* renamed from: f, reason: collision with root package name */
    private G2.h f34182f;

    /* renamed from: g, reason: collision with root package name */
    private H2.a f34183g;

    /* renamed from: h, reason: collision with root package name */
    private H2.a f34184h;

    /* renamed from: i, reason: collision with root package name */
    private a.InterfaceC0274a f34185i;

    /* renamed from: j, reason: collision with root package name */
    private G2.i f34186j;

    /* renamed from: k, reason: collision with root package name */
    private Q2.c f34187k;

    /* renamed from: n, reason: collision with root package name */
    private o.b f34190n;

    /* renamed from: o, reason: collision with root package name */
    private H2.a f34191o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f34192p;

    /* renamed from: q, reason: collision with root package name */
    private List f34193q;

    /* renamed from: a, reason: collision with root package name */
    private final Map f34177a = new C7010a();

    /* renamed from: b, reason: collision with root package name */
    private final e.a f34178b = new e.a();

    /* renamed from: l, reason: collision with root package name */
    private int f34188l = 4;

    /* renamed from: m, reason: collision with root package name */
    private b.a f34189m = new a();

    class a implements b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        public com.bumptech.glide.request.f a() {
            return new com.bumptech.glide.request.f();
        }
    }

    static final class b {
    }

    /* renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    public static final class C1192c {
    }

    com.bumptech.glide.b a(Context context, List list, R2.a aVar) {
        if (this.f34183g == null) {
            this.f34183g = H2.a.i();
        }
        if (this.f34184h == null) {
            this.f34184h = H2.a.f();
        }
        if (this.f34191o == null) {
            this.f34191o = H2.a.d();
        }
        if (this.f34186j == null) {
            this.f34186j = new i.a(context).a();
        }
        if (this.f34187k == null) {
            this.f34187k = new Q2.e();
        }
        if (this.f34180d == null) {
            int iB = this.f34186j.b();
            if (iB > 0) {
                this.f34180d = new F2.j(iB);
            } else {
                this.f34180d = new F2.e();
            }
        }
        if (this.f34181e == null) {
            this.f34181e = new F2.i(this.f34186j.a());
        }
        if (this.f34182f == null) {
            this.f34182f = new G2.g(this.f34186j.d());
        }
        if (this.f34185i == null) {
            this.f34185i = new G2.f(context);
        }
        if (this.f34179c == null) {
            this.f34179c = new com.bumptech.glide.load.engine.j(this.f34182f, this.f34185i, this.f34184h, this.f34183g, H2.a.j(), this.f34191o, this.f34192p);
        }
        List list2 = this.f34193q;
        if (list2 == null) {
            this.f34193q = Collections.emptyList();
        } else {
            this.f34193q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.b(context, this.f34179c, this.f34182f, this.f34180d, this.f34181e, new o(this.f34190n), this.f34187k, this.f34188l, this.f34189m, this.f34177a, this.f34193q, list, aVar, this.f34178b.b());
    }

    void b(o.b bVar) {
        this.f34190n = bVar;
    }
}
