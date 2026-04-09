package c;

import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4146a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4146a f33523a = new C4146a();

    private C4146a() {
    }

    public final float a(BackEvent backEvent) {
        AbstractC6492s.i(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int b(BackEvent backEvent) {
        AbstractC6492s.i(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float c(BackEvent backEvent) {
        AbstractC6492s.i(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float d(BackEvent backEvent) {
        AbstractC6492s.i(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
