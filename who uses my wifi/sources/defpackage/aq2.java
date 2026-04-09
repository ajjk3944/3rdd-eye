package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class aq2 extends xo2 {
    public static final aq2 j = new aq2(new Object[0], 0);
    public final transient Object[] h;
    public final transient int i;

    public aq2(Object[] objArr, int i) {
        this.h = objArr;
        this.i = i;
    }

    @Override // defpackage.xo2, defpackage.yn2
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.h;
        int i = this.i;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.yn2
    public final int b() {
        return this.i;
    }

    @Override // defpackage.yn2
    public final int c() {
        return 0;
    }

    @Override // defpackage.yn2
    public final Object[] d() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qb1.x(i, this.i);
        Object obj = this.h[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}
