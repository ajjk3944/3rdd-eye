package g2;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e1 implements Collection, ok.a, j$.util.Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24326a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24327b;

    public e1() {
        int i4 = x.k0.f36912a;
        this.f24327b = new x.b0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f24326a) {
            case 0:
                return ((x.b0) this.f24327b).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f24326a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f24326a) {
            case 0:
                ((x.b0) this.f24327b).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f24326a) {
            case 0:
                return ((x.b0) this.f24327b).c(obj);
            default:
                return ((x.e0) this.f24327b).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f24326a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((x.b0) this.f24327b).c(it.next())) {
                        break;
                    }
                }
                break;
            default:
                nk.k.e(collection, "elements");
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((x.e0) this.f24327b).d(it2.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        int i4 = this.f24326a;
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f24326a) {
            case 0:
                return ((x.b0) this.f24327b).g == 0;
            default:
                return ((x.e0) this.f24327b).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f24326a) {
            case 0:
                x.b0 b0Var = (x.b0) this.f24327b;
                b0Var.getClass();
                return new a1.d(new x.d0(b0Var));
            default:
                return jm.a.r(new w0.g(this, null, 3));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        switch (this.f24326a) {
        }
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f24326a) {
            case 0:
                return ((x.b0) this.f24327b).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f24326a) {
            case 0:
                return ((x.b0) this.f24327b).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f24326a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f24326a) {
            case 0:
                return ((x.b0) this.f24327b).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f24326a) {
            case 0:
                return ((x.b0) this.f24327b).g;
            default:
                return ((x.e0) this.f24327b).f36877e;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        switch (this.f24326a) {
        }
        return Spliterator.Wrapper.convert(spliterator());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        switch (this.f24326a) {
        }
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f24326a) {
        }
        return nk.j.a(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        switch (this.f24326a) {
        }
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        switch (this.f24326a) {
        }
        return Collection.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        switch (this.f24326a) {
        }
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        int i4 = this.f24326a;
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f24326a) {
            case 0:
                break;
            default:
                nk.k.e(objArr, "array");
                break;
        }
        return nk.j.b(this, objArr);
    }

    public e1(x.e0 e0Var) {
        nk.k.e(e0Var, "parent");
        this.f24327b = e0Var;
    }
}
