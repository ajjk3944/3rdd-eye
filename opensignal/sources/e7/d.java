package e7;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7963a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7963a) {
            case 0:
                runnable.run();
                break;
            default:
                q.a.X().f20652i.j.execute(runnable);
                break;
        }
    }
}
