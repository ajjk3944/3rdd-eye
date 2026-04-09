package m2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class r {

    /* renamed from: f, reason: collision with root package name */
    public static final String f23431f = androidx.work.k.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f23432a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f23433b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f23434c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f23435d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f23436e;

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public int f23437a = 0;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f23437a);
            this.f23437a = this.f23437a + 1;
            return threadNewThread;
        }
    }

    public interface b {
        void a(String str);
    }

    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final r f23439a;

        /* renamed from: b, reason: collision with root package name */
        public final String f23440b;

        public c(r rVar, String str) {
            this.f23439a = rVar;
            this.f23440b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f23439a.f23436e) {
                try {
                    if (((c) this.f23439a.f23434c.remove(this.f23440b)) != null) {
                        b bVar = (b) this.f23439a.f23435d.remove(this.f23440b);
                        if (bVar != null) {
                            bVar.a(this.f23440b);
                        }
                    } else {
                        androidx.work.k.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f23440b), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public r() {
        a aVar = new a();
        this.f23432a = aVar;
        this.f23434c = new HashMap();
        this.f23435d = new HashMap();
        this.f23436e = new Object();
        this.f23433b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.f23433b.isShutdown()) {
            return;
        }
        this.f23433b.shutdownNow();
    }

    public void b(String str, long j10, b bVar) {
        synchronized (this.f23436e) {
            androidx.work.k.c().a(f23431f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f23434c.put(str, cVar);
            this.f23435d.put(str, bVar);
            this.f23433b.schedule(cVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f23436e) {
            try {
                if (((c) this.f23434c.remove(str)) != null) {
                    androidx.work.k.c().a(f23431f, String.format("Stopping timer for %s", str), new Throwable[0]);
                    this.f23435d.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
