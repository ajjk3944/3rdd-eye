package p6;

import C.e0;
import D9.G;
import H6.I;
import K6.C0745n;
import N7.AbstractC1142dc;
import N7.C1210i5;
import N7.C1224j5;
import N7.S2;
import N7.Vb;
import N7.Z;
import X0.n;
import a7.C1668e;
import a7.q;
import b9.C2001h;
import b9.p;
import c9.C2092m;
import j6.C5195A;
import j6.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.l;
import o6.C5425b;
import o6.C5426c;
import p6.i;
import r6.C5529f;
import s6.o;

/* compiled from: RuntimeStore.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final C1668e f45221a;

    /* renamed from: b, reason: collision with root package name */
    public final Q6.c f45222b;

    /* renamed from: c, reason: collision with root package name */
    public final g.a f45223c;

    /* renamed from: d, reason: collision with root package name */
    public final C0745n f45224d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45225e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f45226f;

    /* renamed from: g, reason: collision with root package name */
    public final C5195A<C5426c> f45227g;

    /* renamed from: h, reason: collision with root package name */
    public final i f45228h;
    public C5426c i;

    /* renamed from: j, reason: collision with root package name */
    public final p f45229j;

    public h(C1668e c1668e, Q6.c cVar, g.a div2Logger, C0745n c0745n) {
        l.f(div2Logger, "div2Logger");
        this.f45221a = c1668e;
        this.f45222b = cVar;
        this.f45223c = div2Logger;
        this.f45224d = c0745n;
        this.f45226f = new LinkedHashMap();
        this.f45227g = new C5195A<>();
        this.f45228h = new i();
        this.f45229j = C2001h.b(new g(this));
    }

    public static C5426c a(h hVar, String path, Z div, A7.d dVar, C5426c c5426c, int i) {
        C5426c c5426c2;
        if ((i & 4) != 0) {
            dVar = null;
        }
        C5426c c5426c3 = (i & 8) != 0 ? null : c5426c;
        hVar.getClass();
        l.f(path, "path");
        l.f(div, "div");
        i iVar = hVar.f45228h;
        iVar.getClass();
        i.a aVar = (i.a) iVar.f45231b.get(path);
        return (aVar == null || (c5426c2 = aVar.f45232a) == null) ? hVar.b(path, div, null, dVar, c5426c3) : c5426c2;
    }

    public final C5426c b(String path, Z z10, C5426c c5426c, A7.d dVar, C5426c c5426c2) throws Z6.e {
        C5426c c5426cC;
        ArrayList arrayList;
        List<Vb> list;
        List<C1210i5> list2;
        Q6.c cVar;
        C5425b c5425b;
        C5529f c5529f;
        S2 s2D;
        S2 s2D2;
        S2 s2D3;
        List<AbstractC1142dc> listH;
        Q6.c cVar2 = this.f45222b;
        if (c5426c != null) {
            c5426cC = c5426c;
        } else if (c5426c2 == null) {
            c5426cC = dVar != null ? c(dVar) : null;
            if (c5426cC == null && (c5426cC = this.i) == null) {
                cVar2.a(new AssertionError("Root runtime is not specified."));
                return null;
            }
        } else {
            c5426cC = c5426c2;
        }
        C5426c c5426cC2 = c5426c2 == null ? dVar != null ? c(dVar) : null : c5426c2;
        if (z10 == null || (s2D3 = z10.d()) == null || (listH = s2D3.h()) == null) {
            arrayList = null;
        } else {
            List<AbstractC1142dc> list3 = listH;
            arrayList = new ArrayList(C2092m.T(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(s6.c.a((AbstractC1142dc) it.next()));
            }
        }
        List<Vb> listR = (z10 == null || (s2D2 = z10.d()) == null) ? null : s2D2.r();
        List<C1210i5> listU = (z10 == null || (s2D = z10.d()) == null) ? null : s2D.u();
        i iVar = this.f45228h;
        if ((arrayList == null || arrayList.isEmpty()) && (((list = listR) == null || list.isEmpty()) && ((list2 = listU) == null || list2.isEmpty()))) {
            iVar.c(c5426cC, c5426cC2, path);
            c5426cC.b();
            return c5426cC;
        }
        o oVar = new o(c5426cC.f44858b);
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                oVar.e((Z6.d) it2.next());
            }
        }
        List<C1210i5> list4 = listU;
        H7.e eVar = c5426cC.f44860d;
        if (list4 == null || list4.isEmpty()) {
            cVar = cVar2;
        } else {
            l.f(listU, "<this>");
            List<C1210i5> list5 = listU;
            ArrayList arrayList2 = new ArrayList(C2092m.T(list5, 10));
            Iterator it3 = list5.iterator();
            while (it3.hasNext()) {
                C1210i5 c1210i5 = (C1210i5) it3.next();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (C1224j5 c1224j5 : c1210i5.f8399a) {
                    arrayList3.add(c1224j5.f8485a);
                    arrayList4.add(new a7.j(C6.h.a(c1224j5.f8486b), false));
                    it3 = it3;
                    cVar2 = cVar2;
                }
                arrayList2.add(new e(c1210i5.f8401c, arrayList4, C6.h.a(c1210i5.f8402d), arrayList3, c1210i5.f8400b));
                it3 = it3;
                cVar2 = cVar2;
            }
            cVar = cVar2;
            eVar.getClass();
            eVar = new H7.e(new G(new q(arrayList2), eVar));
        }
        n nVar = this.f45221a.f14211a;
        C1668e c1668e = new C1668e(new n(oVar, (e0) nVar.f13449b, eVar, (I) nVar.f13451d));
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append('/');
        C5425b c5425b2 = c5426cC.f44857a;
        if (c5425b2 == null) {
            c5425b2 = null;
        }
        sb.append(c5425b2 != null ? c5425b2.f44848b : null);
        Q6.c cVar3 = cVar;
        C5425b c5425b3 = new C5425b(sb.toString(), this, oVar, c1668e, cVar3, (C5425b.a) this.f45229j.getValue());
        List<Vb> list6 = listR;
        if (list6 == null || list6.isEmpty()) {
            c5425b = c5425b3;
            c5529f = null;
        } else {
            c5425b = c5425b3;
            C5529f c5529f2 = new C5529f(oVar, c5425b, c1668e, cVar3, this.f45223c, this.f45224d);
            c5529f2.b(listR);
            c5529f = c5529f2;
        }
        C5426c c5426c3 = new C5426c(c5425b, oVar, c5529f, eVar, this);
        l.f(path, "path");
        d(c5426c3);
        iVar.c(c5426c3, c5426cC2, path);
        c5426c3.b();
        return c5426c3;
    }

    public final C5426c c(A7.d resolver) {
        l.f(resolver, "resolver");
        return (C5426c) this.f45226f.get(resolver);
    }

    public final void d(C5426c c5426c) {
        this.f45226f.put(c5426c.f44857a, c5426c);
        this.f45227g.b(c5426c);
    }

    public final C5426c e(String path, Z z10, A7.d resolver, A7.d dVar) {
        l.f(path, "path");
        l.f(resolver, "resolver");
        i iVar = this.f45228h;
        iVar.getClass();
        i.a aVar = (i.a) iVar.f45231b.get(path);
        C5426c c5426c = aVar != null ? aVar.f45232a : null;
        if (resolver.equals(c5426c != null ? c5426c.f44857a : null)) {
            return c5426c;
        }
        C5426c c5426cC = c(resolver);
        if (c5426cC == null) {
            this.f45222b.a(new AssertionError("ExpressionResolverImpl didn't call RuntimeStore#putRuntime on create."));
            return null;
        }
        if (c5426c != null) {
            iVar.a(c5426c, path, new j(iVar));
        }
        return b(path, z10, c5426cC, dVar, null);
    }
}
