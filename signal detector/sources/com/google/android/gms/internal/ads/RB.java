package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class RB extends HB implements Set, j$.util.Set {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10866c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient LB f10867b;

    public static RB h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return n(i, objArr2);
    }

    public static int i(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            AbstractC0582Jp.y("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static RB j(Set set) {
        if ((set instanceof RB) && !(set instanceof SortedSet)) {
            RB rb = (RB) set;
            if (!rb.f()) {
                return rb;
            }
        }
        Object[] array = set.toArray();
        return n(array.length, array);
    }

    public static RB k(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? n(length, (Object[]) objArr.clone()) : new SB(objArr[0]) : C1519mC.f15594j;
    }

    public static QB m(int i) {
        C1476lN.v(i, "expectedSize");
        QB qb = new QB(i);
        qb.f10585d = new Object[i(i)];
        return qb;
    }

    public static RB n(int i, Object... objArr) {
        if (i == 0) {
            return C1519mC.f15594j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new SB(obj);
        }
        int i3 = i(i);
        Object[] objArr2 = new Object[i3];
        int i6 = i3 - 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj2 = objArr[i9];
            AbstractC1984ut.u(i9, obj2);
            int iHashCode = obj2.hashCode();
            int iA = AbstractC1984ut.a(iHashCode);
            while (true) {
                int i10 = iA & i6;
                Object obj3 = objArr2[i10];
                if (obj3 == null) {
                    objArr[i8] = obj2;
                    objArr2[i10] = obj2;
                    i7 += iHashCode;
                    i8++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iA++;
                }
            }
        }
        Arrays.fill(objArr, i8, i, (Object) null);
        if (i8 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new SB(obj4);
        }
        if (i(i8) < i3 / 2) {
            return n(i8, objArr);
        }
        int length = objArr.length;
        if (i8 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i8);
        }
        return new C1519mC(i7, i6, i8, objArr, objArr2);
    }

    @Override // com.google.android.gms.internal.ads.HB
    public LB e() {
        LB lb = this.f10867b;
        if (lb != null) {
            return lb;
        }
        LB lbL = l();
        this.f10867b = lbL;
        return lbL;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof RB) && (this instanceof C1519mC)) {
            RB rb = (RB) obj;
            rb.getClass();
            if ((rb instanceof C1519mC) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return C1476lN.F(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C1476lN.z(this);
    }

    public LB l() {
        Object[] array = toArray(HB.f8873a);
        JB jb = LB.f9635b;
        return LB.o(array.length, array);
    }
}
