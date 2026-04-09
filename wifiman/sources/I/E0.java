package I;

import L0.C3174d;
import R0.C3448a;
import R0.C3454g;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.ui.platform.w1;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.text.InterfaceC6518l;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public static final E0 f7990a = new E0();

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f7991a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f7992b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.L l10, kotlin.jvm.internal.L l11) {
            super(1);
            this.f7991a = l10;
            this.f7992b = l11;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC6518l interfaceC6518l) {
            kotlin.jvm.internal.L l10 = this.f7991a;
            if (l10.f51687a == -1) {
                l10.f51687a = interfaceC6518l.d().i();
            }
            this.f7992b.f51687a = interfaceC6518l.d().j() + 1;
            return "";
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f7993a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f7994b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.L l10, kotlin.jvm.internal.L l11) {
            super(1);
            this.f7993a = l10;
            this.f7994b = l11;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC6518l interfaceC6518l) {
            kotlin.jvm.internal.L l10 = this.f7993a;
            if (l10.f51687a == -1) {
                l10.f51687a = interfaceC6518l.d().i();
            }
            this.f7994b.f51687a = interfaceC6518l.d().j() + 1;
            return "";
        }
    }

    private E0() {
    }

    private final void A(o1 o1Var, DeleteGesture deleteGesture, l1 l1Var) {
        e(o1Var, F0.w(l1Var, m0.b1.f(deleteGesture.getDeletionArea()), L(deleteGesture.getGranularity()), L0.J.f11067a.h()), H.n.f7567b.a());
    }

    private final void B(F.E e10, DeleteRangeGesture deleteRangeGesture, M.G g10) {
        if (g10 != null) {
            g10.X(F0.x(e10, m0.b1.f(deleteRangeGesture.getDeletionStartArea()), m0.b1.f(deleteRangeGesture.getDeletionEndArea()), L(deleteRangeGesture.getGranularity()), L0.J.f11067a.h()));
        }
    }

    private final void C(o1 o1Var, DeleteRangeGesture deleteRangeGesture, l1 l1Var) {
        e(o1Var, F0.y(l1Var, m0.b1.f(deleteRangeGesture.getDeletionStartArea()), m0.b1.f(deleteRangeGesture.getDeletionEndArea()), L(deleteRangeGesture.getGranularity()), L0.J.f11067a.h()), H.n.f7567b.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(o1 o1Var) {
        H.l lVar = o1Var.f8379a;
        H.b bVar = o1Var.f8380b;
        K.c cVar = K.c.MergeIfPossible;
        lVar.g().f().e();
        lVar.g().b();
        lVar.e(bVar, true, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(M.G g10) {
        if (g10 != null) {
            g10.n();
        }
    }

    private final void H(F.E e10, SelectGesture selectGesture, M.G g10) {
        if (g10 != null) {
            g10.g0(F0.v(e10, m0.b1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), L0.J.f11067a.h()));
        }
    }

    private final void I(o1 o1Var, SelectGesture selectGesture, l1 l1Var) {
        e(o1Var, F0.w(l1Var, m0.b1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), L0.J.f11067a.h()), H.n.f7567b.b());
    }

    private final void J(F.E e10, SelectRangeGesture selectRangeGesture, M.G g10) {
        if (g10 != null) {
            g10.g0(F0.x(e10, m0.b1.f(selectRangeGesture.getSelectionStartArea()), m0.b1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), L0.J.f11067a.h()));
        }
    }

    private final void K(o1 o1Var, SelectRangeGesture selectRangeGesture, l1 l1Var) {
        e(o1Var, F0.y(l1Var, m0.b1.f(selectRangeGesture.getSelectionStartArea()), m0.b1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), L0.J.f11067a.h()), H.n.f7567b.b());
    }

    private final int L(int i10) {
        return i10 != 1 ? i10 != 2 ? L0.F.f11064a.a() : L0.F.f11064a.a() : L0.F.f11064a.b();
    }

    private final int c(o1 o1Var, HandwritingGesture handwritingGesture) {
        H.l lVar = o1Var.f8379a;
        H.b bVar = o1Var.f8380b;
        K.c cVar = K.c.MergeIfPossible;
        lVar.g().f().e();
        lVar.g().b();
        lVar.e(bVar, true, cVar);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        o1.u(o1Var, fallbackText, true, null, 4, null);
        return 5;
    }

    private final int d(HandwritingGesture handwritingGesture, InterfaceC6835l interfaceC6835l) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        interfaceC6835l.invoke(new C3448a(fallbackText, 1));
        return 5;
    }

    private final void e(o1 o1Var, long j10, int i10) {
        if (!L0.S.h(j10)) {
            o1Var.m(i10, j10);
            return;
        }
        H.l lVar = o1Var.f8379a;
        H.b bVar = o1Var.f8380b;
        K.c cVar = K.c.MergeIfPossible;
        lVar.g().f().e();
        lVar.g().b();
        lVar.e(bVar, true, cVar);
    }

    private final int f(F.E e10, DeleteGesture deleteGesture, C3174d c3174d, InterfaceC6835l interfaceC6835l) {
        int iL = L(deleteGesture.getGranularity());
        long jV = F0.v(e10, m0.b1.f(deleteGesture.getDeletionArea()), iL, L0.J.f11067a.h());
        if (L0.S.h(jV)) {
            return f7990a.d(AbstractC2970z0.a(deleteGesture), interfaceC6835l);
        }
        k(jV, c3174d, L0.F.d(iL, L0.F.f11064a.b()), interfaceC6835l);
        return 1;
    }

    private final int g(o1 o1Var, DeleteGesture deleteGesture, l1 l1Var) {
        int iL = L(deleteGesture.getGranularity());
        long jW = F0.w(l1Var, m0.b1.f(deleteGesture.getDeletionArea()), iL, L0.J.f11067a.h());
        if (L0.S.h(jW)) {
            return f7990a.c(o1Var, AbstractC2970z0.a(deleteGesture));
        }
        j(o1Var, jW, L0.F.d(iL, L0.F.f11064a.b()));
        return 1;
    }

    private final int h(F.E e10, DeleteRangeGesture deleteRangeGesture, C3174d c3174d, InterfaceC6835l interfaceC6835l) {
        int iL = L(deleteRangeGesture.getGranularity());
        long jX = F0.x(e10, m0.b1.f(deleteRangeGesture.getDeletionStartArea()), m0.b1.f(deleteRangeGesture.getDeletionEndArea()), iL, L0.J.f11067a.h());
        if (L0.S.h(jX)) {
            return f7990a.d(AbstractC2970z0.a(deleteRangeGesture), interfaceC6835l);
        }
        k(jX, c3174d, L0.F.d(iL, L0.F.f11064a.b()), interfaceC6835l);
        return 1;
    }

    private final int i(o1 o1Var, DeleteRangeGesture deleteRangeGesture, l1 l1Var) {
        int iL = L(deleteRangeGesture.getGranularity());
        long jY = F0.y(l1Var, m0.b1.f(deleteRangeGesture.getDeletionStartArea()), m0.b1.f(deleteRangeGesture.getDeletionEndArea()), iL, L0.J.f11067a.h());
        if (L0.S.h(jY)) {
            return f7990a.c(o1Var, AbstractC2970z0.a(deleteRangeGesture));
        }
        j(o1Var, jY, L0.F.d(iL, L0.F.f11064a.b()));
        return 1;
    }

    private final void j(o1 o1Var, long j10, boolean z10) {
        if (z10) {
            j10 = F0.m(j10, o1Var.l());
        }
        o1.w(o1Var, "", j10, null, false, 12, null);
    }

    private final void k(long j10, C3174d c3174d, boolean z10, InterfaceC6835l interfaceC6835l) {
        if (z10) {
            j10 = F0.m(j10, c3174d);
        }
        interfaceC6835l.invoke(F0.n(new R0.P(L0.S.i(j10), L0.S.i(j10)), new C3454g(L0.S.j(j10), 0)));
    }

    private final int n(F.E e10, InsertGesture insertGesture, w1 w1Var, InterfaceC6835l interfaceC6835l) {
        F.j0 j0VarJ;
        L0.M mF;
        if (w1Var == null) {
            return d(AbstractC2970z0.a(insertGesture), interfaceC6835l);
        }
        int iQ = F0.q(e10, F0.F(insertGesture.getInsertionPoint()), w1Var);
        if (iQ == -1 || !((j0VarJ = e10.j()) == null || (mF = j0VarJ.f()) == null || !F0.z(mF, iQ))) {
            return d(AbstractC2970z0.a(insertGesture), interfaceC6835l);
        }
        p(iQ, insertGesture.getTextToInsert(), interfaceC6835l);
        return 1;
    }

    private final int o(o1 o1Var, InsertGesture insertGesture, l1 l1Var, w1 w1Var) {
        int iR = F0.r(l1Var, F0.F(insertGesture.getInsertionPoint()), w1Var);
        if (iR == -1) {
            return c(o1Var, AbstractC2970z0.a(insertGesture));
        }
        o1.w(o1Var, insertGesture.getTextToInsert(), L0.T.a(iR), null, false, 12, null);
        return 1;
    }

    private final void p(int i10, String str, InterfaceC6835l interfaceC6835l) {
        interfaceC6835l.invoke(F0.n(new R0.P(i10, i10), new C3448a(str, 1)));
    }

    private final int q(F.E e10, JoinOrSplitGesture joinOrSplitGesture, C3174d c3174d, w1 w1Var, InterfaceC6835l interfaceC6835l) {
        F.j0 j0VarJ;
        L0.M mF;
        if (w1Var == null) {
            return d(AbstractC2970z0.a(joinOrSplitGesture), interfaceC6835l);
        }
        int iQ = F0.q(e10, F0.F(joinOrSplitGesture.getJoinOrSplitPoint()), w1Var);
        if (iQ == -1 || !((j0VarJ = e10.j()) == null || (mF = j0VarJ.f()) == null || !F0.z(mF, iQ))) {
            return d(AbstractC2970z0.a(joinOrSplitGesture), interfaceC6835l);
        }
        long jE = F0.E(c3174d, iQ);
        if (L0.S.h(jE)) {
            p(L0.S.n(jE), " ", interfaceC6835l);
        } else {
            k(jE, c3174d, false, interfaceC6835l);
        }
        return 1;
    }

    private final int r(o1 o1Var, JoinOrSplitGesture joinOrSplitGesture, l1 l1Var, w1 w1Var) {
        L0.M mF;
        if (o1Var.i() != o1Var.k()) {
            return 3;
        }
        int iR = F0.r(l1Var, F0.F(joinOrSplitGesture.getJoinOrSplitPoint()), w1Var);
        if (iR == -1 || ((mF = l1Var.f()) != null && F0.z(mF, iR))) {
            return c(o1Var, AbstractC2970z0.a(joinOrSplitGesture));
        }
        long jE = F0.E(o1Var.l(), iR);
        if (L0.S.h(jE)) {
            o1.w(o1Var, " ", jE, null, false, 12, null);
        } else {
            j(o1Var, jE, false);
        }
        return 1;
    }

    private final int s(F.E e10, RemoveSpaceGesture removeSpaceGesture, C3174d c3174d, w1 w1Var, InterfaceC6835l interfaceC6835l) {
        F.j0 j0VarJ = e10.j();
        long jT = F0.t(j0VarJ != null ? j0VarJ.f() : null, F0.F(removeSpaceGesture.getStartPoint()), F0.F(removeSpaceGesture.getEndPoint()), e10.i(), w1Var);
        if (L0.S.h(jT)) {
            return f7990a.d(AbstractC2970z0.a(removeSpaceGesture), interfaceC6835l);
        }
        kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
        l10.f51687a = -1;
        kotlin.jvm.internal.L l11 = new kotlin.jvm.internal.L();
        l11.f51687a = -1;
        String strO = new kotlin.text.p("\\s+").o(L0.T.e(c3174d, jT), new b(l10, l11));
        if (l10.f51687a == -1 || l11.f51687a == -1) {
            return d(AbstractC2970z0.a(removeSpaceGesture), interfaceC6835l);
        }
        int iN = L0.S.n(jT) + l10.f51687a;
        int iN2 = L0.S.n(jT) + l11.f51687a;
        String strSubstring = strO.substring(l10.f51687a, strO.length() - (L0.S.j(jT) - l11.f51687a));
        AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        interfaceC6835l.invoke(F0.n(new R0.P(iN, iN2), new C3448a(strSubstring, 1)));
        return 1;
    }

    private final int t(o1 o1Var, RemoveSpaceGesture removeSpaceGesture, l1 l1Var, w1 w1Var) {
        long jT = F0.t(l1Var.f(), F0.F(removeSpaceGesture.getStartPoint()), F0.F(removeSpaceGesture.getEndPoint()), l1Var.j(), w1Var);
        if (L0.S.h(jT)) {
            return f7990a.c(o1Var, AbstractC2970z0.a(removeSpaceGesture));
        }
        kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
        l10.f51687a = -1;
        kotlin.jvm.internal.L l11 = new kotlin.jvm.internal.L();
        l11.f51687a = -1;
        String strO = new kotlin.text.p("\\s+").o(L0.T.e(o1Var.l(), jT), new a(l10, l11));
        if (l10.f51687a == -1 || l11.f51687a == -1) {
            return c(o1Var, AbstractC2970z0.a(removeSpaceGesture));
        }
        long jB = L0.T.b(L0.S.n(jT) + l10.f51687a, L0.S.n(jT) + l11.f51687a);
        String strSubstring = strO.substring(l10.f51687a, strO.length() - (L0.S.j(jT) - l11.f51687a));
        AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        o1.w(o1Var, strSubstring, jB, null, false, 12, null);
        return 1;
    }

    private final int u(F.E e10, SelectGesture selectGesture, M.G g10, InterfaceC6835l interfaceC6835l) {
        long jV = F0.v(e10, m0.b1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), L0.J.f11067a.h());
        if (L0.S.h(jV)) {
            return f7990a.d(AbstractC2970z0.a(selectGesture), interfaceC6835l);
        }
        y(jV, g10, interfaceC6835l);
        return 1;
    }

    private final int v(o1 o1Var, SelectGesture selectGesture, l1 l1Var) {
        long jW = F0.w(l1Var, m0.b1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), L0.J.f11067a.h());
        if (L0.S.h(jW)) {
            return f7990a.c(o1Var, AbstractC2970z0.a(selectGesture));
        }
        o1Var.y(jW);
        return 1;
    }

    private final int w(F.E e10, SelectRangeGesture selectRangeGesture, M.G g10, InterfaceC6835l interfaceC6835l) {
        long jX = F0.x(e10, m0.b1.f(selectRangeGesture.getSelectionStartArea()), m0.b1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), L0.J.f11067a.h());
        if (L0.S.h(jX)) {
            return f7990a.d(AbstractC2970z0.a(selectRangeGesture), interfaceC6835l);
        }
        y(jX, g10, interfaceC6835l);
        return 1;
    }

    private final int x(o1 o1Var, SelectRangeGesture selectRangeGesture, l1 l1Var) {
        long jY = F0.y(l1Var, m0.b1.f(selectRangeGesture.getSelectionStartArea()), m0.b1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), L0.J.f11067a.h());
        if (L0.S.h(jY)) {
            return f7990a.c(o1Var, AbstractC2970z0.a(selectRangeGesture));
        }
        o1Var.y(jY);
        return 1;
    }

    private final void y(long j10, M.G g10, InterfaceC6835l interfaceC6835l) {
        interfaceC6835l.invoke(new R0.P(L0.S.n(j10), L0.S.i(j10)));
        if (g10 != null) {
            g10.v(true);
        }
    }

    private final void z(F.E e10, DeleteGesture deleteGesture, M.G g10) {
        if (g10 != null) {
            g10.X(F0.v(e10, m0.b1.f(deleteGesture.getDeletionArea()), L(deleteGesture.getGranularity()), L0.J.f11067a.h()));
        }
    }

    public final boolean D(F.E e10, PreviewableHandwritingGesture previewableHandwritingGesture, final M.G g10, CancellationSignal cancellationSignal) {
        L0.M mF;
        L0.L l10;
        C3174d c3174dW = e10.w();
        if (c3174dW == null) {
            return false;
        }
        F.j0 j0VarJ = e10.j();
        if (!AbstractC6492s.d(c3174dW, (j0VarJ == null || (mF = j0VarJ.f()) == null || (l10 = mF.l()) == null) ? null : l10.j())) {
            return false;
        }
        if (A0.a(previewableHandwritingGesture)) {
            H(e10, B0.a(previewableHandwritingGesture), g10);
        } else if (Y.a(previewableHandwritingGesture)) {
            z(e10, Z.a(previewableHandwritingGesture), g10);
        } else if (AbstractC2921a0.a(previewableHandwritingGesture)) {
            J(e10, AbstractC2923b0.a(previewableHandwritingGesture), g10);
        } else {
            if (!AbstractC2925c0.a(previewableHandwritingGesture)) {
                return false;
            }
            B(e10, AbstractC2927d0.a(previewableHandwritingGesture), g10);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: I.C0
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                E0.G(g10);
            }
        });
        return true;
    }

    public final boolean E(final o1 o1Var, PreviewableHandwritingGesture previewableHandwritingGesture, l1 l1Var, CancellationSignal cancellationSignal) {
        if (A0.a(previewableHandwritingGesture)) {
            I(o1Var, B0.a(previewableHandwritingGesture), l1Var);
        } else if (Y.a(previewableHandwritingGesture)) {
            A(o1Var, Z.a(previewableHandwritingGesture), l1Var);
        } else if (AbstractC2921a0.a(previewableHandwritingGesture)) {
            K(o1Var, AbstractC2923b0.a(previewableHandwritingGesture), l1Var);
        } else {
            if (!AbstractC2925c0.a(previewableHandwritingGesture)) {
                return false;
            }
            C(o1Var, AbstractC2927d0.a(previewableHandwritingGesture), l1Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: I.D0
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                E0.F(o1Var);
            }
        });
        return true;
    }

    public final int l(F.E e10, HandwritingGesture handwritingGesture, M.G g10, w1 w1Var, InterfaceC6835l interfaceC6835l) {
        L0.M mF;
        L0.L l10;
        C3174d c3174dW = e10.w();
        if (c3174dW == null) {
            return 3;
        }
        F.j0 j0VarJ = e10.j();
        if (!AbstractC6492s.d(c3174dW, (j0VarJ == null || (mF = j0VarJ.f()) == null || (l10 = mF.l()) == null) ? null : l10.j())) {
            return 3;
        }
        if (A0.a(handwritingGesture)) {
            return u(e10, B0.a(handwritingGesture), g10, interfaceC6835l);
        }
        if (Y.a(handwritingGesture)) {
            return f(e10, Z.a(handwritingGesture), c3174dW, interfaceC6835l);
        }
        if (AbstractC2921a0.a(handwritingGesture)) {
            return w(e10, AbstractC2923b0.a(handwritingGesture), g10, interfaceC6835l);
        }
        if (AbstractC2925c0.a(handwritingGesture)) {
            return h(e10, AbstractC2927d0.a(handwritingGesture), c3174dW, interfaceC6835l);
        }
        if (AbstractC2943l0.a(handwritingGesture)) {
            return q(e10, AbstractC2945m0.a(handwritingGesture), c3174dW, w1Var, interfaceC6835l);
        }
        if (AbstractC2933g0.a(handwritingGesture)) {
            return n(e10, AbstractC2935h0.a(handwritingGesture), w1Var, interfaceC6835l);
        }
        if (AbstractC2939j0.a(handwritingGesture)) {
            return s(e10, AbstractC2941k0.a(handwritingGesture), c3174dW, w1Var, interfaceC6835l);
        }
        return 2;
    }

    public final int m(o1 o1Var, HandwritingGesture handwritingGesture, l1 l1Var, w1 w1Var) {
        if (A0.a(handwritingGesture)) {
            return v(o1Var, B0.a(handwritingGesture), l1Var);
        }
        if (Y.a(handwritingGesture)) {
            return g(o1Var, Z.a(handwritingGesture), l1Var);
        }
        if (AbstractC2921a0.a(handwritingGesture)) {
            return x(o1Var, AbstractC2923b0.a(handwritingGesture), l1Var);
        }
        if (AbstractC2925c0.a(handwritingGesture)) {
            return i(o1Var, AbstractC2927d0.a(handwritingGesture), l1Var);
        }
        if (AbstractC2943l0.a(handwritingGesture)) {
            return r(o1Var, AbstractC2945m0.a(handwritingGesture), l1Var, w1Var);
        }
        if (AbstractC2933g0.a(handwritingGesture)) {
            return o(o1Var, AbstractC2935h0.a(handwritingGesture), l1Var, w1Var);
        }
        if (AbstractC2939j0.a(handwritingGesture)) {
            return t(o1Var, AbstractC2941k0.a(handwritingGesture), l1Var, w1Var);
        }
        return 2;
    }
}
