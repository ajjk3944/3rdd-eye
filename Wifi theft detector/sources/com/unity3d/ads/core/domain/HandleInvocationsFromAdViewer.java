package com.unity3d.ads.core.domain;

import c9.c;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.adplayer.Invocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.network.model.RequestType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t;
import kotlinx.coroutines.flow.b;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.x0;
import l9.l;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.i;
import y8.s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0011\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "Lcom/unity3d/services/core/di/IServiceComponent;", "<init>", "()V", "Lkotlinx/coroutines/flow/x0;", "Lcom/unity3d/ads/adplayer/Invocation;", "onInvocations", "", HandleInvocationsFromAdViewer.KEY_AD_DATA, HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lkotlin/Function1;", "Lc9/c;", "Ly8/s;", "", "onSubscription", "Lkotlinx/coroutines/flow/b;", "invoke", "(Lkotlinx/coroutines/flow/x0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Ll9/l;)Lkotlinx/coroutines/flow/b;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandleInvocationsFromAdViewer implements IServiceComponent {

    @NotNull
    public static final String KEY_AD_DATA = "adData";

    @NotNull
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";

    @NotNull
    public static final String KEY_AD_STRING = "adString";

    @NotNull
    public static final String KEY_AD_TYPE = "type";

    @NotNull
    public static final String KEY_AD_UNIT_ID = "adUnitId";

    @NotNull
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";

    @NotNull
    public static final String KEY_DOWNLOAD_URL = "url";

    @NotNull
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";

    @NotNull
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";

    @NotNull
    public static final String KEY_LOAD_OPTIONS = "loadOptions";

    @NotNull
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";

    @NotNull
    public static final String KEY_OMID = "openMeasurement";

    @NotNull
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";

    @NotNull
    public static final String KEY_OMJS_SESSION = "sessionFilePath";

    @NotNull
    public static final String KEY_OM_PARTNER = "partnerName";

    @NotNull
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";

    @NotNull
    public static final String KEY_OM_VERSION = "version";

    @NotNull
    public static final String KEY_PACKAGE_NAME = "packageName";

    @NotNull
    public static final String KEY_PLACEMENT_ID = "placementId";

    @NotNull
    public static final String KEY_PLACEMENT_NAME = "placementName";

    @NotNull
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";

    @NotNull
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";

    @NotNull
    public static final String KEY_QUERY_ID = "queryId";

    @NotNull
    public static final String KEY_TRACKING_TOKEN = "trackingToken";

    @NotNull
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/c;", "Lcom/unity3d/ads/adplayer/Invocation;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/c;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p {
        final /* synthetic */ l $onSubscription;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, c cVar) {
            super(2, cVar);
            this.$onSubscription = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            return new AnonymousClass1(this.$onSubscription, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objF = kotlin.coroutines.intrinsics.a.f();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                l lVar = this.$onSubscription;
                this.label = 1;
                if (lVar.invoke(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return s.f25199a;
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.c cVar, @Nullable c cVar2) {
            return ((AnonymousClass1) create(cVar, cVar2)).invokeSuspend(s.f25199a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/unity3d/ads/adplayer/Invocation;", "it", "Ly8/s;", "<anonymous>", "(Lcom/unity3d/ads/adplayer/Invocation;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p {
        final /* synthetic */ Map<String, l9.a> $definition;
        /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements l {
            final /* synthetic */ ExposedFunction $exposedFunction;
            final /* synthetic */ Invocation $it;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ExposedFunction exposedFunction, Invocation invocation, c cVar) {
                super(1, cVar);
                this.$exposedFunction = exposedFunction;
                this.$it = invocation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final c create(@NotNull c cVar) {
                return new AnonymousClass1(this.$exposedFunction, this.$it, cVar);
            }

            @Override // l9.l
            @Nullable
            public final Object invoke(@Nullable c cVar) {
                return ((AnonymousClass1) create(cVar)).invokeSuspend(s.f25199a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objF = kotlin.coroutines.intrinsics.a.f();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    return obj;
                }
                kotlin.c.b(obj);
                ExposedFunction exposedFunction = this.$exposedFunction;
                Object[] parameters = this.$it.getParameters();
                this.label = 1;
                Object objInvoke = exposedFunction.invoke(parameters, this);
                return objInvoke == objF ? objF : objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Map<String, ? extends l9.a> map, c cVar) {
            super(2, cVar);
            this.$definition = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$definition, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull Invocation invocation, @Nullable c cVar) {
            return ((AnonymousClass2) create(invocation, cVar)).invokeSuspend(s.f25199a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ExposedFunction exposedFunction;
            Object objF = kotlin.coroutines.intrinsics.a.f();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                Invocation invocation = (Invocation) this.L$0;
                l9.a aVar = this.$definition.get(invocation.getLocation());
                if (aVar == null || (exposedFunction = (ExposedFunction) aVar.invoke()) == null) {
                    return s.f25199a;
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(exposedFunction, invocation, null);
                this.label = 1;
                if (invocation.handle(anonymousClass1, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return s.f25199a;
        }
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @NotNull
    public final b invoke(@NotNull x0 onInvocations, @NotNull String adData, @NotNull String adDataRefreshToken, @NotNull String impressionConfig, @NotNull final AdObject adObject, @NotNull l onSubscription) {
        kotlin.jvm.internal.p.e(onInvocations, "onInvocations");
        kotlin.jvm.internal.p.e(adData, "adData");
        kotlin.jvm.internal.p.e(adDataRefreshToken, "adDataRefreshToken");
        kotlin.jvm.internal.p.e(impressionConfig, "impressionConfig");
        kotlin.jvm.internal.p.e(adObject, "adObject");
        kotlin.jvm.internal.p.e(onSubscription, "onSubscription");
        final String strM194constructorimpl = AdData.m194constructorimpl(adData);
        final String strM208constructorimpl = ImpressionConfig.m208constructorimpl(impressionConfig);
        final String strM201constructorimpl = AdDataRefreshToken.m201constructorimpl(adDataRefreshToken);
        return d.A(d.C(onInvocations, new AnonymousClass1(onSubscription, null)), new AnonymousClass2(kotlin.collections.a.k(i.a(ExposedFunctionLocation.GET_AD_CONTEXT, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.m225getAdContextyLuu4LI((AndroidGetAdPlayerContext) this.this$0.getServiceProvider().getRegistry().getService("", t.b(AndroidGetAdPlayerContext.class)), strM194constructorimpl, strM208constructorimpl, strM201constructorimpl, (IsOMActivated) this.this$0.getServiceProvider().getRegistry().getService("", t.b(IsOMActivated.class)), adObject);
            }
        }), i.a(ExposedFunctionLocation.GET_CONNECTION_TYPE, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$2
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getConnectionType((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(DeviceInfoRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.GET_DEVICE_VOLUME, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$3
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getDeviceVolume((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(DeviceInfoRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$4
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(DeviceInfoRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.GET_SCREEN_HEIGHT, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$5
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getScreenHeight((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(DeviceInfoRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.GET_SCREEN_WIDTH, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$6
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getScreenWidth((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(DeviceInfoRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.OPEN_URL, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$7
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.openUrl((HandleOpenUrl) this.this$0.getServiceProvider().getRegistry().getService("", t.b(HandleOpenUrl.class)));
            }
        }), i.a(ExposedFunctionLocation.SET_ORIENTATION, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$8
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setOrientation(adObject);
            }
        }), i.a(ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendOperativeEvent((GetOperativeEventApi) this.this$0.getServiceProvider().getRegistry().getService("", t.b(GetOperativeEventApi.class)), adObject);
            }
        }), i.a(ExposedFunctionLocation.STORAGE_WRITE, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$10
            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.writeStorage();
            }
        }), i.a(ExposedFunctionLocation.STORAGE_READ, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$11
            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.readStorage();
            }
        }), i.a(ExposedFunctionLocation.STORAGE_DELETE, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$12
            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.deleteStorage();
            }
        }), i.a(ExposedFunctionLocation.STORAGE_CLEAR, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$13
            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.clearStorage();
            }
        }), i.a(ExposedFunctionLocation.STORAGE_GET_KEYS, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$14
            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getKeysStorage();
            }
        }), i.a(ExposedFunctionLocation.STORAGE_GET, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$15
            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getStorage();
            }
        }), i.a(ExposedFunctionLocation.STORAGE_SET, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$16
            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setStorage();
            }
        }), i.a(ExposedFunctionLocation.GET_PRIVACY_FSM, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$17
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getPrivacyFsm((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.SET_PRIVACY_FSM, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$18
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setPrivacyFsm((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.GET_PRIVACY, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$19
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getPrivacy((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.SET_PRIVACY, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$20
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setPrivacy((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.GET_ALLOWED_PII, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$21
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getAllowedPii((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(DeviceInfoRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.SET_ALLOWED_PII, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$22
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setAllowedPii((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(DeviceInfoRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.GET_SESSION_TOKEN, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$23
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getSessionToken((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$24
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.markCampaignStateShown((CampaignRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(CampaignRepository.class)), adObject);
            }
        }), i.a(ExposedFunctionLocation.REFRESH_AD_DATA, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$25
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.refreshAdData((Refresh) this.this$0.getServiceProvider().getRegistry().getService("", t.b(Refresh.class)), adObject);
            }
        }), i.a(ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$26
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.updateCampaignState((CampaignRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(CampaignRepository.class)), adObject);
            }
        }), i.a(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$27
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.updateTrackingToken(adObject);
            }
        }), i.a(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$28
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest((SendPrivacyUpdateRequest) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SendPrivacyUpdateRequest.class)));
            }
        }), i.a(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$29
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent((SendDiagnosticEvent) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SendDiagnosticEvent.class)), adObject);
            }
        }), i.a(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$30
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.DOWNLOAD, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$31
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.download((CacheFile) this.this$0.getServiceProvider().getRegistry().getService("", t.b(CacheFile.class)), adObject);
            }
        }), i.a(ExposedFunctionLocation.IS_FILE_CACHED, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$32
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isFileCached((GetIsFileCache) this.this$0.getServiceProvider().getRegistry().getService("", t.b(GetIsFileCache.class)));
            }
        }), i.a(ExposedFunctionLocation.OM_START_SESSION, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$33
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omStartSession((AndroidOmInteraction) this.this$0.getServiceProvider().getRegistry().getService("", t.b(AndroidOmInteraction.class)), adObject);
            }
        }), i.a(ExposedFunctionLocation.OM_FINISH_SESSION, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$34
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omFinishSession((OmFinishSession) this.this$0.getServiceProvider().getRegistry().getService("", t.b(OmFinishSession.class)), adObject);
            }
        }), i.a(ExposedFunctionLocation.OM_IMPRESSION, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$35
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omImpression((OmImpressionOccurred) this.this$0.getServiceProvider().getRegistry().getService("", t.b(OmImpressionOccurred.class)), adObject);
            }
        }), i.a(ExposedFunctionLocation.OM_GET_DATA, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$36
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omGetData((GetOmData) this.this$0.getServiceProvider().getRegistry().getService("", t.b(GetOmData.class)));
            }
        }), i.a(ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$37
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isAttributionAvailable((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", t.b(AndroidAttribution.class)));
            }
        }), i.a(ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$38
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.attributionRegisterView((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", t.b(AndroidAttribution.class)), adObject);
            }
        }), i.a(ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$39
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.attributionRegisterClick((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", t.b(AndroidAttribution.class)), adObject);
            }
        }), i.a(ExposedFunctionLocation.LOAD_SCAR_AD, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$40
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.loadScarAd((LoadScarAd) this.this$0.getServiceProvider().getRegistry().getService("", t.b(LoadScarAd.class)), adObject);
            }
        }), i.a(ExposedFunctionLocation.SHOW_SCAR_AD, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$41
            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.showScarAd();
            }
        }), i.a(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$42
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$43
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$44
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenReset((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", t.b(SessionRepository.class)));
            }
        }), i.a(ExposedFunctionLocation.LOAD_OFFERWALL_AD, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$45
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.loadOfferwallAd((LoadOfferwallAd) this.this$0.getServiceProvider().getRegistry().getService("", t.b(LoadOfferwallAd.class)), adObject);
            }
        }), i.a(ExposedFunctionLocation.SHOW_OFFERWALL_AD, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$46
            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.showOfferwallAd();
            }
        }), i.a(ExposedFunctionLocation.IS_OFFERWALL_AD_READY, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$47
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isOfferwallAdReady((GetIsOfferwallAdReady) this.this$0.getServiceProvider().getRegistry().getService("", t.b(GetIsOfferwallAdReady.class)));
            }
        }), i.a(ExposedFunctionLocation.REQUEST_GET, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$48
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.request(RequestType.GET, (ExecuteAdViewerRequest) this.this$0.getServiceProvider().getRegistry().getService("", t.b(ExecuteAdViewerRequest.class)));
            }
        }), i.a(ExposedFunctionLocation.REQUEST_POST, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$49
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.request(RequestType.POST, (ExecuteAdViewerRequest) this.this$0.getServiceProvider().getRegistry().getService("", t.b(ExecuteAdViewerRequest.class)));
            }
        }), i.a(ExposedFunctionLocation.REQUEST_HEAD, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$50
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.request(RequestType.HEAD, (ExecuteAdViewerRequest) this.this$0.getServiceProvider().getRegistry().getService("", t.b(ExecuteAdViewerRequest.class)));
            }
        }), i.a(ExposedFunctionLocation.SET_OPPORTUNITY_TTL, new l9.a() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$51
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setOpportunityTTL(adObject);
            }
        })), null));
    }
}
