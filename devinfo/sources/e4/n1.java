package e4;

import android.view.WindowInsets;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class n1 extends r1 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f22379c;

    public n1() {
        this.f22379c = c0.f1.d();
    }

    @Override // e4.r1
    public c2 b() {
        a();
        c2 c2VarH = c2.h(null, this.f22379c.build());
        c2VarH.f22315a.r(this.f22386b);
        return c2VarH;
    }

    @Override // e4.r1
    public void d(v3.b bVar) {
        this.f22379c.setMandatorySystemGestureInsets(bVar.e());
    }

    @Override // e4.r1
    public void e(v3.b bVar) {
        this.f22379c.setStableInsets(bVar.e());
    }

    @Override // e4.r1
    public void f(v3.b bVar) {
        this.f22379c.setSystemGestureInsets(bVar.e());
    }

    @Override // e4.r1
    public void g(v3.b bVar) {
        this.f22379c.setSystemWindowInsets(bVar.e());
    }

    @Override // e4.r1
    public void h(v3.b bVar) {
        this.f22379c.setTappableElementInsets(bVar.e());
    }

    public n1(c2 c2Var) {
        WindowInsets.Builder builderD;
        super(c2Var);
        WindowInsets windowInsetsG = c2Var.g();
        if (windowInsetsG != null) {
            builderD = c0.f1.e(windowInsetsG);
        } else {
            builderD = c0.f1.d();
        }
        this.f22379c = builderD;
    }
}
