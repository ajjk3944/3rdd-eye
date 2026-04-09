package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient Object f11704a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f11705b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f11706c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f11707d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f11708e;

    public class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f11709a;

        /* renamed from: b, reason: collision with root package name */
        public int f11710b;

        /* renamed from: c, reason: collision with root package name */
        public int f11711c = -1;

        public a() {
            this.f11709a = CompactHashSet.this.f11707d;
            this.f11710b = CompactHashSet.this.w();
        }

        public final void a() {
            if (CompactHashSet.this.f11707d != this.f11709a) {
                throw new ConcurrentModificationException();
            }
        }

        public void b() {
            this.f11709a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11710b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f11710b;
            this.f11711c = i10;
            Object objU = CompactHashSet.this.u(i10);
            this.f11710b = CompactHashSet.this.x(this.f11710b);
            return objU;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            j.d(this.f11711c >= 0);
            b();
            CompactHashSet compactHashSet = CompactHashSet.this;
            compactHashSet.remove(compactHashSet.u(this.f11711c));
            this.f11710b = CompactHashSet.this.d(this.f11710b, this.f11711c);
            this.f11711c = -1;
        }
    }

    public CompactHashSet(int i10) {
        A(i10);
    }

    public static CompactHashSet j(int i10) {
        return new CompactHashSet(i10);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid size: ");
            sb.append(i10);
            throw new InvalidObjectException(sb.toString());
        }
        A(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public void A(int i10) {
        com.google.common.base.g.e(i10 >= 0, "Expected size must be >= 0");
        this.f11707d = com.google.common.primitives.c.b(i10, 1, 1073741823);
    }

    public void B(int i10, Object obj, int i11, int i12) {
        L(i10, l.d(i11, 0, i12));
        K(i10, obj);
    }

    public void C(int i10, int i11) {
        Object objG = G();
        int[] iArrF = F();
        Object[] objArrE = E();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrE[i10] = null;
            iArrF[i10] = 0;
            return;
        }
        Object obj = objArrE[i12];
        objArrE[i10] = obj;
        objArrE[i12] = null;
        iArrF[i10] = iArrF[i12];
        iArrF[i12] = 0;
        int iD = z.d(obj) & i11;
        int iH = l.h(objG, iD);
        if (iH == size) {
            l.i(objG, iD, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrF[i13];
            int iC = l.c(i14, i11);
            if (iC == size) {
                iArrF[i13] = l.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC;
        }
    }

    public boolean D() {
        return this.f11704a == null;
    }

    public final Object[] E() {
        Object[] objArr = this.f11706c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] F() {
        int[] iArr = this.f11705b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object G() {
        Object obj = this.f11704a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public void H(int i10) {
        this.f11705b = Arrays.copyOf(F(), i10);
        this.f11706c = Arrays.copyOf(E(), i10);
    }

    public final void I(int i10) {
        int iMin;
        int length = F().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        H(iMin);
    }

    public final int J(int i10, int i11, int i12, int i13) {
        Object objA = l.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            l.i(objA, i12 & i14, i13 + 1);
        }
        Object objG = G();
        int[] iArrF = F();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = l.h(objG, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrF[i16];
                int iB = l.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = l.h(objA, i18);
                l.i(objA, i18, iH);
                iArrF[i16] = l.d(iB, iH2, i14);
                iH = l.c(i17, i10);
            }
        }
        this.f11704a = objA;
        M(i14);
        return i14;
    }

    public final void K(int i10, Object obj) {
        E()[i10] = obj;
    }

    public final void L(int i10, int i11) {
        F()[i10] = i11;
    }

    public final void M(int i10) {
        this.f11707d = l.d(this.f11707d, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        if (D()) {
            g();
        }
        Set setS = s();
        if (setS != null) {
            return setS.add(obj);
        }
        int[] iArrF = F();
        Object[] objArrE = E();
        int i10 = this.f11708e;
        int i11 = i10 + 1;
        int iD = z.d(obj);
        int iY = y();
        int i12 = iD & iY;
        int iH = l.h(G(), i12);
        if (iH != 0) {
            int iB = l.b(iD, iY);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrF[i14];
                if (l.b(i15, iY) == iB && com.google.common.base.f.a(obj, objArrE[i14])) {
                    return false;
                }
                int iC = l.c(i15, iY);
                i13++;
                if (iC != 0) {
                    iH = iC;
                } else {
                    if (i13 >= 9) {
                        return h().add(obj);
                    }
                    if (i11 > iY) {
                        iY = J(iY, l.e(iY), iD, i10);
                    } else {
                        iArrF[i14] = l.d(i15, i11, iY);
                    }
                }
            }
        } else if (i11 > iY) {
            iY = J(iY, l.e(iY), iD, i10);
        } else {
            l.i(G(), i12, i11);
        }
        I(i11);
        B(i10, obj, iD, iY);
        this.f11708e = i11;
        z();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (D()) {
            return;
        }
        z();
        Set setS = s();
        if (setS != null) {
            this.f11707d = com.google.common.primitives.c.b(size(), 3, 1073741823);
            setS.clear();
            this.f11704a = null;
            this.f11708e = 0;
            return;
        }
        Arrays.fill(E(), 0, this.f11708e, (Object) null);
        l.g(G());
        Arrays.fill(F(), 0, this.f11708e, 0);
        this.f11708e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (D()) {
            return false;
        }
        Set setS = s();
        if (setS != null) {
            return setS.contains(obj);
        }
        int iD = z.d(obj);
        int iY = y();
        int iH = l.h(G(), iD & iY);
        if (iH == 0) {
            return false;
        }
        int iB = l.b(iD, iY);
        do {
            int i10 = iH - 1;
            int iV = v(i10);
            if (l.b(iV, iY) == iB && com.google.common.base.f.a(obj, u(i10))) {
                return true;
            }
            iH = l.c(iV, iY);
        } while (iH != 0);
        return false;
    }

    public int d(int i10, int i11) {
        return i10 - 1;
    }

    public int g() {
        com.google.common.base.g.s(D(), "Arrays already allocated");
        int i10 = this.f11707d;
        int iJ = l.j(i10);
        this.f11704a = l.a(iJ);
        M(iJ - 1);
        this.f11705b = new int[i10];
        this.f11706c = new Object[i10];
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Set h() {
        Set setI = i(y() + 1);
        int iW = w();
        while (iW >= 0) {
            setI.add(u(iW));
            iW = x(iW);
        }
        this.f11704a = setI;
        this.f11705b = null;
        this.f11706c = null;
        z();
        return setI;
    }

    public final Set i(int i10) {
        return new LinkedHashSet(i10, 1.0f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        Set setS = s();
        return setS != null ? setS.iterator() : new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (D()) {
            return false;
        }
        Set setS = s();
        if (setS != null) {
            return setS.remove(obj);
        }
        int iY = y();
        int iF = l.f(obj, null, iY, G(), F(), E(), null);
        if (iF == -1) {
            return false;
        }
        C(iF, iY);
        this.f11708e--;
        z();
        return true;
    }

    public Set s() {
        Object obj = this.f11704a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set setS = s();
        return setS != null ? setS.size() : this.f11708e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (D()) {
            return new Object[0];
        }
        Set setS = s();
        return setS != null ? setS.toArray() : Arrays.copyOf(E(), this.f11708e);
    }

    public final Object u(int i10) {
        return E()[i10];
    }

    public final int v(int i10) {
        return F()[i10];
    }

    public int w() {
        return isEmpty() ? -1 : 0;
    }

    public int x(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f11708e) {
            return i11;
        }
        return -1;
    }

    public final int y() {
        return (1 << (this.f11707d & 31)) - 1;
    }

    public void z() {
        this.f11707d += 32;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (D()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setS = s();
        if (setS != null) {
            return setS.toArray(objArr);
        }
        return g0.h(E(), 0, this.f11708e, objArr);
    }
}
