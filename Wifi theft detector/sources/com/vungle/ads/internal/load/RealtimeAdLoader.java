package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.InvalidBidPayloadError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.f;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.y;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class RealtimeAdLoader extends BaseAdLoader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeAdLoader(@NotNull Context context, @NotNull VungleApiClient vungleApiClient, @NotNull com.vungle.ads.internal.executor.a sdkExecutors, @NotNull s7.b omInjector, @NotNull Downloader downloader, @NotNull q pathProvider, @NotNull AdRequest adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        p.e(context, "context");
        p.e(vungleApiClient, "vungleApiClient");
        p.e(sdkExecutors, "sdkExecutors");
        p.e(omInjector, "omInjector");
        p.e(downloader, "downloader");
        p.e(pathProvider, "pathProvider");
        p.e(adRequest, "adRequest");
    }

    /* renamed from: requestAd$lambda-0, reason: not valid java name */
    private static final VungleApiClient m322requestAd$lambda0(y8.h hVar) {
        return (VungleApiClient) hVar.getValue();
    }

    private final void sendWinNotification(List<String> list) {
        if (list == null || !list.isEmpty()) {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            final Context context = getContext();
            y8.h hVarA = kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.load.RealtimeAdLoader$sendWinNotification$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.h, java.lang.Object] */
                @Override // l9.a
                @NotNull
                public final com.vungle.ads.internal.network.h invoke() {
                    return ServiceLocator.Companion.getInstance(context).getService(com.vungle.ads.internal.network.h.class);
                }
            });
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.h.sendTpat$default(m323sendWinNotification$lambda2(hVarA), new f.a((String) it.next()).tpatKey(com.vungle.ads.internal.b.WIN_NOTIFICATION).withLogEntry(getLogEntry$vungle_ads_release()).build(), false, 2, null);
                }
            }
        }
    }

    /* renamed from: sendWinNotification$lambda-2, reason: not valid java name */
    private static final com.vungle.ads.internal.network.h m323sendWinNotification$lambda2(y8.h hVar) {
        return (com.vungle.ads.internal.network.h) hVar.getValue();
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void onAdLoadReady() {
        q7.a advertisement$vungle_ads_release = getAdvertisement$vungle_ads_release();
        sendWinNotification(advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getWinNotifications() : null);
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void requestAd() throws Throwable {
        BidPayload adMarkup = getAdRequest().getAdMarkup();
        if (adMarkup == null) {
            onAdLoadFailed(new InvalidBidPayloadError().setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            return;
        }
        if (ConfigManager.INSTANCE.rtaDebuggingEnabled()) {
            try {
                String decodedAdsResponse = adMarkup.getDecodedAdsResponse();
                com.vungle.ads.internal.util.p.Companion.d("RTA_DEBUGGER", String.valueOf(decodedAdsResponse));
                ServiceLocator.Companion companion = ServiceLocator.Companion;
                final Context context = getContext();
                y8.h hVarA = kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.load.RealtimeAdLoader$requestAd$$inlined$inject$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
                    @Override // l9.a
                    @NotNull
                    public final VungleApiClient invoke() {
                        return ServiceLocator.Companion.getInstance(context).getService(VungleApiClient.class);
                    }
                });
                if (decodedAdsResponse != null) {
                    new i(m322requestAd$lambda0(hVarA)).reportAdMarkup(decodedAdsResponse);
                }
            } catch (Throwable unused) {
            }
        }
        q7.a adPayload = adMarkup.getAdPayload();
        Integer version = adMarkup.getVersion();
        if (version == null || version.intValue() != 2 || adPayload == null) {
            onAdLoadFailed(new AdMarkupInvalidError("The ad response did not contain valid ad markup").setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        } else {
            handleAdMetaData$vungle_ads_release(adPayload, new y(Sdk$SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_ADM_LOAD));
        }
    }
}
