package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;

/* renamed from: io.appmetrica.analytics.impl.g4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4629g4 implements InterfaceC4476a6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40919a;

    /* renamed from: b, reason: collision with root package name */
    public final C4554d6 f40920b = new C4554d6(new B5());

    /* renamed from: c, reason: collision with root package name */
    public final C5090y4 f40921c = new C5090y4(C5065x4.l().b(getContext()));

    /* renamed from: d, reason: collision with root package name */
    public final C4972tb f40922d = new C4972tb();

    /* renamed from: e, reason: collision with root package name */
    public final C4805n f40923e = C5065x4.l().a();

    /* renamed from: f, reason: collision with root package name */
    public final C4577e4 f40924f = new C4577e4();

    /* renamed from: g, reason: collision with root package name */
    public final C4715jd f40925g = new C4715jd();

    /* renamed from: h, reason: collision with root package name */
    public final C4603f4 f40926h = new C4603f4();

    public C4629g4(Context context) {
        this.f40919a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.f40923e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientActivator getClientActivator() {
        return this.f40924f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.f40925g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ClientStorageProvider getClientStorageProvider() {
        return this.f40921c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final Context getContext() {
        return this.f40919a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.f40922d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4476a6, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final InterfaceC4528c6 getModuleAdRevenueContext() {
        return this.f40920b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ProcessDetector getProcessDetector() {
        return this.f40926h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f40920b;
    }
}
