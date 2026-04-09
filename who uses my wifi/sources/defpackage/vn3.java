package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vn3 extends dn3 {
    public final transient xn3 i;
    public final transient wn3 j;

    public vn3(xn3 xn3Var, wn3 wn3Var) {
        this.i = xn3Var;
        this.j = wn3Var;
    }

    @Override // defpackage.tm3
    public final yq2 a() {
        return this.j.listIterator(0);
    }

    @Override // defpackage.tm3, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.i.get(obj) != null;
    }

    @Override // defpackage.dn3, defpackage.tm3
    public final xm3 e() {
        return this.j;
    }

    @Override // defpackage.tm3
    public final boolean f() {
        return true;
    }

    @Override // defpackage.tm3
    public final int g(Object[] objArr, int i) {
        return this.j.g(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.j.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i.k;
    }
}
