package com.unity3d.services.core.di;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.datastore.core.c;
import androidx.datastore.core.d;
import androidx.datastore.core.e;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryAsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.r1;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.w1;
import l9.a;
import l9.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;
import z8.q;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u000f¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0011¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\u0011¢\u0006\u0004\b(\u0010&J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J%\u00105\u001a\u0002042\u0006\u0010/\u001a\u00020)2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202¢\u0006\u0004\b5\u00106J%\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020)2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202¢\u0006\u0004\b7\u00106J%\u00108\u001a\u0002042\u0006\u0010/\u001a\u00020)2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202¢\u0006\u0004\b8\u00106J%\u00109\u001a\u0002042\u0006\u0010/\u001a\u00020)2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202¢\u0006\u0004\b9\u00106J%\u0010:\u001a\u0002042\u0006\u0010/\u001a\u00020)2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202¢\u0006\u0004\b:\u00106J%\u0010;\u001a\u0002042\u0006\u0010/\u001a\u00020)2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202¢\u0006\u0004\b;\u00106J%\u0010<\u001a\u0002042\u0006\u0010/\u001a\u00020)2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202¢\u0006\u0004\b<\u00106J%\u0010=\u001a\u0002042\u0006\u0010/\u001a\u00020)2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202¢\u0006\u0004\b=\u00106J\u0015\u0010@\u001a\u0002022\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ#\u0010B\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\bB\u0010CJ#\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\bD\u0010CJ#\u0010E\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\bE\u0010CJ#\u0010F\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\bF\u0010CJ1\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\n0G¢\u0006\u0004\bI\u0010JJ#\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\bL\u0010CJ#\u0010M\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\bM\u0010CJ#\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\bO\u0010CJ\u001d\u0010T\u001a\u00020S2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020,¢\u0006\u0004\bT\u0010UJ\u0015\u0010Y\u001a\u00020X2\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bY\u0010ZJ\r\u0010[\u001a\u00020\u0006¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020\u0006¢\u0006\u0004\b]\u0010\\J\r\u0010^\u001a\u00020\u0006¢\u0006\u0004\b^\u0010\\J\r\u0010`\u001a\u00020_¢\u0006\u0004\b`\u0010aJ\u001b\u0010b\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\bb\u0010\u000eJ\u001b\u0010D\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\bD\u0010\u000eJ\u001b\u0010c\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\bc\u0010\u000eJ\u001b\u0010d\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\bd\u0010\u000eJ\u001b\u0010E\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\bE\u0010\u000eJ\u001b\u0010F\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\bF\u0010\u000eJ\u001b\u0010I\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\bI\u0010\u000eJ\u001b\u0010M\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\bM\u0010\u000eJ\u001d\u0010f\u001a\u00020e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020)¢\u0006\u0004\bf\u0010gJ\u001d\u0010i\u001a\u00020h2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020)¢\u0006\u0004\bi\u0010j¨\u0006k"}, d2 = {"Lcom/unity3d/services/core/di/UnityAdsModule;", "", "<init>", "()V", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "storageType", "Lcom/unity3d/services/core/misc/JsonStorage;", "provideJsonStorage", "(Lcom/unity3d/services/core/device/StorageManager$StorageType;)Lcom/unity3d/services/core/misc/JsonStorage;", "Landroidx/datastore/core/d;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "dataStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "provideByteStringDataSource", "(Landroidx/datastore/core/d;)Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "Landroid/content/Context;", "context", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "", "dataStoreFile", "provideByteStringDataStore", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/String;)Landroidx/datastore/core/d;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "getDefaultAdOperations", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "getDefaultRequestPolicy", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "getDefaultRequestRetryPolicy", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "getDefaultRequestTimeoutPolicy", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "androidContext", "()Landroid/content/Context;", "mainDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "ioDispatcher", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "sdkDispatchers", "()Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "sdkMetrics", "()Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "dispatchers", "Lkotlinx/coroutines/g0;", "errorHandler", "Lkotlinx/coroutines/r1;", "parentJob", "Lkotlinx/coroutines/j0;", "initCoroutineScope", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lkotlinx/coroutines/g0;Lkotlinx/coroutines/r1;)Lkotlinx/coroutines/j0;", "loadCoroutineScope", "showCoroutineScope", "transactionCoroutineScope", "getTokenCoroutineScope", "scarSignalsCoroutineScope", "offerwallSignalsCoroutineScope", "omidCoroutineScope", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "diagnosticEventRepository", "publicApiJob", "(Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;)Lkotlinx/coroutines/r1;", "gatewayDataStore", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;)Landroidx/datastore/core/d;", "privacyDataStore", "privacyFsmDataStore", "nativeConfigurationDataStore", "Landroidx/datastore/core/c;", "fetchGLInfo", "glInfoDataStore", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/datastore/core/c;)Landroidx/datastore/core/d;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "universalRequestDataStore", "iapTransactionDataStore", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "webViewConfigurationDataStore", "Lcom/unity3d/services/ads/token/TokenStorage;", "tokenStorage", "sdkMetricsSender", "Lcom/unity3d/services/ads/token/AsyncTokenStorage;", "asyncTokenStorage", "(Lcom/unity3d/services/ads/token/TokenStorage;Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;)Lcom/unity3d/services/ads/token/AsyncTokenStorage;", "Lcom/unity3d/services/core/device/VolumeChange;", "volumeChange", "Lcom/unity3d/services/core/device/VolumeChangeMonitor;", "volumeChangeMonitor", "(Lcom/unity3d/services/core/device/VolumeChange;)Lcom/unity3d/services/core/device/VolumeChangeMonitor;", "publicJsonStorage", "()Lcom/unity3d/services/core/misc/JsonStorage;", "privateJsonStorage", "memoryJsonStorage", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "defaultNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "gatewayCacheDataStore", "idfiDataStore", "auidDataStore", "Lcom/unity3d/services/ads/measurements/MeasurementsService;", "measurementService", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;)Lcom/unity3d/services/ads/measurements/MeasurementsService;", "Lcom/unity3d/services/ads/topics/TopicsService;", "topicsService", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;)Lcom/unity3d/services/ads/topics/TopicsService;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUnityAdsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnityAdsModule.kt\ncom/unity3d/services/core/di/UnityAdsModule\n+ 2 NativeConfigurationKt.kt\ngatewayprotocol/v1/NativeConfigurationKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DiagnosticEventsConfigurationKt.kt\ngatewayprotocol/v1/DiagnosticEventsConfigurationKtKt\n+ 5 FeatureFlagsKt.kt\ngatewayprotocol/v1/FeatureFlagsKtKt\n+ 6 AdOperationsConfigurationKt.kt\ngatewayprotocol/v1/AdOperationsConfigurationKtKt\n+ 7 RequestPolicyKt.kt\ngatewayprotocol/v1/RequestPolicyKtKt\n+ 8 RequestRetryPolicyKt.kt\ngatewayprotocol/v1/RequestRetryPolicyKtKt\n+ 9 RequestTimeoutPolicyKt.kt\ngatewayprotocol/v1/RequestTimeoutPolicyKtKt\n*L\n1#1,311:1\n10#2:312\n1#3:313\n1#3:315\n1#3:317\n1#3:319\n1#3:321\n1#3:323\n1#3:325\n10#4:314\n10#5:316\n10#6:318\n10#7:320\n10#8:322\n10#9:324\n*S KotlinDebug\n*F\n+ 1 UnityAdsModule.kt\ncom/unity3d/services/core/di/UnityAdsModule\n*L\n212#1:312\n212#1:313\n218#1:315\n224#1:317\n277#1:319\n285#1:321\n292#1:323\n303#1:325\n218#1:314\n224#1:316\n277#1:318\n285#1:320\n292#1:322\n303#1:324\n*E\n"})
/* loaded from: classes3.dex */
public final class UnityAdsModule {
    private final NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setLoadTimeoutMs(30000);
        dsl_create.setShowTimeoutMs(10000);
        dsl_create.setGetTokenTimeoutMs(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        RequestPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setRetryPolicy(getDefaultRequestRetryPolicy());
        dsl_create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        RequestRetryPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setMaxDuration(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        dsl_create.setRetryWaitBase(500);
        dsl_create.setRetryJitterPct(0.1f);
        dsl_create.setShouldStoreLocally(false);
        dsl_create.setRetryMaxInterval(2500);
        dsl_create.setRetryScalingFactor(2.0f);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        RequestTimeoutPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setConnectTimeoutMs(30000);
        dsl_create.setReadTimeoutMs(30000);
        dsl_create.setWriteTimeoutMs(30000);
        dsl_create.setOverallTimeoutMs(30000);
        return dsl_create._build();
    }

    private final ByteStringDataSource provideByteStringDataSource(d dataStore) {
        return new AndroidByteStringDataSource(dataStore);
    }

    private final d provideByteStringDataStore(final Context context, CoroutineDispatcher dispatcher, final String dataStoreFile) {
        return e.b(e.f2924a, new ByteStringSerializer(), null, null, k0.a(dispatcher.plus(n2.b(null, 1, null))), new a() { // from class: com.unity3d.services.core.di.UnityAdsModule.provideByteStringDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(context, dataStoreFile);
            }
        }, 4, null);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (!StorageManager.init(ClientProperties.getApplicationContext())) {
            throw new IllegalStateException("StorageManager failed to initialize");
        }
        Storage storage = StorageManager.getStorage(storageType);
        p.d(storage, "getStorage(storageType)");
        return storage;
    }

