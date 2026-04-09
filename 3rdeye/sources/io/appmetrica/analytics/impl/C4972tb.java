package io.appmetrica.analytics.impl;

import c9.C2078B;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AdType;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.tb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4972tb implements InternalClientModuleFacade {

    /* renamed from: a, reason: collision with root package name */
    public final C4664hd f41689a = new C4664hd();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade
    public final void reportAdRevenue(ModuleAdRevenue moduleAdRevenue) {
        AdType adType;
        C4664hd c4664hd = this.f41689a;
        c4664hd.getClass();
        AdRevenue.Builder builderNewBuilder = AdRevenue.newBuilder(moduleAdRevenue.getAdRevenue(), moduleAdRevenue.getCurrency());
        ModuleAdType adType2 = moduleAdRevenue.getAdType();
        ModuleAdType.values();
        switch (adType2 == null ? -1 : AbstractC4638gd.f40931a[adType2.ordinal()]) {
            case -1:
                adType = null;
                break;
            case 0:
            default:
                throw new b9.j();
            case 1:
                adType = AdType.NATIVE;
                break;
            case 2:
                adType = AdType.BANNER;
                break;
            case 3:
                adType = AdType.REWARDED;
                break;
            case 4:
                adType = AdType.INTERSTITIAL;
                break;
            case 5:
                adType = AdType.MREC;
                break;
            case 6:
                adType = AdType.APP_OPEN;
                break;
            case 7:
                adType = AdType.OTHER;
                break;
        }
        AdRevenue.Builder builderWithPrecision = builderNewBuilder.withAdType(adType).withAdNetwork(moduleAdRevenue.getAdNetwork()).withAdUnitId(moduleAdRevenue.getAdUnitId()).withAdUnitName(moduleAdRevenue.getAdUnitName()).withAdPlacementId(moduleAdRevenue.getAdPlacementId()).withAdPlacementName(moduleAdRevenue.getAdPlacementName()).withPrecision(moduleAdRevenue.getPrecision());
        Map<String, String> payload = moduleAdRevenue.getPayload();
        LinkedHashMap linkedHashMapU = payload != null ? C2078B.u(payload) : new LinkedHashMap();
        c4664hd.f40997a.getClass();
        linkedHashMapU.put(AdRevenueConstants.LAYER_KEY, "native");
        ModulesFacade.reportAdRevenue(builderWithPrecision.withPayload(linkedHashMapU).build(), Boolean.valueOf(moduleAdRevenue.getAutoCollected()));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade
    public final void reportEvent(InternalModuleEvent internalModuleEvent) {
        ModuleEvent.Builder builderWithValue = ModuleEvent.newBuilder(internalModuleEvent.getType()).withName(internalModuleEvent.getName()).withValue(internalModuleEvent.getValue());
        Integer serviceDataReporterType = internalModuleEvent.getServiceDataReporterType();
        if (serviceDataReporterType != null) {
            builderWithValue.withServiceDataReporterType(serviceDataReporterType.intValue());
        }
        InternalModuleEvent.Category category = internalModuleEvent.getCategory();
        if (category != null) {
            int i = AbstractC4946sb.f41635a[category.ordinal()];
            ModuleEvent.Category category2 = i != 1 ? i != 2 ? null : ModuleEvent.Category.GENERAL : ModuleEvent.Category.SYSTEM;
            if (category2 != null) {
                builderWithValue.withCategory(category2);
            }
        }
        ModulesFacade.reportEvent(builderWithValue.withExtras(internalModuleEvent.getExtras()).withAttributes(internalModuleEvent.getAttributes()).withEnvironment(internalModuleEvent.getEnvironment()).build());
    }
}
