package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;

/* renamed from: io.appmetrica.analytics.impl.ec, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4585ec implements InterfaceC4560dc, InterfaceC4673hm, LocationProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40800a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4689ic f40801b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationClient f40802c;

    /* renamed from: d, reason: collision with root package name */
    public final C4905ql f40803d;

    /* renamed from: e, reason: collision with root package name */
    public final C5031vk f40804e;

    /* renamed from: f, reason: collision with root package name */
    public final LastKnownLocationExtractorProviderFactory f40805f;

    /* renamed from: g, reason: collision with root package name */
    public final LocationReceiverProviderFactory f40806g;

    public C4585ec(Context context, InterfaceC4689ic interfaceC4689ic, LocationClient locationClient) {
        this.f40800a = context;
        this.f40801b = interfaceC4689ic;
        this.f40802c = locationClient;
        C4818nc c4818nc = new C4818nc();
        this.f40803d = new C4905ql(new C5(c4818nc, Ga.j().o().getAskForPermissionStrategy()));
        this.f40804e = Ga.j().o();
        ((C4766lc) interfaceC4689ic).a(c4818nc, true);
        ((C4766lc) interfaceC4689ic).a(locationClient, true);
        this.f40805f = locationClient.getLastKnownExtractorProviderFactory();
        this.f40806g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4673hm
    public final void a(C4544cm c4544cm) {
        C5114z3 c5114z3 = c4544cm.f40663y;
        if (c5114z3 != null) {
            long j4 = c5114z3.f42161a;
            this.f40802c.updateCacheArguments(new CacheArguments(j4, 2 * j4));
        }
    }

    public final C4905ql b() {
        return this.f40803d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f40805f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f40806g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f40803d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getSystemLocation() {
        return this.f40802c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getUserLocation() {
        return this.f40802c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4560dc, io.appmetrica.analytics.impl.InterfaceC4637gc
    public final void init() {
        this.f40802c.init(this.f40800a, this.f40803d, Ga.f39501F.f39510d.c(), this.f40804e.e());
        ModuleLocationSourcesServiceController moduleLocationSourcesServiceControllerF = this.f40804e.f();
        if (moduleLocationSourcesServiceControllerF != null) {
            moduleLocationSourcesServiceControllerF.init();
        } else {
            LocationClient locationClient = this.f40802c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f40802c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((C4766lc) this.f40801b).a(this.f40804e.g());
        Ga.f39501F.f39526u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
        ((C4766lc) this.f40801b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f40802c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f40802c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
        this.f40802c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4560dc, io.appmetrica.analytics.impl.InterfaceC4637gc
    public final void b(Object obj) {
        ((C4766lc) this.f40801b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
        this.f40802c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
        this.f40802c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4560dc, io.appmetrica.analytics.impl.InterfaceC4637gc
    public final void a(Object obj) {
        ((C4766lc) this.f40801b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4560dc, io.appmetrica.analytics.impl.InterfaceC4637gc
    public final void a(boolean z10) {
        ((C4766lc) this.f40801b).a(z10);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4560dc, io.appmetrica.analytics.impl.InterfaceC4637gc
    public final void a(Location location) {
        this.f40802c.updateUserLocation(location);
    }
}
