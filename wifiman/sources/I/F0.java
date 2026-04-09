package I;

import L0.C3181k;
import R0.C3459l;
import R0.InterfaceC3456i;
import android.graphics.PointF;
import androidx.compose.ui.platform.w1;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6533i;

/* loaded from: classes.dex */
public abstract class F0 {

    public static final class a implements InterfaceC3456i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3456i[] f8013a;

        a(InterfaceC3456i[] interfaceC3456iArr) {
            this.f8013a = interfaceC3456iArr;
        }

        @Override // R0.InterfaceC3456i
        public void a(C3459l c3459l) {
            for (InterfaceC3456i interfaceC3456i : this.f8013a) {
                interfaceC3456i.a(c3459l);
            }
        }
    }

    private static final boolean A(int i10) {
        int type = Character.getType(i10);
        return type == 14 || type == 13 || i10 == 10;
    }

    private static final boolean B(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    private static final boolean C(int i10) {
        return Character.isWhitespace(i10) || i10 == 160;
    }

    private static final boolean D(int i10) {
        return C(i10) && !A(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long E(CharSequence charSequence, int i10) {
        int iCharCount = i10;
        while (iCharCount > 0) {
            int iC = AbstractC2946n.c(charSequence, iCharCount);
            if (!C(iC)) {
                break;
            }
            iCharCount -= Character.charCount(iC);
        }
        while (i10 < charSequence.length()) {
            int iB = AbstractC2946n.b(charSequence, i10);
            if (!C(iB)) {
                break;
            }
            i10 += AbstractC2946n.a(iB);
        }
        return L0.T.b(iCharCount, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long F(PointF pointF) {
        return AbstractC6532h.a(pointF.x, pointF.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10, CharSequence charSequence) {
        int iN = L0.S.n(j10);
        int i10 = L0.S.i(j10);
        int iCodePointBefore = iN > 0 ? Character.codePointBefore(charSequence, iN) : 10;
        int iCodePointAt = i10 < charSequence.length() ? Character.codePointAt(charSequence, i10) : 10;
        if (D(iCodePointBefore) && (C(iCodePointAt) || B(iCodePointAt))) {
            do {
                iN -= Character.charCount(iCodePointBefore);
                if (iN == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iN);
            } while (D(iCodePointBefore));
            return L0.T.b(iN, i10);
        }
        if (!D(iCodePointAt)) {
            return j10;
        }
        if (!C(iCodePointBefore) && !B(iCodePointBefore)) {
            return j10;
        }
        do {
            i10 += Character.charCount(iCodePointAt);
            if (i10 == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, i10);
        } while (D(iCodePointAt));
        return L0.T.b(iN, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3456i n(InterfaceC3456i... interfaceC3456iArr) {
        return new a(interfaceC3456iArr);
    }

    private static final long o(long j10, long j11) {
        return L0.T.b(Math.min(L0.S.n(j10), L0.S.n(j10)), Math.max(L0.S.i(j11), L0.S.i(j11)));
    }

    private static final int p(C3181k c3181k, long j10, w1 w1Var) {
        float fH = w1Var != null ? w1Var.h() : 0.0f;
        int iP = c3181k.p(C6531g.n(j10));
        if (C6531g.n(j10) < c3181k.t(iP) - fH || C6531g.n(j10) > c3181k.l(iP) + fH || C6531g.m(j10) < (-fH) || C6531g.m(j10) > c3181k.A() + fH) {
            return -1;
        }
        return iP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(F.E e10, long j10, w1 w1Var) {
        L0.M mF;
        C3181k c3181kW;
        F.j0 j0VarJ = e10.j();
        if (j0VarJ == null || (mF = j0VarJ.f()) == null || (c3181kW = mF.w()) == null) {
            return -1;
        }
        return s(c3181kW, j10, e10.i(), w1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(l1 l1Var, long j10, w1 w1Var) {
        C3181k c3181kW;
        L0.M mF = l1Var.f();
        if (mF == null || (c3181kW = mF.w()) == null) {
            return -1;
        }
        return s(c3181kW, j10, l1Var.j(), w1Var);
    }

    private static final int s(C3181k c3181k, long j10, C0.r rVar, w1 w1Var) {
        long jR;
        int iP;
        if (rVar == null || (iP = p(c3181k, (jR = rVar.r(j10)), w1Var)) == -1) {
            return -1;
        }
        return c3181k.u(C6531g.g(jR, 0.0f, (c3181k.t(iP) + c3181k.l(iP)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long t(L0.M m10, long j10, long j11, C0.r rVar, w1 w1Var) {
        if (m10 == null || rVar == null) {
            return L0.S.f11103b.a();
        }
        long jR = rVar.r(j10);
        long jR2 = rVar.r(j11);
        int iP = p(m10.w(), jR, w1Var);
        int iP2 = p(m10.w(), jR2, w1Var);
        if (iP != -1) {
            if (iP2 != -1) {
                iP = Math.min(iP, iP2);
            }
            iP2 = iP;
        } else if (iP2 == -1) {
            return L0.S.f11103b.a();
        }
        float fV = (m10.v(iP2) + m10.m(iP2)) / 2;
        return m10.w().z(new C6533i(Math.min(C6531g.m(jR), C6531g.m(jR2)), fV - 0.1f, Math.max(C6531g.m(jR), C6531g.m(jR2)), fV + 0.1f), L0.F.f11064a.a(), L0.J.f11067a.g());
    }

    private static final long u(C3181k c3181k, C6533i c6533i, C0.r rVar, int i10, L0.J j10) {
        return (c3181k == null || rVar == null) ? L0.S.f11103b.a() : c3181k.z(c6533i.x(rVar.r(C6531g.f52335b.c())), i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(F.E e10, C6533i c6533i, int i10, L0.J j10) {
        L0.M mF;
        F.j0 j0VarJ = e10.j();
        return u((j0VarJ == null || (mF = j0VarJ.f()) == null) ? null : mF.w(), c6533i, e10.i(), i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(l1 l1Var, C6533i c6533i, int i10, L0.J j10) {
        L0.M mF = l1Var.f();
        return u(mF != null ? mF.w() : null, c6533i, l1Var.j(), i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long x(F.E e10, C6533i c6533i, C6533i c6533i2, int i10, L0.J j10) {
        long jV = v(e10, c6533i, i10, j10);
        if (L0.S.h(jV)) {
            return L0.S.f11103b.a();
        }
        long jV2 = v(e10, c6533i2, i10, j10);
        return L0.S.h(jV2) ? L0.S.f11103b.a() : o(jV, jV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long y(l1 l1Var, C6533i c6533i, C6533i c6533i2, int i10, L0.J j10) {
        long jW = w(l1Var, c6533i, i10, j10);
        if (L0.S.h(jW)) {
            return L0.S.f11103b.a();
        }
        long jW2 = w(l1Var, c6533i2, i10, j10);
        return L0.S.h(jW2) ? L0.S.f11103b.a() : o(jW, jW2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(L0.M m10, int i10) {
        int iQ = m10.q(i10);
        return (i10 == m10.u(iQ) || i10 == L0.M.p(m10, iQ, false, 2, null)) ? m10.y(i10) != m10.c(i10) : m10.c(i10) != m10.c(i10 - 1);
    }
}
