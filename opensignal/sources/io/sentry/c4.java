package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.ServiceLoader;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public abstract class c4 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile c1 f12106a = p2.f12491a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile b1 f12107b = n2.f12445b;

    /* renamed from: c, reason: collision with root package name */
    public static final p3 f12108c = new p3(x5.empty());

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f12109d = false;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f12110e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    public static final long f12111f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public static final io.sentry.util.a f12112g = new io.sentry.util.a();

    public static io.sentry.protocol.t a(Throwable th2, h0 h0Var) {
        return c().u(th2, h0Var);
    }

    public static void b() {
        q qVarA = f12112g.a();
        try {
            b1 b1VarC = c();
            f12107b = n2.f12445b;
            f12106a.close();
            b1VarC.a(false);
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

    public static b1 c() {
        if (f12109d) {
            return f12107b;
        }
        b1 b1Var = f12106a.get();
        if (b1Var != null && !b1Var.i()) {
            return b1Var;
        }
        b1 b1VarX = f12107b.x("getCurrentScopes");
        f12106a.a(b1VarX);
        return b1VarX;
    }

    public static i1 d() {
        return (f12109d && io.sentry.util.g.f12810a) ? c().l() : c().h();
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Collection] */
    public static void e(j2 j2Var, io.sentry.android.core.e eVar) {
        x5 x5Var = (x5) SentryAndroidOptions.class.getDeclaredConstructor(null).newInstance(null);
        try {
            eVar.c(x5Var);
        } catch (Throwable th2) {
            x5Var.getLogger().g(b5.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
        q qVarA = f12112g.a();
        try {
            if (!x5Var.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.g.f12810a) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(x5Var.getClass().getName()));
            }
            if (i(x5Var)) {
                Boolean boolIsGlobalHubMode = x5Var.isGlobalHubMode();
                int i10 = 1;
                boolean zBooleanValue = boolIsGlobalHubMode != null ? boolIsGlobalHubMode.booleanValue() : true;
                x5Var.getLogger().m(b5.INFO, "GlobalHubMode: '%s'", String.valueOf(zBooleanValue));
                f12109d = zBooleanValue;
                if (x5Var.getFatalLogger() instanceof m2) {
                    x5Var.setFatalLogger(new j2());
                }
                p3 p3Var = f12108c;
                int i11 = 0;
                if (i3.g.I(p3Var.G, x5Var, h())) {
                    if (h()) {
                        x5Var.getLogger().m(b5.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                    }
                    c().a(true);
                    p3Var.G = x5Var;
                    ?? r32 = p3Var.B;
                    p3Var.B = p3.a(x5Var.getMaxBreadcrumbs());
                    Iterator it = r32.iterator();
                    while (it.hasNext()) {
                        p3Var.g((e) it.next(), null);
                    }
                    f12107b = new u3(new p3(x5Var), new p3(x5Var), p3Var);
                    if (x5Var.isDebug() && (x5Var.getLogger() instanceof m2)) {
                        x5Var.setLogger(new j2());
                    }
                    g(x5Var);
                    f12106a.a(f12107b);
                    f(x5Var);
                    p3Var.P = new g1.f(x5Var);
                    if (x5Var.getExecutorService().isClosed()) {
                        x5Var.setExecutorService(new kg.r(x5Var));
                        x5Var.getExecutorService().e();
                    }
                    try {
                        x5Var.getExecutorService().submit(new z3(x5Var, i11));
                    } catch (RejectedExecutionException e4) {
                        x5Var.getLogger().g(b5.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e4);
                    }
                    try {
                        x5Var.getExecutorService().submit(new b4.e(11, x5Var));
                    } catch (Throwable th3) {
                        x5Var.getLogger().g(b5.DEBUG, "Failed to move previous session.", th3);
                    }
                    for (q1 q1Var : x5Var.getIntegrations()) {
                        try {
                            q1Var.w(x5Var);
                        } catch (Throwable th4) {
                            x5Var.getLogger().g(b5.WARNING, "Failed to register the integration " + q1Var.getClass().getName(), th4);
                        }
                    }
                    try {
                        x5Var.getExecutorService().submit(new z3(x5Var, 2));
                    } catch (Throwable th5) {
                        x5Var.getLogger().g(b5.DEBUG, "Failed to notify options observers.", th5);
                    }
                    try {
                        x5Var.getExecutorService().submit(new b3(x5Var));
                    } catch (Throwable th6) {
                        x5Var.getLogger().g(b5.DEBUG, "Failed to finalize previous session.", th6);
                    }
                    try {
                        x5Var.getExecutorService().submit(new z3(x5Var, i10));
                    } catch (Throwable th7) {
                        x5Var.getLogger().g(b5.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th7);
                    }
                    u0 logger = x5Var.getLogger();
                    b5 b5Var = b5.DEBUG;
                    logger.m(b5Var, "Using openTelemetryMode %s", x5Var.getOpenTelemetryMode());
                    x5Var.getLogger().m(b5Var, "Using span factory %s", x5Var.getSpanFactory().getClass().getName());
                    x5Var.getLogger().m(b5Var, "Using scopes storage %s", f12106a.getClass().getName());
                } else {
                    x5Var.getLogger().m(b5.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
                }
            }
            qVarA.close();
        } catch (Throwable th8) {
            try {
                qVarA.close();
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
            }
            throw th8;
        }
    }

    public static void f(x5 x5Var) {
        Iterator it;
        io.sentry.cache.c bVar;
        u0 logger = x5Var.getLogger();
        b5 b5Var = b5.INFO;
        logger.m(b5Var, "Initializing SDK with DSN: '%s'", x5Var.getDsn());
        String outboxPath = x5Var.getOutboxPath();
        if (outboxPath != null) {
            x5Var.getRuntimeManager().c(new a4(new File(outboxPath), 0));
        } else {
            logger.m(b5Var, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = x5Var.getCacheDirPath();
        if (cacheDirPath != null) {
            x5Var.getRuntimeManager().c(new a4(new File(cacheDirPath), 1));
            if (x5Var.getEnvelopeDiskCache() instanceof io.sentry.transport.i) {
                Charset charset = io.sentry.cache.b.E;
                String cacheDirPath2 = x5Var.getCacheDirPath();
                int maxCacheItems = x5Var.getMaxCacheItems();
                if (cacheDirPath2 == null) {
                    x5Var.getLogger().m(b5.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                    bVar = io.sentry.transport.i.f12765a;
                } else {
                    bVar = new io.sentry.cache.b(x5Var, cacheDirPath2, maxCacheItems);
                }
                x5Var.setEnvelopeDiskCache(bVar);
            }
        }
        String profilingTracesDirPath = x5Var.getProfilingTracesDirPath();
        if ((x5Var.isProfilingEnabled() || x5Var.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            x5Var.getRuntimeManager().c(new a4(file, 2));
            try {
                x5Var.getExecutorService().submit(new androidx.lifecycle.f0(15, file));
            } catch (RejectedExecutionException e4) {
                x5Var.getLogger().g(b5.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e4);
            }
        }
        io.sentry.internal.modules.a modulesLoader = x5Var.getModulesLoader();
        if (!x5Var.isSendModules()) {
            x5Var.setModulesLoader(io.sentry.internal.modules.e.f12369a);
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            x5Var.setModulesLoader(new io.sentry.internal.modules.f(Arrays.asList(new io.sentry.internal.modules.c(x5Var.getLogger()), new io.sentry.internal.modules.f(x5Var.getLogger())), x5Var.getLogger()));
        }
        if (x5Var.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            x5Var.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(x5Var.getLogger()));
        }
        List<Properties> listD = x5Var.getDebugMetaLoader().d();
        if (listD != null) {
            if (x5Var.getBundleIds().isEmpty()) {
                Iterator it2 = listD.iterator();
                while (it2.hasNext()) {
                    String property = ((Properties) it2.next()).getProperty("io.sentry.bundle-ids");
                    x5Var.getLogger().m(b5.DEBUG, "Bundle IDs found: %s", property);
                    if (property != null) {
                        for (String str : property.split(",", -1)) {
                            x5Var.addBundleId(str);
                        }
                    }
                }
            }
            if (x5Var.getProguardUuid() == null) {
                Iterator it3 = listD.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    String property2 = ((Properties) it3.next()).getProperty("io.sentry.ProguardUuids");
                    if (property2 != null) {
                        x5Var.getLogger().m(b5.DEBUG, "Proguard UUID found: %s", property2);
                        x5Var.setProguardUuid(property2);
                        break;
                    }
                }
            }
            Iterator it4 = listD.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Properties properties = (Properties) it4.next();
                String property3 = properties.getProperty("io.sentry.build-tool");
                if (property3 != null) {
                    String property4 = properties.getProperty("io.sentry.build-tool-version");
                    if (property4 == null) {
                        property4 = "unknown";
                    }
                    x5Var.getLogger().m(b5.DEBUG, "Build tool found: %s, version %s", property3, property4);
                    z4.d().b(property3, property4);
                }
            }
            for (Properties properties2 : listD) {
                String property5 = properties2.getProperty("io.sentry.distribution.org-slug");
                String property6 = properties2.getProperty("io.sentry.distribution.project-slug");
                String property7 = properties2.getProperty("io.sentry.distribution.auth-token");
                String property8 = properties2.getProperty("io.sentry.distribution.build-configuration");
                if (property5 != null || property6 != null || property7 != null || property8 != null) {
                    q5 distribution = x5Var.getDistribution();
                    if (property5 != null && !property5.isEmpty() && distribution.f12677b.isEmpty()) {
                        x5Var.getLogger().m(b5.DEBUG, "Distribution org slug found: %s", property5);
                        distribution.f12677b = property5;
                    }
                    if (property6 != null && !property6.isEmpty() && distribution.f12678c.isEmpty()) {
                        x5Var.getLogger().m(b5.DEBUG, "Distribution project slug found: %s", property6);
                        distribution.f12678c = property6;
                    }
                    if (property7 != null && !property7.isEmpty() && distribution.f12676a.isEmpty()) {
                        x5Var.getLogger().m(b5.DEBUG, "Distribution org auth token found", new Object[0]);
                        distribution.f12676a = property7;
                    }
                    if (property8 != null && !property8.isEmpty() && distribution.f12679d == null) {
                        x5Var.getLogger().m(b5.DEBUG, "Distribution build configuration found: %s", property8);
                        distribution.f12679d = property8;
                    }
                }
            }
        }
        if (x5Var.getThreadChecker() instanceof io.sentry.util.thread.b) {
            x5Var.setThreadChecker(io.sentry.util.thread.c.f12822b);
        }
        if (x5Var.getPerformanceCollectors().isEmpty()) {
            x5Var.addPerformanceCollector(new r1());
        }
        if (x5Var.isEnableBackpressureHandling() && !io.sentry.util.g.f12810a) {
            if (x5Var.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                x5Var.setBackpressureMonitor(new io.sentry.backpressure.a(x5Var));
            }
            x5Var.getBackpressureMonitor().start();
        }
        if (x5Var.isContinuousProfilingEnabled()) {
            q0 continuousProfiler = x5Var.getContinuousProfiler();
            j2 j2Var = j2.f12375a;
            if (continuousProfiler == j2Var) {
                try {
                    if (x5Var.getProfilingTracesDirPath() == null) {
                        File file2 = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
                        if (!file2.mkdirs() && !file2.exists()) {
                            throw new IllegalArgumentException("Creating a fallback directory for profiling failed in " + file2.getAbsolutePath());
                        }
                        x5Var.setProfilingTracesDirPath(file2.getAbsolutePath());
                    }
                    u0 logger2 = x5Var.getLogger();
                    x5Var.getProfilingTracesHz();
                    x5Var.getExecutorService();
                    try {
                        it = ServiceLoader.load(io.sentry.profiling.a.class).iterator();
                    } catch (Throwable th2) {
                        logger2.g(b5.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th2);
                    }
                    if ((it.hasNext() ? it.next() : null) != null) {
                        throw new ClassCastException();
                    }
                    logger2.m(b5.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
                    x5Var.setContinuousProfiler(j2Var);
                } catch (Exception e10) {
                    x5Var.getLogger().g(b5.ERROR, "Failed to create default profiling traces directory", e10);
                }
            }
        }
        x5Var.getLogger().m(b5.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(x5Var.isContinuousProfilingEnabled()), x5Var.getProfileLifecycle());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(io.sentry.x5 r6) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.c4.g(io.sentry.x5):void");
    }

    public static boolean h() {
        return c().isEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x026f A[LOOP:5: B:100:0x0269->B:102:0x026f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0392 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0178 A[LOOP:0: B:60:0x0172->B:62:0x0178, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ce A[LOOP:1: B:70:0x01c8->B:72:0x01ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ea A[LOOP:2: B:74:0x01e4->B:76:0x01ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024b A[LOOP:4: B:96:0x0245->B:98:0x024b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean i(io.sentry.x5 r9) throws java.io.IOException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.c4.i(io.sentry.x5):boolean");
    }

    public static void j(String str, String str2) {
        c().b(str, str2);
    }
}
