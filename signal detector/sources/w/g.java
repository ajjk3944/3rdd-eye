package w;

import f4.InterfaceFutureC2326a;
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
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public abstract class g implements InterfaceFutureC2326a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f23917d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f23918e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final R2.a f23919f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f23920g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f23921a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f23922b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f23923c;

    static {
        R2.a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f23919f = eVar;
        if (th != null) {
            f23918e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f23920g = new Object();
    }

    public static void c(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f23923c;
        } while (!f23919f.c(gVar, fVar, f.f23914c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f23915a;
            if (thread != null) {
                fVar.f23915a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f23916b;
        }
        do {
            cVar2 = gVar.f23922b;
        } while (!f23919f.a(gVar, cVar2, c.f23906d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f23909c;
            cVar.f23909c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f23909c;
            d(cVar3.f23907a, cVar3.f23908b);
            cVar3 = cVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            f23918e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof C2963a) {
            Throwable th = ((C2963a) obj).f23904a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C2964b) {
            throw new ExecutionException(((C2964b) obj).f23905a);
        }
        if (obj == f23920g) {
            return null;
        }
        return obj;
    }

    public static Object f(g gVar) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // f4.InterfaceFutureC2326a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f23922b;
        c cVar2 = c.f23906d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f23909c = cVar;
                if (f23919f.a(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f23922b;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objF = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(objF == this ? "this future" : String.valueOf(objF));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e6) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e6.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e7) {
            sb.append("FAILURE, cause=[");
            sb.append(e7.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        Object obj = this.f23921a;
        if (obj != null) {
            return false;
        }
        if (!f23919f.b(this, obj, f23917d ? new C2963a(new CancellationException("Future.cancel() was called."), z6) : z6 ? C2963a.f23902b : C2963a.f23903c)) {
            return false;
        }
        c(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        f fVar = f.f23914c;
        long nanos = timeUnit.toNanos(j6);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f23921a;
        if (obj != null) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f23923c;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    R2.a aVar = f23919f;
                    aVar.y(fVar3, fVar2);
                    if (aVar.c(this, fVar2, fVar3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f23921a;
                            if (obj2 != null) {
                                return e(obj2);
                            }
                            long jNanoTime2 = jNanoTime - System.nanoTime();
                            if (jNanoTime2 < 1000) {
                                h(fVar3);
                                nanos = jNanoTime2;
                                break;
                            }
                            nanos = jNanoTime2;
                        }
                    } else {
                        fVar2 = this.f23923c;
                    }
                } while (fVar2 != fVar);
            }
            return e(this.f23921a);
        }
        while (nanos > 0) {
            Object obj3 = this.f23921a;
            if (obj3 != null) {
                return e(obj3);
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
        String strE = "Waited " + j6 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strE2 = AbstractC2763b.e(strE, " (plus ");
            long j7 = -nanos;
            long jConvert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
            long nanos2 = j7 - timeUnit.toNanos(jConvert);
            boolean z6 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strE3 = strE2 + jConvert + " " + lowerCase;
                if (z6) {
                    strE3 = AbstractC2763b.e(strE3, ",");
                }
                strE2 = AbstractC2763b.e(strE3, " ");
            }
            if (z6) {
                strE2 = strE2 + nanos2 + " nanoseconds ";
            }
            strE = AbstractC2763b.e(strE2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC2763b.e(strE, " but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC2763b.f(strE, " for ", string));
    }

    public final void h(f fVar) {
        fVar.f23915a = null;
        while (true) {
            f fVar2 = this.f23923c;
            if (fVar2 == f.f23914c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f23916b;
                if (fVar2.f23915a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f23916b = fVar4;
                    if (fVar3.f23915a == null) {
                        break;
                    }
                } else if (!f23919f.c(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    public boolean i(Throwable th) {
        th.getClass();
        if (!f23919f.b(this, null, new C2964b(th))) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f23921a instanceof C2963a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f23921a != null;
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f23921a instanceof C2963a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e6) {
                strG = "Exception thrown from implementation: " + e6.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strG);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        f fVar = f.f23914c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f23921a;
            if (obj2 != null) {
                return e(obj2);
            }
            f fVar2 = this.f23923c;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    R2.a aVar = f23919f;
                    aVar.y(fVar3, fVar2);
                    if (aVar.c(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f23921a;
                            } else {
                                h(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    fVar2 = this.f23923c;
                } while (fVar2 != fVar);
            }
            return e(this.f23921a);
        }
        throw new InterruptedException();
    }
}
