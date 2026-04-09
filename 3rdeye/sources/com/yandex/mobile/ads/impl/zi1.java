package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class zi1 implements tl1 {

    /* renamed from: a, reason: collision with root package name */
    private final ef2 f36514a;

    /* renamed from: b, reason: collision with root package name */
    private final sn1 f36515b;

    /* renamed from: c, reason: collision with root package name */
    private final rn1 f36516c;

    /* renamed from: d, reason: collision with root package name */
    private final bj1 f36517d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f36518e;

    public zi1(ef2 videoProgressMonitoringManager, sn1 readyToPrepareProvider, rn1 readyToPlayProvider, bj1 playlistSchedulerListener) {
        kotlin.jvm.internal.l.f(videoProgressMonitoringManager, "videoProgressMonitoringManager");
        kotlin.jvm.internal.l.f(readyToPrepareProvider, "readyToPrepareProvider");
        kotlin.jvm.internal.l.f(readyToPlayProvider, "readyToPlayProvider");
        kotlin.jvm.internal.l.f(playlistSchedulerListener, "playlistSchedulerListener");
        this.f36514a = videoProgressMonitoringManager;
        this.f36515b = readyToPrepareProvider;
        this.f36516c = readyToPlayProvider;
        this.f36517d = playlistSchedulerListener;
    }

    @Override // com.yandex.mobile.ads.impl.tl1
    public final void a(long j4) {
        zs zsVarA = this.f36516c.a(j4);
        if (zsVarA != null) {
            this.f36517d.a(zsVarA);
            return;
        }
        zs zsVarA2 = this.f36515b.a(j4);
        if (zsVarA2 != null) {
            this.f36517d.b(zsVarA2);
        }
    }

    public final void b() {
        if (this.f36518e) {
            this.f36514a.a((tl1) null);
            this.f36514a.b();
            this.f36518e = false;
        }
    }

    public final void a() {
        if (this.f36518e) {
            return;
        }
        this.f36518e = true;
        this.f36514a.a(this);
        this.f36514a.a();
    }
}
