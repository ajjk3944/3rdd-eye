package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import b9.C1992A;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public abstract class Ih implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public static final Hh f39638d = new Hh();

    /* renamed from: a, reason: collision with root package name */
    public final C4780m0 f39639a;

    /* renamed from: b, reason: collision with root package name */
    public final Wk f39640b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39641c;

    public Ih(C4780m0 c4780m0, Wk wk) {
        this.f39639a = c4780m0;
        this.f39640b = wk;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(Throwable th) {
    }

    public final C4780m0 b() {
        return this.f39639a;
    }

    public boolean c() throws InterruptedException {
        C4780m0 c4780m0 = this.f39639a;
        synchronized (c4780m0) {
            try {
                if (c4780m0.f41226d == null) {
                    c4780m0.f41227e = new CountDownLatch(1);
                    Intent intentA = AbstractC5081xk.a(c4780m0.f41223a);
                    try {
                        c4780m0.f41229g.b(c4780m0.f41223a);
                        c4780m0.f41223a.bindService(intentA, c4780m0.i, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.f39639a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return C1992A.f18074a;
    }

    public final boolean d() {
        return this.f39641c;
    }

    public final void a(boolean z10) {
        this.f39641c = z10;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f39641c) {
                return;
            }
            this.f39641c = true;
            int i = 0;
            do {
                C4780m0 c4780m0 = this.f39639a;
                synchronized (c4780m0) {
                    iAppMetricaService = c4780m0.f41226d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        Wk wk = this.f39640b;
                        if (wk != null && !((C4979ti) wk).a()) {
                            return;
                        }
                        this.f39639a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i++;
                if (!c() || U1.f40218e.get()) {
                    return;
                }
            } while (i < 3);
        } catch (Throwable th) {
            a(th);
        }
    }
}
