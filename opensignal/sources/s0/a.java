package s0;

import java.util.Map;

/* loaded from: classes.dex */
public class a implements Map.Entry, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21820a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21821d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f21822g;

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f21820a = i10;
        this.f21821d = obj;
        this.f21822g = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f21820a) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && br.l.a(entry.getKey(), this.f21821d) && br.l.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f21820a) {
        }
        return this.f21821d;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f21820a) {
        }
        return this.f21822g;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f21820a) {
            case 0:
                Object obj = this.f21821d;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f21820a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f21820a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f21821d);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
