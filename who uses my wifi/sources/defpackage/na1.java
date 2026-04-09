package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class na1 {
    public String a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na1)) {
            return false;
        }
        na1 na1Var = (na1) obj;
        if (this.b != na1Var.b) {
            return false;
        }
        return this.a.equals(na1Var.a);
    }

    public final int hashCode() {
        return ex0.s(this.b) + (this.a.hashCode() * 31);
    }
}
