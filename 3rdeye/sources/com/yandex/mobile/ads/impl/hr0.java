package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;

/* loaded from: classes3.dex */
public final class hr0 implements sl1 {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f28339d;

    /* renamed from: a, reason: collision with root package name */
    private final gr0 f28340a;

    /* renamed from: b, reason: collision with root package name */
    private final rd f28341b;

    /* renamed from: c, reason: collision with root package name */
    private final ao1 f28342c;

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n(hr0.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;");
        kotlin.jvm.internal.x.f43661a.getClass();
        f28339d = new w9.i[]{nVar};
    }

    public hr0() {
        this(0);
    }

    @Override // com.yandex.mobile.ads.impl.sl1
    public final void a(long j4, long j10) {
        ProgressBar progressBar = (ProgressBar) this.f28342c.getValue(this, f28339d[0]);
        if (progressBar != null) {
            this.f28341b.getClass();
            rd.a(progressBar, j4, j10);
        }
    }

    public final void b() {
        this.f28342c.setValue(this, f28339d[0], null);
    }

    public /* synthetic */ hr0(int i) {
        this(new gr0(), new rd());
    }

    @Override // com.yandex.mobile.ads.impl.sl1
    public final void a() {
        ProgressBar progressBar = (ProgressBar) this.f28342c.getValue(this, f28339d[0]);
        if (progressBar != null) {
            long max = progressBar.getMax();
            this.f28341b.getClass();
            rd.a(progressBar, max, max);
        }
    }

    public hr0(gr0 progressBarProvider, rd animatedProgressBarController) {
        kotlin.jvm.internal.l.f(progressBarProvider, "progressBarProvider");
        kotlin.jvm.internal.l.f(animatedProgressBarController, "animatedProgressBarController");
        this.f28340a = progressBarProvider;
        this.f28341b = animatedProgressBarController;
        this.f28342c = bo1.a(null);
    }

    public final void a(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f28340a.getClass();
        View viewFindViewWithTag = view.findViewWithTag("linear_progress_view");
        this.f28342c.setValue(this, f28339d[0], viewFindViewWithTag instanceof ProgressBar ? (ProgressBar) viewFindViewWithTag : null);
    }
}
