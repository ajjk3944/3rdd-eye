package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f256a = new a();

    @DoNotInline
    @NotNull
    public final BackEvent a(float f10, float f11, float f12, int i10) {
        return new BackEvent(f10, f11, f12, i10);
    }

    @DoNotInline
    public final float b(@NotNull BackEvent backEvent) {
        kotlin.jvm.internal.p.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    @DoNotInline
    public final int c(@NotNull BackEvent backEvent) {
        kotlin.jvm.internal.p.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    @DoNotInline
    public final float d(@NotNull BackEvent backEvent) {
        kotlin.jvm.internal.p.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    @DoNotInline
    public final float e(@NotNull BackEvent backEvent) {
        kotlin.jvm.internal.p.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
