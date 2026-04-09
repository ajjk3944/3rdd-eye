package Fi;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class e extends Ei.a {

    /* renamed from: a, reason: collision with root package name */
    private final d f6707a;

    public e(d builder) {
        AbstractC6492s.i(builder, "builder");
        this.f6707a = builder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        AbstractC6492s.i(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f6707a.clear();
    }

    @Override // Zg.AbstractC3678j
    public int g() {
        return this.f6707a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new f(this.f6707a);
    }

    @Override // Ei.a
    public boolean s(Map.Entry element) {
        AbstractC6492s.i(element, "element");
        return Hi.e.f7981a.a(this.f6707a, element);
    }

    @Override // Ei.a
    public boolean y(Map.Entry element) {
        AbstractC6492s.i(element, "element");
        return this.f6707a.remove(element.getKey(), element.getValue());
    }
}
