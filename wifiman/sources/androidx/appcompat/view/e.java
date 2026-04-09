package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements e.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f26681c;

    /* renamed from: d, reason: collision with root package name */
    private ActionBarContextView f26682d;

    /* renamed from: e, reason: collision with root package name */
    private b.a f26683e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference f26684f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f26685g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26686h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f26687i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f26681c = context;
        this.f26682d = actionBarContextView;
        this.f26683e = aVar;
        androidx.appcompat.view.menu.e eVarT = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).T(1);
        this.f26687i = eVarT;
        eVarT.S(this);
        this.f26686h = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f26683e.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f26682d.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f26685g) {
            return;
        }
        this.f26685g = true;
        this.f26683e.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference weakReference = this.f26684f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f26687i;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f26682d.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f26682d.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f26682d.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f26683e.c(this, this.f26687i);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f26682d.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f26682d.setCustomView(view);
        this.f26684f = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i10) {
        o(this.f26681c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f26682d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i10) {
        r(this.f26681c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f26682d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z10) {
        super.s(z10);
        this.f26682d.setTitleOptional(z10);
    }
}
