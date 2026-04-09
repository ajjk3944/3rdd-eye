package androidx.work;

import java.util.concurrent.Executor;

/* compiled from: DirectExecutor.kt */
/* loaded from: classes.dex */
public enum f implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        kotlin.jvm.internal.l.f(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
