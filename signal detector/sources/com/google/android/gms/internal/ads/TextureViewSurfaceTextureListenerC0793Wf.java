package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.util.HashMap;
import q2.C2841s;
import t2.AbstractC2907C;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Wf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC0793Wf extends AbstractC0827Yf implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: H, reason: collision with root package name */
    public static final HashMap f12230H;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f12231C;

    /* renamed from: D, reason: collision with root package name */
    public int f12232D;

    /* renamed from: E, reason: collision with root package name */
    public C0946bg f12233E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f12234F;

    /* renamed from: G, reason: collision with root package name */
    public Integer f12235G;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0828Yg f12236c;

    /* renamed from: d, reason: collision with root package name */
    public final C1325ig f12237d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12238e;

    /* renamed from: f, reason: collision with root package name */
    public final C0784Vn f12239f;

    /* renamed from: g, reason: collision with root package name */
    public int f12240g;

    /* renamed from: h, reason: collision with root package name */
    public int f12241h;
    public MediaPlayer i;

    /* renamed from: j, reason: collision with root package name */
    public Uri f12242j;

    /* renamed from: k, reason: collision with root package name */
    public int f12243k;

    /* renamed from: l, reason: collision with root package name */
    public int f12244l;

    /* renamed from: m, reason: collision with root package name */
    public int f12245m;

    /* renamed from: n, reason: collision with root package name */
    public C1218gg f12246n;

    static {
        HashMap map = new HashMap();
        f12230H = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public TextureViewSurfaceTextureListenerC0793Wf(Context context, InterfaceC0828Yg interfaceC0828Yg, boolean z6, boolean z7, C1325ig c1325ig, C0784Vn c0784Vn) {
        super(context);
        this.f12240g = 0;
        this.f12241h = 0;
        this.f12234F = false;
        this.f12235G = null;
        this.f12236c = interfaceC0828Yg;
        this.f12237d = c1325ig;
        this.f12231C = z6;
        this.f12238e = z7;
        c1325ig.a(this);
        this.f12239f = c0784Vn;
    }

    public final void D() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        SurfaceTexture surfaceTexture;
        C0784Vn c0784Vn;
        AbstractC2907C.m("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.f12242j == null || surfaceTexture2 == null) {
            return;
        }
        E(false);
        try {
            p1.e eVar = p2.j.f22785C.f22807u;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.i = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.i.setOnCompletionListener(this);
            this.i.setOnErrorListener(this);
            this.i.setOnInfoListener(this);
            this.i.setOnPreparedListener(this);
            this.i.setOnVideoSizeChangedListener(this);
            this.f12245m = 0;
            if (this.f12231C) {
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.ye)).booleanValue() && (c0784Vn = this.f12239f) != null) {
                    C0697Ql c0697QlA = c0784Vn.a();
                    c0697QlA.r("action", "svp_ampv");
                    c0697QlA.s();
                }
                C1218gg c1218gg = new C1218gg(getContext());
                this.f12246n = c1218gg;
                int width = getWidth();
                int height = getHeight();
                c1218gg.f14360m = width;
                c1218gg.f14359l = height;
                c1218gg.f14337C = surfaceTexture2;
                C1218gg c1218gg2 = this.f12246n;
                c1218gg2.start();
                if (c1218gg2.f14337C == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        c1218gg2.f14342H.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = c1218gg2.f14361n;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.f12246n.c();
                    this.f12246n = null;
                }
            }
            this.i.setDataSource(getContext(), this.f12242j);
            this.i.setSurface(new Surface(surfaceTexture2));
            this.i.setAudioStreamType(3);
            this.i.setScreenOnWhilePlaying(true);
            this.i.prepareAsync();
            G(1);
        } catch (IOException e6) {
            e = e6;
            u2.k.i("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f12242j)), e);
            onError(this.i, 1, 0);
        } catch (IllegalArgumentException e7) {
            e = e7;
            u2.k.i("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f12242j)), e);
            onError(this.i, 1, 0);
        } catch (IllegalStateException e8) {
            e = e8;
            u2.k.i("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f12242j)), e);
            onError(this.i, 1, 0);
        }
    }

    public final void E(boolean z6) {
        AbstractC2907C.m("AdMediaPlayerView release");
        C1218gg c1218gg = this.f12246n;
        if (c1218gg != null) {
            c1218gg.c();
            this.f12246n = null;
        }
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.i.release();
            this.i = null;
            G(0);
            if (z6) {
                this.f12241h = 0;
            }
        }
    }

    public final boolean F() {
        int i;
        return (this.i == null || (i = this.f12240g) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final void G(int i) {
        C1432kg c1432kg = this.f12647b;
        C1325ig c1325ig = this.f12237d;
        if (i == 3) {
            c1325ig.d();
            c1432kg.f15180d = true;
            c1432kg.a();
        } else if (this.f12240g == 3) {
            c1325ig.f14744m = false;
            c1432kg.f15180d = false;
            c1432kg.a();
        }
        this.f12240g = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final String d() {
        return "MediaPlayer".concat(true != this.f12231C ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void e(C0946bg c0946bg) {
        this.f12233E = c0946bg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void f(String str) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        C1892t8 c1892t8A = C1892t8.a(uri);
        if (c1892t8A == null || c1892t8A.f16858a != null) {
            if (c1892t8A != null) {
                uri = Uri.parse(c1892t8A.f16858a);
            }
            this.f12242j = uri;
            this.f12232D = 0;
            D();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void g() throws IllegalStateException {
        AbstractC2907C.m("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.i.release();
            this.i = null;
            G(0);
            this.f12241h = 0;
        }
        this.f12237d.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void h() throws IllegalStateException {
        AbstractC2907C.m("AdMediaPlayerView play");
        if (F()) {
            this.i.start();
            G(3);
            this.f12646a.f13790c = true;
            C2911G.f23576l.post(new RunnableC0742Tf(this, 3));
        }
        this.f12241h = 3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void i() throws IllegalStateException {
        AbstractC2907C.m("AdMediaPlayerView pause");
        if (F() && this.i.isPlaying()) {
            this.i.pause();
            G(4);
            C2911G.f23576l.post(new RunnableC0742Tf(this, 4));
        }
        this.f12241h = 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final int j() {
        if (F()) {
            return this.i.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final int k() {
        if (F()) {
            return this.i.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1378jg
    public final void l() {
        C1432kg c1432kg = this.f12647b;
        float f2 = c1432kg.f15179c ? c1432kg.f15181e ? 0.0f : c1432kg.f15182f : 0.0f;
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer == null) {
            u2.k.h("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f2, f2);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void m(int i) throws IllegalStateException {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 23);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        AbstractC2907C.m(sb.toString());
        if (!F()) {
            this.f12232D = i;
        } else {
            this.i.seekTo(i);
            this.f12232D = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void n(float f2, float f5) {
        C1218gg c1218gg = this.f12246n;
        if (c1218gg != null) {
            c1218gg.d(f2, f5);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final int o() {
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f12245m = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        AbstractC2907C.m("AdMediaPlayerView completion");
        G(5);
        this.f12241h = 5;
        C2911G.f23576l.post(new RunnableC0742Tf(this, 0));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i3) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = f12230H;
        String str = (String) map.get(numValueOf);
        String str2 = (String) map.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        u2.k.h(sb.toString());
        G(-1);
        this.f12241h = -1;
        C2911G.f23576l.post(new RunnableC0912b0(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i3) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = f12230H;
        String str = (String) map.get(numValueOf);
        String str2 = (String) map.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        AbstractC2907C.m(sb.toString());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f12243k
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.f12244l
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.f12243k
            if (r2 <= 0) goto L7a
            int r2 = r5.f12244l
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.gg r2 = r5.f12246n
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.f12243k
            int r1 = r0 * r7
            int r2 = r5.f12244l
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
        L40:
            r0 = r6
            goto L7a
        L42:
            r0 = r2
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.f12244l
            int r0 = r0 * r6
            int r2 = r5.f12243k
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L60
        L52:
            r1 = r0
            goto L40
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.f12243k
            int r1 = r1 * r7
            int r2 = r5.f12244l
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.f12243k
            int r4 = r5.f12244l
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L40
        L7a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.gg r6 = r5.f12246n
            if (r6 == 0) goto L84
            r6.b(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC0793Wf.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        AbstractC2907C.m("AdMediaPlayerView prepared");
        G(2);
        C1325ig c1325ig = this.f12237d;
        if (c1325ig.i && !c1325ig.f14741j) {
            AbstractC0933bL.g(c1325ig.f14737e, c1325ig.f14736d, "vfr2");
            c1325ig.f14741j = true;
        }
        C2911G.f23576l.post(new CD(this, mediaPlayer, 12, false));
        this.f12243k = mediaPlayer.getVideoWidth();
        this.f12244l = mediaPlayer.getVideoHeight();
        int i = this.f12232D;
        if (i != 0) {
            m(i);
        }
        if (this.f12238e && F() && this.i.getCurrentPosition() > 0 && this.f12241h != 3) {
            AbstractC2907C.m("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.i;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                u2.k.h("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.i.start();
            int currentPosition = this.i.getCurrentPosition();
            p2.j.f22785C.f22797k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (F() && this.i.getCurrentPosition() == currentPosition) {
                p2.j.f22785C.f22797k.getClass();
                if (System.currentTimeMillis() - jCurrentTimeMillis > 250) {
                    break;
                }
            }
            this.i.pause();
            l();
        }
        int i3 = this.f12243k;
        int i6 = this.f12244l;
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 40 + String.valueOf(i6).length());
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i3);
        sb.append(" x ");
        sb.append(i6);
        u2.k.g(sb.toString());
        if (this.f12241h == 3) {
            h();
        }
        l();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i3) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        AbstractC2907C.m("AdMediaPlayerView surface created");
        D();
        C2911G.f23576l.post(new RunnableC0742Tf(this, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AbstractC2907C.m("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null && this.f12232D == 0) {
            this.f12232D = mediaPlayer.getCurrentPosition();
        }
        C1218gg c1218gg = this.f12246n;
        if (c1218gg != null) {
            c1218gg.c();
        }
        C2911G.f23576l.post(new RunnableC0742Tf(this, 2));
        E(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i3) throws IllegalStateException {
        AbstractC2907C.m("AdMediaPlayerView surface changed");
        int i6 = this.f12241h;
        boolean z6 = false;
        if (this.f12243k == i && this.f12244l == i3) {
            z6 = true;
        }
        if (this.i != null && i6 == 3 && z6) {
            int i7 = this.f12232D;
            if (i7 != 0) {
                m(i7);
            }
            h();
        }
        C1218gg c1218gg = this.f12246n;
        if (c1218gg != null) {
            c1218gg.b(i, i3);
        }
        C2911G.f23576l.post(new RunnableC0759Uf(this, i, i3, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f12237d.c(this);
        this.f12646a.a(surfaceTexture, this.f12233E);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i3) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35 + String.valueOf(i3).length());
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i3);
        AbstractC2907C.m(sb.toString());
        this.f12243k = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f12244l = videoHeight;
        if (this.f12243k == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 47);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        AbstractC2907C.m(sb.toString());
        C2911G.f23576l.post(new A3.h(i, 8, this));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final int p() {
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final long q() {
        if (this.f12235G != null) {
            return (s() * this.f12245m) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final long r() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final long s() {
        if (this.f12235G != null) {
            return j() * this.f12235G.intValue();
        }
        return -1L;
    }

    @Override // android.view.View
    public final String toString() {
        String name = TextureViewSurfaceTextureListenerC0793Wf.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return AbstractC1135f5.n(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final int y() {
        if (Build.VERSION.SDK_INT < 26 || !F()) {
            return -1;
        }
        return this.i.getMetrics().getInt("android.media.mediaplayer.dropped");
    }
}
