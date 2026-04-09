package tg;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bl.v;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.liuzh.deviceinfo.R;
import e4.m0;
import e4.v0;
import g0.a0;
import g0.f0;
import g0.g0;
import g0.j0;
import g0.r;
import i0.w;
import i2.x;
import j2.a1;
import j2.h0;
import j2.z0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import nm.b0;
import nm.n0;
import r0.c0;
import r0.s0;
import r0.w0;
import r0.x0;
import sh.e0;
import u0.d0;
import u0.i1;
import u0.m1;
import u0.o2;
import u0.p;
import u0.q;
import u0.u0;
import u0.z;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o extends hg.b {
    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        nk.k.e(layoutInflater, "inflater");
        return new z0(W());
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        nk.k.e(view, "view");
        ((z0) view).setContent(new c1.h(-1042331147, true, new h(this, 0)));
    }

    @Override // hg.b
    public final void j0(oc.f fVar) {
        fVar.setCanceledOnTouchOutside(false);
    }

    @Override // hg.b
    public final void k0(View view, BottomSheetBehavior bottomSheetBehavior) throws Resources.NotFoundException {
        int iMin = Math.min((int) (r0.heightPixels * 0.9f), (int) (view.getResources().getDisplayMetrics().density * 820.0f));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = iMin;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
        f4.b bVar = new f4.b(16);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(view, bVar);
        bottomSheetBehavior.G(true);
        bottomSheetBehavior.I(iMin);
        bottomSheetBehavior.K = true;
        bottomSheetBehavior.J = true;
        bottomSheetBehavior.J(3);
    }

    public final void l0(final boolean z3, final mk.a aVar, final mk.a aVar2, p pVar, final int i4) {
        int i10;
        mk.a aVar3;
        p pVar2 = pVar;
        pVar2.X(1243608429);
        if ((i4 & 6) == 0) {
            i10 = (pVar2.g(z3) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            aVar3 = aVar;
            i10 |= pVar2.h(aVar3) ? 32 : 16;
        } else {
            aVar3 = aVar;
        }
        if ((i4 & 384) == 0) {
            i10 |= pVar2.h(aVar2) ? 256 : 128;
        }
        if (pVar2.O(i10 & 1, (i10 & 147) != 146)) {
            g0.l lVar = g0.e.f24108a;
            g0.c cVar = new g0.c(pg.c.f31948a.f31941a, new v(7));
            r rVar = j0.f24137a;
            g0 g0VarA = f0.a(cVar, i1.b.f25539k, pVar2, 54);
            long j = pVar2.T;
            int i11 = (int) (j ^ (j >>> 32));
            i1 i1VarL = pVar2.l();
            i1.n nVarW = com.bumptech.glide.d.w(rVar, pVar2);
            i2.g.R8.getClass();
            x xVar = i2.f.f25653b;
            pVar2.Z();
            if (pVar2.S) {
                pVar2.k(xVar);
            } else {
                pVar2.j0();
            }
            q.x(g0VarA, i2.f.f25656e, pVar2);
            q.x(i1VarL, i2.f.f25655d, pVar2);
            q.p(pVar2, Integer.valueOf(i11), i2.f.f25657f);
            q.t(pVar2, i2.f.g);
            q.x(nVarW, i2.f.f25654c, pVar2);
            boolean z10 = !z3;
            c0.c(aVar3, d.h.G(), z10, null, null, null, null, b.f34562c, pVar2, ((i10 >> 3) & 14) | 805306368, PglCryptUtils.BASE64_FAILED);
            c0.a(aVar2, d.h.G(), z10, null, null, null, null, null, b.f34563d, pVar, ((i10 >> 6) & 14) | 805306368, PglCryptUtils.BASE64_FAILED);
            pVar2 = pVar;
            pVar2.p(true);
        } else {
            pVar2.R();
        }
        m1 m1VarR = pVar2.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new mk.e() { // from class: tg.k
                @Override // mk.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    this.f34585a.l0(z3, aVar, aVar2, (p) obj, q.z(i4 | 1));
                    return u.f37649a;
                }
            };
        }
    }

    public final void m0(int i4, p pVar) {
        p pVar2;
        o oVar = this;
        pVar.X(933645299);
        int i10 = (pVar.h(oVar) ? 4 : 2) | i4;
        int i11 = 0;
        if (pVar.O(i10 & 1, (i10 & 3) != 2)) {
            Object objL = pVar.L();
            Object obj = u0.l.f34851a;
            Object obj2 = objL;
            if (objL == obj) {
                g1.q qVar = new g1.q();
                qVar.addAll(e0.b());
                pVar.g0(qVar);
                obj2 = qVar;
            }
            g1.q qVar2 = (g1.q) obj2;
            Object objL2 = pVar.L();
            Object obj3 = objL2;
            if (objL2 == obj) {
                g1.v vVar = new g1.v();
                List listB = e0.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : listB) {
                    if (((sh.c0) obj4).f33655d) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zj.o.T(arrayList, 10));
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj5 = arrayList.get(i11);
                    i11++;
                    arrayList2.add(((sh.c0) obj5).f33654c);
                }
                vVar.addAll(arrayList2);
                pVar.g0(vVar);
                obj3 = vVar;
            }
            g1.v vVar2 = (g1.v) obj3;
            Object objL3 = pVar.L();
            if (objL3 == obj) {
                objL3 = q.r(Boolean.FALSE);
                pVar.g0(objL3);
            }
            u0 u0Var = (u0) objL3;
            r rVar = j0.f24138b;
            pg.b bVar = pg.c.f31948a;
            float f10 = bVar.f31947h;
            float f11 = bVar.f31941a;
            i1.n nVarF = g0.x.f(rVar, f10);
            g0.l lVar = g0.e.f24108a;
            g0.o oVarA = g0.m.a(pVar);
            long j = pVar.T;
            int i12 = (int) (j ^ (j >>> 32));
            i1 i1VarL = pVar.l();
            i1.n nVarW = com.bumptech.glide.d.w(nVarF, pVar);
            i2.g.R8.getClass();
            mk.a aVar = i2.f.f25653b;
            pVar.Z();
            if (pVar.S) {
                pVar.k(aVar);
            } else {
                pVar.j0();
            }
            q.x(oVarA, i2.f.f25656e, pVar);
            q.x(i1VarL, i2.f.f25655d, pVar);
            q.p(pVar, Integer.valueOf(i12), i2.f.f25657f);
            q.t(pVar, i2.f.g);
            q.x(nVarW, i2.f.f25654c, pVar);
            oVar.n0(i10 & 14, pVar);
            i1.k kVar = i1.k.f25553a;
            g0.x.a(j0.b(kVar, f11), pVar);
            int i13 = (i10 << 9) & 7168;
            oVar.p0(qVar2, vVar2, pVar, 438 | i13);
            g0.x.a(j0.b(kVar, f11), pVar);
            boolean zBooleanValue = ((Boolean) u0Var.getValue()).booleanValue();
            Object objL4 = pVar.L();
            if (objL4 == obj) {
                objL4 = new c0.p(8, qVar2, vVar2);
                pVar.g0(objL4);
            }
            mk.a aVar2 = (mk.a) objL4;
            boolean zH = pVar.h(oVar);
            Object objL5 = pVar.L();
            if (zH || objL5 == obj) {
                Object qVar3 = new c7.q(vVar2, qVar2, this, u0Var, 1);
                pVar.g0(qVar3);
                objL5 = qVar3;
            }
            oVar = this;
            pVar2 = pVar;
            oVar.l0(zBooleanValue, aVar2, (mk.a) objL5, pVar2, i13 | 48);
            pVar2.p(true);
        } else {
            pVar2 = pVar;
            pVar2.R();
        }
        m1 m1VarR = pVar2.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new h(oVar, i4, 2);
        }
    }

    public final void n0(int i4, p pVar) {
        pVar.X(-101373806);
        int i10 = i4 & 1;
        if (pVar.O(i10, i10 != 0)) {
            String strG = ii.a.G(R.string.tab_manager, pVar);
            o2 o2Var = x0.f32709a;
            s0.b(strG, null, pg.c.a(pVar).f31933a, 0L, null, 0L, 0L, 0, false, 1, 0, ((w0) pVar.j(o2Var)).g, pVar, 0, 24576, 114682);
            s0.b(ii.a.G(R.string.longpress_and_drag_to_sort, pVar), null, pg.c.a(pVar).f31935c, 0L, null, 0L, 0L, 0, false, 1, 0, ((w0) pVar.j(o2Var)).f32691i, pVar, 0, 24576, 114682);
        } else {
            pVar.R();
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new h(this, i4, 3);
        }
    }

    public final void o0(final sh.c0 c0Var, final boolean z3, final Set set, final i1.n nVar, final i1.n nVar2, p pVar, final int i4) {
        int i10;
        pVar.X(-528573584);
        if ((i4 & 6) == 0) {
            i10 = (pVar.h(c0Var) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 384) == 0) {
            i10 |= pVar.h(set) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i10 |= pVar.f(nVar) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((i4 & 24576) == 0) {
            i10 |= pVar.f(nVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        }
        if (pVar.O(i10 & 1, (i10 & 9347) != 9346)) {
            final View view = (View) pVar.j(h0.f27174f);
            c0.b(j0.b(nVar2.b(j0.f24137a), pg.c.f31948a.f31946f * 1.2f), null, null, null, c1.n.c(-1642204098, new mk.f() { // from class: tg.i
                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:74:0x022e
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                    */
                /* JADX WARN: Removed duplicated region for block: B:137:0x03fb  */
                /* JADX WARN: Removed duplicated region for block: B:142:0x040d  */
                /* JADX WARN: Removed duplicated region for block: B:143:0x0410  */
                /* JADX WARN: Removed duplicated region for block: B:146:0x0422  */
                /* JADX WARN: Removed duplicated region for block: B:153:0x0432  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x047d  */
                /* JADX WARN: Removed duplicated region for block: B:157:0x0482  */
                /* JADX WARN: Removed duplicated region for block: B:161:0x049a  */
                /* JADX WARN: Removed duplicated region for block: B:163:0x049e  */
                /* JADX WARN: Removed duplicated region for block: B:172:0x04c6  */
                /* JADX WARN: Removed duplicated region for block: B:178:0x04e0  */
                /* JADX WARN: Removed duplicated region for block: B:180:0x04e4  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x01da  */
                @Override // mk.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object a(java.lang.Object r73, java.lang.Object r74, java.lang.Object r75) {
                    /*
                        Method dump skipped, instructions count: 2582
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: tg.i.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, pVar), pVar, 196608);
        } else {
            pVar.R();
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new mk.e() { // from class: tg.j
                @Override // mk.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    this.f34579a.o0(c0Var, z3, set, nVar, nVar2, (p) obj, q.z(i4 | 1));
                    return u.f37649a;
                }
            };
        }
    }

    public final void p0(List list, Set set, p pVar, int i4) {
        int i10;
        b0 b0Var;
        boolean z3;
        pVar.X(-393765575);
        if ((i4 & 6) == 0) {
            i10 = (pVar.f(g0.p.f24166a) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= pVar.h(list) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= pVar.h(set) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i10 |= pVar.h(this) ? 2048 : Segment.SHARE_MINIMUM;
        }
        int i11 = 0;
        if (pVar.O(i10 & 1, (i10 & 1171) != 1170)) {
            i0.u uVarA = w.a(pVar);
            boolean zH = pVar.h(list);
            Object objL = pVar.L();
            Object obj = u0.l.f34851a;
            Object obj2 = objL;
            if (zH || objL == obj) {
                Object nVar = new n(list, null);
                pVar.g0(nVar);
                obj2 = nVar;
            }
            mk.g gVar = (mk.g) obj2;
            nk.k.e(uVarA, "lazyListState");
            nk.k.e(gVar, "onMove");
            pVar.W(-645045624);
            float f10 = 0;
            Object a0Var = new a0(f10, f10, f10, f10);
            float f11 = nm.p.f30112a;
            pVar.W(1347434050);
            boolean zF = pVar.f(uVarA);
            Object objL2 = pVar.L();
            Object obj3 = objL2;
            if (zF || objL2 == obj) {
                Object a0Var2 = new nm.a0(uVarA, i11);
                pVar.g0(a0Var2);
                obj3 = a0Var2;
            }
            mk.a aVar = (mk.a) obj3;
            pVar.p(false);
            nk.k.e(aVar, "pixelAmountProvider");
            pVar.W(996643712);
            Object objL3 = pVar.L();
            if (objL3 == obj) {
                Object zVar = new z(q.j(pVar));
                pVar.g0(zVar);
                objL3 = zVar;
            }
            xk.v vVar = ((z) objL3).f35025a;
            u0 u0VarV = q.v(aVar, pVar);
            u0 u0VarV2 = q.v(100L, pVar);
            pVar.W(1852585201);
            boolean zE = pVar.e(100L) | pVar.f(uVarA) | pVar.f(vVar);
            Object objL4 = pVar.L();
            Object obj4 = objL4;
            if (zE || objL4 == obj) {
                Object n0Var = new n0(uVarA, vVar, new c2.c(16, u0VarV, u0VarV2));
                pVar.g0(n0Var);
                obj4 = n0Var;
            }
            n0 n0Var2 = (n0) obj4;
            pVar.p(false);
            pVar.p(false);
            d3.c cVar = (d3.c) pVar.j(a1.f27074h);
            float fI = cVar.I(f11);
            Object objL5 = pVar.L();
            if (objL5 == obj) {
                Object zVar2 = new z(q.j(pVar));
                pVar.g0(zVar2);
                objL5 = zVar2;
            }
            xk.v vVar2 = ((z) objL5).f35025a;
            u0 u0VarV3 = q.v(gVar, pVar);
            d3.l lVar = (d3.l) pVar.j(a1.f27079n);
            nm.a aVar2 = new nm.a(cVar.I(f10), cVar.I(f10), cVar.I(f10), cVar.I(f10));
            pVar.W(1347465600);
            boolean zF2 = pVar.f(uVarA);
            Object objL6 = pVar.L();
            Object obj5 = objL6;
            if (zF2 || objL6 == obj) {
                Object a0Var3 = new nm.a0(uVarA, 1);
                pVar.g0(a0Var3);
                obj5 = a0Var3;
            }
            pVar.p(false);
            d0 d0VarL = q.l((mk.a) obj5);
            Object obj6 = (d0.a1) d0VarL.getValue();
            pVar.W(1347468268);
            boolean zF3 = pVar.f(obj6) | pVar.f(a0Var) | pVar.c(f11) | pVar.f(vVar2) | pVar.f(uVarA) | pVar.f(n0Var2);
            Object objL7 = pVar.L();
            if (zF3 || objL7 == obj) {
                int iOrdinal = ((d0.a1) d0VarL.getValue()).ordinal();
                if (iOrdinal == 0) {
                    b0Var = b0.f30002b;
                } else {
                    if (iOrdinal != 1) {
                        throw new ac.m();
                    }
                    b0Var = b0.f30003c;
                }
                b0 b0Var2 = b0Var;
                nk.k.e(n0Var2, "scroller");
                nk.k.e(lVar, "layoutDirection");
                z3 = false;
                objL7 = new nm.e0(new nm.d0((int) (false ? 1 : 0), (Object) uVarA), vVar2, u0VarV3, fI, aVar2, n0Var2, lVar, b0Var2);
                pVar.g0(objL7);
            } else {
                z3 = false;
            }
            Object obj7 = (nm.e0) objL7;
            pVar.p(z3);
            pVar.p(z3);
            if (1.0f <= 0.0d) {
                h0.a.a("invalid weight; must be greater than zero");
            }
            g0.u uVar = new g0.u(1.0f, true);
            Object obj8 = (View) pVar.j(h0.f27174f);
            boolean zF4 = pVar.f(uVarA) | pVar.h(obj8);
            Object objL8 = pVar.L();
            Object obj9 = objL8;
            if (zF4 || objL8 == obj) {
                Object bVar = new b7.b(21, uVarA, obj8);
                pVar.g0(bVar);
                obj9 = bVar;
            }
            i1.n nVarB = uVar.b(new i1.h(new c2.z((mk.c) obj9))).b(j0.f24137a);
            g0.l lVar2 = g0.e.f24108a;
            g0.c cVar2 = new g0.c(pg.c.f31948a.f31941a, new v(7));
            boolean zH2 = pVar.h(list) | pVar.f(obj7) | pVar.h(this) | pVar.h(set);
            Object objL9 = pVar.L();
            if (zH2 || objL9 == obj) {
                Object aVar3 = new a0.a(list, obj7, this, set, 4);
                pVar.g0(aVar3);
                objL9 = aVar3;
            }
            cm.g.a(nVarB, uVarA, null, cVar2, null, null, false, null, (mk.c) objL9, pVar, 24576);
        } else {
            pVar.R();
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new c1.e(i4, 4, this, list, set);
        }
    }
}
