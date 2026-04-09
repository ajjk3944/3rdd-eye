package com.yandex.mobile.ads.impl;

import c9.C2078B;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ip1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f28771a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f28772b;

    /* renamed from: c, reason: collision with root package name */
    private final C4075b f28773c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f28774a;

        static {
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.l.e(locale, "getDefault(...)");
            String string = "yandex";
            char cCharAt = "yandex".charAt(0);
            if (Character.isLowerCase(cCharAt)) {
                StringBuilder sb = new StringBuilder();
                char titleCase = Character.toTitleCase(cCharAt);
                if (titleCase != Character.toUpperCase(cCharAt)) {
                    sb.append(titleCase);
                } else {
                    String upperCase = "y".toUpperCase(locale);
                    kotlin.jvm.internal.l.e(upperCase, "toUpperCase(...)");
                    sb.append(upperCase);
                }
                sb.append("andex");
                string = sb.toString();
            }
            f28774a = string;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        public static final b f28775A;

        /* renamed from: B, reason: collision with root package name */
        public static final b f28776B;

        /* renamed from: C, reason: collision with root package name */
        public static final b f28777C;

        /* renamed from: D, reason: collision with root package name */
        public static final b f28778D;

        /* renamed from: E, reason: collision with root package name */
        public static final b f28779E;

        /* renamed from: F, reason: collision with root package name */
        public static final b f28780F;

        /* renamed from: G, reason: collision with root package name */
        public static final b f28781G;

        /* renamed from: H, reason: collision with root package name */
        public static final b f28782H;

        /* renamed from: I, reason: collision with root package name */
        public static final b f28783I;

        /* renamed from: J, reason: collision with root package name */
        public static final b f28784J;

        /* renamed from: K, reason: collision with root package name */
        public static final b f28785K;

        /* renamed from: L, reason: collision with root package name */
        public static final b f28786L;

        /* renamed from: M, reason: collision with root package name */
        public static final b f28787M;

        /* renamed from: N, reason: collision with root package name */
        public static final b f28788N;

        /* renamed from: O, reason: collision with root package name */
        public static final b f28789O;

        /* renamed from: P, reason: collision with root package name */
        public static final b f28790P;

        /* renamed from: Q, reason: collision with root package name */
        public static final b f28791Q;

        /* renamed from: R, reason: collision with root package name */
        public static final b f28792R;

        /* renamed from: S, reason: collision with root package name */
        public static final b f28793S;

        /* renamed from: T, reason: collision with root package name */
        public static final b f28794T;

        /* renamed from: U, reason: collision with root package name */
        public static final b f28795U;

        /* renamed from: V, reason: collision with root package name */
        public static final b f28796V;

        /* renamed from: W, reason: collision with root package name */
        public static final b f28797W;

        /* renamed from: X, reason: collision with root package name */
        public static final b f28798X;

        /* renamed from: Y, reason: collision with root package name */
        public static final b f28799Y;

        /* renamed from: Z, reason: collision with root package name */
        public static final b f28800Z;

        /* renamed from: a0, reason: collision with root package name */
        public static final b f28801a0;

        /* renamed from: b0, reason: collision with root package name */
        public static final b f28802b0;

        /* renamed from: c, reason: collision with root package name */
        public static final b f28803c;

        /* renamed from: c0, reason: collision with root package name */
        public static final b f28804c0;

        /* renamed from: d, reason: collision with root package name */
        public static final b f28805d;

        /* renamed from: d0, reason: collision with root package name */
        private static final /* synthetic */ b[] f28806d0;

        /* renamed from: e, reason: collision with root package name */
        public static final b f28807e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f28808f;

        /* renamed from: g, reason: collision with root package name */
        public static final b f28809g;

        /* renamed from: h, reason: collision with root package name */
        public static final b f28810h;
        public static final b i;

        /* renamed from: j, reason: collision with root package name */
        public static final b f28811j;

        /* renamed from: k, reason: collision with root package name */
        public static final b f28812k;

        /* renamed from: l, reason: collision with root package name */
        public static final b f28813l;

        /* renamed from: m, reason: collision with root package name */
        public static final b f28814m;

        /* renamed from: n, reason: collision with root package name */
        public static final b f28815n;

        /* renamed from: o, reason: collision with root package name */
        public static final b f28816o;

        /* renamed from: p, reason: collision with root package name */
        public static final b f28817p;

        /* renamed from: q, reason: collision with root package name */
        public static final b f28818q;

        /* renamed from: r, reason: collision with root package name */
        public static final b f28819r;

        /* renamed from: s, reason: collision with root package name */
        public static final b f28820s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f28821t;

        /* renamed from: u, reason: collision with root package name */
        public static final b f28822u;

        /* renamed from: v, reason: collision with root package name */
        public static final b f28823v;

        /* renamed from: w, reason: collision with root package name */
        public static final b f28824w;

        /* renamed from: x, reason: collision with root package name */
        public static final b f28825x;

        /* renamed from: y, reason: collision with root package name */
        public static final b f28826y;

        /* renamed from: z, reason: collision with root package name */
        public static final b f28827z;

        /* renamed from: b, reason: collision with root package name */
        private final String f28828b;

        static {
            b bVar = new b(0, "AD_LOADING_RESULT", "ad_loading_result");
            f28803c = bVar;
            b bVar2 = new b(1, "AD_RENDERING_RESULT", "ad_rendering_result");
            f28805d = bVar2;
            b bVar3 = new b(2, "ADAPTER_AUTO_REFRESH", "adapter_auto_refresh");
            f28807e = bVar3;
            b bVar4 = new b(3, "ADAPTER_INVALID", "adapter_invalid");
            f28808f = bVar4;
            b bVar5 = new b(4, "ADAPTER_REQUEST", "adapter_request");
            f28809g = bVar5;
            b bVar6 = new b(5, "ADAPTER_RESPONSE", "adapter_response");
            f28810h = bVar6;
            b bVar7 = new b(6, "ADAPTER_BIDDER_TOKEN_REQUEST", "adapter_bidder_token_request");
            i = bVar7;
            b bVar8 = new b(7, "ADTUNE", "adtune");
            f28811j = bVar8;
            b bVar9 = new b(8, "REQUEST", "ad_request");
            f28812k = bVar9;
            b bVar10 = new b(9, "RESPONSE", "ad_response");
            f28813l = bVar10;
            b bVar11 = new b(10, "VAST_REQUEST", "vast_request");
            f28814m = bVar11;
            b bVar12 = new b(11, "VAST_RESPONSE", "vast_response");
            f28815n = bVar12;
            b bVar13 = new b(12, "VAST_WRAPPER_REQUEST", "vast_wrapper_request");
            f28816o = bVar13;
            b bVar14 = new b(13, "VAST_WRAPPER_RESPONSE", "vast_wrapper_response");
            f28817p = bVar14;
            b bVar15 = new b(14, "VIDEO_AD_START", "video_ad_start");
            f28818q = bVar15;
            b bVar16 = new b(15, "VIDEO_AD_COMPLETE", "video_ad_complete");
            f28819r = bVar16;
            b bVar17 = new b(16, "VIDEO_AD_PLAYER_ERROR", "video_ad_player_error");
            f28820s = bVar17;
            b bVar18 = new b(17, "VMAP_REQUEST", "vmap_request");
            f28821t = bVar18;
            b bVar19 = new b(18, "VMAP_RESPONSE", "vmap_response");
            f28822u = bVar19;
            b bVar20 = new b(19, "RENDERING_START", "rendering_start");
            f28823v = bVar20;
            b bVar21 = new b(20, "DSP_RENDERING_START", "dsp_rendering_start");
            f28824w = bVar21;
            b bVar22 = new b(21, "IMPRESSION_TRACKING_START", "impression_tracking_start");
            f28825x = bVar22;
            b bVar23 = new b(22, "IMPRESSION_TRACKING_SUCCESS", "impression_tracking_success");
            f28826y = bVar23;
            b bVar24 = new b(23, "IMPRESSION_TRACKING_FAILURE", "impression_tracking_failure");
            f28827z = bVar24;
            b bVar25 = new b(24, "FORCED_IMPRESSION_TRACKING_FAILURE", "forced_impression_tracking_failure");
            f28775A = bVar25;
            b bVar26 = new b(25, "ADAPTER_ACTION", "adapter_action");
            f28776B = bVar26;
            b bVar27 = new b(26, "CLICK", "click");
            f28777C = bVar27;
            b bVar28 = new b(27, "CLOSE", com.vungle.ads.internal.presenter.g.CLOSE);
            f28778D = bVar28;
            b bVar29 = new b(28, "FEEDBACK", "feedback");
            f28779E = bVar29;
            b bVar30 = new b(29, "DEEPLINK", "deeplink");
            f28780F = bVar30;
            b bVar31 = new b(30, "SHOW_SOCIAL_ACTIONS", "show_social_actions");
            f28781G = bVar31;
            b bVar32 = new b(31, "BOUND_ASSETS", "bound_assets");
            f28782H = bVar32;
            b bVar33 = new b(32, "RENDERED_ASSETS", "rendered_assets");
            f28783I = bVar33;
            b bVar34 = new b(33, "REBIND", "rebind");
            f28784J = bVar34;
            b bVar35 = new b(34, "BINDING_FAILURE", "binding_failure");
            f28785K = bVar35;
            b bVar36 = new b(35, "EXPECTED_VIEW_MISSING", "expected_view_missing");
            f28786L = bVar36;
            b bVar37 = new b(36, "RETURNED_TO_APP", "returned_to_app");
            f28787M = bVar37;
            b bVar38 = new b(37, "REWARD", "reward");
            f28788N = bVar38;
            b bVar39 = new b(38, "VIDEO_AD_RENDERING_RESULT", "video_ad_rendering_result");
            f28789O = bVar39;
            b bVar40 = new b(39, "MULTIBANNER_EVENT", "multibanner_event");
            f28790P = bVar40;
            b bVar41 = new b(40, "AD_VIEW_SIZE_INFO", "ad_view_size_info");
            f28791Q = bVar41;
            b bVar42 = new b(41, "DSP_IMPRESSION_TRACKING_START", "dsp_impression_tracking_start");
            f28792R = bVar42;
            b bVar43 = new b(42, "DSP_IMPRESSION_TRACKING_SUCCESS", "dsp_impression_tracking_success");
            f28793S = bVar43;
            b bVar44 = new b(43, "DSP_IMPRESSION_TRACKING_FAILURE", "dsp_impression_tracking_failure");
            f28794T = bVar44;
            b bVar45 = new b(44, "DSP_FORCED_IMPRESSION_TRACKING_FAILURE", "dsp_forced_impression_tracking_failure");
            f28795U = bVar45;
            b bVar46 = new b(45, "LOG", "log");
            f28796V = bVar46;
            b bVar47 = new b(46, "OPEN_BIDDING_TOKEN_GENERATION_RESULT", "open_bidding_token_generation_result");
            f28797W = bVar47;
            b bVar48 = new b(47, "SDK_CONFIGURATION_SUCCESS", "sdk_configuration_success");
            f28798X = bVar48;
            b bVar49 = new b(48, "SDK_CONFIGURATION_FAILURE", "sdk_configuration_failure");
            f28799Y = bVar49;
            b bVar50 = new b(49, "SDK_TRACKING_EVENT", "tracking_event");
            f28800Z = bVar50;
            b bVar51 = new b(50, "AD_VERIFICATION_RESULT", "ad_verification_result");
            f28801a0 = bVar51;
            b bVar52 = new b(51, "SDK_CONFIGURATION_REQUEST", "sdk_configuration_request");
            f28802b0 = bVar52;
            b bVar53 = new b(52, "ACTIVITY_RESULT_OPENED", "activity_result_opened");
            f28804c0 = bVar53;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26, bVar27, bVar28, bVar29, bVar30, bVar31, bVar32, bVar33, bVar34, bVar35, bVar36, bVar37, bVar38, bVar39, bVar40, bVar41, bVar42, bVar43, bVar44, bVar45, bVar46, bVar47, bVar48, bVar49, bVar50, bVar51, bVar52, bVar53};
            f28806d0 = bVarArr;
            com.google.gson.internal.c.l(bVarArr);
        }

        private b(int i10, String str, String str2) {
            this.f28828b = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f28806d0.clone();
        }

        public final String a() {
            return this.f28828b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f28829c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f28830d;

        /* renamed from: e, reason: collision with root package name */
        public static final c f28831e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ c[] f28832f;

        /* renamed from: b, reason: collision with root package name */
        private final String f28833b;

        static {
            c cVar = new c(0, "SUCCESS", "success");
            f28829c = cVar;
            c cVar2 = new c(1, "ERROR", com.vungle.ads.internal.presenter.g.ERROR);
            f28830d = cVar2;
            c cVar3 = new c(2, "NO_ADS", "no_ads");
            f28831e = cVar3;
            c[] cVarArr = {cVar, cVar2, cVar3, new c(3, "FILTERED", "filtered")};
            f28832f = cVarArr;
            com.google.gson.internal.c.l(cVarArr);
        }

        private c(int i, String str, String str2) {
            this.f28833b = str2;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f28832f.clone();
        }

        public final String a() {
            return this.f28833b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ip1(b reportType, Map<String, ? extends Object> reportData, C4075b c4075b) {
        this(reportType.a(), C2078B.u(reportData), c4075b);
        kotlin.jvm.internal.l.f(reportType, "reportType");
        kotlin.jvm.internal.l.f(reportData, "reportData");
    }

    public final C4075b a() {
        return this.f28773c;
    }

    public final Map<String, Object> b() {
        return this.f28772b;
    }

    public final String c() {
        return this.f28771a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip1)) {
            return false;
        }
        ip1 ip1Var = (ip1) obj;
        return kotlin.jvm.internal.l.b(this.f28771a, ip1Var.f28771a) && kotlin.jvm.internal.l.b(this.f28772b, ip1Var.f28772b) && kotlin.jvm.internal.l.b(this.f28773c, ip1Var.f28773c);
    }

    public final int hashCode() {
        int iHashCode = (this.f28772b.hashCode() + (this.f28771a.hashCode() * 31)) * 31;
        C4075b c4075b = this.f28773c;
        return iHashCode + (c4075b == null ? 0 : c4075b.hashCode());
    }

    public final String toString() {
        return "Report(eventName=" + this.f28771a + ", data=" + this.f28772b + ", abExperiments=" + this.f28773c + ")";
    }

    public ip1(String eventName, Map<String, Object> data, C4075b c4075b) {
        kotlin.jvm.internal.l.f(eventName, "eventName");
        kotlin.jvm.internal.l.f(data, "data");
        this.f28771a = eventName;
        this.f28772b = data;
        this.f28773c = c4075b;
        data.put("sdk_version", "7.14.0");
    }
}
