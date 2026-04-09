package R0;

import android.view.inputmethod.CursorAnchorInfo;
import l0.C6533i;

/* renamed from: R0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3450c {

    /* renamed from: a, reason: collision with root package name */
    public static final C3450c f19455a = new C3450c();

    private C3450c() {
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
