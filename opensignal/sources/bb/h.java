package bb;

import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements ba.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ba.h f2529b;

    public /* synthetic */ h(ba.h hVar, int i10) {
        this.f2528a = i10;
        this.f2529b = hVar;
    }

    @Override // ba.i
    public final ba.h a(n0 n0Var) {
        switch (this.f2528a) {
            case 0:
                return DashMediaSource.Factory.lambda$setDrmSessionManager$0(this.f2529b, n0Var);
            default:
                return HlsMediaSource.Factory.lambda$setDrmSessionManager$0(this.f2529b, n0Var);
        }
    }
}
