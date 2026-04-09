package q7;

import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vungle.ads.AdConfig;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.util.o;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.w;
import kotlin.text.Regex;
import kotlinx.serialization.Contextual;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b1;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.r0;
import kotlinx.serialization.internal.v0;
import kotlinx.serialization.internal.w1;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xbill.DNS.KEYRecord;
import s9.u;
import y8.s;
import z8.v;
import z8.z;

/* loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final e Companion = new e(null);

    @NotNull
    public static final String FILE_SCHEME = "file://";

    @NotNull
    public static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";

    @NotNull
    public static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";

    @NotNull
    public static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";

    @NotNull
    public static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";

    @NotNull
    public static final String KEY_VM = "vmURL";

    @NotNull
    private static final String TAG = "AdPayload";

    @NotNull
    public static final String TPAT_CLICK_COORDINATES_URLS = "video.clickCoordinates";

    @NotNull
    private static final String UNKNOWN = "unknown";

    @Nullable
    private AdConfig adConfig;

    @Nullable
    private final List<f> ads;
    private boolean assetsFullyDownloaded;

    @Nullable
    private final ConfigPayload config;

    @Nullable
    private Long expiryWindowStart;

    @NotNull
    private Map<String, String> incentivizedTextSettings;

    @Nullable
    private String indexFilePath;

    @Nullable
    private o logEntry;

    @NotNull
    private ConcurrentHashMap<String, String> mraidFiles;

    @NotNull
    private final Map<String, AdAsset> partialDownloadAssets;

    /* renamed from: q7.a$a, reason: collision with other inner class name */
    public static final class C0460a implements i0 {

        @NotNull
        public static final C0460a INSTANCE;
        public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

        static {
            C0460a c0460a = new C0460a();
            INSTANCE = c0460a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload", c0460a, 7);
            pluginGeneratedSerialDescriptor.k(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, true);
            pluginGeneratedSerialDescriptor.k("config", true);
            pluginGeneratedSerialDescriptor.k("expiryWindowStart", true);
            pluginGeneratedSerialDescriptor.k("mraidFiles", true);
            pluginGeneratedSerialDescriptor.k("incentivizedTextSettings", true);
            pluginGeneratedSerialDescriptor.k("assetsFullyDownloaded", true);
            pluginGeneratedSerialDescriptor.k("indexFilePath", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C0460a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            kotlinx.serialization.b bVarS = x9.a.s(new kotlinx.serialization.internal.f(f.C0465a.INSTANCE));
            kotlinx.serialization.b bVarS2 = x9.a.s(ConfigPayload.a.INSTANCE);
            kotlinx.serialization.b bVarS3 = x9.a.s(b1.f22826a);
            r9.c cVarB = t.b(ConcurrentHashMap.class);
            b2 b2Var = b2.f22828a;
            return new kotlinx.serialization.b[]{bVarS, bVarS2, bVarS3, new ContextualSerializer(cVarB, null, new kotlinx.serialization.b[]{b2Var, b2Var}), new v0(b2Var, b2Var), kotlinx.serialization.internal.i.f22868a, x9.a.s(b2Var)};
        }

        @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
        @NotNull
        public kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] typeParametersSerializers() {
            return i0.a.a(this);
        }

        @Override // kotlinx.serialization.a
        @NotNull
        public a deserialize(@NotNull y9.e decoder) {
            Object objN;
            Object objN2;
            boolean z10;
            Object objY;
            Object objY2;
            int i10;
            Object objN3;
            Object objN4;
            char c10;
            p.e(decoder, "decoder");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            int i11 = 6;
            int i12 = 5;
            if (cVarB.p()) {
                objN = cVarB.n(descriptor2, 0, new kotlinx.serialization.internal.f(f.C0465a.INSTANCE), null);
                objN4 = cVarB.n(descriptor2, 1, ConfigPayload.a.INSTANCE, null);
                objN3 = cVarB.n(descriptor2, 2, b1.f22826a, null);
                r9.c cVarB2 = t.b(ConcurrentHashMap.class);
                b2 b2Var = b2.f22828a;
                objY = cVarB.y(descriptor2, 3, new ContextualSerializer(cVarB2, null, new kotlinx.serialization.b[]{b2Var, b2Var}), null);
                objY2 = cVarB.y(descriptor2, 4, new v0(b2Var, b2Var), null);
                boolean zC = cVarB.C(descriptor2, 5);
                objN2 = cVarB.n(descriptor2, 6, b2Var, null);
                i10 = 127;
                z10 = zC;
            } else {
                boolean z11 = true;
                boolean zC2 = false;
                int i13 = 0;
                objN = null;
                Object objN5 = null;
                Object objN6 = null;
                Object objN7 = null;
                Object objY3 = null;
                Object objY4 = null;
                while (z11) {
                    int iO = cVarB.o(descriptor2);
                    switch (iO) {
                        case -1:
                            z11 = false;
                            i12 = 5;
                        case 0:
                            objN = cVarB.n(descriptor2, 0, new kotlinx.serialization.internal.f(f.C0465a.INSTANCE), objN);
                            i13 |= 1;
                            i11 = 6;
                            i12 = 5;
                        case 1:
                            objN6 = cVarB.n(descriptor2, 1, ConfigPayload.a.INSTANCE, objN6);
                            i13 |= 2;
                            i11 = 6;
                            i12 = 5;
                        case 2:
                            c10 = 3;
                            objN5 = cVarB.n(descriptor2, 2, b1.f22826a, objN5);
                            i13 |= 4;
                            i11 = 6;
                            i12 = 5;
                        case 3:
                            r9.c cVarB3 = t.b(ConcurrentHashMap.class);
                            b2 b2Var2 = b2.f22828a;
                            c10 = 3;
                            objY3 = cVarB.y(descriptor2, 3, new ContextualSerializer(cVarB3, null, new kotlinx.serialization.b[]{b2Var2, b2Var2}), objY3);
                            i13 |= 8;
                            i11 = 6;
                            i12 = 5;
                        case 4:
                            b2 b2Var3 = b2.f22828a;
                            objY4 = cVarB.y(descriptor2, 4, new v0(b2Var3, b2Var3), objY4);
                            i13 |= 16;
                            i11 = 6;
                        case 5:
                            zC2 = cVarB.C(descriptor2, i12);
                            i13 |= 32;
                        case 6:
                            objN7 = cVarB.n(descriptor2, i11, b2.f22828a, objN7);
                            i13 |= 64;
                        default:
                            throw new UnknownFieldException(iO);
                    }
                }
                objN2 = objN7;
                z10 = zC2;
                objY = objY3;
                objY2 = objY4;
                i10 = i13;
                objN3 = objN5;
                objN4 = objN6;
            }
            cVarB.c(descriptor2);
            return new a(i10, (List) objN, (ConfigPayload) objN4, (Long) objN3, (ConcurrentHashMap) objY, (Map) objY2, z10, (String) objN2, null);
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull a value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.d dVarB = encoder.b(descriptor2);
            a.write$Self(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }
    }

    public static final class b {

        @NotNull
        public static final C0462b Companion = new C0462b(null);

        @Nullable
        private final Integer height;

        @Nullable
        private final Integer width;

        /* renamed from: q7.a$b$a, reason: collision with other inner class name */
        public static final class C0461a implements i0 {

            @NotNull
            public static final C0461a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                C0461a c0461a = new C0461a();
                INSTANCE = c0461a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.AdSizeInfo", c0461a, 2);
                pluginGeneratedSerialDescriptor.k("w", true);
                pluginGeneratedSerialDescriptor.k("h", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C0461a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                r0 r0Var = r0.f22908a;
                return new kotlinx.serialization.b[]{x9.a.s(r0Var), x9.a.s(r0Var)};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public b deserialize(@NotNull y9.e decoder) {
                Object objN;
                int i10;
                Object objN2;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                w1 w1Var = null;
                if (cVarB.p()) {
                    r0 r0Var = r0.f22908a;
                    objN2 = cVarB.n(descriptor2, 0, r0Var, null);
                    objN = cVarB.n(descriptor2, 1, r0Var, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objN = null;
                    Object objN3 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objN3 = cVarB.n(descriptor2, 0, r0.f22908a, objN3);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            objN = cVarB.n(descriptor2, 1, r0.f22908a, objN);
                            i11 |= 2;
                        }
                    }
                    i10 = i11;
                    objN2 = objN3;
                }
                cVarB.c(descriptor2);
                return new b(i10, (Integer) objN2, (Integer) objN, w1Var);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull b value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                b.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        /* renamed from: q7.a$b$b, reason: collision with other inner class name */
        public static final class C0462b {
            public /* synthetic */ C0462b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return C0461a.INSTANCE;
            }

            private C0462b() {
            }
        }

        public b() {
            this((Integer) null, (Integer) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.i) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ b copy$default(b bVar, Integer num, Integer num2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = bVar.width;
            }
            if ((i10 & 2) != 0) {
                num2 = bVar.height;
            }
            return bVar.copy(num, num2);
        }

        @JvmStatic
        public static final void write$Self(@NotNull b self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            Integer num;
            Integer num2;
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || (num2 = self.width) == null || num2.intValue() != 0) {
                output.i(serialDesc, 0, r0.f22908a, self.width);
            }
            if (output.z(serialDesc, 1) || (num = self.height) == null || num.intValue() != 0) {
                output.i(serialDesc, 1, r0.f22908a, self.height);
            }
        }

        @Nullable
        public final Integer component1() {
            return this.width;
        }

        @Nullable
        public final Integer component2() {
            return this.height;
        }

        @NotNull
        public final b copy(@Nullable Integer num, @Nullable Integer num2) {
            return new b(num, num2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p.a(this.width, bVar.width) && p.a(this.height, bVar.height);
        }

        @Nullable
        public final Integer getHeight() {
            return this.height;
        }

        @Nullable
        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            Integer num = this.width;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.height;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdSizeInfo(width=" + this.width + ", height=" + this.height + ')';
        }

        public b(@Nullable Integer num, @Nullable Integer num2) {
            this.width = num;
            this.height = num2;
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ b(int i10, @SerialName("w") Integer num, @SerialName("h") Integer num2, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.width = 0;
            } else {
                this.width = num;
            }
            if ((i10 & 2) == 0) {
                this.height = 0;
            } else {
                this.height = num2;
            }
        }

        public /* synthetic */ b(Integer num, Integer num2, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? 0 : num2);
        }

        @SerialName("h")
        public static /* synthetic */ void getHeight$annotations() {
        }

        @SerialName("w")
        public static /* synthetic */ void getWidth$annotations() {
        }
    }

    public static final class c {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final Boolean adLoadOptimizationEnabled;

        @Nullable
        private final String adMarketId;

        @Nullable
        private final b adSizeInfo;

        @Nullable
        private final String adSource;

        @Nullable
        private final String adType;

        @Nullable
        private final String advAppId;

        @Nullable
        private final Boolean clickCoordinatesEnabled;

        @Nullable
        private final String creativeId;

        @Nullable
        private final String deeplinkUrl;

        @Nullable
        private final Integer errorCode;

        @Nullable
        private final Integer expiry;

        @Nullable
        private final Integer expiryDuration;

        @Nullable
        private final String id;

        @Nullable
        private final String info;

        @Nullable
        private final List<String> loadAdUrls;

        @Nullable
        private final String mediationName;

        @Nullable
        private final List<String> notification;

        @Nullable
        private final Boolean partialDownloadEnabled;

        @Nullable
        private final Integer showClose;

        @Nullable
        private final Integer showCloseIncentivized;

        @Nullable
        private final Integer sleep;

        @Nullable
        private final Boolean templateHeartbeatCheck;

        @Nullable
        private final g templateSettings;

        @Nullable
        private final String templateType;

        @Nullable
        private final Map<String, List<String>> tpat;

        @Nullable
        private final Boolean usePreloading;

        @Nullable
        private final i viewAbility;

        @Nullable
        private final String vmURL;

        @Nullable
        private final String vmVersion;

        @Nullable
        private final k webViewSettings;

        /* renamed from: q7.a$c$a, reason: collision with other inner class name */
        public static final class C0463a implements i0 {

            @NotNull
            public static final C0463a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                C0463a c0463a = new C0463a();
                INSTANCE = c0463a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.AdUnit", c0463a, 30);
                pluginGeneratedSerialDescriptor.k("id", true);
                pluginGeneratedSerialDescriptor.k("ad_type", true);
                pluginGeneratedSerialDescriptor.k("ad_source", true);
                pluginGeneratedSerialDescriptor.k("expiry", true);
                pluginGeneratedSerialDescriptor.k("expiry_duration", true);
                pluginGeneratedSerialDescriptor.k("deeplink_url", true);
                pluginGeneratedSerialDescriptor.k("click_coordinates_enabled", true);
                pluginGeneratedSerialDescriptor.k("ad_load_optimization", true);
                pluginGeneratedSerialDescriptor.k("template_heartbeat_check", true);
                pluginGeneratedSerialDescriptor.k("mediation_name", true);
                pluginGeneratedSerialDescriptor.k("info", true);
                pluginGeneratedSerialDescriptor.k("sleep", true);
                pluginGeneratedSerialDescriptor.k("error_code", true);
                pluginGeneratedSerialDescriptor.k("tpat", true);
                pluginGeneratedSerialDescriptor.k("vm_url", true);
                pluginGeneratedSerialDescriptor.k("vm_version", true);
                pluginGeneratedSerialDescriptor.k("ad_market_id", true);
                pluginGeneratedSerialDescriptor.k("notification", true);
                pluginGeneratedSerialDescriptor.k(com.vungle.ads.internal.b.LOAD_AD, true);
                pluginGeneratedSerialDescriptor.k("viewability", true);
                pluginGeneratedSerialDescriptor.k("template_type", true);
                pluginGeneratedSerialDescriptor.k("template_settings", true);
                pluginGeneratedSerialDescriptor.k(CampaignEx.JSON_KEY_CREATIVE_ID, true);
                pluginGeneratedSerialDescriptor.k(MBridgeConstans.APP_ID, true);
                pluginGeneratedSerialDescriptor.k("show_close", true);
                pluginGeneratedSerialDescriptor.k("show_close_incentivized", true);
                pluginGeneratedSerialDescriptor.k("ad_size", true);
                pluginGeneratedSerialDescriptor.k("webview_settings", true);
                pluginGeneratedSerialDescriptor.k("use_preloading", true);
                pluginGeneratedSerialDescriptor.k("ad_partial_download_enabled", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C0463a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                b2 b2Var = b2.f22828a;
                kotlinx.serialization.b bVarS = x9.a.s(b2Var);
                kotlinx.serialization.b bVarS2 = x9.a.s(b2Var);
                kotlinx.serialization.b bVarS3 = x9.a.s(b2Var);
                r0 r0Var = r0.f22908a;
                kotlinx.serialization.b bVarS4 = x9.a.s(r0Var);
                kotlinx.serialization.b bVarS5 = x9.a.s(r0Var);
                kotlinx.serialization.b bVarS6 = x9.a.s(b2Var);
                kotlinx.serialization.internal.i iVar = kotlinx.serialization.internal.i.f22868a;
                return new kotlinx.serialization.b[]{bVarS, bVarS2, bVarS3, bVarS4, bVarS5, bVarS6, x9.a.s(iVar), x9.a.s(iVar), x9.a.s(iVar), x9.a.s(b2Var), x9.a.s(b2Var), x9.a.s(r0Var), x9.a.s(r0Var), x9.a.s(h.INSTANCE), x9.a.s(b2Var), x9.a.s(b2Var), x9.a.s(b2Var), x9.a.s(new kotlinx.serialization.internal.f(b2Var)), x9.a.s(new kotlinx.serialization.internal.f(b2Var)), x9.a.s(i.C0467a.INSTANCE), x9.a.s(b2Var), x9.a.s(g.C0466a.INSTANCE), x9.a.s(b2Var), x9.a.s(b2Var), x9.a.s(r0Var), x9.a.s(r0Var), x9.a.s(b.C0461a.INSTANCE), x9.a.s(k.C0469a.INSTANCE), x9.a.s(iVar), x9.a.s(iVar)};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public c deserialize(@NotNull y9.e decoder) {
                Object obj;
                Object obj2;
                Object objN;
                Object obj3;
                Object objN2;
                Object obj4;
                Object obj5;
                Object obj6;
                int i10;
                Object objN3;
                Object objN4;
                Object obj7;
                Object objN5;
                Object objN6;
                Object objN7;
                Object obj8;
                Object objN8;
                Object objN9;
                Object obj9;
                Object obj10;
                Object objN10;
                Object objN11;
                Object objN12;
                Object objN13;
                Object objN14;
                Object obj11;
                Object objN15;
                Object objN16;
                Object obj12;
                Object objN17;
                Object objN18;
                Object obj13;
                Object obj14;
                Object obj15;
                Object obj16;
                Object obj17;
                Object obj18;
                Object obj19;
                Object obj20;
                Object obj21;
                Object obj22;
                Object obj23;
                Object obj24;
                Object obj25;
                Object obj26;
                Object obj27;
                Object obj28;
                Object obj29;
                Object obj30;
                Object obj31;
                Object obj32;
                Object obj33;
                Object objN19;
                Object obj34;
                Object obj35;
                Object obj36;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                if (cVarB.p()) {
                    b2 b2Var = b2.f22828a;
                    Object objN20 = cVarB.n(descriptor2, 0, b2Var, null);
                    Object objN21 = cVarB.n(descriptor2, 1, b2Var, null);
                    Object objN22 = cVarB.n(descriptor2, 2, b2Var, null);
                    r0 r0Var = r0.f22908a;
                    objN16 = cVarB.n(descriptor2, 3, r0Var, null);
                    objN15 = cVarB.n(descriptor2, 4, r0Var, null);
                    objN6 = cVarB.n(descriptor2, 5, b2Var, null);
                    kotlinx.serialization.internal.i iVar = kotlinx.serialization.internal.i.f22868a;
                    objN7 = cVarB.n(descriptor2, 6, iVar, null);
                    objN5 = cVarB.n(descriptor2, 7, iVar, null);
                    Object objN23 = cVarB.n(descriptor2, 8, iVar, null);
                    objN4 = cVarB.n(descriptor2, 9, b2Var, null);
                    Object objN24 = cVarB.n(descriptor2, 10, b2Var, null);
                    objN3 = cVarB.n(descriptor2, 11, r0Var, null);
                    objN17 = cVarB.n(descriptor2, 12, r0Var, null);
                    Object objN25 = cVarB.n(descriptor2, 13, h.INSTANCE, null);
                    Object objN26 = cVarB.n(descriptor2, 14, b2Var, null);
                    obj11 = objN25;
                    objN14 = cVarB.n(descriptor2, 15, b2Var, null);
                    objN13 = cVarB.n(descriptor2, 16, b2Var, null);
                    obj3 = objN26;
                    objN12 = cVarB.n(descriptor2, 17, new kotlinx.serialization.internal.f(b2Var), null);
                    objN11 = cVarB.n(descriptor2, 18, new kotlinx.serialization.internal.f(b2Var), null);
                    objN10 = cVarB.n(descriptor2, 19, i.C0467a.INSTANCE, null);
                    objN2 = cVarB.n(descriptor2, 20, b2Var, null);
                    Object objN27 = cVarB.n(descriptor2, 21, g.C0466a.INSTANCE, null);
                    Object objN28 = cVarB.n(descriptor2, 22, b2Var, null);
                    obj10 = objN27;
                    Object objN29 = cVarB.n(descriptor2, 23, b2Var, null);
                    Object objN30 = cVarB.n(descriptor2, 24, r0Var, null);
                    objN9 = cVarB.n(descriptor2, 25, r0Var, null);
                    objN8 = cVarB.n(descriptor2, 26, b.C0461a.INSTANCE, null);
                    Object objN31 = cVarB.n(descriptor2, 27, k.C0469a.INSTANCE, null);
                    objN18 = cVarB.n(descriptor2, 28, iVar, null);
                    objN = cVarB.n(descriptor2, 29, iVar, null);
                    obj6 = objN20;
                    obj5 = objN30;
                    obj4 = objN28;
                    i10 = 1073741823;
                    obj7 = objN23;
                    obj = objN24;
                    obj2 = objN22;
                    obj12 = objN21;
                    obj8 = objN31;
                    obj9 = objN29;
                } else {
                    boolean z10 = true;
                    Object objN32 = null;
                    Object objN33 = null;
                    Object obj37 = null;
                    Object obj38 = null;
                    Object obj39 = null;
                    Object obj40 = null;
                    Object obj41 = null;
                    Object obj42 = null;
                    Object obj43 = null;
                    Object obj44 = null;
                    obj = null;
                    Object obj45 = null;
                    Object obj46 = null;
                    Object obj47 = null;
                    Object obj48 = null;
                    Object obj49 = null;
                    Object obj50 = null;
                    Object obj51 = null;
                    Object obj52 = null;
                    Object obj53 = null;
                    Object obj54 = null;
                    Object obj55 = null;
                    Object obj56 = null;
                    Object obj57 = null;
                    Object obj58 = null;
                    Object obj59 = null;
                    Object obj60 = null;
                    Object obj61 = null;
                    Object obj62 = null;
                    int i11 = 0;
                    Object objN34 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        switch (iO) {
                            case -1:
                                obj13 = objN34;
                                obj14 = objN32;
                                obj15 = obj37;
                                obj16 = obj38;
                                obj17 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                s sVar = s.f25199a;
                                z10 = false;
                                objN19 = obj17;
                                objN34 = obj13;
                                obj38 = obj16;
                                obj37 = obj15;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 0:
                                obj13 = objN34;
                                obj15 = obj37;
                                obj16 = obj38;
                                obj17 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj14 = objN32;
                                Object objN35 = cVarB.n(descriptor2, 0, b2.f22828a, obj62);
                                i11 |= 1;
                                s sVar2 = s.f25199a;
                                obj62 = objN35;
                                objN19 = obj17;
                                objN34 = obj13;
                                obj38 = obj16;
                                obj37 = obj15;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 1:
                                Object obj63 = obj37;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                Object objN36 = cVarB.n(descriptor2, 1, b2.f22828a, obj38);
                                i11 |= 2;
                                s sVar3 = s.f25199a;
                                obj38 = objN36;
                                objN19 = obj45;
                                obj14 = objN32;
                                obj37 = obj63;
                                objN34 = objN34;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 2:
                                obj34 = obj37;
                                obj35 = obj38;
                                obj36 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                objN34 = cVarB.n(descriptor2, 2, b2.f22828a, objN34);
                                i11 |= 4;
                                s sVar4 = s.f25199a;
                                obj14 = objN32;
                                objN19 = obj36;
                                obj37 = obj34;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 3:
                                obj34 = obj37;
                                obj35 = obj38;
                                obj36 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                objN33 = cVarB.n(descriptor2, 3, r0.f22908a, objN33);
                                i11 |= 8;
                                s sVar42 = s.f25199a;
                                obj14 = objN32;
                                objN19 = obj36;
                                obj37 = obj34;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 4:
                                obj34 = obj37;
                                obj35 = obj38;
                                obj36 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                objN32 = cVarB.n(descriptor2, 4, r0.f22908a, objN32);
                                i11 |= 16;
                                s sVar422 = s.f25199a;
                                obj14 = objN32;
                                objN19 = obj36;
                                obj37 = obj34;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 5:
                                obj34 = obj37;
                                obj35 = obj38;
                                obj36 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                Object objN37 = cVarB.n(descriptor2, 5, b2.f22828a, obj43);
                                i11 |= 32;
                                s sVar5 = s.f25199a;
                                obj14 = objN32;
                                obj43 = objN37;
                                objN19 = obj36;
                                obj37 = obj34;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 6:
                                obj34 = obj37;
                                obj35 = obj38;
                                obj36 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                Object objN38 = cVarB.n(descriptor2, 6, kotlinx.serialization.internal.i.f22868a, obj44);
                                i11 |= 64;
                                s sVar6 = s.f25199a;
                                obj14 = objN32;
                                obj44 = objN38;
                                objN19 = obj36;
                                obj37 = obj34;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 7:
                                obj34 = obj37;
                                obj35 = obj38;
                                obj36 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                Object objN39 = cVarB.n(descriptor2, 7, kotlinx.serialization.internal.i.f22868a, obj42);
                                i11 |= 128;
                                s sVar7 = s.f25199a;
                                obj14 = objN32;
                                obj42 = objN39;
                                objN19 = obj36;
                                obj37 = obj34;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 8:
                                obj34 = obj37;
                                obj35 = obj38;
                                obj36 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                Object objN40 = cVarB.n(descriptor2, 8, kotlinx.serialization.internal.i.f22868a, obj41);
                                i11 |= 256;
                                s sVar8 = s.f25199a;
                                obj14 = objN32;
                                obj41 = objN40;
                                objN19 = obj36;
                                obj37 = obj34;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 9:
                                obj34 = obj37;
                                obj35 = obj38;
                                obj36 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                Object objN41 = cVarB.n(descriptor2, 9, b2.f22828a, obj40);
                                i11 |= 512;
                                s sVar9 = s.f25199a;
                                obj14 = objN32;
                                obj40 = objN41;
                                objN19 = obj36;
                                obj37 = obj34;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 10:
                                obj34 = obj37;
                                obj35 = obj38;
                                obj36 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                Object objN42 = cVarB.n(descriptor2, 10, b2.f22828a, obj);
                                i11 |= 1024;
                                s sVar10 = s.f25199a;
                                obj14 = objN32;
                                obj = objN42;
                                objN19 = obj36;
                                obj37 = obj34;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 11:
                                obj34 = obj37;
                                obj35 = obj38;
                                obj36 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                Object objN43 = cVarB.n(descriptor2, 11, r0.f22908a, obj39);
                                i11 |= KEYRecord.Flags.FLAG4;
                                s sVar11 = s.f25199a;
                                obj14 = objN32;
                                obj39 = objN43;
                                objN19 = obj36;
                                obj37 = obj34;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 12:
                                obj34 = obj37;
                                obj35 = obj38;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj18 = obj46;
                                objN19 = cVarB.n(descriptor2, 12, r0.f22908a, obj45);
                                i11 |= 4096;
                                s sVar12 = s.f25199a;
                                obj14 = objN32;
                                obj37 = obj34;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 13:
                                Object obj64 = obj37;
                                obj35 = obj38;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj19 = obj47;
                                Object objN44 = cVarB.n(descriptor2, 13, h.INSTANCE, obj46);
                                i11 |= 8192;
                                s sVar13 = s.f25199a;
                                obj14 = objN32;
                                obj18 = objN44;
                                obj37 = obj64;
                                objN19 = obj45;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 14:
                                obj35 = obj38;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj20 = obj48;
                                Object objN45 = cVarB.n(descriptor2, 14, b2.f22828a, obj47);
                                i11 |= 16384;
                                s sVar14 = s.f25199a;
                                obj14 = objN32;
                                obj19 = objN45;
                                obj37 = obj37;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 15:
                                Object obj65 = obj37;
                                obj35 = obj38;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj21 = obj49;
                                Object objN46 = cVarB.n(descriptor2, 15, b2.f22828a, obj48);
                                i11 |= 32768;
                                s sVar15 = s.f25199a;
                                obj14 = objN32;
                                obj20 = objN46;
                                obj37 = obj65;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 16:
                                obj35 = obj38;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj22 = obj50;
                                Object objN47 = cVarB.n(descriptor2, 16, b2.f22828a, obj49);
                                i11 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                s sVar16 = s.f25199a;
                                obj14 = objN32;
                                obj21 = objN47;
                                obj37 = obj37;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 17:
                                Object obj66 = obj37;
                                obj35 = obj38;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj23 = obj51;
                                Object objN48 = cVarB.n(descriptor2, 17, new kotlinx.serialization.internal.f(b2.f22828a), obj50);
                                i11 |= 131072;
                                s sVar17 = s.f25199a;
                                obj14 = objN32;
                                obj22 = objN48;
                                obj37 = obj66;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 18:
                                obj35 = obj38;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj24 = obj52;
                                Object objN49 = cVarB.n(descriptor2, 18, new kotlinx.serialization.internal.f(b2.f22828a), obj51);
                                i11 |= 262144;
                                s sVar18 = s.f25199a;
                                obj14 = objN32;
                                obj23 = objN49;
                                obj37 = obj37;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 19:
                                Object obj67 = obj37;
                                obj35 = obj38;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj25 = obj53;
                                Object objN50 = cVarB.n(descriptor2, 19, i.C0467a.INSTANCE, obj52);
                                i11 |= 524288;
                                s sVar19 = s.f25199a;
                                obj14 = objN32;
                                obj24 = objN50;
                                obj37 = obj67;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 20:
                                obj35 = obj38;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj26 = obj54;
                                Object objN51 = cVarB.n(descriptor2, 20, b2.f22828a, obj53);
                                i11 |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                s sVar20 = s.f25199a;
                                obj14 = objN32;
                                obj25 = objN51;
                                obj37 = obj37;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 21:
                                Object obj68 = obj37;
                                obj35 = obj38;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj27 = obj55;
                                Object objN52 = cVarB.n(descriptor2, 21, g.C0466a.INSTANCE, obj54);
                                i11 |= 2097152;
                                s sVar21 = s.f25199a;
                                obj14 = objN32;
                                obj26 = objN52;
                                obj37 = obj68;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 22:
                                obj35 = obj38;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj28 = obj56;
                                Object objN53 = cVarB.n(descriptor2, 22, b2.f22828a, obj55);
                                i11 |= 4194304;
                                s sVar22 = s.f25199a;
                                obj14 = objN32;
                                obj27 = objN53;
                                obj37 = obj37;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 23:
                                Object obj69 = obj37;
                                obj35 = obj38;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj29 = obj57;
                                Object objN54 = cVarB.n(descriptor2, 23, b2.f22828a, obj56);
                                i11 |= 8388608;
                                s sVar23 = s.f25199a;
                                obj14 = objN32;
                                obj28 = objN54;
                                obj37 = obj69;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 24:
                                obj35 = obj38;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj30 = obj58;
                                Object objN55 = cVarB.n(descriptor2, 24, r0.f22908a, obj57);
                                i11 |= 16777216;
                                s sVar24 = s.f25199a;
                                obj14 = objN32;
                                obj29 = objN55;
                                obj37 = obj37;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 25:
                                Object obj70 = obj37;
                                obj35 = obj38;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj31 = obj59;
                                Object objN56 = cVarB.n(descriptor2, 25, r0.f22908a, obj58);
                                i11 |= 33554432;
                                s sVar25 = s.f25199a;
                                obj14 = objN32;
                                obj30 = objN56;
                                obj37 = obj70;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 26:
                                obj35 = obj38;
                                obj33 = obj61;
                                obj32 = obj60;
                                Object objN57 = cVarB.n(descriptor2, 26, b.C0461a.INSTANCE, obj59);
                                i11 |= 67108864;
                                s sVar26 = s.f25199a;
                                obj14 = objN32;
                                obj31 = objN57;
                                obj37 = obj37;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 27:
                                Object obj71 = obj37;
                                obj35 = obj38;
                                obj33 = obj61;
                                Object objN58 = cVarB.n(descriptor2, 27, k.C0469a.INSTANCE, obj60);
                                i11 |= 134217728;
                                s sVar27 = s.f25199a;
                                obj14 = objN32;
                                obj32 = objN58;
                                obj37 = obj71;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 28:
                                obj35 = obj38;
                                Object objN59 = cVarB.n(descriptor2, 28, kotlinx.serialization.internal.i.f22868a, obj61);
                                i11 |= 268435456;
                                s sVar28 = s.f25199a;
                                obj14 = objN32;
                                obj33 = objN59;
                                obj37 = obj37;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            case 29:
                                obj35 = obj38;
                                Object objN60 = cVarB.n(descriptor2, 29, kotlinx.serialization.internal.i.f22868a, obj37);
                                i11 |= 536870912;
                                s sVar29 = s.f25199a;
                                obj14 = objN32;
                                obj37 = objN60;
                                objN19 = obj45;
                                obj18 = obj46;
                                obj19 = obj47;
                                obj20 = obj48;
                                obj21 = obj49;
                                obj22 = obj50;
                                obj23 = obj51;
                                obj24 = obj52;
                                obj25 = obj53;
                                obj26 = obj54;
                                obj27 = obj55;
                                obj28 = obj56;
                                obj29 = obj57;
                                obj30 = obj58;
                                obj31 = obj59;
                                obj32 = obj60;
                                obj33 = obj61;
                                obj38 = obj35;
                                obj45 = objN19;
                                obj61 = obj33;
                                obj60 = obj32;
                                obj59 = obj31;
                                obj58 = obj30;
                                obj57 = obj29;
                                obj56 = obj28;
                                obj55 = obj27;
                                obj54 = obj26;
                                obj53 = obj25;
                                obj52 = obj24;
                                obj51 = obj23;
                                obj50 = obj22;
                                obj49 = obj21;
                                obj48 = obj20;
                                obj47 = obj19;
                                obj46 = obj18;
                                objN32 = obj14;
                            default:
                                throw new UnknownFieldException(iO);
                        }
                    }
                    obj2 = objN34;
                    Object obj72 = objN32;
                    objN = obj37;
                    obj3 = obj47;
                    objN2 = obj53;
                    obj4 = obj55;
                    obj5 = obj57;
                    obj6 = obj62;
                    i10 = i11;
                    objN3 = obj39;
                    objN4 = obj40;
                    obj7 = obj41;
                    objN5 = obj42;
                    objN6 = obj43;
                    objN7 = obj44;
                    obj8 = obj60;
                    objN8 = obj59;
                    objN9 = obj58;
                    obj9 = obj56;
                    obj10 = obj54;
                    objN10 = obj52;
                    objN11 = obj51;
                    objN12 = obj50;
                    objN13 = obj49;
                    objN14 = obj48;
                    obj11 = obj46;
                    objN15 = obj72;
                    objN16 = objN33;
                    obj12 = obj38;
                    objN17 = obj45;
                    objN18 = obj61;
                }
                cVarB.c(descriptor2);
                return new c(i10, (String) obj6, (String) obj12, (String) obj2, (Integer) objN16, (Integer) objN15, (String) objN6, (Boolean) objN7, (Boolean) objN5, (Boolean) obj7, (String) objN4, (String) obj, (Integer) objN3, (Integer) objN17, (Map) obj11, (String) obj3, (String) objN14, (String) objN13, (List) objN12, (List) objN11, (i) objN10, (String) objN2, (g) obj10, (String) obj4, (String) obj9, (Integer) obj5, (Integer) objN9, (b) objN8, (k) obj8, (Boolean) objN18, (Boolean) objN, (w1) null);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull c value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                c.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return C0463a.INSTANCE;
            }

            private b() {
            }
        }

        public c() {
            this((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Integer) null, (Map) null, (String) null, (String) null, (String) null, (List) null, (List) null, (i) null, (String) null, (g) null, (String) null, (String) null, (Integer) null, (Integer) null, (b) null, (k) null, (Boolean) null, (Boolean) null, 1073741823, (kotlin.jvm.internal.i) null);
        }

        public static /* synthetic */ c copy$default(c cVar, String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, Integer num3, Integer num4, Map map, String str7, String str8, String str9, List list, List list2, i iVar, String str10, g gVar, String str11, String str12, Integer num5, Integer num6, b bVar, k kVar, Boolean bool4, Boolean bool5, int i10, Object obj) {
            Boolean bool6;
            Boolean bool7;
            String str13 = (i10 & 1) != 0 ? cVar.id : str;
            String str14 = (i10 & 2) != 0 ? cVar.adType : str2;
            String str15 = (i10 & 4) != 0 ? cVar.adSource : str3;
            Integer num7 = (i10 & 8) != 0 ? cVar.expiry : num;
            Integer num8 = (i10 & 16) != 0 ? cVar.expiryDuration : num2;
            String str16 = (i10 & 32) != 0 ? cVar.deeplinkUrl : str4;
            Boolean bool8 = (i10 & 64) != 0 ? cVar.clickCoordinatesEnabled : bool;
            Boolean bool9 = (i10 & 128) != 0 ? cVar.adLoadOptimizationEnabled : bool2;
            Boolean bool10 = (i10 & 256) != 0 ? cVar.templateHeartbeatCheck : bool3;
            String str17 = (i10 & 512) != 0 ? cVar.mediationName : str5;
            String str18 = (i10 & 1024) != 0 ? cVar.info : str6;
            Integer num9 = (i10 & KEYRecord.Flags.FLAG4) != 0 ? cVar.sleep : num3;
            Integer num10 = (i10 & 4096) != 0 ? cVar.errorCode : num4;
            Map map2 = (i10 & 8192) != 0 ? cVar.tpat : map;
            String str19 = str13;
            String str20 = (i10 & 16384) != 0 ? cVar.vmURL : str7;
            String str21 = (i10 & 32768) != 0 ? cVar.vmVersion : str8;
            String str22 = (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? cVar.adMarketId : str9;
            List list3 = (i10 & 131072) != 0 ? cVar.notification : list;
            List list4 = (i10 & 262144) != 0 ? cVar.loadAdUrls : list2;
            i iVar2 = (i10 & 524288) != 0 ? cVar.viewAbility : iVar;
            String str23 = (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? cVar.templateType : str10;
            g gVar2 = (i10 & 2097152) != 0 ? cVar.templateSettings : gVar;
            String str24 = (i10 & 4194304) != 0 ? cVar.creativeId : str11;
            String str25 = (i10 & 8388608) != 0 ? cVar.advAppId : str12;
            Integer num11 = (i10 & 16777216) != 0 ? cVar.showClose : num5;
            Integer num12 = (i10 & 33554432) != 0 ? cVar.showCloseIncentivized : num6;
            b bVar2 = (i10 & 67108864) != 0 ? cVar.adSizeInfo : bVar;
            k kVar2 = (i10 & 134217728) != 0 ? cVar.webViewSettings : kVar;
            Boolean bool11 = (i10 & 268435456) != 0 ? cVar.usePreloading : bool4;
            if ((i10 & 536870912) != 0) {
                bool7 = bool11;
                bool6 = cVar.partialDownloadEnabled;
            } else {
                bool6 = bool5;
                bool7 = bool11;
            }
            return cVar.copy(str19, str14, str15, num7, num8, str16, bool8, bool9, bool10, str17, str18, num9, num10, map2, str20, str21, str22, list3, list4, iVar2, str23, gVar2, str24, str25, num11, num12, bVar2, kVar2, bool7, bool6);
        }

        @JvmStatic
        public static final void write$Self(@NotNull c self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            Integer num;
            Integer num2;
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || self.id != null) {
                output.i(serialDesc, 0, b2.f22828a, self.id);
            }
            if (output.z(serialDesc, 1) || self.adType != null) {
                output.i(serialDesc, 1, b2.f22828a, self.adType);
            }
            if (output.z(serialDesc, 2) || self.adSource != null) {
                output.i(serialDesc, 2, b2.f22828a, self.adSource);
            }
            if (output.z(serialDesc, 3) || self.expiry != null) {
                output.i(serialDesc, 3, r0.f22908a, self.expiry);
            }
            if (output.z(serialDesc, 4) || self.expiryDuration != null) {
                output.i(serialDesc, 4, r0.f22908a, self.expiryDuration);
            }
            if (output.z(serialDesc, 5) || self.deeplinkUrl != null) {
                output.i(serialDesc, 5, b2.f22828a, self.deeplinkUrl);
            }
            if (output.z(serialDesc, 6) || self.clickCoordinatesEnabled != null) {
                output.i(serialDesc, 6, kotlinx.serialization.internal.i.f22868a, self.clickCoordinatesEnabled);
            }
            if (output.z(serialDesc, 7) || self.adLoadOptimizationEnabled != null) {
                output.i(serialDesc, 7, kotlinx.serialization.internal.i.f22868a, self.adLoadOptimizationEnabled);
            }
            if (output.z(serialDesc, 8) || self.templateHeartbeatCheck != null) {
                output.i(serialDesc, 8, kotlinx.serialization.internal.i.f22868a, self.templateHeartbeatCheck);
            }
            if (output.z(serialDesc, 9) || self.mediationName != null) {
                output.i(serialDesc, 9, b2.f22828a, self.mediationName);
            }
            if (output.z(serialDesc, 10) || self.info != null) {
                output.i(serialDesc, 10, b2.f22828a, self.info);
            }
            if (output.z(serialDesc, 11) || self.sleep != null) {
                output.i(serialDesc, 11, r0.f22908a, self.sleep);
            }
            if (output.z(serialDesc, 12) || self.errorCode != null) {
                output.i(serialDesc, 12, r0.f22908a, self.errorCode);
            }
            if (output.z(serialDesc, 13) || self.tpat != null) {
                output.i(serialDesc, 13, h.INSTANCE, self.tpat);
            }
            if (output.z(serialDesc, 14) || self.vmURL != null) {
                output.i(serialDesc, 14, b2.f22828a, self.vmURL);
            }
            if (output.z(serialDesc, 15) || self.vmVersion != null) {
                output.i(serialDesc, 15, b2.f22828a, self.vmVersion);
            }
            if (output.z(serialDesc, 16) || self.adMarketId != null) {
                output.i(serialDesc, 16, b2.f22828a, self.adMarketId);
            }
            if (output.z(serialDesc, 17) || self.notification != null) {
                output.i(serialDesc, 17, new kotlinx.serialization.internal.f(b2.f22828a), self.notification);
            }
            if (output.z(serialDesc, 18) || self.loadAdUrls != null) {
                output.i(serialDesc, 18, new kotlinx.serialization.internal.f(b2.f22828a), self.loadAdUrls);
            }
            if (output.z(serialDesc, 19) || self.viewAbility != null) {
                output.i(serialDesc, 19, i.C0467a.INSTANCE, self.viewAbility);
            }
            if (output.z(serialDesc, 20) || self.templateType != null) {
                output.i(serialDesc, 20, b2.f22828a, self.templateType);
            }
            if (output.z(serialDesc, 21) || self.templateSettings != null) {
                output.i(serialDesc, 21, g.C0466a.INSTANCE, self.templateSettings);
            }
            if (output.z(serialDesc, 22) || self.creativeId != null) {
                output.i(serialDesc, 22, b2.f22828a, self.creativeId);
            }
            if (output.z(serialDesc, 23) || self.advAppId != null) {
                output.i(serialDesc, 23, b2.f22828a, self.advAppId);
            }
            if (output.z(serialDesc, 24) || (num2 = self.showClose) == null || num2.intValue() != 0) {
                output.i(serialDesc, 24, r0.f22908a, self.showClose);
            }
            if (output.z(serialDesc, 25) || (num = self.showCloseIncentivized) == null || num.intValue() != 0) {
                output.i(serialDesc, 25, r0.f22908a, self.showCloseIncentivized);
            }
            if (output.z(serialDesc, 26) || self.adSizeInfo != null) {
                output.i(serialDesc, 26, b.C0461a.INSTANCE, self.adSizeInfo);
            }
            if (output.z(serialDesc, 27) || self.webViewSettings != null) {
                output.i(serialDesc, 27, k.C0469a.INSTANCE, self.webViewSettings);
            }
            if (output.z(serialDesc, 28) || !p.a(self.usePreloading, Boolean.FALSE)) {
                output.i(serialDesc, 28, kotlinx.serialization.internal.i.f22868a, self.usePreloading);
            }
            if (!output.z(serialDesc, 29) && self.partialDownloadEnabled == null) {
                return;
            }
            output.i(serialDesc, 29, kotlinx.serialization.internal.i.f22868a, self.partialDownloadEnabled);
        }

        @Nullable
        public final String component1() {
            return this.id;
        }

        @Nullable
        public final String component10() {
            return this.mediationName;
        }

        @Nullable
        public final String component11() {
            return this.info;
        }

        @Nullable
        public final Integer component12() {
            return this.sleep;
        }

        @Nullable
        public final Integer component13() {
            return this.errorCode;
        }

        @Nullable
        public final Map<String, List<String>> component14() {
            return this.tpat;
        }

        @Nullable
        public final String component15() {
            return this.vmURL;
        }

        @Nullable
        public final String component16() {
            return this.vmVersion;
        }

        @Nullable
        public final String component17() {
            return this.adMarketId;
        }

        @Nullable
        public final List<String> component18() {
            return this.notification;
        }

        @Nullable
        public final List<String> component19() {
            return this.loadAdUrls;
        }

        @Nullable
        public final String component2() {
            return this.adType;
        }

        @Nullable
        public final i component20() {
            return this.viewAbility;
        }

        @Nullable
        public final String component21() {
            return this.templateType;
        }

        @Nullable
        public final g component22() {
            return this.templateSettings;
        }

        @Nullable
        public final String component23() {
            return this.creativeId;
        }

        @Nullable
        public final String component24() {
            return this.advAppId;
        }

        @Nullable
        public final Integer component25() {
            return this.showClose;
        }

        @Nullable
        public final Integer component26() {
            return this.showCloseIncentivized;
        }

        @Nullable
        public final b component27() {
            return this.adSizeInfo;
        }

        @Nullable
        public final k component28() {
            return this.webViewSettings;
        }

        @Nullable
        public final Boolean component29() {
            return this.usePreloading;
        }

        @Nullable
        public final String component3() {
            return this.adSource;
        }

        @Nullable
        public final Boolean component30() {
            return this.partialDownloadEnabled;
        }

        @Nullable
        public final Integer component4() {
            return this.expiry;
        }

        @Nullable
        public final Integer component5() {
            return this.expiryDuration;
        }

        @Nullable
        public final String component6() {
            return this.deeplinkUrl;
        }

        @Nullable
        public final Boolean component7() {
            return this.clickCoordinatesEnabled;
        }

        @Nullable
        public final Boolean component8() {
            return this.adLoadOptimizationEnabled;
        }

        @Nullable
        public final Boolean component9() {
            return this.templateHeartbeatCheck;
        }

        @NotNull
        public final c copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable String str4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str5, @Nullable String str6, @Nullable Integer num3, @Nullable Integer num4, @Nullable Map<String, ? extends List<String>> map, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<String> list, @Nullable List<String> list2, @Nullable i iVar, @Nullable String str10, @Nullable g gVar, @Nullable String str11, @Nullable String str12, @Nullable Integer num5, @Nullable Integer num6, @Nullable b bVar, @Nullable k kVar, @Nullable Boolean bool4, @Nullable Boolean bool5) {
            return new c(str, str2, str3, num, num2, str4, bool, bool2, bool3, str5, str6, num3, num4, map, str7, str8, str9, list, list2, iVar, str10, gVar, str11, str12, num5, num6, bVar, kVar, bool4, bool5);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p.a(this.id, cVar.id) && p.a(this.adType, cVar.adType) && p.a(this.adSource, cVar.adSource) && p.a(this.expiry, cVar.expiry) && p.a(this.expiryDuration, cVar.expiryDuration) && p.a(this.deeplinkUrl, cVar.deeplinkUrl) && p.a(this.clickCoordinatesEnabled, cVar.clickCoordinatesEnabled) && p.a(this.adLoadOptimizationEnabled, cVar.adLoadOptimizationEnabled) && p.a(this.templateHeartbeatCheck, cVar.templateHeartbeatCheck) && p.a(this.mediationName, cVar.mediationName) && p.a(this.info, cVar.info) && p.a(this.sleep, cVar.sleep) && p.a(this.errorCode, cVar.errorCode) && p.a(this.tpat, cVar.tpat) && p.a(this.vmURL, cVar.vmURL) && p.a(this.vmVersion, cVar.vmVersion) && p.a(this.adMarketId, cVar.adMarketId) && p.a(this.notification, cVar.notification) && p.a(this.loadAdUrls, cVar.loadAdUrls) && p.a(this.viewAbility, cVar.viewAbility) && p.a(this.templateType, cVar.templateType) && p.a(this.templateSettings, cVar.templateSettings) && p.a(this.creativeId, cVar.creativeId) && p.a(this.advAppId, cVar.advAppId) && p.a(this.showClose, cVar.showClose) && p.a(this.showCloseIncentivized, cVar.showCloseIncentivized) && p.a(this.adSizeInfo, cVar.adSizeInfo) && p.a(this.webViewSettings, cVar.webViewSettings) && p.a(this.usePreloading, cVar.usePreloading) && p.a(this.partialDownloadEnabled, cVar.partialDownloadEnabled);
        }

        @Nullable
        public final Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        @Nullable
        public final String getAdMarketId() {
            return this.adMarketId;
        }

        @Nullable
        public final b getAdSizeInfo() {
            return this.adSizeInfo;
        }

        @Nullable
        public final String getAdSource() {
            return this.adSource;
        }

        @Nullable
        public final String getAdType() {
            return this.adType;
        }

        @Nullable
        public final String getAdvAppId() {
            return this.advAppId;
        }

        @Nullable
        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        @Nullable
        public final String getCreativeId() {
            return this.creativeId;
        }

        @Nullable
        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        @Nullable
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        @Nullable
        public final Integer getExpiry() {
            return this.expiry;
        }

        @Nullable
        public final Integer getExpiryDuration() {
            return this.expiryDuration;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getInfo() {
            return this.info;
        }

        @Nullable
        public final List<String> getLoadAdUrls() {
            return this.loadAdUrls;
        }

        @Nullable
        public final String getMediationName() {
            return this.mediationName;
        }

        @Nullable
        public final List<String> getNotification() {
            return this.notification;
        }

        @Nullable
        public final Boolean getPartialDownloadEnabled() {
            return this.partialDownloadEnabled;
        }

        @Nullable
        public final Integer getShowClose() {
            return this.showClose;
        }

        @Nullable
        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        @Nullable
        public final Integer getSleep() {
            return this.sleep;
        }

        @Nullable
        public final Boolean getTemplateHeartbeatCheck() {
            return this.templateHeartbeatCheck;
        }

        @Nullable
        public final g getTemplateSettings() {
            return this.templateSettings;
        }

        @Nullable
        public final String getTemplateType() {
            return this.templateType;
        }

        @Nullable
        public final Map<String, List<String>> getTpat() {
            return this.tpat;
        }

        @Nullable
        public final Boolean getUsePreloading() {
            return this.usePreloading;
        }

        @Nullable
        public final i getViewAbility() {
            return this.viewAbility;
        }

        @Nullable
        public final String getVmURL() {
            return this.vmURL;
        }

        @Nullable
        public final String getVmVersion() {
            return this.vmVersion;
        }

        @Nullable
        public final k getWebViewSettings() {
            return this.webViewSettings;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.adType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.adSource;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.expiry;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryDuration;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str4 = this.deeplinkUrl;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.clickCoordinatesEnabled;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.adLoadOptimizationEnabled;
            int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.templateHeartbeatCheck;
            int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str5 = this.mediationName;
            int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.info;
            int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num3 = this.sleep;
            int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.errorCode;
            int iHashCode13 = (iHashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Map<String, List<String>> map = this.tpat;
            int iHashCode14 = (iHashCode13 + (map == null ? 0 : map.hashCode())) * 31;
            String str7 = this.vmURL;
            int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.vmVersion;
            int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.adMarketId;
            int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
            List<String> list = this.notification;
            int iHashCode18 = (iHashCode17 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.loadAdUrls;
            int iHashCode19 = (iHashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
            i iVar = this.viewAbility;
            int iHashCode20 = (iHashCode19 + (iVar == null ? 0 : iVar.hashCode())) * 31;
            String str10 = this.templateType;
            int iHashCode21 = (iHashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
            g gVar = this.templateSettings;
            int iHashCode22 = (iHashCode21 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            String str11 = this.creativeId;
            int iHashCode23 = (iHashCode22 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.advAppId;
            int iHashCode24 = (iHashCode23 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Integer num5 = this.showClose;
            int iHashCode25 = (iHashCode24 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.showCloseIncentivized;
            int iHashCode26 = (iHashCode25 + (num6 == null ? 0 : num6.hashCode())) * 31;
            b bVar = this.adSizeInfo;
            int iHashCode27 = (iHashCode26 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            k kVar = this.webViewSettings;
            int iHashCode28 = (iHashCode27 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            Boolean bool4 = this.usePreloading;
            int iHashCode29 = (iHashCode28 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.partialDownloadEnabled;
            return iHashCode29 + (bool5 != null ? bool5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdUnit(id=" + this.id + ", adType=" + this.adType + ", adSource=" + this.adSource + ", expiry=" + this.expiry + ", expiryDuration=" + this.expiryDuration + ", deeplinkUrl=" + this.deeplinkUrl + ", clickCoordinatesEnabled=" + this.clickCoordinatesEnabled + ", adLoadOptimizationEnabled=" + this.adLoadOptimizationEnabled + ", templateHeartbeatCheck=" + this.templateHeartbeatCheck + ", mediationName=" + this.mediationName + ", info=" + this.info + ", sleep=" + this.sleep + ", errorCode=" + this.errorCode + ", tpat=" + this.tpat + ", vmURL=" + this.vmURL + ", vmVersion=" + this.vmVersion + ", adMarketId=" + this.adMarketId + ", notification=" + this.notification + ", loadAdUrls=" + this.loadAdUrls + ", viewAbility=" + this.viewAbility + ", templateType=" + this.templateType + ", templateSettings=" + this.templateSettings + ", creativeId=" + this.creativeId + ", advAppId=" + this.advAppId + ", showClose=" + this.showClose + ", showCloseIncentivized=" + this.showCloseIncentivized + ", adSizeInfo=" + this.adSizeInfo + ", webViewSettings=" + this.webViewSettings + ", usePreloading=" + this.usePreloading + ", partialDownloadEnabled=" + this.partialDownloadEnabled + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable String str4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str5, @Nullable String str6, @Nullable Integer num3, @Nullable Integer num4, @Nullable Map<String, ? extends List<String>> map, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<String> list, @Nullable List<String> list2, @Nullable i iVar, @Nullable String str10, @Nullable g gVar, @Nullable String str11, @Nullable String str12, @Nullable Integer num5, @Nullable Integer num6, @Nullable b bVar, @Nullable k kVar, @Nullable Boolean bool4, @Nullable Boolean bool5) {
            this.id = str;
            this.adType = str2;
            this.adSource = str3;
            this.expiry = num;
            this.expiryDuration = num2;
            this.deeplinkUrl = str4;
            this.clickCoordinatesEnabled = bool;
            this.adLoadOptimizationEnabled = bool2;
            this.templateHeartbeatCheck = bool3;
            this.mediationName = str5;
            this.info = str6;
            this.sleep = num3;
            this.errorCode = num4;
            this.tpat = map;
            this.vmURL = str7;
            this.vmVersion = str8;
            this.adMarketId = str9;
            this.notification = list;
            this.loadAdUrls = list2;
            this.viewAbility = iVar;
            this.templateType = str10;
            this.templateSettings = gVar;
            this.creativeId = str11;
            this.advAppId = str12;
            this.showClose = num5;
            this.showCloseIncentivized = num6;
            this.adSizeInfo = bVar;
            this.webViewSettings = kVar;
            this.usePreloading = bool4;
            this.partialDownloadEnabled = bool5;
        }

        @SerialName("ad_load_optimization")
        public static /* synthetic */ void getAdLoadOptimizationEnabled$annotations() {
        }

        @SerialName("ad_market_id")
        public static /* synthetic */ void getAdMarketId$annotations() {
        }

        @SerialName("ad_size")
        public static /* synthetic */ void getAdSizeInfo$annotations() {
        }

        @SerialName("ad_source")
        public static /* synthetic */ void getAdSource$annotations() {
        }

        @SerialName("ad_type")
        public static /* synthetic */ void getAdType$annotations() {
        }

        @SerialName(MBridgeConstans.APP_ID)
        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        @SerialName("click_coordinates_enabled")
        public static /* synthetic */ void getClickCoordinatesEnabled$annotations() {
        }

        @SerialName(CampaignEx.JSON_KEY_CREATIVE_ID)
        public static /* synthetic */ void getCreativeId$annotations() {
        }

        @SerialName("deeplink_url")
        public static /* synthetic */ void getDeeplinkUrl$annotations() {
        }

        @SerialName("error_code")
        public static /* synthetic */ void getErrorCode$annotations() {
        }

        @SerialName("expiry")
        public static /* synthetic */ void getExpiry$annotations() {
        }

        @SerialName("expiry_duration")
        public static /* synthetic */ void getExpiryDuration$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("info")
        public static /* synthetic */ void getInfo$annotations() {
        }

        @SerialName(com.vungle.ads.internal.b.LOAD_AD)
        public static /* synthetic */ void getLoadAdUrls$annotations() {
        }

        @SerialName("mediation_name")
        public static /* synthetic */ void getMediationName$annotations() {
        }

        @SerialName("notification")
        public static /* synthetic */ void getNotification$annotations() {
        }

        @SerialName("ad_partial_download_enabled")
        public static /* synthetic */ void getPartialDownloadEnabled$annotations() {
        }

        @SerialName("show_close")
        public static /* synthetic */ void getShowClose$annotations() {
        }

        @SerialName("show_close_incentivized")
        public static /* synthetic */ void getShowCloseIncentivized$annotations() {
        }

        @SerialName("sleep")
        public static /* synthetic */ void getSleep$annotations() {
        }

        @SerialName("template_heartbeat_check")
        public static /* synthetic */ void getTemplateHeartbeatCheck$annotations() {
        }

        @SerialName("template_settings")
        public static /* synthetic */ void getTemplateSettings$annotations() {
        }

        @SerialName("template_type")
        public static /* synthetic */ void getTemplateType$annotations() {
        }

        @Serializable(with = h.class)
        public static /* synthetic */ void getTpat$annotations() {
        }

        @SerialName("use_preloading")
        public static /* synthetic */ void getUsePreloading$annotations() {
        }

        @SerialName("viewability")
        public static /* synthetic */ void getViewAbility$annotations() {
        }

        @SerialName("vm_url")
        public static /* synthetic */ void getVmURL$annotations() {
        }

        @SerialName("vm_version")
        public static /* synthetic */ void getVmVersion$annotations() {
        }

        @SerialName("webview_settings")
        public static /* synthetic */ void getWebViewSettings$annotations() {
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ c(int i10, @SerialName("id") String str, @SerialName("ad_type") String str2, @SerialName("ad_source") String str3, @SerialName("expiry") Integer num, @SerialName("expiry_duration") Integer num2, @SerialName("deeplink_url") String str4, @SerialName("click_coordinates_enabled") Boolean bool, @SerialName("ad_load_optimization") Boolean bool2, @SerialName("template_heartbeat_check") Boolean bool3, @SerialName("mediation_name") String str5, @SerialName("info") String str6, @SerialName("sleep") Integer num3, @SerialName("error_code") Integer num4, @Serializable(with = h.class) Map map, @SerialName("vm_url") String str7, @SerialName("vm_version") String str8, @SerialName("ad_market_id") String str9, @SerialName("notification") List list, @SerialName(com.vungle.ads.internal.b.LOAD_AD) List list2, @SerialName("viewability") i iVar, @SerialName("template_type") String str10, @SerialName("template_settings") g gVar, @SerialName(CampaignEx.JSON_KEY_CREATIVE_ID) String str11, @SerialName(MBridgeConstans.APP_ID) String str12, @SerialName("show_close") Integer num5, @SerialName("show_close_incentivized") Integer num6, @SerialName("ad_size") b bVar, @SerialName("webview_settings") k kVar, @SerialName("use_preloading") Boolean bool4, @SerialName("ad_partial_download_enabled") Boolean bool5, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.id = null;
            } else {
                this.id = str;
            }
            if ((i10 & 2) == 0) {
                this.adType = null;
            } else {
                this.adType = str2;
            }
            if ((i10 & 4) == 0) {
                this.adSource = null;
            } else {
                this.adSource = str3;
            }
            if ((i10 & 8) == 0) {
                this.expiry = null;
            } else {
                this.expiry = num;
            }
            if ((i10 & 16) == 0) {
                this.expiryDuration = null;
            } else {
                this.expiryDuration = num2;
            }
            if ((i10 & 32) == 0) {
                this.deeplinkUrl = null;
            } else {
                this.deeplinkUrl = str4;
            }
            if ((i10 & 64) == 0) {
                this.clickCoordinatesEnabled = null;
            } else {
                this.clickCoordinatesEnabled = bool;
            }
            if ((i10 & 128) == 0) {
                this.adLoadOptimizationEnabled = null;
            } else {
                this.adLoadOptimizationEnabled = bool2;
            }
            if ((i10 & 256) == 0) {
                this.templateHeartbeatCheck = null;
            } else {
                this.templateHeartbeatCheck = bool3;
            }
            if ((i10 & 512) == 0) {
                this.mediationName = null;
            } else {
                this.mediationName = str5;
            }
            if ((i10 & 1024) == 0) {
                this.info = null;
            } else {
                this.info = str6;
            }
            if ((i10 & KEYRecord.Flags.FLAG4) == 0) {
                this.sleep = null;
            } else {
                this.sleep = num3;
            }
            if ((i10 & 4096) == 0) {
                this.errorCode = null;
            } else {
                this.errorCode = num4;
            }
            if ((i10 & 8192) == 0) {
                this.tpat = null;
            } else {
                this.tpat = map;
            }
            if ((i10 & 16384) == 0) {
                this.vmURL = null;
            } else {
                this.vmURL = str7;
            }
            if ((32768 & i10) == 0) {
                this.vmVersion = null;
            } else {
                this.vmVersion = str8;
            }
            if ((65536 & i10) == 0) {
                this.adMarketId = null;
            } else {
                this.adMarketId = str9;
            }
            if ((131072 & i10) == 0) {
                this.notification = null;
            } else {
                this.notification = list;
            }
            if ((262144 & i10) == 0) {
                this.loadAdUrls = null;
            } else {
                this.loadAdUrls = list2;
            }
            if ((524288 & i10) == 0) {
                this.viewAbility = null;
            } else {
                this.viewAbility = iVar;
            }
            if ((1048576 & i10) == 0) {
                this.templateType = null;
            } else {
                this.templateType = str10;
            }
            if ((2097152 & i10) == 0) {
                this.templateSettings = null;
            } else {
                this.templateSettings = gVar;
            }
            if ((4194304 & i10) == 0) {
                this.creativeId = null;
            } else {
                this.creativeId = str11;
            }
            if ((8388608 & i10) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str12;
            }
            if ((16777216 & i10) == 0) {
                this.showClose = 0;
            } else {
                this.showClose = num5;
            }
            if ((33554432 & i10) == 0) {
                this.showCloseIncentivized = 0;
            } else {
                this.showCloseIncentivized = num6;
            }
            if ((67108864 & i10) == 0) {
                this.adSizeInfo = null;
            } else {
                this.adSizeInfo = bVar;
            }
            if ((134217728 & i10) == 0) {
                this.webViewSettings = null;
            } else {
                this.webViewSettings = kVar;
            }
            this.usePreloading = (268435456 & i10) == 0 ? Boolean.FALSE : bool4;
            if ((i10 & 536870912) == 0) {
                this.partialDownloadEnabled = null;
            } else {
                this.partialDownloadEnabled = bool5;
            }
        }

        public /* synthetic */ c(String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, Integer num3, Integer num4, Map map, String str7, String str8, String str9, List list, List list2, i iVar, String str10, g gVar, String str11, String str12, Integer num5, Integer num6, b bVar, k kVar, Boolean bool4, Boolean bool5, int i10, kotlin.jvm.internal.i iVar2) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : bool, (i10 & 128) != 0 ? null : bool2, (i10 & 256) != 0 ? null : bool3, (i10 & 512) != 0 ? null : str5, (i10 & 1024) != 0 ? null : str6, (i10 & KEYRecord.Flags.FLAG4) != 0 ? null : num3, (i10 & 4096) != 0 ? null : num4, (i10 & 8192) != 0 ? null : map, (i10 & 16384) != 0 ? null : str7, (i10 & 32768) != 0 ? null : str8, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : str9, (i10 & 131072) != 0 ? null : list, (i10 & 262144) != 0 ? null : list2, (i10 & 524288) != 0 ? null : iVar, (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str10, (i10 & 2097152) != 0 ? null : gVar, (i10 & 4194304) != 0 ? null : str11, (i10 & 8388608) != 0 ? null : str12, (i10 & 16777216) != 0 ? null : num5, (i10 & 33554432) == 0 ? num6 : 0, (i10 & 67108864) != 0 ? null : bVar, (i10 & 134217728) != 0 ? null : kVar, (i10 & 268435456) != 0 ? Boolean.FALSE : bool4, (i10 & 536870912) != 0 ? null : bool5);
        }
    }

    public static final class d {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final Integer downloadPercent;

        @Nullable
        private final String extension;

        @Nullable
        private final String url;

        /* renamed from: q7.a$d$a, reason: collision with other inner class name */
        public static final class C0464a implements i0 {

            @NotNull
            public static final C0464a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                C0464a c0464a = new C0464a();
                INSTANCE = c0464a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.CacheableReplacement", c0464a, 3);
                pluginGeneratedSerialDescriptor.k("url", true);
                pluginGeneratedSerialDescriptor.k("extension", true);
                pluginGeneratedSerialDescriptor.k("download_percent", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C0464a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                b2 b2Var = b2.f22828a;
                return new kotlinx.serialization.b[]{x9.a.s(b2Var), x9.a.s(b2Var), x9.a.s(r0.f22908a)};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public d deserialize(@NotNull y9.e decoder) {
                int i10;
                Object objN;
                Object objN2;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                Object objN3 = null;
                if (cVarB.p()) {
                    b2 b2Var = b2.f22828a;
                    Object objN4 = cVarB.n(descriptor2, 0, b2Var, null);
                    objN = cVarB.n(descriptor2, 1, b2Var, null);
                    objN2 = cVarB.n(descriptor2, 2, r0.f22908a, null);
                    objN3 = objN4;
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    Object objN5 = null;
                    Object objN6 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objN3 = cVarB.n(descriptor2, 0, b2.f22828a, objN3);
                            i11 |= 1;
                        } else if (iO == 1) {
                            objN5 = cVarB.n(descriptor2, 1, b2.f22828a, objN5);
                            i11 |= 2;
                        } else {
                            if (iO != 2) {
                                throw new UnknownFieldException(iO);
                            }
                            objN6 = cVarB.n(descriptor2, 2, r0.f22908a, objN6);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    objN = objN5;
                    objN2 = objN6;
                }
                cVarB.c(descriptor2);
                return new d(i10, (String) objN3, (String) objN, (Integer) objN2, (w1) null);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull d value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                d.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return C0464a.INSTANCE;
            }

            private b() {
            }
        }

        public d() {
            this((String) null, (String) null, (Integer) null, 7, (kotlin.jvm.internal.i) null);
        }

        public static /* synthetic */ d copy$default(d dVar, String str, String str2, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dVar.url;
            }
            if ((i10 & 2) != 0) {
                str2 = dVar.extension;
            }
            if ((i10 & 4) != 0) {
                num = dVar.downloadPercent;
            }
            return dVar.copy(str, str2, num);
        }

        @JvmStatic
        public static final void write$Self(@NotNull d self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || self.url != null) {
                output.i(serialDesc, 0, b2.f22828a, self.url);
            }
            if (output.z(serialDesc, 1) || self.extension != null) {
                output.i(serialDesc, 1, b2.f22828a, self.extension);
            }
            if (!output.z(serialDesc, 2) && self.downloadPercent == null) {
                return;
            }
            output.i(serialDesc, 2, r0.f22908a, self.downloadPercent);
        }

        @Nullable
        public final String component1() {
            return this.url;
        }

        @Nullable
        public final String component2() {
            return this.extension;
        }

        @Nullable
        public final Integer component3() {
            return this.downloadPercent;
        }

        @NotNull
        public final d copy(@Nullable String str, @Nullable String str2, @Nullable Integer num) {
            return new d(str, str2, num);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p.a(this.url, dVar.url) && p.a(this.extension, dVar.extension) && p.a(this.downloadPercent, dVar.downloadPercent);
        }

        @Nullable
        public final Integer getDownloadPercent() {
            return this.downloadPercent;
        }

        @Nullable
        public final String getExtension() {
            return this.extension;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.extension;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.downloadPercent;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CacheableReplacement(url=" + this.url + ", extension=" + this.extension + ", downloadPercent=" + this.downloadPercent + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ d(int i10, String str, String str2, @SerialName("download_percent") Integer num, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.url = null;
            } else {
                this.url = str;
            }
            if ((i10 & 2) == 0) {
                this.extension = null;
            } else {
                this.extension = str2;
            }
            if ((i10 & 4) == 0) {
                this.downloadPercent = null;
            } else {
                this.downloadPercent = num;
            }
        }

        public d(@Nullable String str, @Nullable String str2, @Nullable Integer num) {
            this.url = str;
            this.extension = str2;
            this.downloadPercent = num;
        }

        public /* synthetic */ d(String str, String str2, Integer num, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num);
        }

        @SerialName("download_percent")
        public static /* synthetic */ void getDownloadPercent$annotations() {
        }
    }

    public static final class e {
        public /* synthetic */ e(kotlin.jvm.internal.i iVar) {
            this();
        }

        @NotNull
        public final kotlinx.serialization.b serializer() {
            return C0460a.INSTANCE;
        }

        private e() {
        }
    }

    public static final class f {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final c adMarkup;

        @Nullable
        private final String placementReferenceId;

        /* renamed from: q7.a$f$a, reason: collision with other inner class name */
        public static final class C0465a implements i0 {

            @NotNull
            public static final C0465a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                C0465a c0465a = new C0465a();
                INSTANCE = c0465a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.PlacementAdUnit", c0465a, 2);
                pluginGeneratedSerialDescriptor.k("placement_reference_id", true);
                pluginGeneratedSerialDescriptor.k("ad_markup", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C0465a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                return new kotlinx.serialization.b[]{x9.a.s(b2.f22828a), x9.a.s(c.C0463a.INSTANCE)};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public f deserialize(@NotNull y9.e decoder) {
                Object objN;
                Object objN2;
                int i10;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                w1 w1Var = null;
                if (cVarB.p()) {
                    objN = cVarB.n(descriptor2, 0, b2.f22828a, null);
                    objN2 = cVarB.n(descriptor2, 1, c.C0463a.INSTANCE, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objN = null;
                    Object objN3 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objN = cVarB.n(descriptor2, 0, b2.f22828a, objN);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            objN3 = cVarB.n(descriptor2, 1, c.C0463a.INSTANCE, objN3);
                            i11 |= 2;
                        }
                    }
                    objN2 = objN3;
                    i10 = i11;
                }
                cVarB.c(descriptor2);
                return new f(i10, (String) objN, (c) objN2, w1Var);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull f value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                f.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return C0465a.INSTANCE;
            }

            private b() {
            }
        }

        public f() {
            this((String) null, (c) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.i) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ f copy$default(f fVar, String str, c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fVar.placementReferenceId;
            }
            if ((i10 & 2) != 0) {
                cVar = fVar.adMarkup;
            }
            return fVar.copy(str, cVar);
        }

        @JvmStatic
        public static final void write$Self(@NotNull f self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || self.placementReferenceId != null) {
                output.i(serialDesc, 0, b2.f22828a, self.placementReferenceId);
            }
            if (!output.z(serialDesc, 1) && self.adMarkup == null) {
                return;
            }
            output.i(serialDesc, 1, c.C0463a.INSTANCE, self.adMarkup);
        }

        @Nullable
        public final String component1() {
            return this.placementReferenceId;
        }

        @Nullable
        public final c component2() {
            return this.adMarkup;
        }

        @NotNull
        public final f copy(@Nullable String str, @Nullable c cVar) {
            return new f(str, cVar);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p.a(this.placementReferenceId, fVar.placementReferenceId) && p.a(this.adMarkup, fVar.adMarkup);
        }

        @Nullable
        public final c getAdMarkup() {
            return this.adMarkup;
        }

        @Nullable
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public int hashCode() {
            String str = this.placementReferenceId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            c cVar = this.adMarkup;
            return iHashCode + (cVar != null ? cVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ f(int i10, @SerialName("placement_reference_id") String str, @SerialName("ad_markup") c cVar, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str;
            }
            if ((i10 & 2) == 0) {
                this.adMarkup = null;
            } else {
                this.adMarkup = cVar;
            }
        }

        public f(@Nullable String str, @Nullable c cVar) {
            this.placementReferenceId = str;
            this.adMarkup = cVar;
        }

        public /* synthetic */ f(String str, c cVar, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : cVar);
        }

        @SerialName("ad_markup")
        public static /* synthetic */ void getAdMarkup$annotations() {
        }

        @SerialName("placement_reference_id")
        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }
    }

    public static final class g {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final Map<String, d> cacheableReplacements;

        @Nullable
        private final Map<String, String> normalReplacements;

        /* renamed from: q7.a$g$a, reason: collision with other inner class name */
        public static final class C0466a implements i0 {

            @NotNull
            public static final C0466a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                C0466a c0466a = new C0466a();
                INSTANCE = c0466a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.TemplateSettings", c0466a, 2);
                pluginGeneratedSerialDescriptor.k("normal_replacements", true);
                pluginGeneratedSerialDescriptor.k("cacheable_replacements", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C0466a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                b2 b2Var = b2.f22828a;
                return new kotlinx.serialization.b[]{x9.a.s(new v0(b2Var, b2Var)), x9.a.s(new v0(b2Var, d.C0464a.INSTANCE))};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public g deserialize(@NotNull y9.e decoder) {
                Object objN;
                Object objN2;
                int i10;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                w1 w1Var = null;
                if (cVarB.p()) {
                    b2 b2Var = b2.f22828a;
                    objN = cVarB.n(descriptor2, 0, new v0(b2Var, b2Var), null);
                    objN2 = cVarB.n(descriptor2, 1, new v0(b2Var, d.C0464a.INSTANCE), null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objN = null;
                    Object objN3 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            b2 b2Var2 = b2.f22828a;
                            objN = cVarB.n(descriptor2, 0, new v0(b2Var2, b2Var2), objN);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            objN3 = cVarB.n(descriptor2, 1, new v0(b2.f22828a, d.C0464a.INSTANCE), objN3);
                            i11 |= 2;
                        }
                    }
                    objN2 = objN3;
                    i10 = i11;
                }
                cVarB.c(descriptor2);
                return new g(i10, (Map) objN, (Map) objN2, w1Var);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull g value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                g.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return C0466a.INSTANCE;
            }

            private b() {
            }
        }

        public g() {
            this((Map) null, (Map) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.i) (0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ g copy$default(g gVar, Map map, Map map2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = gVar.normalReplacements;
            }
            if ((i10 & 2) != 0) {
                map2 = gVar.cacheableReplacements;
            }
            return gVar.copy(map, map2);
        }

        @JvmStatic
        public static final void write$Self(@NotNull g self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || self.normalReplacements != null) {
                b2 b2Var = b2.f22828a;
                output.i(serialDesc, 0, new v0(b2Var, b2Var), self.normalReplacements);
            }
            if (!output.z(serialDesc, 1) && self.cacheableReplacements == null) {
                return;
            }
            output.i(serialDesc, 1, new v0(b2.f22828a, d.C0464a.INSTANCE), self.cacheableReplacements);
        }

        @Nullable
        public final Map<String, String> component1() {
            return this.normalReplacements;
        }

        @Nullable
        public final Map<String, d> component2() {
            return this.cacheableReplacements;
        }

        @NotNull
        public final g copy(@Nullable Map<String, String> map, @Nullable Map<String, d> map2) {
            return new g(map, map2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return p.a(this.normalReplacements, gVar.normalReplacements) && p.a(this.cacheableReplacements, gVar.cacheableReplacements);
        }

        @Nullable
        public final Map<String, d> getCacheableReplacements() {
            return this.cacheableReplacements;
        }

        @Nullable
        public final Map<String, String> getNormalReplacements() {
            return this.normalReplacements;
        }

        public int hashCode() {
            Map<String, String> map = this.normalReplacements;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, d> map2 = this.cacheableReplacements;
            return iHashCode + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TemplateSettings(normalReplacements=" + this.normalReplacements + ", cacheableReplacements=" + this.cacheableReplacements + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ g(int i10, @SerialName("normal_replacements") Map map, @SerialName("cacheable_replacements") Map map2, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.normalReplacements = null;
            } else {
                this.normalReplacements = map;
            }
            if ((i10 & 2) == 0) {
                this.cacheableReplacements = null;
            } else {
                this.cacheableReplacements = map2;
            }
        }

        public g(@Nullable Map<String, String> map, @Nullable Map<String, d> map2) {
            this.normalReplacements = map;
            this.cacheableReplacements = map2;
        }

        public /* synthetic */ g(Map map, Map map2, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : map2);
        }

        @SerialName("cacheable_replacements")
        public static /* synthetic */ void getCacheableReplacements$annotations() {
        }

        @SerialName("normal_replacements")
        public static /* synthetic */ void getNormalReplacements$annotations() {
        }
    }

    public static final class h extends z9.s {

        @NotNull
        public static final h INSTANCE = new h();

        /* JADX WARN: Illegal instructions before constructor call */
        private h() {
            w wVar = w.f22046a;
            super(x9.a.k(x9.a.B(wVar), x9.a.h(x9.a.B(wVar))));
        }

        @Override // z9.s
        @NotNull
        public kotlinx.serialization.json.b transformDeserialize(@NotNull kotlinx.serialization.json.b element) {
            p.e(element, "element");
            JsonObject jsonObjectK = z9.g.k(element);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : jsonObjectK.entrySet()) {
                if (!p.a((String) entry.getKey(), "moat")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new JsonObject(linkedHashMap);
        }
    }

    public static final class i {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final j om;

        /* renamed from: q7.a$i$a, reason: collision with other inner class name */
        public static final class C0467a implements i0 {

            @NotNull
            public static final C0467a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                C0467a c0467a = new C0467a();
                INSTANCE = c0467a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.ViewAbility", c0467a, 1);
                pluginGeneratedSerialDescriptor.k("om", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C0467a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                return new kotlinx.serialization.b[]{x9.a.s(j.C0468a.INSTANCE)};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public i deserialize(@NotNull y9.e decoder) {
                Object objN;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                int i10 = 1;
                w1 w1Var = null;
                if (cVarB.p()) {
                    objN = cVarB.n(descriptor2, 0, j.C0468a.INSTANCE, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objN = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else {
                            if (iO != 0) {
                                throw new UnknownFieldException(iO);
                            }
                            objN = cVarB.n(descriptor2, 0, j.C0468a.INSTANCE, objN);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarB.c(descriptor2);
                return new i(i10, (j) objN, w1Var);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull i value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                i.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return C0467a.INSTANCE;
            }

            private b() {
            }
        }

        public i() {
            this((j) null, 1, (kotlin.jvm.internal.i) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ i copy$default(i iVar, j jVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jVar = iVar.om;
            }
            return iVar.copy(jVar);
        }

        @JvmStatic
        public static final void write$Self(@NotNull i self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (!output.z(serialDesc, 0) && self.om == null) {
                return;
            }
            output.i(serialDesc, 0, j.C0468a.INSTANCE, self.om);
        }

        @Nullable
        public final j component1() {
            return this.om;
        }

        @NotNull
        public final i copy(@Nullable j jVar) {
            return new i(jVar);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && p.a(this.om, ((i) obj).om);
        }

        @Nullable
        public final j getOm() {
            return this.om;
        }

        public int hashCode() {
            j jVar = this.om;
            if (jVar == null) {
                return 0;
            }
            return jVar.hashCode();
        }

        @NotNull
        public String toString() {
            return "ViewAbility(om=" + this.om + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ i(int i10, j jVar, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.om = null;
            } else {
                this.om = jVar;
            }
        }

        public i(@Nullable j jVar) {
            this.om = jVar;
        }

        public /* synthetic */ i(j jVar, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? null : jVar);
        }
    }

    public static final class j {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final String extraVast;

        @Nullable
        private final Boolean isEnabled;

        /* renamed from: q7.a$j$a, reason: collision with other inner class name */
        public static final class C0468a implements i0 {

            @NotNull
            public static final C0468a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                C0468a c0468a = new C0468a();
                INSTANCE = c0468a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo", c0468a, 2);
                pluginGeneratedSerialDescriptor.k("is_enabled", true);
                pluginGeneratedSerialDescriptor.k("extra_vast", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C0468a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                return new kotlinx.serialization.b[]{x9.a.s(kotlinx.serialization.internal.i.f22868a), x9.a.s(b2.f22828a)};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public j deserialize(@NotNull y9.e decoder) {
                Object objN;
                Object objN2;
                int i10;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                w1 w1Var = null;
                if (cVarB.p()) {
                    objN = cVarB.n(descriptor2, 0, kotlinx.serialization.internal.i.f22868a, null);
                    objN2 = cVarB.n(descriptor2, 1, b2.f22828a, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objN = null;
                    Object objN3 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objN = cVarB.n(descriptor2, 0, kotlinx.serialization.internal.i.f22868a, objN);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            objN3 = cVarB.n(descriptor2, 1, b2.f22828a, objN3);
                            i11 |= 2;
                        }
                    }
                    objN2 = objN3;
                    i10 = i11;
                }
                cVarB.c(descriptor2);
                return new j(i10, (Boolean) objN, (String) objN2, w1Var);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull j value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                j.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return C0468a.INSTANCE;
            }

            private b() {
            }
        }

        public j() {
            this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.i) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ j copy$default(j jVar, Boolean bool, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = jVar.isEnabled;
            }
            if ((i10 & 2) != 0) {
                str = jVar.extraVast;
            }
            return jVar.copy(bool, str);
        }

        @JvmStatic
        public static final void write$Self(@NotNull j self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || self.isEnabled != null) {
                output.i(serialDesc, 0, kotlinx.serialization.internal.i.f22868a, self.isEnabled);
            }
            if (!output.z(serialDesc, 1) && self.extraVast == null) {
                return;
            }
            output.i(serialDesc, 1, b2.f22828a, self.extraVast);
        }

        @Nullable
        public final Boolean component1() {
            return this.isEnabled;
        }

        @Nullable
        public final String component2() {
            return this.extraVast;
        }

        @NotNull
        public final j copy(@Nullable Boolean bool, @Nullable String str) {
            return new j(bool, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return p.a(this.isEnabled, jVar.isEnabled) && p.a(this.extraVast, jVar.extraVast);
        }

        @Nullable
        public final String getExtraVast() {
            return this.extraVast;
        }

        public int hashCode() {
            Boolean bool = this.isEnabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.extraVast;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Nullable
        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public String toString() {
            return "ViewAbilityInfo(isEnabled=" + this.isEnabled + ", extraVast=" + this.extraVast + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ j(int i10, @SerialName("is_enabled") Boolean bool, @SerialName("extra_vast") String str, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.isEnabled = null;
            } else {
                this.isEnabled = bool;
            }
            if ((i10 & 2) == 0) {
                this.extraVast = null;
            } else {
                this.extraVast = str;
            }
        }

        public j(@Nullable Boolean bool, @Nullable String str) {
            this.isEnabled = bool;
            this.extraVast = str;
        }

        public /* synthetic */ j(Boolean bool, String str, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str);
        }

        @SerialName("extra_vast")
        public static /* synthetic */ void getExtraVast$annotations() {
        }

        @SerialName("is_enabled")
        public static /* synthetic */ void isEnabled$annotations() {
        }
    }

    public static final class k {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final Boolean allowFileAccessFromFileUrls;

        @Nullable
        private final Boolean allowUniversalAccessFromFileUrls;

        /* renamed from: q7.a$k$a, reason: collision with other inner class name */
        public static final class C0469a implements i0 {

            @NotNull
            public static final C0469a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                C0469a c0469a = new C0469a();
                INSTANCE = c0469a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.WebViewSettings", c0469a, 2);
                pluginGeneratedSerialDescriptor.k("allow_file_access_from_file_urls", true);
                pluginGeneratedSerialDescriptor.k("allow_universal_access_from_file_urls", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C0469a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                kotlinx.serialization.internal.i iVar = kotlinx.serialization.internal.i.f22868a;
                return new kotlinx.serialization.b[]{x9.a.s(iVar), x9.a.s(iVar)};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public k deserialize(@NotNull y9.e decoder) {
                Object objN;
                int i10;
                Object objN2;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                w1 w1Var = null;
                if (cVarB.p()) {
                    kotlinx.serialization.internal.i iVar = kotlinx.serialization.internal.i.f22868a;
                    objN2 = cVarB.n(descriptor2, 0, iVar, null);
                    objN = cVarB.n(descriptor2, 1, iVar, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objN = null;
                    Object objN3 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objN3 = cVarB.n(descriptor2, 0, kotlinx.serialization.internal.i.f22868a, objN3);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            objN = cVarB.n(descriptor2, 1, kotlinx.serialization.internal.i.f22868a, objN);
                            i11 |= 2;
                        }
                    }
                    i10 = i11;
                    objN2 = objN3;
                }
                cVarB.c(descriptor2);
                return new k(i10, (Boolean) objN2, (Boolean) objN, w1Var);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull k value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                k.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return C0469a.INSTANCE;
            }

            private b() {
            }
        }

        public k() {
            this((Boolean) null, (Boolean) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.i) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ k copy$default(k kVar, Boolean bool, Boolean bool2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = kVar.allowFileAccessFromFileUrls;
            }
            if ((i10 & 2) != 0) {
                bool2 = kVar.allowUniversalAccessFromFileUrls;
            }
            return kVar.copy(bool, bool2);
        }

        @JvmStatic
        public static final void write$Self(@NotNull k self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || self.allowFileAccessFromFileUrls != null) {
                output.i(serialDesc, 0, kotlinx.serialization.internal.i.f22868a, self.allowFileAccessFromFileUrls);
            }
            if (!output.z(serialDesc, 1) && self.allowUniversalAccessFromFileUrls == null) {
                return;
            }
            output.i(serialDesc, 1, kotlinx.serialization.internal.i.f22868a, self.allowUniversalAccessFromFileUrls);
        }

        @Nullable
        public final Boolean component1() {
            return this.allowFileAccessFromFileUrls;
        }

        @Nullable
        public final Boolean component2() {
            return this.allowUniversalAccessFromFileUrls;
        }

        @NotNull
        public final k copy(@Nullable Boolean bool, @Nullable Boolean bool2) {
            return new k(bool, bool2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return p.a(this.allowFileAccessFromFileUrls, kVar.allowFileAccessFromFileUrls) && p.a(this.allowUniversalAccessFromFileUrls, kVar.allowUniversalAccessFromFileUrls);
        }

        @Nullable
        public final Boolean getAllowFileAccessFromFileUrls() {
            return this.allowFileAccessFromFileUrls;
        }

        @Nullable
        public final Boolean getAllowUniversalAccessFromFileUrls() {
            return this.allowUniversalAccessFromFileUrls;
        }

        public int hashCode() {
            Boolean bool = this.allowFileAccessFromFileUrls;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.allowUniversalAccessFromFileUrls;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "WebViewSettings(allowFileAccessFromFileUrls=" + this.allowFileAccessFromFileUrls + ", allowUniversalAccessFromFileUrls=" + this.allowUniversalAccessFromFileUrls + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ k(int i10, @SerialName("allow_file_access_from_file_urls") Boolean bool, @SerialName("allow_universal_access_from_file_urls") Boolean bool2, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.allowFileAccessFromFileUrls = null;
            } else {
                this.allowFileAccessFromFileUrls = bool;
            }
            if ((i10 & 2) == 0) {
                this.allowUniversalAccessFromFileUrls = null;
            } else {
                this.allowUniversalAccessFromFileUrls = bool2;
            }
        }

        public k(@Nullable Boolean bool, @Nullable Boolean bool2) {
            this.allowFileAccessFromFileUrls = bool;
            this.allowUniversalAccessFromFileUrls = bool2;
        }

        public /* synthetic */ k(Boolean bool, Boolean bool2, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2);
        }

        @SerialName("allow_file_access_from_file_urls")
        public static /* synthetic */ void getAllowFileAccessFromFileUrls$annotations() {
        }

        @SerialName("allow_universal_access_from_file_urls")
        public static /* synthetic */ void getAllowUniversalAccessFromFileUrls$annotations() {
        }
    }

    public static final class l implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return b9.a.a(Boolean.valueOf(((AdAsset) obj2).isRequired()), Boolean.valueOf(((AdAsset) obj).isRequired()));
        }
    }

    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final String complexReplace(String str, String str2, String str3) {
        String strQuote = Pattern.quote(str2);
        p.d(strQuote, "quote(oldValue)");
        return new Regex(strQuote).b(str, valueOrEmpty(str3));
    }

    private final Pair<Boolean, Integer> computeAssetRequirement(Integer num) {
        if (isNativeTemplateType() || !adLoadOptimizationEnabled()) {
            return y8.i.a(Boolean.TRUE, null);
        }
        if (isPartialDownloadEnabled()) {
            return y8.i.a(Boolean.TRUE, Integer.valueOf(Math.max(0, num != null ? num.intValue() : 0)));
        }
        return y8.i.a(Boolean.FALSE, null);
    }

    private final f getAd() {
        List<f> list = this.ads;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private final c getAdMarkup() {
        f ad = getAd();
        if (ad != null) {
            return ad.getAdMarkup();
        }
        return null;
    }

    private final Pair<String, File> getIndexHtmlFile(File file) {
        c adMarkup;
        String vmURL;
        Object objB;
        File parentFile;
        if (isNativeTemplateType() || (adMarkup = getAdMarkup()) == null || (vmURL = adMarkup.getVmURL()) == null) {
            return null;
        }
        String str = com.vungle.ads.internal.util.i.INSTANCE.isValidUrl(vmURL) ? vmURL : null;
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            String path = new URI(str).getPath();
            p.d(path, "URI(url).path");
            List listC0 = u.C0(u.Y0(path, '/'), new char[]{'/'}, false, 0, 6, null);
            objB = Result.b(listC0.size() >= 2 ? z.O(z.a0(listC0, 2), "_", null, null, 0, null, null, 62, null) : "index.html");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        if (Result.g(objB)) {
            objB = null;
        }
        String str2 = (String) objB;
        if (str2 == null || (parentFile = file.getParentFile()) == null) {
            return null;
        }
        return new Pair<>(str, new File(parentFile, str2));
    }

    public static /* synthetic */ List getTpatUrls$default(a aVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        return aVar.getTpatUrls(str, str2, str3);
    }

    private final String valueOrEmpty(String str) {
        return str == null ? "" : str;
    }

    @JvmStatic
    public static final void write$Self(@NotNull a self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        if (output.z(serialDesc, 0) || self.ads != null) {
            output.i(serialDesc, 0, new kotlinx.serialization.internal.f(f.C0465a.INSTANCE), self.ads);
        }
        if (output.z(serialDesc, 1) || self.config != null) {
            output.i(serialDesc, 1, ConfigPayload.a.INSTANCE, self.config);
        }
        if (output.z(serialDesc, 2) || self.expiryWindowStart != null) {
            output.i(serialDesc, 2, b1.f22826a, self.expiryWindowStart);
        }
        if (output.z(serialDesc, 3) || !p.a(self.mraidFiles, new ConcurrentHashMap())) {
            r9.c cVarB = t.b(ConcurrentHashMap.class);
            b2 b2Var = b2.f22828a;
            output.C(serialDesc, 3, new ContextualSerializer(cVarB, null, new kotlinx.serialization.b[]{b2Var, b2Var}), self.mraidFiles);
        }
        if (output.z(serialDesc, 4) || !p.a(self.incentivizedTextSettings, new HashMap())) {
            b2 b2Var2 = b2.f22828a;
            output.C(serialDesc, 4, new v0(b2Var2, b2Var2), self.incentivizedTextSettings);
        }
        if (output.z(serialDesc, 5) || self.assetsFullyDownloaded) {
            output.x(serialDesc, 5, self.assetsFullyDownloaded);
        }
        if (!output.z(serialDesc, 6) && self.indexFilePath == null) {
            return;
        }
        output.i(serialDesc, 6, b2.f22828a, self.indexFilePath);
    }

    public final int adHeight() {
        b adSizeInfo;
        Integer height;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (height = adSizeInfo.getHeight()) == null) {
            return 0;
        }
        return height.intValue();
    }

    public final boolean adLoadOptimizationEnabled() {
        Boolean adLoadOptimizationEnabled;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (adLoadOptimizationEnabled = adMarkup.getAdLoadOptimizationEnabled()) == null) {
            return true;
        }
        return adLoadOptimizationEnabled.booleanValue();
    }

    @Nullable
    public final c adUnit() {
        return getAdMarkup();
    }

    public final int adWidth() {
        b adSizeInfo;
        Integer width;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (width = adSizeInfo.getWidth()) == null) {
            return 0;
        }
        return width.intValue();
    }

    @Nullable
    public final String advAppId() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdvAppId();
        }
        return null;
    }

    @Nullable
    public final ConfigPayload config() {
        return this.config;
    }

    @NotNull
    public final JsonObject createMRAIDArgs() {
        Map<String, String> mRAIDArgsInMap = getMRAIDArgsInMap();
        z9.o oVar = new z9.o();
        for (Map.Entry<String, String> entry : mRAIDArgsInMap.entrySet()) {
            z9.f.c(oVar, entry.getKey(), entry.getValue());
        }
        return oVar.a();
    }

    @Nullable
    public final String eventId() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getId();
        }
        return null;
    }

    @Nullable
    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    @Nullable
    public final String getAdSource() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdSource();
        }
        return null;
    }

    public final boolean getAssetsFullyDownloaded() {
        return this.assetsFullyDownloaded;
    }

    @NotNull
    public final String getCreativeId() {
        String creativeId;
        c adMarkup = getAdMarkup();
        return (adMarkup == null || (creativeId = adMarkup.getCreativeId()) == null) ? "unknown" : creativeId;
    }

    @NotNull
    public final List<AdAsset> getDownloadableAssets(@NotNull File dir) {
        g templateSettings;
        Map<String, d> cacheableReplacements;
        p.e(dir, "dir");
        ArrayList arrayList = new ArrayList();
        Pair<String, File> indexHtmlFile = getIndexHtmlFile(dir);
        if (indexHtmlFile != null) {
            String str = (String) indexHtmlFile.getFirst();
            File file = (File) indexHtmlFile.getSecond();
            this.indexFilePath = file.getAbsolutePath();
            if (!file.exists()) {
                com.vungle.ads.internal.util.p.Companion.d(TAG, "No cacheable index file found, creating new one: " + file);
                String absolutePath = file.getAbsolutePath();
                p.d(absolutePath, "indexFile.absolutePath");
                arrayList.add(new AdAsset(KEY_VM, str, absolutePath, true, null, 16, null));
            }
        }
        c adMarkup = getAdMarkup();
        if (adMarkup != null && (templateSettings = adMarkup.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, d> entry : cacheableReplacements.entrySet()) {
                String key = entry.getKey();
                d value = entry.getValue();
                String url = value.getUrl();
                if (url != null) {
                    com.vungle.ads.internal.util.i iVar = com.vungle.ads.internal.util.i.INSTANCE;
                    if (iVar.isValidUrl(url)) {
                        String filePath = new File(dir, iVar.guessFileName(url, value.getExtension())).getAbsolutePath();
                        Pair<Boolean, Integer> pairComputeAssetRequirement = computeAssetRequirement(value.getDownloadPercent());
                        boolean zBooleanValue = ((Boolean) pairComputeAssetRequirement.getFirst()).booleanValue();
                        Integer num = (Integer) pairComputeAssetRequirement.getSecond();
                        p.d(filePath, "filePath");
                        AdAsset adAsset = new AdAsset(key, url, filePath, zBooleanValue, num);
                        String extension = value.getExtension();
                        if (extension != null) {
                            adAsset.setMimeType(extension);
                        }
                        arrayList.add(adAsset);
                        if (zBooleanValue && num != null) {
                            this.partialDownloadAssets.put(url, adAsset);
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            v.v(arrayList, new l());
        }
        return arrayList;
    }

    @NotNull
    public final Map<String, String> getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    @Nullable
    public final String getIndexFilePath() {
        return this.indexFilePath;
    }

    @Nullable
    public final AdAsset getLocalPartialDownloadAssets(@NotNull String remoteUrl) {
        p.e(remoteUrl, "remoteUrl");
        return this.partialDownloadAssets.get(remoteUrl);
    }

    @Nullable
    public final o getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    @NotNull
    public final Map<String, String> getMRAIDArgsInMap() {
        g templateSettings;
        Map<String, d> cacheableReplacements;
        g templateSettings2;
        Map<String, String> normalReplacements;
        c adMarkup = getAdMarkup();
        if ((adMarkup != null ? adMarkup.getTemplateSettings() : null) == null) {
            throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings2 = adMarkup2.getTemplateSettings()) != null && (normalReplacements = templateSettings2.getNormalReplacements()) != null) {
            linkedHashMap.putAll(normalReplacements);
        }
        c adMarkup3 = getAdMarkup();
        if (adMarkup3 != null && (templateSettings = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, d> entry : cacheableReplacements.entrySet()) {
                String url = entry.getValue().getUrl();
                if (url != null) {
                    linkedHashMap.put(entry.getKey(), url);
                }
            }
        }
        if (!this.mraidFiles.isEmpty()) {
            linkedHashMap.putAll(this.mraidFiles);
        }
        if (!this.incentivizedTextSettings.isEmpty()) {
            linkedHashMap.putAll(this.incentivizedTextSettings);
        }
        return linkedHashMap;
    }

    @Nullable
    public final String getMediationName() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getMediationName();
        }
        return null;
    }

    @NotNull
    public final Map<String, AdAsset> getPartialDownloadAssets$vungle_ads_release() {
        return this.partialDownloadAssets;
    }

    public final int getShowCloseDelay(@Nullable Boolean bool) {
        Integer showClose;
        int iIntValue;
        Integer showCloseIncentivized;
        if (p.a(bool, Boolean.TRUE)) {
            c adMarkup = getAdMarkup();
            if (adMarkup == null || (showCloseIncentivized = adMarkup.getShowCloseIncentivized()) == null) {
                return 0;
            }
            iIntValue = showCloseIncentivized.intValue();
        } else {
            c adMarkup2 = getAdMarkup();
            if (adMarkup2 == null || (showClose = adMarkup2.getShowClose()) == null) {
                return 0;
            }
            iIntValue = showClose.intValue();
        }
        return iIntValue * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    public final List<String> getTpatUrls(@NotNull String event, @Nullable String str, @Nullable String str2) {
        Map<String, List<String>> tpat;
        Map<String, List<String>> tpat2;
        p.e(event, "event");
        c adMarkup = getAdMarkup();
        if (adMarkup != null && (tpat2 = adMarkup.getTpat()) != null && !tpat2.containsKey(event)) {
            new TpatError(Sdk$SDKError.Reason.INVALID_TPAT_KEY, "Arbitrary tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        c adMarkup2 = getAdMarkup();
        List<String> list = (adMarkup2 == null || (tpat = adMarkup2.getTpat()) == null) ? null : tpat.get(event);
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            new TpatError(Sdk$SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        switch (event.hashCode()) {
            case -2125915830:
                if (event.equals(com.vungle.ads.internal.b.CHECKPOINT_0)) {
                    List<String> list3 = list;
                    ArrayList arrayList = new ArrayList(z8.s.s(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(complexReplace(complexReplace(complexReplace((String) it.next(), com.vungle.ads.internal.b.REMOTE_PLAY_KEY, String.valueOf(!this.assetsFullyDownloaded)), com.vungle.ads.internal.b.NETWORK_OPERATOR_KEY, str), com.vungle.ads.internal.b.DEVICE_VOLUME_KEY, str2));
                    }
                    return arrayList;
                }
                return list;
            case -747709511:
                if (event.equals(com.vungle.ads.internal.b.VIDEO_LENGTH_TPAT)) {
                    List<String> list4 = list;
                    ArrayList arrayList2 = new ArrayList(z8.s.s(list4, 10));
                    Iterator<T> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(complexReplace((String) it2.next(), com.vungle.ads.internal.b.VIDEO_LENGTH_KEY, str));
                    }
                    return arrayList2;
                }
                return list;
            case -132489083:
                if (event.equals(com.vungle.ads.internal.b.AD_LOAD_DURATION)) {
                    List<String> list5 = list;
                    ArrayList arrayList3 = new ArrayList(z8.s.s(list5, 10));
                    Iterator<T> it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(complexReplace((String) it3.next(), com.vungle.ads.internal.b.AD_LOAD_DURATION_KEY, str));
                    }
                    return arrayList3;
                }
                return list;
            case 1516630125:
                if (event.equals(com.vungle.ads.internal.b.AD_CLOSE)) {
                    List<String> list6 = list;
                    ArrayList arrayList4 = new ArrayList(z8.s.s(list6, 10));
                    Iterator<T> it4 = list6.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(complexReplace(complexReplace((String) it4.next(), com.vungle.ads.internal.b.AD_DURATION_KEY, str), com.vungle.ads.internal.b.DEVICE_VOLUME_KEY, str2));
                    }
                    return arrayList4;
                }
                return list;
            case 1940309120:
                if (event.equals(com.vungle.ads.internal.b.DEEPLINK_CLICK)) {
                    List<String> list7 = list;
                    ArrayList arrayList5 = new ArrayList(z8.s.s(list7, 10));
                    Iterator<T> it5 = list7.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(complexReplace((String) it5.next(), com.vungle.ads.internal.b.DEEPLINK_SUCCESS_KEY, str));
                    }
                    return arrayList5;
                }
                return list;
            default:
                return list;
        }
    }

    @Nullable
    public final String getViewMasterVersion() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getVmVersion();
        }
        return null;
    }

    @Nullable
    public final k getWebViewSettings() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getWebViewSettings();
        }
        return null;
    }

    @Nullable
    public final List<String> getWinNotifications() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getNotification();
        }
        return null;
    }

    public final boolean hasExpired() {
        c adMarkup = getAdMarkup();
        if (adMarkup == null) {
            return false;
        }
        Long l10 = this.expiryWindowStart;
        if (adMarkup.getExpiryDuration() != null && l10 != null) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - l10.longValue()) / 1000;
            Integer expiryDuration = adMarkup.getExpiryDuration();
            return jCurrentTimeMillis > (expiryDuration != null ? Long.valueOf((long) expiryDuration.intValue()) : null).longValue();
        }
        if (adMarkup.getExpiry() != null) {
            if (System.currentTimeMillis() / 1000 > (adMarkup.getExpiry() != null ? Long.valueOf(r0.intValue()) : null).longValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean heartbeatEnabled() {
        Boolean templateHeartbeatCheck;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (templateHeartbeatCheck = adMarkup.getTemplateHeartbeatCheck()) == null) {
            return false;
        }
        return templateHeartbeatCheck.booleanValue();
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        Boolean clickCoordinatesEnabled;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (clickCoordinatesEnabled = adMarkup.getClickCoordinatesEnabled()) == null) {
            return false;
        }
        return clickCoordinatesEnabled.booleanValue();
    }

    public final boolean isCriticalAsset(@NotNull String failingUrl) {
        g templateSettings;
        Map<String, d> cacheableReplacements;
        p.e(failingUrl, "failingUrl");
        if (!isNativeTemplateType()) {
            c adMarkup = getAdMarkup();
            if (p.a(adMarkup != null ? adMarkup.getVmURL() : null, failingUrl)) {
                return true;
            }
        }
        c adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (templateSettings = adMarkup2.getTemplateSettings()) == null || (cacheableReplacements = templateSettings.getCacheableReplacements()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, d> entry : cacheableReplacements.entrySet()) {
            if (p.a(entry.getValue().getUrl(), failingUrl)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final boolean isNativeTemplateType() {
        return p.a(templateType(), "native");
    }

    public final boolean isPartialDownloadEnabled() {
        Boolean partialDownloadEnabled;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (partialDownloadEnabled = adMarkup.getPartialDownloadEnabled()) == null) {
            return false;
        }
        return partialDownloadEnabled.booleanValue();
    }

    public final boolean omEnabled() {
        i viewAbility;
        j om;
        Boolean boolIsEnabled;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (viewAbility = adMarkup.getViewAbility()) == null || (om = viewAbility.getOm()) == null || (boolIsEnabled = om.isEnabled()) == null) {
            return false;
        }
        return boolIsEnabled.booleanValue();
    }

    @Nullable
    public final String placementId() {
        f ad = getAd();
        if (ad != null) {
            return ad.getPlacementReferenceId();
        }
        return null;
    }

    public final void recordExpiryWindowStart() {
        this.expiryWindowStart = Long.valueOf(System.currentTimeMillis());
    }

    public final void setAdConfig(@Nullable AdConfig adConfig) {
        this.adConfig = adConfig;
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final void setAssetsFullyDownloaded(boolean z10) {
        this.assetsFullyDownloaded = z10;
    }

    public final void setIncentivizedText(@NotNull String title, @NotNull String body, @NotNull String keepWatching, @NotNull String close) {
        p.e(title, "title");
        p.e(body, "body");
        p.e(keepWatching, "keepWatching");
        p.e(close, "close");
        if (title.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, title);
        }
        if (body.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, body);
        }
        if (keepWatching.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, keepWatching);
        }
        if (close.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, close);
        }
    }

    public final void setIncentivizedTextSettings(@NotNull Map<String, String> map) {
        p.e(map, "<set-?>");
        this.incentivizedTextSettings = map;
    }

    public final void setLogEntry$vungle_ads_release(@Nullable o oVar) {
        this.logEntry = oVar;
    }

    @Nullable
    public final String templateType() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getTemplateType();
        }
        return null;
    }

    public final synchronized void updateAdAssetPath(@NotNull String adIdentifier, @NotNull File localFile) {
        p.e(adIdentifier, "adIdentifier");
        p.e(localFile, "localFile");
        if (localFile.exists()) {
            this.mraidFiles.put(adIdentifier, FILE_SCHEME + localFile.getAbsolutePath());
        }
    }

    public final boolean usePreloading() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return p.a(adMarkup.getUsePreloading(), Boolean.TRUE);
        }
        return false;
    }

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ a(int i10, @SerialName(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS) List list, @SerialName("config") ConfigPayload configPayload, Long l10, @Contextual ConcurrentHashMap concurrentHashMap, @VisibleForTesting Map map, boolean z10, String str, w1 w1Var) {
        if ((i10 & 1) == 0) {
            this.ads = null;
        } else {
            this.ads = list;
        }
        if ((i10 & 2) == 0) {
            this.config = null;
        } else {
            this.config = configPayload;
        }
        if ((i10 & 4) == 0) {
            this.expiryWindowStart = null;
        } else {
            this.expiryWindowStart = l10;
        }
        if ((i10 & 8) == 0) {
            this.mraidFiles = new ConcurrentHashMap<>();
        } else {
            this.mraidFiles = concurrentHashMap;
        }
        if ((i10 & 16) == 0) {
            this.incentivizedTextSettings = new HashMap();
        } else {
            this.incentivizedTextSettings = map;
        }
        if ((i10 & 32) == 0) {
            this.assetsFullyDownloaded = false;
        } else {
            this.assetsFullyDownloaded = z10;
        }
        this.adConfig = null;
        this.logEntry = null;
        if ((i10 & 64) == 0) {
            this.indexFilePath = null;
        } else {
            this.indexFilePath = str;
        }
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public a(@Nullable List<f> list, @Nullable ConfigPayload configPayload) {
        this.ads = list;
        this.config = configPayload;
        this.mraidFiles = new ConcurrentHashMap<>();
        this.incentivizedTextSettings = new HashMap();
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public /* synthetic */ a(List list, ConfigPayload configPayload, int i10, kotlin.jvm.internal.i iVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : configPayload);
    }

    @Transient
    public static /* synthetic */ void getAdConfig$annotations() {
    }

    @SerialName(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)
    private static /* synthetic */ void getAds$annotations() {
    }

    @SerialName("config")
    private static /* synthetic */ void getConfig$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getIncentivizedTextSettings$annotations() {
    }

    @Transient
    public static /* synthetic */ void getLogEntry$vungle_ads_release$annotations() {
    }

    @Contextual
    private static /* synthetic */ void getMraidFiles$annotations() {
    }

    @Transient
    @VisibleForTesting
    public static /* synthetic */ void getPartialDownloadAssets$vungle_ads_release$annotations() {
    }
}
