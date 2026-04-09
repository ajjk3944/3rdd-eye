package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {

    /* renamed from: b, reason: collision with root package name */
    public transient ImmutableList f11824b;

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.C(this.elements);
        }
    }

    public static class a extends ImmutableCollection.a {

        /* renamed from: d, reason: collision with root package name */
        public Object[] f11825d;

        /* renamed from: e, reason: collision with root package name */
        public int f11826e;

        public a() {
            super(4);
        }

        public a f(Object obj) {
            com.google.common.base.g.m(obj);
            if (this.f11825d != null && ImmutableSet.x(this.f11783b) <= this.f11825d.length) {
                i(obj);
                return this;
            }
            this.f11825d = null;
            super.b(obj);
            return this;
        }

        public a g(Object... objArr) {
            if (this.f11825d == null) {
                super.c(objArr);
                return this;
            }
            for (Object obj : objArr) {
                f(obj);
            }
            return this;
        }

        public a h(Iterator it) {
            com.google.common.base.g.m(it);
            while (it.hasNext()) {
                f(it.next());
            }
            return this;
        }

        public final void i(Object obj) {
            Objects.requireNonNull(this.f11825d);
            int length = this.f11825d.length - 1;
            int iHashCode = obj.hashCode();
            int iC = z.c(iHashCode);
            while (true) {
                int i10 = iC & length;
                Object[] objArr = this.f11825d;
                Object obj2 = objArr[i10];
                if (obj2 == null) {
                    objArr[i10] = obj;
                    this.f11826e += iHashCode;
                    super.b(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    iC = i10 + 1;
                }
            }
        }

        public ImmutableSet j() {
            ImmutableSet immutableSetY;
            int i10 = this.f11783b;
            if (i10 == 0) {
                return ImmutableSet.F();
            }
            if (i10 == 1) {
                Object obj = this.f11782a[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.G(obj);
            }
            if (this.f11825d == null || ImmutableSet.x(i10) != this.f11825d.length) {
                immutableSetY = ImmutableSet.y(this.f11783b, this.f11782a);
                this.f11783b = immutableSetY.size();
            } else {
                Object[] objArrCopyOf = ImmutableSet.I(this.f11783b, this.f11782a.length) ? Arrays.copyOf(this.f11782a, this.f11783b) : this.f11782a;
                immutableSetY = new RegularImmutableSet(objArrCopyOf, this.f11826e, this.f11825d, r5.length - 1, this.f11783b);
            }
            this.f11784c = true;
            this.f11825d = null;
            return immutableSetY;
        }
    }

    public static ImmutableSet A(Collection collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) collection;
            if (!immutableSet.i()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return y(array.length, array);
    }

    public static ImmutableSet B(Iterator it) {
        if (!it.hasNext()) {
            return F();
        }
        Object next = it.next();
        return !it.hasNext() ? G(next) : new a().f(next).h(it).j();
    }

    public static ImmutableSet C(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? y(objArr.length, (Object[]) objArr.clone()) : G(objArr[0]) : F();
    }

    public static ImmutableSet F() {
        return RegularImmutableSet.f11953i;
    }

    public static ImmutableSet G(Object obj) {
        return new SingletonImmutableSet(obj);
    }

    public static ImmutableSet H(Object obj, Object obj2, Object obj3) {
        return y(3, obj, obj2, obj3);
    }

    public static boolean I(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static a w() {
        return new a();
    }

    public static int x(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            com.google.common.base.g.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static ImmutableSet y(int i10, Object... objArr) {
        if (i10 == 0) {
            return F();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return G(obj);
        }
        int iX = x(i10);
        Object[] objArr2 = new Object[iX];
        int i11 = iX - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objA = g0.a(objArr[i14], i14);
            int iHashCode = objA.hashCode();
            int iC = z.c(iHashCode);
            while (true) {
                int i15 = iC & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = objA;
                    objArr2[i15] = objA;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iC++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new SingletonImmutableSet(obj3);
        }
        if (x(i13) < iX / 2) {
            return y(i13, objArr);
        }
        if (I(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new RegularImmutableSet(objArr, i12, objArr2, i11, i13);
    }

    public static ImmutableSet z(Iterable iterable) {
        return iterable instanceof Collection ? A((Collection) iterable) : B(iterable.iterator());
    }

    public ImmutableList D() {
        return ImmutableList.s(toArray());
    }

    public boolean E() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && E() && ((ImmutableSet) obj).E() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.b(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: j */
    public abstract v0 iterator();

    public ImmutableList v() {
        ImmutableList immutableList = this.f11824b;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList immutableListD = D();
        this.f11824b = immutableListD;
        return immutableListD;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }
}
