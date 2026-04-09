package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.gms.internal.measurement.h4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class SimpleExoPlayer extends androidx.lifecycle.o implements ExoPlayer {
    public final q1 B;
    public final CopyOnWriteArraySet D;
    public final CopyOnWriteArraySet E;
    public final CopyOnWriteArraySet F;
    public final CopyOnWriteArraySet G;
    public final CopyOnWriteArraySet H;
    public final AnalyticsCollector I;
    public final h4 J;
    public final f K;
    public final s1 L;
    public final df.c M;
    public final ee.f N;
    public final long O;
    public Format P;
    public Format Q;
    public AudioTrack R;
    public Object S;
    public Surface T;
    public SurfaceHolder U;
    public sb.l V;
    public boolean W;
    public TextureView X;
    public int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public z9.b f4028a0;

    /* renamed from: b0, reason: collision with root package name */
    public z9.b f4029b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f4030c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f4031d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4032e0;

    /* renamed from: f0, reason: collision with root package name */
    public List f4033f0;

    /* renamed from: g, reason: collision with root package name */
    public final g[] f4034g;

    /* renamed from: g0, reason: collision with root package name */
    public final boolean f4035g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f4036h0;

    /* renamed from: i0, reason: collision with root package name */
    public aa.a f4037i0;

    /* renamed from: j0, reason: collision with root package name */
    public rb.v f4038j0;

    /* renamed from: r, reason: collision with root package name */
    public final a5.d f4039r;

    /* renamed from: x, reason: collision with root package name */
    public final y f4040x;

    /* renamed from: y, reason: collision with root package name */
    public final ComponentListener f4041y;

    public final class ComponentListener implements rb.u, y9.j, eb.k, pa.d, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, sb.k, e, b, r1, d1, o {
        private ComponentListener() {
        }

        @Override // com.google.android.exoplayer2.e
        public void executePlayerCommand(int i10) {
            boolean playWhenReady = SimpleExoPlayer.this.getPlayWhenReady();
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            int i11 = 1;
            if (playWhenReady && i10 != 1) {
                i11 = 2;
            }
            simpleExoPlayer.A1(i10, playWhenReady, i11);
        }

        @Override // com.google.android.exoplayer2.b
        public void onAudioBecomingNoisy() {
            SimpleExoPlayer.this.A1(-1, false, 3);
        }

        @Override // y9.j
        public void onAudioCodecError(Exception exc) {
            SimpleExoPlayer.this.I.onAudioCodecError(exc);
        }

        @Override // y9.j
        public void onAudioDecoderInitialized(String str, long j, long j7) {
            SimpleExoPlayer.this.I.onAudioDecoderInitialized(str, j, j7);
        }

        @Override // y9.j
        public void onAudioDecoderReleased(String str) {
            SimpleExoPlayer.this.I.onAudioDecoderReleased(str);
        }

        @Override // y9.j
        public void onAudioDisabled(z9.b bVar) {
            SimpleExoPlayer.this.I.onAudioDisabled(bVar);
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.Q = null;
            simpleExoPlayer.f4029b0 = null;
        }

        @Override // y9.j
        public void onAudioEnabled(z9.b bVar) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.f4029b0 = bVar;
            simpleExoPlayer.I.onAudioEnabled(bVar);
        }

        @Override // y9.j
        @Deprecated
        public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(Format format) {
        }

        @Override // y9.j
        public void onAudioPositionAdvancing(long j) {
            SimpleExoPlayer.this.I.onAudioPositionAdvancing(j);
        }

        @Override // y9.j
        public void onAudioSinkError(Exception exc) {
            SimpleExoPlayer.this.I.onAudioSinkError(exc);
        }

        @Override // y9.j
        public void onAudioUnderrun(int i10, long j, long j7) {
            SimpleExoPlayer.this.I.onAudioUnderrun(i10, j, j7);
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(c1 c1Var) {
        }

        @Override // eb.k
        public void onCues(List<eb.b> list) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.f4033f0 = list;
            Iterator it = simpleExoPlayer.F.iterator();
            while (it.hasNext()) {
                ((eb.k) it.next()).onCues(list);
            }
        }

        @Override // rb.u
        public void onDroppedFrames(int i10, long j) {
            SimpleExoPlayer.this.I.onDroppedFrames(i10, j);
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onEvents(g1 g1Var, e1 e1Var) {
        }

        @Override // com.google.android.exoplayer2.o
        public /* bridge */ /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.o
        public void onExperimentalSleepingForOffloadChanged(boolean z10) {
            SimpleExoPlayer.t1(SimpleExoPlayer.this);
        }

        @Override // com.google.android.exoplayer2.d1
        public void onIsLoadingChanged(boolean z10) {
            SimpleExoPlayer.this.getClass();
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.d1
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i10) {
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onMediaItemTransition(n0 n0Var, int i10) {
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(p0 p0Var) {
        }

        @Override // pa.d
        public void onMetadata(Metadata metadata) {
            SimpleExoPlayer.this.I.onMetadata(metadata);
            y yVar = SimpleExoPlayer.this.f4040x;
            o0 o0VarA = yVar.X.a();
            int i10 = 0;
            while (true) {
                Metadata.Entry[] entryArr = metadata.f4241a;
                if (i10 >= entryArr.length) {
                    break;
                }
                entryArr[i10].c(o0VarA);
                i10++;
            }
            p0 p0Var = new p0(o0VarA);
            if (!p0Var.equals(yVar.X)) {
                yVar.X = p0Var;
                qb.k kVar = yVar.E;
                kVar.b(15, new t(yVar, 1));
                kVar.a();
            }
            Iterator it = SimpleExoPlayer.this.G.iterator();
            while (it.hasNext()) {
                ((pa.d) it.next()).onMetadata(metadata);
            }
        }

        @Override // com.google.android.exoplayer2.d1
        public void onPlayWhenReadyChanged(boolean z10, int i10) {
            SimpleExoPlayer.t1(SimpleExoPlayer.this);
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(b1 b1Var) {
        }

        @Override // com.google.android.exoplayer2.d1
        public void onPlaybackStateChanged(int i10) {
            SimpleExoPlayer.t1(SimpleExoPlayer.this);
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onPlayerError(z0 z0Var) {
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(z0 z0Var) {
        }

        @Override // com.google.android.exoplayer2.d1
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(p0 p0Var) {
        }

        @Override // com.google.android.exoplayer2.d1
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
        }

        @Override // rb.u
        public void onRenderedFirstFrame(Object obj, long j) {
            SimpleExoPlayer.this.I.onRenderedFirstFrame(obj, j);
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            if (simpleExoPlayer.S == obj) {
                Iterator it = simpleExoPlayer.D.iterator();
                while (it.hasNext()) {
                    ((rb.r) it.next()).onRenderedFirstFrame();
                }
            }
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        }

        @Override // com.google.android.exoplayer2.d1
        @Deprecated
        public /* bridge */ /* synthetic */ void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
        }

        @Override // y9.j
        public void onSkipSilenceEnabledChanged(boolean z10) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            if (simpleExoPlayer.f4032e0 == z10) {
                return;
            }
            simpleExoPlayer.f4032e0 = z10;
            simpleExoPlayer.I.onSkipSilenceEnabledChanged(z10);
            Iterator it = simpleExoPlayer.E.iterator();
            while (it.hasNext()) {
                ((Player$Listener) it.next()).onSkipSilenceEnabledChanged(simpleExoPlayer.f4032e0);
            }
        }

        @Override // com.google.android.exoplayer2.d1
        @Deprecated
        public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
        }

        @Override // com.google.android.exoplayer2.r1
        public void onStreamTypeChanged(int i10) {
            aa.a aVarU1 = SimpleExoPlayer.u1(SimpleExoPlayer.this.L);
            if (aVarU1.equals(SimpleExoPlayer.this.f4037i0)) {
                return;
            }
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.f4037i0 = aVarU1;
            Iterator it = simpleExoPlayer.H.iterator();
            while (it.hasNext()) {
                ((Player$Listener) it.next()).onDeviceInfoChanged(aVarU1);
            }
        }

        @Override // com.google.android.exoplayer2.r1
        public void onStreamVolumeChanged(int i10, boolean z10) {
            Iterator it = SimpleExoPlayer.this.H.iterator();
            while (it.hasNext()) {
                ((Player$Listener) it.next()).onDeviceVolumeChanged(i10, z10);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.getClass();
            Surface surface = new Surface(surfaceTexture);
            simpleExoPlayer.z1(surface);
            simpleExoPlayer.T = surface;
            SimpleExoPlayer.this.v1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            SimpleExoPlayer.this.z1(null);
            SimpleExoPlayer.this.v1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            SimpleExoPlayer.this.v1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onTimelineChanged(w1 w1Var, int i10) {
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, ob.j jVar) {
        }

        @Override // rb.u
        public void onVideoCodecError(Exception exc) {
            SimpleExoPlayer.this.I.onVideoCodecError(exc);
        }

        @Override // rb.u
        public void onVideoDecoderInitialized(String str, long j, long j7) {
            SimpleExoPlayer.this.I.onVideoDecoderInitialized(str, j, j7);
        }

        @Override // rb.u
        public void onVideoDecoderReleased(String str) {
            SimpleExoPlayer.this.I.onVideoDecoderReleased(str);
        }

        @Override // rb.u
        public void onVideoDisabled(z9.b bVar) {
            SimpleExoPlayer.this.I.onVideoDisabled(bVar);
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.P = null;
            simpleExoPlayer.f4028a0 = null;
        }

        @Override // rb.u
        public void onVideoEnabled(z9.b bVar) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.f4028a0 = bVar;
            simpleExoPlayer.I.onVideoEnabled(bVar);
        }

        @Override // rb.u
        public void onVideoFrameProcessingOffset(long j, int i10) {
            SimpleExoPlayer.this.I.onVideoFrameProcessingOffset(j, i10);
        }

        @Override // rb.u
        @Deprecated
        public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(Format format) {
        }

        @Override // rb.u
        public void onVideoSizeChanged(rb.v vVar) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.f4038j0 = vVar;
            simpleExoPlayer.I.onVideoSizeChanged(vVar);
            Iterator it = SimpleExoPlayer.this.D.iterator();
            while (it.hasNext()) {
                rb.r rVar = (rb.r) it.next();
                rVar.onVideoSizeChanged(vVar);
                rVar.onVideoSizeChanged(vVar.f21524a, vVar.f21525b, vVar.f21526c, vVar.f21527d);
            }
        }

        @Override // sb.k
        public void onVideoSurfaceCreated(Surface surface) {
            SimpleExoPlayer.this.z1(surface);
        }

        @Override // sb.k
        public void onVideoSurfaceDestroyed(Surface surface) {
            SimpleExoPlayer.this.z1(null);
        }

        @Override // com.google.android.exoplayer2.e
        public void setVolumeMultiplier(float f10) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.x1(1, 2, Float.valueOf(simpleExoPlayer.f4031d0 * simpleExoPlayer.K.f4112e));
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            SimpleExoPlayer.this.v1(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            if (simpleExoPlayer.W) {
                simpleExoPlayer.z1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            if (simpleExoPlayer.W) {
                simpleExoPlayer.z1(null);
            }
            SimpleExoPlayer.this.v1(0, 0);
        }

        @Override // y9.j
        public void onAudioInputFormatChanged(Format format, z9.e eVar) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.Q = format;
            simpleExoPlayer.I.onAudioInputFormatChanged(format, eVar);
        }

        @Override // com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10) {
        }

        @Override // rb.u
        public void onVideoInputFormatChanged(Format format, z9.e eVar) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.P = format;
            simpleExoPlayer.I.onVideoInputFormatChanged(format, eVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.lifecycle.o, com.google.android.exoplayer2.SimpleExoPlayer] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.exoplayer2.SimpleExoPlayer] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, pb.g] */
    public SimpleExoPlayer(p1 p1Var) throws Throwable {
        SimpleExoPlayer simpleExoPlayer;
        Context context;
        AnalyticsCollector analyticsCollector;
        y9.b bVar;
        int i10;
        ComponentListener componentListener;
        q1 q1Var;
        Handler handler;
        g[] gVarArrB;
        SparseBooleanArray sparseBooleanArray;
        ?? oVar = new androidx.lifecycle.o(5);
        a5.d dVar = new a5.d(4);
        oVar.f4039r = dVar;
        try {
            context = p1Var.f4382a;
            Context applicationContext = context.getApplicationContext();
            analyticsCollector = p1Var.f4388g;
            oVar.I = analyticsCollector;
            bVar = p1Var.f4390i;
            i10 = p1Var.j;
            int i11 = 0;
            oVar.f4032e0 = false;
            oVar.O = p1Var.f4396q;
            componentListener = new ComponentListener();
            oVar.f4041y = componentListener;
            q1Var = new q1();
            oVar.B = q1Var;
            oVar.D = new CopyOnWriteArraySet();
            oVar.E = new CopyOnWriteArraySet();
            oVar.F = new CopyOnWriteArraySet();
            oVar.G = new CopyOnWriteArraySet();
            oVar.H = new CopyOnWriteArraySet();
            handler = new Handler(p1Var.f4389h);
            gVarArrB = p1Var.f4383b.b(handler, componentListener, componentListener, componentListener, componentListener);
            oVar.f4034g = gVarArrB;
            oVar.f4031d0 = 1.0f;
            if (qb.v.f20828a < 21) {
                AudioTrack audioTrack = oVar.R;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    oVar.R.release();
                    oVar.R = null;
                }
                if (oVar.R == null) {
                    oVar.R = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                oVar.f4030c0 = oVar.R.getAudioSessionId();
            } else {
                UUID uuid = h.f4166a;
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                oVar.f4030c0 = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
            oVar.f4033f0 = Collections.EMPTY_LIST;
            oVar.f4035g0 = true;
            sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {20, 21, 22, 23, 24, 25, 26, 27};
            for (int i12 = 8; i11 < i12; i12 = 8) {
                int i13 = iArr[i11];
                qb.b.j(!false);
                sparseBooleanArray.append(i13, true);
                i11++;
            }
            qb.b.j(!false);
            try {
            } catch (Throwable th2) {
                th = th2;
                simpleExoPlayer = this;
            }
        } catch (Throwable th3) {
            th = th3;
            simpleExoPlayer = oVar;
        }
        try {
            y yVar = new y(gVarArrB, p1Var.f4385d, p1Var.f4386e, p1Var.f4387f, analyticsCollector, p1Var.k, p1Var.f4391l, p1Var.f4392m, p1Var.f4393n, p1Var.f4394o, p1Var.f4395p, p1Var.f4384c, p1Var.f4389h, this, new c1(new qb.f(sparseBooleanArray)));
            oVar = this;
            oVar.f4040x = yVar;
            yVar.L(componentListener);
            yVar.F.add(componentListener);
            h4 h4Var = new h4();
            h4Var.f5056d = context.getApplicationContext();
            h4Var.f5057g = new a(h4Var, handler, componentListener, 0);
            oVar.J = h4Var;
            h4Var.k();
            oVar.K = new f(context, handler, componentListener);
            s1 s1Var = new s1(context, handler, componentListener);
            oVar.L = s1Var;
            bVar.getClass();
            int i14 = qb.v.f20828a;
            if (s1Var.f4448e != 3) {
                s1Var.f4448e = 3;
                s1Var.d();
                ((r1) s1Var.f4451h).onStreamTypeChanged(3);
            }
            df.c cVar = new df.c();
            oVar.M = cVar;
            ee.f fVar = new ee.f(4);
            oVar.N = fVar;
            oVar.f4037i0 = u1(s1Var);
            oVar.f4038j0 = rb.v.f21523e;
            oVar.x1(1, 102, Integer.valueOf(oVar.f4030c0));
            oVar.x1(2, 102, Integer.valueOf(oVar.f4030c0));
            oVar.x1(1, 3, bVar);
            oVar.x1(2, 4, Integer.valueOf(i10));
            oVar.x1(1, 101, Boolean.valueOf(oVar.f4032e0));
            oVar.x1(2, 6, q1Var);
            oVar.x1(6, 7, q1Var);
            dVar.d();
        } catch (Throwable th4) {
            th = th4;
            simpleExoPlayer = this;
            simpleExoPlayer.f4039r.d();
            throw th;
        }
    }

    public static void t1(SimpleExoPlayer simpleExoPlayer) {
        ee.f fVar = simpleExoPlayer.N;
        df.c cVar = simpleExoPlayer.M;
        int playbackState = simpleExoPlayer.getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                simpleExoPlayer.B1();
                boolean z10 = simpleExoPlayer.f4040x.Y.f4061p;
                simpleExoPlayer.getPlayWhenReady();
                cVar.getClass();
                simpleExoPlayer.getPlayWhenReady();
                fVar.getClass();
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        cVar.getClass();
        fVar.getClass();
    }

    public static aa.a u1(s1 s1Var) {
        s1Var.getClass();
        AudioManager audioManager = s1Var.f4447d;
        return new aa.a(qb.v.f20828a >= 28 ? audioManager.getStreamMinVolume(s1Var.f4448e) : 0, audioManager.getStreamMaxVolume(s1Var.f4448e));
    }

    public final void A1(int i10, boolean z10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        this.f4040x.z1(i12, z11, i11);
    }

    public final void B1() {
        a5.d dVar = this.f4039r;
        synchronized (dVar) {
            boolean z10 = false;
            while (!dVar.f104d) {
                try {
                    dVar.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f4040x.K.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f4040x.K.getThread().getName();
            int i10 = qb.v.f20828a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread";
            if (this.f4035g0) {
                throw new IllegalStateException(str);
            }
            qb.b.J("SimpleExoPlayer", str, this.f4036h0 ? null : new IllegalStateException());
            this.f4036h0 = true;
        }
    }

    @Override // com.google.android.exoplayer2.g1
    public final void H(Player$Listener player$Listener) {
        player$Listener.getClass();
        this.E.remove(player$Listener);
        this.D.remove(player$Listener);
        this.F.remove(player$Listener);
        this.G.remove(player$Listener);
        this.H.remove(player$Listener);
        this.f4040x.E.c(player$Listener);
    }

    @Override // com.google.android.exoplayer2.g1
    public final void L(d1 d1Var) {
        d1Var.getClass();
        this.f4040x.L(d1Var);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void X(ya.x xVar) {
        B1();
        List listSingletonList = Collections.singletonList(xVar);
        B1();
        this.f4040x.setMediaSources(listSingletonList);
        prepare();
    }

    @Override // androidx.lifecycle.o, com.google.android.exoplayer2.g1
    public final void c0(Player$Listener player$Listener) {
        player$Listener.getClass();
        this.E.add(player$Listener);
        this.D.add(player$Listener);
        this.F.add(player$Listener);
        this.G.add(player$Listener);
        this.H.add(player$Listener);
        this.f4040x.L(player$Listener);
    }

    @Override // com.google.android.exoplayer2.g1
    public final void clearVideoSurface() {
        B1();
        w1();
        z1(null);
        v1(0, 0);
    }

    @Override // com.google.android.exoplayer2.g1
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        B1();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        B1();
        if (holder == null || holder != this.U) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.g1
    public final void clearVideoTextureView(TextureView textureView) {
        B1();
        if (textureView == null || textureView != this.X) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.g1
    public final Looper getApplicationLooper() {
        return this.f4040x.K;
    }

    @Override // com.google.android.exoplayer2.g1
    public final long getBufferedPosition() {
        B1();
        return this.f4040x.getBufferedPosition();
    }

    @Override // com.google.android.exoplayer2.g1
    public final long getContentBufferedPosition() {
        B1();
        return this.f4040x.getContentBufferedPosition();
    }

    @Override // androidx.media3.common.s0
    public final long getContentPosition() {
        B1();
        return this.f4040x.getContentPosition();
    }

    @Override // androidx.media3.common.s0
    public final int getCurrentAdGroupIndex() {
        B1();
        return this.f4040x.getCurrentAdGroupIndex();
    }

    @Override // androidx.media3.common.s0
    public final int getCurrentAdIndexInAdGroup() {
        B1();
        return this.f4040x.getCurrentAdIndexInAdGroup();
    }

    @Override // com.google.android.exoplayer2.g1
    public final List getCurrentCues() {
        B1();
        return this.f4033f0;
    }

    @Override // androidx.media3.common.s0
    public final int getCurrentPeriodIndex() {
        B1();
        return this.f4040x.getCurrentPeriodIndex();
    }

    @Override // androidx.media3.common.s0
    public final long getCurrentPosition() {
        B1();
        return this.f4040x.getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.g1
    public final w1 getCurrentTimeline() {
        B1();
        return this.f4040x.Y.f4048a;
    }

    @Override // com.google.android.exoplayer2.g1
    public final TrackGroupArray getCurrentTrackGroups() {
        B1();
        return this.f4040x.Y.f4055h;
    }

    @Override // com.google.android.exoplayer2.g1
    public final ob.j getCurrentTrackSelections() {
        B1();
        return this.f4040x.getCurrentTrackSelections();
    }

    @Override // androidx.lifecycle.o, com.google.android.exoplayer2.g1
    public final int getCurrentWindowIndex() {
        B1();
        return this.f4040x.getCurrentWindowIndex();
    }

    @Override // com.google.android.exoplayer2.g1
    public final long getDuration() {
        B1();
        return this.f4040x.getDuration();
    }

    @Override // com.google.android.exoplayer2.g1
    public final void getMaxSeekToPreviousPosition() {
        B1();
        this.f4040x.getClass();
    }

    @Override // com.google.android.exoplayer2.g1
    public final p0 getMediaMetadata() {
        return this.f4040x.X;
    }

    @Override // androidx.media3.common.s0
    public final boolean getPlayWhenReady() {
        B1();
        return this.f4040x.Y.f4057l;
    }

    @Override // com.google.android.exoplayer2.g1
    public final b1 getPlaybackParameters() {
        B1();
        return this.f4040x.Y.f4059n;
    }

    @Override // androidx.media3.common.s0
    public final int getPlaybackState() {
        B1();
        return this.f4040x.Y.f4052e;
    }

    @Override // androidx.media3.common.s0
    public final int getPlaybackSuppressionReason() {
        B1();
        return this.f4040x.Y.f4058m;
    }

    @Override // com.google.android.exoplayer2.g1
    public final int getRepeatMode() {
        B1();
        return this.f4040x.P;
    }

    @Override // com.google.android.exoplayer2.g1
    public final long getSeekBackIncrement() {
        B1();
        return this.f4040x.M;
    }

    @Override // com.google.android.exoplayer2.g1
    public final long getSeekForwardIncrement() {
        B1();
        return this.f4040x.N;
    }

    @Override // com.google.android.exoplayer2.g1
    public final boolean getShuffleModeEnabled() {
        B1();
        return this.f4040x.Q;
    }

    @Override // androidx.media3.common.s0
    public final long getTotalBufferedDuration() {
        B1();
        return this.f4040x.getTotalBufferedDuration();
    }

    @Override // com.google.android.exoplayer2.g1
    public final rb.v getVideoSize() {
        return this.f4038j0;
    }

    @Override // androidx.media3.common.s0
    public final boolean isPlayingAd() {
        B1();
        return this.f4040x.isPlayingAd();
    }

    @Override // com.google.android.exoplayer2.g1
    public final n p0() {
        B1();
        return this.f4040x.Y.f4053f;
    }

    @Override // com.google.android.exoplayer2.g1
    public final void prepare() {
        B1();
        boolean playWhenReady = getPlayWhenReady();
        int iC = this.K.c(2, playWhenReady);
        A1(iC, playWhenReady, (!playWhenReady || iC == 1) ? 1 : 2);
        this.f4040x.prepare();
    }

    @Override // com.google.android.exoplayer2.g1
    public final c1 r0() {
        B1();
        return this.f4040x.W;
    }

    @Override // com.google.android.exoplayer2.g1
    public final void release() {
        AudioTrack audioTrack;
        B1();
        if (qb.v.f20828a < 21 && (audioTrack = this.R) != null) {
            audioTrack.release();
            this.R = null;
        }
        this.J.k();
        s1 s1Var = this.L;
        a5.s sVar = (a5.s) s1Var.f4452i;
        if (sVar != null) {
            try {
                s1Var.f4445b.unregisterReceiver(sVar);
            } catch (RuntimeException e4) {
                qb.b.J("StreamVolumeManager", "Error unregistering stream volume receiver", e4);
            }
            s1Var.f4452i = null;
        }
        this.M.getClass();
        this.N.getClass();
        f fVar = this.K;
        fVar.f4110c = null;
        fVar.a();
        this.f4040x.release();
        this.I.release();
        w1();
        Surface surface = this.T;
        if (surface != null) {
            surface.release();
            this.T = null;
        }
        this.f4033f0 = Collections.EMPTY_LIST;
    }

    @Override // androidx.lifecycle.o, com.google.android.exoplayer2.g1
    public final void seekTo(int i10, long j) {
        B1();
        this.I.notifySeekStarted();
        this.f4040x.seekTo(i10, j);
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setPlayWhenReady(boolean z10) {
        B1();
        int iC = this.K.c(getPlaybackState(), z10);
        int i10 = 1;
        if (z10 && iC != 1) {
            i10 = 2;
        }
        A1(iC, z10, i10);
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setRepeatMode(int i10) {
        B1();
        this.f4040x.setRepeatMode(i10);
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setShuffleModeEnabled(boolean z10) {
        B1();
        this.f4040x.setShuffleModeEnabled(z10);
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        B1();
        if (surfaceView instanceof rb.k) {
            w1();
            z1(surfaceView);
            y1(surfaceView.getHolder());
            return;
        }
        boolean z10 = surfaceView instanceof sb.l;
        ComponentListener componentListener = this.f4041y;
        if (z10) {
            w1();
            this.V = (sb.l) surfaceView;
            j1 j1VarT1 = this.f4040x.t1(this.B);
            qb.b.j(!j1VarT1.f4201g);
            j1VarT1.f4198d = 10000;
            sb.l lVar = this.V;
            qb.b.j(true ^ j1VarT1.f4201g);
            j1VarT1.f4199e = lVar;
            j1VarT1.c();
            this.V.f21981a.add(componentListener);
            z1(this.V.getVideoSurface());
            y1(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        B1();
        if (holder == null) {
            clearVideoSurface();
            return;
        }
        w1();
        this.W = true;
        this.U = holder;
        holder.addCallback(componentListener);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            z1(null);
            v1(0, 0);
        } else {
            z1(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            v1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setVideoTextureView(TextureView textureView) {
        B1();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        w1();
        this.X = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            io.sentry.android.core.e0.p("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f4041y);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            z1(null);
            v1(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            z1(surface);
            this.T = surface;
            v1(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.g1
    public final void setVolume(float f10) {
        B1();
        float fH = qb.v.h(f10, 0.0f, 1.0f);
        if (this.f4031d0 == fH) {
            return;
        }
        this.f4031d0 = fH;
        x1(1, 2, Float.valueOf(this.K.f4112e * fH));
        this.I.onVolumeChanged(fH);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((Player$Listener) it.next()).onVolumeChanged(fH);
        }
    }

    public final void v1(int i10, int i11) {
        if (i10 == this.Y && i11 == this.Z) {
            return;
        }
        this.Y = i10;
        this.Z = i11;
        this.I.onSurfaceSizeChanged(i10, i11);
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((rb.r) it.next()).onSurfaceSizeChanged(i10, i11);
        }
    }

    public final void w1() {
        sb.l lVar = this.V;
        ComponentListener componentListener = this.f4041y;
        if (lVar != null) {
            j1 j1VarT1 = this.f4040x.t1(this.B);
            qb.b.j(!j1VarT1.f4201g);
            j1VarT1.f4198d = 10000;
            qb.b.j(!j1VarT1.f4201g);
            j1VarT1.f4199e = null;
            j1VarT1.c();
            this.V.f21981a.remove(componentListener);
            this.V = null;
        }
        TextureView textureView = this.X;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != componentListener) {
                io.sentry.android.core.e0.p("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.U;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(componentListener);
            this.U = null;
        }
    }

    public final void x1(int i10, int i11, Object obj) {
        for (g gVar : this.f4034g) {
            if (gVar.f4136a == i10) {
                j1 j1VarT1 = this.f4040x.t1(gVar);
                qb.b.j(!j1VarT1.f4201g);
                j1VarT1.f4198d = i11;
                qb.b.j(!j1VarT1.f4201g);
                j1VarT1.f4199e = obj;
                j1VarT1.c();
            }
        }
    }

    public final void y1(SurfaceHolder surfaceHolder) {
        this.W = false;
        this.U = surfaceHolder;
        surfaceHolder.addCallback(this.f4041y);
        Surface surface = this.U.getSurface();
        if (surface == null || !surface.isValid()) {
            v1(0, 0);
        } else {
            Rect surfaceFrame = this.U.getSurfaceFrame();
            v1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void z1(Object obj) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        for (g gVar : this.f4034g) {
            if (gVar.f4136a == 2) {
                j1 j1VarT1 = this.f4040x.t1(gVar);
                qb.b.j(!j1VarT1.f4201g);
                j1VarT1.f4198d = 1;
                qb.b.j(true ^ j1VarT1.f4201g);
                j1VarT1.f4199e = obj;
                j1VarT1.c();
                arrayList.add(j1VarT1);
            }
        }
        Object obj2 = this.S;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((j1) it.next()).a(this.O);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            z10 = false;
            Object obj3 = this.S;
            Surface surface = this.T;
            if (obj3 == surface) {
                surface.release();
                this.T = null;
            }
        }
        this.S = obj;
        if (z10) {
            y yVar = this.f4040x;
            n nVar = new n(2, new bf.n("Detaching surface timed out."), 1003);
            a1 a1Var = yVar.Y;
            a1 a1VarA = a1Var.a(a1Var.f4049b);
            a1VarA.f4062q = a1VarA.f4064s;
            a1VarA.f4063r = 0L;
            a1 a1VarE = a1VarA.f(1).e(nVar);
            yVar.R++;
            qb.t tVar = yVar.D.B;
            tVar.getClass();
            qb.s sVarB = qb.t.b();
            sVarB.f20821a = tVar.f20823a.obtainMessage(6);
            sVarB.b();
            yVar.B1(a1VarE, 0, 1, false, a1VarE.f4048a.p() && !yVar.Y.f4048a.p(), 4, yVar.u1(a1VarE), -1);
        }
    }
}
