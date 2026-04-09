package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o53 implements en1 {
    public final long a;
    public final long b;
    public final long c;

    public o53(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o53)) {
            return false;
        }
        o53 o53Var = (o53) obj;
        return this.a == o53Var.a && this.b == o53Var.b && this.c == o53Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((Long.hashCode(this.b) + ((Long.hashCode(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        long j = this.a;
        int length = String.valueOf(j).length();
        long j2 = this.b;
        int length2 = String.valueOf(j2).length();
        long j3 = this.c;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j3).length());
        ex0.p(sb, "Mp4Timestamp: creation time=", j, ", modification time=");
        sb.append(j2);
        sb.append(", timescale=");
        sb.append(j3);
        return sb.toString();
    }
}
