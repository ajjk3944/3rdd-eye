package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4780m0 {

    /* renamed from: j, reason: collision with root package name */
    public static final long f41222j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    public final Context f41223a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f41224b;

    /* renamed from: e, reason: collision with root package name */
    public CountDownLatch f41227e;

    /* renamed from: g, reason: collision with root package name */
    public final N1 f41229g;

    /* renamed from: d, reason: collision with root package name */
    public IAppMetricaService f41226d = null;

    /* renamed from: f, reason: collision with root package name */
    public final Object f41228f = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final RunnableC4728k0 f41230h = new RunnableC4728k0(this);
    public final ServiceConnectionC4754l0 i = new ServiceConnectionC4754l0(this);

    /* renamed from: c, reason: collision with root package name */
    public boolean f41225c = false;

    public C4780m0(Context context, ICommonExecutor iCommonExecutor, N1 n12) {
        this.f41223a = context.getApplicationContext();
        this.f41224b = iCommonExecutor;
        this.f41229g = n12;
    }

    public final synchronized boolean a() {
        return this.f41226d != null;
    }

    public final void b() {
        synchronized (this.f41228f) {
            this.f41224b.remove(this.f41230h);
        }
    }

    public final void c() {
        ICommonExecutor iCommonExecutor = this.f41224b;
        synchronized (this.f41228f) {
            try {
                iCommonExecutor.remove(this.f41230h);
                if (!this.f41225c) {
                    iCommonExecutor.executeDelayed(this.f41230h, f41222j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Long l5) throws InterruptedException {
        try {
            synchronized (this) {
                try {
                    CountDownLatch countDownLatch = this.f41227e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l5.longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException unused) {
        }
    }
}
