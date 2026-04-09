package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AdRetryActiveError;
import com.vungle.ads.AdRetryError;
import com.vungle.ads.NetworkTimeoutError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.VungleError;
import com.vungle.ads.a0;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.load.h;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.y;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h extends BaseAdLoader {

    public static final class a implements com.vungle.ads.internal.network.b {
        final /* synthetic */ q7.h $placement;

        public a(q7.h hVar) {
            this.$placement = hVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onFailure$lambda-1, reason: not valid java name */
        public static final void m324onFailure$lambda1(h this$0, Throwable th) {
            p.e(this$0, "this$0");
            this$0.onAdLoadFailed(this$0.retrofitToVungleError(th).setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onResponse$lambda-0, reason: not valid java name */
        public static final void m325onResponse$lambda0(h this$0, q7.h placement, com.vungle.ads.internal.network.e eVar) throws Throwable {
            p.e(this$0, "this$0");
            p.e(placement, "$placement");
            if (this$0.getVungleApiClient().getRetryAfterHeaderValue(placement.getReferenceId()) > 0) {
                this$0.onAdLoadFailed(new AdRetryError().setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                return;
            }
            if (eVar != null && !eVar.isSuccessful()) {
                this$0.onAdLoadFailed(new APIFailedStatusCodeError("ads API: " + eVar.code()).setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                return;
            }
            q7.a aVar = eVar != null ? (q7.a) eVar.body() : null;
            if ((aVar != null ? aVar.adUnit() : null) == null) {
                this$0.onAdLoadFailed(new AdResponseEmptyError("Ad response is empty").setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            } else {
                this$0.handleAdMetaData$vungle_ads_release(aVar, new y(Sdk$SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_AD_LOAD));
            }
        }

        @Override // com.vungle.ads.internal.network.b
        public void onFailure(@Nullable com.vungle.ads.internal.network.a aVar, @Nullable final Throwable th) {
            VungleThreadPoolExecutor backgroundExecutor = h.this.getSdkExecutors().getBackgroundExecutor();
            final h hVar = h.this;
            backgroundExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.f
                @Override // java.lang.Runnable
                public final void run() {
                    h.a.m324onFailure$lambda1(hVar, th);
                }
            });
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(@Nullable com.vungle.ads.internal.network.a aVar, @Nullable final com.vungle.ads.internal.network.e eVar) {
            VungleThreadPoolExecutor backgroundExecutor = h.this.getSdkExecutors().getBackgroundExecutor();
            final h hVar = h.this;
            final q7.h hVar2 = this.$placement;
            backgroundExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.g
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    h.a.m325onResponse$lambda0(hVar, hVar2, eVar);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context, @NotNull VungleApiClient vungleApiClient, @NotNull com.vungle.ads.internal.executor.a sdkExecutors, @NotNull s7.b omInjector, @NotNull Downloader downloader, @NotNull q pathProvider, @NotNull AdRequest adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        p.e(context, "context");
        p.e(vungleApiClient, "vungleApiClient");
        p.e(sdkExecutors, "sdkExecutors");
        p.e(omInjector, "omInjector");
        p.e(downloader, "downloader");
        p.e(pathProvider, "pathProvider");
        p.e(adRequest, "adRequest");
    }

    private final void fetchAdMetadata(a0 a0Var, q7.h hVar) throws IllegalStateException {
        if (getVungleApiClient().checkIsRetryAfterActive(hVar.getReferenceId())) {
            onAdLoadFailed(new AdRetryActiveError().setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.network.a aVarRequestAd = getVungleApiClient().requestAd(hVar.getReferenceId(), a0Var);
        if (aVarRequestAd == null) {
            onAdLoadFailed(new NetworkUnreachable("adsCall is null").setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        } else {
            aVarRequestAd.enqueue(new a(hVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VungleError retrofitToVungleError(Throwable th) {
        if (th instanceof SocketTimeoutException) {
            return new NetworkTimeoutError();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ads request fail: ");
        sb.append(th != null ? th.getMessage() : null);
        return new NetworkUnreachable(sb.toString());
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void onAdLoadReady() {
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void requestAd() throws IllegalStateException {
        fetchAdMetadata(getAdRequest().getRequestAdSize(), getAdRequest().getPlacement());
    }
}
