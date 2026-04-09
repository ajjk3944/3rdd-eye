package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
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

/* loaded from: classes.dex */
public abstract class YC extends AbstractC1198gD {
    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(InterfaceFutureC2326a interfaceFutureC2326a) {
        Object obj;
        Throwable thB;
        if (interfaceFutureC2326a instanceof WC) {
            Object rc = ((YC) interfaceFutureC2326a).f14234a;
            if (rc instanceof RC) {
                RC rc2 = (RC) rc;
                if (rc2.f10870a) {
                    Throwable th = rc2.f10871b;
                    rc = th != null ? new RC(th, false) : RC.f10869d;
                }
            }
            Objects.requireNonNull(rc);
            return rc;
        }
        if ((interfaceFutureC2326a instanceof UD) && (thB = ((UD) interfaceFutureC2326a).b()) != null) {
            return new UC(thB);
        }
        boolean zIsCancelled = interfaceFutureC2326a.isCancelled();
        boolean z6 = true;
        if ((!AbstractC1198gD.f14232f) && zIsCancelled) {
            RC rc3 = RC.f10869d;
            Objects.requireNonNull(rc3);
            return rc3;
        }
        boolean z7 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = interfaceFutureC2326a.get();
                        break;
                    } catch (Error | Exception e6) {
                        e = e6;
                        return new UC(e);
                    } catch (CancellationException e7) {
                        return !zIsCancelled ? new UC(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC2326a)), e7)) : new RC(e7, false);
                    } catch (ExecutionException e8) {
                        return zIsCancelled ? new RC(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC2326a)), e8), false) : new UC(e8.getCause());
                    }
                } catch (InterruptedException unused) {
                    z7 = z6;
                } catch (Throwable th2) {
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error e9) {
                e = e9;
                return new UC(e);
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? AbstractC1198gD.f14230d : obj;
        }
        String strValueOf = String.valueOf(interfaceFutureC2326a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
        sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
        sb.append(strValueOf);
        return new RC(new IllegalArgumentException(sb.toString()), false);
    }

    public static Object i(Object obj) throws ExecutionException {
        if (obj instanceof RC) {
            Throwable th = ((RC) obj).f10871b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof UC) {
            throw new ExecutionException(((UC) obj).f11624a);
        }
        if (obj == AbstractC1198gD.f14230d) {
            return null;
        }
        return obj;
    }

    public static boolean j(Object obj) {
        return !(obj instanceof SC);
    }

    public static void o(YC yc, boolean z6) {
        VC vc = null;
        while (true) {
            for (C1143fD c1143fDU = AbstractC1198gD.f14233g.U(yc); c1143fDU != null; c1143fDU = c1143fDU.f14044b) {
                Thread thread = c1143fDU.f14043a;
                if (thread != null) {
                    c1143fDU.f14043a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z6) {
                yc.k();
            }
            yc.f();
            VC vc2 = vc;
            VC vcA0 = AbstractC1198gD.f14233g.a0(yc);
            VC vc3 = vc2;
            while (vcA0 != null) {
                VC vc4 = vcA0.f11969c;
                vcA0.f11969c = vc3;
                vc3 = vcA0;
                vcA0 = vc4;
            }
            while (vc3 != null) {
                Runnable runnable = vc3.f11967a;
                vc = vc3.f11969c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof SC) {
                    SC sc = (SC) runnable;
                    yc = sc.f11153a;
                    if (yc.f14234a == sc) {
                        if (AbstractC1198gD.f14233g.e0(yc, sc, h(sc.f11154b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = vc3.f11968b;
                    Objects.requireNonNull(executor);
                    q(runnable, executor);
                }
                vc3 = vc;
            }
            return;
            z6 = false;
        }
    }

    public static void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e6) {
            Logger loggerA = AbstractC1198gD.f14231e.a();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", AbstractC1135f5.o(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e6);
        }
    }

    public void a(Runnable runnable, Executor executor) {
        VC vc;
        VC vc2 = VC.f11966d;
        AbstractC0582Jp.j0(runnable, "Runnable was null.");
        AbstractC0582Jp.j0(executor, "Executor was null.");
        if (!isDone() && (vc = this.f14235b) != vc2) {
            VC vc3 = new VC(runnable, executor);
            do {
                vc3.f11969c = vc;
                if (AbstractC1198gD.f14233g.S(this, vc, vc3)) {
                    return;
                } else {
                    vc = this.f14235b;
                }
            } while (vc != vc2);
        }
        q(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.UD
    public final Throwable b() {
        if (!(this instanceof WC)) {
            return null;
        }
        Object obj = this.f14234a;
        if (obj instanceof UC) {
            return ((UC) obj).f11624a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f14234a
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.SC
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
            boolean r1 = com.google.android.gms.internal.ads.AbstractC1198gD.f14232f
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.RC r1 = new com.google.android.gms.internal.ads.RC
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r4, r8)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.RC r1 = com.google.android.gms.internal.ads.RC.f10868c
            goto L26
        L24:
            com.google.android.gms.internal.ads.RC r1 = com.google.android.gms.internal.ads.RC.f10869d
        L26:
            j$.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.ads.Jp r6 = com.google.android.gms.internal.ads.AbstractC1198gD.f14233g
            boolean r6 = r6.e0(r4, r0, r1)
            if (r6 == 0) goto L58
            o(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.SC
            if (r4 == 0) goto L57
            com.google.android.gms.internal.ads.SC r0 = (com.google.android.gms.internal.ads.SC) r0
            f4.a r0 = r0.f11154b
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.WC
            if (r4 == 0) goto L54
            r4 = r0
            com.google.android.gms.internal.ads.YC r4 = (com.google.android.gms.internal.ads.YC) r4
            java.lang.Object r0 = r4.f14234a
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.SC
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
            java.lang.Object r0 = r4.f14234a
            boolean r6 = j(r0)
            if (r6 == 0) goto L2b
            return r5
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.YC.cancel(boolean):boolean");
    }

    public boolean d(Object obj) {
        if (obj == null) {
            obj = AbstractC1198gD.f14230d;
        }
        if (!AbstractC1198gD.f14233g.e0(this, null, obj)) {
            return false;
        }
        o(this, false);
        return true;
    }

    public boolean e(Throwable th) {
        th.getClass();
        if (!AbstractC1198gD.f14233g.e0(this, null, new UC(th))) {
            return false;
        }
        o(this, false);
        return true;
    }

    public void f() {
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

    public Object get() throws InterruptedException {
        Object obj;
        C1143fD c1143fD = C1143fD.f14042c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f14234a;
        if ((obj2 != null) && j(obj2)) {
            return i(obj2);
        }
        C1143fD c1143fD2 = this.f14236c;
        if (c1143fD2 != c1143fD) {
            C1143fD c1143fD3 = new C1143fD();
            do {
                AbstractC0582Jp abstractC0582Jp = AbstractC1198gD.f14233g;
                abstractC0582Jp.w(c1143fD3, c1143fD2);
                if (abstractC0582Jp.M(this, c1143fD2, c1143fD3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            c(c1143fD3);
                            throw new InterruptedException();
                        }
                        obj = this.f14234a;
                    } while (!((obj != null) & j(obj)));
                    return i(obj);
                }
                c1143fD2 = this.f14236c;
            } while (c1143fD2 != c1143fD);
        }
        Object obj3 = this.f14234a;
        Objects.requireNonNull(obj3);
        return i(obj3);
    }

    public boolean isCancelled() {
        return this.f14234a instanceof RC;
    }

    public boolean isDone() {
        Object obj = this.f14234a;
        return (obj != null) & j(obj);
    }

    public void k() {
    }

    public final boolean l() {
        Object obj = this.f14234a;
        return (obj instanceof RC) && ((RC) obj).f10870a;
    }

    public final void m(InterfaceFutureC2326a interfaceFutureC2326a) {
        UC uc;
        interfaceFutureC2326a.getClass();
        Object obj = this.f14234a;
        if (obj == null) {
            if (interfaceFutureC2326a.isDone()) {
                if (AbstractC1198gD.f14233g.e0(this, null, h(interfaceFutureC2326a))) {
                    o(this, false);
                    return;
                }
                return;
            }
            SC sc = new SC(this, interfaceFutureC2326a);
            if (AbstractC1198gD.f14233g.e0(this, null, sc)) {
                try {
                    interfaceFutureC2326a.a(sc, EnumC2059wD.f17407a);
                    return;
                } catch (Throwable th) {
                    try {
                        uc = new UC(th);
                    } catch (Error | Exception unused) {
                        uc = UC.f11623b;
                    }
                    AbstractC1198gD.f14233g.e0(this, sc, uc);
                    return;
                }
            }
            obj = this.f14234a;
        }
        if (obj instanceof RC) {
            interfaceFutureC2326a.cancel(((RC) obj).f10870a);
        }
    }

    public final void n(Future future) {
        if ((future != null) && (this.f14234a instanceof RC)) {
            future.cancel(l());
        }
    }

    public final void p(StringBuilder sb) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (ExecutionException e6) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e6.getCause());
                    sb.append("]");
                    return;
                } catch (Exception e7) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e7.getClass());
                    sb.append(" thrown from get()]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
            Object obj = this.f14234a;
            if (obj instanceof SC) {
                sb.append(", setFuture=[");
                InterfaceFutureC2326a interfaceFutureC2326a = ((SC) obj).f11154b;
                try {
                    if (interfaceFutureC2326a == this) {
                        sb.append("this future");
                    } else {
                        sb.append(interfaceFutureC2326a);
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
                    if (C1476lN.k(strConcat)) {
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

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00c6 -> B:37:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object get(long r21, java.util.concurrent.TimeUnit r23) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.YC.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