    @NotNull
    public final Context androidContext() {
        Context applicationContext = ClientProperties.getApplicationContext();
        p.d(applicationContext, "getApplicationContext()");
        return applicationContext;
    }

    @NotNull
    public final AsyncTokenStorage asyncTokenStorage(@NotNull TokenStorage tokenStorage, @NotNull SDKMetricsSender sdkMetricsSender) {
        p.e(tokenStorage, "tokenStorage");
        p.e(sdkMetricsSender, "sdkMetricsSender");
        return new InMemoryAsyncTokenStorage(null, new Handler(Looper.getMainLooper()), sdkMetricsSender, tokenStorage);
    }

    @NotNull
    public final ByteStringDataSource auidDataStore(@NotNull d dataStore) {
        p.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final CoroutineDispatcher defaultDispatcher() {
        return w0.a();
    }

    @NotNull
    public final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setAdOperations(getDefaultAdOperations());
        dsl_create.setInitPolicy(getDefaultRequestPolicy());
        dsl_create.setAdPolicy(getDefaultRequestPolicy());
        dsl_create.setOtherPolicy(getDefaultRequestPolicy());
        dsl_create.setOperativeEventPolicy(getDefaultRequestPolicy());
        DiagnosticEventsConfigurationKt.Dsl.Companion companion2 = DiagnosticEventsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builderNewBuilder2 = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        p.d(builderNewBuilder2, "newBuilder()");
        DiagnosticEventsConfigurationKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setEnabled(true);
        dsl_create2.setMaxBatchSize(10);
        dsl_create2.setMaxBatchIntervalMs(30000);
        dsl_create2.setTtmEnabled(false);
        dsl_create.setDiagnosticEvents(dsl_create2._build());
        FeatureFlagsKt.Dsl.Companion companion3 = FeatureFlagsKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.FeatureFlags.Builder builderNewBuilder3 = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        p.d(builderNewBuilder3, "newBuilder()");
        FeatureFlagsKt.Dsl dsl_create3 = companion3._create(builderNewBuilder3);
        dsl_create3.setBoldSdkNextSessionEnabled(true);
        dsl_create.setFeatureFlags(dsl_create3._build());
        return dsl_create._build();
    }

