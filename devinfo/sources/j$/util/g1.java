package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class g1 implements p0, LongConsumer, z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26399a = false;

    /* renamed from: b, reason: collision with root package name */
    public long f26400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f26401c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.q0
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (s1.f26454a) {
            s1.a(g1.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // j$.util.p0, java.util.Iterator, j$.util.z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (s1.f26454a) {
            s1.a(g1.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new m0(consumer, 0));
    }

    public g1(z0 z0Var) {
        this.f26401c = z0Var;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f26399a = true;
        this.f26400b = j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f26399a) {
            this.f26401c.tryAdvance((LongConsumer) this);
        }
        return this.f26399a;
    }

    @Override // j$.util.p0
    public final long nextLong() {
        if (!this.f26399a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26399a = false;
        return this.f26400b;
    }
}
