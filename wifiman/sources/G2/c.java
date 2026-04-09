package G2;

import W2.k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f6823a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final b f6824b = new b();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Lock f6825a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        int f6826b;

        a() {
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue f6827a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVar;
            synchronized (this.f6827a) {
                aVar = (a) this.f6827a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        void b(a aVar) {
            synchronized (this.f6827a) {
                try {
                    if (this.f6827a.size() < 10) {
                        this.f6827a.offer(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                aVarA = (a) this.f6823a.get(str);
                if (aVarA == null) {
                    aVarA = this.f6824b.a();
                    this.f6823a.put(str, aVarA);
                }
                aVarA.f6826b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVarA.f6825a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.d(this.f6823a.get(str));
                int i10 = aVar.f6826b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f6826b);
                }
                int i11 = i10 - 1;
                aVar.f6826b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f6823a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f6824b.b(aVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f6825a.unlock();
    }
}
