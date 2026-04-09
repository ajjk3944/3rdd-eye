package I;

import android.view.inputmethod.CursorAnchorInfo;
import l0.C6533i;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final D f7988a = new D();

    private D() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, L0.M m10, C6533i c6533i) {
        int iR;
        int iR2;
        if (!c6533i.u() && (iR = m10.r(c6533i.n())) <= (iR2 = m10.r(c6533i.e()))) {
            while (true) {
                builder.addVisibleLineBounds(m10.s(iR), m10.v(iR), m10.t(iR), m10.m(iR));
                if (iR == iR2) {
                    break;
                }
                iR++;
            }
        }
        return builder;
    }
}
