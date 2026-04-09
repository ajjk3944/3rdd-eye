package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;

/* renamed from: io.appmetrica.analytics.impl.jd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4715jd implements ModuleClientExecutorProvider {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider
    public final IHandlerExecutor getDefaultExecutor() {
        return C5065x4.l().f42014c.a();
    }
}
