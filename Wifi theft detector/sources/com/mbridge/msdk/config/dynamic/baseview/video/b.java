package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;

/* loaded from: classes3.dex */
public class b implements Player.EventListener {

    /* renamed from: e, reason: collision with root package name */
    private long f13962e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13963f;

    /* renamed from: g, reason: collision with root package name */
    private Context f13964g;

    /* renamed from: h, reason: collision with root package name */
    private SimpleExoPlayer f13965h;

    /* renamed from: i, reason: collision with root package name */
    private MediaSource f13966i;

    /* renamed from: k, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.dynamic.baseview.video.a f13968k;

    /* renamed from: l, reason: collision with root package name */
    SurfaceHolder f13969l;

    /* renamed from: m, reason: collision with root package name */
    private c f13970m;

    /* renamed from: a, reason: collision with root package name */
    private boolean f13958a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13959b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13960c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f13961d = 5;

    /* renamed from: j, reason: collision with root package name */
    private final Handler f13967j = new Handler(Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    private final Runnable f13971n = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long duration;
            try {
                if (b.this.f13965h == null || !b.this.b()) {
                    return;
                }
                b bVar = b.this;
                bVar.f13962e = bVar.f13965h.getCurrentPosition();
                float f10 = b.this.f13962e % 1000;
                int iRound = Math.round(b.this.f13962e / 1000.0f);
                q0.c("ComponentVideoPlayer", "currentPosition:" + iRound + " mCurrentPosition:" + b.this.f13962e);
                if (b.this.f13965h == null || b.this.f13965h.getDuration() <= 0) {
                    duration = 0;
                } else {
                    duration = b.this.f13965h.getDuration() / 1000;
                    if (f10 > 0.0f && f10 < 500.0f) {
                        iRound++;
                    }
                }
                if (iRound >= 0 && duration > 0) {
                    long j10 = iRound;
                    if (j10 < 1 + duration && b.this.f13968k != null) {
                        b.this.f13968k.a(j10, duration);
                    }
                }
                b.this.f13958a = false;
                b.this.f13967j.postDelayed(this, 1000L);
            } catch (Exception e10) {
                q0.b("ComponentVideoPlayer", e10.getMessage());
            }
        }
    }

    private void r() {
        try {
            a();
            this.f13967j.post(this.f13971n);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public float e() {
        SimpleExoPlayer simpleExoPlayer = this.f13965h;
        if (simpleExoPlayer != null) {
            return simpleExoPlayer.getVolume();
        }
        return 0.0f;
    }

    public boolean f() {
        return this.f13959b;
    }

    public boolean g() {
        return this.f13958a;
    }

    public boolean h() {
        return this.f13965h != null && b();
    }

    public boolean i() {
        return this.f13963f;
    }

    public void j() {
        SimpleExoPlayer simpleExoPlayer = this.f13965h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(0.0f);
        this.f13963f = true;
    }

    public void k() {
        try {
            this.f13958a = true;
            this.f13962e = 0L;
            if (this.f13968k != null) {
                this.f13968k.onPlayCompleted();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void l() {
        try {
            this.f13959b = true;
            if (this.f13965h != null && !this.f13960c) {
                this.f13960c = true;
                if (this.f13968k != null) {
                    this.f13968k.a(this.f13965h.getDuration() / 1000);
                }
            }
            r();
        } catch (Throwable th) {
            q0.b("ComponentVideoPlayer", th.getMessage());
        }
    }

    public void m() {
        try {
            if (this.f13959b && this.f13965h != null && b()) {
                this.f13965h.setPlayWhenReady(false);
                a();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void n() {
        try {
            if (this.f13959b) {
                r();
            } else {
                this.f13965h.prepare(this.f13966i);
            }
            this.f13965h.setPlayWhenReady(true);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            p();
            b("play error");
        }
    }

    public void o() {
        SimpleExoPlayer simpleExoPlayer;
        try {
            if (this.f13959b || (simpleExoPlayer = this.f13965h) == null) {
                return;
            }
            simpleExoPlayer.prepare(this.f13966i);
            this.f13959b = true;
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        q0.b("ComponentVideoPlayer", "onPlaybackParametersChanged : " + playbackParameters.speed);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        c cVar = this.f13970m;
        if ((cVar == null || !cVar.a(exoPlaybackException)) && exoPlaybackException != null) {
            int i10 = exoPlaybackException.type;
            String message = i10 != 0 ? i10 != 1 ? i10 != 2 ? "Play error and ExoPlayer have not message." : "Play error, because have a UnexpectedException." : "Play error, because have a RendererException." : "Play error, because have a SourceException.";
            if (exoPlaybackException.getCause() != null && !TextUtils.isEmpty(exoPlaybackException.getCause().getMessage())) {
                message = exoPlaybackException.getCause().getMessage();
            }
            q0.b("ComponentVideoPlayer", "onPlayerError : " + message);
            a(message);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z10, int i10) {
        q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : " + i10);
        if (i10 == 1) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : IDLE");
            return;
        }
        if (i10 == 2) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : Buffering");
            return;
        }
        if (i10 == 3) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : READY");
            l();
        } else {
            if (i10 != 4) {
                return;
            }
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : Ended : PLAY ENDED");
            a();
            k();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, @Nullable Object obj, int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    public void p() {
        try {
            a();
            if (this.f13965h != null) {
                s();
                this.f13965h.removeListener(this);
                this.f13965h.release();
                this.f13968k = null;
            }
            c cVar = this.f13970m;
            if (cVar != null) {
                cVar.c();
            }
        } catch (Throwable th) {
            q0.b("ComponentVideoPlayer", th.getMessage());
        }
    }

    public void q() {
        SimpleExoPlayer simpleExoPlayer = this.f13965h;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.seekTo(simpleExoPlayer.getCurrentPosition() - 500);
        }
    }

    public void s() {
        try {
            if (this.f13959b && this.f13965h != null && b()) {
                this.f13965h.stop();
                a();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void t() {
        SimpleExoPlayer simpleExoPlayer = this.f13965h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(1.0f);
        this.f13963f = false;
    }

    public void b(int i10) {
        this.f13961d = i10;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            b("play url is illegal");
            return;
        }
        try {
            this.f13965h = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(this.f13964g), new DefaultTrackSelector(), new DefaultLoadControl());
            this.f13966i = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.f13964g, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str));
            this.f13965h.setRepeatMode(0);
            this.f13965h.prepare(this.f13966i);
            this.f13965h.addListener(this);
            SurfaceHolder surfaceHolder = this.f13969l;
            if (surfaceHolder != null) {
                a(surfaceHolder);
            }
            c cVar = new c(this.f13964g, this.f13965h);
            this.f13970m = cVar;
            cVar.a(str, this.f13968k, this.f13961d);
        } catch (Throwable unused) {
            b("Player init error");
        }
    }

    public int d() {
        SimpleExoPlayer simpleExoPlayer = this.f13965h;
        if (simpleExoPlayer != null) {
            return (int) (simpleExoPlayer.getDuration() / 1000);
        }
        return 0;
    }

    private void b(String str) {
        if (this.f13968k != null) {
            this.f13968k.onPlayError(str);
        }
    }

    public void a(Context context, SurfaceHolder surfaceHolder) {
        try {
            this.f13964g = context;
            this.f13969l = surfaceHolder;
        } catch (Throwable th) {
            q0.b("ComponentVideoPlayer", th.getMessage());
        }
    }

    public boolean b() {
        return this.f13965h.getPlaybackState() == 3 && this.f13965h.getPlayWhenReady();
    }

    public void a(SurfaceHolder surfaceHolder) {
        Player.VideoComponent videoComponent;
        try {
            SimpleExoPlayer simpleExoPlayer = this.f13965h;
            if (simpleExoPlayer == null || (videoComponent = simpleExoPlayer.getVideoComponent()) == null) {
                return;
            }
            videoComponent.setVideoSurfaceHolder(surfaceHolder);
        } catch (Throwable th) {
            q0.b("ComponentVideoPlayer", th.getMessage());
            b(th.toString());
        }
    }

    public void a(long j10) {
        try {
            if (!this.f13959b) {
                this.f13965h.prepare(this.f13966i);
            } else {
                r();
            }
            this.f13965h.seekTo(j10);
            this.f13965h.setPlayWhenReady(true);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            p();
            b("play error");
        }
    }

    public long c() {
        return this.f13962e;
    }

    public void a(int i10) {
        long j10 = i10;
        try {
            this.f13962e = j10;
            if (!this.f13959b) {
                q0.a("ComponentVideoPlayer", "seekTo return mHasPrepare false");
                return;
            }
            SimpleExoPlayer simpleExoPlayer = this.f13965h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.seekTo(j10);
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    private void a() {
        try {
            this.f13967j.removeCallbacks(this.f13971n);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        this.f13968k = aVar;
    }

    public boolean a(String str) {
        try {
            this.f13959b = false;
            b(str);
            return true;
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            return true;
        }
    }

    public void a(float f10, float f11) {
        try {
            SimpleExoPlayer simpleExoPlayer = this.f13965h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setVolume(f11);
            }
        } catch (Throwable th) {
            q0.b("ComponentVideoPlayer", th.getMessage());
        }
    }

    public void a(float f10) {
        try {
            if (b()) {
                this.f13965h.setPlaybackParameters(new PlaybackParameters(f10));
            } else {
                this.f13965h.setPlaybackParameters(new PlaybackParameters(f10));
                this.f13965h.stop();
            }
        } catch (Throwable th) {
            q0.b("ComponentVideoPlayer", th.getMessage());
        }
    }
}
