package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4382a;

    /* renamed from: b, reason: collision with root package name */
    public final m f4383b;

    /* renamed from: c, reason: collision with root package name */
    public final et.d f4384c;

    /* renamed from: d, reason: collision with root package name */
    public DefaultTrackSelector f4385d;

    /* renamed from: e, reason: collision with root package name */
    public k f4386e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4387f;

    /* renamed from: g, reason: collision with root package name */
    public final AnalyticsCollector f4388g;

    /* renamed from: h, reason: collision with root package name */
    public final Looper f4389h;

    /* renamed from: i, reason: collision with root package name */
    public final y9.b f4390i;
    public final int j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final n1 f4391l;

    /* renamed from: m, reason: collision with root package name */
    public final long f4392m;

    /* renamed from: n, reason: collision with root package name */
    public final long f4393n;

    /* renamed from: o, reason: collision with root package name */
    public final j f4394o;

    /* renamed from: p, reason: collision with root package name */
    public final long f4395p;

    /* renamed from: q, reason: collision with root package name */
    public final long f4396q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4397r;

    public p1(Context context) {
        pb.r rVar;
        m mVar = new m();
        mVar.f4233a = context;
        ca.i iVar = new ca.i();
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context);
        new ya.i(context, iVar);
        k kVar = new k(new pb.p(), 50000, 50000, 2500, 5000);
        oe.i0 i0Var = pb.r.J;
        synchronized (pb.r.class) {
            try {
                if (pb.r.Q == null) {
                    pb.r.Q = new l5.c(context, 1).n();
                }
                rVar = pb.r.Q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        et.d dVar = qb.a.f20757q;
        AnalyticsCollector analyticsCollector = new AnalyticsCollector(dVar);
        this.f4382a = context;
        this.f4383b = mVar;
        this.f4385d = defaultTrackSelector;
        this.f4386e = kVar;
        this.f4387f = rVar;
        this.f4388g = analyticsCollector;
        int i10 = qb.v.f20828a;
        Looper looperMyLooper = Looper.myLooper();
        this.f4389h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f4390i = y9.b.f25910b;
        this.j = 1;
        this.k = true;
        this.f4391l = n1.f4340c;
        this.f4392m = 5000L;
        this.f4393n = 15000L;
        this.f4394o = new j(0, h.c(20L), h.c(500L));
        this.f4384c = dVar;
        this.f4395p = 500L;
        this.f4396q = androidx.media3.exoplayer.ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
    }
}
