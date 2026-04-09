package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304a {

    /* renamed from: a, reason: collision with root package name */
    public int f5419a;

    /* renamed from: b, reason: collision with root package name */
    public int f5420b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5421c;

    /* renamed from: d, reason: collision with root package name */
    public int f5422d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C0304a)) {
                return false;
            }
            C0304a c0304a = (C0304a) obj;
            int i = this.f5419a;
            if (i != c0304a.f5419a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f5422d - this.f5420b) != 1 || this.f5422d != c0304a.f5420b || this.f5420b != c0304a.f5422d) {
                if (this.f5422d != c0304a.f5422d || this.f5420b != c0304a.f5420b) {
                    return false;
                }
                Object obj2 = this.f5421c;
                if (obj2 != null) {
                    if (!obj2.equals(c0304a.f5421c)) {
                        return false;
                    }
                } else if (c0304a.f5421c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f5419a * 31) + this.f5420b) * 31) + this.f5422d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f5419a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f5420b);
        sb.append("c:");
        sb.append(this.f5422d);
        sb.append(",p:");
        sb.append(this.f5421c);
        sb.append("]");
        return sb.toString();
    }
}
