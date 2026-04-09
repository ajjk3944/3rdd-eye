package R;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class c0 extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f3310c;

    public c0() {
        this.f3310c = C4.a.g();
    }

    @Override // R.f0
    public r0 b() {
        a();
        r0 r0VarG = r0.g(null, this.f3310c.build());
        r0VarG.f3359a.o(this.f3319b);
        return r0VarG;
    }

    @Override // R.f0
    public void d(J.c cVar) {
        this.f3310c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // R.f0
    public void e(J.c cVar) {
        this.f3310c.setStableInsets(cVar.d());
    }

    @Override // R.f0
    public void f(J.c cVar) {
        this.f3310c.setSystemGestureInsets(cVar.d());
    }

    @Override // R.f0
    public void g(J.c cVar) {
        this.f3310c.setSystemWindowInsets(cVar.d());
    }

    @Override // R.f0
    public void h(J.c cVar) {
        this.f3310c.setTappableElementInsets(cVar.d());
    }

    public c0(r0 r0Var) {
        WindowInsets.Builder builderG;
        super(r0Var);
        WindowInsets windowInsetsF = r0Var.f();
        if (windowInsetsF != null) {
            builderG = C4.a.h(windowInsetsF);
        } else {
            builderG = C4.a.g();
        }
        this.f3310c = builderG;
    }
}
