package Ei;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    private final f f4790a;

    public h(f builder) {
        AbstractC6492s.i(builder, "builder");
        this.f4790a = builder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        AbstractC6492s.i(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f4790a.clear();
    }

    @Override // Zg.AbstractC3678j
    public int g() {
        return this.f4790a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new i(this.f4790a);
    }

    @Override // Ei.a
    public boolean s(Map.Entry element) {
        AbstractC6492s.i(element, "element");
        return Hi.e.f7981a.a(this.f4790a, element);
    }

    @Override // Ei.a
    public boolean y(Map.Entry element) {
        AbstractC6492s.i(element, "element");
        return this.f4790a.remove(element.getKey(), element.getValue());
    }
}
