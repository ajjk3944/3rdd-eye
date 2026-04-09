package c;

import android.window.BackEvent;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0376a f5817a = new C0376a();

    public final BackEvent a(float f2, float f5, float f6, int i) {
        return new BackEvent(f2, f5, f6, i);
    }

    public final float b(BackEvent backEvent) {
        q5.i.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        q5.i.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        q5.i.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        q5.i.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
