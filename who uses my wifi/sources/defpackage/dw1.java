package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dw1 {
    public final long a;
    public final String b;
    public final int c;

    public dw1(int i, long j, String str) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dw1)) {
            return false;
        }
        dw1 dw1Var = (dw1) obj;
        return dw1Var.a == this.a && dw1Var.c == this.c;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
