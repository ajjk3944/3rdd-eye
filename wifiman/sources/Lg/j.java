package Lg;

import f.AbstractC5487d;
import java.net.InetAddress;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public interface j {

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        private static volatile b f11721b;

        /* renamed from: c, reason: collision with root package name */
        private static final AtomicReference f11722c = new AtomicReference();

        /* renamed from: a, reason: collision with root package name */
        private final ConcurrentMap f11723a = new ConcurrentHashMap(20);

        private b() {
        }

        public static b b() {
            if (f11721b == null) {
                synchronized (b.class) {
                    try {
                        if (f11721b == null) {
                            f11721b = new b();
                        }
                    } finally {
                    }
                }
            }
            return f11721b;
        }

        protected static j d(l lVar) {
            AbstractC5487d.a(f11722c.get());
            return new a(lVar);
        }

        public void a(l lVar) {
            this.f11723a.remove(lVar);
        }

        public j c(l lVar) {
            j jVar = (j) this.f11723a.get(lVar);
            if (jVar != null) {
                return jVar;
            }
            this.f11723a.putIfAbsent(lVar, d(lVar));
            return (j) this.f11723a.get(lVar);
        }
    }

    void C();

    void J();

    void P(c cVar, InetAddress inetAddress, int i10);

    void S();

    void T();

    void Y();

    void a();

    void g();

    void j(String str);

    void p(q qVar);

    void s();

    void v();

    void y();

    public static final class a implements j {

        /* renamed from: a, reason: collision with root package name */
        private final l f11717a;

        /* renamed from: b, reason: collision with root package name */
        private final Timer f11718b;

        /* renamed from: c, reason: collision with root package name */
        private final Timer f11719c;

        public a(l lVar) {
            this.f11717a = lVar;
            this.f11718b = new C0465a("JmDNS(" + lVar.G0() + ").Timer", true);
            this.f11719c = new C0465a("JmDNS(" + lVar.G0() + ").State.Timer", false);
        }

        @Override // Lg.j
        public void C() {
            new Og.d(this.f11717a).u(this.f11719c);
        }

        @Override // Lg.j
        public void J() {
            new Og.a(this.f11717a).u(this.f11719c);
        }

        @Override // Lg.j
        public void P(c cVar, InetAddress inetAddress, int i10) {
            new Mg.c(this.f11717a, cVar, inetAddress, i10).g(this.f11718b);
        }

        @Override // Lg.j
        public void S() {
            this.f11719c.purge();
        }

        @Override // Lg.j
        public void T() {
            new Og.e(this.f11717a).u(this.f11719c);
        }

        @Override // Lg.j
        public void Y() {
            new Ng.d(this.f11717a).j(this.f11718b);
        }

        @Override // Lg.j
        public void a() {
            this.f11718b.purge();
        }

        @Override // Lg.j
        public void g() {
            this.f11719c.cancel();
        }

        @Override // Lg.j
        public void j(String str) {
            new Ng.c(this.f11717a, str).j(this.f11718b);
        }

        @Override // Lg.j
        public void p(q qVar) {
            new Ng.b(this.f11717a, qVar).j(this.f11718b);
        }

        @Override // Lg.j
        public void s() {
            this.f11718b.cancel();
        }

        @Override // Lg.j
        public void v() {
            new Og.b(this.f11717a).u(this.f11719c);
        }

        @Override // Lg.j
        public void y() {
            new Mg.b(this.f11717a).g(this.f11718b);
        }

        /* renamed from: Lg.j$a$a, reason: collision with other inner class name */
        public static class C0465a extends Timer {

            /* renamed from: a, reason: collision with root package name */
            private volatile boolean f11720a;

            public C0465a(String str, boolean z10) {
                super(str, z10);
                this.f11720a = false;
            }

            @Override // java.util.Timer
            public synchronized void cancel() {
                if (this.f11720a) {
                    return;
                }
                this.f11720a = true;
                super.cancel();
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, long j10) {
                if (this.f11720a) {
                    return;
                }
                super.schedule(timerTask, j10);
            }

            @Override // java.util.Timer
            public synchronized void scheduleAtFixedRate(TimerTask timerTask, long j10, long j11) {
                if (this.f11720a) {
                    return;
                }
                super.scheduleAtFixedRate(timerTask, j10, j11);
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, Date date) {
                if (this.f11720a) {
                    return;
                }
                super.schedule(timerTask, date);
            }

            @Override // java.util.Timer
            public synchronized void scheduleAtFixedRate(TimerTask timerTask, Date date, long j10) {
                if (this.f11720a) {
                    return;
                }
                super.scheduleAtFixedRate(timerTask, date, j10);
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, long j10, long j11) {
                if (this.f11720a) {
                    return;
                }
                super.schedule(timerTask, j10, j11);
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, Date date, long j10) {
                if (this.f11720a) {
                    return;
                }
                super.schedule(timerTask, date, j10);
            }
        }
    }
}
