package n;

import a0.x0;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends a implements o.k {

    /* renamed from: d, reason: collision with root package name */
    public Context f29447d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContextView f29448e;

    /* renamed from: f, reason: collision with root package name */
    public yb.i f29449f;
    public WeakReference g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29450h;

    /* renamed from: i, reason: collision with root package name */
    public o.m f29451i;

    @Override // n.a
    public final void d() {
        if (this.f29450h) {
            return;
        }
        this.f29450h = true;
        this.f29449f.K(this);
    }

    @Override // n.a
    public final View e() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // o.k
    public final boolean f(o.m mVar, MenuItem menuItem) {
        return ((x0) this.f29449f.f37516b).G(this, menuItem);
    }

    @Override // n.a
    public final o.m g() {
        return this.f29451i;
    }

    @Override // n.a
    public final MenuInflater h() {
        return new h(this.f29448e.getContext());
    }

    @Override // n.a
    public final CharSequence i() {
        return this.f29448e.getSubtitle();
    }

    @Override // n.a
    public final CharSequence j() {
        return this.f29448e.getTitle();
    }

    @Override // n.a
    public final void k() {
        this.f29449f.M(this, this.f29451i);
    }

    @Override // n.a
    public final boolean l() {
        return this.f29448e.f719s;
    }

    @Override // n.a
    public final void m(View view) {
        this.f29448e.setCustomView(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // n.a
    public final void n(int i4) {
        o(this.f29447d.getString(i4));
    }

    @Override // n.a
    public final void o(CharSequence charSequence) {
        this.f29448e.setSubtitle(charSequence);
    }

    @Override // n.a
    public final void p(int i4) {
        q(this.f29447d.getString(i4));
    }

    @Override // n.a
    public final void q(CharSequence charSequence) {
        this.f29448e.setTitle(charSequence);
    }

    @Override // n.a
    public final void r(boolean z3) {
        this.f29439b = z3;
        this.f29448e.setTitleOptional(z3);
    }

    @Override // o.k
    public final void s(o.m mVar) {
        k();
        p.k kVar = this.f29448e.f706d;
        if (kVar != null) {
            kVar.l();
        }
    }
}
