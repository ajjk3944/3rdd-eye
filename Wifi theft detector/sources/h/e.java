package h;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.widget.ActionBarContextView;
import h.b;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements d.a {

    /* renamed from: c, reason: collision with root package name */
    public Context f21320c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f21321d;

    /* renamed from: e, reason: collision with root package name */
    public b.a f21322e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f21323f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21324g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21325h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.appcompat.view.menu.d f21326i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f21320c = context;
        this.f21321d = actionBarContextView;
        this.f21322e = aVar;
        androidx.appcompat.view.menu.d dVarX = new androidx.appcompat.view.menu.d(actionBarContextView.getContext()).X(1);
        this.f21326i = dVarX;
        dVarX.W(this);
        this.f21325h = z10;
    }

    @Override // androidx.appcompat.view.menu.d.a
    public boolean a(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
        return this.f21322e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.d.a
    public void b(androidx.appcompat.view.menu.d dVar) {
        k();
        this.f21321d.l();
    }

    @Override // h.b
    public void c() {
        if (this.f21324g) {
            return;
        }
        this.f21324g = true;
        this.f21322e.d(this);
    }

    @Override // h.b
    public View d() {
        WeakReference weakReference = this.f21323f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // h.b
    public Menu e() {
        return this.f21326i;
    }

    @Override // h.b
    public MenuInflater f() {
        return new g(this.f21321d.getContext());
    }

    @Override // h.b
    public CharSequence g() {
        return this.f21321d.getSubtitle();
    }

    @Override // h.b
    public CharSequence i() {
        return this.f21321d.getTitle();
    }

    @Override // h.b
    public void k() {
        this.f21322e.b(this, this.f21326i);
    }

    @Override // h.b
    public boolean l() {
        return this.f21321d.j();
    }

    @Override // h.b
    public void m(View view) {
        this.f21321d.setCustomView(view);
        this.f21323f = view != null ? new WeakReference(view) : null;
    }

    @Override // h.b
    public void n(int i10) {
        o(this.f21320c.getString(i10));
    }

    @Override // h.b
    public void o(CharSequence charSequence) {
        this.f21321d.setSubtitle(charSequence);
    }

    @Override // h.b
    public void q(int i10) {
        r(this.f21320c.getString(i10));
    }

    @Override // h.b
    public void r(CharSequence charSequence) {
        this.f21321d.setTitle(charSequence);
    }

    @Override // h.b
    public void s(boolean z10) {
        super.s(z10);
        this.f21321d.setTitleOptional(z10);
    }
}
