package b9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import q9.InterfaceC5499a;

/* compiled from: UByteArray.kt */
/* loaded from: classes3.dex */
public final class s implements Collection<r>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18097b;

    /* compiled from: UByteArray.kt */
    public static final class a implements Iterator<r>, InterfaceC5499a {

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f18098b;

        /* renamed from: c, reason: collision with root package name */
        public int f18099c;

        public a(byte[] bArr) {
            this.f18098b = bArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18099c < this.f18098b.length;
        }

        @Override // java.util.Iterator
        public final r next() {
            int i = this.f18099c;
            byte[] bArr = this.f18098b;
            if (i >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f18099c));
            }
            this.f18099c = i + 1;
            return new r(bArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ s(byte[] bArr) {
        this.f18097b = bArr;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(r rVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends r> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        byte b10 = ((r) obj).f18096b;
        byte[] bArr = this.f18097b;
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (b10 == bArr[i]) {
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
                if (obj instanceof r) {
                    byte b10 = ((r) obj).f18096b;
                    byte[] bArr = this.f18097b;
                    int length = bArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        }
                        if (b10 == bArr[i]) {
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
        if (obj instanceof s) {
            return kotlin.jvm.internal.l.b(this.f18097b, ((s) obj).f18097b);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f18097b);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f18097b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<r> iterator() {
        return new a(this.f18097b);
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
        return this.f18097b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.f.a(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f18097b) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.l.f(array, "array");
        return (T[]) kotlin.jvm.internal.f.b(this, array);
    }
}
