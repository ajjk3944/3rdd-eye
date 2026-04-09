package h;

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
public final class G extends m.a implements InterfaceC2675i {

    /* renamed from: c, reason: collision with root package name */
    public final Context f20275c;

    /* renamed from: d, reason: collision with root package name */
    public final MenuC2677k f20276d;

    /* renamed from: e, reason: collision with root package name */
    public C2351a f20277e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f20278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ H f20279g;

    public G(H h6, Context context, C2351a c2351a) {
        this.f20279g = h6;
        this.f20275c = context;
        this.f20277e = c2351a;
        MenuC2677k menuC2677k = new MenuC2677k(context);
        menuC2677k.f22086l = 1;
        this.f20276d = menuC2677k;
        menuC2677k.f22080e = this;
    }

    @Override // m.a
    public final void a() {
        H h6 = this.f20279g;
        if (h6.f20290j != this) {
            return;
        }
        if (h6.f20297q) {
            h6.f20291k = this;
            h6.f20292l = this.f20277e;
        } else {
            this.f20277e.L(this);
        }
        this.f20277e = null;
        h6.d0(false);
        ActionBarContextView actionBarContextView = h6.f20288g;
        if (actionBarContextView.f4811k == null) {
            actionBarContextView.e();
        }
        h6.f20285d.setHideOnContentScrollEnabled(h6.f20302v);
        h6.f20290j = null;
    }

    @Override // m.a
    public final View b() {
        WeakReference weakReference = this.f20278f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // m.a
    public final MenuC2677k c() {
        return this.f20276d;
    }

    @Override // m.a
    public final MenuInflater d() {
        return new m.h(this.f20275c);
    }

    @Override // m.a
    public final CharSequence e() {
        return this.f20279g.f20288g.getSubtitle();
    }

    @Override // n.InterfaceC2675i
    public final boolean f(MenuC2677k menuC2677k, MenuItem menuItem) {
        C2351a c2351a = this.f20277e;
        if (c2351a != null) {
            return ((c1.g) c2351a.f20441b).z(this, menuItem);
        }
        return false;
    }

    @Override // m.a
    public final CharSequence g() {
        return this.f20279g.f20288g.getTitle();
    }

    @Override // m.a
    public final void h() {
        if (this.f20279g.f20290j != this) {
            return;
        }
        MenuC2677k menuC2677k = this.f20276d;
        menuC2677k.y();
        try {
            this.f20277e.M(this, menuC2677k);
        } finally {
            menuC2677k.x();
        }
    }

    @Override // m.a
    public final boolean i() {
        return this.f20279g.f20288g.f4800G;
    }

    @Override // m.a
    public final void j(View view) {
        this.f20279g.f20288g.setCustomView(view);
        this.f20278f = new WeakReference(view);
    }

    @Override // m.a
    public final void k(int i) {
        l(this.f20279g.f20282a.getResources().getString(i));
    }

    @Override // m.a
    public final void l(CharSequence charSequence) {
        this.f20279g.f20288g.setSubtitle(charSequence);
    }

    @Override // m.a
    public final void m(int i) {
        n(this.f20279g.f20282a.getResources().getString(i));
    }

    @Override // m.a
    public final void n(CharSequence charSequence) {
        this.f20279g.f20288g.setTitle(charSequence);
    }

    @Override // n.InterfaceC2675i
    public final void o(MenuC2677k menuC2677k) {
        if (this.f20277e == null) {
            return;
        }
        h();
        C2723l c2723l = this.f20279g.f20288g.f4805d;
        if (c2723l != null) {
            c2723l.n();
        }
    }

    @Override // m.a
    public final void p(boolean z6) {
        this.f21866b = z6;
        this.f20279g.f20288g.setTitleOptional(z6);
    }
}
