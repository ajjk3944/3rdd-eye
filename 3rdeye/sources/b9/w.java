package b9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import q9.InterfaceC5499a;

/* compiled from: ULongArray.kt */
/* loaded from: classes3.dex */
public final class w implements Collection<v>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final long[] f18105b;

    /* compiled from: ULongArray.kt */
    public static final class a implements Iterator<v>, InterfaceC5499a {

        /* renamed from: b, reason: collision with root package name */
        public final long[] f18106b;

        /* renamed from: c, reason: collision with root package name */
        public int f18107c;

        public a(long[] jArr) {
            this.f18106b = jArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18107c < this.f18106b.length;
        }

        @Override // java.util.Iterator
        public final v next() {
            int i = this.f18107c;
            long[] jArr = this.f18106b;
            if (i >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f18107c));
            }
            this.f18107c = i + 1;
            return new v(jArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ w(long[] jArr) {
        this.f18105b = jArr;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(v vVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends v> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        long j4 = ((v) obj).f18104b;
        long[] jArr = this.f18105b;
        int length = jArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (j4 == jArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.l.f(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof v) {
                    long j4 = ((v) obj).f18104b;
                    long[] jArr = this.f18105b;
                    int length = jArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        }
                        if (j4 == jArr[i]) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return kotlin.jvm.internal.l.b(this.f18105b, ((w) obj).f18105b);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f18105b);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f18105b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<v> iterator() {
        return new a(this.f18105b);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f18105b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.f.a(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f18105b) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.l.f(array, "array");
        return (T[]) kotlin.jvm.internal.f.b(this, array);
    }
}
