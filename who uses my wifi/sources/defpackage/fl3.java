package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fl3 extends jq0 {
    public final Object f;

    public fl3(Object obj) {
        this.f = obj;
    }

    @Override // defpackage.jq0
    public final Object b() {
        return this.f;
    }

    @Override // defpackage.jq0
    public final jq0 c(zk3 zk3Var) {
        Object objApply = zk3Var.apply(this.f);
        zt0.d0(objApply, "the Function passed to Optional.transform() must not return null.");
        return new fl3(objApply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fl3) {
            return this.f.equals(((fl3) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.f.toString();
        return ex0.l(new StringBuilder(string.length() + 13), "Optional.of(", string, ")");
    }
}
