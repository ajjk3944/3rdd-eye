package d9;

import android.media.MediaPlayer;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f22066a;

    public j(k kVar) {
        this.f22066a = new WeakReference(kVar);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i4) {
        try {
            k kVar = (k) this.f22066a.get();
            if (kVar != null) {
                try {
                    d dVar = kVar.f22061c;
                    if (dVar != null) {
                        dVar.ouw(kVar, i4);
                    }
                } catch (Throwable th2) {
                    pk.a.n("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnBufferingUpdate error: ", th2);
                }
            }
        } catch (Throwable th3) {
            pk.a.n("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onBufferingUpdate error: ", th3);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        try {
            k kVar = (k) this.f22066a.get();
            if (kVar != null) {
                try {
                    f fVar = kVar.f22060b;
                    if (fVar != null) {
                        fVar.bly();
                    }
                } catch (Throwable th2) {
                    pk.a.n("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnCompletion error: ", th2);
                }
            }
        } catch (Throwable th3) {
            pk.a.n("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onCompletion error: ", th3);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i4, int i10) {
        boolean z3;
        c cVar;
        try {
            pk.a.y("CSJ_VIDEO", "onError: ", Integer.valueOf(i4), Integer.valueOf(i10));
            k kVar = (k) this.f22066a.get();
            if (kVar != null) {
                try {
                    cVar = kVar.f22064f;
                } catch (Throwable th2) {
                    pk.a.n("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnError error: ", th2);
                }
                if (cVar != null) {
                    cVar.ouw(i4, i10);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th3) {
            pk.a.n("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onError error: ", th3);
            return false;
        }
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i4, int i10) {
        try {
            pk.a.x("CSJ_VIDEO", "onInfo: ");
            k kVar = (k) this.f22066a.get();
            if (kVar != null) {
                try {
                    g gVar = kVar.g;
                    if (gVar != null) {
                        gVar.ouw(kVar, i4, i10);
                    }
                } catch (Throwable th2) {
                    pk.a.n("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnInfo error: ", th2);
                }
            }
            return false;
        } catch (Throwable th3) {
            pk.a.n("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onInfo error: ", th3);
            return false;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            k kVar = (k) this.f22066a.get();
            if (kVar != null) {
                try {
                    a aVar = kVar.f22059a;
                    if (aVar != null) {
                        aVar.tlj();
                    }
                } catch (Throwable th2) {
                    pk.a.n("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnPrepared error: ", th2);
                }
            }
        } catch (Throwable th3) {
            pk.a.n("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onPrepared error: ", th3);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        try {
            k kVar = (k) this.f22066a.get();
            if (kVar != null) {
                try {
                    b bVar = kVar.f22062d;
                    if (bVar != null) {
                        bVar.cf();
                    }
                } catch (Throwable th2) {
                    pk.a.n("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnSeekComplete error: ", th2);
                }
            }
        } catch (Throwable th3) {
            pk.a.n("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onSeekComplete error: ", th3);
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i4, int i10) {
        try {
            k kVar = (k) this.f22066a.get();
            if (kVar != null) {
                try {
                    e eVar = kVar.f22063e;
                    if (eVar != null) {
                        eVar.vt(i4, i10);
                    }
                } catch (Throwable th2) {
                    pk.a.n("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnVideoSizeChanged error: ", th2);
                }
            }
        } catch (Throwable th3) {
            pk.a.n("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onVideoSizeChanged error: ", th3);
        }
    }
}
