package zg;

import gg.x;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zg.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8756i {
    public static void a(Dj.b bVar, AtomicInteger atomicInteger, C8750c c8750c) {
        if (atomicInteger.getAndIncrement() == 0) {
            c8750c.j(bVar);
        }
    }

    public static void b(x xVar, AtomicInteger atomicInteger, C8750c c8750c) {
        if (atomicInteger.getAndIncrement() == 0) {
            c8750c.n(xVar);
        }
    }

    public static void c(Dj.b bVar, Throwable th2, AtomicInteger atomicInteger, C8750c c8750c) {
        if (c8750c.g(th2) && atomicInteger.getAndIncrement() == 0) {
            c8750c.j(bVar);
        }
    }

    public static void d(x xVar, Throwable th2, AtomicInteger atomicInteger, C8750c c8750c) {
        if (c8750c.g(th2) && atomicInteger.getAndIncrement() == 0) {
            c8750c.n(xVar);
        }
    }

    public static void e(x xVar, Object obj, AtomicInteger atomicInteger, C8750c c8750c) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            xVar.h(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                c8750c.n(xVar);
            }
        }
    }

    public static boolean f(Dj.b bVar, Object obj, AtomicInteger atomicInteger, C8750c c8750c) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bVar.h(obj);
            if (atomicInteger.decrementAndGet() == 0) {
                return true;
            }
            c8750c.j(bVar);
        }
        return false;
    }
}
