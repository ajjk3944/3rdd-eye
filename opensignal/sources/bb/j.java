package bb;

import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.io.IOException;
import pb.g0;
import pb.h0;
import pb.j0;
import pb.q0;

/* loaded from: classes.dex */
public final class j implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DashMediaSource f2531a;

    public j(DashMediaSource dashMediaSource) {
        this.f2531a = dashMediaSource;
    }

    @Override // pb.g0
    public final void K(j0 j0Var, long j, long j7) {
        this.f2531a.onManifestLoadCompleted((q0) j0Var, j, j7);
    }

    @Override // pb.g0
    public final h0 q(j0 j0Var, long j, long j7, IOException iOException, int i10) {
        return this.f2531a.onManifestLoadError((q0) j0Var, j, j7, iOException, i10);
    }

    @Override // pb.g0
    public final void x(j0 j0Var, long j, long j7, boolean z10) {
        this.f2531a.onLoadCanceled((q0) j0Var, j, j7);
    }
}
