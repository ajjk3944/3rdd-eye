package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ux0 extends c2 implements md0 {
    public Context h;
    public ActionBarContextView i;
    public vq2 j;
    public WeakReference k;
    public boolean l;
    public od0 m;

    @Override // defpackage.c2
    public final void a() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.j.n(this);
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
        return this.m;
    }

    @Override // defpackage.c2
    public final MenuInflater d() {
        return new hz0(this.i.getContext());
    }

    @Override // defpackage.c2
    public final CharSequence e() {
        return this.i.getSubtitle();
    }

    @Override // defpackage.c2
    public final CharSequence f() {
        return this.i.getTitle();
    }

    @Override // defpackage.md0
    public final boolean g(od0 od0Var, MenuItem menuItem) {
        return ((p21) this.j.g).v(this, menuItem);
    }

    @Override // defpackage.c2
    public final void h() {
        this.j.o(this, this.m);
    }

    @Override // defpackage.c2
    public final boolean i() {
        return this.i.x;
    }

    @Override // defpackage.c2
    public final void j(View view) {
        this.i.setCustomView(view);
        this.k = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.c2
    public final void k(int i) {
        l(this.h.getString(i));
    }

    @Override // defpackage.c2
    public final void l(CharSequence charSequence) {
        this.i.setSubtitle(charSequence);
    }

    @Override // defpackage.c2
    public final void m(int i) {
        o(this.h.getString(i));
    }

    @Override // defpackage.md0
    public final void n(od0 od0Var) {
        h();
        y1 y1Var = this.i.i;
        if (y1Var != null) {
            y1Var.l();
        }
    }

    @Override // defpackage.c2
    public final void o(CharSequence charSequence) {
        this.i.setTitle(charSequence);
    }

    @Override // defpackage.c2
    public final void p(boolean z) {
        this.g = z;
        this.i.setTitleOptional(z);
    }
}
