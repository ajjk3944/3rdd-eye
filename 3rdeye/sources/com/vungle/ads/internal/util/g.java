package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: HandlerScheduler.kt */
/* loaded from: classes2.dex */
public final class g {
    private final Handler handler = new Handler(Looper.getMainLooper());

    private final long calculateTime(long j4) {
        return SystemClock.uptimeMillis() + j4;
    }

    public final void cancel(String tag) {
        kotlin.jvm.internal.l.f(tag, "tag");
        this.handler.removeCallbacksAndMessages(tag);
    }

    public final void cancelAll() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void schedule(Runnable runnable, String tag, long j4) {
        kotlin.jvm.internal.l.f(runnable, "runnable");
        kotlin.jvm.internal.l.f(tag, "tag");
        this.handler.postAtTime(runnable, tag, calculateTime(j4));
    }

    public final void schedule(Runnable runnable, long j4) {
        kotlin.jvm.internal.l.f(runnable, "runnable");
        this.handler.postAtTime(runnable, calculateTime(j4));
    }
}
