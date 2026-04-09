package P2;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import t4.C5606d;

/* compiled from: DiskCacheWriteLocker.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f10561a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final C0120b f10562b = new C0120b();

    /* compiled from: DiskCacheWriteLocker.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ReentrantLock f10563a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        public int f10564b;
    }

    /* compiled from: DiskCacheWriteLocker.java */
    /* renamed from: P2.b$b, reason: collision with other inner class name */
    public static class C0120b {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayDeque f10565a = new ArrayDeque();

        public final a a() {
            a aVar;
            synchronized (this.f10565a) {
                aVar = (a) this.f10565a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        public final void b(a aVar) {
            synchronized (this.f10565a) {
                try {
                    if (this.f10565a.size() < 10) {
                        this.f10565a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                Object obj = this.f10561a.get(str);
                C5606d.l(obj, "Argument must not be null");
                aVar = (a) obj;
                int i = aVar.f10564b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f10564b);
                }
                int i10 = i - 1;
                aVar.f10564b = i10;
                if (i10 == 0) {
                    a aVar2 = (a) this.f10561a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f10562b.b(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f10563a.unlock();
    }
}
