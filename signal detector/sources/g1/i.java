package g1;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class i implements InterfaceFutureC2326a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f20159d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f20160e = Logger.getLogger(i.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final com.bumptech.glide.c f20161f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f20162g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f20163a;

    /* renamed from: b, reason: collision with root package name */
    public volatile d f20164b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f20165c;

    static {
        com.bumptech.glide.c gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(i.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f20161f = gVar;
        if (th != null) {
            f20160e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f20162g = new Object();
    }

    public static void c(i iVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = iVar.f20165c;
            if (f20161f.f(iVar, hVar, h.f20156c)) {
                while (hVar != null) {
                    Thread thread = hVar.f20157a;
                    if (thread != null) {
                        hVar.f20157a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f20158b;
                }
                do {
                    dVar = iVar.f20164b;
                } while (!f20161f.d(iVar, dVar, d.f20146d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f20149c;
                    dVar3.f20149c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f20149c;
                    Runnable runnable = dVar2.f20147a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        iVar = fVar.f20154a;
                        if (iVar.f20163a == fVar) {
                            if (f20161f.e(iVar, fVar, f(fVar.f20155b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, dVar2.f20148b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            f20160e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof C2330a) {
            Throwable th = ((C2330a) obj).f20142b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f20145a);
        }
        if (obj == f20162g) {
            return null;
        }
        return obj;
    }

    public static Object f(InterfaceFutureC2326a interfaceFutureC2326a) {
        Object obj;
        if (interfaceFutureC2326a instanceof i) {
            Object obj2 = ((i) interfaceFutureC2326a).f20163a;
            if (!(obj2 instanceof C2330a)) {
                return obj2;
            }
            C2330a c2330a = (C2330a) obj2;
            return c2330a.f20141a ? c2330a.f20142b != null ? new C2330a(c2330a.f20142b, false) : C2330a.f20140d : obj2;
        }
        boolean zIsCancelled = interfaceFutureC2326a.isCancelled();
        boolean z6 = true;
        if ((!f20159d) && zIsCancelled) {
            return C2330a.f20140d;
        }
        boolean z7 = false;
        while (true) {
            try {
                try {
                    obj = interfaceFutureC2326a.get();
                    break;
                } catch (CancellationException e6) {
                    if (zIsCancelled) {
                        return new C2330a(e6, false);
                    }
                    return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC2326a, e6));
                } catch (ExecutionException e7) {
                    return new c(e7.getCause());
                } catch (Throwable th) {
                    return new c(th);
                }
            } catch (InterruptedException unused) {
                z7 = z6;
            } catch (Throwable th2) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f20162g : obj;
    }

    @Override // f4.InterfaceFutureC2326a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f20164b;
        d dVar2 = d.f20146d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f20149c = dVar;
                if (f20161f.d(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f20164b;
                }
            } while (dVar != dVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
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
                } catch (RuntimeException e6) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e6.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e7) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e7.getCause());
                    sb.append("]");
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
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
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
            java.lang.Object r0 = r7.f20163a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof g1.f
            r3 = r3 | r4
            if (r3 == 0) goto L5b
            boolean r3 = g1.i.f20159d
            if (r3 == 0) goto L1f
            g1.a r3 = new g1.a
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r4, r8)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            g1.a r3 = g1.C2330a.f20139c
            goto L26
        L24:
            g1.a r3 = g1.C2330a.f20140d
        L26:
            r4 = r7
            r5 = r2
        L28:
            com.bumptech.glide.c r6 = g1.i.f20161f
            boolean r6 = r6.e(r4, r0, r3)
            if (r6 == 0) goto L54
            c(r4)
            boolean r4 = r0 instanceof g1.f
            if (r4 == 0) goto L53
            g1.f r0 = (g1.f) r0
            f4.a r0 = r0.f20155b
            boolean r4 = r0 instanceof g1.i
            if (r4 == 0) goto L50
            r4 = r0
            g1.i r4 = (g1.i) r4
            java.lang.Object r0 = r4.f20163a
            if (r0 != 0) goto L48
            r5 = r1
            goto L49
        L48:
            r5 = r2
        L49:
            boolean r6 = r0 instanceof g1.f
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r1
            goto L28
        L50:
            r0.cancel(r8)
        L53:
            return r1
        L54:
            java.lang.Object r0 = r4.f20163a
            boolean r6 = r0 instanceof g1.f
            if (r6 != 0) goto L28
            return r5
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.i.cancel(boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.f20163a;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            InterfaceFutureC2326a interfaceFutureC2326a = ((f) obj).f20155b;
            return A.f.p(sb, interfaceFutureC2326a == this ? "this future" : String.valueOf(interfaceFutureC2326a), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00b0 -> B:36:0x0078). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.i.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void h(h hVar) {
        hVar.f20157a = null;
        while (true) {
            h hVar2 = this.f20165c;
            if (hVar2 == h.f20156c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f20158b;
                if (hVar2.f20157a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f20158b = hVar4;
                    if (hVar3.f20157a == null) {
                        break;
                    }
                } else if (!f20161f.f(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f20163a instanceof C2330a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f20163a != null);
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f20163a instanceof C2330a) {
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
        h hVar = h.f20156c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f20163a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar2 = this.f20165c;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                do {
                    com.bumptech.glide.c cVar = f20161f;
                    cVar.H(hVar3, hVar2);
                    if (cVar.f(this, hVar2, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f20163a;
                            } else {
                                h(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar2 = this.f20165c;
                } while (hVar2 != hVar);
            }
            return e(this.f20163a);
        }
        throw new InterruptedException();
    }
}
