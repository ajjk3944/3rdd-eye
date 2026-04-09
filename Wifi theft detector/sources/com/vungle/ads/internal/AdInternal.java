package com.vungle.ads.internal;

import android.content.Context;
import android.content.Intent;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdExpiredOnPlayError;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.AdMarkupJsonError;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.EmptyBidPayloadError;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.InvalidBannerSizeError;
import com.vungle.ads.PlacementAdTypeMismatchError;
import com.vungle.ads.PlacementNotFoundError;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleError;
import com.vungle.ads.a0;
import com.vungle.ads.b0;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.load.AdRequest;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.load.RealtimeAdLoader;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.f;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.task.CleanupJob;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.a;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.y;
import com.vungle.ads.z;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import l9.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q7.a;
import y8.s;
import z8.r;

/* loaded from: classes3.dex */
public abstract class AdInternal implements com.vungle.ads.internal.load.a {

    @NotNull
    private static final String TAG = "AdInternal";
    private static final boolean THROW_ON_ILLEGAL_TRANSITION = false;

    @Nullable
    private com.vungle.ads.internal.load.a adLoaderCallback;

    @NotNull
    private AdState adState;

    @Nullable
    private q7.a advertisement;

    @Nullable
    private BaseAdLoader baseAdLoader;

    @Nullable
    private BidPayload bidPayload;

    @NotNull
    private final Context context;

    @Nullable
    private z loadMetric;

    @Nullable
    private o logEntry;

    @Nullable
    private q7.h placement;

    @Nullable
    private WeakReference<Context> playContext;

    @Nullable
    private z requestMetric;

    @NotNull
    private final z showToValidationMetric;

    @NotNull
    private final z validationToPresentMetric;

