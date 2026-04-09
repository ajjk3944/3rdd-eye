package x1;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.AppendedSemanticsElement;

/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final u.y f24843a;

    static {
        u.y yVar = u.e0.f23063a;
        f24843a = new u.y();
    }

    public static final void a(z0.l lVar, int i10, int i11) {
        if (!(lVar instanceof j)) {
            b(lVar, i10 & lVar.f26497d, i11);
            return;
        }
        j jVar = (j) lVar;
        int i12 = jVar.f24862p;
        b(lVar, i12 & i10, i11);
        int i13 = (~i12) & i10;
        for (z0.l lVar2 = jVar.f24863q; lVar2 != null; lVar2 = lVar2.f26500g) {
            a(lVar2, i13, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(z0.l lVar, int i10, int i11) {
        if (i11 != 0 || lVar.R()) {
            if ((i10 & 2) != 0 && (lVar instanceof v)) {
                k.k((v) lVar);
                if (i11 == 2) {
                    k.q(lVar, 2).J0();
                }
            }
            if ((i10 & 128) != 0 && (lVar instanceof u) && i11 != 2) {
                k.r(lVar).N();
            }
            if ((i10 & 256) != 0 && (lVar instanceof n)) {
                if (i11 == 1) {
                    f0 f0VarR = k.r(lVar);
                    f0VarR.s0(f0VarR.J + 1);
                } else if (i11 == 2) {
                    k.r(lVar).s0(r0.J - 1);
                }
                if (i11 != 2) {
                    f0 f0VarR2 = k.r(lVar);
                    if (f0VarR2.J != 0 && !f0VarR2.s() && !f0VarR2.y() && !f0VarR2.I) {
                        AndroidComposeView androidComposeView = (AndroidComposeView) k.t(f0VarR2);
                        om.f fVar = androidComposeView.f1172m0.f24946e;
                        fVar.getClass();
                        if (f0VarR2.J > 0) {
                            ((p0.e) fVar.f19554d).b(f0VarR2);
                            f0VarR2.I = true;
                        }
                        androidComposeView.B(null);
                    }
                }
            }
            if ((i10 & 4) != 0 && (lVar instanceof m)) {
                k.j((m) lVar);
            }
            if ((i10 & 8) != 0 && (lVar instanceof t1)) {
                k.r(lVar).f24811q = true;
            }
            if ((i10 & 64) != 0 && (lVar instanceof o1)) {
                k.r((o1) lVar).P();
            }
            if ((i10 & 2048) != 0 && (lVar instanceof c)) {
                z0.k kVar = ((c) lVar).f24776p;
                u1.a.b("applyFocusProperties called on wrong node");
                w.g.p(kVar);
                throw null;
            }
            if ((i10 & 4096) == 0 || !(lVar instanceof c)) {
                return;
            }
            c cVar = (c) lVar;
            e1.e eVar = (e1.e) ((a8.f) k.s(cVar).getFocusOwner()).f198d;
            if (eVar.f7644d.a(cVar)) {
                eVar.a();
            }
        }
    }

    public static final void c(z0.l lVar) {
        if (!lVar.f26506o) {
            u1.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(lVar, -1, 0);
    }

    public static final int d(z0.k kVar) {
        int i10 = kVar instanceof d1.a ? 5 : 1;
        if (kVar instanceof AppendedSemanticsElement) {
            i10 |= 8;
        }
        if (kVar instanceof c0.m) {
            i10 |= 32;
        }
        return kVar instanceof y1.u0 ? 524288 | i10 : i10;
    }

    public static final int e(z0.l lVar) {
        int i10 = lVar.f26497d;
        if (i10 != 0) {
            return i10;
        }
        Class<?> cls = lVar.getClass();
        u.y yVar = f24843a;
        int iD = yVar.d(cls);
        if (iD >= 0) {
            return yVar.f23130c[iD];
        }
        int i11 = lVar instanceof v ? 3 : 1;
        if (lVar instanceof m) {
            i11 |= 4;
        }
        if (lVar instanceof t1) {
            i11 |= 8;
        }
        if (lVar instanceof q1) {
            i11 |= 16;
        }
        if (lVar instanceof w1.c) {
            i11 |= 32;
        }
        if (lVar instanceof o1) {
            i11 |= 64;
        }
        if (lVar instanceof u) {
            i11 |= 128;
        }
        if (lVar instanceof n) {
            i11 |= 256;
        }
        if (lVar instanceof e1.p) {
            i11 |= 1024;
        }
        if (lVar instanceof c) {
            i11 |= 2048;
        }
        if (lVar instanceof c) {
            i11 |= 4096;
        }
        if (lVar instanceof q1.c) {
            i11 |= 8192;
        }
        if (lVar instanceof t1.a) {
            i11 |= 16384;
        }
        if (lVar instanceof h) {
            i11 |= 32768;
        }
        if (lVar instanceof y1) {
            i11 |= 262144;
        }
        if (lVar instanceof y1.u0) {
            i11 |= 524288;
        }
        yVar.h(i11, cls);
        return i11;
    }

    public static final int f(z0.l lVar) {
        if (!(lVar instanceof j)) {
            return e(lVar);
        }
        j jVar = (j) lVar;
        int iF = jVar.f24862p;
        for (z0.l lVar2 = jVar.f24863q; lVar2 != null; lVar2 = lVar2.f26500g) {
            iF |= f(lVar2);
        }
        return iF;
    }

    public static final boolean g(int i10) {
        return (i10 & 128) != 0;
    }
}
