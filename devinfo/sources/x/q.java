package x;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class q implements Map.Entry, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36931a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f36932b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36933c;

    public /* synthetic */ q(int i4, Object obj, Object obj2) {
        this.f36931a = i4;
        this.f36932b = obj;
        this.f36933c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f36931a) {
            case 1:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && nk.k.a(entry.getKey(), this.f36932b) && nk.k.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f36931a) {
        }
        return this.f36932b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f36931a) {
        }
        return this.f36933c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f36931a) {
            case 1:
                Object obj = this.f36932b;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f36931a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f36931a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f36932b);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
