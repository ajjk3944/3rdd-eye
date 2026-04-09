package com.unity3d.ads.adplayer;

import android.util.Base64;
import androidx.annotation.CallSuper;
import androidx.core.app.NotificationCompat;
import c9.c;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent;
import com.unity3d.ads.adplayer.model.OnAllowedPiiChangeEvent;
import com.unity3d.ads.adplayer.model.OnBroadcastEvent;
import com.unity3d.ads.adplayer.model.OnFocusChangeEvent;
import com.unity3d.ads.adplayer.model.OnGmaEvent;
import com.unity3d.ads.adplayer.model.OnMuteChangeEvent;
import com.unity3d.ads.adplayer.model.OnOfferwallEvent;
import com.unity3d.ads.adplayer.model.OnPrivacyFsmChangeEvent;
import com.unity3d.ads.adplayer.model.OnScarBannerEvent;
import com.unity3d.ads.adplayer.model.OnStorageEvent;
import com.unity3d.ads.adplayer.model.OnUserConsentChangeEvent;
import com.unity3d.ads.adplayer.model.OnVisibilityChangeEvent;
import com.unity3d.ads.adplayer.model.OnVolumeChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEventInfo;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.e1;
import kotlinx.coroutines.flow.s0;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.flow.x0;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k0;
import l9.l;
import l9.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import y8.s;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001c\u001a\u00020\u00152\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\u00152\u0006\u0010!\u001a\u00020$H\u0096@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020\u00152\u0006\u0010!\u001a\u00020'H\u0096@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001b\u0010/\u001a\u00020\u00152\u0006\u0010.\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0004\b/\u0010-J\u001b\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u0010-J\u0013\u00102\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001b\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204H\u0096@ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001b\u0010:\u001a\u00020\u00152\u0006\u00109\u001a\u000208H\u0096@ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u00020\u00152\u0006\u00109\u001a\u000208H\u0096@ø\u0001\u0000¢\u0006\u0004\b<\u0010;J\u001b\u0010=\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u00020\u00152\u0006\u00109\u001a\u000208H\u0096@ø\u0001\u0000¢\u0006\u0004\b?\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020*0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u00150K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR \u0010X\u001a\b\u0012\u0004\u0012\u00020W0V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R \u0010]\u001a\b\u0012\u0004\u0012\u00020\\0V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010Y\u001a\u0004\b^\u0010[R \u0010`\u001a\b\u0012\u0004\u0012\u00020_0V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010Y\u001a\u0004\ba\u0010[R \u0010c\u001a\b\u0012\u0004\u0012\u00020b0V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010Y\u001a\u0004\bd\u0010[R\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00190V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010Y\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006f"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "bridge", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "webViewContainer", "Lkotlinx/coroutines/j0;", "adPlayerScope", "<init>", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/adplayer/WebViewContainer;Lkotlinx/coroutines/j0;)V", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "getEvent", "Ly8/s;", "sendEvent", "(Ll9/a;Lc9/c;)Ljava/lang/Object;", "", "", "", "unityAdsShowOptions", "requestShow", "(Ljava/util/Map;Lc9/c;)Ljava/lang/Object;", "dispatchShowCompleted", "()V", "Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", NotificationCompat.CATEGORY_EVENT, "sendScarBannerEvent", "(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lc9/c;)Ljava/lang/Object;", "Lcom/unity3d/scar/adapter/common/GMAEvent;", "sendGmaEvent", "(Lcom/unity3d/scar/adapter/common/GMAEvent;Lc9/c;)Ljava/lang/Object;", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "sendOfferwallEvent", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lc9/c;)Ljava/lang/Object;", "", "isMuted", "sendMuteChange", "(ZLc9/c;)Ljava/lang/Object;", "isVisible", "sendVisibilityChange", "isFocused", "sendFocusChange", "sendActivityDestroyed", "(Lc9/c;)Ljava/lang/Object;", "", "volume", "sendVolumeChange", "(DLc9/c;)Ljava/lang/Object;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "sendUserConsentChange", "([BLc9/c;)Ljava/lang/Object;", "sendPrivacyFsmChange", "onBroadcastEvent", "(Ljava/lang/String;Lc9/c;)Ljava/lang/Object;", "onAllowedPiiChange", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/WebViewContainer;", "Lkotlinx/coroutines/flow/t0;", "isCompletedManually", "Lkotlinx/coroutines/flow/t0;", "Lkotlin/Function1;", "Lcom/unity3d/services/core/device/StorageEventInfo;", "storageEventCallback", "Ll9/l;", "Lkotlinx/coroutines/g0;", "scopeCancellationHandler", "Lkotlinx/coroutines/g0;", "scope", "Lkotlinx/coroutines/j0;", "getScope", "()Lkotlinx/coroutines/j0;", "Lkotlinx/coroutines/flow/b;", "Lcom/unity3d/ads/core/data/model/ScarEvent$Show;", "onScarEvent", "Lkotlinx/coroutines/flow/b;", "getOnScarEvent", "()Lkotlinx/coroutines/flow/b;", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent$Show;", "onOfferwallEvent", "getOnOfferwallEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "onShowEvent", "getOnShowEvent", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "onLoadEvent", "getOnLoadEvent", "onBroadcastEvents", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebViewAdPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/WebViewAdPlayer\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,277:1\n49#2,4:278\n20#3:282\n22#3:286\n47#3:287\n49#3:291\n20#3:292\n22#3:296\n47#3:297\n49#3:301\n20#3:302\n22#3:306\n47#3:307\n49#3:311\n20#3:312\n22#3:316\n47#3:317\n49#3:321\n20#3:322\n22#3:326\n47#3:327\n49#3:331\n50#4:283\n55#4:285\n50#4:288\n55#4:290\n50#4:293\n55#4:295\n50#4:298\n55#4:300\n50#4:303\n55#4:305\n50#4:308\n55#4:310\n50#4:313\n55#4:315\n50#4:318\n55#4:320\n50#4:323\n55#4:325\n50#4:328\n55#4:330\n106#5:284\n106#5:289\n106#5:294\n106#5:299\n106#5:304\n106#5:309\n106#5:314\n106#5:319\n106#5:324\n106#5:329\n515#6:332\n500#6,6:333\n*S KotlinDebug\n*F\n+ 1 WebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/WebViewAdPlayer\n*L\n75#1:278,4\n82#1:282\n82#1:286\n83#1:287\n83#1:291\n92#1:292\n92#1:296\n93#1:297\n93#1:301\n102#1:302\n102#1:306\n103#1:307\n103#1:311\n135#1:312\n135#1:316\n136#1:317\n136#1:321\n152#1:322\n152#1:326\n153#1:327\n153#1:331\n82#1:283\n82#1:285\n83#1:288\n83#1:290\n92#1:293\n92#1:295\n93#1:298\n93#1:300\n102#1:303\n102#1:305\n103#1:308\n103#1:310\n135#1:313\n135#1:315\n136#1:318\n136#1:320\n152#1:323\n152#1:325\n153#1:328\n153#1:330\n82#1:284\n83#1:289\n92#1:294\n93#1:299\n102#1:304\n103#1:309\n135#1:314\n136#1:319\n152#1:324\n153#1:329\n184#1:332\n184#1:333,6\n*E\n"})
/* loaded from: classes3.dex */
public final class WebViewAdPlayer implements AdPlayer {

