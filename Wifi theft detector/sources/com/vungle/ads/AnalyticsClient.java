package com.vungle.ads;

import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.applovin.sdk.AppLovinEventTypes;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.p;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class AnalyticsClient {
    private static final int MAX_BATCH_SIZE = 20;
    private static final long REFRESH_TIME_MILLIS = 5000;

    @NotNull
    private static final String TAG = "AnalyticsClient";

    @Nullable
    private static VungleThreadPoolExecutor executor;
    private static boolean metricsEnabled;

    @Nullable
    private static VungleApiClient vungleApiClient;

    @NotNull
    public static final AnalyticsClient INSTANCE = new AnalyticsClient();

    @NotNull
    private static final BlockingQueue<Sdk$SDKError.a> errors = new LinkedBlockingQueue();

    @NotNull
    private static final BlockingQueue<Sdk$SDKMetric.a> metrics = new LinkedBlockingQueue();

    @NotNull
    private static final BlockingQueue<Sdk$SDKError.a> pendingErrors = new LinkedBlockingQueue();

    @NotNull
    private static final BlockingQueue<Sdk$SDKMetric.a> pendingMetrics = new LinkedBlockingQueue();

    @NotNull
    private static LogLevel logLevel = LogLevel.ERROR_LOG_LEVEL_ERROR;
    private static boolean refreshEnabled = true;

    @NotNull
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/AnalyticsClient$LogLevel;", "", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "<init>", "(Ljava/lang/String;II)V", "I", "getLevel", "()I", "Companion", "a", "ERROR_LOG_LEVEL_OFF", "ERROR_LOG_LEVEL_ERROR", "ERROR_LOG_LEVEL_DEBUG", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum LogLevel {
        ERROR_LOG_LEVEL_OFF(0),
        ERROR_LOG_LEVEL_ERROR(1),
        ERROR_LOG_LEVEL_DEBUG(2);


        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int level;

        /* renamed from: com.vungle.ads.AnalyticsClient$LogLevel$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final LogLevel fromValue(int i10) {
                LogLevel logLevel = LogLevel.ERROR_LOG_LEVEL_DEBUG;
                if (i10 == logLevel.getLevel()) {
                    return logLevel;
                }
                LogLevel logLevel2 = LogLevel.ERROR_LOG_LEVEL_ERROR;
                if (i10 != logLevel2.getLevel()) {
                    LogLevel logLevel3 = LogLevel.ERROR_LOG_LEVEL_OFF;
                    if (i10 == logLevel3.getLevel()) {
                        return logLevel3;
                    }
                }
                return logLevel2;
            }

            private Companion() {
            }
        }

        LogLevel(int i10) {
            this.level = i10;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    public interface a {
        void onFailure();

        void onSuccess();
    }

    public static final class b implements a {
        final /* synthetic */ BlockingQueue<Sdk$SDKError.a> $currentSendingErrors;

        public b(BlockingQueue<Sdk$SDKError.a> blockingQueue) {
            this.$currentSendingErrors = blockingQueue;
        }

        @Override // com.vungle.ads.AnalyticsClient.a
        public void onFailure() {
            com.vungle.ads.internal.util.p.Companion.d(AnalyticsClient.TAG, "Failed to send " + this.$currentSendingErrors.size() + " errors");
            AnalyticsClient.INSTANCE.getErrors$vungle_ads_release().addAll(this.$currentSendingErrors);
        }

        @Override // com.vungle.ads.AnalyticsClient.a
        public void onSuccess() {
            com.vungle.ads.internal.util.p.Companion.d(AnalyticsClient.TAG, "Sent " + this.$currentSendingErrors.size() + " errors");
        }
    }

    public static final class c implements a {
        final /* synthetic */ BlockingQueue<Sdk$SDKMetric.a> $currentSendingMetrics;

        public c(BlockingQueue<Sdk$SDKMetric.a> blockingQueue) {
            this.$currentSendingMetrics = blockingQueue;
        }

        @Override // com.vungle.ads.AnalyticsClient.a
        public void onFailure() {
            com.vungle.ads.internal.util.p.Companion.d(AnalyticsClient.TAG, "Failed to send " + this.$currentSendingMetrics.size() + " metrics");
            AnalyticsClient.INSTANCE.getMetrics$vungle_ads_release().addAll(this.$currentSendingMetrics);
        }

        @Override // com.vungle.ads.AnalyticsClient.a
        public void onSuccess() {
            com.vungle.ads.internal.util.p.Companion.d(AnalyticsClient.TAG, "Sent " + this.$currentSendingMetrics.size() + " metrics");
        }
    }

    private AnalyticsClient() {
    }

    @WorkerThread
    private final void flushErrors() {
        VungleApiClient vungleApiClient2;
        p.a aVar = com.vungle.ads.internal.util.p.Companion;
        StringBuilder sb = new StringBuilder();
        sb.append("Sending ");
        BlockingQueue<Sdk$SDKError.a> blockingQueue = errors;
        sb.append(blockingQueue.size());
        sb.append(" errors");
        aVar.d(TAG, sb.toString());
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (vungleApiClient2 = vungleApiClient) == null) {
            return;
        }
        vungleApiClient2.reportErrors(linkedBlockingQueue, new b(linkedBlockingQueue));
    }

    @WorkerThread
    private final void flushMetrics() {
        VungleApiClient vungleApiClient2;
        p.a aVar = com.vungle.ads.internal.util.p.Companion;
        StringBuilder sb = new StringBuilder();
        sb.append("Sending ");
        BlockingQueue<Sdk$SDKMetric.a> blockingQueue = metrics;
        sb.append(blockingQueue.size());
        sb.append(" metrics");
        aVar.d(TAG, sb.toString());
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (vungleApiClient2 = vungleApiClient) == null) {
            return;
        }
        vungleApiClient2.reportMetrics(linkedBlockingQueue, new c(linkedBlockingQueue));
    }

    private final Sdk$SDKMetric.a genMetric(Sdk$SDKMetric.SDKMetricType sDKMetricType, long j10, com.vungle.ads.internal.util.o oVar, String str) {
        String placementRefId$vungle_ads_release;
        String creativeId$vungle_ads_release;
        String eventId$vungle_ads_release;
        String headerUa;
        String adSource$vungle_ads_release;
        Boolean adoEnabled$vungle_ads_release;
        Boolean partialDownloadEnabled$vungle_ads_release;
        String vmVersion$vungle_ads_release;
        Sdk$SDKMetric.a value = Sdk$SDKMetric.newBuilder().setType(sDKMetricType).setValue(j10);
        String str2 = Build.MANUFACTURER;
        Sdk$SDKMetric.a osVersion = value.setMake(str2).setModel(Build.MODEL).setOs(kotlin.jvm.internal.p.a("Amazon", str2) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT));
        String str3 = "";
        if (oVar == null || (placementRefId$vungle_ads_release = oVar.getPlacementRefId$vungle_ads_release()) == null) {
            placementRefId$vungle_ads_release = "";
        }
        Sdk$SDKMetric.a placementReferenceId = osVersion.setPlacementReferenceId(placementRefId$vungle_ads_release);
        if (oVar == null || (creativeId$vungle_ads_release = oVar.getCreativeId$vungle_ads_release()) == null) {
            creativeId$vungle_ads_release = "";
        }
        Sdk$SDKMetric.a creativeId = placementReferenceId.setCreativeId(creativeId$vungle_ads_release);
        if (oVar == null || (eventId$vungle_ads_release = oVar.getEventId$vungle_ads_release()) == null) {
            eventId$vungle_ads_release = "";
        }
        Sdk$SDKMetric.a eventId = creativeId.setEventId(eventId$vungle_ads_release);
        if (str == null) {
            str = "";
        }
        Sdk$SDKMetric.a meta = eventId.setMeta(str);
        if (oVar == null || (headerUa = oVar.getMediationName$vungle_ads_release()) == null) {
            headerUa = com.vungle.ads.internal.network.j.INSTANCE.getHeaderUa();
        }
        Sdk$SDKMetric.a mediationName = meta.setMediationName(headerUa);
        if (oVar == null || (adSource$vungle_ads_release = oVar.getAdSource$vungle_ads_release()) == null) {
            adSource$vungle_ads_release = "";
        }
        Sdk$SDKMetric.a adSource = mediationName.setAdSource(adSource$vungle_ads_release);
        if (oVar != null && (vmVersion$vungle_ads_release = oVar.getVmVersion$vungle_ads_release()) != null) {
            str3 = vmVersion$vungle_ads_release;
        }
        Sdk$SDKMetric.a appState = adSource.setVmVersion(str3).setAppState(com.vungle.ads.internal.util.a.Companion.isForeground() ? 0L : 2L);
        if (oVar != null && (partialDownloadEnabled$vungle_ads_release = oVar.getPartialDownloadEnabled$vungle_ads_release()) != null) {
            appState.setIsPartialDownloadEnabled(partialDownloadEnabled$vungle_ads_release.booleanValue());
        }
        if (oVar != null && (adoEnabled$vungle_ads_release = oVar.getAdoEnabled$vungle_ads_release()) != null) {
            appState.setIsAdoEnabled(adoEnabled$vungle_ads_release.booleanValue());
        }
        kotlin.jvm.internal.p.d(appState, "newBuilder()\n           …abled(it) }\n            }");
        return appState;
    }

    public static /* synthetic */ Sdk$SDKMetric.a genMetric$default(AnalyticsClient analyticsClient, Sdk$SDKMetric.SDKMetricType sDKMetricType, long j10, com.vungle.ads.internal.util.o oVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return analyticsClient.genMetric(sDKMetricType, j10, (i10 & 4) != 0 ? null : oVar, (i10 & 8) != 0 ? null : str);
    }

    private final Sdk$SDKError.a genSDKError(Sdk$SDKError.Reason reason, String str, com.vungle.ads.internal.util.o oVar) {
        String placementRefId$vungle_ads_release;
        String creativeId$vungle_ads_release;
        String eventId$vungle_ads_release;
        String adSource$vungle_ads_release;
        String headerUa;
        Boolean adoEnabled$vungle_ads_release;
        Boolean partialDownloadEnabled$vungle_ads_release;
        String vmVersion$vungle_ads_release;
        Sdk$SDKError.a aVarNewBuilder = Sdk$SDKError.newBuilder();
        String str2 = Build.MANUFACTURER;
        Sdk$SDKError.a at = aVarNewBuilder.setOs(kotlin.jvm.internal.p.a("Amazon", str2) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT)).setMake(str2).setModel(Build.MODEL).setReason(reason).setMessage(str).setAt(System.currentTimeMillis());
        String str3 = "";
        if (oVar == null || (placementRefId$vungle_ads_release = oVar.getPlacementRefId$vungle_ads_release()) == null) {
            placementRefId$vungle_ads_release = "";
        }
        Sdk$SDKError.a placementReferenceId = at.setPlacementReferenceId(placementRefId$vungle_ads_release);
        if (oVar == null || (creativeId$vungle_ads_release = oVar.getCreativeId$vungle_ads_release()) == null) {
            creativeId$vungle_ads_release = "";
        }
        Sdk$SDKError.a creativeId = placementReferenceId.setCreativeId(creativeId$vungle_ads_release);
        if (oVar == null || (eventId$vungle_ads_release = oVar.getEventId$vungle_ads_release()) == null) {
            eventId$vungle_ads_release = "";
        }
        Sdk$SDKError.a eventId = creativeId.setEventId(eventId$vungle_ads_release);
        if (oVar == null || (adSource$vungle_ads_release = oVar.getAdSource$vungle_ads_release()) == null) {
            adSource$vungle_ads_release = "";
        }
        Sdk$SDKError.a adSource = eventId.setAdSource(adSource$vungle_ads_release);
        if (oVar != null && (vmVersion$vungle_ads_release = oVar.getVmVersion$vungle_ads_release()) != null) {
            str3 = vmVersion$vungle_ads_release;
        }
        Sdk$SDKError.a vmVersion = adSource.setVmVersion(str3);
        if (oVar == null || (headerUa = oVar.getMediationName$vungle_ads_release()) == null) {
            headerUa = com.vungle.ads.internal.network.j.INSTANCE.getHeaderUa();
        }
        Sdk$SDKError.a appState = vmVersion.setMediationName(headerUa).setAppState(com.vungle.ads.internal.util.a.Companion.isForeground() ? 0L : 2L);
        if (oVar != null && (partialDownloadEnabled$vungle_ads_release = oVar.getPartialDownloadEnabled$vungle_ads_release()) != null) {
            appState.setIsPartialDownloadEnabled(partialDownloadEnabled$vungle_ads_release.booleanValue());
        }
        if (oVar != null && (adoEnabled$vungle_ads_release = oVar.getAdoEnabled$vungle_ads_release()) != null) {
            appState.setIsAdoEnabled(adoEnabled$vungle_ads_release.booleanValue());
        }
        kotlin.jvm.internal.p.d(appState, "newBuilder()\n           …abled(it) }\n            }");
        return appState;
    }

    public static /* synthetic */ Sdk$SDKError.a genSDKError$default(AnalyticsClient analyticsClient, Sdk$SDKError.Reason reason, String str, com.vungle.ads.internal.util.o oVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            oVar = null;
        }
        return analyticsClient.genSDKError(reason, str, oVar);
    }

    @VisibleForTesting
    public static /* synthetic */ void getErrors$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExecutor$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMetrics$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMetricsEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPendingErrors$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPendingMetrics$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initOrUpdate$lambda-1, reason: not valid java name */
    public static final void m250initOrUpdate$lambda1(VungleThreadPoolExecutor executor2) {
        kotlin.jvm.internal.p.e(executor2, "$executor");
        executor2.execute(new Runnable() { // from class: com.vungle.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                AnalyticsClient.m251initOrUpdate$lambda1$lambda0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initOrUpdate$lambda-1$lambda-0, reason: not valid java name */
    public static final void m251initOrUpdate$lambda1$lambda0() {
        INSTANCE.report();
    }

    @VisibleForTesting
    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: logError$lambda-2, reason: not valid java name */
    public static final void m252logError$lambda2(Sdk$SDKError.Reason reason, String message, com.vungle.ads.internal.util.o oVar) {
        kotlin.jvm.internal.p.e(reason, "$reason");
        kotlin.jvm.internal.p.e(message, "$message");
        INSTANCE.logErrorInSameThread(reason, message, oVar);
    }

    public static /* synthetic */ void logError$vungle_ads_release$default(AnalyticsClient analyticsClient, Sdk$SDKError.Reason reason, String str, com.vungle.ads.internal.util.o oVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            oVar = null;
        }
        analyticsClient.logError$vungle_ads_release(reason, str, oVar);
    }

    private final synchronized void logErrorInSameThread(final Sdk$SDKError.Reason reason, final String str, com.vungle.ads.internal.util.o oVar) {
        if (logLevel == LogLevel.ERROR_LOG_LEVEL_OFF) {
            return;
        }
        try {
            final Sdk$SDKError.a aVarGenSDKError = genSDKError(reason, str, oVar);
            BlockingQueue<Sdk$SDKError.a> blockingQueue = errors;
            blockingQueue.put(aVarGenSDKError);
            com.vungle.ads.internal.util.p.Companion.w(TAG, new l9.a() { // from class: com.vungle.ads.AnalyticsClient.logErrorInSameThread.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // l9.a
                @NotNull
                public final String invoke() {
                    return "Logging error: " + reason + " with message: " + str + ", mediation: " + aVarGenSDKError.getMediationName();
                }
            });
            if (blockingQueue.size() >= 20) {
                report();
            }
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Cannot logError", e10);
        }
    }

    public static /* synthetic */ void logErrorInSameThread$default(AnalyticsClient analyticsClient, Sdk$SDKError.Reason reason, String str, com.vungle.ads.internal.util.o oVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            oVar = null;
        }
        analyticsClient.logErrorInSameThread(reason, str, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: logMetric$lambda-6, reason: not valid java name */
    public static final void m253logMetric$lambda6(Sdk$SDKMetric.SDKMetricType metricType, long j10, com.vungle.ads.internal.util.o oVar, String str) throws Throwable {
        kotlin.jvm.internal.p.e(metricType, "$metricType");
        INSTANCE.logMetricInSameThread(metricType, j10, oVar, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, Sdk$SDKMetric.SDKMetricType sDKMetricType, long j10, com.vungle.ads.internal.util.o oVar, String str, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        analyticsClient.logMetric$vungle_ads_release(sDKMetricType, j10, (i10 & 4) != 0 ? null : oVar, (i10 & 8) != 0 ? null : str);
    }

    private final synchronized void logMetricInSameThread(final Sdk$SDKMetric.SDKMetricType sDKMetricType, final long j10, final com.vungle.ads.internal.util.o oVar, String str) throws Throwable {
        final Sdk$SDKMetric.a aVarGenMetric;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (metricsEnabled) {
                try {
                    aVarGenMetric = genMetric(sDKMetricType, j10, oVar, str);
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    BlockingQueue<Sdk$SDKMetric.a> blockingQueue = metrics;
                    blockingQueue.put(aVarGenMetric);
                    com.vungle.ads.internal.util.p.Companion.w(TAG, new l9.a() { // from class: com.vungle.ads.AnalyticsClient.logMetricInSameThread.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // l9.a
                        @NotNull
                        public final String invoke() {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Logging Metric ");
                            sb.append(sDKMetricType);
                            sb.append(" with value ");
                            sb.append(j10);
                            sb.append(" for placement ");
                            com.vungle.ads.internal.util.o oVar2 = oVar;
                            sb.append(oVar2 != null ? oVar2.getPlacementRefId$vungle_ads_release() : null);
                            sb.append(" mediation:");
                            sb.append(aVarGenMetric.getMediationName());
                            return sb.toString();
                        }
                    });
                    if (blockingQueue.size() >= 20) {
                        report();
                    }
                } catch (Exception e11) {
                    e = e11;
                    com.vungle.ads.internal.util.p.Companion.e(TAG, "Cannot logMetrics", e);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public static /* synthetic */ void logMetricInSameThread$default(AnalyticsClient analyticsClient, Sdk$SDKMetric.SDKMetricType sDKMetricType, long j10, com.vungle.ads.internal.util.o oVar, String str, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        analyticsClient.logMetricInSameThread(sDKMetricType, j10, (i10 & 4) != 0 ? null : oVar, (i10 & 8) != 0 ? null : str);
    }

    private final synchronized void report() {
        try {
            if (logLevel != LogLevel.ERROR_LOG_LEVEL_OFF && errors.size() > 0) {
                flushErrors();
            }
            if (metricsEnabled && metrics.size() > 0) {
                flushMetrics();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    public final BlockingQueue<Sdk$SDKError.a> getErrors$vungle_ads_release() {
        return errors;
    }

    @Nullable
    public final VungleThreadPoolExecutor getExecutor$vungle_ads_release() {
        return executor;
    }

    @NotNull
    public final BlockingQueue<Sdk$SDKMetric.a> getMetrics$vungle_ads_release() {
        return metrics;
    }

    public final boolean getMetricsEnabled$vungle_ads_release() {
        return metricsEnabled;
    }

    @NotNull
    public final BlockingQueue<Sdk$SDKError.a> getPendingErrors$vungle_ads_release() {
        return pendingErrors;
    }

    @NotNull
    public final BlockingQueue<Sdk$SDKMetric.a> getPendingMetrics$vungle_ads_release() {
        return pendingMetrics;
    }

    public final boolean getRefreshEnabled$vungle_ads_release() {
        return refreshEnabled;
    }

    @Nullable
    public final VungleApiClient getVungleApiClient$vungle_ads_release() {
        return vungleApiClient;
    }

    public final synchronized void initOrUpdate$vungle_ads_release(@NotNull VungleApiClient vungleApiClient2, @NotNull final VungleThreadPoolExecutor executor2, int i10, boolean z10) {
        try {
            kotlin.jvm.internal.p.e(vungleApiClient2, "vungleApiClient");
            kotlin.jvm.internal.p.e(executor2, "executor");
            logLevel = LogLevel.INSTANCE.fromValue(i10);
            metricsEnabled = z10;
            if (i10 == LogLevel.ERROR_LOG_LEVEL_DEBUG.getLevel()) {
                com.vungle.ads.internal.util.p.Companion.enable(true);
            } else if (i10 == LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel() || i10 == LogLevel.ERROR_LOG_LEVEL_OFF.getLevel()) {
                com.vungle.ads.internal.util.p.Companion.enable(false);
            }
            if (isInitialized.getAndSet(true)) {
                com.vungle.ads.internal.util.p.Companion.d(TAG, "AnalyticsClient already initialized");
                return;
            }
            executor = executor2;
            vungleApiClient = vungleApiClient2;
            try {
                BlockingQueue<Sdk$SDKError.a> blockingQueue = pendingErrors;
                if (!blockingQueue.isEmpty()) {
                    blockingQueue.drainTo(errors);
                }
            } catch (Exception e10) {
                com.vungle.ads.internal.util.p.Companion.e(TAG, "Failed to add pendingErrors to errors queue.", e10);
            }
            try {
                BlockingQueue<Sdk$SDKMetric.a> blockingQueue2 = pendingMetrics;
                if (!blockingQueue2.isEmpty()) {
                    blockingQueue2.drainTo(metrics);
                }
            } catch (Exception e11) {
                com.vungle.ads.internal.util.p.Companion.e(TAG, "Failed to add pendingMetrics to metrics queue.", e11);
            }
            if (refreshEnabled) {
                Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new Runnable() { // from class: com.vungle.ads.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnalyticsClient.m250initOrUpdate$lambda1(executor2);
                    }
                }, 5000L, 5000L, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    public final AtomicBoolean isInitialized$vungle_ads_release() {
        return isInitialized;
    }

    public final synchronized void logError$vungle_ads_release(@NotNull final Sdk$SDKError.Reason reason, @NotNull final String message, @Nullable final com.vungle.ads.internal.util.o oVar) {
        VungleThreadPoolExecutor vungleThreadPoolExecutor;
        kotlin.jvm.internal.p.e(reason, "reason");
        kotlin.jvm.internal.p.e(message, "message");
        try {
            vungleThreadPoolExecutor = executor;
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Cannot logError " + reason + ", " + message + ", " + oVar, e10);
        }
        if (vungleThreadPoolExecutor == null) {
            pendingErrors.put(genSDKError(reason, message, oVar));
        } else {
            if (vungleThreadPoolExecutor != null) {
                vungleThreadPoolExecutor.execute(new Runnable() { // from class: com.vungle.ads.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnalyticsClient.m252logError$lambda2(reason, message, oVar);
                    }
                });
            }
        }
    }

    public final synchronized void logMetric$vungle_ads_release(@NotNull Sdk$SDKMetric.SDKMetricType metricType, final long j10, @Nullable final com.vungle.ads.internal.util.o oVar, @Nullable final String str) throws Throwable {
        final Sdk$SDKMetric.SDKMetricType sDKMetricType;
        VungleThreadPoolExecutor vungleThreadPoolExecutor;
        try {
            try {
                kotlin.jvm.internal.p.e(metricType, "metricType");
                try {
                    vungleThreadPoolExecutor = executor;
                    try {
                    } catch (Exception e10) {
                        e = e10;
                    }
                } catch (Exception e11) {
                    e = e11;
                    sDKMetricType = metricType;
                }
                if (vungleThreadPoolExecutor == null) {
                    pendingMetrics.put(genMetric(metricType, j10, oVar, str));
                    return;
                }
                sDKMetricType = metricType;
                if (vungleThreadPoolExecutor != null) {
                    try {
                        vungleThreadPoolExecutor.execute(new Runnable() { // from class: com.vungle.ads.b
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                AnalyticsClient.m253logMetric$lambda6(sDKMetricType, j10, oVar, str);
                            }
                        });
                    } catch (Exception e12) {
                        e = e12;
                        j10 = j10;
                        oVar = oVar;
                        str = str;
                        com.vungle.ads.internal.util.p.Companion.e(TAG, "Cannot logMetric " + sDKMetricType + ", " + j10 + ", " + oVar + ", " + str, e);
                    }
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void setExecutor$vungle_ads_release(@Nullable VungleThreadPoolExecutor vungleThreadPoolExecutor) {
        executor = vungleThreadPoolExecutor;
    }

    public final void setMetricsEnabled$vungle_ads_release(boolean z10) {
        metricsEnabled = z10;
    }

    public final void setRefreshEnabled$vungle_ads_release(boolean z10) {
        refreshEnabled = z10;
    }

    public final void setVungleApiClient$vungle_ads_release(@Nullable VungleApiClient vungleApiClient2) {
        vungleApiClient = vungleApiClient2;
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, y yVar, com.vungle.ads.internal.util.o oVar, String str, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            oVar = null;
        }
        if ((i10 & 4) != 0) {
            str = yVar.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(yVar, oVar, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, t tVar, com.vungle.ads.internal.util.o oVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            oVar = null;
        }
        if ((i10 & 4) != 0) {
            str = tVar.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(tVar, oVar, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, z zVar, com.vungle.ads.internal.util.o oVar, String str, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            oVar = null;
        }
        if ((i10 & 4) != 0) {
            str = zVar.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(zVar, oVar, str);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, u uVar, com.vungle.ads.internal.util.o oVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            oVar = null;
        }
        if ((i10 & 4) != 0) {
            str = uVar.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(uVar, oVar, str);
    }

    public final synchronized void logMetric$vungle_ads_release(@NotNull y singleValueMetric, @Nullable com.vungle.ads.internal.util.o oVar, @Nullable String str) throws Throwable {
        try {
            try {
                kotlin.jvm.internal.p.e(singleValueMetric, "singleValueMetric");
                logMetric$vungle_ads_release(singleValueMetric.getMetricType(), singleValueMetric.getValue(), oVar, str);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void logMetric$vungle_ads_release(@NotNull t oneShotSingleValueMetric, @Nullable com.vungle.ads.internal.util.o oVar, @Nullable String str) {
        kotlin.jvm.internal.p.e(oneShotSingleValueMetric, "oneShotSingleValueMetric");
        if (!oneShotSingleValueMetric.isLogged()) {
            logMetric$vungle_ads_release((y) oneShotSingleValueMetric, oVar, str);
            oneShotSingleValueMetric.markLogged();
        }
    }

    public final synchronized void logMetric$vungle_ads_release(@NotNull z timeIntervalMetric, @Nullable com.vungle.ads.internal.util.o oVar, @Nullable String str) throws Throwable {
        try {
            try {
                kotlin.jvm.internal.p.e(timeIntervalMetric, "timeIntervalMetric");
                logMetric$vungle_ads_release(timeIntervalMetric.getMetricType(), timeIntervalMetric.getValue(), oVar, str);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void logMetric$vungle_ads_release(@NotNull u oneShotTimeIntervalMetric, @Nullable com.vungle.ads.internal.util.o oVar, @Nullable String str) {
        kotlin.jvm.internal.p.e(oneShotTimeIntervalMetric, "oneShotTimeIntervalMetric");
        if (!oneShotTimeIntervalMetric.isLogged()) {
            logMetric$vungle_ads_release((z) oneShotTimeIntervalMetric, oVar, str);
            oneShotTimeIntervalMetric.markLogged();
        }
    }
}
