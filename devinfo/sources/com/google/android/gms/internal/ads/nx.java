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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nx extends px implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: t, reason: collision with root package name */
    public static final HashMap f14460t;

    /* renamed from: c, reason: collision with root package name */
    public final qz f14461c;

    /* renamed from: d, reason: collision with root package name */
    public final zx f14462d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14463e;

    /* renamed from: f, reason: collision with root package name */
    public final qd0 f14464f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f14465h;

    /* renamed from: i, reason: collision with root package name */
    public MediaPlayer f14466i;
    public Uri j;

    /* renamed from: k, reason: collision with root package name */
    public int f14467k;

    /* renamed from: l, reason: collision with root package name */
    public int f14468l;

    /* renamed from: m, reason: collision with root package name */
    public int f14469m;

    /* renamed from: n, reason: collision with root package name */
    public xx f14470n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f14471o;

    /* renamed from: p, reason: collision with root package name */
    public int f14472p;

    /* renamed from: q, reason: collision with root package name */
    public sx f14473q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14474r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f14475s;

    static {
        HashMap map = new HashMap();
        f14460t = map;
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

    public nx(Context context, qz qzVar, boolean z3, boolean z10, zx zxVar, qd0 qd0Var) {
        super(context);
        this.g = 0;
        this.f14465h = 0;
        this.f14474r = false;
        this.f14475s = null;
        this.f14461c = qzVar;
        this.f14462d = zxVar;
        this.f14471o = z3;
        this.f14463e = z10;
        zxVar.a(this);
        this.f14464f = qd0Var;
    }

    public final void C() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        SurfaceTexture surfaceTexture;
        qd0 qd0Var;
        ya.a0.m("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.j == null || surfaceTexture2 == null) {
            return;
        }
        D(false);
        try {
            i7.b bVar = ua.j.C.f35277u;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f14466i = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f14466i.setOnCompletionListener(this);
            this.f14466i.setOnErrorListener(this);
            this.f14466i.setOnInfoListener(this);
            this.f14466i.setOnPreparedListener(this);
            this.f14466i.setOnVideoSizeChangedListener(this);
            this.f14469m = 0;
            if (this.f14471o) {
                if (((Boolean) va.s.f36163e.f36166c.a(sk.Ae)).booleanValue() && (qd0Var = this.f14464f) != null) {
                    rt rtVarA = qd0Var.a();
                    rtVarA.u("action", "svp_ampv");
                    rtVarA.v();
                }
                xx xxVar = new xx(getContext());
                this.f14470n = xxVar;
                int width = getWidth();
                int height = getHeight();
                xxVar.f18547m = width;
                xxVar.f18546l = height;
                xxVar.f18549o = surfaceTexture2;
                xx xxVar2 = this.f14470n;
                xxVar2.start();
                if (xxVar2.f18549o == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        xxVar2.f18554t.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = xxVar2.f18548n;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.f14470n.c();
                    this.f14470n = null;
                }
            }
            this.f14466i.setDataSource(getContext(), this.j);
            this.f14466i.setSurface(new Surface(surfaceTexture2));
            this.f14466i.setAudioStreamType(3);
            this.f14466i.setScreenOnWhilePlaying(true);
            this.f14466i.prepareAsync();
            G(1);
        } catch (IOException e2) {
            e = e2;
            za.i.i("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.j)), e);
            onError(this.f14466i, 1, 0);
        } catch (IllegalArgumentException e10) {
            e = e10;
            za.i.i("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.j)), e);
            onError(this.f14466i, 1, 0);
        } catch (IllegalStateException e11) {
            e = e11;
            za.i.i("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.j)), e);
            onError(this.f14466i, 1, 0);
        }
    }

    public final void D(boolean z3) {
        ya.a0.m("AdMediaPlayerView release");
        xx xxVar = this.f14470n;
        if (xxVar != null) {
            xxVar.c();
            this.f14470n = null;
        }
        MediaPlayer mediaPlayer = this.f14466i;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f14466i.release();
            this.f14466i = null;
            G(0);
            if (z3) {
                this.f14465h = 0;
            }
        }
    }

    public final boolean E() {
        int i4;
        return (this.f14466i == null || (i4 = this.g) == -1 || i4 == 0 || i4 == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.ay
    public final void E1() {
        cy cyVar = this.f15133b;
        float f10 = cyVar.f10255c ? cyVar.f10257e ? 0.0f : cyVar.f10258f : 0.0f;
        MediaPlayer mediaPlayer = this.f14466i;
        if (mediaPlayer == null) {
            za.i.h("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f10, f10);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public final void G(int i4) {
        cy cyVar = this.f15133b;
        zx zxVar = this.f14462d;
        if (i4 == 3) {
            zxVar.d();
            cyVar.f10256d = true;
            cyVar.a();
        } else if (this.g == 3) {
            zxVar.f19223m = false;
            cyVar.f10256d = false;
            cyVar.a();
        }
        this.g = i4;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final String d() {
        return "MediaPlayer".concat(true != this.f14471o ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void e(sx sxVar) {
        this.f14473q = sxVar;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void f(String str) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        ei eiVarA = ei.a(uri);
        if (eiVarA == null || eiVarA.f10793a != null) {
            if (eiVarA != null) {
                uri = Uri.parse(eiVarA.f10793a);
            }
            this.j = uri;
            this.f14472p = 0;
            C();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void g() throws IllegalStateException {
        ya.a0.m("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f14466i;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f14466i.release();
            this.f14466i = null;
            G(0);
            this.f14465h = 0;
        }
        this.f14462d.b();
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void h() throws IllegalStateException {
        ya.a0.m("AdMediaPlayerView play");
        if (E()) {
            this.f14466i.start();
            G(3);
            this.f15132a.f17376c = true;
            ya.f0.f37440l.post(new lx(this, 3));
        }
        this.f14465h = 3;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void n() throws IllegalStateException {
        ya.a0.m("AdMediaPlayerView pause");
        if (E() && this.f14466i.isPlaying()) {
            this.f14466i.pause();
            G(4);
            ya.f0.f37440l.post(new lx(this, 4));
        }
        this.f14465h = 4;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final int o() {
        if (E()) {
            return this.f14466i.getDuration();
        }
        return -1;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i4) {
        this.f14469m = i4;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        ya.a0.m("AdMediaPlayerView completion");
        G(5);
        this.f14465h = 5;
        ya.f0.f37440l.post(new lx(this, 0));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i4, int i10) {
        Integer numValueOf = Integer.valueOf(i4);
        HashMap map = f14460t;
        String str = (String) map.get(numValueOf);
        String str2 = (String) map.get(Integer.valueOf(i10));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb2.append("AdMediaPlayerView MediaPlayer error: ");
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        za.i.h(sb2.toString());
        G(-1);
        this.f14465h = -1;
        ya.f0.f37440l.post(new d1(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i4, int i10) {
        Integer numValueOf = Integer.valueOf(i4);
        HashMap map = f14460t;
        String str = (String) map.get(numValueOf);
        String str2 = (String) map.get(Integer.valueOf(i10));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb2.append("AdMediaPlayerView MediaPlayer info: ");
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        ya.a0.m(sb2.toString());
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
            int r0 = r5.f14467k
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.f14468l
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.f14467k
            if (r2 <= 0) goto L7a
            int r2 = r5.f14468l
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.xx r2 = r5.f14470n
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.f14467k
            int r1 = r0 * r7
            int r2 = r5.f14468l
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
            int r0 = r5.f14468l
            int r0 = r0 * r6
            int r2 = r5.f14467k
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L60
        L52:
            r1 = r0
            goto L40
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.f14467k
            int r1 = r1 * r7
            int r2 = r5.f14468l
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
            int r2 = r5.f14467k
            int r4 = r5.f14468l
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
            com.google.android.gms.internal.ads.xx r6 = r5.f14470n
            if (r6 == 0) goto L84
            r6.b(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nx.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        ya.a0.m("AdMediaPlayerView prepared");
        G(2);
        zx zxVar = this.f14462d;
        if (zxVar.f19220i && !zxVar.j) {
            a80.h(zxVar.f19217e, zxVar.f19216d, "vfr2");
            zxVar.j = true;
        }
        ya.f0.f37440l.post(new q81(this, false, mediaPlayer, 11));
        this.f14467k = mediaPlayer.getVideoWidth();
        this.f14468l = mediaPlayer.getVideoHeight();
        int i4 = this.f14472p;
        if (i4 != 0) {
            q(i4);
        }
        if (this.f14463e && E() && this.f14466i.getCurrentPosition() > 0 && this.f14465h != 3) {
            ya.a0.m("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.f14466i;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                za.i.h("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.f14466i.start();
            int currentPosition = this.f14466i.getCurrentPosition();
            ua.j.C.f35267k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (E() && this.f14466i.getCurrentPosition() == currentPosition) {
                ua.j.C.f35267k.getClass();
                if (System.currentTimeMillis() - jCurrentTimeMillis > 250) {
                    break;
                }
            }
            this.f14466i.pause();
            E1();
        }
        int i10 = this.f14467k;
        int i11 = this.f14468l;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 40 + String.valueOf(i11).length());
        sb2.append("AdMediaPlayerView stream dimensions: ");
        sb2.append(i10);
        sb2.append(" x ");
        sb2.append(i11);
        za.i.g(sb2.toString());
        if (this.f14465h == 3) {
            h();
        }
        E1();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i10) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        ya.a0.m("AdMediaPlayerView surface created");
        C();
        ya.f0.f37440l.post(new lx(this, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ya.a0.m("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f14466i;
        if (mediaPlayer != null && this.f14472p == 0) {
            this.f14472p = mediaPlayer.getCurrentPosition();
        }
        xx xxVar = this.f14470n;
        if (xxVar != null) {
            xxVar.c();
        }
        ya.f0.f37440l.post(new lx(this, 2));
        D(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i10) throws IllegalStateException {
        ya.a0.m("AdMediaPlayerView surface changed");
        int i11 = this.f14465h;
        boolean z3 = false;
        if (this.f14467k == i4 && this.f14468l == i10) {
            z3 = true;
        }
        if (this.f14466i != null && i11 == 3 && z3) {
            int i12 = this.f14472p;
            if (i12 != 0) {
                q(i12);
            }
            h();
        }
        xx xxVar = this.f14470n;
        if (xxVar != null) {
            xxVar.b(i4, i10);
        }
        ya.f0.f37440l.post(new mx(this, i4, i10, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f14462d.c(this);
        this.f15132a.a(surfaceTexture, this.f14473q);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i4, int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 35 + String.valueOf(i10).length());
        sb2.append("AdMediaPlayerView size changed: ");
        sb2.append(i4);
        sb2.append(" x ");
        sb2.append(i10);
        ya.a0.m(sb2.toString());
        this.f14467k = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f14468l = videoHeight;
        if (this.f14467k == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 47);
        sb2.append("AdMediaPlayerView window visibility changed to ");
        sb2.append(i4);
        ya.a0.m(sb2.toString());
        ya.f0.f37440l.post(new b4.a(this, i4, 5));
        super.onWindowVisibilityChanged(i4);
    }

    @Override // com.google.android.gms.internal.ads.px
    public final int p() {
        if (E()) {
            return this.f14466i.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void q(int i4) throws IllegalStateException {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 23);
        sb2.append("AdMediaPlayerView seek ");
        sb2.append(i4);
        ya.a0.m(sb2.toString());
        if (!E()) {
            this.f14472p = i4;
        } else {
            this.f14466i.seekTo(i4);
            this.f14472p = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void r(float f10, float f11) {
        xx xxVar = this.f14470n;
        if (xxVar != null) {
            xxVar.d(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final int s() {
        MediaPlayer mediaPlayer = this.f14466i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final int t() {
        MediaPlayer mediaPlayer = this.f14466i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // android.view.View
    public final String toString() {
        String name = nx.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return r5.c.m(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.px
    public final long u() {
        if (this.f14475s != null) {
            return (w() * this.f14469m) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final long v() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final long w() {
        if (this.f14475s != null) {
            return o() * this.f14475s.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final int x() {
        if (Build.VERSION.SDK_INT < 26 || !E()) {
            return -1;
        }
        return this.f14466i.getMetrics().getInt("android.media.mediaplayer.dropped");
    }
}
