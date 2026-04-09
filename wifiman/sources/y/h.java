package Y;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    private final f f24496a;

    public h(f fVar) {
        this.f24496a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f24496a.clear();
    }

    @Override // Zg.AbstractC3678j
    public int g() {
        return this.f24496a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new i(this.f24496a);
    }

    @Override // Y.a
    public boolean s(Map.Entry entry) {
        Object obj = this.f24496a.get(entry.getKey());
        return obj != null ? AbstractC6492s.d(obj, entry.getValue()) : entry.getValue() == null && this.f24496a.containsKey(entry.getKey());
    }

    @Override // Y.a
    public boolean y(Map.Entry entry) {
        return this.f24496a.remove(entry.getKey(), entry.getValue());
    }
}
