package d2;

import N7.G8;
import androidx.work.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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

/* compiled from: AbstractFuture.java */
/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4266a<V> implements A4.a<V> {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f37345e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f37346f = Logger.getLogger(AbstractC4266a.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC0437a f37347g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f37348h;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f37349b;

    /* renamed from: c, reason: collision with root package name */
    public volatile d f37350c;

    /* renamed from: d, reason: collision with root package name */
    public volatile h f37351d;

    /* compiled from: AbstractFuture.java */
    /* renamed from: d2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0437a {
        public abstract boolean a(AbstractC4266a<?> abstractC4266a, d dVar, d dVar2);

        public abstract boolean b(AbstractC4266a<?> abstractC4266a, Object obj, Object obj2);

        public abstract boolean c(AbstractC4266a<?> abstractC4266a, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: d2.a$b */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f37352c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f37353d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f37354a;

        /* renamed from: b, reason: collision with root package name */
        public final CancellationException f37355b;

        static {
            if (AbstractC4266a.f37345e) {
                f37353d = null;
                f37352c = null;
            } else {
                f37353d = new b(false, null);
                f37352c = new b(true, null);
            }
        }

        public b(boolean z10, CancellationException cancellationException) {
            this.f37354a = z10;
            this.f37355b = cancellationException;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: d2.a$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f37356b = new c(new C0438a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f37357a;

        /* compiled from: AbstractFuture.java */
        /* renamed from: d2.a$c$a, reason: collision with other inner class name */
        public class C0438a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th) {
            boolean z10 = AbstractC4266a.f37345e;
            th.getClass();
            this.f37357a = th;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: d2.a$d */
    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        public static final d f37358d = new d(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f37359a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f37360b;

        /* renamed from: c, reason: collision with root package name */
        public d f37361c;

        public d(Runnable runnable, Executor executor) {
            this.f37359a = runnable;
            this.f37360b = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: d2.a$e */
    public static final class e extends AbstractC0437a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f37362a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f37363b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractC4266a, h> f37364c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractC4266a, d> f37365d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractC4266a, Object> f37366e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC4266a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC4266a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC4266a, Object> atomicReferenceFieldUpdater5) {
            this.f37362a = atomicReferenceFieldUpdater;
            this.f37363b = atomicReferenceFieldUpdater2;
            this.f37364c = atomicReferenceFieldUpdater3;
            this.f37365d = atomicReferenceFieldUpdater4;
            this.f37366e = atomicReferenceFieldUpdater5;
        }

        @Override // d2.AbstractC4266a.AbstractC0437a
        public final boolean a(AbstractC4266a<?> abstractC4266a, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<AbstractC4266a, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f37365d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC4266a, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC4266a) == dVar);
            return false;
        }

        @Override // d2.AbstractC4266a.AbstractC0437a
        public final boolean b(AbstractC4266a<?> abstractC4266a, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractC4266a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f37366e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC4266a, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC4266a) == obj);
            return false;
        }

        @Override // d2.AbstractC4266a.AbstractC0437a
        public final boolean c(AbstractC4266a<?> abstractC4266a, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<AbstractC4266a, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f37364c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC4266a, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC4266a) == hVar);
            return false;
        }

        @Override // d2.AbstractC4266a.AbstractC0437a
        public final void d(h hVar, h hVar2) {
            this.f37363b.lazySet(hVar, hVar2);
        }

        @Override // d2.AbstractC4266a.AbstractC0437a
        public final void e(h hVar, Thread thread) {
            this.f37362a.lazySet(hVar, thread);
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: d2.a$f */
    public static final class f<V> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final C4268c f37367b;

        /* renamed from: c, reason: collision with root package name */
        public final A4.a<? extends V> f37368c;

        public f(C4268c c4268c, A4.a aVar) {
            this.f37367b = c4268c;
            this.f37368c = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f37367b.f37349b != this) {
                return;
            }
            if (AbstractC4266a.f37347g.b(this.f37367b, this, AbstractC4266a.e(this.f37368c))) {
                AbstractC4266a.b(this.f37367b);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: d2.a$g */
    public static final class g extends AbstractC0437a {
        @Override // d2.AbstractC4266a.AbstractC0437a
        public final boolean a(AbstractC4266a<?> abstractC4266a, d dVar, d dVar2) {
            synchronized (abstractC4266a) {
                try {
                    if (abstractC4266a.f37350c != dVar) {
                        return false;
                    }
                    abstractC4266a.f37350c = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // d2.AbstractC4266a.AbstractC0437a
        public final boolean b(AbstractC4266a<?> abstractC4266a, Object obj, Object obj2) {
            synchronized (abstractC4266a) {
                try {
                    if (abstractC4266a.f37349b != obj) {
                        return false;
                    }
                    abstractC4266a.f37349b = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // d2.AbstractC4266a.AbstractC0437a
        public final boolean c(AbstractC4266a<?> abstractC4266a, h hVar, h hVar2) {
            synchronized (abstractC4266a) {
                try {
                    if (abstractC4266a.f37351d != hVar) {
                        return false;
                    }
                    abstractC4266a.f37351d = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // d2.AbstractC4266a.AbstractC0437a
        public final void d(h hVar, h hVar2) {
            hVar.f37371b = hVar2;
        }

        @Override // d2.AbstractC4266a.AbstractC0437a
        public final void e(h hVar, Thread thread) {
            hVar.f37370a = thread;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: d2.a$h */
    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f37369c = new h();

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f37370a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f37371b;

        public h() {
            AbstractC4266a.f37347g.e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC0437a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4266a.class, h.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4266a.class, d.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4266a.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f37347g = gVar;
        if (th != null) {
            f37346f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f37348h = new Object();
    }

    public static void b(AbstractC4266a<?> abstractC4266a) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = abstractC4266a.f37351d;
            if (f37347g.c(abstractC4266a, hVar, h.f37369c)) {
                while (hVar != null) {
                    Thread thread = hVar.f37370a;
                    if (thread != null) {
                        hVar.f37370a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f37371b;
                }
                do {
                    dVar = abstractC4266a.f37350c;
                } while (!f37347g.a(abstractC4266a, dVar, d.f37358d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f37361c;
                    dVar3.f37361c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f37361c;
                    Runnable runnable = dVar2.f37359a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        abstractC4266a = fVar.f37367b;
                        if (abstractC4266a.f37349b == fVar) {
                            if (f37347g.b(abstractC4266a, fVar, e(fVar.f37368c))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, dVar2.f37360b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f37346f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            CancellationException cancellationException = ((b) obj).f37355b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f37357a);
        }
        if (obj == f37348h) {
            return null;
        }
        return obj;
    }

    public static Object e(A4.a<?> aVar) {
        if (aVar instanceof AbstractC4266a) {
            Object obj = ((AbstractC4266a) aVar).f37349b;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            return bVar.f37354a ? bVar.f37355b != null ? new b(false, bVar.f37355b) : b.f37353d : obj;
        }
        boolean zIsCancelled = aVar.isCancelled();
        if ((!f37345e) && zIsCancelled) {
            return b.f37353d;
        }
        try {
            Object objF = f(aVar);
            return objF == null ? f37348h : objF;
        } catch (CancellationException e4) {
            if (zIsCancelled) {
                return new b(false, e4);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e4));
        } catch (ExecutionException e10) {
            return new c(e10.getCause());
        } catch (Throwable th) {
            return new c(th);
        }
    }

    public static Object f(A4.a aVar) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = aVar.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objF = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(objF == this ? "this future" : String.valueOf(objF));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append("]");
        }
    }

    @Override // A4.a
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        d dVar = this.f37350c;
        d dVar2 = d.f37358d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f37361c = dVar;
                if (f37347g.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f37350c;
                }
            } while (dVar != dVar2);
        }
        c(runnable, executor);
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
            java.lang.Object r0 = r7.f37349b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof d2.AbstractC4266a.f
            r3 = r3 | r4
            if (r3 == 0) goto L5b
            boolean r3 = d2.AbstractC4266a.f37345e
            if (r3 == 0) goto L1f
            d2.a$b r3 = new d2.a$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            d2.a$b r3 = d2.AbstractC4266a.b.f37352c
            goto L26
        L24:
            d2.a$b r3 = d2.AbstractC4266a.b.f37353d
        L26:
            r4 = r7
            r5 = r2
        L28:
            d2.a$a r6 = d2.AbstractC4266a.f37347g
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L54
            b(r4)
            boolean r4 = r0 instanceof d2.AbstractC4266a.f
            if (r4 == 0) goto L53
            d2.a$f r0 = (d2.AbstractC4266a.f) r0
            A4.a<? extends V> r0 = r0.f37368c
            boolean r4 = r0 instanceof d2.AbstractC4266a
            if (r4 == 0) goto L50
            r4 = r0
            d2.a r4 = (d2.AbstractC4266a) r4
            java.lang.Object r0 = r4.f37349b
            if (r0 != 0) goto L48
            r5 = r1
            goto L49
        L48:
            r5 = r2
        L49:
            boolean r6 = r0 instanceof d2.AbstractC4266a.f
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r1
            goto L28
        L50:
            r0.cancel(r8)
        L53:
            return r1
        L54:
            java.lang.Object r0 = r4.f37349b
            boolean r6 = r0 instanceof d2.AbstractC4266a.f
            if (r6 != 0) goto L28
            return r5
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.AbstractC4266a.cancel(boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.f37349b;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            A4.a<? extends V> aVar = ((f) obj).f37368c;
            return B4.f.c(sb, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final V get(long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f37349b;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f37351d;
            h hVar2 = h.f37369c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                z10 = true;
                do {
                    AbstractC0437a abstractC0437a = f37347g;
                    abstractC0437a.d(hVar3, hVar);
                    if (abstractC0437a.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f37349b;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(hVar3);
                    } else {
                        hVar = this.f37351d;
                    }
                } while (hVar != hVar2);
            }
            return (V) d(this.f37349b);
        }
        z10 = true;
        while (nanos > 0) {
            Object obj3 = this.f37349b;
            if ((obj3 != null ? z10 : false) && (!(obj3 instanceof f))) {
                return (V) d(obj3);
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
        StringBuilder sbJ = s.j("Waited ", " ", j4);
        sbJ.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbJ.toString();
        if (nanos + 1000 < 0) {
            String strS = G8.s(string3, " (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z11 = (jConvert == 0 || nanos2 > 1000) ? z10 : false;
            if (jConvert > 0) {
                String strS2 = strS + jConvert + " " + lowerCase;
                if (z11) {
                    strS2 = G8.s(strS2, StringUtils.COMMA);
                }
                strS = G8.s(strS2, " ");
            }
            if (z11) {
                strS = strS + nanos2 + " nanoseconds ";
            }
            string3 = G8.s(strS, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(G8.s(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(B4.g.o(string3, " for ", string));
    }

    public final void h(h hVar) {
        hVar.f37370a = null;
        while (true) {
            h hVar2 = this.f37351d;
            if (hVar2 == h.f37369c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f37371b;
                if (hVar2.f37370a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f37371b = hVar4;
                    if (hVar3.f37370a == null) {
                        break;
                    }
                } else if (!f37347g.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f37349b instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f37349b != null);
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f37349b instanceof b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e4) {
                strG = "Exception thrown from implementation: " + e4.getClass();
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
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f37349b;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) d(obj2);
            }
            h hVar = this.f37351d;
            h hVar2 = h.f37369c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    AbstractC0437a abstractC0437a = f37347g;
                    abstractC0437a.d(hVar3, hVar);
                    if (abstractC0437a.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f37349b;
                            } else {
                                h(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) d(obj);
                    }
                    hVar = this.f37351d;
                } while (hVar != hVar2);
            }
            return (V) d(this.f37349b);
        }
        throw new InterruptedException();
    }
}
