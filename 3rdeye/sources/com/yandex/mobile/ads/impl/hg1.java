package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes3.dex */
final class hg1 implements gg1 {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28211b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f28212c;

    /* renamed from: d, reason: collision with root package name */
    private b f28213d;

    /* renamed from: e, reason: collision with root package name */
    private ig1 f28214e;

    /* renamed from: f, reason: collision with root package name */
    private z42 f28215f;

    /* renamed from: g, reason: collision with root package name */
    private long f28216g;

    /* renamed from: h, reason: collision with root package name */
    private long f28217h;
    private long i;

    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            hg1.b(hg1.this);
            hg1.this.a();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f28219b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f28220c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f28221d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f28222e;

        static {
            b bVar = new b(0, "INVALIDATED");
            f28219b = bVar;
            b bVar2 = new b(1, "ACTIVE");
            f28220c = bVar2;
            b bVar3 = new b(2, "PAUSED");
            f28221d = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            f28222e = bVarArr;
            com.google.gson.internal.c.l(bVarArr);
        }

        private b(int i, String str) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f28222e.clone();
        }
    }

    public hg1(boolean z10, Handler handler) {
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f28211b = z10;
        this.f28212c = handler;
        this.f28213d = b.f28219b;
    }

    public static final void b(hg1 hg1Var) {
        hg1Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = jElapsedRealtime - hg1Var.i;
        hg1Var.i = jElapsedRealtime;
        long j10 = hg1Var.f28216g - j4;
        hg1Var.f28216g = j10;
        long jMax = (long) Math.max(0.0d, j10);
        z42 z42Var = hg1Var.f28215f;
        if (z42Var != null) {
            z42Var.a(jMax, hg1Var.f28217h - jMax);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(hg1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.a();
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void invalidate() {
        b bVar = b.f28219b;
        if (bVar == this.f28213d) {
            return;
        }
        this.f28213d = bVar;
        this.f28214e = null;
        this.f28212c.removeCallbacksAndMessages(null);
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void pause() {
        if (b.f28220c == this.f28213d) {
            this.f28213d = b.f28221d;
            this.f28212c.removeCallbacksAndMessages(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = jElapsedRealtime - this.i;
            this.i = jElapsedRealtime;
            long j10 = this.f28216g - j4;
            this.f28216g = j10;
            long jMax = (long) Math.max(0.0d, j10);
            z42 z42Var = this.f28215f;
            if (z42Var != null) {
                z42Var.a(jMax, this.f28217h - jMax);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void resume() {
        if (b.f28221d == this.f28213d) {
            a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void stop() {
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        this.f28213d = b.f28220c;
        this.i = SystemClock.elapsedRealtime();
        long jMin = (long) Math.min(200.0d, this.f28216g);
        if (jMin > 0) {
            this.f28212c.postDelayed(new a(), jMin);
            return;
        }
        ig1 ig1Var = this.f28214e;
        if (ig1Var != null) {
            ig1Var.a();
        }
        invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void a(z42 z42Var) {
        this.f28215f = z42Var;
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void a(long j4, ig1 ig1Var) {
        invalidate();
        this.f28214e = ig1Var;
        this.f28216g = j4;
        this.f28217h = j4;
        if (this.f28211b) {
            this.f28212c.post(new P0(this, 0));
        } else {
            a();
        }
    }
}
