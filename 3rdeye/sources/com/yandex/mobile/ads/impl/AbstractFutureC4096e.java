package com.yandex.mobile.ads.impl;

import N7.G8;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.yandex.mobile.ads.impl.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractFutureC4096e<V> extends ep0 implements Future {

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f26570e;

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f26571f;

    /* renamed from: g, reason: collision with root package name */
    private static final a f26572g;

    /* renamed from: h, reason: collision with root package name */
    private static final Object f26573h;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f26574b;

    /* renamed from: c, reason: collision with root package name */
    private volatile d f26575c;

    /* renamed from: d, reason: collision with root package name */
    private volatile i f26576d;

    /* renamed from: com.yandex.mobile.ads.impl.e$a */
    public static abstract class a {
        public /* synthetic */ a(int i) {
            this();
        }

        public abstract void a(i iVar, i iVar2);

        public abstract void a(i iVar, Thread thread);

        public abstract boolean a(AbstractFutureC4096e<?> abstractFutureC4096e, d dVar, d dVar2);

        public abstract boolean a(AbstractFutureC4096e<?> abstractFutureC4096e, i iVar, i iVar2);

        public abstract boolean a(AbstractFutureC4096e<?> abstractFutureC4096e, Object obj, Object obj2);

        private a() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        static final b f26577b;

        /* renamed from: c, reason: collision with root package name */
        static final b f26578c;

        /* renamed from: a, reason: collision with root package name */
        final Throwable f26579a;

        static {
            if (AbstractFutureC4096e.f26570e) {
                f26578c = null;
                f26577b = null;
            } else {
                f26578c = new b(false, null);
                f26577b = new b(true, null);
            }
        }

        public b(boolean z10, Throwable th) {
            this.f26579a = th;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        final Throwable f26580a;

        /* renamed from: com.yandex.mobile.ads.impl.e$c$a */
        public class a extends Throwable {
            public a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new a());
        }

        public c(Throwable th) {
            this.f26580a = (Throwable) pj1.a(th);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$d */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f26581b = new d();

        /* renamed from: a, reason: collision with root package name */
        d f26582a;
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$f */
    public static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$g */
    public static final class g extends a {
        public /* synthetic */ g(int i) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC4096e.a
        public final boolean a(AbstractFutureC4096e<?> abstractFutureC4096e, d dVar, d dVar2) {
            synchronized (abstractFutureC4096e) {
                try {
                    if (((AbstractFutureC4096e) abstractFutureC4096e).f26575c != dVar) {
                        return false;
                    }
                    ((AbstractFutureC4096e) abstractFutureC4096e).f26575c = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private g() {
            super(0);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC4096e.a
        public final boolean a(AbstractFutureC4096e<?> abstractFutureC4096e, Object obj, Object obj2) {
            synchronized (abstractFutureC4096e) {
                try {
                    if (((AbstractFutureC4096e) abstractFutureC4096e).f26574b != obj) {
                        return false;
                    }
                    ((AbstractFutureC4096e) abstractFutureC4096e).f26574b = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC4096e.a
        public final boolean a(AbstractFutureC4096e<?> abstractFutureC4096e, i iVar, i iVar2) {
            synchronized (abstractFutureC4096e) {
                try {
                    if (((AbstractFutureC4096e) abstractFutureC4096e).f26576d != iVar) {
                        return false;
                    }
                    ((AbstractFutureC4096e) abstractFutureC4096e).f26576d = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC4096e.a
        public final void a(i iVar, i iVar2) {
            iVar.f26590b = iVar2;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC4096e.a
        public final void a(i iVar, Thread thread) {
            iVar.f26589a = thread;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$h */
    public static abstract class h<V> extends AbstractFutureC4096e<V> implements Future {
        @Override // com.yandex.mobile.ads.impl.AbstractFutureC4096e, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC4096e, java.util.concurrent.Future
        public V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC4096e, java.util.concurrent.Future
        public final boolean isCancelled() {
            return ((AbstractFutureC4096e) this).f26574b instanceof b;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC4096e, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC4096e, java.util.concurrent.Future
        public final V get(long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j4, timeUnit);
        }
    }

    static {
        boolean z10;
        a gVar;
        int i10 = 0;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f26570e = z10;
        f26571f = Logger.getLogger(AbstractFutureC4096e.class.getName());
        try {
            gVar = new C0403e(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC4096e.class, i.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC4096e.class, d.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC4096e.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g(i10);
        }
        f26572g = gVar;
        if (th != null) {
            f26571f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f26573h = new Object();
    }

    private void a(StringBuilder sb) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    v10 = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (RuntimeException e4) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e4.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e10) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e10.getCause());
                    sb.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb.append("SUCCESS, result=[");
        a(sb, v10);
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        b bVar;
        Object obj = this.f26574b;
        if ((obj == null) | (obj instanceof f)) {
            if (f26570e) {
                bVar = new b(z10, new CancellationException("Future.cancel() was called."));
            } else {
                bVar = z10 ? b.f26577b : b.f26578c;
                Objects.requireNonNull(bVar);
            }
            while (!f26572g.a((AbstractFutureC4096e<?>) this, obj, (Object) bVar)) {
                obj = this.f26574b;
                if (!(obj instanceof f)) {
                }
            }
            a((AbstractFutureC4096e<?>) this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get(long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f26574b;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) a(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f26576d;
            if (iVar != i.f26588c) {
                i iVar2 = new i();
                do {
                    a aVar = f26572g;
                    aVar.a(iVar2, iVar);
                    if (aVar.a((AbstractFutureC4096e<?>) this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                a(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f26574b;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) a(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        a(iVar2);
                    } else {
                        iVar = this.f26576d;
                    }
                } while (iVar != i.f26588c);
            }
            Object obj3 = this.f26574b;
            Objects.requireNonNull(obj3);
            return (V) a(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f26574b;
            if ((obj4 != null) && (!(obj4 instanceof f))) {
                return (V) a(obj4);
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
        StringBuilder sbJ = androidx.work.s.j("Waited ", " ", j4);
        sbJ.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbJ.toString();
        if (nanos + 1000 < 0) {
            String strS = G8.s(string3, " (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strS2 = strS + jConvert + " " + lowerCase;
                if (z10) {
                    strS2 = G8.s(strS2, StringUtils.COMMA);
                }
                strS = G8.s(strS2, " ");
            }
            if (z10) {
                strS = strS + nanos2 + " nanoseconds ";
            }
            string3 = G8.s(strS, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(G8.s(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(B4.g.o(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f26574b instanceof b;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof f)) & (this.f26574b != null);
    }

    public final String toString() {
        String strA;
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
            a(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f26574b;
            if (obj instanceof f) {
                sb.append(", setFuture=[");
                ((f) obj).getClass();
                try {
                    sb.append((Object) null);
                } catch (RuntimeException | StackOverflowError e4) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e4.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strA = w22.a(a());
                } catch (RuntimeException | StackOverflowError e10) {
                    strA = "Exception thrown from implementation: " + e10.getClass();
                }
                if (strA != null) {
                    sb.append(", info=[");
                    sb.append(strA);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                a(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$e, reason: collision with other inner class name */
    public static final class C0403e extends a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f26583a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f26584b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFutureC4096e, i> f26585c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFutureC4096e, d> f26586d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFutureC4096e, Object> f26587e;

        public C0403e(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFutureC4096e, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFutureC4096e, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFutureC4096e, Object> atomicReferenceFieldUpdater5) {
            super(0);
            this.f26583a = atomicReferenceFieldUpdater;
            this.f26584b = atomicReferenceFieldUpdater2;
            this.f26585c = atomicReferenceFieldUpdater3;
            this.f26586d = atomicReferenceFieldUpdater4;
            this.f26587e = atomicReferenceFieldUpdater5;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC4096e.a
        public final boolean a(AbstractFutureC4096e<?> abstractFutureC4096e, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<AbstractFutureC4096e, d> atomicReferenceFieldUpdater = this.f26586d;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractFutureC4096e, dVar, dVar2)) {
                if (atomicReferenceFieldUpdater.get(abstractFutureC4096e) != dVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC4096e.a
        public final boolean a(AbstractFutureC4096e<?> abstractFutureC4096e, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractFutureC4096e, Object> atomicReferenceFieldUpdater = this.f26587e;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractFutureC4096e, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(abstractFutureC4096e) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC4096e.a
        public final boolean a(AbstractFutureC4096e<?> abstractFutureC4096e, i iVar, i iVar2) {
            AtomicReferenceFieldUpdater<AbstractFutureC4096e, i> atomicReferenceFieldUpdater = this.f26585c;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractFutureC4096e, iVar, iVar2)) {
                if (atomicReferenceFieldUpdater.get(abstractFutureC4096e) != iVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC4096e.a
        public final void a(i iVar, i iVar2) {
            this.f26584b.lazySet(iVar, iVar2);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC4096e.a
        public final void a(i iVar, Thread thread) {
            this.f26583a.lazySet(iVar, thread);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.e$i */
    public static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f26588c = new i(0);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f26589a;

        /* renamed from: b, reason: collision with root package name */
        volatile i f26590b;

        public i() {
            AbstractFutureC4096e.f26572g.a(this, Thread.currentThread());
        }

        public i(int i) {
        }
    }

    public boolean b(V v10) {
        if (!f26572g.a((AbstractFutureC4096e<?>) this, (Object) null, (Object) v10)) {
            return false;
        }
        a((AbstractFutureC4096e<?>) this);
        return true;
    }

    private void a(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private static void a(AbstractFutureC4096e<?> abstractFutureC4096e) {
        i iVar;
        d dVar;
        do {
            iVar = ((AbstractFutureC4096e) abstractFutureC4096e).f26576d;
        } while (!f26572g.a(abstractFutureC4096e, iVar, i.f26588c));
        while (iVar != null) {
            Thread thread = iVar.f26589a;
            if (thread != null) {
                iVar.f26589a = null;
                LockSupport.unpark(thread);
            }
            iVar = iVar.f26590b;
        }
        do {
            dVar = ((AbstractFutureC4096e) abstractFutureC4096e).f26575c;
        } while (!f26572g.a(abstractFutureC4096e, dVar, d.f26581b));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f26582a;
            dVar.f26582a = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        if (dVar2 != null) {
            throw null;
        }
    }

    private static Object a(Object obj) throws ExecutionException {
        if (!(obj instanceof b)) {
            if (!(obj instanceof c)) {
                if (obj == f26573h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).f26580a);
        }
        Throwable th = ((b) obj).f26579a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    private void a(i iVar) {
        iVar.f26589a = null;
        while (true) {
            i iVar2 = this.f26576d;
            if (iVar2 == i.f26588c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f26590b;
                if (iVar2.f26589a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f26590b = iVar4;
                    if (iVar3.f26589a == null) {
                        break;
                    }
                } else if (!f26572g.a((AbstractFutureC4096e<?>) this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    public boolean a(Throwable th) {
        if (!f26572g.a((AbstractFutureC4096e<?>) this, (Object) null, (Object) new c(th))) {
            return false;
        }
        a((AbstractFutureC4096e<?>) this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f26574b;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) a(obj2);
            }
            i iVar = this.f26576d;
            if (iVar != i.f26588c) {
                i iVar2 = new i();
                do {
                    a aVar = f26572g;
                    aVar.a(iVar2, iVar);
                    if (aVar.a((AbstractFutureC4096e<?>) this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f26574b;
                            } else {
                                a(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) a(obj);
                    }
                    iVar = this.f26576d;
                } while (iVar != i.f26588c);
            }
            Object obj3 = this.f26574b;
            Objects.requireNonNull(obj3);
            return (V) a(obj3);
        }
        throw new InterruptedException();
    }
}
