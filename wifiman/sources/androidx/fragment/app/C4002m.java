package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4002m {

    /* renamed from: a, reason: collision with root package name */
    private final o f31461a;

    private C4002m(o oVar) {
        this.f31461a = oVar;
    }

    public static C4002m b(o oVar) {
        return new C4002m((o) E1.h.h(oVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        o oVar = this.f31461a;
        oVar.f31467e.k(oVar, oVar, fragment);
    }

    public void c() {
        this.f31461a.f31467e.v();
    }

    public boolean d(MenuItem menuItem) {
        return this.f31461a.f31467e.y(menuItem);
    }

    public void e() {
        this.f31461a.f31467e.z();
    }

    public void f() {
        this.f31461a.f31467e.B();
    }

    public void g() {
        this.f31461a.f31467e.K();
    }

    public void h() {
        this.f31461a.f31467e.O();
    }

    public void i() {
        this.f31461a.f31467e.P();
    }

    public void j() {
        this.f31461a.f31467e.R();
    }

    public boolean k() {
        return this.f31461a.f31467e.Y(true);
    }

    public w l() {
        return this.f31461a.f31467e;
    }

    public void m() {
        this.f31461a.f31467e.T0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f31461a.f31467e.s0().onCreateView(view, str, context, attributeSet);
    }
}
