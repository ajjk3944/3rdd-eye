package Y;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class f implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f4203a;

    public f(h hVar) {
        this.f4203a = hVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) throws SecurityException, IllegalArgumentException {
        this.f4203a.f4209b.run();
    }
}
