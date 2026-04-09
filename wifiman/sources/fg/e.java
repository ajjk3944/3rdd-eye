package Fg;

import Dg.i;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import mg.AbstractC6823b;
import yg.AbstractC8666a;
import yg.EnumC8669d;
import yg.EnumC8672g;
import zg.AbstractC8751d;
import zg.AbstractC8755h;

/* loaded from: classes4.dex */
public final class e extends b {

    /* renamed from: b, reason: collision with root package name */
    final i f6654b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference f6655c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f6656d;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f6657e;

    /* renamed from: f, reason: collision with root package name */
    Throwable f6658f;

    /* renamed from: h, reason: collision with root package name */
    volatile boolean f6660h;

    /* renamed from: l, reason: collision with root package name */
    boolean f6664l;

    /* renamed from: g, reason: collision with root package name */
    final AtomicReference f6659g = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    final AtomicBoolean f6661i = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    final AbstractC8666a f6662j = new a();

    /* renamed from: k, reason: collision with root package name */
    final AtomicLong f6663k = new AtomicLong();

    final class a extends AbstractC8666a {
        a() {
        }

        @Override // Dj.c
        public void cancel() {
            if (e.this.f6660h) {
                return;
            }
            e.this.f6660h = true;
            e.this.l2();
            e.this.f6659g.lazySet(null);
            if (e.this.f6662j.getAndIncrement() == 0) {
                e.this.f6659g.lazySet(null);
                e eVar = e.this;
                if (eVar.f6664l) {
                    return;
                }
                eVar.f6654b.clear();
            }
        }

        @Override // Dg.g
        public void clear() {
            e.this.f6654b.clear();
        }

        @Override // Dg.g
        public boolean isEmpty() {
            return e.this.f6654b.isEmpty();
        }

        @Override // Dg.g
        public Object poll() {
            return e.this.f6654b.poll();
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(e.this.f6663k, j10);
                e.this.m2();
            }
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            e.this.f6664l = true;
            return 2;
        }
    }

    e(int i10, Runnable runnable, boolean z10) {
        this.f6654b = new i(i10);
        this.f6655c = new AtomicReference(runnable);
        this.f6656d = z10;
    }

    public static e j2() {
        return new e(gg.i.i(), null, true);
    }

    public static e k2(int i10) {
        AbstractC6823b.b(i10, "capacityHint");
        return new e(i10, null, true);
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        if (this.f6661i.get() || !this.f6661i.compareAndSet(false, true)) {
            EnumC8669d.error(new IllegalStateException("This processor allows only a single Subscriber"), bVar);
            return;
        }
        bVar.j(this.f6662j);
        this.f6659g.set(bVar);
        if (this.f6660h) {
            this.f6659g.lazySet(null);
        } else {
            m2();
        }
    }

    @Override // Dj.b
    public void a() {
        if (this.f6657e || this.f6660h) {
            return;
        }
        this.f6657e = true;
        l2();
        m2();
    }

    @Override // Dj.b
    public void h(Object obj) {
        AbstractC8755h.c(obj, "onNext called with a null value.");
        if (this.f6657e || this.f6660h) {
            return;
        }
        this.f6654b.offer(obj);
        m2();
    }

    boolean i2(boolean z10, boolean z11, boolean z12, Dj.b bVar, i iVar) {
        if (this.f6660h) {
            iVar.clear();
            this.f6659g.lazySet(null);
            return true;
        }
        if (!z11) {
            return false;
        }
        if (z10 && this.f6658f != null) {
            iVar.clear();
            this.f6659g.lazySet(null);
            bVar.onError(this.f6658f);
            return true;
        }
        if (!z12) {
            return false;
        }
        Throwable th2 = this.f6658f;
        this.f6659g.lazySet(null);
        if (th2 != null) {
            bVar.onError(th2);
        } else {
            bVar.a();
        }
        return true;
    }

    @Override // Dj.b, gg.l
    public void j(Dj.c cVar) {
        if (this.f6657e || this.f6660h) {
            cVar.cancel();
        } else {
            cVar.request(Long.MAX_VALUE);
        }
    }

    void l2() {
        Runnable runnable = (Runnable) this.f6655c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    void m2() {
        if (this.f6662j.getAndIncrement() != 0) {
            return;
        }
        Dj.b bVar = (Dj.b) this.f6659g.get();
        int iAddAndGet = 1;
        while (bVar == null) {
            iAddAndGet = this.f6662j.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                bVar = (Dj.b) this.f6659g.get();
            }
        }
        if (this.f6664l) {
            n2(bVar);
        } else {
            o2(bVar);
        }
    }

    void n2(Dj.b bVar) {
        i iVar = this.f6654b;
        boolean z10 = this.f6656d;
        int iAddAndGet = 1;
        while (!this.f6660h) {
            boolean z11 = this.f6657e;
            if (!z10 && z11 && this.f6658f != null) {
                iVar.clear();
                this.f6659g.lazySet(null);
                bVar.onError(this.f6658f);
                return;
            }
            bVar.h(null);
            if (z11) {
                this.f6659g.lazySet(null);
                Throwable th2 = this.f6658f;
                if (th2 != null) {
                    bVar.onError(th2);
                    return;
                } else {
                    bVar.a();
                    return;
                }
            }
            iAddAndGet = this.f6662j.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        this.f6659g.lazySet(null);
    }

    void o2(Dj.b bVar) {
        long j10;
        i iVar = this.f6654b;
        boolean z10 = true;
        boolean z11 = !this.f6656d;
        int iAddAndGet = 1;
        while (true) {
            long j11 = this.f6663k.get();
            long j12 = 0;
            while (true) {
                if (j11 == j12) {
                    j10 = j12;
                    break;
                }
                boolean z12 = this.f6657e;
                Object objPoll = iVar.poll();
                boolean z13 = objPoll == null ? z10 : false;
                j10 = j12;
                if (i2(z11, z12, z13, bVar, iVar)) {
                    return;
                }
                if (z13) {
                    break;
                }
                bVar.h(objPoll);
                j12 = 1 + j10;
                z10 = true;
            }
            if (j11 == j12 && i2(z11, this.f6657e, iVar.isEmpty(), bVar, iVar)) {
                return;
            }
            if (j10 != 0 && j11 != Long.MAX_VALUE) {
                this.f6663k.addAndGet(-j10);
            }
            iAddAndGet = this.f6662j.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                z10 = true;
            }
        }
    }

    @Override // Dj.b
    public void onError(Throwable th2) {
        AbstractC8755h.c(th2, "onError called with a null Throwable.");
        if (this.f6657e || this.f6660h) {
            Eg.a.v(th2);
            return;
        }
        this.f6658f = th2;
        this.f6657e = true;
        l2();
        m2();
    }
}
