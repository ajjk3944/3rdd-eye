package io.appmetrica.analytics.impl;

import android.os.Bundle;
import c9.C2077A;
import c9.C2092m;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4990u4 {

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC4476a6 f41705c;

    /* renamed from: a, reason: collision with root package name */
    public final C4965t4 f41703a = new C4965t4();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f41704b = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f41706d = new CopyOnWriteArrayList();

    public static void a(String str, String str2, Throwable th) {
        Zj zj = AbstractC5105yj.f42147a;
        Map mapM = C2077A.m(new b9.l(str, C2077A.m(new b9.l(str2, b9.x.b(th)))));
        zj.getClass();
        zj.a(new Yj("client_module_errors", mapM));
    }

    public final ModuleAdRevenueProcessor b() {
        C4554d6 c4554d6;
        InterfaceC4476a6 interfaceC4476a6 = this.f41705c;
        if (interfaceC4476a6 == null || (c4554d6 = ((C4629g4) interfaceC4476a6).f40920b) == null) {
            return null;
        }
        return c4554d6.f40708a;
    }

    public final void c() {
        Iterator it = this.f41704b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "onActivated", th);
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f41706d;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f41704b;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = copyOnWriteArrayList2.iterator();
        while (it2.hasNext()) {
            AdRevenueCollector adRevenueCollector = ((ModuleClientEntryPoint) it2.next()).getAdRevenueCollector();
            if (adRevenueCollector != null) {
                arrayList.add(adRevenueCollector);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (((AdRevenueCollector) next).getEnabled()) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C2092m.T(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((AdRevenueCollector) it4.next()).getSourceIdentifier());
        }
        copyOnWriteArrayList.addAll(arrayList3);
    }

    public final List<String> a() {
        return this.f41706d;
    }

    public final void a(ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.f41704b.add(moduleClientEntryPoint);
    }

    public final void a(InterfaceC4476a6 interfaceC4476a6) {
        this.f41705c = interfaceC4476a6;
        HashSet hashSet = new HashSet();
        Iterator it = this.f41704b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.initClientSide(interfaceC4476a6);
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        this.f41704b.removeAll(hashSet);
    }

    public final void a(Bundle bundle, SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        Iterator it = this.f41704b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    C4965t4 c4965t4 = this.f41703a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    c4965t4.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    C4939s4 c4939s4 = bundle2 != null ? new C4939s4(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (c4939s4 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(c4939s4);
                    }
                }
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th);
            }
        }
    }
}
