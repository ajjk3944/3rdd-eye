package l5;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ne.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14682a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14683d;

    public /* synthetic */ b(int i10, int i11) {
        this.f14682a = i11;
        this.f14683d = i10;
    }

    @Override // ne.n
    public final Object get() {
        switch (this.f14682a) {
            case 0:
                return new HandlerThread(c.p(this.f14683d, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.p(this.f14683d, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
