package m0;

import c9.C2088i;
import c9.C2097r;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import k8.F;
import kotlin.jvm.internal.l;
import n0.C5346a;
import q9.InterfaceC5500b;

/* compiled from: ArraySet.jvm.kt */
/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5309b<E> implements Collection<E>, Set<E>, InterfaceC5500b {

    /* renamed from: b, reason: collision with root package name */
    public int[] f44008b = C5346a.f44190a;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f44009c = C5346a.f44192c;

    /* renamed from: d, reason: collision with root package name */
    public int f44010d;

    /* compiled from: ArraySet.jvm.kt */
    /* renamed from: m0.b$a */
    public final class a extends AbstractC5312e<E> {
        public a() {
            super(C5309b.this.f44010d);
        }

        @Override // m0.AbstractC5312e
        public final E a(int i) {
            return (E) C5309b.this.f44009c[i];
        }

        @Override // m0.AbstractC5312e
        public final void c(int i) {
            C5309b.this.c(i);
        }
    }

    public C5309b(int i) {
        if (i > 0) {
            F.b(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e4) {
        int i;
        int iH;
        int i10 = this.f44010d;
        if (e4 == null) {
            iH = F.h(this, null, 0);
            i = 0;
        } else {
            int iHashCode = e4.hashCode();
            i = iHashCode;
            iH = F.h(this, e4, iHashCode);
        }
        if (iH >= 0) {
            return false;
        }
        int i11 = ~iH;
        int[] iArr = this.f44008b;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f44009c;
            F.b(this, i12);
            if (i10 != this.f44010d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f44008b;
            if (iArr2.length != 0) {
                C2088i.c(0, 0, iArr.length, iArr, iArr2);
                C2088i.f(objArr, 0, this.f44009c, objArr.length, 6);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f44008b;
            int i13 = i11 + 1;
            C2088i.c(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.f44009c;
            C2088i.e(objArr2, i13, objArr2, i11, i10);
        }
        int i14 = this.f44010d;
        if (i10 == i14) {
            int[] iArr4 = this.f44008b;
            if (i11 < iArr4.length) {
                iArr4[i11] = i;
                this.f44009c[i11] = e4;
                this.f44010d = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> elements) {
        l.f(elements, "elements");
        int size = elements.size() + this.f44010d;
        int i = this.f44010d;
        int[] iArr = this.f44008b;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f44009c;
            F.b(this, size);
            int i10 = this.f44010d;
            if (i10 > 0) {
                C2088i.c(0, 0, i10, iArr, this.f44008b);
                C2088i.f(objArr, 0, this.f44009c, this.f44010d, 6);
            }
        }
        if (this.f44010d != i) {
            throw new ConcurrentModificationException();
        }
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final E c(int i) {
        int i10 = this.f44010d;
        Object[] objArr = this.f44009c;
        E e4 = (E) objArr[i];
        if (i10 <= 1) {
            clear();
            return e4;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f44008b;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i < i11) {
                int i12 = i + 1;
                C2088i.c(i, i12, i10, iArr, iArr);
                Object[] objArr2 = this.f44009c;
                C2088i.e(objArr2, i, objArr2, i12, i10);
            }
            this.f44009c[i11] = null;
        } else {
            F.b(this, i10 > 8 ? i10 + (i10 >> 1) : 8);
            if (i > 0) {
                C2088i.c(0, 0, i, iArr, this.f44008b);
                C2088i.f(objArr, 0, this.f44009c, i, 6);
            }
            if (i < i11) {
                int i13 = i + 1;
                C2088i.c(i, i13, i10, iArr, this.f44008b);
                C2088i.e(objArr, i, this.f44009c, i13, i10);
            }
        }
        if (i10 != this.f44010d) {
            throw new ConcurrentModificationException();
        }
        this.f44010d = i11;
        return e4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f44010d != 0) {
            this.f44008b = C5346a.f44190a;
            this.f44009c = C5346a.f44192c;
            this.f44010d = 0;
        }
        if (this.f44010d != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? F.h(this, null, 0) : F.h(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> elements) {
        l.f(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f44010d != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f44010d;
            for (int i10 = 0; i10 < i; i10++) {
                if (!((Set) obj).contains(this.f44009c[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f44008b;
        int i = this.f44010d;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f44010d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iH = obj == null ? F.h(this, null, 0) : F.h(this, obj, obj.hashCode());
        if (iH < 0) {
            return false;
        }
        c(iH);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> elements) {
        l.f(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> elements) {
        l.f(elements, "elements");
        boolean z10 = false;
        for (int i = this.f44010d - 1; -1 < i; i--) {
            if (!C2097r.k0(elements, this.f44009c[i])) {
                c(i);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f44010d;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return C2088i.g(this.f44009c, 0, this.f44010d);
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f44010d * 14);
        sb.append('{');
        int i = this.f44010d;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object obj = this.f44009c[i10];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        l.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        l.f(array, "array");
        int i = this.f44010d;
        if (array.length < i) {
            array = (T[]) ((Object[]) Array.newInstance(array.getClass().getComponentType(), i));
        } else if (array.length > i) {
            array[i] = null;
        }
        C2088i.e(this.f44009c, 0, array, 0, this.f44010d);
        return array;
    }
}
