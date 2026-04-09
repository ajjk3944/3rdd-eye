package j$.util.stream;

import j$.util.Collection;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class K0 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final Collection f20897a;

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j6, long j7, IntFunction intFunction) {
        return AbstractC2510w1.W(this, j6, j7, intFunction);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.G0
    public final G0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public K0(Collection collection) {
        this.f20897a = collection;
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        Collection collection = this.f20897a;
        return (collection instanceof j$.util.Collection ? ((j$.util.Collection) collection).stream() : Collection.CC.$default$stream(collection)).spliterator();
    }

    @Override // j$.util.stream.G0
    public final void k(Object[] objArr, int i) {
        Iterator it = this.f20897a.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // j$.util.stream.G0
    public final Object[] n(IntFunction intFunction) {
        java.util.Collection collection = this.f20897a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.f20897a.size();
    }

    @Override // j$.util.stream.G0
    public final void forEach(Consumer consumer) {
        Collection.EL.a(this.f20897a, consumer);
    }

    public final String toString() {
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(this.f20897a.size()), this.f20897a);
    }
}
