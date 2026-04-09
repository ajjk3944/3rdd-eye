package q;

import java.util.Map;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2785c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22894a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22895b;

    /* renamed from: c, reason: collision with root package name */
    public C2785c f22896c;

    /* renamed from: d, reason: collision with root package name */
    public C2785c f22897d;

    public C2785c(Object obj, Object obj2) {
        this.f22894a = obj;
        this.f22895b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2785c)) {
            return false;
        }
        C2785c c2785c = (C2785c) obj;
        return this.f22894a.equals(c2785c.f22894a) && this.f22895b.equals(c2785c.f22895b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f22894a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f22895b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f22894a.hashCode() ^ this.f22895b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f22894a + "=" + this.f22895b;
    }
}
