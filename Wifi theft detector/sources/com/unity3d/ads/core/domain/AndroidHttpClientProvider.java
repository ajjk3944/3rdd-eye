package com.unity3d.ads.core.domain;

import android.content.Context;
import c9.c;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import d9.e;
import i9.i;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.o;
import kotlinx.coroutines.sync.b;
import okhttp3.OkHttpClient;
import org.chromium.net.CronetEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z8.h0;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00160,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHttpClientProvider;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;", "configFileFromLocalStorage", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "alternativeFlowReader", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Landroid/content/Context;", "context", "Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "cronetEngineBuilderFactory", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "cleanupDirectory", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "mediationTraitsMetadataReader", "<init>", "(Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Landroid/content/Context;Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/services/core/network/domain/CleanupDirectory;Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;)V", "Lcom/unity3d/services/core/network/core/HttpClient;", "buildNetworkClient", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lc9/c;)Ljava/lang/Object;", "", "buildCronetCachePath", "(Landroid/content/Context;)Ljava/lang/String;", "", "gatewaySpecific", "invoke", "(ZLc9/c;)Ljava/lang/Object;", "Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Landroid/content/Context;", "Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "Lkotlinx/coroutines/sync/a;", "httpClientMutex", "Lkotlinx/coroutines/sync/a;", "", "cacheHttpClientMap", "Ljava/util/Map;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidHttpClientProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidHttpClientProvider.kt\ncom/unity3d/ads/core/domain/AndroidHttpClientProvider\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,171:1\n107#2,10:172\n314#3,11:182\n*S KotlinDebug\n*F\n+ 1 AndroidHttpClientProvider.kt\ncom/unity3d/ads/core/domain/AndroidHttpClientProvider\n*L\n59#1:172,10\n127#1:182,11\n*E\n"})
/* loaded from: classes3.dex */
public final class AndroidHttpClientProvider implements HttpClientProvider {

    @NotNull
    private final AlternativeFlowReader alternativeFlowReader;

    @NotNull
    private final Map<Boolean, HttpClient> cacheHttpClientMap;

    @NotNull
    private final CleanupDirectory cleanupDirectory;

    @NotNull
    private final ConfigFileFromLocalStorage configFileFromLocalStorage;

    @NotNull
    private final Context context;

    @NotNull
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final kotlinx.coroutines.sync.a httpClientMutex;

