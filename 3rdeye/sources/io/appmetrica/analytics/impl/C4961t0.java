package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import e5.CallableC4316b;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

/* renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4961t0 implements InterfaceC4791mb {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C4961t0 f41657e = null;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f41658f = false;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f41659g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f41660a;

    /* renamed from: b, reason: collision with root package name */
    public final C4832o0 f41661b;

    /* renamed from: c, reason: collision with root package name */
    public final FutureTask f41662c;

    /* renamed from: d, reason: collision with root package name */
    public final Ua f41663d;

    public C4961t0(Context context) {
        this.f41660a = context;
        C4832o0 c4832o0C = C5065x4.l().c();
        this.f41661b = c4832o0C;
        this.f41663d = c4832o0C.a(context, C5065x4.l().g());
        this.f41662c = new FutureTask(new CallableC4316b(this, 1));
    }

    public static C4961t0 a(Context context) {
        C4961t0 c4961t0;
        C4961t0 c4961t02 = f41657e;
        if (c4961t02 != null) {
            return c4961t02;
        }
        synchronized (C4961t0.class) {
            try {
                c4961t0 = f41657e;
                if (c4961t0 == null) {
                    c4961t0 = new C4961t0(context);
                    c4961t0.j();
                    C5065x4.l().f42014c.a().execute(new RunnableC4935s0(c4961t0));
                    f41657e = c4961t0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4961t0;
    }

    public static void b(boolean z10) {
        c().b(z10);
    }

    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    public static synchronized boolean k() {
        return f41658f;
    }

    public static boolean l() {
        return f41659g;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean m() {
        /*
            java.lang.Class<io.appmetrica.analytics.impl.t0> r0 = io.appmetrica.analytics.impl.C4961t0.class
            monitor-enter(r0)
            io.appmetrica.analytics.impl.t0 r1 = io.appmetrica.analytics.impl.C4961t0.f41657e     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            java.util.concurrent.FutureTask r2 = r1.f41662c     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r2.isDone()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            io.appmetrica.analytics.impl.Va r1 = r1.f()     // Catch: java.lang.Throwable -> L1b
            io.appmetrica.analytics.impl.Cc r1 = r1.i()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            r1 = 1
            goto L1e
        L1b:
            r1 = move-exception
            goto L20
        L1d:
            r1 = 0
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4961t0.m():boolean");
    }

    public static synchronized void n() {
        f41657e = null;
        f41658f = false;
        f41659g = false;
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    public static synchronized void q() {
        f41658f = true;
    }

    public static void r() {
        f41659g = true;
    }

    public static C4961t0 s() {
        return f41657e;
    }

    public static void setDataSendingEnabled(boolean z10) {
        c().setDataSendingEnabled(z10);
    }

    public static void setUserProfileID(String str) {
        c().setUserProfileID(str);
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        this.f41663d.a(appMetricaConfig, this);
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        C5065x4.l().f42014c.a().execute(new RunnableC4936s1(this.f41660a));
    }

    public final String e() {
        return f().e();
    }

    public final Va f() {
        try {
            return (Va) this.f41662c.get();
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    public final Map<String, String> g() {
        return f().g();
    }

    public final AdvIdentifiersResult h() {
        return f().h();
    }

    public final Cc i() {
        return f().i();
    }

    public final void j() {
        C4810n4 c4810n4 = C5065x4.l().f42014c;
        C.V v10 = new C.V(this, 28);
        c4810n4.f41299a.getClass();
        new InterruptionSafeThread(v10, "IAA-INIT_CORE-" + Md.f39862a.incrementAndGet()).start();
    }

    public final void o() {
        C5065x4.l().f42028r.a(this.f41660a);
        new C4913r4(this.f41660a).a(this.f41660a);
        C5065x4.l().a(this.f41660a).a();
        this.f41662c.run();
    }

    public final Va p() {
        Va va2;
        C4832o0 c4832o0 = this.f41661b;
        Context context = this.f41660a;
        Ua ua2 = this.f41663d;
        synchronized (c4832o0) {
            try {
                if (c4832o0.f41326d == null) {
                    if (c4832o0.a(context)) {
                        c4832o0.f41326d = new C5111z0();
                    } else {
                        c4832o0.f41326d = new C5061x0(context, ua2);
                    }
                }
                va2 = c4832o0.f41326d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return va2;
    }

    public final void b(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        C5065x4.l().f42014c.a().execute(new RunnableC4936s1(this.f41660a));
    }

    public final InterfaceC4739kb c(ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    public static InterfaceC4483ad c() {
        if (m()) {
            return f41657e.f();
        }
        return C5065x4.l().f42013b;
    }

    public final C4894qa d() {
        return f().d();
    }

    public final C5115z4 b() {
        return this.f41663d.a();
    }

    public static void a(Location location) {
        c().a(location);
    }

    public static void a(boolean z10) {
        c().a(z10);
    }

    public static void a(String str, String str2) {
        c().a(str, str2);
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f().a(deferredDeeplinkParametersListener);
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        f().a(deferredDeeplinkListener);
    }

    public final void a(ReporterConfig reporterConfig) {
        f().a(reporterConfig);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        f().a(startupParamsCallback, list);
    }

    public static synchronized void a(C4961t0 c4961t0) {
        f41657e = c4961t0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4791mb
    public final InterfaceC4765lb a() {
        return f().a();
    }
}
