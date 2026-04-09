package A0;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f86b;

    public /* synthetic */ i(int i, Runnable runnable) {
        this.f85a = i;
        this.f86b = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        switch (this.f85a) {
            case 0:
                this.f86b.run();
                break;
            default:
                this.f86b.run();
                break;
        }
    }
}
