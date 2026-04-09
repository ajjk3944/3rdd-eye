package xg;

import gg.l;
import hg.InterfaceC6043c;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import yg.EnumC8672g;
import zg.AbstractC8751d;
import zg.AbstractC8761n;
import zg.InterfaceC8760m;

/* loaded from: classes4.dex */
public abstract class d extends h implements l, InterfaceC8760m {

    /* renamed from: c, reason: collision with root package name */
    protected final Dj.b f66082c;

    /* renamed from: d, reason: collision with root package name */
    protected final Dg.f f66083d;

    /* renamed from: e, reason: collision with root package name */
    protected volatile boolean f66084e;

    /* renamed from: f, reason: collision with root package name */
    protected volatile boolean f66085f;

    /* renamed from: g, reason: collision with root package name */
    protected Throwable f66086g;

    public d(Dj.b bVar, Dg.f fVar) {
        this.f66082c = bVar;
        this.f66083d = fVar;
    }

    @Override // zg.InterfaceC8760m
    public final boolean b() {
        return this.f66085f;
    }

    @Override // zg.InterfaceC8760m
    public final boolean c() {
        return this.f66084e;
    }

    @Override // zg.InterfaceC8760m
    public final long d() {
        return this.f66087b.get();
    }

    @Override // zg.InterfaceC8760m
    public final int e(int i10) {
        return this.f66088a.addAndGet(i10);
    }

    @Override // zg.InterfaceC8760m
    public final Throwable error() {
        return this.f66086g;
    }

    @Override // zg.InterfaceC8760m
    public final long f(long j10) {
        return this.f66087b.addAndGet(-j10);
    }

    public abstract boolean g(Dj.b bVar, Object obj);

    public final boolean i() {
        return this.f66088a.getAndIncrement() == 0;
    }

    public final boolean k() {
        return this.f66088a.get() == 0 && this.f66088a.compareAndSet(0, 1);
    }

    protected final void o(Object obj, boolean z10, InterfaceC6043c interfaceC6043c) {
        Dj.b bVar = this.f66082c;
        Dg.f fVar = this.f66083d;
        if (k()) {
            long j10 = this.f66087b.get();
            if (j10 == 0) {
                interfaceC6043c.dispose();
                bVar.onError(MissingBackpressureException.a());
                return;
            } else {
                if (g(bVar, obj) && j10 != Long.MAX_VALUE) {
                    f(1L);
                }
                if (e(-1) == 0) {
                    return;
                }
            }
        } else {
            fVar.offer(obj);
            if (!i()) {
                return;
            }
        }
        AbstractC8761n.b(fVar, bVar, z10, interfaceC6043c, this);
    }

    protected final void q(Object obj, boolean z10, InterfaceC6043c interfaceC6043c) {
        Dj.b bVar = this.f66082c;
        Dg.f fVar = this.f66083d;
        if (k()) {
            long j10 = this.f66087b.get();
            if (j10 == 0) {
                this.f66084e = true;
                interfaceC6043c.dispose();
                bVar.onError(MissingBackpressureException.a());
                return;
            } else if (fVar.isEmpty()) {
                if (g(bVar, obj) && j10 != Long.MAX_VALUE) {
                    f(1L);
                }
                if (e(-1) == 0) {
                    return;
                }
            } else {
                fVar.offer(obj);
            }
        } else {
            fVar.offer(obj);
            if (!i()) {
                return;
            }
        }
        AbstractC8761n.b(fVar, bVar, z10, interfaceC6043c, this);
    }

    public final void s(long j10) {
        if (EnumC8672g.validate(j10)) {
            AbstractC8751d.a(this.f66087b, j10);
        }
    }
}
