package androidx.concurrent.futures;

import androidx.appcompat.app.z;
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
public abstract class AbstractResolvableFuture implements com.google.common.util.concurrent.a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1479d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f1480e = Logger.getLogger(AbstractResolvableFuture.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final b f1481f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f1482g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f1483a;

    /* renamed from: b, reason: collision with root package name */
    public volatile d f1484b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f1485c;

    public static final class Failure {

        /* renamed from: b, reason: collision with root package name */
        public static final Failure f1486b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.concurrent.futures.AbstractResolvableFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f1487a;

        public Failure(Throwable th) {
            this.f1487a = (Throwable) AbstractResolvableFuture.d(th);
        }
    }

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractResolvableFuture abstractResolvableFuture, d dVar, d dVar2);

        public abstract boolean b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractResolvableFuture abstractResolvableFuture, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f1488c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f1489d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1490a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f1491b;

        static {
            if (AbstractResolvableFuture.f1479d) {
                f1489d = null;
                f1488c = null;
            } else {
                f1489d = new c(false, null);
                f1488c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th) {
            this.f1490a = z10;
            this.f1491b = th;
        }
    }

    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        public static final d f1492d = new d(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f1493a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f1494b;

        /* renamed from: c, reason: collision with root package name */
        public d f1495c;

        public d(Runnable runnable, Executor executor) {
            this.f1493a = runnable;
            this.f1494b = executor;
        }
    }

    public static final class e extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f1496a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f1497b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f1498c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f1499d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f1500e;

        public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f1496a = atomicReferenceFieldUpdater;
            this.f1497b = atomicReferenceFieldUpdater2;
            this.f1498c = atomicReferenceFieldUpdater3;
            this.f1499d = atomicReferenceFieldUpdater4;
            this.f1500e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean a(AbstractResolvableFuture abstractResolvableFuture, d dVar, d dVar2) {
            return t.a.a(this.f1499d, abstractResolvableFuture, dVar, dVar2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            return t.a.a(this.f1500e, abstractResolvableFuture, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean c(AbstractResolvableFuture abstractResolvableFuture, h hVar, h hVar2) {
            return t.a.a(this.f1498c, abstractResolvableFuture, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public void d(h hVar, h hVar2) {
            this.f1497b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public void e(h hVar, Thread thread) {
            this.f1496a.lazySet(hVar, thread);
        }
    }

    public static final class f implements Runnable {
    }

    public static final class g extends b {
        public g() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean a(AbstractResolvableFuture abstractResolvableFuture, d dVar, d dVar2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f1484b != dVar) {
                        return false;
                    }
                    abstractResolvableFuture.f1484b = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f1483a != obj) {
                        return false;
                    }
                    abstractResolvableFuture.f1483a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean c(AbstractResolvableFuture abstractResolvableFuture, h hVar, h hVar2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f1485c != hVar) {
                        return false;
                    }
                    abstractResolvableFuture.f1485c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public void d(h hVar, h hVar2) {
            hVar.f1503b = hVar2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public void e(h hVar, Thread thread) {
            hVar.f1502a = thread;
        }
    }

    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f1501c = new h(false);

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f1502a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f1503b;

        public h(boolean z10) {
        }

        public void a(h hVar) {
            AbstractResolvableFuture.f1481f.d(this, hVar);
        }

        public void b() {
            Thread thread = this.f1502a;
            if (thread != null) {
                this.f1502a = null;
                LockSupport.unpark(thread);
            }
        }

        public h() {
            AbstractResolvableFuture.f1481f.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, d.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f1481f = gVar;
        if (th != null) {
            f1480e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1482g = new Object();
    }

    public static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void f(AbstractResolvableFuture abstractResolvableFuture) {
        abstractResolvableFuture.l();
        abstractResolvableFuture.b();
        d dVarE = abstractResolvableFuture.e(null);
        while (dVarE != null) {
            d dVar = dVarE.f1495c;
            Runnable runnable = dVarE.f1493a;
            if (runnable instanceof f) {
                z.a(runnable);
                throw null;
            }
            g(runnable, dVarE.f1494b);
            dVarE = dVar;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f1480e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object i(Future future) {
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

    public final void a(StringBuilder sb) {
        try {
            Object objI = i(this);
            sb.append("SUCCESS, result=[");
            sb.append(p(objI));
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

    @Override // com.google.common.util.concurrent.a
    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        d dVar = this.f1484b;
        if (dVar != d.f1492d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f1495c = dVar;
                if (f1481f.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.f1484b;
                }
            } while (dVar != d.f1492d);
        }
        g(runnable, executor);
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f1483a;
        if (obj == null) {
            if (f1481f.b(this, obj, f1479d ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f1488c : c.f1489d)) {
                if (z10) {
                    j();
                }
                f(this);
                return true;
            }
        }
        return false;
    }

    public final d e(d dVar) {
        d dVar2;
        do {
            dVar2 = this.f1484b;
        } while (!f1481f.a(this, dVar2, d.f1492d));
        d dVar3 = dVar;
        d dVar4 = dVar2;
        while (dVar4 != null) {
            d dVar5 = dVar4.f1495c;
            dVar4.f1495c = dVar3;
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
        Object obj = this.f1483a;
        if (obj != null) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f1485c;
            if (hVar != h.f1501c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f1481f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1483a;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m(hVar2);
                    } else {
                        hVar = this.f1485c;
                    }
                } while (hVar != h.f1501c);
            }
            return h(this.f1483a);
        }
        while (nanos > 0) {
            Object obj3 = this.f1483a;
            if (obj3 != null) {
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

    public final Object h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f1491b);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f1487a);
        }
        if (obj == f1482g) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1483a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1483a != null;
    }

    public void j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String k() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void l() {
        h hVar;
        do {
            hVar = this.f1485c;
        } while (!f1481f.c(this, hVar, h.f1501c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f1503b;
        }
    }

    public final void m(h hVar) {
        hVar.f1502a = null;
        while (true) {
            h hVar2 = this.f1485c;
            if (hVar2 == h.f1501c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f1503b;
                if (hVar2.f1502a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f1503b = hVar4;
                    if (hVar3.f1502a == null) {
                        break;
                    }
                } else if (!f1481f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public boolean n(Object obj) {
        if (obj == null) {
            obj = f1482g;
        }
        if (!f1481f.b(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean o(Throwable th) {
        if (!f1481f.b(this, null, new Failure((Throwable) d(th)))) {
            return false;
        }
        f(this);
        return true;
    }

    public final String p(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public String toString() {
        String strK;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strK = k();
            } catch (RuntimeException e10) {
                strK = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strK != null && !strK.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strK);
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
            Object obj2 = this.f1483a;
            if (obj2 != null) {
                return h(obj2);
            }
            h hVar = this.f1485c;
            if (hVar != h.f1501c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f1481f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1483a;
                            } else {
                                m(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return h(obj);
                    }
                    hVar = this.f1485c;
                } while (hVar != h.f1501c);
            }
            return h(this.f1483a);
        }
        throw new InterruptedException();
    }
}
