package Y;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
public class b implements Map.Entry, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f24474a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f24475b;

    public b(Object obj, Object obj2) {
        this.f24474a = obj;
        this.f24475b = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && AbstractC6492s.d(entry.getKey(), getKey()) && AbstractC6492s.d(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f24474a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f24475b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
