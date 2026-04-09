package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Sets;
import com.google.common.collect.d0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public class LinkedListMultimap<K, V> extends com.google.common.collect.c implements c0, Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 0;

    /* renamed from: d, reason: collision with root package name */
    public transient f f11873d;

    /* renamed from: e, reason: collision with root package name */
    public transient f f11874e;

    /* renamed from: f, reason: collision with root package name */
    public transient Map f11875f;

    /* renamed from: g, reason: collision with root package name */
    public transient int f11876g;

    /* renamed from: h, reason: collision with root package name */
    public transient int f11877h;

    public class a extends AbstractSequentialList {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f11878a;

        public a(Object obj) {
            this.f11878a = obj;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            return new h(this.f11878a, i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            e eVar = (e) LinkedListMultimap.this.f11875f.get(this.f11878a);
            if (eVar == null) {
                return 0;
            }
            return eVar.f11889c;
        }
    }

    public class b extends AbstractSequentialList {
        public b() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            return new g(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return LinkedListMultimap.this.f11876g;
        }
    }

    public class c extends Sets.a {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedListMultimap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new d(LinkedListMultimap.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return !LinkedListMultimap.this.a(obj).isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedListMultimap.this.f11875f.size();
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public f f11887a;

        /* renamed from: b, reason: collision with root package name */
        public f f11888b;

        /* renamed from: c, reason: collision with root package name */
        public int f11889c;

        public e(f fVar) {
            this.f11887a = fVar;
            this.f11888b = fVar;
            fVar.f11895f = null;
            fVar.f11894e = null;
            this.f11889c = 1;
        }
    }

    public static final class f extends com.google.common.collect.b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f11890a;

        /* renamed from: b, reason: collision with root package name */
        public Object f11891b;

        /* renamed from: c, reason: collision with root package name */
        public f f11892c;

        /* renamed from: d, reason: collision with root package name */
        public f f11893d;

        /* renamed from: e, reason: collision with root package name */
        public f f11894e;

        /* renamed from: f, reason: collision with root package name */
        public f f11895f;

        public f(Object obj, Object obj2) {
            this.f11890a = obj;
            this.f11891b = obj2;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getKey() {
            return this.f11890a;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getValue() {
            return this.f11891b;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f11891b;
            this.f11891b = obj;
            return obj2;
        }
    }

    public class g implements ListIterator {

        /* renamed from: a, reason: collision with root package name */
        public int f11896a;

        /* renamed from: b, reason: collision with root package name */
        public f f11897b;

        /* renamed from: c, reason: collision with root package name */
        public f f11898c;

        /* renamed from: d, reason: collision with root package name */
        public f f11899d;

        /* renamed from: e, reason: collision with root package name */
        public int f11900e;

        public g(int i10) {
            this.f11900e = LinkedListMultimap.this.f11877h;
            int size = LinkedListMultimap.this.size();
            com.google.common.base.g.o(i10, size);
            if (i10 < size / 2) {
                this.f11897b = LinkedListMultimap.this.f11873d;
                while (true) {
                    int i11 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    next();
                    i10 = i11;
                }
            } else {
                this.f11899d = LinkedListMultimap.this.f11874e;
                this.f11896a = size;
                while (true) {
                    int i12 = i10 + 1;
                    if (i10 >= size) {
                        break;
                    }
                    previous();
                    i10 = i12;
                }
            }
            this.f11898c = null;
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        public final void b() {
            if (LinkedListMultimap.this.f11877h != this.f11900e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f next() {
            b();
            f fVar = this.f11897b;
            if (fVar == null) {
                throw new NoSuchElementException();
            }
            this.f11898c = fVar;
            this.f11899d = fVar;
            this.f11897b = fVar.f11892c;
            this.f11896a++;
            return fVar;
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public f previous() {
            b();
            f fVar = this.f11899d;
            if (fVar == null) {
                throw new NoSuchElementException();
            }
            this.f11898c = fVar;
            this.f11897b = fVar;
            this.f11899d = fVar.f11893d;
            this.f11896a--;
            return fVar;
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f11897b != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            b();
            return this.f11899d != null;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f11896a;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f11896a - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            com.google.common.base.g.s(this.f11898c != null, "no calls to next() since the last call to remove()");
            f fVar = this.f11898c;
            if (fVar != this.f11897b) {
                this.f11899d = fVar.f11893d;
                this.f11896a--;
            } else {
                this.f11897b = fVar.f11892c;
            }
            LinkedListMultimap.this.B(fVar);
            this.f11898c = null;
            this.f11900e = LinkedListMultimap.this.f11877h;
        }
    }

    public LinkedListMultimap() {
        this(12);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f11875f = CompactLinkedHashMap.b0();
        int i10 = objectInputStream.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            y(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry entry : v()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final void A(Object obj) {
        Iterators.c(new h(obj));
    }

    public final void B(f fVar) {
        f fVar2 = fVar.f11893d;
        if (fVar2 != null) {
            fVar2.f11892c = fVar.f11892c;
        } else {
            this.f11873d = fVar.f11892c;
        }
        f fVar3 = fVar.f11892c;
        if (fVar3 != null) {
            fVar3.f11893d = fVar2;
        } else {
            this.f11874e = fVar2;
        }
        if (fVar.f11895f == null && fVar.f11894e == null) {
            e eVar = (e) this.f11875f.remove(fVar.f11890a);
            Objects.requireNonNull(eVar);
            eVar.f11889c = 0;
            this.f11877h++;
        } else {
            e eVar2 = (e) this.f11875f.get(fVar.f11890a);
            Objects.requireNonNull(eVar2);
            eVar2.f11889c--;
            f fVar4 = fVar.f11895f;
            if (fVar4 == null) {
                f fVar5 = fVar.f11894e;
                Objects.requireNonNull(fVar5);
                eVar2.f11887a = fVar5;
            } else {
                fVar4.f11894e = fVar.f11894e;
            }
            f fVar6 = fVar.f11894e;
            if (fVar6 == null) {
                f fVar7 = fVar.f11895f;
                Objects.requireNonNull(fVar7);
                eVar2.f11888b = fVar7;
            } else {
                fVar6.f11895f = fVar.f11895f;
            }
        }
        this.f11876g--;
    }

    @Override // com.google.common.collect.c0
    public void clear() {
        this.f11873d = null;
        this.f11874e = null;
        this.f11875f.clear();
        this.f11876g = 0;
        this.f11877h++;
    }

    @Override // com.google.common.collect.c0
    public boolean containsKey(Object obj) {
        return this.f11875f.containsKey(obj);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ Map d() {
        return super.d();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        return super.e(obj, obj2);
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.c
    public Map g() {
        return new d0.a(this);
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.c
    public Set i() {
        return new c();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    public boolean isEmpty() {
        return this.f11873d == null;
    }

    @Override // com.google.common.collect.c
    public Iterator k() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.c0
    public int size() {
        return this.f11876g;
    }

    public final f t(Object obj, Object obj2, f fVar) {
        f fVar2 = new f(obj, obj2);
        if (this.f11873d == null) {
            this.f11874e = fVar2;
            this.f11873d = fVar2;
            this.f11875f.put(obj, new e(fVar2));
            this.f11877h++;
        } else if (fVar == null) {
            f fVar3 = this.f11874e;
            Objects.requireNonNull(fVar3);
            fVar3.f11892c = fVar2;
            fVar2.f11893d = this.f11874e;
            this.f11874e = fVar2;
            e eVar = (e) this.f11875f.get(obj);
            if (eVar == null) {
                this.f11875f.put(obj, new e(fVar2));
                this.f11877h++;
            } else {
                eVar.f11889c++;
                f fVar4 = eVar.f11888b;
                fVar4.f11894e = fVar2;
                fVar2.f11895f = fVar4;
                eVar.f11888b = fVar2;
            }
        } else {
            e eVar2 = (e) this.f11875f.get(obj);
            Objects.requireNonNull(eVar2);
            eVar2.f11889c++;
            fVar2.f11893d = fVar.f11893d;
            fVar2.f11895f = fVar.f11895f;
            fVar2.f11892c = fVar;
            fVar2.f11894e = fVar;
            f fVar5 = fVar.f11895f;
            if (fVar5 == null) {
                eVar2.f11887a = fVar2;
            } else {
                fVar5.f11894e = fVar2;
            }
            f fVar6 = fVar.f11893d;
            if (fVar6 == null) {
                this.f11873d = fVar2;
            } else {
                fVar6.f11892c = fVar2;
            }
            fVar.f11893d = fVar2;
            fVar.f11895f = fVar2;
        }
        this.f11876g++;
        return fVar2;
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.c
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public List h() {
        return new b();
    }

    public List v() {
        return (List) super.j();
    }

    @Override // com.google.common.collect.c0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public List get(Object obj) {
        return new a(obj);
    }

    public final List x(Object obj) {
        return Collections.unmodifiableList(b0.h(new h(obj)));
    }

    public boolean y(Object obj, Object obj2) {
        t(obj, obj2, null);
        return true;
    }

    @Override // com.google.common.collect.c0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public List a(Object obj) {
        List listX = x(obj);
        A(obj);
        return listX;
    }

    public LinkedListMultimap(int i10) {
        this.f11875f = k0.c(i10);
    }

    public class d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public final Set f11882a;

        /* renamed from: b, reason: collision with root package name */
        public f f11883b;

        /* renamed from: c, reason: collision with root package name */
        public f f11884c;

        /* renamed from: d, reason: collision with root package name */
        public int f11885d;

        public d() {
            this.f11882a = Sets.d(LinkedListMultimap.this.keySet().size());
            this.f11883b = LinkedListMultimap.this.f11873d;
            this.f11885d = LinkedListMultimap.this.f11877h;
        }

        public final void a() {
            if (LinkedListMultimap.this.f11877h != this.f11885d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f11883b != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            f fVar;
            a();
            f fVar2 = this.f11883b;
            if (fVar2 == null) {
                throw new NoSuchElementException();
            }
            this.f11884c = fVar2;
            this.f11882a.add(fVar2.f11890a);
            do {
                fVar = this.f11883b.f11892c;
                this.f11883b = fVar;
                if (fVar == null) {
                    break;
                }
            } while (!this.f11882a.add(fVar.f11890a));
            return this.f11884c.f11890a;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            com.google.common.base.g.s(this.f11884c != null, "no calls to next() since the last call to remove()");
            LinkedListMultimap.this.A(this.f11884c.f11890a);
            this.f11884c = null;
            this.f11885d = LinkedListMultimap.this.f11877h;
        }

        public /* synthetic */ d(LinkedListMultimap linkedListMultimap, a aVar) {
            this();
        }
    }

    public class h implements ListIterator {

        /* renamed from: a, reason: collision with root package name */
        public final Object f11902a;

        /* renamed from: b, reason: collision with root package name */
        public int f11903b;

        /* renamed from: c, reason: collision with root package name */
        public f f11904c;

        /* renamed from: d, reason: collision with root package name */
        public f f11905d;

        /* renamed from: e, reason: collision with root package name */
        public f f11906e;

        public h(Object obj) {
            this.f11902a = obj;
            e eVar = (e) LinkedListMultimap.this.f11875f.get(obj);
            this.f11904c = eVar == null ? null : eVar.f11887a;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f11906e = LinkedListMultimap.this.t(this.f11902a, obj, this.f11904c);
            this.f11903b++;
            this.f11905d = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f11904c != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f11906e != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            f fVar = this.f11904c;
            if (fVar == null) {
                throw new NoSuchElementException();
            }
            this.f11905d = fVar;
            this.f11906e = fVar;
            this.f11904c = fVar.f11894e;
            this.f11903b++;
            return fVar.f11891b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f11903b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            f fVar = this.f11906e;
            if (fVar == null) {
                throw new NoSuchElementException();
            }
            this.f11905d = fVar;
            this.f11904c = fVar;
            this.f11906e = fVar.f11895f;
            this.f11903b--;
            return fVar.f11891b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f11903b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            com.google.common.base.g.s(this.f11905d != null, "no calls to next() since the last call to remove()");
            f fVar = this.f11905d;
            if (fVar != this.f11904c) {
                this.f11906e = fVar.f11895f;
                this.f11903b--;
            } else {
                this.f11904c = fVar.f11894e;
            }
            LinkedListMultimap.this.B(fVar);
            this.f11905d = null;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            com.google.common.base.g.r(this.f11905d != null);
            this.f11905d.f11891b = obj;
        }

        public h(Object obj, int i10) {
            e eVar = (e) LinkedListMultimap.this.f11875f.get(obj);
            int i11 = eVar == null ? 0 : eVar.f11889c;
            com.google.common.base.g.o(i10, i11);
            if (i10 >= i11 / 2) {
                this.f11906e = eVar == null ? null : eVar.f11888b;
                this.f11903b = i11;
                while (true) {
                    int i12 = i10 + 1;
                    if (i10 >= i11) {
                        break;
                    }
                    previous();
                    i10 = i12;
                }
            } else {
                this.f11904c = eVar == null ? null : eVar.f11887a;
                while (true) {
                    int i13 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    next();
                    i10 = i13;
                }
            }
            this.f11902a = obj;
            this.f11905d = null;
        }
    }
}
