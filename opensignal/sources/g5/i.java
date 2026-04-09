package g5;

import androidx.media3.exoplayer.dash.DashMediaSource;
import java.io.IOException;
import r5.q;

/* loaded from: classes.dex */
public final class i implements r5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DashMediaSource f9359a;

    public i(DashMediaSource dashMediaSource) {
        this.f9359a = dashMediaSource;
    }

    @Override // r5.i
    public final r5.j q(r5.k kVar, long j, long j7, IOException iOException, int i10) {
        return this.f9359a.onManifestLoadError((q) kVar, j, j7, iOException, i10);
    }

    @Override // r5.i
    public final void r(r5.k kVar, long j, long j7) {
        this.f9359a.onManifestLoadCompleted((q) kVar, j, j7);
    }

    @Override // r5.i
    public final void s(r5.k kVar, long j, long j7, boolean z10) {
        this.f9359a.onLoadCanceled((q) kVar, j, j7);
    }
}
