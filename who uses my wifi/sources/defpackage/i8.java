package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class i8 implements Executor {
    public final /* synthetic */ int f;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f) {
            case 0:
                j8.T().D.E.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
