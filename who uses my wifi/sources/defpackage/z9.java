package defpackage;

import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class z9 implements y9 {
    public final List f;
    public w40 h = null;
    public float i = -1.0f;
    public w40 g = a(0.0f);

    public z9(List list) {
        this.f = list;
    }

    public final w40 a(float f) {
        List list = this.f;
        w40 w40Var = (w40) list.get(list.size() - 1);
        if (f >= w40Var.b()) {
            return w40Var;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            w40 w40Var2 = (w40) list.get(size);
            if (this.g != w40Var2 && f >= w40Var2.b() && f < w40Var2.a()) {
                return w40Var2;
            }
        }
        return (w40) list.get(0);
    }

    @Override // defpackage.y9
    public final float b() {
        return ((w40) this.f.get(r0.size() - 1)).a();
    }

    @Override // defpackage.y9
    public final boolean c(float f) {
        w40 w40Var = this.h;
        w40 w40Var2 = this.g;
        if (w40Var == w40Var2 && this.i == f) {
            return true;
        }
        this.h = w40Var2;
        this.i = f;
        return false;
    }

    @Override // defpackage.y9
    public final float d() {
        return ((w40) this.f.get(0)).b();
    }

    @Override // defpackage.y9
    public final w40 e() {
        return this.g;
    }

    @Override // defpackage.y9
    public final boolean f(float f) {
        w40 w40Var = this.g;
        if (f >= w40Var.b() && f < w40Var.a()) {
            return !this.g.c();
        }
        this.g = a(f);
        return true;
    }

    @Override // defpackage.y9
    public final boolean isEmpty() {
        return false;
    }
}
