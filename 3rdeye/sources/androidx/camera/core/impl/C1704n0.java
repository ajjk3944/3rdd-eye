package androidx.camera.core.impl;

import androidx.camera.core.impl.InterfaceC1715t0;
import androidx.camera.core.impl.J;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LiveDataObservable.java */
/* renamed from: androidx.camera.core.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1704n0<T> implements InterfaceC1715t0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.E<b<T>> f15099a = new androidx.lifecycle.E<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f15100b = new HashMap();

    /* compiled from: LiveDataObservable.java */
    /* renamed from: androidx.camera.core.impl.n0$a */
    public static final class a<T> implements androidx.lifecycle.F<b<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f15101a = new AtomicBoolean(true);

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1715t0.a<? super T> f15102b;

        /* renamed from: c, reason: collision with root package name */
        public final Executor f15103c;

        public a(Executor executor, InterfaceC1715t0.a<? super T> aVar) {
            this.f15103c = executor;
            this.f15102b = aVar;
        }

        @Override // androidx.lifecycle.F
        public final void a(Object obj) {
            this.f15103c.execute(new B.a(12, this, (b) obj));
        }
    }

    /* compiled from: LiveDataObservable.java */
    /* renamed from: androidx.camera.core.impl.n0$b */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final J.a f15104a;

        public b(J.a aVar) {
            this.f15104a = aVar;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[Result: <");
            sb.append("Value: " + this.f15104a);
            sb.append(">]");
            return sb.toString();
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1715t0
    public final void a(InterfaceC1715t0.a<? super T> aVar) {
        synchronized (this.f15100b) {
            try {
                a aVar2 = (a) this.f15100b.remove(aVar);
                if (aVar2 != null) {
                    aVar2.f15101a.set(false);
                    E.u.H().execute(new C.E(6, this, aVar2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1715t0
    public final A4.a<T> d() {
        return o0.b.a(new M8.a(this, 9));
    }

    @Override // androidx.camera.core.impl.InterfaceC1715t0
    public final void e(Executor executor, InterfaceC1715t0.a<? super T> aVar) {
        synchronized (this.f15100b) {
            a aVar2 = (a) this.f15100b.get(aVar);
            if (aVar2 != null) {
                aVar2.f15101a.set(false);
            }
            a aVar3 = new a(executor, aVar);
            this.f15100b.put(aVar, aVar3);
            E.u.H().execute(new J4.e(this, aVar2, aVar3, 5));
        }
    }
}
