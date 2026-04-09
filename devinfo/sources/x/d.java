package x;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f36867a;

    public d(e eVar) {
        this.f36867a = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f36867a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f36867a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f36867a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f36867a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f36867a;
        int iA = eVar.a(obj);
        if (iA < 0) {
            return false;
        }
        eVar.h(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f36867a;
        int i4 = eVar.f36920c;
        int i10 = 0;
        boolean z3 = false;
        while (i10 < i4) {
            if (collection.contains(eVar.j(i10))) {
                eVar.h(i10);
                i10--;
                i4--;
                z3 = true;
            }
            i10++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f36867a;
        int i4 = eVar.f36920c;
        int i10 = 0;
        boolean z3 = false;
        while (i10 < i4) {
            if (!collection.contains(eVar.j(i10))) {
                eVar.h(i10);
                i10--;
                i4--;
                z3 = true;
            }
            i10++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f36867a.f36920c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f36867a;
        int i4 = eVar.f36920c;
        Object[] objArr = new Object[i4];
        for (int i10 = 0; i10 < i4; i10++) {
            objArr[i10] = eVar.j(i10);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f36867a;
        int i4 = eVar.f36920c;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        }
        for (int i10 = 0; i10 < i4; i10++) {
            objArr[i10] = eVar.j(i10);
        }
        if (objArr.length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
