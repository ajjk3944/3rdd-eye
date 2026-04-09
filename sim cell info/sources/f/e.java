package f;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import f.b;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements e.a {

    /* renamed from: d, reason: collision with root package name */
    private Context f2558d;

    /* renamed from: e, reason: collision with root package name */
    private ActionBarContextView f2559e;

    /* renamed from: f, reason: collision with root package name */
    private b.a f2560f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<View> f2561g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2562h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2563i;

    /* renamed from: j, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f2564j;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z2) {
        this.f2558d = context;
        this.f2559e = actionBarContextView;
        this.f2560f = aVar;
        androidx.appcompat.view.menu.e eVarS = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f2564j = eVarS;
        eVarS.R(this);
        this.f2563i = z2;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void a(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f2559e.l();
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean b(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f2560f.c(this, menuItem);
    }

    @Override // f.b
    public void c() {
        if (this.f2562h) {
            return;
        }
        this.f2562h = true;
        this.f2559e.sendAccessibilityEvent(32);
        this.f2560f.b(this);
    }

    @Override // f.b
    public View d() {
        WeakReference<View> weakReference = this.f2561g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // f.b
    public Menu e() {
        return this.f2564j;
    }

    @Override // f.b
    public MenuInflater f() {
        return new g(this.f2559e.getContext());
    }

    @Override // f.b
    public CharSequence g() {
        return this.f2559e.getSubtitle();
    }

    @Override // f.b
    public CharSequence i() {
        return this.f2559e.getTitle();
    }

    @Override // f.b
    public void k() {
        this.f2560f.d(this, this.f2564j);
    }

    @Override // f.b
    public boolean l() {
        return this.f2559e.j();
    }

    @Override // f.b
    public void m(View view) {
        this.f2559e.setCustomView(view);
        this.f2561g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // f.b
    public void n(int i2) {
        o(this.f2558d.getString(i2));
    }

    @Override // f.b
    public void o(CharSequence charSequence) {
        this.f2559e.setSubtitle(charSequence);
    }

    @Override // f.b
    public void q(int i2) {
        r(this.f2558d.getString(i2));
    }

    @Override // f.b
    public void r(CharSequence charSequence) {
        this.f2559e.setTitle(charSequence);
    }

    @Override // f.b
    public void s(boolean z2) {
        super.s(z2);
        this.f2559e.setTitleOptional(z2);
    }
}
