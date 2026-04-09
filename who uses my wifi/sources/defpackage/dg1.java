package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dg1 {
    public static final dg1 c = new dg1(0, 0);
    public final long a;
    public final long b;

    public dg1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dg1.class == obj.getClass()) {
            dg1 dg1Var = (dg1) obj;
            if (this.a == dg1Var.a && this.b == dg1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        long j = this.a;
        int length = String.valueOf(j).length();
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j2).length() + 1);
        ex0.p(sb, "[timeUs=", j, ", position=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
