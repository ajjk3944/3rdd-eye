package h7;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f9994a;

    /* renamed from: b, reason: collision with root package name */
    public int f9995b;

    /* renamed from: c, reason: collision with root package name */
    public int f9996c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i10 = this.f9994a;
            if (i10 != aVar.f9994a) {
                return false;
            }
            if (i10 != 8 || Math.abs(this.f9996c - this.f9995b) != 1 || this.f9996c != aVar.f9995b || this.f9995b != aVar.f9996c) {
                return this.f9996c == aVar.f9996c && this.f9995b == aVar.f9995b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f9994a * 31) + this.f9995b) * 31) + this.f9996c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i10 = this.f9994a;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb2.append(",s:");
        sb2.append(this.f9995b);
        sb2.append("c:");
        return h0.b.i(this.f9996c, ",p:null]", sb2);
    }
}
