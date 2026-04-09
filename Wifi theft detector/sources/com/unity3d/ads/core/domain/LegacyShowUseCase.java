package com.unity3d.ads.core.domain;

import androidx.core.app.NotificationCompat;
import c9.c;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.e1;
import kotlinx.coroutines.flow.t0;
import l9.p;
import l9.q;
import l9.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.xbill.DNS.WKSRecord;
import t9.i;
import y8.s;
import z8.h0;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 R2\u00020\u0001:\u0001RB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010$\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b$\u0010\u001aJ'\u0010%\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010\u001aJ\u0019\u0010(\u001a\u0004\u0018\u00010\u00142\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010,JG\u00101\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b1\u00102Jj\u00107\u001a:\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001806\u0012\u0006\u0012\u0004\u0018\u00010\u0001032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b7\u00108J7\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140<2\u0006\u00109\u001a\u00020\u00142\b\u0010:\u001a\u0004\u0018\u0001052\b\u0010;\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\b?\u0010@J/\u0010A\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0017\u001a\u00020\u0016H\u0086Bø\u0001\u0000¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ER\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010FR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010GR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010MR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010OR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010PR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010Q\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006S"}, d2 = {"Lcom/unity3d/ads/core/domain/LegacyShowUseCase;", "", "Lcom/unity3d/ads/core/domain/Show;", "show", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getInitializationState", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "safeCallbackInvoke", "<init>", "(Lcom/unity3d/ads/core/domain/Show;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;)V", "Lt9/i;", "startTime", "", "placement", "Lcom/unity3d/ads/core/data/model/Listeners;", "listeners", "Ly8/s;", "bannerLeftApplication", "(Lt9/i;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/Listeners;)V", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;", "operativeEvent", "operativeMessage", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "sendOperativeError", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lc9/c;)Ljava/lang/Object;", "cancelTimeout", "(Lt9/i;)V", "showStarted", "showClicked", "Lcom/unity3d/ads/UnityAdsShowOptions;", "unityAdsShowOptions", "getOpportunityId", "(Lcom/unity3d/ads/UnityAdsShowOptions;)Ljava/lang/String;", "opportunityId", "showStart", "(Ljava/lang/String;)V", "Lcom/unity3d/ads/adplayer/model/ShowStatus;", NotificationCompat.CATEGORY_STATUS, "reason", "reasonDebug", "showCompleted", "(Lt9/i;Ljava/lang/String;Lcom/unity3d/ads/adplayer/model/ShowStatus;Lcom/unity3d/ads/core/data/model/Listeners;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function6;", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "", "Lc9/c;", "showError", "(Lt9/i;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/Listeners;)Ll9/t;", "diagnosticReason", "code", "debugMessage", "", "getTags", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/Map;", "getTmpAdObject", "(Ljava/lang/String;)Lcom/unity3d/ads/core/data/model/AdObject;", "invoke", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;Lcom/unity3d/ads/core/data/model/Listeners;Lc9/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/Show;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "Lkotlinx/coroutines/flow/t0;", "", "hasStarted", "Lkotlinx/coroutines/flow/t0;", "timeoutCancellationRequested", "Lcom/unity3d/ads/core/data/model/AdObject;", "Ljava/lang/String;", "Lcom/unity3d/ads/UnityAdsShowOptions;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLegacyShowUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyShowUseCase.kt\ncom/unity3d/ads/core/domain/LegacyShowUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OperativeEventErrorDataKt.kt\ngatewayprotocol/v1/OperativeEventErrorDataKtKt\n*L\n1#1,369:1\n1#2:370\n1#2:372\n10#3:371\n*S KotlinDebug\n*F\n+ 1 LegacyShowUseCase.kt\ncom/unity3d/ads/core/domain/LegacyShowUseCase\n*L\n240#1:372\n240#1:371\n*E\n"})
/* loaded from: classes3.dex */
public final class LegacyShowUseCase {

    @NotNull
    public static final String KEY_OBJECT_ID = "objectId";

    @NotNull
    public static final String MESSAGE_AD_OBJECT_EXPIRED = "The ad has expired";

    @NotNull
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";

    @NotNull
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";

