package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bn3 extends tm3 {
    public final transient fn3 g;

    public bn3(fn3 fn3Var) {
        this.g = fn3Var;
    }

    @Override // defpackage.tm3
    public final yq2 a() {
        return new an3(this.g);
    }

    @Override // defpackage.tm3, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.g.c(obj);
    }

    @Override // defpackage.tm3
    public final int g(Object[] objArr, int i) {
        vm3 vm3VarListIterator = ((xm3) this.g.i.values()).listIterator(0);
        while (vm3VarListIterator.hasNext()) {
            i = ((tm3) vm3VarListIterator.next()).g(objArr, i);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new an3(this.g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.g.j;
    }
}
