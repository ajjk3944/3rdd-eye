package zj;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f38312d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f38313a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f38314b = f38312d;

    /* renamed from: c, reason: collision with root package name */
    public int f38315c;

    @Override // zj.g
    public final int a() {
        return this.f38315c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        nk.k.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m();
        f(collection.size() + a());
        d(l(a() + this.f38313a), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m();
        f(this.f38315c + 1);
        int length = this.f38313a;
        if (length == 0) {
            Object[] objArr = this.f38314b;
            nk.k.e(objArr, "<this>");
            length = objArr.length;
        }
        int i4 = length - 1;
        this.f38313a = i4;
        this.f38314b[i4] = obj;
        this.f38315c++;
    }

    public final void addLast(Object obj) {
        m();
        f(a() + 1);
        this.f38314b[l(a() + this.f38313a)] = obj;
        this.f38315c = a() + 1;
    }

    @Override // zj.g
    public final Object c(int i4) {
        b bVar = e.Companion;
        int i10 = this.f38315c;
        bVar.getClass();
        b.a(i4, i10);
        if (i4 == cm.g.r(this)) {
            return removeLast();
        }
        if (i4 == 0) {
            return removeFirst();
        }
        m();
        int iL = l(this.f38313a + i4);
        Object[] objArr = this.f38314b;
        Object obj = objArr[iL];
        if (i4 < (this.f38315c >> 1)) {
            int i11 = this.f38313a;
            if (iL >= i11) {
                m.N(i11 + 1, i11, iL, objArr, objArr);
            } else {
                m.N(1, 0, iL, objArr, objArr);
                Object[] objArr2 = this.f38314b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i12 = this.f38313a;
                m.N(i12 + 1, i12, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f38314b;
            int i13 = this.f38313a;
            objArr3[i13] = null;
            this.f38313a = g(i13);
        } else {
            int iL2 = l(cm.g.r(this) + this.f38313a);
            if (iL <= iL2) {
                Object[] objArr4 = this.f38314b;
                m.N(iL, iL + 1, iL2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f38314b;
                m.N(iL, iL + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f38314b;
                objArr6[objArr6.length - 1] = objArr6[0];
                m.N(0, 1, iL2 + 1, objArr6, objArr6);
            }
            this.f38314b[iL2] = null;
        }
        this.f38315c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m();
            k(this.f38313a, l(a() + this.f38313a));
        }
        this.f38313a = 0;
        this.f38315c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i4, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f38314b.length;
        while (i4 < length && it.hasNext()) {
            this.f38314b[i4] = it.next();
            i4++;
        }
        int i10 = this.f38313a;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f38314b[i11] = it.next();
        }
        this.f38315c = collection.size() + this.f38315c;
    }

    public final void f(int i4) {
        if (i4 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f38314b;
        if (i4 <= objArr.length) {
            return;
        }
        if (objArr == f38312d) {
            if (i4 < 10) {
                i4 = 10;
            }
            this.f38314b = new Object[i4];
            return;
        }
        b bVar = e.Companion;
        int length = objArr.length;
        bVar.getClass();
        Object[] objArr2 = new Object[b.d(length, i4)];
        Object[] objArr3 = this.f38314b;
        m.N(0, this.f38313a, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.f38314b;
        int length2 = objArr4.length;
        int i10 = this.f38313a;
        m.N(length2 - i10, 0, i10, objArr4, objArr2);
        this.f38313a = 0;
        this.f38314b = objArr2;
    }

    public final int g(int i4) {
        nk.k.e(this.f38314b, "<this>");
        if (i4 == r0.length - 1) {
            return 0;
        }
        return i4 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        b bVar = e.Companion;
        int i10 = this.f38315c;
        bVar.getClass();
        b.a(i4, i10);
        return this.f38314b[l(this.f38313a + i4)];
    }

    public final Object i() {
        if (isEmpty()) {
            return null;
        }
        return this.f38314b[l(cm.g.r(this) + this.f38313a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i4;
        int iL = l(a() + this.f38313a);
        int length = this.f38313a;
        if (length < iL) {
            while (length < iL) {
                if (nk.k.a(obj, this.f38314b[length])) {
                    i4 = this.f38313a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iL) {
            return -1;
        }
        int length2 = this.f38314b.length;
        while (true) {
            if (length >= length2) {
                for (int i10 = 0; i10 < iL; i10++) {
                    if (nk.k.a(obj, this.f38314b[i10])) {
                        length = i10 + this.f38314b.length;
                        i4 = this.f38313a;
                    }
                }
                return -1;
            }
            if (nk.k.a(obj, this.f38314b[length])) {
                i4 = this.f38313a;
                break;
            }
            length++;
        }
        return length - i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final int j(int i4) {
        return i4 < 0 ? i4 + this.f38314b.length : i4;
    }

    public final void k(int i4, int i10) {
        if (i4 < i10) {
            m.U(i4, i10, null, this.f38314b);
            return;
        }
        Object[] objArr = this.f38314b;
        m.U(i4, objArr.length, null, objArr);
        m.U(0, i10, null, this.f38314b);
    }

    public final int l(int i4) {
        Object[] objArr = this.f38314b;
        return i4 >= objArr.length ? i4 - objArr.length : i4;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f38314b[l(cm.g.r(this) + this.f38313a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i4;
        int iL = l(this.f38315c + this.f38313a);
        int i10 = this.f38313a;
        if (i10 < iL) {
            length = iL - 1;
            if (i10 <= length) {
                while (!nk.k.a(obj, this.f38314b[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i4 = this.f38313a;
                return length - i4;
            }
            return -1;
        }
        if (i10 > iL) {
            int i11 = iL - 1;
            while (true) {
                if (-1 >= i11) {
                    Object[] objArr = this.f38314b;
                    nk.k.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.f38313a;
                    if (i12 <= length) {
                        while (!nk.k.a(obj, this.f38314b[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                        i4 = this.f38313a;
                    }
                } else {
                    if (nk.k.a(obj, this.f38314b[i11])) {
                        length = i11 + this.f38314b.length;
                        i4 = this.f38313a;
                        break;
                    }
                    i11--;
                }
            }
        }
        return -1;
    }

    public final void m() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iL;
        nk.k.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f38314b.length != 0) {
            int iL2 = l(a() + this.f38313a);
            int i4 = this.f38313a;
            if (i4 < iL2) {
                iL = i4;
                while (i4 < iL2) {
                    Object obj = this.f38314b[i4];
                    if (collection.contains(obj)) {
                        z3 = true;
                    } else {
                        this.f38314b[iL] = obj;
                        iL++;
                    }
                    i4++;
                }
                m.U(iL, iL2, null, this.f38314b);
            } else {
                int length = this.f38314b.length;
                boolean z10 = false;
                int i10 = i4;
                while (i4 < length) {
                    Object[] objArr = this.f38314b;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (collection.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.f38314b[i10] = obj2;
                        i10++;
                    }
                    i4++;
                }
                iL = l(i10);
                for (int i11 = 0; i11 < iL2; i11++) {
                    Object[] objArr2 = this.f38314b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (collection.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.f38314b[iL] = obj3;
                        iL = g(iL);
                    }
                }
                z3 = z10;
            }
            if (z3) {
                m();
                this.f38315c = j(iL - this.f38313a);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m();
        Object[] objArr = this.f38314b;
        int i4 = this.f38313a;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f38313a = g(i4);
        this.f38315c = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m();
        int iL = l(cm.g.r(this) + this.f38313a);
        Object[] objArr = this.f38314b;
        Object obj = objArr[iL];
        objArr[iL] = null;
        this.f38315c = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i10) {
        b bVar = e.Companion;
        int i11 = this.f38315c;
        bVar.getClass();
        b.c(i4, i10, i11);
        int i12 = i10 - i4;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f38315c) {
            clear();
            return;
        }
        if (i12 == 1) {
            c(i4);
            return;
        }
        m();
        if (i4 < this.f38315c - i10) {
            int iL = l(this.f38313a + (i4 - 1));
            int iL2 = l(this.f38313a + (i10 - 1));
            while (i4 > 0) {
                int i13 = iL + 1;
                int iMin = Math.min(i4, Math.min(i13, iL2 + 1));
                Object[] objArr = this.f38314b;
                int i14 = iL2 - iMin;
                int i15 = iL - iMin;
                m.N(i14 + 1, i15 + 1, i13, objArr, objArr);
                iL = j(i15);
                iL2 = j(i14);
                i4 -= iMin;
            }
            int iL3 = l(this.f38313a + i12);
            k(this.f38313a, iL3);
            this.f38313a = iL3;
        } else {
            int iL4 = l(this.f38313a + i10);
            int iL5 = l(this.f38313a + i4);
            int i16 = this.f38315c;
            while (true) {
                i16 -= i10;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f38314b;
                i10 = Math.min(i16, Math.min(objArr2.length - iL4, objArr2.length - iL5));
                Object[] objArr3 = this.f38314b;
                int i17 = iL4 + i10;
                m.N(iL5, iL4, i17, objArr3, objArr3);
                iL4 = l(i17);
                iL5 = l(iL5 + i10);
            }
            int iL6 = l(this.f38315c + this.f38313a);
            k(j(iL6 - i12), iL6);
        }
        this.f38315c -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iL;
        nk.k.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f38314b.length != 0) {
            int iL2 = l(a() + this.f38313a);
            int i4 = this.f38313a;
            if (i4 < iL2) {
                iL = i4;
                while (i4 < iL2) {
                    Object obj = this.f38314b[i4];
                    if (collection.contains(obj)) {
                        this.f38314b[iL] = obj;
                        iL++;
                    } else {
                        z3 = true;
                    }
                    i4++;
                }
                m.U(iL, iL2, null, this.f38314b);
            } else {
                int length = this.f38314b.length;
                boolean z10 = false;
                int i10 = i4;
                while (i4 < length) {
                    Object[] objArr = this.f38314b;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (collection.contains(obj2)) {
                        this.f38314b[i10] = obj2;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i4++;
                }
                iL = l(i10);
                for (int i11 = 0; i11 < iL2; i11++) {
                    Object[] objArr2 = this.f38314b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (collection.contains(obj3)) {
                        this.f38314b[iL] = obj3;
                        iL = g(iL);
                    } else {
                        z10 = true;
                    }
                }
                z3 = z10;
            }
            if (z3) {
                m();
                this.f38315c = j(iL - this.f38313a);
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        b bVar = e.Companion;
        int i10 = this.f38315c;
        bVar.getClass();
        b.a(i4, i10);
        int iL = l(this.f38313a + i4);
        Object[] objArr = this.f38314b;
        Object obj2 = objArr[iL];
        objArr[iL] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int length;
        b bVar = e.Companion;
        int i10 = this.f38315c;
        bVar.getClass();
        b.b(i4, i10);
        if (i4 == this.f38315c) {
            addLast(obj);
            return;
        }
        if (i4 == 0) {
            addFirst(obj);
            return;
        }
        m();
        f(this.f38315c + 1);
        int iL = l(this.f38313a + i4);
        int i11 = this.f38315c;
        if (i4 < ((i11 + 1) >> 1)) {
            if (iL == 0) {
                Object[] objArr = this.f38314b;
                nk.k.e(objArr, "<this>");
                iL = objArr.length;
            }
            int i12 = iL - 1;
            int i13 = this.f38313a;
            if (i13 == 0) {
                Object[] objArr2 = this.f38314b;
                nk.k.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i13 - 1;
            }
            int i14 = this.f38313a;
            if (i12 >= i14) {
                Object[] objArr3 = this.f38314b;
                objArr3[length] = objArr3[i14];
                m.N(i14, i14 + 1, i12 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f38314b;
                m.N(i14 - 1, i14, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f38314b;
                objArr5[objArr5.length - 1] = objArr5[0];
                m.N(0, 1, i12 + 1, objArr5, objArr5);
            }
            this.f38314b[i12] = obj;
            this.f38313a = length;
        } else {
            int iL2 = l(i11 + this.f38313a);
            if (iL < iL2) {
                Object[] objArr6 = this.f38314b;
                m.N(iL + 1, iL, iL2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f38314b;
                m.N(1, 0, iL2, objArr7, objArr7);
                Object[] objArr8 = this.f38314b;
                objArr8[0] = objArr8[objArr8.length - 1];
                m.N(iL + 1, iL, objArr8.length - 1, objArr8, objArr8);
            }
            this.f38314b[iL] = obj;
        }
        this.f38315c++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        nk.k.e(objArr, "array");
        int length = objArr.length;
        int i4 = this.f38315c;
        if (length < i4) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i4);
            nk.k.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iL = l(this.f38315c + this.f38313a);
        int i10 = this.f38313a;
        if (i10 < iL) {
            m.R(i10, iL, 2, this.f38314b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f38314b;
            m.N(0, this.f38313a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f38314b;
            m.N(objArr3.length - this.f38313a, 0, iL, objArr3, objArr);
        }
        int i11 = this.f38315c;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        nk.k.e(collection, "elements");
        b bVar = e.Companion;
        int i10 = this.f38315c;
        bVar.getClass();
        b.b(i4, i10);
        if (collection.isEmpty()) {
            return false;
        }
        if (i4 == this.f38315c) {
            return addAll(collection);
        }
        m();
        f(collection.size() + this.f38315c);
        int iL = l(this.f38315c + this.f38313a);
        int iL2 = l(this.f38313a + i4);
        int size = collection.size();
        if (i4 < ((this.f38315c + 1) >> 1)) {
            int i11 = this.f38313a;
            int length = i11 - size;
            if (iL2 < i11) {
                Object[] objArr = this.f38314b;
                m.N(length, i11, objArr.length, objArr, objArr);
                if (size >= iL2) {
                    Object[] objArr2 = this.f38314b;
                    m.N(objArr2.length - size, 0, iL2, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.f38314b;
                    m.N(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.f38314b;
                    m.N(0, size, iL2, objArr4, objArr4);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f38314b;
                m.N(length, i11, iL2, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f38314b;
                length += objArr6.length;
                int i12 = iL2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    m.N(length, i11, iL2, objArr6, objArr6);
                } else {
                    m.N(length, i11, i11 + length2, objArr6, objArr6);
                    Object[] objArr7 = this.f38314b;
                    m.N(0, this.f38313a + length2, iL2, objArr7, objArr7);
                }
            }
            this.f38313a = length;
            d(j(iL2 - size), collection);
            return true;
        }
        int i13 = iL2 + size;
        if (iL2 < iL) {
            int i14 = size + iL;
            Object[] objArr8 = this.f38314b;
            if (i14 <= objArr8.length) {
                m.N(i13, iL2, iL, objArr8, objArr8);
            } else if (i13 >= objArr8.length) {
                m.N(i13 - objArr8.length, iL2, iL, objArr8, objArr8);
            } else {
                int length3 = iL - (i14 - objArr8.length);
                m.N(0, length3, iL, objArr8, objArr8);
                Object[] objArr9 = this.f38314b;
                m.N(i13, iL2, length3, objArr9, objArr9);
            }
        } else {
            Object[] objArr10 = this.f38314b;
            m.N(size, 0, iL, objArr10, objArr10);
            Object[] objArr11 = this.f38314b;
            if (i13 >= objArr11.length) {
                m.N(i13 - objArr11.length, iL2, objArr11.length, objArr11, objArr11);
            } else {
                m.N(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                Object[] objArr12 = this.f38314b;
                m.N(i13, iL2, objArr12.length - size, objArr12, objArr12);
            }
        }
        d(iL2, collection);
        return true;
    }
}
