package io.appmetrica.analytics.adrevenue.ironsource.v7.internal;

import com.applovin.sdk.AppLovinMediationProvider;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;

/* loaded from: classes3.dex */
public final class a implements AdRevenueCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IronSourceClientModuleEntryPoint f38805a;

    public a(IronSourceClientModuleEntryPoint ironSourceClientModuleEntryPoint) {
        this.f38805a = ironSourceClientModuleEntryPoint;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector
    public final boolean getEnabled() {
        return this.f38805a.f38804b.get();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector
    public final String getSourceIdentifier() {
        return AppLovinMediationProvider.IRONSOURCE;
    }
}
