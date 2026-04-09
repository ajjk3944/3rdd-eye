package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d30 extends b30 {
    public static final d30 i = new d30(1, 0, 1);

    @Override // defpackage.b30
    public final boolean equals(Object obj) {
        if (!(obj instanceof d30)) {
            return false;
        }
        if (isEmpty() && ((d30) obj).isEmpty()) {
            return true;
        }
        d30 d30Var = (d30) obj;
        return this.f == d30Var.f && this.g == d30Var.g;
    }

    @Override // defpackage.b30
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f * 31) + this.g;
    }

    @Override // defpackage.b30
    public final boolean isEmpty() {
        return this.f > this.g;
    }

    @Override // defpackage.b30
    public final String toString() {
        return this.f + ".." + this.g;
    }
}
