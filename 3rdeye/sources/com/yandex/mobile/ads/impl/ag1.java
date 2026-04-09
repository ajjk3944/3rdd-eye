package com.yandex.mobile.ads.impl;

import android.os.Handler;

/* loaded from: classes3.dex */
public final class ag1 {

    /* renamed from: a, reason: collision with root package name */
    private final pg0 f24644a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f24645b;

    /* renamed from: c, reason: collision with root package name */
    private final sy1 f24646c;

    /* renamed from: d, reason: collision with root package name */
    private final d7 f24647d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24648e;

    public ag1(pg0 htmlWebViewRenderer, Handler handler, sy1 singleTimeRunner, d7 adRenderWaitBreaker) {
        kotlin.jvm.internal.l.f(htmlWebViewRenderer, "htmlWebViewRenderer");
        kotlin.jvm.internal.l.f(handler, "handler");
        kotlin.jvm.internal.l.f(singleTimeRunner, "singleTimeRunner");
        kotlin.jvm.internal.l.f(adRenderWaitBreaker, "adRenderWaitBreaker");
        this.f24644a = htmlWebViewRenderer;
        this.f24645b = handler;
        this.f24646c = singleTimeRunner;
        this.f24647d = adRenderWaitBreaker;
    }

    public final void a() {
        this.f24645b.removeCallbacksAndMessages(null);
        this.f24647d.a(null);
    }

    public final void b() {
        if (this.f24648e) {
            return;
        }
        this.f24646c.a(new Z(this, 3));
    }

    public final void a(int i, String str) {
        this.f24648e = true;
        this.f24645b.removeCallbacks(this.f24647d);
        this.f24645b.post(new jj2(i, str, this.f24644a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ag1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        fp0.d(new Object[0]);
        this$0.f24645b.postDelayed(this$0.f24647d, 10000L);
    }

    public final void a(og0 og0Var) {
        this.f24647d.a(og0Var);
    }
}
