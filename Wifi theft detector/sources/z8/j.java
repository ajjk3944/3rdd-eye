package z8;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class j extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final a f25408d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final Object[] f25409e = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f25410a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f25411b = f25409e;

    /* renamed from: c, reason: collision with root package name */
    public int f25412c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public a() {
        }
    }

    private final void i(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f25411b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f25409e) {
            this.f25411b = new Object[q9.e.b(i10, 10)];
        } else {
            g(d.Companion.e(objArr.length, i10));
        }
    }

    private final void w() {
        ((AbstractList) this).modCount++;
    }

    public final void A(int i10, int i11) {
        int iV = v(this.f25410a + i11);
        int iV2 = v(this.f25410a + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f25411b;
            i11 = Math.min(size, Math.min(objArr.length - iV, objArr.length - iV2));
            Object[] objArr2 = this.f25411b;
            int i12 = iV + i11;
            m.g(objArr2, objArr2, iV2, iV, i12);
            iV = v(i12);
            iV2 = v(iV2 + i11);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        kotlin.jvm.internal.p.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        w();
        i(size() + elements.size());
        f(v(this.f25410a + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        w();
        i(size() + 1);
        int iH = h(this.f25410a);
        this.f25410a = iH;
        this.f25411b[iH] = obj;
        this.f25412c = size() + 1;
    }

    public final void addLast(Object obj) {
        w();
        i(size() + 1);
        this.f25411b[v(this.f25410a + size())] = obj;
        this.f25412c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            w();
            u(this.f25410a, v(this.f25410a + size()));
        }
        this.f25410a = 0;
        this.f25412c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // z8.f
    /* renamed from: d */
    public int getLength() {
        return this.f25412c;
    }

    @Override // z8.f
    public Object e(int i10) {
        d.Companion.b(i10, size());
        if (i10 == r.k(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        w();
        int iV = v(this.f25410a + i10);
        Object obj = this.f25411b[iV];
        if (i10 < (size() >> 1)) {
            int i11 = this.f25410a;
            if (iV >= i11) {
                Object[] objArr = this.f25411b;
                m.g(objArr, objArr, i11 + 1, i11, iV);
            } else {
                Object[] objArr2 = this.f25411b;
                m.g(objArr2, objArr2, 1, 0, iV);
                Object[] objArr3 = this.f25411b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f25410a;
                m.g(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f25411b;
            int i13 = this.f25410a;
            objArr4[i13] = null;
            this.f25410a = j(i13);
        } else {
            int iV2 = v(this.f25410a + r.k(this));
            if (iV <= iV2) {
                Object[] objArr5 = this.f25411b;
                m.g(objArr5, objArr5, iV, iV + 1, iV2 + 1);
            } else {
                Object[] objArr6 = this.f25411b;
                m.g(objArr6, objArr6, iV, iV + 1, objArr6.length);
                Object[] objArr7 = this.f25411b;
                objArr7[objArr7.length - 1] = objArr7[0];
                m.g(objArr7, objArr7, 0, 1, iV2 + 1);
            }
            this.f25411b[iV2] = null;
        }
        this.f25412c = size() - 1;
        return obj;
    }

    public final void f(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f25411b.length;
        while (i10 < length && it.hasNext()) {
            this.f25411b[i10] = it.next();
            i10++;
        }
        int i11 = this.f25410a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f25411b[i12] = it.next();
        }
        this.f25412c = size() + collection.size();
    }

    public final void g(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f25411b;
        m.g(objArr2, objArr, 0, this.f25410a, objArr2.length);
        Object[] objArr3 = this.f25411b;
        int length = objArr3.length;
        int i11 = this.f25410a;
        m.g(objArr3, objArr, length - i11, 0, i11);
        this.f25410a = 0;
        this.f25411b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        d.Companion.b(i10, size());
        return this.f25411b[v(this.f25410a + i10)];
    }

    public final int h(int i10) {
        return i10 == 0 ? o.D(this.f25411b) : i10 - 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iV = v(this.f25410a + size());
        int length = this.f25410a;
        if (length < iV) {
            while (length < iV) {
                if (kotlin.jvm.internal.p.a(obj, this.f25411b[length])) {
                    i10 = this.f25410a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iV) {
            return -1;
        }
        int length2 = this.f25411b.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iV; i11++) {
                    if (kotlin.jvm.internal.p.a(obj, this.f25411b[i11])) {
                        length = i11 + this.f25411b.length;
                        i10 = this.f25410a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.p.a(obj, this.f25411b[length])) {
                i10 = this.f25410a;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int j(int i10) {
        if (i10 == o.D(this.f25411b)) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iD;
        int i10;
        int iV = v(this.f25410a + size());
        int i11 = this.f25410a;
        if (i11 < iV) {
            iD = iV - 1;
            if (i11 <= iD) {
                while (!kotlin.jvm.internal.p.a(obj, this.f25411b[iD])) {
                    if (iD != i11) {
                        iD--;
                    }
                }
                i10 = this.f25410a;
                return iD - i10;
            }
            return -1;
        }
        if (i11 > iV) {
            int i12 = iV - 1;
            while (true) {
                if (-1 >= i12) {
                    iD = o.D(this.f25411b);
                    int i13 = this.f25410a;
                    if (i13 <= iD) {
                        while (!kotlin.jvm.internal.p.a(obj, this.f25411b[iD])) {
                            if (iD != i13) {
                                iD--;
                            }
                        }
                        i10 = this.f25410a;
                    }
                } else {
                    if (kotlin.jvm.internal.p.a(obj, this.f25411b[i12])) {
                        iD = i12 + this.f25411b.length;
                        i10 = this.f25410a;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int iV;
        kotlin.jvm.internal.p.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f25411b.length != 0) {
            int iV2 = v(this.f25410a + size());
            int i10 = this.f25410a;
            if (i10 < iV2) {
                iV = i10;
                while (i10 < iV2) {
                    Object obj = this.f25411b[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f25411b[iV] = obj;
                        iV++;
                    }
                    i10++;
                }
                m.n(this.f25411b, null, iV, iV2);
            } else {
                int length = this.f25411b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f25411b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f25411b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iV = v(i11);
                for (int i12 = 0; i12 < iV2; i12++) {
                    Object[] objArr2 = this.f25411b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f25411b[iV] = obj3;
                        iV = j(iV);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                w();
                this.f25412c = s(iV - this.f25410a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        w();
        Object[] objArr = this.f25411b;
        int i10 = this.f25410a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f25410a = j(i10);
        this.f25412c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        w();
        int iV = v(this.f25410a + r.k(this));
        Object[] objArr = this.f25411b;
        Object obj = objArr[iV];
        objArr[iV] = null;
        this.f25412c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        d.Companion.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            remove(i10);
            return;
        }
        w();
        if (i10 < size() - i11) {
            z(i10, i11);
            int iV = v(this.f25410a + i12);
            u(this.f25410a, iV);
            this.f25410a = iV;
        } else {
            A(i10, i11);
            int iV2 = v(this.f25410a + size());
            u(s(iV2 - i12), iV2);
        }
        this.f25412c = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int iV;
        kotlin.jvm.internal.p.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f25411b.length != 0) {
            int iV2 = v(this.f25410a + size());
            int i10 = this.f25410a;
            if (i10 < iV2) {
                iV = i10;
                while (i10 < iV2) {
                    Object obj = this.f25411b[i10];
                    if (elements.contains(obj)) {
                        this.f25411b[iV] = obj;
                        iV++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                m.n(this.f25411b, null, iV, iV2);
            } else {
                int length = this.f25411b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f25411b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f25411b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iV = v(i11);
                for (int i12 = 0; i12 < iV2; i12++) {
                    Object[] objArr2 = this.f25411b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f25411b[iV] = obj3;
                        iV = j(iV);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                w();
                this.f25412c = s(iV - this.f25410a);
            }
        }
        return z10;
    }

    public final int s(int i10) {
        return i10 < 0 ? i10 + this.f25411b.length : i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        d.Companion.b(i10, size());
        int iV = v(this.f25410a + i10);
        Object[] objArr = this.f25411b;
        Object obj2 = objArr[iV];
        objArr[iV] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) throws NegativeArraySizeException {
        kotlin.jvm.internal.p.e(array, "array");
        if (array.length < size()) {
            array = k.a(array, size());
        }
        Object[] objArr = array;
        int iV = v(this.f25410a + size());
        int i10 = this.f25410a;
        if (i10 < iV) {
            m.j(this.f25411b, objArr, 0, i10, iV, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f25411b;
            m.g(objArr2, objArr, 0, this.f25410a, objArr2.length);
            Object[] objArr3 = this.f25411b;
            m.g(objArr3, objArr, objArr3.length - this.f25410a, 0, iV);
        }
        return q.f(size(), objArr);
    }

    public final void u(int i10, int i11) {
        if (i10 < i11) {
            m.n(this.f25411b, null, i10, i11);
            return;
        }
        Object[] objArr = this.f25411b;
        m.n(objArr, null, i10, objArr.length);
        m.n(this.f25411b, null, 0, i11);
    }

    public final int v(int i10) {
        Object[] objArr = this.f25411b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final Object x() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object y() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    public final void z(int i10, int i11) {
        int iV = v(this.f25410a + (i10 - 1));
        int iV2 = v(this.f25410a + (i11 - 1));
        while (i10 > 0) {
            int i12 = iV + 1;
            int iMin = Math.min(i10, Math.min(i12, iV2 + 1));
            Object[] objArr = this.f25411b;
            int i13 = iV2 - iMin;
            int i14 = iV - iMin;
            m.g(objArr, objArr, i13 + 1, i14 + 1, i12);
            iV = s(i14);
            iV2 = s(i13);
            i10 -= iMin;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        d.Companion.c(i10, size());
        if (i10 == size()) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        w();
        i(size() + 1);
        int iV = v(this.f25410a + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iH = h(iV);
            int iH2 = h(this.f25410a);
            int i11 = this.f25410a;
            if (iH >= i11) {
                Object[] objArr = this.f25411b;
                objArr[iH2] = objArr[i11];
                m.g(objArr, objArr, i11, i11 + 1, iH + 1);
            } else {
                Object[] objArr2 = this.f25411b;
                m.g(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f25411b;
                objArr3[objArr3.length - 1] = objArr3[0];
                m.g(objArr3, objArr3, 0, 1, iH + 1);
            }
            this.f25411b[iH] = obj;
            this.f25410a = iH2;
        } else {
            int iV2 = v(this.f25410a + size());
            if (iV < iV2) {
                Object[] objArr4 = this.f25411b;
                m.g(objArr4, objArr4, iV + 1, iV, iV2);
            } else {
                Object[] objArr5 = this.f25411b;
                m.g(objArr5, objArr5, 1, 0, iV2);
                Object[] objArr6 = this.f25411b;
                objArr6[0] = objArr6[objArr6.length - 1];
                m.g(objArr6, objArr6, iV + 1, iV, objArr6.length - 1);
            }
            this.f25411b[iV] = obj;
        }
        this.f25412c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        kotlin.jvm.internal.p.e(elements, "elements");
        d.Companion.c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        w();
        i(size() + elements.size());
        int iV = v(this.f25410a + size());
        int iV2 = v(this.f25410a + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f25410a;
            int length = i11 - size;
            if (iV2 < i11) {
                Object[] objArr = this.f25411b;
                m.g(objArr, objArr, length, i11, objArr.length);
                if (size >= iV2) {
                    Object[] objArr2 = this.f25411b;
                    m.g(objArr2, objArr2, objArr2.length - size, 0, iV2);
                } else {
                    Object[] objArr3 = this.f25411b;
                    m.g(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f25411b;
                    m.g(objArr4, objArr4, 0, size, iV2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f25411b;
                m.g(objArr5, objArr5, length, i11, iV2);
            } else {
                Object[] objArr6 = this.f25411b;
                length += objArr6.length;
                int i12 = iV2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    m.g(objArr6, objArr6, length, i11, iV2);
                } else {
                    m.g(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f25411b;
                    m.g(objArr7, objArr7, 0, this.f25410a + length2, iV2);
                }
            }
            this.f25410a = length;
            f(s(iV2 - size), elements);
        } else {
            int i13 = iV2 + size;
            if (iV2 < iV) {
                int i14 = size + iV;
                Object[] objArr8 = this.f25411b;
                if (i14 <= objArr8.length) {
                    m.g(objArr8, objArr8, i13, iV2, iV);
                } else if (i13 >= objArr8.length) {
                    m.g(objArr8, objArr8, i13 - objArr8.length, iV2, iV);
                } else {
                    int length3 = iV - (i14 - objArr8.length);
                    m.g(objArr8, objArr8, 0, length3, iV);
                    Object[] objArr9 = this.f25411b;
                    m.g(objArr9, objArr9, i13, iV2, length3);
                }
            } else {
                Object[] objArr10 = this.f25411b;
                m.g(objArr10, objArr10, size, 0, iV);
                Object[] objArr11 = this.f25411b;
                if (i13 >= objArr11.length) {
                    m.g(objArr11, objArr11, i13 - objArr11.length, iV2, objArr11.length);
                } else {
                    m.g(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f25411b;
                    m.g(objArr12, objArr12, i13, iV2, objArr12.length - size);
                }
            }
            f(iV2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
