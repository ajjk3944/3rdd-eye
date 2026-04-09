package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public abstract class j1 {
    public static final Executor a(CoroutineDispatcher coroutineDispatcher) {
        Executor executorB0;
        ExecutorCoroutineDispatcher executorCoroutineDispatcher = coroutineDispatcher instanceof ExecutorCoroutineDispatcher ? (ExecutorCoroutineDispatcher) coroutineDispatcher : null;
        return (executorCoroutineDispatcher == null || (executorB0 = executorCoroutineDispatcher.b0()) == null) ? new v0(coroutineDispatcher) : executorB0;
    }

    public static final ExecutorCoroutineDispatcher b(ExecutorService executorService) {
        return new i1(executorService);
    }
}
