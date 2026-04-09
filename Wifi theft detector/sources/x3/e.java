package x3;

import android.content.Context;
import f4.n0;
import f4.u0;
import javax.inject.Provider;
import x3.u;

/* loaded from: classes2.dex */
public final class e extends u {

    /* renamed from: a, reason: collision with root package name */
    public Provider f24932a;

    /* renamed from: b, reason: collision with root package name */
    public Provider f24933b;

    /* renamed from: c, reason: collision with root package name */
    public Provider f24934c;

    /* renamed from: d, reason: collision with root package name */
    public Provider f24935d;

    /* renamed from: e, reason: collision with root package name */
    public Provider f24936e;

    /* renamed from: f, reason: collision with root package name */
    public Provider f24937f;

    /* renamed from: g, reason: collision with root package name */
    public Provider f24938g;

    /* renamed from: h, reason: collision with root package name */
    public Provider f24939h;

    /* renamed from: i, reason: collision with root package name */
    public Provider f24940i;

    /* renamed from: j, reason: collision with root package name */
    public Provider f24941j;

    /* renamed from: k, reason: collision with root package name */
    public Provider f24942k;

    /* renamed from: l, reason: collision with root package name */
    public Provider f24943l;

    /* renamed from: m, reason: collision with root package name */
    public Provider f24944m;

    public static final class b implements u.a {

        /* renamed from: a, reason: collision with root package name */
        public Context f24945a;

        public b() {
        }

        @Override // x3.u.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f24945a = (Context) z3.d.b(context);
            return this;
        }

        @Override // x3.u.a
        public u build() {
            z3.d.a(this.f24945a, Context.class);
            return new e(this.f24945a);
        }
    }

    public static u.a k() {
        return new b();
    }

    @Override // x3.u
    public f4.d d() {
        return (f4.d) this.f24938g.get();
    }

    @Override // x3.u
    public t h() {
        return (t) this.f24944m.get();
    }

    public final void l(Context context) {
        this.f24932a = z3.a.a(k.a());
        z3.b bVarA = z3.c.a(context);
        this.f24933b = bVarA;
        y3.h hVarA = y3.h.a(bVarA, h4.c.a(), h4.d.a());
        this.f24934c = hVarA;
        this.f24935d = z3.a.a(y3.j.a(this.f24933b, hVarA));
        this.f24936e = u0.a(this.f24933b, f4.g.a(), f4.i.a());
        this.f24937f = z3.a.a(f4.h.a(this.f24933b));
        this.f24938g = z3.a.a(n0.a(h4.c.a(), h4.d.a(), f4.j.a(), this.f24936e, this.f24937f));
        d4.g gVarB = d4.g.b(h4.c.a());
        this.f24939h = gVarB;
        d4.i iVarA = d4.i.a(this.f24933b, this.f24938g, gVarB, h4.d.a());
        this.f24940i = iVarA;
        Provider provider = this.f24932a;
        Provider provider2 = this.f24935d;
        Provider provider3 = this.f24938g;
        this.f24941j = d4.d.a(provider, provider2, iVarA, provider3, provider3);
        Provider provider4 = this.f24933b;
        Provider provider5 = this.f24935d;
        Provider provider6 = this.f24938g;
        this.f24942k = e4.p.a(provider4, provider5, provider6, this.f24940i, this.f24932a, provider6, h4.c.a(), h4.d.a(), this.f24938g);
        Provider provider7 = this.f24932a;
        Provider provider8 = this.f24938g;
        this.f24943l = e4.t.a(provider7, provider8, this.f24940i, provider8);
        this.f24944m = z3.a.a(v.a(h4.c.a(), h4.d.a(), this.f24941j, this.f24942k, this.f24943l));
    }

    public e(Context context) {
        l(context);
    }
}
