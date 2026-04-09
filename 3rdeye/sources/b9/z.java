package b9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import q9.InterfaceC5499a;

/* compiled from: UShortArray.kt */
/* loaded from: classes3.dex */
public final class z implements Collection<y>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final short[] f18110b;

    /* compiled from: UShortArray.kt */
    public static final class a implements Iterator<y>, InterfaceC5499a {

        /* renamed from: b, reason: collision with root package name */
        public final short[] f18111b;

        /* renamed from: c, reason: collision with root package name */
        public int f18112c;

        public a(short[] sArr) {
            this.f18111b = sArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18112c < this.f18111b.length;
        }

        @Override // java.util.Iterator
        public final y next() {
            int i = this.f18112c;
            short[] sArr = this.f18111b;
            if (i >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f18112c));
            }
            this.f18112c = i + 1;
            return new y(sArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ z(short[] sArr) {
        this.f18110b = sArr;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(y yVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends y> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        short s10 = ((y) obj).f18109b;
        short[] sArr = this.f18110b;
        int length = sArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (s10 == sArr[i]) {
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
                if (obj instanceof y) {
                    short s10 = ((y) obj).f18109b;
                    short[] sArr = this.f18110b;
                    int length = sArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        }
                        if (s10 == sArr[i]) {
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
        if (obj instanceof z) {
            return kotlin.jvm.internal.l.b(this.f18110b, ((z) obj).f18110b);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f18110b);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f18110b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<y> iterator() {
        return new a(this.f18110b);
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
        return this.f18110b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.f.a(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f18110b) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.l.f(array, "array");
        return (T[]) kotlin.jvm.internal.f.b(this, array);
    }
}
