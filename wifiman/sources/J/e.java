package J;

import F.EnumC2726p;
import I.l1;
import I.m1;
import I.o1;
import L0.M;
import L0.S;
import M.A;
import Y0.r;
import kotlin.NoWhenBranchMatchedException;
import l0.AbstractC6532h;
import l0.C6531g;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public abstract class e {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9377a;

        static {
            int[] iArr = new int[EnumC2726p.values().length];
            try {
                iArr[EnumC2726p.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2726p.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2726p.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9377a = iArr;
        }
    }

    public static final long a(o1 o1Var, j jVar, l1 l1Var, long j10) {
        int iN;
        long jX = jVar.X();
        if (AbstractC6532h.d(jX) || o1Var.l().length() == 0) {
            return C6531g.f52335b.b();
        }
        long jF = o1Var.l().f();
        EnumC2726p enumC2726pV = jVar.V();
        int i10 = enumC2726pV == null ? -1 : a.f9377a[enumC2726pV.ordinal()];
        if (i10 == -1) {
            return C6531g.f52335b.b();
        }
        if (i10 == 1 || i10 == 2) {
            iN = S.n(jF);
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iN = S.i(jF);
        }
        M mF = l1Var.f();
        if (mF == null) {
            return C6531g.f52335b.b();
        }
        float fM = C6531g.m(jX);
        int iQ = mF.q(iN);
        float fS = mF.s(iQ);
        float fT = mF.t(iQ);
        float fJ = AbstractC7978m.j(fM, Math.min(fS, fT), Math.max(fS, fT));
        if (!r.e(j10, r.f24545b.a()) && Math.abs(fM - fJ) > r.g(j10) / 2) {
            return C6531g.f52335b.b();
        }
        float fV = mF.v(iQ);
        long jA = AbstractC6532h.a(fJ, ((mF.m(iQ) - fV) / 2) + fV);
        C0.r rVarJ = l1Var.j();
        if (rVarJ != null) {
            if (!rVarJ.M()) {
                rVarJ = null;
            }
            if (rVarJ != null) {
                jA = m1.a(jA, A.b(rVarJ));
            }
        }
        return m1.c(l1Var, jA);
    }
}
