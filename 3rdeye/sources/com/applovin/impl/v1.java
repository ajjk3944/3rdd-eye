package com.applovin.impl;

import N7.B8;
import N7.C1094a9;
import N7.G8;
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
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.C2152w0;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.z7;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class v1 extends r1 implements AppLovinCommunicatorSubscriber {

    /* renamed from: N, reason: collision with root package name */
    private final w1 f21559N;

    /* renamed from: O, reason: collision with root package name */
    private MediaPlayer f21560O;

    /* renamed from: P, reason: collision with root package name */
    private final View f21561P;

    /* renamed from: Q, reason: collision with root package name */
    protected final AppLovinVideoView f21562Q;

    /* renamed from: R, reason: collision with root package name */
    protected final C2105a f21563R;

    /* renamed from: S, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f21564S;

    /* renamed from: T, reason: collision with root package name */
    protected C2116e0 f21565T;

    /* renamed from: U, reason: collision with root package name */
    protected final ImageView f21566U;

    /* renamed from: V, reason: collision with root package name */
    protected com.applovin.impl.adview.l f21567V;

    /* renamed from: W, reason: collision with root package name */
    protected final ProgressBar f21568W;

    /* renamed from: X, reason: collision with root package name */
    protected ProgressBar f21569X;

    /* renamed from: Y, reason: collision with root package name */
    protected ImageView f21570Y;

    /* renamed from: Z, reason: collision with root package name */
    private final e f21571Z;

    /* renamed from: a0, reason: collision with root package name */
    private final d f21572a0;

    /* renamed from: b0, reason: collision with root package name */
    private final Handler f21573b0;

    /* renamed from: c0, reason: collision with root package name */
    private final Handler f21574c0;

    /* renamed from: d0, reason: collision with root package name */
    protected final C2152w0 f21575d0;

    /* renamed from: e0, reason: collision with root package name */
    protected final C2152w0 f21576e0;

    /* renamed from: f0, reason: collision with root package name */
    private final boolean f21577f0;

    /* renamed from: g0, reason: collision with root package name */
    protected boolean f21578g0;

    /* renamed from: h0, reason: collision with root package name */
    protected long f21579h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f21580i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f21581j0;

    /* renamed from: k0, reason: collision with root package name */
    protected boolean f21582k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f21583l0;

    /* renamed from: m0, reason: collision with root package name */
    private final AtomicBoolean f21584m0;

    /* renamed from: n0, reason: collision with root package name */
    private final AtomicBoolean f21585n0;

    /* renamed from: o0, reason: collision with root package name */
    private long f21586o0;

    /* renamed from: p0, reason: collision with root package name */
    private long f21587p0;

    public class a implements C2152w0.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21588a;

        public a(int i) {
            this.f21588a = i;
        }

        @Override // com.applovin.impl.C2152w0.b
        public void a() {
            if (v1.this.f21565T != null) {
                long seconds = this.f21588a - TimeUnit.MILLISECONDS.toSeconds(r0.f21562Q.getCurrentPosition());
                if (seconds <= 0) {
                    v1.this.f20856v = true;
                } else if (v1.this.R()) {
                    v1.this.f21565T.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.C2152w0.b
        public boolean b() {
            return v1.this.R();
        }
    }

    public class b implements C2152w0.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f21590a;

        public b(Integer num) {
            this.f21590a = num;
        }

        @Override // com.applovin.impl.C2152w0.b
        public void a() {
            v1 v1Var = v1.this;
            if (v1Var.f21582k0) {
                v1Var.f21568W.setVisibility(8);
            } else {
                v1.this.f21568W.setProgress((int) ((v1Var.f21562Q.getCurrentPosition() / v1.this.f21579h0) * this.f21590a.intValue()));
            }
        }

        @Override // com.applovin.impl.C2152w0.b
        public boolean b() {
            return !v1.this.f21582k0;
        }
    }

    public class c implements C2152w0.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f21592a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f21593b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f21594c;

        public c(long j4, Integer num, Long l5) {
            this.f21592a = j4;
            this.f21593b = num;
            this.f21594c = l5;
        }

        @Override // com.applovin.impl.C2152w0.b
        public void a() {
            v1.this.f21569X.setProgress((int) ((v1.this.f20852r / this.f21592a) * this.f21593b.intValue()));
            v1 v1Var = v1.this;
            v1Var.f20852r = this.f21594c.longValue() + v1Var.f20852r;
        }

        @Override // com.applovin.impl.C2152w0.b
        public boolean b() {
            return v1.this.f20852r < this.f21592a;
        }
    }

    public class d implements z7.a {
        private d() {
        }

        @Override // com.applovin.impl.z7.a
        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = v1.this.f20838c;
            if (com.applovin.impl.sdk.o.a()) {
                v1.this.f20838c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            v1.this.a("video_button");
        }

        @Override // com.applovin.impl.z7.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = v1.this.f20838c;
            if (com.applovin.impl.sdk.o.a()) {
                v1.this.f20838c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            v1.this.a(lVar.getAndClearLastClickEvent(), (Bundle) null);
        }

        @Override // com.applovin.impl.z7.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = v1.this.f20838c;
            if (com.applovin.impl.sdk.o.a()) {
                v1.this.f20838c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            v1.this.f20833K = true;
        }

        @Override // com.applovin.impl.z7.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = v1.this.f20838c;
            if (com.applovin.impl.sdk.o.a()) {
                v1.this.f20838c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            v1.this.V();
        }

        public /* synthetic */ d(v1 v1Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.z7.a
        public void a(com.applovin.impl.adview.l lVar, Bundle bundle) {
            com.applovin.impl.sdk.o oVar = v1.this.f20838c;
            if (com.applovin.impl.sdk.o.a()) {
                v1.this.f20838c.a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            v1.this.a(lVar.getAndClearLastClickEvent(), bundle);
        }

        @Override // com.applovin.impl.z7.a
        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = v1.this.f20838c;
            if (com.applovin.impl.sdk.o.a()) {
                v1.this.f20838c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            x6.c(uri, v1.this.i.getController().g(), v1.this.f20837b);
        }

        @Override // com.applovin.impl.z7.a
        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = v1.this.f20838c;
            if (com.applovin.impl.sdk.o.a()) {
                v1.this.f20838c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            x6.a(uri, v1.this.i.getController(), v1.this.f20837b);
        }
    }

    public class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            v1.this.a(motionEvent, (Bundle) null);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            com.applovin.impl.sdk.o oVar = v1.this.f20838c;
            if (com.applovin.impl.sdk.o.a()) {
                v1.this.f20838c.a("AppLovinFullscreenActivity", "Video completed");
            }
            v1.this.f21583l0 = true;
            v1 v1Var = v1.this;
            if (!v1Var.f20854t) {
                v1Var.U();
            } else if (v1Var.i()) {
                v1.this.B();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i10) {
            v1.this.g(G8.r("Video view error (", i, StringUtils.COMMA, i10, ")"));
            v1.this.f21562Q.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i10) {
            com.applovin.impl.sdk.o oVar = v1.this.f20838c;
            if (com.applovin.impl.sdk.o.a()) {
                v1.this.f20838c.a("AppLovinFullscreenActivity", G8.r("MediaPlayer Info: (", i, ", ", i10, ")"));
            }
            if (i == 701) {
                v1.this.T();
                return false;
            }
            if (i != 3) {
                if (i != 702) {
                    return false;
                }
                v1.this.F();
                return false;
            }
            v1.this.f21575d0.b();
            v1 v1Var = v1.this;
            if (v1Var.f21564S != null) {
                v1Var.Q();
            }
            v1.this.F();
            if (!v1.this.f20830H.b()) {
                return false;
            }
            v1.this.w();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            v1.this.f21560O = mediaPlayer;
            mediaPlayer.setOnInfoListener(v1.this.f21571Z);
            mediaPlayer.setOnErrorListener(v1.this.f21571Z);
            float f10 = !v1.this.f21578g0 ? 1 : 0;
            mediaPlayer.setVolume(f10, f10);
            v1.this.f20855u = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            v1.this.d(mediaPlayer.getDuration());
            v1.this.P();
            com.applovin.impl.sdk.o oVar = v1.this.f20838c;
            if (com.applovin.impl.sdk.o.a()) {
                v1.this.f20838c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + v1.this.f21560O);
            }
        }

        public /* synthetic */ e(v1 v1Var, a aVar) {
            this();
        }
    }

    public class f implements View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v1 v1Var = v1.this;
            if (view == v1Var.f21564S) {
                v1Var.V();
                return;
            }
            if (view == v1Var.f21566U) {
                v1Var.W();
            } else if (com.applovin.impl.sdk.o.a()) {
                v1.this.f20838c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ f(v1 v1Var, a aVar) {
            this();
        }
    }

    public v1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f21559N = new w1(this.f20836a, this.f20839d, this.f20837b);
        a aVar = null;
        this.f21570Y = null;
        e eVar = new e(this, aVar);
        this.f21571Z = eVar;
        d dVar = new d(this, aVar);
        this.f21572a0 = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f21573b0 = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f21574c0 = handler2;
        C2152w0 c2152w0 = new C2152w0(handler, this.f20837b);
        this.f21575d0 = c2152w0;
        this.f21576e0 = new C2152w0(handler2, this.f20837b);
        boolean zQ0 = this.f20836a.Q0();
        this.f21577f0 = zQ0;
        this.f21578g0 = a7.e(this.f20837b);
        this.f21581j0 = -1;
        this.f21584m0 = new AtomicBoolean();
        this.f21585n0 = new AtomicBoolean();
        this.f21586o0 = -2L;
        this.f21587p0 = 0L;
        if (!bVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.f21562Q = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(eVar);
        appLovinVideoView.setOnCompletionListener(eVar);
        appLovinVideoView.setOnErrorListener(eVar);
        bVar.h().putString("video_view_address", r7.a(appLovinVideoView));
        View view = new View(activity);
        this.f21561P = view;
        boolean z10 = false;
        view.setBackgroundColor(Color.argb(254, 0, 0, 0));
        if (((Boolean) kVar.a(l4.f19957k1)).booleanValue()) {
            view.setOnTouchListener(new AppLovinTouchToClickListener(kVar, l4.f19941i0, activity, eVar));
        } else {
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(kVar, l4.f19941i0, activity, eVar));
            view.setOnTouchListener(new Q0());
        }
        f fVar = new f(this, aVar);
        if (bVar.o0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.e0(), activity);
            this.f21564S = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(fVar);
        } else {
            this.f21564S = null;
        }
        if (a(this.f21578g0, kVar)) {
            ImageView imageView = new ImageView(activity);
            this.f21566U = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(fVar);
            e(this.f21578g0);
        } else {
            this.f21566U = null;
        }
        String strL0 = bVar.l0();
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strL0)) {
            z7 z7Var = new z7(kVar);
            z7Var.a(new WeakReference(dVar));
            com.applovin.impl.adview.l lVar = new com.applovin.impl.adview.l(bVar.k0(), bVar, z7Var, activity);
            this.f21567V = lVar;
            lVar.a(strL0);
        } else {
            this.f21567V = null;
        }
        if (zQ0) {
            C2105a c2105a = new C2105a(activity, ((Integer) kVar.a(l4.f19981n2)).intValue(), R.attr.progressBarStyleLarge);
            this.f21563R = c2105a;
            c2105a.setColor(Color.parseColor("#75FFFFFF"));
            c2105a.setBackgroundColor(Color.parseColor("#00000000"));
            c2105a.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.f21563R = null;
        }
        int iD = d();
        if (((Boolean) kVar.a(l4.f19827S1)).booleanValue() && iD > 0) {
            z10 = true;
        }
        if (this.f21565T == null && z10) {
            this.f21565T = new C2116e0(activity);
            int iT = bVar.t();
            this.f21565T.setTextColor(iT);
            this.f21565T.setTextSize(((Integer) kVar.a(l4.f19820R1)).intValue());
            this.f21565T.setFinishedStrokeColor(iT);
            this.f21565T.setFinishedStrokeWidth(((Integer) kVar.a(l4.f19814Q1)).intValue());
            this.f21565T.setMax(iD);
            this.f21565T.setProgress(iD);
            c2152w0.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(iD));
        }
        if (!bVar.v0()) {
            this.f21568W = null;
            return;
        }
        Long l5 = (Long) kVar.a(l4.f19958k2);
        Integer num = (Integer) kVar.a(l4.f19966l2);
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        this.f21568W = progressBar;
        a(progressBar, bVar.u0(), num.intValue());
        c2152w0.a("PROGRESS_BAR", l5.longValue(), new b(num));
    }

    private void N() {
        com.applovin.impl.adview.l lVar;
        q7 q7VarM0 = this.f20836a.m0();
        if (q7VarM0 == null || !q7VarM0.j() || this.f21582k0 || (lVar = this.f21567V) == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.sdk.v(this, lVar.getVisibility() == 4, q7VarM0.h(), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        if (this.f21582k0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20838c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.f20837b.m0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20838c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        if (this.f21581j0 < 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20838c.a("AppLovinFullscreenActivity", "Invalid last video position");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.f21581j0 + "ms for MediaPlayer: " + this.f21560O);
        }
        this.f21562Q.seekTo(this.f21581j0);
        this.f21562Q.start();
        this.f21575d0.b();
        this.f21581j0 = -1;
        a(new R0(this, 1), 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        if (this.f21585n0.compareAndSet(false, true)) {
            a(this.f21564S, this.f20836a.o0(), new H(this, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    private void e(boolean z10) {
        if (AbstractC2128k0.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f20839d.getDrawable(z10 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f21566U.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f21566U.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.f21566U, z10 ? this.f20836a.Q() : this.f20836a.j0(), this.f20837b);
    }

    private void f(boolean z10) {
        this.f21580i0 = D();
        if (z10) {
            this.f21562Q.pause();
        } else {
            this.f21562Q.stopPlayback();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(String str) {
        b8.a(this.f21567V, str, "AppLovinFullscreenActivity", this.f20837b);
    }

    @Override // com.applovin.impl.r1
    public void B() {
        this.f21559N.a(this.f20846l);
        this.f20851q = SystemClock.elapsedRealtime();
    }

    public void P() {
        long jZ;
        long millis;
        if (this.f20836a.Y() >= 0 || this.f20836a.Z() >= 0) {
            if (this.f20836a.Y() >= 0) {
                jZ = this.f20836a.Y();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f20836a;
                long j4 = this.f21579h0;
                long j10 = j4 > 0 ? j4 : 0L;
                if (aVar.f1()) {
                    int iP1 = (int) ((com.applovin.impl.sdk.ad.a) this.f20836a).p1();
                    if (iP1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iP1);
                    } else {
                        int iS = (int) aVar.s();
                        if (iS > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iS);
                        }
                    }
                    j10 += millis;
                }
                jZ = (long) ((this.f20836a.Z() / 100.0d) * j10);
            }
            c(jZ);
        }
    }

    public boolean R() {
        return (this.f20856v || this.f21582k0 || !this.f21562Q.isPlaying()) ? false : true;
    }

    public boolean S() {
        return i() && !G();
    }

    public void T() {
        AppLovinSdkUtils.runOnUiThread(new R0(this, 0));
    }

    public void U() {
        v1 v1Var;
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        f(this.f20836a.m1());
        long jW = this.f20836a.W();
        if (jW > 0) {
            this.f20852r = 0L;
            Long l5 = (Long) this.f20837b.a(l4.f20029t2);
            Integer num = (Integer) this.f20837b.a(l4.f20053w2);
            ProgressBar progressBar = new ProgressBar(this.f20839d, null, R.attr.progressBarStyleHorizontal);
            this.f21569X = progressBar;
            a(progressBar, this.f20836a.V(), num.intValue());
            v1Var = this;
            this.f21576e0.a("POSTITIAL_PROGRESS_BAR", l5.longValue(), v1Var.new c(jW, num, l5));
            v1Var.f21576e0.b();
        } else {
            v1Var = this;
        }
        v1Var.f21559N.a(v1Var.f20845k, v1Var.f20844j, v1Var.i, v1Var.f21569X);
        StringBuilder sb = new StringBuilder("javascript:al_onPoststitialShow(");
        sb.append(v1Var.f20859y);
        sb.append(StringUtils.COMMA);
        a(B4.i.j(sb, v1Var.f20860z, ");"), v1Var.f20836a.H());
        if (v1Var.f20845k != null) {
            if (v1Var.f20836a.s() >= 0) {
                a(v1Var.f20845k, v1Var.f20836a.s(), new S0(this, 1));
            } else {
                v1Var.f20845k.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = v1Var.f20845k;
        if (gVar != null) {
            arrayList.add(new u3(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = v1Var.f20844j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = v1Var.f20844j;
            arrayList.add(new u3(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        ProgressBar progressBar2 = v1Var.f21569X;
        if (progressBar2 != null) {
            arrayList.add(new u3(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        v1Var.f20836a.getAdEventTracker().b(v1Var.i, arrayList);
        q();
        v1Var.f21582k0 = true;
    }

    public void V() {
        this.f21586o0 = SystemClock.elapsedRealtime() - this.f21587p0;
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.a("AppLovinFullscreenActivity", C1094a9.f(new StringBuilder("Attempting to skip video with skip time: "), this.f21586o0, "ms"));
        }
        if (!S()) {
            E();
            return;
        }
        w();
        o();
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.a("AppLovinFullscreenActivity", "Prompting incentivized ad close warning");
        }
        this.f20830H.e();
    }

    public void W() {
        MediaPlayer mediaPlayer = this.f21560O;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f10 = this.f21578g0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f10, f10);
            boolean z10 = !this.f21578g0;
            this.f21578g0 = z10;
            e(z10);
            a(this.f21578g0, 0L);
        } catch (Throwable unused) {
        }
    }

    public void d(long j4) {
        this.f21579h0 = j4;
    }

    public void g(String str) {
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f20838c;
            StringBuilder sbK = B8.k("Encountered media error: ", str, " for ad: ");
            sbK.append(this.f20836a);
            oVar.b("AppLovinFullscreenActivity", sbK.toString());
        }
        if (this.f21584m0.compareAndSet(false, true)) {
            if (((Boolean) this.f20837b.a(l4.f19779L0)).booleanValue()) {
                this.f20837b.H().d(this.f20836a, com.applovin.impl.sdk.k.o());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.f20828F;
            if (appLovinAdDisplayListener instanceof f2) {
                ((f2) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            String str2 = this.f20836a instanceof b7 ? "handleVastVideoError" : "handleVideoError";
            this.f20837b.E().a(str2, str, this.f20836a);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(AdRevenueConstants.SOURCE_KEY, str2);
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f20837b.g().a(y1.f21817s, this.f20836a, mapHashMap);
            a("media_error");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.r1
    public void n() {
        super.a(D(), this.f21577f0, G(), this.f21586o0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f20836a.getAdIdNumber() && this.f21577f0) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i >= 200 && i < 300) || this.f21583l0 || this.f21562Q.isPlaying()) {
                    return;
                }
                g("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.r1
    public void s() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.f20837b.a(l4.f19824R5)).booleanValue()) {
                b8.b(this.f21567V);
                this.f21567V = null;
            }
            if (this.f21577f0) {
                AppLovinCommunicator.getInstance(this.f20839d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.f21562Q;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.f21562Q.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.f21560O;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.s();
    }

    @Override // com.applovin.impl.r1
    public void w() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f21581j0 = this.f21562Q.getCurrentPosition();
        this.f21562Q.pause();
        this.f21575d0.c();
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.a("AppLovinFullscreenActivity", "Paused video at position " + this.f21581j0 + "ms");
        }
    }

    @Override // com.applovin.impl.r1
    public void x() {
        a((ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        C2105a c2105a = this.f21563R;
        if (c2105a != null) {
            c2105a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        C2105a c2105a = this.f21563R;
        if (c2105a != null) {
            c2105a.a();
            C2105a c2105a2 = this.f21563R;
            Objects.requireNonNull(c2105a2);
            a(new C2.h(c2105a2, 22), 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        this.f21586o0 = -1L;
        this.f21587p0 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        C2105a c2105a = this.f21563R;
        if (c2105a != null) {
            c2105a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M() {
        this.f20851q = SystemClock.elapsedRealtime();
    }

    public int D() {
        long currentPosition = this.f21562Q.getCurrentPosition();
        if (this.f21583l0) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.f21579h0) * 100.0f) : this.f21580i0;
    }

    public void E() {
        this.f20859y++;
        if (this.f20836a.E()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20838c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            a("video_skip");
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20838c.a("AppLovinFullscreenActivity", "Skipping video...");
            }
            U();
        }
    }

    public void F() {
        AppLovinSdkUtils.runOnUiThread(new S0(this, 0));
    }

    public boolean G() {
        if (this.f20833K && this.f20836a.j1()) {
            return true;
        }
        return H();
    }

    public boolean H() {
        return D() >= this.f20836a.q0();
    }

    @Override // com.applovin.impl.r1
    public void b(boolean z10) {
        super.b(z10);
        if (z10) {
            b(0L);
            if (this.f21582k0) {
                this.f21576e0.b();
                return;
            }
            return;
        }
        if (this.f21582k0) {
            this.f21576e0.c();
        } else {
            w();
        }
    }

    @Override // com.applovin.impl.r1
    public void f() {
        super.f();
        B();
    }

    @Override // com.applovin.impl.r1
    public void a(ViewGroup viewGroup) {
        String str;
        this.f21559N.a(this.f21566U, this.f21564S, this.f21567V, this.f21563R, this.f21568W, this.f21565T, this.f21562Q, this.f21561P, this.i, this.f20844j, this.f21570Y, viewGroup);
        if (AbstractC2128k0.g() && (str = this.f20837b.n0().getExtraParameters().get("audio_focus_request")) != null) {
            this.f21562Q.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (a(!this.f21577f0)) {
            return;
        }
        this.f21562Q.setVideoURI(this.f20836a.w0());
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        com.applovin.impl.adview.k kVar = this.f20844j;
        if (kVar != null) {
            kVar.b();
        }
        this.f21562Q.start();
        if (this.f21577f0) {
            T();
        }
        this.i.renderAd(this.f20836a);
        if (this.f21564S != null) {
            this.f20837b.q0().a(new f6(this.f20837b, "scheduleSkipButton", new C2.h(this, 23)), r5.b.TIMEOUT, this.f20836a.p0(), true);
        }
        super.c(this.f21578g0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z10, long j4) {
        if (z10) {
            r7.a(this.f21567V, j4, (Runnable) null);
        } else {
            r7.b(this.f21567V, j4, (Runnable) null);
        }
    }

    @Override // com.applovin.impl.r1
    public void b(long j4) {
        a(new B.b(this, 23), j4);
    }

    @Override // com.applovin.impl.c2.a
    public void b() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.r1
    public void g() {
        super.g();
        this.f21559N.a(this.f21567V);
        this.f21559N.a((View) this.f21564S);
        if (!i() || this.f21582k0) {
            B();
        }
    }

    @Override // com.applovin.impl.r1
    public void a(String str, long j4) {
        super.a(str, j4);
        if (this.f21567V == null || j4 < 0 || !com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return;
        }
        a(new C.T(26, this, str), j4);
    }

    private void a(ProgressBar progressBar, int i, int i10) {
        progressBar.setMax(i10);
        progressBar.setPadding(0, 0, 0, 0);
        if (AbstractC2128k0.d()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // com.applovin.impl.r1
    public void a(String str) {
        this.f21575d0.a();
        this.f21576e0.a();
        this.f21573b0.removeCallbacksAndMessages(null);
        this.f21574c0.removeCallbacksAndMessages(null);
        if (!((Boolean) this.f20837b.a(l4.f19969l6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f20836a;
            if (bVar != null) {
                bVar.a(str);
            }
            n();
        }
        super.a(str);
    }

    public void a(MotionEvent motionEvent, Bundle bundle) {
        Context context;
        if (this.f20836a.P0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20838c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri uriN0 = this.f20836a.n0();
            if (uriN0 != null) {
                if (!((Boolean) this.f20837b.a(l4.f20058x)).booleanValue() || (context = this.f20839d) == null) {
                    AppLovinAdView appLovinAdView = this.i;
                    context = appLovinAdView != null ? appLovinAdView.getContext() : com.applovin.impl.sdk.k.o();
                }
                this.f20837b.k().trackAndLaunchVideoClick(this.f20836a, uriN0, motionEvent, bundle, this, context);
                l2.a(this.f20827E, this.f20836a);
                this.f20860z++;
                return;
            }
            return;
        }
        N();
    }

    private static boolean a(boolean z10, com.applovin.impl.sdk.k kVar) {
        if (!((Boolean) kVar.a(l4.f19897c2)).booleanValue()) {
            return false;
        }
        if (!((Boolean) kVar.a(l4.f19905d2)).booleanValue() || z10) {
            return true;
        }
        return ((Boolean) kVar.a(l4.f19920f2)).booleanValue();
    }

    @Override // com.applovin.impl.c2.a
    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        E();
    }
}
