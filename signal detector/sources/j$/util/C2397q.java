package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2397q implements InterfaceC2398s, InterfaceC2391k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfDouble f20818a;

    public /* synthetic */ C2397q(PrimitiveIterator.OfDouble ofDouble) {
        this.f20818a = ofDouble;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.f20818a;
        if (obj instanceof C2397q) {
            obj = ((C2397q) obj).f20818a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.B
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f20818a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // j$.util.InterfaceC2398s, java.util.Iterator, j$.util.InterfaceC2391k
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f20818a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.InterfaceC2398s
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f20818a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f20818a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f20818a.hashCode();
    }

    @Override // j$.util.InterfaceC2398s, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f20818a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f20818a.next();
    }

    @Override // j$.util.InterfaceC2398s
    public final /* synthetic */ double nextDouble() {
        return this.f20818a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f20818a.remove();
    }
}
