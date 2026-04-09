package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.b1;
import com.applovin.impl.d6;
import com.applovin.impl.m8;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a2 extends w1 implements AppLovinCommunicatorSubscriber {
    private final b2 M;
    private MediaPlayer N;
    private final View O;
    protected final AppLovinVideoView P;
    protected final com.applovin.impl.a Q;
    protected final com.applovin.impl.adview.g R;
    protected i0 S;
    protected final ImageView T;
    protected com.applovin.impl.adview.l U;
    protected final ProgressBar V;
    protected ProgressBar W;
    protected ImageView X;
    private final e Y;
    private final d Z;

    /* renamed from: a0, reason: collision with root package name */
    private final Handler f3553a0;

    /* renamed from: b0, reason: collision with root package name */
    private final Handler f3554b0;

    /* renamed from: c0, reason: collision with root package name */
    protected final b1 f3555c0;

    /* renamed from: d0, reason: collision with root package name */
    protected final b1 f3556d0;

    /* renamed from: e0, reason: collision with root package name */
    private final boolean f3557e0;

    /* renamed from: f0, reason: collision with root package name */
    protected boolean f3558f0;

    /* renamed from: g0, reason: collision with root package name */
    protected long f3559g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f3560h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f3561i0;

    /* renamed from: j0, reason: collision with root package name */
    protected boolean f3562j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f3563k0;

    /* renamed from: l0, reason: collision with root package name */
    private final AtomicBoolean f3564l0;

    /* renamed from: m0, reason: collision with root package name */
    private final AtomicBoolean f3565m0;

    /* renamed from: n0, reason: collision with root package name */
    private long f3566n0;

    /* renamed from: o0, reason: collision with root package name */
    private long f3567o0;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements b1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3568a;

        public a(int i4) {
            this.f3568a = i4;
        }

        @Override // com.applovin.impl.b1.b
        public void a() {
            if (a2.this.S != null) {
                long seconds = this.f3568a - TimeUnit.MILLISECONDS.toSeconds(r0.P.getCurrentPosition());
                if (seconds <= 0) {
                    a2.this.f5911v = true;
                } else if (a2.this.Q()) {
                    a2.this.S.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.b1.b
        public boolean b() {
            return a2.this.Q();
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b implements b1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f3570a;

        public b(Integer num) {
            this.f3570a = num;
        }

        @Override // com.applovin.impl.b1.b
        public void a() {
            a2 a2Var = a2.this;
            if (a2Var.f3562j0) {
                a2Var.V.setVisibility(8);
            } else {
                a2.this.V.setProgress((int) ((a2Var.P.getCurrentPosition() / a2.this.f3559g0) * this.f3570a.intValue()));
            }
        }

        @Override // com.applovin.impl.b1.b
        public boolean b() {
            return !a2.this.f3562j0;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class c implements b1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f3572a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f3573b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f3574c;

        public c(long j, Integer num, Long l10) {
            this.f3572a = j;
            this.f3573b = num;
            this.f3574c = l10;
        }

        @Override // com.applovin.impl.b1.b
        public void a() {
            a2.this.W.setProgress((int) ((a2.this.f5907r / this.f3572a) * this.f3573b.intValue()));
            a2 a2Var = a2.this;
            a2Var.f5907r = this.f3574c.longValue() + a2Var.f5907r;
        }

        @Override // com.applovin.impl.b1.b
        public boolean b() {
            return a2.this.f5907r < this.f3572a;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class d implements m8.a {
        private d() {
        }

        @Override // com.applovin.impl.m8.a
        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f5894c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f5894c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            a2.this.a("video_button");
        }

        @Override // com.applovin.impl.m8.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f5894c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f5894c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            a2.this.a(lVar.getAndClearLastClickEvent());
        }

        @Override // com.applovin.impl.m8.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f5894c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f5894c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            a2.this.J = true;
        }

        @Override // com.applovin.impl.m8.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f5894c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f5894c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            a2.this.T();
        }

        public /* synthetic */ d(a2 a2Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.m8.a
        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f5894c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f5894c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            k7.a(uri, a2.this.b().getController(), a2.this.f5893b);
        }

        @Override // com.applovin.impl.m8.a
        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.f5894c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f5894c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            k7.c(uri, a2.this.b().getController().g(), a2.this.f5893b);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            a2.this.a(motionEvent);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            com.applovin.impl.sdk.o oVar = a2.this.f5894c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f5894c.a("AppLovinFullscreenActivity", "Video completed");
            }
            a2.this.f3563k0 = true;
            a2 a2Var = a2.this;
            if (!a2Var.f5909t) {
                a2Var.S();
            } else if (a2Var.h()) {
                a2.this.A();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i4, int i10) {
            a2.this.g(r5.c.i(i4, "Video view error (", ",", i10, ")"));
            a2.this.P.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i4, int i10) {
            com.applovin.impl.sdk.o oVar = a2.this.f5894c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f5894c.a("AppLovinFullscreenActivity", r5.c.i(i4, "MediaPlayer Info: (", ", ", i10, ")"));
            }
            if (i4 == 701) {
                a2.this.R();
                return false;
            }
            if (i4 != 3) {
                if (i4 != 702) {
                    return false;
                }
                a2.this.E();
                return false;
            }
            a2.this.f3555c0.b();
            a2 a2Var = a2.this;
            if (a2Var.R != null) {
                a2Var.P();
            }
            a2.this.E();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            a2.this.N = mediaPlayer;
            mediaPlayer.setOnInfoListener(a2.this.Y);
            mediaPlayer.setOnErrorListener(a2.this.Y);
            float f10 = !a2.this.f3558f0 ? 1 : 0;
            mediaPlayer.setVolume(f10, f10);
            a2.this.f5910u = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            a2.this.d(mediaPlayer.getDuration());
            a2.this.O();
            com.applovin.impl.sdk.o oVar = a2.this.f5894c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.f5894c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + a2.this.N);
            }
        }

        public /* synthetic */ e(a2 a2Var, a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class f implements View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a2 a2Var = a2.this;
            if (view == a2Var.R) {
                a2Var.T();
                return;
            }
            if (view == a2Var.T) {
                a2Var.U();
            } else if (com.applovin.impl.sdk.o.a()) {
                a2.this.f5894c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ f(a2 a2Var, a aVar) {
            this();
        }
    }

    public a2(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.M = new b2(this.f5892a, this.f5895d, this.f5893b);
        a aVar = null;
        this.X = null;
        e eVar = new e(this, aVar);
        this.Y = eVar;
        d dVar = new d(this, aVar);
        this.Z = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f3553a0 = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f3554b0 = handler2;
        b1 b1Var = new b1(handler, this.f5893b);
        this.f3555c0 = b1Var;
        this.f3556d0 = new b1(handler2, this.f5893b);
        boolean zC0 = this.f5892a.C0();
        this.f3557e0 = zC0;
        this.f3558f0 = n7.e(this.f5893b);
        this.f3561i0 = -1;
        this.f3564l0 = new AtomicBoolean();
        this.f3565m0 = new AtomicBoolean();
        this.f3566n0 = -2L;
        this.f3567o0 = 0L;
        if (!bVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.P = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(eVar);
        appLovinVideoView.setOnCompletionListener(eVar);
        appLovinVideoView.setOnErrorListener(eVar);
        bVar.h().putString("video_view_address", e8.a(appLovinVideoView));
        View view = new View(activity);
        this.O = view;
        boolean z3 = false;
        view.setBackgroundColor(Color.argb(254, 0, 0, 0));
        if (((Boolean) kVar.a(x4.f6088m1)).booleanValue()) {
            view.setOnTouchListener(new AppLovinTouchToClickListener(kVar, x4.f6021e0, activity, eVar));
        } else {
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(kVar, x4.f6021e0, activity, eVar));
            view.setOnTouchListener(new t8(0));
        }
        f fVar = new f(this, aVar);
        if (bVar.d0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.U(), activity);
            this.R = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(fVar);
        } else {
            this.R = null;
        }
        if (a(this.f3558f0, kVar)) {
            ImageView imageView = new ImageView(activity);
            this.T = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(fVar);
            e(this.f3558f0);
        } else {
            this.T = null;
        }
        String strA0 = bVar.a0();
        if (StringUtils.isValidString(strA0)) {
            m8 m8Var = new m8(kVar);
            m8Var.a(new WeakReference(dVar));
            com.applovin.impl.adview.l lVar = new com.applovin.impl.adview.l(bVar.Z(), bVar, m8Var, activity);
            this.U = lVar;
            lVar.a(strA0);
        } else {
            this.U = null;
        }
        if (zC0) {
            com.applovin.impl.a aVar2 = new com.applovin.impl.a(activity, ((Integer) kVar.a(x4.k2)).intValue(), R.attr.progressBarStyleLarge);
            this.Q = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.Q = null;
        }
        int iC = c();
        if (((Boolean) kVar.a(x4.U1)).booleanValue() && iC > 0) {
            z3 = true;
        }
        if (this.S == null && z3) {
            this.S = new i0(activity);
            int iS = bVar.s();
            this.S.setTextColor(iS);
            this.S.setTextSize(((Integer) kVar.a(x4.T1)).intValue());
            this.S.setFinishedStrokeColor(iS);
            this.S.setFinishedStrokeWidth(((Integer) kVar.a(x4.S1)).intValue());
            this.S.setMax(iC);
            this.S.setProgress(iC);
            b1Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(iC));
        }
        if (!bVar.k0()) {
            this.V = null;
            return;
        }
        Long l10 = (Long) kVar.a(x4.f6047h2);
        Integer num = (Integer) kVar.a(x4.f6056i2);
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        this.V = progressBar;
        a(progressBar, bVar.j0(), num.intValue());
        b1Var.a("PROGRESS_BAR", l10.longValue(), new b(num));
    }

    private void M() {
        com.applovin.impl.adview.l lVar;
        d8 d8VarB0 = this.f5892a.b0();
        if (d8VarB0 == null || !d8VarB0.j() || this.f3562j0 || (lVar = this.U) == null) {
            return;
        }
        final boolean z3 = lVar.getVisibility() == 4;
        final long jH = d8VarB0.h();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.s8
            @Override // java.lang.Runnable
            public final void run() {
                this.f5316a.b(z3, jH);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        if (this.f3562j0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5894c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.f5893b.m0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5894c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        if (this.f3561i0 < 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5894c.a("AppLovinFullscreenActivity", "Invalid last video position");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.f3561i0 + "ms for MediaPlayer: " + this.N);
        }
        this.P.seekTo(this.f3561i0);
        this.P.start();
        this.f3555c0.b();
        this.f3561i0 = -1;
        a(new r8(this, 6), 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        if (this.f3565m0.compareAndSet(false, true)) {
            a(this.R, this.f5892a.d0(), new r8(this, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    private void e(boolean z3) {
        if (o0.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f5895d.getDrawable(z3 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.T.setScaleType(ImageView.ScaleType.FIT_XY);
                this.T.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.T, z3 ? this.f5892a.G() : this.f5892a.Y(), this.f5893b);
    }

    private void f(boolean z3) {
        this.f3560h0 = C();
        if (z3) {
            this.P.pause();
        } else {
            this.P.stopPlayback();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(String str) {
        o8.a(this.U, str, "AppLovinFullscreenActivity", this.f5893b);
    }

    @Override // com.applovin.impl.w1
    public void A() {
        this.M.a(this.f5901l);
        this.f5906q = SystemClock.elapsedRealtime();
    }

    public void O() {
        long jP;
        long millis;
        if (this.f5892a.O() >= 0 || this.f5892a.P() >= 0) {
            if (this.f5892a.O() >= 0) {
                jP = this.f5892a.O();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f5892a;
                long j = this.f3559g0;
                long j8 = j > 0 ? j : 0L;
                if (aVar.W0()) {
                    int iH1 = (int) ((com.applovin.impl.sdk.ad.a) this.f5892a).h1();
                    if (iH1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iH1);
                    } else {
                        int iR = (int) aVar.r();
                        if (iR > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iR);
                        }
                    }
                    j8 += millis;
                }
                jP = (long) ((this.f5892a.P() / 100.0d) * j8);
            }
            c(jP);
        }
    }

    public boolean Q() {
        return (this.f5911v || this.f3562j0 || !this.P.isPlaying()) ? false : true;
    }

    public void R() {
        AppLovinSdkUtils.runOnUiThread(new r8(this, 5));
    }

    public void S() {
        a2 a2Var;
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        f(this.f5892a.d1());
        long jM = this.f5892a.M();
        if (jM > 0) {
            this.f5907r = 0L;
            Long l10 = (Long) this.f5893b.a(x4.f6110p2);
            Integer num = (Integer) this.f5893b.a(x4.f6133s2);
            ProgressBar progressBar = new ProgressBar(this.f5895d, null, R.attr.progressBarStyleHorizontal);
            this.W = progressBar;
            a(progressBar, this.f5892a.L(), num.intValue());
            a2Var = this;
            this.f3556d0.a("POSTITIAL_PROGRESS_BAR", l10.longValue(), a2Var.new c(jM, num, l10));
            a2Var.f3556d0.b();
        } else {
            a2Var = this;
        }
        a2Var.M.a(a2Var.f5900k, a2Var.j, b(), a2Var.W);
        StringBuilder sb2 = new StringBuilder("javascript:al_onPoststitialShow(");
        sb2.append(a2Var.f5914y);
        sb2.append(",");
        a(r5.c.j(a2Var.f5915z, ");", sb2), a2Var.f5892a.x());
        if (a2Var.f5900k != null) {
            if (a2Var.f5892a.r() >= 0) {
                a(a2Var.f5900k, a2Var.f5892a.r(), new r8(this, 2));
            } else {
                a2Var.f5900k.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = a2Var.f5900k;
        if (gVar != null) {
            arrayList.add(new h4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = a2Var.j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = a2Var.j;
            arrayList.add(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        ProgressBar progressBar2 = a2Var.W;
        if (progressBar2 != null) {
            arrayList.add(new h4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        a2Var.f5892a.getAdEventTracker().b(b(), arrayList);
        p();
        a2Var.f3562j0 = true;
    }

    public void T() {
        this.f3566n0 = SystemClock.elapsedRealtime() - this.f3567o0;
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.a("AppLovinFullscreenActivity", je.u.s(this.f3566n0, "ms", new StringBuilder("Attempting to skip video with skip time: ")));
        }
        D();
    }

    public void U() {
        MediaPlayer mediaPlayer = this.N;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f10 = this.f3558f0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f10, f10);
            boolean z3 = !this.f3558f0;
            this.f3558f0 = z3;
            e(z3);
            a(this.f3558f0, 0L);
        } catch (Throwable unused) {
        }
    }

    public void d(long j) {
        this.f3559g0 = j;
    }

    public void g(String str) {
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f5894c;
            StringBuilder sbA = d.h.A("Encountered media error: ", str, " for ad: ");
            sbA.append(this.f5892a);
            oVar.b("AppLovinFullscreenActivity", sbA.toString());
        }
        if (this.f3564l0.compareAndSet(false, true)) {
            if (((Boolean) this.f5893b.a(x4.O0)).booleanValue()) {
                this.f5893b.G().d(this.f5892a, com.applovin.impl.sdk.k.o());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.F;
            if (appLovinAdDisplayListener instanceof l2) {
                ((l2) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            String str2 = this.f5892a instanceof o7 ? "handleVastVideoError" : "handleVideoError";
            this.f5893b.D().a(str2, str, this.f5892a);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", str2);
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f5893b.g().a(d2.F, this.f5892a, mapHashMap);
            a("media_error");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.w1
    public void m() {
        super.a(C(), this.f3557e0, F(), this.f3566n0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f5892a.getAdIdNumber() && this.f3557e0) {
                int i4 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !r0.a(i4)) || this.f3563k0 || this.P.isPlaying()) {
                    return;
                }
                g("Video cache error during stream. ResponseCode=" + i4 + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.w1
    public void r() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.f5893b.a(x4.f6160v6)).booleanValue()) {
                o8.b(this.U);
                this.U = null;
            }
            if (this.f3557e0) {
                AppLovinCommunicator.getInstance(this.f5895d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.P;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.P.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.N;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th2);
        }
        super.r();
    }

    @Override // com.applovin.impl.w1
    public void v() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f3561i0 = this.P.getCurrentPosition();
        this.P.pause();
        this.f3555c0.c();
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.a("AppLovinFullscreenActivity", "Paused video at position " + this.f3561i0 + "ms");
        }
    }

    @Override // com.applovin.impl.w1
    public void w() {
        a((ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
            com.applovin.impl.a aVar2 = this.Q;
            Objects.requireNonNull(aVar2);
            a(new v9(4, aVar2), 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        this.f3566n0 = -1L;
        this.f3567o0 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        this.f5906q = SystemClock.elapsedRealtime();
    }

    public int C() {
        long currentPosition = this.P.getCurrentPosition();
        if (this.f3563k0) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.f3559g0) * 100.0f) : this.f3560h0;
    }

    public void D() {
        this.f5914y++;
        if (this.f5892a.u()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5894c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            a("video_skip");
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5894c.a("AppLovinFullscreenActivity", "Skipping video...");
            }
            S();
        }
    }

    public void E() {
        AppLovinSdkUtils.runOnUiThread(new r8(this, 0));
    }

    public boolean F() {
        if (this.J && this.f5892a.a1()) {
            return true;
        }
        return G();
    }

    public boolean G() {
        return C() >= this.f5892a.f0();
    }

    @Override // com.applovin.impl.w1
    public void b(boolean z3) {
        super.b(z3);
        if (z3) {
            b(0L);
            if (this.f3562j0) {
                this.f3556d0.b();
                return;
            }
            return;
        }
        if (this.f3562j0) {
            this.f3556d0.c();
        } else {
            v();
        }
    }

    @Override // com.applovin.impl.w1
    public void f() {
        super.f();
        this.M.a(this.U);
        this.M.a((View) this.R);
        if (!h() || this.f3562j0) {
            A();
        }
    }

    @Override // com.applovin.impl.w1
    public void a(ViewGroup viewGroup) {
        String str;
        this.M.a(this.T, this.R, this.U, this.Q, this.V, this.S, this.P, this.O, b(), this.j, this.X, viewGroup);
        if (o0.g() && (str = this.f5893b.n0().getExtraParameters().get("audio_focus_request")) != null) {
            this.P.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) this.f5893b.a(x4.X5)).booleanValue() || !a(!this.f3557e0)) {
            this.P.setVideoURI(this.f5892a.l0());
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            com.applovin.impl.adview.k kVar = this.j;
            if (kVar != null) {
                kVar.b();
            }
            this.P.start();
            if (this.f3557e0) {
                R();
            }
            b().renderAd(this.f5892a);
            if (this.R != null) {
                this.f5893b.q0().a(new r6(this.f5893b, "scheduleSkipButton", new r8(this, 3)), d6.b.TIMEOUT, this.f5892a.e0(), true);
            }
            super.c(this.f3558f0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z3, long j) {
        if (z3) {
            e8.a(this.U, j, (Runnable) null);
        } else {
            e8.b(this.U, j, (Runnable) null);
        }
    }

    @Override // com.applovin.impl.w1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.w1
    public void b(long j) {
        a(new r8(this, 4), j);
    }

    @Override // com.applovin.impl.w1
    public void a(String str, long j) {
        super.a(str, j);
        if (this.U == null || j < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new w8(3, this, str), j);
    }

    private void a(ProgressBar progressBar, int i4, int i10) {
        progressBar.setMax(i10);
        progressBar.setPadding(0, 0, 0, 0);
        if (o0.d()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i4));
        }
    }

    @Override // com.applovin.impl.w1
    public void a(String str) {
        this.f3555c0.a();
        this.f3556d0.a();
        this.f3553a0.removeCallbacksAndMessages(null);
        this.f3554b0.removeCallbacksAndMessages(null);
        if (!((Boolean) this.f5893b.a(x4.P6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f5892a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        super.a(str);
    }

    public void a(MotionEvent motionEvent) {
        Context context;
        if (this.f5892a.B0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5894c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri uriC0 = this.f5892a.c0();
            if (uriC0 != null) {
                if (!((Boolean) this.f5893b.a(x4.f6161w)).booleanValue() || (context = this.f5895d) == null) {
                    context = b() != null ? b().getContext() : com.applovin.impl.sdk.k.o();
                }
                this.f5893b.k().trackAndLaunchVideoClick(this.f5892a, uriC0, motionEvent, this, context);
                t2.a(this.E, this.f5892a);
                this.f5915z++;
                return;
            }
            return;
        }
        M();
    }

    private static boolean a(boolean z3, com.applovin.impl.sdk.k kVar) {
        if (!((Boolean) kVar.a(x4.Z1)).booleanValue()) {
            return false;
        }
        if (!((Boolean) kVar.a(x4.f5988a2)).booleanValue() || z3) {
            return true;
        }
        return ((Boolean) kVar.a(x4.f6005c2)).booleanValue();
    }
}
