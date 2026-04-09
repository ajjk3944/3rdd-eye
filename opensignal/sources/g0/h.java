package g0;

import android.os.Trace;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.lifecycle.p0;
import c0.o;
import com.google.android.gms.internal.measurement.e5;
import e2.p;
import g1.r;
import g1.s;
import h2.c0;
import h2.f0;
import h2.g0;
import h2.j0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mq.w;
import v1.q;
import x1.h0;
import x1.l0;
import x1.m;
import x1.m0;
import x1.t1;
import x1.v;
import z0.l;

/* loaded from: classes.dex */
public final class h extends l implements v, m, t1 {
    public f A;
    public g B;

    /* renamed from: p, reason: collision with root package name */
    public h2.f f9169p;

    /* renamed from: q, reason: collision with root package name */
    public j0 f9170q;

    /* renamed from: r, reason: collision with root package name */
    public k2.g f9171r;

    /* renamed from: s, reason: collision with root package name */
    public ar.k f9172s;

    /* renamed from: t, reason: collision with root package name */
    public int f9173t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9174u;

    /* renamed from: v, reason: collision with root package name */
    public int f9175v;

    /* renamed from: w, reason: collision with root package name */
    public int f9176w;

    /* renamed from: x, reason: collision with root package name */
    public s f9177x;

    /* renamed from: y, reason: collision with root package name */
    public Map f9178y;

    /* renamed from: z, reason: collision with root package name */
    public d f9179z;

