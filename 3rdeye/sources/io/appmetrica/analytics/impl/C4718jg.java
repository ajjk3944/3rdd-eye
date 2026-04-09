package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.jg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4718jg implements InterfaceC4667hg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4874pg f41117a;

    public C4718jg(C4874pg c4874pg) {
        this.f41117a = c4874pg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4667hg
    public final void a() {
        C4874pg c4874pg = this.f41117a;
        Sa sa2 = c4874pg.f41425b;
        C4692ig c4692ig = new C4692ig(c4874pg);
        sa2.getClass();
        try {
            FutureTask futureTask = new FutureTask(new Ra(sa2));
            Ga.f39501F.f39510d.f41384a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + Md.f39862a.incrementAndGet()).start();
            C5102yg c5102yg = (C5102yg) futureTask.get(5L, TimeUnit.SECONDS);
            AbstractC4623fo.a(sa2.f40103b);
            C4874pg.a(c4874pg, c5102yg, C4874pg.a(c4874pg));
        } catch (Throwable th) {
            try {
                c4692ig.a(th);
            } finally {
                AbstractC4623fo.a(sa2.f40103b);
            }
        }
    }
}
