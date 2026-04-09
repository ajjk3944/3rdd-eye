package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class F implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final F f29146a = new F();

    private F() {
    }

    public boolean onClearTranslation(View view) {
        AbstractC6492s.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((r) view).getContentCaptureManager$ui_release().r();
        return true;
    }

    public boolean onHideTranslation(View view) {
        AbstractC6492s.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((r) view).getContentCaptureManager$ui_release().t();
        return true;
    }

    public boolean onShowTranslation(View view) {
        AbstractC6492s.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((r) view).getContentCaptureManager$ui_release().w();
        return true;
    }
}
