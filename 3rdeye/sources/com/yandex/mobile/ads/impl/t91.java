package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class t91 {

    /* renamed from: a, reason: collision with root package name */
    private final tr1 f33489a;

    /* renamed from: b, reason: collision with root package name */
    private final sc0 f33490b;

    /* renamed from: c, reason: collision with root package name */
    private View f33491c;

    public final class a implements sl1 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.sl1
        public final void a(long j4, long j10) {
            View view = t91.this.f33491c;
            if (view != null) {
                t91.this.f33489a.a(view, j4, j10);
            }
        }

        @Override // com.yandex.mobile.ads.impl.sl1
        public final void a() {
            View view = t91.this.f33491c;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
        }
    }

    public /* synthetic */ t91(b52 b52Var, c91 c91Var, s42 s42Var) {
        this(b52Var, c91Var, s42Var, new ur1(), new tr1(b52Var));
    }

    public final void c() {
        sc0 sc0Var = this.f33490b;
        if (sc0Var != null) {
            sc0Var.resume();
        }
    }

    public final void a() {
        this.f33491c = null;
        sc0 sc0Var = this.f33490b;
        if (sc0Var != null) {
            sc0Var.invalidate();
        }
    }

    public final void b() {
        sc0 sc0Var = this.f33490b;
        if (sc0Var != null) {
            sc0Var.pause();
        }
    }

    public t91(b52 timerViewProvider, c91 nativeMediaContent, s42 timeProviderContainer, ur1 rewardViewControllerProvider, tr1 rewardTimerViewController) {
        kotlin.jvm.internal.l.f(timerViewProvider, "timerViewProvider");
        kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        kotlin.jvm.internal.l.f(rewardViewControllerProvider, "rewardViewControllerProvider");
        kotlin.jvm.internal.l.f(rewardTimerViewController, "rewardTimerViewController");
        this.f33489a = rewardTimerViewController;
        this.f33490b = ur1.a(new a(), nativeMediaContent, timeProviderContainer);
    }

    public final void a(View view) {
        this.f33491c = view;
        sc0 sc0Var = this.f33490b;
        if (sc0Var != null) {
            sc0Var.start();
        }
    }
}
