package o;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p.AbstractC7173a;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7010a extends V implements Map {

    /* renamed from: d, reason: collision with root package name */
    C1995a f54947d;

    /* renamed from: e, reason: collision with root package name */
    c f54948e;

    /* renamed from: f, reason: collision with root package name */
    e f54949f;

    /* renamed from: o.a$a, reason: collision with other inner class name */
    final class C1995a extends AbstractSet {
        C1995a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C7010a.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C7010a.this.size();
        }
    }

    /* renamed from: o.a$b */
    final class b extends AbstractC7017h {
        b() {
            super(C7010a.this.size());
        }

        @Override // o.AbstractC7017h
        protected Object d(int i10) {
            return C7010a.this.h(i10);
        }

        @Override // o.AbstractC7017h
        protected void e(int i10) {
            C7010a.this.j(i10);
        }
    }

    /* renamed from: o.a$d */
    final class d implements Iterator, Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        int f54953a;

        /* renamed from: b, reason: collision with root package name */
        int f54954b = -1;

        /* renamed from: c, reason: collision with root package name */
        boolean f54955c;

        d() {
            this.f54953a = C7010a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f54954b++;
            this.f54955c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f54955c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC7173a.c(entry.getKey(), C7010a.this.h(this.f54954b)) && AbstractC7173a.c(entry.getValue(), C7010a.this.l(this.f54954b));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f54955c) {
                return C7010a.this.h(this.f54954b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f54955c) {
                return C7010a.this.l(this.f54954b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f54954b < this.f54953a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f54955c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objH = C7010a.this.h(this.f54954b);
            Object objL = C7010a.this.l(this.f54954b);
            return (objH == null ? 0 : objH.hashCode()) ^ (objL != null ? objL.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f54955c) {
                throw new IllegalStateException();
            }
            C7010a.this.j(this.f54954b);
            this.f54954b--;
            this.f54953a--;
            this.f54955c = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f54955c) {
                return C7010a.this.k(this.f54954b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: o.a$f */
    final class f extends AbstractC7017h {
        f() {
            super(C7010a.this.size());
        }

        @Override // o.AbstractC7017h
        protected Object d(int i10) {
            return C7010a.this.l(i10);
        }

        @Override // o.AbstractC7017h
        protected void e(int i10) {
            C7010a.this.j(i10);
        }
    }

    public C7010a() {
    }

    static boolean p(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // o.V, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // o.V, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        C1995a c1995a = this.f54947d;
        if (c1995a != null) {
            return c1995a;
        }
        C1995a c1995a2 = new C1995a();
        this.f54947d = c1995a2;
        return c1995a2;
    }

    @Override // o.V, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public Set keySet() {
        c cVar = this.f54948e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f54948e = cVar2;
        return cVar2;
    }

    public boolean n(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        d(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean q(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    public boolean r(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(h(size2))) {
                j(size2);
            }
        }
        return size != size();
    }

    @Override // o.V, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public Collection values() {
        e eVar = this.f54949f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f54949f = eVar2;
        return eVar2;
    }

    public C7010a(int i10) {
        super(i10);
    }

    /* renamed from: o.a$c */
    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C7010a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C7010a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return C7010a.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C7010a.p(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = C7010a.this.size() - 1; size >= 0; size--) {
                Object objH = C7010a.this.h(size);
                iHashCode += objH == null ? 0 : objH.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C7010a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C7010a.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iF = C7010a.this.f(obj);
            if (iF < 0) {
                return false;
            }
            C7010a.this.j(iF);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return C7010a.this.q(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return C7010a.this.r(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C7010a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C7010a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C7010a.this.h(i10);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C7010a.this.h(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* renamed from: o.a$e */
    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C7010a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C7010a.this.b(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C7010a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C7010a.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iB = C7010a.this.b(obj);
            if (iB < 0) {
                return false;
            }
            C7010a.this.j(iB);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = C7010a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(C7010a.this.l(i10))) {
                    C7010a.this.j(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = C7010a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(C7010a.this.l(i10))) {
                    C7010a.this.j(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return C7010a.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C7010a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C7010a.this.l(i10);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C7010a.this.l(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public C7010a(V v10) {
        super(v10);
    }
}
