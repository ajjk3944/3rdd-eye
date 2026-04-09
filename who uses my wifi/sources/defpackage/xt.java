package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xt extends mi0 {
    public static final ni0 i;
    public float g = 0.0f;
    public float h = 0.0f;

    static {
        ni0 ni0VarA = ni0.a(256, new xt());
        i = ni0VarA;
        ni0VarA.f = 0.5f;
    }

    @Override // defpackage.mi0
    public final mi0 a() {
        return new xt();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof xt) {
            xt xtVar = (xt) obj;
            if (this.g == xtVar.g && this.h == xtVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.g) ^ Float.floatToIntBits(this.h);
    }

    public final String toString() {
        return this.g + "x" + this.h;
    }
}
