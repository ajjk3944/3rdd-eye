package D3;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: D3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2567h implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient AbstractC2568i f2858a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC2568i f2859b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC2561b f2860c;

    AbstractC2567h() {
    }

    public static AbstractC2567h h(Object obj, Object obj2) {
        T.a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C2575p.p(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
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

    abstract AbstractC2561b d();

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
    public final AbstractC2561b values() {
        AbstractC2561b abstractC2561b = this.f2860c;
        if (abstractC2561b != null) {
            return abstractC2561b;
        }
        AbstractC2561b abstractC2561bD = d();
        this.f2860c = abstractC2561bD;
        return abstractC2561bD;
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
        return AbstractC2576q.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    abstract AbstractC2568i j();

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC2568i abstractC2568i = this.f2859b;
        if (abstractC2568i != null) {
            return abstractC2568i;
        }
        AbstractC2568i abstractC2568iL = l();
        this.f2859b = abstractC2568iL;
        return abstractC2568iL;
    }

    abstract AbstractC2568i l();

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final AbstractC2568i entrySet() {
        AbstractC2568i abstractC2568i = this.f2858a;
        if (abstractC2568i != null) {
            return abstractC2568i;
        }
        AbstractC2568i abstractC2568iJ = j();
        this.f2858a = abstractC2568iJ;
        return abstractC2568iJ;
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
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
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
