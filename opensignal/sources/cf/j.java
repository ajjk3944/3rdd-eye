package cf;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public enum j implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
