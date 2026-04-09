package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e51 extends t41 implements Set, j$.util.Set {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10709c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient x41 f10710b;

    public static e51 k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i4 = length + 6;
        Object[] objArr2 = new Object[i4];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return r(objArr2, i4);
    }

    public static int l(int i4) {
        int iMax = Math.max(i4, 2);
        if (iMax >= 751619276) {
            mq0.y("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static e51 m(Set set) {
        if ((set instanceof e51) && !(set instanceof SortedSet)) {
            e51 e51Var = (e51) set;
            if (!e51Var.i()) {
                return e51Var;
            }
        }
        Object[] array = set.toArray();
        return r(array, array.length);
    }

    public static e51 o(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? r((Object[]) objArr.clone(), length) : new f51(objArr[0]) : a61.j;
    }

    public static d51 q(int i4) {
        yr1.u(i4, "expectedSize");
        d51 d51Var = new d51(i4);
        d51Var.f10335d = new Object[l(i4)];
        return d51Var;
    }

    public static e51 r(Object[] objArr, int i4) {
        if (i4 == 0) {
            return a61.j;
        }
        if (i4 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new f51(obj);
        }
        int iL = l(i4);
        Object[] objArr2 = new Object[iL];
        int i10 = iL - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i4; i13++) {
            Object obj2 = objArr[i13];
            yo0.u(i13, obj2);
            int iHashCode = obj2.hashCode();
            int iA = yo0.a(iHashCode);
            while (true) {
                int i14 = iA & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iA++;
                }
            }
        }
        Arrays.fill(objArr, i12, i4, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new f51(obj4);
        }
        if (l(i12) < iL / 2) {
            return r(objArr, i12);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new a61(i11, i10, i12, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof e51) && (this instanceof a61) && (((e51) obj) instanceof a61) && hashCode() != obj.hashCode()) {
            return false;
        }
        return yr1.E(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public x41 g() {
        x41 x41Var = this.f10710b;
        if (x41Var != null) {
            return x41Var;
        }
        x41 x41VarP = p();
        this.f10710b = x41VarP;
        return x41VarP;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return yr1.y(this);
    }

    public x41 p() {
        Object[] array = toArray(t41.f16701a);
        v41 v41Var = x41.f18307b;
        return x41.s(array, array.length);
    }
}
