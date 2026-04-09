package J;

import F.N;
import I.G0;
import I.X0;
import I.o1;
import I.p1;
import L0.S;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class m {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9585a;

        static {
            int[] iArr = new int[G0.values().length];
            try {
                iArr[G0.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G0.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G0.Replacement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[G0.Insertion.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9585a = iArr;
        }
    }

    public static final int a(String str, int i10, boolean z10, o1 o1Var) {
        int iA = z10 ? N.a(str, i10) : N.b(str, i10);
        if (iA == -1) {
            return i10;
        }
        long jN = o1Var.n(iA);
        long jP = o1Var.p(jN);
        int i11 = a.f9585a[((S.h(jN) && S.h(jP)) ? G0.Untransformed : (S.h(jN) || S.h(jP)) ? (!S.h(jN) || S.h(jP)) ? G0.Deletion : G0.Insertion : G0.Replacement).ordinal()];
        if (i11 == 1 || i11 == 2) {
            return iA;
        }
        if (i11 == 3) {
            return z10 ? S.i(jP) : S.n(jP);
        }
        if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (z10) {
            if (iA == S.n(jP)) {
                o1Var.A(new X0(p1.Start));
                return iA;
            }
            o1Var.A(new X0(p1.End));
            return i10;
        }
        if (iA == S.i(jP)) {
            o1Var.A(new X0(p1.End));
            return iA;
        }
        o1Var.A(new X0(p1.Start));
        return i10;
    }
}
