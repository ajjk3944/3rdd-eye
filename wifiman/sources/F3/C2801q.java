package F3;

import java.util.Iterator;

/* renamed from: F3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2801q extends AbstractC2796l {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC2795k f5934c;

    /* renamed from: d, reason: collision with root package name */
    private final transient AbstractC2792h f5935d;

    C2801q(AbstractC2795k abstractC2795k, AbstractC2792h abstractC2792h) {
        this.f5934c = abstractC2795k;
        this.f5935d = abstractC2792h;
    }

    @Override // F3.AbstractC2788d, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5934c.get(obj) != null;
    }

    @Override // F3.AbstractC2788d
    final int g(Object[] objArr, int i10) {
        return this.f5935d.g(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f5935d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5934c.size();
    }
}