    @NotNull
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";

    @NotNull
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";

    @NotNull
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";

    @NotNull
    public static final String MESSAGE_PLACEMENT_NOT_LOADED = "Placement %s must be Loaded before calling Show";

    @NotNull
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";

    @NotNull
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;

    @Nullable
    private AdObject adObject;

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final GetInitializationState getInitializationState;

    @NotNull
    private final GetOperativeEventApi getOperativeEventApi;

    @NotNull
    private final t0 hasStarted;

    @Nullable
    private String placement;

    @NotNull
    private final SafeCallbackInvoke safeCallbackInvoke;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final Show show;

    @NotNull
    private final t0 timeoutCancellationRequested;

    @Nullable
    private UnityAdsShowOptions unityAdsShowOptions;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", i = {5, 5, 9}, l = {117, 122, 128, 133, WKSRecord.Service.EMFIS_CNTL, 146, 152, 159, 164, 195}, m = "invoke", n = {"this", "opportunityIdByteString", "isBanner"}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyShowUseCase.this.invoke(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Ly8/s;", "close", "<anonymous>", "(Ll9/a;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", i = {0, 1, 2}, l = {178, 184, 185}, m = "invokeSuspend", n = {"close", "close", "close"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ boolean $isBanner;
        final /* synthetic */ String $placement;
        final /* synthetic */ t $reportShowError;
        final /* synthetic */ boolean $useTimeout;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z10, AdObject adObject, boolean z11, t tVar, String str, c cVar) {
            super(2, cVar);
            this.$isBanner = z10;
            this.$adObject = adObject;
            this.$useTimeout = z11;
            this.$reportShowError = tVar;
            this.$placement = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            AnonymousClass2 anonymousClass2 = LegacyShowUseCase.this.new AnonymousClass2(this.$isBanner, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r10.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r10.L$0
                l9.a r0 = (l9.a) r0
                kotlin.c.b(r11)
                goto Lb5
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                java.lang.Object r1 = r10.L$0
                l9.a r1 = (l9.a) r1
                kotlin.c.b(r11)
                goto L8d
            L2a:
                java.lang.Object r1 = r10.L$0
                l9.a r1 = (l9.a) r1
                kotlin.c.b(r11)
                goto L76
            L32:
                kotlin.c.b(r11)
                java.lang.Object r11 = r10.L$0
                r1 = r11
                l9.a r1 = (l9.a) r1
                com.unity3d.ads.core.domain.LegacyShowUseCase r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                kotlinx.coroutines.flow.t0 r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getHasStarted$p(r11)
                java.lang.Object r11 = r11.getValue()
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 != 0) goto Lbb
                com.unity3d.ads.core.domain.LegacyShowUseCase r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                kotlinx.coroutines.flow.t0 r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getTimeoutCancellationRequested$p(r11)
                java.lang.Object r11 = r11.getValue()
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 != 0) goto Lbb
                boolean r11 = r10.$isBanner
                if (r11 == 0) goto L63
                goto Lbb
            L63:
                com.unity3d.ads.core.domain.LegacyShowUseCase r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r5 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT
                com.unity3d.ads.core.data.model.AdObject r6 = r10.$adObject
                r10.L$0 = r1
                r10.label = r4
                java.lang.String r4 = "timeout"
                java.lang.Object r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$sendOperativeError(r11, r5, r4, r6, r10)
                if (r11 != r0) goto L76
                goto Lb3
            L76:
                boolean r11 = r10.$useTimeout
                if (r11 == 0) goto Lb8
                com.unity3d.ads.core.domain.LegacyShowUseCase r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                com.unity3d.ads.core.domain.Show r11 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getShow$p(r11)
                com.unity3d.ads.core.data.model.AdObject r4 = r10.$adObject
                r10.L$0 = r1
                r10.label = r3
                java.lang.Object r11 = r11.terminate(r4, r10)
                if (r11 != r0) goto L8d
                goto Lb3
            L8d:
                l9.t r3 = r10.$reportShowError
                com.unity3d.ads.UnityAds$UnityAdsShowError r5 = com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r4 = "[UnityAds] Timeout while trying to show "
                r11.append(r4)
                java.lang.String r4 = r10.$placement
                r11.append(r4)
                java.lang.String r6 = r11.toString()
                r10.L$0 = r1
                r10.label = r2
                java.lang.String r4 = "timeout"
                r7 = 0
                r8 = 0
                r9 = r10
                java.lang.Object r11 = r3.invoke(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto Lb4
            Lb3:
                return r0
            Lb4:
                r0 = r1
            Lb5:
                r0.invoke()
            Lb8:
                y8.s r11 = y8.s.f25199a
                return r11
            Lbb:
                y8.s r11 = y8.s.f25199a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull l9.a aVar, @Nullable c cVar) {
            return ((AnonymousClass2) create(aVar, cVar)).invokeSuspend(s.f25199a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/c;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "", "it", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/c;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements q {
        final /* synthetic */ boolean $isBanner;
        final /* synthetic */ t $reportShowError;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(t tVar, boolean z10, c cVar) {
            super(3, cVar);
            this.$reportShowError = tVar;
            this.$isBanner = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AnonymousClass3 anonymousClass3;
            Object objF = kotlin.coroutines.intrinsics.a.f();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                Throwable th = (Throwable) this.L$0;
                t tVar = this.$reportShowError;
                UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
                this.label = 1;
                anonymousClass3 = this;
                if (tVar.invoke("uncaught_exception", unityAdsShowError, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, anonymousClass3) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                anonymousClass3 = this;
            }
            if (!anonymousClass3.$isBanner) {
                LegacyShowUseCase.isFullscreenAdShowing = false;
            }
            return s.f25199a;
        }

        @Override // l9.q
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.c cVar, @NotNull Throwable th, @Nullable c cVar2) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$reportShowError, this.$isBanner, cVar2);
            anonymousClass3.L$0 = th;
            return anonymousClass3.invokeSuspend(s.f25199a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", "Ly8/s;", "emit", "(Lcom/unity3d/ads/core/data/model/ShowEvent;Lc9/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4, reason: invalid class name */
    public static final class AnonymousClass4<T> implements kotlinx.coroutines.flow.c {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        final /* synthetic */ t $reportShowError;
        final /* synthetic */ long $startTime;

        public AnonymousClass4(long j10, String str, Listeners listeners, AdObject adObject, t tVar) {
            this.$startTime = j10;
            this.$placement = str;
            this.$listeners = listeners;
            this.$adObject = adObject;
            this.$reportShowError = tVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x010d, code lost:
        
            if (r4.invoke(r2, r6, r7, r8, r9, r10) == r3) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        @Override // kotlinx.coroutines.flow.c
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(@org.jetbrains.annotations.NotNull com.unity3d.ads.core.data.model.ShowEvent r19, @org.jetbrains.annotations.NotNull c9.c r20) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
            /*
                Method dump skipped, instructions count: 313
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass4.emit(com.unity3d.ads.core.data.model.ShowEvent, c9.c):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "diagnosticReason", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "reason", PglCryptUtils.KEY_MESSAGE, "", "code", "debugMessage", "Ly8/s;", "<anonymous>", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$UnityAdsShowError;Ljava/lang/String;ILjava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25001 extends SuspendLambda implements t {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $opportunityId;
        final /* synthetic */ String $placement;
        final /* synthetic */ i $startTime;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        /* synthetic */ Object L$4;
        int label;
        final /* synthetic */ LegacyShowUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25001(String str, LegacyShowUseCase legacyShowUseCase, String str2, i iVar, Listeners listeners, c cVar) {
            super(6, cVar);
            this.$placement = str;
            this.this$0 = legacyShowUseCase;
            this.$opportunityId = str2;
            this.$startTime = iVar;
            this.$listeners = listeners;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            kotlin.coroutines.intrinsics.a.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            String str = (String) this.L$0;
            final UnityAds.UnityAdsShowError unityAdsShowError = (UnityAds.UnityAdsShowError) this.L$1;
            final String str2 = (String) this.L$2;
            Integer num = (Integer) this.L$3;
            String str3 = (String) this.L$4;
            DeviceLog.debug("Unity Ads Show Failed for placement " + this.$placement);
            AdObject tmpAdObject = this.this$0.adObject;
            if (tmpAdObject == null) {
                tmpAdObject = this.this$0.getTmpAdObject(this.$opportunityId);
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_failure_time", d9.a.b(TimeExtensionsKt.elapsedMillis(this.$startTime)), this.this$0.getTags(str, num, str3), null, tmpAdObject, null, 40, null);
            SafeCallbackInvoke safeCallbackInvoke = this.this$0.safeCallbackInvoke;
            final Listeners listeners = this.$listeners;
            final String str4 = this.$placement;
            safeCallbackInvoke.invoke(new l9.a() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase.showError.1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // l9.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m223invoke();
                    return s.f25199a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m223invoke() {
                    listeners.onError(str4, unityAdsShowError, str2);
                }
            });
            return s.f25199a;
        }

        @Override // l9.t
        @Nullable
        public final Object invoke(@NotNull String str, @NotNull UnityAds.UnityAdsShowError unityAdsShowError, @NotNull String str2, @Nullable Integer num, @Nullable String str3, @Nullable c cVar) {
            C25001 c25001 = new C25001(this.$placement, this.this$0, this.$opportunityId, this.$startTime, this.$listeners, cVar);
            c25001.L$0 = str;
            c25001.L$1 = unityAdsShowError;
            c25001.L$2 = str2;
            c25001.L$3 = num;
            c25001.L$4 = str3;
            return c25001.invokeSuspend(s.f25199a);
        }
    }

    public LegacyShowUseCase(@NotNull Show show, @NotNull AdRepository adRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetOperativeEventApi getOperativeEventApi, @NotNull GetInitializationState getInitializationState, @NotNull SessionRepository sessionRepository, @NotNull SafeCallbackInvoke safeCallbackInvoke) {
        kotlin.jvm.internal.p.e(show, "show");
        kotlin.jvm.internal.p.e(adRepository, "adRepository");
        kotlin.jvm.internal.p.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.p.e(getOperativeEventApi, "getOperativeEventApi");
        kotlin.jvm.internal.p.e(getInitializationState, "getInitializationState");
        kotlin.jvm.internal.p.e(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.p.e(safeCallbackInvoke, "safeCallbackInvoke");
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        Boolean bool = Boolean.FALSE;
        this.hasStarted = e1.a(bool);
        this.timeoutCancellationRequested = e1.a(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerLeftApplication(i startTime, String placement, Listeners listeners) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Show Left Application for placement " + placement);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_left_app", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), null, null, this.adObject, null, 44, null);
        listeners.onLeftApplication(placement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeout(i startTime) {
        this.timeoutCancellationRequested.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), null, null, this.adObject, null, 44, null);
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions) throws IllegalArgumentException {
        Object objOpt;
        String string;
        JSONObject data = unityAdsShowOptions.getData();
        if (data == null || (objOpt = data.opt("objectId")) == null || (string = objOpt.toString()) == null) {
            return null;
        }
        return UUID.fromString(string).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(String diagnosticReason, Integer code, String debugMessage) {
        Map<String, String> mapM = kotlin.collections.a.m(y8.i.a("operation", OperationType.SHOW.toString()), y8.i.a("reason", diagnosticReason));
        if (code != null) {
            mapM.put("reason_code", String.valueOf(code.intValue()));
        }
        if (debugMessage != null) {
            mapM.put("reason_debug", debugMessage);
        }
        return mapM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(String opportunityId) {
        UUID uuidFromString = UUID.fromString(opportunityId);
        kotlin.jvm.internal.p.d(uuidFromString, "fromString(opportunityId)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(uuidFromString);
        AdObject ad = this.adRepository.getAd(byteString);
        if (ad != null) {
            return ad;
        }
        String str = this.placement;
        if (str == null) {
            str = "";
        }
        ByteString EMPTY = ByteString.EMPTY;
        kotlin.jvm.internal.p.d(EMPTY, "EMPTY");
        return new AdObject(byteString, str, EMPTY, false, null, null, null, false, null, null, null, new UnityAdsLoadOptions(), false, DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_UNSPECIFIED, null, null, 50680, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendOperativeError(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, c cVar) {
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.INSTANCE;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        kotlin.jvm.internal.p.d(builderNewBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setErrorType(operativeEventErrorType);
        dsl_create.setMessage(str);
        OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData_build = dsl_create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        ByteString byteString = operativeEventErrorData_build.toByteString();
        kotlin.jvm.internal.p.d(byteString, "errorData.toByteString()");
        Object objInvoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, cVar);
        return objInvoke == kotlin.coroutines.intrinsics.a.f() ? objInvoke : s.f25199a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showClicked(i startTime, final String placement, final Listeners listeners) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Show Clicked for placement " + placement);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_clicked", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new l9.a() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase.showClicked.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m221invoke();
                return s.f25199a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m221invoke() {
                listeners.onClick(placement);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCompleted(i startTime, final String placement, final ShowStatus status, final Listeners listeners, String reason, String reasonDebug) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Show Completed for placement " + placement);
        Map mapC = h0.c();
        if (reason != null) {
        }
        if (reasonDebug != null) {
            mapC.put("reason_debug", reasonDebug);
        }
        Map mapB = h0.b(mapC);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), mapB, null, this.adObject, null, 40, null);
        this.safeCallbackInvoke.invoke(new l9.a() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase.showCompleted.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m222invoke();
                return s.f25199a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m222invoke() {
                Listeners listeners2 = listeners;
                String str = placement;
                ShowStatus showStatus = status;
                NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = this.sessionRepository.getNativeConfiguration().getDefaultShowCompletionState();
                kotlin.jvm.internal.p.d(defaultShowCompletionState, "sessionRepository.native…efaultShowCompletionState");
                listeners2.onComplete(str, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(showStatus, defaultShowCompletionState));
            }
        });
    }

    public static /* synthetic */ void showCompleted$default(LegacyShowUseCase legacyShowUseCase, i iVar, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3, int i10, Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        if ((i10 & 32) != 0) {
            str3 = null;
        }
        legacyShowUseCase.showCompleted(iVar, str, showStatus, listeners, str2, str3);
    }

    private final t showError(i startTime, String placement, String opportunityId, Listeners listeners) {
        return new C25001(placement, this, opportunityId, startTime, listeners, null);
    }

    private final void showStart(String opportunityId) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_started", null, null, null, getTmpAdObject(opportunityId), null, 46, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStarted(i startTime, final String placement, final Listeners listeners) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Show WV Start for placement " + placement);
        this.hasStarted.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_wv_started", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new l9.a() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase.showStarted.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m224invoke();
                return s.f25199a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m224invoke() {
                listeners.onStart(placement);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0236, code lost:
    
        if (r6.invoke("ad_player_scope_not_active", r6, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, r10) == r11) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0259, code lost:
    
        if (r6.invoke("already_showing", r6, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_ALREADY_SHOWING, null, null, r10) == r11) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x028a, code lost:
    
        if (r6.invoke("placement_validation", r6, com.unity3d.ads.core.domain.LegacyShowUseCase.MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING, null, null, r10) == r11) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0130, code lost:
    
        if (r6.invoke("not_initialized", r6, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, null, r10) == r11) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0149, code lost:
    
        if (r6.invoke("placement_null", r6, com.unity3d.ads.core.data.model.LoadResult.MSG_PLACEMENT_NULL, null, null, r10) == r11) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0176, code lost:
    
        if (r6.invoke("no_opportunity_id", r6, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_OPPORTUNITY_ID, null, r9, r10) == r11) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a3, code lost:
    
        if (r6.invoke("placement_not_loaded", r6, r7, null, null, r10) == r11) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e1, code lost:
    
        if (r6.invoke("ad_object_not_found", r6, r7, null, null, r10) == r11) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.String r24, @org.jetbrains.annotations.Nullable com.unity3d.ads.UnityAdsShowOptions r25, @org.jetbrains.annotations.NotNull com.unity3d.ads.core.data.model.Listeners r26, @org.jetbrains.annotations.NotNull c9.c r27) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.invoke(java.lang.String, com.unity3d.ads.UnityAdsShowOptions, com.unity3d.ads.core.data.model.Listeners, c9.c):java.lang.Object");
    }
}
