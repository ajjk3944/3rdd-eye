package h3;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class g implements vd.b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f24827d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f24828e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final ii.a f24829f;
    public static final Object g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f24830a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f24831b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f24832c;

    static {
        ii.a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            eVar = new e(6);
        }
        f24829f = eVar;
        if (th != null) {
            f24828e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void e(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f24832c;
        } while (!f24829f.f(gVar, fVar, f.f24824c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f24825a;
            if (thread != null) {
                fVar.f24825a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f24826b;
        }
        gVar.d();
        do {
            cVar2 = gVar.f24831b;
        } while (!f24829f.d(gVar, cVar2, c.f24816d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f24819c;
            cVar.f24819c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f24819c;
            f(cVar3.f24817a, cVar3.f24818b);
            cVar3 = cVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f24828e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f24814b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f24815a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object h(Future future) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th2) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // vd.b
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f24831b;
        c cVar2 = c.f24816d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f24819c = cVar;
                if (f24829f.d(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f24831b;
                }
            } while (cVar != cVar2);
        }
        f(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        try {
            Object objH = h(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objH == this ? "this future" : String.valueOf(objH));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e2.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f24830a;
        if (obj == null) {
            if (f24829f.e(this, obj, f24827d ? new a(new CancellationException("Future.cancel() was called."), z3) : z3 ? a.f24811c : a.f24812d)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        f fVar = f.f24824c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f24830a;
        if (obj != null) {
            return g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f24832c;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    ii.a aVar = f24829f;
                    aVar.u(fVar3, fVar2);
                    if (aVar.f(this, fVar2, fVar3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f24830a;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            long jNanoTime2 = jNanoTime - System.nanoTime();
                            if (jNanoTime2 < 1000) {
                                j(fVar3);
                                nanos = jNanoTime2;
                                break;
                            }
                            nanos = jNanoTime2;
                        }
                    } else {
                        fVar2 = this.f24832c;
                    }
                } while (fVar2 != fVar);
            }
            return g(this.f24830a);
        }
        while (nanos > 0) {
            Object obj3 = this.f24830a;
            if (obj3 != null) {
                return g(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbY = d.h.y(j, "Waited ", " ");
        sbY.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbY.toString();
        if (nanos + 1000 < 0) {
            String strS = d.h.s(string3, " (plus ");
            long j8 = -nanos;
            long jConvert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(jConvert);
            boolean z3 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strS2 = strS + jConvert + " " + lowerCase;
                if (z3) {
                    strS2 = d.h.s(strS2, ",");
                }
                strS = d.h.s(strS2, " ");
            }
            if (z3) {
                strS = strS + nanos2 + " nanoseconds ";
            }
            string3 = d.h.s(strS, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(d.h.s(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(d.h.E(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24830a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f24830a != null;
    }

    public final void j(f fVar) {
        fVar.f24825a = null;
        while (true) {
            f fVar2 = this.f24832c;
            if (fVar2 == f.f24824c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f24826b;
                if (fVar2.f24825a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f24826b = fVar4;
                    if (fVar3.f24825a == null) {
                        break;
                    }
                } else if (!f24829f.f(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f24829f.e(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean l(Throwable th2) {
        th2.getClass();
        if (!f24829f.e(this, null, new b(th2))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String strI;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f24830a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                strI = i();
            } catch (RuntimeException e2) {
                strI = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strI != null && !strI.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strI);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        f fVar = f.f24824c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f24830a;
            if (obj2 != null) {
                return g(obj2);
            }
            f fVar2 = this.f24832c;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    ii.a aVar = f24829f;
                    aVar.u(fVar3, fVar2);
                    if (aVar.f(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f24830a;
                            } else {
                                j(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    fVar2 = this.f24832c;
                } while (fVar2 != fVar);
            }
            return g(this.f24830a);
        }
        throw new InterruptedException();
    }
}
