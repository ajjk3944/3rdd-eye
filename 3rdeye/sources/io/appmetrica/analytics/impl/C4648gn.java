package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4648gn implements InterfaceC4878pk, N9 {

    /* renamed from: a, reason: collision with root package name */
    public final Xa f40978a;

    /* renamed from: b, reason: collision with root package name */
    public final Hl f40979b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f40980c = new AtomicBoolean(false);

    public C4648gn(Xa xa, Hl hl) {
        this.f40978a = xa;
        this.f40979b = hl;
        Objects.toString(xa.b());
    }

    public void a() {
    }

    public final void b() {
        if (this.f40980c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.f40980c.get()) {
            return;
        }
        f();
        a();
    }

    public final Xa d() {
        return this.f40978a;
    }

    public final boolean e() {
        return this.f40980c.get();
    }

    public void f() {
        this.f40979b.a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4878pk
    public final void onCreate() {
        this.f40980c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4878pk
    public final void onDestroy() {
        if (this.f40980c.compareAndSet(false, true)) {
            a();
        }
    }

    public final void a(NetworkTask networkTask) {
        Ga.f39501F.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }

    public void g() {
    }
}
