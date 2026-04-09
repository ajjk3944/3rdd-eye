package k5;

import a0.x0;
import al.i1;
import al.v0;
import al.z0;
import d.y;
import d.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import nk.k;
import zj.l;
import zj.n;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f27941a = z0.b(f.f27953a);

    /* renamed from: b, reason: collision with root package name */
    public final i1 f27942b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f27943c;

    /* renamed from: d, reason: collision with root package name */
    public final l f27944d;

    /* renamed from: e, reason: collision with root package name */
    public final l f27945e;

    /* renamed from: f, reason: collision with root package name */
    public y f27946f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public d f27947h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f27948i;
    public final LinkedHashSet j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f27949k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f27950l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27951m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f27952n;

    public e() {
        i1 i1VarB = z0.b(new c());
        this.f27942b = i1VarB;
        this.f27943c = new v0(i1VarB);
        this.f27944d = new l();
        this.f27945e = new l();
        this.f27948i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.f27949k = new LinkedHashSet();
    }

    public final void a(x0 x0Var, d dVar, int i4) {
        k.e(x0Var, "dispatcher");
        if (dVar.f27939a == null) {
            (i4 != 0 ? i4 != 1 ? this.f27948i : this.j : this.f27949k).add(dVar);
            dVar.f27939a = x0Var;
            k.e((c) this.f27943c.f626a.getValue(), "history");
            dVar.b(i4 != 0 ? i4 != 1 ? this.f27952n : this.f27950l : this.f27951m);
            return;
        }
        throw new IllegalArgumentException(("Input '" + dVar + "' is already added to dispatcher " + dVar.f27939a + '.').toString());
    }

    public final void b() {
        boolean z3;
        boolean z10;
        c cVar;
        l lVar = this.f27944d;
        if (lVar == null || !lVar.isEmpty()) {
            Iterator it = lVar.iterator();
            while (it.hasNext()) {
                if (((y) it.next()).f21641b) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        } else {
            z3 = false;
        }
        l lVar2 = this.f27945e;
        if (lVar2 == null || !lVar2.isEmpty()) {
            Iterator it2 = lVar2.iterator();
            while (it2.hasNext()) {
                if (((y) it2.next()).f21641b) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        boolean z11 = z3 || z10;
        boolean z12 = this.f27951m != z3;
        boolean z13 = this.f27950l != z10;
        boolean z14 = this.f27952n != z11;
        LinkedHashSet linkedHashSet = this.f27949k;
        if (z12) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).b(z3);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z13) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).b(z10);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f27948i;
        if (z14) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).b(z11);
            }
        }
        this.f27951m = z3;
        this.f27950l = z10;
        this.f27952n = z11;
        y yVarC = this.f27946f;
        if (yVarC == null) {
            yVarC = c(0);
        }
        y yVarC2 = this.f27946f;
        if (yVarC2 == null) {
            yVarC2 = c(0);
        }
        if (k.a(yVarC2, yVarC)) {
            if (yVarC2 == null) {
                cVar = new c();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = lVar.iterator();
                while (it6.hasNext()) {
                    ((y) it6.next()).getClass();
                }
                Iterator<E> it7 = lVar2.iterator();
                while (it7.hasNext()) {
                    ((y) it7.next()).getClass();
                }
                z zVar = yVarC2.f21640a;
                ak.c cVarF = cm.g.f();
                n.W(cVarF, arrayList);
                cVarF.add(zVar);
                n.W(cVarF, s.f38317a);
                cVar = new c(arrayList.size(), cm.g.d(cVarF));
            }
            i1 i1Var = this.f27942b;
            if (k.a((c) i1Var.getValue(), cVar)) {
                return;
            }
            i1Var.j(null, cVar);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((d) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((d) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((d) it10.next()).getClass();
            }
        }
    }

    public final y c(int i4) {
        Object next;
        Object next2;
        l lVar = this.f27945e;
        l lVar2 = this.f27944d;
        Object obj = null;
        if (i4 == -1) {
            Iterator it = lVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((y) next).f21641b) {
                    break;
                }
            }
            y yVar = (y) next;
            if (yVar != null) {
                return yVar;
            }
            Iterator it2 = lVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (((y) next3).f21641b) {
                    obj = next3;
                    break;
                }
            }
            return (y) obj;
        }
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i4 + "'.").toString());
            }
            Iterator it3 = lVar2.iterator();
            while (it3.hasNext()) {
                ((y) it3.next()).getClass();
            }
            Iterator it4 = lVar.iterator();
            while (it4.hasNext()) {
                ((y) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = lVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            if (((y) next2).f21641b) {
                break;
            }
        }
        y yVar2 = (y) next2;
        if (yVar2 != null) {
            return yVar2;
        }
        Iterator it6 = lVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next4 = it6.next();
            if (((y) next4).f21641b) {
                obj = next4;
                break;
            }
        }
        return (y) obj;
    }
}
