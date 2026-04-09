package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class iq2 extends ip2 {
    public static final Object[] m;
    public static final iq2 n;
    public final transient Object[] h;
    public final transient int i;
    public final transient Object[] j;
    public final transient int k;
    public final transient int l;

    static {
        Object[] objArr = new Object[0];
        m = objArr;
        n = new iq2(0, 0, 0, objArr, objArr);
    }

    public iq2(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.h = objArr;
        this.i = i;
        this.j = objArr2;
        this.k = i2;
        this.l = i3;
    }

    @Override // defpackage.yn2
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.h;
        int i = this.l;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.yn2
    public final int b() {
        return this.l;
    }

    @Override // defpackage.yn2
    public final int c() {
        return 0;
    }

    @Override // defpackage.yn2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.j;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i = iRotateLeft & this.k;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i + 1;
        }
    }

    @Override // defpackage.yn2
    public final Object[] d() {
        return this.h;
    }

    @Override // defpackage.ip2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        xo2 aq2Var = this.g;
        if (aq2Var == null) {
            ko2 ko2Var = xo2.g;
            int i = this.l;
            aq2Var = i == 0 ? aq2.j : new aq2(this.h, i);
            this.g = aq2Var;
        }
        return aq2Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.l;
    }
}
