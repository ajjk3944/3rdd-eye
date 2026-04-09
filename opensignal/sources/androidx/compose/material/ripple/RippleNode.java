package androidx.compose.material.ripple;

import a0.i;
import a0.j;
import a0.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.p0;
import ar.a;
import com.google.android.gms.internal.measurement.e5;
import g1.f;
import g1.p;
import g1.r;
import g1.s;
import io.sentry.t;
import j0.b;
import j0.d;
import j0.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import n0.b2;
import n0.x0;
import pq.c;
import u.z;
import wt.w;
import x1.h;
import x1.h0;
import x1.m;
import x1.u;
import y1.l0;
import z0.l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Lz0/l;", "Lx1/h;", "Lx1/m;", "Lx1/u;", "Lg1/s;", "color", "Lg1/s;", "material-ripple"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class RippleNode extends l implements h, m, u {
    private final s color;

    /* renamed from: p, reason: collision with root package name */
    public final i f1099p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1100q;

    /* renamed from: r, reason: collision with root package name */
    public final float f1101r;

    /* renamed from: s, reason: collision with root package name */
    public final a f1102s;

    /* renamed from: t, reason: collision with root package name */
    public f f1103t;

    /* renamed from: u, reason: collision with root package name */
    public float f1104u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1106w;

    /* renamed from: v, reason: collision with root package name */
    public long f1105v = 0;

    /* renamed from: x, reason: collision with root package name */
    public final z f1107x = new z();

    public RippleNode(i iVar, boolean z10, float f10, s sVar, a aVar) {
        this.f1099p = iVar;
        this.f1100q = z10;
        this.f1101r = f10;
        this.color = sVar;
        this.f1102s = aVar;
    }

    @Override // z0.l
    public final boolean R() {
        return false;
    }

    @Override // z0.l
    public final void U() {
        w.s(Q(), null, null, new a8.h(this, (c) null, 11), 3);
    }

    public final void c0(a0.m mVar) {
        e eVar;
        if (!(mVar instanceof k)) {
            if (mVar instanceof a0.l) {
                e eVar2 = ((j0.a) this).f13018z;
                if (eVar2 != null) {
                    eVar2.d();
                    return;
                }
                return;
            }
            if (!(mVar instanceof j) || (eVar = ((j0.a) this).f13018z) == null) {
                return;
            }
            eVar.d();
            return;
        }
        k kVar = (k) mVar;
        long j = this.f1105v;
        float f10 = this.f1104u;
        j0.a aVar = (j0.a) this;
        d dVar = aVar.f13017y;
        if (dVar == null) {
            Object obj = (View) x1.k.h(aVar, l0.f25739f);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    d dVar2 = new d(viewGroup.getContext());
                    viewGroup.addView(dVar2);
                    dVar = dVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt instanceof d) {
                        dVar = (d) childAt;
                        break;
                    }
                    i10++;
                }
            }
            aVar.f13017y = dVar;
        }
        ArrayList arrayList = dVar.f13025d;
        t tVar = dVar.f13027r;
        LinkedHashMap linkedHashMap = (LinkedHashMap) tVar.f12736a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) tVar.f12736a;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) tVar.f12737d;
        e eVar3 = (e) linkedHashMap.get(aVar);
        if (eVar3 == null) {
            eVar3 = (e) mq.t.f0(dVar.f13026g);
            if (eVar3 == null) {
                if (dVar.f13028x > e5.z(arrayList)) {
                    eVar3 = new e(dVar.getContext());
                    dVar.addView(eVar3);
                    arrayList.add(eVar3);
                } else {
                    eVar3 = (e) arrayList.get(dVar.f13028x);
                    j0.a aVar2 = (j0.a) linkedHashMap3.get(eVar3);
                    if (aVar2 != null) {
                        aVar2.f13018z = null;
                        x1.k.j(aVar2);
                        e eVar4 = (e) linkedHashMap2.get(aVar2);
                        if (eVar4 != null) {
                        }
                        linkedHashMap2.remove(aVar2);
                        eVar3.c();
                    }
                }
                int i11 = dVar.f13028x;
                if (i11 < dVar.f13024a - 1) {
                    dVar.f13028x = i11 + 1;
                } else {
                    dVar.f13028x = 0;
                }
            }
            linkedHashMap2.put(aVar, eVar3);
            linkedHashMap3.put(eVar3, aVar);
        }
        e eVar5 = eVar3;
        eVar5.b(kVar, aVar.f1100q, j, dr.a.F(f10), aVar.color.a(), ((b) aVar.f1102s.c()).f13022d, new p0(8, aVar));
        aVar.f13018z = eVar5;
        x1.k.j(aVar);
    }

    @Override // x1.m
    public final void d(h0 h0Var) throws Throwable {
        i1.b bVar = h0Var.f24844b;
        h0Var.a();
        f fVar = this.f1103t;
        if (fVar != null) {
            float f10 = this.f1104u;
            long jA = this.color.a();
            float fFloatValue = ((Number) ((b2) ((x0) ((k8.b) ((al.c) fVar.f9210g).f822d).f14199y)).getValue()).floatValue();
            if (fFloatValue > 0.0f) {
                long jB = r.b(jA, fFloatValue);
                if (fVar.f9208a) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.C() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.C() & 4294967295L));
                    bm.d dVar = bVar.f11141c;
                    long jH = dVar.H();
                    dVar.y().g();
                    try {
                        ((bm.d) ((h7.h0) dVar.f2826d).f10078a).y().l(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        i1.d.D(h0Var, jB, f10);
                    } finally {
                        dVar.y().n();
                        dVar.R(jH);
                    }
                } else {
                    i1.d.D(h0Var, jB, f10);
                }
            }
        }
        j0.a aVar = (j0.a) this;
        p pVarY = bVar.f11141c.y();
        e eVar = aVar.f13018z;
        if (eVar != null) {
            eVar.e(aVar.f1105v, dr.a.F(aVar.f1104u), aVar.color.a(), ((b) aVar.f1102s.c()).f13022d);
            eVar.draw(g1.c.a(pVarY));
        }
    }

    @Override // x1.u
    public final void h(long j) {
        float fZ;
        this.f1106w = true;
        t2.c cVar = x1.k.r(this).f24817w;
        this.f1105v = kc.f.V(j);
        float f10 = this.f1101r;
        if (Float.isNaN(f10)) {
            long j7 = this.f1105v;
            float f11 = j0.c.f13023a;
            long jE = io.sentry.config.a.E(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
            fZ = ((float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat))) / 2.0f;
            if (this.f1100q) {
                fZ += cVar.z(j0.c.f13023a);
            }
        } else {
            fZ = cVar.z(f10);
        }
        this.f1104u = fZ;
        z zVar = this.f1107x;
        Object[] objArr = zVar.f23134a;
        int i10 = zVar.f23135b;
        for (int i11 = 0; i11 < i10; i11++) {
            c0((a0.m) objArr[i11]);
        }
        zVar.c();
    }
}
