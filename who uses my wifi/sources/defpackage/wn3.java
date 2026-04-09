package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wn3 extends xm3 {
    public final transient Object[] h;
    public final transient int i;
    public final transient int j;

    public wn3(Object[] objArr, int i, int i2) {
        this.h = objArr;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.tm3
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zt0.e0(i, this.j);
        Object obj = this.h[i + i + this.i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.j;
    }
}
