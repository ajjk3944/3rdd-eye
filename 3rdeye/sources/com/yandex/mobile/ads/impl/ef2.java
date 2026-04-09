package com.yandex.mobile.ads.impl;

import android.os.Handler;

/* loaded from: classes3.dex */
public final class ef2 {

    /* renamed from: a, reason: collision with root package name */
    private final te2 f26826a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f26827b;

    /* renamed from: c, reason: collision with root package name */
    private tl1 f26828c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26829d;

    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long jC = ef2.this.f26826a.c();
            tl1 tl1Var = ef2.this.f26828c;
            if (tl1Var != null) {
                tl1Var.a(jC);
            }
            if (ef2.this.f26829d) {
                ef2.this.f26827b.postDelayed(this, 200L);
            }
        }
    }

    public ef2(te2 videoPlayerController, Handler handler) {
        kotlin.jvm.internal.l.f(videoPlayerController, "videoPlayerController");
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f26826a = videoPlayerController;
        this.f26827b = handler;
    }

    public final void a(tl1 tl1Var) {
        this.f26828c = tl1Var;
    }

    public final void b() {
        if (this.f26829d) {
            this.f26827b.removeCallbacksAndMessages(null);
            this.f26829d = false;
        }
    }

    public final void a() {
        if (this.f26829d) {
            return;
        }
        this.f26829d = true;
        this.f26827b.post(new a());
    }
}
