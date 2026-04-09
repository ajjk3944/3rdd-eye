package D3;

import java.util.Iterator;

/* renamed from: D3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2573n extends AbstractC2568i {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC2567h f2869c;

    /* renamed from: d, reason: collision with root package name */
    private final transient AbstractC2564e f2870d;

    C2573n(AbstractC2567h abstractC2567h, AbstractC2564e abstractC2564e) {
        this.f2869c = abstractC2567h;
        this.f2870d = abstractC2564e;
    }

    @Override // D3.AbstractC2561b, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2869c.get(obj) != null;
    }

    @Override // D3.AbstractC2561b
    final int g(Object[] objArr, int i10) {
        return this.f2870d.g(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f2870d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2869c.size();
    }
}
