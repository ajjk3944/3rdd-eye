package R9;

import c9.C2097r;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import q9.InterfaceC5499a;

/* compiled from: JsonElement.kt */
@M9.h(with = C1567d.class)
/* renamed from: R9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1565b extends i implements List<i>, InterfaceC5499a {
    public static final a Companion = new a();

    /* renamed from: b, reason: collision with root package name */
    public final List<i> f11784b;

    /* compiled from: JsonElement.kt */
    /* renamed from: R9.b$a */
    public static final class a {
        public final M9.b<C1565b> serializer() {
            return C1567d.f11786a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1565b(List<? extends i> content) {
        kotlin.jvm.internal.l.f(content, "content");
        this.f11784b = content;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends i> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i element = (i) obj;
        kotlin.jvm.internal.l.f(element, "element");
        return this.f11784b.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.l.f(elements, "elements");
        return this.f11784b.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return kotlin.jvm.internal.l.b(this.f11784b, obj);
    }

    @Override // java.util.List
    public final i get(int i) {
        return this.f11784b.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f11784b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        i element = (i) obj;
        kotlin.jvm.internal.l.f(element, "element");
        return this.f11784b.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f11784b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<i> iterator() {
        return this.f11784b.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        i element = (i) obj;
        kotlin.jvm.internal.l.f(element, "element");
        return this.f11784b.lastIndexOf(element);
    }

    @Override // java.util.List
    public final ListIterator<i> listIterator() {
        return this.f11784b.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ i remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<i> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ i set(int i, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f11784b.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super i> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<i> subList(int i, int i10) {
        return this.f11784b.subList(i, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.f.a(this);
    }

    public final String toString() {
        return C2097r.u0(this.f11784b, StringUtils.COMMA, "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends i> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<i> listIterator(int i) {
        return this.f11784b.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.l.f(array, "array");
        return (T[]) kotlin.jvm.internal.f.b(this, array);
    }
}
