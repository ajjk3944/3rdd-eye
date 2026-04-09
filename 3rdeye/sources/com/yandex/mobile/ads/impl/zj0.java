package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class zj0<E> extends vj0<E> implements Set<E> {

    /* renamed from: c, reason: collision with root package name */
    private transient xj0<E> f36526c;

    public static class a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        final Object[] f36527b;

        public a(Object[] objArr) {
            this.f36527b = objArr;
        }

        public Object readResolve() {
            return zj0.a(this.f36527b);
        }
    }

    public static int a(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public xj0<E> b() {
        xj0<E> xj0Var = this.f36526c;
        if (xj0Var != null) {
            return xj0Var;
        }
        xj0<E> xj0VarG = g();
        this.f36526c = xj0VarG;
        return xj0VarG;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zj0) && (this instanceof ho1)) {
            zj0 zj0Var = (zj0) obj;
            zj0Var.getClass();
            if ((zj0Var instanceof ho1) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return lx1.a(this, obj);
    }

    public xj0<E> g() {
        Object[] array = toArray();
        int i = xj0.f35328d;
        return xj0.b(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return lx1.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.vj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.yandex.mobile.ads.impl.vj0
    public Object writeReplace() {
        return new a(toArray());
    }

    private static <E> zj0<E> b(int i, Object... objArr) {
        if (i == 0) {
            return ho1.f28311j;
        }
        if (i != 1) {
            int iA = a(i);
            Object[] objArr2 = new Object[iA];
            int i10 = iA - 1;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i; i13++) {
                Object obj = objArr[i13];
                if (obj != null) {
                    int iHashCode = obj.hashCode();
                    int iA2 = df0.a(iHashCode);
                    while (true) {
                        int i14 = iA2 & i10;
                        Object obj2 = objArr2[i14];
                        if (obj2 == null) {
                            objArr[i12] = obj;
                            objArr2[i14] = obj;
                            i11 += iHashCode;
                            i12++;
                            break;
                        }
                        if (obj2.equals(obj)) {
                            break;
                        }
                        iA2++;
                    }
                } else {
                    throw new NullPointerException(fe.a("at index ", i13));
                }
            }
            Arrays.fill(objArr, i12, i, (Object) null);
            if (i12 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new ty1(obj3);
            }
            if (a(i12) < iA / 2) {
                return b(i12, objArr);
            }
            int length = objArr.length;
            if (i12 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i12);
            }
            return new ho1(objArr, i11, objArr2, i10, i12);
        }
        Object obj4 = objArr[0];
        Objects.requireNonNull(obj4);
        return new ty1(obj4);
    }

    public static zj0 a(Set set) {
        if ((set instanceof zj0) && !(set instanceof SortedSet)) {
            zj0 zj0Var = (zj0) set;
            if (!zj0Var.f()) {
                return zj0Var;
            }
        }
        Object[] array = set.toArray();
        return b(array.length, array);
    }

    public static <E> zj0<E> a(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return ho1.f28311j;
        }
        if (length != 1) {
            return b(eArr.length, (Object[]) eArr.clone());
        }
        return new ty1(eArr[0]);
    }

    public static zj0 a(String str, String str2) {
        return b(2, str, str2);
    }

    public static zj0 a(String str, String str2, String str3) {
        return b(3, str, str2, str3);
    }
}
