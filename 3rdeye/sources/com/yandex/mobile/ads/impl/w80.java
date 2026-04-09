package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class w80 {

    /* renamed from: a, reason: collision with root package name */
    private final vs0 f34840a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f34841b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f34842c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f34843d;

    public static final class a implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v80 f34845c;

        public a(v80 v80Var) {
            this.f34845c = v80Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            LinkedHashMap linkedHashMap = w80.this.f34842c;
            v80 v80Var = this.f34845c;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                View view = (View) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                if (jh2.a(view) >= 1) {
                    v80Var.a(iIntValue);
                }
            }
            w80.this.f34841b.postDelayed(this, 200L);
        }
    }

    public /* synthetic */ w80() {
        this(new vs0(), new Handler(Looper.getMainLooper()));
    }

    public final void a(View feedAdView, int i) {
        kotlin.jvm.internal.l.f(feedAdView, "feedAdView");
        this.f34842c.put(feedAdView, Integer.valueOf(i));
    }

    public w80(vs0 mainThreadExecutor, Handler handler) {
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f34840a = mainThreadExecutor;
        this.f34841b = handler;
        this.f34842c = new LinkedHashMap();
    }

    public final void a(View feedAdView) {
        kotlin.jvm.internal.l.f(feedAdView, "feedAdView");
        this.f34842c.remove(feedAdView);
    }

    public final void a(v80 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        if (this.f34843d) {
            return;
        }
        this.f34843d = true;
        this.f34840a.a(new a(listener));
    }

    public final void a() {
        this.f34842c.clear();
        this.f34841b.removeCallbacksAndMessages(null);
        this.f34843d = false;
    }
}
