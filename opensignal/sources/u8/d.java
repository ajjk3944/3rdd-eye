package u8;

import android.view.animation.Interpolator;
import ee.z;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: c, reason: collision with root package name */
    public final b f23449c;

    /* renamed from: e, reason: collision with root package name */
    public bm.e f23451e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f23447a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f23448b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f23450d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public Object f23452f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f23453g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f23454h = -1.0f;

    public d(List list) {
        b zVar;
        if (list.isEmpty()) {
            zVar = new sm.f(26);
        } else {
            zVar = list.size() == 1 ? new z(list) : new c(list);
        }
        this.f23449c = zVar;
    }

    public final void a(a aVar) {
        this.f23447a.add(aVar);
    }

    public final f9.a b() {
        r8.a aVar = r8.d.f21312a;
        return this.f23449c.j();
    }

    public float c() {
        if (this.f23454h == -1.0f) {
            this.f23454h = this.f23449c.v();
        }
        return this.f23454h;
    }

    public final float d() {
        Interpolator interpolator;
        f9.a aVarB = b();
        if (aVarB == null || aVarB.c() || (interpolator = aVarB.f8707d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    public final float e() {
        if (this.f23448b) {
            return 0.0f;
        }
        f9.a aVarB = b();
        if (aVarB.c()) {
            return 0.0f;
        }
        return (this.f23450d - aVarB.b()) / (aVarB.a() - aVarB.b());
    }

    public Object f() {
        float fE = e();
        if (this.f23451e == null && this.f23449c.i(fE) && !l()) {
            return this.f23452f;
        }
        f9.a aVarB = b();
        Interpolator interpolator = aVarB.f8708e;
        Interpolator interpolator2 = aVarB.f8709f;
        Object objG = (interpolator == null || interpolator2 == null) ? g(aVarB, d()) : h(aVarB, fE, interpolator.getInterpolation(fE), interpolator2.getInterpolation(fE));
        this.f23452f = objG;
        return objG;
    }

    public abstract Object g(f9.a aVar, float f10);

    public Object h(f9.a aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        r8.a aVar = r8.d.f21312a;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23447a;
            if (i10 >= arrayList.size()) {
                r8.a aVar2 = r8.d.f21312a;
                return;
            } else {
                ((a) arrayList.get(i10)).a();
                i10++;
            }
        }
    }

    public void j(float f10) {
        r8.a aVar = r8.d.f21312a;
        b bVar = this.f23449c;
        if (bVar.isEmpty()) {
            return;
        }
        if (this.f23453g == -1.0f) {
            this.f23453g = bVar.y();
        }
        float f11 = this.f23453g;
        if (f10 < f11) {
            if (f11 == -1.0f) {
                this.f23453g = bVar.y();
            }
            f10 = this.f23453g;
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f23450d) {
            return;
        }
        this.f23450d = f10;
        if (bVar.m(f10)) {
            i();
        }
    }

    public final void k(bm.e eVar) {
        bm.e eVar2 = this.f23451e;
        if (eVar2 != null) {
            eVar2.getClass();
        }
        this.f23451e = eVar;
    }

    public boolean l() {
        return false;
    }
}
