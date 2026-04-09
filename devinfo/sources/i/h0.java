package i;

import a0.x0;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h0 extends n.a implements o.k {

    /* renamed from: d, reason: collision with root package name */
    public final Context f25299d;

    /* renamed from: e, reason: collision with root package name */
    public final o.m f25300e;

    /* renamed from: f, reason: collision with root package name */
    public yb.i f25301f;
    public WeakReference g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f25302h;

    public h0(i0 i0Var, Context context, yb.i iVar) {
        this.f25302h = i0Var;
        this.f25299d = context;
        this.f25301f = iVar;
        o.m mVar = new o.m(context);
        mVar.f30247l = 1;
        this.f25300e = mVar;
        mVar.f30242e = this;
    }

    @Override // n.a
    public final void d() {
        i0 i0Var = this.f25302h;
        if (i0Var.f25312k != this) {
            return;
        }
        boolean z3 = i0Var.f25319r;
        boolean z10 = i0Var.f25320s;
        if (z3 || z10) {
            i0Var.f25313l = this;
            i0Var.f25314m = this.f25301f;
        } else {
            this.f25301f.K(this);
        }
        this.f25301f = null;
        i0Var.V(false);
        ActionBarContextView actionBarContextView = i0Var.f25310h;
        if (actionBarContextView.f711k == null) {
            actionBarContextView.e();
        }
        i0Var.f25308e.setHideOnContentScrollEnabled(i0Var.f25325x);
        i0Var.f25312k = null;
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
        yb.i iVar = this.f25301f;
        if (iVar != null) {
            return ((x0) iVar.f37516b).G(this, menuItem);
        }
        return false;
    }

    @Override // n.a
    public final o.m g() {
        return this.f25300e;
    }

    @Override // n.a
    public final MenuInflater h() {
        return new n.h(this.f25299d);
    }

    @Override // n.a
    public final CharSequence i() {
        return this.f25302h.f25310h.getSubtitle();
    }

    @Override // n.a
    public final CharSequence j() {
        return this.f25302h.f25310h.getTitle();
    }

    @Override // n.a
    public final void k() {
        if (this.f25302h.f25312k != this) {
            return;
        }
        o.m mVar = this.f25300e;
        mVar.w();
        try {
            this.f25301f.M(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // n.a
    public final boolean l() {
        return this.f25302h.f25310h.f719s;
    }

    @Override // n.a
    public final void m(View view) {
        this.f25302h.f25310h.setCustomView(view);
        this.g = new WeakReference(view);
    }

    @Override // n.a
    public final void n(int i4) {
        o(this.f25302h.f25305b.getResources().getString(i4));
    }

    @Override // n.a
    public final void o(CharSequence charSequence) {
        this.f25302h.f25310h.setSubtitle(charSequence);
    }

    @Override // n.a
    public final void p(int i4) {
        q(this.f25302h.f25305b.getResources().getString(i4));
    }

    @Override // n.a
    public final void q(CharSequence charSequence) {
        this.f25302h.f25310h.setTitle(charSequence);
    }

    @Override // n.a
    public final void r(boolean z3) {
        this.f29439b = z3;
        this.f25302h.f25310h.setTitleOptional(z3);
    }

    @Override // o.k
    public final void s(o.m mVar) {
        if (this.f25301f == null) {
            return;
        }
        k();
        p.k kVar = this.f25302h.f25310h.f706d;
        if (kVar != null) {
            kVar.l();
        }
    }
}
