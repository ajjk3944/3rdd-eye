package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: j, reason: collision with root package name */
    static final Object f1792j = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f1793a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private i.b<m<? super T>, LiveData<T>.b> f1794b = new i.b<>();

    /* renamed from: c, reason: collision with root package name */
    int f1795c = 0;

    /* renamed from: d, reason: collision with root package name */
    private volatile Object f1796d;

    /* renamed from: e, reason: collision with root package name */
    volatile Object f1797e;

    /* renamed from: f, reason: collision with root package name */
    private int f1798f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1799g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1800h;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f1801i;

    class LifecycleBoundObserver extends LiveData<T>.b implements e {

        /* renamed from: e, reason: collision with root package name */
        final g f1802e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LiveData f1803f;

        @Override // androidx.lifecycle.e
        public void g(g gVar, d.a aVar) {
            if (this.f1802e.a().b() == d.b.DESTROYED) {
                this.f1803f.f(this.f1805a);
            } else {
                h(j());
            }
        }

        @Override // androidx.lifecycle.LiveData.b
        void i() {
            this.f1802e.a().c(this);
        }

        @Override // androidx.lifecycle.LiveData.b
        boolean j() {
            return this.f1802e.a().b().a(d.b.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f1793a) {
                obj = LiveData.this.f1797e;
                LiveData.this.f1797e = LiveData.f1792j;
            }
            LiveData.this.g(obj);
        }
    }

    private abstract class b {

        /* renamed from: a, reason: collision with root package name */
        final m<? super T> f1805a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1806b;

        /* renamed from: c, reason: collision with root package name */
        int f1807c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LiveData f1808d;

        void h(boolean z2) {
            if (z2 == this.f1806b) {
                return;
            }
            this.f1806b = z2;
            LiveData liveData = this.f1808d;
            int i2 = liveData.f1795c;
            boolean z3 = i2 == 0;
            liveData.f1795c = i2 + (z2 ? 1 : -1);
            if (z3 && z2) {
                liveData.d();
            }
            LiveData liveData2 = this.f1808d;
            if (liveData2.f1795c == 0 && !this.f1806b) {
                liveData2.e();
            }
            if (this.f1806b) {
                this.f1808d.c(this);
            }
        }

        void i() {
        }

        abstract boolean j();
    }

    public LiveData() {
        Object obj = f1792j;
        this.f1796d = obj;
        this.f1797e = obj;
        this.f1798f = -1;
        this.f1801i = new a();
    }

    private static void a(String str) {
        if (h.a.d().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void b(LiveData<T>.b bVar) {
        if (bVar.f1806b) {
            if (!bVar.j()) {
                bVar.h(false);
                return;
            }
            int i2 = bVar.f1807c;
            int i3 = this.f1798f;
            if (i2 >= i3) {
                return;
            }
            bVar.f1807c = i3;
            bVar.f1805a.a((Object) this.f1796d);
        }
    }

    void c(LiveData<T>.b bVar) {
        if (this.f1799g) {
            this.f1800h = true;
            return;
        }
        this.f1799g = true;
        do {
            this.f1800h = false;
            if (bVar != null) {
                b(bVar);
                bVar = null;
            } else {
                i.b<m<? super T>, LiveData<T>.b>.d dVarD = this.f1794b.d();
                while (dVarD.hasNext()) {
                    b((b) dVarD.next().getValue());
                    if (this.f1800h) {
                        break;
                    }
                }
            }
        } while (this.f1800h);
        this.f1799g = false;
    }

    protected void d() {
    }

    protected void e() {
    }

    public void f(m<? super T> mVar) {
        a("removeObserver");
        LiveData<T>.b bVarG = this.f1794b.g(mVar);
        if (bVarG == null) {
            return;
        }
        bVarG.i();
        bVarG.h(false);
    }

    protected void g(T t2) {
        a("setValue");
        this.f1798f++;
        this.f1796d = t2;
        c(null);
    }
}
