package ee;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final l f23430a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f23431b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l[] f23432c;

    static {
        l lVar = new l("INSTANCE", 0);
        f23430a = lVar;
        f23432c = new l[]{lVar};
        f23431b = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f23432c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f23431b.post(runnable);
    }
}
