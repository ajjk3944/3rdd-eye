package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2423e3 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21065a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2404b f21066b;

    /* renamed from: c, reason: collision with root package name */
    public Supplier f21067c;

    /* renamed from: d, reason: collision with root package name */
    public Spliterator f21068d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2472o2 f21069e;

    /* renamed from: f, reason: collision with root package name */
    public BooleanSupplier f21070f;

    /* renamed from: g, reason: collision with root package name */
    public long f21071g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC2414d f21072h;
    public boolean i;

    public abstract void d();

    public abstract AbstractC2423e3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC2383c.e(this, i);
    }

    public AbstractC2423e3(AbstractC2404b abstractC2404b, Supplier supplier, boolean z6) {
        this.f21066b = abstractC2404b;
        this.f21067c = supplier;
        this.f21068d = null;
        this.f21065a = z6;
    }

    public AbstractC2423e3(AbstractC2404b abstractC2404b, Spliterator spliterator, boolean z6) {
        this.f21066b = abstractC2404b;
        this.f21067c = null;
        this.f21068d = spliterator;
        this.f21065a = z6;
    }

    public final void c() {
        if (this.f21068d == null) {
            this.f21068d = (Spliterator) this.f21067c.get();
            this.f21067c = null;
        }
    }

    public final boolean a() {
        AbstractC2414d abstractC2414d = this.f21072h;
        if (abstractC2414d == null) {
            if (this.i) {
                return false;
            }
            c();
            d();
            this.f21071g = 0L;
            this.f21069e.c(this.f21068d.getExactSizeIfKnown());
            return b();
        }
        long j6 = this.f21071g + 1;
        this.f21071g = j6;
        boolean z6 = j6 < abstractC2414d.count();
        if (z6) {
            return z6;
        }
        this.f21071g = 0L;
        this.f21072h.clear();
        return b();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f21065a || this.f21072h != null || this.i) {
            return null;
        }
        c();
        Spliterator spliteratorTrySplit = this.f21068d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return e(spliteratorTrySplit);
    }

    public final boolean b() {
        while (this.f21072h.count() == 0) {
            if (this.f21069e.e() || !this.f21070f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.f21069e.m();
                this.i = true;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f21068d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC2413c3.SIZED.d(this.f21066b.f21006m)) {
            return this.f21068d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int i = this.f21066b.f21006m;
        int i3 = i & ((~i) >> 1) & EnumC2413c3.f21030j & EnumC2413c3.f21027f;
        return (i3 & 64) != 0 ? (i3 & (-16449)) | (this.f21068d.characteristics() & 16448) : i3;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC2383c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f21068d);
    }
}
