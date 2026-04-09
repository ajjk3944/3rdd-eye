package Q0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.AbstractC6484j;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* renamed from: Q0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3440q extends AbstractC3432i implements List, InterfaceC6944a {

    /* renamed from: h, reason: collision with root package name */
    private final List f19087h;

    public C3440q(List list) {
        super(null);
        this.f19087h = list;
        if (list.isEmpty()) {
            throw new IllegalStateException("At least one font should be passed to FontFamily");
        }
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC3433j) {
            return e((InterfaceC3433j) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f19087h.containsAll(collection);
    }

    public boolean e(InterfaceC3433j interfaceC3433j) {
        return this.f19087h.contains(interfaceC3433j);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3440q) && AbstractC6492s.d(this.f19087h, ((C3440q) obj).f19087h);
    }

    @Override // java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC3433j get(int i10) {
        return (InterfaceC3433j) this.f19087h.get(i10);
    }

    public final List g() {
        return this.f19087h;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f19087h.hashCode();
    }

    public int i() {
        return this.f19087h.size();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC3433j) {
            return j((InterfaceC3433j) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f19087h.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f19087h.iterator();
    }

    public int j(InterfaceC3433j interfaceC3433j) {
        return this.f19087h.indexOf(interfaceC3433j);
    }

    public int k(InterfaceC3433j interfaceC3433j) {
        return this.f19087h.lastIndexOf(interfaceC3433j);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC3433j) {
            return k((InterfaceC3433j) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return this.f19087h.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        return this.f19087h.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC6484j.a(this);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.f19087h + ')';
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        return this.f19087h.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC6484j.b(this, objArr);
    }
}
