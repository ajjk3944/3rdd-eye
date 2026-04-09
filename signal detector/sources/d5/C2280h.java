package d5;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: d5.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2280h extends AbstractC2277e {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f19817d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f19818a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f19819b;

    /* renamed from: c, reason: collision with root package name */
    public int f19820c;

    public C2280h() {
        this.f19819b = f19817d;
    }

    @Override // d5.AbstractC2277e
    public final int a() {
        return this.f19820c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i3 = this.f19820c;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        j();
        d(this.f19820c + 1);
        int i6 = i(this.f19818a + i);
        int i7 = this.f19820c;
        if (i < ((i7 + 1) >> 1)) {
            if (i6 == 0) {
                Object[] objArr = this.f19819b;
                q5.i.e(objArr, "<this>");
                i6 = objArr.length;
            }
            int i8 = i6 - 1;
            int i9 = this.f19818a;
            if (i9 == 0) {
                Object[] objArr2 = this.f19819b;
                q5.i.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i9 - 1;
            }
            int i10 = this.f19818a;
            if (i8 >= i10) {
                Object[] objArr3 = this.f19819b;
                objArr3[length] = objArr3[i10];
                AbstractC2281i.S(i10, i10 + 1, i8 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f19819b;
                AbstractC2281i.S(i10 - 1, i10, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f19819b;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC2281i.S(0, 1, i8 + 1, objArr5, objArr5);
            }
            this.f19819b[i8] = obj;
            this.f19818a = length;
        } else {
            int i11 = i(i7 + this.f19818a);
            if (i6 < i11) {
                Object[] objArr6 = this.f19819b;
                AbstractC2281i.S(i6 + 1, i6, i11, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f19819b;
                AbstractC2281i.S(1, 0, i11, objArr7, objArr7);
                Object[] objArr8 = this.f19819b;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC2281i.S(i6 + 1, i6, objArr8.length - 1, objArr8, objArr8);
            }
            this.f19819b[i6] = obj;
        }
        this.f19820c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        q5.i.e(collection, "elements");
        int i3 = this.f19820c;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f19820c) {
            return addAll(collection);
        }
        j();
        d(collection.size() + this.f19820c);
        int i6 = i(this.f19820c + this.f19818a);
        int i7 = i(this.f19818a + i);
        int size = collection.size();
        if (i >= ((this.f19820c + 1) >> 1)) {
            int i8 = i7 + size;
            if (i7 < i6) {
                int i9 = size + i6;
                Object[] objArr = this.f19819b;
                if (i9 <= objArr.length) {
                    AbstractC2281i.S(i8, i7, i6, objArr, objArr);
                } else if (i8 >= objArr.length) {
                    AbstractC2281i.S(i8 - objArr.length, i7, i6, objArr, objArr);
                } else {
                    int length = i6 - (i9 - objArr.length);
                    AbstractC2281i.S(0, length, i6, objArr, objArr);
                    Object[] objArr2 = this.f19819b;
                    AbstractC2281i.S(i8, i7, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f19819b;
                AbstractC2281i.S(size, 0, i6, objArr3, objArr3);
                Object[] objArr4 = this.f19819b;
                if (i8 >= objArr4.length) {
                    AbstractC2281i.S(i8 - objArr4.length, i7, objArr4.length, objArr4, objArr4);
                } else {
                    AbstractC2281i.S(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f19819b;
                    AbstractC2281i.S(i8, i7, objArr5.length - size, objArr5, objArr5);
                }
            }
            c(i7, collection);
            return true;
        }
        int i10 = this.f19818a;
        int length2 = i10 - size;
        if (i7 < i10) {
            Object[] objArr6 = this.f19819b;
            AbstractC2281i.S(length2, i10, objArr6.length, objArr6, objArr6);
            if (size >= i7) {
                Object[] objArr7 = this.f19819b;
                AbstractC2281i.S(objArr7.length - size, 0, i7, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f19819b;
                AbstractC2281i.S(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f19819b;
                AbstractC2281i.S(0, size, i7, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f19819b;
            AbstractC2281i.S(length2, i10, i7, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f19819b;
            length2 += objArr11.length;
            int i11 = i7 - i10;
            int length3 = objArr11.length - length2;
            if (length3 >= i11) {
                AbstractC2281i.S(length2, i10, i7, objArr11, objArr11);
            } else {
                AbstractC2281i.S(length2, i10, i10 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f19819b;
                AbstractC2281i.S(0, this.f19818a + length3, i7, objArr12, objArr12);
            }
        }
        this.f19818a = length2;
        c(g(i7 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        j();
        d(this.f19820c + 1);
        int length = this.f19818a;
        if (length == 0) {
            Object[] objArr = this.f19819b;
            q5.i.e(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f19818a = i;
        this.f19819b[i] = obj;
        this.f19820c++;
    }

    public final void addLast(Object obj) {
        j();
        d(a() + 1);
        this.f19819b[i(a() + this.f19818a)] = obj;
        this.f19820c = a() + 1;
    }

    @Override // d5.AbstractC2277e
    public final Object b(int i) {
        int i3 = this.f19820c;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
        }
        if (i == AbstractC2283k.L(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        j();
        int i6 = i(this.f19818a + i);
        Object[] objArr = this.f19819b;
        Object obj = objArr[i6];
        if (i < (this.f19820c >> 1)) {
            int i7 = this.f19818a;
            if (i6 >= i7) {
                AbstractC2281i.S(i7 + 1, i7, i6, objArr, objArr);
            } else {
                AbstractC2281i.S(1, 0, i6, objArr, objArr);
                Object[] objArr2 = this.f19819b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i8 = this.f19818a;
                AbstractC2281i.S(i8 + 1, i8, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f19819b;
            int i9 = this.f19818a;
            objArr3[i9] = null;
            this.f19818a = e(i9);
        } else {
            int i10 = i(AbstractC2283k.L(this) + this.f19818a);
            if (i6 <= i10) {
                Object[] objArr4 = this.f19819b;
                AbstractC2281i.S(i6, i6 + 1, i10 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f19819b;
                AbstractC2281i.S(i6, i6 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f19819b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC2281i.S(0, 1, i10 + 1, objArr6, objArr6);
            }
            this.f19819b[i10] = null;
        }
        this.f19820c--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f19819b.length;
        while (i < length && it.hasNext()) {
            this.f19819b[i] = it.next();
            i++;
        }
        int i3 = this.f19818a;
        for (int i6 = 0; i6 < i3 && it.hasNext(); i6++) {
            this.f19819b[i6] = it.next();
        }
        this.f19820c = collection.size() + this.f19820c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            h(this.f19818a, i(a() + this.f19818a));
        }
        this.f19818a = 0;
        this.f19820c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f19819b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f19817d) {
            if (i < 10) {
                i = 10;
            }
            this.f19819b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i3 = length + (length >> 1);
        if (i3 - i < 0) {
            i3 = i;
        }
        if (i3 - 2147483639 > 0) {
            i3 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i3];
        AbstractC2281i.S(0, this.f19818a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f19819b;
        int length2 = objArr3.length;
        int i6 = this.f19818a;
        AbstractC2281i.S(length2 - i6, 0, i6, objArr3, objArr2);
        this.f19818a = 0;
        this.f19819b = objArr2;
    }

    public final int e(int i) {
        q5.i.e(this.f19819b, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.f19819b[i(AbstractC2283k.L(this) + this.f19818a)];
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f19819b[this.f19818a];
    }

    public final int g(int i) {
        return i < 0 ? i + this.f19819b.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(A.f.g(i, iA, "index: ", ", size: "));
        }
        return this.f19819b[i(this.f19818a + i)];
    }

    public final void h(int i, int i3) {
        if (i < i3) {
            Object[] objArr = this.f19819b;
            q5.i.e(objArr, "<this>");
            Arrays.fill(objArr, i, i3, (Object) null);
        } else {
            Object[] objArr2 = this.f19819b;
            Arrays.fill(objArr2, i, objArr2.length, (Object) null);
            Object[] objArr3 = this.f19819b;
            q5.i.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, i3, (Object) null);
        }
    }

    public final int i(int i) {
        Object[] objArr = this.f19819b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int i3 = i(a() + this.f19818a);
        int length = this.f19818a;
        if (length < i3) {
            while (length < i3) {
                if (q5.i.a(obj, this.f19819b[length])) {
                    i = this.f19818a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < i3) {
            return -1;
        }
        int length2 = this.f19819b.length;
        while (true) {
            if (length >= length2) {
                for (int i6 = 0; i6 < i3; i6++) {
                    if (q5.i.a(obj, this.f19819b[i6])) {
                        length = i6 + this.f19819b.length;
                        i = this.f19818a;
                    }
                }
                return -1;
            }
            if (q5.i.a(obj, this.f19819b[length])) {
                i = this.f19818a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f19819b[i(AbstractC2283k.L(this) + this.f19818a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int i3 = i(this.f19820c + this.f19818a);
        int i6 = this.f19818a;
        if (i6 < i3) {
            length = i3 - 1;
            if (i6 <= length) {
                while (!q5.i.a(obj, this.f19819b[length])) {
                    if (length != i6) {
                        length--;
                    }
                }
                i = this.f19818a;
                return length - i;
            }
            return -1;
        }
        if (i6 > i3) {
            int i7 = i3 - 1;
            while (true) {
                if (-1 >= i7) {
                    Object[] objArr = this.f19819b;
                    q5.i.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i8 = this.f19818a;
                    if (i8 <= length) {
                        while (!q5.i.a(obj, this.f19819b[length])) {
                            if (length != i8) {
                                length--;
                            }
                        }
                        i = this.f19818a;
                    }
                } else {
                    if (q5.i.a(obj, this.f19819b[i7])) {
                        length = i7 + this.f19819b.length;
                        i = this.f19818a;
                        break;
                    }
                    i7--;
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
        int i;
        q5.i.e(collection, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f19819b.length != 0) {
            int i3 = i(this.f19820c + this.f19818a);
            int i6 = this.f19818a;
            if (i6 < i3) {
                i = i6;
                while (i6 < i3) {
                    Object obj = this.f19819b[i6];
                    if (collection.contains(obj)) {
                        z6 = true;
                    } else {
                        this.f19819b[i] = obj;
                        i++;
                    }
                    i6++;
                }
                Object[] objArr = this.f19819b;
                q5.i.e(objArr, "<this>");
                Arrays.fill(objArr, i, i3, (Object) null);
            } else {
                int length = this.f19819b.length;
                boolean z7 = false;
                int i7 = i6;
                while (i6 < length) {
                    Object[] objArr2 = this.f19819b;
                    Object obj2 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj2)) {
                        z7 = true;
                    } else {
                        this.f19819b[i7] = obj2;
                        i7++;
                    }
                    i6++;
                }
                i = i(i7);
                for (int i8 = 0; i8 < i3; i8++) {
                    Object[] objArr3 = this.f19819b;
                    Object obj3 = objArr3[i8];
                    objArr3[i8] = null;
                    if (collection.contains(obj3)) {
                        z7 = true;
                    } else {
                        this.f19819b[i] = obj3;
                        i = e(i);
                    }
                }
                z6 = z7;
            }
            if (z6) {
                j();
                this.f19820c = g(i - this.f19818a);
            }
        }
        return z6;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        Object[] objArr = this.f19819b;
        int i = this.f19818a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f19818a = e(i);
        this.f19820c = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        int i = i(AbstractC2283k.L(this) + this.f19818a);
        Object[] objArr = this.f19819b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f19820c = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i3) {
        T2.g.c(i, i3, this.f19820c);
        int i6 = i3 - i;
        if (i6 == 0) {
            return;
        }
        if (i6 == this.f19820c) {
            clear();
            return;
        }
        if (i6 == 1) {
            b(i);
            return;
        }
        j();
        if (i < this.f19820c - i3) {
            int i7 = i((i - 1) + this.f19818a);
            int i8 = i((i3 - 1) + this.f19818a);
            while (i > 0) {
                int i9 = i7 + 1;
                int iMin = Math.min(i, Math.min(i9, i8 + 1));
                Object[] objArr = this.f19819b;
                int i10 = i8 - iMin;
                int i11 = i7 - iMin;
                AbstractC2281i.S(i10 + 1, i11 + 1, i9, objArr, objArr);
                i7 = g(i11);
                i8 = g(i10);
                i -= iMin;
            }
            int i12 = i(this.f19818a + i6);
            h(this.f19818a, i12);
            this.f19818a = i12;
        } else {
            int i13 = i(this.f19818a + i3);
            int i14 = i(this.f19818a + i);
            int i15 = this.f19820c;
            while (true) {
                i15 -= i3;
                if (i15 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f19819b;
                i3 = Math.min(i15, Math.min(objArr2.length - i13, objArr2.length - i14));
                Object[] objArr3 = this.f19819b;
                int i16 = i13 + i3;
                AbstractC2281i.S(i14, i13, i16, objArr3, objArr3);
                i13 = i(i16);
                i14 = i(i14 + i3);
            }
            int i17 = i(this.f19820c + this.f19818a);
            h(g(i17 - i6), i17);
        }
        this.f19820c -= i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int i;
        q5.i.e(collection, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f19819b.length != 0) {
            int i3 = i(this.f19820c + this.f19818a);
            int i6 = this.f19818a;
            if (i6 < i3) {
                i = i6;
                while (i6 < i3) {
                    Object obj = this.f19819b[i6];
                    if (collection.contains(obj)) {
                        this.f19819b[i] = obj;
                        i++;
                    } else {
                        z6 = true;
                    }
                    i6++;
                }
                Object[] objArr = this.f19819b;
                q5.i.e(objArr, "<this>");
                Arrays.fill(objArr, i, i3, (Object) null);
            } else {
                int length = this.f19819b.length;
                boolean z7 = false;
                int i7 = i6;
                while (i6 < length) {
                    Object[] objArr2 = this.f19819b;
                    Object obj2 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj2)) {
                        this.f19819b[i7] = obj2;
                        i7++;
                    } else {
                        z7 = true;
                    }
                    i6++;
                }
                i = i(i7);
                for (int i8 = 0; i8 < i3; i8++) {
                    Object[] objArr3 = this.f19819b;
                    Object obj3 = objArr3[i8];
                    objArr3[i8] = null;
                    if (collection.contains(obj3)) {
                        this.f19819b[i] = obj3;
                        i = e(i);
                    } else {
                        z7 = true;
                    }
                }
                z6 = z7;
            }
            if (z6) {
                j();
                this.f19820c = g(i - this.f19818a);
            }
        }
        return z6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(A.f.g(i, iA, "index: ", ", size: "));
        }
        int i3 = i(this.f19818a + i);
        Object[] objArr = this.f19819b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    public C2280h(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f19817d;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(AbstractC1135f5.l(i, "Illegal Capacity: "));
        }
        this.f19819b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        q5.i.e(objArr, "array");
        int length = objArr.length;
        int i = this.f19820c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            q5.i.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int i3 = i(this.f19820c + this.f19818a);
        int i6 = this.f19818a;
        if (i6 < i3) {
            AbstractC2281i.T(i6, i3, 2, this.f19819b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f19819b;
            AbstractC2281i.S(0, this.f19818a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f19819b;
            AbstractC2281i.S(objArr3.length - this.f19818a, 0, i3, objArr3, objArr);
        }
        int i7 = this.f19820c;
        if (i7 < objArr.length) {
            objArr[i7] = null;
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
        q5.i.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        j();
        d(collection.size() + a());
        c(i(a() + this.f19818a), collection);
        return true;
    }
}
