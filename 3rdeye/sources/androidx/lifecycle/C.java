package androidx.lifecycle;

import N7.C1154e9;
import android.os.Looper;
import androidx.lifecycle.AbstractC1781n;
import java.util.Map;
import p.C5437b;
import q.C5486b;

/* compiled from: LiveData.java */
/* loaded from: classes.dex */
public abstract class C<T> {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f16022k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f16023a;

    /* renamed from: b, reason: collision with root package name */
    public final C5486b<F<? super T>, C<T>.d> f16024b;

    /* renamed from: c, reason: collision with root package name */
    public int f16025c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16026d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f16027e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f16028f;

    /* renamed from: g, reason: collision with root package name */
    public int f16029g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16030h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final a f16031j;

    /* compiled from: LiveData.java */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (C.this.f16023a) {
                obj = C.this.f16028f;
                C.this.f16028f = C.f16022k;
            }
            C.this.j(obj);
        }
    }

    /* compiled from: LiveData.java */
    public class b extends C<T>.d {
        @Override // androidx.lifecycle.C.d
        public final boolean e() {
            return true;
        }
    }

    /* compiled from: LiveData.java */
    public class c extends C<T>.d implements InterfaceC1788v {

        /* renamed from: f, reason: collision with root package name */
        public final Object f16033f;

        public c(InterfaceC1790x interfaceC1790x, F<? super T> f10) {
            super(f10);
            this.f16033f = interfaceC1790x;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.x, java.lang.Object] */
        @Override // androidx.lifecycle.C.d
        public final void b() {
            this.f16033f.getLifecycle().removeObserver(this);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.x, java.lang.Object] */
        @Override // androidx.lifecycle.InterfaceC1788v
        public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
            ?? r32 = this.f16033f;
            AbstractC1781n.b currentState = r32.getLifecycle().getCurrentState();
            if (currentState == AbstractC1781n.b.DESTROYED) {
                C.this.i(this.f16035b);
                return;
            }
            AbstractC1781n.b bVar = null;
            while (bVar != currentState) {
                a(e());
                bVar = currentState;
                currentState = r32.getLifecycle().getCurrentState();
            }
        }

        @Override // androidx.lifecycle.C.d
        public final boolean d(InterfaceC1790x interfaceC1790x) {
            return this.f16033f == interfaceC1790x;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.x, java.lang.Object] */
        @Override // androidx.lifecycle.C.d
        public final boolean e() {
            return this.f16033f.getLifecycle().getCurrentState().isAtLeast(AbstractC1781n.b.STARTED);
        }
    }

    public C(T t10) {
        this.f16023a = new Object();
        this.f16024b = new C5486b<>();
        this.f16025c = 0;
        this.f16028f = f16022k;
        this.f16031j = new a();
        this.f16027e = t10;
        this.f16029g = 0;
    }

    public static void a(String str) {
        C5437b.i0().f44961b.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(C1154e9.i("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(C<T>.d dVar) {
        if (dVar.f16036c) {
            if (!dVar.e()) {
                dVar.a(false);
                return;
            }
            int i = dVar.f16037d;
            int i10 = this.f16029g;
            if (i >= i10) {
                return;
            }
            dVar.f16037d = i10;
            dVar.f16035b.a((Object) this.f16027e);
        }
    }

    public final void c(C<T>.d dVar) {
        if (this.f16030h) {
            this.i = true;
            return;
        }
        this.f16030h = true;
        do {
            this.i = false;
            if (dVar != null) {
                b(dVar);
                dVar = null;
            } else {
                C5486b<F<? super T>, C<T>.d> c5486b = this.f16024b;
                c5486b.getClass();
                C5486b.d dVar2 = new C5486b.d();
                c5486b.f45305d.put(dVar2, Boolean.FALSE);
                while (dVar2.hasNext()) {
                    b((d) ((Map.Entry) dVar2.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.f16030h = false;
    }

    public T d() {
        T t10 = (T) this.f16027e;
        if (t10 != f16022k) {
            return t10;
        }
        return null;
    }

    public final void e(InterfaceC1790x interfaceC1790x, F<? super T> f10) {
        C<T>.d dVar;
        a("observe");
        if (interfaceC1790x.getLifecycle().getCurrentState() == AbstractC1781n.b.DESTROYED) {
            return;
        }
        c cVar = new c(interfaceC1790x, f10);
        C5486b<F<? super T>, C<T>.d> c5486b = this.f16024b;
        C5486b.c<F<? super T>, C<T>.d> cVarB = c5486b.b(f10);
        if (cVarB != null) {
            dVar = cVarB.f45308c;
        } else {
            C5486b.c<K, V> cVar2 = new C5486b.c<>(f10, cVar);
            c5486b.f45306e++;
            C5486b.c<F<? super T>, C<T>.d> cVar3 = c5486b.f45304c;
            if (cVar3 == 0) {
                c5486b.f45303b = cVar2;
                c5486b.f45304c = cVar2;
            } else {
                cVar3.f45309d = cVar2;
                cVar2.f45310e = cVar3;
                c5486b.f45304c = cVar2;
            }
            dVar = null;
        }
        C<T>.d dVar2 = dVar;
        if (dVar2 != null && !dVar2.d(interfaceC1790x)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar2 != null) {
            return;
        }
        interfaceC1790x.getLifecycle().addObserver(cVar);
    }

    public final void f(F<? super T> f10) {
        C<T>.d dVar;
        a("observeForever");
        b bVar = new b(f10);
        C5486b<F<? super T>, C<T>.d> c5486b = this.f16024b;
        C5486b.c<F<? super T>, C<T>.d> cVarB = c5486b.b(f10);
        if (cVarB != null) {
            dVar = cVarB.f45308c;
        } else {
            C5486b.c<K, V> cVar = new C5486b.c<>(f10, bVar);
            c5486b.f45306e++;
            C5486b.c<F<? super T>, C<T>.d> cVar2 = c5486b.f45304c;
            if (cVar2 == 0) {
                c5486b.f45303b = cVar;
                c5486b.f45304c = cVar;
            } else {
                cVar2.f45309d = cVar;
                cVar.f45310e = cVar2;
                c5486b.f45304c = cVar;
            }
            dVar = null;
        }
        C<T>.d dVar2 = dVar;
        if (dVar2 instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar2 != null) {
            return;
        }
        bVar.a(true);
    }

    public void i(F<? super T> f10) {
        a("removeObserver");
        C<T>.d dVarC = this.f16024b.c(f10);
        if (dVarC == null) {
            return;
        }
        dVarC.b();
        dVarC.a(false);
    }

    public void j(T t10) {
        a("setValue");
        this.f16029g++;
        this.f16027e = t10;
        c(null);
    }

    public C() {
        this.f16023a = new Object();
        this.f16024b = new C5486b<>();
        this.f16025c = 0;
        Object obj = f16022k;
        this.f16028f = obj;
        this.f16031j = new a();
        this.f16027e = obj;
        this.f16029g = -1;
    }

    /* compiled from: LiveData.java */
    public abstract class d {

        /* renamed from: b, reason: collision with root package name */
        public final F<? super T> f16035b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16036c;

        /* renamed from: d, reason: collision with root package name */
        public int f16037d = -1;

        public d(F<? super T> f10) {
            this.f16035b = f10;
        }

        public final void a(boolean z10) {
            if (z10 == this.f16036c) {
                return;
            }
            this.f16036c = z10;
            int i = z10 ? 1 : -1;
            C c10 = C.this;
            int i10 = c10.f16025c;
            c10.f16025c = i + i10;
            if (!c10.f16026d) {
                c10.f16026d = true;
                while (true) {
                    try {
                        int i11 = c10.f16025c;
                        if (i10 == i11) {
                            break;
                        }
                        boolean z11 = i10 == 0 && i11 > 0;
                        boolean z12 = i10 > 0 && i11 == 0;
                        if (z11) {
                            c10.g();
                        } else if (z12) {
                            c10.h();
                        }
                        i10 = i11;
                    } catch (Throwable th) {
                        c10.f16026d = false;
                        throw th;
                    }
                }
                c10.f16026d = false;
            }
            if (this.f16036c) {
                c10.c(this);
            }
        }

        public boolean d(InterfaceC1790x interfaceC1790x) {
            return false;
        }

        public abstract boolean e();

        public void b() {
        }
    }

    public void g() {
    }

    public void h() {
    }
}
