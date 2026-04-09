package j$.util.stream;

import j$.util.Collection;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class j2 implements e2 {

    /* renamed from: a, reason: collision with root package name */
    public final Collection f26625a;

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 j(long j, long j8, IntFunction intFunction) {
        return v3.W(this, j, j8, intFunction);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.e2
    public final e2 a(int i4) {
        throw new IndexOutOfBoundsException();
    }

    public j2(Collection collection) {
        this.f26625a = collection;
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        return Collection.EL.d(this.f26625a).spliterator();
    }

    @Override // j$.util.stream.e2
    public final void k(Object[] objArr, int i4) {
        Iterator it = this.f26625a.iterator();
        while (it.hasNext()) {
            objArr[i4] = it.next();
            i4++;
        }
    }

    @Override // j$.util.stream.e2
    public final Object[] m(IntFunction intFunction) {
        java.util.Collection collection = this.f26625a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.e2
    public final long count() {
        return this.f26625a.size();
    }

    @Override // j$.util.stream.e2
    public final void forEach(Consumer consumer) {
        Collection.EL.a(this.f26625a, consumer);
    }

    public final String toString() {
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(this.f26625a.size()), this.f26625a);
    }
}
