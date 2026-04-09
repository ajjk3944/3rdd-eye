package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import io.sentry.b5;
import io.sentry.d2;
import io.sentry.d4;
import io.sentry.r6;
import io.sentry.x5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public final class SentryPerformanceProvider extends j0 {

    /* renamed from: x, reason: collision with root package name */
    public static final long f11515x = SystemClock.uptimeMillis();

    /* renamed from: d, reason: collision with root package name */
    public Application f11516d;

    /* renamed from: g, reason: collision with root package name */
    public final r f11517g;

    /* renamed from: r, reason: collision with root package name */
    public final f0 f11518r;

    public SentryPerformanceProvider() {
        new io.sentry.util.a();
        r rVar = new r(3);
        this.f11517g = rVar;
        this.f11518r = new f0(rVar);
    }

    public final void a(Context context, d4 d4Var, io.sentry.android.core.performance.f fVar) {
        boolean z10 = d4Var.E;
        r rVar = this.f11517g;
        if (!z10) {
            rVar.m(b5.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        g gVar = new g(this.f11518r, new io.sentry.android.core.internal.util.q(context.getApplicationContext(), rVar, this.f11518r), rVar, d4Var.f12189x, d4Var.D, new kg.r(23));
        fVar.D = null;
        fVar.E = gVar;
        rVar.m(b5.DEBUG, "App start continuous profiling started.", new Object[0]);
        x5 x5VarEmpty = x5.empty();
        x5VarEmpty.setProfileSessionSampleRate(Double.valueOf(d4Var.E ? 1.0d : 0.0d));
        gVar.n(d4Var.H, new r6(x5VarEmpty));
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    public final void b(Context context, d4 d4Var, io.sentry.android.core.performance.f fVar) {
        boolean z10 = d4Var.f12187g;
        cj.a aVar = new cj.a(Boolean.valueOf(z10), d4Var.f12188r, (Double) null, Boolean.valueOf(d4Var.f12185a), d4Var.f12186d);
        fVar.F = aVar;
        boolean zBooleanValue = ((Boolean) aVar.f3977x).booleanValue();
        r rVar = this.f11517g;
        if (!zBooleanValue || !z10) {
            rVar.m(b5.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        s sVar = new s(context, this.f11518r, new io.sentry.android.core.internal.util.q(context, rVar, this.f11518r), rVar, d4Var.f12189x, d4Var.f12190y, d4Var.D, new kg.r(23));
        fVar.E = null;
        fVar.D = sVar;
        rVar.m(b5.DEBUG, "App start profiling started.", new Object[0]);
        sVar.start();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        io.sentry.android.core.performance.f.c(this);
        io.sentry.android.core.performance.f fVarB = io.sentry.android.core.performance.f.b();
        Context context = getContext();
        fVarB.f11729r.c(f11515x);
        this.f11518r.getClass();
        fVarB.f11728g.c(Process.getStartUptimeMillis());
        if (context instanceof Application) {
            this.f11516d = (Application) context;
        }
        Application application = this.f11516d;
        if (application != null) {
            fVarB.f(application);
        }
        Context context2 = getContext();
        r rVar = this.f11517g;
        if (context2 == null) {
            rVar.m(b5.FATAL, "App. Context from ContentProvider is null", new Object[0]);
        } else {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            try {
                File file = new File(context2.getCacheDir(), "sentry");
                StrictMode.setThreadPolicy(threadPolicy);
                StrictMode.setVmPolicy(vmPolicy);
                File file2 = new File(file, "app_start_profiling_config");
                if (file2.exists() && file2.canRead()) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                        try {
                            d4 d4Var = (d4) new d2(x5.empty()).b(bufferedReader, d4.class);
                            if (d4Var == null) {
                                rVar.m(b5.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                            } else if (d4Var.B && d4Var.G) {
                                a(context2, d4Var, fVarB);
                            } else if (!d4Var.f12190y) {
                                rVar.m(b5.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                            } else if (d4Var.F) {
                                b(context2, d4Var, fVarB);
                            }
                            bufferedReader.close();
                        } finally {
                        }
                    } catch (FileNotFoundException e4) {
                        rVar.g(b5.ERROR, "App start profiling config file not found. ", e4);
                    } catch (Throwable th2) {
                        rVar.g(b5.ERROR, "Error reading app start profiling config file. ", th2);
                    }
                }
            } catch (Throwable th3) {
                StrictMode.setThreadPolicy(threadPolicy);
                StrictMode.setVmPolicy(vmPolicy);
                throw th3;
            }
        }
        io.sentry.android.core.performance.f.d(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        io.sentry.q qVarA = io.sentry.android.core.performance.f.M.a();
        try {
            s sVar = io.sentry.android.core.performance.f.b().D;
            if (sVar != null) {
                sVar.close();
            }
            g gVar = io.sentry.android.core.performance.f.b().E;
            if (gVar != null) {
                gVar.a(true);
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
}
