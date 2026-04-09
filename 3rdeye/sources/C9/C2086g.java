package c9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import q9.InterfaceC5499a;

/* compiled from: Collections.kt */
/* renamed from: c9.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2086g<T> implements Collection<T>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final T[] f18569b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18570c;

    public C2086g(T[] values, boolean z10) {
        kotlin.jvm.internal.l.f(values, "values");
        this.f18569b = values;
        this.f18570c = z10;
    }

    @Override // java.util.Collection
    public final boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        T[] tArr = this.f18569b;
        kotlin.jvm.internal.l.f(tArr, "<this>");
        return C2091l.o(tArr, obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.l.f(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (T t10 : collection) {
            T[] tArr = this.f18569b;
            kotlin.jvm.internal.l.f(tArr, "<this>");
            if (C2091l.o(tArr, t10) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f18569b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return T1.B.q(this.f18569b);
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
        return this.f18569b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.f18569b;
        kotlin.jvm.internal.l.f(tArr, "<this>");
        if (this.f18570c && tArr.getClass().equals(Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.l.e(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.l.f(array, "array");
        return (T[]) kotlin.jvm.internal.f.b(this, array);
    }
}
