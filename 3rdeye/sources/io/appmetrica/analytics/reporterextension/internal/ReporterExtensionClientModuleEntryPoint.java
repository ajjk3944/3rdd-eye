package io.appmetrica.analytics.reporterextension.internal;

import C2.h;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ReporterExtensionClientModuleEntryPoint extends ModuleClientEntryPoint<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final long f42490a = 10;

    /* renamed from: b, reason: collision with root package name */
    private final String f42491b = "reporter_extension";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ClientContext clientContext) {
        clientContext.getClientActivator().activate(clientContext.getContext());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return this.f42491b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        super.initClientSide(clientContext);
        if (clientContext.getProcessDetector().isMainProcess()) {
            clientContext.getClientExecutorProvider().getDefaultExecutor().executeDelayed(new h(clientContext, 8), this.f42490a, TimeUnit.SECONDS);
        }
    }
}
