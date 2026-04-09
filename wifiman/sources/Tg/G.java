package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public final class G extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final kg.n f62131b;

    /* renamed from: c, reason: collision with root package name */
    final kg.n f62132c;

    /* renamed from: d, reason: collision with root package name */
    final int f62133d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f62134e;

    public static final class a extends AtomicInteger implements gg.x, InterfaceC6043c {

        /* renamed from: i, reason: collision with root package name */
        static final Object f62135i = new Object();

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62136a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f62137b;

        /* renamed from: c, reason: collision with root package name */
        final kg.n f62138c;

        /* renamed from: d, reason: collision with root package name */
        final int f62139d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f62140e;

        /* renamed from: g, reason: collision with root package name */
        InterfaceC6043c f62142g;

        /* renamed from: h, reason: collision with root package name */
        final AtomicBoolean f62143h = new AtomicBoolean();

        /* renamed from: f, reason: collision with root package name */
        final Map f62141f = new ConcurrentHashMap();

        public a(gg.x xVar, kg.n nVar, kg.n nVar2, int i10, boolean z10) {
            this.f62136a = xVar;
            this.f62137b = nVar;
            this.f62138c = nVar2;
            this.f62139d = i10;
            this.f62140e = z10;
            lazySet(1);
        }

        @Override // gg.x
        public void a() {
            ArrayList arrayList = new ArrayList(this.f62141f.values());
            this.f62141f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
            this.f62136a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62142g, interfaceC6043c)) {
                this.f62142g = interfaceC6043c;
                this.f62136a.c(this);
            }
        }

        public void d(Object obj) {
            if (obj == null) {
                obj = f62135i;
            }
            this.f62141f.remove(obj);
            if (decrementAndGet() == 0) {
                this.f62142g.dispose();
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (this.f62143h.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f62142g.dispose();
            }
        }

        @Override // gg.x
        public void h(Object obj) {
            boolean z10;
            try {
                Object objApply = this.f62137b.apply(obj);
                Object obj2 = objApply != null ? objApply : f62135i;
                b bVarI1 = (b) this.f62141f.get(obj2);
                if (bVarI1 != null) {
                    z10 = false;
                } else {
                    if (this.f62143h.get()) {
                        return;
                    }
                    bVarI1 = b.i1(objApply, this.f62139d, this, this.f62140e);
                    this.f62141f.put(obj2, bVarI1);
                    getAndIncrement();
                    z10 = true;
                }
                try {
                    Object objApply2 = this.f62138c.apply(obj);
                    Objects.requireNonNull(objApply2, "The value supplied is null");
                    bVarI1.h(objApply2);
                    if (z10) {
                        this.f62136a.h(bVarI1);
                        if (bVarI1.f62144b.o()) {
                            d(objApply);
                            bVarI1.a();
                        }
                    }
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    this.f62142g.dispose();
                    if (z10) {
                        this.f62136a.h(bVarI1);
                    }
                    onError(th2);
                }
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                this.f62142g.dispose();
                onError(th3);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62143h.get();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            ArrayList arrayList = new ArrayList(this.f62141f.values());
            this.f62141f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onError(th2);
            }
            this.f62136a.onError(th2);
        }
    }

    static final class b extends Bg.b {

        /* renamed from: b, reason: collision with root package name */
        final c f62144b;

        protected b(Object obj, c cVar) {
            super(obj);
            this.f62144b = cVar;
        }

        public static b i1(Object obj, int i10, a aVar, boolean z10) {
            return new b(obj, new c(i10, aVar, obj, z10));
        }

        @Override // gg.s
        protected void L0(gg.x xVar) {
            this.f62144b.d(xVar);
        }

        public void a() {
            this.f62144b.h();
        }

        public void h(Object obj) {
            this.f62144b.m(obj);
        }

        public void onError(Throwable th2) {
            this.f62144b.j(th2);
        }
    }

    static final class c extends AtomicInteger implements InterfaceC6043c, gg.v {

        /* renamed from: a, reason: collision with root package name */
        final Object f62145a;

        /* renamed from: b, reason: collision with root package name */
        final Dg.i f62146b;

        /* renamed from: c, reason: collision with root package name */
        final a f62147c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f62148d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f62149e;

        /* renamed from: f, reason: collision with root package name */
        Throwable f62150f;

        /* renamed from: g, reason: collision with root package name */
        final AtomicBoolean f62151g = new AtomicBoolean();

        /* renamed from: h, reason: collision with root package name */
        final AtomicReference f62152h = new AtomicReference();

        /* renamed from: i, reason: collision with root package name */
        final AtomicInteger f62153i = new AtomicInteger();

        c(int i10, a aVar, Object obj, boolean z10) {
            this.f62146b = new Dg.i(i10);
            this.f62147c = aVar;
            this.f62145a = obj;
            this.f62148d = z10;
        }

        void a() {
            if ((this.f62153i.get() & 2) == 0) {
                this.f62147c.d(this.f62145a);
            }
        }

        boolean c(boolean z10, boolean z11, gg.x xVar, boolean z12) {
            if (this.f62151g.get()) {
                this.f62146b.clear();
                this.f62152h.lazySet(null);
                a();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f62150f;
                this.f62152h.lazySet(null);
                if (th2 != null) {
                    xVar.onError(th2);
                } else {
                    xVar.a();
                }
                return true;
            }
            Throwable th3 = this.f62150f;
            if (th3 != null) {
                this.f62146b.clear();
                this.f62152h.lazySet(null);
                xVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f62152h.lazySet(null);
            xVar.a();
            return true;
        }

        @Override // gg.v
        public void d(gg.x xVar) {
            int i10;
            do {
                i10 = this.f62153i.get();
                if ((i10 & 1) != 0) {
                    EnumC6593c.error(new IllegalStateException("Only one Observer allowed!"), xVar);
                    return;
                }
            } while (!this.f62153i.compareAndSet(i10, i10 | 1));
            xVar.c(this);
            this.f62152h.lazySet(xVar);
            if (this.f62151g.get()) {
                this.f62152h.lazySet(null);
            } else {
                g();
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (this.f62151g.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f62152h.lazySet(null);
                a();
            }
        }

        void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            Dg.i iVar = this.f62146b;
            boolean z10 = this.f62148d;
            gg.x xVar = (gg.x) this.f62152h.get();
            int iAddAndGet = 1;
            while (true) {
                if (xVar != null) {
                    while (true) {
                        boolean z11 = this.f62149e;
                        Object objPoll = iVar.poll();
                        boolean z12 = objPoll == null;
                        if (c(z11, z12, xVar, z10)) {
                            return;
                        }
                        if (z12) {
                            break;
                        } else {
                            xVar.h(objPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (xVar == null) {
                    xVar = (gg.x) this.f62152h.get();
                }
            }
        }

        public void h() {
            this.f62149e = true;
            g();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62151g.get();
        }

        public void j(Throwable th2) {
            this.f62150f = th2;
            this.f62149e = true;
            g();
        }

        public void m(Object obj) {
            this.f62146b.offer(obj);
            g();
        }

        boolean o() {
            return this.f62153i.get() == 0 && this.f62153i.compareAndSet(0, 2);
        }
    }

    public G(gg.v vVar, kg.n nVar, kg.n nVar2, int i10, boolean z10) {
        super(vVar);
        this.f62131b = nVar;
        this.f62132c = nVar2;
        this.f62133d = i10;
        this.f62134e = z10;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar, this.f62131b, this.f62132c, this.f62133d, this.f62134e));
    }
}
