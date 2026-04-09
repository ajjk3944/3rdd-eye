package j$.util;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class f1 implements l0, IntConsumer, z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26378a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f26379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfInt f26380c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.q0
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (s1.f26454a) {
            s1.a(f1.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // j$.util.l0, java.util.Iterator, j$.util.z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (s1.f26454a) {
            s1.a(f1.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new i0(consumer, 0));
    }

    public f1(Spliterator.OfInt ofInt) {
        this.f26380c = ofInt;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i4) {
        this.f26378a = true;
        this.f26379b = i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f26378a) {
            this.f26380c.tryAdvance((IntConsumer) this);
        }
        return this.f26378a;
    }

    @Override // j$.util.l0
    public final int nextInt() {
        if (!this.f26378a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26378a = false;
        return this.f26379b;
    }
}
