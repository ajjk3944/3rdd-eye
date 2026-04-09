package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j21 {
    public final long a;
    public final long b;
    public final int c;

    public j21(int i, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j21)) {
            return false;
        }
        j21 j21Var = (j21) obj;
        return this.a == j21Var.a && this.b == j21Var.b && this.c == j21Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((Long.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.a);
        sb.append(", ModelVersion=");
        sb.append(this.b);
        sb.append(", TopicCode=");
        return "Topic { " + ex0.i(sb, this.c, " }");
    }
}
