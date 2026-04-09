package com.yandex.mobile.ads.impl;

import b9.C1992A;
import c9.C2099t;
import com.yandex.mobile.ads.impl.du1;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class gr implements fr {

    /* renamed from: f, reason: collision with root package name */
    private static final a f27877f = new a(0);

    /* renamed from: g, reason: collision with root package name */
    private static final Object f27878g = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final cs0 f27879b;

    /* renamed from: c, reason: collision with root package name */
    private final b60 f27880c;

    /* renamed from: d, reason: collision with root package name */
    private final pa f27881d;

    /* renamed from: e, reason: collision with root package name */
    private final g6 f27882e;

    public static final class a {
        private a() {
        }

        public static final Boolean a(a aVar, cs0 cs0Var, String str) {
            if (!cs0Var.c(str)) {
                cs0Var = null;
            }
            if (cs0Var != null) {
                return Boolean.valueOf(cs0Var.a(str, false));
            }
            return null;
        }

        public static final Integer b(a aVar, cs0 cs0Var, String str) {
            if (!cs0Var.c(str)) {
                cs0Var = null;
            }
            if (cs0Var != null) {
                return Integer.valueOf(cs0Var.b(0, str));
            }
            return null;
        }

        public static final Long c(a aVar, cs0 cs0Var, String str) {
            if (!cs0Var.c(str)) {
                cs0Var = null;
            }
            if (cs0Var != null) {
                return Long.valueOf(cs0Var.b(str));
            }
            return null;
        }

        public /* synthetic */ a(int i) {
            this();
        }

        public static final void a(a aVar, cs0 cs0Var, String str, Boolean bool) {
            if (bool != null) {
                cs0Var.b(str, bool.booleanValue());
            } else {
                cs0Var.a(str);
            }
        }

        public static final void a(a aVar, cs0 cs0Var, String str, Integer num) {
            if (num != null) {
                cs0Var.a(num.intValue(), str);
            } else {
                cs0Var.a(str);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        public static final b f27883A;

        /* renamed from: A0, reason: collision with root package name */
        public static final b f27884A0;

        /* renamed from: B, reason: collision with root package name */
        public static final b f27885B;

        /* renamed from: B0, reason: collision with root package name */
        public static final b f27886B0;

        /* renamed from: C, reason: collision with root package name */
        public static final b f27887C;

        /* renamed from: C0, reason: collision with root package name */
        public static final b f27888C0;

        /* renamed from: D, reason: collision with root package name */
        public static final b f27889D;

        /* renamed from: D0, reason: collision with root package name */
        public static final b f27890D0;

        /* renamed from: E, reason: collision with root package name */
        public static final b f27891E;

        /* renamed from: E0, reason: collision with root package name */
        public static final b f27892E0;

        /* renamed from: F, reason: collision with root package name */
        public static final b f27893F;
        public static final b F0;

        /* renamed from: G, reason: collision with root package name */
        public static final b f27894G;

        /* renamed from: G0, reason: collision with root package name */
        public static final b f27895G0;

        /* renamed from: H, reason: collision with root package name */
        public static final b f27896H;

        /* renamed from: H0, reason: collision with root package name */
        public static final b f27897H0;

        /* renamed from: I, reason: collision with root package name */
        public static final b f27898I;

        /* renamed from: I0, reason: collision with root package name */
        public static final b f27899I0;

        /* renamed from: J, reason: collision with root package name */
        public static final b f27900J;

        /* renamed from: J0, reason: collision with root package name */
        public static final b f27901J0;

        /* renamed from: K, reason: collision with root package name */
        public static final b f27902K;

        /* renamed from: K0, reason: collision with root package name */
        private static final /* synthetic */ b[] f27903K0;

        /* renamed from: L, reason: collision with root package name */
        public static final b f27904L;

        /* renamed from: M, reason: collision with root package name */
        public static final b f27905M;

        /* renamed from: N, reason: collision with root package name */
        public static final b f27906N;

        /* renamed from: O, reason: collision with root package name */
        public static final b f27907O;

        /* renamed from: P, reason: collision with root package name */
        public static final b f27908P;

        /* renamed from: Q, reason: collision with root package name */
        public static final b f27909Q;

        /* renamed from: R, reason: collision with root package name */
        public static final b f27910R;

        /* renamed from: S, reason: collision with root package name */
        public static final b f27911S;

        /* renamed from: T, reason: collision with root package name */
        public static final b f27912T;

        /* renamed from: U, reason: collision with root package name */
        public static final b f27913U;

        /* renamed from: V, reason: collision with root package name */
        public static final b f27914V;

        /* renamed from: W, reason: collision with root package name */
        public static final b f27915W;

        /* renamed from: X, reason: collision with root package name */
        public static final b f27916X;

        /* renamed from: Y, reason: collision with root package name */
        public static final b f27917Y;

        /* renamed from: Z, reason: collision with root package name */
        public static final b f27918Z;

        /* renamed from: a0, reason: collision with root package name */
        public static final b f27919a0;

        /* renamed from: b0, reason: collision with root package name */
        public static final b f27920b0;

        /* renamed from: c, reason: collision with root package name */
        public static final b f27921c;

        /* renamed from: c0, reason: collision with root package name */
        public static final b f27922c0;

        /* renamed from: d, reason: collision with root package name */
        public static final b f27923d;

        /* renamed from: d0, reason: collision with root package name */
        public static final b f27924d0;

        /* renamed from: e, reason: collision with root package name */
        public static final b f27925e;

        /* renamed from: e0, reason: collision with root package name */
        public static final b f27926e0;

        /* renamed from: f, reason: collision with root package name */
        public static final b f27927f;

        /* renamed from: f0, reason: collision with root package name */
        public static final b f27928f0;

        /* renamed from: g, reason: collision with root package name */
        public static final b f27929g;

        /* renamed from: g0, reason: collision with root package name */
        public static final b f27930g0;

        /* renamed from: h, reason: collision with root package name */
        public static final b f27931h;

        /* renamed from: h0, reason: collision with root package name */
        public static final b f27932h0;
        public static final b i;

        /* renamed from: i0, reason: collision with root package name */
        public static final b f27933i0;

        /* renamed from: j, reason: collision with root package name */
        public static final b f27934j;

        /* renamed from: j0, reason: collision with root package name */
        public static final b f27935j0;

        /* renamed from: k, reason: collision with root package name */
        public static final b f27936k;

        /* renamed from: k0, reason: collision with root package name */
        public static final b f27937k0;

        /* renamed from: l, reason: collision with root package name */
        public static final b f27938l;

        /* renamed from: l0, reason: collision with root package name */
        public static final b f27939l0;

        /* renamed from: m, reason: collision with root package name */
        public static final b f27940m;

        /* renamed from: m0, reason: collision with root package name */
        public static final b f27941m0;

        /* renamed from: n, reason: collision with root package name */
        public static final b f27942n;

        /* renamed from: n0, reason: collision with root package name */
        public static final b f27943n0;

        /* renamed from: o, reason: collision with root package name */
        public static final b f27944o;

        /* renamed from: o0, reason: collision with root package name */
        public static final b f27945o0;

        /* renamed from: p, reason: collision with root package name */
        public static final b f27946p;

        /* renamed from: p0, reason: collision with root package name */
        public static final b f27947p0;

        /* renamed from: q, reason: collision with root package name */
        public static final b f27948q;

        /* renamed from: q0, reason: collision with root package name */
        public static final b f27949q0;

        /* renamed from: r, reason: collision with root package name */
        public static final b f27950r;

        /* renamed from: r0, reason: collision with root package name */
        public static final b f27951r0;

        /* renamed from: s, reason: collision with root package name */
        public static final b f27952s;

        /* renamed from: s0, reason: collision with root package name */
        public static final b f27953s0;

        /* renamed from: t, reason: collision with root package name */
        public static final b f27954t;

        /* renamed from: t0, reason: collision with root package name */
        public static final b f27955t0;

        /* renamed from: u, reason: collision with root package name */
        public static final b f27956u;

        /* renamed from: u0, reason: collision with root package name */
        public static final b f27957u0;

        /* renamed from: v, reason: collision with root package name */
        public static final b f27958v;

        /* renamed from: v0, reason: collision with root package name */
        public static final b f27959v0;

        /* renamed from: w, reason: collision with root package name */
        public static final b f27960w;

        /* renamed from: w0, reason: collision with root package name */
        public static final b f27961w0;

        /* renamed from: x, reason: collision with root package name */
        public static final b f27962x;

        /* renamed from: x0, reason: collision with root package name */
        public static final b f27963x0;

        /* renamed from: y, reason: collision with root package name */
        public static final b f27964y;

        /* renamed from: y0, reason: collision with root package name */
        public static final b f27965y0;

        /* renamed from: z, reason: collision with root package name */
        public static final b f27966z;

        /* renamed from: z0, reason: collision with root package name */
        public static final b f27967z0;

        /* renamed from: b, reason: collision with root package name */
        private final String f27968b;

        static {
            b bVar = new b(0, "AD_PREFERENCE_EXPIRED_DATE", "SdkConfigurationExpiredDate");
            f27921c = bVar;
            b bVar2 = new b(1, "AD_PREFERENCE_MRAID_URL", "SdkConfigurationMraidUrl");
            f27923d = bVar2;
            b bVar3 = new b(2, "AD_PREFERENCE_OM_SDK_JS_CONTROLLER_URL", "SdkConfigurationOmSdkControllerUrl");
            f27925e = bVar3;
            b bVar4 = new b(3, "AD_PREFERENCE_CUSTOM_CLICK_HANDLING_ENABLED", "CustomClickHandlingEnabled");
            f27927f = bVar4;
            b bVar5 = new b(4, "AD_PREFERENCE_AD_IDS_STORAGE_SIZE", "AdIdsStorageSize");
            f27929g = bVar5;
            b bVar6 = new b(5, "AD_BLOCKER_STATUS_VALIDITY_DURATION", "SdkConfigurationAdBlockerStatusValidityDuration");
            f27931h = bVar6;
            b bVar7 = new b(6, "ANTI_AD_BLOCKER_DISABLED", "SdkConfigurationAntiAdBlockerDisabled");
            i = bVar7;
            b bVar8 = new b(7, "VISIBILITY_ERROR_INDICATOR_ENABLED", "SdkConfigurationVisibilityErrorIndicatorEnabled");
            f27934j = bVar8;
            b bVar9 = new b(8, "LIBRARY_VERSION", "SdkConfigurationLibraryVersion");
            f27936k = bVar9;
            b bVar10 = new b(9, "MEDIATION_SENSITIVE_MODE_DISABLED", "SdkConfigurationMediationSensitiveModeDisabled");
            f27938l = bVar10;
            b bVar11 = new b(10, "SENSITIVE_MODE_DISABLED", "SdkConfigurationSensitiveModeDisabled");
            f27940m = bVar11;
            b bVar12 = new b(11, "FUSED_LOCATION_PROVIDER_DISABLED", "SdkConfigurationFusedLocationProviderDisabled");
            f27942n = bVar12;
            b bVar13 = new b(12, "LOCK_SCREEN_ENABLED", "SdkConfigurationLockScreenEnabled");
            f27944o = bVar13;
            b bVar14 = new b(13, "AUTOGRAB_ENABLED", "SdkConfigurationAutograbEnabled");
            f27946p = bVar14;
            b bVar15 = new b(14, "USER_CONSENT", "SdkConfigurationUserConsent");
            f27948q = bVar15;
            b bVar16 = new b(15, "LEGACY_VISIBILITY_LOGIC_ENABLED", "SdkConfigurationLegacyVisibilityLogicEnabled");
            f27950r = bVar16;
            b bVar17 = new b(16, "LEGACY_VAST_TRACKING_ENABLED", "SdkConfigurationLegacyVastTrackingEnabled");
            f27952s = bVar17;
            b bVar18 = new b(17, "OVERLAPPING_VISIBILITY_TRACKING_ENABLED", "SdkConfigurationOverlappingVisibilityTrackingEnabled");
            f27954t = bVar18;
            b bVar19 = new b(18, "OVERLAPPING_WINDOW_TRACKING_ENABLED", "SdkConfigurationOverlappingWindowTrackingEnabled");
            f27956u = bVar19;
            b bVar20 = new b(19, "AD_REQUEST_MAX_RETRIES", "SdkConfigurationAdRequestMaxRetries");
            f27958v = bVar20;
            b bVar21 = new b(20, "PING_REQUEST_MAX_RETRIES", "SdkConfigurationPingRequestMaxRetries");
            f27960w = bVar21;
            b bVar22 = new b(21, "IMPRESSION_VALIDATION_ON_CLICK_ENABLED", "SdkConfigurationImpressionValidationOnClickEnabled");
            f27962x = bVar22;
            b bVar23 = new b(22, "REQUIRED_ASSET_VALIDATION_ON_CLICK_DISABLED", "SdkConfigurationRequiredAssetValidationOnClickDisabled");
            f27964y = bVar23;
            b bVar24 = new b(23, "IMPRESSION_ANY_VALIDATION_ON_CLICK_DISABLED", "SdkConfigurationAnyImpressionValidationOnClickDisabled");
            f27966z = bVar24;
            b bVar25 = new b(24, "LEGACY_SLIDER_IMPRESSION_ENABLED", "SdkConfigurationLegacySliderImpressionEnabled");
            f27883A = bVar25;
            b bVar26 = new b(25, "SHOW_VERSION_VALIDATION_ERROR_LOG", "SdkConfigurationShowVersionValidationErrorLog");
            f27885B = bVar26;
            b bVar27 = new b(26, "SHOW_VERSION_VALIDATION_ERROR_INDICATOR", "SdkConfigurationShowVersionValidationErrorIndicator");
            f27887C = bVar27;
            b bVar28 = new b(27, "INSTREAM_DESIGN", "SdkConfigurationInstreamDesign");
            f27889D = bVar28;
            b bVar29 = new b(28, "FULL_SCREEN_BACK_BUTTON_ENABLED", "SdkConfigurationFullScreenBackButtonEnabled");
            f27891E = bVar29;
            b bVar30 = new b(29, "OPEN_MEASUREMENT_SDK_DISABLED", "SdkConfigurationOpenMeasurementSdkDisabled");
            f27893F = bVar30;
            b bVar31 = new b(30, "NATIVE_WEB_VIEW_POOL_SIZE", "SdkConfigurationNativeWebViewPoolSize");
            f27894G = bVar31;
            b bVar32 = new b(31, "MAX_DISK_CACHE_SIZE_BYTES_FOR_VIDEO", "SdkConfigurationMaxDiskCacheSizeBytesForVideo");
            f27896H = bVar32;
            b bVar33 = new b(32, "MAX_DISK_CACHE_SIZE_BYTES_FOR_REQUEST_QUEUE", "SdkConfigurationMaxDiskCacheSizeBytesForRequestQueue");
            f27898I = bVar33;
            b bVar34 = new b(33, "PUBLIC_ENCRYPTION_KEY", "SdkConfigurationPublicEncryptionKey");
            f27900J = bVar34;
            b bVar35 = new b(34, "PUBLIC_ENCRYPTION_VERSION", "SdkConfigurationPublicEncryptionVersion");
            f27902K = bVar35;
            b bVar36 = new b(35, "ECPM_IMPRESSION_CALLBACK_DISABLED", "SdkConfigurationEcpmImpressionCallbackDisabled");
            f27904L = bVar36;
            b bVar37 = new b(36, "CLOSE_FULLSCREEN_WITH_ADTUNE_DISABLED", "SdkConfigurationCloseFullscreenWithAdtuneDisabled");
            f27905M = bVar37;
            b bVar38 = new b(37, "DIVKIT_DISABLED", "SdkConfigurationDivkitisabled");
            f27906N = bVar38;
            b bVar39 = new b(38, "USE_OKHTTP_NETWORK_STACK", "SdkConfigurationUseOkHttpNetworkStack");
            f27907O = bVar39;
            b bVar40 = new b(39, "LOCATION_CONSENT", "SdkConfigurationLocationConsent");
            f27908P = bVar40;
            b bVar41 = new b(40, "LIBSSL_ENABLED", "SdkConfigurationLibSSLEnabled");
            f27909Q = bVar41;
            b bVar42 = new b(41, "ENCRYPTED_REQUESTS_ENABLED", "SdkConfigurationEncryptedRequestsEnabled");
            f27910R = bVar42;
            b bVar43 = new b(42, "RENDER_ASSET_VALIDATION_ENABLED", "SdkConfigurationRenderAssetValidationEnabled");
            f27911S = bVar43;
            b bVar44 = new b(43, "CLICK_HANDLER_TYPE", "SdkConfigurationClickHandlerType");
            f27912T = bVar44;
            b bVar45 = new b(44, "HARD_SENSITIVE_MODE_ENABLED", "SdkConfigurationHardSensitiveModeEnabled");
            f27913U = bVar45;
            b bVar46 = new b(45, "AGE_RESTRICTED_USER", "SdkConfigurationAgeRestrictedUser");
            f27914V = bVar46;
            b bVar47 = new b(46, "HOST", "SdkConfigurationHost");
            f27915W = bVar47;
            b bVar48 = new b(47, "DIVKIT_FONT", "DivkitFont");
            f27916X = bVar48;
            b bVar49 = new b(48, "AUTOMATIC_SDK_INITIALIZATION_DELAY_ENABLED", "SdkConfigurationAutomaticSdkInitializationDelayEnabled");
            f27917Y = bVar49;
            b bVar50 = new b(49, "NATIVE_BANNER_ENABLED", "NativeBannerEnabled");
            f27918Z = bVar50;
            b bVar51 = new b(50, "USE_NEW_BINDING_API_FOR_DIVKIT", "UseNewBindingApiForDivkit");
            b bVar52 = new b(51, "USE_DIVKIT_CLOSE_ACTION_INSTEAD_SYSTEM_CLICK", "UseDivkitCloseActionInsteadSystemClick");
            f27919a0 = bVar52;
            b bVar53 = new b(52, "BANNER_SIZE_CALCULATION_TYPE", "BannerSizeCalculationType");
            f27920b0 = bVar53;
            b bVar54 = new b(53, "STARTUP_VERSION", "StartupVersion");
            f27922c0 = bVar54;
            b bVar55 = new b(54, "APP_OPEN_AD_PRELOADING_ENABLED", "AppOpenAdPreloadingEnabled");
            f27924d0 = bVar55;
            b bVar56 = new b(55, "INTERSTITIAL_PRELOADING_ENABLED", "InterstitialPreloadingEnabled");
            f27926e0 = bVar56;
            b bVar57 = new b(56, "REWARDED_PRELOADING_ENABLED", "RewardedPreloadingEnabled");
            f27928f0 = bVar57;
            b bVar58 = new b(57, "NEW_FALSE_CLICK_TRACKING_ENABLED", "NewFalseClickTrackingEnabled");
            f27930g0 = bVar58;
            b bVar59 = new b(58, "VARIOQUB_ENABLED", "VarioqubEnabled");
            f27932h0 = bVar59;
            b bVar60 = new b(59, "AAB_HTTP_CHECK_DISABLED", "AabHttpCheckDisabled");
            f27933i0 = bVar60;
            b bVar61 = new b(60, "AAB_HTTP_CHECK_FAILED_REQUESTS_COUNT", "AabHttpCheckFailedRequestsCount");
            f27935j0 = bVar61;
            b bVar62 = new b(61, "CRASH_TRACKER_ENABLED", "CrashTrackerEnabled");
            f27937k0 = bVar62;
            b bVar63 = new b(62, "ERROR_TRACKER_ENABLED", "ErrorTrackerEnabled");
            f27939l0 = bVar63;
            b bVar64 = new b(63, "ANR_TRACKER_ENABLED", "AnrTrackerEnabled");
            f27941m0 = bVar64;
            b bVar65 = new b(64, "ANR_TRACKER_INTERVAL", "AnrTrackerInterval");
            f27943n0 = bVar65;
            b bVar66 = new b(65, "ANR_TRACKER_THRESHOLD", "AnrTrackerThreshold");
            f27945o0 = bVar66;
            b bVar67 = new b(66, "CRASH_IGNORE_ENABLED", "CrashIgnoreEnabled");
            f27947p0 = bVar67;
            b bVar68 = new b(67, "CRASH_STACK_TRACE_EXCLUSION_RULES", "CrashStackTraceExclusionRules");
            f27949q0 = bVar68;
            b bVar69 = new b(68, "SUCCEEDED_IMPRESSION_VALIDATION_DISABLED", "SucceededImpressionValidationDisabled");
            f27951r0 = bVar69;
            b bVar70 = new b(69, "ADAPTIVE_VALIDATION_RULES", "AdaptiveValidationRules");
            f27953s0 = bVar70;
            b bVar71 = new b(70, "TIME_STAMPING_TRACKING_URLS_ENABLED", "TimeStampingTrackingUrlsEnabled");
            f27955t0 = bVar71;
            b bVar72 = new b(71, "APP_AD_ANALYTICS_REPORTING_ENABLED", "AppAdAnalyticsReportingEnabled");
            f27957u0 = bVar72;
            b bVar73 = new b(72, "APP_METRICA_EASY_INTEGRATION_AUTO_ACTIVATION_DISABLED", "AppMetricaEasyIntegrationAutoActivationDisabled");
            f27959v0 = bVar73;
            b bVar74 = new b(73, "NETWORK_THREAD_POOL_SIZE", "SdkConfigurationNetworkThreadPoolSize");
            f27961w0 = bVar74;
            b bVar75 = new b(74, "IMAGE_LOADING_THREAD_POOL_SIZE", "SdkConfigurationImageLoadingThreadPoolSize");
            f27963x0 = bVar75;
            b bVar76 = new b(75, "TIMEOUT_INTERVAL_FOR_REQUEST", "SdkConfigurationTimeoutIntervalForRequest");
            f27965y0 = bVar76;
            b bVar77 = new b(76, "TIMEOUT_INTERVAL_FOR_PING_REQUEST", "SdkConfigurationTimeoutIntervalForPingRequest");
            f27967z0 = bVar77;
            b bVar78 = new b(77, "AD_QUALITY_CONFIGURATION_KEY", "QualityAdVerificationConfiguration");
            f27884A0 = bVar78;
            b bVar79 = new b(78, "SDK_TRACKING_REPORTER_ENABLED", "SdkTrackingReporterEnabled");
            f27886B0 = bVar79;
            b bVar80 = new b(79, "FALLBACK_HOSTS", "SdkConfigurationFallbackHosts");
            f27888C0 = bVar80;
            b bVar81 = new b(80, "SHOULD_PREFETCH_DNS", "ShouldPrefetchDns");
            f27890D0 = bVar81;
            b bVar82 = new b(81, "SHOULD_USE_AD_RENDERED_WEB_VIEW_CALLBACK", "ShouldUseAdRenderedWebViewCallback");
            f27892E0 = bVar82;
            b bVar83 = new b(82, "OUTSTREAM_WRAPPER_VIDEO_SUPPORTED", "OutstreamWrapperVideoSupported");
            F0 = bVar83;
            b bVar84 = new b(83, "VALIDATE_CLICK_IN_WEB_VIEW", "ValidateClickInWebView");
            f27895G0 = bVar84;
            b bVar85 = new b(84, "PASS_FULL_SCREEN_HEIGHT_FROM_SDK_ENABLED", "PassFullScreenHeightFromSdkEnabled");
            f27897H0 = bVar85;
            b bVar86 = new b(85, "INSTREAM_QRCODE_SIZE_IN_PX", "SdkConfigurationInstreamQrcodeSizeInPx");
            f27899I0 = bVar86;
            b bVar87 = new b(86, "HIDE_BOTTOM_NAVIGATION_BAR", "HideBottomNavigationBar");
            f27901J0 = bVar87;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26, bVar27, bVar28, bVar29, bVar30, bVar31, bVar32, bVar33, bVar34, bVar35, bVar36, bVar37, bVar38, bVar39, bVar40, bVar41, bVar42, bVar43, bVar44, bVar45, bVar46, bVar47, bVar48, bVar49, bVar50, bVar51, bVar52, bVar53, bVar54, bVar55, bVar56, bVar57, bVar58, bVar59, bVar60, bVar61, bVar62, bVar63, bVar64, bVar65, bVar66, bVar67, bVar68, bVar69, bVar70, bVar71, bVar72, bVar73, bVar74, bVar75, bVar76, bVar77, bVar78, bVar79, bVar80, bVar81, bVar82, bVar83, bVar84, bVar85, bVar86, bVar87};
            f27903K0 = bVarArr;
            com.google.gson.internal.c.l(bVarArr);
        }

        private b(int i10, String str, String str2) {
            this.f27968b = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f27903K0.clone();
        }

        public final String a() {
            return this.f27968b;
        }
    }

    public gr(cs0 localStorage, b60 exclusionRulesJsonConverter, pa adaptiveValidationRulesConverter, g6 adVerificationConfigurationJsonConverter) {
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        kotlin.jvm.internal.l.f(exclusionRulesJsonConverter, "exclusionRulesJsonConverter");
        kotlin.jvm.internal.l.f(adaptiveValidationRulesConverter, "adaptiveValidationRulesConverter");
        kotlin.jvm.internal.l.f(adVerificationConfigurationJsonConverter, "adVerificationConfigurationJsonConverter");
        this.f27879b = localStorage;
        this.f27880c = exclusionRulesJsonConverter;
        this.f27881d = adaptiveValidationRulesConverter;
        this.f27882e = adVerificationConfigurationJsonConverter;
    }

    @Override // com.yandex.mobile.ads.impl.fr
    public final du1 a() {
        du1 du1VarA;
        Set<z50> setA;
        Map<ns, ? extends Set<String>> mapA;
        n6 n6VarA;
        synchronized (f27878g) {
            try {
                long jB = this.f27879b.b(b.f27921c.a());
                a aVar = f27877f;
                Boolean boolA = a.a(aVar, this.f27879b, b.f27934j.a());
                if (jB != 0) {
                    Integer numB = a.b(aVar, this.f27879b, b.f27958v.a());
                    Integer numB2 = a.b(aVar, this.f27879b, b.f27960w.a());
                    Long lC = a.c(aVar, this.f27879b, b.f27931h.a());
                    boolean zA = this.f27879b.a(b.i.a(), false);
                    int iB = this.f27879b.b(0, b.f27929g.a());
                    int iB2 = this.f27879b.b(0, b.f27894G.a());
                    long jB2 = this.f27879b.b(b.f27896H.a());
                    long jB3 = this.f27879b.b(b.f27898I.a());
                    Boolean boolA2 = a.a(aVar, this.f27879b, b.f27938l.a());
                    boolean zA2 = this.f27879b.a(b.f27942n.a(), false);
                    boolean zA3 = this.f27879b.a(b.f27944o.a(), false);
                    boolean zA4 = this.f27879b.a(b.f27946p.a(), false);
                    Boolean boolA3 = a.a(aVar, this.f27879b, b.f27948q.a());
                    String strD = this.f27879b.d(b.f27936k.a());
                    String strD2 = this.f27879b.d(b.f27915W.a());
                    String strD3 = this.f27879b.d(b.f27916X.a());
                    String strD4 = this.f27879b.d(b.f27912T.a());
                    String strD5 = this.f27879b.d(b.f27923d.a());
                    String strD6 = this.f27879b.d(b.f27925e.a());
                    boolean zA5 = this.f27879b.a(b.f27927f.a(), false);
                    boolean zA6 = this.f27879b.a(b.f27940m.a(), false);
                    boolean zA7 = this.f27879b.a(b.f27913U.a(), false);
                    boolean zA8 = this.f27879b.a(b.f27952s.a(), false);
                    boolean zA9 = this.f27879b.a(b.f27950r.a(), false);
                    boolean zA10 = this.f27879b.a(b.f27954t.a(), false);
                    boolean zA11 = this.f27879b.a(b.f27956u.a(), false);
                    boolean zA12 = this.f27879b.a(b.f27885B.a(), false);
                    boolean zA13 = this.f27879b.a(b.f27887C.a(), false);
                    boolean zA14 = this.f27879b.a(b.f27962x.a(), false);
                    boolean zA15 = this.f27879b.a(b.f27964y.a(), false);
                    boolean zA16 = this.f27879b.a(b.f27966z.a(), false);
                    boolean zA17 = this.f27879b.a(b.f27883A.a(), false);
                    boolean zA18 = this.f27879b.a(b.f27891E.a(), false);
                    boolean zA19 = this.f27879b.a(b.f27893F.a(), false);
                    boolean zA20 = this.f27879b.a(b.f27908P.a(), false);
                    int i = bl.f25320b;
                    zk zkVarA = bl.a(this.f27879b);
                    String strD7 = this.f27879b.d(b.f27900J.a());
                    String strD8 = this.f27879b.d(b.f27889D.a());
                    Integer numB3 = a.b(aVar, this.f27879b, b.f27902K.a());
                    boolean zA21 = this.f27879b.a(b.f27904L.a(), false);
                    boolean zA22 = this.f27879b.a(b.f27906N.a(), false);
                    boolean zA23 = this.f27879b.a(b.f27907O.a(), false);
                    boolean zA24 = this.f27879b.a(b.f27909Q.a(), false);
                    boolean zA25 = this.f27879b.a(b.f27905M.a(), false);
                    boolean zA26 = this.f27879b.a(b.f27910R.a(), false);
                    boolean zA27 = this.f27879b.a(b.f27911S.a(), false);
                    boolean zA28 = this.f27879b.a(b.f27917Y.a(), false);
                    Boolean boolA4 = a.a(aVar, this.f27879b, b.f27914V.a());
                    boolean zA29 = this.f27879b.a(b.f27918Z.a(), false);
                    boolean zA30 = this.f27879b.a(b.f27919a0.a(), false);
                    String strD9 = this.f27879b.d(b.f27920b0.a());
                    String strD10 = this.f27879b.d(b.f27922c0.a());
                    boolean zA31 = this.f27879b.a(b.f27924d0.a(), false);
                    boolean zA32 = this.f27879b.a(b.f27926e0.a(), false);
                    boolean zA33 = this.f27879b.a(b.f27928f0.a(), false);
                    boolean zA34 = this.f27879b.a(b.f27930g0.a(), false);
                    boolean zA35 = this.f27879b.a(b.f27932h0.a(), false);
                    boolean zA36 = this.f27879b.a(b.f27933i0.a(), false);
                    a aVar2 = f27877f;
                    Integer numB4 = a.b(aVar2, this.f27879b, b.f27935j0.a());
                    boolean zA37 = this.f27879b.a(b.f27937k0.a(), false);
                    boolean zA38 = this.f27879b.a(b.f27939l0.a(), false);
                    boolean zA39 = this.f27879b.a(b.f27941m0.a(), false);
                    Long lC2 = a.c(aVar2, this.f27879b, b.f27943n0.a());
                    Long lC3 = a.c(aVar2, this.f27879b, b.f27945o0.a());
                    boolean zA40 = this.f27879b.a(b.f27947p0.a(), false);
                    String strD11 = this.f27879b.d(b.f27949q0.a());
                    if (strD11 != null) {
                        this.f27880c.getClass();
                        setA = b60.a(strD11);
                    } else {
                        setA = null;
                    }
                    Set<z50> set = setA;
                    boolean zA41 = this.f27879b.a(b.f27951r0.a(), false);
                    String strD12 = this.f27879b.d(b.f27953s0.a());
                    if (strD12 != null) {
                        this.f27881d.getClass();
                        mapA = pa.a(new JSONObject(strD12));
                    } else {
                        mapA = null;
                    }
                    Map<ns, ? extends Set<String>> map = mapA;
                    boolean zA42 = this.f27879b.a(b.f27955t0.a(), false);
                    boolean zA43 = this.f27879b.a(b.f27957u0.a(), true);
                    boolean zA44 = this.f27879b.a(b.f27959v0.a(), false);
                    Integer numB5 = a.b(aVar2, this.f27879b, b.f27961w0.a());
                    Integer numB6 = a.b(aVar2, this.f27879b, b.f27963x0.a());
                    Integer numB7 = a.b(aVar2, this.f27879b, b.f27965y0.a());
                    Integer numB8 = a.b(aVar2, this.f27879b, b.f27967z0.a());
                    String strD13 = this.f27879b.d(b.f27884A0.a());
                    if (strD13 != null) {
                        this.f27882e.getClass();
                        n6VarA = g6.a(strD13);
                    } else {
                        n6VarA = null;
                    }
                    n6 n6Var = n6VarA;
                    boolean zA45 = this.f27879b.a(b.f27886B0.a(), false);
                    List<String> listA = fs0.a(this.f27879b, b.f27888C0.a());
                    if (listA == null) {
                        listA = C2099t.f18581b;
                    }
                    List<String> list = listA;
                    boolean zA46 = this.f27879b.a(b.f27890D0.a(), false);
                    boolean zA47 = this.f27879b.a(b.f27892E0.a(), false);
                    boolean zA48 = this.f27879b.a(b.F0.a(), false);
                    boolean zA49 = this.f27879b.a(b.f27895G0.a(), false);
                    boolean zA50 = this.f27879b.a(b.f27897H0.a(), false);
                    Integer numB9 = a.b(aVar2, this.f27879b, b.f27899I0.a());
                    du1.a aVarU = new du1.a().h(strD).c(boolA3).a(jB).b(numB).f(numB2).a(lC).c(zA).a(iB).b(iB2).c(jB2).b(jB3).b(boolA2).s(zA2).C(zA3).h(zA4).O(zA6).t(zA7).f(strD5).g(strD6).m(zA5).d(boolA).y(zA8).z(zA9).H(zA10).I(zA11).R(zA12).Q(zA13).v(zA14).L(zA15).d(zA16).j(zA25).x(zA17).e(strD8).r(zA18).a(zkVarA).o(zA21).n(zA22).W(zA23).F(zA19).B(zA20).a(boolA4).A(zA24).p(zA26).a(strD2).d(strD3).K(zA27).c(strD4).i(zA28).D(zA29).V(zA30).b(strD9).i(strD10).g(zA31).w(zA32).M(zA33).E(zA34).Y(zA35).a(zA36).a(numB4).l(zA37).q(zA38).b(zA39).b(lC2).c(lC3).k(zA40).a(set).T(zA41).a(map).U(zA42).e(zA43).f(zA44).e(numB5).c(numB6).h(numB7).g(numB8).a(n6Var).N(zA45).a(list).P(zA46).S(zA47).G(zA48).X(zA49).J(zA50).d(numB9).u(this.f27879b.a(b.f27901J0.a(), false));
                    if (strD7 != null && numB3 != null) {
                        aVarU.a(new g50(numB3.intValue(), strD7));
                    }
                    du1VarA = aVarU.a();
                } else {
                    du1VarA = null;
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return du1VarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v2, types: [com.yandex.mobile.ads.impl.gr$b] */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v6 */
    @Override // com.yandex.mobile.ads.impl.fr
    public final void a(du1 sdkConfiguration) throws Throwable {
        Object obj;
        b bVar;
        b bVar2;
        Long lC;
        boolean zA0;
        Boolean boolH0;
        Boolean boolU0;
        boolean zK0;
        boolean zT0;
        boolean zD0;
        Boolean boolF0;
        boolean zP0;
        boolean zQ0;
        boolean zY0;
        boolean zZ0;
        boolean zJ0;
        boolean zX0;
        Integer numG;
        Integer numL;
        zk zkVarO;
        boolean zF0;
        boolean zA02;
        Boolean boolZ;
        boolean zE0;
        boolean zV0;
        boolean zD02;
        a aVar;
        cs0 cs0Var;
        ?? r29;
        String strA;
        Integer num;
        kotlin.jvm.internal.l.f(sdkConfiguration, "sdkConfiguration");
        Object obj2 = f27878g;
        synchronized (obj2) {
            try {
                this.f27879b.a(b.f27936k.a(), sdkConfiguration.O());
                this.f27879b.a(b.f27912T.a(), sdkConfiguration.p());
                this.f27879b.b(b.f27940m.a(), sdkConfiguration.C0());
                this.f27879b.b(b.f27913U.a(), sdkConfiguration.l0());
                this.f27879b.a(b.f27921c.a(), sdkConfiguration.x());
                this.f27879b.a(b.f27923d.a(), sdkConfiguration.F());
                this.f27879b.a(b.f27925e.a(), sdkConfiguration.I());
                this.f27879b.a(b.f27889D.a(), sdkConfiguration.B());
                this.f27879b.b(b.f27927f.a(), sdkConfiguration.t());
                this.f27879b.b(b.f27885B.a(), sdkConfiguration.R());
                this.f27879b.b(b.f27887C.a(), sdkConfiguration.Q());
                this.f27879b.a(sdkConfiguration.e(), b.f27929g.a());
                this.f27879b.b(b.f27962x.a(), sdkConfiguration.m0());
                this.f27879b.b(b.f27964y.a(), sdkConfiguration.M());
                this.f27879b.b(b.f27966z.a(), sdkConfiguration.b0());
                this.f27879b.b(b.f27883A.a(), sdkConfiguration.o0());
                this.f27879b.b(b.f27904L.a(), sdkConfiguration.h0());
                this.f27879b.b(b.f27906N.a(), sdkConfiguration.g0());
                cs0 cs0Var2 = this.f27879b;
                bVar = b.f27905M;
                cs0Var2.b(bVar.a(), sdkConfiguration.f0());
                this.f27879b.b(b.f27907O.a(), sdkConfiguration.E0());
                this.f27879b.b(b.f27908P.a(), sdkConfiguration.s0());
                this.f27879b.b(b.f27909Q.a(), sdkConfiguration.r0());
                this.f27879b.b(b.f27910R.a(), sdkConfiguration.i0());
                cs0 cs0Var3 = this.f27879b;
                bVar2 = b.f27911S;
                cs0Var3.b(bVar2.a(), sdkConfiguration.A0());
                this.f27879b.a(sdkConfiguration.G(), b.f27894G.a());
                this.f27879b.a(b.f27896H.a(), sdkConfiguration.E());
                this.f27879b.a(b.f27898I.a(), sdkConfiguration.D());
                this.f27879b.a(b.f27915W.a(), sdkConfiguration.d());
                this.f27879b.a(b.f27916X.a(), sdkConfiguration.u());
                this.f27879b.a(b.f27920b0.a(), sdkConfiguration.n());
                lC = sdkConfiguration.c();
                zA0 = sdkConfiguration.a0();
                boolH0 = sdkConfiguration.H0();
                boolU0 = sdkConfiguration.u0();
                zK0 = sdkConfiguration.k0();
                zT0 = sdkConfiguration.t0();
                zD0 = sdkConfiguration.d0();
                boolF0 = sdkConfiguration.F0();
                zP0 = sdkConfiguration.p0();
                zQ0 = sdkConfiguration.q0();
                zY0 = sdkConfiguration.y0();
                zZ0 = sdkConfiguration.z0();
                zJ0 = sdkConfiguration.j0();
                zX0 = sdkConfiguration.x0();
                numG = sdkConfiguration.g();
                numL = sdkConfiguration.L();
                zkVarO = sdkConfiguration.o();
                zF0 = sdkConfiguration.f0();
                zA02 = sdkConfiguration.A0();
                boolZ = sdkConfiguration.Z();
                zE0 = sdkConfiguration.e0();
                zV0 = sdkConfiguration.v0();
                zD02 = sdkConfiguration.D0();
                aVar = f27877f;
                cs0Var = this.f27879b;
                r29 = b.f27931h;
                strA = r29.a();
            } catch (Throwable th) {
                th = th;
                obj = obj2;
            }
            try {
                if (lC != null) {
                    num = numL;
                    r29 = obj2;
                    cs0Var.a(strA, lC.longValue());
                } else {
                    num = numL;
                    r29 = obj2;
                    cs0Var.a(strA);
                }
                this.f27879b.b(b.i.a(), zA0);
                cs0 cs0Var4 = this.f27879b;
                String strA2 = b.f27934j.a();
                if (boolH0 != null) {
                    cs0Var4.b(strA2, boolH0.booleanValue());
                } else {
                    cs0Var4.a(strA2);
                }
                cs0 cs0Var5 = this.f27879b;
                String strA3 = b.f27938l.a();
                if (boolU0 != null) {
                    cs0Var5.b(strA3, boolU0.booleanValue());
                } else {
                    cs0Var5.a(strA3);
                }
                this.f27879b.b(b.f27942n.a(), zK0);
                this.f27879b.b(b.f27944o.a(), zT0);
                this.f27879b.b(b.f27946p.a(), zD0);
                cs0 cs0Var6 = this.f27879b;
                String strA4 = b.f27948q.a();
                if (boolF0 != null) {
                    cs0Var6.b(strA4, boolF0.booleanValue());
                } else {
                    cs0Var6.a(strA4);
                }
                this.f27879b.b(b.f27952s.a(), zP0);
                this.f27879b.b(b.f27950r.a(), zQ0);
                this.f27879b.b(b.f27954t.a(), zY0);
                a.a(aVar, this.f27879b, b.f27956u.a(), Boolean.valueOf(zZ0));
                a.a(aVar, this.f27879b, bVar.a(), Boolean.valueOf(zF0));
                a.a(aVar, this.f27879b, b.f27891E.a(), Boolean.valueOf(zJ0));
                a.a(aVar, this.f27879b, b.f27893F.a(), Boolean.valueOf(zX0));
                a.a(aVar, this.f27879b, b.f27914V.a(), boolZ);
                a.a(aVar, this.f27879b, b.f27917Y.a(), Boolean.valueOf(zE0));
                a.a(aVar, this.f27879b, b.f27958v.a(), numG);
                a.a(aVar, this.f27879b, b.f27960w.a(), num);
                if (zkVarO != null) {
                    int i = bl.f25320b;
                    bl.a(this.f27879b, zkVarO);
                } else {
                    int i10 = bl.f25320b;
                    bl.b(this.f27879b);
                }
                g50 g50VarV = sdkConfiguration.v();
                if (g50VarV != null) {
                    this.f27879b.a(b.f27900J.a(), g50VarV.d());
                    this.f27879b.a(g50VarV.e(), b.f27902K.a());
                }
                a.a(aVar, this.f27879b, bVar2.a(), Boolean.valueOf(zA02));
                this.f27879b.b(b.f27918Z.a(), zV0);
                this.f27879b.b(b.f27919a0.a(), zD02);
                this.f27879b.a(b.f27922c0.a(), sdkConfiguration.T());
                this.f27879b.b(b.f27924d0.a(), sdkConfiguration.c0());
                this.f27879b.b(b.f27926e0.a(), sdkConfiguration.n0());
                this.f27879b.b(b.f27928f0.a(), sdkConfiguration.B0());
                this.f27879b.b(b.f27930g0.a(), sdkConfiguration.w0());
                this.f27879b.b(b.f27932h0.a(), sdkConfiguration.G0());
                this.f27879b.b(b.f27933i0.a(), sdkConfiguration.a());
                a.a(aVar, this.f27879b, b.f27935j0.a(), sdkConfiguration.b());
                this.f27879b.b(b.f27937k0.a(), sdkConfiguration.s());
                this.f27879b.b(b.f27939l0.a(), sdkConfiguration.w());
                this.f27879b.b(b.f27941m0.a(), sdkConfiguration.i());
                cs0 cs0Var7 = this.f27879b;
                String strA5 = b.f27943n0.a();
                Long lJ = sdkConfiguration.j();
                if (lJ != null) {
                    cs0Var7.a(strA5, lJ.longValue());
                } else {
                    cs0Var7.a(strA5);
                }
                cs0 cs0Var8 = this.f27879b;
                String strA6 = b.f27945o0.a();
                Long lK = sdkConfiguration.k();
                if (lK != null) {
                    cs0Var8.a(strA6, lK.longValue());
                } else {
                    cs0Var8.a(strA6);
                }
                this.f27879b.b(b.f27947p0.a(), sdkConfiguration.q());
                cs0 cs0Var9 = this.f27879b;
                String strA7 = b.f27949q0.a();
                b60 b60Var = this.f27880c;
                Set<z50> setR = sdkConfiguration.r();
                b60Var.getClass();
                cs0Var9.a(strA7, b60.a(setR));
                this.f27879b.b(b.f27951r0.a(), sdkConfiguration.U());
                cs0 cs0Var10 = this.f27879b;
                String strA8 = b.f27953s0.a();
                pa paVar = this.f27881d;
                Map<ns, Set<String>> mapH = sdkConfiguration.h();
                paVar.getClass();
                cs0Var10.a(strA8, pa.a(mapH));
                this.f27879b.b(b.f27955t0.a(), sdkConfiguration.V());
                this.f27879b.b(b.f27957u0.a(), sdkConfiguration.l());
                this.f27879b.b(b.f27959v0.a(), sdkConfiguration.m());
                a.a(aVar, this.f27879b, b.f27961w0.a(), sdkConfiguration.H());
                a.a(aVar, this.f27879b, b.f27963x0.a(), sdkConfiguration.A());
                a.a(aVar, this.f27879b, b.f27965y0.a(), sdkConfiguration.X());
                a.a(aVar, this.f27879b, b.f27967z0.a(), sdkConfiguration.W());
                cs0 cs0Var11 = this.f27879b;
                String strA9 = b.f27884A0.a();
                g6 g6Var = this.f27882e;
                n6 n6VarF = sdkConfiguration.f();
                g6Var.getClass();
                cs0Var11.a(strA9, g6.a(n6VarF));
                this.f27879b.b(b.f27886B0.a(), sdkConfiguration.N());
                fs0.a(this.f27879b, b.f27888C0.a(), sdkConfiguration.y());
                this.f27879b.b(b.f27890D0.a(), sdkConfiguration.P());
                this.f27879b.b(b.f27892E0.a(), sdkConfiguration.S());
                this.f27879b.b(b.F0.a(), sdkConfiguration.J());
                this.f27879b.b(b.f27895G0.a(), sdkConfiguration.Y());
                this.f27879b.b(b.f27897H0.a(), sdkConfiguration.K());
                a.a(f27877f, this.f27879b, b.f27899I0.a(), sdkConfiguration.C());
                this.f27879b.b(b.f27901J0.a(), sdkConfiguration.z());
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th2) {
                th = th2;
                obj = r29;
                throw th;
            }
        }
    }
}
