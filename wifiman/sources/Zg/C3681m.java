package Zg;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;

/* renamed from: Zg.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3681m extends AbstractC3676h {

    /* renamed from: d, reason: collision with root package name */
    public static final a f25383d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Object[] f25384e = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    private int f25385a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f25386b;

    /* renamed from: c, reason: collision with root package name */
    private int f25387c;

    /* renamed from: Zg.m$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3681m(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f25384e;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i10);
            }
            objArr = new Object[i10];
        }
        this.f25386b = objArr;
    }

    private final void C(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f25386b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f25384e) {
            this.f25386b = new Object[AbstractC7978m.d(i10, 10)];
        } else {
            v(AbstractC3672d.f25361a.e(objArr.length, i10));
        }
    }

    private final int K0(int i10) {
        Object[] objArr = this.f25386b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    private final void M0() {
        ((AbstractList) this).modCount++;
    }

    private final int S(int i10) {
        if (i10 == AbstractC3682n.g0(this.f25386b)) {
            return 0;
        }
        return i10 + 1;
    }

    private final void V0(int i10, int i11) {
        int iK0 = K0(this.f25385a + (i10 - 1));
        int iK02 = K0(this.f25385a + (i11 - 1));
        while (i10 > 0) {
            int i12 = iK0 + 1;
            int iMin = Math.min(i10, Math.min(i12, iK02 + 1));
            Object[] objArr = this.f25386b;
            int i13 = iK02 - iMin;
            int i14 = iK0 - iMin;
            AbstractC3682n.m(objArr, objArr, i13 + 1, i14 + 1, i12);
            iK0 = b0(i14);
            iK02 = b0(i13);
            i10 -= iMin;
        }
    }

    private final void W0(int i10, int i11) {
        int iK0 = K0(this.f25385a + i11);
        int iK02 = K0(this.f25385a + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f25386b;
            i11 = Math.min(size, Math.min(objArr.length - iK0, objArr.length - iK02));
            Object[] objArr2 = this.f25386b;
            int i12 = iK0 + i11;
            AbstractC3682n.m(objArr2, objArr2, iK02, iK0, i12);
            iK0 = K0(i12);
            iK02 = K0(iK02 + i11);
        }
    }

    private final int b0(int i10) {
        return i10 < 0 ? i10 + this.f25386b.length : i10;
    }

    private final void q0(int i10, int i11) {
        if (i10 < i11) {
            AbstractC3682n.v(this.f25386b, null, i10, i11);
            return;
        }
        Object[] objArr = this.f25386b;
        AbstractC3682n.v(objArr, null, i10, objArr.length);
        AbstractC3682n.v(this.f25386b, null, 0, i11);
    }

    private final void s(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f25386b.length;
        while (i10 < length && it.hasNext()) {
            this.f25386b[i10] = it.next();
            i10++;
        }
        int i11 = this.f25385a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f25386b[i12] = it.next();
        }
        this.f25387c = size() + collection.size();
    }

    private final void v(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f25386b;
        AbstractC3682n.m(objArr2, objArr, 0, this.f25385a, objArr2.length);
        Object[] objArr3 = this.f25386b;
        int length = objArr3.length;
        int i11 = this.f25385a;
        AbstractC3682n.m(objArr3, objArr, length - i11, 0, i11);
        this.f25385a = 0;
        this.f25386b = objArr;
    }

    private final int y(int i10) {
        return i10 == 0 ? AbstractC3682n.g0(this.f25386b) : i10 - 1;
    }

    public final Object J() {
        if (isEmpty()) {
            return null;
        }
        return this.f25386b[this.f25385a];
    }

    public final Object N0() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object T() {
        if (isEmpty()) {
            return null;
        }
        return this.f25386b[K0(this.f25385a + AbstractC3689v.n(this))];
    }

    public final Object U0() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        M0();
        C(size() + elements.size());
        s(K0(this.f25385a + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        M0();
        C(size() + 1);
        int iY = y(this.f25385a);
        this.f25385a = iY;
        this.f25386b[iY] = obj;
        this.f25387c = size() + 1;
    }

    public final void addLast(Object obj) {
        M0();
        C(size() + 1);
        this.f25386b[K0(this.f25385a + size())] = obj;
        this.f25387c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            M0();
            q0(this.f25385a, K0(this.f25385a + size()));
        }
        this.f25385a = 0;
        this.f25387c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f25386b[this.f25385a];
    }

    @Override // Zg.AbstractC3676h
    public int g() {
        return this.f25387c;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC3672d.f25361a.b(i10, size());
        return this.f25386b[K0(this.f25385a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iK0 = K0(this.f25385a + size());
        int length = this.f25385a;
        if (length < iK0) {
            while (length < iK0) {
                if (AbstractC6492s.d(obj, this.f25386b[length])) {
                    i10 = this.f25385a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iK0) {
            return -1;
        }
        int length2 = this.f25386b.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iK0; i11++) {
                    if (AbstractC6492s.d(obj, this.f25386b[i11])) {
                        length = i11 + this.f25386b.length;
                        i10 = this.f25385a;
                    }
                }
                return -1;
            }
            if (AbstractC6492s.d(obj, this.f25386b[length])) {
                i10 = this.f25385a;
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

    @Override // Zg.AbstractC3676h
    public Object j(int i10) {
        AbstractC3672d.f25361a.b(i10, size());
        if (i10 == AbstractC3689v.n(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        M0();
        int iK0 = K0(this.f25385a + i10);
        Object obj = this.f25386b[iK0];
        if (i10 < (size() >> 1)) {
            int i11 = this.f25385a;
            if (iK0 >= i11) {
                Object[] objArr = this.f25386b;
                AbstractC3682n.m(objArr, objArr, i11 + 1, i11, iK0);
            } else {
                Object[] objArr2 = this.f25386b;
                AbstractC3682n.m(objArr2, objArr2, 1, 0, iK0);
                Object[] objArr3 = this.f25386b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f25385a;
                AbstractC3682n.m(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f25386b;
            int i13 = this.f25385a;
            objArr4[i13] = null;
            this.f25385a = S(i13);
        } else {
            int iK02 = K0(this.f25385a + AbstractC3689v.n(this));
            if (iK0 <= iK02) {
                Object[] objArr5 = this.f25386b;
                AbstractC3682n.m(objArr5, objArr5, iK0, iK0 + 1, iK02 + 1);
            } else {
                Object[] objArr6 = this.f25386b;
                AbstractC3682n.m(objArr6, objArr6, iK0, iK0 + 1, objArr6.length);
                Object[] objArr7 = this.f25386b;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC3682n.m(objArr7, objArr7, 0, 1, iK02 + 1);
            }
            this.f25386b[iK02] = null;
        }
        this.f25387c = size() - 1;
        return obj;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f25386b[K0(this.f25385a + AbstractC3689v.n(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iG0;
        int i10;
        int iK0 = K0(this.f25385a + size());
        int i11 = this.f25385a;
        if (i11 < iK0) {
            iG0 = iK0 - 1;
            if (i11 <= iG0) {
                while (!AbstractC6492s.d(obj, this.f25386b[iG0])) {
                    if (iG0 != i11) {
                        iG0--;
                    }
                }
                i10 = this.f25385a;
                return iG0 - i10;
            }
            return -1;
        }
        if (i11 > iK0) {
            int i12 = iK0 - 1;
            while (true) {
                if (-1 >= i12) {
                    iG0 = AbstractC3682n.g0(this.f25386b);
                    int i13 = this.f25385a;
                    if (i13 <= iG0) {
                        while (!AbstractC6492s.d(obj, this.f25386b[iG0])) {
                            if (iG0 != i13) {
                                iG0--;
                            }
                        }
                        i10 = this.f25385a;
                    }
                } else {
                    if (AbstractC6492s.d(obj, this.f25386b[i12])) {
                        iG0 = i12 + this.f25386b.length;
                        i10 = this.f25385a;
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
        int iK0;
        AbstractC6492s.i(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f25386b.length != 0) {
            int iK02 = K0(this.f25385a + size());
            int i10 = this.f25385a;
            if (i10 < iK02) {
                iK0 = i10;
                while (i10 < iK02) {
                    Object obj = this.f25386b[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f25386b[iK0] = obj;
                        iK0++;
                    }
                    i10++;
                }
                AbstractC3682n.v(this.f25386b, null, iK0, iK02);
            } else {
                int length = this.f25386b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f25386b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f25386b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iK0 = K0(i11);
                for (int i12 = 0; i12 < iK02; i12++) {
                    Object[] objArr2 = this.f25386b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f25386b[iK0] = obj3;
                        iK0 = S(iK0);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                M0();
                this.f25387c = b0(iK0 - this.f25385a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        M0();
        Object[] objArr = this.f25386b;
        int i10 = this.f25385a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f25385a = S(i10);
        this.f25387c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        M0();
        int iK0 = K0(this.f25385a + AbstractC3689v.n(this));
        Object[] objArr = this.f25386b;
        Object obj = objArr[iK0];
        objArr[iK0] = null;
        this.f25387c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        AbstractC3672d.f25361a.d(i10, i11, size());
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
        M0();
        if (i10 < size() - i11) {
            V0(i10, i11);
            int iK0 = K0(this.f25385a + i12);
            q0(this.f25385a, iK0);
            this.f25385a = iK0;
        } else {
            W0(i10, i11);
            int iK02 = K0(this.f25385a + size());
            q0(b0(iK02 - i12), iK02);
        }
        this.f25387c = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int iK0;
        AbstractC6492s.i(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f25386b.length != 0) {
            int iK02 = K0(this.f25385a + size());
            int i10 = this.f25385a;
            if (i10 < iK02) {
                iK0 = i10;
                while (i10 < iK02) {
                    Object obj = this.f25386b[i10];
                    if (elements.contains(obj)) {
                        this.f25386b[iK0] = obj;
                        iK0++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                AbstractC3682n.v(this.f25386b, null, iK0, iK02);
            } else {
                int length = this.f25386b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f25386b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f25386b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iK0 = K0(i11);
                for (int i12 = 0; i12 < iK02; i12++) {
                    Object[] objArr2 = this.f25386b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f25386b[iK0] = obj3;
                        iK0 = S(iK0);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                M0();
                this.f25387c = b0(iK0 - this.f25385a);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        AbstractC3672d.f25361a.b(i10, size());
        int iK0 = K0(this.f25385a + i10);
        Object[] objArr = this.f25386b;
        Object obj2 = objArr[iK0];
        objArr[iK0] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) throws NegativeArraySizeException {
        AbstractC6492s.i(array, "array");
        if (array.length < size()) {
            array = AbstractC3683o.a(array, size());
        }
        int iK0 = K0(this.f25385a + size());
        int i10 = this.f25385a;
        if (i10 < iK0) {
            AbstractC3682n.q(this.f25386b, array, 0, i10, iK0, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f25386b;
            AbstractC3682n.m(objArr, array, 0, this.f25385a, objArr.length);
            Object[] objArr2 = this.f25386b;
            AbstractC3682n.m(objArr2, array, objArr2.length - this.f25385a, 0, iK0);
        }
        return AbstractC3689v.g(size(), array);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        AbstractC3672d.f25361a.c(i10, size());
        if (i10 == size()) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        M0();
        C(size() + 1);
        int iK0 = K0(this.f25385a + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iY = y(iK0);
            int iY2 = y(this.f25385a);
            int i11 = this.f25385a;
            if (iY >= i11) {
                Object[] objArr = this.f25386b;
                objArr[iY2] = objArr[i11];
                AbstractC3682n.m(objArr, objArr, i11, i11 + 1, iY + 1);
            } else {
                Object[] objArr2 = this.f25386b;
                AbstractC3682n.m(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f25386b;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC3682n.m(objArr3, objArr3, 0, 1, iY + 1);
            }
            this.f25386b[iY] = obj;
            this.f25385a = iY2;
        } else {
            int iK02 = K0(this.f25385a + size());
            if (iK0 < iK02) {
                Object[] objArr4 = this.f25386b;
                AbstractC3682n.m(objArr4, objArr4, iK0 + 1, iK0, iK02);
            } else {
                Object[] objArr5 = this.f25386b;
                AbstractC3682n.m(objArr5, objArr5, 1, 0, iK02);
                Object[] objArr6 = this.f25386b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC3682n.m(objArr6, objArr6, iK0 + 1, iK0, objArr6.length - 1);
            }
            this.f25386b[iK0] = obj;
        }
        this.f25387c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        AbstractC6492s.i(elements, "elements");
        AbstractC3672d.f25361a.c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        M0();
        C(size() + elements.size());
        int iK0 = K0(this.f25385a + size());
        int iK02 = K0(this.f25385a + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f25385a;
            int length = i11 - size;
            if (iK02 < i11) {
                Object[] objArr = this.f25386b;
                AbstractC3682n.m(objArr, objArr, length, i11, objArr.length);
                if (size >= iK02) {
                    Object[] objArr2 = this.f25386b;
                    AbstractC3682n.m(objArr2, objArr2, objArr2.length - size, 0, iK02);
                } else {
                    Object[] objArr3 = this.f25386b;
                    AbstractC3682n.m(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f25386b;
                    AbstractC3682n.m(objArr4, objArr4, 0, size, iK02);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f25386b;
                AbstractC3682n.m(objArr5, objArr5, length, i11, iK02);
            } else {
                Object[] objArr6 = this.f25386b;
                length += objArr6.length;
                int i12 = iK02 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    AbstractC3682n.m(objArr6, objArr6, length, i11, iK02);
                } else {
                    AbstractC3682n.m(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f25386b;
                    AbstractC3682n.m(objArr7, objArr7, 0, this.f25385a + length2, iK02);
                }
            }
            this.f25385a = length;
            s(b0(iK02 - size), elements);
        } else {
            int i13 = iK02 + size;
            if (iK02 < iK0) {
                int i14 = size + iK0;
                Object[] objArr8 = this.f25386b;
                if (i14 <= objArr8.length) {
                    AbstractC3682n.m(objArr8, objArr8, i13, iK02, iK0);
                } else if (i13 >= objArr8.length) {
                    AbstractC3682n.m(objArr8, objArr8, i13 - objArr8.length, iK02, iK0);
                } else {
                    int length3 = iK0 - (i14 - objArr8.length);
                    AbstractC3682n.m(objArr8, objArr8, 0, length3, iK0);
                    Object[] objArr9 = this.f25386b;
                    AbstractC3682n.m(objArr9, objArr9, i13, iK02, length3);
                }
            } else {
                Object[] objArr10 = this.f25386b;
                AbstractC3682n.m(objArr10, objArr10, size, 0, iK0);
                Object[] objArr11 = this.f25386b;
                if (i13 >= objArr11.length) {
                    AbstractC3682n.m(objArr11, objArr11, i13 - objArr11.length, iK02, objArr11.length);
                } else {
                    AbstractC3682n.m(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f25386b;
                    AbstractC3682n.m(objArr12, objArr12, i13, iK02, objArr12.length - size);
                }
            }
            s(iK02, elements);
        }
        return true;
    }

    public C3681m() {
        this.f25386b = f25384e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
