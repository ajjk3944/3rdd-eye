package b9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import q9.InterfaceC5499a;

/* compiled from: UIntArray.kt */
/* loaded from: classes3.dex */
public final class u implements Collection<t>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final int[] f18101b;

    /* compiled from: UIntArray.kt */
    public static final class a implements Iterator<t>, InterfaceC5499a {

        /* renamed from: b, reason: collision with root package name */
        public final int[] f18102b;

        /* renamed from: c, reason: collision with root package name */
        public int f18103c;

        public a(int[] iArr) {
            this.f18102b = iArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18103c < this.f18102b.length;
        }

        @Override // java.util.Iterator
        public final t next() {
            int i = this.f18103c;
            int[] iArr = this.f18102b;
            if (i >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f18103c));
            }
            this.f18103c = i + 1;
            return new t(iArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ u(int[] iArr) {
        this.f18101b = iArr;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(t tVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends t> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        int i = ((t) obj).f18100b;
        int[] iArr = this.f18101b;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (i == iArr[i10]) {
                break;
            }
            i10++;
        }
        return i10 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.l.f(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof t) {
                    int i = ((t) obj).f18100b;
                    int[] iArr = this.f18101b;
                    int length = iArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            i10 = -1;
                            break;
                        }
                        if (i == iArr[i10]) {
                            break;
                        }
                        i10++;
                    }
                    if (i10 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return kotlin.jvm.internal.l.b(this.f18101b, ((u) obj).f18101b);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f18101b);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f18101b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<t> iterator() {
        return new a(this.f18101b);
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
        return this.f18101b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.f.a(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f18101b) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.l.f(array, "array");
        return (T[]) kotlin.jvm.internal.f.b(this, array);
    }
}
