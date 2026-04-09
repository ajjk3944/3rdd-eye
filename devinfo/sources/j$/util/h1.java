package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class h1 implements h0, DoubleConsumer, z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26404a = false;

    /* renamed from: b, reason: collision with root package name */
    public double f26405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f26406c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.q0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (s1.f26454a) {
            s1.a(h1.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // j$.util.h0, java.util.Iterator, j$.util.z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (s1.f26454a) {
            s1.a(h1.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new e0(consumer, 0));
    }

    public h1(u0 u0Var) {
        this.f26406c = u0Var;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f26404a = true;
        this.f26405b = d10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f26404a) {
            this.f26406c.tryAdvance((DoubleConsumer) this);
        }
        return this.f26404a;
    }

    @Override // j$.util.h0
    public final double nextDouble() {
        if (!this.f26404a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26404a = false;
        return this.f26405b;
    }
}
