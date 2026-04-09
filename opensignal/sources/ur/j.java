package ur;

import ht.x0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class j extends u implements rr.k {

    /* renamed from: a0, reason: collision with root package name */
    public final boolean f23645a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(rr.f fVar, rr.k kVar, sr.h hVar, boolean z10, rr.c cVar, rr.o0 o0Var) {
        super(qs.i.f21042e, cVar, fVar, kVar, o0Var, hVar);
        if (fVar == null) {
            S0(0);
            throw null;
        }
        if (hVar == null) {
            S0(1);
            throw null;
        }
        if (cVar == null) {
            S0(2);
            throw null;
        }
        if (o0Var == null) {
            S0(3);
            throw null;
        }
        this.f23645a0 = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void S0(int r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ur.j.S0(int):void");
    }

    @Override // rr.k
    public final boolean B() {
        return this.f23645a0;
    }

    @Override // rr.k
    public final rr.f C() {
        rr.f fVarO = o();
        if (fVarO != null) {
            return fVarO;
        }
        S0(18);
        throw null;
    }

    @Override // ur.u
    /* renamed from: G1, reason: merged with bridge method [inline-methods] */
    public j x1(qs.g gVar, rr.c cVar, rr.l lVar, rr.u uVar, rr.o0 o0Var, sr.h hVar) {
        if (lVar == null) {
            S0(23);
            throw null;
        }
        if (cVar == null) {
            S0(24);
            throw null;
        }
        if (hVar == null) {
            S0(25);
            throw null;
        }
        rr.c cVar2 = rr.c.DECLARATION;
        if (cVar == cVar2 || cVar == rr.c.SYNTHESIZED) {
            return new j((rr.f) lVar, this, hVar, this.f23645a0, cVar2, o0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + lVar + "\nkind: " + cVar);
    }

    @Override // ur.o, rr.l
    /* renamed from: H1, reason: merged with bridge method [inline-methods] */
    public final rr.f o() {
        rr.f fVar = (rr.f) super.o();
        if (fVar != null) {
            return fVar;
        }
        S0(17);
        throw null;
    }

    @Override // ur.o
    /* renamed from: I1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final j u1() {
        j jVar = (j) super.u1();
        if (jVar != null) {
            return jVar;
        }
        S0(19);
        throw null;
    }

    public final void J1(List list, as.p pVar) {
        if (list == null) {
            S0(13);
            throw null;
        }
        if (pVar != null) {
            K1(list, pVar, o().s());
        } else {
            S0(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K1(java.util.List r12, as.p r13, java.util.List r14) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L61
            if (r13 == 0) goto L5b
            if (r14 == 0) goto L55
            rr.f r1 = r11.o()
            boolean r2 = r1.m()
            if (r2 == 0) goto L21
            rr.l r1 = r1.o()
            boolean r2 = r1 instanceof rr.f
            if (r2 == 0) goto L21
            rr.f r1 = (rr.f) r1
            ur.v r1 = r1.R0()
            r4 = r1
            goto L22
        L21:
            r4 = r0
        L22:
            rr.f r1 = r11.o()
            java.util.List r2 = r1.K0()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3e
            java.util.List r1 = r1.K0()
            if (r1 == 0) goto L38
        L36:
            r5 = r1
            goto L43
        L38:
            r12 = 15
            S0(r12)
            throw r0
        L3e:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            if (r1 == 0) goto L4f
            goto L36
        L43:
            r8 = 0
            rr.z r9 = rr.z.FINAL
            r3 = 0
            r2 = r11
            r7 = r12
            r10 = r13
            r6 = r14
            r2.A1(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L4f:
            r12 = 16
            S0(r12)
            throw r0
        L55:
            r12 = 12
            S0(r12)
            throw r0
        L5b:
            r12 = 11
            S0(r12)
            throw r0
        L61:
            r12 = 10
            S0(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ur.j.K1(java.util.List, as.p, java.util.List):void");
    }

    @Override // ur.u, rr.u, rr.q0
    /* renamed from: L1, reason: merged with bridge method [inline-methods] */
    public final j e(x0 x0Var) {
        if (x0Var != null) {
            return (j) super.e(x0Var);
        }
        S0(20);
        throw null;
    }

    @Override // ur.u, rr.d
    public final rr.d V(rr.f fVar, rr.z zVar, as.p pVar, rr.c cVar) {
        return (j) v1(fVar, zVar, pVar, cVar);
    }

    @Override // ur.u, rr.d, rr.b
    public final Collection p() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        S0(21);
        throw null;
    }

    @Override // ur.u, rr.l
    public final Object w0(rr.n nVar, Object obj) {
        return nVar.J(this, obj);
    }

    @Override // ur.u, rr.d
    public final void y0(Collection collection) {
        if (collection != null) {
            return;
        }
        S0(22);
        throw null;
    }
}
