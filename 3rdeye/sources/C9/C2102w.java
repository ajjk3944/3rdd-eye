package c9;

/* compiled from: IndexedValue.kt */
/* renamed from: c9.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2102w<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f18584a;

    /* renamed from: b, reason: collision with root package name */
    public final T f18585b;

    public C2102w(int i, T t10) {
        this.f18584a = i;
        this.f18585b = t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2102w)) {
            return false;
        }
        C2102w c2102w = (C2102w) obj;
        return this.f18584a == c2102w.f18584a && kotlin.jvm.internal.l.b(this.f18585b, c2102w.f18585b);
    }

    public final int hashCode() {
        int i = this.f18584a * 31;
        T t10 = this.f18585b;
        return i + (t10 == null ? 0 : t10.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f18584a + ", value=" + this.f18585b + ')';
    }
}
