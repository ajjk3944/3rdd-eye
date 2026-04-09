package m;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import h0.C2351a;
import java.lang.ref.WeakReference;
import n.InterfaceC2675i;
import n.MenuC2677k;
import o.C2723l;

/* loaded from: classes.dex */
public final class d extends a implements InterfaceC2675i {

    /* renamed from: c, reason: collision with root package name */
    public Context f21873c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f21874d;

    /* renamed from: e, reason: collision with root package name */
    public C2351a f21875e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f21876f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21877g;

    /* renamed from: h, reason: collision with root package name */
    public MenuC2677k f21878h;

    @Override // m.a
    public final void a() {
        if (this.f21877g) {
            return;
        }
        this.f21877g = true;
        this.f21875e.L(this);
    }

    @Override // m.a
    public final View b() {
        WeakReference weakReference = this.f21876f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // m.a
    public final MenuC2677k c() {
        return this.f21878h;
    }

    @Override // m.a
    public final MenuInflater d() {
        return new h(this.f21874d.getContext());
    }

    @Override // m.a
    public final CharSequence e() {
        return this.f21874d.getSubtitle();
    }

    @Override // n.InterfaceC2675i
    public final boolean f(MenuC2677k menuC2677k, MenuItem menuItem) {
        return ((c1.g) this.f21875e.f20441b).z(this, menuItem);
    }

    @Override // m.a
    public final CharSequence g() {
        return this.f21874d.getTitle();
    }

    @Override // m.a
    public final void h() {
        this.f21875e.M(this, this.f21878h);
    }

    @Override // m.a
    public final boolean i() {
        return this.f21874d.f4800G;
    }

    @Override // m.a
    public final void j(View view) {
        this.f21874d.setCustomView(view);
        this.f21876f = view != null ? new WeakReference(view) : null;
    }

    @Override // m.a
    public final void k(int i) {
        l(this.f21873c.getString(i));
    }

    @Override // m.a
    public final void l(CharSequence charSequence) {
        this.f21874d.setSubtitle(charSequence);
    }

    @Override // m.a
    public final void m(int i) {
        n(this.f21873c.getString(i));
    }

    @Override // m.a
    public final void n(CharSequence charSequence) {
        this.f21874d.setTitle(charSequence);
    }

    @Override // n.InterfaceC2675i
    public final void o(MenuC2677k menuC2677k) {
        h();
        C2723l c2723l = this.f21874d.f4805d;
        if (c2723l != null) {
            c2723l.n();
        }
    }

    @Override // m.a
    public final void p(boolean z6) {
        this.f21866b = z6;
        this.f21874d.setTitleOptional(z6);
    }
}
