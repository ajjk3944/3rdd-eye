package i7;

import a0.b0;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: c, reason: collision with root package name */
    public final c f25874c;

    /* renamed from: e, reason: collision with root package name */
    public km.o f25876e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f25872a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f25873b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f25875d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public Object f25877f = null;
    public float g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f25878h = -1.0f;

    public e(List list) {
        c b0Var;
        if (list.isEmpty()) {
            b0Var = new b();
        } else {
            b0Var = list.size() == 1 ? new b0(list) : new d(list);
        }
        this.f25874c = b0Var;
    }

    public final void a(a aVar) {
        this.f25872a.add(aVar);
    }

    public float b() {
        if (this.f25878h == -1.0f) {
            this.f25878h = this.f25874c.t();
        }
        return this.f25878h;
    }

    public final float c() {
        Interpolator interpolator;
        s7.a aVarK = this.f25874c.k();
        if (aVarK == null || aVarK.c() || (interpolator = aVarK.f33486d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.f25873b) {
            return 0.0f;
        }
        s7.a aVarK = this.f25874c.k();
        if (aVarK.c()) {
            return 0.0f;
        }
        return (this.f25875d - aVarK.b()) / (aVarK.a() - aVarK.b());
    }

    public Object e() {
        float fD = d();
        km.o oVar = this.f25876e;
        c cVar = this.f25874c;
        if (oVar == null && cVar.g(fD) && !k()) {
            return this.f25877f;
        }
        s7.a aVarK = cVar.k();
        Interpolator interpolator = aVarK.f33487e;
        Interpolator interpolator2 = aVarK.f33488f;
        Object objF = (interpolator == null || interpolator2 == null) ? f(aVarK, c()) : g(aVarK, fD, interpolator.getInterpolation(fD), interpolator2.getInterpolation(fD));
        this.f25877f = objF;
        return objF;
    }

    public abstract Object f(s7.a aVar, float f10);

    public Object g(s7.a aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f25872a;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i4)).a();
            i4++;
        }
    }

    public void i(float f10) {
        c cVar = this.f25874c;
        if (cVar.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = cVar.v();
        }
        float f11 = this.g;
        if (f10 < f11) {
            if (f11 == -1.0f) {
                this.g = cVar.v();
            }
            f10 = this.g;
        } else if (f10 > b()) {
            f10 = b();
        }
        if (f10 == this.f25875d) {
            return;
        }
        this.f25875d = f10;
        if (cVar.o(f10)) {
            h();
        }
    }

    public final void j(km.o oVar) {
        km.o oVar2 = this.f25876e;
        if (oVar2 != null) {
            oVar2.getClass();
        }
        this.f25876e = oVar;
    }

    public boolean k() {
        return false;
    }
}
