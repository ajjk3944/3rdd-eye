package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2533y implements A, InterfaceC2391k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f21218a;

    public /* synthetic */ C2533y(PrimitiveIterator.OfLong ofLong) {
        this.f21218a = ofLong;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f21218a;
        if (obj instanceof C2533y) {
            obj = ((C2533y) obj).f21218a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.B
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f21218a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // j$.util.A, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f21218a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.A
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f21218a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f21218a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f21218a.hashCode();
    }

    @Override // j$.util.A, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f21218a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f21218a.next();
    }

    @Override // j$.util.A
    public final /* synthetic */ long nextLong() {
        return this.f21218a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f21218a.remove();
    }
}
