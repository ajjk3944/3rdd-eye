package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import b9.C1992A;
import java.util.concurrent.TimeUnit;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class we implements ef {

    /* renamed from: g, reason: collision with root package name */
    private static final long f34915g = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final ve f34916a;

    /* renamed from: b, reason: collision with root package name */
    private final le f34917b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f34918c;

    /* renamed from: d, reason: collision with root package name */
    private final se f34919d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34920e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f34921f;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            we.this.b();
            we.this.f34919d.getClass();
            se.a();
            we.b(we.this);
            return C1992A.f18074a;
        }
    }

    public we(ve appMetricaIdentifiersChangedObservable, le appMetricaAdapter) {
        kotlin.jvm.internal.l.f(appMetricaIdentifiersChangedObservable, "appMetricaIdentifiersChangedObservable");
        kotlin.jvm.internal.l.f(appMetricaAdapter, "appMetricaAdapter");
        this.f34916a = appMetricaIdentifiersChangedObservable;
        this.f34917b = appMetricaAdapter;
        this.f34918c = new Handler(Looper.getMainLooper());
        this.f34919d = new se();
        this.f34921f = new Object();
    }

    public static final void b(we weVar) {
        weVar.getClass();
        fp0.b(new Object[0]);
        weVar.f34916a.a();
    }

    public final void a(Context context, li0 observer) {
        boolean z10;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(observer, "observer");
        this.f34916a.a(observer);
        try {
            synchronized (this.f34921f) {
                try {
                    if (this.f34920e) {
                        z10 = false;
                    } else {
                        z10 = true;
                        this.f34920e = true;
                    }
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z10) {
                fp0.a(new Object[0]);
                a();
                this.f34917b.a(context, this);
            }
        } catch (Throwable unused) {
            b();
            fp0.c(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        synchronized (this.f34921f) {
            this.f34918c.removeCallbacksAndMessages(null);
            this.f34920e = false;
            C1992A c1992a = C1992A.f18074a;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ef
    public final void a(df error) {
        kotlin.jvm.internal.l.f(error, "error");
        b();
        this.f34919d.a(error);
        fp0.b(new Object[0]);
        this.f34916a.a();
    }

    @Override // com.yandex.mobile.ads.impl.ef
    public final void a(cf params) {
        kotlin.jvm.internal.l.f(params, "params");
        fp0.d(params);
        b();
        this.f34916a.a(new ue(params.b(), params.a(), params.c()));
    }

    private final void a() {
        this.f34918c.postDelayed(new P0(new a(), 12), f34915g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC5480a tmp0) {
        kotlin.jvm.internal.l.f(tmp0, "$tmp0");
        tmp0.invoke();
    }
}