    @NotNull
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {177, 78}, m = "invoke", n = {"this", "$this$withLock_u24default$iv", "gatewaySpecific", "this", "$this$withLock_u24default$iv", "gatewaySpecific", "startTime", "usingRefactoredGatewayClient"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0", "J$0", "I$0"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHttpClientProvider.this.invoke(false, this);
        }
    }

    public AndroidHttpClientProvider(@NotNull ConfigFileFromLocalStorage configFileFromLocalStorage, @NotNull AlternativeFlowReader alternativeFlowReader, @NotNull ISDKDispatchers dispatchers, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull Context context, @NotNull CronetEngineBuilderFactory cronetEngineBuilderFactory, @NotNull SessionRepository sessionRepository, @NotNull CleanupDirectory cleanupDirectory, @NotNull MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        p.e(configFileFromLocalStorage, "configFileFromLocalStorage");
        p.e(alternativeFlowReader, "alternativeFlowReader");
        p.e(dispatchers, "dispatchers");
        p.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        p.e(context, "context");
        p.e(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        p.e(sessionRepository, "sessionRepository");
        p.e(cleanupDirectory, "cleanupDirectory");
        p.e(mediationTraitsMetadataReader, "mediationTraitsMetadataReader");
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.alternativeFlowReader = alternativeFlowReader;
        this.dispatchers = dispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
        this.httpClientMutex = b.b(false, 1, null);
        this.cacheHttpClientMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildCronetCachePath(Context context) {
        File filesDir = context.getFilesDir();
        p.d(filesDir, "context.filesDir");
        File fileV = i.v(filesDir, UnityAdsConstants.DefaultUrls.HTTP_CACHE_DIR_NAME);
        if (!fileV.exists()) {
            fileV.mkdirs();
        }
        String absolutePath = fileV.getAbsolutePath();
        p.d(absolutePath, "cacheDir.absolutePath");
        return absolutePath;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, c cVar) {
        final kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        pVar.F();
        CronetProviderInstaller.installProvider(context).addOnCompleteListener(new OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(@NotNull Task<Void> it) {
                String str;
                String message;
                long maxCachedAssetSizeMb;
                p.e(it, "it");
                str = "Errored without message.";
                if (!it.isSuccessful()) {
                    SendDiagnosticEvent sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                    Exception exception = it.getException();
                    if (exception != null && (message = exception.getMessage()) != null) {
                        str = message;
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_cronet_install_error", null, h0.f(y8.i.a("reason", str)), null, null, null, 58, null);
                    o oVar = pVar;
                    Result.Companion companion = Result.INSTANCE;
                    oVar.resumeWith(Result.b(new OkHttp3Client(iSDKDispatchers, new OkHttpClient(), context, this.this$0.sessionRepository, this.this$0.cleanupDirectory, this.this$0.alternativeFlowReader)));
                    return;
                }
                if (this.this$0.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                    long j10 = 1024;
                    maxCachedAssetSizeMb = this.this$0.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration().getMaxCachedAssetSizeMb() * j10 * j10;
                } else {
                    maxCachedAssetSizeMb = ServiceProvider.HTTP_CACHE_DISK_SIZE;
                }
                try {
                    CronetEngine cronetEngine = this.this$0.cronetEngineBuilderFactory.createCronetEngineBuilder(context).setStoragePath(this.this$0.buildCronetCachePath(context)).enableHttpCache(3, maxCachedAssetSizeMb).enableQuic(true).addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443).addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443).build();
                    o oVar2 = pVar;
                    Result.Companion companion2 = Result.INSTANCE;
                    p.d(cronetEngine, "cronetEngine");
                    oVar2.resumeWith(Result.b(new CronetClient(cronetEngine, iSDKDispatchers)));
                } catch (Throwable th) {
                    SendDiagnosticEvent sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                    String message2 = th.getMessage();
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_cronet_engine_error", null, h0.f(y8.i.a("reason", message2 != null ? message2 : "Errored without message.")), null, null, null, 58, null);
                    o oVar3 = pVar;
                    Result.Companion companion3 = Result.INSTANCE;
                    oVar3.resumeWith(Result.b(new OkHttp3Client(iSDKDispatchers, new OkHttpClient(), context, this.this$0.sessionRepository, this.this$0.cleanupDirectory, this.this$0.alternativeFlowReader)));
                }
            }
        });
        Object objW = pVar.w();
        if (objW == kotlin.coroutines.intrinsics.a.f()) {
            e.c(cVar);
        }
        return objW;
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x016c: INVOKE (r8 I:kotlinx.coroutines.sync.a), (r7 I:java.lang.Object) INTERFACE call: kotlinx.coroutines.sync.a.b(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:365), block:B:64:0x016c */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:42:0x00e0, B:44:0x00e4, B:49:0x00ef, B:51:0x010c, B:61:0x015f, B:24:0x0071, B:27:0x0081, B:29:0x0099, B:35:0x00a7, B:37:0x00b7, B:38:0x00c2, B:53:0x0127, B:55:0x0134, B:57:0x013a, B:59:0x0140, B:60:0x0158), top: B:66:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:42:0x00e0, B:44:0x00e4, B:49:0x00ef, B:51:0x010c, B:61:0x015f, B:24:0x0071, B:27:0x0081, B:29:0x0099, B:35:0x00a7, B:37:0x00b7, B:38:0x00c2, B:53:0x0127, B:55:0x0134, B:57:0x013a, B:59:0x0140, B:60:0x0158), top: B:66:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(boolean r19, @org.jetbrains.annotations.NotNull c9.c r20) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke(boolean, c9.c):java.lang.Object");
    }
}
