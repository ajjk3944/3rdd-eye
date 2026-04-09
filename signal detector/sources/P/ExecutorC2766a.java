package p;

import java.util.concurrent.Executor;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC2766a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22728a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f22728a) {
            case 0:
                C2767b.F().i.f22731j.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
