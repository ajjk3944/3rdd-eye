package Y;

import Zg.AbstractC3679k;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class n extends AbstractC3679k implements W.d {

    /* renamed from: b, reason: collision with root package name */
    private final d f24500b;

    public n(d dVar) {
        this.f24500b = dVar;
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return v((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new o(this.f24500b.s());
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f24500b.size();
    }

    public boolean v(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object obj = this.f24500b.get(entry.getKey());
        return obj != null ? AbstractC6492s.d(obj, entry.getValue()) : entry.getValue() == null && this.f24500b.containsKey(entry.getKey());
    }
}
