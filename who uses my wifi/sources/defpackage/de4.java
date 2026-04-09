package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class de4 {
    public static final de4 d = new k51().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ de4(k51 k51Var) {
        this.a = k51Var.a;
        this.b = k51Var.b;
        this.c = k51Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || de4.class != obj.getClass()) {
            return false;
        }
        de4 de4Var = (de4) obj;
        return this.a == de4Var.a && this.b == de4Var.b && this.c == de4Var.c;
    }

    public final int hashCode() {
        int i = (this.a ? 1 : 0) << 2;
        boolean z = this.b;
        return (z ? 1 : 0) + (z ? 1 : 0) + i + (this.c ? 1 : 0);
    }
}
