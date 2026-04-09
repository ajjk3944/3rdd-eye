package Lg;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public interface i {

    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        private static Ej.b f11708c = Ej.c.i(a.class);

        /* renamed from: a, reason: collision with root package name */
        private final String f11709a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentMap f11710b = new ConcurrentHashMap(50);

        public a(String str) {
            this.f11709a = str;
        }

        public void a() {
            Collection<Semaphore> collectionValues = this.f11710b.values();
            for (Semaphore semaphore : collectionValues) {
                semaphore.release();
                collectionValues.remove(semaphore);
            }
        }

        public void b(long j10) throws InterruptedException {
            Thread threadCurrentThread = Thread.currentThread();
            if (((Semaphore) this.f11710b.get(threadCurrentThread)) == null) {
                Semaphore semaphore = new Semaphore(1, true);
                semaphore.drainPermits();
                this.f11710b.putIfAbsent(threadCurrentThread, semaphore);
            }
            try {
                ((Semaphore) this.f11710b.get(threadCurrentThread)).tryAcquire(j10, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                f11708c.s("Exception ", e10);
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(1000);
            sb2.append("Semaphore: ");
            sb2.append(this.f11709a);
            if (this.f11710b.size() == 0) {
                sb2.append(" no semaphores.");
            } else {
                sb2.append(" semaphores:\n");
                for (Map.Entry entry : this.f11710b.entrySet()) {
                    sb2.append("\tThread: ");
                    sb2.append(((Thread) entry.getKey()).getName());
                    sb2.append(' ');
                    sb2.append(entry.getValue());
                    sb2.append('\n');
                }
            }
            return sb2.toString();
        }
    }

    public static class b extends ReentrantLock implements i {

        /* renamed from: f, reason: collision with root package name */
        private static Ej.b f11711f = Ej.c.i(b.class);

        /* renamed from: a, reason: collision with root package name */
        private volatile l f11712a = null;

        /* renamed from: b, reason: collision with root package name */
        protected volatile Mg.a f11713b = null;

        /* renamed from: c, reason: collision with root package name */
        protected volatile javax.jmdns.impl.constants.g f11714c = javax.jmdns.impl.constants.g.PROBING_1;

        /* renamed from: d, reason: collision with root package name */
        private final a f11715d = new a("Announce");

        /* renamed from: e, reason: collision with root package name */
        private final a f11716e = new a("Cancel");

        private boolean F() {
            return this.f11714c.isCanceled() || this.f11714c.isCanceling();
        }

        private boolean J() {
            return this.f11714c.isClosed() || this.f11714c.isClosing();
        }

        protected void B(javax.jmdns.impl.constants.g gVar) {
            lock();
            try {
                this.f11714c = gVar;
                if (g()) {
                    this.f11715d.a();
                }
                if (m()) {
                    this.f11716e.a();
                    this.f11715d.a();
                }
                unlock();
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        protected void C(Mg.a aVar) {
            this.f11713b = aVar;
        }

        public boolean E(long j10) throws InterruptedException {
            if (!m()) {
                this.f11716e.b(j10);
            }
            if (!m()) {
                this.f11716e.b(10L);
                if (!m() && !J()) {
                    f11711f.a("Wait for canceled timed out: {}", this);
                }
            }
            return m();
        }

        public void a(Mg.a aVar, javax.jmdns.impl.constants.g gVar) {
            if (this.f11713b == null && this.f11714c == gVar) {
                lock();
                try {
                    if (this.f11713b == null && this.f11714c == gVar) {
                        C(aVar);
                    }
                } finally {
                    unlock();
                }
            }
        }

        public boolean c() {
            boolean z10 = false;
            if (!F()) {
                lock();
                try {
                    if (!F()) {
                        B(javax.jmdns.impl.constants.g.CANCELING_1);
                        C(null);
                        z10 = true;
                    }
                } finally {
                    unlock();
                }
            }
            return z10;
        }

        public l d() {
            return this.f11712a;
        }

        public boolean g() {
            return this.f11714c.isAnnounced();
        }

        @Override // Lg.i
        public boolean h(Mg.a aVar) {
            if (this.f11713b != aVar) {
                return true;
            }
            lock();
            try {
                if (this.f11713b == aVar) {
                    B(this.f11714c.advance());
                } else {
                    f11711f.j("Trying to advance state whhen not the owner. owner: {} perpetrator: {}", this.f11713b, aVar);
                }
                unlock();
                return true;
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        public boolean j() {
            return this.f11714c.isAnnouncing();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean l(Mg.a r2, javax.jmdns.impl.constants.g r3) {
            /*
                r1 = this;
                r1.lock()
                Mg.a r0 = r1.f11713b     // Catch: java.lang.Throwable -> Ld
                if (r0 != r2) goto Lf
                javax.jmdns.impl.constants.g r2 = r1.f11714c     // Catch: java.lang.Throwable -> Ld
                if (r2 != r3) goto Lf
                r2 = 1
                goto L10
            Ld:
                r2 = move-exception
                goto L14
            Lf:
                r2 = 0
            L10:
                r1.unlock()
                return r2
            L14:
                r1.unlock()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: Lg.i.b.l(Mg.a, javax.jmdns.impl.constants.g):boolean");
        }

        public boolean m() {
            return this.f11714c.isCanceled();
        }

        public boolean n() {
            return this.f11714c.isCanceling();
        }

        public boolean o() {
            return this.f11714c.isClosed();
        }

        public boolean p() {
            return this.f11714c.isClosing();
        }

        public boolean r() {
            return this.f11714c.isProbing();
        }

        public boolean s() {
            lock();
            try {
                B(javax.jmdns.impl.constants.g.PROBING_1);
                C(null);
                unlock();
                return false;
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        public void t(Mg.a aVar) {
            if (this.f11713b == aVar) {
                lock();
                try {
                    if (this.f11713b == aVar) {
                        C(null);
                    }
                } finally {
                    unlock();
                }
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock
        public String toString() {
            String str;
            String str2 = "NO DNS";
            try {
                StringBuilder sb2 = new StringBuilder();
                if (this.f11712a != null) {
                    str = "DNS: " + this.f11712a.G0() + " [" + this.f11712a.D0() + "]";
                } else {
                    str = "NO DNS";
                }
                sb2.append(str);
                sb2.append(" state: ");
                sb2.append(this.f11714c);
                sb2.append(" task: ");
                sb2.append(this.f11713b);
                return sb2.toString();
            } catch (IOException unused) {
                StringBuilder sb3 = new StringBuilder();
                if (this.f11712a != null) {
                    str2 = "DNS: " + this.f11712a.G0();
                }
                sb3.append(str2);
                sb3.append(" state: ");
                sb3.append(this.f11714c);
                sb3.append(" task: ");
                sb3.append(this.f11713b);
                return sb3.toString();
            }
        }

        public boolean v() {
            if (F()) {
                return true;
            }
            lock();
            try {
                if (!F()) {
                    B(this.f11714c.revert());
                    C(null);
                }
                return true;
            } finally {
                unlock();
            }
        }

        protected void y(l lVar) {
            this.f11712a = lVar;
        }
    }

    boolean h(Mg.a aVar);
}
