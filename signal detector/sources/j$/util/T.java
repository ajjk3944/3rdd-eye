package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class T implements InterfaceC2398s, DoubleConsumer, InterfaceC2391k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20678a = false;

    /* renamed from: b, reason: collision with root package name */
    public double f20679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f20680c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.B
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (e0.f20782a) {
            e0.a(T.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // j$.util.InterfaceC2398s, java.util.Iterator, j$.util.InterfaceC2391k
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (e0.f20782a) {
            e0.a(T.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new C2396p(consumer, 0));
    }

    public T(F f2) {
        this.f20680c = f2;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d6) {
        this.f20678a = true;
        this.f20679b = d6;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f20678a) {
            this.f20680c.tryAdvance((DoubleConsumer) this);
        }
        return this.f20678a;
    }

    @Override // j$.util.InterfaceC2398s
    public final double nextDouble() {
        if (!this.f20678a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f20678a = false;
        return this.f20679b;
    }
}
