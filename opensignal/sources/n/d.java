package n;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d extends a implements o.k {
    public WeakReference B;
    public boolean D;
    public o.m E;

    /* renamed from: r, reason: collision with root package name */
    public Context f17079r;

    /* renamed from: x, reason: collision with root package name */
    public ActionBarContextView f17080x;

    /* renamed from: y, reason: collision with root package name */
    public io.sentry.internal.debugmeta.c f17081y;

    @Override // o.k
    public final void A(o.m mVar) {
        i();
        androidx.appcompat.widget.b bVar = this.f17080x.f942r;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // n.a
    public final void b() {
        if (this.D) {
            return;
        }
        this.D = true;
        this.f17081y.w(this);
    }

    @Override // n.a
    public final View c() {
        WeakReference weakReference = this.B;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // n.a
    public final o.m e() {
        return this.E;
    }

    @Override // n.a
    public final MenuInflater f() {
        return new h(this.f17080x.getContext());
    }

    @Override // n.a
    public final CharSequence g() {
        return this.f17080x.getSubtitle();
    }

    @Override // n.a
    public final CharSequence h() {
        return this.f17080x.getTitle();
    }

    @Override // n.a
    public final void i() {
        this.f17081y.y(this, this.E);
    }

    @Override // n.a
    public final boolean j() {
        return this.f17080x.O;
    }

    @Override // n.a
    public final void l(View view) {
        this.f17080x.setCustomView(view);
        this.B = view != null ? new WeakReference(view) : null;
    }

    @Override // n.a
    public final void m(int i10) {
        o(this.f17079r.getString(i10));
    }

    @Override // o.k
    public final boolean n(o.m mVar, MenuItem menuItem) {
        return ((js.e) this.f17081y.f12353d).l0(this, menuItem);
    }

    @Override // n.a
    public final void o(CharSequence charSequence) {
        this.f17080x.setSubtitle(charSequence);
    }

    @Override // n.a
    public final void p(int i10) {
        q(this.f17079r.getString(i10));
    }

    @Override // n.a
    public final void q(CharSequence charSequence) {
        this.f17080x.setTitle(charSequence);
    }

    @Override // n.a
    public final void r(boolean z10) {
        this.f17071d = z10;
        this.f17080x.setTitleOptional(z10);
    }
}
