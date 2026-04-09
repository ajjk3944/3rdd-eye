package com.bytedance.adsdk.vt;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.adsdk.vt.rn;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw<E> implements Collection<E>, Set<E> {
    private static Object[] fkw;

    /* renamed from: le, reason: collision with root package name */
    private static int f7138le;
    private static int pno;
    private static Object[] ra;
    private int[] bly;
    Object[] ouw;
    private rn<E, E> tlj;
    int vt;

    /* renamed from: lh, reason: collision with root package name */
    private static final int[] f7139lh = new int[0];
    private static final Object[] yu = new Object[0];

    public ouw() {
        this((byte) 0);
    }

    private int ouw(Object obj, int i4) {
        int i10 = this.vt;
        if (i10 == 0) {
            return -1;
        }
        int iOuw = vt.ouw(this.bly, i10, i4);
        if (iOuw < 0 || obj.equals(this.ouw[iOuw])) {
            return iOuw;
        }
        int i11 = iOuw + 1;
        while (i11 < i10 && this.bly[i11] == i4) {
            if (obj.equals(this.ouw[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iOuw - 1; i12 >= 0 && this.bly[i12] == i4; i12--) {
            if (obj.equals(this.ouw[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    private void vt(int i4) {
        if (i4 == 8) {
            synchronized (ouw.class) {
                Object[] objArr = ra;
                if (objArr != null) {
                    this.ouw = objArr;
                    ra = (Object[]) objArr[0];
                    this.bly = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    pno--;
                    return;
                }
            }
        } else if (i4 == 4) {
            synchronized (ouw.class) {
                Object[] objArr2 = fkw;
                if (objArr2 != null) {
                    this.ouw = objArr2;
                    fkw = (Object[]) objArr2[0];
                    this.bly = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f7138le--;
                    return;
                }
            }
        }
        this.bly = new int[i4];
        this.ouw = new Object[i4];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e2) {
        int i4;
        int iOuw;
        if (e2 == null) {
            iOuw = ouw();
            i4 = 0;
        } else {
            int iHashCode = e2.hashCode();
            i4 = iHashCode;
            iOuw = ouw(e2, iHashCode);
        }
        if (iOuw >= 0) {
            return false;
        }
        int i10 = ~iOuw;
        int i11 = this.vt;
        int[] iArr = this.bly;
        if (i11 >= iArr.length) {
            int i12 = 8;
            if (i11 >= 8) {
                i12 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.ouw;
            vt(i12);
            int[] iArr2 = this.bly;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.ouw, 0, objArr.length);
            }
            ouw(iArr, objArr, this.vt);
        }
        int i13 = this.vt;
        if (i10 < i13) {
            int[] iArr3 = this.bly;
            int i14 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i14, i13 - i10);
            Object[] objArr2 = this.ouw;
            System.arraycopy(objArr2, i10, objArr2, i14, this.vt - i10);
        }
        this.bly[i10] = i4;
        this.ouw[i10] = e2;
        this.vt++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.vt;
        int[] iArr = this.bly;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.ouw;
            vt(size);
            int i4 = this.vt;
            if (i4 > 0) {
                System.arraycopy(iArr, 0, this.bly, 0, i4);
                System.arraycopy(objArr, 0, this.ouw, 0, this.vt);
            }
            ouw(iArr, objArr, this.vt);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i4 = this.vt;
        if (i4 != 0) {
            ouw(this.bly, this.ouw, i4);
            this.bly = f7139lh;
            this.ouw = yu;
            this.vt = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return ouw(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
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
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.vt; i4++) {
                try {
                    if (!set.contains(this.ouw[i4])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.bly;
        int i4 = this.vt;
        int i10 = 0;
        for (int i11 = 0; i11 < i4; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.vt <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.tlj == null) {
            this.tlj = new rn<E, E>() { // from class: com.bytedance.adsdk.vt.ouw.1
                @Override // com.bytedance.adsdk.vt.rn
                public final void lh() {
                    ouw.this.clear();
                }

                @Override // com.bytedance.adsdk.vt.rn
                public final int ouw() {
                    return ouw.this.vt;
                }

                @Override // com.bytedance.adsdk.vt.rn
                public final Map<E, E> vt() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.vt.rn
                public final Object ouw(int i4) {
                    return ouw.this.ouw[i4];
                }

                @Override // com.bytedance.adsdk.vt.rn
                public final void vt(int i4) {
                    ouw.this.ouw(i4);
                }

                @Override // com.bytedance.adsdk.vt.rn
                public final int ouw(Object obj) {
                    return ouw.this.ouw(obj);
                }
            };
        }
        rn<E, E> rnVar = this.tlj;
        if (rnVar.vt == null) {
            rnVar.vt = new rn.vt();
        }
        return rnVar.vt.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iOuw = ouw(obj);
        if (iOuw < 0) {
            return false;
        }
        ouw(iOuw);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z3 = false;
        for (int i4 = this.vt - 1; i4 >= 0; i4--) {
            if (!collection.contains(this.ouw[i4])) {
                ouw(i4);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.vt;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i4 = this.vt;
        Object[] objArr = new Object[i4];
        System.arraycopy(this.ouw, 0, objArr, 0, i4);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.vt * 14);
        sb2.append('{');
        for (int i4 = 0; i4 < this.vt; i4++) {
            if (i4 > 0) {
                sb2.append(", ");
            }
            Object obj = this.ouw[i4];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    private ouw(byte b10) {
        this.bly = f7139lh;
        this.ouw = yu;
        this.vt = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.vt) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.vt));
        }
        System.arraycopy(this.ouw, 0, tArr, 0, this.vt);
        int length = tArr.length;
        int i4 = this.vt;
        if (length > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    private int ouw() {
        int i4 = this.vt;
        if (i4 == 0) {
            return -1;
        }
        int iOuw = vt.ouw(this.bly, i4, 0);
        if (iOuw < 0 || this.ouw[iOuw] == null) {
            return iOuw;
        }
        int i10 = iOuw + 1;
        while (i10 < i4 && this.bly[i10] == 0) {
            if (this.ouw[i10] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iOuw - 1; i11 >= 0 && this.bly[i11] == 0; i11--) {
            if (this.ouw[i11] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    private static void ouw(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (ouw.class) {
                try {
                    if (pno < 10) {
                        objArr[0] = ra;
                        objArr[1] = iArr;
                        for (int i10 = i4 - 1; i10 >= 2; i10--) {
                            objArr[i10] = null;
                        }
                        ra = objArr;
                        pno++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (ouw.class) {
                try {
                    if (f7138le < 10) {
                        objArr[0] = fkw;
                        objArr[1] = iArr;
                        for (int i11 = i4 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        fkw = objArr;
                        f7138le++;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final int ouw(Object obj) {
        return obj == null ? ouw() : ouw(obj, obj.hashCode());
    }

    public final E ouw(int i4) {
        Object[] objArr = this.ouw;
        E e2 = (E) objArr[i4];
        int i10 = this.vt;
        if (i10 <= 1) {
            ouw(this.bly, objArr, i10);
            this.bly = f7139lh;
            this.ouw = yu;
            this.vt = 0;
            return e2;
        }
        int[] iArr = this.bly;
        if (iArr.length > 8 && i10 < iArr.length / 3) {
            vt(i10 > 8 ? i10 + (i10 >> 1) : 8);
            this.vt--;
            if (i4 > 0) {
                System.arraycopy(iArr, 0, this.bly, 0, i4);
                System.arraycopy(objArr, 0, this.ouw, 0, i4);
            }
            int i11 = this.vt;
            if (i4 < i11) {
                int i12 = i4 + 1;
                System.arraycopy(iArr, i12, this.bly, i4, i11 - i4);
                System.arraycopy(objArr, i12, this.ouw, i4, this.vt - i4);
            }
            return e2;
        }
        int i13 = i10 - 1;
        this.vt = i13;
        if (i4 < i13) {
            int i14 = i4 + 1;
            System.arraycopy(iArr, i14, iArr, i4, i13 - i4);
            Object[] objArr2 = this.ouw;
            System.arraycopy(objArr2, i14, objArr2, i4, this.vt - i4);
        }
        this.ouw[this.vt] = null;
        return e2;
    }
}
