package q0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import c2.s;
import e0.i;
import e0.j;
import g2.v;
import i1.m;
import i2.g0;
import i2.k;
import i2.l;
import i2.t;
import j2.h0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import je.u;
import km.o;
import km.y;
import me.t1;
import nm.d0;
import p1.q;
import pf.n;
import r0.p;
import x.a0;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends m implements i2.h, l, t {

    /* renamed from: o, reason: collision with root package name */
    public final i f32033o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f32034p;

    /* renamed from: q, reason: collision with root package name */
    public final float f32035q;

    /* renamed from: r, reason: collision with root package name */
    public final y f32036r;

    /* renamed from: s, reason: collision with root package name */
    public final p f32037s;

    /* renamed from: t, reason: collision with root package name */
    public s f32038t;

    /* renamed from: u, reason: collision with root package name */
    public float f32039u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f32041w;

    /* renamed from: y, reason: collision with root package name */
    public d f32043y;

    /* renamed from: z, reason: collision with root package name */
    public e f32044z;

    /* renamed from: v, reason: collision with root package name */
    public long f32040v = 0;

    /* renamed from: x, reason: collision with root package name */
    public final a0 f32042x = new a0();

    public a(i iVar, boolean z3, float f10, y yVar, p pVar) {
        this.f32033o = iVar;
        this.f32034p = z3;
        this.f32035q = f10;
        this.f32036r = yVar;
        this.f32037s = pVar;
    }

    @Override // i2.l
    public final void J(g0 g0Var) throws Resources.NotFoundException {
        r1.b bVar = g0Var.f25668a;
        g0Var.b();
        s sVar = this.f32038t;
        if (sVar != null) {
            float f10 = this.f32039u;
            long jE = this.f32036r.e();
            float fFloatValue = ((Number) ((a0.e) sVar.f2685c).d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jB = p1.s.b(jE, fFloatValue);
                if (sVar.f2683a) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (g0Var.c() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (g0Var.c() & 4294967295L));
                    i0.f fVar = bVar.f32718b;
                    long jE2 = fVar.E();
                    fVar.x().c();
                    try {
                        ((i0.f) ((d0) fVar.f25416b).f30011b).x().i(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        u.d(g0Var, jB, f10);
                    } finally {
                        fVar.x().k();
                        fVar.R(jE2);
                    }
                } else {
                    u.d(g0Var, jB, f10);
                }
            }
        }
        q qVarX = bVar.f32718b.x();
        e eVar = this.f32044z;
        if (eVar != null) {
            long j = this.f32040v;
            int iS = pk.a.s(this.f32039u);
            long jE3 = this.f32036r.e();
            this.f32037s.invoke();
            eVar.e(j, jE3, iS);
            eVar.draw(p1.d.a(qVarX));
        }
    }

    @Override // i1.m
    public final boolean c0() {
        return false;
    }

    @Override // i1.m
    public final void f0() {
        x.v(b0(), null, null, new n(this, null, 2), 3);
    }

    @Override // i2.t
    public final void g(long j) {
        float fI;
        this.f32041w = true;
        d3.c cVar = k.s(this).f25650z;
        this.f32040v = t1.F(j);
        float f10 = this.f32035q;
        if (Float.isNaN(f10)) {
            long j8 = this.f32040v;
            float f11 = c.f32045a;
            fI = o1.b.c(com.bumptech.glide.d.a(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)))) / 2.0f;
            if (this.f32034p) {
                fI += cVar.I(c.f32045a);
            }
        } else {
            fI = cVar.I(f10);
        }
        this.f32039u = fI;
        a0 a0Var = this.f32042x;
        Object[] objArr = a0Var.f36846a;
        int i4 = a0Var.f36847b;
        for (int i10 = 0; i10 < i4; i10++) {
            p0((e0.m) objArr[i10]);
        }
        a0Var.d();
    }

    @Override // i1.m
    public final void h0() throws Resources.NotFoundException {
        d dVar = this.f32043y;
        if (dVar != null) {
            this.f32044z = null;
            k.j(this);
            o oVar = dVar.f32049d;
            e eVar = (e) ((LinkedHashMap) oVar.f28445a).get(this);
            if (eVar != null) {
                eVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) oVar.f28445a;
                e eVar2 = (e) linkedHashMap.get(this);
                if (eVar2 != null) {
                }
                linkedHashMap.remove(this);
                dVar.f32048c.add(eVar);
            }
        }
    }

    public final void p0(e0.m mVar) {
        e eVar;
        if (!(mVar instanceof e0.k)) {
            if (mVar instanceof e0.l) {
                e eVar2 = this.f32044z;
                if (eVar2 != null) {
                    eVar2.d();
                    return;
                }
                return;
            }
            if (!(mVar instanceof j) || (eVar = this.f32044z) == null) {
                return;
            }
            eVar.d();
            return;
        }
        e0.k kVar = (e0.k) mVar;
        long j = this.f32040v;
        float f10 = this.f32039u;
        d dVar = this.f32043y;
        if (dVar == null) {
            Object obj = (View) k.h(this, h0.f27174f);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    d dVar2 = new d(viewGroup.getContext());
                    viewGroup.addView(dVar2);
                    dVar = dVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i4);
                    if (childAt instanceof d) {
                        dVar = (d) childAt;
                        break;
                    }
                    i4++;
                }
            }
            this.f32043y = dVar;
        }
        ArrayList arrayList = dVar.f32047b;
        o oVar = dVar.f32049d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) oVar.f28445a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) oVar.f28445a;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) oVar.f28446b;
        e eVar3 = (e) linkedHashMap.get(this);
        if (eVar3 == null) {
            ArrayList arrayList2 = dVar.f32048c;
            nk.k.e(arrayList2, "<this>");
            eVar3 = (e) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (eVar3 == null) {
                if (dVar.f32050e > cm.g.r(arrayList)) {
                    eVar3 = new e(dVar.getContext());
                    dVar.addView(eVar3);
                    arrayList.add(eVar3);
                } else {
                    eVar3 = (e) arrayList.get(dVar.f32050e);
                    a aVar = (a) linkedHashMap3.get(eVar3);
                    if (aVar != null) {
                        aVar.f32044z = null;
                        k.j(aVar);
                        e eVar4 = (e) linkedHashMap2.get(aVar);
                        if (eVar4 != null) {
                        }
                        linkedHashMap2.remove(aVar);
                        eVar3.c();
                    }
                }
                int i10 = dVar.f32050e;
                if (i10 < dVar.f32046a - 1) {
                    dVar.f32050e = i10 + 1;
                } else {
                    dVar.f32050e = 0;
                }
            }
            linkedHashMap2.put(this, eVar3);
            linkedHashMap3.put(eVar3, this);
        }
        e eVar5 = eVar3;
        int iS = pk.a.s(f10);
        long jE = this.f32036r.e();
        this.f32037s.invoke();
        eVar5.b(kVar, this.f32034p, j, iS, jE, new a6.e(19, this));
        this.f32044z = eVar5;
        k.j(this);
    }

    @Override // i2.l
    public final /* synthetic */ void z() {
    }

    @Override // i2.t
    public final /* synthetic */ void w(v vVar) {
    }
}
