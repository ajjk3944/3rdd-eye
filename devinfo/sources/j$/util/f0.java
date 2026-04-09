package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class f0 implements h0, z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfDouble f26377a;

    public /* synthetic */ f0(PrimitiveIterator.OfDouble ofDouble) {
        this.f26377a = ofDouble;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.f26377a;
        if (obj instanceof f0) {
            obj = ((f0) obj).f26377a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.q0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f26377a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // j$.util.h0, java.util.Iterator, j$.util.z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f26377a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.h0
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f26377a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f26377a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f26377a.hashCode();
    }

    @Override // j$.util.h0, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f26377a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f26377a.next();
    }

    @Override // j$.util.h0
    public final /* synthetic */ double nextDouble() {
        return this.f26377a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f26377a.remove();
    }
}
