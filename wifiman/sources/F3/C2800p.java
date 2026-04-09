package F3;

import java.util.Iterator;
import java.util.Map;

/* renamed from: F3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2800p extends AbstractC2796l {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC2795k f5931c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f5932d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f5933e;

    C2800p(AbstractC2795k abstractC2795k, Object[] objArr, int i10, int i11) {
        this.f5931c = abstractC2795k;
        this.f5932d = objArr;
        this.f5933e = i11;
    }

    @Override // F3.AbstractC2788d, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f5931c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // F3.AbstractC2788d
    final int g(Object[] objArr, int i10) {
        return s().g(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return s().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5933e;
    }

    @Override // F3.AbstractC2796l
    final AbstractC2792h v() {
        return new C2799o(this);
    }
}
