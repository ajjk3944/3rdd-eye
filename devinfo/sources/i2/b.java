package i2;

import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends i1.m implements u, l, u1, r1, h2.c, p1, t, m, n1.o, n1, m1.a, i {

    /* renamed from: o, reason: collision with root package name */
    public i1.l f25575o;

    @Override // i2.r1
    public final void B() {
        i1.l lVar = this.f25575o;
        nk.k.c(lVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((c2.y) lVar).f2700d.getClass();
    }

    @Override // h2.c
    public final h2.a E() {
        return h2.a.f24810a;
    }

    @Override // i2.l
    public final void J(g0 g0Var) {
        i1.l lVar = this.f25575o;
        nk.k.c(lVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((c0.r0) lVar).getClass();
        throw null;
    }

    @Override // i2.u
    public final int L(m0 m0Var, g2.i0 i0Var, int i4) {
        nk.k.c(this.f25575o, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        throw new ClassCastException();
    }

    @Override // i2.r1
    public final boolean R() {
        i1.l lVar = this.f25575o;
        nk.k.c(lVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((c2.y) lVar).f2700d.getClass();
        return true;
    }

    @Override // i2.u
    public final int S(m0 m0Var, g2.i0 i0Var, int i4) {
        nk.k.c(this.f25575o, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        throw new ClassCastException();
    }

    @Override // i2.r1
    public final void V() {
        u();
    }

    @Override // i2.u1
    public final /* synthetic */ boolean Y() {
        return false;
    }

    @Override // i2.p1
    public final Object Z(Object obj) {
        nk.k.c(this.f25575o, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        throw new ClassCastException();
    }

    @Override // m1.a
    public final d3.c a() {
        return k.s(this).f25650z;
    }

    @Override // i2.u
    public final g2.k0 a0(g2.l0 l0Var, g2.i0 i0Var, long j) {
        nk.k.c(this.f25575o, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        throw new ClassCastException();
    }

    @Override // i2.u1
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // m1.a
    public final long c() {
        return me.t1.F(k.q(this, 128).f24410c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // i2.r1
    public final void d(c2.j jVar, c2.k kVar, long j) {
        boolean z3;
        boolean z10;
        boolean z11;
        i1.l lVar = this.f25575o;
        nk.k.c(lVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        a0.x0 x0Var = ((c2.y) lVar).f2700d;
        c2.y yVar = (c2.y) x0Var.f147d;
        ?? r02 = jVar.f2626a;
        int size = r02.size();
        for (int i4 = 0; i4 < size; i4++) {
            c2.p pVar = (c2.p) r02.get(i4);
            if (c2.h0.a(pVar) || c2.h0.c(pVar)) {
                z3 = false;
                break;
            }
        }
        z3 = true;
        if (!z3) {
            z10 = false;
            break;
        }
        int size2 = r02.size();
        for (int i10 = 0; i10 < size2; i10++) {
            if (((c2.p) r02.get(i10)).b()) {
                z10 = false;
                break;
            }
        }
        z10 = true;
        if (yVar.f2699c) {
            z11 = true;
        } else {
            int size3 = r02.size();
            int i11 = 0;
            while (true) {
                if (i11 < size3) {
                    c2.p pVar2 = (c2.p) r02.get(i11);
                    if (c2.h0.a(pVar2) || c2.h0.c(pVar2)) {
                        break;
                    } else {
                        i11++;
                    }
                } else if (z10) {
                    break;
                } else {
                    z11 = false;
                }
            }
            z11 = true;
        }
        c2.v vVar = (c2.v) x0Var.f145b;
        c2.v vVar2 = c2.v.f2690c;
        c2.k kVar2 = c2.k.f2636c;
        if (vVar != vVar2) {
            if (kVar == c2.k.f2634a && z11) {
                x0Var.f146c = jVar;
                x0Var.o(jVar, !z3 || yVar.f2699c);
            }
            if (kVar == c2.k.f2635b && z3 && jVar.equals((c2.j) x0Var.f146c) && yVar.f2699c) {
                int size4 = r02.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    ((c2.p) r02.get(i12)).a();
                }
            }
            if (kVar == kVar2 && !z11 && !jVar.equals((c2.j) x0Var.f146c)) {
                x0Var.o(jVar, true);
            }
        }
        if (kVar == kVar2) {
            int size5 = r02.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size5) {
                    x0Var.f145b = c2.v.f2688a;
                    ((c2.y) x0Var.f147d).f2699c = false;
                    x0Var.f146c = null;
                    break;
                } else if (!c2.h0.c((c2.p) r02.get(i13))) {
                    break;
                } else {
                    i13++;
                }
            }
            if (jVar.equals((c2.j) x0Var.f146c) && z3) {
                int size6 = r02.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size6) {
                        break;
                    }
                    if (!((c2.p) r02.get(i14)).b()) {
                        i14++;
                    } else if (!yVar.f2699c) {
                        x0Var.L(jVar);
                        return;
                    }
                }
                int size7 = r02.size();
                for (int i15 = 0; i15 < size7; i15++) {
                    ((c2.p) r02.get(i15)).a();
                }
            }
        }
    }

    @Override // i2.r1
    public final long f() {
        return x1.f25814a;
    }

    @Override // i1.m
    public final void f0() {
        p0(true);
    }

    @Override // i1.m
    public final void g0() {
        if (this.f25575o instanceof c2.y) {
            u();
        }
    }

    @Override // m1.a
    public final d3.l getLayoutDirection() {
        return k.s(this).A;
    }

    @Override // i2.u
    public final int h(m0 m0Var, g2.i0 i0Var, int i4) {
        nk.k.c(this.f25575o, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        throw new ClassCastException();
    }

    @Override // i1.m
    public final void h0() {
        if (!this.f25565n) {
            f2.a.b("unInitializeModifier called on unattached node");
        }
        if ((this.f25556c & 8) != 0) {
            ((j2.r) k.t(this)).E();
        }
    }

    @Override // i2.n1
    public final boolean i() {
        return this.f25565n;
    }

    @Override // i2.u1
    public final void l(p2.x xVar) {
        int i4;
        i1.l lVar = this.f25575o;
        nk.k.c(lVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        p2.b bVar = (p2.b) lVar;
        p2.l lVar2 = new p2.l();
        lVar2.f31097c = bVar.f31038a;
        bVar.f31039b.invoke(lVar2);
        nk.k.c(xVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        p2.l lVar3 = (p2.l) xVar;
        x.e0 e0Var = lVar3.f31095a;
        if (lVar2.f31097c) {
            lVar3.f31097c = true;
        }
        if (lVar2.f31098d) {
            lVar3.f31098d = true;
        }
        x.e0 e0Var2 = lVar2.f31095a;
        Object[] objArr = e0Var2.f36874b;
        Object[] objArr2 = e0Var2.f36875c;
        long[] jArr = e0Var2.f36873a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr[i14];
                        Object obj2 = objArr2[i14];
                        p2.w wVar = (p2.w) obj;
                        if (!e0Var.b(wVar)) {
                            e0Var.m(wVar, obj2);
                        } else if (obj2 instanceof p2.a) {
                            Object objG = e0Var.g(wVar);
                            nk.k.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            p2.a aVar = (p2.a) objG;
                            i4 = i11;
                            String str = aVar.f31036a;
                            if (str == null) {
                                str = ((p2.a) obj2).f31036a;
                            }
                            yj.c cVar = aVar.f31037b;
                            if (cVar == null) {
                                cVar = ((p2.a) obj2).f31037b;
                            }
                            e0Var.m(wVar, new p2.a(str, cVar));
                        }
                        i4 = i11;
                    } else {
                        i4 = i11;
                    }
                    j >>= i4;
                    i13++;
                    i11 = i4;
                }
                if (i12 != i11) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // n1.o
    public final void m(n1.l lVar) {
        i1.l lVar2 = this.f25575o;
        f2.a.b("applyFocusProperties called on wrong node");
        lVar2.getClass();
        throw new ClassCastException();
    }

    @Override // i2.m
    public final void p(d1 d1Var) {
        nk.k.c(this.f25575o, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        throw new ClassCastException();
    }

    public final void p0(boolean z3) {
        if (!this.f25565n) {
            f2.a.b("initializeModifier called on unattached node");
        }
        i1.l lVar = this.f25575o;
        if ((this.f25556c & 4) != 0 && !z3) {
            k.q(this, 2).G0();
        }
        if ((this.f25556c & 2) != 0) {
            w1 w1Var = (w1) k.s(this).G.f19259f;
            nk.k.c(w1Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (w1Var.f25806o) {
                d1 d1Var = this.f25560h;
                nk.k.b(d1Var);
                ((w) d1Var).Y0(this);
                l1 l1Var = d1Var.L;
                if (l1Var != null) {
                    ((j2.g1) l1Var).invalidate();
                }
            }
            if (!z3) {
                k.q(this, 2).G0();
                k.s(this).E();
            }
        }
        if (lVar instanceof i0.r) {
            ((i0.r) lVar).f25498a.f25516k = k.s(this);
        }
        int i4 = this.f25556c;
        if ((i4 & 16) != 0 && (lVar instanceof c2.y)) {
            ((c2.y) lVar).f2700d.f148e = this.f25560h;
        }
        if ((i4 & 8) != 0) {
            ((j2.r) k.t(this)).E();
        }
    }

    public final void q0() {
        i1.l lVar = this.f25575o;
        f2.a.b("onFocusEvent called on wrong node");
        lVar.getClass();
        throw new ClassCastException();
    }

    @Override // i2.u
    public final int t(m0 m0Var, g2.i0 i0Var, int i4) {
        nk.k.c(this.f25575o, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        throw new ClassCastException();
    }

    public final String toString() {
        return this.f25575o.toString();
    }

    @Override // i2.r1
    public final void u() {
        i1.l lVar = this.f25575o;
        nk.k.c(lVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        a0.x0 x0Var = ((c2.y) lVar).f2700d;
        c2.v vVar = (c2.v) x0Var.f145b;
        c2.y yVar = (c2.y) x0Var.f147d;
        if (vVar == c2.v.f2689b) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            c2.x xVar = new c2.x(yVar, 0);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            xVar.invoke(motionEventObtain);
            motionEventObtain.recycle();
            x0Var.f145b = c2.v.f2688a;
            yVar.f2699c = false;
            x0Var.f146c = null;
        }
    }

    @Override // i2.u1
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // i2.l
    public final void z() {
        k.j(this);
    }

    @Override // i2.t
    public final void g(long j) {
    }

    @Override // i2.t
    public final void w(g2.v vVar) {
    }
}
