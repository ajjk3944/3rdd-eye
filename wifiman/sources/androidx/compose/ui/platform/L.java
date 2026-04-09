package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
final class L {

    /* renamed from: a, reason: collision with root package name */
    public static final L f29245a = new L();

    private L() {
    }

    public final void a(View view, int i10, boolean z10) {
        view.setFocusable(i10);
        view.setDefaultFocusHighlightEnabled(z10);
    }
}
