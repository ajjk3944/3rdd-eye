package androidx.compose.ui.platform;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public static final H0 f29159a = new H0();

    private H0() {
    }

    public final boolean a(MotionEvent motionEvent, int i10) {
        float rawX = motionEvent.getRawX(i10);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            float rawY = motionEvent.getRawY(i10);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
