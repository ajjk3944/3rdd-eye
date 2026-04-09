package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final J f29184a = new J();

    private J() {
    }

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        view.setViewTranslationCallback(G.a(F.f29146a));
    }
}
