package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uo3 extends AbstractList implements RandomAccess, Serializable {
    public final int[] f;
    public final int g;
    public final int h;

    public uo3(int i, int i2, int[] iArr) {
        this.f = iArr;
        this.g = i;
        this.h = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.g;
        while (true) {
            if (i >= this.h) {
                i = -1;
                break;
            }
            if (this.f[i] == iIntValue) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uo3)) {
            return super.equals(obj);
        }
        uo3 uo3Var = (uo3) obj;
        int i = uo3Var.h;
        int i2 = uo3Var.g;
        int i3 = i - i2;
        int i4 = this.h;
        int i5 = this.g;
        int i6 = i4 - i5;
        if (i3 != i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (this.f[i5 + i7] != uo3Var.f[i2 + i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2 = this.h;
        int i3 = this.g;
        zt0.e0(i, i2 - i3);
        return Integer.valueOf(this.f[i3 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (int i = this.g; i < this.h; i++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f[i]);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i = this.g;
            int i2 = i;
            while (true) {
                if (i2 >= this.h) {
                    i2 = -1;
                    break;
                }
                if (this.f[i2] == iIntValue) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                return i2 - i;
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
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.h - 1;
            while (true) {
                i = this.g;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (this.f[i2] == iIntValue) {
                    break;
                }
                i2--;
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int i2 = this.h;
        int i3 = this.g;
        Integer num = (Integer) obj;
        zt0.e0(i, i2 - i3);
        int i4 = i3 + i;
        int[] iArr = this.f;
        int i5 = iArr[i4];
        num.getClass();
        iArr[i4] = num.intValue();
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h - this.g;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.f, this.g, this.h, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.h;
        int i4 = this.g;
        zt0.g0(i, i2, i3 - i4);
        return i == i2 ? Collections.EMPTY_LIST : new uo3(i + i4, i4 + i2, this.f);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = this.h;
        int i2 = this.g;
        StringBuilder sb = new StringBuilder((i - i2) * 5);
        sb.append('[');
        int[] iArr = this.f;
        sb.append(iArr[i2]);
        while (true) {
            i2++;
            if (i2 >= i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i2]);
        }
    }
}
