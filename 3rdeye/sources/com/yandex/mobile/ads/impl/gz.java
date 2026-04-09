package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.gg1;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class gz implements lp {

    /* renamed from: a, reason: collision with root package name */
    private final View f28034a;

    /* renamed from: b, reason: collision with root package name */
    private final ip f28035b;

    /* renamed from: c, reason: collision with root package name */
    private final yv f28036c;

    /* renamed from: d, reason: collision with root package name */
    private final long f28037d;

    /* renamed from: e, reason: collision with root package name */
    private final up f28038e;

    /* renamed from: f, reason: collision with root package name */
    private final gg1 f28039f;

    public static final class a implements ig1 {

        /* renamed from: a, reason: collision with root package name */
        private final ip f28040a;

        /* renamed from: b, reason: collision with root package name */
        private final yv f28041b;

        /* renamed from: c, reason: collision with root package name */
        private final WeakReference<View> f28042c;

        public a(View view, ip closeAppearanceController, yv debugEventsReporter) {
            kotlin.jvm.internal.l.f(view, "view");
            kotlin.jvm.internal.l.f(closeAppearanceController, "closeAppearanceController");
            kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
            this.f28040a = closeAppearanceController;
            this.f28041b = debugEventsReporter;
            this.f28042c = new WeakReference<>(view);
        }

        @Override // com.yandex.mobile.ads.impl.ig1
        public final void a() {
            View view = this.f28042c.get();
            if (view != null) {
                this.f28040a.b(view);
                this.f28041b.a(xv.f35433e);
            }
        }
    }

    public /* synthetic */ gz(View view, ip ipVar, yv yvVar, long j4, up upVar) {
        this(view, ipVar, yvVar, j4, upVar, gg1.a.a(true));
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final void a(boolean z10) {
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final void b() {
        this.f28039f.pause();
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final void c() {
        a aVar = new a(this.f28034a, this.f28035b, this.f28036c);
        long jMax = (long) Math.max(0.0d, this.f28037d - this.f28038e.a());
        if (jMax == 0) {
            this.f28035b.b(this.f28034a);
            return;
        }
        this.f28039f.a(this.f28038e);
        this.f28039f.a(jMax, aVar);
        this.f28036c.a(xv.f35432d);
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final View d() {
        return this.f28034a;
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final void invalidate() {
        this.f28039f.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final void a() {
        this.f28039f.resume();
    }

    public gz(View closeButton, ip closeAppearanceController, yv debugEventsReporter, long j4, up closeTimerProgressIncrementer, gg1 pausableTimer) {
        kotlin.jvm.internal.l.f(closeButton, "closeButton");
        kotlin.jvm.internal.l.f(closeAppearanceController, "closeAppearanceController");
        kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
        kotlin.jvm.internal.l.f(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        kotlin.jvm.internal.l.f(pausableTimer, "pausableTimer");
        this.f28034a = closeButton;
        this.f28035b = closeAppearanceController;
        this.f28036c = debugEventsReporter;
        this.f28037d = j4;
        this.f28038e = closeTimerProgressIncrementer;
        this.f28039f = pausableTimer;
        closeAppearanceController.a(d());
    }
}
