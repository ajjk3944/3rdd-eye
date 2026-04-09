package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class ko1 {

    /* renamed from: a, reason: collision with root package name */
    private final g7 f29743a;

    /* renamed from: b, reason: collision with root package name */
    private final b f29744b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f29745c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29746d;

    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final g7 f29747b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ko1 f29748c;

        public a(ko1 ko1Var, g7 adRenderingValidator) {
            kotlin.jvm.internal.l.f(adRenderingValidator, "adRenderingValidator");
            this.f29748c = ko1Var;
            this.f29747b = adRenderingValidator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f29748c.f29746d) {
                return;
            }
            if (this.f29747b.a()) {
                this.f29748c.f29746d = true;
                this.f29748c.f29744b.a();
            } else {
                this.f29748c.f29745c.postDelayed(new a(this.f29748c, this.f29747b), 300L);
            }
        }
    }

    public interface b {
        void a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ko1(g7 adRenderValidator, b adRenderedListener) {
        this(adRenderValidator, adRenderedListener, new Handler(Looper.getMainLooper()));
        kotlin.jvm.internal.l.f(adRenderValidator, "adRenderValidator");
        kotlin.jvm.internal.l.f(adRenderedListener, "adRenderedListener");
    }

    public final void a() {
        this.f29745c.post(new a(this, this.f29743a));
    }

    public final void b() {
        this.f29745c.removeCallbacksAndMessages(null);
    }

    public ko1(g7 adRenderValidator, b adRenderedListener, Handler handler) {
        kotlin.jvm.internal.l.f(adRenderValidator, "adRenderValidator");
        kotlin.jvm.internal.l.f(adRenderedListener, "adRenderedListener");
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f29743a = adRenderValidator;
        this.f29744b = adRenderedListener;
        this.f29745c = handler;
    }
}
