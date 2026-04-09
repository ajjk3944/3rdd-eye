package androidx.camera.core.impl;

import I.m;
import androidx.camera.core.impl.InterfaceC1715t0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: StateObservable.java */
/* loaded from: classes.dex */
public abstract class K0<T> implements InterfaceC1715t0<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<Object> f14903b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f14902a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public int f14904c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14905d = false;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f14906e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet<b<T>> f14907f = new CopyOnWriteArraySet<>();

    /* compiled from: StateObservable.java */
    public static abstract class a {
        public abstract Throwable a();
    }

    /* compiled from: StateObservable.java */
    public static final class b<T> implements Runnable {
        public static final Object i = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final Executor f14908b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC1715t0.a<? super T> f14909c;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<Object> f14911e;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f14910d = new AtomicBoolean(true);

        /* renamed from: f, reason: collision with root package name */
        public Object f14912f = i;

        /* renamed from: g, reason: collision with root package name */
        public int f14913g = -1;

        /* renamed from: h, reason: collision with root package name */
        public boolean f14914h = false;

        public b(AtomicReference<Object> atomicReference, Executor executor, InterfaceC1715t0.a<? super T> aVar) {
            this.f14911e = atomicReference;
            this.f14908b = executor;
            this.f14909c = aVar;
        }

        public final void a(int i10) {
            synchronized (this) {
                try {
                    if (this.f14910d.get()) {
                        if (i10 <= this.f14913g) {
                            return;
                        }
                        this.f14913g = i10;
                        if (this.f14914h) {
                            return;
                        }
                        this.f14914h = true;
                        try {
                            this.f14908b.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f14914h = false;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                try {
                    if (!this.f14910d.get()) {
                        this.f14914h = false;
                        return;
                    }
                    Object obj = this.f14911e.get();
                    int i10 = this.f14913g;
                    while (true) {
                        if (!Objects.equals(this.f14912f, obj)) {
                            this.f14912f = obj;
                            if (obj instanceof a) {
                                this.f14909c.onError(((a) obj).a());
                            } else {
                                this.f14909c.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i10 == this.f14913g || !this.f14910d.get()) {
                                    break;
                                }
                                obj = this.f14911e.get();
                                i10 = this.f14913g;
                            } finally {
                            }
                        }
                    }
                    this.f14914h = false;
                } finally {
                }
            }
        }
    }

    public K0(Object obj) {
        this.f14903b = new AtomicReference<>(obj);
    }

    @Override // androidx.camera.core.impl.InterfaceC1715t0
    public final void a(InterfaceC1715t0.a<? super T> aVar) {
        synchronized (this.f14902a) {
            b(aVar);
        }
    }

    public final void b(InterfaceC1715t0.a<? super T> aVar) {
        b bVar = (b) this.f14906e.remove(aVar);
        if (bVar != null) {
            bVar.f14910d.set(false);
            this.f14907f.remove(bVar);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1715t0
    public final A4.a<T> d() {
        Object obj = this.f14903b.get();
        return obj instanceof a ? new m.a(((a) obj).a()) : I.j.e(obj);
    }

    @Override // androidx.camera.core.impl.InterfaceC1715t0
    public final void e(Executor executor, InterfaceC1715t0.a<? super T> aVar) {
        b<T> bVar;
        synchronized (this.f14902a) {
            b(aVar);
            bVar = new b<>(this.f14903b, executor, aVar);
            this.f14906e.put(aVar, bVar);
            this.f14907f.add(bVar);
        }
        bVar.a(0);
    }

    public final void f() {
        synchronized (this.f14902a) {
            try {
                Iterator it = new HashSet(this.f14906e.keySet()).iterator();
                while (it.hasNext()) {
                    b((InterfaceC1715t0.a) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Object obj) {
        Iterator<b<T>> it;
        int i;
        synchronized (this.f14902a) {
            try {
                if (Objects.equals(this.f14903b.getAndSet(obj), obj)) {
                    return;
                }
                int i10 = this.f14904c + 1;
                this.f14904c = i10;
                if (this.f14905d) {
                    return;
                }
                this.f14905d = true;
                Iterator<b<T>> it2 = this.f14907f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it2.next().a(i10);
                    } else {
                        synchronized (this.f14902a) {
                            try {
                                if (this.f14904c == i10) {
                                    this.f14905d = false;
                                    return;
                                } else {
                                    it = this.f14907f.iterator();
                                    i = this.f14904c;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i10 = i;
                    }
                }
            } finally {
            }
        }
    }
}
