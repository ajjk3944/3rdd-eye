package rh;

import androidx.media3.common.q0;
import br.l;
import d5.z;
import java.io.Serializable;
import o5.b0;
import oh.n;

/* loaded from: classes.dex */
public final class e implements n, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final z f21536a;

    public e(z zVar) {
        this.f21536a = zVar;
    }

    @Override // oh.n
    public final void a(Serializable serializable) {
        l.c(serializable, "null cannot be cast to non-null type androidx.media3.common.Player.Listener");
        this.f21536a.I.a((q0) serializable);
    }

    @Override // oh.n
    public final void b(Serializable serializable) {
        l.c(serializable, "null cannot be cast to non-null type androidx.media3.common.Player.Listener");
        this.f21536a.I.a((q0) serializable);
    }

    @Override // oh.n
    public final void c(Serializable serializable) {
        l.c(serializable, "null cannot be cast to non-null type com.opensignal.sdk.common.measurements.videotest.media3.Media3MediaSource");
        b0 b0Var = ((c) serializable).f21534a;
        z zVar = this.f21536a;
        zVar.setMediaSource(b0Var);
        zVar.prepare();
    }

    @Override // oh.n
    public final void clearVideoSurface() {
        this.f21536a.clearVideoSurface();
    }

    @Override // oh.n
    public final void d(Serializable serializable) {
        if (serializable != null) {
            this.f21536a.O.addListener((e5.c) serializable);
        }
    }

    @Override // oh.n
    public final int getBufferedPercentage() {
        return this.f21536a.getBufferedPercentage();
    }

    @Override // oh.n
    public final long getCurrentPosition() {
        return this.f21536a.getCurrentPosition();
    }

    @Override // oh.n
    public final long getDuration() {
        return this.f21536a.getDuration();
    }

    @Override // oh.n
    public final boolean isCurrentWindowLive() {
        return this.f21536a.isCurrentMediaItemLive();
    }

    @Override // oh.n
    public final void release() {
        this.f21536a.release();
    }

    @Override // oh.n
    public final void setPlayWhenReady(boolean z10) {
        this.f21536a.setPlayWhenReady(z10);
    }

    @Override // oh.n
    public final void setVolume(float f10) {
        this.f21536a.setVolume(f10);
    }
}
