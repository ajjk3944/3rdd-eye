package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InitializationRequestKt {

    @NotNull
    public static final InitializationRequestKt INSTANCE = new InitializationRequestKt();

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u0000 \u007f2\u00020\u0001:\u0003\u007f\u0080\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\r\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u000bJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u000eJ\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010\u000bJ\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u000eJ\r\u0010\"\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u000bJ\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010\u000eJ\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010\u000bJ\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010\u000eJ\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010\u000bJ\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010\u000eJ5\u0010/\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0007¢\u0006\u0004\b-\u0010.J6\u00101\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0087\n¢\u0006\u0004\b0\u0010.J-\u00104\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0006\u0010+\u001a\u00020)H\u0007¢\u0006\u0004\b2\u00103J9\u00109\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)05H\u0007¢\u0006\u0004\b7\u00108J%\u0010<\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(H\u0007¢\u0006\u0004\b:\u0010;J\r\u0010=\u001a\u00020\t¢\u0006\u0004\b=\u0010\u000bJ\r\u0010>\u001a\u00020\f¢\u0006\u0004\b>\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R$\u0010E\u001a\u00020@2\u0006\u0010,\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010K\u001a\u00020F2\u0006\u0010,\u001a\u00020F8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010P\u001a\u00020)2\u0006\u0010,\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010S\u001a\u00020F2\u0006\u0010,\u001a\u00020F8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010H\"\u0004\bR\u0010JR$\u0010V\u001a\u00020F2\u0006\u0010,\u001a\u00020F8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010H\"\u0004\bU\u0010JR$\u0010Y\u001a\u00020)2\u0006\u0010,\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010M\"\u0004\bX\u0010OR$\u0010\\\u001a\u00020F2\u0006\u0010,\u001a\u00020F8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010H\"\u0004\b[\u0010JR$\u0010_\u001a\u00020)2\u0006\u0010,\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010M\"\u0004\b^\u0010OR$\u0010e\u001a\u00020`2\u0006\u0010,\u001a\u00020`8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010i\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010\u000e\"\u0004\bg\u0010hR$\u0010l\u001a\u00020)2\u0006\u0010,\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010M\"\u0004\bk\u0010OR$\u0010o\u001a\u00020F2\u0006\u0010,\u001a\u00020F8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010H\"\u0004\bn\u0010JR$\u0010r\u001a\u00020F2\u0006\u0010,\u001a\u00020F8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u0010H\"\u0004\bq\u0010JR$\u0010u\u001a\u00020F2\u0006\u0010,\u001a\u00020F8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010H\"\u0004\bt\u0010JR$\u0010x\u001a\u00020)2\u0006\u0010,\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010M\"\u0004\bw\u0010OR#\u0010{\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(8G¢\u0006\u0006\u001a\u0004\by\u0010zR$\u0010~\u001a\u00020)2\u0006\u0010,\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b|\u0010M\"\u0004\b}\u0010O¨\u0006\u0081\u0001"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl;", "", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;)V", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "_build", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "Ly8/s;", "clearClientInfo", "()V", "", "hasClientInfo", "()Z", "clearPrivacy", "hasPrivacy", "clearIdfi", "clearSessionId", "clearCache", "hasCache", "clearLegacyFlowUserConsent", "hasLegacyFlowUserConsent", "clearAuid", "hasAuid", "clearAnalyticsUserId", "hasAnalyticsUserId", "clearDeviceInfo", "hasDeviceInfo", "clearIsFirstInit", "clearAuidString", "hasAuidString", "clearUadsInitBlob", "hasUadsInitBlob", "clearUnityInstallationId", "hasUnityInstallationId", "clearUnityMegaSessionId", "hasUnityMegaSessionId", "clearExternalUserIdentifier", "hasExternalUserIdentifier", "Lcom/google/protobuf/kotlin/DslMap;", "", "Lgatewayprotocol/v1/InitializationRequestKt$Dsl$ExtrasProxy;", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "putExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;Ljava/lang/String;)V", "put", "setExtras", "set", "removeExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;)V", "remove", "", "map", "putAllExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/util/Map;)V", "putAll", "clearExtras", "(Lcom/google/protobuf/kotlin/DslMap;)V", "clear", "clearUnityBuildGuid", "hasUnityBuildGuid", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "getClientInfo", "()Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "setClientInfo", "(Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;)V", "clientInfo", "Lcom/google/protobuf/ByteString;", "getPrivacy", "()Lcom/google/protobuf/ByteString;", "setPrivacy", "(Lcom/google/protobuf/ByteString;)V", "privacy", "getIdfi", "()Ljava/lang/String;", "setIdfi", "(Ljava/lang/String;)V", ScarConstants.IDFI_KEY, "getSessionId", "setSessionId", JsonStorageKeyNames.SESSION_ID_KEY, "getCache", "setCache", "cache", "getLegacyFlowUserConsent", "setLegacyFlowUserConsent", "legacyFlowUserConsent", "getAuid", "setAuid", "auid", "getAnalyticsUserId", "setAnalyticsUserId", "analyticsUserId", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "getDeviceInfo", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "setDeviceInfo", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;)V", "deviceInfo", "getIsFirstInit", "setIsFirstInit", "(Z)V", "isFirstInit", "getAuidString", "setAuidString", "auidString", "getUadsInitBlob", "setUadsInitBlob", "uadsInitBlob", "getUnityInstallationId", "setUnityInstallationId", "unityInstallationId", "getUnityMegaSessionId", "setUnityMegaSessionId", "unityMegaSessionId", "getExternalUserIdentifier", "setExternalUserIdentifier", "externalUserIdentifier", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", "extras", "getUnityBuildGuid", "setUnityBuildGuid", "unityBuildGuid", "Companion", "ExtrasProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final InitializationRequestOuterClass.InitializationRequest.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/InitializationRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ InitializationRequestOuterClass.InitializationRequest _build() {
            InitializationRequestOuterClass.InitializationRequest initializationRequestBuild = this._builder.build();
            p.d(initializationRequestBuild, "_builder.build()");
            return initializationRequestBuild;
        }

        public final void clearAnalyticsUserId() {
            this._builder.clearAnalyticsUserId();
        }

        public final void clearAuid() {
            this._builder.clearAuid();
        }

        public final void clearAuidString() {
            this._builder.clearAuidString();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDeviceInfo() {
            this._builder.clearDeviceInfo();
        }

        public final void clearExternalUserIdentifier() {
            this._builder.clearExternalUserIdentifier();
        }

        @JvmName(name = "clearExtras")
        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            p.e(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearIsFirstInit() {
            this._builder.clearIsFirstInit();
        }

        public final void clearLegacyFlowUserConsent() {
            this._builder.clearLegacyFlowUserConsent();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final void clearUadsInitBlob() {
            this._builder.clearUadsInitBlob();
        }

        public final void clearUnityBuildGuid() {
            this._builder.clearUnityBuildGuid();
        }

        public final void clearUnityInstallationId() {
            this._builder.clearUnityInstallationId();
        }

        public final void clearUnityMegaSessionId() {
            this._builder.clearUnityMegaSessionId();
        }

        @JvmName(name = "getAnalyticsUserId")
        @NotNull
        public final String getAnalyticsUserId() {
            String analyticsUserId = this._builder.getAnalyticsUserId();
            p.d(analyticsUserId, "_builder.getAnalyticsUserId()");
            return analyticsUserId;
        }

        @JvmName(name = "getAuid")
        @NotNull
        public final ByteString getAuid() {
            ByteString auid = this._builder.getAuid();
            p.d(auid, "_builder.getAuid()");
            return auid;
        }

        @JvmName(name = "getAuidString")
        @NotNull
        public final String getAuidString() {
            String auidString = this._builder.getAuidString();
            p.d(auidString, "_builder.getAuidString()");
            return auidString;
        }

        @JvmName(name = "getCache")
        @NotNull
        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            p.d(cache, "_builder.getCache()");
            return cache;
        }

        @JvmName(name = "getClientInfo")
        @NotNull
        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            p.d(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
        }

        @JvmName(name = "getDeviceInfo")
        @NotNull
        public final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfo() {
            InitializationRequestOuterClass.InitializationDeviceInfo deviceInfo = this._builder.getDeviceInfo();
            p.d(deviceInfo, "_builder.getDeviceInfo()");
            return deviceInfo;
        }

        @JvmName(name = "getExternalUserIdentifier")
        @NotNull
        public final String getExternalUserIdentifier() {
            String externalUserIdentifier = this._builder.getExternalUserIdentifier();
            p.d(externalUserIdentifier, "_builder.getExternalUserIdentifier()");
            return externalUserIdentifier;
        }

        @JvmName(name = "getExtrasMap")
        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            p.d(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        @JvmName(name = "getIdfi")
        @NotNull
        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            p.d(idfi, "_builder.getIdfi()");
            return idfi;
        }

        @JvmName(name = "getIsFirstInit")
        public final boolean getIsFirstInit() {
            return this._builder.getIsFirstInit();
        }

        @JvmName(name = "getLegacyFlowUserConsent")
        @NotNull
        public final String getLegacyFlowUserConsent() {
            String legacyFlowUserConsent = this._builder.getLegacyFlowUserConsent();
            p.d(legacyFlowUserConsent, "_builder.getLegacyFlowUserConsent()");
            return legacyFlowUserConsent;
        }

        @JvmName(name = "getPrivacy")
        @NotNull
        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            p.d(privacy, "_builder.getPrivacy()");
            return privacy;
        }

        @JvmName(name = "getSessionId")
        @NotNull
        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            p.d(sessionId, "_builder.getSessionId()");
            return sessionId;
        }

        @JvmName(name = "getUadsInitBlob")
        @NotNull
        public final ByteString getUadsInitBlob() {
            ByteString uadsInitBlob = this._builder.getUadsInitBlob();
            p.d(uadsInitBlob, "_builder.getUadsInitBlob()");
            return uadsInitBlob;
        }

        @JvmName(name = "getUnityBuildGuid")
        @NotNull
        public final String getUnityBuildGuid() {
            String unityBuildGuid = this._builder.getUnityBuildGuid();
            p.d(unityBuildGuid, "_builder.getUnityBuildGuid()");
            return unityBuildGuid;
        }

        @JvmName(name = "getUnityInstallationId")
        @NotNull
        public final ByteString getUnityInstallationId() {
            ByteString unityInstallationId = this._builder.getUnityInstallationId();
            p.d(unityInstallationId, "_builder.getUnityInstallationId()");
            return unityInstallationId;
        }

        @JvmName(name = "getUnityMegaSessionId")
        @NotNull
        public final ByteString getUnityMegaSessionId() {
            ByteString unityMegaSessionId = this._builder.getUnityMegaSessionId();
            p.d(unityMegaSessionId, "_builder.getUnityMegaSessionId()");
            return unityMegaSessionId;
        }

        public final boolean hasAnalyticsUserId() {
            return this._builder.hasAnalyticsUserId();
        }

        public final boolean hasAuid() {
            return this._builder.hasAuid();
        }

        public final boolean hasAuidString() {
            return this._builder.hasAuidString();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDeviceInfo() {
            return this._builder.hasDeviceInfo();
        }

        public final boolean hasExternalUserIdentifier() {
            return this._builder.hasExternalUserIdentifier();
        }

        public final boolean hasLegacyFlowUserConsent() {
            return this._builder.hasLegacyFlowUserConsent();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasUadsInitBlob() {
            return this._builder.hasUadsInitBlob();
        }

        public final boolean hasUnityBuildGuid() {
            return this._builder.hasUnityBuildGuid();
        }

        public final boolean hasUnityInstallationId() {
            return this._builder.hasUnityInstallationId();
        }

        public final boolean hasUnityMegaSessionId() {
            return this._builder.hasUnityMegaSessionId();
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

        @JvmName(name = "setAnalyticsUserId")
        public final void setAnalyticsUserId(@NotNull String value) {
            p.e(value, "value");
            this._builder.setAnalyticsUserId(value);
        }

        @JvmName(name = "setAuid")
        public final void setAuid(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setAuid(value);
        }

        @JvmName(name = "setAuidString")
        public final void setAuidString(@NotNull String value) {
            p.e(value, "value");
            this._builder.setAuidString(value);
        }

        @JvmName(name = "setCache")
        public final void setCache(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setCache(value);
        }

        @JvmName(name = "setClientInfo")
        public final void setClientInfo(@NotNull ClientInfoOuterClass.ClientInfo value) {
            p.e(value, "value");
            this._builder.setClientInfo(value);
        }

        @JvmName(name = "setDeviceInfo")
        public final void setDeviceInfo(@NotNull InitializationRequestOuterClass.InitializationDeviceInfo value) {
            p.e(value, "value");
            this._builder.setDeviceInfo(value);
        }

        @JvmName(name = "setExternalUserIdentifier")
        public final void setExternalUserIdentifier(@NotNull String value) {
            p.e(value, "value");
            this._builder.setExternalUserIdentifier(value);
        }

        @JvmName(name = "setExtras")
        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            p.e(dslMap, "<this>");
            p.e(key, "key");
            p.e(value, "value");
            putExtras(dslMap, key, value);
        }

        @JvmName(name = "setIdfi")
        public final void setIdfi(@NotNull String value) {
            p.e(value, "value");
            this._builder.setIdfi(value);
        }

        @JvmName(name = "setIsFirstInit")
        public final void setIsFirstInit(boolean z10) {
            this._builder.setIsFirstInit(z10);
        }

        @JvmName(name = "setLegacyFlowUserConsent")
        public final void setLegacyFlowUserConsent(@NotNull String value) {
            p.e(value, "value");
            this._builder.setLegacyFlowUserConsent(value);
        }

        @JvmName(name = "setPrivacy")
        public final void setPrivacy(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setPrivacy(value);
        }

        @JvmName(name = "setSessionId")
        public final void setSessionId(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setSessionId(value);
        }

        @JvmName(name = "setUadsInitBlob")
        public final void setUadsInitBlob(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setUadsInitBlob(value);
        }

        @JvmName(name = "setUnityBuildGuid")
        public final void setUnityBuildGuid(@NotNull String value) {
            p.e(value, "value");
            this._builder.setUnityBuildGuid(value);
        }

        @JvmName(name = "setUnityInstallationId")
        public final void setUnityInstallationId(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setUnityInstallationId(value);
        }

        @JvmName(name = "setUnityMegaSessionId")
        public final void setUnityMegaSessionId(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setUnityMegaSessionId(value);
        }

        private Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationRequestKt() {
    }
}
