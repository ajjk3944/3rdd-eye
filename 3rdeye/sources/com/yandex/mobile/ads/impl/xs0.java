package com.yandex.mobile.ads.impl;

import android.os.Handler;

/* loaded from: classes3.dex */
public final class xs0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f35406a;

    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final long f35407b;

        /* renamed from: c, reason: collision with root package name */
        private final sn f35408c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ xs0 f35409d;

        public a(xs0 xs0Var, long j4, x21 periodicJob) {
            kotlin.jvm.internal.l.f(periodicJob, "periodicJob");
            this.f35409d = xs0Var;
            this.f35407b = j4;
            this.f35408c = periodicJob;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f35408c.b()) {
                this.f35408c.run();
                this.f35409d.f35406a.postDelayed(this, this.f35407b);
            }
        }
    }

    public xs0(Handler mainThreadHandler) {
        kotlin.jvm.internal.l.f(mainThreadHandler, "mainThreadHandler");
        this.f35406a = mainThreadHandler;
    }

    public final void a() {
        this.f35406a.removeCallbacksAndMessages(null);
    }

    public final void a(long j4, x21 periodicJob) {
        kotlin.jvm.internal.l.f(periodicJob, "periodicJob");
        if (periodicJob.b()) {
            this.f35406a.postDelayed(new a(this, j4, periodicJob), j4);
        }
    }
}
