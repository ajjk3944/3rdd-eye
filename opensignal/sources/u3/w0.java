package u3;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class w0 extends y0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f23231c;

    public w0() {
        this.f23231c = l5.t.i();
    }

    @Override // u3.y0
    public h1 b() {
        a();
        h1 h1VarG = h1.g(null, this.f23231c.build());
        h1VarG.f23176a.q(this.f23236b);
        return h1VarG;
    }

    @Override // u3.y0
    public void d(k3.d dVar) {
        this.f23231c.setMandatorySystemGestureInsets(dVar.d());
    }

    @Override // u3.y0
    public void e(k3.d dVar) {
        this.f23231c.setStableInsets(dVar.d());
    }

    @Override // u3.y0
    public void f(k3.d dVar) {
        this.f23231c.setSystemGestureInsets(dVar.d());
    }

    @Override // u3.y0
    public void g(k3.d dVar) {
        this.f23231c.setSystemWindowInsets(dVar.d());
    }

    @Override // u3.y0
    public void h(k3.d dVar) {
        this.f23231c.setTappableElementInsets(dVar.d());
    }

    public w0(h1 h1Var) {
        WindowInsets.Builder builderI;
        super(h1Var);
        WindowInsets windowInsetsF = h1Var.f();
        if (windowInsetsF != null) {
            builderI = l5.t.j(windowInsetsF);
        } else {
            builderI = l5.t.i();
        }
        this.f23231c = builderI;
    }
}
