package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import l9.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\f\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0011\u001a\u00020\u000e2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt;", "", "<init>", "()V", "Lkotlin/Function1;", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "Ly8/s;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "-initializeandroid", "(Ll9/l;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "android", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "-initializeios", "(Ll9/l;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "ios", "AndroidKt", "Dsl", "IosKt", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDynamicDeviceInfoKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicDeviceInfoKt.kt\ngatewayprotocol/v1/DynamicDeviceInfoKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1641:1\n1#2:1642\n*E\n"})
/* loaded from: classes4.dex */
public final class DynamicDeviceInfoKt {

    @NotNull
    public static final DynamicDeviceInfoKt INSTANCE = new DynamicDeviceInfoKt();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AndroidKt {

        @NotNull
        public static final AndroidKt INSTANCE = new AndroidKt();

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 q2\u00020\u0001:\u0001qB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u000bJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010\u000eJ\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJ\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u000bJ\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u000eJ\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u000bJ\r\u0010&\u001a\u00020\f¢\u0006\u0004\b&\u0010\u000eJ\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010\u000bJ\r\u0010(\u001a\u00020\f¢\u0006\u0004\b(\u0010\u000eJ\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010\u000bJ\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010\u000eJ\r\u0010+\u001a\u00020\t¢\u0006\u0004\b+\u0010\u000bJ\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010\u000eJ\r\u0010-\u001a\u00020\t¢\u0006\u0004\b-\u0010\u000bJ\r\u0010.\u001a\u00020\f¢\u0006\u0004\b.\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R$\u00104\u001a\u00020\f2\u0006\u00100\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u000e\"\u0004\b2\u00103R$\u0010:\u001a\u0002052\u0006\u00100\u001a\u0002058G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010=\u001a\u00020\f2\u0006\u00100\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\u000e\"\u0004\b<\u00103R$\u0010@\u001a\u0002052\u0006\u00100\u001a\u0002058G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u00107\"\u0004\b?\u00109R$\u0010C\u001a\u00020\f2\u0006\u00100\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010\u000e\"\u0004\bB\u00103R$\u0010F\u001a\u00020\f2\u0006\u00100\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010\u000e\"\u0004\bE\u00103R$\u0010L\u001a\u00020G2\u0006\u00100\u001a\u00020G8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010O\u001a\u00020G2\u0006\u00100\u001a\u00020G8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010I\"\u0004\bN\u0010KR$\u0010U\u001a\u00020P2\u0006\u00100\u001a\u00020P8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010X\u001a\u00020P2\u0006\u00100\u001a\u00020P8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010R\"\u0004\bW\u0010TR$\u0010[\u001a\u00020\f2\u0006\u00100\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010\u000e\"\u0004\bZ\u00103R$\u0010^\u001a\u00020\f2\u0006\u00100\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010\u000e\"\u0004\b]\u00103R$\u0010a\u001a\u00020\f2\u0006\u00100\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010\u000e\"\u0004\b`\u00103R$\u0010g\u001a\u00020b2\u0006\u00100\u001a\u00020b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010j\u001a\u0002052\u0006\u00100\u001a\u0002058G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u00107\"\u0004\bi\u00109R$\u0010m\u001a\u00020P2\u0006\u00100\u001a\u00020P8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010R\"\u0004\bl\u0010TR$\u0010p\u001a\u00020G2\u0006\u00100\u001a\u00020G8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010I\"\u0004\bo\u0010K¨\u0006r"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;)V", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "_build", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "Ly8/s;", "clearNetworkConnected", "()V", "", "hasNetworkConnected", "()Z", "clearNetworkType", "hasNetworkType", "clearNetworkMetered", "hasNetworkMetered", "clearTelephonyManagerNetworkType", "hasTelephonyManagerNetworkType", "clearAdbEnabled", "hasAdbEnabled", "clearUsbConnected", "hasUsbConnected", "clearVolume", "hasVolume", "clearMaxVolume", "hasMaxVolume", "clearDeviceUpTime", "hasDeviceUpTime", "clearDeviceElapsedRealtime", "hasDeviceElapsedRealtime", "clearAirplaneMode", "hasAirplaneMode", "clearStayOnWhilePluggedIn", "hasStayOnWhilePluggedIn", "clearSdCardPresent", "hasSdCardPresent", "clearNetworkCapabilityTransports", "hasNetworkCapabilityTransports", "clearChargingType", "hasChargingType", "clearFreeDiskSpaceInternal", "hasFreeDiskSpaceInternal", "clearScreenBrightness", "hasScreenBrightness", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getNetworkConnected", "setNetworkConnected", "(Z)V", "networkConnected", "", "getNetworkType", "()I", "setNetworkType", "(I)V", "networkType", "getNetworkMetered", "setNetworkMetered", "networkMetered", "getTelephonyManagerNetworkType", "setTelephonyManagerNetworkType", "telephonyManagerNetworkType", "getAdbEnabled", "setAdbEnabled", "adbEnabled", "getUsbConnected", "setUsbConnected", "usbConnected", "", "getVolume", "()D", "setVolume", "(D)V", "volume", "getMaxVolume", "setMaxVolume", "maxVolume", "", "getDeviceUpTime", "()J", "setDeviceUpTime", "(J)V", "deviceUpTime", "getDeviceElapsedRealtime", "setDeviceElapsedRealtime", "deviceElapsedRealtime", "getAirplaneMode", "setAirplaneMode", "airplaneMode", "getStayOnWhilePluggedIn", "setStayOnWhilePluggedIn", "stayOnWhilePluggedIn", "getSdCardPresent", "setSdCardPresent", "sdCardPresent", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "getNetworkCapabilityTransports", "()Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "setNetworkCapabilityTransports", "(Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;)V", "networkCapabilityTransports", "getChargingType", "setChargingType", "chargingType", "getFreeDiskSpaceInternal", "setFreeDiskSpaceInternal", "freeDiskSpaceInternal", "getScreenBrightness", "setScreenBrightness", "screenBrightness", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @ProtoDslMarker
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder _builder;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$AndroidKt$Dsl;", "builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(i iVar) {
                    this();
                }

                @PublishedApi
                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                    p.e(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder, i iVar) {
                this(builder);
            }

            @PublishedApi
            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android _build() {
                DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android androidBuild = this._builder.build();
                p.d(androidBuild, "_builder.build()");
                return androidBuild;
            }

            public final void clearAdbEnabled() {
                this._builder.clearAdbEnabled();
            }

            public final void clearAirplaneMode() {
                this._builder.clearAirplaneMode();
            }

            public final void clearChargingType() {
                this._builder.clearChargingType();
            }

            public final void clearDeviceElapsedRealtime() {
                this._builder.clearDeviceElapsedRealtime();
            }

            public final void clearDeviceUpTime() {
                this._builder.clearDeviceUpTime();
            }

            public final void clearFreeDiskSpaceInternal() {
                this._builder.clearFreeDiskSpaceInternal();
            }

            public final void clearMaxVolume() {
                this._builder.clearMaxVolume();
            }

            public final void clearNetworkCapabilityTransports() {
                this._builder.clearNetworkCapabilityTransports();
            }

            public final void clearNetworkConnected() {
                this._builder.clearNetworkConnected();
            }

            public final void clearNetworkMetered() {
                this._builder.clearNetworkMetered();
            }

            public final void clearNetworkType() {
                this._builder.clearNetworkType();
            }

            public final void clearScreenBrightness() {
                this._builder.clearScreenBrightness();
            }

            public final void clearSdCardPresent() {
                this._builder.clearSdCardPresent();
            }

            public final void clearStayOnWhilePluggedIn() {
                this._builder.clearStayOnWhilePluggedIn();
            }

            public final void clearTelephonyManagerNetworkType() {
                this._builder.clearTelephonyManagerNetworkType();
            }

            public final void clearUsbConnected() {
                this._builder.clearUsbConnected();
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            @JvmName(name = "getAdbEnabled")
            public final boolean getAdbEnabled() {
                return this._builder.getAdbEnabled();
            }

            @JvmName(name = "getAirplaneMode")
            public final boolean getAirplaneMode() {
                return this._builder.getAirplaneMode();
            }

            @JvmName(name = "getChargingType")
            public final int getChargingType() {
                return this._builder.getChargingType();
            }

            @JvmName(name = "getDeviceElapsedRealtime")
            public final long getDeviceElapsedRealtime() {
                return this._builder.getDeviceElapsedRealtime();
            }

            @JvmName(name = "getDeviceUpTime")
            public final long getDeviceUpTime() {
                return this._builder.getDeviceUpTime();
            }

            @JvmName(name = "getFreeDiskSpaceInternal")
            public final long getFreeDiskSpaceInternal() {
                return this._builder.getFreeDiskSpaceInternal();
            }

            @JvmName(name = "getMaxVolume")
            public final double getMaxVolume() {
                return this._builder.getMaxVolume();
            }

            @JvmName(name = "getNetworkCapabilityTransports")
            @NotNull
            public final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
                NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransports = this._builder.getNetworkCapabilityTransports();
                p.d(networkCapabilityTransports, "_builder.getNetworkCapabilityTransports()");
                return networkCapabilityTransports;
            }

            @JvmName(name = "getNetworkConnected")
            public final boolean getNetworkConnected() {
                return this._builder.getNetworkConnected();
            }

            @JvmName(name = "getNetworkMetered")
            public final boolean getNetworkMetered() {
                return this._builder.getNetworkMetered();
            }

            @JvmName(name = "getNetworkType")
            public final int getNetworkType() {
                return this._builder.getNetworkType();
            }

            @JvmName(name = "getScreenBrightness")
            public final double getScreenBrightness() {
                return this._builder.getScreenBrightness();
            }

            @JvmName(name = "getSdCardPresent")
            public final boolean getSdCardPresent() {
                return this._builder.getSdCardPresent();
            }

            @JvmName(name = "getStayOnWhilePluggedIn")
            public final boolean getStayOnWhilePluggedIn() {
                return this._builder.getStayOnWhilePluggedIn();
            }

            @JvmName(name = "getTelephonyManagerNetworkType")
            public final int getTelephonyManagerNetworkType() {
                return this._builder.getTelephonyManagerNetworkType();
            }

            @JvmName(name = "getUsbConnected")
            public final boolean getUsbConnected() {
                return this._builder.getUsbConnected();
            }

            @JvmName(name = "getVolume")
            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final boolean hasAdbEnabled() {
                return this._builder.hasAdbEnabled();
            }

            public final boolean hasAirplaneMode() {
                return this._builder.hasAirplaneMode();
            }

            public final boolean hasChargingType() {
                return this._builder.hasChargingType();
            }

            public final boolean hasDeviceElapsedRealtime() {
                return this._builder.hasDeviceElapsedRealtime();
            }

            public final boolean hasDeviceUpTime() {
                return this._builder.hasDeviceUpTime();
            }

            public final boolean hasFreeDiskSpaceInternal() {
                return this._builder.hasFreeDiskSpaceInternal();
            }

            public final boolean hasMaxVolume() {
                return this._builder.hasMaxVolume();
            }

            public final boolean hasNetworkCapabilityTransports() {
                return this._builder.hasNetworkCapabilityTransports();
            }

            public final boolean hasNetworkConnected() {
                return this._builder.hasNetworkConnected();
            }

            public final boolean hasNetworkMetered() {
                return this._builder.hasNetworkMetered();
            }

            public final boolean hasNetworkType() {
                return this._builder.hasNetworkType();
            }

            public final boolean hasScreenBrightness() {
                return this._builder.hasScreenBrightness();
            }

            public final boolean hasSdCardPresent() {
                return this._builder.hasSdCardPresent();
            }

            public final boolean hasStayOnWhilePluggedIn() {
                return this._builder.hasStayOnWhilePluggedIn();
            }

            public final boolean hasTelephonyManagerNetworkType() {
                return this._builder.hasTelephonyManagerNetworkType();
            }

            public final boolean hasUsbConnected() {
                return this._builder.hasUsbConnected();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            @JvmName(name = "setAdbEnabled")
            public final void setAdbEnabled(boolean z10) {
                this._builder.setAdbEnabled(z10);
            }

            @JvmName(name = "setAirplaneMode")
            public final void setAirplaneMode(boolean z10) {
                this._builder.setAirplaneMode(z10);
            }

            @JvmName(name = "setChargingType")
            public final void setChargingType(int i10) {
                this._builder.setChargingType(i10);
            }

            @JvmName(name = "setDeviceElapsedRealtime")
            public final void setDeviceElapsedRealtime(long j10) {
                this._builder.setDeviceElapsedRealtime(j10);
            }

            @JvmName(name = "setDeviceUpTime")
            public final void setDeviceUpTime(long j10) {
                this._builder.setDeviceUpTime(j10);
            }

            @JvmName(name = "setFreeDiskSpaceInternal")
            public final void setFreeDiskSpaceInternal(long j10) {
                this._builder.setFreeDiskSpaceInternal(j10);
            }

            @JvmName(name = "setMaxVolume")
            public final void setMaxVolume(double d10) {
                this._builder.setMaxVolume(d10);
            }

            @JvmName(name = "setNetworkCapabilityTransports")
            public final void setNetworkCapabilityTransports(@NotNull NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports value) {
                p.e(value, "value");
                this._builder.setNetworkCapabilityTransports(value);
            }

            @JvmName(name = "setNetworkConnected")
            public final void setNetworkConnected(boolean z10) {
                this._builder.setNetworkConnected(z10);
            }

            @JvmName(name = "setNetworkMetered")
            public final void setNetworkMetered(boolean z10) {
                this._builder.setNetworkMetered(z10);
            }

            @JvmName(name = "setNetworkType")
            public final void setNetworkType(int i10) {
                this._builder.setNetworkType(i10);
            }

            @JvmName(name = "setScreenBrightness")
            public final void setScreenBrightness(double d10) {
                this._builder.setScreenBrightness(d10);
            }

            @JvmName(name = "setSdCardPresent")
            public final void setSdCardPresent(boolean z10) {
                this._builder.setSdCardPresent(z10);
            }

            @JvmName(name = "setStayOnWhilePluggedIn")
            public final void setStayOnWhilePluggedIn(boolean z10) {
                this._builder.setStayOnWhilePluggedIn(z10);
            }

            @JvmName(name = "setTelephonyManagerNetworkType")
            public final void setTelephonyManagerNetworkType(int i10) {
                this._builder.setTelephonyManagerNetworkType(i10);
            }

            @JvmName(name = "setUsbConnected")
            public final void setUsbConnected(boolean z10) {
                this._builder.setUsbConnected(z10);
            }

            @JvmName(name = "setVolume")
            public final void setVolume(double d10) {
                this._builder.setVolume(d10);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }
        }

        private AndroidKt() {
        }
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0091\u00012\u00020\u0001:\u0002\u0091\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u000bJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010\u000eJ\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJ\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u000bJ\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u000eJ\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u000bJ\r\u0010&\u001a\u00020\f¢\u0006\u0004\b&\u0010\u000eJ\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010\u000bJ\r\u0010(\u001a\u00020\f¢\u0006\u0004\b(\u0010\u000eJ\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010\u000bJ\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010\u000eJ\r\u0010+\u001a\u00020\t¢\u0006\u0004\b+\u0010\u000bJ\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010\u000eJ\r\u0010-\u001a\u00020\t¢\u0006\u0004\b-\u0010\u000bJ\r\u0010.\u001a\u00020\f¢\u0006\u0004\b.\u0010\u000eJ\r\u0010/\u001a\u00020\t¢\u0006\u0004\b/\u0010\u000bJ\r\u00100\u001a\u00020\f¢\u0006\u0004\b0\u0010\u000eJ\r\u00101\u001a\u00020\t¢\u0006\u0004\b1\u0010\u000bJ\r\u00102\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u00020\t¢\u0006\u0004\b3\u0010\u000bJ\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u0010\u000eJ\r\u00105\u001a\u00020\t¢\u0006\u0004\b5\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R$\u0010=\u001a\u0002072\u0006\u00108\u001a\u0002078G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010@\u001a\u0002072\u0006\u00108\u001a\u0002078G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R$\u0010C\u001a\u0002072\u0006\u00108\u001a\u0002078G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010:\"\u0004\bB\u0010<R$\u0010I\u001a\u00020D2\u0006\u00108\u001a\u00020D8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010L\u001a\u00020D2\u0006\u00108\u001a\u00020D8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR$\u0010P\u001a\u00020\f2\u0006\u00108\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010\u000e\"\u0004\bN\u0010OR$\u0010S\u001a\u0002072\u0006\u00108\u001a\u0002078G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010:\"\u0004\bR\u0010<R$\u0010V\u001a\u00020D2\u0006\u00108\u001a\u00020D8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010F\"\u0004\bU\u0010HR$\u0010Y\u001a\u00020\f2\u0006\u00108\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010\u000e\"\u0004\bX\u0010OR$\u0010\\\u001a\u00020\f2\u0006\u00108\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010\u000e\"\u0004\b[\u0010OR$\u0010b\u001a\u00020]2\u0006\u00108\u001a\u00020]8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010h\u001a\u00020c2\u0006\u00108\u001a\u00020c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010n\u001a\u00020i2\u0006\u00108\u001a\u00020i8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010q\u001a\u00020c2\u0006\u00108\u001a\u00020c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010e\"\u0004\bp\u0010gR$\u0010t\u001a\u00020\f2\u0006\u00108\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010\u000e\"\u0004\bs\u0010OR$\u0010w\u001a\u00020\f2\u0006\u00108\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bu\u0010\u000e\"\u0004\bv\u0010OR$\u0010z\u001a\u0002072\u0006\u00108\u001a\u0002078G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bx\u0010:\"\u0004\by\u0010<R$\u0010}\u001a\u00020c2\u0006\u00108\u001a\u00020c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010e\"\u0004\b|\u0010gR%\u0010\u0080\u0001\u001a\u00020c2\u0006\u00108\u001a\u00020c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b~\u0010e\"\u0004\b\u007f\u0010gR+\u0010\u0086\u0001\u001a\u00030\u0081\u00012\u0007\u00108\u001a\u00030\u0081\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R+\u0010\u008c\u0001\u001a\u00030\u0087\u00012\u0007\u00108\u001a\u00030\u0087\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0015\u0010\u0090\u0001\u001a\u00030\u008d\u00018G¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0092\u0001"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$Dsl;", "", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;)V", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "_build", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "Ly8/s;", "clearLanguage", "()V", "", "hasLanguage", "()Z", "clearNetworkOperator", "hasNetworkOperator", "clearNetworkOperatorName", "hasNetworkOperatorName", "clearFreeDiskSpace", "hasFreeDiskSpace", "clearFreeRamMemory", "hasFreeRamMemory", "clearWiredHeadset", "hasWiredHeadset", "clearTimeZone", "hasTimeZone", "clearTimeZoneOffset", "hasTimeZoneOffset", "clearLimitedTracking", "hasLimitedTracking", "clearLimitedOpenAdTracking", "hasLimitedOpenAdTracking", "clearBatteryLevel", "hasBatteryLevel", "clearBatteryStatus", "hasBatteryStatus", "clearConnectionType", "hasConnectionType", "clearAppActive", "hasAppActive", "clearLowPowerMode", "hasLowPowerMode", "clearUserId", "hasUserId", "clearScreenWidth", "hasScreenWidth", "clearScreenHeight", "hasScreenHeight", "clearAndroid", "hasAndroid", "clearIos", "hasIos", "clearPlatformSpecific", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "language", "getNetworkOperator", "setNetworkOperator", "networkOperator", "getNetworkOperatorName", "setNetworkOperatorName", "networkOperatorName", "", "getFreeDiskSpace", "()J", "setFreeDiskSpace", "(J)V", "freeDiskSpace", "getFreeRamMemory", "setFreeRamMemory", "freeRamMemory", "getWiredHeadset", "setWiredHeadset", "(Z)V", "wiredHeadset", "getTimeZone", "setTimeZone", "timeZone", "getTimeZoneOffset", "setTimeZoneOffset", "timeZoneOffset", "getLimitedTracking", "setLimitedTracking", "limitedTracking", "getLimitedOpenAdTracking", "setLimitedOpenAdTracking", "limitedOpenAdTracking", "", "getBatteryLevel", "()D", "setBatteryLevel", "(D)V", "batteryLevel", "", "getBatteryStatus", "()I", "setBatteryStatus", "(I)V", "batteryStatus", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "getConnectionType", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "setConnectionType", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;)V", "connectionType", "getConnectionTypeValue", "setConnectionTypeValue", "connectionTypeValue", "getAppActive", "setAppActive", "appActive", "getLowPowerMode", "setLowPowerMode", "lowPowerMode", "getUserId", "setUserId", "userId", "getScreenWidth", "setScreenWidth", "screenWidth", "getScreenHeight", "setScreenHeight", "screenHeight", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "getAndroid", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "setAndroid", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;)V", "android", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "getIos", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "setIos", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;)V", "ios", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase;", "getPlatformSpecificCase", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase;", "platformSpecificCase", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo _build() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfoBuild = this._builder.build();
            p.d(dynamicDeviceInfoBuild, "_builder.build()");
            return dynamicDeviceInfoBuild;
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final void clearAppActive() {
            this._builder.clearAppActive();
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final void clearFreeDiskSpace() {
            this._builder.clearFreeDiskSpace();
        }

        public final void clearFreeRamMemory() {
            this._builder.clearFreeRamMemory();
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final void clearLimitedOpenAdTracking() {
            this._builder.clearLimitedOpenAdTracking();
        }

        public final void clearLimitedTracking() {
            this._builder.clearLimitedTracking();
        }

        public final void clearLowPowerMode() {
            this._builder.clearLowPowerMode();
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final void clearNetworkOperatorName() {
            this._builder.clearNetworkOperatorName();
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        public final void clearTimeZone() {
            this._builder.clearTimeZone();
        }

        public final void clearTimeZoneOffset() {
            this._builder.clearTimeZoneOffset();
        }

        public final void clearUserId() {
            this._builder.clearUserId();
        }

        public final void clearWiredHeadset() {
            this._builder.clearWiredHeadset();
        }

        @JvmName(name = "getAndroid")
        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroid() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2 = this._builder.getAndroid();
            p.d(android2, "_builder.getAndroid()");
            return android2;
        }

        @JvmName(name = "getAppActive")
        public final boolean getAppActive() {
            return this._builder.getAppActive();
        }

        @JvmName(name = "getBatteryLevel")
        public final double getBatteryLevel() {
            return this._builder.getBatteryLevel();
        }

        @JvmName(name = "getBatteryStatus")
        public final int getBatteryStatus() {
            return this._builder.getBatteryStatus();
        }

        @JvmName(name = "getConnectionType")
        @NotNull
        public final DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
            DynamicDeviceInfoOuterClass.ConnectionType connectionType = this._builder.getConnectionType();
            p.d(connectionType, "_builder.getConnectionType()");
            return connectionType;
        }

        @JvmName(name = "getConnectionTypeValue")
        public final int getConnectionTypeValue() {
            return this._builder.getConnectionTypeValue();
        }

        @JvmName(name = "getFreeDiskSpace")
        public final long getFreeDiskSpace() {
            return this._builder.getFreeDiskSpace();
        }

        @JvmName(name = "getFreeRamMemory")
        public final long getFreeRamMemory() {
            return this._builder.getFreeRamMemory();
        }

        @JvmName(name = "getIos")
        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIos() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios = this._builder.getIos();
            p.d(ios, "_builder.getIos()");
            return ios;
        }

        @JvmName(name = "getLanguage")
        @NotNull
        public final String getLanguage() {
            String language = this._builder.getLanguage();
            p.d(language, "_builder.getLanguage()");
            return language;
        }

        @JvmName(name = "getLimitedOpenAdTracking")
        public final boolean getLimitedOpenAdTracking() {
            return this._builder.getLimitedOpenAdTracking();
        }

        @JvmName(name = "getLimitedTracking")
        public final boolean getLimitedTracking() {
            return this._builder.getLimitedTracking();
        }

        @JvmName(name = "getLowPowerMode")
        public final boolean getLowPowerMode() {
            return this._builder.getLowPowerMode();
        }

        @JvmName(name = "getNetworkOperator")
        @NotNull
        public final String getNetworkOperator() {
            String networkOperator = this._builder.getNetworkOperator();
            p.d(networkOperator, "_builder.getNetworkOperator()");
            return networkOperator;
        }

        @JvmName(name = "getNetworkOperatorName")
        @NotNull
        public final String getNetworkOperatorName() {
            String networkOperatorName = this._builder.getNetworkOperatorName();
            p.d(networkOperatorName, "_builder.getNetworkOperatorName()");
            return networkOperatorName;
        }

        @JvmName(name = "getPlatformSpecificCase")
        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            p.d(platformSpecificCase, "_builder.getPlatformSpecificCase()");
            return platformSpecificCase;
        }

        @JvmName(name = "getScreenHeight")
        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        @JvmName(name = "getScreenWidth")
        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        @JvmName(name = "getTimeZone")
        @NotNull
        public final String getTimeZone() {
            String timeZone = this._builder.getTimeZone();
            p.d(timeZone, "_builder.getTimeZone()");
            return timeZone;
        }

        @JvmName(name = "getTimeZoneOffset")
        public final long getTimeZoneOffset() {
            return this._builder.getTimeZoneOffset();
        }

        @JvmName(name = "getUserId")
        @NotNull
        public final String getUserId() {
            String userId = this._builder.getUserId();
            p.d(userId, "_builder.getUserId()");
            return userId;
        }

        @JvmName(name = "getWiredHeadset")
        public final boolean getWiredHeadset() {
            return this._builder.getWiredHeadset();
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final boolean hasAppActive() {
            return this._builder.hasAppActive();
        }

        public final boolean hasBatteryLevel() {
            return this._builder.hasBatteryLevel();
        }

        public final boolean hasBatteryStatus() {
            return this._builder.hasBatteryStatus();
        }

        public final boolean hasConnectionType() {
            return this._builder.hasConnectionType();
        }

        public final boolean hasFreeDiskSpace() {
            return this._builder.hasFreeDiskSpace();
        }

        public final boolean hasFreeRamMemory() {
            return this._builder.hasFreeRamMemory();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final boolean hasLanguage() {
            return this._builder.hasLanguage();
        }

        public final boolean hasLimitedOpenAdTracking() {
            return this._builder.hasLimitedOpenAdTracking();
        }

        public final boolean hasLimitedTracking() {
            return this._builder.hasLimitedTracking();
        }

        public final boolean hasLowPowerMode() {
            return this._builder.hasLowPowerMode();
        }

        public final boolean hasNetworkOperator() {
            return this._builder.hasNetworkOperator();
        }

        public final boolean hasNetworkOperatorName() {
            return this._builder.hasNetworkOperatorName();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final boolean hasTimeZone() {
            return this._builder.hasTimeZone();
        }

        public final boolean hasTimeZoneOffset() {
            return this._builder.hasTimeZoneOffset();
        }

        public final boolean hasUserId() {
            return this._builder.hasUserId();
        }

        public final boolean hasWiredHeadset() {
            return this._builder.hasWiredHeadset();
        }

        @JvmName(name = "setAndroid")
        public final void setAndroid(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android value) {
            p.e(value, "value");
            this._builder.setAndroid(value);
        }

        @JvmName(name = "setAppActive")
        public final void setAppActive(boolean z10) {
            this._builder.setAppActive(z10);
        }

        @JvmName(name = "setBatteryLevel")
        public final void setBatteryLevel(double d10) {
            this._builder.setBatteryLevel(d10);
        }

        @JvmName(name = "setBatteryStatus")
        public final void setBatteryStatus(int i10) {
            this._builder.setBatteryStatus(i10);
        }

        @JvmName(name = "setConnectionType")
        public final void setConnectionType(@NotNull DynamicDeviceInfoOuterClass.ConnectionType value) {
            p.e(value, "value");
            this._builder.setConnectionType(value);
        }

        @JvmName(name = "setConnectionTypeValue")
        public final void setConnectionTypeValue(int i10) {
            this._builder.setConnectionTypeValue(i10);
        }

        @JvmName(name = "setFreeDiskSpace")
        public final void setFreeDiskSpace(long j10) {
            this._builder.setFreeDiskSpace(j10);
        }

        @JvmName(name = "setFreeRamMemory")
        public final void setFreeRamMemory(long j10) {
            this._builder.setFreeRamMemory(j10);
        }

        @JvmName(name = "setIos")
        public final void setIos(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios value) {
            p.e(value, "value");
            this._builder.setIos(value);
        }

        @JvmName(name = "setLanguage")
        public final void setLanguage(@NotNull String value) {
            p.e(value, "value");
            this._builder.setLanguage(value);
        }

        @JvmName(name = "setLimitedOpenAdTracking")
        public final void setLimitedOpenAdTracking(boolean z10) {
            this._builder.setLimitedOpenAdTracking(z10);
        }

        @JvmName(name = "setLimitedTracking")
        public final void setLimitedTracking(boolean z10) {
            this._builder.setLimitedTracking(z10);
        }

        @JvmName(name = "setLowPowerMode")
        public final void setLowPowerMode(boolean z10) {
            this._builder.setLowPowerMode(z10);
        }

        @JvmName(name = "setNetworkOperator")
        public final void setNetworkOperator(@NotNull String value) {
            p.e(value, "value");
            this._builder.setNetworkOperator(value);
        }

        @JvmName(name = "setNetworkOperatorName")
        public final void setNetworkOperatorName(@NotNull String value) {
            p.e(value, "value");
            this._builder.setNetworkOperatorName(value);
        }

        @JvmName(name = "setScreenHeight")
        public final void setScreenHeight(int i10) {
            this._builder.setScreenHeight(i10);
        }

        @JvmName(name = "setScreenWidth")
        public final void setScreenWidth(int i10) {
            this._builder.setScreenWidth(i10);
        }

        @JvmName(name = "setTimeZone")
        public final void setTimeZone(@NotNull String value) {
            p.e(value, "value");
            this._builder.setTimeZone(value);
        }

        @JvmName(name = "setTimeZoneOffset")
        public final void setTimeZoneOffset(long j10) {
            this._builder.setTimeZoneOffset(j10);
        }

        @JvmName(name = "setUserId")
        public final void setUserId(@NotNull String value) {
            p.e(value, "value");
            this._builder.setUserId(value);
        }

        @JvmName(name = "setWiredHeadset")
        public final void setWiredHeadset(boolean z10) {
            this._builder.setWiredHeadset(z10);
        }

        private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
            this._builder = builder;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IosKt {

        @NotNull
        public static final IosKt INSTANCE = new IosKt();

        @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000f\b\u0007\u0018\u0000 h2\u00020\u0001:\u0003hijB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ'\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0014\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0014\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b\u0018\u0010\u0016J-\u0010\u001e\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0087\n¢\u0006\u0004\b\u001f\u0010\u001dJ0\u0010$\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0012H\u0087\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b%\u0010&J'\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020(0\u00112\u0006\u0010\u0014\u001a\u00020\u0012H\u0007¢\u0006\u0004\b)\u0010\u0016J(\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020(0\u00112\u0006\u0010\u0014\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b*\u0010\u0016J-\u0010\u001e\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020(0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0007¢\u0006\u0004\b+\u0010\u001dJ.\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020(0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0087\n¢\u0006\u0004\b,\u0010\u001dJ0\u0010$\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020(0\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0012H\u0087\u0002¢\u0006\u0004\b-\u0010#J\u001f\u0010'\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020(0\u0011H\u0007¢\u0006\u0004\b.\u0010&J\r\u0010/\u001a\u00020\t¢\u0006\u0004\b/\u0010\u000bJ\r\u00100\u001a\u00020\f¢\u0006\u0004\b0\u0010\u000eJ\r\u00101\u001a\u00020\t¢\u0006\u0004\b1\u0010\u000bJ\r\u00102\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u00020\t¢\u0006\u0004\b3\u0010\u000bJ\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u0010\u000eJ\r\u00105\u001a\u00020\t¢\u0006\u0004\b5\u0010\u000bJ\r\u00106\u001a\u00020\f¢\u0006\u0004\b6\u0010\u000eJ\r\u00107\u001a\u00020\t¢\u0006\u0004\b7\u0010\u000bJ\r\u00108\u001a\u00020\f¢\u0006\u0004\b8\u0010\u000eJ\r\u00109\u001a\u00020\t¢\u0006\u0004\b9\u0010\u000bJ\r\u0010:\u001a\u00020\f¢\u0006\u0004\b:\u0010\u000eJ\r\u0010;\u001a\u00020\t¢\u0006\u0004\b;\u0010\u000bJ\r\u0010<\u001a\u00020\f¢\u0006\u0004\b<\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R$\u0010B\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010G\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001d\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001d\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020(0\u00118F¢\u0006\u0006\u001a\u0004\bK\u0010IR$\u0010O\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010D\"\u0004\bN\u0010FR$\u0010R\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010?\"\u0004\bQ\u0010AR$\u0010X\u001a\u00020S2\u0006\u0010\u0014\u001a\u00020S8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010[\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010D\"\u0004\bZ\u0010FR$\u0010a\u001a\u00020\\2\u0006\u0010\u0014\u001a\u00020\\8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010d\u001a\u00020\\2\u0006\u0010\u0014\u001a\u00020\\8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010^\"\u0004\bc\u0010`R$\u0010g\u001a\u00020S2\u0006\u0010\u0014\u001a\u00020S8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010U\"\u0004\bf\u0010W¨\u0006k"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;)V", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "_build", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios;", "Ly8/s;", "clearCurrentRadioAccessTechnology", "()V", "", "hasCurrentRadioAccessTechnology", "()Z", "clearNetworkReachabilityFlags", "hasNetworkReachabilityFlags", "Lcom/google/protobuf/kotlin/DslList;", "", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "addNwPathInterfaces", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "add", "plusAssignNwPathInterfaces", "plusAssign", "", "values", "addAllNwPathInterfaces", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllNwPathInterfaces", "", "index", "setNwPathInterfaces", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "set", "clearNwPathInterfaces", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy;", "addLocaleList", "plusAssignLocaleList", "addAllLocaleList", "plusAssignAllLocaleList", "setLocaleList", "clearLocaleList", "clearCurrentUiTheme", "hasCurrentUiTheme", "clearDeviceName", "hasDeviceName", "clearVolume", "hasVolume", "clearTrackingAuthStatus", "hasTrackingAuthStatus", "clearDeviceUpTimeWithSleep", "hasDeviceUpTimeWithSleep", "clearDeviceUpTimeWithoutSleep", "hasDeviceUpTimeWithoutSleep", "clearScreenBrightness", "hasScreenBrightness", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;", "getCurrentRadioAccessTechnology", "()Ljava/lang/String;", "setCurrentRadioAccessTechnology", "(Ljava/lang/String;)V", "currentRadioAccessTechnology", "getNetworkReachabilityFlags", "()I", "setNetworkReachabilityFlags", "(I)V", "networkReachabilityFlags", "getNwPathInterfaces", "()Lcom/google/protobuf/kotlin/DslList;", "nwPathInterfaces", "getLocaleList", "localeList", "getCurrentUiTheme", "setCurrentUiTheme", "currentUiTheme", "getDeviceName", "setDeviceName", "deviceName", "", "getVolume", "()D", "setVolume", "(D)V", "volume", "getTrackingAuthStatus", "setTrackingAuthStatus", "trackingAuthStatus", "", "getDeviceUpTimeWithSleep", "()J", "setDeviceUpTimeWithSleep", "(J)V", "deviceUpTimeWithSleep", "getDeviceUpTimeWithoutSleep", "setDeviceUpTimeWithoutSleep", "deviceUpTimeWithoutSleep", "getScreenBrightness", "setScreenBrightness", "screenBrightness", "Companion", "LocaleListProxy", "NwPathInterfacesProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @ProtoDslMarker
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder _builder;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl;", "builder", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(i iVar) {
                    this();
                }

                @PublishedApi
                public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                    p.e(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$LocaleListProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class LocaleListProxy extends DslProxy {
                private LocaleListProxy() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/DynamicDeviceInfoKt$IosKt$Dsl$NwPathInterfacesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class NwPathInterfacesProxy extends DslProxy {
                private NwPathInterfacesProxy() {
                }
            }

            public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder, i iVar) {
                this(builder);
            }

            @PublishedApi
            public final /* synthetic */ DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios _build() {
                DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios iosBuild = this._builder.build();
                p.d(iosBuild, "_builder.build()");
                return iosBuild;
            }

            @JvmName(name = "addAllLocaleList")
            public final /* synthetic */ void addAllLocaleList(DslList dslList, Iterable values) {
                p.e(dslList, "<this>");
                p.e(values, "values");
                this._builder.addAllLocaleList(values);
            }

            @JvmName(name = "addAllNwPathInterfaces")
            public final /* synthetic */ void addAllNwPathInterfaces(DslList dslList, Iterable values) {
                p.e(dslList, "<this>");
                p.e(values, "values");
                this._builder.addAllNwPathInterfaces(values);
            }

            @JvmName(name = "addLocaleList")
            public final /* synthetic */ void addLocaleList(DslList dslList, String value) {
                p.e(dslList, "<this>");
                p.e(value, "value");
                this._builder.addLocaleList(value);
            }

            @JvmName(name = "addNwPathInterfaces")
            public final /* synthetic */ void addNwPathInterfaces(DslList dslList, String value) {
                p.e(dslList, "<this>");
                p.e(value, "value");
                this._builder.addNwPathInterfaces(value);
            }

            public final void clearCurrentRadioAccessTechnology() {
                this._builder.clearCurrentRadioAccessTechnology();
            }

            public final void clearCurrentUiTheme() {
                this._builder.clearCurrentUiTheme();
            }

            public final void clearDeviceName() {
                this._builder.clearDeviceName();
            }

            public final void clearDeviceUpTimeWithSleep() {
                this._builder.clearDeviceUpTimeWithSleep();
            }

            public final void clearDeviceUpTimeWithoutSleep() {
                this._builder.clearDeviceUpTimeWithoutSleep();
            }

            @JvmName(name = "clearLocaleList")
            public final /* synthetic */ void clearLocaleList(DslList dslList) {
                p.e(dslList, "<this>");
                this._builder.clearLocaleList();
            }

            public final void clearNetworkReachabilityFlags() {
                this._builder.clearNetworkReachabilityFlags();
            }

            @JvmName(name = "clearNwPathInterfaces")
            public final /* synthetic */ void clearNwPathInterfaces(DslList dslList) {
                p.e(dslList, "<this>");
                this._builder.clearNwPathInterfaces();
            }

            public final void clearScreenBrightness() {
                this._builder.clearScreenBrightness();
            }

            public final void clearTrackingAuthStatus() {
                this._builder.clearTrackingAuthStatus();
            }

            public final void clearVolume() {
                this._builder.clearVolume();
            }

            @JvmName(name = "getCurrentRadioAccessTechnology")
            @NotNull
            public final String getCurrentRadioAccessTechnology() {
                String currentRadioAccessTechnology = this._builder.getCurrentRadioAccessTechnology();
                p.d(currentRadioAccessTechnology, "_builder.getCurrentRadioAccessTechnology()");
                return currentRadioAccessTechnology;
            }

            @JvmName(name = "getCurrentUiTheme")
            public final int getCurrentUiTheme() {
                return this._builder.getCurrentUiTheme();
            }

            @JvmName(name = "getDeviceName")
            @NotNull
            public final String getDeviceName() {
                String deviceName = this._builder.getDeviceName();
                p.d(deviceName, "_builder.getDeviceName()");
                return deviceName;
            }

            @JvmName(name = "getDeviceUpTimeWithSleep")
            public final long getDeviceUpTimeWithSleep() {
                return this._builder.getDeviceUpTimeWithSleep();
            }

            @JvmName(name = "getDeviceUpTimeWithoutSleep")
            public final long getDeviceUpTimeWithoutSleep() {
                return this._builder.getDeviceUpTimeWithoutSleep();
            }

            @NotNull
            public final DslList<String, LocaleListProxy> getLocaleList() {
                List<String> localeListList = this._builder.getLocaleListList();
                p.d(localeListList, "_builder.getLocaleListList()");
                return new DslList<>(localeListList);
            }

            @JvmName(name = "getNetworkReachabilityFlags")
            public final int getNetworkReachabilityFlags() {
                return this._builder.getNetworkReachabilityFlags();
            }

            @NotNull
            public final DslList<String, NwPathInterfacesProxy> getNwPathInterfaces() {
                List<String> nwPathInterfacesList = this._builder.getNwPathInterfacesList();
                p.d(nwPathInterfacesList, "_builder.getNwPathInterfacesList()");
                return new DslList<>(nwPathInterfacesList);
            }

            @JvmName(name = "getScreenBrightness")
            public final double getScreenBrightness() {
                return this._builder.getScreenBrightness();
            }

            @JvmName(name = "getTrackingAuthStatus")
            public final int getTrackingAuthStatus() {
                return this._builder.getTrackingAuthStatus();
            }

            @JvmName(name = "getVolume")
            public final double getVolume() {
                return this._builder.getVolume();
            }

            public final boolean hasCurrentRadioAccessTechnology() {
                return this._builder.hasCurrentRadioAccessTechnology();
            }

            public final boolean hasCurrentUiTheme() {
                return this._builder.hasCurrentUiTheme();
            }

            public final boolean hasDeviceName() {
                return this._builder.hasDeviceName();
            }

            public final boolean hasDeviceUpTimeWithSleep() {
                return this._builder.hasDeviceUpTimeWithSleep();
            }

            public final boolean hasDeviceUpTimeWithoutSleep() {
                return this._builder.hasDeviceUpTimeWithoutSleep();
            }

            public final boolean hasNetworkReachabilityFlags() {
                return this._builder.hasNetworkReachabilityFlags();
            }

            public final boolean hasScreenBrightness() {
                return this._builder.hasScreenBrightness();
            }

            public final boolean hasTrackingAuthStatus() {
                return this._builder.hasTrackingAuthStatus();
            }

            public final boolean hasVolume() {
                return this._builder.hasVolume();
            }

            @JvmName(name = "plusAssignAllLocaleList")
            public final /* synthetic */ void plusAssignAllLocaleList(DslList<String, LocaleListProxy> dslList, Iterable<String> values) {
                p.e(dslList, "<this>");
                p.e(values, "values");
                addAllLocaleList(dslList, values);
            }

            @JvmName(name = "plusAssignAllNwPathInterfaces")
            public final /* synthetic */ void plusAssignAllNwPathInterfaces(DslList<String, NwPathInterfacesProxy> dslList, Iterable<String> values) {
                p.e(dslList, "<this>");
                p.e(values, "values");
                addAllNwPathInterfaces(dslList, values);
            }

            @JvmName(name = "plusAssignLocaleList")
            public final /* synthetic */ void plusAssignLocaleList(DslList<String, LocaleListProxy> dslList, String value) {
                p.e(dslList, "<this>");
                p.e(value, "value");
                addLocaleList(dslList, value);
            }

            @JvmName(name = "plusAssignNwPathInterfaces")
            public final /* synthetic */ void plusAssignNwPathInterfaces(DslList<String, NwPathInterfacesProxy> dslList, String value) {
                p.e(dslList, "<this>");
                p.e(value, "value");
                addNwPathInterfaces(dslList, value);
            }

            @JvmName(name = "setCurrentRadioAccessTechnology")
            public final void setCurrentRadioAccessTechnology(@NotNull String value) {
                p.e(value, "value");
                this._builder.setCurrentRadioAccessTechnology(value);
            }

            @JvmName(name = "setCurrentUiTheme")
            public final void setCurrentUiTheme(int i10) {
                this._builder.setCurrentUiTheme(i10);
            }

            @JvmName(name = "setDeviceName")
            public final void setDeviceName(@NotNull String value) {
                p.e(value, "value");
                this._builder.setDeviceName(value);
            }

            @JvmName(name = "setDeviceUpTimeWithSleep")
            public final void setDeviceUpTimeWithSleep(long j10) {
                this._builder.setDeviceUpTimeWithSleep(j10);
            }

            @JvmName(name = "setDeviceUpTimeWithoutSleep")
            public final void setDeviceUpTimeWithoutSleep(long j10) {
                this._builder.setDeviceUpTimeWithoutSleep(j10);
            }

            @JvmName(name = "setLocaleList")
            public final /* synthetic */ void setLocaleList(DslList dslList, int i10, String value) {
                p.e(dslList, "<this>");
                p.e(value, "value");
                this._builder.setLocaleList(i10, value);
            }

            @JvmName(name = "setNetworkReachabilityFlags")
            public final void setNetworkReachabilityFlags(int i10) {
                this._builder.setNetworkReachabilityFlags(i10);
            }

            @JvmName(name = "setNwPathInterfaces")
            public final /* synthetic */ void setNwPathInterfaces(DslList dslList, int i10, String value) {
                p.e(dslList, "<this>");
                p.e(value, "value");
                this._builder.setNwPathInterfaces(i10, value);
            }

            @JvmName(name = "setScreenBrightness")
            public final void setScreenBrightness(double d10) {
                this._builder.setScreenBrightness(d10);
            }

            @JvmName(name = "setTrackingAuthStatus")
            public final void setTrackingAuthStatus(int i10) {
                this._builder.setTrackingAuthStatus(i10);
            }

            @JvmName(name = "setVolume")
            public final void setVolume(double d10) {
                this._builder.setVolume(d10);
            }

            private Dsl(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }
        }

        private IosKt() {
        }
    }

    private DynamicDeviceInfoKt() {
    }

    @JvmName(name = "-initializeandroid")
    @NotNull
    /* renamed from: -initializeandroid, reason: not valid java name */
    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android m411initializeandroid(@NotNull l block) {
        p.e(block, "block");
        AndroidKt.Dsl.Companion companion = AndroidKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @JvmName(name = "-initializeios")
    @NotNull
    /* renamed from: -initializeios, reason: not valid java name */
    public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios m412initializeios(@NotNull l block) {
        p.e(block, "block");
        IosKt.Dsl.Companion companion = IosKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        IosKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
