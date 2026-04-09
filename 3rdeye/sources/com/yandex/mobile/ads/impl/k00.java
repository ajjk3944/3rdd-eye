package com.yandex.mobile.ads.impl;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class k00 {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f29447e = {fa.a(k00.class, "weakSkipButton", "getWeakSkipButton()Landroid/view/View;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final az1 f29448a;

    /* renamed from: b, reason: collision with root package name */
    private final long f29449b;

    /* renamed from: c, reason: collision with root package name */
    private final gg1 f29450c;

    /* renamed from: d, reason: collision with root package name */
    private final ao1 f29451d;

    public static final class a implements ig1 {

        /* renamed from: a, reason: collision with root package name */
        private final az1 f29452a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference<View> f29453b;

        public a(View view, az1 skipAppearanceController) {
            kotlin.jvm.internal.l.f(view, "view");
            kotlin.jvm.internal.l.f(skipAppearanceController, "skipAppearanceController");
            this.f29452a = skipAppearanceController;
            this.f29453b = new WeakReference<>(view);
        }

        @Override // com.yandex.mobile.ads.impl.ig1
        public final void a() {
            View view = this.f29453b.get();
            if (view != null) {
                this.f29452a.b(view);
            }
        }
    }

    public k00(View skipButton, az1 skipAppearanceController, long j4, gg1 pausableTimer) {
        kotlin.jvm.internal.l.f(skipButton, "skipButton");
        kotlin.jvm.internal.l.f(skipAppearanceController, "skipAppearanceController");
        kotlin.jvm.internal.l.f(pausableTimer, "pausableTimer");
        this.f29448a = skipAppearanceController;
        this.f29449b = j4;
        this.f29450c = pausableTimer;
        this.f29451d = bo1.a(skipButton);
        skipAppearanceController.a(skipButton);
    }

    public final void a() {
        this.f29450c.invalidate();
    }

    public final void b() {
        View view = (View) this.f29451d.getValue(this, f29447e[0]);
        if (view != null) {
            a aVar = new a(view, this.f29448a);
            long j4 = this.f29449b;
            if (j4 == 0) {
                this.f29448a.b(view);
            } else {
                this.f29450c.a(j4, aVar);
            }
        }
    }

    public final void c() {
        this.f29450c.pause();
    }

    public final void d() {
        this.f29450c.resume();
    }
}
