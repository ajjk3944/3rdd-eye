package k0;

import c0.a0;
import lq.b0;
import n0.h2;
import n0.i1;
import n0.k1;
import n0.w;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final h2 f13912a;

    static {
        kc.f.F(new a0(12));
        f13912a = new h2(new a0(13));
    }

    public static final void a(final a aVar, final k kVar, final q qVar, final u uVar, final v0.d dVar, n0.p pVar, final int i10) {
        int i11;
        pVar.T(904511636);
        if ((i10 & 6) == 0) {
            i11 = (pVar.e(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= pVar.e(kVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= pVar.e(qVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= pVar.e(uVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= pVar.g(dVar) ? 16384 : 8192;
        }
        if (pVar.K(i11 & 1, (i11 & 9363) != 9362)) {
            pVar.P();
            if ((i10 & 1) != 0 && !pVar.v()) {
                pVar.N();
            }
            pVar.p();
            androidx.compose.material3.c cVarA = n.a();
            long j = aVar.f13867a;
            boolean zD = pVar.d(j);
            Object objI = pVar.I();
            if (zD || objI == n0.j.f17190a) {
                objI = new h0.c(j, g1.r.b(j, 0.4f));
                pVar.b0(objI);
            }
            w.b(new i1[]{b.f13891a.a(aVar), f13912a.a(kVar), androidx.compose.foundation.b.f1071a.a(cVarA), r.f13935a.a(qVar), h0.d.f9675a.a((h0.c) objI), v.f13967a.a(uVar)}, v0.i.d(-1750539308, new i(uVar, 0, dVar), pVar), pVar, 56);
        } else {
            pVar.N();
        }
        k1 k1VarQ = pVar.q();
        if (k1VarQ != null) {
            k1VarQ.f17207d = new ar.n() { // from class: k0.h
                @Override // ar.n
                public final Object w(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j.a(aVar, kVar, qVar, uVar, dVar, (n0.p) obj, w.m(i10 | 1));
                    return b0.f15562a;
                }
            };
        }
    }

    public static final void b(a aVar, q qVar, u uVar, v0.d dVar, n0.p pVar, int i10) {
        a aVar2;
        q qVar2;
        u uVar2;
        a aVar3;
        pVar.T(-449719819);
        int i11 = i10 | 146;
        if (pVar.K(i11 & 1, (i11 & 1171) != 1170)) {
            pVar.P();
            if ((i10 & 1) == 0 || pVar.v()) {
                aVar3 = (a) pVar.i(b.f13891a);
                q qVar3 = (q) pVar.i(r.f13935a);
                uVar2 = (u) pVar.i(v.f13967a);
                qVar2 = qVar3;
            } else {
                pVar.N();
                aVar3 = aVar;
                qVar2 = qVar;
                uVar2 = uVar;
            }
            pVar.p();
            a(aVar3, (k) pVar.i(f13912a), qVar2, uVar2, dVar, pVar, 24576);
            aVar2 = aVar3;
        } else {
            pVar.N();
            aVar2 = aVar;
            qVar2 = qVar;
            uVar2 = uVar;
        }
        k1 k1VarQ = pVar.q();
        if (k1VarQ != null) {
            k1VarQ.f17207d = new g(aVar2, qVar2, uVar2, dVar, i10, 0);
        }
    }
}
