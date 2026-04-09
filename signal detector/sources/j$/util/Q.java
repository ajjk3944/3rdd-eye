package j$.util;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class Q implements InterfaceC2531w, IntConsumer, InterfaceC2391k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20667a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f20668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfInt f20669c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.B
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (e0.f20782a) {
            e0.a(Q.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // j$.util.InterfaceC2531w, java.util.Iterator, j$.util.InterfaceC2391k
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (e0.f20782a) {
            e0.a(Q.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new C2528t(consumer, 0));
    }

    public Q(Spliterator.OfInt ofInt) {
        this.f20669c = ofInt;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f20667a = true;
        this.f20668b = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f20667a) {
            this.f20669c.tryAdvance((IntConsumer) this);
        }
        return this.f20667a;
    }

    @Override // j$.util.InterfaceC2531w
    public final int nextInt() {
        if (!this.f20667a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f20667a = false;
        return this.f20668b;
    }
}
