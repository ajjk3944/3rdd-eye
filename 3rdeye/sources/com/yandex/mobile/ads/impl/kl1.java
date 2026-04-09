package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.gg1;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class kl1 implements lp {

    /* renamed from: a, reason: collision with root package name */
    private final View f29697a;

    /* renamed from: b, reason: collision with root package name */
    private final ProgressBar f29698b;

    /* renamed from: c, reason: collision with root package name */
    private final ip f29699c;

    /* renamed from: d, reason: collision with root package name */
    private final sp f29700d;

    /* renamed from: e, reason: collision with root package name */
    private final yv f29701e;

    /* renamed from: f, reason: collision with root package name */
    private final rl1 f29702f;

    /* renamed from: g, reason: collision with root package name */
    private final long f29703g;

    /* renamed from: h, reason: collision with root package name */
    private final gg1 f29704h;
    private final ig1 i;

    /* renamed from: j, reason: collision with root package name */
    private final z42 f29705j;

    public static final class a implements z42 {

        /* renamed from: a, reason: collision with root package name */
        private final sp f29706a;

        /* renamed from: b, reason: collision with root package name */
        private final long f29707b;

        /* renamed from: c, reason: collision with root package name */
        private final WeakReference<ProgressBar> f29708c;

        public a(ProgressBar progressView, sp closeProgressAppearanceController, long j4) {
            kotlin.jvm.internal.l.f(progressView, "progressView");
            kotlin.jvm.internal.l.f(closeProgressAppearanceController, "closeProgressAppearanceController");
            this.f29706a = closeProgressAppearanceController;
            this.f29707b = j4;
            this.f29708c = new WeakReference<>(progressView);
        }

        @Override // com.yandex.mobile.ads.impl.z42
        public final void a(long j4, long j10) {
            ProgressBar progressBar = this.f29708c.get();
            if (progressBar != null) {
                sp spVar = this.f29706a;
                long j11 = this.f29707b;
                spVar.a(progressBar, j11, j11 - j4);
            }
        }
    }

    public static final class b implements ig1 {

        /* renamed from: a, reason: collision with root package name */
        private final ip f29709a;

        /* renamed from: b, reason: collision with root package name */
        private final yv f29710b;

        /* renamed from: c, reason: collision with root package name */
        private final WeakReference<View> f29711c;

        public b(View closeView, c50 closeAppearanceController, yv debugEventsReporter) {
            kotlin.jvm.internal.l.f(closeView, "closeView");
            kotlin.jvm.internal.l.f(closeAppearanceController, "closeAppearanceController");
            kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
            this.f29709a = closeAppearanceController;
            this.f29710b = debugEventsReporter;
            this.f29711c = new WeakReference<>(closeView);
        }

        @Override // com.yandex.mobile.ads.impl.ig1
        public final void a() {
            View view = this.f29711c.get();
            if (view != null) {
                this.f29709a.b(view);
                this.f29710b.a(xv.f35433e);
            }
        }
    }

    public kl1(View closeButton, ProgressBar closeProgressView, c50 closeAppearanceController, sp closeProgressAppearanceController, yv debugEventsReporter, rl1 progressIncrementer, long j4) {
        kotlin.jvm.internal.l.f(closeButton, "closeButton");
        kotlin.jvm.internal.l.f(closeProgressView, "closeProgressView");
        kotlin.jvm.internal.l.f(closeAppearanceController, "closeAppearanceController");
        kotlin.jvm.internal.l.f(closeProgressAppearanceController, "closeProgressAppearanceController");
        kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
        kotlin.jvm.internal.l.f(progressIncrementer, "progressIncrementer");
        this.f29697a = closeButton;
        this.f29698b = closeProgressView;
        this.f29699c = closeAppearanceController;
        this.f29700d = closeProgressAppearanceController;
        this.f29701e = debugEventsReporter;
        this.f29702f = progressIncrementer;
        this.f29703g = j4;
        this.f29704h = gg1.a.a(true);
        this.i = new b(d(), closeAppearanceController, debugEventsReporter);
        this.f29705j = new a(closeProgressView, closeProgressAppearanceController, j4);
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final void a(boolean z10) {
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final void b() {
        this.f29704h.pause();
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final void c() {
        sp spVar = this.f29700d;
        ProgressBar progressBar = this.f29698b;
        int i = (int) this.f29703g;
        int iA = (int) this.f29702f.a();
        spVar.getClass();
        kotlin.jvm.internal.l.f(progressBar, "progressBar");
        progressBar.setMax(i);
        progressBar.setVisibility(0);
        progressBar.setProgress(iA);
        long jMax = Math.max(0L, this.f29703g - this.f29702f.a());
        if (jMax != 0) {
            this.f29699c.a(this.f29697a);
            this.f29704h.a(this.f29705j);
            this.f29704h.a(jMax, this.i);
            this.f29701e.a(xv.f35432d);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final View d() {
        return this.f29697a;
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final void invalidate() {
        this.f29704h.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final void a() {
        this.f29704h.resume();
    }
}
