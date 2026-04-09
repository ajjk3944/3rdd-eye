package bf;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o implements bg.c, bg.b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2730a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f2731b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f2732c;

    public o(Executor executor) {
        this.f2732c = executor;
    }

    public final synchronized void a(Executor executor, bg.a aVar) {
        try {
            executor.getClass();
            if (!this.f2730a.containsKey(se.b.class)) {
                this.f2730a.put(se.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f2730a.get(se.b.class)).put(aVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
