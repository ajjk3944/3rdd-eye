package androidx.concurrent.futures;

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
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes.dex */
public abstract class a implements com.google.common.util.concurrent.d {

    /* renamed from: d, reason: collision with root package name */
    static final boolean f29996d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f29997e = Logger.getLogger(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    static final b f29998f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f29999g;

    /* renamed from: a, reason: collision with root package name */
    volatile Object f30000a;

    /* renamed from: b, reason: collision with root package name */
    volatile e f30001b;

    /* renamed from: c, reason: collision with root package name */
    volatile h f30002c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f30003c;

        /* renamed from: d, reason: collision with root package name */
        static final c f30004d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f30005a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f30006b;

        static {
            if (a.f29996d) {
                f30004d = null;
                f30003c = null;
            } else {
                f30004d = new c(false, null);
                f30003c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f30005a = z10;
            this.f30006b = th2;
        }
    }

    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f30007b = new d(new C1090a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f30008a;

        /* renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C1090a extends Throwable {
            C1090a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f30008a = (Throwable) a.g(th2);
        }
    }

    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f30009d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f30010a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f30011b;

        /* renamed from: c, reason: collision with root package name */
        e f30012c;

        e(Runnable runnable, Executor executor) {
            this.f30010a = runnable;
            this.f30011b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f30013a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f30014b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f30015c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f30016d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f30017e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f30013a = atomicReferenceFieldUpdater;
            this.f30014b = atomicReferenceFieldUpdater2;
            this.f30015c = atomicReferenceFieldUpdater3;
            this.f30016d = atomicReferenceFieldUpdater4;
            this.f30017e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f30016d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f30017e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            return androidx.concurrent.futures.b.a(this.f30015c, aVar, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            this.f30014b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            this.f30013a.lazySet(hVar, thread);
        }
    }

    private static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f30001b != eVar) {
                        return false;
                    }
                    aVar.f30001b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f30000a != obj) {
                        return false;
                    }
                    aVar.f30000a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f30002c != hVar) {
                        return false;
                    }
                    aVar.f30002c = hVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            hVar.f30020b = hVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            hVar.f30019a = thread;
        }
    }

    private static final class h {

        /* renamed from: c, reason: collision with root package name */
        static final h f30018c = new h(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f30019a;

        /* renamed from: b, reason: collision with root package name */
        volatile h f30020b;

        h(boolean z10) {
        }

        void a(h hVar) {
            a.f29998f.d(this, hVar);
        }

        void b() {
            Thread thread = this.f30019a;
            if (thread != null) {
                this.f30019a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            a.f29998f.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, SnmpConfigurator.O_AUTH_PROTOCOL), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, SnmpConfigurator.O_BIND_ADDRESS), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, SnmpConfigurator.O_COMMUNITY), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, SnmpConfigurator.O_BIND_ADDRESS), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, SnmpConfigurator.O_AUTH_PROTOCOL));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f29998f = gVar;
        if (th != null) {
            f29997e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f29999g = new Object();
    }

    protected a() {
    }

    private String B(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void b(StringBuilder sb2) {
        try {
            Object objP = p(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(B(objP));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException d(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    static Object g(Object obj) {
        obj.getClass();
        return obj;
    }

    private e h(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f30001b;
        } while (!f29998f.a(this, eVar2, e.f30009d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f30012c;
            eVar4.f30012c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void j(a aVar) {
        aVar.t();
        aVar.c();
        e eVarH = aVar.h(null);
        while (eVarH != null) {
            e eVar = eVarH.f30012c;
            l(eVarH.f30010a, eVarH.f30011b);
            eVarH = eVar;
        }
    }

    private static void l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f29997e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object n(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f30006b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f30008a);
        }
        if (obj == f29999g) {
            return null;
        }
        return obj;
    }

    static Object p(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void t() {
        h hVar;
        do {
            hVar = this.f30002c;
        } while (!f29998f.c(this, hVar, h.f30018c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f30020b;
        }
    }

    private void v(h hVar) {
        hVar.f30019a = null;
        while (true) {
            h hVar2 = this.f30002c;
            if (hVar2 == h.f30018c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f30020b;
                if (hVar2.f30019a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f30020b = hVar4;
                    if (hVar3.f30019a == null) {
                        break;
                    }
                } else if (!f29998f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    protected final boolean C() {
        Object obj = this.f30000a;
        return (obj instanceof c) && ((c) obj).f30005a;
    }

    @Override // com.google.common.util.concurrent.d
    public final void a(Runnable runnable, Executor executor) {
        g(runnable);
        g(executor);
        e eVar = this.f30001b;
        if (eVar != e.f30009d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f30012c = eVar;
                if (f29998f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f30001b;
                }
            } while (eVar != e.f30009d);
        }
        l(runnable, executor);
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f30000a;
        if (obj == null) {
            if (f29998f.b(this, obj, f29996d ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f30003c : c.f30004d)) {
                if (z10) {
                    r();
                }
                j(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f30000a;
        if (obj != null) {
            return n(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f30002c;
            if (hVar != h.f30018c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f29998f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                v(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f30000a;
                            if (obj2 != null) {
                                return n(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        v(hVar2);
                    } else {
                        hVar = this.f30002c;
                    }
                } while (hVar != h.f30018c);
            }
            return n(this.f30000a);
        }
        while (nanos > 0) {
            Object obj3 = this.f30000a;
            if (obj3 != null) {
                return n(obj3);
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
        return this.f30000a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f30000a != null;
    }

    protected void r() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String s() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public String toString() {
        String strS;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                strS = s();
            } catch (RuntimeException e10) {
                strS = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strS != null && !strS.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strS);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected boolean y(Object obj) {
        if (obj == null) {
            obj = f29999g;
        }
        if (!f29998f.b(this, null, obj)) {
            return false;
        }
        j(this);
        return true;
    }

    protected boolean z(Throwable th2) {
        if (!f29998f.b(this, null, new d((Throwable) g(th2)))) {
            return false;
        }
        j(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f30000a;
            if (obj2 != null) {
                return n(obj2);
            }
            h hVar = this.f30002c;
            if (hVar != h.f30018c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f29998f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f30000a;
                            } else {
                                v(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return n(obj);
                    }
                    hVar = this.f30002c;
                } while (hVar != h.f30018c);
            }
            return n(this.f30000a);
        }
        throw new InterruptedException();
    }
}
