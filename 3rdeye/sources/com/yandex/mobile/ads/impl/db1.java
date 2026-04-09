package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class db1 {

    /* renamed from: a, reason: collision with root package name */
    private final ke2 f26050a;

    /* renamed from: b, reason: collision with root package name */
    private final eg2 f26051b;

    /* renamed from: c, reason: collision with root package name */
    private final za1 f26052c;

    /* renamed from: d, reason: collision with root package name */
    private final nx1 f26053d;

    /* renamed from: e, reason: collision with root package name */
    private final ja1 f26054e;

    /* renamed from: f, reason: collision with root package name */
    private final hl1 f26055f;

    /* renamed from: g, reason: collision with root package name */
    private final pb1 f26056g;

    /* renamed from: h, reason: collision with root package name */
    private final rh1 f26057h;
    private final rh1 i;

    /* renamed from: j, reason: collision with root package name */
    private final ap1 f26058j;

    /* renamed from: k, reason: collision with root package name */
    private final a f26059k;

    /* renamed from: l, reason: collision with root package name */
    private final ws0 f26060l;

    /* renamed from: m, reason: collision with root package name */
    private rh1 f26061m;

    public final class a implements gc2 {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(db1 this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            db1.a(this$0, this$0.f26057h);
        }

        @Override // com.yandex.mobile.ads.impl.gc2
        public final void c() {
            ob1 ob1VarB = db1.this.f26051b.b();
            if (ob1VarB != null) {
                ob1VarB.setClickable(true);
            }
        }

        @Override // com.yandex.mobile.ads.impl.gc2
        public final void b() {
            db1.this.f26061m = null;
            nx1 nx1Var = db1.this.f26053d;
            if (nx1Var == null || !nx1Var.c()) {
                db1.this.f26058j.a();
            } else {
                db1.this.f26060l.a(new Z(db1.this, 0));
            }
            db1.this.f26052c.b();
        }

        @Override // com.yandex.mobile.ads.impl.gc2
        public final void a() {
            db1.this.f26052c.a();
        }
    }

    public final class b implements gp1 {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.gp1
        public final void a(ob1 nativeVideoView) {
            kotlin.jvm.internal.l.f(nativeVideoView, "nativeVideoView");
            db1 db1Var = db1.this;
            db1.a(db1Var, db1Var.f26057h);
        }
    }

    public db1(Context context, a8 adResponse, C4072a3 adConfiguration, ia1 videoAdPlayer, ya2 video, ke2 videoOptions, eg2 videoViewAdapter, hc2 playbackParametersProvider, ag2 videoTracker, he2 impressionTrackingListener, za1 nativeVideoPlaybackEventListener, ej0 imageProvider, nx1 nx1Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(videoAdPlayer, "videoAdPlayer");
        kotlin.jvm.internal.l.f(video, "video");
        kotlin.jvm.internal.l.f(videoOptions, "videoOptions");
        kotlin.jvm.internal.l.f(videoViewAdapter, "videoViewAdapter");
        kotlin.jvm.internal.l.f(playbackParametersProvider, "playbackParametersProvider");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(impressionTrackingListener, "impressionTrackingListener");
        kotlin.jvm.internal.l.f(nativeVideoPlaybackEventListener, "nativeVideoPlaybackEventListener");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        this.f26050a = videoOptions;
        this.f26051b = videoViewAdapter;
        this.f26052c = nativeVideoPlaybackEventListener;
        this.f26053d = nx1Var;
        this.f26058j = new ap1(videoViewAdapter, new b());
        this.f26059k = new a();
        this.f26060l = new ws0();
        sb1 sb1Var = new sb1(videoViewAdapter);
        this.f26054e = new ja1(videoAdPlayer);
        this.f26056g = new pb1(videoAdPlayer);
        qc2 qc2Var = new qc2();
        new na1(videoViewAdapter, videoAdPlayer, sb1Var, nativeVideoPlaybackEventListener).a(qc2Var);
        ya1 ya1Var = new ya1(context, adResponse, adConfiguration, videoAdPlayer, video.b(), sb1Var, playbackParametersProvider, videoTracker, qc2Var, impressionTrackingListener);
        hp1 hp1Var = new hp1(videoAdPlayer, video.b(), qc2Var);
        qb1 qb1Var = new qb1(videoAdPlayer, videoOptions);
        hl1 hl1Var = new hl1(video, new vi0(context, new t81(adResponse), imageProvider));
        this.f26055f = hl1Var;
        this.i = new rh1(videoViewAdapter, ya1Var, qb1Var, hl1Var);
        this.f26057h = new rh1(videoViewAdapter, hp1Var, qb1Var, hl1Var);
    }

    public static final void a(db1 db1Var, rh1 rh1Var) {
        db1Var.f26061m = rh1Var;
        if (rh1Var != null) {
            rh1Var.a(db1Var.f26059k);
        }
        rh1 rh1Var2 = db1Var.f26061m;
        if (rh1Var2 != null) {
            rh1Var2.a();
        }
    }

    public final void b(ob1 nativeVideoView) {
        kotlin.jvm.internal.l.f(nativeVideoView, "nativeVideoView");
        rh1 rh1Var = this.f26061m;
        if (rh1Var != null) {
            rh1Var.a(nativeVideoView);
        }
        this.f26056g.b(nativeVideoView);
    }

    public final void a() {
        ob1 ob1VarB = this.f26051b.b();
        if (ob1VarB != null) {
            ob1VarB.setClickable(false);
        }
    }

    public final void a(ob1 nativeVideoView) {
        kotlin.jvm.internal.l.f(nativeVideoView, "nativeVideoView");
        this.f26054e.a(this.f26050a);
        this.f26056g.a(nativeVideoView);
        this.f26055f.a(nativeVideoView.b());
        rh1 rh1Var = this.i;
        this.f26061m = rh1Var;
        if (rh1Var != null) {
            rh1Var.a(this.f26059k);
        }
        rh1 rh1Var2 = this.f26061m;
        if (rh1Var2 != null) {
            rh1Var2.a();
        }
    }
}
