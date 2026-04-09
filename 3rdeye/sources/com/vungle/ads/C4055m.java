package com.vungle.ads;

import android.annotation.SuppressLint;
import android.os.Build;
import com.singular.sdk.internal.Constants;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.b;
import com.vungle.ads.internal.util.k;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: AnalyticsClient.kt */
/* renamed from: com.vungle.ads.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4055m {
    private static com.vungle.ads.internal.executor.i executor = null;
    private static final int maxBatchSize = 20;
    private static boolean metricsEnabled = false;
    private static boolean paused = false;
    private static final long refreshTimeMillis = 5000;

    @SuppressLint({"StaticFieldLeak"})
    private static com.vungle.ads.internal.signals.b signalManager;
    private static com.vungle.ads.internal.network.g vungleApiClient;
    public static final C4055m INSTANCE = new C4055m();
    private static final String TAG = C4055m.class.getSimpleName();
    private static final BlockingQueue<Sdk$SDKError.a> errors = new LinkedBlockingQueue();
    private static final BlockingQueue<Sdk$SDKMetric.a> metrics = new LinkedBlockingQueue();
    private static final BlockingQueue<Sdk$SDKError.a> pendingErrors = new LinkedBlockingQueue();
    private static final BlockingQueue<Sdk$SDKMetric.a> pendingMetrics = new LinkedBlockingQueue();
    private static a logLevel = a.ERROR_LOG_LEVEL_ERROR;
    private static boolean refreshEnabled = true;

    /* compiled from: AnalyticsClient.kt */
    /* renamed from: com.vungle.ads.m$a */
    public enum a {
        ERROR_LOG_LEVEL_OFF(0),
        ERROR_LOG_LEVEL_ERROR(1),
        ERROR_LOG_LEVEL_DEBUG(2);

        public static final C0397a Companion = new C0397a(null);
        private final int level;

        /* compiled from: AnalyticsClient.kt */
        /* renamed from: com.vungle.ads.m$a$a, reason: collision with other inner class name */
        public static final class C0397a {
            public /* synthetic */ C0397a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final a fromValue(int i) {
                a aVar = a.ERROR_LOG_LEVEL_DEBUG;
                if (i == aVar.getLevel()) {
                    return aVar;
                }
                a aVar2 = a.ERROR_LOG_LEVEL_ERROR;
                if (i != aVar2.getLevel()) {
                    a aVar3 = a.ERROR_LOG_LEVEL_OFF;
                    if (i == aVar3.getLevel()) {
                        return aVar3;
                    }
                }
                return aVar2;
            }

            private C0397a() {
            }
        }

        a(int i) {
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    /* compiled from: AnalyticsClient.kt */
    /* renamed from: com.vungle.ads.m$b */
    public interface b {
        void onFailure();

        void onSuccess();
    }

    /* compiled from: AnalyticsClient.kt */
    /* renamed from: com.vungle.ads.m$c */
    public static final class c implements b {
        final /* synthetic */ BlockingQueue<Sdk$SDKError.a> $currentSendingErrors;

        public c(BlockingQueue<Sdk$SDKError.a> blockingQueue) {
            this.$currentSendingErrors = blockingQueue;
        }

        @Override // com.vungle.ads.C4055m.b
        public void onFailure() {
            com.vungle.ads.internal.util.k.Companion.d(C4055m.TAG, "Failed to send " + this.$currentSendingErrors.size() + " errors");
            C4055m.INSTANCE.getErrors$vungle_ads_release().addAll(this.$currentSendingErrors);
        }

        @Override // com.vungle.ads.C4055m.b
        public void onSuccess() {
            com.vungle.ads.internal.util.k.Companion.d(C4055m.TAG, "Sent " + this.$currentSendingErrors.size() + " errors");
        }
    }

    /* compiled from: AnalyticsClient.kt */
    /* renamed from: com.vungle.ads.m$d */
    public static final class d implements b {
        final /* synthetic */ BlockingQueue<Sdk$SDKMetric.a> $currentSendingMetrics;

        public d(BlockingQueue<Sdk$SDKMetric.a> blockingQueue) {
            this.$currentSendingMetrics = blockingQueue;
        }

        @Override // com.vungle.ads.C4055m.b
        public void onFailure() {
            com.vungle.ads.internal.util.k.Companion.d(C4055m.TAG, "Failed to send " + this.$currentSendingMetrics.size() + " metrics");
            C4055m.INSTANCE.getMetrics$vungle_ads_release().addAll(this.$currentSendingMetrics);
        }

        @Override // com.vungle.ads.C4055m.b
        public void onSuccess() {
            com.vungle.ads.internal.util.k.Companion.d(C4055m.TAG, "Sent " + this.$currentSendingMetrics.size() + " metrics");
        }
    }

    /* compiled from: AnalyticsClient.kt */
    /* renamed from: com.vungle.ads.m$e */
    public static final class e extends b.c {
        @Override // com.vungle.ads.internal.util.b.c
        public void onPause() {
            super.onPause();
            C4055m.INSTANCE.pause();
        }

        @Override // com.vungle.ads.internal.util.b.c
        public void onResume() {
            super.onResume();
            C4055m.INSTANCE.resume();
        }
    }

    private C4055m() {
    }

    private final void flushErrors() {
        com.vungle.ads.internal.network.g gVar;
        k.a aVar = com.vungle.ads.internal.util.k.Companion;
        String str = TAG;
        StringBuilder sb = new StringBuilder("Sending ");
        BlockingQueue<Sdk$SDKError.a> blockingQueue = errors;
        sb.append(blockingQueue.size());
        sb.append(" errors");
        aVar.d(str, sb.toString());
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (gVar = vungleApiClient) == null) {
            return;
        }
        gVar.reportErrors(linkedBlockingQueue, new c(linkedBlockingQueue));
    }

    private final void flushMetrics() {
        com.vungle.ads.internal.network.g gVar;
        k.a aVar = com.vungle.ads.internal.util.k.Companion;
        String str = TAG;
        StringBuilder sb = new StringBuilder("Sending ");
        BlockingQueue<Sdk$SDKMetric.a> blockingQueue = metrics;
        sb.append(blockingQueue.size());
        sb.append(" metrics");
        aVar.d(str, sb.toString());
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (linkedBlockingQueue.isEmpty() || (gVar = vungleApiClient) == null) {
            return;
        }
        gVar.reportMetrics(linkedBlockingQueue, new d(linkedBlockingQueue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sdk$SDKMetric.a genMetric(Sdk$SDKMetric.b bVar, long j4, String str, String str2, String str3, String str4) {
        String uuid;
        Sdk$SDKMetric.a osVersion = Sdk$SDKMetric.newBuilder().setType(bVar).setValue(j4).setMake(Build.MANUFACTURER).setModel(Build.MODEL).setOs(Constants.PLATFORM).setOsVersion(String.valueOf(Build.VERSION.SDK_INT));
        String str5 = "";
        if (str == null) {
            str = "";
        }
        Sdk$SDKMetric.a placementReferenceId = osVersion.setPlacementReferenceId(str);
        if (str2 == null) {
            str2 = "";
        }
        Sdk$SDKMetric.a creativeId = placementReferenceId.setCreativeId(str2);
        if (str3 == null) {
            str3 = "";
        }
        Sdk$SDKMetric.a eventId = creativeId.setEventId(str3);
        if (str4 == null) {
            str4 = "";
        }
        Sdk$SDKMetric.a meta = eventId.setMeta(str4);
        com.vungle.ads.internal.signals.b bVar2 = signalManager;
        if (bVar2 != null && (uuid = bVar2.getUuid()) != null) {
            str5 = uuid;
        }
        Sdk$SDKMetric.a sessionId = meta.setSessionId(str5);
        kotlin.jvm.internal.l.e(sessionId, "newBuilder()\n           …ignalManager?.uuid ?: \"\")");
        return sessionId;
    }

    private final Sdk$SDKError.a genSDKError(Sdk$SDKError.b bVar, String str, String str2, String str3, String str4) {
        String uuid;
        Sdk$SDKError.a at = Sdk$SDKError.newBuilder().setOs(Constants.PLATFORM).setOsVersion(String.valueOf(Build.VERSION.SDK_INT)).setMake(Build.MANUFACTURER).setModel(Build.MODEL).setReason(bVar).setMessage(str).setAt(System.currentTimeMillis());
        String str5 = "";
        if (str2 == null) {
            str2 = "";
        }
        Sdk$SDKError.a placementReferenceId = at.setPlacementReferenceId(str2);
        if (str3 == null) {
            str3 = "";
        }
        Sdk$SDKError.a creativeId = placementReferenceId.setCreativeId(str3);
        if (str4 == null) {
            str4 = "";
        }
        Sdk$SDKError.a eventId = creativeId.setEventId(str4);
        com.vungle.ads.internal.signals.b bVar2 = signalManager;
        if (bVar2 != null && (uuid = bVar2.getUuid()) != null) {
            str5 = uuid;
        }
        Sdk$SDKError.a sessionId = eventId.setSessionId(str5);
        kotlin.jvm.internal.l.e(sessionId, "newBuilder()\n           …ignalManager?.uuid ?: \"\")");
        return sessionId;
    }

    public static /* synthetic */ Sdk$SDKError.a genSDKError$default(C4055m c4055m, Sdk$SDKError.b bVar, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        return c4055m.genSDKError(bVar, str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-1, reason: not valid java name */
    public static final void m118init$lambda1(com.vungle.ads.internal.executor.i executor2) {
        kotlin.jvm.internal.l.f(executor2, "$executor");
        executor2.execute(new E3.a(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-1$lambda-0, reason: not valid java name */
    public static final void m119init$lambda1$lambda0() {
        INSTANCE.report();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: logError$lambda-2, reason: not valid java name */
    public static final void m120logError$lambda2(Sdk$SDKError.b reason, String message, String str, String str2, String str3) throws Throwable {
        kotlin.jvm.internal.l.f(reason, "$reason");
        kotlin.jvm.internal.l.f(message, "$message");
        INSTANCE.logErrorInSameThread(reason, message, str, str2, str3);
    }

    public static /* synthetic */ void logError$vungle_ads_release$default(C4055m c4055m, Sdk$SDKError.b bVar, String str, String str2, String str3, String str4, int i, Object obj) throws Throwable {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        c4055m.logError$vungle_ads_release(bVar, str, str2, str3, str4);
    }

    private final synchronized void logErrorInSameThread(Sdk$SDKError.b bVar, String str, String str2, String str3, String str4) throws Throwable {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (logLevel == a.ERROR_LOG_LEVEL_OFF) {
                return;
            }
            try {
                Sdk$SDKError.a aVarGenSDKError = genSDKError(bVar, str, str2, str3, str4);
                try {
                    BlockingQueue<Sdk$SDKError.a> blockingQueue = errors;
                    blockingQueue.put(aVarGenSDKError);
                    com.vungle.ads.internal.util.k.Companion.w(TAG, "Logging error: " + bVar + " with message: " + str);
                    if (blockingQueue.size() >= 20) {
                        report();
                    }
                } catch (Exception e4) {
                    e = e4;
                    com.vungle.ads.internal.util.k.Companion.e(TAG, "Cannot logError", e);
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public static /* synthetic */ void logErrorInSameThread$default(C4055m c4055m, Sdk$SDKError.b bVar, String str, String str2, String str3, String str4, int i, Object obj) throws Throwable {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        c4055m.logErrorInSameThread(bVar, str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: logMetric$lambda-3, reason: not valid java name */
    public static final void m121logMetric$lambda3(Sdk$SDKMetric.b metricType, long j4, String str, String str2, String str3, String str4) throws Throwable {
        kotlin.jvm.internal.l.f(metricType, "$metricType");
        INSTANCE.logMetricInSameThread(metricType, j4, str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void logMetricInSameThread(Sdk$SDKMetric.b bVar, long j4, String str, String str2, String str3, String str4) throws Throwable {
        try {
            try {
                if (metricsEnabled) {
                    try {
                        Sdk$SDKMetric.a aVarGenMetric = genMetric(bVar, j4, str, str2, str3, str4);
                        try {
                            BlockingQueue<Sdk$SDKMetric.a> blockingQueue = metrics;
                            blockingQueue.put(aVarGenMetric);
                            com.vungle.ads.internal.util.k.Companion.d(TAG, "Logging Metric " + bVar + " with value " + j4 + " for placement " + str);
                            if (blockingQueue.size() >= 20) {
                                report();
                            }
                        } catch (Exception e4) {
                            e = e4;
                            com.vungle.ads.internal.util.k.Companion.e(TAG, "Cannot logMetrics", e);
                        }
                    } catch (Exception e10) {
                        e = e10;
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

    private final synchronized void report() {
        try {
            if (paused) {
                return;
            }
            if (logLevel != a.ERROR_LOG_LEVEL_OFF && errors.size() > 0) {
                flushErrors();
            }
            if (metricsEnabled && metrics.size() > 0) {
                flushMetrics();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final BlockingQueue<Sdk$SDKError.a> getErrors$vungle_ads_release() {
        return errors;
    }

    public final com.vungle.ads.internal.executor.i getExecutor$vungle_ads_release() {
        return executor;
    }

    public final BlockingQueue<Sdk$SDKMetric.a> getMetrics$vungle_ads_release() {
        return metrics;
    }

    public final boolean getMetricsEnabled$vungle_ads_release() {
        return metricsEnabled;
    }

    public final BlockingQueue<Sdk$SDKError.a> getPendingErrors$vungle_ads_release() {
        return pendingErrors;
    }

    public final BlockingQueue<Sdk$SDKMetric.a> getPendingMetrics$vungle_ads_release() {
        return pendingMetrics;
    }

    public final boolean getRefreshEnabled$vungle_ads_release() {
        return refreshEnabled;
    }

    public final com.vungle.ads.internal.signals.b getSignalManager$vungle_ads_release() {
        return signalManager;
    }

    public final com.vungle.ads.internal.network.g getVungleApiClient$vungle_ads_release() {
        return vungleApiClient;
    }

    public final void init$vungle_ads_release(com.vungle.ads.internal.network.g vungleApiClient2, com.vungle.ads.internal.executor.i executor2, int i, boolean z10, com.vungle.ads.internal.signals.b signalManager2) {
        kotlin.jvm.internal.l.f(vungleApiClient2, "vungleApiClient");
        kotlin.jvm.internal.l.f(executor2, "executor");
        kotlin.jvm.internal.l.f(signalManager2, "signalManager");
        signalManager = signalManager2;
        executor = executor2;
        vungleApiClient = vungleApiClient2;
        try {
            BlockingQueue<Sdk$SDKError.a> blockingQueue = pendingErrors;
            if (!blockingQueue.isEmpty()) {
                blockingQueue.drainTo(errors);
            }
        } catch (Exception e4) {
            com.vungle.ads.internal.util.k.Companion.e(TAG, "Failed to add pendingErrors to errors queue.", e4);
        }
        try {
            BlockingQueue<Sdk$SDKMetric.a> blockingQueue2 = pendingMetrics;
            if (!blockingQueue2.isEmpty()) {
                blockingQueue2.drainTo(metrics);
            }
        } catch (Exception e10) {
            com.vungle.ads.internal.util.k.Companion.e(TAG, "Failed to add pendingMetrics to metrics queue.", e10);
        }
        if (refreshEnabled) {
            Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new C.V(executor2, 18), 0L, refreshTimeMillis, TimeUnit.MILLISECONDS);
        }
        updateErrorLevelAndMetricEnabled$vungle_ads_release(i, z10);
        if (i == a.ERROR_LOG_LEVEL_DEBUG.getLevel()) {
            com.vungle.ads.internal.util.k.Companion.enable(true);
        } else if (i == a.ERROR_LOG_LEVEL_ERROR.getLevel() || i == a.ERROR_LOG_LEVEL_OFF.getLevel()) {
            com.vungle.ads.internal.util.k.Companion.enable(false);
        }
        com.vungle.ads.internal.util.b.Companion.addLifecycleListener(new e());
    }

    public final synchronized void logError$vungle_ads_release(Sdk$SDKError.b reason, String message, String str, String str2, String str3) throws Throwable {
        Sdk$SDKError.b bVar;
        com.vungle.ads.internal.executor.i iVar;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            kotlin.jvm.internal.l.f(reason, "reason");
            kotlin.jvm.internal.l.f(message, "message");
            try {
                iVar = executor;
                try {
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Exception e10) {
                e = e10;
                bVar = reason;
            }
            if (iVar == null) {
                pendingErrors.put(genSDKError(reason, message, str, str2, str3));
                return;
            }
            bVar = reason;
            try {
                iVar.execute(new RunnableC4053k(bVar, message, str, str2, str3, 0));
            } catch (Exception e11) {
                e = e11;
                message = message;
                str = str;
                str2 = str2;
                str3 = str3;
                com.vungle.ads.internal.util.k.Companion.e(TAG, "Cannot logError " + bVar + ", " + message + ", " + str + ", " + str2 + ',' + str3, e);
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void logMetric$vungle_ads_release(final Sdk$SDKMetric.b metricType, final long j4, final String str, final String str2, final String str3, final String str4) {
        com.vungle.ads.internal.executor.i iVar;
        kotlin.jvm.internal.l.f(metricType, "metricType");
        try {
            iVar = executor;
        } catch (Exception e4) {
            com.vungle.ads.internal.util.k.Companion.e(TAG, "Cannot logMetric " + metricType + ", " + j4 + ", " + str + ", " + str2 + ',' + str3 + ", " + str4, e4);
        }
        if (iVar != null) {
            iVar.execute(new Runnable() { // from class: com.vungle.ads.l
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    C4055m.m121logMetric$lambda3(metricType, j4, str, str2, str3, str4);
                }
            });
        } else {
            pendingMetrics.put(genMetric(metricType, j4, str, str2, str3, str4));
        }
    }

    public final void pause() {
        paused = true;
    }

    public final void resume() {
        paused = false;
    }

    public final void setExecutor$vungle_ads_release(com.vungle.ads.internal.executor.i iVar) {
        executor = iVar;
    }

    public final void setMetricsEnabled$vungle_ads_release(boolean z10) {
        metricsEnabled = z10;
    }

    public final void setRefreshEnabled$vungle_ads_release(boolean z10) {
        refreshEnabled = z10;
    }

    public final void setSignalManager$vungle_ads_release(com.vungle.ads.internal.signals.b bVar) {
        signalManager = bVar;
    }

    public final void setVungleApiClient$vungle_ads_release(com.vungle.ads.internal.network.g gVar) {
        vungleApiClient = gVar;
    }

    public final synchronized void updateErrorLevelAndMetricEnabled$vungle_ads_release(int i, boolean z10) {
        logLevel = a.Companion.fromValue(i);
        metricsEnabled = z10;
    }

    public static /* synthetic */ void logError$vungle_ads_release$default(C4055m c4055m, int i, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            str4 = null;
        }
        c4055m.logError$vungle_ads_release(i, str, str2, str3, str4);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(C4055m c4055m, J j4, String str, String str2, String str3, String str4, int i, Object obj) throws Throwable {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        c4055m.logMetric$vungle_ads_release(j4, str, str2, str3, str4);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(C4055m c4055m, e0 e0Var, String str, String str2, String str3, String str4, int i, Object obj) throws Throwable {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        c4055m.logMetric$vungle_ads_release(e0Var, str, str2, str3, str4);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(C4055m c4055m, f0 f0Var, String str, String str2, String str3, String str4, int i, Object obj) throws Throwable {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = f0Var.getMeta();
        }
        c4055m.logMetric$vungle_ads_release(f0Var, str, str2, str3, str4);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(C4055m c4055m, U u8, String str, String str2, String str3, String str4, int i, Object obj) throws Throwable {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        c4055m.logMetric$vungle_ads_release(u8, str, str2, str3, str4);
    }

    public final synchronized void logError$vungle_ads_release(int i, String message, String str, String str2, String str3) {
        try {
            try {
                kotlin.jvm.internal.l.f(message, "message");
                Sdk$SDKError.b bVarForNumber = Sdk$SDKError.b.forNumber(i);
                kotlin.jvm.internal.l.e(bVarForNumber, "forNumber(reasonCode)");
                logError$vungle_ads_release(bVarForNumber, message, str, str2, str3);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void logMetric$vungle_ads_release(J metric, String str, String str2, String str3, String str4) throws Throwable {
        Throwable th;
        try {
            try {
                kotlin.jvm.internal.l.f(metric, "metric");
                Sdk$SDKMetric.b metricType = metric.getMetricType();
                long value = metric.getValue();
                if (str4 == null) {
                    try {
                        str4 = metric.getMeta();
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                logMetric$vungle_ads_release(metricType, value, str, str2, str3, str4);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized void logMetric$vungle_ads_release(e0 singleValueMetric, String str, String str2, String str3, String str4) throws Throwable {
        try {
            kotlin.jvm.internal.l.f(singleValueMetric, "singleValueMetric");
            logMetric$vungle_ads_release((J) singleValueMetric, str, str2, str3, str4);
        } catch (Throwable th) {
            th = th;
            while (true) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    public static /* synthetic */ void getErrors$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getExecutor$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMetrics$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMetricsEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPendingErrors$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPendingMetrics$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getRefreshEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getSignalManager$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    public final synchronized void logMetric$vungle_ads_release(f0 timeIntervalMetric, String str, String str2, String str3, String str4) throws Throwable {
        try {
            kotlin.jvm.internal.l.f(timeIntervalMetric, "timeIntervalMetric");
            logMetric$vungle_ads_release((J) timeIntervalMetric, str, str2, str3, str4);
        } catch (Throwable th) {
            th = th;
            while (true) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    public final synchronized void logMetric$vungle_ads_release(U oneShotTimeIntervalMetric, String str, String str2, String str3, String str4) throws Throwable {
        try {
            try {
                kotlin.jvm.internal.l.f(oneShotTimeIntervalMetric, "oneShotTimeIntervalMetric");
                if (!oneShotTimeIntervalMetric.isLogged()) {
                    logMetric$vungle_ads_release((f0) oneShotTimeIntervalMetric, str, str2, str3, str4);
                    oneShotTimeIntervalMetric.markLogged();
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
}
