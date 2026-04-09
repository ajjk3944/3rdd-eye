package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final g<?> f1607a;

    private e(g<?> gVar) {
        this.f1607a = gVar;
    }

    public static e b(g<?> gVar) {
        return new e((g) z.g.c(gVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        g<?> gVar = this.f1607a;
        gVar.f1613f.m(gVar, gVar, fragment);
    }

    public void c() {
        this.f1607a.f1613f.v();
    }

    public void d(Configuration configuration) {
        this.f1607a.f1613f.w(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f1607a.f1613f.x(menuItem);
    }

    public void f() {
        this.f1607a.f1613f.y();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f1607a.f1613f.z(menu, menuInflater);
    }

    public void h() {
        this.f1607a.f1613f.A();
    }

    public void i() {
        this.f1607a.f1613f.C();
    }

    public void j(boolean z2) {
        this.f1607a.f1613f.D(z2);
    }

    public boolean k(MenuItem menuItem) {
        return this.f1607a.f1613f.S(menuItem);
    }

    public void l(Menu menu) {
        this.f1607a.f1613f.T(menu);
    }

    public void m() {
        this.f1607a.f1613f.V();
    }

    public void n(boolean z2) {
        this.f1607a.f1613f.W(z2);
    }

    public boolean o(Menu menu) {
        return this.f1607a.f1613f.X(menu);
    }

    public void p() {
        this.f1607a.f1613f.Z();
    }

    public void q() {
        this.f1607a.f1613f.a0();
    }

    public void r() {
        this.f1607a.f1613f.c0();
    }

    public boolean s() {
        return this.f1607a.f1613f.h0();
    }

    public Fragment t(String str) {
        return this.f1607a.f1613f.n0(str);
    }

    public h u() {
        return this.f1607a.f1613f;
    }

    public void v() {
        this.f1607a.f1613f.P0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1607a.f1613f.onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        g<?> gVar = this.f1607a;
        if (!(gVar instanceof androidx.lifecycle.s)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        gVar.f1613f.Z0(parcelable);
    }

    public Parcelable y() {
        return this.f1607a.f1613f.b1();
    }
}
