package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pu extends x40 {
    @Override // defpackage.ba
    public final Object f(w40 w40Var, float f) {
        return Float.valueOf(m(w40Var, f));
    }

    public final float l() {
        return m(this.c.e(), c());
    }

    public final float m(w40 w40Var, float f) {
        float f2;
        Object obj = w40Var.b;
        Object obj2 = w40Var.b;
        if (obj == null || w40Var.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        vq2 vq2Var = this.e;
        if (vq2Var != null) {
            f2 = f;
            Float f3 = (Float) vq2Var.j(w40Var.g, w40Var.h.floatValue(), (Float) obj2, (Float) w40Var.c, f2, d(), this.d);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        if (w40Var.i == -3987645.8f) {
            w40Var.i = ((Float) obj2).floatValue();
        }
        float f4 = w40Var.i;
        if (w40Var.j == -3987645.8f) {
            w40Var.j = ((Float) w40Var.c).floatValue();
        }
        return te0.f(f4, w40Var.j, f2);
    }
}
