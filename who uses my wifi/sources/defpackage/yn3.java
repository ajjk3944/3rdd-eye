package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yn3 extends dn3 {
    public static final Object[] n;
    public static final yn3 o;
    public final transient Object[] i;
    public final transient int j;
    public final transient Object[] k;
    public final transient int l;
    public final transient int m;

    static {
        Object[] objArr = new Object[0];
        n = objArr;
        o = new yn3(0, 0, 0, objArr, objArr);
    }

    public yn3(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.i = objArr;
        this.j = i;
        this.k = objArr2;
        this.l = i2;
        this.m = i3;
    }

    @Override // defpackage.tm3
    public final yq2 a() {
        return e().listIterator(0);
    }

    @Override // defpackage.tm3
    public final Object[] b() {
        return this.i;
    }

    @Override // defpackage.tm3
    public final int c() {
        return 0;
    }

    @Override // defpackage.tm3, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.k;
            if (objArr.length != 0) {
                int iX = g82.x(obj);
                while (true) {
                    int i = iX & this.l;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iX = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.tm3
    public final int d() {
        return this.m;
    }

    @Override // defpackage.tm3
    public final boolean f() {
        return false;
    }

    @Override // defpackage.tm3
    public final int g(Object[] objArr, int i) {
        Object[] objArr2 = this.i;
        int i2 = this.m;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.dn3, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // defpackage.dn3
    public final xm3 k() {
        return xm3.o(this.i, this.m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.m;
    }
}
