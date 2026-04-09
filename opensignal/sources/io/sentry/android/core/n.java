package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import h7.r1;
import io.sentry.android.core.EnvelopeFileObserverIntegration;
import io.sentry.android.distribution.DistributionIntegration;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.b5;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.h2;
import io.sentry.i2;
import io.sentry.j2;
import io.sentry.j5;
import io.sentry.l1;
import io.sentry.s2;
import io.sentry.x2;
import java.util.ArrayList;
import p.v2;

/* loaded from: classes.dex */
public abstract class n {
    public static void a(SentryAndroidOptions sentryAndroidOptions, Context context, f0 f0Var, sm.f fVar, v2 v2Var) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.i)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.a(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof i2) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.c(context, f0Var, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.f(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.d(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new io.sentry.n(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new g0(context, f0Var, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new s0(sentryAndroidOptions, v2Var));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, f0Var));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new v(context, f0Var, sentryAndroidOptions));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.k) {
            f0 f0Var2 = new f0();
            f0Var2.f11569a = sentryAndroidOptions;
            sentryAndroidOptions.setTransportGate(f0Var2);
        }
        io.sentry.android.core.performance.f fVarB = io.sentry.android.core.performance.f.b();
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.internal.modules.f(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            io.sentry.u0 logger = sentryAndroidOptions.getLogger();
            io.sentry.t tVar = new io.sentry.t();
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            tVar.f12736a = applicationContext;
            tVar.f12737d = logger;
            sentryAndroidOptions.setDebugMetaLoader(tVar);
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof x2) {
            sentryAndroidOptions.setVersionDetector(new io.sentry.s(sentryAndroidOptions, 0));
        }
        io.sentry.util.e eVar = new io.sentry.util.e(new j5(fVar, sentryAndroidOptions));
        boolean zK = sm.f.K(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(eVar));
            if (zK && sm.f.K(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zK && sm.f.K(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.e.f11647a);
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof s2) {
            sentryAndroidOptions.setSocketTagger(r.f11756d);
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new k());
            sentryAndroidOptions.addPerformanceCollector(new h(sentryAndroidOptions.getLogger()));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                io.sentry.android.core.internal.util.q frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                ir.f0.T(frameMetricsCollector, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.addPerformanceCollector(new z0(sentryAndroidOptions, frameMetricsCollector));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof h2) {
            sentryAndroidOptions.setCompositePerformanceCollector(new io.sentry.p(sentryAndroidOptions));
        }
        io.sentry.q qVarA = io.sentry.android.core.performance.f.M.a();
        try {
            l1 l1Var = fVarB.D;
            g gVar = fVarB.E;
            fVarB.D = null;
            fVarB.E = null;
            qVarA.close();
            io.sentry.l compositePerformanceCollector = sentryAndroidOptions.getCompositePerformanceCollector();
            if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
                sentryAndroidOptions.setContinuousProfiler(j2.f12375a);
                if (gVar != null) {
                    gVar.a(true);
                }
                if (l1Var != null) {
                    sentryAndroidOptions.setTransactionProfiler(l1Var);
                    return;
                }
                io.sentry.android.core.internal.util.q frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                ir.f0.T(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.setTransactionProfiler(new s(context, f0Var, frameMetricsCollector2, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService()));
                return;
            }
            sentryAndroidOptions.setTransactionProfiler(j2.f12380y);
            if (l1Var != null) {
                l1Var.close();
            }
            if (gVar == null) {
                io.sentry.android.core.internal.util.q frameMetricsCollector3 = sentryAndroidOptions.getFrameMetricsCollector();
                ir.f0.T(frameMetricsCollector3, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.setContinuousProfiler(new g(f0Var, frameMetricsCollector3, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService()));
            } else {
                sentryAndroidOptions.setContinuousProfiler(gVar);
                io.sentry.protocol.t tVar2 = gVar.K;
                if (!gVar.E || tVar2.equals(io.sentry.protocol.t.f12636d)) {
                    return;
                }
                compositePerformanceCollector.a(tVar2.toString());
            }
        } finally {
        }
    }

    public static void b(Context context, SentryAndroidOptions sentryAndroidOptions, f0 f0Var, sm.f fVar, v2 v2Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        io.sentry.util.e eVar = new io.sentry.util.e(new m(sentryAndroidOptions));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new i.g0(new m(sentryAndroidOptions)), eVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(sm.f.L(sentryAndroidOptions.getLogger(), "io.sentry.android.ndk.SentryNdk")));
        sentryAndroidOptions.addIntegration(new EnvelopeFileObserverIntegration.OutboxEnvelopeFileObserverIntegration(0));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new r1(8, new m(sentryAndroidOptions)), eVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(Build.VERSION.SDK_INT >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, f0Var, v2Var));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, fVar));
            if (z10) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().m(b5.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z11) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, f0Var));
        if (z12) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context);
            replayIntegration.I = new io.sentry.android.replay.c();
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        if (z13) {
            DistributionIntegration distributionIntegration = new DistributionIntegration(context);
            sentryAndroidOptions.setDistributionController(distributionIntegration);
            sentryAndroidOptions.addIntegration(distributionIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().getClass();
    }
}
