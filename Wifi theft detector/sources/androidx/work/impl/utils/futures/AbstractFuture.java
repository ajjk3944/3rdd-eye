package androidx.work.impl.utils.futures;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class AbstractFuture implements com.google.common.util.concurrent.a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f4484d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f4485e = Logger.getLogger(AbstractFuture.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final b f4486f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f4487g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f4488a;

    /* renamed from: b, reason: collision with root package name */
    public volatile d f4489b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f4490c;

    public static final class Failure {

        /* renamed from: b, reason: collision with root package name */
        public static final Failure f4491b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.work.impl.utils.futures.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f4492a;

        public Failure(Throwable th) {
            this.f4492a = (Throwable) AbstractFuture.d(th);
        }
    }

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractFuture abstractFuture, d dVar, d dVar2);

        public abstract boolean b(AbstractFuture abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture abstractFuture, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f4493c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f4494d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4495a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f4496b;

        static {
            if (AbstractFuture.f4484d) {
                f4494d = null;
                f4493c = null;
            } else {
                f4494d = new c(false, null);
                f4493c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th) {
            this.f4495a = z10;
            this.f4496b = th;
        }
    }

    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        public static final d f4497d = new d(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f4498a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f4499b;

        /* renamed from: c, reason: collision with root package name */
        public d f4500c;

        public d(Runnable runnable, Executor executor) {
            this.f4498a = runnable;
            this.f4499b = executor;
        }
    }

    public static final class e extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f4501a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f4502b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f4503c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f4504d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f4505e;

        public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f4501a = atomicReferenceFieldUpdater;
            this.f4502b = atomicReferenceFieldUpdater2;
            this.f4503c = atomicReferenceFieldUpdater3;
            this.f4504d = atomicReferenceFieldUpdater4;
            this.f4505e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean a(AbstractFuture abstractFuture, d dVar, d dVar2) {
            return t.a.a(this.f4504d, abstractFuture, dVar, dVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return t.a.a(this.f4505e, abstractFuture, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean c(AbstractFuture abstractFuture, h hVar, h hVar2) {
            return t.a.a(this.f4503c, abstractFuture, hVar, hVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public void d(h hVar, h hVar2) {
            this.f4502b.lazySet(hVar, hVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public void e(h hVar, Thread thread) {
            this.f4501a.lazySet(hVar, thread);
        }
    }

    public static final class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractFuture f4506a;

        /* renamed from: b, reason: collision with root package name */
        public final com.google.common.util.concurrent.a f4507b;

        public f(AbstractFuture abstractFuture, com.google.common.util.concurrent.a aVar) {
            this.f4506a = abstractFuture;
            this.f4507b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4506a.f4488a != this) {
                return;
            }
            if (AbstractFuture.f4486f.b(this.f4506a, this, AbstractFuture.i(this.f4507b))) {
                AbstractFuture.f(this.f4506a);
            }
        }
    }

    public static final class g extends b {
        public g() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean a(AbstractFuture abstractFuture, d dVar, d dVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f4489b != dVar) {
                        return false;
                    }
                    abstractFuture.f4489b = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f4488a != obj) {
                        return false;
                    }
                    abstractFuture.f4488a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public boolean c(AbstractFuture abstractFuture, h hVar, h hVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f4490c != hVar) {
                        return false;
                    }
                    abstractFuture.f4490c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public void d(h hVar, h hVar2) {
            hVar.f4510b = hVar2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.b
        public void e(h hVar, Thread thread) {
            hVar.f4509a = thread;
        }
    }

    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f4508c = new h(false);

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f4509a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f4510b;

        public h(boolean z10) {
        }

        public void a(h hVar) {
            AbstractFuture.f4486f.d(this, hVar);
        }

        public void b() {
            Thread thread = this.f4509a;
            if (thread != null) {
                this.f4509a = null;
                LockSupport.unpark(thread);
            }
        }

        public h() {
            AbstractFuture.f4486f.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, d.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f4486f = gVar;
        if (th != null) {
            f4485e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4487g = new Object();
    }

    private void a(StringBuilder sb) {
        try {
            Object objJ = j(this);
            sb.append("SUCCESS, result=[");
            sb.append(r(objJ));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append("]");
        }
    }

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void f(AbstractFuture abstractFuture) {
        d dVar = null;
        while (true) {
            abstractFuture.m();
            abstractFuture.b();
            d dVarE = abstractFuture.e(dVar);
            while (dVarE != null) {
                dVar = dVarE.f4500c;
                Runnable runnable = dVarE.f4498a;
                if (runnable instanceof f) {
                    f fVar = (f) runnable;
                    abstractFuture = fVar.f4506a;
                    if (abstractFuture.f4488a == fVar) {
                        if (f4486f.b(abstractFuture, fVar, i(fVar.f4507b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, dVarE.f4499b);
                }
                dVarE = dVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f4485e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f4496b);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f4492a);
        }
        if (obj == f4487g) {
            return null;
        }
        return obj;
    }

    public static Object i(com.google.common.util.concurrent.a aVar) {
        if (aVar instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) aVar).f4488a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f4495a ? cVar.f4496b != null ? new c(false, cVar.f4496b) : c.f4494d : obj;
        }
        boolean zIsCancelled = aVar.isCancelled();
        if ((!f4484d) && zIsCancelled) {
            return c.f4494d;
        }
        try {
            Object objJ = j(aVar);
            return objJ == null ? f4487g : objJ;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
        } catch (ExecutionException e11) {
            return new Failure(e11.getCause());
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    private static Object j(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
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

    private void m() {
        h hVar;
        do {
            hVar = this.f4490c;
        } while (!f4486f.c(this, hVar, h.f4508c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f4510b;
        }
    }

    private String r(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.a
    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        d dVar = this.f4489b;
        if (dVar != d.f4497d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f4500c = dVar;
                if (f4486f.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.f4489b;
                }
            } while (dVar != d.f4497d);
        }
        g(runnable, executor);
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f4488a;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        c cVar = f4484d ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f4493c : c.f4494d;
        AbstractFuture abstractFuture = this;
        boolean z11 = false;
        while (true) {
            if (f4486f.b(abstractFuture, obj, cVar)) {
                if (z10) {
                    abstractFuture.k();
                }
                f(abstractFuture);
                if (!(obj instanceof f)) {
                    break;
                }
                com.google.common.util.concurrent.a aVar = ((f) obj).f4507b;
                if (!(aVar instanceof AbstractFuture)) {
                    aVar.cancel(z10);
                    break;
                }
                abstractFuture = (AbstractFuture) aVar;
                obj = abstractFuture.f4488a;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z11 = true;
            } else {
                obj = abstractFuture.f4488a;
                if (!(obj instanceof f)) {
                    return z11;
                }
            }
        }
        return true;
    }

    public final d e(d dVar) {
        d dVar2;
        do {
            dVar2 = this.f4489b;
        } while (!f4486f.a(this, dVar2, d.f4497d));
        d dVar3 = dVar;
        d dVar4 = dVar2;
        while (dVar4 != null) {
            d dVar5 = dVar4.f4500c;
            dVar4.f4500c = dVar3;
            dVar3 = dVar4;
            dVar4 = dVar5;
        }
        return dVar3;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f4488a;
        if ((obj != null) && (!(obj instanceof f))) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f4490c;
            if (hVar != h.f4508c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f4486f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                n(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f4488a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        n(hVar2);
                    } else {
                        hVar = this.f4490c;
                    }
                } while (hVar != h.f4508c);
            }
            return h(this.f4488a);
        }
        while (nanos > 0) {
            Object obj3 = this.f4488a;
            if ((obj3 != null) && (!(obj3 instanceof f))) {
                return h(obj3);
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
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4488a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f4488a != null);
    }

    public void k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String l() {
        Object obj = this.f4488a;
        if (obj instanceof f) {
            return "setFuture=[" + r(((f) obj).f4507b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void n(h hVar) {
        hVar.f4509a = null;
        while (true) {
            h hVar2 = this.f4490c;
            if (hVar2 == h.f4508c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f4510b;
                if (hVar2.f4509a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f4510b = hVar4;
                    if (hVar3.f4509a == null) {
                        break;
                    }
                } else if (!f4486f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public boolean o(Object obj) {
        if (obj == null) {
            obj = f4487g;
        }
        if (!f4486f.b(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean p(Throwable th) {
        if (!f4486f.b(this, null, new Failure((Throwable) d(th)))) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean q(com.google.common.util.concurrent.a aVar) {
        Failure failure;
        d(aVar);
        Object obj = this.f4488a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f4486f.b(this, null, i(aVar))) {
                    return false;
                }
                f(this);
                return true;
            }
            f fVar = new f(this, aVar);
            if (f4486f.b(this, null, fVar)) {
                try {
                    aVar.addListener(fVar, DirectExecutor.INSTANCE);
                } catch (Throwable th) {
                    try {
                        failure = new Failure(th);
                    } catch (Throwable unused) {
                        failure = Failure.f4491b;
                    }
                    f4486f.b(this, fVar, failure);
                }
                return true;
            }
            obj = this.f4488a;
        }
        if (obj instanceof c) {
            aVar.cancel(((c) obj).f4495a);
        }
        return false;
    }

    public String toString() {
        String strL;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strL = l();
            } catch (RuntimeException e10) {
                strL = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strL != null && !strL.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strL);
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
        if (!Thread.interrupted()) {
            Object obj2 = this.f4488a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return h(obj2);
            }
            h hVar = this.f4490c;
            if (hVar != h.f4508c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f4486f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4488a;
                            } else {
                                n(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return h(obj);
                    }
                    hVar = this.f4490c;
                } while (hVar != h.f4508c);
            }
            return h(this.f4488a);
        }
        throw new InterruptedException();
    }
}
