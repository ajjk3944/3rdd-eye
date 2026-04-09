package w2;

import ba.m;
import dd.p;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class g implements re.b {
    public static final Object B;

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f24178r = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f24179x = Logger.getLogger(g.class.getName());

    /* renamed from: y, reason: collision with root package name */
    public static final m f24180y;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f24181a;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f24182d;

    /* renamed from: g, reason: collision with root package name */
    public volatile f f24183g;

    static {
        m eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "g"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "d"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            eVar = new e();
        }
        f24180y = eVar;
        if (th != null) {
            f24179x.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        B = new Object();
    }

    public static void d(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f24183g;
        } while (!f24180y.i(gVar, fVar, f.f24175c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f24176a;
            if (thread != null) {
                fVar.f24176a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f24177b;
        }
        gVar.c();
        do {
            cVar2 = gVar.f24182d;
        } while (!f24180y.g(gVar, cVar2, c.f24168d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f24171c;
            cVar.f24171c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f24171c;
            e(cVar3.f24169a, cVar3.f24170b);
            cVar3 = cVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f24179x.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f24166b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f24167a);
        }
        if (obj == B) {
            return null;
        }
        return obj;
    }

    public static Object g(g gVar) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // re.b
    public final void a(re.a aVar, p pVar) {
        c cVar = this.f24182d;
        c cVar2 = c.f24168d;
        if (cVar != cVar2) {
            c cVar3 = new c(aVar, pVar);
            do {
                cVar3.f24171c = cVar;
                if (f24180y.g(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f24182d;
                }
            } while (cVar != cVar2);
        }
        e(aVar, pVar);
    }

    public final void b(StringBuilder sb2) {
        try {
            Object objG = g(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objG == this ? "this future" : String.valueOf(objG));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e4.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f24181a;
        if (obj == null) {
            if (f24180y.h(this, obj, f24178r ? new a(new CancellationException("Future.cancel() was called."), z10) : z10 ? a.f24163c : a.f24164d)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        f fVar = f.f24175c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f24181a;
        if (obj != null) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f24183g;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    m mVar = f24180y;
                    mVar.J(fVar3, fVar2);
                    if (mVar.i(this, fVar2, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f24181a;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(fVar3);
                    } else {
                        fVar2 = this.f24183g;
                    }
                } while (fVar2 != fVar);
            }
            return f(this.f24181a);
        }
        while (nanos > 0) {
            Object obj3 = this.f24181a;
            if (obj3 != null) {
                return f(obj3);
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
        StringBuilder sbK = w.g.k(j, "Waited ", " ");
        sbK.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbK.toString();
        if (nanos + 1000 < 0) {
            String strF = w.g.f(string3, " (plus ");
            long j7 = -nanos;
            long jConvert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
            long nanos2 = j7 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strF2 = strF + jConvert + " " + lowerCase;
                if (z10) {
                    strF2 = w.g.f(strF2, ",");
                }
                strF = w.g.f(strF2, " ");
            }
            if (z10) {
                strF = strF + nanos2 + " nanoseconds ";
            }
            string3 = w.g.f(strF, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(w.g.f(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(w.g.g(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(f fVar) {
        fVar.f24176a = null;
        while (true) {
            f fVar2 = this.f24183g;
            if (fVar2 == f.f24175c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f24177b;
                if (fVar2.f24176a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f24177b = fVar4;
                    if (fVar3.f24176a == null) {
                        break;
                    }
                } else if (!f24180y.i(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24181a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f24181a != null;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = B;
        }
        if (!f24180y.h(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th2) {
        th2.getClass();
        if (!f24180y.h(this, null, new b(th2))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String strH;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f24181a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e4) {
                strH = "Exception thrown from implementation: " + e4.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strH);
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

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        f fVar = f.f24175c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f24181a;
            if (obj2 != null) {
                return f(obj2);
            }
            f fVar2 = this.f24183g;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    m mVar = f24180y;
                    mVar.J(fVar3, fVar2);
                    if (mVar.i(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f24181a;
                            } else {
                                i(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    fVar2 = this.f24183g;
                } while (fVar2 != fVar);
            }
            return f(this.f24181a);
        }
        throw new InterruptedException();
    }
}
