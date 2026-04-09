package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import l9.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\f\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0011\u001a\u00020\u000e2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt;", "", "<init>", "()V", "Lkotlin/Function1;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "Ly8/s;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "-initializeandroid", "(Ll9/l;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "android", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "-initializeios", "(Ll9/l;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "ios", "AndroidKt", "Dsl", "IosKt", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStaticDeviceInfoKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticDeviceInfoKt.kt\ngatewayprotocol/v1/StaticDeviceInfoKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1427:1\n1#2:1428\n*E\n"})
/* loaded from: classes4.dex */
public final class StaticDeviceInfoKt {

    @NotNull
    public static final StaticDeviceInfoKt INSTANCE = new StaticDeviceInfoKt();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AndroidKt {

        @NotNull
        public static final AndroidKt INSTANCE = new AndroidKt();

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u0000 |2\u00020\u0001:\u0001|B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u000bJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010\u000eJ\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJ\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u000bJ\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u000eJ\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u000bJ\r\u0010&\u001a\u00020\f¢\u0006\u0004\b&\u0010\u000eJ\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010\u000bJ\r\u0010(\u001a\u00020\f¢\u0006\u0004\b(\u0010\u000eJ\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010\u000bJ\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010\u000eJ\r\u0010+\u001a\u00020\t¢\u0006\u0004\b+\u0010\u000bJ\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010\u000eJ\r\u0010-\u001a\u00020\t¢\u0006\u0004\b-\u0010\u000bJ\r\u0010.\u001a\u00020\f¢\u0006\u0004\b.\u0010\u000eJ\r\u0010/\u001a\u00020\t¢\u0006\u0004\b/\u0010\u000bJ\r\u00100\u001a\u00020\f¢\u0006\u0004\b0\u0010\u000eJ\r\u00101\u001a\u00020\t¢\u0006\u0004\b1\u0010\u000bJ\r\u00102\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u00020\t¢\u0006\u0004\b3\u0010\u000bJ\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R$\u0010<\u001a\u0002062\u0006\u00107\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010?\u001a\u0002062\u0006\u00107\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R$\u0010E\u001a\u00020@2\u0006\u00107\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010H\u001a\u00020@2\u0006\u00107\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR$\u0010K\u001a\u00020@2\u0006\u00107\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR$\u0010N\u001a\u00020@2\u0006\u00107\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010B\"\u0004\bM\u0010DR$\u0010Q\u001a\u00020@2\u0006\u00107\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010B\"\u0004\bP\u0010DR$\u0010T\u001a\u00020@2\u0006\u00107\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010B\"\u0004\bS\u0010DR$\u0010W\u001a\u00020@2\u0006\u00107\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010B\"\u0004\bV\u0010DR$\u0010Z\u001a\u00020@2\u0006\u00107\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010B\"\u0004\bY\u0010DR$\u0010]\u001a\u00020@2\u0006\u00107\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010B\"\u0004\b\\\u0010DR$\u0010`\u001a\u00020@2\u0006\u00107\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010B\"\u0004\b_\u0010DR$\u0010c\u001a\u00020@2\u0006\u00107\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010B\"\u0004\bb\u0010DR$\u0010f\u001a\u00020@2\u0006\u00107\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010B\"\u0004\be\u0010DR$\u0010i\u001a\u00020@2\u0006\u00107\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010B\"\u0004\bh\u0010DR$\u0010l\u001a\u0002062\u0006\u00107\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u00109\"\u0004\bk\u0010;R$\u0010o\u001a\u0002062\u0006\u00107\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u00109\"\u0004\bn\u0010;R$\u0010r\u001a\u00020@2\u0006\u00107\u001a\u00020@8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u0010B\"\u0004\bq\u0010DR$\u0010x\u001a\u00020s2\u0006\u00107\u001a\u00020s8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR$\u0010{\u001a\u0002062\u0006\u00107\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\by\u00109\"\u0004\bz\u0010;¨\u0006}"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;)V", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "_build", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "Ly8/s;", "clearApiLevel", "()V", "", "hasApiLevel", "()Z", "clearVersionCode", "hasVersionCode", "clearAndroidFingerprint", "hasAndroidFingerprint", "clearAppInstaller", "hasAppInstaller", "clearApkDeveloperSigningCertificateHash", "hasApkDeveloperSigningCertificateHash", "clearBuildBoard", "hasBuildBoard", "clearBuildBrand", "hasBuildBrand", "clearBuildDevice", "hasBuildDevice", "clearBuildDisplay", "hasBuildDisplay", "clearBuildFingerprint", "hasBuildFingerprint", "clearBuildHardware", "hasBuildHardware", "clearBuildHost", "hasBuildHost", "clearBuildBootloader", "hasBuildBootloader", "clearBuildProduct", "hasBuildProduct", "clearBuildId", "hasBuildId", "clearExtensionVersion", "hasExtensionVersion", "clearPhoneType", "hasPhoneType", "clearSimOperator", "hasSimOperator", "clearTotalDiskSpaceInternal", "hasTotalDiskSpaceInternal", "clearDisplayScreenDensity", "hasDisplayScreenDensity", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getApiLevel", "()I", "setApiLevel", "(I)V", "apiLevel", "getVersionCode", "setVersionCode", "versionCode", "", "getAndroidFingerprint", "()Ljava/lang/String;", "setAndroidFingerprint", "(Ljava/lang/String;)V", "androidFingerprint", "getAppInstaller", "setAppInstaller", "appInstaller", "getApkDeveloperSigningCertificateHash", "setApkDeveloperSigningCertificateHash", "apkDeveloperSigningCertificateHash", "getBuildBoard", "setBuildBoard", "buildBoard", "getBuildBrand", "setBuildBrand", "buildBrand", "getBuildDevice", "setBuildDevice", "buildDevice", "getBuildDisplay", "setBuildDisplay", "buildDisplay", "getBuildFingerprint", "setBuildFingerprint", "buildFingerprint", "getBuildHardware", "setBuildHardware", "buildHardware", "getBuildHost", "setBuildHost", "buildHost", "getBuildBootloader", "setBuildBootloader", "buildBootloader", "getBuildProduct", "setBuildProduct", "buildProduct", "getBuildId", "setBuildId", "buildId", "getExtensionVersion", "setExtensionVersion", "extensionVersion", "getPhoneType", "setPhoneType", "phoneType", "getSimOperator", "setSimOperator", "simOperator", "", "getTotalDiskSpaceInternal", "()J", "setTotalDiskSpaceInternal", "(J)V", "totalDiskSpaceInternal", "getDisplayScreenDensity", "setDisplayScreenDensity", "displayScreenDensity", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @ProtoDslMarker
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder _builder;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(i iVar) {
                    this();
                }

                @PublishedApi
                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                    p.e(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder, i iVar) {
                this(builder);
            }

            @PublishedApi
            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Android _build() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo.Android androidBuild = this._builder.build();
                p.d(androidBuild, "_builder.build()");
                return androidBuild;
            }

            public final void clearAndroidFingerprint() {
                this._builder.clearAndroidFingerprint();
            }

            public final void clearApiLevel() {
                this._builder.clearApiLevel();
            }

            public final void clearApkDeveloperSigningCertificateHash() {
                this._builder.clearApkDeveloperSigningCertificateHash();
            }

            public final void clearAppInstaller() {
                this._builder.clearAppInstaller();
            }

            public final void clearBuildBoard() {
                this._builder.clearBuildBoard();
            }

            public final void clearBuildBootloader() {
                this._builder.clearBuildBootloader();
            }

            public final void clearBuildBrand() {
                this._builder.clearBuildBrand();
            }

            public final void clearBuildDevice() {
                this._builder.clearBuildDevice();
            }

            public final void clearBuildDisplay() {
                this._builder.clearBuildDisplay();
            }

            public final void clearBuildFingerprint() {
                this._builder.clearBuildFingerprint();
            }

            public final void clearBuildHardware() {
                this._builder.clearBuildHardware();
            }

            public final void clearBuildHost() {
                this._builder.clearBuildHost();
            }

            public final void clearBuildId() {
                this._builder.clearBuildId();
            }

            public final void clearBuildProduct() {
                this._builder.clearBuildProduct();
            }

            public final void clearDisplayScreenDensity() {
                this._builder.clearDisplayScreenDensity();
            }

            public final void clearExtensionVersion() {
                this._builder.clearExtensionVersion();
            }

            public final void clearPhoneType() {
                this._builder.clearPhoneType();
            }

            public final void clearSimOperator() {
                this._builder.clearSimOperator();
            }

            public final void clearTotalDiskSpaceInternal() {
                this._builder.clearTotalDiskSpaceInternal();
            }

            public final void clearVersionCode() {
                this._builder.clearVersionCode();
            }

            @JvmName(name = "getAndroidFingerprint")
            @NotNull
            public final String getAndroidFingerprint() {
                String androidFingerprint = this._builder.getAndroidFingerprint();
                p.d(androidFingerprint, "_builder.getAndroidFingerprint()");
                return androidFingerprint;
            }

            @JvmName(name = "getApiLevel")
            public final int getApiLevel() {
                return this._builder.getApiLevel();
            }

            @JvmName(name = "getApkDeveloperSigningCertificateHash")
            @NotNull
            public final String getApkDeveloperSigningCertificateHash() {
                String apkDeveloperSigningCertificateHash = this._builder.getApkDeveloperSigningCertificateHash();
                p.d(apkDeveloperSigningCertificateHash, "_builder.getApkDeveloperSigningCertificateHash()");
                return apkDeveloperSigningCertificateHash;
            }

            @JvmName(name = "getAppInstaller")
            @NotNull
            public final String getAppInstaller() {
                String appInstaller = this._builder.getAppInstaller();
                p.d(appInstaller, "_builder.getAppInstaller()");
                return appInstaller;
            }

            @JvmName(name = "getBuildBoard")
            @NotNull
            public final String getBuildBoard() {
                String buildBoard = this._builder.getBuildBoard();
                p.d(buildBoard, "_builder.getBuildBoard()");
                return buildBoard;
            }

            @JvmName(name = "getBuildBootloader")
            @NotNull
            public final String getBuildBootloader() {
                String buildBootloader = this._builder.getBuildBootloader();
                p.d(buildBootloader, "_builder.getBuildBootloader()");
                return buildBootloader;
            }

            @JvmName(name = "getBuildBrand")
            @NotNull
            public final String getBuildBrand() {
                String buildBrand = this._builder.getBuildBrand();
                p.d(buildBrand, "_builder.getBuildBrand()");
                return buildBrand;
            }

            @JvmName(name = "getBuildDevice")
            @NotNull
            public final String getBuildDevice() {
                String buildDevice = this._builder.getBuildDevice();
                p.d(buildDevice, "_builder.getBuildDevice()");
                return buildDevice;
            }

            @JvmName(name = "getBuildDisplay")
            @NotNull
            public final String getBuildDisplay() {
                String buildDisplay = this._builder.getBuildDisplay();
                p.d(buildDisplay, "_builder.getBuildDisplay()");
                return buildDisplay;
            }

            @JvmName(name = "getBuildFingerprint")
            @NotNull
            public final String getBuildFingerprint() {
                String buildFingerprint = this._builder.getBuildFingerprint();
                p.d(buildFingerprint, "_builder.getBuildFingerprint()");
                return buildFingerprint;
            }

            @JvmName(name = "getBuildHardware")
            @NotNull
            public final String getBuildHardware() {
                String buildHardware = this._builder.getBuildHardware();
                p.d(buildHardware, "_builder.getBuildHardware()");
                return buildHardware;
            }

            @JvmName(name = "getBuildHost")
            @NotNull
            public final String getBuildHost() {
                String buildHost = this._builder.getBuildHost();
                p.d(buildHost, "_builder.getBuildHost()");
                return buildHost;
            }

            @JvmName(name = "getBuildId")
            @NotNull
            public final String getBuildId() {
                String buildId = this._builder.getBuildId();
                p.d(buildId, "_builder.getBuildId()");
                return buildId;
            }

            @JvmName(name = "getBuildProduct")
            @NotNull
            public final String getBuildProduct() {
                String buildProduct = this._builder.getBuildProduct();
                p.d(buildProduct, "_builder.getBuildProduct()");
                return buildProduct;
            }

            @JvmName(name = "getDisplayScreenDensity")
            public final int getDisplayScreenDensity() {
                return this._builder.getDisplayScreenDensity();
            }

            @JvmName(name = "getExtensionVersion")
            public final int getExtensionVersion() {
                return this._builder.getExtensionVersion();
            }

            @JvmName(name = "getPhoneType")
            public final int getPhoneType() {
                return this._builder.getPhoneType();
            }

            @JvmName(name = "getSimOperator")
            @NotNull
            public final String getSimOperator() {
                String simOperator = this._builder.getSimOperator();
                p.d(simOperator, "_builder.getSimOperator()");
                return simOperator;
            }

            @JvmName(name = "getTotalDiskSpaceInternal")
            public final long getTotalDiskSpaceInternal() {
                return this._builder.getTotalDiskSpaceInternal();
            }

            @JvmName(name = "getVersionCode")
            public final int getVersionCode() {
                return this._builder.getVersionCode();
            }

            public final boolean hasAndroidFingerprint() {
                return this._builder.hasAndroidFingerprint();
            }

            public final boolean hasApiLevel() {
                return this._builder.hasApiLevel();
            }

            public final boolean hasApkDeveloperSigningCertificateHash() {
                return this._builder.hasApkDeveloperSigningCertificateHash();
            }

            public final boolean hasAppInstaller() {
                return this._builder.hasAppInstaller();
            }

            public final boolean hasBuildBoard() {
                return this._builder.hasBuildBoard();
            }

            public final boolean hasBuildBootloader() {
                return this._builder.hasBuildBootloader();
            }

            public final boolean hasBuildBrand() {
                return this._builder.hasBuildBrand();
            }

            public final boolean hasBuildDevice() {
                return this._builder.hasBuildDevice();
            }

            public final boolean hasBuildDisplay() {
                return this._builder.hasBuildDisplay();
            }

            public final boolean hasBuildFingerprint() {
                return this._builder.hasBuildFingerprint();
            }

            public final boolean hasBuildHardware() {
                return this._builder.hasBuildHardware();
            }

            public final boolean hasBuildHost() {
                return this._builder.hasBuildHost();
            }

            public final boolean hasBuildId() {
                return this._builder.hasBuildId();
            }

            public final boolean hasBuildProduct() {
                return this._builder.hasBuildProduct();
            }

            public final boolean hasDisplayScreenDensity() {
                return this._builder.hasDisplayScreenDensity();
            }

            public final boolean hasExtensionVersion() {
                return this._builder.hasExtensionVersion();
            }

            public final boolean hasPhoneType() {
                return this._builder.hasPhoneType();
            }

            public final boolean hasSimOperator() {
                return this._builder.hasSimOperator();
            }

            public final boolean hasTotalDiskSpaceInternal() {
                return this._builder.hasTotalDiskSpaceInternal();
            }

            public final boolean hasVersionCode() {
                return this._builder.hasVersionCode();
            }

            @JvmName(name = "setAndroidFingerprint")
            public final void setAndroidFingerprint(@NotNull String value) {
                p.e(value, "value");
                this._builder.setAndroidFingerprint(value);
            }

            @JvmName(name = "setApiLevel")
            public final void setApiLevel(int i10) {
                this._builder.setApiLevel(i10);
            }

            @JvmName(name = "setApkDeveloperSigningCertificateHash")
            public final void setApkDeveloperSigningCertificateHash(@NotNull String value) {
                p.e(value, "value");
                this._builder.setApkDeveloperSigningCertificateHash(value);
            }

            @JvmName(name = "setAppInstaller")
            public final void setAppInstaller(@NotNull String value) {
                p.e(value, "value");
                this._builder.setAppInstaller(value);
            }

            @JvmName(name = "setBuildBoard")
            public final void setBuildBoard(@NotNull String value) {
                p.e(value, "value");
                this._builder.setBuildBoard(value);
            }

            @JvmName(name = "setBuildBootloader")
            public final void setBuildBootloader(@NotNull String value) {
                p.e(value, "value");
                this._builder.setBuildBootloader(value);
            }

            @JvmName(name = "setBuildBrand")
            public final void setBuildBrand(@NotNull String value) {
                p.e(value, "value");
                this._builder.setBuildBrand(value);
            }

            @JvmName(name = "setBuildDevice")
            public final void setBuildDevice(@NotNull String value) {
                p.e(value, "value");
                this._builder.setBuildDevice(value);
            }

            @JvmName(name = "setBuildDisplay")
            public final void setBuildDisplay(@NotNull String value) {
                p.e(value, "value");
                this._builder.setBuildDisplay(value);
            }

            @JvmName(name = "setBuildFingerprint")
            public final void setBuildFingerprint(@NotNull String value) {
                p.e(value, "value");
                this._builder.setBuildFingerprint(value);
            }

            @JvmName(name = "setBuildHardware")
            public final void setBuildHardware(@NotNull String value) {
                p.e(value, "value");
                this._builder.setBuildHardware(value);
            }

            @JvmName(name = "setBuildHost")
            public final void setBuildHost(@NotNull String value) {
                p.e(value, "value");
                this._builder.setBuildHost(value);
            }

            @JvmName(name = "setBuildId")
            public final void setBuildId(@NotNull String value) {
                p.e(value, "value");
                this._builder.setBuildId(value);
            }

            @JvmName(name = "setBuildProduct")
            public final void setBuildProduct(@NotNull String value) {
                p.e(value, "value");
                this._builder.setBuildProduct(value);
            }

            @JvmName(name = "setDisplayScreenDensity")
            public final void setDisplayScreenDensity(int i10) {
                this._builder.setDisplayScreenDensity(i10);
            }

            @JvmName(name = "setExtensionVersion")
            public final void setExtensionVersion(int i10) {
                this._builder.setExtensionVersion(i10);
            }

            @JvmName(name = "setPhoneType")
            public final void setPhoneType(int i10) {
                this._builder.setPhoneType(i10);
            }

            @JvmName(name = "setSimOperator")
            public final void setSimOperator(@NotNull String value) {
                p.e(value, "value");
                this._builder.setSimOperator(value);
            }

            @JvmName(name = "setTotalDiskSpaceInternal")
            public final void setTotalDiskSpaceInternal(long j10) {
                this._builder.setTotalDiskSpaceInternal(j10);
            }

            @JvmName(name = "setVersionCode")
            public final void setVersionCode(int i10) {
                this._builder.setVersionCode(i10);
            }

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder) {
                this._builder = builder;
            }
        }

        private AndroidKt() {
        }
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\bE\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u009f\u00012\u00020\u0001:\u0004\u009f\u0001 \u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u000bJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010\u000eJ\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJ\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u000bJ\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u000eJ'\u0010+\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010(\u001a\u00020&H\u0007¢\u0006\u0004\b)\u0010*J(\u0010-\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010(\u001a\u00020&H\u0087\n¢\u0006\u0004\b,\u0010*J-\u00102\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020&0.H\u0007¢\u0006\u0004\b0\u00101J.\u0010-\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020&0.H\u0087\n¢\u0006\u0004\b3\u00101J0\u00108\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u00105\u001a\u0002042\u0006\u0010(\u001a\u00020&H\u0087\u0002¢\u0006\u0004\b6\u00107J\u001f\u0010;\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0007¢\u0006\u0004\b9\u0010:J\r\u0010<\u001a\u00020\t¢\u0006\u0004\b<\u0010\u000bJ\r\u0010=\u001a\u00020\f¢\u0006\u0004\b=\u0010\u000eJ\r\u0010>\u001a\u00020\t¢\u0006\u0004\b>\u0010\u000bJ\r\u0010?\u001a\u00020\f¢\u0006\u0004\b?\u0010\u000eJ\r\u0010@\u001a\u00020\t¢\u0006\u0004\b@\u0010\u000bJ\r\u0010A\u001a\u00020\f¢\u0006\u0004\bA\u0010\u000eJ\r\u0010B\u001a\u00020\t¢\u0006\u0004\bB\u0010\u000bJ\r\u0010C\u001a\u00020\f¢\u0006\u0004\bC\u0010\u000eJ\r\u0010D\u001a\u00020\t¢\u0006\u0004\bD\u0010\u000bJ\r\u0010E\u001a\u00020\f¢\u0006\u0004\bE\u0010\u000eJ\r\u0010F\u001a\u00020\t¢\u0006\u0004\bF\u0010\u000bJ\r\u0010G\u001a\u00020\f¢\u0006\u0004\bG\u0010\u000eJ\r\u0010H\u001a\u00020\t¢\u0006\u0004\bH\u0010\u000bJ\r\u0010I\u001a\u00020\f¢\u0006\u0004\bI\u0010\u000eJ\r\u0010J\u001a\u00020\t¢\u0006\u0004\bJ\u0010\u000bJ\r\u0010K\u001a\u00020\f¢\u0006\u0004\bK\u0010\u000eJ\r\u0010L\u001a\u00020\t¢\u0006\u0004\bL\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010MR$\u0010R\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010U\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010O\"\u0004\bT\u0010QR$\u0010Y\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010\u000e\"\u0004\bW\u0010XR$\u0010\\\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010\u000e\"\u0004\b[\u0010XR$\u0010_\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010O\"\u0004\b^\u0010QR$\u0010b\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010O\"\u0004\ba\u0010QR$\u0010e\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010O\"\u0004\bd\u0010QR$\u0010h\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010O\"\u0004\bg\u0010QR$\u0010m\u001a\u0002042\u0006\u0010(\u001a\u0002048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010p\u001a\u0002042\u0006\u0010(\u001a\u0002048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010j\"\u0004\bo\u0010lR$\u0010s\u001a\u0002042\u0006\u0010(\u001a\u0002048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010j\"\u0004\br\u0010lR$\u0010v\u001a\u0002042\u0006\u0010(\u001a\u0002048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010j\"\u0004\bu\u0010lR\u001d\u0010y\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%8F¢\u0006\u0006\u001a\u0004\bw\u0010xR$\u0010\u007f\u001a\u00020z2\u0006\u0010(\u001a\u00020z8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R'\u0010\u0082\u0001\u001a\u00020z2\u0006\u0010(\u001a\u00020z8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0080\u0001\u0010|\"\u0005\b\u0081\u0001\u0010~R'\u0010\u0085\u0001\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010O\"\u0005\b\u0084\u0001\u0010QR'\u0010\u0088\u0001\u001a\u00020z2\u0006\u0010(\u001a\u00020z8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010|\"\u0005\b\u0087\u0001\u0010~R'\u0010\u008b\u0001\u001a\u00020&2\u0006\u0010(\u001a\u00020&8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0089\u0001\u0010O\"\u0005\b\u008a\u0001\u0010QR+\u0010\u0091\u0001\u001a\u00030\u008c\u00012\u0007\u0010(\u001a\u00030\u008c\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R+\u0010\u0097\u0001\u001a\u00030\u0092\u00012\u0007\u0010(\u001a\u00030\u0092\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R'\u0010\u009a\u0001\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0098\u0001\u0010\u000e\"\u0005\b\u0099\u0001\u0010XR\u0015\u0010\u009e\u0001\u001a\u00030\u009b\u00018G¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001¨\u0006¡\u0001"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl;", "", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;)V", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "_build", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "Ly8/s;", "clearBundleId", "()V", "", "hasBundleId", "()Z", "clearBundleVersion", "hasBundleVersion", "clearAppDebuggable", "hasAppDebuggable", "clearRooted", "hasRooted", "clearOsVersion", "hasOsVersion", "clearDeviceMake", "hasDeviceMake", "clearDeviceModel", "hasDeviceModel", "clearWebviewUa", "hasWebviewUa", "clearScreenDensity", "hasScreenDensity", "clearScreenWidth", "hasScreenWidth", "clearScreenHeight", "hasScreenHeight", "clearScreenSize", "hasScreenSize", "Lcom/google/protobuf/kotlin/DslList;", "", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$StoresProxy;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "addStores", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "add", "plusAssignStores", "plusAssign", "", "values", "addAllStores", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllStores", "", "index", "setStores", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "set", "clearStores", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "clearTotalDiskSpace", "hasTotalDiskSpace", "clearTotalRamMemory", "hasTotalRamMemory", "clearCpuModel", "hasCpuModel", "clearCpuCount", "hasCpuCount", "clearGpuModel", "hasGpuModel", "clearAndroid", "hasAndroid", "clearIos", "hasIos", "clearMadeWithUnity", "hasMadeWithUnity", "clearPlatformSpecific", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;", "getBundleId", "()Ljava/lang/String;", "setBundleId", "(Ljava/lang/String;)V", "bundleId", "getBundleVersion", "setBundleVersion", "bundleVersion", "getAppDebuggable", "setAppDebuggable", "(Z)V", "appDebuggable", "getRooted", "setRooted", "rooted", "getOsVersion", "setOsVersion", "osVersion", "getDeviceMake", "setDeviceMake", "deviceMake", "getDeviceModel", "setDeviceModel", "deviceModel", "getWebviewUa", "setWebviewUa", "webviewUa", "getScreenDensity", "()I", "setScreenDensity", "(I)V", "screenDensity", "getScreenWidth", "setScreenWidth", "screenWidth", "getScreenHeight", "setScreenHeight", "screenHeight", "getScreenSize", "setScreenSize", "screenSize", "getStores", "()Lcom/google/protobuf/kotlin/DslList;", "stores", "", "getTotalDiskSpace", "()J", "setTotalDiskSpace", "(J)V", "totalDiskSpace", "getTotalRamMemory", "setTotalRamMemory", "totalRamMemory", "getCpuModel", "setCpuModel", "cpuModel", "getCpuCount", "setCpuCount", "cpuCount", "getGpuModel", "setGpuModel", "gpuModel", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "getAndroid", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "setAndroid", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;)V", "android", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "getIos", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "setIos", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;)V", "ios", "getMadeWithUnity", "setMadeWithUnity", "madeWithUnity", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$PlatformSpecificCase;", "getPlatformSpecificCase", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$PlatformSpecificCase;", "platformSpecificCase", "Companion", "StoresProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl$StoresProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class StoresProxy extends DslProxy {
            private StoresProxy() {
            }
        }

        public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo _build() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfoBuild = this._builder.build();
            p.d(staticDeviceInfoBuild, "_builder.build()");
            return staticDeviceInfoBuild;
        }

        @JvmName(name = "addAllStores")
        public final /* synthetic */ void addAllStores(DslList dslList, Iterable values) {
            p.e(dslList, "<this>");
            p.e(values, "values");
            this._builder.addAllStores(values);
        }

        @JvmName(name = "addStores")
        public final /* synthetic */ void addStores(DslList dslList, String value) {
            p.e(dslList, "<this>");
            p.e(value, "value");
            this._builder.addStores(value);
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final void clearAppDebuggable() {
            this._builder.clearAppDebuggable();
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final void clearBundleVersion() {
            this._builder.clearBundleVersion();
        }

        public final void clearCpuCount() {
            this._builder.clearCpuCount();
        }

        public final void clearCpuModel() {
            this._builder.clearCpuModel();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGpuModel() {
            this._builder.clearGpuModel();
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final void clearMadeWithUnity() {
            this._builder.clearMadeWithUnity();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }

        public final void clearRooted() {
            this._builder.clearRooted();
        }

        public final void clearScreenDensity() {
            this._builder.clearScreenDensity();
        }

        public final void clearScreenHeight() {
            this._builder.clearScreenHeight();
        }

        public final void clearScreenSize() {
            this._builder.clearScreenSize();
        }

        public final void clearScreenWidth() {
            this._builder.clearScreenWidth();
        }

        @JvmName(name = "clearStores")
        public final /* synthetic */ void clearStores(DslList dslList) {
            p.e(dslList, "<this>");
            this._builder.clearStores();
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final void clearWebviewUa() {
            this._builder.clearWebviewUa();
        }

        @JvmName(name = "getAndroid")
        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroid() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2 = this._builder.getAndroid();
            p.d(android2, "_builder.getAndroid()");
            return android2;
        }

        @JvmName(name = "getAppDebuggable")
        public final boolean getAppDebuggable() {
            return this._builder.getAppDebuggable();
        }

        @JvmName(name = "getBundleId")
        @NotNull
        public final String getBundleId() {
            String bundleId = this._builder.getBundleId();
            p.d(bundleId, "_builder.getBundleId()");
            return bundleId;
        }

        @JvmName(name = "getBundleVersion")
        @NotNull
        public final String getBundleVersion() {
            String bundleVersion = this._builder.getBundleVersion();
            p.d(bundleVersion, "_builder.getBundleVersion()");
            return bundleVersion;
        }

        @JvmName(name = "getCpuCount")
        public final long getCpuCount() {
            return this._builder.getCpuCount();
        }

        @JvmName(name = "getCpuModel")
        @NotNull
        public final String getCpuModel() {
            String cpuModel = this._builder.getCpuModel();
            p.d(cpuModel, "_builder.getCpuModel()");
            return cpuModel;
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

        @JvmName(name = "getGpuModel")
        @NotNull
        public final String getGpuModel() {
            String gpuModel = this._builder.getGpuModel();
            p.d(gpuModel, "_builder.getGpuModel()");
            return gpuModel;
        }

        @JvmName(name = "getIos")
        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIos() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios = this._builder.getIos();
            p.d(ios, "_builder.getIos()");
            return ios;
        }

        @JvmName(name = "getMadeWithUnity")
        public final boolean getMadeWithUnity() {
            return this._builder.getMadeWithUnity();
        }

        @JvmName(name = "getOsVersion")
        @NotNull
        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            p.d(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        @JvmName(name = "getPlatformSpecificCase")
        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase getPlatformSpecificCase() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            p.d(platformSpecificCase, "_builder.getPlatformSpecificCase()");
            return platformSpecificCase;
        }

        @JvmName(name = "getRooted")
        public final boolean getRooted() {
            return this._builder.getRooted();
        }

        @JvmName(name = "getScreenDensity")
        public final int getScreenDensity() {
            return this._builder.getScreenDensity();
        }

        @JvmName(name = "getScreenHeight")
        public final int getScreenHeight() {
            return this._builder.getScreenHeight();
        }

        @JvmName(name = "getScreenSize")
        public final int getScreenSize() {
            return this._builder.getScreenSize();
        }

        @JvmName(name = "getScreenWidth")
        public final int getScreenWidth() {
            return this._builder.getScreenWidth();
        }

        @NotNull
        public final DslList<String, StoresProxy> getStores() {
            List<String> storesList = this._builder.getStoresList();
            p.d(storesList, "_builder.getStoresList()");
            return new DslList<>(storesList);
        }

        @JvmName(name = "getTotalDiskSpace")
        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        @JvmName(name = "getTotalRamMemory")
        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        @JvmName(name = "getWebviewUa")
        @NotNull
        public final String getWebviewUa() {
            String webviewUa = this._builder.getWebviewUa();
            p.d(webviewUa, "_builder.getWebviewUa()");
            return webviewUa;
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final boolean hasAppDebuggable() {
            return this._builder.hasAppDebuggable();
        }

        public final boolean hasBundleId() {
            return this._builder.hasBundleId();
        }

        public final boolean hasBundleVersion() {
            return this._builder.hasBundleVersion();
        }

        public final boolean hasCpuCount() {
            return this._builder.hasCpuCount();
        }

        public final boolean hasCpuModel() {
            return this._builder.hasCpuModel();
        }

        public final boolean hasDeviceMake() {
            return this._builder.hasDeviceMake();
        }

        public final boolean hasDeviceModel() {
            return this._builder.hasDeviceModel();
        }

        public final boolean hasGpuModel() {
            return this._builder.hasGpuModel();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final boolean hasMadeWithUnity() {
            return this._builder.hasMadeWithUnity();
        }

        public final boolean hasOsVersion() {
            return this._builder.hasOsVersion();
        }

        public final boolean hasRooted() {
            return this._builder.hasRooted();
        }

        public final boolean hasScreenDensity() {
            return this._builder.hasScreenDensity();
        }

        public final boolean hasScreenHeight() {
            return this._builder.hasScreenHeight();
        }

        public final boolean hasScreenSize() {
            return this._builder.hasScreenSize();
        }

        public final boolean hasScreenWidth() {
            return this._builder.hasScreenWidth();
        }

        public final boolean hasTotalDiskSpace() {
            return this._builder.hasTotalDiskSpace();
        }

        public final boolean hasTotalRamMemory() {
            return this._builder.hasTotalRamMemory();
        }

        public final boolean hasWebviewUa() {
            return this._builder.hasWebviewUa();
        }

        @JvmName(name = "plusAssignAllStores")
        public final /* synthetic */ void plusAssignAllStores(DslList<String, StoresProxy> dslList, Iterable<String> values) {
            p.e(dslList, "<this>");
            p.e(values, "values");
            addAllStores(dslList, values);
        }

        @JvmName(name = "plusAssignStores")
        public final /* synthetic */ void plusAssignStores(DslList<String, StoresProxy> dslList, String value) {
            p.e(dslList, "<this>");
            p.e(value, "value");
            addStores(dslList, value);
        }

        @JvmName(name = "setAndroid")
        public final void setAndroid(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo.Android value) {
            p.e(value, "value");
            this._builder.setAndroid(value);
        }

        @JvmName(name = "setAppDebuggable")
        public final void setAppDebuggable(boolean z10) {
            this._builder.setAppDebuggable(z10);
        }

        @JvmName(name = "setBundleId")
        public final void setBundleId(@NotNull String value) {
            p.e(value, "value");
            this._builder.setBundleId(value);
        }

        @JvmName(name = "setBundleVersion")
        public final void setBundleVersion(@NotNull String value) {
            p.e(value, "value");
            this._builder.setBundleVersion(value);
        }

        @JvmName(name = "setCpuCount")
        public final void setCpuCount(long j10) {
            this._builder.setCpuCount(j10);
        }

        @JvmName(name = "setCpuModel")
        public final void setCpuModel(@NotNull String value) {
            p.e(value, "value");
            this._builder.setCpuModel(value);
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

        @JvmName(name = "setGpuModel")
        public final void setGpuModel(@NotNull String value) {
            p.e(value, "value");
            this._builder.setGpuModel(value);
        }

        @JvmName(name = "setIos")
        public final void setIos(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios value) {
            p.e(value, "value");
            this._builder.setIos(value);
        }

        @JvmName(name = "setMadeWithUnity")
        public final void setMadeWithUnity(boolean z10) {
            this._builder.setMadeWithUnity(z10);
        }

        @JvmName(name = "setOsVersion")
        public final void setOsVersion(@NotNull String value) {
            p.e(value, "value");
            this._builder.setOsVersion(value);
        }

        @JvmName(name = "setRooted")
        public final void setRooted(boolean z10) {
            this._builder.setRooted(z10);
        }

        @JvmName(name = "setScreenDensity")
        public final void setScreenDensity(int i10) {
            this._builder.setScreenDensity(i10);
        }

        @JvmName(name = "setScreenHeight")
        public final void setScreenHeight(int i10) {
            this._builder.setScreenHeight(i10);
        }

        @JvmName(name = "setScreenSize")
        public final void setScreenSize(int i10) {
            this._builder.setScreenSize(i10);
        }

        @JvmName(name = "setScreenWidth")
        public final void setScreenWidth(int i10) {
            this._builder.setScreenWidth(i10);
        }

        @JvmName(name = "setStores")
        public final /* synthetic */ void setStores(DslList dslList, int i10, String value) {
            p.e(dslList, "<this>");
            p.e(value, "value");
            this._builder.setStores(i10, value);
        }

        @JvmName(name = "setTotalDiskSpace")
        public final void setTotalDiskSpace(long j10) {
            this._builder.setTotalDiskSpace(j10);
        }

        @JvmName(name = "setTotalRamMemory")
        public final void setTotalRamMemory(long j10) {
            this._builder.setTotalRamMemory(j10);
        }

        @JvmName(name = "setWebviewUa")
        public final void setWebviewUa(@NotNull String value) {
            p.e(value, "value");
            this._builder.setWebviewUa(value);
        }

        private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
            this._builder = builder;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IosKt {

        @NotNull
        public static final IosKt INSTANCE = new IosKt();

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b(\b\u0007\u0018\u0000 ]2\u00020\u0001:\u0002]^B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ'\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001b\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u001a\u0010\u0018J-\u0010 \u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010\u001b\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001cH\u0087\n¢\u0006\u0004\b!\u0010\u001fJ0\u0010&\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0014H\u0087\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010\u000bJ\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010\u000eJ\r\u0010,\u001a\u00020\t¢\u0006\u0004\b,\u0010\u000bJ\r\u0010-\u001a\u00020\f¢\u0006\u0004\b-\u0010\u000eJ\r\u0010.\u001a\u00020\t¢\u0006\u0004\b.\u0010\u000bJ\r\u0010/\u001a\u00020\f¢\u0006\u0004\b/\u0010\u000eJ\r\u00100\u001a\u00020\t¢\u0006\u0004\b0\u0010\u000bJ\r\u00101\u001a\u00020\f¢\u0006\u0004\b1\u0010\u000eJ\r\u00102\u001a\u00020\t¢\u0006\u0004\b2\u0010\u000bJ\r\u00103\u001a\u00020\f¢\u0006\u0004\b3\u0010\u000eJ\r\u00104\u001a\u00020\t¢\u0006\u0004\b4\u0010\u000bJ\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R$\u0010<\u001a\u0002072\u0006\u0010\u0016\u001a\u0002078G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010@\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\u000e\"\u0004\b>\u0010?R$\u0010E\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001d\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138F¢\u0006\u0006\u001a\u0004\bF\u0010GR$\u0010M\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010P\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010\u000e\"\u0004\bO\u0010?R$\u0010S\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010B\"\u0004\bR\u0010DR$\u0010V\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010B\"\u0004\bU\u0010DR$\u0010Y\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010B\"\u0004\bX\u0010DR$\u0010\\\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010B\"\u0004\b[\u0010D¨\u0006_"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;)V", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "_build", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "Ly8/s;", "clearSystemBootTime", "()V", "", "hasSystemBootTime", "()Z", "clearSimulator", "hasSimulator", "clearBuiltSdkVersion", "hasBuiltSdkVersion", "Lcom/google/protobuf/kotlin/DslList;", "", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl$SkadnetworkIdProxy;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "addSkadnetworkId", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "add", "plusAssignSkadnetworkId", "plusAssign", "", "values", "addAllSkadnetworkId", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllSkadnetworkId", "", "index", "setSkadnetworkId", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "set", "clearSkadnetworkId", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "clearScreenScale", "hasScreenScale", "clearCanMakePayments", "hasCanMakePayments", "clearXcodeVersion", "hasXcodeVersion", "clearXcodeBuildVersion", "hasXcodeBuildVersion", "clearXcodeSdkBuildVersion", "hasXcodeSdkBuildVersion", "clearBundleVersionFull", "hasBundleVersionFull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;", "", "getSystemBootTime", "()J", "setSystemBootTime", "(J)V", "systemBootTime", "getSimulator", "setSimulator", "(Z)V", "simulator", "getBuiltSdkVersion", "()Ljava/lang/String;", "setBuiltSdkVersion", "(Ljava/lang/String;)V", "builtSdkVersion", "getSkadnetworkId", "()Lcom/google/protobuf/kotlin/DslList;", "skadnetworkId", "getScreenScale", "()I", "setScreenScale", "(I)V", "screenScale", "getCanMakePayments", "setCanMakePayments", "canMakePayments", "getXcodeVersion", "setXcodeVersion", "xcodeVersion", "getXcodeBuildVersion", "setXcodeBuildVersion", "xcodeBuildVersion", "getXcodeSdkBuildVersion", "setXcodeSdkBuildVersion", "xcodeSdkBuildVersion", "getBundleVersionFull", "setBundleVersionFull", "bundleVersionFull", "Companion", "SkadnetworkIdProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @ProtoDslMarker
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder _builder;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "builder", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(i iVar) {
                    this();
                }

                @PublishedApi
                public final /* synthetic */ Dsl _create(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                    p.e(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl$SkadnetworkIdProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class SkadnetworkIdProxy extends DslProxy {
                private SkadnetworkIdProxy() {
                }
            }

            public /* synthetic */ Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder, i iVar) {
                this(builder);
            }

            @PublishedApi
            public final /* synthetic */ StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios _build() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios iosBuild = this._builder.build();
                p.d(iosBuild, "_builder.build()");
                return iosBuild;
            }

            @JvmName(name = "addAllSkadnetworkId")
            public final /* synthetic */ void addAllSkadnetworkId(DslList dslList, Iterable values) {
                p.e(dslList, "<this>");
                p.e(values, "values");
                this._builder.addAllSkadnetworkId(values);
            }

            @JvmName(name = "addSkadnetworkId")
            public final /* synthetic */ void addSkadnetworkId(DslList dslList, String value) {
                p.e(dslList, "<this>");
                p.e(value, "value");
                this._builder.addSkadnetworkId(value);
            }

            public final void clearBuiltSdkVersion() {
                this._builder.clearBuiltSdkVersion();
            }

            public final void clearBundleVersionFull() {
                this._builder.clearBundleVersionFull();
            }

            public final void clearCanMakePayments() {
                this._builder.clearCanMakePayments();
            }

            public final void clearScreenScale() {
                this._builder.clearScreenScale();
            }

            public final void clearSimulator() {
                this._builder.clearSimulator();
            }

            @JvmName(name = "clearSkadnetworkId")
            public final /* synthetic */ void clearSkadnetworkId(DslList dslList) {
                p.e(dslList, "<this>");
                this._builder.clearSkadnetworkId();
            }

            public final void clearSystemBootTime() {
                this._builder.clearSystemBootTime();
            }

            public final void clearXcodeBuildVersion() {
                this._builder.clearXcodeBuildVersion();
            }

            public final void clearXcodeSdkBuildVersion() {
                this._builder.clearXcodeSdkBuildVersion();
            }

            public final void clearXcodeVersion() {
                this._builder.clearXcodeVersion();
            }

            @JvmName(name = "getBuiltSdkVersion")
            @NotNull
            public final String getBuiltSdkVersion() {
                String builtSdkVersion = this._builder.getBuiltSdkVersion();
                p.d(builtSdkVersion, "_builder.getBuiltSdkVersion()");
                return builtSdkVersion;
            }

            @JvmName(name = "getBundleVersionFull")
            @NotNull
            public final String getBundleVersionFull() {
                String bundleVersionFull = this._builder.getBundleVersionFull();
                p.d(bundleVersionFull, "_builder.getBundleVersionFull()");
                return bundleVersionFull;
            }

            @JvmName(name = "getCanMakePayments")
            public final boolean getCanMakePayments() {
                return this._builder.getCanMakePayments();
            }

            @JvmName(name = "getScreenScale")
            public final int getScreenScale() {
                return this._builder.getScreenScale();
            }

            @JvmName(name = "getSimulator")
            public final boolean getSimulator() {
                return this._builder.getSimulator();
            }

            @NotNull
            public final DslList<String, SkadnetworkIdProxy> getSkadnetworkId() {
                List<String> skadnetworkIdList = this._builder.getSkadnetworkIdList();
                p.d(skadnetworkIdList, "_builder.getSkadnetworkIdList()");
                return new DslList<>(skadnetworkIdList);
            }

            @JvmName(name = "getSystemBootTime")
            public final long getSystemBootTime() {
                return this._builder.getSystemBootTime();
            }

            @JvmName(name = "getXcodeBuildVersion")
            @NotNull
            public final String getXcodeBuildVersion() {
                String xcodeBuildVersion = this._builder.getXcodeBuildVersion();
                p.d(xcodeBuildVersion, "_builder.getXcodeBuildVersion()");
                return xcodeBuildVersion;
            }

            @JvmName(name = "getXcodeSdkBuildVersion")
            @NotNull
            public final String getXcodeSdkBuildVersion() {
                String xcodeSdkBuildVersion = this._builder.getXcodeSdkBuildVersion();
                p.d(xcodeSdkBuildVersion, "_builder.getXcodeSdkBuildVersion()");
                return xcodeSdkBuildVersion;
            }

            @JvmName(name = "getXcodeVersion")
            @NotNull
            public final String getXcodeVersion() {
                String xcodeVersion = this._builder.getXcodeVersion();
                p.d(xcodeVersion, "_builder.getXcodeVersion()");
                return xcodeVersion;
            }

            public final boolean hasBuiltSdkVersion() {
                return this._builder.hasBuiltSdkVersion();
            }

            public final boolean hasBundleVersionFull() {
                return this._builder.hasBundleVersionFull();
            }

            public final boolean hasCanMakePayments() {
                return this._builder.hasCanMakePayments();
            }

            public final boolean hasScreenScale() {
                return this._builder.hasScreenScale();
            }

            public final boolean hasSimulator() {
                return this._builder.hasSimulator();
            }

            public final boolean hasSystemBootTime() {
                return this._builder.hasSystemBootTime();
            }

            public final boolean hasXcodeBuildVersion() {
                return this._builder.hasXcodeBuildVersion();
            }

            public final boolean hasXcodeSdkBuildVersion() {
                return this._builder.hasXcodeSdkBuildVersion();
            }

            public final boolean hasXcodeVersion() {
                return this._builder.hasXcodeVersion();
            }

            @JvmName(name = "plusAssignAllSkadnetworkId")
            public final /* synthetic */ void plusAssignAllSkadnetworkId(DslList<String, SkadnetworkIdProxy> dslList, Iterable<String> values) {
                p.e(dslList, "<this>");
                p.e(values, "values");
                addAllSkadnetworkId(dslList, values);
            }

            @JvmName(name = "plusAssignSkadnetworkId")
            public final /* synthetic */ void plusAssignSkadnetworkId(DslList<String, SkadnetworkIdProxy> dslList, String value) {
                p.e(dslList, "<this>");
                p.e(value, "value");
                addSkadnetworkId(dslList, value);
            }

            @JvmName(name = "setBuiltSdkVersion")
            public final void setBuiltSdkVersion(@NotNull String value) {
                p.e(value, "value");
                this._builder.setBuiltSdkVersion(value);
            }

            @JvmName(name = "setBundleVersionFull")
            public final void setBundleVersionFull(@NotNull String value) {
                p.e(value, "value");
                this._builder.setBundleVersionFull(value);
            }

            @JvmName(name = "setCanMakePayments")
            public final void setCanMakePayments(boolean z10) {
                this._builder.setCanMakePayments(z10);
            }

            @JvmName(name = "setScreenScale")
            public final void setScreenScale(int i10) {
                this._builder.setScreenScale(i10);
            }

            @JvmName(name = "setSimulator")
            public final void setSimulator(boolean z10) {
                this._builder.setSimulator(z10);
            }

            @JvmName(name = "setSkadnetworkId")
            public final /* synthetic */ void setSkadnetworkId(DslList dslList, int i10, String value) {
                p.e(dslList, "<this>");
                p.e(value, "value");
                this._builder.setSkadnetworkId(i10, value);
            }

            @JvmName(name = "setSystemBootTime")
            public final void setSystemBootTime(long j10) {
                this._builder.setSystemBootTime(j10);
            }

            @JvmName(name = "setXcodeBuildVersion")
            public final void setXcodeBuildVersion(@NotNull String value) {
                p.e(value, "value");
                this._builder.setXcodeBuildVersion(value);
            }

            @JvmName(name = "setXcodeSdkBuildVersion")
            public final void setXcodeSdkBuildVersion(@NotNull String value) {
                p.e(value, "value");
                this._builder.setXcodeSdkBuildVersion(value);
            }

            @JvmName(name = "setXcodeVersion")
            public final void setXcodeVersion(@NotNull String value) {
                p.e(value, "value");
                this._builder.setXcodeVersion(value);
            }

            private Dsl(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder) {
                this._builder = builder;
            }
        }

        private IosKt() {
        }
    }

    private StaticDeviceInfoKt() {
    }

    @JvmName(name = "-initializeandroid")
    @NotNull
    /* renamed from: -initializeandroid, reason: not valid java name */
    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android m439initializeandroid(@NotNull l block) {
        p.e(block, "block");
        AndroidKt.Dsl.Companion companion = AndroidKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @JvmName(name = "-initializeios")
    @NotNull
    /* renamed from: -initializeios, reason: not valid java name */
    public final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios m440initializeios(@NotNull l block) {
        p.e(block, "block");
        IosKt.Dsl.Companion companion = IosKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        IosKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
