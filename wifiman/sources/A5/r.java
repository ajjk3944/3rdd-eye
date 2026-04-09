package A5;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
enum r implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g.a().f328a.post(runnable);
    }
}
