package V1;

import android.media.MediaPlayer;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class n implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3849a;

    public n(o oVar) {
        this.f3849a = new WeakReference(oVar);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        h hVar;
        try {
            o oVar = (o) this.f3849a.get();
            if (oVar == null || (hVar = oVar.f3852c) == null) {
                return;
            }
            hVar.emc(oVar, i);
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        l lVar;
        try {
            o oVar = (o) this.f3849a.get();
            if (oVar == null || (lVar = oVar.f3851b) == null) {
                return;
            }
            lVar.emc(oVar);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    @Override // android.media.MediaPlayer.OnErrorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onError(android.media.MediaPlayer r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 0
            java.lang.ref.WeakReference r0 = r3.f3849a     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1c
            V1.o r0 = (V1.o) r0     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1c
            r1 = 1
            V1.j r2 = r0.f3855f     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L18
            boolean r5 = r2.emc(r0, r5, r6)     // Catch: java.lang.Throwable -> L18
            if (r5 == 0) goto L18
            r5 = r1
            goto L19
        L18:
            r5 = r4
        L19:
            if (r5 == 0) goto L1c
            return r1
        L1c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.n.onError(android.media.MediaPlayer, int, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    @Override // android.media.MediaPlayer.OnInfoListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInfo(android.media.MediaPlayer r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 0
            java.lang.ref.WeakReference r0 = r3.f3849a     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1c
            V1.o r0 = (V1.o) r0     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1c
            r1 = 1
            V1.g r2 = r0.f3856g     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L18
            boolean r5 = r2.ypw(r0, r5, r6)     // Catch: java.lang.Throwable -> L18
            if (r5 == 0) goto L18
            r5 = r1
            goto L19
        L18:
            r5 = r4
        L19:
            if (r5 == 0) goto L1c
            return r1
        L1c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.n.onInfo(android.media.MediaPlayer, int, int):boolean");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        f fVar;
        try {
            o oVar = (o) this.f3849a.get();
            if (oVar == null || (fVar = oVar.f3850a) == null) {
                return;
            }
            fVar.ypw(oVar);
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        k kVar;
        try {
            o oVar = (o) this.f3849a.get();
            if (oVar == null || (kVar = oVar.f3853d) == null) {
                return;
            }
            kVar.xq(oVar);
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i3) {
        i iVar;
        try {
            o oVar = (o) this.f3849a.get();
            if (oVar == null || (iVar = oVar.f3854e) == null) {
                return;
            }
            iVar.emc(oVar, i, i3, 1, 1);
        } catch (Throwable unused) {
        }
    }
}
