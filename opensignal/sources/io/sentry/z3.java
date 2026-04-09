package io.sentry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* loaded from: classes.dex */
public final /* synthetic */ class z3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12879a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x5 f12880d;

    public /* synthetic */ z3(x5 x5Var, int i10) {
        this.f12879a = i10;
        this.f12880d = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalArgumentException {
        switch (this.f12879a) {
            case 0:
                this.f12880d.loadLazyFields();
                return;
            case 1:
                x5 x5Var = this.f12880d;
                String cacheDirPathWithoutDsn = x5Var.getCacheDirPathWithoutDsn();
                if (cacheDirPathWithoutDsn != null) {
                    File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                    try {
                        com.google.android.gms.internal.measurement.e5.r(file);
                        if (x5Var.isEnableAppStartProfiling() || x5Var.isStartProfilerOnAppStart()) {
                            if (!x5Var.isStartProfilerOnAppStart() && !x5Var.isTracingEnabled()) {
                                x5Var.getLogger().m(b5.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                return;
                            }
                            if (file.createNewFile()) {
                                d4 d4Var = new d4(x5Var, x5Var.isEnableAppStartProfiling() ? x5Var.getInternalTracesSampler().a(new i4.b(new s6("app.launch", io.sentry.protocol.c0.CUSTOM, "profile", null), Double.valueOf(io.sentry.util.i.a().c()))) : new cj.a(Boolean.FALSE, (Double) null));
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, c4.f12110e));
                                    try {
                                        x5Var.getSerializer().e(d4Var, bufferedWriter);
                                        bufferedWriter.close();
                                        fileOutputStream.close();
                                        return;
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        x5Var.getLogger().g(b5.ERROR, "Unable to create app start profiling config file. ", th2);
                        return;
                    }
                }
                return;
            case 2:
                x5 x5Var2 = this.f12880d;
                for (v0 v0Var : x5Var2.getOptionsObservers()) {
                    String release = x5Var2.getRelease();
                    io.sentry.cache.d dVar = (io.sentry.cache.d) v0Var;
                    if (release == null) {
                        dVar.a("release.json");
                    } else {
                        dVar.b(release, "release.json");
                    }
                    String proguardUuid = x5Var2.getProguardUuid();
                    if (proguardUuid == null) {
                        dVar.a("proguard-uuid.json");
                    } else {
                        dVar.b(proguardUuid, "proguard-uuid.json");
                    }
                    io.sentry.protocol.r sdkVersion = x5Var2.getSdkVersion();
                    if (sdkVersion == null) {
                        dVar.a("sdk-version.json");
                    } else {
                        dVar.b(sdkVersion, "sdk-version.json");
                    }
                    String dist = x5Var2.getDist();
                    if (dist == null) {
                        dVar.a("dist.json");
                    } else {
                        dVar.b(dist, "dist.json");
                    }
                    String environment = x5Var2.getEnvironment();
                    if (environment == null) {
                        dVar.a("environment.json");
                    } else {
                        dVar.b(environment, "environment.json");
                    }
                    dVar.b(x5Var2.getTags(), "tags.json");
                    Double d6 = x5Var2.getSessionReplay().f12075b;
                    if (d6 == null) {
                        dVar.a("replay-error-sample-rate.json");
                    } else {
                        dVar.b(d6.toString(), "replay-error-sample-rate.json");
                    }
                }
                io.sentry.cache.f fVarFindPersistingScopeObserver = x5Var2.findPersistingScopeObserver();
                if (fVarFindPersistingScopeObserver != null) {
                    try {
                        ((io.sentry.cache.tape.f) fVarFindPersistingScopeObserver.f12134b.a()).clear();
                    } catch (IOException e4) {
                        fVarFindPersistingScopeObserver.f12133a.getLogger().g(b5.ERROR, "Failed to clear breadcrumbs from file queue", e4);
                    }
                    fVarFindPersistingScopeObserver.a("user.json");
                    fVarFindPersistingScopeObserver.a("level.json");
                    fVarFindPersistingScopeObserver.a("request.json");
                    fVarFindPersistingScopeObserver.a("fingerprint.json");
                    fVarFindPersistingScopeObserver.a("contexts.json");
                    fVarFindPersistingScopeObserver.a("extras.json");
                    fVarFindPersistingScopeObserver.a("tags.json");
                    fVarFindPersistingScopeObserver.a("trace.json");
                    fVarFindPersistingScopeObserver.a("transaction.json");
                    return;
                }
                return;
            default:
                c4.c().c(this.f12880d.getFlushTimeoutMillis());
                return;
        }
    }
}
