package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s81 extends c2 implements md0 {
    public final Context h;
    public final od0 i;
    public vq2 j;
    public WeakReference k;
    public final /* synthetic */ t81 l;

    public s81(t81 t81Var, Context context, vq2 vq2Var) {
        this.l = t81Var;
        this.h = context;
        this.j = vq2Var;
        od0 od0Var = new od0(context);
        od0Var.l = 1;
        this.i = od0Var;
        od0Var.e = this;
    }

    @Override // defpackage.c2
    public final void a() {
        t81 t81Var = this.l;
        if (t81Var.o != this) {
            return;
        }
        if (t81Var.v) {
            t81Var.p = this;
            t81Var.q = this.j;
        } else {
            this.j.n(this);
        }
        this.j = null;
        t81Var.i0(false);
        ActionBarContextView actionBarContextView = t81Var.l;
        if (actionBarContextView.p == null) {
            actionBarContextView.e();
        }
        t81Var.i.setHideOnContentScrollEnabled(t81Var.A);
        t81Var.o = null;
    }

    @Override // defpackage.c2
    public final View b() {
        WeakReference weakReference = this.k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.c2
    public final od0 c() {
        return this.i;
    }

    @Override // defpackage.c2
    public final MenuInflater d() {
        return new hz0(this.h);
    }

    @Override // defpackage.c2
    public final CharSequence e() {
        return this.l.l.getSubtitle();
    }

    @Override // defpackage.c2
    public final CharSequence f() {
        return this.l.l.getTitle();
    }

    @Override // defpackage.md0
    public final boolean g(od0 od0Var, MenuItem menuItem) {
        vq2 vq2Var = this.j;
        if (vq2Var != null) {
            return ((p21) vq2Var.g).v(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.c2
    public final void h() {
        if (this.l.o != this) {
            return;
        }
        od0 od0Var = this.i;
        od0Var.w();
        try {
            this.j.o(this, od0Var);
        } finally {
            od0Var.v();
        }
    }

    @Override // defpackage.c2
    public final boolean i() {
        return this.l.l.x;
    }

    @Override // defpackage.c2
    public final void j(View view) {
        this.l.l.setCustomView(view);
        this.k = new WeakReference(view);
    }

    @Override // defpackage.c2
    public final void k(int i) {
        l(this.l.g.getResources().getString(i));
    }

    @Override // defpackage.c2
    public final void l(CharSequence charSequence) {
        this.l.l.setSubtitle(charSequence);
    }

    @Override // defpackage.c2
    public final void m(int i) {
        o(this.l.g.getResources().getString(i));
    }

    @Override // defpackage.md0
    public final void n(od0 od0Var) {
        if (this.j == null) {
            return;
        }
        h();
        y1 y1Var = this.l.l.i;
        if (y1Var != null) {
            y1Var.l();
        }
    }

    @Override // defpackage.c2
    public final void o(CharSequence charSequence) {
        this.l.l.setTitle(charSequence);
    }

    @Override // defpackage.c2
    public final void p(boolean z) {
        this.g = z;
        this.l.l.setTitleOptional(z);
    }
}
