package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class z11 implements lp {

    /* renamed from: a, reason: collision with root package name */
    private final View f36131a;

    /* renamed from: b, reason: collision with root package name */
    private final m82 f36132b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f36133c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36134d;

    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference<View> f36135b;

        public a(View view) {
            kotlin.jvm.internal.l.f(view, "view");
            this.f36135b = new WeakReference<>(view);
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f36135b.get();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public z11(FrameLayout closeButton, m82 useCustomCloseHandler, Handler handler) {
        kotlin.jvm.internal.l.f(closeButton, "closeButton");
        kotlin.jvm.internal.l.f(useCustomCloseHandler, "useCustomCloseHandler");
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f36131a = closeButton;
        this.f36132b = useCustomCloseHandler;
        this.f36133c = handler;
        d().setVisibility(8);
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final void c() {
        if (this.f36134d) {
            return;
        }
        this.f36133c.postDelayed(new a(this.f36131a), 200L);
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final View d() {
        return this.f36131a;
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final void a(boolean z10) {
        this.f36134d = true;
        this.f36133c.removeCallbacksAndMessages(null);
        m82 m82Var = this.f36132b;
        View closeButton = this.f36131a;
        m82Var.getClass();
        kotlin.jvm.internal.l.f(closeButton, "closeButton");
        closeButton.setVisibility(z10 ? 8 : 0);
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.lp
    public final void invalidate() {
    }
}
