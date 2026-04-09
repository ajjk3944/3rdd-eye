package D3;

import java.util.Iterator;
import java.util.Map;

/* renamed from: D3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2572m extends AbstractC2568i {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC2567h f2866c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f2867d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f2868e;

    C2572m(AbstractC2567h abstractC2567h, Object[] objArr, int i10, int i11) {
        this.f2866c = abstractC2567h;
        this.f2867d = objArr;
        this.f2868e = i11;
    }

    @Override // D3.AbstractC2561b, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f2866c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // D3.AbstractC2561b
    final int g(Object[] objArr, int i10) {
        return s().g(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return s().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2868e;
    }

    @Override // D3.AbstractC2568i
    final AbstractC2564e v() {
        return new C2571l(this);
    }
}
