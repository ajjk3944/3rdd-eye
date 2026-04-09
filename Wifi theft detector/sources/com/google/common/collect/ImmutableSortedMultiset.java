package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.e0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class ImmutableSortedMultiset<E> extends ImmutableSortedMultisetFauxverideShim<E> implements r0 {

    /* renamed from: c, reason: collision with root package name */
    public transient ImmutableSortedMultiset f11837c;

    public static final class SerializedForm<E> implements Serializable {
        final Comparator<? super E> comparator;
        final int[] counts;
        final E[] elements;

        public SerializedForm(r0 r0Var) {
            this.comparator = r0Var.comparator();
            int size = r0Var.entrySet().size();
            this.elements = (E[]) new Object[size];
            this.counts = new int[size];
            int i10 = 0;
            for (e0.a aVar : r0Var.entrySet()) {
                ((E[]) this.elements)[i10] = aVar.d();
                this.counts[i10] = aVar.getCount();
                i10++;
            }
        }

        public Object readResolve() {
            int length = this.elements.length;
            a aVar = new a(this.comparator);
            for (int i10 = 0; i10 < length; i10++) {
                aVar.b(this.elements[i10], this.counts[i10]);
            }
            return aVar.c();
        }
    }

    public static class a extends ImmutableMultiset.b {

        /* renamed from: d, reason: collision with root package name */
        public final Comparator f11838d;

        /* renamed from: e, reason: collision with root package name */
        public Object[] f11839e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f11840f;

        /* renamed from: g, reason: collision with root package name */
        public int f11841g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f11842h;

        public a(Comparator comparator) {
            super(true);
            this.f11838d = (Comparator) com.google.common.base.g.m(comparator);
            this.f11839e = new Object[4];
            this.f11840f = new int[4];
        }

        public a b(Object obj, int i10) {
            com.google.common.base.g.m(obj);
            j.b(i10, "occurrences");
            if (i10 == 0) {
                return this;
            }
            f();
            Object[] objArr = this.f11839e;
            int i11 = this.f11841g;
            objArr[i11] = obj;
            this.f11840f[i11] = i10;
            this.f11841g = i11 + 1;
            return this;
        }

        public ImmutableSortedMultiset c() {
            e();
            int i10 = this.f11841g;
            if (i10 == 0) {
                return ImmutableSortedMultiset.z(this.f11838d);
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) ImmutableSortedSet.J(this.f11838d, i10, this.f11839e);
            long[] jArr = new long[this.f11841g + 1];
            int i11 = 0;
            while (i11 < this.f11841g) {
                int i12 = i11 + 1;
                jArr[i12] = jArr[i11] + this.f11840f[i11];
                i11 = i12;
            }
            this.f11842h = true;
            return new RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, this.f11841g);
        }

        public final void d(boolean z10) {
            int i10 = this.f11841g;
            if (i10 == 0) {
                return;
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.f11839e, i10);
            Arrays.sort(objArrCopyOf, this.f11838d);
            int i11 = 1;
            for (int i12 = 1; i12 < objArrCopyOf.length; i12++) {
                if (this.f11838d.compare(objArrCopyOf[i11 - 1], objArrCopyOf[i12]) < 0) {
                    objArrCopyOf[i11] = objArrCopyOf[i12];
                    i11++;
                }
            }
            Arrays.fill(objArrCopyOf, i11, this.f11841g, (Object) null);
            if (z10) {
                int i13 = i11 * 4;
                int i14 = this.f11841g;
                if (i13 > i14 * 3) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, com.google.common.math.b.b(i14, (i14 / 2) + 1));
                }
            }
            int[] iArr = new int[objArrCopyOf.length];
            for (int i15 = 0; i15 < this.f11841g; i15++) {
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, 0, i11, this.f11839e[i15], this.f11838d);
                int i16 = this.f11840f[i15];
                if (i16 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i16;
                } else {
                    iArr[iBinarySearch] = ~i16;
                }
            }
            this.f11839e = objArrCopyOf;
            this.f11840f = iArr;
            this.f11841g = i11;
        }

        public final void e() {
            d(false);
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = this.f11841g;
                if (i10 >= i12) {
                    Arrays.fill(this.f11839e, i11, i12, (Object) null);
                    Arrays.fill(this.f11840f, i11, this.f11841g, 0);
                    this.f11841g = i11;
                    return;
                }
                int[] iArr = this.f11840f;
                int i13 = iArr[i10];
                if (i13 > 0) {
                    Object[] objArr = this.f11839e;
                    objArr[i11] = objArr[i10];
                    iArr[i11] = i13;
                    i11++;
                }
                i10++;
            }
        }

        public final void f() {
            int i10 = this.f11841g;
            Object[] objArr = this.f11839e;
            if (i10 == objArr.length) {
                d(true);
            } else if (this.f11842h) {
                this.f11839e = Arrays.copyOf(objArr, objArr.length);
            }
            this.f11842h = false;
        }
    }

    public static ImmutableSortedMultiset z(Comparator comparator) {
        return j0.d().equals(comparator) ? RegularImmutableSortedMultiset.f11960i : new RegularImmutableSortedMultiset(comparator);
    }

    @Override // com.google.common.collect.r0
    /* renamed from: A */
    public abstract ImmutableSortedMultiset q(Object obj, BoundType boundType);

    @Override // com.google.common.collect.r0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset a(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        com.google.common.base.g.j(comparator().compare(obj, obj2) <= 0, "Expected lowerBound <= upperBound but %s > %s", obj, obj2);
        return t(obj, boundType).q(obj2, boundType2);
    }

    @Override // com.google.common.collect.r0
    /* renamed from: C */
    public abstract ImmutableSortedMultiset t(Object obj, BoundType boundType);

    @Override // com.google.common.collect.r0, com.google.common.collect.p0
    public final Comparator comparator() {
        return k().comparator();
    }

    @Override // com.google.common.collect.r0
    public final e0.a pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.r0
    public final e0.a pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // com.google.common.collect.r0
    /* renamed from: x */
    public ImmutableSortedMultiset o() {
        ImmutableSortedMultiset immutableSortedMultisetZ = this.f11837c;
        if (immutableSortedMultisetZ == null) {
            immutableSortedMultisetZ = isEmpty() ? z(j0.a(comparator()).i()) : new DescendingImmutableSortedMultiset(this);
            this.f11837c = immutableSortedMultisetZ;
        }
        return immutableSortedMultisetZ;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    /* renamed from: y */
    public abstract ImmutableSortedSet k();
}
