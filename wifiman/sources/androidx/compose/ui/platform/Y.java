package androidx.compose.ui.platform;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
final class Y {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f29319a = new Y();

    private Y() {
    }

    public final float a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public final float b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }
}
