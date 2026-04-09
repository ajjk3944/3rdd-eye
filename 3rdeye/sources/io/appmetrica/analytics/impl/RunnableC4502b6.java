package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.b6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4502b6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final List f40577a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f40578b = Ga.j().w().a();

    /* renamed from: c, reason: collision with root package name */
    public final WaitForActivationDelayBarrier f40579c = Ga.j().a();

    public RunnableC4502b6(List list) {
        this.f40577a = list;
    }

    public static final void a(RunnableC4502b6 runnableC4502b6) {
        Iterator it = runnableC4502b6.f40577a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40579c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f40578b, new D7.c(this, 16));
    }
}
