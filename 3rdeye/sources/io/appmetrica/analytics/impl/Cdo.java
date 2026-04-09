package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* renamed from: io.appmetrica.analytics.impl.do, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cdo implements InterfaceC4673hm {

    /* renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f40766a;

    public Cdo(UtilityServiceProvider utilityServiceProvider) {
        this.f40766a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4673hm
    public final void a(C4544cm c4544cm) {
        this.f40766a.updateConfiguration(new UtilityServiceConfiguration(c4544cm.f40660v, c4544cm.f40659u));
    }
}
