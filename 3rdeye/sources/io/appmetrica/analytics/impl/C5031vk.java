package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import b9.C1992A;
import c9.C2077A;
import c9.C2078B;
import c9.C2095p;
import c9.C2099t;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.vk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5031vk implements InterfaceC4690id, InterfaceC4673hm, AskForPermissionStrategyModuleProvider {

    /* renamed from: a, reason: collision with root package name */
    public final String f41880a = "rp";

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f41881b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public volatile AskForPermissionStrategyModuleProvider f41882c = new T7();

    @Override // io.appmetrica.analytics.impl.InterfaceC4673hm
    public final void a(C4544cm c4544cm) {
        SdkIdentifiers sdkIdentifiers = new SdkIdentifiers(c4544cm.e(), c4544cm.a(), c4544cm.b());
        Vg vg = new Vg(c4544cm.c(), c4544cm.d());
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f41881b) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration != null) {
                remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(new C5006uk(sdkIdentifiers, vg, c4544cm.f40638B.get(moduleServiceEntryPoint.getIdentifier())));
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4690id
    public final List<ModuleServicesDatabase> b() {
        Object objValueOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f41881b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                ModuleServicesDatabase moduleServicesDatabase = moduleServiceEntryPoint.getModuleServicesDatabase();
                objValueOf = moduleServicesDatabase != null ? Boolean.valueOf(arrayList.add(moduleServicesDatabase)) : null;
            } catch (Throwable th) {
                hashSet.add(moduleServiceEntryPoint);
                String identifier = moduleServiceEntryPoint.getIdentifier();
                Zj zj = AbstractC5105yj.f42147a;
                Map mapM = C2077A.m(new b9.l(identifier, C2077A.m(new b9.l("db", b9.x.b(th)))));
                zj.getClass();
                zj.a(new Yj("service_module_errors", mapM));
                objValueOf = C1992A.f18074a;
            }
            if (objValueOf != null) {
                arrayList2.add(objValueOf);
            }
        }
        this.f41881b.removeAll(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4690id
    public final Map<String, C4922rd> c() {
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f41881b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            b9.l lVar = remoteConfigExtensionConfiguration != null ? new b9.l(moduleServiceEntryPoint.getIdentifier(), new C4922rd(remoteConfigExtensionConfiguration)) : null;
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        return C2078B.s(arrayList);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4690id
    public final Map<String, Integer> d() {
        Map<String, Integer> blocks;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f41881b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = ((ModuleServiceEntryPoint) it.next()).getRemoteConfigExtensionConfiguration();
            Iterable iterableG = C2099t.f18581b;
            if (remoteConfigExtensionConfiguration != null && (blocks = remoteConfigExtensionConfiguration.getBlocks()) != null && blocks.size() != 0) {
                Iterator<Map.Entry<String, Integer>> it2 = blocks.entrySet().iterator();
                if (it2.hasNext()) {
                    Map.Entry<String, Integer> next = it2.next();
                    if (it2.hasNext()) {
                        ArrayList arrayList2 = new ArrayList(blocks.size());
                        arrayList2.add(new b9.l(next.getKey(), next.getValue()));
                        do {
                            Map.Entry<String, Integer> next2 = it2.next();
                            arrayList2.add(new b9.l(next2.getKey(), next2.getValue()));
                        } while (it2.hasNext());
                        iterableG = arrayList2;
                    } else {
                        iterableG = E.u.G(new b9.l(next.getKey(), next.getValue()));
                    }
                }
            }
            C2095p.b0(iterableG, arrayList);
        }
        return C2078B.s(arrayList);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4690id
    public final List<Consumer<Location>> e() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f41881b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint) it.next()).getLocationServiceExtension();
            Consumer<Location> locationConsumer = locationServiceExtension != null ? locationServiceExtension.getLocationConsumer() : null;
            if (locationConsumer != null) {
                arrayList.add(locationConsumer);
            }
        }
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4690id
    public final ModuleLocationSourcesServiceController f() {
        ModuleLocationSourcesServiceController locationSourcesController;
        Iterator it = this.f41881b.iterator();
        do {
            locationSourcesController = null;
            if (!it.hasNext()) {
                break;
            }
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint) it.next()).getLocationServiceExtension();
            if (locationServiceExtension != null) {
                locationSourcesController = locationServiceExtension.getLocationSourcesController();
            }
        } while (locationSourcesController == null);
        return locationSourcesController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4690id
    public final Toggle g() {
        Toggle locationControllerAppStateToggle;
        Iterator it = this.f41881b.iterator();
        do {
            locationControllerAppStateToggle = null;
            if (!it.hasNext()) {
                break;
            }
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint) it.next()).getLocationServiceExtension();
            if (locationServiceExtension != null) {
                locationControllerAppStateToggle = locationServiceExtension.getLocationControllerAppStateToggle();
            }
        } while (locationControllerAppStateToggle == null);
        return locationControllerAppStateToggle;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f41882c.getAskForPermissionStrategy();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4690id
    public final List<String> h() {
        List<String> features;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f41881b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = ((ModuleServiceEntryPoint) it.next()).getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration == null || (features = remoteConfigExtensionConfiguration.getFeatures()) == null) {
                features = C2099t.f18581b;
            }
            C2095p.b0(features, arrayList);
        }
        return arrayList;
    }

    public final Bundle i() {
        Bundle bundle = new Bundle();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f41881b) {
            ClientConfigProvider clientConfigProvider = moduleServiceEntryPoint.getClientConfigProvider();
            Bundle configBundleForClient = clientConfigProvider != null ? clientConfigProvider.getConfigBundleForClient() : null;
            if (configBundleForClient != null) {
                bundle.putBundle(moduleServiceEntryPoint.getIdentifier(), configBundleForClient);
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ModuleServiceEntryPoint<Object> moduleServiceEntryPoint) {
        this.f41881b.add(moduleServiceEntryPoint);
        if (kotlin.jvm.internal.l.b(this.f41880a, moduleServiceEntryPoint.getIdentifier()) && (moduleServiceEntryPoint instanceof AskForPermissionStrategyModuleProvider)) {
            this.f41882c = (AskForPermissionStrategyModuleProvider) moduleServiceEntryPoint;
        }
    }

    public final void a(ServiceContext serviceContext, C4544cm c4544cm) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f41881b.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                moduleServiceEntryPoint.initServiceSide(serviceContext, new C5006uk(new SdkIdentifiers(c4544cm.f40643d, c4544cm.f40640a, c4544cm.f40641b), new Vg(c4544cm.f40660v, c4544cm.f40659u), c4544cm.f40638B.get(moduleServiceEntryPoint.getIdentifier())));
                ModuleEventServiceHandlerFactory moduleEventServiceHandlerFactory = moduleServiceEntryPoint.getModuleEventServiceHandlerFactory();
                if (moduleEventServiceHandlerFactory != null) {
                    C4819nd c4819nd = Ga.f39501F.f39525t;
                    String identifier = moduleServiceEntryPoint.getIdentifier();
                    synchronized (c4819nd) {
                        c4819nd.f41309a.put(identifier, moduleEventServiceHandlerFactory);
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                String identifier2 = moduleServiceEntryPoint.getIdentifier();
                Zj zj = AbstractC5105yj.f42147a;
                Map mapM = C2077A.m(new b9.l(identifier2, C2077A.m(new b9.l("init", b9.x.b(th)))));
                zj.getClass();
                zj.a(new Yj("service_module_errors", mapM));
                hashSet.add(moduleServiceEntryPoint);
            }
        }
        this.f41881b.removeAll(hashSet);
    }
}
