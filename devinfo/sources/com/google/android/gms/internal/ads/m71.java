package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class m71 extends u71 {
    /* JADX WARN: Multi-variable type inference failed */
    public static Object i(vd.b bVar) {
        Object obj;
        Throwable thB;
        if (bVar instanceof k71) {
            Object f71Var = ((m71) bVar).f17113a;
            if (f71Var instanceof f71) {
                f71 f71Var2 = (f71) f71Var;
                if (f71Var2.f11032a) {
                    Throwable th2 = f71Var2.f11033b;
                    f71Var = th2 != null ? new f71(th2, false) : f71.f11031d;
                }
            }
            Objects.requireNonNull(f71Var);
            return f71Var;
        }
        if ((bVar instanceof i91) && (thB = ((i91) bVar).b()) != null) {
            return new i71(thB);
        }
        boolean zIsCancelled = bVar.isCancelled();
        boolean z3 = true;
        if ((!u71.f17112f) && zIsCancelled) {
            f71 f71Var3 = f71.f11031d;
            Objects.requireNonNull(f71Var3);
            return f71Var3;
        }
        boolean z10 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = bVar.get();
                        break;
                    } catch (Error | Exception e2) {
                        e = e2;
                        return new i71(e);
                    } catch (CancellationException e10) {
                        return !zIsCancelled ? new i71(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(bVar)), e10)) : new f71(e10, false);
                    } catch (ExecutionException e11) {
                        return zIsCancelled ? new f71(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(bVar)), e11), false) : new i71(e11.getCause());
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
                return new i71(e);
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? u71.f17110d : obj;
        }
        String strValueOf = String.valueOf(bVar);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 84);
        sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
        sb2.append(strValueOf);
        return new f71(new IllegalArgumentException(sb2.toString()), false);
    }

    public static Object j(Object obj) throws ExecutionException {
        if (obj instanceof f71) {
            Throwable th2 = ((f71) obj).f11033b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof i71) {
            throw new ExecutionException(((i71) obj).f12164a);
        }
        if (obj == u71.f17110d) {
            return null;
        }
        return obj;
    }

    public static boolean k(Object obj) {
        return !(obj instanceof g71);
    }

    public static void p(m71 m71Var, boolean z3) {
        j71 j71Var = null;
        while (true) {
            for (t71 t71VarT = u71.g.T(m71Var); t71VarT != null; t71VarT = t71VarT.f16730b) {
                Thread thread = t71VarT.f16729a;
                if (thread != null) {
                    t71VarT.f16729a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z3) {
                m71Var.l();
            }
            m71Var.g();
            j71 j71Var2 = j71Var;
            j71 j71VarY = u71.g.Y(m71Var);
            j71 j71Var3 = j71Var2;
            while (j71VarY != null) {
                j71 j71Var4 = j71VarY.f12673c;
                j71VarY.f12673c = j71Var3;
                j71Var3 = j71VarY;
                j71VarY = j71Var4;
            }
            while (j71Var3 != null) {
                Runnable runnable = j71Var3.f12671a;
                j71Var = j71Var3.f12673c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof g71) {
                    g71 g71Var = (g71) runnable;
                    m71Var = g71Var.f11397a;
                    if (m71Var.f17113a == g71Var) {
                        if (u71.g.b0(m71Var, g71Var, i(g71Var.f11398b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = j71Var3.f12672b;
                    Objects.requireNonNull(executor);
                    r(runnable, executor);
                }
                j71Var3 = j71Var;
            }
            return;
            z3 = false;
        }
    }

    public static void r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            Logger loggerA = u71.f17111e.a();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", a0.g.p(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e2);
        }
    }

    @Override // vd.b
    public void a(Runnable runnable, Executor executor) {
        j71 j71Var;
        j71 j71Var2 = j71.f12670d;
        mq0.e0(runnable, "Runnable was null.");
        mq0.e0(executor, "Executor was null.");
        if (!isDone() && (j71Var = this.f17114b) != j71Var2) {
            j71 j71Var3 = new j71(runnable, executor);
            do {
                j71Var3.f12673c = j71Var;
                if (u71.g.R(this, j71Var, j71Var3)) {
                    return;
                } else {
                    j71Var = this.f17114b;
                }
            } while (j71Var != j71Var2);
        }
        r(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.i91
    public final Throwable b() {
        if (!(this instanceof k71)) {
            return null;
        }
        Object obj = this.f17113a;
        if (obj instanceof i71) {
            return ((i71) obj).f12164a;
        }
        return null;
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
            java.lang.Object r0 = r7.f17113a
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.g71
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
            boolean r1 = com.google.android.gms.internal.ads.u71.f17112f
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.f71 r1 = new com.google.android.gms.internal.ads.f71
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r4, r8)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.f71 r1 = com.google.android.gms.internal.ads.f71.f11030c
            goto L26
        L24:
            com.google.android.gms.internal.ads.f71 r1 = com.google.android.gms.internal.ads.f71.f11031d
        L26:
            j$.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.ads.mq0 r6 = com.google.android.gms.internal.ads.u71.g
            boolean r6 = r6.b0(r4, r0, r1)
            if (r6 == 0) goto L58
            p(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.g71
            if (r4 == 0) goto L57
            com.google.android.gms.internal.ads.g71 r0 = (com.google.android.gms.internal.ads.g71) r0
            vd.b r0 = r0.f11398b
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.k71
            if (r4 == 0) goto L54
            r4 = r0
            com.google.android.gms.internal.ads.m71 r4 = (com.google.android.gms.internal.ads.m71) r4
            java.lang.Object r0 = r4.f17113a
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.g71
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
            java.lang.Object r0 = r4.f17113a
            boolean r6 = k(r0)
            if (r6 == 0) goto L2b
            return r5
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m71.cancel(boolean):boolean");
    }

    public boolean e(Object obj) {
        if (obj == null) {
            obj = u71.f17110d;
        }
        if (!u71.g.b0(this, null, obj)) {
            return false;
        }
        p(this, false);
        return true;
    }

    public boolean f(Throwable th2) {
        th2.getClass();
        if (!u71.g.b0(this, null, new i71(th2))) {
            return false;
        }
        p(this, false);
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        t71 t71Var = t71.f16728c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f17113a;
        if ((obj2 != null) && k(obj2)) {
            return j(obj2);
        }
        t71 t71Var2 = this.f17115c;
        if (t71Var2 != t71Var) {
            t71 t71Var3 = new t71();
            do {
                mq0 mq0Var = u71.g;
                mq0Var.w(t71Var3, t71Var2);
                if (mq0Var.L(this, t71Var2, t71Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            d(t71Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f17113a;
                    } while (!((obj != null) & k(obj)));
                    return j(obj);
                }
                t71Var2 = this.f17115c;
            } while (t71Var2 != t71Var);
        }
        Object obj3 = this.f17113a;
        Objects.requireNonNull(obj3);
        return j(obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb2 = new StringBuilder(String.valueOf(delay).length() + 21);
        sb2.append("remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f17113a instanceof f71;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f17113a;
        return (obj != null) & k(obj);
    }

    public final boolean m() {
        Object obj = this.f17113a;
        return (obj instanceof f71) && ((f71) obj).f11032a;
    }

    public final void n(vd.b bVar) {
        i71 i71Var;
        bVar.getClass();
        Object obj = this.f17113a;
        if (obj == null) {
            if (bVar.isDone()) {
                if (u71.g.b0(this, null, i(bVar))) {
                    p(this, false);
                    return;
                }
                return;
            }
            g71 g71Var = new g71(this, bVar);
            if (u71.g.b0(this, null, g71Var)) {
                try {
                    bVar.a(g71Var, k81.f13081a);
                    return;
                } catch (Throwable th2) {
                    try {
                        i71Var = new i71(th2);
                    } catch (Error | Exception unused) {
                        i71Var = i71.f12163b;
                    }
                    u71.g.b0(this, g71Var, i71Var);
                    return;
                }
            }
            obj = this.f17113a;
        }
        if (obj instanceof f71) {
            bVar.cancel(((f71) obj).f11032a);
        }
    }

    public final void o(Future future) {
        if ((future != null) && (this.f17113a instanceof f71)) {
            future.cancel(m());
        }
    }

    public final void q(StringBuilder sb2) {
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

    public String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            q(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f17113a;
            if (obj instanceof g71) {
                sb2.append(", setFuture=[");
                vd.b bVar = ((g71) obj).f11398b;
                try {
                    if (bVar == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(bVar);
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th2.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    strConcat = h();
                    if (yr1.k(strConcat)) {
                        strConcat = null;
                    }
                } catch (Throwable th3) {
                    if ((th3 instanceof Error) && !(th3 instanceof StackOverflowError)) {
                        throw th3;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th3.getClass()));
                }
                if (strConcat != null) {
                    sb2.append(", info=[");
                    sb2.append(strConcat);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                q(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00c6 -> B:37:0x0083). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object get(long r21, java.util.concurrent.TimeUnit r23) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m71.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public void g() {
    }

    public void l() {
    }
}
