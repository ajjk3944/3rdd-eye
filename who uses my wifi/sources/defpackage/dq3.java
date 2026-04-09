package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dq3 implements Executor {
    public static final dq3 f;
    public static final /* synthetic */ dq3[] g;

    static {
        dq3 dq3Var = new dq3("INSTANCE", 0);
        f = dq3Var;
        g = new dq3[]{dq3Var};
    }

    public static dq3[] values() {
        return (dq3[]) g.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
