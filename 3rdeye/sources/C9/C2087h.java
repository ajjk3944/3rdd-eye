package c9;

import N7.H7;
import c9.AbstractC2082c;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayDeque.kt */
/* renamed from: c9.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2087h<E> extends AbstractC2084e<E> {

    /* renamed from: e, reason: collision with root package name */
    public static final Object[] f18571e = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public int f18572b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f18573c = f18571e;

    /* renamed from: d, reason: collision with root package name */
    public int f18574d;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e4) {
        int length;
        int length2;
        int i10 = this.f18574d;
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
        }
        if (i == i10) {
            e(e4);
            return;
        }
        if (i == 0) {
            m();
            g(this.f18574d + 1);
            int length3 = this.f18572b;
            if (length3 == 0) {
                Object[] objArr = this.f18573c;
                kotlin.jvm.internal.l.f(objArr, "<this>");
                length3 = objArr.length;
            }
            int i11 = length3 - 1;
            this.f18572b = i11;
            this.f18573c[i11] = e4;
            this.f18574d++;
            return;
        }
        m();
        g(this.f18574d + 1);
        int iL = l(this.f18572b + i);
        int i12 = this.f18574d;
        if (i < ((i12 + 1) >> 1)) {
            if (iL == 0) {
                Object[] objArr2 = this.f18573c;
                kotlin.jvm.internal.l.f(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = iL - 1;
            }
            int i13 = this.f18572b;
            if (i13 == 0) {
                Object[] objArr3 = this.f18573c;
                kotlin.jvm.internal.l.f(objArr3, "<this>");
                length2 = objArr3.length - 1;
            } else {
                length2 = i13 - 1;
            }
            int i14 = this.f18572b;
            if (length >= i14) {
                Object[] objArr4 = this.f18573c;
                objArr4[length2] = objArr4[i14];
                C2088i.e(objArr4, i14, objArr4, i14 + 1, length + 1);
            } else {
                Object[] objArr5 = this.f18573c;
                C2088i.e(objArr5, i14 - 1, objArr5, i14, objArr5.length);
                Object[] objArr6 = this.f18573c;
                objArr6[objArr6.length - 1] = objArr6[0];
                C2088i.e(objArr6, 0, objArr6, 1, length + 1);
            }
            this.f18573c[length] = e4;
            this.f18572b = length2;
        } else {
            int iL2 = l(i12 + this.f18572b);
            if (iL < iL2) {
                Object[] objArr7 = this.f18573c;
                C2088i.e(objArr7, iL + 1, objArr7, iL, iL2);
            } else {
                Object[] objArr8 = this.f18573c;
                C2088i.e(objArr8, 1, objArr8, 0, iL2);
                Object[] objArr9 = this.f18573c;
                objArr9[0] = objArr9[objArr9.length - 1];
                C2088i.e(objArr9, iL + 1, objArr9, iL, objArr9.length - 1);
            }
            this.f18573c[iL] = e4;
        }
        this.f18574d++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> elements) {
        kotlin.jvm.internal.l.f(elements, "elements");
        int i10 = this.f18574d;
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i == this.f18574d) {
            return addAll(elements);
        }
        m();
        g(elements.size() + this.f18574d);
        int iL = l(this.f18574d + this.f18572b);
        int iL2 = l(this.f18572b + i);
        int size = elements.size();
        if (i >= ((this.f18574d + 1) >> 1)) {
            int i11 = iL2 + size;
            if (iL2 < iL) {
                int i12 = size + iL;
                Object[] objArr = this.f18573c;
                if (i12 <= objArr.length) {
                    C2088i.e(objArr, i11, objArr, iL2, iL);
                } else if (i11 >= objArr.length) {
                    C2088i.e(objArr, i11 - objArr.length, objArr, iL2, iL);
                } else {
                    int length = iL - (i12 - objArr.length);
                    C2088i.e(objArr, 0, objArr, length, iL);
                    Object[] objArr2 = this.f18573c;
                    C2088i.e(objArr2, i11, objArr2, iL2, length);
                }
            } else {
                Object[] objArr3 = this.f18573c;
                C2088i.e(objArr3, size, objArr3, 0, iL);
                Object[] objArr4 = this.f18573c;
                if (i11 >= objArr4.length) {
                    C2088i.e(objArr4, i11 - objArr4.length, objArr4, iL2, objArr4.length);
                } else {
                    C2088i.e(objArr4, 0, objArr4, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f18573c;
                    C2088i.e(objArr5, i11, objArr5, iL2, objArr5.length - size);
                }
            }
            f(iL2, elements);
            return true;
        }
        int i13 = this.f18572b;
        int length2 = i13 - size;
        if (iL2 < i13) {
            Object[] objArr6 = this.f18573c;
            C2088i.e(objArr6, length2, objArr6, i13, objArr6.length);
            if (size >= iL2) {
                Object[] objArr7 = this.f18573c;
                C2088i.e(objArr7, objArr7.length - size, objArr7, 0, iL2);
            } else {
                Object[] objArr8 = this.f18573c;
                C2088i.e(objArr8, objArr8.length - size, objArr8, 0, size);
                Object[] objArr9 = this.f18573c;
                C2088i.e(objArr9, 0, objArr9, size, iL2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f18573c;
            C2088i.e(objArr10, length2, objArr10, i13, iL2);
        } else {
            Object[] objArr11 = this.f18573c;
            length2 += objArr11.length;
            int i14 = iL2 - i13;
            int length3 = objArr11.length - length2;
            if (length3 >= i14) {
                C2088i.e(objArr11, length2, objArr11, i13, iL2);
            } else {
                C2088i.e(objArr11, length2, objArr11, i13, i13 + length3);
                Object[] objArr12 = this.f18573c;
                C2088i.e(objArr12, 0, objArr12, this.f18572b + length3, iL2);
            }
        }
        this.f18572b = length2;
        f(j(iL2 - size), elements);
        return true;
    }

    @Override // c9.AbstractC2084e
    public final int c() {
        return this.f18574d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m();
            k(this.f18572b, l(c() + this.f18572b));
        }
        this.f18572b = 0;
        this.f18574d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // c9.AbstractC2084e
    public final E d(int i) {
        int i10 = this.f18574d;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(H7.n(i, i10, "index: ", ", size: "));
        }
        if (i == C2092m.V(this)) {
            return o();
        }
        if (i == 0) {
            return n();
        }
        m();
        int iL = l(this.f18572b + i);
        Object[] objArr = this.f18573c;
        E e4 = (E) objArr[iL];
        if (i < (this.f18574d >> 1)) {
            int i11 = this.f18572b;
            if (iL >= i11) {
                C2088i.e(objArr, i11 + 1, objArr, i11, iL);
            } else {
                C2088i.e(objArr, 1, objArr, 0, iL);
                Object[] objArr2 = this.f18573c;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i12 = this.f18572b;
                C2088i.e(objArr2, i12 + 1, objArr2, i12, objArr2.length - 1);
            }
            Object[] objArr3 = this.f18573c;
            int i13 = this.f18572b;
            objArr3[i13] = null;
            this.f18572b = h(i13);
        } else {
            int iL2 = l(C2092m.V(this) + this.f18572b);
            if (iL <= iL2) {
                Object[] objArr4 = this.f18573c;
                C2088i.e(objArr4, iL, objArr4, iL + 1, iL2 + 1);
            } else {
                Object[] objArr5 = this.f18573c;
                C2088i.e(objArr5, iL, objArr5, iL + 1, objArr5.length);
                Object[] objArr6 = this.f18573c;
                objArr6[objArr6.length - 1] = objArr6[0];
                C2088i.e(objArr6, 0, objArr6, 1, iL2 + 1);
            }
            this.f18573c[iL2] = null;
        }
        this.f18574d--;
        return e4;
    }

    public final void e(E e4) {
        m();
        g(c() + 1);
        this.f18573c[l(c() + this.f18572b)] = e4;
        this.f18574d = c() + 1;
    }

    public final void f(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f18573c.length;
        while (i < length && it.hasNext()) {
            this.f18573c[i] = it.next();
            i++;
        }
        int i10 = this.f18572b;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f18573c[i11] = it.next();
        }
        this.f18574d = collection.size() + this.f18574d;
    }

    public final void g(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f18573c;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f18571e) {
            if (i < 10) {
                i = 10;
            }
            this.f18573c = new Object[i];
            return;
        }
        int length = objArr.length;
        int i10 = length + (length >> 1);
        if (i10 - i < 0) {
            i10 = i;
        }
        if (i10 - 2147483639 > 0) {
            i10 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i10];
        C2088i.e(objArr, 0, objArr2, this.f18572b, objArr.length);
        Object[] objArr3 = this.f18573c;
        int length2 = objArr3.length;
        int i11 = this.f18572b;
        C2088i.e(objArr3, length2 - i11, objArr2, 0, i11);
        this.f18572b = 0;
        this.f18573c = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int iC = c();
        if (i < 0 || i >= iC) {
            throw new IndexOutOfBoundsException(H7.n(i, iC, "index: ", ", size: "));
        }
        return (E) this.f18573c[l(this.f18572b + i)];
    }

    public final int h(int i) {
        kotlin.jvm.internal.l.f(this.f18573c, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iL = l(c() + this.f18572b);
        int length = this.f18572b;
        if (length < iL) {
            while (length < iL) {
                if (kotlin.jvm.internal.l.b(obj, this.f18573c[length])) {
                    i = this.f18572b;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iL) {
            return -1;
        }
        int length2 = this.f18573c.length;
        while (true) {
            if (length >= length2) {
                for (int i10 = 0; i10 < iL; i10++) {
                    if (kotlin.jvm.internal.l.b(obj, this.f18573c[i10])) {
                        length = i10 + this.f18573c.length;
                        i = this.f18572b;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.l.b(obj, this.f18573c[length])) {
                i = this.f18572b;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return c() == 0;
    }

    public final int j(int i) {
        return i < 0 ? i + this.f18573c.length : i;
    }

    public final void k(int i, int i10) {
        if (i < i10) {
            C2088i.i(this.f18573c, null, i, i10);
            return;
        }
        Object[] objArr = this.f18573c;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        C2088i.i(this.f18573c, null, 0, i10);
    }

    public final int l(int i) {
        Object[] objArr = this.f18573c;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iL = l(this.f18574d + this.f18572b);
        int i10 = this.f18572b;
        if (i10 < iL) {
            length = iL - 1;
            if (i10 <= length) {
                while (!kotlin.jvm.internal.l.b(obj, this.f18573c[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i = this.f18572b;
                return length - i;
            }
            return -1;
        }
        if (i10 > iL) {
            int i11 = iL - 1;
            while (true) {
                if (-1 >= i11) {
                    Object[] objArr = this.f18573c;
                    kotlin.jvm.internal.l.f(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.f18572b;
                    if (i12 <= length) {
                        while (!kotlin.jvm.internal.l.b(obj, this.f18573c[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                        i = this.f18572b;
                    }
                } else {
                    if (kotlin.jvm.internal.l.b(obj, this.f18573c[i11])) {
                        length = i11 + this.f18573c.length;
                        i = this.f18572b;
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

    public final E n() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m();
        Object[] objArr = this.f18573c;
        int i = this.f18572b;
        E e4 = (E) objArr[i];
        objArr[i] = null;
        this.f18572b = h(i);
        this.f18574d = c() - 1;
        return e4;
    }

    public final E o() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m();
        int iL = l(C2092m.V(this) + this.f18572b);
        Object[] objArr = this.f18573c;
        E e4 = (E) objArr[iL];
        objArr[iL] = null;
        this.f18574d = c() - 1;
        return e4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> elements) {
        int iL;
        kotlin.jvm.internal.l.f(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f18573c.length != 0) {
            int iL2 = l(this.f18574d + this.f18572b);
            int i = this.f18572b;
            if (i < iL2) {
                iL = i;
                while (i < iL2) {
                    Object obj = this.f18573c[i];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f18573c[iL] = obj;
                        iL++;
                    }
                    i++;
                }
                C2088i.i(this.f18573c, null, iL, iL2);
            } else {
                int length = this.f18573c.length;
                boolean z11 = false;
                int i10 = i;
                while (i < length) {
                    Object[] objArr = this.f18573c;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f18573c[i10] = obj2;
                        i10++;
                    }
                    i++;
                }
                iL = l(i10);
                for (int i11 = 0; i11 < iL2; i11++) {
                    Object[] objArr2 = this.f18573c;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f18573c[iL] = obj3;
                        iL = h(iL);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                m();
                this.f18574d = j(iL - this.f18572b);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        AbstractC2082c.a.a(i, i10, this.f18574d);
        int i11 = i10 - i;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.f18574d) {
            clear();
            return;
        }
        if (i11 == 1) {
            d(i);
            return;
        }
        m();
        if (i < this.f18574d - i10) {
            int iL = l((i - 1) + this.f18572b);
            int iL2 = l((i10 - 1) + this.f18572b);
            while (i > 0) {
                int i12 = iL + 1;
                int iMin = Math.min(i, Math.min(i12, iL2 + 1));
                Object[] objArr = this.f18573c;
                int i13 = iL2 - iMin;
                int i14 = iL - iMin;
                C2088i.e(objArr, i13 + 1, objArr, i14 + 1, i12);
                iL = j(i14);
                iL2 = j(i13);
                i -= iMin;
            }
            int iL3 = l(this.f18572b + i11);
            k(this.f18572b, iL3);
            this.f18572b = iL3;
        } else {
            int iL4 = l(this.f18572b + i10);
            int iL5 = l(this.f18572b + i);
            int i15 = this.f18574d;
            while (true) {
                i15 -= i10;
                if (i15 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f18573c;
                i10 = Math.min(i15, Math.min(objArr2.length - iL4, objArr2.length - iL5));
                Object[] objArr3 = this.f18573c;
                int i16 = iL4 + i10;
                C2088i.e(objArr3, iL5, objArr3, iL4, i16);
                iL4 = l(i16);
                iL5 = l(iL5 + i10);
            }
            int iL6 = l(this.f18574d + this.f18572b);
            k(j(iL6 - i11), iL6);
        }
        this.f18574d -= i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> elements) {
        int iL;
        kotlin.jvm.internal.l.f(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f18573c.length != 0) {
            int iL2 = l(this.f18574d + this.f18572b);
            int i = this.f18572b;
            if (i < iL2) {
                iL = i;
                while (i < iL2) {
                    Object obj = this.f18573c[i];
                    if (elements.contains(obj)) {
                        this.f18573c[iL] = obj;
                        iL++;
                    } else {
                        z10 = true;
                    }
                    i++;
                }
                C2088i.i(this.f18573c, null, iL, iL2);
            } else {
                int length = this.f18573c.length;
                boolean z11 = false;
                int i10 = i;
                while (i < length) {
                    Object[] objArr = this.f18573c;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.f18573c[i10] = obj2;
                        i10++;
                    } else {
                        z11 = true;
                    }
                    i++;
                }
                iL = l(i10);
                for (int i11 = 0; i11 < iL2; i11++) {
                    Object[] objArr2 = this.f18573c;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        this.f18573c[iL] = obj3;
                        iL = h(iL);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                m();
                this.f18574d = j(iL - this.f18572b);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e4) {
        int iC = c();
        if (i < 0 || i >= iC) {
            throw new IndexOutOfBoundsException(H7.n(i, iC, "index: ", ", size: "));
        }
        int iL = l(this.f18572b + i);
        Object[] objArr = this.f18573c;
        E e10 = (E) objArr[iL];
        objArr[iL] = e4;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[c()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] array) throws NegativeArraySizeException {
        kotlin.jvm.internal.l.f(array, "array");
        int length = array.length;
        int i = this.f18574d;
        if (length < i) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i);
            kotlin.jvm.internal.l.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (T[]) ((Object[]) objNewInstance);
        }
        int iL = l(this.f18574d + this.f18572b);
        int i10 = this.f18572b;
        if (i10 < iL) {
            C2088i.f(this.f18573c, i10, array, iL, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f18573c;
            C2088i.e(objArr, 0, array, this.f18572b, objArr.length);
            Object[] objArr2 = this.f18573c;
            C2088i.e(objArr2, objArr2.length - this.f18572b, array, 0, iL);
        }
        int i11 = this.f18574d;
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.l.f(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m();
        g(elements.size() + c());
        f(l(c() + this.f18572b), elements);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e4) {
        e(e4);
        return true;
    }
}
