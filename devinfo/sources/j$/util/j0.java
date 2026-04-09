package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class j0 implements l0, z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfInt f26419a;

    public /* synthetic */ j0(PrimitiveIterator.OfInt ofInt) {
        this.f26419a = ofInt;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.f26419a;
        if (obj instanceof j0) {
            obj = ((j0) obj).f26419a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.q0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f26419a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // j$.util.l0, java.util.Iterator, j$.util.z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f26419a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.l0
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f26419a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f26419a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f26419a.hashCode();
    }

    @Override // j$.util.l0, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f26419a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f26419a.next();
    }

    @Override // j$.util.l0
    public final /* synthetic */ int nextInt() {
        return this.f26419a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f26419a.remove();
    }
}
