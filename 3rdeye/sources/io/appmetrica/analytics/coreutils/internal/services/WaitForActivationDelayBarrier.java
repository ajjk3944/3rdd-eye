package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.m;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes3.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* renamed from: a, reason: collision with root package name */
    private long f38980a;

    /* renamed from: b, reason: collision with root package name */
    private final SystemTimeProvider f38981b;

    public static class ActivationBarrierHelper {

        /* renamed from: a, reason: collision with root package name */
        private boolean f38982a = false;

        /* renamed from: b, reason: collision with root package name */
        private final a f38983b;

        /* renamed from: c, reason: collision with root package name */
        private final WaitForActivationDelayBarrier f38984c;

        public ActivationBarrierHelper(Runnable runnable, WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f38983b = new a(this, runnable);
            this.f38984c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j4, ICommonExecutor iCommonExecutor) {
            if (this.f38982a) {
                iCommonExecutor.execute(new b(this));
            } else {
                this.f38984c.subscribe(j4, iCommonExecutor, this.f38983b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f38980a = this.f38981b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j4, ICommonExecutor iCommonExecutor, ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new m(activationBarrierCallback), Math.max(j4 - (this.f38981b.currentTimeMillis() - this.f38980a), 0L));
    }

    public WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f38981b = systemTimeProvider;
    }
}
