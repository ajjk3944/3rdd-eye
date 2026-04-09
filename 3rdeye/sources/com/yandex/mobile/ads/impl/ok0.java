package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.ew1;
import java.util.List;

/* loaded from: classes3.dex */
public final class ok0 {

    /* renamed from: a, reason: collision with root package name */
    private final pk0 f31404a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f31405b;

    /* renamed from: c, reason: collision with root package name */
    private final sh2 f31406c;

    /* renamed from: d, reason: collision with root package name */
    private final wo0 f31407d;

    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final x61 f31408b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ok0 f31409c;

        public a(ok0 ok0Var, x61 nativeAdViewAdapter) {
            kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
            this.f31409c = ok0Var;
            this.f31408b = nativeAdViewAdapter;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View viewE = this.f31408b.e();
            if (viewE instanceof FrameLayout) {
                wo0 wo0Var = this.f31409c.f31407d;
                FrameLayout frameLayout = (FrameLayout) viewE;
                Context context = frameLayout.getContext();
                kotlin.jvm.internal.l.e(context, "getContext(...)");
                this.f31409c.f31404a.a(wo0Var.a(context), frameLayout);
                this.f31409c.f31405b.postDelayed(new a(this.f31409c, this.f31408b), 300L);
            }
        }
    }

    public /* synthetic */ ok0(ca1 ca1Var, List list) {
        this(ca1Var, list, new pk0(), new Handler(Looper.getMainLooper()), new sh2(), xo0.a(ca1Var, list));
    }

    public final void a(x61 nativeAdViewAdapter) {
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        this.f31405b.removeCallbacksAndMessages(null);
        View viewE = nativeAdViewAdapter.e();
        if (viewE instanceof FrameLayout) {
            this.f31404a.a((FrameLayout) viewE);
        }
    }

    public ok0(ca1 nativeValidator, List<tx1> showNotices, pk0 indicatorPresenter, Handler handler, sh2 availabilityChecker, wo0 integrationValidator) {
        kotlin.jvm.internal.l.f(nativeValidator, "nativeValidator");
        kotlin.jvm.internal.l.f(showNotices, "showNotices");
        kotlin.jvm.internal.l.f(indicatorPresenter, "indicatorPresenter");
        kotlin.jvm.internal.l.f(handler, "handler");
        kotlin.jvm.internal.l.f(availabilityChecker, "availabilityChecker");
        kotlin.jvm.internal.l.f(integrationValidator, "integrationValidator");
        this.f31404a = indicatorPresenter;
        this.f31405b = handler;
        this.f31406c = availabilityChecker;
        this.f31407d = integrationValidator;
    }

    public final void a(Context context, x61 nativeAdViewAdapter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        this.f31406c.getClass();
        ew1 ew1VarA = ew1.a.a();
        du1 du1VarA = ew1VarA.a(context);
        Boolean boolH0 = du1VarA != null ? du1VarA.H0() : null;
        boolean zG = ew1VarA.g();
        boolean zH = ew1VarA.h();
        if (boolH0 != null) {
            if (!boolH0.booleanValue()) {
                return;
            }
        } else if ((!zG || !ba.a(context)) && !zH) {
            return;
        }
        this.f31405b.post(new a(this, nativeAdViewAdapter));
    }

    public final void a() {
        this.f31405b.removeCallbacksAndMessages(null);
    }
}
