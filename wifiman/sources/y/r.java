package Y;

import Zg.AbstractC3670b;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r extends AbstractC3670b implements W.b {

    /* renamed from: a, reason: collision with root package name */
    private final d f24502a;

    public r(d dVar) {
        this.f24502a = dVar;
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f24502a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new s(this.f24502a.s());
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f24502a.size();
    }
}
