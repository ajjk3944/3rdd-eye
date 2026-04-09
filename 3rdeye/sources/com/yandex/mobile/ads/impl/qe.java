package com.yandex.mobile.ads.impl;

import android.os.Handler;
import b9.C1992A;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class qe implements ai {

    /* renamed from: f, reason: collision with root package name */
    private static final long f32158f = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: g, reason: collision with root package name */
    private static final Object f32159g = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final pe f32160a;

    /* renamed from: b, reason: collision with root package name */
    private final se f32161b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f32162c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap<bi, Object> f32163d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f32164e;

    public final class a implements oe {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.oe
        public final void a(String str) {
            qe.this.a();
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public b() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            qe.this.f32161b.getClass();
            se.a();
            qe.this.a();
            return C1992A.f18074a;
        }
    }

    public qe(pe appMetricaAutograbLoader, se appMetricaErrorProvider, Handler stopStartupParamsRequestHandler) {
        kotlin.jvm.internal.l.f(appMetricaAutograbLoader, "appMetricaAutograbLoader");
        kotlin.jvm.internal.l.f(appMetricaErrorProvider, "appMetricaErrorProvider");
        kotlin.jvm.internal.l.f(stopStartupParamsRequestHandler, "stopStartupParamsRequestHandler");
        this.f32160a = appMetricaAutograbLoader;
        this.f32161b = appMetricaErrorProvider;
        this.f32162c = stopStartupParamsRequestHandler;
        this.f32163d = new WeakHashMap<>();
    }

    private final void c() {
        synchronized (f32159g) {
            this.f32162c.removeCallbacksAndMessages(null);
            this.f32164e = false;
            C1992A c1992a = C1992A.f18074a;
        }
    }

    private final void d() {
        boolean z10;
        synchronized (f32159g) {
            try {
                if (this.f32164e) {
                    z10 = false;
                } else {
                    z10 = true;
                    this.f32164e = true;
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            b();
            this.f32160a.a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        HashSet hashSet;
        fp0.a(new Object[0]);
        synchronized (f32159g) {
            hashSet = new HashSet(this.f32163d.keySet());
            this.f32163d.clear();
            c();
            C1992A c1992a = C1992A.f18074a;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((bi) it.next()).a(null);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ai
    public final void b(bi autograbRequestListener) {
        kotlin.jvm.internal.l.f(autograbRequestListener, "autograbRequestListener");
        synchronized (f32159g) {
            this.f32163d.remove(autograbRequestListener);
        }
    }

    private final void b() {
        this.f32162c.postDelayed(new J2(new b(), 10), f32158f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC5480a tmp0) {
        kotlin.jvm.internal.l.f(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // com.yandex.mobile.ads.impl.ai
    public final void a(bi autograbRequestListener) {
        kotlin.jvm.internal.l.f(autograbRequestListener, "autograbRequestListener");
        synchronized (f32159g) {
            this.f32163d.put(autograbRequestListener, null);
        }
        try {
            d();
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
            this.f32161b.getClass();
            se.b();
            a();
        }
    }
}
