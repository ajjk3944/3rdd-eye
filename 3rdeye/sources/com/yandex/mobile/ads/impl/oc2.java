package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class oc2 {

    /* renamed from: a, reason: collision with root package name */
    private final dd2 f31345a;

    /* renamed from: b, reason: collision with root package name */
    private final a f31346b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f31347c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31348d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f31349e;

    public interface a {
        void b();
    }

    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (oc2.this.f31348d || !oc2.this.f31345a.a(cd2.f25603d)) {
                oc2.this.f31347c.postDelayed(this, 200L);
                return;
            }
            oc2.this.f31346b.b();
            oc2.this.f31348d = true;
            oc2.this.b();
        }
    }

    public oc2(dd2 statusController, a preparedListener) {
        kotlin.jvm.internal.l.f(statusController, "statusController");
        kotlin.jvm.internal.l.f(preparedListener, "preparedListener");
        this.f31345a = statusController;
        this.f31346b = preparedListener;
        this.f31347c = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        if (this.f31349e || this.f31348d) {
            return;
        }
        this.f31349e = true;
        this.f31347c.post(new b());
    }

    public final void b() {
        this.f31347c.removeCallbacksAndMessages(null);
        this.f31349e = false;
    }
}
