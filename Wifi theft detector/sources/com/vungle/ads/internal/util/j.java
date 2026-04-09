package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j {

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    private final long calculateTime(long j10) {
        return SystemClock.uptimeMillis() + j10;
    }

    public final void cancel(@NotNull String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        this.handler.removeCallbacksAndMessages(tag);
    }

    public final void cancelAll() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void schedule(@NotNull Runnable runnable, @NotNull String tag, long j10) {
        kotlin.jvm.internal.p.e(runnable, "runnable");
        kotlin.jvm.internal.p.e(tag, "tag");
        this.handler.postAtTime(runnable, tag, calculateTime(j10));
    }

    public final void schedule(@NotNull Runnable runnable, long j10) {
        kotlin.jvm.internal.p.e(runnable, "runnable");
        this.handler.postAtTime(runnable, calculateTime(j10));
    }
}
