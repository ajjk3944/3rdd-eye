package i4;

import java.util.Map;

/* loaded from: classes.dex */
public final class n implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public n f20611a;

    /* renamed from: b, reason: collision with root package name */
    public n f20612b;

    /* renamed from: c, reason: collision with root package name */
    public n f20613c;

    /* renamed from: d, reason: collision with root package name */
    public n f20614d;

    /* renamed from: e, reason: collision with root package name */
    public n f20615e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f20616f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20617g;

    /* renamed from: h, reason: collision with root package name */
    public Object f20618h;
    public int i;

    public n(boolean z6) {
        this.f20616f = null;
        this.f20617g = z6;
        this.f20615e = this;
        this.f20614d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f20616f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f20618h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f20616f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f20618h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f20616f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f20618h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f20617g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f20618h;
        this.f20618h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f20616f + "=" + this.f20618h;
    }

    public n(boolean z6, n nVar, Object obj, n nVar2, n nVar3) {
        this.f20611a = nVar;
        this.f20616f = obj;
        this.f20617g = z6;
        this.i = 1;
        this.f20614d = nVar2;
        this.f20615e = nVar3;
        nVar3.f20614d = this;
        nVar2.f20615e = this;
    }
}
