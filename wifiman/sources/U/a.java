package U;

import T.AbstractC3539k0;
import T.AbstractC3550q;
import T.B0;
import T.C3516b1;
import T.C3520d;
import T.C3525e1;
import T.C3541l0;
import T.InterfaceC3526f;
import T.InterfaceC3538k;
import T.InterfaceC3548p;
import T.R0;
import T.S0;
import U.d;
import U.g;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.V;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    private final g f22050a = new g();

    public final void A() {
        this.f22050a.x(d.A.f22069c);
    }

    public final void B(int i10) {
        g gVar = this.f22050a;
        d.B b10 = d.B.f22070c;
        gVar.y(b10);
        g.c.c(g.c.a(gVar), d.q.a(0), i10);
        if (gVar.f22109g == gVar.n(b10.b()) && gVar.f22110h == gVar.n(b10.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = b10.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f22109g) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(b10.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = b10.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f22110h) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(b10.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + b10 + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void C(Object obj, C3520d c3520d, int i10) {
        g gVar = this.f22050a;
        d.C c10 = d.C.f22071c;
        gVar.y(c10);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), obj);
        g.c.d(gVarA, d.t.a(1), c3520d);
        g.c.c(gVarA, d.q.a(0), i10);
        if (gVar.f22109g == gVar.n(c10.b()) && gVar.f22110h == gVar.n(c10.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c10.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f22109g) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c10.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c10.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f22110h) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c10.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + c10 + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void D(Object obj) {
        g gVar = this.f22050a;
        d.D d10 = d.D.f22072c;
        gVar.y(d10);
        g.c.d(g.c.a(gVar), d.t.a(0), obj);
        if (gVar.f22109g == gVar.n(d10.b()) && gVar.f22110h == gVar.n(d10.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = d10.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f22109g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(d10.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = d10.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f22110h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(d10.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + d10 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void E(Object obj, InterfaceC6839p interfaceC6839p) {
        g gVar = this.f22050a;
        d.E e10 = d.E.f22073c;
        gVar.y(e10);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), obj);
        int iA = d.t.a(1);
        AbstractC6492s.g(interfaceC6839p, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        g.c.d(gVarA, iA, (InterfaceC6839p) V.f(interfaceC6839p, 2));
        if (gVar.f22109g == gVar.n(e10.b()) && gVar.f22110h == gVar.n(e10.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = e10.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f22109g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(e10.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = e10.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f22110h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(e10.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + e10 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void F(Object obj, int i10) {
        g gVar = this.f22050a;
        d.F f10 = d.F.f22074c;
        gVar.y(f10);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), obj);
        g.c.c(gVarA, d.q.a(0), i10);
        if (gVar.f22109g == gVar.n(f10.b()) && gVar.f22110h == gVar.n(f10.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = f10.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f22109g) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(f10.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = f10.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f22110h) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(f10.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + f10 + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void G(int i10) {
        g gVar = this.f22050a;
        d.G g10 = d.G.f22075c;
        gVar.y(g10);
        g.c.c(g.c.a(gVar), d.q.a(0), i10);
        if (gVar.f22109g == gVar.n(g10.b()) && gVar.f22110h == gVar.n(g10.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = g10.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f22109g) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(g10.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = g10.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f22110h) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(g10.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + g10 + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void H(Object obj) {
        if (obj instanceof InterfaceC3538k) {
            this.f22050a.x(d.H.f22076c);
        }
    }

    public final void a() {
        this.f22050a.m();
    }

    public final void b(InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
        this.f22050a.r(interfaceC3526f, c3525e1, r02);
    }

    public final boolean c() {
        return this.f22050a.t();
    }

    public final boolean d() {
        return this.f22050a.u();
    }

    public final void e(int i10) {
        g gVar = this.f22050a;
        d.C3607a c3607a = d.C3607a.f22077c;
        gVar.y(c3607a);
        g.c.c(g.c.a(gVar), d.q.a(0), i10);
        if (gVar.f22109g == gVar.n(c3607a.b()) && gVar.f22110h == gVar.n(c3607a.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c3607a.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f22109g) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c3607a.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c3607a.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f22110h) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c3607a.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + c3607a + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void f(C3520d c3520d, Object obj) {
        g gVar = this.f22050a;
        d.C3608b c3608b = d.C3608b.f22078c;
        gVar.y(c3608b);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), c3520d);
        g.c.d(gVarA, d.t.a(1), obj);
        if (gVar.f22109g == gVar.n(c3608b.b()) && gVar.f22110h == gVar.n(c3608b.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c3608b.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f22109g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c3608b.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c3608b.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f22110h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c3608b.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + c3608b + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void g(List list, b0.d dVar) {
        if (list.isEmpty()) {
            return;
        }
        g gVar = this.f22050a;
        d.C0812d c0812d = d.C0812d.f22080c;
        gVar.y(c0812d);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(1), list);
        g.c.d(gVarA, d.t.a(0), dVar);
        if (gVar.f22109g == gVar.n(c0812d.b()) && gVar.f22110h == gVar.n(c0812d.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c0812d.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f22109g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c0812d.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c0812d.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f22110h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c0812d.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + c0812d + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void h(AbstractC3539k0 abstractC3539k0, AbstractC3550q abstractC3550q, C3541l0 c3541l0, C3541l0 c3541l02) {
        g gVar = this.f22050a;
        d.C3610e c3610e = d.C3610e.f22081c;
        gVar.y(c3610e);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), abstractC3539k0);
        g.c.d(gVarA, d.t.a(1), abstractC3550q);
        g.c.d(gVarA, d.t.a(3), c3541l02);
        g.c.d(gVarA, d.t.a(2), c3541l0);
        if (gVar.f22109g == gVar.n(c3610e.b()) && gVar.f22110h == gVar.n(c3610e.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c3610e.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f22109g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c3610e.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c3610e.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f22110h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c3610e.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + c3610e + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void i() {
        this.f22050a.x(d.C3611f.f22082c);
    }

    public final void j(b0.d dVar, C3520d c3520d) {
        g gVar = this.f22050a;
        d.C3612g c3612g = d.C3612g.f22083c;
        gVar.y(c3612g);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), dVar);
        g.c.d(gVarA, d.t.a(1), c3520d);
        if (gVar.f22109g == gVar.n(c3612g.b()) && gVar.f22110h == gVar.n(c3612g.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c3612g.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f22109g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c3612g.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c3612g.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f22110h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c3612g.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + c3612g + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void k(Object[] objArr) {
        if (objArr.length == 0) {
            return;
        }
        g gVar = this.f22050a;
        d.C3613h c3613h = d.C3613h.f22084c;
        gVar.y(c3613h);
        g.c.d(g.c.a(gVar), d.t.a(0), objArr);
        if (gVar.f22109g == gVar.n(c3613h.b()) && gVar.f22110h == gVar.n(c3613h.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c3613h.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f22109g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c3613h.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c3613h.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f22110h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c3613h.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + c3613h + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void l(InterfaceC6835l interfaceC6835l, InterfaceC3548p interfaceC3548p) {
        g gVar = this.f22050a;
        d.i iVar = d.i.f22085c;
        gVar.y(iVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), interfaceC6835l);
        g.c.d(gVarA, d.t.a(1), interfaceC3548p);
        if (gVar.f22109g == gVar.n(iVar.b()) && gVar.f22110h == gVar.n(iVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = iVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f22109g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(iVar.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = iVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f22110h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(iVar.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + iVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void m() {
        this.f22050a.x(d.j.f22086c);
    }

    public final void n() {
        this.f22050a.x(d.k.f22087c);
    }

    public final void o(C3520d c3520d) {
        g gVar = this.f22050a;
        d.l lVar = d.l.f22088c;
        gVar.y(lVar);
        g.c.d(g.c.a(gVar), d.t.a(0), c3520d);
        if (gVar.f22109g == gVar.n(lVar.b()) && gVar.f22110h == gVar.n(lVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = lVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f22109g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(lVar.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = lVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f22110h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(lVar.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + lVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void p() {
        this.f22050a.x(d.m.f22089c);
    }

    public final void q(a aVar, b0.d dVar) {
        if (aVar.d()) {
            g gVar = this.f22050a;
            d.C3609c c3609c = d.C3609c.f22079c;
            gVar.y(c3609c);
            g gVarA = g.c.a(gVar);
            g.c.d(gVarA, d.t.a(0), aVar);
            g.c.d(gVarA, d.t.a(1), dVar);
            if (gVar.f22109g == gVar.n(c3609c.b()) && gVar.f22110h == gVar.n(c3609c.d())) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int iB = c3609c.b();
            int i10 = 0;
            for (int i11 = 0; i11 < iB; i11++) {
                if (((1 << i11) & gVar.f22109g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(c3609c.e(d.q.a(i11)));
                    i10++;
                }
            }
            String string = sb2.toString();
            AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int iD = c3609c.d();
            int i12 = 0;
            for (int i13 = 0; i13 < iD; i13++) {
                if (((1 << i13) & gVar.f22110h) != 0) {
                    if (i10 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(c3609c.f(d.t.a(i13)));
                    i12++;
                }
            }
            String string2 = sb3.toString();
            AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
            B0.b("Error while pushing " + c3609c + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
        }
    }

    public final void r(C3520d c3520d, C3516b1 c3516b1) {
        g gVar = this.f22050a;
        d.o oVar = d.o.f22091c;
        gVar.y(oVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), c3520d);
        g.c.d(gVarA, d.t.a(1), c3516b1);
        if (gVar.f22109g == gVar.n(oVar.b()) && gVar.f22110h == gVar.n(oVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = oVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f22109g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(oVar.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = oVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f22110h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(oVar.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + oVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void s(C3520d c3520d, C3516b1 c3516b1, c cVar) {
        g gVar = this.f22050a;
        d.p pVar = d.p.f22092c;
        gVar.y(pVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), c3520d);
        g.c.d(gVarA, d.t.a(1), c3516b1);
        g.c.d(gVarA, d.t.a(2), cVar);
        if (gVar.f22109g == gVar.n(pVar.b()) && gVar.f22110h == gVar.n(pVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = pVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f22109g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(pVar.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = pVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f22110h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(pVar.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + pVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void t(int i10) {
        g gVar = this.f22050a;
        d.r rVar = d.r.f22093c;
        gVar.y(rVar);
        g.c.c(g.c.a(gVar), d.q.a(0), i10);
        if (gVar.f22109g == gVar.n(rVar.b()) && gVar.f22110h == gVar.n(rVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = rVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f22109g) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(rVar.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = rVar.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f22110h) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(rVar.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + rVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void u(int i10, int i11, int i12) {
        g gVar = this.f22050a;
        d.s sVar = d.s.f22094c;
        gVar.y(sVar);
        g gVarA = g.c.a(gVar);
        g.c.c(gVarA, d.q.a(1), i10);
        g.c.c(gVarA, d.q.a(0), i11);
        g.c.c(gVarA, d.q.a(2), i12);
        if (gVar.f22109g == gVar.n(sVar.b()) && gVar.f22110h == gVar.n(sVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = sVar.b();
        int i13 = 0;
        for (int i14 = 0; i14 < iB; i14++) {
            if (((1 << i14) & gVar.f22109g) != 0) {
                if (i13 > 0) {
                    sb2.append(", ");
                }
                sb2.append(sVar.e(d.q.a(i14)));
                i13++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = sVar.d();
        int i15 = 0;
        for (int i16 = 0; i16 < iD; i16++) {
            if (((1 << i16) & gVar.f22110h) != 0) {
                if (i13 > 0) {
                    sb3.append(", ");
                }
                sb3.append(sVar.f(d.t.a(i16)));
                i15++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + sVar + ". Not all arguments were provided. Missing " + i13 + " int arguments (" + string + ") and " + i15 + " object arguments (" + string2 + ").");
    }

    public final void v(S0 s02) {
        g gVar = this.f22050a;
        d.v vVar = d.v.f22096c;
        gVar.y(vVar);
        g.c.d(g.c.a(gVar), d.t.a(0), s02);
        if (gVar.f22109g == gVar.n(vVar.b()) && gVar.f22110h == gVar.n(vVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = vVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f22109g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(vVar.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = vVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f22110h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(vVar.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + vVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void w() {
        this.f22050a.x(d.w.f22097c);
    }

    public final void x(int i10, int i11) {
        g gVar = this.f22050a;
        d.x xVar = d.x.f22098c;
        gVar.y(xVar);
        g gVarA = g.c.a(gVar);
        g.c.c(gVarA, d.q.a(0), i10);
        g.c.c(gVarA, d.q.a(1), i11);
        if (gVar.f22109g == gVar.n(xVar.b()) && gVar.f22110h == gVar.n(xVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = xVar.b();
        int i12 = 0;
        for (int i13 = 0; i13 < iB; i13++) {
            if (((1 << i13) & gVar.f22109g) != 0) {
                if (i12 > 0) {
                    sb2.append(", ");
                }
                sb2.append(xVar.e(d.q.a(i13)));
                i12++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = xVar.d();
        int i14 = 0;
        for (int i15 = 0; i15 < iD; i15++) {
            if (((1 << i15) & gVar.f22110h) != 0) {
                if (i12 > 0) {
                    sb3.append(", ");
                }
                sb3.append(xVar.f(d.t.a(i15)));
                i14++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + xVar + ". Not all arguments were provided. Missing " + i12 + " int arguments (" + string + ") and " + i14 + " object arguments (" + string2 + ").");
    }

    public final void y() {
        this.f22050a.x(d.y.f22099c);
    }

    public final void z(InterfaceC6824a interfaceC6824a) {
        g gVar = this.f22050a;
        d.z zVar = d.z.f22100c;
        gVar.y(zVar);
        g.c.d(g.c.a(gVar), d.t.a(0), interfaceC6824a);
        if (gVar.f22109g == gVar.n(zVar.b()) && gVar.f22110h == gVar.n(zVar.d())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = zVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f22109g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(zVar.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = zVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f22110h) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(zVar.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + zVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }
}
