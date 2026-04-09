package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class df2 implements pc2 {

    /* renamed from: a, reason: collision with root package name */
    private final eg2 f26157a;

    /* renamed from: b, reason: collision with root package name */
    private final rd f26158b;

    /* renamed from: c, reason: collision with root package name */
    private final mu f26159c;

    public /* synthetic */ df2(eg2 eg2Var) {
        this(eg2Var, new rd(), new mu());
    }

    @Override // com.yandex.mobile.ads.impl.pc2
    public final void a(long j4, long j10) {
        ob1 ob1VarB = this.f26157a.b();
        if (ob1VarB != null) {
            ov0 ov0VarA = ob1VarB.a().a();
            ProgressBar videoProgress = ov0VarA != null ? ov0VarA.getVideoProgress() : null;
            if (videoProgress != null) {
                this.f26158b.getClass();
                rd.a(videoProgress, j4, j10);
            }
            ov0 ov0VarA2 = ob1VarB.a().a();
            TextView countDownProgress = ov0VarA2 != null ? ov0VarA2.getCountDownProgress() : null;
            if (countDownProgress != null) {
                this.f26159c.a(countDownProgress, j4, j10);
            }
        }
    }

    public df2(eg2 videoViewAdapter, rd animatedProgressBarController, mu countDownProgressController) {
        kotlin.jvm.internal.l.f(videoViewAdapter, "videoViewAdapter");
        kotlin.jvm.internal.l.f(animatedProgressBarController, "animatedProgressBarController");
        kotlin.jvm.internal.l.f(countDownProgressController, "countDownProgressController");
        this.f26157a = videoViewAdapter;
        this.f26158b = animatedProgressBarController;
        this.f26159c = countDownProgressController;
    }
}
