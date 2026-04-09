package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements PrimitiveIterator.OfDouble {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2398s f20819a;

    public /* synthetic */ r(InterfaceC2398s interfaceC2398s) {
        this.f20819a = interfaceC2398s;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC2398s interfaceC2398s = this.f20819a;
        if (obj instanceof r) {
            obj = ((r) obj).f20819a;
        }
        return interfaceC2398s.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f20819a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20819a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f20819a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f20819a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f20819a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f20819a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f20819a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.f20819a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f20819a.remove();
    }
}
