package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdRequestKt {

    @NotNull
    public static final AdRequestKt INSTANCE = new AdRequestKt();

    @Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u009a\u00012\u00020\u0001:\u0004\u009a\u0001\u009b\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u000bJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010\u000eJ\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJ\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u000bJ\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u000eJ5\u0010,\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&H\u0007¢\u0006\u0004\b*\u0010+J6\u0010.\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&H\u0087\n¢\u0006\u0004\b-\u0010+J-\u00101\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010(\u001a\u00020&H\u0007¢\u0006\u0004\b/\u00100J9\u00106\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&02H\u0007¢\u0006\u0004\b4\u00105J%\u00109\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0007¢\u0006\u0004\b7\u00108J\r\u0010:\u001a\u00020\t¢\u0006\u0004\b:\u0010\u000bJ\r\u0010;\u001a\u00020\f¢\u0006\u0004\b;\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R$\u0010B\u001a\u00020=2\u0006\u0010)\u001a\u00020=8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010H\u001a\u00020C2\u0006\u0010)\u001a\u00020C8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010N\u001a\u00020I2\u0006\u0010)\u001a\u00020I8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010T\u001a\u00020O2\u0006\u0010)\u001a\u00020O8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010Z\u001a\u00020U2\u0006\u0010)\u001a\u00020U8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010_\u001a\u00020&2\u0006\u0010)\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010c\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010\u000e\"\u0004\ba\u0010bR$\u0010f\u001a\u00020U2\u0006\u0010)\u001a\u00020U8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010W\"\u0004\be\u0010YR$\u0010l\u001a\u00020g2\u0006\u0010)\u001a\u00020g8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010o\u001a\u00020U2\u0006\u0010)\u001a\u00020U8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010W\"\u0004\bn\u0010YR$\u0010u\u001a\u00020p2\u0006\u0010)\u001a\u00020p8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010x\u001a\u00020g2\u0006\u0010)\u001a\u00020g8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010i\"\u0004\bw\u0010kR$\u0010~\u001a\u00020y2\u0006\u0010)\u001a\u00020y8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0019\u0010\u0081\u0001\u001a\u0004\u0018\u00010y*\u00020\u00008F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R+\u0010\u0087\u0001\u001a\u00030\u0082\u00012\u0007\u0010)\u001a\u00030\u0082\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R'\u0010\u008a\u0001\u001a\u00020g2\u0006\u0010)\u001a\u00020g8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0088\u0001\u0010i\"\u0005\b\u0089\u0001\u0010kR'\u0010\u008d\u0001\u001a\u00020&2\u0006\u0010)\u001a\u00020&8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008b\u0001\u0010\\\"\u0005\b\u008c\u0001\u0010^R&\u0010\u0090\u0001\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%8G¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R+\u0010\u0096\u0001\u001a\u00030\u0091\u00012\u0007\u0010)\u001a\u00030\u0091\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0091\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u009c\u0001"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt$Dsl;", "", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest$Builder;)V", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "_build", "()Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "Ly8/s;", "clearSessionCounters", "()V", "", "hasSessionCounters", "()Z", "clearStaticDeviceInfo", "hasStaticDeviceInfo", "clearDynamicDeviceInfo", "hasDynamicDeviceInfo", "clearCampaignState", "hasCampaignState", "clearImpressionOpportunityId", "clearPlacementId", "clearRequestImpressionConfiguration", "clearScarSignal", "clearWebviewVersion", "hasWebviewVersion", "clearTcf", "hasTcf", "clearAdRequestType", "hasAdRequestType", "clearBannerSize", "hasBannerSize", "clearAdFormat", "hasAdFormat", "clearMediationAdUnitId", "hasMediationAdUnitId", "Lcom/google/protobuf/kotlin/DslMap;", "", "Lgatewayprotocol/v1/AdRequestKt$Dsl$ExtrasProxy;", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "putExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;Ljava/lang/String;)V", "put", "setExtras", "set", "removeExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;)V", "remove", "", "map", "putAllExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/util/Map;)V", "putAll", "clearExtras", "(Lcom/google/protobuf/kotlin/DslMap;)V", "clear", "clearMediationInfo", "hasMediationInfo", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest$Builder;", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "sessionCounters", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "staticDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "dynamicDeviceInfo", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "getCampaignState", "()Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "setCampaignState", "(Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;)V", "campaignState", "Lcom/google/protobuf/ByteString;", "getImpressionOpportunityId", "()Lcom/google/protobuf/ByteString;", "setImpressionOpportunityId", "(Lcom/google/protobuf/ByteString;)V", "impressionOpportunityId", "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "getRequestImpressionConfiguration", "setRequestImpressionConfiguration", "(Z)V", "requestImpressionConfiguration", "getScarSignal", "setScarSignal", "scarSignal", "", "getWebviewVersion", "()I", "setWebviewVersion", "(I)V", "webviewVersion", "getTcf", "setTcf", "tcf", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestType;", "getAdRequestType", "()Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestType;", "setAdRequestType", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestType;)V", "adRequestType", "getAdRequestTypeValue", "setAdRequestTypeValue", "adRequestTypeValue", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "getBannerSize", "()Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "setBannerSize", "(Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;)V", "bannerSize", "getBannerSizeOrNull", "(Lgatewayprotocol/v1/AdRequestKt$Dsl;)Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "bannerSizeOrNull", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "adFormat", "getAdFormatValue", "setAdFormatValue", "adFormatValue", "getMediationAdUnitId", "setMediationAdUnitId", "mediationAdUnitId", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", "extras", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "getMediationInfo", "()Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "setMediationInfo", "(Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;)V", "mediationInfo", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/AdRequestKt$Dsl;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfoOrNull", "Companion", "ExtrasProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdRequestOuterClass.AdRequest.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/AdRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(AdRequestOuterClass.AdRequest.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public /* synthetic */ Dsl(AdRequestOuterClass.AdRequest.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ AdRequestOuterClass.AdRequest _build() {
            AdRequestOuterClass.AdRequest adRequestBuild = this._builder.build();
            p.d(adRequestBuild, "_builder.build()");
            return adRequestBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdRequestType() {
            this._builder.clearAdRequestType();
        }

        public final void clearBannerSize() {
            this._builder.clearBannerSize();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        @JvmName(name = "clearExtras")
        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            p.e(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearMediationAdUnitId() {
            this._builder.clearMediationAdUnitId();
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearRequestImpressionConfiguration() {
            this._builder.clearRequestImpressionConfiguration();
        }

        public final void clearScarSignal() {
            this._builder.clearScarSignal();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final void clearWebviewVersion() {
            this._builder.clearWebviewVersion();
        }

        @JvmName(name = "getAdFormat")
        @NotNull
        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            p.d(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        @JvmName(name = "getAdFormatValue")
        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        @JvmName(name = "getAdRequestType")
        @NotNull
        public final AdRequestOuterClass.AdRequestType getAdRequestType() {
            AdRequestOuterClass.AdRequestType adRequestType = this._builder.getAdRequestType();
            p.d(adRequestType, "_builder.getAdRequestType()");
            return adRequestType;
        }

        @JvmName(name = "getAdRequestTypeValue")
        public final int getAdRequestTypeValue() {
            return this._builder.getAdRequestTypeValue();
        }

        @JvmName(name = "getBannerSize")
        @NotNull
        public final AdRequestOuterClass.BannerSize getBannerSize() {
            AdRequestOuterClass.BannerSize bannerSize = this._builder.getBannerSize();
            p.d(bannerSize, "_builder.getBannerSize()");
            return bannerSize;
        }

        @Nullable
        public final AdRequestOuterClass.BannerSize getBannerSizeOrNull(@NotNull Dsl dsl) {
            p.e(dsl, "<this>");
            return AdRequestKtKt.getBannerSizeOrNull(dsl._builder);
        }

        @JvmName(name = "getCampaignState")
        @NotNull
        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            p.d(campaignState, "_builder.getCampaignState()");
            return campaignState;
        }

        @JvmName(name = "getDynamicDeviceInfo")
        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            p.d(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        @JvmName(name = "getExtrasMap")
        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            p.d(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        @JvmName(name = "getImpressionOpportunityId")
        @NotNull
        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            p.d(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        @JvmName(name = "getMediationAdUnitId")
        @NotNull
        public final String getMediationAdUnitId() {
            String mediationAdUnitId = this._builder.getMediationAdUnitId();
            p.d(mediationAdUnitId, "_builder.getMediationAdUnitId()");
            return mediationAdUnitId;
        }

        @JvmName(name = "getMediationInfo")
        @NotNull
        public final MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this._builder.getMediationInfo();
            p.d(mediationInfo, "_builder.getMediationInfo()");
            return mediationInfo;
        }

        @Nullable
        public final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(@NotNull Dsl dsl) {
            p.e(dsl, "<this>");
            return AdRequestKtKt.getMediationInfoOrNull(dsl._builder);
        }

        @JvmName(name = "getPlacementId")
        @NotNull
        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            p.d(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        @JvmName(name = "getRequestImpressionConfiguration")
        public final boolean getRequestImpressionConfiguration() {
            return this._builder.getRequestImpressionConfiguration();
        }

        @JvmName(name = "getScarSignal")
        @NotNull
        public final ByteString getScarSignal() {
            ByteString scarSignal = this._builder.getScarSignal();
            p.d(scarSignal, "_builder.getScarSignal()");
            return scarSignal;
        }

        @JvmName(name = "getSessionCounters")
        @NotNull
        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            p.d(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        @JvmName(name = "getStaticDeviceInfo")
        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            p.d(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        @JvmName(name = "getTcf")
        @NotNull
        public final ByteString getTcf() {
            ByteString tcf = this._builder.getTcf();
            p.d(tcf, "_builder.getTcf()");
            return tcf;
        }

        @JvmName(name = "getWebviewVersion")
        public final int getWebviewVersion() {
            return this._builder.getWebviewVersion();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasAdRequestType() {
            return this._builder.hasAdRequestType();
        }

        public final boolean hasBannerSize() {
            return this._builder.hasBannerSize();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasMediationAdUnitId() {
            return this._builder.hasMediationAdUnitId();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final boolean hasTcf() {
            return this._builder.hasTcf();
        }

        public final boolean hasWebviewVersion() {
            return this._builder.hasWebviewVersion();
        }

        @JvmName(name = "putAllExtras")
        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            p.e(dslMap, "<this>");
            p.e(map, "map");
            this._builder.putAllExtras(map);
        }

        @JvmName(name = "putExtras")
        public final void putExtras(@NotNull DslMap<String, String, ExtrasProxy> dslMap, @NotNull String key, @NotNull String value) {
            p.e(dslMap, "<this>");
            p.e(key, "key");
            p.e(value, "value");
            this._builder.putExtras(key, value);
        }

        @JvmName(name = "removeExtras")
        public final /* synthetic */ void removeExtras(DslMap dslMap, String key) {
            p.e(dslMap, "<this>");
            p.e(key, "key");
            this._builder.removeExtras(key);
        }

        @JvmName(name = "setAdFormat")
        public final void setAdFormat(@NotNull AdFormatOuterClass.AdFormat value) {
            p.e(value, "value");
            this._builder.setAdFormat(value);
        }

        @JvmName(name = "setAdFormatValue")
        public final void setAdFormatValue(int i10) {
            this._builder.setAdFormatValue(i10);
        }

        @JvmName(name = "setAdRequestType")
        public final void setAdRequestType(@NotNull AdRequestOuterClass.AdRequestType value) {
            p.e(value, "value");
            this._builder.setAdRequestType(value);
        }

        @JvmName(name = "setAdRequestTypeValue")
        public final void setAdRequestTypeValue(int i10) {
            this._builder.setAdRequestTypeValue(i10);
        }

        @JvmName(name = "setBannerSize")
        public final void setBannerSize(@NotNull AdRequestOuterClass.BannerSize value) {
            p.e(value, "value");
            this._builder.setBannerSize(value);
        }

        @JvmName(name = "setCampaignState")
        public final void setCampaignState(@NotNull CampaignStateOuterClass.CampaignState value) {
            p.e(value, "value");
            this._builder.setCampaignState(value);
        }

        @JvmName(name = "setDynamicDeviceInfo")
        public final void setDynamicDeviceInfo(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            p.e(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        @JvmName(name = "setExtras")
        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            p.e(dslMap, "<this>");
            p.e(key, "key");
            p.e(value, "value");
            putExtras(dslMap, key, value);
        }

        @JvmName(name = "setImpressionOpportunityId")
        public final void setImpressionOpportunityId(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        @JvmName(name = "setMediationAdUnitId")
        public final void setMediationAdUnitId(@NotNull String value) {
            p.e(value, "value");
            this._builder.setMediationAdUnitId(value);
        }

        @JvmName(name = "setMediationInfo")
        public final void setMediationInfo(@NotNull MediationInfoOuterClass.MediationInfo value) {
            p.e(value, "value");
            this._builder.setMediationInfo(value);
        }

        @JvmName(name = "setPlacementId")
        public final void setPlacementId(@NotNull String value) {
            p.e(value, "value");
            this._builder.setPlacementId(value);
        }

        @JvmName(name = "setRequestImpressionConfiguration")
        public final void setRequestImpressionConfiguration(boolean z10) {
            this._builder.setRequestImpressionConfiguration(z10);
        }

        @JvmName(name = "setScarSignal")
        public final void setScarSignal(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setScarSignal(value);
        }

        @JvmName(name = "setSessionCounters")
        public final void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters value) {
            p.e(value, "value");
            this._builder.setSessionCounters(value);
        }

        @JvmName(name = "setStaticDeviceInfo")
        public final void setStaticDeviceInfo(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            p.e(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        @JvmName(name = "setTcf")
        public final void setTcf(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setTcf(value);
        }

        @JvmName(name = "setWebviewVersion")
        public final void setWebviewVersion(int i10) {
            this._builder.setWebviewVersion(i10);
        }

        private Dsl(AdRequestOuterClass.AdRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private AdRequestKt() {
    }
}
