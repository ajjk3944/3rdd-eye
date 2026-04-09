package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class gb {

    /* renamed from: f, reason: collision with root package name */
    private static final long f27602f = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    private final Dialog f27603a;

    /* renamed from: b, reason: collision with root package name */
    private final ub f27604b;

    /* renamed from: c, reason: collision with root package name */
    private final s50 f27605c;

    /* renamed from: d, reason: collision with root package name */
    private final ze1 f27606d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f27607e;

    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i10.a(gb.this.f27603a);
        }
    }

    public gb(Dialog dialog, ub adtuneWebView, s50 eventListenerController, ze1 openUrlHandler, Handler handler) {
        kotlin.jvm.internal.l.f(dialog, "dialog");
        kotlin.jvm.internal.l.f(adtuneWebView, "adtuneWebView");
        kotlin.jvm.internal.l.f(eventListenerController, "eventListenerController");
        kotlin.jvm.internal.l.f(openUrlHandler, "openUrlHandler");
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f27603a = dialog;
        this.f27604b = adtuneWebView;
        this.f27605c = eventListenerController;
        this.f27606d = openUrlHandler;
        this.f27607e = handler;
    }

    public static final void d(gb gbVar) {
        gbVar.f27607e.removeCallbacksAndMessages(null);
    }

    public final class a implements xb {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.xb
        public final void a(String url) {
            kotlin.jvm.internal.l.f(url, "url");
            gb.this.f27606d.a(url);
        }

        @Override // com.yandex.mobile.ads.impl.xb
        public final void b() {
            gb.this.f27605c.a();
            i10.a(gb.this.f27603a);
        }

        @Override // com.yandex.mobile.ads.impl.xb
        public final void a() {
            gb.d(gb.this);
        }
    }

    public final void a(String url, String optOutUrl) {
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(optOutUrl, "optOutUrl");
        this.f27604b.setAdtuneWebViewListener(new a());
        this.f27604b.setOptOutUrl(optOutUrl);
        this.f27604b.loadUrl(url);
        this.f27607e.postDelayed(new b(), f27602f);
        this.f27603a.show();
    }
}
