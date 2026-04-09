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
public abstract class y implements n70 {
    public static final boolean i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger j = Logger.getLogger(y.class.getName());
    public static final bd2 k;
    public static final Object l;
    public volatile Object f;
    public volatile t g;
    public volatile x h;

    static {
        bd2 wVar;
        try {
            wVar = new u(AtomicReferenceFieldUpdater.newUpdater(x.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(x.class, x.class, "b"), AtomicReferenceFieldUpdater.newUpdater(y.class, x.class, "h"), AtomicReferenceFieldUpdater.newUpdater(y.class, t.class, "g"), AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            wVar = new w();
        }
        k = wVar;
        if (th != null) {
            j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        l = new Object();
    }

    public static void b(y yVar) {
        t tVar;
        t tVar2;
        t tVar3 = null;
        while (true) {
            x xVar = yVar.h;
            if (k.f(yVar, xVar, x.c)) {
                while (xVar != null) {
                    Thread thread = xVar.a;
                    if (thread != null) {
                        xVar.a = null;
                        LockSupport.unpark(thread);
                    }
                    xVar = xVar.b;
                }
                do {
                    tVar = yVar.g;
                } while (!k.c(yVar, tVar, t.d));
                while (true) {
                    tVar2 = tVar3;
                    tVar3 = tVar;
                    if (tVar3 == null) {
                        break;
                    }
                    tVar = tVar3.c;
                    tVar3.c = tVar2;
                }
                while (tVar2 != null) {
                    tVar3 = tVar2.c;
                    Runnable runnable = tVar2.a;
                    if (runnable instanceof v) {
                        v vVar = (v) runnable;
                        yVar = vVar.f;
                        if (yVar.f == vVar) {
                            if (k.e(yVar, vVar, f(vVar.g))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, tVar2.b);
                    }
                    tVar2 = tVar3;
                }
                return;
            }
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
        if (obj instanceof q) {
            Throwable th = ((q) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof s) {
            throw new ExecutionException(((s) obj).a);
        }
        if (obj == l) {
            return null;
        }
        return obj;
    }

    public static Object f(n70 n70Var) {
        Object obj;
        if (n70Var instanceof y) {
            Object obj2 = ((y) n70Var).f;
            if (!(obj2 instanceof q)) {
                return obj2;
            }
            q qVar = (q) obj2;
            return qVar.a ? qVar.b != null ? new q(qVar.b, false) : q.d : obj2;
        }
        boolean zIsCancelled = n70Var.isCancelled();
        boolean z = true;
        if ((!i) && zIsCancelled) {
            return q.d;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = n70Var.get();
                    break;
                } catch (CancellationException e) {
                    if (zIsCancelled) {
                        return new q(e, false);
                    }
                    return new s(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + n70Var, e));
                } catch (ExecutionException e2) {
                    return new s(e2.getCause());
                } catch (Throwable th) {
                    return new s(th);
                }
            } catch (InterruptedException unused) {
                z2 = z;
            } catch (Throwable th2) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? l : obj;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (RuntimeException e) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e2) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e2.getCause());
                    sb.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // defpackage.n70
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        t tVar = this.g;
        t tVar2 = t.d;
        if (tVar != tVar2) {
            t tVar3 = new t(runnable, executor);
            do {
                tVar3.c = tVar;
                if (k.c(this, tVar, tVar3)) {
                    return;
                } else {
                    tVar = this.g;
                }
            } while (tVar != tVar2);
        }
        d(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof defpackage.v
            r3 = r3 | r4
            if (r3 == 0) goto L5b
            boolean r3 = defpackage.y.i
            if (r3 == 0) goto L1f
            q r3 = new q
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r4, r8)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            q r3 = defpackage.q.c
            goto L26
        L24:
            q r3 = defpackage.q.d
        L26:
            r4 = r7
            r5 = r2
        L28:
            bd2 r6 = defpackage.y.k
            boolean r6 = r6.e(r4, r0, r3)
            if (r6 == 0) goto L54
            b(r4)
            boolean r4 = r0 instanceof defpackage.v
            if (r4 == 0) goto L53
            v r0 = (defpackage.v) r0
            n70 r0 = r0.g
            boolean r4 = r0 instanceof defpackage.y
            if (r4 == 0) goto L50
            r4 = r0
            y r4 = (defpackage.y) r4
            java.lang.Object r0 = r4.f
            if (r0 != 0) goto L48
            r5 = r1
            goto L49
        L48:
            r5 = r2
        L49:
            boolean r6 = r0 instanceof defpackage.v
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r1
            goto L28
        L50:
            r0.cancel(r8)
        L53:
            return r1
        L54:
            java.lang.Object r0 = r4.f
            boolean r6 = r0 instanceof defpackage.v
            if (r6 != 0) goto L28
            return r5
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y.cancel(boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.f;
        if (obj instanceof v) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            n70 n70Var = ((v) obj).g;
            return ex0.k(sb, n70Var == this ? "this future" : String.valueOf(n70Var), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        x xVar = x.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f;
        if ((obj != null) && (!(obj instanceof v))) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            x xVar2 = this.h;
            if (xVar2 != xVar) {
                x xVar3 = new x();
                z = true;
                do {
                    bd2 bd2Var = k;
                    bd2Var.o(xVar3, xVar2);
                    if (bd2Var.f(this, xVar2, xVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(xVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f;
                            if ((obj2 != null) && (!(obj2 instanceof v))) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(xVar3);
                    } else {
                        xVar2 = this.h;
                    }
                } while (xVar2 != xVar);
            }
            return e(this.f);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.f;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof v))) {
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
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strG3 = strG2 + jConvert + " " + lowerCase;
                if (z2) {
                    strG3 = ex0.g(strG3, ",");
                }
                strG2 = ex0.g(strG3, " ");
            }
            if (z2) {
                strG2 = strG2 + nanos2 + " nanoseconds ";
            }
            strG = ex0.g(strG2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(ex0.g(strG, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strG + " for " + string);
    }

    public final void h(x xVar) {
        xVar.a = null;
        while (true) {
            x xVar2 = this.h;
            if (xVar2 == x.c) {
                return;
            }
            x xVar3 = null;
            while (xVar2 != null) {
                x xVar4 = xVar2.b;
                if (xVar2.a != null) {
                    xVar3 = xVar2;
                } else if (xVar3 != null) {
                    xVar3.b = xVar4;
                    if (xVar3.a == null) {
                        break;
                    }
                } else if (!k.f(this, xVar2, xVar4)) {
                    break;
                }
                xVar2 = xVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f instanceof q;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof v)) & (this.f != null);
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f instanceof q) {
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
        x xVar = x.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f;
            if ((obj2 != null) & (!(obj2 instanceof v))) {
                return e(obj2);
            }
            x xVar2 = this.h;
            if (xVar2 != xVar) {
                x xVar3 = new x();
                do {
                    bd2 bd2Var = k;
                    bd2Var.o(xVar3, xVar2);
                    if (bd2Var.f(this, xVar2, xVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f;
                            } else {
                                h(xVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof v))));
                        return e(obj);
                    }
                    xVar2 = this.h;
                } while (xVar2 != xVar);
            }
            return e(this.f);
        }
        throw new InterruptedException();
    }
}
