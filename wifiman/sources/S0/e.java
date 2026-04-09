package S0;

import Zg.AbstractC3689v;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC6484j;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
public final class e implements Collection, InterfaceC6944a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f20216c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final e f20217d = new e(AbstractC3689v.l());

    /* renamed from: a, reason: collision with root package name */
    private final List f20218a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20219b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return g.a().b();
        }

        public final e b() {
            return e.f20217d;
        }

        private a() {
        }
    }

    public e(List list) {
        this.f20218a = list;
        this.f20219b = list.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof d) {
            return e((d) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f20218a.containsAll(collection);
    }

    public boolean e(d dVar) {
        return this.f20218a.contains(dVar);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && AbstractC6492s.d(this.f20218a, ((e) obj).f20218a);
    }

    public final d f(int i10) {
        return (d) this.f20218a.get(i10);
    }

    public final List g() {
        return this.f20218a;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f20218a.hashCode();
    }

    public int i() {
        return this.f20219b;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f20218a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f20218a.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC6484j.a(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f20218a + ')';
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC6484j.b(this, objArr);
    }
}
