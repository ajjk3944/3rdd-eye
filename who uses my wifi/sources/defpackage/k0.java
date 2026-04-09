package defpackage;

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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class k0 implements n70 {
    public static final boolean i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger j = Logger.getLogger(k0.class.getName());
    public static final uk2 k;
    public static final Object l;
    public volatile Object f;
    public volatile g0 g;
    public volatile j0 h;

    static {
        uk2 i0Var;
        try {
            i0Var = new h0(AtomicReferenceFieldUpdater.newUpdater(j0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(j0.class, j0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(k0.class, j0.class, "h"), AtomicReferenceFieldUpdater.newUpdater(k0.class, g0.class, "g"), AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            i0Var = new i0();
        }
        k = i0Var;
        if (th != null) {
            j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        l = new Object();
    }

    public static void b(k0 k0Var) {
        j0 j0Var;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        do {
            j0Var = k0Var.h;
        } while (!k.g(k0Var, j0Var, j0.c));
        while (true) {
            g0Var = null;
            if (j0Var == null) {
                break;
            }
            Thread thread = j0Var.a;
            if (thread != null) {
                j0Var.a = null;
                LockSupport.unpark(thread);
            }
            j0Var = j0Var.b;
        }
        do {
            g0Var2 = k0Var.g;
        } while (!k.e(k0Var, g0Var2, g0.d));
        while (true) {
            g0Var3 = g0Var;
            g0Var = g0Var2;
            if (g0Var == null) {
                break;
            }
            g0Var2 = g0Var.c;
            g0Var.c = g0Var3;
        }
        while (g0Var3 != null) {
            g0 g0Var4 = g0Var3.c;
            d(g0Var3.a, g0Var3.b);
            g0Var3 = g0Var4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            j.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof e0) {
            Throwable th = ((e0) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof f0) {
            throw new ExecutionException(((f0) obj).a);
        }
        if (obj == l) {
            return null;
        }
        return obj;
    }

    public static Object f(k0 k0Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = k0Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objF = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(objF == this ? "this future" : String.valueOf(objF));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // defpackage.n70
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        g0 g0Var = this.g;
        g0 g0Var2 = g0.d;
        if (g0Var != g0Var2) {
            g0 g0Var3 = new g0(runnable, executor);
            do {
                g0Var3.c = g0Var;
                if (k.e(this, g0Var, g0Var3)) {
                    return;
                } else {
                    g0Var = this.g;
                }
            } while (g0Var != g0Var2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f;
        if (obj != null) {
            return false;
        }
        if (!k.f(this, obj, i ? new e0(new CancellationException("Future.cancel() was called."), z) : z ? e0.b : e0.c)) {
            return false;
        }
        b(this);
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
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        j0 j0Var = j0.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f;
        if (obj != null) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            j0 j0Var2 = this.h;
            if (j0Var2 != j0Var) {
                j0 j0Var3 = new j0();
                do {
                    uk2 uk2Var = k;
                    uk2Var.t(j0Var3, j0Var2);
                    if (uk2Var.g(this, j0Var2, j0Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(j0Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f;
                            if (obj2 != null) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(j0Var3);
                    } else {
                        j0Var2 = this.h;
                    }
                } while (j0Var2 != j0Var);
            }
            return e(this.f);
        }
        while (nanos > 0) {
            Object obj3 = this.f;
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
        String strG = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strG2 = ex0.g(strG, " (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strG3 = strG2 + jConvert + " " + lowerCase;
                if (z) {
                    strG3 = ex0.g(strG3, ",");
                }
                strG2 = ex0.g(strG3, " ");
            }
            if (z) {
                strG2 = strG2 + nanos2 + " nanoseconds ";
            }
            strG = ex0.g(strG2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(ex0.g(strG, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strG + " for " + string);
    }

    public final void h(j0 j0Var) {
        j0Var.a = null;
        while (true) {
            j0 j0Var2 = this.h;
            if (j0Var2 == j0.c) {
                return;
            }
            j0 j0Var3 = null;
            while (j0Var2 != null) {
                j0 j0Var4 = j0Var2.b;
                if (j0Var2.a != null) {
                    j0Var3 = j0Var2;
                } else if (j0Var3 != null) {
                    j0Var3.b = j0Var4;
                    if (j0Var3.a == null) {
                        break;
                    }
                } else if (!k.g(this, j0Var2, j0Var4)) {
                    break;
                }
                j0Var2 = j0Var4;
            }
            return;
        }
    }

    public boolean i(Throwable th) {
        th.getClass();
        if (!k.f(this, null, new f0(th))) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f instanceof e0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f != null;
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f instanceof e0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e) {
                strG = "Exception thrown from implementation: " + e.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strG);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
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
        j0 j0Var = j0.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f;
            if (obj2 != null) {
                return e(obj2);
            }
            j0 j0Var2 = this.h;
            if (j0Var2 != j0Var) {
                j0 j0Var3 = new j0();
                do {
                    uk2 uk2Var = k;
                    uk2Var.t(j0Var3, j0Var2);
                    if (uk2Var.g(this, j0Var2, j0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f;
                            } else {
                                h(j0Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    j0Var2 = this.h;
                } while (j0Var2 != j0Var);
            }
            return e(this.f);
        }
        throw new InterruptedException();
    }
}
