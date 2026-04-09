package R0;

import I.AbstractC2963w;
import android.view.inputmethod.CursorAnchorInfo;
import l0.C6533i;
import m0.b1;

/* renamed from: R0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3449b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3449b f19454a = new C3449b();

    private C3449b() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, C6533i c6533i) {
        return builder.setEditorBoundsInfo(AbstractC2963w.a().setEditorBounds(b1.c(c6533i)).setHandwritingBounds(b1.c(c6533i)).build());
    }
}
