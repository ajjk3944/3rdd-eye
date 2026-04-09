package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sn3 extends xm3 {
    public static final sn3 j = new sn3(new Object[0], 0);
    public final transient Object[] h;
    public final transient int i;

    public sn3(Object[] objArr, int i) {
        this.h = objArr;
        this.i = i;
    }

    @Override // defpackage.tm3
    public final Object[] b() {
        return this.h;
    }

    @Override // defpackage.tm3
    public final int c() {
        return 0;
    }

    @Override // defpackage.tm3
    public final int d() {
        return this.i;
    }

    @Override // defpackage.tm3
    public final boolean f() {
        return false;
    }

    @Override // defpackage.xm3, defpackage.tm3
    public final int g(Object[] objArr, int i) {
        Object[] objArr2 = this.h;
        int i2 = this.i;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zt0.e0(i, this.i);
        Object obj = this.h[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}