    @NotNull
    public final ByteStringDataSource gatewayCacheDataStore(@NotNull d dataStore) {
        p.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final d gatewayDataStore(@NotNull Context context, @NotNull CoroutineDispatcher dispatcher) {
        p.e(context, "context");
        p.e(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    @NotNull
    public final j0 getTokenCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull g0 errorHandler, @NotNull r1 parentJob) {
        p.e(dispatchers, "dispatchers");
        p.e(errorHandler, "errorHandler");
        p.e(parentJob, "parentJob");
        return k0.a(parentJob.plus(dispatchers.getDefault()).plus(new i0(ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final d glInfoDataStore(@NotNull final Context context, @NotNull CoroutineDispatcher dispatcher, @NotNull c fetchGLInfo) {
        p.e(context, "context");
        p.e(dispatcher, "dispatcher");
        p.e(fetchGLInfo, "fetchGLInfo");
        return e.b(e.f2924a, new ByteStringSerializer(), null, q.e(fetchGLInfo), k0.a(dispatcher.plus(n2.b(null, 1, null))), new a() { // from class: com.unity3d.services.core.di.UnityAdsModule.glInfoDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(context, ServiceProvider.DATA_STORE_GL_INFO);
            }
        }, 2, null);
    }

    @NotNull
    public final d iapTransactionDataStore(@NotNull Context context, @NotNull CoroutineDispatcher dispatcher) {
        p.e(context, "context");
        p.e(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    @NotNull
    public final ByteStringDataSource idfiDataStore(@NotNull d dataStore) {
        p.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final j0 initCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull g0 errorHandler, @NotNull r1 parentJob) {
        p.e(dispatchers, "dispatchers");
        p.e(errorHandler, "errorHandler");
        p.e(parentJob, "parentJob");
        return k0.a(parentJob.plus(dispatchers.getDefault()).plus(new i0(ServiceProvider.NAMED_INIT_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final CoroutineDispatcher ioDispatcher() {
        return w0.b();
    }

    @NotNull
    public final j0 loadCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull g0 errorHandler, @NotNull r1 parentJob) {
        p.e(dispatchers, "dispatchers");
        p.e(errorHandler, "errorHandler");
        p.e(parentJob, "parentJob");
        return k0.a(parentJob.plus(dispatchers.getDefault()).plus(new i0(ServiceProvider.NAMED_LOAD_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final CoroutineDispatcher mainDispatcher() {
        return w0.c();
    }

    @NotNull
    public final MeasurementsService measurementService(@NotNull Context context, @NotNull ISDKDispatchers dispatchers) {
        p.e(context, "context");
        p.e(dispatchers, "dispatchers");
        return new MeasurementsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    @NotNull
    public final JsonStorage memoryJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.MEMORY);
    }

    @NotNull
    public final d nativeConfigurationDataStore(@NotNull Context context, @NotNull CoroutineDispatcher dispatcher) {
        p.e(context, "context");
        p.e(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    @NotNull
    public final j0 offerwallSignalsCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull g0 errorHandler, @NotNull r1 parentJob) {
        p.e(dispatchers, "dispatchers");
        p.e(errorHandler, "errorHandler");
        p.e(parentJob, "parentJob");
        return k0.a(parentJob.plus(dispatchers.getDefault()).plus(new i0(ServiceProvider.NAMED_OFFERWALL_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final j0 omidCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull g0 errorHandler, @NotNull r1 parentJob) {
        p.e(dispatchers, "dispatchers");
        p.e(errorHandler, "errorHandler");
        p.e(parentJob, "parentJob");
        return k0.a(parentJob.plus(dispatchers.getDefault()).plus(new i0(ServiceProvider.NAMED_OMID_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final d privacyDataStore(@NotNull Context context, @NotNull CoroutineDispatcher dispatcher) {
        p.e(context, "context");
        p.e(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY);
    }

    @NotNull
    public final d privacyFsmDataStore(@NotNull Context context, @NotNull CoroutineDispatcher dispatcher) {
        p.e(context, "context");
        p.e(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    @NotNull
    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    @NotNull
    public final r1 publicApiJob(@NotNull final DiagnosticEventRepository diagnosticEventRepository) {
        p.e(diagnosticEventRepository, "diagnosticEventRepository");
        a0 a0VarB = w1.b(null, 1, null);
        a0VarB.U(new l() { // from class: com.unity3d.services.core.di.UnityAdsModule$publicApiJob$1$1
            {
                super(1);
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return s.f25199a;
            }

            public final void invoke(@Nullable Throwable th) {
                diagnosticEventRepository.flush();
            }
        });
        return a0VarB;
    }

    @NotNull
    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    @NotNull
    public final j0 scarSignalsCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull g0 errorHandler, @NotNull r1 parentJob) {
        p.e(dispatchers, "dispatchers");
        p.e(errorHandler, "errorHandler");
        p.e(parentJob, "parentJob");
        return k0.a(parentJob.plus(dispatchers.getDefault()).plus(new i0(ServiceProvider.NAMED_SCAR_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    @NotNull
    public final SDKMetricsSender sdkMetrics() {
        SDKMetricsSender sDKMetrics = SDKMetrics.getInstance();
        p.d(sDKMetrics, "getInstance()");
        return sDKMetrics;
    }

    @NotNull
    public final j0 showCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull g0 errorHandler, @NotNull r1 parentJob) {
        p.e(dispatchers, "dispatchers");
        p.e(errorHandler, "errorHandler");
        p.e(parentJob, "parentJob");
        return k0.a(parentJob.plus(dispatchers.getDefault()).plus(new i0(ServiceProvider.NAMED_SHOW_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final TopicsService topicsService(@NotNull Context context, @NotNull ISDKDispatchers dispatchers) {
        p.e(context, "context");
        p.e(dispatchers, "dispatchers");
        return new TopicsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    @NotNull
    public final j0 transactionCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull g0 errorHandler, @NotNull r1 parentJob) {
        p.e(dispatchers, "dispatchers");
        p.e(errorHandler, "errorHandler");
        p.e(parentJob, "parentJob");
        return k0.a(parentJob.plus(dispatchers.getDefault()).plus(new i0(ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final d universalRequestDataStore(@NotNull final Context context, @NotNull CoroutineDispatcher dispatcher) {
        p.e(context, "context");
        p.e(dispatcher, "dispatcher");
        return e.b(e.f2924a, new UniversalRequestStoreSerializer(), null, null, k0.a(dispatcher.plus(n2.b(null, 1, null))), new a() { // from class: com.unity3d.services.core.di.UnityAdsModule.universalRequestDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(context, ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
            }
        }, 4, null);
    }

    @NotNull
    public final VolumeChangeMonitor volumeChangeMonitor(@NotNull VolumeChange volumeChange) {
        p.e(volumeChange, "volumeChange");
        return new VolumeChangeMonitor(SharedInstances.INSTANCE.getWebViewEventSender(), volumeChange);
    }

    @NotNull
    public final d webViewConfigurationDataStore(@NotNull final Context context, @NotNull CoroutineDispatcher dispatcher) {
        p.e(context, "context");
        p.e(dispatcher, "dispatcher");
        return e.b(e.f2924a, new WebViewConfigurationStoreSerializer(), null, null, k0.a(dispatcher.plus(n2.b(null, 1, null))), new a() { // from class: com.unity3d.services.core.di.UnityAdsModule.webViewConfigurationDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(context, ServiceProvider.DATA_STORE_WEBVIEW_CONFIG);
            }
        }, 4, null);
    }

    @NotNull
    public final ByteStringDataSource iapTransactionDataStore(@NotNull d dataStore) {
        p.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource nativeConfigurationDataStore(@NotNull d dataStore) {
        p.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource privacyDataStore(@NotNull d dataStore) {
        p.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource privacyFsmDataStore(@NotNull d dataStore) {
        p.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource glInfoDataStore(@NotNull d dataStore) {
        p.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }
}
