package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class a extends v3 implements g {

    /* renamed from: h, reason: collision with root package name */
    public final a f26458h;

    /* renamed from: i, reason: collision with root package name */
    public final a f26459i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final a f26460k;

    /* renamed from: l, reason: collision with root package name */
    public int f26461l;

    /* renamed from: m, reason: collision with root package name */
    public int f26462m;

    /* renamed from: n, reason: collision with root package name */
    public Spliterator f26463n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26464o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f26465p;

    /* renamed from: q, reason: collision with root package name */
    public Runnable f26466q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f26467r;

    public abstract e2 B0(a aVar, Spliterator spliterator, boolean z3, IntFunction intFunction);

    public abstract boolean C0(Spliterator spliterator, m5 m5Var);

    public abstract b7 D0();

    public abstract boolean G0();

    public abstract m5 H0(int i4, m5 m5Var);

    public abstract Spliterator K0(a aVar, Supplier supplier, boolean z3);

    public a(Spliterator spliterator, int i4, boolean z3) {
        this.f26459i = null;
        this.f26463n = spliterator;
        this.f26458h = this;
        int i10 = a7.g & i4;
        this.j = i10;
        this.f26462m = (~(i10 << 1)) & a7.f26484l;
        this.f26461l = 0;
        this.f26467r = z3;
    }

    public a(a aVar, int i4) {
        if (aVar.f26464o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        aVar.f26464o = true;
        aVar.f26460k = this;
        this.f26459i = aVar;
        this.j = a7.f26481h & i4;
        this.f26462m = a7.i(i4, aVar.f26462m);
        a aVar2 = aVar.f26458h;
        this.f26458h = aVar2;
        if (G0()) {
            aVar2.f26465p = true;
        }
        this.f26461l = aVar.f26461l + 1;
    }

    public final Object z0(g8 g8Var) {
        if (this.f26464o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f26464o = true;
        if (this.f26458h.f26467r) {
            return g8Var.j(this, I0(g8Var.w()));
        }
        return g8Var.f(this, I0(g8Var.w()));
    }

    public final e2 A0(IntFunction intFunction) {
        if (this.f26464o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f26464o = true;
        if (this.f26458h.f26467r && this.f26459i != null && G0()) {
            this.f26461l = 0;
            a aVar = this.f26459i;
            return E0(aVar, aVar.I0(0), intFunction);
        }
        return h0(I0(0), true, intFunction);
    }

    public final Spliterator J0() {
        a aVar = this.f26458h;
        if (this != aVar) {
            throw new IllegalStateException();
        }
        if (this.f26464o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f26464o = true;
        Spliterator spliterator = aVar.f26463n;
        if (spliterator != null) {
            aVar.f26463n = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.g
    public final g sequential() {
        this.f26458h.f26467r = false;
        return this;
    }

    @Override // j$.util.stream.g
    public final g parallel() {
        this.f26458h.f26467r = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f26464o = true;
        this.f26463n = null;
        a aVar = this.f26458h;
        Runnable runnable = aVar.f26466q;
        if (runnable != null) {
            aVar.f26466q = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.g
    public final g onClose(Runnable runnable) {
        if (this.f26464o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        a aVar = this.f26458h;
        Runnable runnable2 = aVar.f26466q;
        if (runnable2 != null) {
            runnable = new f8(runnable2, runnable);
        }
        aVar.f26466q = runnable;
        return this;
    }

    @Override // j$.util.stream.g
    public Spliterator spliterator() {
        if (this.f26464o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f26464o = true;
        a aVar = this.f26458h;
        if (this == aVar) {
            Spliterator spliterator = aVar.f26463n;
            if (spliterator != null) {
                aVar.f26463n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return K0(this, new j$.util.q(2, this), aVar.f26467r);
    }

    @Override // j$.util.stream.v3
    public final e2 h0(Spliterator spliterator, boolean z3, IntFunction intFunction) {
        if (this.f26458h.f26467r) {
            return B0(this, spliterator, z3, intFunction);
        }
        w1 w1VarT0 = t0(i0(spliterator), intFunction);
        w0(spliterator, w1VarT0);
        return w1VarT0.build();
    }

    @Override // j$.util.stream.g
    public final boolean isParallel() {
        return this.f26458h.f26467r;
    }

    public final Spliterator I0(int i4) {
        int i10;
        int i11;
        a aVar = this.f26458h;
        Spliterator spliteratorF0 = aVar.f26463n;
        if (spliteratorF0 != null) {
            aVar.f26463n = null;
            if (aVar.f26467r && aVar.f26465p) {
                a aVar2 = aVar.f26460k;
                int i12 = 1;
                while (aVar != this) {
                    int i13 = aVar2.j;
                    if (aVar2.G0()) {
                        if (a7.SHORT_CIRCUIT.l(i13)) {
                            i13 &= ~a7.f26493u;
                        }
                        spliteratorF0 = aVar2.F0(aVar, spliteratorF0);
                        if (spliteratorF0.hasCharacteristics(64)) {
                            i10 = (~a7.f26492t) & i13;
                            i11 = a7.f26491s;
                        } else {
                            i10 = (~a7.f26491s) & i13;
                            i11 = a7.f26492t;
                        }
                        i13 = i10 | i11;
                        i12 = 0;
                    }
                    int i14 = i12 + 1;
                    aVar2.f26461l = i12;
                    aVar2.f26462m = a7.i(i13, aVar.f26462m);
                    a aVar3 = aVar2;
                    aVar2 = aVar2.f26460k;
                    aVar = aVar3;
                    i12 = i14;
                }
            }
            if (i4 != 0) {
                this.f26462m = a7.i(i4, this.f26462m);
            }
            return spliteratorF0;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.v3
    public final long i0(Spliterator spliterator) {
        if (a7.SIZED.l(this.f26462m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.stream.v3
    public final m5 w0(Spliterator spliterator, m5 m5Var) {
        d0(spliterator, x0((m5) Objects.requireNonNull(m5Var)));
        return m5Var;
    }

    @Override // j$.util.stream.v3
    public final void d0(Spliterator spliterator, m5 m5Var) {
        Objects.requireNonNull(m5Var);
        if (!a7.SHORT_CIRCUIT.l(this.f26462m)) {
            m5Var.c(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(m5Var);
            m5Var.end();
            return;
        }
        e0(spliterator, m5Var);
    }

    @Override // j$.util.stream.v3
    public final boolean e0(Spliterator spliterator, m5 m5Var) {
        a aVar = this;
        while (aVar.f26461l > 0) {
            aVar = aVar.f26459i;
        }
        m5Var.c(spliterator.getExactSizeIfKnown());
        boolean zC0 = aVar.C0(spliterator, m5Var);
        m5Var.end();
        return zC0;
    }

    @Override // j$.util.stream.v3
    public final m5 x0(m5 m5Var) {
        Objects.requireNonNull(m5Var);
        for (a aVar = this; aVar.f26461l > 0; aVar = aVar.f26459i) {
            m5Var = aVar.H0(aVar.f26459i.f26462m, m5Var);
        }
        return m5Var;
    }

    @Override // j$.util.stream.v3
    public final Spliterator y0(Spliterator spliterator) {
        return this.f26461l == 0 ? spliterator : K0(this, new j$.util.q(3, spliterator), this.f26458h.f26467r);
    }

    public e2 E0(v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator F0(a aVar, Spliterator spliterator) {
        return E0(aVar, spliterator, new j$.time.format.a(8)).spliterator();
    }
}
