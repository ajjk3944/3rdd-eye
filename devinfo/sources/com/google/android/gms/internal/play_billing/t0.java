package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t0 extends k0 implements f0 {

    /* renamed from: h, reason: collision with root package name */
    public r0 f20229h;

    /* renamed from: i, reason: collision with root package name */
    public ScheduledFuture f20230i;

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof b0) {
            Throwable th2 = ((b0) obj).f20088b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (!(obj instanceof d0)) {
            if (obj == k0.f20166d) {
                return null;
            }
            return obj;
        }
        Throwable th3 = ((d0) obj).f20100a;
        if (th3 != null) {
            throw new ExecutionException(th3);
        }
        k0.f20167e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
        throw new ExecutionException(d0.f20099c.f20100a);
    }

    public static boolean g(Object obj) {
        return !(obj instanceof c0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(r0 r0Var) {
        Object obj;
        Throwable thB;
        if (r0Var instanceof f0) {
            Object b0Var = ((t0) r0Var).f20169a;
            if (b0Var instanceof b0) {
                b0 b0Var2 = (b0) b0Var;
                if (b0Var2.f20087a) {
                    Throwable th2 = b0Var2.f20088b;
                    b0Var = th2 != null ? new b0(th2, false) : b0.f20086d;
                }
            }
            Objects.requireNonNull(b0Var);
            return b0Var;
        }
        if ((r0Var instanceof u0) && (thB = ((u0) r0Var).b()) != null) {
            return new d0(thB);
        }
        boolean zIsCancelled = r0Var.isCancelled();
        boolean z3 = true;
        if ((!k0.f20168f) && zIsCancelled) {
            b0 b0Var3 = b0.f20086d;
            Objects.requireNonNull(b0Var3);
            return b0Var3;
        }
        boolean z10 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = r0Var.get();
                        break;
                    } catch (Error | Exception e2) {
                        e = e2;
                        return new d0(e);
                    } catch (CancellationException e10) {
                        return !zIsCancelled ? new d0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(r0Var)), e10)) : new b0(e10, false);
                    } catch (ExecutionException e11) {
                        return zIsCancelled ? new b0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(r0Var)), e11), false) : new d0(e11.getCause());
                    }
                } catch (InterruptedException unused) {
                    z10 = z3;
                } catch (Throwable th3) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            } catch (Error e12) {
                e = e12;
                return new d0(e);
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return zIsCancelled ? new b0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(r0Var))), false) : obj == null ? k0.f20166d : obj;
    }

    public static void j(t0 t0Var) {
        e0 e0Var;
        e0 e0Var2 = null;
        while (true) {
            t0Var.getClass();
            for (j0 j0VarD = k0.g.D(t0Var); j0VarD != null; j0VarD = j0VarD.f20158b) {
                Thread thread = j0VarD.f20157a;
                if (thread != null) {
                    j0VarD.f20157a = null;
                    LockSupport.unpark(thread);
                }
            }
            r0 r0Var = t0Var.f20229h;
            if ((t0Var.f20169a instanceof b0) & (r0Var != null)) {
                Object obj = t0Var.f20169a;
                r0Var.cancel((obj instanceof b0) && ((b0) obj).f20087a);
            }
            ScheduledFuture scheduledFuture = t0Var.f20230i;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            t0Var.f20229h = null;
            t0Var.f20230i = null;
            e0 e0Var3 = e0Var2;
            e0 e0VarB = k0.g.B(t0Var);
            e0 e0Var4 = e0Var3;
            while (e0VarB != null) {
                e0 e0Var5 = e0VarB.f20105c;
                e0VarB.f20105c = e0Var4;
                e0Var4 = e0VarB;
                e0VarB = e0Var5;
            }
            while (e0Var4 != null) {
                Runnable runnable = e0Var4.f20103a;
                e0Var = e0Var4.f20105c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof c0) {
                    c0 c0Var = (c0) runnable;
                    t0Var = c0Var.f20093a;
                    if (t0Var.f20169a == c0Var) {
                        if (k0.g.M(t0Var, c0Var, h(c0Var.f20094b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = e0Var4.f20104b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                e0Var4 = e0Var;
            }
            return;
            e0Var2 = e0Var;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            k0.f20167e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", je.u.u("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.u0
    public final Throwable b() {
        if (!(this instanceof f0)) {
            return null;
        }
        Object obj = this.f20169a;
        if (obj instanceof d0) {
            return ((d0) obj).f20100a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.play_billing.r0
    public final void c(Runnable runnable, Executor executor) {
        e0 e0Var;
        e0 e0Var2 = e0.f20102d;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (e0Var = this.f20170b) != e0Var2) {
            e0 e0Var3 = new e0(runnable, executor);
            do {
                e0Var3.f20105c = e0Var;
                if (k0.g.K(this, e0Var, e0Var3)) {
                    return;
                } else {
                    e0Var = this.f20170b;
                }
            } while (e0Var != e0Var2);
        }
        k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        b0 b0Var;
        Object obj = this.f20169a;
        if (!(obj instanceof c0) && !(obj == null)) {
            return false;
        }
        if (k0.f20168f) {
            b0Var = new b0(new CancellationException("Future.cancel() was called."), z3);
        } else {
            b0Var = z3 ? b0.f20085c : b0.f20086d;
            Objects.requireNonNull(b0Var);
        }
        t0 t0Var = this;
        boolean z10 = false;
        while (true) {
            if (k0.g.M(t0Var, obj, b0Var)) {
                j(t0Var);
                if (!(obj instanceof c0)) {
                    break;
                }
                r0 r0Var = ((c0) obj).f20094b;
                if (!(r0Var instanceof f0)) {
                    r0Var.cancel(z3);
                    break;
                }
                t0Var = (t0) r0Var;
                obj = t0Var.f20169a;
                if (!(obj == null) && !(obj instanceof c0)) {
                    break;
                }
                z10 = true;
            } else {
                obj = t0Var.f20169a;
                if (g(obj)) {
                    return z10;
                }
            }
        }
        return true;
    }

    public final String f() {
        r0 r0Var = this.f20229h;
        ScheduledFuture scheduledFuture = this.f20230i;
        if (r0Var == null) {
            return null;
        }
        String strT = d.h.t("inputFuture=[", r0Var.toString(), "]");
        if (scheduledFuture == null) {
            return strT;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strT;
        }
        return strT + ", remaining delay=[" + delay + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        j0 j0Var = j0.f20156c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f20169a;
        if ((obj2 != null) && g(obj2)) {
            return e(obj2);
        }
        j0 j0Var2 = this.f20171c;
        if (j0Var2 != j0Var) {
            j0 j0Var3 = new j0();
            do {
                pk.a aVar = k0.g;
                aVar.G(j0Var3, j0Var2);
                if (aVar.N(this, j0Var2, j0Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            d(j0Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f20169a;
                    } while (!((obj != null) & g(obj)));
                    return e(obj);
                }
                j0Var2 = this.f20171c;
            } while (j0Var2 != j0Var);
        }
        Object obj3 = this.f20169a;
        Objects.requireNonNull(obj3);
        return e(obj3);
    }

    public final void i(StringBuilder sb2) {
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
                } catch (ExecutionException e2) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e2.getCause());
                    sb2.append("]");
                    return;
                } catch (Exception e10) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e10.getClass());
                    sb2.append(" thrown from get()]");
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
        if (obj == null) {
            sb2.append("null");
        } else if (obj == this) {
            sb2.append("this future");
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f20169a instanceof b0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f20169a;
        return (obj != null) & g(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            java.lang.Object r1 = r6.f20169a
            boolean r1 = r1 instanceof com.google.android.gms.internal.play_billing.b0
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Le2
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.i(r0)
            goto Le2
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.f20169a
            boolean r4 = r3 instanceof com.google.android.gms.internal.play_billing.c0
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L9d
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            com.google.android.gms.internal.play_billing.c0 r3 = (com.google.android.gms.internal.play_billing.c0) r3
            com.google.android.gms.internal.play_billing.r0 r3 = r3.f20094b
            if (r3 != r6) goto L7f
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L99
        L7d:
            r3 = move-exception
            goto L83
        L7f:
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L99
        L83:
            boolean r4 = r3 instanceof java.lang.Error
            if (r4 == 0) goto L8f
            boolean r4 = r3 instanceof java.lang.StackOverflowError
            if (r4 == 0) goto L8c
            goto L8f
        L8c:
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        L8f:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L99:
            r0.append(r2)
            goto Ld2
        L9d:
            java.lang.String r3 = r6.f()     // Catch: java.lang.Throwable -> Lac
            r4 = 0
            if (r3 == 0) goto Laa
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lac
            if (r5 == 0) goto Lc5
        Laa:
            r3 = r4
            goto Lc5
        Lac:
            r3 = move-exception
            boolean r4 = r3 instanceof java.lang.Error
            if (r4 == 0) goto Lb9
            boolean r4 = r3 instanceof java.lang.StackOverflowError
            if (r4 == 0) goto Lb6
            goto Lb9
        Lb6:
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        Lb9:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r5.concat(r3)
        Lc5:
            if (r3 == 0) goto Ld2
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Ld2:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Le2
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.i(r0)
        Le2:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.t0.toString():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00c0 -> B:37:0x0080). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.t0.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
