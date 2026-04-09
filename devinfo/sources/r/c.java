package r;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f32475a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f32476b;

    /* renamed from: c, reason: collision with root package name */
    public c f32477c;

    /* renamed from: d, reason: collision with root package name */
    public c f32478d;

    public c(Object obj, Object obj2) {
        this.f32475a = obj;
        this.f32476b = obj2;
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
        return this.f32475a.equals(cVar.f32475a) && this.f32476b.equals(cVar.f32476b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f32475a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f32476b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f32475a.hashCode() ^ this.f32476b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f32475a + "=" + this.f32476b;
    }
}
