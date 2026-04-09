package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yd2 extends ae2 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    public static final HashMap y;
    public final ag2 h;
    public final ke2 i;
    public final boolean j;
    public final mv2 k;
    public int l;
    public int m;
    public MediaPlayer n;
    public Uri o;
    public int p;
    public int q;
    public int r;
    public ie2 s;
    public final boolean t;
    public int u;
    public ee2 v;
    public boolean w;
    public Integer x;

    static {
        HashMap map = new HashMap();
        y = map;
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

    public yd2(Context context, ag2 ag2Var, boolean z, boolean z2, ke2 ke2Var, mv2 mv2Var) {
        super(context);
        this.l = 0;
        this.m = 0;
        this.w = false;
        this.x = null;
        this.h = ag2Var;
        this.i = ke2Var;
        this.t = z;
        this.j = z2;
        ke2Var.a(this);
        this.k = mv2Var;
    }

    public final void D() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        SurfaceTexture surfaceTexture;
        mv2 mv2Var;
        gi2.G("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.o == null || surfaceTexture2 == null) {
            return;
        }
        E(false);
        try {
            ts0 ts0Var = hg4.C.u;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.n = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.n.setOnCompletionListener(this);
            this.n.setOnErrorListener(this);
            this.n.setOnInfoListener(this);
            this.n.setOnPreparedListener(this);
            this.n.setOnVideoSizeChangedListener(this);
            this.r = 0;
            if (this.t) {
                if (((Boolean) tw1.e.c.a(mz1.be)).booleanValue() && (mv2Var = this.k) != null) {
                    lv2 lv2VarA = mv2Var.a();
                    lv2VarA.k("action", "svp_ampv");
                    lv2VarA.m();
                }
                ie2 ie2Var = new ie2(getContext());
                this.s = ie2Var;
                int width = getWidth();
                int height = getHeight();
                ie2Var.r = width;
                ie2Var.q = height;
                ie2Var.t = surfaceTexture2;
                ie2 ie2Var2 = this.s;
                ie2Var2.start();
                if (ie2Var2.t == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        ie2Var2.y.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = ie2Var2.s;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.s.b();
                    this.s = null;
                }
            }
            this.n.setDataSource(getContext(), this.o);
            this.n.setSurface(new Surface(surfaceTexture2));
            this.n.setAudioStreamType(3);
            this.n.setScreenOnWhilePlaying(true);
            this.n.prepareAsync();
            G(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException unused2) {
            "Failed to initialize MediaPlayer at ".concat(String.valueOf(this.o));
            gi2.q0(5);
            onError(this.n, 1, 0);
        }
    }

    public final void E(boolean z) {
        gi2.G("AdMediaPlayerView release");
        ie2 ie2Var = this.s;
        if (ie2Var != null) {
            ie2Var.b();
            this.s = null;
        }
        MediaPlayer mediaPlayer = this.n;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.n.release();
            this.n = null;
            G(0);
            if (z) {
                this.m = 0;
            }
        }
    }

    public final boolean F() {
        int i;
        return (this.n == null || (i = this.l) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final void G(int i) {
        me2 me2Var = this.g;
        ke2 ke2Var = this.i;
        if (i == 3) {
            ke2Var.d();
            me2Var.d = true;
            me2Var.a();
        } else if (this.l == 3) {
            ke2Var.m = false;
            me2Var.d = false;
            me2Var.a();
        }
        this.l = i;
    }

    @Override // defpackage.ae2
    public final String d() {
        return "MediaPlayer".concat(true != this.t ? "" : " spherical");
    }

    @Override // defpackage.ae2
    public final void e(ee2 ee2Var) {
        this.v = ee2Var;
    }

    @Override // defpackage.ae2
    public final void f(String str) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        ww1 ww1VarA = ww1.a(uri);
        if (ww1VarA == null || ww1VarA.f != null) {
            if (ww1VarA != null) {
                uri = Uri.parse(ww1VarA.f);
            }
            this.o = uri;
            this.u = 0;
            D();
            requestLayout();
            invalidate();
        }
    }

    @Override // defpackage.ae2
    public final void g() throws IllegalStateException {
        gi2.G("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.n;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.n.release();
            this.n = null;
            G(0);
            this.m = 0;
        }
        this.i.b();
    }

    @Override // defpackage.ae2
    public final void h() throws IllegalStateException {
        gi2.G("AdMediaPlayerView play");
        if (F()) {
            this.n.start();
            G(3);
            this.f.c = true;
            lf4.l.post(new wd2(this, 3));
        }
        this.m = 3;
    }

    @Override // defpackage.ae2
    public final void i() throws IllegalStateException {
        gi2.G("AdMediaPlayerView pause");
        if (F() && this.n.isPlaying()) {
            this.n.pause();
            G(4);
            lf4.l.post(new wd2(this, 4));
        }
        this.m = 4;
    }

    @Override // defpackage.ae2
    public final int j() {
        if (F()) {
            return this.n.getDuration();
        }
        return -1;
    }

    @Override // defpackage.ae2
    public final int k() {
        if (F()) {
            return this.n.getCurrentPosition();
        }
        return 0;
    }

    @Override // defpackage.ae2
    public final void l(int i) throws IllegalStateException {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 23);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        gi2.G(sb.toString());
        if (!F()) {
            this.u = i;
        } else {
            this.n.seekTo(i);
            this.u = 0;
        }
    }

    @Override // defpackage.le2
    public final void m() {
        me2 me2Var = this.g;
        float f = me2Var.c ? me2Var.e ? 0.0f : me2Var.f : 0.0f;
        MediaPlayer mediaPlayer = this.n;
        if (mediaPlayer == null) {
            gi2.i0("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // defpackage.ae2
    public final void n(float f, float f2) {
        ie2 ie2Var = this.s;
        if (ie2Var != null) {
            ie2Var.c(f, f2);
        }
    }

    @Override // defpackage.ae2
    public final int o() {
        MediaPlayer mediaPlayer = this.n;
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
        this.r = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        gi2.G("AdMediaPlayerView completion");
        G(5);
        this.m = 5;
        lf4.l.post(new wd2(this, 0));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = y;
        String str = (String) map.get(numValueOf);
        String str2 = (String) map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        gi2.i0(sb.toString());
        G(-1);
        this.m = -1;
        lf4.l.post(new gi(this, str, str2, 15, false));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = y;
        String str = (String) map.get(numValueOf);
        String str2 = (String) map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        gi2.G(sb.toString());
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
            int r0 = r5.p
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.q
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.p
            if (r2 <= 0) goto L7a
            int r2 = r5.q
            if (r2 <= 0) goto L7a
            ie2 r2 = r5.s
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.p
            int r1 = r0 * r7
            int r2 = r5.q
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
            int r0 = r5.q
            int r0 = r0 * r6
            int r2 = r5.p
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L60
        L52:
            r1 = r0
            goto L40
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.p
            int r1 = r1 * r7
            int r2 = r5.q
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
            int r2 = r5.p
            int r4 = r5.q
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
            ie2 r6 = r5.s
            if (r6 == 0) goto L84
            r6.a(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd2.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        gi2.G("AdMediaPlayerView prepared");
        G(2);
        ke2 ke2Var = this.i;
        if (ke2Var.i && !ke2Var.j) {
            pu1.t(ke2Var.e, ke2Var.d, "vfr2");
            ke2Var.j = true;
        }
        lf4.l.post(new n62(this, mediaPlayer, 8, false));
        this.p = mediaPlayer.getVideoWidth();
        this.q = mediaPlayer.getVideoHeight();
        int i = this.u;
        if (i != 0) {
            l(i);
        }
        if (this.j && F() && this.n.getCurrentPosition() > 0 && this.m != 3) {
            gi2.G("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.n;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                gi2.i0("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.n.start();
            int currentPosition = this.n.getCurrentPosition();
            hg4.C.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (F() && this.n.getCurrentPosition() == currentPosition) {
                hg4.C.k.getClass();
                if (System.currentTimeMillis() - jCurrentTimeMillis > 250) {
                    break;
                }
            }
            this.n.pause();
            m();
        }
        int i2 = this.p;
        int i3 = this.q;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40 + String.valueOf(i3).length());
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        gi2.f0(sb.toString());
        if (this.m == 3) {
            h();
        }
        m();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        gi2.G("AdMediaPlayerView surface created");
        D();
        lf4.l.post(new wd2(this, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        gi2.G("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.n;
        if (mediaPlayer != null && this.u == 0) {
            this.u = mediaPlayer.getCurrentPosition();
        }
        ie2 ie2Var = this.s;
        if (ie2Var != null) {
            ie2Var.b();
        }
        lf4.l.post(new wd2(this, 2));
        E(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) throws IllegalStateException {
        gi2.G("AdMediaPlayerView surface changed");
        int i3 = this.m;
        boolean z = false;
        if (this.p == i && this.q == i2) {
            z = true;
        }
        if (this.n != null && i3 == 3 && z) {
            int i4 = this.u;
            if (i4 != 0) {
                l(i4);
            }
            h();
        }
        ie2 ie2Var = this.s;
        if (ie2Var != null) {
            ie2Var.a(i, i2);
        }
        lf4.l.post(new xd2(this, i, i2, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.i.c(this);
        this.f.a(surfaceTexture, this.v);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35 + String.valueOf(i2).length());
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        gi2.G(sb.toString());
        this.p = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.q = videoHeight;
        if (this.p == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 47);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        gi2.G(sb.toString());
        lf4.l.post(new cd(this, i, 7));
        super.onWindowVisibilityChanged(i);
    }

    @Override // defpackage.ae2
    public final int p() {
        MediaPlayer mediaPlayer = this.n;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // defpackage.ae2
    public final long q() {
        if (this.x != null) {
            return (s() * this.r) / 100;
        }
        return -1L;
    }

    @Override // defpackage.ae2
    public final long r() {
        return 0L;
    }

    @Override // defpackage.ae2
    public final long s() {
        if (this.x != null) {
            return j() * this.x.intValue();
        }
        return -1L;
    }

    @Override // android.view.View
    public final String toString() {
        String name = yd2.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return ex0.l(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // defpackage.ae2
    public final int y() {
        if (F()) {
            return this.n.getMetrics().getInt("android.media.mediaplayer.dropped");
        }
        return -1;
    }
}
