package y3;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: ExecutionModule_ExecutorFactory.java */
/* loaded from: classes.dex */
public final class n implements A3.b<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final n f48089a = new n();
    }

    @Override // a9.InterfaceC1676a
    public final Object get() {
        return new p(Executors.newSingleThreadExecutor());
    }
}
