package c3;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: c3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4209j {
    static Executor a() {
        return new ExecutorC4213n(Executors.newSingleThreadExecutor());
    }
}
