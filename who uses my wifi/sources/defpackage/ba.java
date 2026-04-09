package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ba {
    public final y9 c;
    public vq2 e;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public Object f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public ba(List list) {
        y9 aaVar;
        if (list.isEmpty()) {
            aaVar = new pz(13);
        } else {
            aaVar = list.size() == 1 ? new aa(list) : new z9(list);
        }
        this.c = aaVar;
    }

    public final void a(x9 x9Var) {
        this.a.add(x9Var);
    }

    public float b() {
        if (this.h == -1.0f) {
            this.h = this.c.b();
        }
        return this.h;
    }

    public final float c() {
        Interpolator interpolator;
        w40 w40VarE = this.c.e();
        if (w40VarE == null || w40VarE.c() || (interpolator = w40VarE.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.b) {
            return 0.0f;
        }
        w40 w40VarE = this.c.e();
        if (w40VarE.c()) {
            return 0.0f;
        }
        return (this.d - w40VarE.b()) / (w40VarE.a() - w40VarE.b());
    }

    public Object e() {
        float fD = d();
        vq2 vq2Var = this.e;
        y9 y9Var = this.c;
        if (vq2Var == null && y9Var.c(fD) && !k()) {
            return this.f;
        }
        w40 w40VarE = y9Var.e();
        Interpolator interpolator = w40VarE.e;
        Interpolator interpolator2 = w40VarE.f;
        Object objF = (interpolator == null || interpolator2 == null) ? f(w40VarE, c()) : g(w40VarE, fD, interpolator.getInterpolation(fD), interpolator2.getInterpolation(fD));
        this.f = objF;
        return objF;
    }

    public abstract Object f(w40 w40Var, float f);

    public Object g(w40 w40Var, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((x9) arrayList.get(i)).c();
            i++;
        }
    }

    public void i(float f) {
        y9 y9Var = this.c;
        if (y9Var.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = y9Var.d();
        }
        float f2 = this.g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.g = y9Var.d();
            }
            f = this.g;
        } else if (f > b()) {
            f = b();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (y9Var.f(f)) {
            h();
        }
    }

    public final void j(vq2 vq2Var) {
        vq2 vq2Var2 = this.e;
        if (vq2Var2 != null) {
            vq2Var2.getClass();
        }
        this.e = vq2Var;
    }

    public boolean k() {
        return false;
    }
}
