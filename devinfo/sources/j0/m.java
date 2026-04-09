package j0;

import android.view.View;
import com.applovin.shadow.okio.Segment;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.liuzh.deviceinfo.R;
import java.util.Arrays;
import me.t1;
import u0.k1;
import u0.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final s[] f26925a = new s[0];

    /* renamed from: b, reason: collision with root package name */
    public static final b4.b f26926b = new b4.b(7);

    public static final void a(final mk.a aVar, final i1.n nVar, final m0 m0Var, final i0.n nVar2, u0.p pVar, final int i4) {
        pVar.X(1055276397);
        int i10 = (pVar.h(aVar) ? 4 : 2) | i4 | (pVar.f(nVar) ? 32 : 16) | (pVar.f(m0Var) ? 256 : 128) | (pVar.f(nVar2) ? 2048 : Segment.SHARE_MINIMUM);
        if (pVar.O(i10 & 1, (i10 & 1171) != 1170)) {
            final u0.u0 u0VarV = u0.q.v(aVar, pVar);
            c(c1.n.c(-933153643, new mk.f() { // from class: j0.c0
                @Override // mk.f
                public final Object a(Object obj, Object obj2, Object obj3) {
                    i1.n nVarB;
                    f1.c cVar = (f1.c) obj;
                    u0.p pVar2 = (u0.p) obj2;
                    ((Integer) obj3).getClass();
                    Object objL = pVar2.L();
                    u0.e eVar = u0.l.f34851a;
                    if (objL == eVar) {
                        objL = new b0(cVar, new i0.k(u0VarV, 1));
                        pVar2.g0(objL);
                    }
                    final b0 b0Var = (b0) objL;
                    Object objL2 = pVar2.L();
                    if (objL2 == eVar) {
                        objL2 = new g2.c1(new yb.i(b0Var));
                        pVar2.g0(objL2);
                    }
                    final g2.c1 c1Var = (g2.c1) objL2;
                    final m0 m0Var2 = m0Var;
                    if (m0Var2 != null) {
                        pVar2.W(1743490539);
                        pVar2.W(887527095);
                        final y0 y0Var = a1.f26861a;
                        if (y0Var != null) {
                            pVar2.W(1345554384);
                            pVar2.p(false);
                        } else {
                            pVar2.W(1345603457);
                            View view = (View) pVar2.j(j2.h0.f27174f);
                            boolean zF = pVar2.f(view);
                            Object objL3 = pVar2.L();
                            if (zF || objL3 == eVar) {
                                Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                                objL3 = tag instanceof y0 ? (y0) tag : null;
                                if (objL3 == null) {
                                    objL3 = new a(view);
                                    view.setTag(R.id.compose_prefetch_scheduler, objL3);
                                }
                                pVar2.g0(objL3);
                            }
                            y0Var = (y0) objL3;
                            pVar2.p(false);
                        }
                        pVar2.p(false);
                        Object[] objArr = {m0Var2, b0Var, c1Var, y0Var};
                        boolean zF2 = pVar2.f(m0Var2) | pVar2.h(b0Var) | pVar2.h(c1Var) | pVar2.h(y0Var);
                        Object objL4 = pVar2.L();
                        if (zF2 || objL4 == eVar) {
                            objL4 = new mk.c() { // from class: j0.e0
                                @Override // mk.c
                                public final Object invoke(Object obj4) {
                                    b5.i0 i0Var = new b5.i0();
                                    i0Var.f1821b = b0Var;
                                    i0Var.f1822c = c1Var;
                                    i0Var.f1823d = y0Var;
                                    i0Var.f1820a = true;
                                    m0 m0Var3 = m0Var2;
                                    m0Var3.f26929c = i0Var;
                                    return new z(1, m0Var3);
                                }
                            };
                            pVar2.g0(objL4);
                        }
                        mk.c cVar2 = (mk.c) objL4;
                        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
                        boolean zF3 = false;
                        for (Object obj4 : objArrCopyOf) {
                            zF3 |= pVar2.f(obj4);
                        }
                        Object objL5 = pVar2.L();
                        if (zF3 || objL5 == eVar) {
                            pVar2.g0(new u0.e0(cVar2));
                        }
                    } else {
                        pVar2.W(1737291469);
                    }
                    pVar2.p(false);
                    int i11 = n0.f26933a;
                    i1.n nVar3 = nVar;
                    if (m0Var2 != null && (nVarB = nVar3.b(new d1(m0Var2))) != null) {
                        nVar3 = nVarB;
                    }
                    boolean zF4 = pVar2.f(b0Var);
                    i0.n nVar4 = nVar2;
                    boolean zF5 = zF4 | pVar2.f(nVar4);
                    Object objL6 = pVar2.L();
                    if (zF5 || objL6 == eVar) {
                        objL6 = new d0.d1(2, b0Var, nVar4);
                        pVar2.g0(objL6);
                    }
                    g2.n0.a(c1Var, nVar3, (mk.e) objL6, pVar2, 8);
                    return yj.u.f37649a;
                }
            }, pVar), pVar, 6);
        } else {
            pVar.R();
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new mk.e(nVar, m0Var, nVar2, i4) { // from class: j0.d0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i1.n f26882b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ m0 f26883c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ i0.n f26884d;

                @Override // mk.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iZ = u0.q.z(1);
                    m.a(this.f26881a, this.f26882b, this.f26883c, this.f26884d, (u0.p) obj, iZ);
                    return yj.u.f37649a;
                }
            };
        }
    }

    public static final void b(final Object obj, final int i4, final j0 j0Var, final c1.h hVar, u0.p pVar, final int i10) {
        int i11;
        pVar.X(872548579);
        if ((i10 & 6) == 0) {
            i11 = (pVar.h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= pVar.d(i4) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= pVar.h(j0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= pVar.h(hVar) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if (pVar.O(i11 & 1, (i11 & 1171) != 1170)) {
            boolean zF = pVar.f(obj) | pVar.f(j0Var);
            Object objL = pVar.L();
            Object obj2 = u0.l.f34851a;
            if (zF || objL == obj2) {
                objL = new h0(obj, j0Var);
                pVar.g0(objL);
            }
            h0 h0Var = (h0) objL;
            h0Var.f26904c = i4;
            u0.d1 d1Var = h0Var.g;
            k1 k1Var = g2.q0.f24400a;
            h0 h0Var2 = (h0) pVar.j(k1Var);
            g1.g gVarF = g1.r.f();
            mk.c cVarE = gVarF != null ? gVarF.e() : null;
            g1.g gVarK = g1.r.k(gVarF);
            try {
                if (h0Var2 != ((h0) d1Var.getValue())) {
                    d1Var.setValue(h0Var2);
                    if (h0Var.f26905d > 0) {
                        h0 h0Var3 = h0Var.f26906e;
                        if (h0Var3 != null) {
                            h0Var3.b();
                        }
                        if (h0Var2 != null) {
                            h0Var2.a();
                        } else {
                            h0Var2 = null;
                        }
                        h0Var.f26906e = h0Var2;
                    }
                }
                g1.r.o(gVarF, gVarK, cVarE);
                boolean zF2 = pVar.f(h0Var);
                Object objL2 = pVar.L();
                if (zF2 || objL2 == obj2) {
                    objL2 = new b7.u(11, h0Var);
                    pVar.g0(objL2);
                }
                u0.q.c(h0Var, (mk.c) objL2, pVar);
                u0.q.a(k1Var.a(h0Var), hVar, pVar, ((i11 >> 6) & AppLovinMediationAdapter.ERROR_CHILD_USER) | 8);
            } catch (Throwable th2) {
                g1.r.o(gVarF, gVarK, cVarE);
                throw th2;
            }
        } else {
            pVar.R();
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new mk.e() { // from class: j0.i0
                @Override // mk.e
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    m.b(obj, i4, j0Var, hVar, (u0.p) obj3, u0.q.z(i10 | 1));
                    return yj.u.f37649a;
                }
            };
        }
    }

    public static final void c(c1.h hVar, u0.p pVar, int i4) {
        pVar.X(-709502251);
        boolean z3 = false;
        if (pVar.O(i4 & 1, (i4 & 3) != 2)) {
            k1 k1Var = f1.i.f23623a;
            Object obj = (f1.g) pVar.j(k1Var);
            pVar.W(1967007413);
            Object[] objArr = new Object[0];
            Object objL = pVar.L();
            Object obj2 = u0.l.f34851a;
            if (objL == obj2) {
                objL = new b6.a(7);
                pVar.g0(objL);
            }
            f1.e eVar = (f1.e) t1.C(objArr, f1.e.f23615e, (mk.a) objL, pVar, 384);
            eVar.f23618c = (f1.g) pVar.j(k1Var);
            pVar.p(false);
            Object[] objArr2 = {obj};
            yb.i iVar = new yb.i(new bl.v(9), z3, new b7.b(18, obj, eVar), 16);
            boolean zH = pVar.h(obj) | pVar.h(eVar);
            Object objL2 = pVar.L();
            if (zH || objL2 == obj2) {
                objL2 = new c0.p(6, obj, eVar);
                pVar.g0(objL2);
            }
            Object obj3 = (v0) t1.C(objArr2, iVar, (mk.a) objL2, pVar, 0);
            u0.q.a(k1Var.a(obj3), c1.n.c(-412824043, new d0.d1(3, hVar, obj3), pVar), pVar, 56);
        } else {
            pVar.R();
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new bl.z(hVar, i4);
        }
    }

    public static final void d(i0.j jVar, Object obj, int i4, Object obj2, u0.p pVar, int i10) {
        pVar.X(1439843069);
        int i11 = (pVar.f(jVar) ? 4 : 2) | i10 | (pVar.f(obj) ? 32 : 16) | (pVar.d(i4) ? 256 : 128) | (pVar.f(obj2) ? 2048 : Segment.SHARE_MINIMUM);
        if (pVar.O(i11 & 1, (i11 & 1171) != 1170)) {
            ((f1.c) obj).e(obj2, c1.n.c(980966366, new i0.i(i4, jVar, obj2), pVar), pVar, 48);
        } else {
            pVar.R();
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new c1.e(jVar, obj, i4, obj2, i10);
        }
    }

    public static final int e(int i4, w0.e eVar) {
        int i10 = eVar.f36399c - 1;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = ((i10 - i11) / 2) + i11;
            Object[] objArr = eVar.f36397a;
            int i13 = ((h) objArr[i12]).f26899a;
            if (i13 != i4) {
                if (i13 < i4) {
                    i11 = i12 + 1;
                    if (i4 < ((h) objArr[i11]).f26899a) {
                    }
                } else {
                    i10 = i12 - 1;
                }
            }
            return i12;
        }
        return i11;
    }

    public static final int f(int i4, i0.j jVar, Object obj) {
        int iE;
        return (obj == null || jVar.c() == 0 || (i4 < jVar.c() && obj.equals(jVar.d(i4))) || (iE = jVar.f25429d.e(obj)) == -1) ? i4 : iE;
    }

    public static final i1.n g(i0.e eVar, jf.c cVar, d0.a1 a1Var) {
        return new l(eVar, cVar, a1Var);
    }

    public static final i1.n h(i1.n nVar, cl.j jVar, i0.d dVar, d0.a1 a1Var, boolean z3) {
        return nVar.b(new p0(jVar, dVar, a1Var, z3));
    }
}
