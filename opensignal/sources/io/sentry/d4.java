package io.sentry;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class d4 implements c2 {
    public boolean B;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public f3 H;
    public ConcurrentHashMap I;

    /* renamed from: a, reason: collision with root package name */
    public boolean f12185a;

    /* renamed from: d, reason: collision with root package name */
    public Double f12186d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12187g;

    /* renamed from: r, reason: collision with root package name */
    public Double f12188r;

    /* renamed from: x, reason: collision with root package name */
    public String f12189x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12190y;

    public d4(x5 x5Var, cj.a aVar) {
        this.f12187g = ((Boolean) aVar.f3974d).booleanValue();
        this.f12188r = (Double) aVar.f3975g;
        this.f12185a = ((Boolean) aVar.f3977x).booleanValue();
        this.f12186d = (Double) aVar.f3978y;
        r6 internalTracesSampler = x5Var.getInternalTracesSampler();
        double dC = io.sentry.util.i.a().c();
        Double profileSessionSampleRate = internalTracesSampler.f12694a.getProfileSessionSampleRate();
        this.E = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dC;
        this.f12189x = x5Var.getProfilingTracesDirPath();
        this.f12190y = x5Var.isProfilingEnabled();
        this.B = x5Var.isContinuousProfilingEnabled();
        this.H = x5Var.getProfileLifecycle();
        this.D = x5Var.getProfilingTracesHz();
        this.F = x5Var.isEnableAppStartProfiling();
        this.G = x5Var.isStartProfilerOnAppStart();
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("profile_sampled");
        bVar.S(u0Var, Boolean.valueOf(this.f12185a));
        bVar.I("profile_sample_rate");
        bVar.S(u0Var, this.f12186d);
        bVar.I("continuous_profile_sampled");
        bVar.S(u0Var, Boolean.valueOf(this.E));
        bVar.I("trace_sampled");
        bVar.S(u0Var, Boolean.valueOf(this.f12187g));
        bVar.I("trace_sample_rate");
        bVar.S(u0Var, this.f12188r);
        bVar.I("profiling_traces_dir_path");
        bVar.S(u0Var, this.f12189x);
        bVar.I("is_profiling_enabled");
        bVar.S(u0Var, Boolean.valueOf(this.f12190y));
        bVar.I("is_continuous_profiling_enabled");
        bVar.S(u0Var, Boolean.valueOf(this.B));
        bVar.I("profile_lifecycle");
        bVar.S(u0Var, this.H.name());
        bVar.I("profiling_traces_hz");
        bVar.S(u0Var, Integer.valueOf(this.D));
        bVar.I("is_enable_app_start_profiling");
        bVar.S(u0Var, Boolean.valueOf(this.F));
        bVar.I("is_start_profiler_on_app_start");
        bVar.S(u0Var, Boolean.valueOf(this.G));
        ConcurrentHashMap concurrentHashMap = this.I;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.I, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
