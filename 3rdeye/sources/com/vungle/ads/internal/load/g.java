package com.vungle.ads.internal.load;

import a6.C1653b;
import a6.C1656e;
import android.content.Context;
import b9.C2001h;
import b9.InterfaceC2000g;
import b9.i;
import c6.C2069b;
import com.vungle.ads.C4049g;
import com.vungle.ads.C4055m;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.e0;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.k;
import com.vungle.ads.internal.util.l;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;

/* compiled from: RealtimeAdLoader.kt */
/* loaded from: classes2.dex */
public final class g extends c {

    /* compiled from: ServiceLocator.kt */
    public static final class a extends m implements InterfaceC5480a<com.vungle.ads.internal.network.g> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.g, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.network.g invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.g.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class b extends m implements InterfaceC5480a<com.vungle.ads.internal.signals.b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.signals.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.b.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, com.vungle.ads.internal.network.g vungleApiClient, com.vungle.ads.internal.executor.a sdkExecutors, C2069b omInjector, com.vungle.ads.internal.downloader.d downloader, l pathProvider, com.vungle.ads.internal.load.b adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(vungleApiClient, "vungleApiClient");
        kotlin.jvm.internal.l.f(sdkExecutors, "sdkExecutors");
        kotlin.jvm.internal.l.f(omInjector, "omInjector");
        kotlin.jvm.internal.l.f(downloader, "downloader");
        kotlin.jvm.internal.l.f(pathProvider, "pathProvider");
        kotlin.jvm.internal.l.f(adRequest, "adRequest");
    }

    /* renamed from: requestAd$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.network.g m81requestAd$lambda0(InterfaceC2000g<com.vungle.ads.internal.network.g> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    private final void sendWinNotification(List<String> list) {
        if (list == null || !list.isEmpty()) {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            InterfaceC2000g interfaceC2000gA = C2001h.a(i.SYNCHRONIZED, new b(getContext()));
            com.vungle.ads.internal.network.g vungleApiClient = getVungleApiClient();
            String referenceId = getAdRequest().getPlacement().getReferenceId();
            C1653b advertisement$vungle_ads_release = getAdvertisement$vungle_ads_release();
            String creativeId = advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getCreativeId() : null;
            C1653b advertisement$vungle_ads_release2 = getAdvertisement$vungle_ads_release();
            com.vungle.ads.internal.network.e eVar = new com.vungle.ads.internal.network.e(vungleApiClient, referenceId, creativeId, advertisement$vungle_ads_release2 != null ? advertisement$vungle_ads_release2.eventId() : null, getSdkExecutors().getIoExecutor(), getPathProvider(), m82sendWinNotification$lambda2(interfaceC2000gA));
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    eVar.sendWinNotification((String) it.next(), getSdkExecutors().getJobExecutor());
                }
            }
        }
    }

    /* renamed from: sendWinNotification$lambda-2, reason: not valid java name */
    private static final com.vungle.ads.internal.signals.b m82sendWinNotification$lambda2(InterfaceC2000g<com.vungle.ads.internal.signals.b> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    @Override // com.vungle.ads.internal.load.c
    public void onAdLoadReady() {
        C1653b advertisement$vungle_ads_release = getAdvertisement$vungle_ads_release();
        sendWinNotification(advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getWinNotifications() : null);
    }

    @Override // com.vungle.ads.internal.load.c
    public void requestAd() {
        C1656e adMarkup = getAdRequest().getAdMarkup();
        if (adMarkup == null) {
            C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 208, "Unable to create data object from payload string.", getAdRequest().getPlacement().getReferenceId(), (String) null, (String) null, 24, (Object) null);
            onAdLoadFailed(new C4049g());
            return;
        }
        if (com.vungle.ads.internal.f.INSTANCE.rtaDebuggingEnabled()) {
            try {
                String decodedAdsResponse = adMarkup.getDecodedAdsResponse();
                k.Companion.d("RTA_DEBUGGER", String.valueOf(decodedAdsResponse));
                ServiceLocator.Companion companion = ServiceLocator.Companion;
                InterfaceC2000g interfaceC2000gA = C2001h.a(i.SYNCHRONIZED, new a(getContext()));
                if (decodedAdsResponse != null) {
                    new f(m81requestAd$lambda0(interfaceC2000gA)).reportAdMarkup(decodedAdsResponse);
                }
            } catch (Throwable unused) {
            }
        }
        C1653b adPayload = adMarkup.getAdPayload();
        Integer version = adMarkup.getVersion();
        if (version != null && version.intValue() == 2 && adPayload != null) {
            handleAdMetaData$vungle_ads_release(adPayload, new e0(Sdk$SDKMetric.b.CONFIG_LOADED_FROM_ADM_LOAD));
        } else {
            C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 213, "The ad response did not contain valid ad markup.", getAdRequest().getPlacement().getReferenceId(), (String) null, adMarkup.getEventId(), 8, (Object) null);
            onAdLoadFailed(new C4049g());
        }
    }
}
