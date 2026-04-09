package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n50 {
    public final String a;
    public final String b;
    public final o50 c;

    public n50(String str, String str2, o50 o50Var) {
        i30.n(o50Var, "license");
        this.a = str;
        this.b = str2;
        this.c = o50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n50)) {
            return false;
        }
        n50 n50Var = (n50) obj;
        return i30.c(this.a, n50Var.a) && i30.c(this.b, n50Var.b) && i30.c(this.c, n50Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        o50 o50Var = this.c;
        return iHashCode2 + (o50Var != null ? o50Var.hashCode() : 0);
    }

    public final String toString() {
        return "Library(title=" + this.a + ", url=" + this.b + ", license=" + this.c + ")";
    }
}
