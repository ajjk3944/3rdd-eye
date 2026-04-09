package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2404b extends AbstractC2510w1 implements InterfaceC2434h {

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC2404b f21002h;
    public final AbstractC2404b i;

    /* renamed from: j, reason: collision with root package name */
    public final int f21003j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC2404b f21004k;

    /* renamed from: l, reason: collision with root package name */
    public int f21005l;

    /* renamed from: m, reason: collision with root package name */
    public int f21006m;

    /* renamed from: n, reason: collision with root package name */
    public Spliterator f21007n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21008o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f21009p;

    /* renamed from: q, reason: collision with root package name */
    public Runnable f21010q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21011r;

    public abstract G0 B0(AbstractC2404b abstractC2404b, Spliterator spliterator, boolean z6, IntFunction intFunction);

    public abstract boolean C0(Spliterator spliterator, InterfaceC2472o2 interfaceC2472o2);

    public abstract EnumC2418d3 D0();

    public abstract boolean G0();

    public abstract InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2);

    public abstract Spliterator K0(AbstractC2404b abstractC2404b, Supplier supplier, boolean z6);

    public AbstractC2404b(Spliterator spliterator, int i, boolean z6) {
        this.i = null;
        this.f21007n = spliterator;
        this.f21002h = this;
        int i3 = EnumC2413c3.f21028g & i;
        this.f21003j = i3;
        this.f21006m = (~(i3 << 1)) & EnumC2413c3.f21032l;
        this.f21005l = 0;
        this.f21011r = z6;
    }

    public AbstractC2404b(AbstractC2404b abstractC2404b, int i) {
        if (abstractC2404b.f21008o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC2404b.f21008o = true;
        abstractC2404b.f21004k = this;
        this.i = abstractC2404b;
        this.f21003j = EnumC2413c3.f21029h & i;
        this.f21006m = EnumC2413c3.a(i, abstractC2404b.f21006m);
        AbstractC2404b abstractC2404b2 = abstractC2404b.f21002h;
        this.f21002h = abstractC2404b2;
        if (G0()) {
            abstractC2404b2.f21009p = true;
        }
        this.f21005l = abstractC2404b.f21005l + 1;
    }

    public final Object z0(I3 i3) {
        if (this.f21008o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f21008o = true;
        if (this.f21002h.f21011r) {
            return i3.j(this, I0(i3.v()));
        }
        return i3.f(this, I0(i3.v()));
    }

    public final G0 A0(IntFunction intFunction) {
        if (this.f21008o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f21008o = true;
        if (this.f21002h.f21011r && this.i != null && G0()) {
            this.f21005l = 0;
            AbstractC2404b abstractC2404b = this.i;
            return E0(abstractC2404b, abstractC2404b.I0(0), intFunction);
        }
        return h0(I0(0), true, intFunction);
    }

    public final Spliterator J0() {
        AbstractC2404b abstractC2404b = this.f21002h;
        if (this != abstractC2404b) {
            throw new IllegalStateException();
        }
        if (this.f21008o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f21008o = true;
        Spliterator spliterator = abstractC2404b.f21007n;
        if (spliterator != null) {
            abstractC2404b.f21007n = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    public final InterfaceC2434h sequential() {
        this.f21002h.f21011r = false;
        return this;
    }

    public final InterfaceC2434h parallel() {
        this.f21002h.f21011r = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f21008o = true;
        this.f21007n = null;
        AbstractC2404b abstractC2404b = this.f21002h;
        Runnable runnable = abstractC2404b.f21010q;
        if (runnable != null) {
            abstractC2404b.f21010q = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final InterfaceC2434h onClose(Runnable runnable) {
        if (this.f21008o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC2404b abstractC2404b = this.f21002h;
        Runnable runnable2 = abstractC2404b.f21010q;
        if (runnable2 != null) {
            runnable = new H3(runnable2, runnable);
        }
        abstractC2404b.f21010q = runnable;
        return this;
    }

    public Spliterator spliterator() {
        if (this.f21008o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f21008o = true;
        AbstractC2404b abstractC2404b = this.f21002h;
        if (this == abstractC2404b) {
            Spliterator spliterator = abstractC2404b.f21007n;
            if (spliterator != null) {
                abstractC2404b.f21007n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return K0(this, new j$.util.function.g(this, 1), abstractC2404b.f21011r);
    }

    @Override // j$.util.stream.AbstractC2510w1
    public final G0 h0(Spliterator spliterator, boolean z6, IntFunction intFunction) {
        if (this.f21002h.f21011r) {
            return B0(this, spliterator, z6, intFunction);
        }
        InterfaceC2519y0 interfaceC2519y0T0 = t0(i0(spliterator), intFunction);
        w0(spliterator, interfaceC2519y0T0);
        return interfaceC2519y0T0.build();
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final boolean isParallel() {
        return this.f21002h.f21011r;
    }

    public final Spliterator I0(int i) {
        int i3;
        int i6;
        AbstractC2404b abstractC2404b = this.f21002h;
        Spliterator spliteratorF0 = abstractC2404b.f21007n;
        if (spliteratorF0 != null) {
            abstractC2404b.f21007n = null;
            if (abstractC2404b.f21011r && abstractC2404b.f21009p) {
                AbstractC2404b abstractC2404b2 = abstractC2404b.f21004k;
                int i7 = 1;
                while (abstractC2404b != this) {
                    int i8 = abstractC2404b2.f21003j;
                    if (abstractC2404b2.G0()) {
                        if (EnumC2413c3.SHORT_CIRCUIT.d(i8)) {
                            i8 &= ~EnumC2413c3.f21041u;
                        }
                        spliteratorF0 = abstractC2404b2.F0(abstractC2404b, spliteratorF0);
                        if (spliteratorF0.hasCharacteristics(64)) {
                            i3 = (~EnumC2413c3.f21040t) & i8;
                            i6 = EnumC2413c3.f21039s;
                        } else {
                            i3 = (~EnumC2413c3.f21039s) & i8;
                            i6 = EnumC2413c3.f21040t;
                        }
                        i8 = i3 | i6;
                        i7 = 0;
                    }
                    int i9 = i7 + 1;
                    abstractC2404b2.f21005l = i7;
                    abstractC2404b2.f21006m = EnumC2413c3.a(i8, abstractC2404b.f21006m);
                    AbstractC2404b abstractC2404b3 = abstractC2404b2;
                    abstractC2404b2 = abstractC2404b2.f21004k;
                    abstractC2404b = abstractC2404b3;
                    i7 = i9;
                }
            }
            if (i != 0) {
                this.f21006m = EnumC2413c3.a(i, this.f21006m);
            }
            return spliteratorF0;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.AbstractC2510w1
    public final long i0(Spliterator spliterator) {
        if (EnumC2413c3.SIZED.d(this.f21006m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.stream.AbstractC2510w1
    public final InterfaceC2472o2 w0(Spliterator spliterator, InterfaceC2472o2 interfaceC2472o2) {
        d0(spliterator, x0((InterfaceC2472o2) Objects.requireNonNull(interfaceC2472o2)));
        return interfaceC2472o2;
    }

    @Override // j$.util.stream.AbstractC2510w1
    public final void d0(Spliterator spliterator, InterfaceC2472o2 interfaceC2472o2) {
        Objects.requireNonNull(interfaceC2472o2);
        if (!EnumC2413c3.SHORT_CIRCUIT.d(this.f21006m)) {
            interfaceC2472o2.c(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(interfaceC2472o2);
            interfaceC2472o2.m();
            return;
        }
        e0(spliterator, interfaceC2472o2);
    }

    @Override // j$.util.stream.AbstractC2510w1
    public final boolean e0(Spliterator spliterator, InterfaceC2472o2 interfaceC2472o2) {
        AbstractC2404b abstractC2404b = this;
        while (abstractC2404b.f21005l > 0) {
            abstractC2404b = abstractC2404b.i;
        }
        interfaceC2472o2.c(spliterator.getExactSizeIfKnown());
        boolean zC0 = abstractC2404b.C0(spliterator, interfaceC2472o2);
        interfaceC2472o2.m();
        return zC0;
    }

    @Override // j$.util.stream.AbstractC2510w1
    public final InterfaceC2472o2 x0(InterfaceC2472o2 interfaceC2472o2) {
        Objects.requireNonNull(interfaceC2472o2);
        for (AbstractC2404b abstractC2404b = this; abstractC2404b.f21005l > 0; abstractC2404b = abstractC2404b.i) {
            interfaceC2472o2 = abstractC2404b.H0(abstractC2404b.i.f21006m, interfaceC2472o2);
        }
        return interfaceC2472o2;
    }

    @Override // j$.util.stream.AbstractC2510w1
    public final Spliterator y0(Spliterator spliterator) {
        return this.f21005l == 0 ? spliterator : K0(this, new j$.util.function.g(spliterator, 2), this.f21002h.f21011r);
    }

    public G0 E0(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator F0(AbstractC2404b abstractC2404b, Spliterator spliterator) {
        return E0(abstractC2404b, spliterator, new C2399a(0)).spliterator();
    }
}
