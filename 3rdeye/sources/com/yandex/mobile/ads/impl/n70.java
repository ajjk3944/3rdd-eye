package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.yandex.mobile.ads.impl.lh2;
import com.yandex.mobile.ads.impl.lh2.a;

/* loaded from: classes3.dex */
public final class n70<T extends View & lh2.a> {

    /* renamed from: a, reason: collision with root package name */
    private final T f30785a;

    /* renamed from: b, reason: collision with root package name */
    private final l70 f30786b;

    /* renamed from: c, reason: collision with root package name */
    private final ue1 f30787c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f30788d;

    /* renamed from: e, reason: collision with root package name */
    private a f30789e;

    public static final class a<T extends View & lh2.a> implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ w9.i<Object>[] f30790f = {fa.a(a.class, "exposureUpdateListenerReference", "getExposureUpdateListenerReference()Lcom/monetization/ads/base/webview/mraid/exposure/OnExposureUpdateListener;", 0), fa.a(a.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

        /* renamed from: b, reason: collision with root package name */
        private final Handler f30791b;

        /* renamed from: c, reason: collision with root package name */
        private final l70 f30792c;

        /* renamed from: d, reason: collision with root package name */
        private final ao1 f30793d;

        /* renamed from: e, reason: collision with root package name */
        private final ao1 f30794e;

        public a(Handler handler, View view, l70 exposureProvider, ue1 exposureUpdateListener) {
            kotlin.jvm.internal.l.f(view, "view");
            kotlin.jvm.internal.l.f(exposureUpdateListener, "exposureUpdateListener");
            kotlin.jvm.internal.l.f(handler, "handler");
            kotlin.jvm.internal.l.f(exposureProvider, "exposureProvider");
            this.f30791b = handler;
            this.f30792c = exposureProvider;
            this.f30793d = bo1.a(exposureUpdateListener);
            this.f30794e = bo1.a(view);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            ao1 ao1Var = this.f30794e;
            w9.i<?>[] iVarArr = f30790f;
            View view = (View) ao1Var.getValue(this, iVarArr[1]);
            ue1 ue1Var = (ue1) this.f30793d.getValue(this, iVarArr[0]);
            if (view == null || ue1Var == null) {
                return;
            }
            ue1Var.a(this.f30792c.a(view));
            this.f30791b.postDelayed(this, 200L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n70(Handler handler, View view, l70 exposureProvider, ue1 listener) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(exposureProvider, "exposureProvider");
        kotlin.jvm.internal.l.f(listener, "listener");
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f30785a = view;
        this.f30786b = exposureProvider;
        this.f30787c = listener;
        this.f30788d = handler;
    }

    public final void a() {
        if (this.f30789e == null) {
            a aVar = new a(this.f30788d, this.f30785a, this.f30786b, this.f30787c);
            this.f30789e = aVar;
            this.f30788d.post(aVar);
        }
    }

    public final void b() {
        this.f30788d.removeCallbacksAndMessages(null);
        this.f30789e = null;
    }

    public /* synthetic */ n70(View view, l70 l70Var, ue1 ue1Var) {
        this(new Handler(Looper.getMainLooper()), view, l70Var, ue1Var);
    }
}
