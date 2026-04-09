package U;

import T.AbstractC3546o;
import T.B0;
import T.C3520d;
import T.C3525e1;
import T.InterfaceC3526f;
import T.R0;
import U.d;
import U.g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.V;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    private final g f22065a = new g();

    /* renamed from: b, reason: collision with root package name */
    private final g f22066b = new g();

    public final void a() {
        this.f22066b.m();
        this.f22065a.m();
    }

    public final void b(InterfaceC6824a interfaceC6824a, int i10, C3520d c3520d) {
        g gVar;
        g gVar2;
        g gVar3 = this.f22065a;
        d.n nVar = d.n.f22090c;
        gVar3.y(nVar);
        g gVarA = g.c.a(gVar3);
        g.c.d(gVarA, d.t.a(0), interfaceC6824a);
        g.c.c(gVarA, d.q.a(0), i10);
        int i11 = 1;
        g.c.d(gVarA, d.t.a(1), c3520d);
        if (!(gVar3.f22109g == gVar3.n(nVar.b()) && gVar3.f22110h == gVar3.n(nVar.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int iB = nVar.b();
            int i12 = 0;
            int i13 = 0;
            while (i13 < iB) {
                if (((i11 << i13) & gVar3.f22109g) != 0) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(nVar.e(d.q.a(i13)));
                    i12++;
                }
                i13++;
                i11 = 1;
            }
            String string = sb2.toString();
            AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int iD = nVar.d();
            int i14 = 0;
            int i15 = 0;
            while (i15 < iD) {
                if (((1 << i15) & gVar3.f22110h) != 0) {
                    if (i12 > 0) {
                        sb3.append(", ");
                    }
                    gVar2 = gVar3;
                    sb3.append(nVar.f(d.t.a(i15)));
                    i14++;
                } else {
                    gVar2 = gVar3;
                }
                i15++;
                gVar3 = gVar2;
            }
            String string2 = sb3.toString();
            AbstractC6492s.h(string2, "StringBuilder().apply(builderAction).toString()");
            B0.b("Error while pushing " + nVar + ". Not all arguments were provided. Missing " + i12 + " int arguments (" + string + ") and " + i14 + " object arguments (" + string2 + ").");
        }
        g gVar4 = this.f22066b;
        d.u uVar = d.u.f22095c;
        gVar4.y(uVar);
        g gVarA2 = g.c.a(gVar4);
        g.c.c(gVarA2, d.q.a(0), i10);
        g.c.d(gVarA2, d.t.a(0), c3520d);
        if (gVar4.f22109g == gVar4.n(uVar.b()) && gVar4.f22110h == gVar4.n(uVar.d())) {
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        int iB2 = uVar.b();
        int i16 = 0;
        for (int i17 = 0; i17 < iB2; i17++) {
            if (((1 << i17) & gVar4.f22109g) != 0) {
                if (i16 > 0) {
                    sb4.append(", ");
                }
                sb4.append(uVar.e(d.q.a(i17)));
                i16++;
            }
        }
        String string3 = sb4.toString();
        AbstractC6492s.h(string3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder();
        int iD2 = uVar.d();
        int i18 = 0;
        int i19 = 0;
        while (i19 < iD2) {
            if (((1 << i19) & gVar4.f22110h) != 0) {
                if (i16 > 0) {
                    sb5.append(", ");
                }
                gVar = gVar4;
                sb5.append(uVar.f(d.t.a(i19)));
                i18++;
            } else {
                gVar = gVar4;
            }
            i19++;
            gVar4 = gVar;
        }
        String string4 = sb5.toString();
        AbstractC6492s.h(string4, "StringBuilder().apply(builderAction).toString()");
        B0.b("Error while pushing " + uVar + ". Not all arguments were provided. Missing " + i16 + " int arguments (" + string3 + ") and " + i18 + " object arguments (" + string4 + ").");
    }

    public final void c() {
        if (!this.f22066b.u()) {
            AbstractC3546o.r("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.f22066b.w(this.f22065a);
    }

    public final void d(InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
        if (!this.f22066b.t()) {
            AbstractC3546o.r("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.f22065a.r(interfaceC3526f, c3525e1, r02);
    }

    public final boolean e() {
        return this.f22065a.t();
    }

    public final void f(Object obj, InterfaceC6839p interfaceC6839p) {
        g gVar = this.f22065a;
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
}
