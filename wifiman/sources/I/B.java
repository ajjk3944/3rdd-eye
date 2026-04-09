package I;

import android.view.inputmethod.CursorAnchorInfo;
import l0.C6533i;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public static final B f7986a = new B();

    private B() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, C6533i c6533i) {
        return builder.setEditorBoundsInfo(AbstractC2963w.a().setEditorBounds(m0.b1.c(c6533i)).setHandwritingBounds(m0.b1.c(c6533i)).build());
    }
}
