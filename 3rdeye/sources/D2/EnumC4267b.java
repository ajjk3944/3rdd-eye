package d2;

import java.util.concurrent.Executor;

/* compiled from: DirectExecutor.java */
/* renamed from: d2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4267b implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
