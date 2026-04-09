package androidx.recyclerview.widget;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1289a;

    /* renamed from: b, reason: collision with root package name */
    public int f1290b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1291c;

    /* renamed from: d, reason: collision with root package name */
    public int f1292d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i4 = this.f1289a;
            if (i4 != aVar.f1289a) {
                return false;
            }
            if (i4 != 8 || Math.abs(this.f1292d - this.f1290b) != 1 || this.f1292d != aVar.f1290b || this.f1290b != aVar.f1292d) {
                if (this.f1292d != aVar.f1292d || this.f1290b != aVar.f1290b) {
                    return false;
                }
                Object obj2 = this.f1291c;
                if (obj2 != null) {
                    if (!obj2.equals(aVar.f1291c)) {
                        return false;
                    }
                } else if (aVar.f1291c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f1289a * 31) + this.f1290b) * 31) + this.f1292d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i4 = this.f1289a;
        sb2.append(i4 != 1 ? i4 != 2 ? i4 != 4 ? i4 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb2.append(",s:");
        sb2.append(this.f1290b);
        sb2.append("c:");
        sb2.append(this.f1292d);
        sb2.append(",p:");
        sb2.append(this.f1291c);
        sb2.append("]");
        return sb2.toString();
    }
}
