package com.vungle.ads.internal.util;

import android.os.CountDownTimer;
import b9.C1992A;
import p9.InterfaceC5480a;

/* compiled from: SuspendableTimer.kt */
/* loaded from: classes2.dex */
public final class p {
    private final double durationSecs;
    private boolean isCanceled;
    private boolean isPaused;
    private double nextDurationSecs;
    private final InterfaceC5480a<C1992A> onFinish;
    private final InterfaceC5480a<C1992A> onTick;
    private final boolean repeats;
    private long startTimeMillis;
    private CountDownTimer timer;

    /* compiled from: SuspendableTimer.kt */
    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // p9.InterfaceC5480a
        public /* bridge */ /* synthetic */ C1992A invoke() {
            invoke2();
            return C1992A.f18074a;
        }
    }

    /* compiled from: SuspendableTimer.kt */
    public static final class b extends CountDownTimer {
        final /* synthetic */ p this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j4, p pVar) {
            super(j4, j4);
            this.this$0 = pVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            p pVar = this.this$0;
            pVar.onFinish.invoke();
            if (!pVar.repeats || pVar.isCanceled) {
                pVar.cancel();
            } else {
                pVar.setNextDurationSecs$vungle_ads_release(pVar.durationSecs);
                pVar.start();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            this.this$0.onTick.invoke();
        }
    }

    public p(double d10, boolean z10, InterfaceC5480a<C1992A> onTick, InterfaceC5480a<C1992A> onFinish) {
        kotlin.jvm.internal.l.f(onTick, "onTick");
        kotlin.jvm.internal.l.f(onFinish, "onFinish");
        this.durationSecs = d10;
        this.repeats = z10;
        this.onTick = onTick;
        this.onFinish = onFinish;
        this.nextDurationSecs = d10;
    }

    private final CountDownTimer createCountdown(long j4) {
        return new b(j4, this);
    }

    private final long getDurationMillis() {
        return (long) (this.durationSecs * 1000);
    }

    private final double getElapsedSecs() {
        return getElapsedMillis$vungle_ads_release() / 1000;
    }

    private final long getNextDurationMillis() {
        return (long) (this.nextDurationSecs * 1000);
    }

    public final void cancel() {
        this.isPaused = false;
        this.isCanceled = true;
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final long getElapsedMillis$vungle_ads_release() {
        long jCurrentTimeMillis;
        long nextDurationMillis;
        if (this.isPaused) {
            jCurrentTimeMillis = getDurationMillis();
            nextDurationMillis = getNextDurationMillis();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            nextDurationMillis = this.startTimeMillis;
        }
        return jCurrentTimeMillis - nextDurationMillis;
    }

    public final double getNextDurationSecs$vungle_ads_release() {
        return this.nextDurationSecs;
    }

    public final long getStartTimeMillis$vungle_ads_release() {
        return this.startTimeMillis;
    }

    public final CountDownTimer getTimer$vungle_ads_release() {
        return this.timer;
    }

    public final void pause() {
        if (this.timer == null) {
            return;
        }
        this.nextDurationSecs -= getElapsedSecs();
        this.isPaused = true;
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final void reset() {
        cancel();
        start();
    }

    public final void resume() {
        if (this.isPaused) {
            this.isPaused = false;
            start();
        }
    }

    public final void setNextDurationSecs$vungle_ads_release(double d10) {
        this.nextDurationSecs = d10;
    }

    public final void setStartTimeMillis$vungle_ads_release(long j4) {
        this.startTimeMillis = j4;
    }

    public final void setTimer$vungle_ads_release(CountDownTimer countDownTimer) {
        this.timer = countDownTimer;
    }

    public final void start() {
        this.startTimeMillis = System.currentTimeMillis();
        CountDownTimer countDownTimerCreateCountdown = createCountdown(getNextDurationMillis());
        this.timer = countDownTimerCreateCountdown;
        if (countDownTimerCreateCountdown != null) {
            countDownTimerCreateCountdown.start();
        }
    }

    public /* synthetic */ p(double d10, boolean z10, InterfaceC5480a interfaceC5480a, InterfaceC5480a interfaceC5480a2, int i, kotlin.jvm.internal.g gVar) {
        this(d10, z10, (i & 4) != 0 ? a.INSTANCE : interfaceC5480a, interfaceC5480a2);
    }

    public static /* synthetic */ void getElapsedMillis$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getNextDurationSecs$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getStartTimeMillis$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getTimer$vungle_ads_release$annotations() {
    }
}
