package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2529u implements InterfaceC2531w, InterfaceC2391k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfInt f21214a;

    public /* synthetic */ C2529u(PrimitiveIterator.OfInt ofInt) {
        this.f21214a = ofInt;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.f21214a;
        if (obj instanceof C2529u) {
            obj = ((C2529u) obj).f21214a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.B
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f21214a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // j$.util.InterfaceC2531w, java.util.Iterator, j$.util.InterfaceC2391k
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21214a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.InterfaceC2531w
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f21214a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f21214a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f21214a.hashCode();
    }

    @Override // j$.util.InterfaceC2531w, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f21214a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f21214a.next();
    }

    @Override // j$.util.InterfaceC2531w
    public final /* synthetic */ int nextInt() {
        return this.f21214a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f21214a.remove();
    }
}
