package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1746y;
import androidx.datastore.preferences.protobuf.p0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* loaded from: classes.dex */
public final class D extends AbstractC1725c<String> implements E, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f15541c;

    static {
        new D(10).f15584b = false;
    }

    public D(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final void a(AbstractC1730h abstractC1730h) {
        b();
        this.f15541c.add(abstractC1730h);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b();
        this.f15541c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f15541c.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f15541c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f15541c;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1730h) {
            AbstractC1730h abstractC1730h = (AbstractC1730h) obj;
            abstractC1730h.getClass();
            String strG = abstractC1730h.size() == 0 ? "" : abstractC1730h.g(C1746y.f15707a);
            if (abstractC1730h.e()) {
                arrayList.set(i, strG);
            }
            return strG;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, C1746y.f15707a);
        p0.b bVar = p0.f15687a;
        if (p0.f15687a.c(bArr, 0, bArr.length) == 0) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final Object getRaw(int i) {
        return this.f15541c.get(i);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f15541c);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final E getUnmodifiableView() {
        return this.f15584b ? new n0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.C1746y.c
    public final C1746y.c mutableCopyWithCapacity(int i) {
        ArrayList arrayList = this.f15541c;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new D((ArrayList<Object>) arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = this.f15541c.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC1730h)) {
            return new String((byte[]) objRemove, C1746y.f15707a);
        }
        AbstractC1730h abstractC1730h = (AbstractC1730h) objRemove;
        abstractC1730h.getClass();
        return abstractC1730h.size() == 0 ? "" : abstractC1730h.g(C1746y.f15707a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.f15541c.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC1730h)) {
            return new String((byte[]) obj2, C1746y.f15707a);
        }
        AbstractC1730h abstractC1730h = (AbstractC1730h) obj2;
        abstractC1730h.getClass();
        return abstractC1730h.size() == 0 ? "" : abstractC1730h.g(C1746y.f15707a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15541c.size();
    }

    public D(ArrayList<Object> arrayList) {
        this.f15541c = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1725c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        b();
        if (collection instanceof E) {
            collection = ((E) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f15541c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
