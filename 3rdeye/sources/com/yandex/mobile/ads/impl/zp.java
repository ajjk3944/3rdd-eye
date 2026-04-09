package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class zp<V extends ViewGroup> implements w00<V>, InterfaceC4077b1 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f36574a;

    /* renamed from: b, reason: collision with root package name */
    private final C4070a1 f36575b;

    /* renamed from: c, reason: collision with root package name */
    private final ip f36576c;

    /* renamed from: d, reason: collision with root package name */
    private final tr f36577d;

    /* renamed from: e, reason: collision with root package name */
    private final s41 f36578e;

    /* renamed from: f, reason: collision with root package name */
    private final yv f36579f;

    /* renamed from: g, reason: collision with root package name */
    private final s42 f36580g;

    /* renamed from: h, reason: collision with root package name */
    private lp f36581h;
    private final rl1 i;

    /* renamed from: j, reason: collision with root package name */
    private final ep f36582j;

    public static final class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final tr f36583a;

        /* renamed from: b, reason: collision with root package name */
        private final yv f36584b;

        public a(tr mContentCloseListener, yv mDebugEventsReporter) {
            kotlin.jvm.internal.l.f(mContentCloseListener, "mContentCloseListener");
            kotlin.jvm.internal.l.f(mDebugEventsReporter, "mDebugEventsReporter");
            this.f36583a = mContentCloseListener;
            this.f36584b = mDebugEventsReporter;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f36583a.f();
            this.f36584b.a(xv.f35431c);
        }
    }

    public zp(a8<?> adResponse, C4070a1 adActivityEventController, ip closeAppearanceController, tr contentCloseListener, s41 nativeAdControlViewProvider, yv debugEventsReporter, s42 timeProviderContainer) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adActivityEventController, "adActivityEventController");
        kotlin.jvm.internal.l.f(closeAppearanceController, "closeAppearanceController");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(nativeAdControlViewProvider, "nativeAdControlViewProvider");
        kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        this.f36574a = adResponse;
        this.f36575b = adActivityEventController;
        this.f36576c = closeAppearanceController;
        this.f36577d = contentCloseListener;
        this.f36578e = nativeAdControlViewProvider;
        this.f36579f = debugEventsReporter;
        this.f36580g = timeProviderContainer;
        this.i = timeProviderContainer.e();
        this.f36582j = timeProviderContainer.b();
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewC = this.f36578e.c(container);
        ProgressBar progressBarA = this.f36578e.a(container);
        if (viewC != null) {
            this.f36575b.a(this);
            Context context = viewC.getContext();
            ew1 ew1VarA = ew1.a.a();
            kotlin.jvm.internal.l.c(context);
            du1 du1VarA = ew1VarA.a(context);
            boolean z10 = false;
            boolean z11 = du1VarA != null && du1VarA.D0();
            if (kotlin.jvm.internal.l.b(b10.f25040c.a(), this.f36574a.w()) && z11) {
                z10 = true;
            }
            if (!z10) {
                viewC.setOnClickListener(new a(this.f36577d, this.f36579f));
            }
            a(viewC, progressBarA);
            if (viewC.getTag() == null) {
                viewC.setTag(com.vungle.ads.internal.presenter.g.CLOSE);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4077b1
    public final void b() {
        lp lpVar = this.f36581h;
        if (lpVar != null) {
            lpVar.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
        this.f36575b.b(this);
        lp lpVar = this.f36581h;
        if (lpVar != null) {
            lpVar.invalidate();
        }
    }

    private final void a(View view, ProgressBar progressBar) {
        lp gzVar;
        Long lU = this.f36574a.u();
        long jLongValue = lU != null ? lU.longValue() : 0L;
        if (progressBar != null) {
            gzVar = new kl1(view, progressBar, new c50(), new sp(new rd()), this.f36579f, this.i, jLongValue);
        } else {
            gzVar = this.f36582j.a() ? new gz(view, this.f36576c, this.f36579f, jLongValue, this.f36580g.c()) : null;
        }
        this.f36581h = gzVar;
        if (gzVar != null) {
            gzVar.c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4077b1
    public final void a() {
        lp lpVar = this.f36581h;
        if (lpVar != null) {
            lpVar.a();
        }
    }
}