    @NotNull
    private final WebViewBridge bridge;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final CoroutineDispatcher dispatcher;

    @NotNull
    private final t0 isCompletedManually;

    @NotNull
    private final kotlinx.coroutines.flow.b onBroadcastEvents;

    @NotNull
    private final kotlinx.coroutines.flow.b onLoadEvent;

    @NotNull
    private final kotlinx.coroutines.flow.b onOfferwallEvent;

    @NotNull
    private final kotlinx.coroutines.flow.b onScarEvent;

    @NotNull
    private final kotlinx.coroutines.flow.b onShowEvent;

    @NotNull
    private final j0 scope;

    @NotNull
    private final g0 scopeCancellationHandler;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final l storageEventCallback;

    @NotNull
    private final WebViewContainer webViewContainer;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements p {
        public AnonymousClass1(Object obj) {
            super(2, obj, s0.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull String str, @NotNull c cVar) {
            return ((s0) this.receiver).emit(str, cVar);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements p {
        public AnonymousClass2(Object obj) {
            super(2, obj, WebViewAdPlayer.class, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull String str, @NotNull c cVar) {
            return ((WebViewAdPlayer) this.receiver).onBroadcastEvent(str, cVar);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", i = {0, 0, 0, 1, 1, 1}, l = {178, 179, 194}, m = "requestShow", n = {"this", "unityAdsShowOptions", "it", "this", "unityAdsShowOptions", "it"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1, reason: invalid class name and case insensitive filesystem */
    public static final class C24561 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C24561(c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewAdPlayer.this.requestShow(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", i = {0, 0}, l = {Sdk$SDKError.Reason.AD_ALREADY_FAILED_VALUE, Sdk$SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE}, m = "sendEvent", n = {"this", "getEvent"}, s = {"L$0", "L$1"})
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C24581 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C24581(c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewAdPlayer.this.sendEvent(null, this);
        }
    }

    public WebViewAdPlayer(@NotNull WebViewBridge bridge, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull CoroutineDispatcher dispatcher, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull WebViewContainer webViewContainer, @NotNull j0 adPlayerScope) {
        kotlin.jvm.internal.p.e(bridge, "bridge");
        kotlin.jvm.internal.p.e(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.p.e(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.p.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.p.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.p.e(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.p.e(adPlayerScope, "adPlayerScope");
        this.bridge = bridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.webViewContainer = webViewContainer;
        t0 t0VarA = e1.a(Boolean.FALSE);
        this.isCompletedManually = t0VarA;
        l lVar = new l() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/j0;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1", f = "WebViewAdPlayer.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements p {
                final /* synthetic */ StorageEventInfo $it;
                int label;
                final /* synthetic */ WebViewAdPlayer this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(WebViewAdPlayer webViewAdPlayer, StorageEventInfo storageEventInfo, c cVar) {
                    super(2, cVar);
                    this.this$0 = webViewAdPlayer;
                    this.$it = storageEventInfo;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final c create(@Nullable Object obj, @NotNull c cVar) {
                    return new AnonymousClass1(this.this$0, this.$it, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objF = kotlin.coroutines.intrinsics.a.f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        WebViewBridge webViewBridge = this.this$0.bridge;
                        OnStorageEvent onStorageEvent = new OnStorageEvent(this.$it.getEventType(), this.$it.getStorageType(), this.$it.getValue());
                        this.label = 1;
                        if (webViewBridge.sendEvent(onStorageEvent, this) == objF) {
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
                public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
                    return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
                }
            }

            {
                super(1);
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((StorageEventInfo) obj);
                return s.f25199a;
            }

            public final void invoke(@NotNull StorageEventInfo it) {
                kotlin.jvm.internal.p.e(it, "it");
                k.d(this.this$0.getScope(), null, null, new AnonymousClass1(this.this$0, it, null), 3, null);
            }
        };
        this.storageEventCallback = lVar;
        WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 = new WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1(g0.G8, this);
        this.scopeCancellationHandler = webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = k0.h(k0.h(k0.h(adPlayerScope, dispatcher), new i0("WebViewAdPlayer")), webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1);
        final x0 onInvocation = bridge.getOnInvocation();
        final kotlinx.coroutines.flow.b bVar = new kotlinx.coroutines.flow.b() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ly8/s;", "emit", "(Ljava/lang/Object;Lc9/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/d0", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/WebViewAdPlayer\n*L\n1#1,222:1\n21#2:223\n22#2:225\n82#3:224\n*E\n"})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {
                final /* synthetic */ kotlinx.coroutines.flow.c $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2", f = "WebViewAdPlayer.kt", i = {}, l = {Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                    this.$this_unsafeFlow = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.c
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull c9.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.c.b(r7)
                        goto L52
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.c.b(r7)
                        kotlinx.coroutines.flow.c r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showScarAd"
                        java.lang.String[] r4 = new java.lang.String[]{r4}
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = z8.o.w(r4, r2)
                        if (r2 == 0) goto L52
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L52
                        return r1
                    L52:
                        y8.s r6 = y8.s.f25199a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, c9.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.b
            @Nullable
            public Object collect(@NotNull kotlinx.coroutines.flow.c cVar, @NotNull c cVar2) {
                Object objCollect = onInvocation.collect(new AnonymousClass2(cVar), cVar2);
                return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : s.f25199a;
            }
        };
        this.onScarEvent = new kotlinx.coroutines.flow.b() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ly8/s;", "emit", "(Ljava/lang/Object;Lc9/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k0", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/WebViewAdPlayer\n*L\n1#1,222:1\n48#2:223\n84#3,4:224\n*E\n"})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {
                final /* synthetic */ kotlinx.coroutines.flow.c $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2", f = "WebViewAdPlayer.kt", i = {0}, l = {224, Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {"it"}, s = {"L$1"})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                    this.$this_unsafeFlow = cVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
                
                    if (r2.emit(r7, r0) == r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.c
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull c9.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L41
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        kotlin.c.b(r8)
                        goto L70
                    L2d:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L35:
                        java.lang.Object r7 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.Object r2 = r0.L$0
                        kotlinx.coroutines.flow.c r2 = (kotlinx.coroutines.flow.c) r2
                        kotlin.c.b(r8)
                        goto L55
                    L41:
                        kotlin.c.b(r8)
                        kotlinx.coroutines.flow.c r2 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        r0.L$0 = r2
                        r0.L$1 = r7
                        r0.label = r4
                        java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r5, r0, r4, r5)
                        if (r8 != r1) goto L55
                        goto L6f
                    L55:
                        java.lang.String r8 = r7.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showScarAd"
                        boolean r8 = kotlin.jvm.internal.p.a(r8, r4)
                        if (r8 == 0) goto L73
                        com.unity3d.ads.core.data.model.ScarEvent$Show r7 = com.unity3d.ads.core.data.model.ScarEvent.Show.INSTANCE
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r7 = r2.emit(r7, r0)
                        if (r7 != r1) goto L70
                    L6f:
                        return r1
                    L70:
                        y8.s r7 = y8.s.f25199a
                        return r7
                    L73:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Unexpected location: "
                        r0.append(r1)
                        java.lang.String r7 = r7.getLocation()
                        r0.append(r7)
                        java.lang.String r7 = r0.toString()
                        java.lang.String r7 = r7.toString()
                        r8.<init>(r7)
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, c9.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.b
            @Nullable
            public Object collect(@NotNull kotlinx.coroutines.flow.c cVar, @NotNull c cVar2) {
                Object objCollect = bVar.collect(new AnonymousClass2(cVar), cVar2);
                return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : s.f25199a;
            }
        };
        final x0 onInvocation2 = bridge.getOnInvocation();
        final kotlinx.coroutines.flow.b bVar2 = new kotlinx.coroutines.flow.b() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ly8/s;", "emit", "(Ljava/lang/Object;Lc9/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/d0", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/WebViewAdPlayer\n*L\n1#1,222:1\n21#2:223\n22#2:225\n92#3:224\n*E\n"})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {
                final /* synthetic */ kotlinx.coroutines.flow.c $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2", f = "WebViewAdPlayer.kt", i = {}, l = {Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                    this.$this_unsafeFlow = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.c
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull c9.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.c.b(r7)
                        goto L52
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.c.b(r7)
                        kotlinx.coroutines.flow.c r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showOfferwallAd"
                        java.lang.String[] r4 = new java.lang.String[]{r4}
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = z8.o.w(r4, r2)
                        if (r2 == 0) goto L52
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L52
                        return r1
                    L52:
                        y8.s r6 = y8.s.f25199a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, c9.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.b
            @Nullable
            public Object collect(@NotNull kotlinx.coroutines.flow.c cVar, @NotNull c cVar2) {
                Object objCollect = onInvocation2.collect(new AnonymousClass2(cVar), cVar2);
                return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : s.f25199a;
            }
        };
        this.onOfferwallEvent = new kotlinx.coroutines.flow.b() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ly8/s;", "emit", "(Ljava/lang/Object;Lc9/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k0", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/WebViewAdPlayer\n*L\n1#1,222:1\n48#2:223\n94#3,4:224\n*E\n"})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {
                final /* synthetic */ kotlinx.coroutines.flow.c $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2", f = "WebViewAdPlayer.kt", i = {0}, l = {224, Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {"it"}, s = {"L$1"})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                    this.$this_unsafeFlow = cVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
                
                    if (r2.emit(r7, r0) == r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.c
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull c9.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L41
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        kotlin.c.b(r8)
                        goto L70
                    L2d:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L35:
                        java.lang.Object r7 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.Object r2 = r0.L$0
                        kotlinx.coroutines.flow.c r2 = (kotlinx.coroutines.flow.c) r2
                        kotlin.c.b(r8)
                        goto L55
                    L41:
                        kotlin.c.b(r8)
                        kotlinx.coroutines.flow.c r2 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        r0.L$0 = r2
                        r0.L$1 = r7
                        r0.label = r4
                        java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r5, r0, r4, r5)
                        if (r8 != r1) goto L55
                        goto L6f
                    L55:
                        java.lang.String r8 = r7.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showOfferwallAd"
                        boolean r8 = kotlin.jvm.internal.p.a(r8, r4)
                        if (r8 == 0) goto L73
                        com.unity3d.ads.core.data.model.OfferwallShowEvent$Show r7 = com.unity3d.ads.core.data.model.OfferwallShowEvent.Show.INSTANCE
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r7 = r2.emit(r7, r0)
                        if (r7 != r1) goto L70
                    L6f:
                        return r1
                    L70:
                        y8.s r7 = y8.s.f25199a
                        return r7
                    L73:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Unexpected location: "
                        r0.append(r1)
                        java.lang.String r7 = r7.getLocation()
                        r0.append(r7)
                        java.lang.String r7 = r0.toString()
                        java.lang.String r7 = r7.toString()
                        r8.<init>(r7)
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, c9.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.b
            @Nullable
            public Object collect(@NotNull kotlinx.coroutines.flow.c cVar, @NotNull c cVar2) {
                Object objCollect = bVar2.collect(new AnonymousClass2(cVar), cVar2);
                return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : s.f25199a;
            }
        };
        final x0 onInvocation3 = bridge.getOnInvocation();
        final kotlinx.coroutines.flow.b bVar3 = new kotlinx.coroutines.flow.b() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ly8/s;", "emit", "(Ljava/lang/Object;Lc9/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/d0", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/WebViewAdPlayer\n*L\n1#1,222:1\n21#2:223\n22#2:225\n102#3:224\n*E\n"})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {
                final /* synthetic */ kotlinx.coroutines.flow.c $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2", f = "WebViewAdPlayer.kt", i = {}, l = {Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                    this.$this_unsafeFlow = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.c
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull c9.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.c.b(r7)
                        goto L50
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.c.b(r7)
                        kotlinx.coroutines.flow.c r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String[] r4 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.access$getSHOW_EVENTS$p()
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = z8.o.w(r4, r2)
                        if (r2 == 0) goto L50
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L50
                        return r1
                    L50:
                        y8.s r6 = y8.s.f25199a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.emit(java.lang.Object, c9.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.b
            @Nullable
            public Object collect(@NotNull kotlinx.coroutines.flow.c cVar, @NotNull c cVar2) {
                Object objCollect = onInvocation3.collect(new AnonymousClass2(cVar), cVar2);
                return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : s.f25199a;
            }
        };
        this.onShowEvent = d.v(new kotlinx.coroutines.flow.b() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ly8/s;", "emit", "(Ljava/lang/Object;Lc9/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k0", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/WebViewAdPlayer\n*L\n1#1,222:1\n48#2:223\n104#3,22:224\n*E\n"})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {
                final /* synthetic */ kotlinx.coroutines.flow.c $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2", f = "WebViewAdPlayer.kt", i = {0}, l = {244, Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {NotificationCompat.CATEGORY_EVENT}, s = {"L$1"})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                    this.$this_unsafeFlow = cVar;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x0109, code lost:
                
                    if (r2.emit(r13, r0) == r1) goto L55;
                 */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.c
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r13, @org.jetbrains.annotations.NotNull c9.c r14) {
                    /*
                        Method dump skipped, instructions count: 324
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, c9.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.b
            @Nullable
            public Object collect(@NotNull kotlinx.coroutines.flow.c cVar, @NotNull c cVar2) {
                Object objCollect = bVar3.collect(new AnonymousClass2(cVar), cVar2);
                return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : s.f25199a;
            }
        }, t0VarA, new WebViewAdPlayer$onShowEvent$3(null));
        final x0 onInvocation4 = bridge.getOnInvocation();
        final kotlinx.coroutines.flow.b bVar4 = new kotlinx.coroutines.flow.b() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ly8/s;", "emit", "(Ljava/lang/Object;Lc9/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/d0", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/WebViewAdPlayer\n*L\n1#1,222:1\n21#2:223\n22#2:225\n135#3:224\n*E\n"})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {
                final /* synthetic */ kotlinx.coroutines.flow.c $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2", f = "WebViewAdPlayer.kt", i = {}, l = {Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                    this.$this_unsafeFlow = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.c
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull c9.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.c.b(r7)
                        goto L50
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.c.b(r7)
                        kotlinx.coroutines.flow.c r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String[] r4 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.access$getLOAD_EVENTS$p()
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = z8.o.w(r4, r2)
                        if (r2 == 0) goto L50
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L50
                        return r1
                    L50:
                        y8.s r6 = y8.s.f25199a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.emit(java.lang.Object, c9.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.b
            @Nullable
            public Object collect(@NotNull kotlinx.coroutines.flow.c cVar, @NotNull c cVar2) {
                Object objCollect = onInvocation4.collect(new AnonymousClass2(cVar), cVar2);
                return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : s.f25199a;
            }
        };
        this.onLoadEvent = d.F(d.D(new kotlinx.coroutines.flow.b() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ly8/s;", "emit", "(Ljava/lang/Object;Lc9/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k0", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/WebViewAdPlayer\n*L\n1#1,222:1\n48#2:223\n137#3,9:224\n*E\n"})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {
                final /* synthetic */ kotlinx.coroutines.flow.c $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2", f = "WebViewAdPlayer.kt", i = {0}, l = {224, Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {"it"}, s = {"L$1"})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                    this.$this_unsafeFlow = cVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
                
                    if (r2.emit(r4, r0) == r1) goto L25;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.c
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r8, @org.jetbrains.annotations.NotNull c9.c r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L41
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        kotlin.c.b(r9)
                        goto L96
                    L2d:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L35:
                        java.lang.Object r8 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r8 = (com.unity3d.ads.adplayer.Invocation) r8
                        java.lang.Object r2 = r0.L$0
                        kotlinx.coroutines.flow.c r2 = (kotlinx.coroutines.flow.c) r2
                        kotlin.c.b(r9)
                        goto L55
                    L41:
                        kotlin.c.b(r9)
                        kotlinx.coroutines.flow.c r2 = r7.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r8 = (com.unity3d.ads.adplayer.Invocation) r8
                        r0.L$0 = r2
                        r0.L$1 = r8
                        r0.label = r4
                        java.lang.Object r9 = com.unity3d.ads.adplayer.Invocation.handle$default(r8, r5, r0, r4, r5)
                        if (r9 != r1) goto L55
                        goto L95
                    L55:
                        java.lang.String r9 = r8.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.loadError"
                        boolean r9 = kotlin.jvm.internal.p.a(r9, r4)
                        if (r9 == 0) goto L87
                        java.lang.Object[] r8 = r8.getParameters()
                        java.lang.Object r8 = z8.o.A(r8)
                        java.lang.String r9 = "null cannot be cast to non-null type org.json.JSONObject"
                        kotlin.jvm.internal.p.c(r8, r9)
                        org.json.JSONObject r8 = (org.json.JSONObject) r8
                        java.lang.String r9 = "code"
                        int r9 = r8.optInt(r9)
                        java.lang.String r4 = "message"
                        java.lang.String r8 = r8.optString(r4)
                        com.unity3d.ads.adplayer.model.LoadEvent$Error r4 = new com.unity3d.ads.adplayer.model.LoadEvent$Error
                        java.lang.String r6 = "errorMessage"
                        kotlin.jvm.internal.p.d(r8, r6)
                        r4.<init>(r8, r9)
                        goto L89
                    L87:
                        com.unity3d.ads.adplayer.model.LoadEvent$Completed r4 = com.unity3d.ads.adplayer.model.LoadEvent.Completed.INSTANCE
                    L89:
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r8 = r2.emit(r4, r0)
                        if (r8 != r1) goto L96
                    L95:
                        return r1
                    L96:
                        y8.s r8 = y8.s.f25199a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, c9.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.b
            @Nullable
            public Object collect(@NotNull kotlinx.coroutines.flow.c cVar, @NotNull c cVar2) {
                Object objCollect = bVar4.collect(new AnonymousClass2(cVar), cVar2);
                return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : s.f25199a;
            }
        }, getScope(), b1.f22443a.a(), 1), 1);
        final x0 onInvocation5 = bridge.getOnInvocation();
        final kotlinx.coroutines.flow.b bVar5 = new kotlinx.coroutines.flow.b() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ly8/s;", "emit", "(Ljava/lang/Object;Lc9/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/d0", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/WebViewAdPlayer\n*L\n1#1,222:1\n21#2:223\n22#2:225\n152#3:224\n*E\n"})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {
                final /* synthetic */ kotlinx.coroutines.flow.c $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2", f = "WebViewAdPlayer.kt", i = {}, l = {Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                    this.$this_unsafeFlow = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.c
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull c9.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.c.b(r7)
                        goto L4e
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.c.b(r7)
                        kotlinx.coroutines.flow.c r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String r2 = r2.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.broadcastEvent"
                        boolean r2 = kotlin.jvm.internal.p.a(r2, r4)
                        if (r2 == 0) goto L4e
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4e
                        return r1
                    L4e:
                        y8.s r6 = y8.s.f25199a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.emit(java.lang.Object, c9.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.b
            @Nullable
            public Object collect(@NotNull kotlinx.coroutines.flow.c cVar, @NotNull c cVar2) {
                Object objCollect = onInvocation5.collect(new AnonymousClass2(cVar), cVar2);
                return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : s.f25199a;
            }
        };
        kotlinx.coroutines.flow.b bVar6 = new kotlinx.coroutines.flow.b() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ly8/s;", "emit", "(Ljava/lang/Object;Lc9/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k0", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/WebViewAdPlayer\n*L\n1#1,222:1\n48#2:223\n154#3,2:224\n*E\n"})
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {
                final /* synthetic */ kotlinx.coroutines.flow.c $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2", f = "WebViewAdPlayer.kt", i = {0}, l = {224, Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {"it"}, s = {"L$1"})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                    this.$this_unsafeFlow = cVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
                
                    if (r2.emit(r7, r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.c
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull c9.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L41
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        kotlin.c.b(r8)
                        goto L6e
                    L2d:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L35:
                        java.lang.Object r7 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.Object r2 = r0.L$0
                        kotlinx.coroutines.flow.c r2 = (kotlinx.coroutines.flow.c) r2
                        kotlin.c.b(r8)
                        goto L55
                    L41:
                        kotlin.c.b(r8)
                        kotlinx.coroutines.flow.c r2 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        r0.L$0 = r2
                        r0.L$1 = r7
                        r0.label = r4
                        java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r5, r0, r4, r5)
                        if (r8 != r1) goto L55
                        goto L6d
                    L55:
                        java.lang.Object[] r7 = r7.getParameters()
                        java.lang.Object r7 = z8.o.A(r7)
                        java.lang.String r7 = r7.toString()
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r7 = r2.emit(r7, r0)
                        if (r7 != r1) goto L6e
                    L6d:
                        return r1
                    L6e:
                        y8.s r7 = y8.s.f25199a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, c9.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.b
            @Nullable
            public Object collect(@NotNull kotlinx.coroutines.flow.c cVar, @NotNull c cVar2) {
                Object objCollect = bVar5.collect(new AnonymousClass2(cVar), cVar2);
                return objCollect == kotlin.coroutines.intrinsics.a.f() ? objCollect : s.f25199a;
            }
        };
        this.onBroadcastEvents = bVar6;
        Storage.INSTANCE.addStorageEventCallback(lVar);
        AdPlayer.Companion companion = AdPlayer.INSTANCE;
        d.x(d.A(bVar6, new AnonymousClass1(companion.getBroadcastEventChannel())), getScope());
        d.x(d.A(companion.getBroadcastEventChannel(), new AnonymousClass2(this)), getScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        if (r4.sendEvent(r1, r2) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendEvent(l9.a r19, c9.c r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.C24581
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r2 = (com.unity3d.ads.adplayer.WebViewAdPlayer.C24581) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r2 = new com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L45
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            kotlin.c.b(r1)
            goto Lba
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            java.lang.Object r4 = r2.L$1
            l9.a r4 = (l9.a) r4
            java.lang.Object r7 = r2.L$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r7 = (com.unity3d.ads.adplayer.WebViewAdPlayer) r7
            kotlin.c.b(r1)
            goto L5c
        L45:
            kotlin.c.b(r1)
            kotlinx.coroutines.flow.b r1 = r0.getOnLoadEvent()
            r2.L$0 = r0
            r4 = r19
            r2.L$1 = r4
            r2.label = r6
            java.lang.Object r1 = kotlinx.coroutines.flow.d.E(r1, r2)
            if (r1 != r3) goto L5b
            goto Lb9
        L5b:
            r7 = r0
        L5c:
            com.unity3d.ads.adplayer.model.LoadEvent r1 = (com.unity3d.ads.adplayer.model.LoadEvent) r1
            boolean r8 = r1 instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error
            if (r8 == 0) goto La4
            com.unity3d.ads.core.domain.SendDiagnosticEvent r9 = r7.sendDiagnosticEvent
            java.lang.String r2 = "reason"
            java.lang.String r3 = "adviewer"
            kotlin.Pair r2 = y8.i.a(r2, r3)
            com.unity3d.ads.adplayer.model.LoadEvent$Error r1 = (com.unity3d.ads.adplayer.model.LoadEvent.Error) r1
            java.lang.String r3 = r1.getMessage()
            java.lang.String r4 = "reason_debug"
            kotlin.Pair r3 = y8.i.a(r4, r3)
            int r1 = r1.getErrorCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "reason_code"
            kotlin.Pair r1 = y8.i.a(r4, r1)
            r4 = 3
            kotlin.Pair[] r4 = new kotlin.Pair[r4]
            r7 = 0
            r4[r7] = r2
            r4[r6] = r3
            r4[r5] = r1
            java.util.Map r12 = kotlin.collections.a.k(r4)
            r16 = 58
            r17 = 0
            java.lang.String r10 = "bridge_send_event_failed"
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            y8.s r1 = y8.s.f25199a
            return r1
        La4:
            java.lang.Object r1 = r4.invoke()
            com.unity3d.ads.adplayer.model.WebViewEvent r1 = (com.unity3d.ads.adplayer.model.WebViewEvent) r1
            com.unity3d.ads.adplayer.WebViewBridge r4 = r7.bridge
            r6 = 0
            r2.L$0 = r6
            r2.L$1 = r6
            r2.label = r5
            java.lang.Object r1 = r4.sendEvent(r1, r2)
            if (r1 != r3) goto Lba
        Lb9:
            return r3
        Lba:
            y8.s r1 = y8.s.f25199a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.sendEvent(l9.a, c9.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @CallSuper
    @Nullable
    public Object destroy(@NotNull c cVar) {
        return AdPlayer.DefaultImpls.destroy(this, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.isCompletedManually.setValue(Boolean.TRUE);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public kotlinx.coroutines.flow.b getOnLoadEvent() {
        return this.onLoadEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public kotlinx.coroutines.flow.b getOnOfferwallEvent() {
        return this.onOfferwallEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public kotlinx.coroutines.flow.b getOnScarEvent() {
        return this.onScarEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public kotlinx.coroutines.flow.b getOnShowEvent() {
        return this.onShowEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public j0 getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onAllowedPiiChange(@NotNull final byte[] bArr, @NotNull c cVar) {
        Object objSendEvent = sendEvent(new l9.a() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.onAllowedPiiChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final WebViewEvent invoke() {
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                kotlin.jvm.internal.p.d(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
                return new OnAllowedPiiChangeEvent(strEncodeToString);
            }
        }, cVar);
        return objSendEvent == kotlin.coroutines.intrinsics.a.f() ? objSendEvent : s.f25199a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onBroadcastEvent(@NotNull final String str, @NotNull c cVar) {
        Object objSendEvent = sendEvent(new l9.a() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.onBroadcastEvent.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final WebViewEvent invoke() throws JSONException {
                JSONObject jSONObject = new JSONObject(str);
                String eventType = jSONObject.getString("eventType");
                String strOptString = jSONObject.optString("data");
                kotlin.jvm.internal.p.d(eventType, "eventType");
                return new OnBroadcastEvent(eventType, strOptString);
            }
        }, cVar);
        return objSendEvent == kotlin.coroutines.intrinsics.a.f() ? objSendEvent : s.f25199a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0185, code lost:
    
        if (r14.request("webview", "show", r15, r0) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object requestShow(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r14, @org.jetbrains.annotations.NotNull c9.c r15) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.requestShow(java.util.Map, c9.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendActivityDestroyed(@NotNull c cVar) {
        Object objSendEvent = sendEvent(new l9.a() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendActivityDestroyed.2
            @Override // l9.a
            @NotNull
            public final WebViewEvent invoke() {
                return new OnActivityDestroyedEvent();
            }
        }, cVar);
        return objSendEvent == kotlin.coroutines.intrinsics.a.f() ? objSendEvent : s.f25199a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendFocusChange(final boolean z10, @NotNull c cVar) {
        Object objSendEvent = sendEvent(new l9.a() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendFocusChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final WebViewEvent invoke() {
                return new OnFocusChangeEvent(z10);
            }
        }, cVar);
        return objSendEvent == kotlin.coroutines.intrinsics.a.f() ? objSendEvent : s.f25199a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendGmaEvent(@NotNull final GMAEvent gMAEvent, @NotNull c cVar) {
        Object objSendEvent = sendEvent(new l9.a() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendGmaEvent.2
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final WebViewEvent invoke() {
                return new OnGmaEvent(gMAEvent);
            }
        }, cVar);
        return objSendEvent == kotlin.coroutines.intrinsics.a.f() ? objSendEvent : s.f25199a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendMuteChange(final boolean z10, @NotNull c cVar) {
        Object objSendEvent = sendEvent(new l9.a() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendMuteChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final WebViewEvent invoke() {
                return new OnMuteChangeEvent(z10);
            }
        }, cVar);
        return objSendEvent == kotlin.coroutines.intrinsics.a.f() ? objSendEvent : s.f25199a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendOfferwallEvent(@NotNull final OfferwallEvent offerwallEvent, @NotNull c cVar) {
        Object objSendEvent = sendEvent(new l9.a() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendOfferwallEvent.2
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final WebViewEvent invoke() {
                return new OnOfferwallEvent(offerwallEvent);
            }
        }, cVar);
        return objSendEvent == kotlin.coroutines.intrinsics.a.f() ? objSendEvent : s.f25199a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendPrivacyFsmChange(@NotNull final byte[] bArr, @NotNull c cVar) {
        Object objSendEvent = sendEvent(new l9.a() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendPrivacyFsmChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final WebViewEvent invoke() {
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                kotlin.jvm.internal.p.d(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
                return new OnPrivacyFsmChangeEvent(strEncodeToString);
            }
        }, cVar);
        return objSendEvent == kotlin.coroutines.intrinsics.a.f() ? objSendEvent : s.f25199a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendScarBannerEvent(@NotNull final BannerBridge.BannerEvent bannerEvent, @NotNull c cVar) {
        Object objSendEvent = sendEvent(new l9.a() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendScarBannerEvent.2
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final WebViewEvent invoke() {
                return new OnScarBannerEvent(bannerEvent);
            }
        }, cVar);
        return objSendEvent == kotlin.coroutines.intrinsics.a.f() ? objSendEvent : s.f25199a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendUserConsentChange(@NotNull final byte[] bArr, @NotNull c cVar) {
        Object objSendEvent = sendEvent(new l9.a() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendUserConsentChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final WebViewEvent invoke() {
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                kotlin.jvm.internal.p.d(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
                return new OnUserConsentChangeEvent(strEncodeToString);
            }
        }, cVar);
        return objSendEvent == kotlin.coroutines.intrinsics.a.f() ? objSendEvent : s.f25199a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVisibilityChange(final boolean z10, @NotNull c cVar) {
        Object objSendEvent = sendEvent(new l9.a() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendVisibilityChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final WebViewEvent invoke() {
                return new OnVisibilityChangeEvent(z10);
            }
        }, cVar);
        return objSendEvent == kotlin.coroutines.intrinsics.a.f() ? objSendEvent : s.f25199a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVolumeChange(final double d10, @NotNull c cVar) {
        Object objSendEvent = sendEvent(new l9.a() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendVolumeChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final WebViewEvent invoke() {
                return new OnVolumeChangeEvent(d10);
            }
        }, cVar);
        return objSendEvent == kotlin.coroutines.intrinsics.a.f() ? objSendEvent : s.f25199a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(@NotNull ShowOptions showOptions) {
        AdPlayer.DefaultImpls.show(this, showOptions);
    }
}
