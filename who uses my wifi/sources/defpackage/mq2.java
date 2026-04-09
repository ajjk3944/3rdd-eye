package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mq2 extends ip2 {
    public final transient Object h;

    public mq2(Object obj) {
        this.h = obj;
    }

    @Override // defpackage.yn2
    public final int a(Object[] objArr) {
        objArr[0] = this.h;
        return 1;
    }

    @Override // defpackage.yn2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.h.equals(obj);
    }

    @Override // defpackage.ip2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.h.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new mp2(this.h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ex0.h("[", this.h.toString(), "]");
    }
}
