package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import com.yandex.mobile.ads.impl.bi1;
import java.util.List;

/* loaded from: classes3.dex */
public final class d70 implements ia1 {

    /* renamed from: a, reason: collision with root package name */
    private final i60 f25999a;

    /* renamed from: b, reason: collision with root package name */
    private final ow0 f26000b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2 f26001c;

    /* renamed from: d, reason: collision with root package name */
    private final ha1 f26002d;

    /* renamed from: e, reason: collision with root package name */
    private final jf2 f26003e;

    /* renamed from: f, reason: collision with root package name */
    private final a f26004f;

    /* renamed from: g, reason: collision with root package name */
    private final u60 f26005g;

    /* renamed from: h, reason: collision with root package name */
    private ab1 f26006h;
    private lc2 i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26007j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26008k;

    public final class a implements bi1.b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f26009a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f26010b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f26011c;

        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void a(int i) {
            G.a(this, i);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final void b(h60 error) {
            kotlin.jvm.internal.l.f(error, "error");
            this.f26009a = false;
            d70.this.f26005g.b();
            d70.this.f25999a.stop();
            d70.this.f26001c.a(error.getMessage());
            lc2 lc2Var = d70.this.i;
            ec2 ec2Var = d70.this.f26006h;
            if (lc2Var == null || ec2Var == null) {
                return;
            }
            d70.this.f26002d.getClass();
            lc2Var.a(ec2Var, ha1.a(error));
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void onCues(List list) {
            G.o(this, list);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void onIsLoadingChanged(boolean z10) {
            G.p(this, z10);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final void onIsPlayingChanged(boolean z10) {
            if (!z10) {
                if (this.f26010b) {
                    return;
                }
                this.f26011c = true;
                lc2 lc2Var = d70.this.i;
                ec2 ec2Var = d70.this.f26006h;
                if (lc2Var == null || ec2Var == null) {
                    return;
                }
                lc2Var.b(ec2Var);
                return;
            }
            if (!this.f26009a) {
                lc2 lc2Var2 = d70.this.i;
                ec2 ec2Var2 = d70.this.f26006h;
                if (lc2Var2 == null || ec2Var2 == null) {
                    return;
                }
                this.f26009a = true;
                lc2Var2.h(ec2Var2);
                return;
            }
            if (this.f26011c) {
                this.f26011c = false;
                lc2 lc2Var3 = d70.this.i;
                ec2 ec2Var3 = d70.this.f26006h;
                if (lc2Var3 == null || ec2Var3 == null) {
                    return;
                }
                lc2Var3.g(ec2Var3);
            }
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i) {
            G.r(this, z10, i);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final void onPlaybackStateChanged(int i) {
            if (i == 2) {
                this.f26010b = true;
                lc2 lc2Var = d70.this.i;
                ec2 ec2Var = d70.this.f26006h;
                if (lc2Var == null || ec2Var == null) {
                    return;
                }
                lc2Var.f(ec2Var);
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                this.f26009a = false;
                lc2 lc2Var2 = d70.this.i;
                ec2 ec2Var2 = d70.this.f26006h;
                if (lc2Var2 == null || ec2Var2 == null) {
                    return;
                }
                lc2Var2.a(ec2Var2);
                return;
            }
            d70.this.f26005g.b();
            lc2 lc2Var3 = d70.this.i;
            ec2 ec2Var3 = d70.this.f26006h;
            if (lc2Var3 != null && ec2Var3 != null) {
                lc2Var3.d(ec2Var3);
            }
            if (this.f26010b) {
                this.f26010b = false;
                lc2 lc2Var4 = d70.this.i;
                ec2 ec2Var4 = d70.this.f26006h;
                if (lc2Var4 == null || ec2Var4 == null) {
                    return;
                }
                lc2Var4.c(ec2Var4);
            }
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            G.t(this, i);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void onPlayerStateChanged(boolean z10, int i) {
            G.u(this, z10, i);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void onRenderedFirstFrame() {
            G.v(this);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
            G.w(this, z10);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void onSurfaceSizeChanged(int i, int i10) {
            G.x(this, i, i10);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void onVolumeChanged(float f10) {
            G.y(this, f10);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void a(aw0 aw0Var) {
            G.b(this, aw0Var);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void a(bi1.a aVar) {
            G.c(this, aVar);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void a(bi1.c cVar, bi1.c cVar2, int i) {
            G.d(this, cVar, cVar2, i);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void a(cv cvVar) {
            G.e(this, cvVar);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void a(d10 d10Var) {
            G.f(this, d10Var);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void a(h60 h60Var) {
            G.g(this, h60Var);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void a(o62 o62Var) {
            G.h(this, o62Var);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void a(pf2 pf2Var) {
            G.i(this, pf2Var);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void a(vh1 vh1Var) {
            G.j(this, vh1Var);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void a(xv0 xv0Var, int i) {
            G.k(this, xv0Var, i);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void a(yz0 yz0Var) {
            G.l(this, yz0Var);
        }

        @Override // com.yandex.mobile.ads.impl.bi1.b
        public final /* synthetic */ void a(boolean z10, int i) {
            G.m(this, z10, i);
        }
    }

    public d70(i60 exoPlayer, ow0 mediaSourceProvider, ze2 playerEventsReporter, ha1 videoAdPlayerErrorConverter, jf2 videoScaleController) {
        kotlin.jvm.internal.l.f(exoPlayer, "exoPlayer");
        kotlin.jvm.internal.l.f(mediaSourceProvider, "mediaSourceProvider");
        kotlin.jvm.internal.l.f(playerEventsReporter, "playerEventsReporter");
        kotlin.jvm.internal.l.f(videoAdPlayerErrorConverter, "videoAdPlayerErrorConverter");
        kotlin.jvm.internal.l.f(videoScaleController, "videoScaleController");
        this.f25999a = exoPlayer;
        this.f26000b = mediaSourceProvider;
        this.f26001c = playerEventsReporter;
        this.f26002d = videoAdPlayerErrorConverter;
        this.f26003e = videoScaleController;
        a aVar = new a();
        this.f26004f = aVar;
        this.f26005g = new u60(aVar);
        exoPlayer.b(aVar);
        exoPlayer.b(videoScaleController);
        C4186q5.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.ia1
    public final long getAdPosition() {
        return this.f25999a.getCurrentPosition();
    }

    @Override // com.yandex.mobile.ads.impl.ia1
    public final float getVolume() {
        return this.f25999a.getVolume();
    }

    @Override // com.yandex.mobile.ads.impl.ia1
    public final boolean isPlayingAd() {
        return ((lk) this.f25999a).b();
    }

    @Override // com.yandex.mobile.ads.impl.ia1
    public final void pauseAd() {
        if (this.f26007j) {
            return;
        }
        this.f25999a.setPlayWhenReady(false);
    }

    @Override // com.yandex.mobile.ads.impl.ia1
    public final void resumeAd() {
        if (this.f26007j || this.f26008k) {
            return;
        }
        this.f25999a.setPlayWhenReady(true);
    }

    @Override // com.yandex.mobile.ads.impl.ia1
    public final void setVolume(float f10) {
        if (this.f26007j) {
            return;
        }
        this.f25999a.setVolume(f10);
        lc2 lc2Var = this.i;
        ab1 ab1Var = this.f26006h;
        if (lc2Var == null || ab1Var == null) {
            return;
        }
        lc2Var.a(ab1Var, f10);
    }

    public final void a(bi1.b listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f25999a.b(listener);
    }

    @Override // com.yandex.mobile.ads.impl.ia1
    public final long b() {
        return this.f25999a.getDuration();
    }

    @Override // com.yandex.mobile.ads.impl.ia1
    public final void c() {
        if (!this.f26007j) {
            this.f25999a.setPlayWhenReady(true);
        }
        if (this.f26008k) {
            pauseAd();
        }
    }

    @Override // com.yandex.mobile.ads.impl.cc0
    public final void d() {
        this.f26008k = false;
    }

    @Override // com.yandex.mobile.ads.impl.ia1
    public final boolean e() {
        return this.f26007j;
    }

    @Override // com.yandex.mobile.ads.impl.cc0
    public final void f() {
        this.f26008k = true;
        pauseAd();
    }

    @Override // com.yandex.mobile.ads.impl.ia1
    public final void a(kc2 error) {
        kotlin.jvm.internal.l.f(error, "error");
        if (this.f26007j) {
            return;
        }
        this.f26007j = true;
        this.f26008k = false;
        this.f26005g.b();
        this.f25999a.setVideoTextureView(null);
        this.f26003e.a((TextureView) null);
        this.f25999a.a(this.f26004f);
        this.f25999a.a(this.f26003e);
        this.f25999a.release();
    }

    @Override // com.yandex.mobile.ads.impl.ia1
    public final void a(ab1 playbackInfo) {
        kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        this.f26006h = playbackInfo;
        if (this.f26007j) {
            return;
        }
        am1 am1VarA = this.f26000b.a(playbackInfo);
        this.f25999a.setPlayWhenReady(false);
        this.f25999a.a(am1VarA);
        this.f25999a.prepare();
        this.f26005g.a();
    }

    @Override // com.yandex.mobile.ads.impl.ia1
    public final void a(lc2 lc2Var) {
        this.i = lc2Var;
    }

    @Override // com.yandex.mobile.ads.impl.ia1
    public final void a(TextureView textureView) {
        if (this.f26007j) {
            return;
        }
        this.f26003e.a(textureView);
        this.f25999a.setVideoTextureView(textureView);
    }

    @Override // com.yandex.mobile.ads.impl.ia1
    public final void a(lf2 lf2Var) {
        if (this.f26007j) {
            return;
        }
        this.f26003e.a(lf2Var);
    }

    @Override // com.yandex.mobile.ads.impl.ia1
    public final void a() {
        if (this.f26007j) {
            return;
        }
        lc2 lc2Var = this.i;
        ab1 ab1Var = this.f26006h;
        if (lc2Var != null && ab1Var != null) {
            lc2Var.e(ab1Var);
        }
        this.f26007j = true;
        this.f26008k = false;
        this.f26005g.b();
        this.f25999a.setVideoTextureView(null);
        this.f26003e.a((TextureView) null);
        this.f25999a.a(this.f26004f);
        this.f25999a.a(this.f26003e);
        this.f25999a.release();
    }
}
