package Y;

import Zg.AbstractC3679k;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p extends AbstractC3679k implements W.d {

    /* renamed from: b, reason: collision with root package name */
    private final d f24501b;

    public p(d dVar) {
        this.f24501b = dVar;
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f24501b.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new q(this.f24501b.s());
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f24501b.size();
    }
}
