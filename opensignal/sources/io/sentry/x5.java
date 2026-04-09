package io.sentry;

import androidx.media3.exoplayer.ExoPlayer;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import java.io.File;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class x5 {
    static final b5 DEFAULT_DIAGNOSTIC_LEVEL = b5.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private io.sentry.backpressure.b backpressureMonitor;
    private k5 beforeBreadcrumb;
    private l5 beforeEnvelopeCallback;
    private m5 beforeSend;
    private m5 beforeSendFeedback;
    private n5 beforeSendReplay;
    private o5 beforeSendTransaction;
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;
    io.sentry.clientreport.f clientReportRecorder;
    private l compositePerformanceCollector;
    private p0 connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private q0 continuousProfiler;
    private p5 cron;
    private final io.sentry.util.e dateProvider;
    private long deadlineTimeout;
    private boolean debug;
    private io.sentry.internal.debugmeta.a debugMetaLoader;
    private t3 defaultScopeType;
    private final List<String> defaultTracePropagationTargets;
    private b5 diagnosticLevel;
    private String dist;
    private String distinctId;
    private q5 distribution;
    private r0 distributionController;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private io.sentry.cache.c envelopeDiskCache;
    private final io.sentry.util.e envelopeReader;
    private String environment;
    private e1 executorService;
    private final d0 experimental;
    private u0 fatalLogger;
    private w4 feedbackOptions;
    private boolean forceInit;
    private g0 fullyDisplayedReporter;
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<f0> ignoredCheckIns;
    private List<f0> ignoredSpanOrigins;
    private List<f0> ignoredTransactions;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private o1 initPriority;
    private p1 instrumenter;
    private volatile r6 internalTracesSampler;
    protected final io.sentry.util.a lock;
    private u0 logger;
    private r5 logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private v5 maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private io.sentry.internal.modules.a modulesLoader;
    private final List<a1> observers;
    private s5 onDiscard;
    private i5 openTelemetryMode;
    private final List<v0> optionsObservers;
    private final List<w0> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private f3 profileLifecycle;
    private Double profileSessionSampleRate;
    private Double profilesSampleRate;
    private t5 profilesSampler;
    private String profilingTracesDirPath;
    private int profilingTracesHz;
    private String proguardUuid;
    private boolean propagateTraceparent;
    private u5 proxy;
    private int readTimeoutMillis;
    private String release;
    private j3 replayController;
    private io.sentry.util.runtime.b runtimeManager;
    private Double sampleRate;
    private io.sentry.protocol.r sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final io.sentry.util.e serializer;
    private String serverName;
    private b6 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private h1 socketTagger;
    private j1 spanFactory;
    private String spotlightConnectionUrl;
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;
    private final Map<String, String> tags;
    private io.sentry.util.thread.a threadChecker;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private w5 tracesSampler;
    private l1 transactionProfiler;
    private m1 transportFactory;
    private io.sentry.transport.h transportGate;
    private n1 versionDetector;
    private final List<ComposeViewHierarchyExporter> viewHierarchyExporters;
    private final List<c0> eventProcessors = new CopyOnWriteArrayList();
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet();
    private List<f0> ignoredErrors = null;
    private final List<q1> integrations = new CopyOnWriteArrayList();
    private final Set<String> bundleIds = new CopyOnWriteArraySet();
    private final io.sentry.util.e parsedDsn = new io.sentry.util.e(new j5(this, 0));
    private long shutdownTimeoutMillis = ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
    private long flushTimeoutMillis = 15000;
    private long sessionFlushTimeoutMillis = 15000;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x5(boolean r13) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.x5.<init>(boolean):void");
    }

    public static /* synthetic */ z a(x5 x5Var) {
        return new z(x5Var.dsn);
    }

    public static /* synthetic */ a0 b(x5 x5Var) {
        return new a0((g1) x5Var.serializer.a());
    }

    public static x5 empty() {
        return new x5(true);
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(c0 c0Var) {
        this.eventProcessors.add(c0Var);
    }

    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new f0(str));
    }

    public void addIgnoredError(String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new f0(str));
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new f0(str));
    }

    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new f0(str));
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(q1 q1Var) {
        this.integrations.add(q1Var);
    }

    public void addOptionsObserver(v0 v0Var) {
        this.optionsObservers.add(v0Var);
    }

    public void addPerformanceCollector(w0 w0Var) {
        this.performanceCollectors.add(w0Var);
    }

    public void addScopeObserver(a1 a1Var) {
        this.observers.add(a1Var);
    }

    public boolean containsIgnoredExceptionForType(Throwable th2) {
        return this.ignoredExceptionsForType.contains(th2.getClass());
    }

    public io.sentry.cache.f findPersistingScopeObserver() {
        for (a1 a1Var : this.observers) {
            if (a1Var instanceof io.sentry.cache.f) {
                return (io.sentry.cache.f) a1Var;
            }
        }
        return null;
    }

    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public k5 getBeforeBreadcrumb() {
        return null;
    }

    public l5 getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    public m5 getBeforeSend() {
        return this.beforeSend;
    }

    public m5 getBeforeSendFeedback() {
        return this.beforeSendFeedback;
    }

    public n5 getBeforeSendReplay() {
        return null;
    }

    public o5 getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public io.sentry.clientreport.f getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public l getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    public p0 getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public q0 getContinuousProfiler() {
        return this.continuousProfiler;
    }

    public p5 getCron() {
        return this.cron;
    }

    public l4 getDateProvider() {
        return (l4) this.dateProvider.a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public t3 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    public b5 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public q5 getDistribution() {
        return this.distribution;
    }

    public r0 getDistributionController() {
        return this.distributionController;
    }

    public String getDsn() {
        return this.dsn;
    }

    public io.sentry.cache.c getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public s0 getEnvelopeReader() {
        return (s0) this.envelopeReader.a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<c0> getEventProcessors() {
        return this.eventProcessors;
    }

    public e1 getExecutorService() {
        return this.executorService;
    }

    public d0 getExperimental() {
        return this.experimental;
    }

    public u0 getFatalLogger() {
        return this.fatalLogger;
    }

    public w4 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public g0 getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<f0> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public List<f0> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<f0> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    public List<f0> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public o1 getInitPriority() {
        return this.initPriority;
    }

    public p1 getInstrumenter() {
        return this.instrumenter;
    }

    public List<q1> getIntegrations() {
        return this.integrations;
    }

    public r6 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            q qVarA = this.lock.a();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new r6(this);
                }
                qVarA.close();
            } catch (Throwable th2) {
                try {
                    qVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this.internalTracesSampler;
    }

    public u0 getLogger() {
        return this.logger;
    }

    public r5 getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public v5 getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public io.sentry.internal.modules.a getModulesLoader() {
        return this.modulesLoader;
    }

    public s5 getOnDiscard() {
        return null;
    }

    public i5 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    public List<v0> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<w0> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public f3 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public t5 getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String str = this.profilingTracesDirPath;
        if (str != null && !str.isEmpty()) {
            return this.dsnHash != null ? new File(this.profilingTracesDirPath, this.dsnHash).getAbsolutePath() : this.profilingTracesDirPath;
        }
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public u5 getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public j3 getReplayController() {
        return this.replayController;
    }

    public io.sentry.util.runtime.b getRuntimeManager() {
        return this.runtimeManager;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<a1> getScopeObservers() {
        return this.observers;
    }

    public io.sentry.protocol.r getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public g1 getSerializer() {
        return (g1) this.serializer.a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public b6 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public h1 getSocketTagger() {
        return this.socketTagger;
    }

    public j1 getSpanFactory() {
        return this.spanFactory;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public io.sentry.util.thread.a getThreadChecker() {
        return this.threadChecker;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public w5 getTracesSampler() {
        return null;
    }

    public l1 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public m1 getTransportFactory() {
        return this.transportFactory;
    }

    public io.sentry.transport.h getTransportGate() {
        return this.transportGate;
    }

    public n1 getVersionDetector() {
        return this.versionDetector;
    }

    public final List<ComposeViewHierarchyExporter> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public boolean isContinuousProfilingEnabled() {
        Double d6;
        return this.profilesSampleRate == null && (d6 = this.profileSessionSampleRate) != null && d6.doubleValue() > 0.0d;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d6 = this.profilesSampleRate;
        return d6 != null && d6.doubleValue() > 0.0d;
    }

    public boolean isPropagateTraceparent() {
        return this.propagateTraceparent;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void loadLazyFields() throws IllegalArgumentException {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(e0 e0Var) {
        String str = e0Var.f12206a;
        if (str != null) {
            setDsn(str);
        }
        String str2 = e0Var.f12207b;
        if (str2 != null) {
            setEnvironment(str2);
        }
        String str3 = e0Var.f12208c;
        if (str3 != null) {
            setRelease(str3);
        }
        String str4 = e0Var.f12209d;
        if (str4 != null) {
            setDist(str4);
        }
        String str5 = e0Var.f12210e;
        if (str5 != null) {
            setServerName(str5);
        }
        u5 u5Var = e0Var.f12216m;
        if (u5Var != null) {
            setProxy(u5Var);
        }
        Boolean bool = e0Var.f12211f;
        if (bool != null) {
            setEnableUncaughtExceptionHandler(bool.booleanValue());
        }
        Boolean bool2 = e0Var.f12225v;
        if (bool2 != null) {
            setPrintUncaughtStackTrace(bool2.booleanValue());
        }
        Double d6 = e0Var.f12214i;
        if (d6 != null) {
            setTracesSampleRate(d6);
        }
        Double d10 = e0Var.j;
        if (d10 != null) {
            setProfilesSampleRate(d10);
        }
        Boolean bool3 = e0Var.f12212g;
        if (bool3 != null) {
            setDebug(bool3.booleanValue());
        }
        Boolean bool4 = e0Var.f12213h;
        if (bool4 != null) {
            setEnableDeduplication(bool4.booleanValue());
        }
        Boolean bool5 = e0Var.f12226w;
        if (bool5 != null) {
            setSendClientReports(bool5.booleanValue());
        }
        Boolean bool6 = e0Var.J;
        if (bool6 != null) {
            setForceInit(bool6.booleanValue());
        }
        for (Map.Entry entry : new HashMap(e0Var.f12215l).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(e0Var.f12218o).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(e0Var.f12217n).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(e0Var.f12223t).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (e0Var.f12219p != null) {
            setTracePropagationTargets(new ArrayList(e0Var.f12219p));
        }
        Iterator it4 = new ArrayList(e0Var.f12220q).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        String str6 = e0Var.f12221r;
        if (str6 != null) {
            setProguardUuid(str6);
        }
        Long l10 = e0Var.f12222s;
        if (l10 != null) {
            setIdleTimeout(l10);
        }
        Iterator it5 = e0Var.f12227x.iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        Boolean bool7 = e0Var.f12228y;
        if (bool7 != null) {
            setEnabled(bool7.booleanValue());
        }
        Boolean bool8 = e0Var.f12229z;
        if (bool8 != null) {
            setEnablePrettySerializationOutput(bool8.booleanValue());
        }
        Boolean bool9 = e0Var.F;
        if (bool9 != null) {
            setSendModules(bool9.booleanValue());
        }
        if (e0Var.D != null) {
            setIgnoredCheckIns(new ArrayList(e0Var.D));
        }
        if (e0Var.E != null) {
            setIgnoredTransactions(new ArrayList(e0Var.E));
        }
        if (e0Var.f12224u != null) {
            setIgnoredErrors(new ArrayList(e0Var.f12224u));
        }
        Boolean bool10 = e0Var.H;
        if (bool10 != null) {
            setEnableBackpressureHandling(bool10.booleanValue());
        }
        v5 v5Var = e0Var.k;
        if (v5Var != null) {
            setMaxRequestBodySize(v5Var);
        }
        Boolean bool11 = e0Var.G;
        if (bool11 != null) {
            setSendDefaultPii(bool11.booleanValue());
        }
        Boolean bool12 = e0Var.K;
        if (bool12 != null) {
            setCaptureOpenTelemetryEvents(bool12.booleanValue());
        }
        Boolean bool13 = e0Var.A;
        if (bool13 != null) {
            setEnableSpotlight(bool13.booleanValue());
        }
        String str7 = e0Var.C;
        if (str7 != null) {
            setSpotlightConnectionUrl(str7);
        }
        Boolean bool14 = e0Var.I;
        if (bool14 != null) {
            setGlobalHubMode(bool14);
        }
        if (e0Var.O != null) {
            if (getCron() == null) {
                setCron(e0Var.O);
            } else {
                if (e0Var.O.f12503a != null) {
                    getCron().f12503a = e0Var.O.f12503a;
                }
                if (e0Var.O.f12504b != null) {
                    getCron().f12504b = e0Var.O.f12504b;
                }
                if (e0Var.O.f12505c != null) {
                    getCron().f12505c = e0Var.O.f12505c;
                }
                if (e0Var.O.f12506d != null) {
                    getCron().f12506d = e0Var.O.f12506d;
                }
                if (e0Var.O.f12507e != null) {
                    getCron().f12507e = e0Var.O.f12507e;
                }
            }
        }
        if (e0Var.B != null) {
            getLogs().f12693a = e0Var.B.booleanValue();
        }
        Double d11 = e0Var.L;
        if (d11 != null) {
            setProfileSessionSampleRate(d11);
        }
        String str8 = e0Var.M;
        if (str8 != null) {
            setProfilingTracesDirPath(str8);
        }
        f3 f3Var = e0Var.N;
        if (f3Var != null) {
            setProfileLifecycle(f3Var);
        }
    }

    public z retrieveParsedDsn() throws IllegalArgumentException {
        return (z) this.parsedDsn.a();
    }

    public void setAttachServerName(boolean z10) {
        this.attachServerName = z10;
    }

    public void setAttachStacktrace(boolean z10) {
        this.attachStacktrace = z10;
    }

    public void setAttachThreads(boolean z10) {
        this.attachThreads = z10;
    }

    public void setBackpressureMonitor(io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(k5 k5Var) {
    }

    public void setBeforeEnvelopeCallback(l5 l5Var) {
        this.beforeEnvelopeCallback = l5Var;
    }

    public void setBeforeSend(m5 m5Var) {
        this.beforeSend = m5Var;
    }

    public void setBeforeSendFeedback(m5 m5Var) {
        this.beforeSendFeedback = m5Var;
    }

    public void setBeforeSendReplay(n5 n5Var) {
    }

    public void setBeforeSendTransaction(o5 o5Var) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z10) {
        this.captureOpenTelemetryEvents = z10;
    }

    public void setCompositePerformanceCollector(l lVar) {
        this.compositePerformanceCollector = lVar;
    }

    public void setConnectionStatusProvider(p0 p0Var) {
        this.connectionStatusProvider = p0Var;
    }

    public void setConnectionTimeoutMillis(int i10) {
        this.connectionTimeoutMillis = i10;
    }

    public void setContinuousProfiler(q0 q0Var) {
        if (this.continuousProfiler != j2.f12375a || q0Var == null) {
            return;
        }
        this.continuousProfiler = q0Var;
    }

    public void setCron(p5 p5Var) {
        this.cron = p5Var;
    }

    public void setDateProvider(l4 l4Var) {
        this.dateProvider.b(l4Var);
    }

    public void setDeadlineTimeout(long j) {
        this.deadlineTimeout = j;
    }

    public void setDebug(boolean z10) {
        this.debug = z10;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.f12351a;
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(t3 t3Var) {
        this.defaultScopeType = t3Var;
    }

    public void setDiagnosticLevel(b5 b5Var) {
        if (b5Var == null) {
            b5Var = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = b5Var;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDistribution(q5 q5Var) {
        if (q5Var == null) {
            q5Var = new q5();
        }
        this.distribution = q5Var;
    }

    public void setDistributionController(r0 r0Var) {
        if (r0Var == null) {
            r0Var = j2.f12376d;
        }
        this.distributionController = r0Var;
    }

    public void setDsn(String str) {
        this.dsn = str;
        io.sentry.util.e eVar = this.parsedDsn;
        q qVarA = eVar.f12807c.a();
        String string = null;
        try {
            eVar.f12805a = null;
            qVarA.close();
            String str2 = this.dsn;
            u0 u0Var = this.logger;
            Charset charset = io.sentry.util.k.f12817a;
            if (str2 != null && !str2.isEmpty()) {
                try {
                    string = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str2.getBytes(io.sentry.util.k.f12817a))).toString(16)).toString();
                } catch (NoSuchAlgorithmException e4) {
                    u0Var.g(b5.INFO, "SHA-1 isn't available to calculate the hash.", e4);
                } catch (Throwable th2) {
                    u0Var.m(b5.INFO, "string: %s could not calculate its hash", th2, str2);
                }
            }
            this.dsnHash = string;
        } catch (Throwable th3) {
            try {
                qVarA.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public void setEnableAppStartProfiling(boolean z10) {
        this.enableAppStartProfiling = z10;
    }

    public void setEnableAutoSessionTracking(boolean z10) {
        this.enableAutoSessionTracking = z10;
    }

    public void setEnableBackpressureHandling(boolean z10) {
        this.enableBackpressureHandling = z10;
    }

    public void setEnableDeduplication(boolean z10) {
        this.enableDeduplication = z10;
    }

    public void setEnableExternalConfiguration(boolean z10) {
        this.enableExternalConfiguration = z10;
    }

    public void setEnablePrettySerializationOutput(boolean z10) {
        this.enablePrettySerializationOutput = z10;
    }

    public void setEnableScopePersistence(boolean z10) {
        this.enableScopePersistence = z10;
    }

    public void setEnableScreenTracking(boolean z10) {
        this.enableScreenTracking = z10;
    }

    public void setEnableShutdownHook(boolean z10) {
        this.enableShutdownHook = z10;
    }

    public void setEnableSpotlight(boolean z10) {
        this.enableSpotlight = z10;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z10) {
        this.enableTimeToFullDisplayTracing = z10;
    }

    public void setEnableUncaughtExceptionHandler(boolean z10) {
        this.enableUncaughtExceptionHandler = z10;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z10) {
        this.enableUserInteractionBreadcrumbs = z10;
    }

    public void setEnableUserInteractionTracing(boolean z10) {
        this.enableUserInteractionTracing = z10;
    }

    public void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.c cVar) {
        if (cVar == null) {
            cVar = io.sentry.transport.i.f12765a;
        }
        this.envelopeDiskCache = cVar;
    }

    public void setEnvelopeReader(s0 s0Var) {
        io.sentry.util.e eVar = this.envelopeReader;
        if (s0Var == null) {
            s0Var = k2.f12409a;
        }
        eVar.b(s0Var);
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(e1 e1Var) {
        if (e1Var != null) {
            this.executorService = e1Var;
        }
    }

    public void setFatalLogger(u0 u0Var) {
        if (u0Var == null) {
            u0Var = m2.f12434a;
        }
        this.fatalLogger = u0Var;
    }

    public void setFeedbackOptions(w4 w4Var) {
        this.feedbackOptions = w4Var;
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setForceInit(boolean z10) {
        this.forceInit = z10;
    }

    public void setFullyDisplayedReporter(g0 g0Var) {
        this.fullyDisplayedReporter = g0Var;
    }

    public void setGestureTargetLocators(List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(Long l10) {
        this.idleTimeout = l10;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new f0(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(o1 o1Var) {
        this.initPriority = o1Var;
    }

    @Deprecated
    public void setInstrumenter(p1 p1Var) {
        this.instrumenter = p1Var;
    }

    public void setLogger(u0 u0Var) {
        this.logger = u0Var == null ? m2.f12434a : new t(this, u0Var);
    }

    public void setLogs(r5 r5Var) {
        this.logs = r5Var;
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public void setMaxBreadcrumbs(int i10) {
        this.maxBreadcrumbs = i10;
    }

    public void setMaxCacheItems(int i10) {
        this.maxCacheItems = i10;
    }

    public void setMaxDepth(int i10) {
        this.maxDepth = i10;
    }

    public void setMaxQueueSize(int i10) {
        if (i10 > 0) {
            this.maxQueueSize = i10;
        }
    }

    public void setMaxRequestBodySize(v5 v5Var) {
        this.maxRequestBodySize = v5Var;
    }

    public void setMaxSpans(int i10) {
        this.maxSpans = i10;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setModulesLoader(io.sentry.internal.modules.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.modules.e.f12369a;
        }
        this.modulesLoader = aVar;
    }

    public void setOnDiscard(s5 s5Var) {
    }

    public void setOpenTelemetryMode(i5 i5Var) {
        this.openTelemetryMode = i5Var;
    }

    public void setPrintUncaughtStackTrace(boolean z10) {
        this.printUncaughtStackTrace = z10;
    }

    public void setProfileLifecycle(f3 f3Var) {
        this.profileLifecycle = f3Var;
        if (f3Var != f3.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.m(b5.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(Double d6) {
        if (lf.t1.z(d6, true)) {
            this.profileSessionSampleRate = d6;
            return;
        }
        throw new IllegalArgumentException("The value " + d6 + " is not valid. Use values between 0.0 and 1.0.");
    }

    public void setProfilesSampleRate(Double d6) {
        if (lf.t1.z(d6, true)) {
            this.profilesSampleRate = d6;
            return;
        }
        throw new IllegalArgumentException("The value " + d6 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(t5 t5Var) {
    }

    public void setProfilingTracesDirPath(String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProfilingTracesHz(int i10) {
        this.profilingTracesHz = i10;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z10) {
        this.propagateTraceparent = z10;
    }

    public void setProxy(u5 u5Var) {
        this.proxy = u5Var;
    }

    public void setReadTimeoutMillis(int i10) {
        this.readTimeoutMillis = i10;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(j3 j3Var) {
        if (j3Var == null) {
            j3Var = j2.f12378r;
        }
        this.replayController = j3Var;
    }

    public void setRuntimeManager(io.sentry.util.runtime.b bVar) {
        this.runtimeManager = bVar;
    }

    public void setSampleRate(Double d6) {
        if (lf.t1.z(d6, true)) {
            this.sampleRate = d6;
            return;
        }
        throw new IllegalArgumentException("The value " + d6 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(io.sentry.protocol.r rVar) {
        io.sentry.protocol.r rVar2 = getSessionReplay().k;
        io.sentry.protocol.r rVar3 = this.sdkVersion;
        if (rVar3 != null && rVar2 != null && rVar3.equals(rVar2)) {
            getSessionReplay().k = rVar;
        }
        this.sdkVersion = rVar;
    }

    public void setSendClientReports(boolean z10) {
        this.sendClientReports = z10;
        if (z10) {
            this.clientReportRecorder = new i4.b(this);
        } else {
            this.clientReportRecorder = new df.c();
        }
    }

    public void setSendDefaultPii(boolean z10) {
        this.sendDefaultPii = z10;
    }

    public void setSendModules(boolean z10) {
        this.sendModules = z10;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(g1 g1Var) {
        io.sentry.util.e eVar = this.serializer;
        if (g1Var == null) {
            g1Var = r2.f12688a;
        }
        eVar.b(g1Var);
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j) {
        this.sessionFlushTimeoutMillis = j;
    }

    public void setSessionReplay(b6 b6Var) {
        this.sessionReplay = b6Var;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setSocketTagger(h1 h1Var) {
        if (h1Var == null) {
            h1Var = s2.f12729a;
        }
        this.socketTagger = h1Var;
    }

    public void setSpanFactory(j1 j1Var) {
        this.spanFactory = j1Var;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z10) {
        this.startProfilerOnAppStart = z10;
    }

    public void setTag(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.tags.remove(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setThreadChecker(io.sentry.util.thread.a aVar) {
        this.threadChecker = aVar;
    }

    public void setTraceOptionsRequests(boolean z10) {
        this.traceOptionsRequests = z10;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z10) {
        this.traceSampling = z10;
    }

    public void setTracesSampleRate(Double d6) {
        if (lf.t1.z(d6, true)) {
            this.tracesSampleRate = d6;
            return;
        }
        throw new IllegalArgumentException("The value " + d6 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(w5 w5Var) {
    }

    public void setTransactionProfiler(l1 l1Var) {
        if (this.transactionProfiler != j2.f12380y || l1Var == null) {
            return;
        }
        this.transactionProfiler = l1Var;
    }

    public void setTransportFactory(m1 m1Var) {
        if (m1Var == null) {
            m1Var = w2.f12854a;
        }
        this.transportFactory = m1Var;
    }

    public void setTransportGate(io.sentry.transport.h hVar) {
        if (hVar == null) {
            hVar = io.sentry.transport.k.f12767a;
        }
        this.transportGate = hVar;
    }

    public void setVersionDetector(n1 n1Var) {
        this.versionDetector = n1Var;
    }

    public void setViewHierarchyExporters(List<ComposeViewHierarchyExporter> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }
}
