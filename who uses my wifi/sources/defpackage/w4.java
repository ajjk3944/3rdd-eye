package defpackage;

import android.window.BackEvent;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class w4 {
    public static float a(BackEvent backEvent) {
        i30.m(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public static int b(BackEvent backEvent) {
        i30.m(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public static float c(BackEvent backEvent) {
        i30.m(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public static float d(BackEvent backEvent) {
        i30.m(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
