package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class tc2 {

    /* renamed from: a, reason: collision with root package name */
    private final jc2<?> f33537a;

    /* renamed from: b, reason: collision with root package name */
    private final qc2 f33538b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f33539c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f33540d;

    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long adPosition = tc2.this.f33537a.getAdPosition();
            tc2.this.f33538b.a(tc2.this.f33537a.b(), adPosition);
            if (tc2.this.f33540d) {
                tc2.this.f33539c.postDelayed(this, 200L);
            }
        }
    }

    public /* synthetic */ tc2(jc2 jc2Var, qc2 qc2Var) {
        this(jc2Var, qc2Var, new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        if (this.f33540d) {
            return;
        }
        this.f33540d = true;
        this.f33538b.a();
        this.f33539c.post(new a());
    }

    public final void b() {
        if (this.f33540d) {
            this.f33538b.b();
            this.f33539c.removeCallbacksAndMessages(null);
            this.f33540d = false;
        }
    }

    public tc2(jc2<?> videoAdPlayer, qc2 videoAdProgressEventsObservable, Handler handler) {
        kotlin.jvm.internal.l.f(videoAdPlayer, "videoAdPlayer");
        kotlin.jvm.internal.l.f(videoAdProgressEventsObservable, "videoAdProgressEventsObservable");
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f33537a = videoAdPlayer;
        this.f33538b = videoAdProgressEventsObservable;
        this.f33539c = handler;
    }
}
