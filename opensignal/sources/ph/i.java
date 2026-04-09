package ph;

import androidx.lifecycle.o;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Player$Listener;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.d1;
import java.io.Serializable;
import oh.n;
import oh.p;
import qb.v;
import rb.r;

/* loaded from: classes.dex */
public final class i implements n, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final o f20572a;

    /* JADX WARN: Multi-variable type inference failed */
    public i(ExoPlayer exoPlayer, p pVar) {
        this.f20572a = (o) exoPlayer;
    }

    @Override // oh.n
    public final void a(Serializable serializable) throws ClassNotFoundException {
        int iZ = p.z();
        o oVar = this.f20572a;
        if (iZ < 2016000) {
            br.l.c(serializable, "null cannot be cast to non-null type com.google.android.exoplayer2.Player.EventListener");
            oVar.L((d1) serializable);
        } else {
            br.l.c(serializable, "null cannot be cast to non-null type com.google.android.exoplayer2.Player.Listener");
            oVar.c0((Player$Listener) serializable);
        }
    }

    @Override // oh.n
    public final void b(Serializable serializable) throws ClassNotFoundException {
        int iZ = p.z();
        o oVar = this.f20572a;
        if (iZ >= 2014000) {
            br.l.c(serializable, "null cannot be cast to non-null type com.google.android.exoplayer2.Player.Listener");
            oVar.c0((Player$Listener) serializable);
        } else {
            br.l.c(serializable, "null cannot be cast to non-null type com.google.android.exoplayer2.video.VideoListener");
            ((SimpleExoPlayer) oVar).D.add((r) serializable);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.o, com.google.android.exoplayer2.ExoPlayer] */
    @Override // oh.n
    public final void c(Serializable serializable) {
        br.l.c(serializable, "null cannot be cast to non-null type com.opensignal.sdk.common.measurements.videotest.exoplayer.ExoplayerMediaSource");
        this.f20572a.X(((f) serializable).f20561a);
    }

    @Override // oh.n
    public final void clearVideoSurface() {
        o oVar = this.f20572a;
        if (oVar instanceof SimpleExoPlayer) {
            ((SimpleExoPlayer) oVar).clearVideoSurface();
        } else {
            oVar.clearVideoSurface();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.o, com.google.android.exoplayer2.ExoPlayer] */
    @Override // oh.n
    public final void d(Serializable serializable) {
        if (serializable != null) {
            ?? r02 = this.f20572a;
            if (!(r02 instanceof SimpleExoPlayer)) {
                r02.addAnalyticsListener((AnalyticsListener) serializable);
            } else {
                ((SimpleExoPlayer) r02).I.addListener((AnalyticsListener) serializable);
            }
        }
    }

    @Override // oh.n
    public final int getBufferedPercentage() {
        o oVar = this.f20572a;
        long bufferedPosition = oVar.getBufferedPosition();
        long duration = oVar.getDuration();
        if (bufferedPosition == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return v.i((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // oh.n
    public final long getCurrentPosition() {
        return this.f20572a.getCurrentPosition();
    }

    @Override // oh.n
    public final long getDuration() {
        return this.f20572a.getDuration();
    }

    @Override // oh.n
    public final boolean isCurrentWindowLive() {
        return this.f20572a.isCurrentWindowLive();
    }

    @Override // oh.n
    public final void release() {
        this.f20572a.release();
    }

    @Override // oh.n
    public final void setPlayWhenReady(boolean z10) {
        this.f20572a.setPlayWhenReady(z10);
    }

    @Override // oh.n
    public final void setVolume(float f10) {
        o oVar = this.f20572a;
        if (oVar instanceof SimpleExoPlayer) {
            ((SimpleExoPlayer) oVar).setVolume(f10);
        } else {
            oVar.setVolume(f10);
        }
    }
}
