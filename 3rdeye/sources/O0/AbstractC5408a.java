package o0;

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

/* compiled from: AbstractResolvableFuture.java */
/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5408a<V> implements A4.a<V> {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f44775e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f44776f = Logger.getLogger(AbstractC5408a.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC0505a f44777g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f44778h;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f44779b;

    /* renamed from: c, reason: collision with root package name */
    public volatile d f44780c;

    /* renamed from: d, reason: collision with root package name */
    public volatile h f44781d;

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: o0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0505a {
        public abstract boolean a(AbstractC5408a<?> abstractC5408a, d dVar, d dVar2);

        public abstract boolean b(AbstractC5408a<?> abstractC5408a, Object obj, Object obj2);

        public abstract boolean c(AbstractC5408a<?> abstractC5408a, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: o0.a$b */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f44782c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f44783d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f44784a;

        /* renamed from: b, reason: collision with root package name */
        public final CancellationException f44785b;

        static {
            if (AbstractC5408a.f44775e) {
                f44783d = null;
                f44782c = null;
            } else {
                f44783d = new b(false, null);
                f44782c = new b(true, null);
            }
        }

        public b(boolean z10, CancellationException cancellationException) {
            this.f44784a = z10;
            this.f44785b = cancellationException;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: o0.a$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f44786a;

        /* compiled from: AbstractResolvableFuture.java */
        /* renamed from: o0.a$c$a, reason: collision with other inner class name */
        public class C0506a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new C0506a("Failure occurred while trying to finish a future."));
        }

        public c(Throwable th) {
            boolean z10 = AbstractC5408a.f44775e;
            th.getClass();
            this.f44786a = th;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: o0.a$d */
    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        public static final d f44787d = new d(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f44788a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f44789b;

        /* renamed from: c, reason: collision with root package name */
        public d f44790c;

        public d(Runnable runnable, Executor executor) {
            this.f44788a = runnable;
            this.f44789b = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: o0.a$e */
    public static final class e extends AbstractC0505a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f44791a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f44792b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractC5408a, h> f44793c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractC5408a, d> f44794d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractC5408a, Object> f44795e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC5408a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC5408a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC5408a, Object> atomicReferenceFieldUpdater5) {
            this.f44791a = atomicReferenceFieldUpdater;
            this.f44792b = atomicReferenceFieldUpdater2;
            this.f44793c = atomicReferenceFieldUpdater3;
            this.f44794d = atomicReferenceFieldUpdater4;
            this.f44795e = atomicReferenceFieldUpdater5;
        }

        @Override // o0.AbstractC5408a.AbstractC0505a
        public final boolean a(AbstractC5408a<?> abstractC5408a, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<AbstractC5408a, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f44794d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC5408a, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC5408a) == dVar);
            return false;
        }

        @Override // o0.AbstractC5408a.AbstractC0505a
        public final boolean b(AbstractC5408a<?> abstractC5408a, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractC5408a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f44795e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC5408a, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC5408a) == obj);
            return false;
        }

        @Override // o0.AbstractC5408a.AbstractC0505a
        public final boolean c(AbstractC5408a<?> abstractC5408a, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<AbstractC5408a, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f44793c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC5408a, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC5408a) == hVar);
            return false;
        }

        @Override // o0.AbstractC5408a.AbstractC0505a
        public final void d(h hVar, h hVar2) {
            this.f44792b.lazySet(hVar, hVar2);
        }

        @Override // o0.AbstractC5408a.AbstractC0505a
        public final void e(h hVar, Thread thread) {
            this.f44791a.lazySet(hVar, thread);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: o0.a$f */
    public static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: o0.a$g */
    public static final class g extends AbstractC0505a {
        @Override // o0.AbstractC5408a.AbstractC0505a
        public final boolean a(AbstractC5408a<?> abstractC5408a, d dVar, d dVar2) {
            synchronized (abstractC5408a) {
                try {
                    if (abstractC5408a.f44780c != dVar) {
                        return false;
                    }
                    abstractC5408a.f44780c = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o0.AbstractC5408a.AbstractC0505a
        public final boolean b(AbstractC5408a<?> abstractC5408a, Object obj, Object obj2) {
            synchronized (abstractC5408a) {
                try {
                    if (abstractC5408a.f44779b != obj) {
                        return false;
                    }
                    abstractC5408a.f44779b = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o0.AbstractC5408a.AbstractC0505a
        public final boolean c(AbstractC5408a<?> abstractC5408a, h hVar, h hVar2) {
            synchronized (abstractC5408a) {
                try {
                    if (abstractC5408a.f44781d != hVar) {
                        return false;
                    }
                    abstractC5408a.f44781d = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o0.AbstractC5408a.AbstractC0505a
        public final void d(h hVar, h hVar2) {
            hVar.f44798b = hVar2;
        }

        @Override // o0.AbstractC5408a.AbstractC0505a
        public final void e(h hVar, Thread thread) {
            hVar.f44797a = thread;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: o0.a$h */
    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f44796c = new h();

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f44797a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f44798b;

        public h() {
            AbstractC5408a.f44777g.e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC0505a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5408a.class, h.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5408a.class, d.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5408a.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f44777g = gVar;
        if (th != null) {
            f44776f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f44778h = new Object();
    }

    public static void c(AbstractC5408a<?> abstractC5408a) {
        h hVar;
        d dVar;
        do {
            hVar = abstractC5408a.f44781d;
        } while (!f44777g.c(abstractC5408a, hVar, h.f44796c));
        while (hVar != null) {
            Thread thread = hVar.f44797a;
            if (thread != null) {
                hVar.f44797a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f44798b;
        }
        abstractC5408a.b();
        do {
            dVar = abstractC5408a.f44780c;
        } while (!f44777g.a(abstractC5408a, dVar, d.f44787d));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f44790c;
            dVar.f44790c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.f44790c;
            Runnable runnable = dVar2.f44788a;
            if (runnable instanceof f) {
                ((f) runnable).getClass();
                throw null;
            }
            d(runnable, dVar2.f44789b);
            dVar2 = dVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f44776f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            CancellationException cancellationException = ((b) obj).f44785b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f44786a);
        }
        if (obj == f44778h) {
            return null;
        }
        return obj;
    }

    public static Object f(AbstractC5408a abstractC5408a) throws ExecutionException {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = abstractC5408a.get();
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
        d dVar = this.f44780c;
        d dVar2 = d.f44787d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f44790c = dVar;
                if (f44777g.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f44780c;
                }
            } while (dVar != dVar2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f44779b;
        if ((obj == null) | (obj instanceof f)) {
            b bVar = f44775e ? new b(z10, new CancellationException("Future.cancel() was called.")) : z10 ? b.f44782c : b.f44783d;
            while (!f44777g.b(this, obj, bVar)) {
                obj = this.f44779b;
                if (!(obj instanceof f)) {
                }
            }
            c(this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        Object obj = this.f44779b;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ((f) obj).getClass();
            sb.append("null");
            sb.append("]");
            return sb.toString();
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
        Object obj = this.f44779b;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f44781d;
            h hVar2 = h.f44796c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                z10 = true;
                do {
                    AbstractC0505a abstractC0505a = f44777g;
                    abstractC0505a.d(hVar3, hVar);
                    if (abstractC0505a.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f44779b;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(hVar3);
                    } else {
                        hVar = this.f44781d;
                    }
                } while (hVar != hVar2);
            }
            return (V) e(this.f44779b);
        }
        z10 = true;
        while (nanos > 0) {
            Object obj3 = this.f44779b;
            if ((obj3 != null ? z10 : false) && (!(obj3 instanceof f))) {
                return (V) e(obj3);
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
        hVar.f44797a = null;
        while (true) {
            h hVar2 = this.f44781d;
            if (hVar2 == h.f44796c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f44798b;
                if (hVar2.f44797a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f44798b = hVar4;
                    if (hVar3.f44797a == null) {
                        break;
                    }
                } else if (!f44777g.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public boolean i(V v10) {
        if (v10 == null) {
            v10 = (V) f44778h;
        }
        if (!f44777g.b(this, null, v10)) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f44779b instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f44779b != null);
    }

    public boolean j(Throwable th) {
        th.getClass();
        if (!f44777g.b(this, null, new c(th))) {
            return false;
        }
        c(this);
        return true;
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f44779b instanceof b) {
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

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f44779b;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) e(obj2);
            }
            h hVar = this.f44781d;
            h hVar2 = h.f44796c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    AbstractC0505a abstractC0505a = f44777g;
                    abstractC0505a.d(hVar3, hVar);
                    if (abstractC0505a.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f44779b;
                            } else {
                                h(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) e(obj);
                    }
                    hVar = this.f44781d;
                } while (hVar != hVar2);
            }
            return (V) e(this.f44779b);
        }
        throw new InterruptedException();
    }
}
