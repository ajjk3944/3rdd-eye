package r;

import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21100a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21101d;

    /* renamed from: g, reason: collision with root package name */
    public c f21102g;

    /* renamed from: r, reason: collision with root package name */
    public c f21103r;

    public c(Object obj, Object obj2) {
        this.f21100a = obj;
        this.f21101d = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f21100a.equals(cVar.f21100a) && this.f21101d.equals(cVar.f21101d);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f21100a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21101d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f21100a.hashCode() ^ this.f21101d.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f21100a + "=" + this.f21101d;
    }
}
