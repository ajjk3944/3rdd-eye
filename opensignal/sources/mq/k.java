package mq;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.e5;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class k extends f {

    /* renamed from: r, reason: collision with root package name */
    public static final Object[] f16936r = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f16937a;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f16938d = f16936r;

    /* renamed from: g, reason: collision with root package name */
    public int f16939g;

    @Override // mq.f
    public final int a() {
        return this.f16939g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int length;
        int i11 = this.f16939g;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
        }
        if (i10 == i11) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        l();
        d(this.f16939g + 1);
        int iK = k(this.f16937a + i10);
        int i12 = this.f16939g;
        if (i10 < ((i12 + 1) >> 1)) {
            if (iK == 0) {
                Object[] objArr = this.f16938d;
                br.l.e(objArr, "<this>");
                iK = objArr.length;
            }
            int i13 = iK - 1;
            int i14 = this.f16937a;
            if (i14 == 0) {
                Object[] objArr2 = this.f16938d;
                br.l.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i14 - 1;
            }
            int i15 = this.f16937a;
            if (i13 >= i15) {
                Object[] objArr3 = this.f16938d;
                objArr3[length] = objArr3[i15];
                l.c0(i15, i15 + 1, i13 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f16938d;
                l.c0(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f16938d;
                objArr5[objArr5.length - 1] = objArr5[0];
                l.c0(0, 1, i13 + 1, objArr5, objArr5);
            }
            this.f16938d[i13] = obj;
            this.f16937a = length;
        } else {
            int iK2 = k(i12 + this.f16937a);
            if (iK < iK2) {
                Object[] objArr6 = this.f16938d;
                l.c0(iK + 1, iK, iK2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f16938d;
                l.c0(1, 0, iK2, objArr7, objArr7);
                Object[] objArr8 = this.f16938d;
                objArr8[0] = objArr8[objArr8.length - 1];
                l.c0(iK + 1, iK, objArr8.length - 1, objArr8, objArr8);
            }
            this.f16938d[iK] = obj;
        }
        this.f16939g++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        br.l.e(collection, "elements");
        int i11 = this.f16939g;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == this.f16939g) {
            return addAll(collection);
        }
        l();
        d(collection.size() + this.f16939g);
        int iK = k(this.f16939g + this.f16937a);
        int iK2 = k(this.f16937a + i10);
        int size = collection.size();
        if (i10 >= ((this.f16939g + 1) >> 1)) {
            int i12 = iK2 + size;
            if (iK2 < iK) {
                int i13 = size + iK;
                Object[] objArr = this.f16938d;
                if (i13 <= objArr.length) {
                    l.c0(i12, iK2, iK, objArr, objArr);
                } else if (i12 >= objArr.length) {
                    l.c0(i12 - objArr.length, iK2, iK, objArr, objArr);
                } else {
                    int length = iK - (i13 - objArr.length);
                    l.c0(0, length, iK, objArr, objArr);
                    Object[] objArr2 = this.f16938d;
                    l.c0(i12, iK2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f16938d;
                l.c0(size, 0, iK, objArr3, objArr3);
                Object[] objArr4 = this.f16938d;
                if (i12 >= objArr4.length) {
                    l.c0(i12 - objArr4.length, iK2, objArr4.length, objArr4, objArr4);
                } else {
                    l.c0(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f16938d;
                    l.c0(i12, iK2, objArr5.length - size, objArr5, objArr5);
                }
            }
            c(iK2, collection);
            return true;
        }
        int i14 = this.f16937a;
        int length2 = i14 - size;
        if (iK2 < i14) {
            Object[] objArr6 = this.f16938d;
            l.c0(length2, i14, objArr6.length, objArr6, objArr6);
            if (size >= iK2) {
                Object[] objArr7 = this.f16938d;
                l.c0(objArr7.length - size, 0, iK2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f16938d;
                l.c0(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f16938d;
                l.c0(0, size, iK2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f16938d;
            l.c0(length2, i14, iK2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f16938d;
            length2 += objArr11.length;
            int i15 = iK2 - i14;
            int length3 = objArr11.length - length2;
            if (length3 >= i15) {
                l.c0(length2, i14, iK2, objArr11, objArr11);
            } else {
                l.c0(length2, i14, i14 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f16938d;
                l.c0(0, this.f16937a + length3, iK2, objArr12, objArr12);
            }
        }
        this.f16937a = length2;
        c(g(iK2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        l();
        d(this.f16939g + 1);
        int length = this.f16937a;
        if (length == 0) {
            Object[] objArr = this.f16938d;
            br.l.e(objArr, "<this>");
            length = objArr.length;
        }
        int i10 = length - 1;
        this.f16937a = i10;
        this.f16938d[i10] = obj;
        this.f16939g++;
    }

    public final void addLast(Object obj) {
        l();
        d(a() + 1);
        this.f16938d[k(a() + this.f16937a)] = obj;
        this.f16939g = a() + 1;
    }

    @Override // mq.f
    public final Object b(int i10) {
        int i11 = this.f16939g;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
        }
        if (i10 == e5.z(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        l();
        int iK = k(this.f16937a + i10);
        Object[] objArr = this.f16938d;
        Object obj = objArr[iK];
        if (i10 < (this.f16939g >> 1)) {
            int i12 = this.f16937a;
            if (iK >= i12) {
                l.c0(i12 + 1, i12, iK, objArr, objArr);
            } else {
                l.c0(1, 0, iK, objArr, objArr);
                Object[] objArr2 = this.f16938d;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f16937a;
                l.c0(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f16938d;
            int i14 = this.f16937a;
            objArr3[i14] = null;
            this.f16937a = e(i14);
        } else {
            int iK2 = k(e5.z(this) + this.f16937a);
            if (iK <= iK2) {
                Object[] objArr4 = this.f16938d;
                l.c0(iK, iK + 1, iK2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f16938d;
                l.c0(iK, iK + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f16938d;
                objArr6[objArr6.length - 1] = objArr6[0];
                l.c0(0, 1, iK2 + 1, objArr6, objArr6);
            }
            this.f16938d[iK2] = null;
        }
        this.f16939g--;
        return obj;
    }

    public final void c(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f16938d.length;
        while (i10 < length && it.hasNext()) {
            this.f16938d[i10] = it.next();
            i10++;
        }
        int i11 = this.f16937a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f16938d[i12] = it.next();
        }
        this.f16939g = collection.size() + this.f16939g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            l();
            j(this.f16937a, k(a() + this.f16937a));
        }
        this.f16937a = 0;
        this.f16939g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f16938d;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f16936r) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f16938d = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        l.c0(0, this.f16937a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f16938d;
        int length2 = objArr3.length;
        int i12 = this.f16937a;
        l.c0(length2 - i12, 0, i12, objArr3, objArr2);
        this.f16937a = 0;
        this.f16938d = objArr2;
    }

    public final int e(int i10) {
        br.l.e(this.f16938d, "<this>");
        if (i10 == r0.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final int g(int i10) {
        return i10 < 0 ? i10 + this.f16938d.length : i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int iA = a();
        if (i10 < 0 || i10 >= iA) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, iA, ", size: "));
        }
        return this.f16938d[k(this.f16937a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int iK = k(a() + this.f16937a);
        int length = this.f16937a;
        if (length < iK) {
            while (length < iK) {
                if (br.l.a(obj, this.f16938d[length])) {
                    i10 = this.f16937a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iK) {
            return -1;
        }
        int length2 = this.f16938d.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iK; i11++) {
                    if (br.l.a(obj, this.f16938d[i11])) {
                        length = i11 + this.f16938d.length;
                        i10 = this.f16937a;
                    }
                }
                return -1;
            }
            if (br.l.a(obj, this.f16938d[length])) {
                i10 = this.f16937a;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j(int i10, int i11) {
        if (i10 < i11) {
            l.i0(this.f16938d, i10, i11);
            return;
        }
        Object[] objArr = this.f16938d;
        l.i0(objArr, i10, objArr.length);
        l.i0(this.f16938d, 0, i11);
    }

    public final int k(int i10) {
        Object[] objArr = this.f16938d;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final void l() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f16938d[k(e5.z(this) + this.f16937a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int iK = k(this.f16939g + this.f16937a);
        int i11 = this.f16937a;
        if (i11 < iK) {
            length = iK - 1;
            if (i11 <= length) {
                while (!br.l.a(obj, this.f16938d[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f16937a;
                return length - i10;
            }
            return -1;
        }
        if (i11 > iK) {
            int i12 = iK - 1;
            while (true) {
                if (-1 >= i12) {
                    Object[] objArr = this.f16938d;
                    br.l.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i13 = this.f16937a;
                    if (i13 <= length) {
                        while (!br.l.a(obj, this.f16938d[length])) {
                            if (length != i13) {
                                length--;
                            }
                        }
                        i10 = this.f16937a;
                    }
                } else {
                    if (br.l.a(obj, this.f16938d[i12])) {
                        length = i12 + this.f16938d.length;
                        i10 = this.f16937a;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iK;
        br.l.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f16938d.length != 0) {
            int iK2 = k(this.f16939g + this.f16937a);
            int i10 = this.f16937a;
            if (i10 < iK2) {
                iK = i10;
                while (i10 < iK2) {
                    Object obj = this.f16938d[i10];
                    if (collection.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f16938d[iK] = obj;
                        iK++;
                    }
                    i10++;
                }
                l.i0(this.f16938d, iK, iK2);
            } else {
                int length = this.f16938d.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f16938d;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (collection.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f16938d[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iK = k(i11);
                for (int i12 = 0; i12 < iK2; i12++) {
                    Object[] objArr2 = this.f16938d;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (collection.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f16938d[iK] = obj3;
                        iK = e(iK);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                l();
                this.f16939g = g(iK - this.f16937a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        l();
        Object[] objArr = this.f16938d;
        int i10 = this.f16937a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f16937a = e(i10);
        this.f16939g = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        l();
        int iK = k(e5.z(this) + this.f16937a);
        Object[] objArr = this.f16938d;
        Object obj = objArr[iK];
        objArr[iK] = null;
        this.f16939g = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b4.h(i10, i11, this.f16939g);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f16939g) {
            clear();
            return;
        }
        if (i12 == 1) {
            b(i10);
            return;
        }
        l();
        if (i10 < this.f16939g - i11) {
            int iK = k(this.f16937a + (i10 - 1));
            int iK2 = k(this.f16937a + (i11 - 1));
            while (i10 > 0) {
                int i13 = iK + 1;
                int iMin = Math.min(i10, Math.min(i13, iK2 + 1));
                Object[] objArr = this.f16938d;
                int i14 = iK2 - iMin;
                int i15 = iK - iMin;
                l.c0(i14 + 1, i15 + 1, i13, objArr, objArr);
                iK = g(i15);
                iK2 = g(i14);
                i10 -= iMin;
            }
            int iK3 = k(this.f16937a + i12);
            j(this.f16937a, iK3);
            this.f16937a = iK3;
        } else {
            int iK4 = k(this.f16937a + i11);
            int iK5 = k(this.f16937a + i10);
            int i16 = this.f16939g;
            while (true) {
                i16 -= i11;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f16938d;
                i11 = Math.min(i16, Math.min(objArr2.length - iK4, objArr2.length - iK5));
                Object[] objArr3 = this.f16938d;
                int i17 = iK4 + i11;
                l.c0(iK5, iK4, i17, objArr3, objArr3);
                iK4 = k(i17);
                iK5 = k(iK5 + i11);
            }
            int iK6 = k(this.f16939g + this.f16937a);
            j(g(iK6 - i12), iK6);
        }
        this.f16939g -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iK;
        br.l.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f16938d.length != 0) {
            int iK2 = k(this.f16939g + this.f16937a);
            int i10 = this.f16937a;
            if (i10 < iK2) {
                iK = i10;
                while (i10 < iK2) {
                    Object obj = this.f16938d[i10];
                    if (collection.contains(obj)) {
                        this.f16938d[iK] = obj;
                        iK++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                l.i0(this.f16938d, iK, iK2);
            } else {
                int length = this.f16938d.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f16938d;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (collection.contains(obj2)) {
                        this.f16938d[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iK = k(i11);
                for (int i12 = 0; i12 < iK2; i12++) {
                    Object[] objArr2 = this.f16938d;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (collection.contains(obj3)) {
                        this.f16938d[iK] = obj3;
                        iK = e(iK);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                l();
                this.f16939g = g(iK - this.f16937a);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iA = a();
        if (i10 < 0 || i10 >= iA) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, iA, ", size: "));
        }
        int iK = k(this.f16937a + i10);
        Object[] objArr = this.f16938d;
        Object obj2 = objArr[iK];
        objArr[iK] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        br.l.e(objArr, "array");
        int length = objArr.length;
        int i10 = this.f16939g;
        if (length < i10) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i10);
            br.l.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iK = k(this.f16939g + this.f16937a);
        int i11 = this.f16937a;
        if (i11 < iK) {
            l.f0(i11, iK, 2, this.f16938d, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f16938d;
            l.c0(0, this.f16937a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f16938d;
            l.c0(objArr3.length - this.f16937a, 0, iK, objArr3, objArr);
        }
        int i12 = this.f16939g;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        br.l.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        l();
        d(collection.size() + a());
        c(k(a() + this.f16937a), collection);
        return true;
    }
}
