package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bp implements Executor {
    public static final bp f;
    public static final /* synthetic */ bp[] g;

    static {
        bp bpVar = new bp("INSTANCE", 0);
        f = bpVar;
        g = new bp[]{bpVar};
    }

    public static bp valueOf(String str) {
        return (bp) Enum.valueOf(bp.class, str);
    }

    public static bp[] values() {
        return (bp[]) g.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
