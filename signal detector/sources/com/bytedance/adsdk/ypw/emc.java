package com.bytedance.adsdk.ypw;

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

    private void dg(int i) {
        if (i == 8) {
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
        } else if (i == 4) {
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
        this.zz = new int[i];
        this.emc = new Object[i];
    }

    private int emc(Object obj, int i) {
        int i3 = this.ypw;
        if (i3 == 0) {
            return -1;
        }
        int iEmc = ypw.emc(this.zz, i3, i);
        if (iEmc < 0 || obj.equals(this.emc[iEmc])) {
            return iEmc;
        }
        int i6 = iEmc + 1;
        while (i6 < i3 && this.zz[i6] == i) {
            if (obj.equals(this.emc[i6])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iEmc - 1; i7 >= 0 && this.zz[i7] == i; i7--) {
            if (obj.equals(this.emc[i7])) {
                return i7;
            }
        }
        return ~i6;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e6) {
        int i;
        int iEmc;
        if (e6 == null) {
            iEmc = emc();
            i = 0;
        } else {
            int iHashCode = e6.hashCode();
            i = iHashCode;
            iEmc = emc(e6, iHashCode);
        }
        if (iEmc >= 0) {
            return false;
        }
        int i3 = ~iEmc;
        int i6 = this.ypw;
        int[] iArr = this.zz;
        if (i6 >= iArr.length) {
            int i7 = 8;
            if (i6 >= 8) {
                i7 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.emc;
            dg(i7);
            int[] iArr2 = this.zz;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.emc, 0, objArr.length);
            }
            emc(iArr, objArr, this.ypw);
        }
        int i8 = this.ypw;
        if (i3 < i8) {
            int[] iArr3 = this.zz;
            int i9 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i9, i8 - i3);
            Object[] objArr2 = this.emc;
            System.arraycopy(objArr2, i3, objArr2, i9, this.ypw - i3);
        }
        this.zz[i3] = i;
        this.emc[i3] = e6;
        this.ypw++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        emc(collection.size() + this.ypw);
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.ypw;
        if (i != 0) {
            emc(this.zz, this.emc, i);
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
            for (int i = 0; i < this.ypw; i++) {
                try {
                    if (!set.contains(ypw(i))) {
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
        int i = this.ypw;
        int i3 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            i3 += iArr[i6];
        }
        return i3;
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
        boolean z6 = false;
        for (int i = this.ypw - 1; i >= 0; i--) {
            if (!collection.contains(this.emc[i])) {
                xq(i);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.ypw;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.ypw;
        Object[] objArr = new Object[i];
        System.arraycopy(this.emc, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.ypw * 14);
        sb.append('{');
        for (int i = 0; i < this.ypw; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eYpw = ypw(i);
            if (eYpw != this) {
                sb.append(eYpw);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E xq(int i) {
        Object[] objArr = this.emc;
        E e6 = (E) objArr[i];
        int i3 = this.ypw;
        if (i3 <= 1) {
            emc(this.zz, objArr, i3);
            this.zz = xq;
            this.emc = dg;
            this.ypw = 0;
            return e6;
        }
        int[] iArr = this.zz;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            int i6 = i3 - 1;
            this.ypw = i6;
            if (i < i6) {
                int i7 = i + 1;
                System.arraycopy(iArr, i7, iArr, i, i6 - i);
                Object[] objArr2 = this.emc;
                System.arraycopy(objArr2, i7, objArr2, i, this.ypw - i);
            }
            this.emc[this.ypw] = null;
            return e6;
        }
        dg(i3 > 8 ? i3 + (i3 >> 1) : 8);
        this.ypw--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.zz, 0, i);
            System.arraycopy(objArr, 0, this.emc, 0, i);
        }
        int i8 = this.ypw;
        if (i < i8) {
            int i9 = i + 1;
            System.arraycopy(iArr, i9, this.zz, i, i8 - i);
            System.arraycopy(objArr, i9, this.emc, i, this.ypw - i);
        }
        return e6;
    }

    public E ypw(int i) {
        return (E) this.emc[i];
    }

    public emc(int i) {
        if (i == 0) {
            this.zz = xq;
            this.emc = dg;
        } else {
            dg(i);
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
                public Object emc(int i, int i3) {
                    return emc.this.emc[i];
                }

                @Override // com.bytedance.adsdk.ypw.cf
                public int emc(Object obj) {
                    return emc.this.emc(obj);
                }

                @Override // com.bytedance.adsdk.ypw.cf
                public void emc(int i) {
                    emc.this.xq(i);
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
        int i = this.ypw;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    private int emc() {
        int i = this.ypw;
        if (i == 0) {
            return -1;
        }
        int iEmc = ypw.emc(this.zz, i, 0);
        if (iEmc < 0 || this.emc[iEmc] == null) {
            return iEmc;
        }
        int i3 = iEmc + 1;
        while (i3 < i && this.zz[i3] == 0) {
            if (this.emc[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i6 = iEmc - 1; i6 >= 0 && this.zz[i6] == 0; i6--) {
            if (this.emc[i6] == null) {
                return i6;
            }
        }
        return ~i3;
    }

    private static void emc(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (emc.class) {
                try {
                    if (msw < 10) {
                        objArr[0] = uym;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
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
                        for (int i6 = i - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
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

    public void emc(int i) {
        int[] iArr = this.zz;
        if (iArr.length < i) {
            Object[] objArr = this.emc;
            dg(i);
            int i3 = this.ypw;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.zz, 0, i3);
                System.arraycopy(objArr, 0, this.emc, 0, this.ypw);
            }
            emc(iArr, objArr, this.ypw);
        }
    }

    public int emc(Object obj) {
        return obj == null ? emc() : emc(obj, obj.hashCode());
    }
}
