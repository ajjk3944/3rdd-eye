package com.bytedance.adsdk.ypw;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class emc<E> implements Collection<E>, Set<E> {
    private static Object[] bw;
    private static int msw;
    private static Object[] uym;
    private static int ycc;
    Object[] emc;
    private cf<E, E> ru;
    int ypw;
    private int[] zz;
    private static final int[] xq = new int[0];
    private static final Object[] dg = new Object[0];

    public emc() {
        this(0);
    }

    private void dg(int i10) {
        if (i10 == 8) {
            synchronized (emc.class) {
                Object[] objArr = uym;
                if (objArr != null) {
                    this.emc = objArr;
                    uym = (Object[]) objArr[0];
                    this.zz = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    msw--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (emc.class) {
                Object[] objArr2 = bw;
                if (objArr2 != null) {
                    this.emc = objArr2;
                    bw = (Object[]) objArr2[0];
                    this.zz = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    ycc--;
                    return;
                }
            }
        }
        this.zz = new int[i10];
        this.emc = new Object[i10];
    }

    private int emc(Object obj, int i10) {
        int i11 = this.ypw;
        if (i11 == 0) {
            return -1;
        }
        int iEmc = ypw.emc(this.zz, i11, i10);
        if (iEmc < 0 || obj.equals(this.emc[iEmc])) {
            return iEmc;
        }
        int i12 = iEmc + 1;
        while (i12 < i11 && this.zz[i12] == i10) {
            if (obj.equals(this.emc[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iEmc - 1; i13 >= 0 && this.zz[i13] == i10; i13--) {
            if (obj.equals(this.emc[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iEmc;
        if (e10 == null) {
            iEmc = emc();
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iEmc = emc(e10, iHashCode);
        }
        if (iEmc >= 0) {
            return false;
        }
        int i11 = ~iEmc;
        int i12 = this.ypw;
        int[] iArr = this.zz;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.emc;
            dg(i13);
            int[] iArr2 = this.zz;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.emc, 0, objArr.length);
            }
            emc(iArr, objArr, this.ypw);
        }
        int i14 = this.ypw;
        if (i11 < i14) {
            int[] iArr3 = this.zz;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.emc;
            System.arraycopy(objArr2, i11, objArr2, i15, this.ypw - i11);
        }
        this.zz[i11] = i10;
        this.emc[i11] = e10;
        this.ypw++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        emc(this.ypw + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.ypw;
        if (i10 != 0) {
            emc(this.zz, this.emc, i10);
            this.zz = xq;
            this.emc = dg;
            this.ypw = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return emc(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.ypw; i10++) {
                try {
                    if (!set.contains(ypw(i10))) {
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
    public int hashCode() {
        int[] iArr = this.zz;
        int i10 = this.ypw;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.ypw <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return ypw().dg().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iEmc = emc(obj);
        if (iEmc < 0) {
            return false;
        }
        xq(iEmc);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.ypw - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.emc[i10])) {
                xq(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.ypw;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.ypw;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.emc, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.ypw * 14);
        sb.append('{');
        for (int i10 = 0; i10 < this.ypw; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            E eYpw = ypw(i10);
            if (eYpw != this) {
                sb.append(eYpw);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E xq(int i10) {
        Object[] objArr = this.emc;
        E e10 = (E) objArr[i10];
        int i11 = this.ypw;
        if (i11 <= 1) {
            emc(this.zz, objArr, i11);
            this.zz = xq;
            this.emc = dg;
            this.ypw = 0;
            return e10;
        }
        int[] iArr = this.zz;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i12 = i11 - 1;
            this.ypw = i12;
            if (i10 < i12) {
                int i13 = i10 + 1;
                System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                Object[] objArr2 = this.emc;
                System.arraycopy(objArr2, i13, objArr2, i10, this.ypw - i10);
            }
            this.emc[this.ypw] = null;
            return e10;
        }
        dg(i11 > 8 ? i11 + (i11 >> 1) : 8);
        this.ypw--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.zz, 0, i10);
            System.arraycopy(objArr, 0, this.emc, 0, i10);
        }
        int i14 = this.ypw;
        if (i10 < i14) {
            int i15 = i10 + 1;
            System.arraycopy(iArr, i15, this.zz, i10, i14 - i10);
            System.arraycopy(objArr, i15, this.emc, i10, this.ypw - i10);
        }
        return e10;
    }

    public E ypw(int i10) {
        return (E) this.emc[i10];
    }

    public emc(int i10) {
        if (i10 == 0) {
            this.zz = xq;
            this.emc = dg;
        } else {
            dg(i10);
        }
        this.ypw = 0;
    }

    private cf<E, E> ypw() {
        if (this.ru == null) {
            this.ru = new cf<E, E>() { // from class: com.bytedance.adsdk.ypw.emc.1
                @Override // com.bytedance.adsdk.ypw.cf
                public int emc() {
                    return emc.this.ypw;
                }

                @Override // com.bytedance.adsdk.ypw.cf
                public void xq() {
                    emc.this.clear();
                }

                @Override // com.bytedance.adsdk.ypw.cf
                public Map<E, E> ypw() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.ypw.cf
                public Object emc(int i10, int i11) {
                    return emc.this.emc[i10];
                }

                @Override // com.bytedance.adsdk.ypw.cf
                public int emc(Object obj) {
                    return emc.this.emc(obj);
                }

                @Override // com.bytedance.adsdk.ypw.cf
                public void emc(int i10) {
                    emc.this.xq(i10);
                }
            };
        }
        return this.ru;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.ypw) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.ypw));
        }
        System.arraycopy(this.emc, 0, tArr, 0, this.ypw);
        int length = tArr.length;
        int i10 = this.ypw;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    private int emc() {
        int i10 = this.ypw;
        if (i10 == 0) {
            return -1;
        }
        int iEmc = ypw.emc(this.zz, i10, 0);
        if (iEmc < 0 || this.emc[iEmc] == null) {
            return iEmc;
        }
        int i11 = iEmc + 1;
        while (i11 < i10 && this.zz[i11] == 0) {
            if (this.emc[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iEmc - 1; i12 >= 0 && this.zz[i12] == 0; i12--) {
            if (this.emc[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    private static void emc(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (emc.class) {
                try {
                    if (msw < 10) {
                        objArr[0] = uym;
                        objArr[1] = iArr;
                        for (int i11 = i10 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        uym = objArr;
                        msw++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (emc.class) {
                try {
                    if (ycc < 10) {
                        objArr[0] = bw;
                        objArr[1] = iArr;
                        for (int i12 = i10 - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        bw = objArr;
                        ycc++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void emc(int i10) {
        int[] iArr = this.zz;
        if (iArr.length < i10) {
            Object[] objArr = this.emc;
            dg(i10);
            int i11 = this.ypw;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.zz, 0, i11);
                System.arraycopy(objArr, 0, this.emc, 0, this.ypw);
            }
            emc(iArr, objArr, this.ypw);
        }
    }

    public int emc(Object obj) {
        return obj == null ? emc() : emc(obj, obj.hashCode());
    }
}