    @NotNull
    private final y8.h vungleApiClient$delegate;

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final z9.a json = z9.k.b(null, new l() { // from class: com.vungle.ads.internal.AdInternal$Companion$json$1
        @Override // l9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((z9.c) obj);
            return s.f25199a;
        }

        public final void invoke(@NotNull z9.c Json) {
            p.e(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
        }
    }, 1, null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H&J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState;", "", "(Ljava/lang/String;I)V", "canTransitionTo", "", "adState", "isTerminalState", "transitionTo", "NEW", "LOADING", "READY", "PLAYING", "FINISHED", "ERROR", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AdState {
        public static final AdState NEW = new NEW("NEW", 0);
        public static final AdState LOADING = new LOADING("LOADING", 1);
        public static final AdState READY = new READY("READY", 2);
        public static final AdState PLAYING = new PLAYING("PLAYING", 3);
        public static final AdState FINISHED = new FINISHED("FINISHED", 4);
        public static final AdState ERROR = new ERROR("ERROR", 5);
        private static final /* synthetic */ AdState[] $VALUES = $values();

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$ERROR;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class ERROR extends AdState {
            public ERROR(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(@NotNull AdState adState) {
                p.e(adState, "adState");
                return adState == AdState.FINISHED;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$FINISHED;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class FINISHED extends AdState {
            public FINISHED(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(@NotNull AdState adState) {
                p.e(adState, "adState");
                return false;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$LOADING;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class LOADING extends AdState {
            public LOADING(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(@NotNull AdState adState) {
                p.e(adState, "adState");
                return adState == AdState.READY || adState == AdState.ERROR;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$NEW;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class NEW extends AdState {
            public NEW(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(@NotNull AdState adState) {
                p.e(adState, "adState");
                return adState == AdState.LOADING || adState == AdState.READY || adState == AdState.ERROR;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$PLAYING;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class PLAYING extends AdState {
            public PLAYING(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(@NotNull AdState adState) {
                p.e(adState, "adState");
                return adState == AdState.FINISHED || adState == AdState.ERROR;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/AdInternal$AdState$READY;", "Lcom/vungle/ads/internal/AdInternal$AdState;", "canTransitionTo", "", "adState", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class READY extends AdState {
            public READY(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(@NotNull AdState adState) {
                p.e(adState, "adState");
                return adState == AdState.PLAYING || adState == AdState.FINISHED || adState == AdState.ERROR;
            }
        }

        private static final /* synthetic */ AdState[] $values() {
            return new AdState[]{NEW, LOADING, READY, PLAYING, FINISHED, ERROR};
        }

        public /* synthetic */ AdState(String str, int i10, kotlin.jvm.internal.i iVar) {
            this(str, i10);
        }

        public static AdState valueOf(String str) {
            return (AdState) Enum.valueOf(AdState.class, str);
        }

        public static AdState[] values() {
            return (AdState[]) $VALUES.clone();
        }

        public abstract boolean canTransitionTo(@NotNull AdState adState);

        public final boolean isTerminalState() {
            return r.l(FINISHED, ERROR).contains(this);
        }

        @NotNull
        public final AdState transitionTo(@NotNull AdState adState) {
            p.e(adState, "adState");
            if (this == adState || canTransitionTo(adState)) {
                return adState;
            }
            String str = "Cannot transition from " + name() + " to " + adState.name();
            if (AdInternal.THROW_ON_ILLEGAL_TRANSITION) {
                throw new IllegalStateException(str);
            }
            com.vungle.ads.internal.util.p.Companion.e(AdInternal.TAG, "Illegal state transition", new IllegalStateException(str));
            return adState;
        }

        private AdState(String str, int i10) {
        }
    }

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        private static /* synthetic */ void getJson$annotations() {
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdState.values().length];
            iArr[AdState.NEW.ordinal()] = 1;
            iArr[AdState.LOADING.ordinal()] = 2;
            iArr[AdState.READY.ordinal()] = 3;
            iArr[AdState.PLAYING.ordinal()] = 4;
            iArr[AdState.FINISHED.ordinal()] = 5;
            iArr[AdState.ERROR.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class c extends com.vungle.ads.internal.presenter.c {
        final /* synthetic */ AdInternal this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.vungle.ads.internal.presenter.b bVar, AdInternal adInternal) {
            super(bVar);
            this.this$0 = adInternal;
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onAdEnd(@Nullable String str) {
            this.this$0.setAdState(AdState.FINISHED);
            super.onAdEnd(str);
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onAdStart(@Nullable String str) throws Throwable {
            this.this$0.setAdState(AdState.PLAYING);
            this.this$0.getValidationToPresentMetric$vungle_ads_release().markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getValidationToPresentMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            super.onAdStart(str);
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onFailure(@NotNull VungleError error) {
            p.e(error, "error");
            this.this$0.setAdState(AdState.ERROR);
            super.onFailure(error);
        }
    }

    public static final class d extends com.vungle.ads.internal.presenter.a {
        public d(com.vungle.ads.internal.presenter.b bVar, q7.h hVar) {
            super(bVar, hVar);
        }
    }

    public AdInternal(@NotNull final Context context) {
        p.e(context, "context");
        this.context = context;
        this.adState = AdState.NEW;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.vungleApiClient$delegate = kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.AdInternal$special$$inlined$inject$1
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
        this.showToValidationMetric = new z(Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS);
        this.validationToPresentMetric = new z(Sdk$SDKMetric.SDKMetricType.AD_VALIDATION_TO_PRESENT_DURATION_MS);
    }

    /* renamed from: _set_adState_$lambda-1$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.task.c m277_set_adState_$lambda1$lambda0(y8.h hVar) {
        return (com.vungle.ads.internal.task.c) hVar.getValue();
    }

    public static /* synthetic */ VungleError canPlayAd$default(AdInternal adInternal, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canPlayAd");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return adInternal.canPlayAd(z10);
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient$delegate.getValue();
    }

    /* renamed from: loadAd$lambda-2, reason: not valid java name */
    private static final s7.b m278loadAd$lambda2(y8.h hVar) {
        return (s7.b) hVar.getValue();
    }

    /* renamed from: loadAd$lambda-3, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.d m279loadAd$lambda3(y8.h hVar) {
        return (com.vungle.ads.internal.executor.d) hVar.getValue();
    }

    /* renamed from: loadAd$lambda-4, reason: not valid java name */
    private static final q m280loadAd$lambda4(y8.h hVar) {
        return (q) hVar.getValue();
    }

    /* renamed from: loadAd$lambda-5, reason: not valid java name */
    private static final Downloader m281loadAd$lambda5(y8.h hVar) {
        return (Downloader) hVar.getValue();
    }

    /* renamed from: onSuccess$lambda-11$lambda-9, reason: not valid java name */
    private static final com.vungle.ads.internal.network.h m282onSuccess$lambda11$lambda9(y8.h hVar) {
        return (com.vungle.ads.internal.network.h) hVar.getValue();
    }

    public void adLoadedAndUpdateConfigure$vungle_ads_release(@NotNull q7.a advertisement) {
        p.e(advertisement, "advertisement");
    }

    @Nullable
    public final VungleError canPlayAd(boolean z10) {
        VungleError adExpiredOnPlayError;
        a.c cVarAdUnit;
        q7.a aVar = this.advertisement;
        if (aVar == null) {
            adExpiredOnPlayError = new AdNotLoadedCantPlay("adv is null on onPlay=" + z10);
        } else {
            AdState adState = this.adState;
            if (adState == AdState.PLAYING) {
                adExpiredOnPlayError = new InvalidAdStateError(Sdk$SDKError.Reason.AD_IS_PLAYING, "Current ad is playing");
            } else if (adState != AdState.READY) {
                adExpiredOnPlayError = new InvalidAdStateError(Sdk$SDKError.Reason.AD_NOT_LOADED, this.adState + " is not READY");
            } else {
                Integer expiry = null;
                if (aVar == null || !aVar.hasExpired()) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Ad expiry: ");
                q7.a aVar2 = this.advertisement;
                if (aVar2 != null && (cVarAdUnit = aVar2.adUnit()) != null) {
                    expiry = cVarAdUnit.getExpiry();
                }
                sb.append(expiry);
                sb.append(", device: ");
                sb.append(System.currentTimeMillis());
                String string = sb.toString();
                adExpiredOnPlayError = z10 ? new AdExpiredOnPlayError(string) : new AdExpiredError(string);
            }
        }
        if (z10) {
            adExpiredOnPlayError.setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
        }
        return adExpiredOnPlayError;
    }

    public final void cancelDownload$vungle_ads_release() {
        q7.a aVar = this.advertisement;
        if (aVar != null && aVar.isPartialDownloadEnabled()) {
            com.vungle.ads.internal.util.p.Companion.d(TAG, "Skip cancelling download for ads with partial download enabled.");
            return;
        }
        BaseAdLoader baseAdLoader = this.baseAdLoader;
        if (baseAdLoader != null) {
            baseAdLoader.cancel();
        }
    }

    @Nullable
    public abstract a0 getAdSizeForAdRequest();

    @NotNull
    public final AdState getAdState() {
        return this.adState;
    }

    @Nullable
    public final q7.a getAdvertisement() {
        return this.advertisement;
    }

    @Nullable
    public final BidPayload getBidPayload() {
        return this.bidPayload;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final o getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    @Nullable
    public final q7.h getPlacement() {
        return this.placement;
    }

    @NotNull
    public final z getShowToValidationMetric$vungle_ads_release() {
        return this.showToValidationMetric;
    }

    @NotNull
    public final z getValidationToPresentMetric$vungle_ads_release() {
        return this.validationToPresentMetric;
    }

    public final boolean isErrorTerminal$vungle_ads_release(int i10) {
        return this.adState == AdState.READY && i10 == 304;
    }

    public abstract boolean isValidAdSize(@Nullable a0 a0Var);

    public abstract boolean isValidAdTypeForPlacement(@NotNull q7.h hVar);

    public final void loadAd(@NotNull String placementId, @Nullable String str, @NotNull com.vungle.ads.internal.load.a adLoaderCallback) throws Throwable {
        Sdk$SDKError.Reason reason;
        p.e(placementId, "placementId");
        p.e(adLoaderCallback, "adLoaderCallback");
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk$SDKMetric.SDKMetricType.LOAD_AD_API, 0L, this.logEntry, null, 10, null);
        z zVar = new z(Sdk$SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_ADO_DURATION_MS);
        this.loadMetric = zVar;
        zVar.markStart();
        this.adLoaderCallback = adLoaderCallback;
        if (!b0.Companion.isInitialized()) {
            adLoaderCallback.onFailure(new SdkNotInitialized("SDK not initialized").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        ConfigManager configManager = ConfigManager.INSTANCE;
        q7.h placement = configManager.getPlacement(placementId);
        if (placement != null) {
            this.placement = placement;
            if (!isValidAdTypeForPlacement(placement)) {
                adLoaderCallback.onFailure(new PlacementAdTypeMismatchError(placement.getReferenceId()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            } else if (placement.getHeaderBidding() && (str == null || str.length() == 0)) {
                adLoaderCallback.onFailure(new EmptyBidPayloadError(placementId).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
        } else if (configManager.configLastValidatedTimestamp() != -1) {
            adLoaderCallback.onFailure(new PlacementNotFoundError(placementId).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        } else {
            q7.h hVar = new q7.h(placementId, false, (String) null, 6, (kotlin.jvm.internal.i) null);
            this.placement = hVar;
            placement = hVar;
        }
        a0 adSizeForAdRequest = getAdSizeForAdRequest();
        if (!isValidAdSize(adSizeForAdRequest)) {
            adLoaderCallback.onFailure(new InvalidBannerSizeError(adSizeForAdRequest != null ? adSizeForAdRequest.toString() : null).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        AdState adState = this.adState;
        if (adState != AdState.NEW) {
            switch (b.$EnumSwitchMapping$0[adState.ordinal()]) {
                case 1:
                    throw new NotImplementedError(null, 1, null);
                case 2:
                    reason = Sdk$SDKError.Reason.AD_IS_LOADING;
                    break;
                case 3:
                    reason = Sdk$SDKError.Reason.AD_ALREADY_LOADED;
                    break;
                case 4:
                    reason = Sdk$SDKError.Reason.AD_IS_PLAYING;
                    break;
                case 5:
                    reason = Sdk$SDKError.Reason.AD_CONSUMED;
                    break;
                case 6:
                    reason = Sdk$SDKError.Reason.AD_ALREADY_FAILED;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            adLoaderCallback.onFailure(new InvalidAdStateError(reason, this.adState + " state is incorrect for load").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        z zVar2 = new z(Sdk$SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS);
        this.requestMetric = zVar2;
        zVar2.markStart();
        if (str != null && str.length() != 0) {
            try {
                z9.a aVar = json;
                kotlinx.serialization.b bVarB = kotlinx.serialization.f.b(aVar.a(), t.m(BidPayload.class));
                p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                this.bidPayload = (BidPayload) aVar.b(bVarB, str);
            } catch (IllegalArgumentException e10) {
                adLoaderCallback.onFailure(new AdMarkupInvalidError("Unable to decode payload into BidPayload object. Error: " + e10.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            } catch (Throwable th) {
                adLoaderCallback.onFailure(new AdMarkupJsonError(th.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
        }
        setAdState(AdState.LOADING);
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        final Context context = this.context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f21907a;
        y8.h hVarA = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.AdInternal$loadAd$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, s7.b] */
            @Override // l9.a
            @NotNull
            public final s7.b invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(s7.b.class);
            }
        });
        final Context context2 = this.context;
        y8.h hVarA2 = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.AdInternal$loadAd$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.d, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final com.vungle.ads.internal.executor.d invoke() {
                return ServiceLocator.Companion.getInstance(context2).getService(com.vungle.ads.internal.executor.d.class);
            }
        });
        final Context context3 = this.context;
        y8.h hVarA3 = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.AdInternal$loadAd$$inlined$inject$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.q, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final q invoke() {
                return ServiceLocator.Companion.getInstance(context3).getService(q.class);
            }
        });
        final Context context4 = this.context;
        y8.h hVarA4 = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.AdInternal$loadAd$$inlined$inject$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.downloader.Downloader, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final Downloader invoke() {
                return ServiceLocator.Companion.getInstance(context4).getService(Downloader.class);
            }
        });
        if (str == null || str.length() == 0) {
            this.baseAdLoader = new com.vungle.ads.internal.load.h(this.context, getVungleApiClient(), m279loadAd$lambda3(hVarA2), m278loadAd$lambda2(hVarA), m281loadAd$lambda5(hVarA4), m280loadAd$lambda4(hVarA3), new AdRequest(placement, null, adSizeForAdRequest));
        } else {
            this.baseAdLoader = new RealtimeAdLoader(this.context, getVungleApiClient(), m279loadAd$lambda3(hVarA2), m278loadAd$lambda2(hVarA), m281loadAd$lambda5(hVarA4), m280loadAd$lambda4(hVarA3), new AdRequest(placement, this.bidPayload, adSizeForAdRequest));
        }
        BaseAdLoader baseAdLoader = this.baseAdLoader;
        if (baseAdLoader != null) {
            baseAdLoader.setLogEntry$vungle_ads_release(this.logEntry);
        }
        BaseAdLoader baseAdLoader2 = this.baseAdLoader;
        if (baseAdLoader2 != null) {
            baseAdLoader2.loadAd(this);
        }
    }

    @Override // com.vungle.ads.internal.load.a
    public void onFailure(@NotNull VungleError error) throws Throwable {
        p.e(error, "error");
        setAdState(AdState.ERROR);
        z zVar = this.loadMetric;
        if (zVar != null) {
            zVar.setMetricType(Sdk$SDKMetric.SDKMetricType.AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS);
            zVar.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(zVar, this.logEntry, error.getCode() + '-' + error.getErrorMessage());
        }
        com.vungle.ads.internal.load.a aVar = this.adLoaderCallback;
        if (aVar != null) {
            aVar.onFailure(error);
        }
    }

    @Override // com.vungle.ads.internal.load.a
    public void onSuccess(@NotNull q7.a advertisement) throws Throwable {
        p.e(advertisement, "advertisement");
        this.advertisement = advertisement;
        setAdState(AdState.READY);
        adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        com.vungle.ads.internal.load.a aVar = this.adLoaderCallback;
        if (aVar != null) {
            aVar.onSuccess(advertisement);
        }
        z zVar = this.loadMetric;
        if (zVar != null) {
            if (!advertisement.adLoadOptimizationEnabled()) {
                zVar.setMetricType(Sdk$SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_DURATION_MS);
            }
            zVar.markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, zVar, this.logEntry, (String) null, 4, (Object) null);
        }
        z zVar2 = this.requestMetric;
        if (zVar2 != null) {
            if (!advertisement.adLoadOptimizationEnabled()) {
                zVar2.setMetricType(Sdk$SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_DURATION_MS);
            }
            zVar2.markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, zVar2, this.logEntry, (String) null, 4, (Object) null);
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            final Context context = this.context;
            y8.h hVarA = kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.AdInternal$onSuccess$lambda-11$$inlined$inject$1
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
            List tpatUrls$default = q7.a.getTpatUrls$default(advertisement, com.vungle.ads.internal.b.AD_LOAD_DURATION, String.valueOf(zVar2.getValue()), null, 4, null);
            if (tpatUrls$default != null) {
                Iterator it = tpatUrls$default.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.h.sendTpat$default(m282onSuccess$lambda11$lambda9(hVarA), new f.a((String) it.next()).tpatKey(com.vungle.ads.internal.b.AD_LOAD_DURATION).withLogEntry(this.logEntry).build(), false, 2, null);
                }
            }
        }
    }

    public final void play(@Nullable Context context, @NotNull com.vungle.ads.internal.presenter.b adPlayCallback) throws Throwable {
        p.e(adPlayCallback, "adPlayCallback");
        this.showToValidationMetric.markStart();
        this.playContext = context != null ? new WeakReference<>(context) : null;
        VungleError vungleErrorCanPlayAd = canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            adPlayCallback.onFailure(vungleErrorCanPlayAd);
            if (isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                setAdState(AdState.ERROR);
                return;
            }
            return;
        }
        q7.a aVar = this.advertisement;
        if (aVar == null) {
            return;
        }
        c cVar = new c(adPlayCallback, this);
        cancelDownload$vungle_ads_release();
        renderAd$vungle_ads_release(cVar, aVar);
    }

    public void renderAd$vungle_ads_release(@Nullable com.vungle.ads.internal.presenter.b bVar, @NotNull q7.a advertisement) throws Throwable {
        Context context;
        p.e(advertisement, "advertisement");
        AdActivity.Companion aVar = AdActivity.INSTANCE;
        aVar.setEventListener$vungle_ads_release(new d(bVar, this.placement));
        aVar.setAdvertisement$vungle_ads_release(advertisement);
        aVar.setBidPayload$vungle_ads_release(this.bidPayload);
        WeakReference<Context> weakReference = this.playContext;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = this.context;
        }
        p.d(context, "playContext?.get() ?: context");
        q7.h hVar = this.placement;
        if (hVar == null) {
            return;
        }
        Intent intentCreateIntent = aVar.createIntent(context, hVar.getReferenceId(), advertisement.eventId());
        a.C0373a c0373a = com.vungle.ads.internal.util.a.Companion;
        if (!c0373a.isForeground()) {
            com.vungle.ads.internal.util.p.Companion.d(TAG, "The ad activity is in background on play, log AD_VISIBILITY_INVISIBLE.");
            intentCreateIntent.putExtra(AdActivity.AD_INVISIBLE_LOGGED_KEY, true);
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            y yVar = new y(Sdk$SDKMetric.SDKMetricType.AD_VISIBILITY);
            yVar.setValue(1L);
            AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, yVar, this.logEntry, (String) null, 4, (Object) null);
        }
        this.showToValidationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.showToValidationMetric, this.logEntry, (String) null, 4, (Object) null);
        this.validationToPresentMetric.markStart();
        c0373a.startWhenForeground(context, null, intentCreateIntent, null);
    }

    public final void setAdState(@NotNull AdState value) {
        q7.a aVar;
        String strEventId;
        p.e(value, "value");
        if (value.isTerminalState() && (aVar = this.advertisement) != null && (strEventId = aVar.eventId()) != null) {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            final Context context = this.context;
            m277_set_adState_$lambda1$lambda0(kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.AdInternal$_set_adState_$lambda-1$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.c, java.lang.Object] */
                @Override // l9.a
                @NotNull
                public final com.vungle.ads.internal.task.c invoke() {
                    return ServiceLocator.Companion.getInstance(context).getService(com.vungle.ads.internal.task.c.class);
                }
            })).execute(CleanupJob.Companion.makeJobInfo(strEventId));
        }
        this.adState = this.adState.transitionTo(value);
    }

    public final void setAdvertisement(@Nullable q7.a aVar) {
        this.advertisement = aVar;
    }

    public final void setBidPayload(@Nullable BidPayload bidPayload) {
        this.bidPayload = bidPayload;
    }

    public final void setLogEntry$vungle_ads_release(@Nullable o oVar) {
        this.logEntry = oVar;
    }

    public final void setPlacement(@Nullable q7.h hVar) {
        this.placement = hVar;
    }
}
