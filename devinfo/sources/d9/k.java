package d9;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import java.io.IOException;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: i, reason: collision with root package name */
    public final MediaPlayer f22067i;
    public final j j;

    /* renamed from: k, reason: collision with root package name */
    public e9.a f22068k;

    /* renamed from: l, reason: collision with root package name */
    public Surface f22069l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f22070m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f22071n;

    public k() {
        MediaPlayer mediaPlayer;
        this.f22065h = false;
        Object obj = new Object();
        this.f22070m = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f22067i = mediaPlayer;
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Class<?> cls = Class.forName("android.media.MediaTimeProvider");
                Class<?> cls2 = Class.forName("android.media.SubtitleController");
                Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
                Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(v8.a.f35974a, null, null);
                Field declaredField = cls2.getDeclaredField("mHandler");
                declaredField.setAccessible(true);
                try {
                    declaredField.set(objNewInstance, new Handler());
                    declaredField.setAccessible(false);
                    mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
                } catch (Throwable th2) {
                    try {
                        pk.a.n("CSJ_VIDEO", "subtitleInstance error: ", th2);
                        declaredField.setAccessible(false);
                    } catch (Throwable th3) {
                        declaredField.setAccessible(false);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                pk.a.n("CSJ_VIDEO", "setSubtitleController error: ", th4);
            }
        }
        try {
            this.f22067i.setAudioStreamType(3);
        } catch (Throwable th5) {
            pk.a.n("CSJ_VIDEO", "setAudioStreamType error: ", th5);
        }
        this.j = new j(this);
        d();
    }

    public final void b(long j, int i4) throws IllegalStateException {
        int i10 = Build.VERSION.SDK_INT;
        MediaPlayer mediaPlayer = this.f22067i;
        if (i10 < 26) {
            mediaPlayer.seekTo((int) j);
            return;
        }
        if (i4 == 0) {
            mediaPlayer.seekTo((int) j, 0);
            return;
        }
        if (i4 == 1) {
            mediaPlayer.seekTo((int) j, 1);
            return;
        }
        if (i4 == 2) {
            mediaPlayer.seekTo((int) j, 2);
        } else if (i4 != 3) {
            mediaPlayer.seekTo((int) j);
        } else {
            mediaPlayer.seekTo((int) j, 3);
        }
    }

    public final void c(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme);
        MediaPlayer mediaPlayer = this.f22067i;
        if (zIsEmpty || !scheme.equalsIgnoreCase("file")) {
            mediaPlayer.setDataSource(str);
        } else {
            mediaPlayer.setDataSource(uri.getPath());
        }
    }

    public final void d() {
        MediaPlayer mediaPlayer = this.f22067i;
        j jVar = this.j;
        mediaPlayer.setOnPreparedListener(jVar);
        mediaPlayer.setOnBufferingUpdateListener(jVar);
        mediaPlayer.setOnCompletionListener(jVar);
        mediaPlayer.setOnSeekCompleteListener(jVar);
        mediaPlayer.setOnVideoSizeChangedListener(jVar);
        mediaPlayer.setOnErrorListener(jVar);
        mediaPlayer.setOnInfoListener(jVar);
    }

    public final void e() {
        synchronized (this.f22070m) {
            try {
                if (!this.f22071n) {
                    this.f22067i.release();
                    this.f22071n = true;
                    try {
                        Surface surface = this.f22069l;
                        if (surface != null) {
                            surface.release();
                            this.f22069l = null;
                        }
                    } catch (Throwable unused) {
                    }
                    e9.a aVar = this.f22068k;
                    if (aVar != null) {
                        try {
                            aVar.close();
                        } catch (Throwable th2) {
                            pk.a.n("CSJ_VIDEO", "releaseMediaDataSource error: ", th2);
                        }
                        this.f22068k = null;
                    }
                    a();
                    d();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        try {
            Surface surface = this.f22069l;
            if (surface != null) {
                surface.release();
                this.f22069l = null;
            }
        } catch (Throwable unused) {
        }
    }
}
