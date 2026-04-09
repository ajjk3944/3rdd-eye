package io.appmetrica.analytics.coreutils.internal.services;

import b9.C2001h;
import b9.InterfaceC2000g;
import io.appmetrica.analytics.coreutils.impl.l;

/* loaded from: classes3.dex */
public final class UtilityServiceProvider {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2000g f38978a = C2001h.b(new l(this));

    /* renamed from: b, reason: collision with root package name */
    private final WaitForActivationDelayBarrier f38979b = new WaitForActivationDelayBarrier();

    public final WaitForActivationDelayBarrier getActivationBarrier() {
        return this.f38979b;
    }

    public final FirstExecutionConditionServiceImpl getFirstExecutionService() {
        return (FirstExecutionConditionServiceImpl) this.f38978a.getValue();
    }

    public final void initAsync() {
        this.f38979b.activate();
    }

    public final void updateConfiguration(UtilityServiceConfiguration utilityServiceConfiguration) {
        getFirstExecutionService().updateConfig(utilityServiceConfiguration);
    }
}
