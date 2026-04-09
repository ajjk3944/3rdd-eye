package com.vungle.ads.internal.load;

import J4.h;
import a6.C1653b;
import a6.C1661j;
import android.content.Context;
import c6.C2069b;
import com.vungle.ads.C;
import com.vungle.ads.C4048f;
import com.vungle.ads.C4051i;
import com.vungle.ads.C4052j;
import com.vungle.ads.C4055m;
import com.vungle.ads.T;
import com.vungle.ads.e0;
import com.vungle.ads.i0;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.k0;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.jvm.internal.l;

/* compiled from: DefaultAdLoader.kt */
/* loaded from: classes2.dex */
public final class d extends c {

    /* compiled from: DefaultAdLoader.kt */
    public static final class a implements com.vungle.ads.internal.network.b<C1653b> {
        final /* synthetic */ C1661j $placement;

        public a(C1661j c1661j) {
            this.$placement = c1661j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onFailure$lambda-1, reason: not valid java name */
        public static final void m76onFailure$lambda1(d this$0, Throwable th, C1661j placement) {
            l.f(this$0, "this$0");
            l.f(placement, "$placement");
            k0 k0VarRetrofitToVungleError = this$0.retrofitToVungleError(th);
            this$0.onAdLoadFailed(k0VarRetrofitToVungleError);
            int code = k0VarRetrofitToVungleError.getCode();
            if (code == 10020) {
                C4055m c4055m = C4055m.INSTANCE;
                String referenceId = placement.getReferenceId();
                C1653b advertisement$vungle_ads_release = this$0.getAdvertisement$vungle_ads_release();
                String creativeId = advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getCreativeId() : null;
                C1653b advertisement$vungle_ads_release2 = this$0.getAdvertisement$vungle_ads_release();
                c4055m.logError$vungle_ads_release(101, "Ads request error.", referenceId, creativeId, advertisement$vungle_ads_release2 != null ? advertisement$vungle_ads_release2.eventId() : null);
                return;
            }
            if (code != 10047) {
                C4055m c4055m2 = C4055m.INSTANCE;
                String referenceId2 = placement.getReferenceId();
                C1653b advertisement$vungle_ads_release3 = this$0.getAdvertisement$vungle_ads_release();
                String creativeId2 = advertisement$vungle_ads_release3 != null ? advertisement$vungle_ads_release3.getCreativeId() : null;
                C1653b advertisement$vungle_ads_release4 = this$0.getAdvertisement$vungle_ads_release();
                c4055m2.logError$vungle_ads_release(103, "Unable to decode ads response.", referenceId2, creativeId2, advertisement$vungle_ads_release4 != null ? advertisement$vungle_ads_release4.eventId() : null);
                return;
            }
            C4055m c4055m3 = C4055m.INSTANCE;
            String referenceId3 = placement.getReferenceId();
            C1653b advertisement$vungle_ads_release5 = this$0.getAdvertisement$vungle_ads_release();
            String creativeId3 = advertisement$vungle_ads_release5 != null ? advertisement$vungle_ads_release5.getCreativeId() : null;
            C1653b advertisement$vungle_ads_release6 = this$0.getAdvertisement$vungle_ads_release();
            c4055m3.logError$vungle_ads_release(217, "Timeout for ads call.", referenceId3, creativeId3, advertisement$vungle_ads_release6 != null ? advertisement$vungle_ads_release6.eventId() : null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onResponse$lambda-0, reason: not valid java name */
        public static final void m77onResponse$lambda0(d this$0, C1661j placement, com.vungle.ads.internal.network.d dVar) {
            l.f(this$0, "this$0");
            l.f(placement, "$placement");
            if (this$0.getVungleApiClient().getRetryAfterHeaderValue(placement.getReferenceId()) > 0) {
                this$0.onAdLoadFailed(new C4052j().logError$vungle_ads_release());
                return;
            }
            if (dVar != null && !dVar.isSuccessful()) {
                C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 104, "Failed to get a successful response from the API call", placement.getReferenceId(), (String) null, (String) null, 24, (Object) null);
                this$0.onAdLoadFailed(new T());
                return;
            }
            C1653b c1653b = dVar != null ? (C1653b) dVar.body() : null;
            if ((c1653b != null ? c1653b.adUnit() : null) != null) {
                this$0.handleAdMetaData$vungle_ads_release(c1653b, new e0(Sdk$SDKMetric.b.CONFIG_LOADED_FROM_AD_LOAD));
            } else {
                C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 215, "Ad response is empty.", placement.getReferenceId(), (String) null, (String) null, 24, (Object) null);
                this$0.onAdLoadFailed(new T());
            }
        }

        @Override // com.vungle.ads.internal.network.b
        public void onFailure(com.vungle.ads.internal.network.a<C1653b> aVar, Throwable th) {
            d.this.getSdkExecutors().getBackgroundExecutor().execute(new h(d.this, th, this.$placement, 15));
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(com.vungle.ads.internal.network.a<C1653b> aVar, com.vungle.ads.internal.network.d<C1653b> dVar) {
            d.this.getSdkExecutors().getBackgroundExecutor().execute(new N.d(d.this, this.$placement, dVar, 8));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, com.vungle.ads.internal.network.g vungleApiClient, com.vungle.ads.internal.executor.a sdkExecutors, C2069b omInjector, com.vungle.ads.internal.downloader.d downloader, com.vungle.ads.internal.util.l pathProvider, b adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        l.f(context, "context");
        l.f(vungleApiClient, "vungleApiClient");
        l.f(sdkExecutors, "sdkExecutors");
        l.f(omInjector, "omInjector");
        l.f(downloader, "downloader");
        l.f(pathProvider, "pathProvider");
        l.f(adRequest, "adRequest");
    }

    private final void fetchAdMetadata(i0 i0Var, C1661j c1661j) throws IllegalStateException {
        if (getVungleApiClient().checkIsRetryAfterActive(c1661j.getReferenceId())) {
            onAdLoadFailed(new C4051i().logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.network.a<C1653b> aVarRequestAd = getVungleApiClient().requestAd(c1661j.getReferenceId(), i0Var);
        if (aVarRequestAd == null) {
            onAdLoadFailed(new C4048f());
        } else {
            aVarRequestAd.enqueue(new a(c1661j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k0 retrofitToVungleError(Throwable th) {
        return th instanceof UnknownHostException ? new C4048f() : th instanceof SocketTimeoutException ? new C(k0.NETWORK_TIMEOUT, null, 2, null) : th instanceof IOException ? new C(k0.NETWORK_ERROR, null, 2, null) : new C4048f();
    }

    @Override // com.vungle.ads.internal.load.c
    public void requestAd() throws IllegalStateException {
        fetchAdMetadata(getAdRequest().getRequestAdSize(), getAdRequest().getPlacement());
    }

    @Override // com.vungle.ads.internal.load.c
    public void onAdLoadReady() {
    }
}
