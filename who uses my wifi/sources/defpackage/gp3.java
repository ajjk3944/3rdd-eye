package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class gp3 extends op3 {
    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(n70 n70Var) {
        Object obj;
        Throwable thA;
        if (n70Var instanceof ep3) {
            Object zo3Var = ((gp3) n70Var).f;
            if (zo3Var instanceof zo3) {
                zo3 zo3Var2 = (zo3) zo3Var;
                if (zo3Var2.a) {
                    Throwable th = zo3Var2.b;
                    zo3Var = th != null ? new zo3(th, false) : zo3.d;
                }
            }
            Objects.requireNonNull(zo3Var);
            return zo3Var;
        }
        if ((n70Var instanceof br3) && (thA = ((br3) n70Var).a()) != null) {
            return new cp3(thA);
        }
        boolean zIsCancelled = n70Var.isCancelled();
        boolean z = true;
        if ((!op3.k) && zIsCancelled) {
            zo3 zo3Var3 = zo3.d;
            Objects.requireNonNull(zo3Var3);
            return zo3Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = n70Var.get();
                        break;
                    } catch (Error | Exception e) {
                        e = e;
                        return new cp3(e);
                    } catch (CancellationException e2) {
                        return !zIsCancelled ? new cp3(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(n70Var)), e2)) : new zo3(e2, false);
                    } catch (ExecutionException e3) {
                        return zIsCancelled ? new zo3(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(n70Var)), e3), false) : new cp3(e3.getCause());
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error e4) {
                e = e4;
                return new cp3(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? op3.i : obj;
        }
        String strValueOf = String.valueOf(n70Var);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
        sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
        sb.append(strValueOf);
        return new zo3(new IllegalArgumentException(sb.toString()), false);
    }

    public static Object i(Object obj) throws ExecutionException {
        if (obj instanceof zo3) {
            Throwable th = ((zo3) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof cp3) {
            throw new ExecutionException(((cp3) obj).a);
        }
        if (obj == op3.i) {
            return null;
        }
        return obj;
    }

    public static boolean j(Object obj) {
        return !(obj instanceof ap3);
    }

    public static void o(gp3 gp3Var, boolean z) {
        dp3 dp3Var = null;
        while (true) {
            for (np3 np3VarH = op3.l.H(gp3Var); np3VarH != null; np3VarH = np3VarH.b) {
                Thread thread = np3VarH.a;
                if (thread != null) {
                    np3VarH.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                gp3Var.k();
            }
            gp3Var.f();
            dp3 dp3Var2 = dp3Var;
            dp3 dp3VarK = op3.l.K(gp3Var);
            dp3 dp3Var3 = dp3Var2;
            while (dp3VarK != null) {
                dp3 dp3Var4 = dp3VarK.c;
                dp3VarK.c = dp3Var3;
                dp3Var3 = dp3VarK;
                dp3VarK = dp3Var4;
            }
            while (dp3Var3 != null) {
                Runnable runnable = dp3Var3.a;
                dp3Var = dp3Var3.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof ap3) {
                    ap3 ap3Var = (ap3) runnable;
                    gp3Var = ap3Var.f;
                    if (gp3Var.f == ap3Var) {
                        if (op3.l.L(gp3Var, ap3Var, h(ap3Var.g))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dp3Var3.b;
                    Objects.requireNonNull(executor);
                    q(runnable, executor);
                }
                dp3Var3 = dp3Var;
            }
            return;
            z = false;
        }
    }

    public static void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger loggerA = op3.j.a();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", ex0.m(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e);
        }
    }

    @Override // defpackage.br3
    public final Throwable a() {
        if (!(this instanceof ep3)) {
            return null;
        }
        Object obj = this.f;
        if (obj instanceof cp3) {
            return ((cp3) obj).a;
        }
        return null;
    }

    @Override // defpackage.n70
    public void c(Runnable runnable, Executor executor) {
        dp3 dp3Var;
        dp3 dp3Var2 = dp3.d;
        zt0.d0(runnable, "Runnable was null.");
        zt0.d0(executor, "Executor was null.");
        if (!isDone() && (dp3Var = this.g) != dp3Var2) {
            dp3 dp3Var3 = new dp3(runnable, executor);
            do {
                dp3Var3.c = dp3Var;
                if (op3.l.G(this, dp3Var, dp3Var3)) {
                    return;
                } else {
                    dp3Var = this.g;
                }
            } while (dp3Var != dp3Var2);
        }
        q(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f
            boolean r1 = r0 instanceof defpackage.ap3
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L61
            boolean r1 = defpackage.op3.k
            if (r1 == 0) goto L1f
            zo3 r1 = new zo3
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r4, r8)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            zo3 r1 = defpackage.zo3.c
            goto L26
        L24:
            zo3 r1 = defpackage.zo3.d
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            ob1 r6 = defpackage.op3.l
            boolean r6 = r6.L(r4, r0, r1)
            if (r6 == 0) goto L58
            o(r4, r8)
            boolean r4 = r0 instanceof defpackage.ap3
            if (r4 == 0) goto L57
            ap3 r0 = (defpackage.ap3) r0
            n70 r0 = r0.g
            boolean r4 = r0 instanceof defpackage.ep3
            if (r4 == 0) goto L54
            r4 = r0
            gp3 r4 = (defpackage.gp3) r4
            java.lang.Object r0 = r4.f
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof defpackage.ap3
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r3
            goto L2b
        L53:
            return r3
        L54:
            r0.cancel(r8)
        L57:
            return r3
        L58:
            java.lang.Object r0 = r4.f
            boolean r6 = j(r0)
            if (r6 == 0) goto L2b
            return r5
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp3.cancel(boolean):boolean");
    }

    public boolean d(Object obj) {
        if (obj == null) {
            obj = op3.i;
        }
        if (!op3.l.L(this, null, obj)) {
            return false;
        }
        o(this, false);
        return true;
    }

    public boolean e(Throwable th) {
        th.getClass();
        if (!op3.l.L(this, null, new cp3(th))) {
            return false;
        }
        o(this, false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        np3 np3Var = np3.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f;
        if ((obj2 != null) && j(obj2)) {
            return i(obj2);
        }
        np3 np3Var2 = this.h;
        if (np3Var2 != np3Var) {
            np3 np3Var3 = new np3();
            do {
                ob1 ob1Var = op3.l;
                ob1Var.A(np3Var3, np3Var2);
                if (ob1Var.E(this, np3Var2, np3Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(np3Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f;
                    } while (!((obj != null) & j(obj)));
                    return i(obj);
                }
                np3Var2 = this.h;
            } while (np3Var2 != np3Var);
        }
        Object obj3 = this.f;
        Objects.requireNonNull(obj3);
        return i(obj3);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f instanceof zo3;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f;
        return (obj != null) & j(obj);
    }

    public final boolean l() {
        Object obj = this.f;
        return (obj instanceof zo3) && ((zo3) obj).a;
    }

    public final void m(n70 n70Var) {
        cp3 cp3Var;
        n70Var.getClass();
        Object obj = this.f;
        if (obj == null) {
            if (n70Var.isDone()) {
                if (op3.l.L(this, null, h(n70Var))) {
                    o(this, false);
                    return;
                }
                return;
            }
            ap3 ap3Var = new ap3(this, n70Var);
            if (op3.l.L(this, null, ap3Var)) {
                try {
                    n70Var.c(ap3Var, dq3.f);
                    return;
                } catch (Throwable th) {
                    try {
                        cp3Var = new cp3(th);
                    } catch (Error | Exception unused) {
                        cp3Var = cp3.b;
                    }
                    op3.l.L(this, ap3Var, cp3Var);
                    return;
                }
            }
            obj = this.f;
        }
        if (obj instanceof zo3) {
            n70Var.cancel(((zo3) obj).a);
        }
    }

    public final void n(Future future) {
        if ((future != null) && (this.f instanceof zo3)) {
            future.cancel(l());
        }
    }

    public final void p(StringBuilder sb) {
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
                } catch (ExecutionException e) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e.getCause());
                    sb.append("]");
                    return;
                } catch (Exception e2) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e2.getClass());
                    sb.append(" thrown from get()]");
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
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    public String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            p(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f;
            if (obj instanceof ap3) {
                sb.append(", setFuture=[");
                n70 n70Var = ((ap3) obj).g;
                try {
                    if (n70Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(n70Var);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = g();
                    if (yc0.s(strConcat)) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                p(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j2;
        boolean z;
        np3 np3Var = np3.c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f;
            if ((obj != null) & j(obj)) {
                return i(obj);
            }
            long j3 = 0;
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                np3 np3Var2 = this.h;
                if (np3Var2 != np3Var) {
                    np3 np3Var3 = new np3();
                    z = true;
                    while (true) {
                        ob1 ob1Var = op3.l;
                        ob1Var.A(np3Var3, np3Var2);
                        if (ob1Var.E(this, np3Var2, np3Var3)) {
                            j2 = j3;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f;
                                    if ((obj2 != null) & j(obj2)) {
                                        return i(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    b(np3Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            b(np3Var3);
                        } else {
                            long j4 = j3;
                            np3Var2 = this.h;
                            if (np3Var2 == np3Var) {
                                break;
                            }
                            j3 = j4;
                        }
                    }
                }
                Object obj3 = this.f;
                Objects.requireNonNull(obj3);
                return i(obj3);
            }
            j2 = 0;
            z = true;
            while (nanos > j2) {
                Object obj4 = this.f;
                if ((obj4 != null ? z : false) & j(obj4)) {
                    return i(obj4);
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
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
            ex0.p(sb, "Waited ", j, " ");
            sb.append(lowerCase2);
            String string3 = sb.toString();
            if (nanos + 1000 < j2) {
                String strConcat = string3.concat(" (plus ");
                long j5 = -nanos;
                long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
                long nanos2 = j5 - timeUnit.toNanos(jConvert);
                boolean z2 = (jConvert == j2 || nanos2 > 1000) ? z : false;
                if (jConvert > j2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                    ex0.p(sb2, strConcat, jConvert, " ");
                    sb2.append(lowerCase);
                    String string4 = sb2.toString();
                    if (z2) {
                        string4 = string4.concat(",");
                    }
                    strConcat = string4.concat(" ");
                }
                if (z2) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                    sb3.append(strConcat);
                    sb3.append(nanos2);
                    sb3.append(" nanoseconds ");
                    strConcat = sb3.toString();
                }
                string3 = strConcat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(ex0.l(new StringBuilder(string3.length() + 5 + String.valueOf(string).length()), string3, " for ", string));
        }
        throw new InterruptedException();
    }

    public void f() {
    }

    public void k() {
    }
}
