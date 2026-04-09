package c;

import android.window.BackEvent;

/* compiled from: BackEventCompat.kt */
/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2003a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2003a f18264a = new C2003a();

    public final BackEvent a(float f10, float f11, float f12, int i) {
        return new BackEvent(f10, f11, f12, i);
    }

    public final float b(BackEvent backEvent) {
        kotlin.jvm.internal.l.f(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        kotlin.jvm.internal.l.f(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        kotlin.jvm.internal.l.f(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        kotlin.jvm.internal.l.f(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
