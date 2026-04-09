package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UtilityServiceProvider f38933a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(UtilityServiceProvider utilityServiceProvider) {
        super(0);
        this.f38933a = utilityServiceProvider;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        return new FirstExecutionConditionServiceImpl(this.f38933a);
    }
}
