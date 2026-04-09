package Hg;

import Dg.g;
import Dg.i;
import gg.x;
import hg.InterfaceC6043c;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6593c;
import mg.AbstractC6823b;
import og.AbstractC7132b;
import r.Y;
import zg.AbstractC8755h;

/* loaded from: classes4.dex */
public final class e extends d {

    /* renamed from: a, reason: collision with root package name */
    final i f7967a;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference f7969c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f7970d;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f7971e;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f7972f;

    /* renamed from: g, reason: collision with root package name */
    Throwable f7973g;

    /* renamed from: j, reason: collision with root package name */
    boolean f7976j;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference f7968b = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    final AtomicBoolean f7974h = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    final AbstractC7132b f7975i = new a();

    final class a extends AbstractC7132b {
        a() {
        }

        @Override // Dg.g
        public void clear() {
            e.this.f7967a.clear();
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (e.this.f7971e) {
                return;
            }
            e.this.f7971e = true;
            e.this.k1();
            e.this.f7968b.lazySet(null);
            if (e.this.f7975i.getAndIncrement() == 0) {
                e.this.f7968b.lazySet(null);
                e eVar = e.this;
                if (eVar.f7976j) {
                    return;
                }
                eVar.f7967a.clear();
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return e.this.f7971e;
        }

        @Override // Dg.g
        public boolean isEmpty() {
            return e.this.f7967a.isEmpty();
        }

        @Override // Dg.g
        public Object poll() {
            return e.this.f7967a.poll();
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            e.this.f7976j = true;
            return 2;
        }
    }

    e(int i10, Runnable runnable, boolean z10) {
        this.f7967a = new i(i10);
        this.f7969c = new AtomicReference(runnable);
        this.f7970d = z10;
    }

    public static e j1(int i10, Runnable runnable) {
        AbstractC6823b.b(i10, "capacityHint");
        Objects.requireNonNull(runnable, "onTerminate");
        return new e(i10, runnable, true);
    }

    @Override // gg.s
    protected void L0(x xVar) {
        if (this.f7974h.get() || !this.f7974h.compareAndSet(false, true)) {
            EnumC6593c.error(new IllegalStateException("Only a single observer allowed."), xVar);
            return;
        }
        xVar.c(this.f7975i);
        this.f7968b.lazySet(xVar);
        if (this.f7971e) {
            this.f7968b.lazySet(null);
        } else {
            l1();
        }
    }

    @Override // gg.x
    public void a() {
        if (this.f7972f || this.f7971e) {
            return;
        }
        this.f7972f = true;
        k1();
        l1();
    }

    @Override // gg.x
    public void c(InterfaceC6043c interfaceC6043c) {
        if (this.f7972f || this.f7971e) {
            interfaceC6043c.dispose();
        }
    }

    @Override // gg.x
    public void h(Object obj) {
        AbstractC8755h.c(obj, "onNext called with a null value.");
        if (this.f7972f || this.f7971e) {
            return;
        }
        this.f7967a.offer(obj);
        l1();
    }

    void k1() {
        Runnable runnable = (Runnable) this.f7969c.get();
        if (runnable == null || !Y.a(this.f7969c, runnable, null)) {
            return;
        }
        runnable.run();
    }

    void l1() {
        if (this.f7975i.getAndIncrement() != 0) {
            return;
        }
        x xVar = (x) this.f7968b.get();
        int iAddAndGet = 1;
        while (xVar == null) {
            iAddAndGet = this.f7975i.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                xVar = (x) this.f7968b.get();
            }
        }
        if (this.f7976j) {
            m1(xVar);
        } else {
            n1(xVar);
        }
    }

    void m1(x xVar) {
        i iVar = this.f7967a;
        boolean z10 = this.f7970d;
        int iAddAndGet = 1;
        while (!this.f7971e) {
            boolean z11 = this.f7972f;
            if (!z10 && z11 && p1(iVar, xVar)) {
                return;
            }
            xVar.h(null);
            if (z11) {
                o1(xVar);
                return;
            } else {
                iAddAndGet = this.f7975i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.f7968b.lazySet(null);
    }

    void n1(x xVar) {
        i iVar = this.f7967a;
        boolean z10 = this.f7970d;
        boolean z11 = true;
        int iAddAndGet = 1;
        while (!this.f7971e) {
            boolean z12 = this.f7972f;
            Object objPoll = this.f7967a.poll();
            boolean z13 = objPoll == null;
            if (z12) {
                if (!z10 && z11) {
                    if (p1(iVar, xVar)) {
                        return;
                    } else {
                        z11 = false;
                    }
                }
                if (z13) {
                    o1(xVar);
                    return;
                }
            }
            if (z13) {
                iAddAndGet = this.f7975i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                xVar.h(objPoll);
            }
        }
        this.f7968b.lazySet(null);
        iVar.clear();
    }

    void o1(x xVar) {
        this.f7968b.lazySet(null);
        Throwable th2 = this.f7973g;
        if (th2 != null) {
            xVar.onError(th2);
        } else {
            xVar.a();
        }
    }

    @Override // gg.x
    public void onError(Throwable th2) {
        AbstractC8755h.c(th2, "onError called with a null Throwable.");
        if (this.f7972f || this.f7971e) {
            Eg.a.v(th2);
            return;
        }
        this.f7973g = th2;
        this.f7972f = true;
        k1();
        l1();
    }

    boolean p1(g gVar, x xVar) {
        Throwable th2 = this.f7973g;
        if (th2 == null) {
            return false;
        }
        this.f7968b.lazySet(null);
        gVar.clear();
        xVar.onError(th2);
        return true;
    }
}
