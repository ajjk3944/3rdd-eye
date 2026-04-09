package J4;

import java.util.concurrent.Executor;

/* compiled from: FirebaseExecutors.java */
/* loaded from: classes2.dex */
public enum n implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
