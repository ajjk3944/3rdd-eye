package L9;

import java.util.concurrent.Executor;

/* compiled from: Tasks.kt */
/* loaded from: classes3.dex */
public final class a implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4104b = new a();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
