package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/MediationInfoKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MediationInfoKt {

    @NotNull
    public static final MediationInfoKt INSTANCE = new MediationInfoKt();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010*\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010-\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&¨\u0006/"}, d2 = {"Lgatewayprotocol/v1/MediationInfoKt$Dsl;", "", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo$Builder;)V", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "_build", "()Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "Ly8/s;", "clearProvider", "()V", "clearCustomName", "", "hasCustomName", "()Z", "clearVersion", "hasVersion", "clearAdapterVersion", "hasAdapterVersion", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo$Builder;", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getProvider", "()Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "setProvider", "(Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;)V", "provider", "", "getProviderValue", "()I", "setProviderValue", "(I)V", "providerValue", "", "getCustomName", "()Ljava/lang/String;", "setCustomName", "(Ljava/lang/String;)V", "customName", MobileAdsBridge.versionMethodName, "setVersion", "version", "getAdapterVersion", "setAdapterVersion", "adapterVersion", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final MediationInfoOuterClass.MediationInfo.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/MediationInfoKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/MediationInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(MediationInfoOuterClass.MediationInfo.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(MediationInfoOuterClass.MediationInfo.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ MediationInfoOuterClass.MediationInfo _build() {
            MediationInfoOuterClass.MediationInfo mediationInfoBuild = this._builder.build();
            p.d(mediationInfoBuild, "_builder.build()");
            return mediationInfoBuild;
        }

        public final void clearAdapterVersion() {
            this._builder.clearAdapterVersion();
        }

        public final void clearCustomName() {
            this._builder.clearCustomName();
        }

        public final void clearProvider() {
            this._builder.clearProvider();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        @JvmName(name = "getAdapterVersion")
        @NotNull
        public final String getAdapterVersion() {
            String adapterVersion = this._builder.getAdapterVersion();
            p.d(adapterVersion, "_builder.getAdapterVersion()");
            return adapterVersion;
        }

        @JvmName(name = "getCustomName")
        @NotNull
        public final String getCustomName() {
            String customName = this._builder.getCustomName();
            p.d(customName, "_builder.getCustomName()");
            return customName;
        }

        @JvmName(name = "getProvider")
        @NotNull
        public final ClientInfoOuterClass.MediationProvider getProvider() {
            ClientInfoOuterClass.MediationProvider provider = this._builder.getProvider();
            p.d(provider, "_builder.getProvider()");
            return provider;
        }

        @JvmName(name = "getProviderValue")
        public final int getProviderValue() {
            return this._builder.getProviderValue();
        }

        @JvmName(name = MobileAdsBridge.versionMethodName)
        @NotNull
        public final String getVersion() {
            String version = this._builder.getVersion();
            p.d(version, "_builder.getVersion()");
            return version;
        }

        public final boolean hasAdapterVersion() {
            return this._builder.hasAdapterVersion();
        }

        public final boolean hasCustomName() {
            return this._builder.hasCustomName();
        }

        public final boolean hasVersion() {
            return this._builder.hasVersion();
        }

        @JvmName(name = "setAdapterVersion")
        public final void setAdapterVersion(@NotNull String value) {
            p.e(value, "value");
            this._builder.setAdapterVersion(value);
        }

        @JvmName(name = "setCustomName")
        public final void setCustomName(@NotNull String value) {
            p.e(value, "value");
            this._builder.setCustomName(value);
        }

        @JvmName(name = "setProvider")
        public final void setProvider(@NotNull ClientInfoOuterClass.MediationProvider value) {
            p.e(value, "value");
            this._builder.setProvider(value);
        }

        @JvmName(name = "setProviderValue")
        public final void setProviderValue(int i10) {
            this._builder.setProviderValue(i10);
        }

        @JvmName(name = "setVersion")
        public final void setVersion(@NotNull String value) {
            p.e(value, "value");
            this._builder.setVersion(value);
        }

        private Dsl(MediationInfoOuterClass.MediationInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private MediationInfoKt() {
    }
}
