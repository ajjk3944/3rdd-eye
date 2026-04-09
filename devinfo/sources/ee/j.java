package ee;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final j f23422a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j[] f23423b;

    static {
        j jVar = new j("INSTANCE", 0);
        f23422a = jVar;
        f23423b = new j[]{jVar};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f23423b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
