package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/LimitedSessionTokenKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LimitedSessionTokenKt {

    @NotNull
    public static final LimitedSessionTokenKt INSTANCE = new LimitedSessionTokenKt();

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 W2\u00020\u0001:\u0001WB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000bJ\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u000bJ\r\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010&\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R$\u0010)\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R$\u0010,\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R$\u00102\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00105\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R$\u00108\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010 \"\u0004\b7\u0010\"R$\u0010>\u001a\u0002092\u0006\u0010\u001e\u001a\u0002098G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010A\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010/\"\u0004\b@\u00101R$\u0010G\u001a\u00020B2\u0006\u0010\u001e\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010J\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010/\"\u0004\bI\u00101R$\u0010M\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010 \"\u0004\bL\u0010\"R$\u0010P\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010 \"\u0004\bO\u0010\"R$\u0010V\u001a\u00020Q2\u0006\u0010\u001e\u001a\u00020Q8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lgatewayprotocol/v1/LimitedSessionTokenKt$Dsl;", "", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken$Builder;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "_build", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "Ly8/s;", "clearDeviceMake", "()V", "clearDeviceModel", "clearOsVersion", "clearIdfi", "clearSdkVersion", "clearSdkVersionName", "clearGameId", "clearPlatform", "clearMediationProvider", "clearCustomMediationName", "", "hasCustomMediationName", "()Z", "clearMediationVersion", "hasMediationVersion", "clearSessionId", "hasSessionId", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken$Builder;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getDeviceMake", "()Ljava/lang/String;", "setDeviceMake", "(Ljava/lang/String;)V", "deviceMake", "getDeviceModel", "setDeviceModel", "deviceModel", "getOsVersion", "setOsVersion", "osVersion", "getIdfi", "setIdfi", ScarConstants.IDFI_KEY, "", "getSdkVersion", "()I", "setSdkVersion", "(I)V", "sdkVersion", "getSdkVersionName", "setSdkVersionName", "sdkVersionName", "getGameId", "setGameId", AndroidGetAdPlayerContext.KEY_GAME_ID, "Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;", "getPlatform", "()Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;", "setPlatform", "(Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;)V", "platform", "getPlatformValue", "setPlatformValue", "platformValue", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "getMediationProvider", "()Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "setMediationProvider", "(Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;)V", "mediationProvider", "getMediationProviderValue", "setMediationProviderValue", "mediationProviderValue", "getCustomMediationName", "setCustomMediationName", "customMediationName", "getMediationVersion", "setMediationVersion", "mediationVersion", "Lcom/google/protobuf/ByteString;", "getSessionId", "()Lcom/google/protobuf/ByteString;", "setSessionId", "(Lcom/google/protobuf/ByteString;)V", JsonStorageKeyNames.SESSION_ID_KEY, "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final UniversalRequestOuterClass.LimitedSessionToken.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/LimitedSessionTokenKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/LimitedSessionTokenKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(UniversalRequestOuterClass.LimitedSessionToken.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ UniversalRequestOuterClass.LimitedSessionToken _build() {
            UniversalRequestOuterClass.LimitedSessionToken limitedSessionTokenBuild = this._builder.build();
            p.d(limitedSessionTokenBuild, "_builder.build()");
            return limitedSessionTokenBuild;
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        @JvmName(name = "getCustomMediationName")
        @NotNull
        public final String getCustomMediationName() {
            String customMediationName = this._builder.getCustomMediationName();
            p.d(customMediationName, "_builder.getCustomMediationName()");
            return customMediationName;
        }

        @JvmName(name = "getDeviceMake")
        @NotNull
        public final String getDeviceMake() {
            String deviceMake = this._builder.getDeviceMake();
            p.d(deviceMake, "_builder.getDeviceMake()");
            return deviceMake;
        }

        @JvmName(name = "getDeviceModel")
        @NotNull
        public final String getDeviceModel() {
            String deviceModel = this._builder.getDeviceModel();
            p.d(deviceModel, "_builder.getDeviceModel()");
            return deviceModel;
        }

        @JvmName(name = "getGameId")
        @NotNull
        public final String getGameId() {
            String gameId = this._builder.getGameId();
            p.d(gameId, "_builder.getGameId()");
            return gameId;
        }

        @JvmName(name = "getIdfi")
        @NotNull
        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            p.d(idfi, "_builder.getIdfi()");
            return idfi;
        }

        @JvmName(name = "getMediationProvider")
        @NotNull
        public final ClientInfoOuterClass.MediationProvider getMediationProvider() {
            ClientInfoOuterClass.MediationProvider mediationProvider = this._builder.getMediationProvider();
            p.d(mediationProvider, "_builder.getMediationProvider()");
            return mediationProvider;
        }

        @JvmName(name = "getMediationProviderValue")
        public final int getMediationProviderValue() {
            return this._builder.getMediationProviderValue();
        }

        @JvmName(name = "getMediationVersion")
        @NotNull
        public final String getMediationVersion() {
            String mediationVersion = this._builder.getMediationVersion();
            p.d(mediationVersion, "_builder.getMediationVersion()");
            return mediationVersion;
        }

        @JvmName(name = "getOsVersion")
        @NotNull
        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            p.d(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        @JvmName(name = "getPlatform")
        @NotNull
        public final ClientInfoOuterClass.Platform getPlatform() {
            ClientInfoOuterClass.Platform platform = this._builder.getPlatform();
            p.d(platform, "_builder.getPlatform()");
            return platform;
        }

        @JvmName(name = "getPlatformValue")
        public final int getPlatformValue() {
            return this._builder.getPlatformValue();
        }

        @JvmName(name = "getSdkVersion")
        public final int getSdkVersion() {
            return this._builder.getSdkVersion();
        }

        @JvmName(name = "getSdkVersionName")
        @NotNull
        public final String getSdkVersionName() {
            String sdkVersionName = this._builder.getSdkVersionName();
            p.d(sdkVersionName, "_builder.getSdkVersionName()");
            return sdkVersionName;
        }

        @JvmName(name = "getSessionId")
        @NotNull
        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            p.d(sessionId, "_builder.getSessionId()");
            return sessionId;
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasSessionId() {
            return this._builder.hasSessionId();
        }

        @JvmName(name = "setCustomMediationName")
        public final void setCustomMediationName(@NotNull String value) {
            p.e(value, "value");
            this._builder.setCustomMediationName(value);
        }

        @JvmName(name = "setDeviceMake")
        public final void setDeviceMake(@NotNull String value) {
            p.e(value, "value");
            this._builder.setDeviceMake(value);
        }

        @JvmName(name = "setDeviceModel")
        public final void setDeviceModel(@NotNull String value) {
            p.e(value, "value");
            this._builder.setDeviceModel(value);
        }

        @JvmName(name = "setGameId")
        public final void setGameId(@NotNull String value) {
            p.e(value, "value");
            this._builder.setGameId(value);
        }

        @JvmName(name = "setIdfi")
        public final void setIdfi(@NotNull String value) {
            p.e(value, "value");
            this._builder.setIdfi(value);
        }

        @JvmName(name = "setMediationProvider")
        public final void setMediationProvider(@NotNull ClientInfoOuterClass.MediationProvider value) {
            p.e(value, "value");
            this._builder.setMediationProvider(value);
        }

        @JvmName(name = "setMediationProviderValue")
        public final void setMediationProviderValue(int i10) {
            this._builder.setMediationProviderValue(i10);
        }

        @JvmName(name = "setMediationVersion")
        public final void setMediationVersion(@NotNull String value) {
            p.e(value, "value");
            this._builder.setMediationVersion(value);
        }

        @JvmName(name = "setOsVersion")
        public final void setOsVersion(@NotNull String value) {
            p.e(value, "value");
            this._builder.setOsVersion(value);
        }

        @JvmName(name = "setPlatform")
        public final void setPlatform(@NotNull ClientInfoOuterClass.Platform value) {
            p.e(value, "value");
            this._builder.setPlatform(value);
        }

        @JvmName(name = "setPlatformValue")
        public final void setPlatformValue(int i10) {
            this._builder.setPlatformValue(i10);
        }

        @JvmName(name = "setSdkVersion")
        public final void setSdkVersion(int i10) {
            this._builder.setSdkVersion(i10);
        }

        @JvmName(name = "setSdkVersionName")
        public final void setSdkVersionName(@NotNull String value) {
            p.e(value, "value");
            this._builder.setSdkVersionName(value);
        }

        @JvmName(name = "setSessionId")
        public final void setSessionId(@NotNull ByteString value) {
            p.e(value, "value");
            this._builder.setSessionId(value);
        }

        private Dsl(UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
            this._builder = builder;
        }
    }

    private LimitedSessionTokenKt() {
    }
}
