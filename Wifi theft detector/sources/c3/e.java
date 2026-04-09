package c3;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.emc.emc.emc.xq.xq;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class e extends b {

    /* renamed from: i, reason: collision with root package name */
    public final MediaPlayer f4735i;

    /* renamed from: j, reason: collision with root package name */
    public final a f4736j;

    /* renamed from: k, reason: collision with root package name */
    public z2.a f4737k;

    /* renamed from: l, reason: collision with root package name */
    public Surface f4738l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f4739m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f4740n;

    public static class a implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f4741a;

        public a(e eVar) {
            this.f4741a = new WeakReference(eVar);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            try {
                e eVar = (e) this.f4741a.get();
                if (eVar != null) {
                    eVar.n(i10);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                e eVar = (e) this.f4741a.get();
                if (eVar != null) {
                    eVar.q();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                e eVar = (e) this.f4741a.get();
                if (eVar != null) {
                    return eVar.p(i10, i11);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                e eVar = (e) this.f4741a.get();
                if (eVar != null) {
                    return eVar.s(i10, i11);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                e eVar = (e) this.f4741a.get();
                if (eVar != null) {
                    eVar.r();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                e eVar = (e) this.f4741a.get();
                if (eVar != null) {
                    eVar.l();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                e eVar = (e) this.f4741a.get();
                if (eVar != null) {
                    eVar.o(i10, i11, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public e() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f4739m = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f4735i = mediaPlayer;
        }
        u(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.f4736j = new a(this);
        t();
    }

    @Override // c3.c
    public void a(Surface surface) {
        v();
        this.f4738l = surface;
        this.f4735i.setSurface(surface);
    }

    @Override // c3.c
    public PlaybackParams bw() {
        return this.f4735i.getPlaybackParams();
    }

    @Override // c3.c
    public int cf() {
        MediaPlayer mediaPlayer = this.f4735i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // c3.c
    public void dg(boolean z10) {
        MediaPlayer mediaPlayer = this.f4735i;
        if (mediaPlayer == null) {
            return;
        }
        if (z10) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // c3.c
    public void emc(SurfaceHolder surfaceHolder) {
        synchronized (this.f4739m) {
            try {
                if (!this.f4740n && surfaceHolder != null && surfaceHolder.getSurface() != null && this.f4734h) {
                    this.f4735i.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // c3.c
    public void f(boolean z10) {
        this.f4735i.setLooping(z10);
    }

    public void finalize() throws Throwable {
        super.finalize();
        v();
    }

    @Override // c3.c
    public void g(FileDescriptor fileDescriptor) throws IllegalStateException, IOException, IllegalArgumentException {
        this.f4735i.setDataSource(fileDescriptor);
    }

    @Override // c3.c
    public long gbl() {
        try {
            return this.f4735i.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // c3.c
    public void k(q2.c cVar) {
        this.f4735i.setPlaybackParams(this.f4735i.getPlaybackParams().setSpeed(cVar.a()));
    }

    @Override // c3.c
    public void msw() throws IllegalStateException {
        this.f4735i.pause();
    }

    @Override // c3.c
    public int qh() {
        MediaPlayer mediaPlayer = this.f4735i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // c3.c
    public long ru() {
        try {
            return this.f4735i.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // c3.c
    public void sup() {
        synchronized (this.f4739m) {
            try {
                if (!this.f4740n) {
                    this.f4735i.release();
                    this.f4740n = true;
                    v();
                    w();
                    m();
                    t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c3.c
    public void sz() {
        try {
            this.f4735i.reset();
        } catch (Throwable unused) {
        }
        w();
        m();
        t();
    }

    public final void t() {
        this.f4735i.setOnPreparedListener(this.f4736j);
        this.f4735i.setOnBufferingUpdateListener(this.f4736j);
        this.f4735i.setOnCompletionListener(this.f4736j);
        this.f4735i.setOnSeekCompleteListener(this.f4736j);
        this.f4735i.setOnVideoSizeChangedListener(this.f4736j);
        this.f4735i.setOnErrorListener(this.f4736j);
        this.f4735i.setOnInfoListener(this.f4736j);
    }

    public final void u(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(q2.b.c(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(objNewInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
            } catch (Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // c3.c
    public void uym() throws IllegalStateException {
        this.f4735i.stop();
    }

    public final void v() {
        try {
            Surface surface = this.f4738l;
            if (surface != null) {
                surface.release();
                this.f4738l = null;
            }
        } catch (Throwable unused) {
        }
    }

    public final void w() {
        z2.a aVar = this.f4737k;
        if (aVar != null) {
            try {
                aVar.close();
            } catch (Throwable unused) {
            }
            this.f4737k = null;
        }
    }

    @Override // c3.c
    public void ycc() throws IllegalStateException {
        this.f4735i.start();
    }

    @Override // c3.c
    public void ypw(boolean z10) {
        this.f4735i.setScreenOnWhilePlaying(z10);
    }

    @Override // c3.c
    public void zz() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f4735i;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // c3.c
    public void emc(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
            this.f4735i.setDataSource(uri.getPath());
        } else {
            this.f4735i.setDataSource(str);
        }
    }

    @Override // c3.c
    public synchronized void emc(xq xqVar) {
        this.f4737k = z2.a.e(q2.b.c(), xqVar);
        b3.b.b(xqVar);
        this.f4735i.setDataSource(this.f4737k);
    }

    @Override // c3.c
    public void emc(long j10, int i10) throws IllegalStateException {
        if (Build.VERSION.SDK_INT < 26) {
            this.f4735i.seekTo((int) j10);
            return;
        }
        if (i10 == 0) {
            this.f4735i.seekTo((int) j10, 0);
            return;
        }
        if (i10 == 1) {
            this.f4735i.seekTo((int) j10, 1);
            return;
        }
        if (i10 == 2) {
            this.f4735i.seekTo((int) j10, 2);
        } else if (i10 == 3) {
            this.f4735i.seekTo((int) j10, 3);
        } else {
            this.f4735i.seekTo((int) j10);
        }
    }
}