    @Override // x1.v
    public final l0 K(m0 m0Var, q qVar, long j) {
        d dVarC0;
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            g gVar = this.B;
            if (gVar == null || !gVar.f9167c || (dVarC0 = gVar.f9168d) == null) {
                dVarC0 = c0();
                dVarC0.b(m0Var);
            } else {
                dVarC0.b(m0Var);
            }
            boolean zA = dVarC0.a(j, m0Var.getLayoutDirection());
            g0 g0Var = dVarC0.f9146n;
            if (g0Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + dVarC0);
            }
            long j7 = g0Var.f9826c;
            g0Var.f9825b.f9847a.d();
            if (zA) {
                x1.k.q(this, 2).C0();
                ar.k kVar = this.f9172s;
                if (kVar != null) {
                    kVar.a(g0Var);
                }
                Map linkedHashMap = this.f9178y;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(v1.c.f23758a, Integer.valueOf(Math.round(g0Var.f9827d)));
                linkedHashMap.put(v1.c.f23759b, Integer.valueOf(Math.round(g0Var.f9828e)));
                this.f9178y = linkedHashMap;
            }
            int i10 = (int) (j7 >> 32);
            int i11 = (int) (4294967295L & j7);
            v1.v vVarS = qVar.s(dr.a.n(i10, i10, i11, i11));
            Map map = this.f9178y;
            br.l.b(map);
            l0 l0VarH0 = m0Var.h0(i10, i11, map, null, new o(vVarS, 2));
            Trace.endSection();
            return l0VarH0;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [g0.f] */
    @Override // x1.t1
    public final void O(SemanticsConfiguration semanticsConfiguration) {
        f fVar = this.A;
        f fVar2 = fVar;
        if (fVar == null) {
            final int i10 = 0;
            ?? r02 = new ar.k(this) { // from class: g0.f

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ h f9164d;

                {
                    this.f9164d = this;
                }

                @Override // ar.k
                public final Object a(Object obj) {
                    g0 g0Var;
                    boolean z10;
                    switch (i10) {
                        case 0:
                            List list = (List) obj;
                            h hVar = this.f9164d;
                            g0 g0Var2 = hVar.c0().f9146n;
                            if (g0Var2 != null) {
                                f0 f0Var = g0Var2.f9824a;
                                h2.f fVar3 = f0Var.f9814a;
                                j0 j0Var = hVar.f9170q;
                                s sVar = hVar.f9177x;
                                g0Var = new g0(new f0(fVar3, j0.d(j0Var, sVar != null ? sVar.a() : r.f9269g, 0L, null, null, 0L, 0, 0L, 16777214), f0Var.f9816c, f0Var.f9817d, f0Var.f9818e, f0Var.f9819f, f0Var.f9820g, f0Var.f9821h, f0Var.f9822i, f0Var.j), g0Var2.f9825b, g0Var2.f9826c);
                                list.add(g0Var);
                            } else {
                                g0Var = null;
                            }
                            return Boolean.valueOf(g0Var != null);
                        case 1:
                            h2.f fVar4 = (h2.f) obj;
                            h hVar2 = this.f9164d;
                            g gVar = hVar2.B;
                            w wVar = w.f16945a;
                            if (gVar == null) {
                                g gVar2 = new g(hVar2.f9169p, fVar4);
                                d dVar = new d(fVar4, hVar2.f9170q, hVar2.f9171r, hVar2.f9173t, hVar2.f9174u, hVar2.f9175v, hVar2.f9176w, wVar);
                                dVar.b(hVar2.c0().j);
                                gVar2.f9168d = dVar;
                                hVar2.B = gVar2;
                            } else if (!br.l.a(fVar4, gVar.f9166b)) {
                                gVar.f9166b = fVar4;
                                d dVar2 = gVar.f9168d;
                                if (dVar2 != null) {
                                    j0 j0Var2 = hVar2.f9170q;
                                    k2.g gVar3 = hVar2.f9171r;
                                    int i11 = hVar2.f9173t;
                                    boolean z11 = hVar2.f9174u;
                                    int i12 = hVar2.f9175v;
                                    int i13 = hVar2.f9176w;
                                    dVar2.f9135a = fVar4;
                                    boolean zC = j0Var2.c(dVar2.k);
                                    dVar2.k = j0Var2;
                                    if (!zC) {
                                        dVar2.f9147o <<= 2;
                                        dVar2.f9144l = null;
                                        dVar2.f9146n = null;
                                    }
                                    dVar2.f9136b = gVar3;
                                    dVar2.f9137c = i11;
                                    dVar2.f9138d = z11;
                                    dVar2.f9139e = i12;
                                    dVar2.f9140f = i13;
                                    dVar2.f9141g = wVar;
                                    dVar2.f9147o = (dVar2.f9147o << 2) | 2;
                                    dVar2.f9144l = null;
                                    dVar2.f9146n = null;
                                }
                            }
                            x1.k.l(hVar2);
                            x1.k.k(hVar2);
                            x1.k.j(hVar2);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            h hVar3 = this.f9164d;
                            g gVar4 = hVar3.B;
                            if (gVar4 == null) {
                                z10 = false;
                            } else {
                                if (gVar4 != null) {
                                    gVar4.f9167c = zBooleanValue;
                                }
                                x1.k.l(hVar3);
                                x1.k.k(hVar3);
                                x1.k.j(hVar3);
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                    }
                }
            };
            this.A = r02;
            fVar2 = r02;
        }
        h2.f fVar3 = this.f9169p;
        ir.v[] vVarArr = e2.r.f7759a;
        semanticsConfiguration.d(p.f7754x, e5.H(fVar3));
        g gVar = this.B;
        if (gVar != null) {
            h2.f fVar4 = gVar.f9166b;
            e2.s sVar = p.f7755y;
            ir.v[] vVarArr2 = e2.r.f7759a;
            ir.v vVar = vVarArr2[15];
            sVar.a(semanticsConfiguration, fVar4);
            boolean z10 = gVar.f9167c;
            e2.s sVar2 = p.f7756z;
            ir.v vVar2 = vVarArr2[16];
            sVar2.a(semanticsConfiguration, Boolean.valueOf(z10));
        }
        final int i11 = 1;
        semanticsConfiguration.d(e2.g.j, new e2.a(null, new ar.k(this) { // from class: g0.f

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ h f9164d;

            {
                this.f9164d = this;
            }

            @Override // ar.k
            public final Object a(Object obj) {
                g0 g0Var;
                boolean z102;
                switch (i11) {
                    case 0:
                        List list = (List) obj;
                        h hVar = this.f9164d;
                        g0 g0Var2 = hVar.c0().f9146n;
                        if (g0Var2 != null) {
                            f0 f0Var = g0Var2.f9824a;
                            h2.f fVar32 = f0Var.f9814a;
                            j0 j0Var = hVar.f9170q;
                            s sVar3 = hVar.f9177x;
                            g0Var = new g0(new f0(fVar32, j0.d(j0Var, sVar3 != null ? sVar3.a() : r.f9269g, 0L, null, null, 0L, 0, 0L, 16777214), f0Var.f9816c, f0Var.f9817d, f0Var.f9818e, f0Var.f9819f, f0Var.f9820g, f0Var.f9821h, f0Var.f9822i, f0Var.j), g0Var2.f9825b, g0Var2.f9826c);
                            list.add(g0Var);
                        } else {
                            g0Var = null;
                        }
                        return Boolean.valueOf(g0Var != null);
                    case 1:
                        h2.f fVar42 = (h2.f) obj;
                        h hVar2 = this.f9164d;
                        g gVar2 = hVar2.B;
                        w wVar = w.f16945a;
                        if (gVar2 == null) {
                            g gVar22 = new g(hVar2.f9169p, fVar42);
                            d dVar = new d(fVar42, hVar2.f9170q, hVar2.f9171r, hVar2.f9173t, hVar2.f9174u, hVar2.f9175v, hVar2.f9176w, wVar);
                            dVar.b(hVar2.c0().j);
                            gVar22.f9168d = dVar;
                            hVar2.B = gVar22;
                        } else if (!br.l.a(fVar42, gVar2.f9166b)) {
                            gVar2.f9166b = fVar42;
                            d dVar2 = gVar2.f9168d;
                            if (dVar2 != null) {
                                j0 j0Var2 = hVar2.f9170q;
                                k2.g gVar3 = hVar2.f9171r;
                                int i112 = hVar2.f9173t;
                                boolean z11 = hVar2.f9174u;
                                int i12 = hVar2.f9175v;
                                int i13 = hVar2.f9176w;
                                dVar2.f9135a = fVar42;
                                boolean zC = j0Var2.c(dVar2.k);
                                dVar2.k = j0Var2;
                                if (!zC) {
                                    dVar2.f9147o <<= 2;
                                    dVar2.f9144l = null;
                                    dVar2.f9146n = null;
                                }
                                dVar2.f9136b = gVar3;
                                dVar2.f9137c = i112;
                                dVar2.f9138d = z11;
                                dVar2.f9139e = i12;
                                dVar2.f9140f = i13;
                                dVar2.f9141g = wVar;
                                dVar2.f9147o = (dVar2.f9147o << 2) | 2;
                                dVar2.f9144l = null;
                                dVar2.f9146n = null;
                            }
                        }
                        x1.k.l(hVar2);
                        x1.k.k(hVar2);
                        x1.k.j(hVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar3 = this.f9164d;
                        g gVar4 = hVar3.B;
                        if (gVar4 == null) {
                            z102 = false;
                        } else {
                            if (gVar4 != null) {
                                gVar4.f9167c = zBooleanValue;
                            }
                            x1.k.l(hVar3);
                            x1.k.k(hVar3);
                            x1.k.j(hVar3);
                            z102 = true;
                        }
                        return Boolean.valueOf(z102);
                }
            }
        }));
        final int i12 = 2;
        semanticsConfiguration.d(e2.g.k, new e2.a(null, new ar.k(this) { // from class: g0.f

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ h f9164d;

            {
                this.f9164d = this;
            }

            @Override // ar.k
            public final Object a(Object obj) {
                g0 g0Var;
                boolean z102;
                switch (i12) {
                    case 0:
                        List list = (List) obj;
                        h hVar = this.f9164d;
                        g0 g0Var2 = hVar.c0().f9146n;
                        if (g0Var2 != null) {
                            f0 f0Var = g0Var2.f9824a;
                            h2.f fVar32 = f0Var.f9814a;
                            j0 j0Var = hVar.f9170q;
                            s sVar3 = hVar.f9177x;
                            g0Var = new g0(new f0(fVar32, j0.d(j0Var, sVar3 != null ? sVar3.a() : r.f9269g, 0L, null, null, 0L, 0, 0L, 16777214), f0Var.f9816c, f0Var.f9817d, f0Var.f9818e, f0Var.f9819f, f0Var.f9820g, f0Var.f9821h, f0Var.f9822i, f0Var.j), g0Var2.f9825b, g0Var2.f9826c);
                            list.add(g0Var);
                        } else {
                            g0Var = null;
                        }
                        return Boolean.valueOf(g0Var != null);
                    case 1:
                        h2.f fVar42 = (h2.f) obj;
                        h hVar2 = this.f9164d;
                        g gVar2 = hVar2.B;
                        w wVar = w.f16945a;
                        if (gVar2 == null) {
                            g gVar22 = new g(hVar2.f9169p, fVar42);
                            d dVar = new d(fVar42, hVar2.f9170q, hVar2.f9171r, hVar2.f9173t, hVar2.f9174u, hVar2.f9175v, hVar2.f9176w, wVar);
                            dVar.b(hVar2.c0().j);
                            gVar22.f9168d = dVar;
                            hVar2.B = gVar22;
                        } else if (!br.l.a(fVar42, gVar2.f9166b)) {
                            gVar2.f9166b = fVar42;
                            d dVar2 = gVar2.f9168d;
                            if (dVar2 != null) {
                                j0 j0Var2 = hVar2.f9170q;
                                k2.g gVar3 = hVar2.f9171r;
                                int i112 = hVar2.f9173t;
                                boolean z11 = hVar2.f9174u;
                                int i122 = hVar2.f9175v;
                                int i13 = hVar2.f9176w;
                                dVar2.f9135a = fVar42;
                                boolean zC = j0Var2.c(dVar2.k);
                                dVar2.k = j0Var2;
                                if (!zC) {
                                    dVar2.f9147o <<= 2;
                                    dVar2.f9144l = null;
                                    dVar2.f9146n = null;
                                }
                                dVar2.f9136b = gVar3;
                                dVar2.f9137c = i112;
                                dVar2.f9138d = z11;
                                dVar2.f9139e = i122;
                                dVar2.f9140f = i13;
                                dVar2.f9141g = wVar;
                                dVar2.f9147o = (dVar2.f9147o << 2) | 2;
                                dVar2.f9144l = null;
                                dVar2.f9146n = null;
                            }
                        }
                        x1.k.l(hVar2);
                        x1.k.k(hVar2);
                        x1.k.j(hVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar3 = this.f9164d;
                        g gVar4 = hVar3.B;
                        if (gVar4 == null) {
                            z102 = false;
                        } else {
                            if (gVar4 != null) {
                                gVar4.f9167c = zBooleanValue;
                            }
                            x1.k.l(hVar3);
                            x1.k.k(hVar3);
                            x1.k.j(hVar3);
                            z102 = true;
                        }
                        return Boolean.valueOf(z102);
                }
            }
        }));
        semanticsConfiguration.d(e2.g.f7695l, new e2.a(null, new p0(5, this)));
        semanticsConfiguration.d(e2.g.f7686a, new e2.a(null, fVar2));
    }

    @Override // z0.l
    public final boolean R() {
        return false;
    }

    public final d c0() {
        if (this.f9179z == null) {
            this.f9179z = new d(this.f9169p, this.f9170q, this.f9171r, this.f9173t, this.f9174u, this.f9175v, this.f9176w, null);
        }
        d dVar = this.f9179z;
        br.l.b(dVar);
        return dVar;
    }

    @Override // x1.m
    public final void d(h0 h0Var) {
        d dVarC0;
        if (!this.f26506o) {
            return;
        }
        g1.p pVarY = h0Var.f24844b.f11141c.y();
        g gVar = this.B;
        if (gVar == null || !gVar.f9167c || (dVarC0 = gVar.f9168d) == null) {
            dVarC0 = c0();
            dVarC0.b(h0Var);
        } else {
            dVarC0.b(h0Var);
        }
        g0 g0Var = dVarC0.f9146n;
        if (g0Var == null) {
            throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + dVarC0);
        }
        h2.m mVar = g0Var.f9825b;
        long j = g0Var.f9826c;
        boolean z10 = (((float) ((int) (j >> 32))) < mVar.f9850d || mVar.f9849c || ((float) ((int) (j & 4294967295L))) < mVar.f9851e) && this.f9173t != 3;
        if (z10) {
            f1.c cVarA = ir.f0.a(0L, (Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L));
            pVarY.g();
            g1.p.o(pVarY, cVarA);
        }
        try {
            c0 c0Var = this.f9170q.f9840a;
            r2.l lVar = c0Var.f9797m;
            if (lVar == null) {
                lVar = r2.l.f21208b;
            }
            r2.l lVar2 = lVar;
            g1.h0 h0Var2 = c0Var.f9798n;
            if (h0Var2 == null) {
                h0Var2 = g1.h0.f9234d;
            }
            g1.h0 h0Var3 = h0Var2;
            i1.c cVar = c0Var.f9799o;
            if (cVar == null) {
                cVar = i1.f.f11146b;
            }
            i1.c cVar2 = cVar;
            g1.f0 f0VarC = c0Var.f9787a.c();
            if (f0VarC != null) {
                h2.m.a(mVar, pVarY, f0VarC, this.f9170q.f9840a.f9787a.a(), h0Var3, lVar2, cVar2);
            } else {
                s sVar = this.f9177x;
                long jA = sVar != null ? sVar.a() : r.f9269g;
                if (jA == 16) {
                    jA = this.f9170q.b() != 16 ? this.f9170q.b() : r.f9264b;
                }
                pVarY.g();
                ArrayList arrayList = mVar.f9854h;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    h2.p pVar = (h2.p) arrayList.get(i10);
                    pVar.f9859a.e(pVarY, jA, h0Var3, lVar2, cVar2);
                    pVarY.m(0.0f, pVar.f9859a.b());
                }
                pVarY.n();
            }
            if (z10) {
                pVarY.n();
            }
            g gVar2 = this.B;
            if (gVar2 == null || !gVar2.f9167c) {
                h2.f fVar = this.f9169p;
                int length = fVar.f9811d.length();
                List list = fVar.f9810a;
                if (list != null) {
                    int size2 = list.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        h2.d dVar = (h2.d) list.get(i11);
                        if ((dVar.f9800a instanceof h2.l) && h2.g.a(0, length, dVar.f9801b, dVar.f9802c)) {
                            h0Var.a();
                            return;
                        }
                    }
                }
            }
        } finally {
        }
    }
}
