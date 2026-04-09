package m;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import h.LayoutInflaterFactory2C4402f;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode.java */
/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5307d extends AbstractC5304a implements f.a {

    /* renamed from: d, reason: collision with root package name */
    public Context f43936d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContextView f43937e;

    /* renamed from: f, reason: collision with root package name */
    public LayoutInflaterFactory2C4402f.d f43938f;

    /* renamed from: g, reason: collision with root package name */
    public WeakReference<View> f43939g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f43940h;
    public androidx.appcompat.view.menu.f i;

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        return this.f43938f.f38035a.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        i();
        androidx.appcompat.widget.a aVar = this.f43937e.f44616e;
        if (aVar != null) {
            aVar.l();
        }
    }

    @Override // m.AbstractC5304a
    public final void c() {
        if (this.f43940h) {
            return;
        }
        this.f43940h = true;
        this.f43938f.a(this);
    }

    @Override // m.AbstractC5304a
    public final View d() {
        WeakReference<View> weakReference = this.f43939g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // m.AbstractC5304a
    public final androidx.appcompat.view.menu.f e() {
        return this.i;
    }

    @Override // m.AbstractC5304a
    public final MenuInflater f() {
        return new f(this.f43937e.getContext());
    }

    @Override // m.AbstractC5304a
    public final CharSequence g() {
        return this.f43937e.getSubtitle();
    }

    @Override // m.AbstractC5304a
    public final CharSequence h() {
        return this.f43937e.getTitle();
    }

    @Override // m.AbstractC5304a
    public final void i() {
        this.f43938f.d(this, this.i);
    }

    @Override // m.AbstractC5304a
    public final boolean j() {
        return this.f43937e.f14538t;
    }

    @Override // m.AbstractC5304a
    public final void k(View view) {
        this.f43937e.setCustomView(view);
        this.f43939g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // m.AbstractC5304a
    public final void l(int i) {
        m(this.f43936d.getString(i));
    }

    @Override // m.AbstractC5304a
    public final void m(CharSequence charSequence) {
        this.f43937e.setSubtitle(charSequence);
    }

    @Override // m.AbstractC5304a
    public final void n(int i) {
        o(this.f43936d.getString(i));
    }

    @Override // m.AbstractC5304a
    public final void o(CharSequence charSequence) {
        this.f43937e.setTitle(charSequence);
    }

    @Override // m.AbstractC5304a
    public final void p(boolean z10) {
        this.f43929c = z10;
        this.f43937e.setTitleOptional(z10);
    }
}
