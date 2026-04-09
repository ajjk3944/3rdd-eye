package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class up0 extends vp0 {

    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        final int[] f34174b;

        /* renamed from: c, reason: collision with root package name */
        final int f34175c;

        /* renamed from: d, reason: collision with root package name */
        final int f34176d;

        public a(int i, int i10, int[] iArr) {
            this.f34174b = iArr;
            this.f34175c = i;
            this.f34176d = i10;
        }

        public final int[] b() {
            return Arrays.copyOfRange(this.f34174b, this.f34175c, this.f34176d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            int[] iArr = this.f34174b;
            int iIntValue = ((Integer) obj).intValue();
            int i = this.f34175c;
            int i10 = this.f34176d;
            while (i < i10) {
                if (iArr[i] == iIntValue) {
                    return i != -1;
                }
                i++;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int i = this.f34176d - this.f34175c;
            if (aVar.f34176d - aVar.f34175c != i) {
                return false;
            }
            for (int i10 = 0; i10 < i; i10++) {
                if (this.f34174b[this.f34175c + i10] != aVar.f34174b[aVar.f34175c + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            pj1.a(i, this.f34176d - this.f34175c);
            return Integer.valueOf(this.f34174b[this.f34175c + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i = 1;
            for (int i10 = this.f34175c; i10 < this.f34176d; i10++) {
                i = (i * 31) + this.f34174b[i10];
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f34174b;
                int iIntValue = ((Integer) obj).intValue();
                int i = this.f34175c;
                int i10 = this.f34176d;
                while (true) {
                    if (i >= i10) {
                        i = -1;
                        break;
                    }
                    if (iArr[i] == iIntValue) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    return i - this.f34175c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f34174b;
                int iIntValue = ((Integer) obj).intValue();
                int i = this.f34175c;
                int i10 = this.f34176d - 1;
                while (true) {
                    if (i10 < i) {
                        i10 = -1;
                        break;
                    }
                    if (iArr[i10] == iIntValue) {
                        break;
                    }
                    i10--;
                }
                if (i10 >= 0) {
                    return i10 - this.f34175c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            Integer num = (Integer) obj;
            pj1.a(i, this.f34176d - this.f34175c);
            int[] iArr = this.f34174b;
            int i10 = this.f34175c + i;
            int i11 = iArr[i10];
            num.getClass();
            iArr[i10] = num.intValue();
            return Integer.valueOf(i11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f34176d - this.f34175c;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i, int i10) {
            pj1.a(i, i10, this.f34176d - this.f34175c);
            if (i == i10) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.f34174b;
            int i11 = this.f34175c;
            return new a(i + i11, i11 + i10, iArr);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb = new StringBuilder((this.f34176d - this.f34175c) * 5);
            sb.append('[');
            sb.append(this.f34174b[this.f34175c]);
            int i = this.f34175c;
            while (true) {
                i++;
                if (i >= this.f34176d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f34174b[i]);
            }
        }
    }

    public static List<Integer> a(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new a(0, iArr.length, iArr);
    }

    public static int b(long j4) {
        if (j4 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j4 < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j4;
    }

    public static int a(long j4) {
        int i = (int) j4;
        if (((long) i) == j4) {
            return i;
        }
        throw new IllegalArgumentException(w22.a("Out of range: %s", Long.valueOf(j4)));
    }

    public static int[] a(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof a) {
            return ((a) abstractCollection).b();
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
