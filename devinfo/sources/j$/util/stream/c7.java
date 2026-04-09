package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class c7 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26527a;

    /* renamed from: b, reason: collision with root package name */
    public final a f26528b;

    /* renamed from: c, reason: collision with root package name */
    public Supplier f26529c;

    /* renamed from: d, reason: collision with root package name */
    public Spliterator f26530d;

    /* renamed from: e, reason: collision with root package name */
    public m5 f26531e;

    /* renamed from: f, reason: collision with root package name */
    public BooleanSupplier f26532f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public c f26533h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26534i;

    public abstract void d();

    public abstract c7 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i4) {
        return j$.util.c.e(this, i4);
    }

    public c7(a aVar, Supplier supplier, boolean z3) {
        this.f26528b = aVar;
        this.f26529c = supplier;
        this.f26530d = null;
        this.f26527a = z3;
    }

    public c7(a aVar, Spliterator spliterator, boolean z3) {
        this.f26528b = aVar;
        this.f26529c = null;
        this.f26530d = spliterator;
        this.f26527a = z3;
    }

    public final void c() {
        if (this.f26530d == null) {
            this.f26530d = (Spliterator) this.f26529c.get();
            this.f26529c = null;
        }
    }

    public final boolean a() {
        c cVar = this.f26533h;
        if (cVar == null) {
            if (this.f26534i) {
                return false;
            }
            c();
            d();
            this.g = 0L;
            this.f26531e.c(this.f26530d.getExactSizeIfKnown());
            return b();
        }
        long j = this.g + 1;
        this.g = j;
        boolean z3 = j < cVar.count();
        if (z3) {
            return z3;
        }
        this.g = 0L;
        this.f26533h.clear();
        return b();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f26527a || this.f26533h != null || this.f26534i) {
            return null;
        }
        c();
        Spliterator spliteratorTrySplit = this.f26530d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return e(spliteratorTrySplit);
    }

    public final boolean b() {
        while (this.f26533h.count() == 0) {
            if (this.f26531e.e() || !this.f26532f.getAsBoolean()) {
                if (this.f26534i) {
                    return false;
                }
                this.f26531e.end();
                this.f26534i = true;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f26530d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (a7.SIZED.l(this.f26528b.f26462m)) {
            return this.f26530d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int i4 = this.f26528b.f26462m;
        int i10 = i4 & ((~i4) >> 1) & a7.j & a7.f26480f;
        return (i10 & 64) != 0 ? (i10 & (-16449)) | (this.f26530d.characteristics() & 16448) : i10;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.util.c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f26530d);
    }
}
