package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final l f3332a;

    public j(l lVar) {
        this.f3332a = lVar;
    }

    public static j b(l lVar) {
        return new j((l) r0.i.h(lVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        l lVar = this.f3332a;
        lVar.f3338e.n(lVar, lVar, fragment);
    }

    public void c() {
        this.f3332a.f3338e.y();
    }

    public boolean d(MenuItem menuItem) {
        return this.f3332a.f3338e.B(menuItem);
    }

    public void e() {
        this.f3332a.f3338e.C();
    }

    public void f() {
        this.f3332a.f3338e.E();
    }

    public void g() {
        this.f3332a.f3338e.N();
    }

    public void h() {
        this.f3332a.f3338e.R();
    }

    public void i() {
        this.f3332a.f3338e.S();
    }

    public void j() {
        this.f3332a.f3338e.U();
    }

    public boolean k() {
        return this.f3332a.f3338e.b0(true);
    }

    public FragmentManager l() {
        return this.f3332a.f3338e;
    }

    public void m() {
        this.f3332a.f3338e.U0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3332a.f3338e.w0().onCreateView(view, str, context, attributeSet);
    }
}
