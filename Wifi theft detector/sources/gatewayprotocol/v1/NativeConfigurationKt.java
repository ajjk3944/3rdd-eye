package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NativeConfigurationKt {

    @NotNull
    public static final NativeConfigurationKt INSTANCE = new NativeConfigurationKt();

    @Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u0092\u00012\u00020\u0001:\u0006\u0093\u0001\u0092\u0001\u0094\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u000bJ'\u0010#\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010 \u001a\u00020\u001eH\u0007¢\u0006\u0004\b!\u0010\"J(\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010 \u001a\u00020\u001eH\u0087\n¢\u0006\u0004\b$\u0010\"J-\u0010*\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0&H\u0007¢\u0006\u0004\b(\u0010)J.\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0&H\u0087\n¢\u0006\u0004\b+\u0010)J0\u00100\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010-\u001a\u00020,2\u0006\u0010 \u001a\u00020\u001eH\u0087\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00103\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dH\u0007¢\u0006\u0004\b1\u00102J\r\u00104\u001a\u00020\t¢\u0006\u0004\b4\u0010\u000bJ\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010\u000eJ'\u0010#\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001d2\u0006\u0010 \u001a\u000206H\u0007¢\u0006\u0004\b8\u00109J(\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001d2\u0006\u0010 \u001a\u000206H\u0087\n¢\u0006\u0004\b:\u00109J-\u0010*\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002060&H\u0007¢\u0006\u0004\b;\u0010)J.\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002060&H\u0087\n¢\u0006\u0004\b<\u0010)J0\u00100\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001d2\u0006\u0010-\u001a\u00020,2\u0006\u0010 \u001a\u000206H\u0087\u0002¢\u0006\u0004\b=\u0010>J\u001f\u00103\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001dH\u0007¢\u0006\u0004\b?\u00102J\r\u0010@\u001a\u00020\t¢\u0006\u0004\b@\u0010\u000bJ\r\u0010A\u001a\u00020\f¢\u0006\u0004\bA\u0010\u000eJ\r\u0010B\u001a\u00020\t¢\u0006\u0004\bB\u0010\u000bJ\r\u0010C\u001a\u00020\t¢\u0006\u0004\bC\u0010\u000bJ\r\u0010D\u001a\u00020\f¢\u0006\u0004\bD\u0010\u000eJ\r\u0010E\u001a\u00020\t¢\u0006\u0004\bE\u0010\u000bJ\r\u0010F\u001a\u00020\f¢\u0006\u0004\bF\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010GR$\u0010M\u001a\u00020H2\u0006\u0010 \u001a\u00020H8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010S\u001a\u00020N2\u0006\u0010 \u001a\u00020N8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010V\u001a\u00020N2\u0006\u0010 \u001a\u00020N8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010P\"\u0004\bU\u0010RR$\u0010Y\u001a\u00020N2\u0006\u0010 \u001a\u00020N8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010P\"\u0004\bX\u0010RR$\u0010\\\u001a\u00020N2\u0006\u0010 \u001a\u00020N8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010P\"\u0004\b[\u0010RR$\u0010b\u001a\u00020]2\u0006\u0010 \u001a\u00020]8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010h\u001a\u00020c2\u0006\u0010 \u001a\u00020c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010l\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010\u000e\"\u0004\bj\u0010kR$\u0010o\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010\u000e\"\u0004\bn\u0010kR\u001d\u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d8F¢\u0006\u0006\u001a\u0004\bp\u0010qR$\u0010x\u001a\u00020s2\u0006\u0010 \u001a\u00020s8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001d\u0010z\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001d8F¢\u0006\u0006\u001a\u0004\by\u0010qR$\u0010}\u001a\u00020s2\u0006\u0010 \u001a\u00020s8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010u\"\u0004\b|\u0010wR(\u0010\u0083\u0001\u001a\u00020~2\u0006\u0010 \u001a\u00020~8G@GX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R)\u0010\u0088\u0001\u001a\u00020,2\u0006\u0010 \u001a\u00020,8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R'\u0010\u008b\u0001\u001a\u00020N2\u0006\u0010 \u001a\u00020N8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0089\u0001\u0010P\"\u0005\b\u008a\u0001\u0010RR+\u0010\u0091\u0001\u001a\u00030\u008c\u00012\u0007\u0010 \u001a\u00030\u008c\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0095\u0001"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl;", "", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;)V", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "_build", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "Ly8/s;", "clearDiagnosticEvents", "()V", "", "hasDiagnosticEvents", "()Z", "clearInitPolicy", "hasInitPolicy", "clearAdPolicy", "hasAdPolicy", "clearOperativeEventPolicy", "hasOperativeEventPolicy", "clearOtherPolicy", "hasOtherPolicy", "clearAdOperations", "hasAdOperations", "clearFeatureFlags", "hasFeatureFlags", "clearEnableIapEvent", "clearEnableOm", "Lcom/google/protobuf/kotlin/DslList;", "", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$AdditionalStorePackagesProxy;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "addAdditionalStorePackages", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "add", "plusAssignAdditionalStorePackages", "plusAssign", "", "values", "addAllAdditionalStorePackages", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllAdditionalStorePackages", "", "index", "setAdditionalStorePackages", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "set", "clearAdditionalStorePackages", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "clearCachedAssetsConfiguration", "hasCachedAssetsConfiguration", "Lcom/google/protobuf/ByteString;", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$ObservableAndroidActivitiesProxy;", "addObservableAndroidActivities", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/ByteString;)V", "plusAssignObservableAndroidActivities", "addAllObservableAndroidActivities", "plusAssignAllObservableAndroidActivities", "setObservableAndroidActivities", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/ByteString;)V", "clearObservableAndroidActivities", "clearCachedWebviewFilesConfiguration", "hasCachedWebviewFilesConfiguration", "clearDefaultShowCompletionState", "clearDownloadPolicy", "hasDownloadPolicy", "clearDebugSettings", "hasDebugSettings", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "getDiagnosticEvents", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "setDiagnosticEvents", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;)V", "diagnosticEvents", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "getInitPolicy", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "setInitPolicy", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;)V", "initPolicy", "getAdPolicy", "setAdPolicy", "adPolicy", "getOperativeEventPolicy", "setOperativeEventPolicy", "operativeEventPolicy", "getOtherPolicy", "setOtherPolicy", "otherPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "getAdOperations", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "setAdOperations", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;)V", "adOperations", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "setFeatureFlags", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;)V", "featureFlags", "getEnableIapEvent", "setEnableIapEvent", "(Z)V", "enableIapEvent", "getEnableOm", "setEnableOm", "enableOm", "getAdditionalStorePackages", "()Lcom/google/protobuf/kotlin/DslList;", "additionalStorePackages", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "getCachedAssetsConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "setCachedAssetsConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;)V", "cachedAssetsConfiguration", "getObservableAndroidActivities", "observableAndroidActivities", "getCachedWebviewFilesConfiguration", "setCachedWebviewFilesConfiguration", "cachedWebviewFilesConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$ShowCompletionState;", "getDefaultShowCompletionState", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$ShowCompletionState;", "setDefaultShowCompletionState", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$ShowCompletionState;)V", "defaultShowCompletionState", "getDefaultShowCompletionStateValue", "()I", "setDefaultShowCompletionStateValue", "(I)V", "defaultShowCompletionStateValue", "getDownloadPolicy", "setDownloadPolicy", "downloadPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "getDebugSettings", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "setDebugSettings", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;)V", "debugSettings", "Companion", "AdditionalStorePackagesProxy", "ObservableAndroidActivitiesProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final NativeConfigurationOuterClass.NativeConfiguration.Builder _builder;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$AdditionalStorePackagesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AdditionalStorePackagesProxy extends DslProxy {
            private AdditionalStorePackagesProxy() {
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
                p.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$ObservableAndroidActivitiesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ObservableAndroidActivitiesProxy extends DslProxy {
            private ObservableAndroidActivitiesProxy() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder, i iVar) {
            this(builder);
        }

        @PublishedApi
        public final /* synthetic */ NativeConfigurationOuterClass.NativeConfiguration _build() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfigurationBuild = this._builder.build();
            p.d(nativeConfigurationBuild, "_builder.build()");
            return nativeConfigurationBuild;
        }

        @JvmName(name = "addAdditionalStorePackages")
        public final /* synthetic */ void addAdditionalStorePackages(DslList dslList, String value) {
            p.e(dslList, "<this>");
            p.e(value, "value");
            this._builder.addAdditionalStorePackages(value);
        }

        @JvmName(name = "addAllAdditionalStorePackages")
        public final /* synthetic */ void addAllAdditionalStorePackages(DslList dslList, Iterable values) {
            p.e(dslList, "<this>");
            p.e(values, "values");
            this._builder.addAllAdditionalStorePackages(values);
        }

        @JvmName(name = "addAllObservableAndroidActivities")
        public final /* synthetic */ void addAllObservableAndroidActivities(DslList dslList, Iterable values) {
            p.e(dslList, "<this>");
            p.e(values, "values");
            this._builder.addAllObservableAndroidActivities(values);
        }

        @JvmName(name = "addObservableAndroidActivities")
        public final /* synthetic */ void addObservableAndroidActivities(DslList dslList, ByteString value) {
            p.e(dslList, "<this>");
            p.e(value, "value");
            this._builder.addObservableAndroidActivities(value);
        }

        public final void clearAdOperations() {
            this._builder.clearAdOperations();
        }

        public final void clearAdPolicy() {
            this._builder.clearAdPolicy();
        }

        @JvmName(name = "clearAdditionalStorePackages")
        public final /* synthetic */ void clearAdditionalStorePackages(DslList dslList) {
            p.e(dslList, "<this>");
            this._builder.clearAdditionalStorePackages();
        }

        public final void clearCachedAssetsConfiguration() {
            this._builder.clearCachedAssetsConfiguration();
        }

        public final void clearCachedWebviewFilesConfiguration() {
            this._builder.clearCachedWebviewFilesConfiguration();
        }

        public final void clearDebugSettings() {
            this._builder.clearDebugSettings();
        }

        public final void clearDefaultShowCompletionState() {
            this._builder.clearDefaultShowCompletionState();
        }

        public final void clearDiagnosticEvents() {
            this._builder.clearDiagnosticEvents();
        }

        public final void clearDownloadPolicy() {
            this._builder.clearDownloadPolicy();
        }

        public final void clearEnableIapEvent() {
            this._builder.clearEnableIapEvent();
        }

        public final void clearEnableOm() {
            this._builder.clearEnableOm();
        }

        public final void clearFeatureFlags() {
            this._builder.clearFeatureFlags();
        }

        public final void clearInitPolicy() {
            this._builder.clearInitPolicy();
        }

        @JvmName(name = "clearObservableAndroidActivities")
        public final /* synthetic */ void clearObservableAndroidActivities(DslList dslList) {
            p.e(dslList, "<this>");
            this._builder.clearObservableAndroidActivities();
        }

        public final void clearOperativeEventPolicy() {
            this._builder.clearOperativeEventPolicy();
        }

        public final void clearOtherPolicy() {
            this._builder.clearOtherPolicy();
        }

        @JvmName(name = "getAdOperations")
        @NotNull
        public final NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations() {
            NativeConfigurationOuterClass.AdOperationsConfiguration adOperations = this._builder.getAdOperations();
            p.d(adOperations, "_builder.getAdOperations()");
            return adOperations;
        }

        @JvmName(name = "getAdPolicy")
        @NotNull
        public final NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
            NativeConfigurationOuterClass.RequestPolicy adPolicy = this._builder.getAdPolicy();
            p.d(adPolicy, "_builder.getAdPolicy()");
            return adPolicy;
        }

        @NotNull
        public final DslList<String, AdditionalStorePackagesProxy> getAdditionalStorePackages() {
            List<String> additionalStorePackagesList = this._builder.getAdditionalStorePackagesList();
            p.d(additionalStorePackagesList, "_builder.getAdditionalStorePackagesList()");
            return new DslList<>(additionalStorePackagesList);
        }

        @JvmName(name = "getCachedAssetsConfiguration")
        @NotNull
        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedAssetsConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = this._builder.getCachedAssetsConfiguration();
            p.d(cachedAssetsConfiguration, "_builder.getCachedAssetsConfiguration()");
            return cachedAssetsConfiguration;
        }

        @JvmName(name = "getCachedWebviewFilesConfiguration")
        @NotNull
        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedWebviewFilesConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = this._builder.getCachedWebviewFilesConfiguration();
            p.d(cachedWebviewFilesConfiguration, "_builder.getCachedWebviewFilesConfiguration()");
            return cachedWebviewFilesConfiguration;
        }

        @JvmName(name = "getDebugSettings")
        @NotNull
        public final NativeConfigurationOuterClass.DebugSettings getDebugSettings() {
            NativeConfigurationOuterClass.DebugSettings debugSettings = this._builder.getDebugSettings();
            p.d(debugSettings, "_builder.getDebugSettings()");
            return debugSettings;
        }

        @JvmName(name = "getDefaultShowCompletionState")
        @NotNull
        public final NativeConfigurationOuterClass.ShowCompletionState getDefaultShowCompletionState() {
            NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = this._builder.getDefaultShowCompletionState();
            p.d(defaultShowCompletionState, "_builder.getDefaultShowCompletionState()");
            return defaultShowCompletionState;
        }

        @JvmName(name = "getDefaultShowCompletionStateValue")
        public final int getDefaultShowCompletionStateValue() {
            return this._builder.getDefaultShowCompletionStateValue();
        }

        @JvmName(name = "getDiagnosticEvents")
        @NotNull
        public final NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents() {
            NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this._builder.getDiagnosticEvents();
            p.d(diagnosticEvents, "_builder.getDiagnosticEvents()");
            return diagnosticEvents;
        }

        @JvmName(name = "getDownloadPolicy")
        @NotNull
        public final NativeConfigurationOuterClass.RequestPolicy getDownloadPolicy() {
            NativeConfigurationOuterClass.RequestPolicy downloadPolicy = this._builder.getDownloadPolicy();
            p.d(downloadPolicy, "_builder.getDownloadPolicy()");
            return downloadPolicy;
        }

        @JvmName(name = "getEnableIapEvent")
        public final boolean getEnableIapEvent() {
            return this._builder.getEnableIapEvent();
        }

        @JvmName(name = "getEnableOm")
        public final boolean getEnableOm() {
            return this._builder.getEnableOm();
        }

        @JvmName(name = "getFeatureFlags")
        @NotNull
        public final NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
            NativeConfigurationOuterClass.FeatureFlags featureFlags = this._builder.getFeatureFlags();
            p.d(featureFlags, "_builder.getFeatureFlags()");
            return featureFlags;
        }

        @JvmName(name = "getInitPolicy")
        @NotNull
        public final NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
            NativeConfigurationOuterClass.RequestPolicy initPolicy = this._builder.getInitPolicy();
            p.d(initPolicy, "_builder.getInitPolicy()");
            return initPolicy;
        }

        public final /* synthetic */ DslList getObservableAndroidActivities() {
            List<ByteString> observableAndroidActivitiesList = this._builder.getObservableAndroidActivitiesList();
            p.d(observableAndroidActivitiesList, "_builder.getObservableAndroidActivitiesList()");
            return new DslList(observableAndroidActivitiesList);
        }

        @JvmName(name = "getOperativeEventPolicy")
        @NotNull
        public final NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
            NativeConfigurationOuterClass.RequestPolicy operativeEventPolicy = this._builder.getOperativeEventPolicy();
            p.d(operativeEventPolicy, "_builder.getOperativeEventPolicy()");
            return operativeEventPolicy;
        }

        @JvmName(name = "getOtherPolicy")
        @NotNull
        public final NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
            NativeConfigurationOuterClass.RequestPolicy otherPolicy = this._builder.getOtherPolicy();
            p.d(otherPolicy, "_builder.getOtherPolicy()");
            return otherPolicy;
        }

        public final boolean hasAdOperations() {
            return this._builder.hasAdOperations();
        }

        public final boolean hasAdPolicy() {
            return this._builder.hasAdPolicy();
        }

        public final boolean hasCachedAssetsConfiguration() {
            return this._builder.hasCachedAssetsConfiguration();
        }

        public final boolean hasCachedWebviewFilesConfiguration() {
            return this._builder.hasCachedWebviewFilesConfiguration();
        }

        public final boolean hasDebugSettings() {
            return this._builder.hasDebugSettings();
        }

        public final boolean hasDiagnosticEvents() {
            return this._builder.hasDiagnosticEvents();
        }

        public final boolean hasDownloadPolicy() {
            return this._builder.hasDownloadPolicy();
        }

        public final boolean hasFeatureFlags() {
            return this._builder.hasFeatureFlags();
        }

        public final boolean hasInitPolicy() {
            return this._builder.hasInitPolicy();
        }

        public final boolean hasOperativeEventPolicy() {
            return this._builder.hasOperativeEventPolicy();
        }

        public final boolean hasOtherPolicy() {
            return this._builder.hasOtherPolicy();
        }

        @JvmName(name = "plusAssignAdditionalStorePackages")
        public final /* synthetic */ void plusAssignAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, String value) {
            p.e(dslList, "<this>");
            p.e(value, "value");
            addAdditionalStorePackages(dslList, value);
        }

        @JvmName(name = "plusAssignAllAdditionalStorePackages")
        public final /* synthetic */ void plusAssignAllAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, Iterable<String> values) {
            p.e(dslList, "<this>");
            p.e(values, "values");
            addAllAdditionalStorePackages(dslList, values);
        }

        @JvmName(name = "plusAssignAllObservableAndroidActivities")
        public final /* synthetic */ void plusAssignAllObservableAndroidActivities(DslList<ByteString, ObservableAndroidActivitiesProxy> dslList, Iterable<? extends ByteString> values) {
            p.e(dslList, "<this>");
            p.e(values, "values");
            addAllObservableAndroidActivities(dslList, values);
        }

        @JvmName(name = "plusAssignObservableAndroidActivities")
        public final /* synthetic */ void plusAssignObservableAndroidActivities(DslList<ByteString, ObservableAndroidActivitiesProxy> dslList, ByteString value) {
            p.e(dslList, "<this>");
            p.e(value, "value");
            addObservableAndroidActivities(dslList, value);
        }

        @JvmName(name = "setAdOperations")
        public final void setAdOperations(@NotNull NativeConfigurationOuterClass.AdOperationsConfiguration value) {
            p.e(value, "value");
            this._builder.setAdOperations(value);
        }

        @JvmName(name = "setAdPolicy")
        public final void setAdPolicy(@NotNull NativeConfigurationOuterClass.RequestPolicy value) {
            p.e(value, "value");
            this._builder.setAdPolicy(value);
        }

        @JvmName(name = "setAdditionalStorePackages")
        public final /* synthetic */ void setAdditionalStorePackages(DslList dslList, int i10, String value) {
            p.e(dslList, "<this>");
            p.e(value, "value");
            this._builder.setAdditionalStorePackages(i10, value);
        }

        @JvmName(name = "setCachedAssetsConfiguration")
        public final void setCachedAssetsConfiguration(@NotNull NativeConfigurationOuterClass.CachedAssetsConfiguration value) {
            p.e(value, "value");
            this._builder.setCachedAssetsConfiguration(value);
        }

        @JvmName(name = "setCachedWebviewFilesConfiguration")
        public final void setCachedWebviewFilesConfiguration(@NotNull NativeConfigurationOuterClass.CachedAssetsConfiguration value) {
            p.e(value, "value");
            this._builder.setCachedWebviewFilesConfiguration(value);
        }

        @JvmName(name = "setDebugSettings")
        public final void setDebugSettings(@NotNull NativeConfigurationOuterClass.DebugSettings value) {
            p.e(value, "value");
            this._builder.setDebugSettings(value);
        }

        @JvmName(name = "setDefaultShowCompletionState")
        public final void setDefaultShowCompletionState(@NotNull NativeConfigurationOuterClass.ShowCompletionState value) {
            p.e(value, "value");
            this._builder.setDefaultShowCompletionState(value);
        }

        @JvmName(name = "setDefaultShowCompletionStateValue")
        public final void setDefaultShowCompletionStateValue(int i10) {
            this._builder.setDefaultShowCompletionStateValue(i10);
        }

        @JvmName(name = "setDiagnosticEvents")
        public final void setDiagnosticEvents(@NotNull NativeConfigurationOuterClass.DiagnosticEventsConfiguration value) {
            p.e(value, "value");
            this._builder.setDiagnosticEvents(value);
        }

        @JvmName(name = "setDownloadPolicy")
        public final void setDownloadPolicy(@NotNull NativeConfigurationOuterClass.RequestPolicy value) {
            p.e(value, "value");
            this._builder.setDownloadPolicy(value);
        }

        @JvmName(name = "setEnableIapEvent")
        public final void setEnableIapEvent(boolean z10) {
            this._builder.setEnableIapEvent(z10);
        }

        @JvmName(name = "setEnableOm")
        public final void setEnableOm(boolean z10) {
            this._builder.setEnableOm(z10);
        }

        @JvmName(name = "setFeatureFlags")
        public final void setFeatureFlags(@NotNull NativeConfigurationOuterClass.FeatureFlags value) {
            p.e(value, "value");
            this._builder.setFeatureFlags(value);
        }

        @JvmName(name = "setInitPolicy")
        public final void setInitPolicy(@NotNull NativeConfigurationOuterClass.RequestPolicy value) {
            p.e(value, "value");
            this._builder.setInitPolicy(value);
        }

        @JvmName(name = "setObservableAndroidActivities")
        public final /* synthetic */ void setObservableAndroidActivities(DslList dslList, int i10, ByteString value) {
            p.e(dslList, "<this>");
            p.e(value, "value");
            this._builder.setObservableAndroidActivities(i10, value);
        }

        @JvmName(name = "setOperativeEventPolicy")
        public final void setOperativeEventPolicy(@NotNull NativeConfigurationOuterClass.RequestPolicy value) {
            p.e(value, "value");
            this._builder.setOperativeEventPolicy(value);
        }

        @JvmName(name = "setOtherPolicy")
        public final void setOtherPolicy(@NotNull NativeConfigurationOuterClass.RequestPolicy value) {
            p.e(value, "value");
            this._builder.setOtherPolicy(value);
        }

        private Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
            this._builder = builder;
        }
    }

    private NativeConfigurationKt() {
    }
}
