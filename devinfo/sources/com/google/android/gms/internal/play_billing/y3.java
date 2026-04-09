package com.google.android.gms.internal.play_billing;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class y3 implements r0 {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f20264d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f20265e = Logger.getLogger(y3.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final u6.t f20266f;
    public static final Object g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f20267a;

    /* renamed from: b, reason: collision with root package name */
    public volatile n2 f20268b;

    /* renamed from: c, reason: collision with root package name */
    public volatile x3 f20269c;

    static {
        u6.t w3Var;
        try {
            w3Var = new k3(AtomicReferenceFieldUpdater.newUpdater(x3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(x3.class, x3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(y3.class, x3.class, "c"), AtomicReferenceFieldUpdater.newUpdater(y3.class, n2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(y3.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            w3Var = new w3();
        }
        Throwable th3 = th;
        f20266f = w3Var;
        if (th3 != null) {
            f20265e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        g = new Object();
    }

    public static void d(y3 y3Var) {
        x3 x3Var;
        u6.t tVar;
        n2 n2Var;
        n2 n2Var2;
        n2 n2Var3;
        do {
            x3Var = y3Var.f20269c;
            tVar = f20266f;
        } while (!tVar.C(y3Var, x3Var, x3.f20258c));
        while (true) {
            n2Var = null;
            if (x3Var == null) {
                break;
            }
            Thread thread = x3Var.f20259a;
            if (thread != null) {
                x3Var.f20259a = null;
                LockSupport.unpark(thread);
            }
            x3Var = x3Var.f20260b;
        }
        do {
            n2Var2 = y3Var.f20268b;
        } while (!tVar.y(y3Var, n2Var2, n2.f20191d));
        while (true) {
            n2Var3 = n2Var;
            n2Var = n2Var2;
            if (n2Var == null) {
                break;
            }
            n2Var2 = n2Var.f20194c;
            n2Var.f20194c = n2Var3;
        }
        while (n2Var3 != null) {
            Runnable runnable = n2Var3.f20192a;
            n2 n2Var4 = n2Var3.f20194c;
            f(runnable, n2Var3.f20193b);
            n2Var3 = n2Var4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f20265e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", je.u.u("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object h(Object obj) throws ExecutionException {
        if (obj instanceof e1) {
            Throwable th2 = ((e1) obj).f20108a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof z1) {
            throw new ExecutionException(((z1) obj).f20273a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String b() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.r0
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        n2 n2Var = this.f20268b;
        n2 n2Var2 = n2.f20191d;
        if (n2Var != n2Var2) {
            n2 n2Var3 = new n2(runnable, executor);
            do {
                n2Var3.f20194c = n2Var;
                if (f20266f.y(this, n2Var, n2Var3)) {
                    return;
                } else {
                    n2Var = this.f20268b;
                }
            } while (n2Var != n2Var2);
        }
        f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f20267a;
        if (obj != null) {
            return false;
        }
        if (!f20266f.A(this, obj, f20264d ? new e1(new CancellationException("Future.cancel() was called.")) : z3 ? e1.f20106b : e1.f20107c)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void e(StringBuilder sb2) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb2.append("CANCELLED");
                    return;
                } catch (RuntimeException e2) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e2.getClass());
                    sb2.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e10) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e10.getCause());
                    sb2.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb2.append("SUCCESS, result=[");
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append("]");
    }

    public final void g(x3 x3Var) {
        x3Var.f20259a = null;
        while (true) {
            x3 x3Var2 = this.f20269c;
            if (x3Var2 != x3.f20258c) {
                x3 x3Var3 = null;
                while (x3Var2 != null) {
                    x3 x3Var4 = x3Var2.f20260b;
                    if (x3Var2.f20259a != null) {
                        x3Var3 = x3Var2;
                    } else if (x3Var3 != null) {
                        x3Var3.f20260b = x3Var4;
                        if (x3Var3.f20259a == null) {
                            break;
                        }
                    } else if (!f20266f.C(this, x3Var2, x3Var4)) {
                        break;
                    }
                    x3Var2 = x3Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f20267a;
        if (obj2 != null) {
            return h(obj2);
        }
        x3 x3Var = this.f20269c;
        x3 x3Var2 = x3.f20258c;
        if (x3Var != x3Var2) {
            x3 x3Var3 = new x3();
            do {
                u6.t tVar = f20266f;
                tVar.u(x3Var3, x3Var);
                if (tVar.C(this, x3Var, x3Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(x3Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f20267a;
                    } while (obj == null);
                    return h(obj);
                }
                x3Var = this.f20269c;
            } while (x3Var != x3Var2);
        }
        return h(this.f20267a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f20267a instanceof e1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f20267a != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f20267a instanceof e1) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            e(sb2);
        } else {
            try {
                strConcat = b();
            } catch (RuntimeException e2) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strConcat);
                sb2.append("]");
            } else if (isDone()) {
                e(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f20267a;
            if (obj != null) {
                return h(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                x3 x3Var = this.f20269c;
                x3 x3Var2 = x3.f20258c;
                if (x3Var != x3Var2) {
                    x3 x3Var3 = new x3();
                    do {
                        u6.t tVar = f20266f;
                        tVar.u(x3Var3, x3Var);
                        if (tVar.C(this, x3Var, x3Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f20267a;
                                    if (obj2 != null) {
                                        return h(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    g(x3Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            g(x3Var3);
                        } else {
                            x3Var = this.f20269c;
                        }
                    } while (x3Var != x3Var2);
                }
                return h(this.f20267a);
            }
            while (nanos > 0) {
                Object obj3 = this.f20267a;
                if (obj3 != null) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j8 = -nanos;
                long jConvert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
                long nanos2 = j8 - timeUnit.toNanos(jConvert);
                boolean z3 = true;
                if (jConvert != 0 && nanos2 <= 1000) {
                    z3 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z3) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z3) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(d.h.E(strConcat, " for ", string));
        }
        throw new InterruptedException();
    }
}
