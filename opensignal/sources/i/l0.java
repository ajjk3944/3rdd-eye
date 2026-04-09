package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class l0 extends n.a implements o.k {
    public WeakReference B;
    public final /* synthetic */ m0 D;

    /* renamed from: r, reason: collision with root package name */
    public final Context f11070r;

    /* renamed from: x, reason: collision with root package name */
    public final o.m f11071x;

    /* renamed from: y, reason: collision with root package name */
    public io.sentry.internal.debugmeta.c f11072y;

    public l0(m0 m0Var, Context context, io.sentry.internal.debugmeta.c cVar) {
        this.D = m0Var;
        this.f11070r = context;
        this.f11072y = cVar;
        o.m mVar = new o.m(context);
        mVar.f18622l = 1;
        this.f11071x = mVar;
        mVar.f18617e = this;
    }

    @Override // o.k
    public final void A(o.m mVar) {
        if (this.f11072y == null) {
            return;
        }
        i();
        androidx.appcompat.widget.b bVar = this.D.f11078h.f942r;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // n.a
    public final void b() {
        m0 m0Var = this.D;
        if (m0Var.k != this) {
            return;
        }
        if (m0Var.f11086r) {
            m0Var.f11080l = this;
            m0Var.f11081m = this.f11072y;
        } else {
            this.f11072y.w(this);
        }
        this.f11072y = null;
        m0Var.f0(false);
        ActionBarContextView actionBarContextView = m0Var.f11078h;
        if (actionBarContextView.G == null) {
            actionBarContextView.e();
        }
        m0Var.f11075e.setHideOnContentScrollEnabled(m0Var.f11091w);
        m0Var.k = null;
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
        return this.f11071x;
    }

    @Override // n.a
    public final MenuInflater f() {
        return new n.h(this.f11070r);
    }

    @Override // n.a
    public final CharSequence g() {
        return this.D.f11078h.getSubtitle();
    }

    @Override // n.a
    public final CharSequence h() {
        return this.D.f11078h.getTitle();
    }

    @Override // n.a
    public final void i() {
        if (this.D.k != this) {
            return;
        }
        o.m mVar = this.f11071x;
        mVar.w();
        try {
            this.f11072y.y(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // n.a
    public final boolean j() {
        return this.D.f11078h.O;
    }

    @Override // n.a
    public final void l(View view) {
        this.D.f11078h.setCustomView(view);
        this.B = new WeakReference(view);
    }

    @Override // n.a
    public final void m(int i10) {
        o(this.D.f11073c.getResources().getString(i10));
    }

    @Override // o.k
    public final boolean n(o.m mVar, MenuItem menuItem) {
        io.sentry.internal.debugmeta.c cVar = this.f11072y;
        if (cVar != null) {
            return ((js.e) cVar.f12353d).l0(this, menuItem);
        }
        return false;
    }

    @Override // n.a
    public final void o(CharSequence charSequence) {
        this.D.f11078h.setSubtitle(charSequence);
    }

    @Override // n.a
    public final void p(int i10) {
        q(this.D.f11073c.getResources().getString(i10));
    }

    @Override // n.a
    public final void q(CharSequence charSequence) {
        this.D.f11078h.setTitle(charSequence);
    }

    @Override // n.a
    public final void r(boolean z10) {
        this.f17071d = z10;
        this.D.f11078h.setTitleOptional(z10);
    }
}
