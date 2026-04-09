package F3;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: F3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2795k implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient AbstractC2796l f5923a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC2796l f5924b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC2788d f5925c;

    AbstractC2795k() {
    }

    public static AbstractC2795k h(Object obj, Object obj2) {
        e0.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C2802s.p(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract AbstractC2788d d();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final AbstractC2788d values() {
        AbstractC2788d abstractC2788d = this.f5925c;
        if (abstractC2788d != null) {
            return abstractC2788d;
        }
        AbstractC2788d abstractC2788dD = d();
        this.f5925c = abstractC2788dD;
        return abstractC2788dD;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC2803t.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    abstract AbstractC2796l j();

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC2796l abstractC2796l = this.f5924b;
        if (abstractC2796l != null) {
            return abstractC2796l;
        }
        AbstractC2796l abstractC2796lL = l();
        this.f5924b = abstractC2796lL;
        return abstractC2796lL;
    }

    abstract AbstractC2796l l();

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final AbstractC2796l entrySet() {
        AbstractC2796l abstractC2796l = this.f5923a;
        if (abstractC2796l != null) {
            return abstractC2796l;
        }
        AbstractC2796l abstractC2796lJ = j();
        this.f5923a = abstractC2796lJ;
        return abstractC2796lJ;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        e0.a(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }
}
