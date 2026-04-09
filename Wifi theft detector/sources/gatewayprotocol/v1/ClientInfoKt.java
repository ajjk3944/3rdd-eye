package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/ClientInfoKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientInfoKt {

    @NotNull
    public static final ClientInfoKt INSTANCE = new ClientInfoKt();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b(\b\u0007\u0018\u0000 l2\u00020\u0001:\u0001lB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0014J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u0014J\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u0014J\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\r\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u0014J\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u000bJ\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010\u0014J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJ\r\u0010\"\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010\u0014J\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u000bJ\r\u0010$\u001a\u00020\u0012¢\u0006\u0004\b$\u0010\u0014J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u000bJ\r\u0010&\u001a\u00020\u0012¢\u0006\u0004\b&\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R$\u0010.\u001a\u00020(2\u0006\u0010)\u001a\u00020(8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00104\u001a\u00020/2\u0006\u0010)\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00107\u001a\u00020/2\u0006\u0010)\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00101\"\u0004\b6\u00103R$\u0010;\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010:R$\u0010A\u001a\u00020<2\u0006\u0010)\u001a\u00020<8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010D\u001a\u00020(2\u0006\u0010)\u001a\u00020(8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010+\"\u0004\bC\u0010-R$\u0010J\u001a\u00020E2\u0006\u0010)\u001a\u00020E8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010M\u001a\u00020(2\u0006\u0010)\u001a\u00020(8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010+\"\u0004\bL\u0010-R$\u0010P\u001a\u00020/2\u0006\u0010)\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u00101\"\u0004\bO\u00103R$\u0010S\u001a\u00020/2\u0006\u0010)\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u00101\"\u0004\bR\u00103R$\u0010V\u001a\u00020/2\u0006\u0010)\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u00101\"\u0004\bU\u00103R$\u0010Y\u001a\u00020/2\u0006\u0010)\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u00101\"\u0004\bX\u00103R$\u0010\\\u001a\u00020/2\u0006\u0010)\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u00101\"\u0004\b[\u00103R$\u0010_\u001a\u00020/2\u0006\u0010)\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u00101\"\u0004\b^\u00103R$\u0010b\u001a\u00020/2\u0006\u0010)\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u00101\"\u0004\ba\u00103R$\u0010e\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010\u0014\"\u0004\bd\u0010:R$\u0010h\u001a\u00020/2\u0006\u0010)\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u00101\"\u0004\bg\u00103R$\u0010k\u001a\u00020/2\u0006\u0010)\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u00101\"\u0004\bj\u00103¨\u0006m"}, d2 = {"Lgatewayprotocol/v1/ClientInfoKt$Dsl;", "", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo$Builder;)V", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "_build", "()Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "Ly8/s;", "clearSdkVersion", "()V", "clearSdkVersionName", "clearGameId", "clearTest", "clearPlatform", "clearMediationProvider", "clearCustomMediationName", "", "hasCustomMediationName", "()Z", "clearMediationVersion", "hasMediationVersion", "clearOmidPartnerVersion", "hasOmidPartnerVersion", "clearOmidVersion", "hasOmidVersion", "clearSdkDevelopmentPlatform", "hasSdkDevelopmentPlatform", "clearScarVersionName", "hasScarVersionName", "clearOfferwallVersion", "hasOfferwallVersion", "clearIsFidAvailable", "hasIsFidAvailable", "clearMediationAdapterVersion", "hasMediationAdapterVersion", "clearAdQualitySdkVersion", "hasAdQualitySdkVersion", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo$Builder;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getSdkVersion", "()I", "setSdkVersion", "(I)V", "sdkVersion", "", "getSdkVersionName", "()Ljava/lang/String;", "setSdkVersionName", "(Ljava/lang/String;)V", "sdkVersionName", "getGameId", "setGameId", AndroidGetAdPlayerContext.KEY_GAME_ID, "getTest", "setTest", "(Z)V", "test", "Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;", "getPlatform", "()Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;", "setPlatform", "(Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;)V", "platform", "getPlatformValue", "setPlatformValue", "platformValue", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "getMediationProvider", "()Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "setMediationProvider", "(Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;)V", "mediationProvider", "getMediationProviderValue", "setMediationProviderValue", "mediationProviderValue", "getCustomMediationName", "setCustomMediationName", "customMediationName", "getMediationVersion", "setMediationVersion", "mediationVersion", "getOmidPartnerVersion", "setOmidPartnerVersion", "omidPartnerVersion", "getOmidVersion", "setOmidVersion", "omidVersion", "getSdkDevelopmentPlatform", "setSdkDevelopmentPlatform", "sdkDevelopmentPlatform", "getScarVersionName", "setScarVersionName", "scarVersionName", "getOfferwallVersion", "setOfferwallVersion", "offerwallVersion", "getIsFidAvailable", "setIsFidAvailable", "isFidAvailable", "getMediationAdapterVersion", "setMediationAdapterVersion", "mediationAdapterVersion", "getAdQualitySdkVersion", "setAdQualitySdkVersion", "adQualitySdkVersion", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final ClientInfoOuterClass.ClientInfo.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/ClientInfoKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/ClientInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(ClientInfoOuterClass.ClientInfo.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(ClientInfoOuterClass.ClientInfo.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ ClientInfoOuterClass.ClientInfo _build() {
            ClientInfoOuterClass.ClientInfo clientInfoBuild = this._builder.build();
            p.d(clientInfoBuild, "_builder.build()");
            return clientInfoBuild;
        }

        public final void clearAdQualitySdkVersion() {
            this._builder.clearAdQualitySdkVersion();
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearIsFidAvailable() {
            this._builder.clearIsFidAvailable();
        }

        public final void clearMediationAdapterVersion() {
            this._builder.clearMediationAdapterVersion();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOfferwallVersion() {
            this._builder.clearOfferwallVersion();
        }

        public final void clearOmidPartnerVersion() {
            this._builder.clearOmidPartnerVersion();
        }

        public final void clearOmidVersion() {
            this._builder.clearOmidVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearScarVersionName() {
            this._builder.clearScarVersionName();
        }

        public final void clearSdkDevelopmentPlatform() {
            this._builder.clearSdkDevelopmentPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearTest() {
            this._builder.clearTest();
        }

        @JvmName(name = "getAdQualitySdkVersion")
        @NotNull
        public final String getAdQualitySdkVersion() {
            String adQualitySdkVersion = this._builder.getAdQualitySdkVersion();
            p.d(adQualitySdkVersion, "_builder.getAdQualitySdkVersion()");
            return adQualitySdkVersion;
        }

        @JvmName(name = "getCustomMediationName")
        @NotNull
        public final String getCustomMediationName() {
            String customMediationName = this._builder.getCustomMediationName();
            p.d(customMediationName, "_builder.getCustomMediationName()");
            return customMediationName;
        }

        @JvmName(name = "getGameId")
        @NotNull
        public final String getGameId() {
            String gameId = this._builder.getGameId();
            p.d(gameId, "_builder.getGameId()");
            return gameId;
        }

        @JvmName(name = "getIsFidAvailable")
        public final boolean getIsFidAvailable() {
            return this._builder.getIsFidAvailable();
        }

        @JvmName(name = "getMediationAdapterVersion")
        @NotNull
        public final String getMediationAdapterVersion() {
            String mediationAdapterVersion = this._builder.getMediationAdapterVersion();
            p.d(mediationAdapterVersion, "_builder.getMediationAdapterVersion()");
            return mediationAdapterVersion;
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

        @JvmName(name = "getOfferwallVersion")
        @NotNull
        public final String getOfferwallVersion() {
            String offerwallVersion = this._builder.getOfferwallVersion();
            p.d(offerwallVersion, "_builder.getOfferwallVersion()");
            return offerwallVersion;
        }

        @JvmName(name = "getOmidPartnerVersion")
        @NotNull
        public final String getOmidPartnerVersion() {
            String omidPartnerVersion = this._builder.getOmidPartnerVersion();
            p.d(omidPartnerVersion, "_builder.getOmidPartnerVersion()");
            return omidPartnerVersion;
        }

        @JvmName(name = "getOmidVersion")
        @NotNull
        public final String getOmidVersion() {
            String omidVersion = this._builder.getOmidVersion();
            p.d(omidVersion, "_builder.getOmidVersion()");
            return omidVersion;
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

        @JvmName(name = "getScarVersionName")
        @NotNull
        public final String getScarVersionName() {
            String scarVersionName = this._builder.getScarVersionName();
            p.d(scarVersionName, "_builder.getScarVersionName()");
            return scarVersionName;
        }

        @JvmName(name = "getSdkDevelopmentPlatform")
        @NotNull
        public final String getSdkDevelopmentPlatform() {
            String sdkDevelopmentPlatform = this._builder.getSdkDevelopmentPlatform();
            p.d(sdkDevelopmentPlatform, "_builder.getSdkDevelopmentPlatform()");
            return sdkDevelopmentPlatform;
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

        @JvmName(name = "getTest")
        public final boolean getTest() {
            return this._builder.getTest();
        }

        public final boolean hasAdQualitySdkVersion() {
            return this._builder.hasAdQualitySdkVersion();
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasIsFidAvailable() {
            return this._builder.hasIsFidAvailable();
        }

        public final boolean hasMediationAdapterVersion() {
            return this._builder.hasMediationAdapterVersion();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasOfferwallVersion() {
            return this._builder.hasOfferwallVersion();
        }

        public final boolean hasOmidPartnerVersion() {
            return this._builder.hasOmidPartnerVersion();
        }

        public final boolean hasOmidVersion() {
            return this._builder.hasOmidVersion();
        }

        public final boolean hasScarVersionName() {
            return this._builder.hasScarVersionName();
        }

        public final boolean hasSdkDevelopmentPlatform() {
            return this._builder.hasSdkDevelopmentPlatform();
        }

        @JvmName(name = "setAdQualitySdkVersion")
        public final void setAdQualitySdkVersion(@NotNull String value) {
            p.e(value, "value");
            this._builder.setAdQualitySdkVersion(value);
        }

        @JvmName(name = "setCustomMediationName")
        public final void setCustomMediationName(@NotNull String value) {
            p.e(value, "value");
            this._builder.setCustomMediationName(value);
        }

        @JvmName(name = "setGameId")
        public final void setGameId(@NotNull String value) {
            p.e(value, "value");
            this._builder.setGameId(value);
        }

        @JvmName(name = "setIsFidAvailable")
        public final void setIsFidAvailable(boolean z10) {
            this._builder.setIsFidAvailable(z10);
        }

        @JvmName(name = "setMediationAdapterVersion")
        public final void setMediationAdapterVersion(@NotNull String value) {
            p.e(value, "value");
            this._builder.setMediationAdapterVersion(value);
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

        @JvmName(name = "setOfferwallVersion")
        public final void setOfferwallVersion(@NotNull String value) {
            p.e(value, "value");
            this._builder.setOfferwallVersion(value);
        }

        @JvmName(name = "setOmidPartnerVersion")
        public final void setOmidPartnerVersion(@NotNull String value) {
            p.e(value, "value");
            this._builder.setOmidPartnerVersion(value);
        }

        @JvmName(name = "setOmidVersion")
        public final void setOmidVersion(@NotNull String value) {
            p.e(value, "value");
            this._builder.setOmidVersion(value);
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

        @JvmName(name = "setScarVersionName")
        public final void setScarVersionName(@NotNull String value) {
            p.e(value, "value");
            this._builder.setScarVersionName(value);
        }

        @JvmName(name = "setSdkDevelopmentPlatform")
        public final void setSdkDevelopmentPlatform(@NotNull String value) {
            p.e(value, "value");
            this._builder.setSdkDevelopmentPlatform(value);
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

        @JvmName(name = "setTest")
        public final void setTest(boolean z10) {
            this._builder.setTest(z10);
        }

        private Dsl(ClientInfoOuterClass.ClientInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private ClientInfoKt() {
    }
}
