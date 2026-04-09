package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class zc2 {

    /* renamed from: a, reason: collision with root package name */
    private final hf2 f36411a;

    /* renamed from: b, reason: collision with root package name */
    private final a f36412b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f36413c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36414d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f36415e;

    public interface a {
        void a();
    }

    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (zc2.this.f36414d || !zc2.this.f36411a.a()) {
                zc2.this.f36413c.postDelayed(this, 200L);
                return;
            }
            zc2.this.f36412b.a();
            zc2.this.f36414d = true;
            zc2.this.b();
        }
    }

    public zc2(hf2 renderValidator, a renderingStartListener) {
        kotlin.jvm.internal.l.f(renderValidator, "renderValidator");
        kotlin.jvm.internal.l.f(renderingStartListener, "renderingStartListener");
        this.f36411a = renderValidator;
        this.f36412b = renderingStartListener;
        this.f36413c = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        if (this.f36415e || this.f36414d) {
            return;
        }
        this.f36415e = true;
        this.f36413c.post(new b());
    }

    public final void b() {
        this.f36413c.removeCallbacksAndMessages(null);
        this.f36415e = false;
    }
}
