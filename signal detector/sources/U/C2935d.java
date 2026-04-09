package u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2935d implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2936e f23690a;

    public C2935d(C2936e c2936e) {
        this.f23690a = c2936e;
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
        this.f23690a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f23690a.a(obj) >= 0;
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
        return this.f23690a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2932a(this.f23690a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C2936e c2936e = this.f23690a;
        int iA = c2936e.a(obj);
        if (iA < 0) {
            return false;
        }
        c2936e.h(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C2936e c2936e = this.f23690a;
        int i = c2936e.f23705c;
        int i3 = 0;
        boolean z6 = false;
        while (i3 < i) {
            if (collection.contains(c2936e.j(i3))) {
                c2936e.h(i3);
                i3--;
                i--;
                z6 = true;
            }
            i3++;
        }
        return z6;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2936e c2936e = this.f23690a;
        int i = c2936e.f23705c;
        int i3 = 0;
        boolean z6 = false;
        while (i3 < i) {
            if (!collection.contains(c2936e.j(i3))) {
                c2936e.h(i3);
                i3--;
                i--;
                z6 = true;
            }
            i3++;
        }
        return z6;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f23690a.f23705c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C2936e c2936e = this.f23690a;
        int i = c2936e.f23705c;
        Object[] objArr = new Object[i];
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = c2936e.j(i3);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2936e c2936e = this.f23690a;
        int i = c2936e.f23705c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = c2936e.j(i3);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
