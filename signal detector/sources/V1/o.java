package V1;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import java.io.IOException;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    public f f3850a;

    /* renamed from: b, reason: collision with root package name */
    public l f3851b;

    /* renamed from: c, reason: collision with root package name */
    public h f3852c;

    /* renamed from: d, reason: collision with root package name */
    public k f3853d;

    /* renamed from: e, reason: collision with root package name */
    public i f3854e;

    /* renamed from: f, reason: collision with root package name */
    public j f3855f;

    /* renamed from: g, reason: collision with root package name */
    public g f3856g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3857h = false;
    public final MediaPlayer i;

    /* renamed from: j, reason: collision with root package name */
    public final n f3858j;

    /* renamed from: k, reason: collision with root package name */
    public S1.a f3859k;

    /* renamed from: l, reason: collision with root package name */
    public Surface f3860l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f3861m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f3862n;

    public o() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f3861m = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.i = mediaPlayer;
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Class<?> cls = Class.forName("android.media.MediaTimeProvider");
                Class<?> cls2 = Class.forName("android.media.SubtitleController");
                Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
                Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(J1.c.f2036a, null, null);
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
        try {
            this.i.setAudioStreamType(3);
        } catch (Throwable unused3) {
        }
        this.f3858j = new n(this);
        a();
    }

    public final void a() {
        MediaPlayer mediaPlayer = this.i;
        n nVar = this.f3858j;
        mediaPlayer.setOnPreparedListener(nVar);
        mediaPlayer.setOnBufferingUpdateListener(nVar);
        mediaPlayer.setOnCompletionListener(nVar);
        mediaPlayer.setOnSeekCompleteListener(nVar);
        mediaPlayer.setOnVideoSizeChangedListener(nVar);
        mediaPlayer.setOnErrorListener(nVar);
        mediaPlayer.setOnInfoListener(nVar);
    }

    public final void b(long j6, int i) throws IllegalStateException {
        int i3 = Build.VERSION.SDK_INT;
        MediaPlayer mediaPlayer = this.i;
        if (i3 < 26) {
            mediaPlayer.seekTo((int) j6);
            return;
        }
        if (i == 0) {
            mediaPlayer.seekTo((int) j6, 0);
            return;
        }
        if (i == 1) {
            mediaPlayer.seekTo((int) j6, 1);
            return;
        }
        if (i == 2) {
            mediaPlayer.seekTo((int) j6, 2);
        } else if (i != 3) {
            mediaPlayer.seekTo((int) j6);
        } else {
            mediaPlayer.seekTo((int) j6, 3);
        }
    }

    public final void c(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme);
        MediaPlayer mediaPlayer = this.i;
        if (zIsEmpty || !scheme.equalsIgnoreCase("file")) {
            mediaPlayer.setDataSource(str);
        } else {
            mediaPlayer.setDataSource(uri.getPath());
        }
    }

    public final void d() {
        this.f3850a = null;
        this.f3852c = null;
        this.f3851b = null;
        this.f3853d = null;
        this.f3854e = null;
        this.f3855f = null;
        this.f3856g = null;
    }

    public final void finalize() throws Throwable {
        super.finalize();
        try {
            Surface surface = this.f3860l;
            if (surface != null) {
                surface.release();
                this.f3860l = null;
            }
        } catch (Throwable unused) {
        }
    }
}
