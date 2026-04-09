package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.Map;
import k.b;

/* loaded from: classes.dex */
public abstract class LiveData {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f3438k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f3439a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public k.b f3440b = new k.b();

    /* renamed from: c, reason: collision with root package name */
    public int f3441c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3442d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f3443e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f3444f;

    /* renamed from: g, reason: collision with root package name */
    public int f3445g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3446h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3447i;

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f3448j;

    public class LifecycleBoundObserver extends androidx.lifecycle.LiveData.c implements j {

        /* renamed from: e, reason: collision with root package name */
        public final n f3449e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ LiveData f3450f;

        public void h() {
            this.f3449e.getLifecycle().d(this);
        }

        public boolean i() {
            return this.f3449e.getLifecycle().b().f(Lifecycle.State.STARTED);
        }

        @Override // androidx.lifecycle.j
        public void onStateChanged(n nVar, Lifecycle.Event event) {
            Lifecycle.State stateB = this.f3449e.getLifecycle().b();
            if (stateB == Lifecycle.State.DESTROYED) {
                this.f3450f.j(this.f3453a);
                return;
            }
            Lifecycle.State state = null;
            while (state != stateB) {
                g(i());
                state = stateB;
                stateB = this.f3449e.getLifecycle().b();
            }
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f3439a) {
                obj = LiveData.this.f3444f;
                LiveData.this.f3444f = LiveData.f3438k;
            }
            LiveData.this.k(obj);
        }
    }

    public class b extends c {
        public b(u uVar) {
            super(uVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean i() {
            return true;
        }
    }

    public abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final u f3453a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3454b;

        /* renamed from: c, reason: collision with root package name */
        public int f3455c = -1;

        public c(u uVar) {
            this.f3453a = uVar;
        }

        public void g(boolean z10) {
            if (z10 == this.f3454b) {
                return;
            }
            this.f3454b = z10;
            LiveData.this.b(z10 ? 1 : -1);
            if (this.f3454b) {
                LiveData.this.d(this);
            }
        }

        public void h() {
        }

        public abstract boolean i();
    }

    public LiveData() {
        Object obj = f3438k;
        this.f3444f = obj;
        this.f3448j = new a();
        this.f3443e = obj;
        this.f3445g = -1;
    }

    public static void a(String str) {
        if (j.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void b(int i10) {
        int i11 = this.f3441c;
        this.f3441c = i10 + i11;
        if (this.f3442d) {
            return;
        }
        this.f3442d = true;
        while (true) {
            try {
                int i12 = this.f3441c;
                if (i11 == i12) {
                    this.f3442d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    g();
                } else if (z11) {
                    h();
                }
                i11 = i12;
            } catch (Throwable th) {
                this.f3442d = false;
                throw th;
            }
        }
    }

    public final void c(c cVar) {
        if (cVar.f3454b) {
            if (!cVar.i()) {
                cVar.g(false);
                return;
            }
            int i10 = cVar.f3455c;
            int i11 = this.f3445g;
            if (i10 >= i11) {
                return;
            }
            cVar.f3455c = i11;
            cVar.f3453a.a(this.f3443e);
        }
    }

    public void d(c cVar) {
        if (this.f3446h) {
            this.f3447i = true;
            return;
        }
        this.f3446h = true;
        do {
            this.f3447i = false;
            if (cVar != null) {
                c(cVar);
                cVar = null;
            } else {
                b.d dVarD = this.f3440b.d();
                while (dVarD.hasNext()) {
                    c((c) ((Map.Entry) dVarD.next()).getValue());
                    if (this.f3447i) {
                        break;
                    }
                }
            }
        } while (this.f3447i);
        this.f3446h = false;
    }

    public Object e() {
        Object obj = this.f3443e;
        if (obj != f3438k) {
            return obj;
        }
        return null;
    }

    public void f(u uVar) {
        a("observeForever");
        b bVar = new b(uVar);
        c cVar = (c) this.f3440b.g(uVar, bVar);
        if (cVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        bVar.g(true);
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Object obj) {
        boolean z10;
        synchronized (this.f3439a) {
            z10 = this.f3444f == f3438k;
            this.f3444f = obj;
        }
        if (z10) {
            j.c.g().c(this.f3448j);
        }
    }

    public void j(u uVar) {
        a("removeObserver");
        c cVar = (c) this.f3440b.h(uVar);
        if (cVar == null) {
            return;
        }
        cVar.h();
        cVar.g(false);
    }

    public void k(Object obj) {
        a("setValue");
        this.f3445g++;
        this.f3443e = obj;
        d(null);
    }
}
