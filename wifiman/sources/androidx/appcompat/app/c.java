package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.h0;
import androidx.fragment.app.AbstractActivityC3999j;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import c.AbstractC4145N;
import e.InterfaceC5407b;
import q2.AbstractC7419g;
import q2.C7416d;
import s1.AbstractC7874b;
import s1.u;

/* loaded from: classes.dex */
public abstract class c extends AbstractActivityC3999j implements d, u.a {

    /* renamed from: B, reason: collision with root package name */
    private f f26488B;

    /* renamed from: C, reason: collision with root package name */
    private Resources f26489C;

    class a implements C7416d.c {
        a() {
        }

        @Override // q2.C7416d.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.G0().D(bundle);
            return bundle;
        }
    }

    class b implements InterfaceC5407b {
        b() {
        }

        @Override // e.InterfaceC5407b
        public void a(Context context) {
            f fVarG0 = c.this.G0();
            fVarG0.u();
            fVarG0.z(c.this.t().b("androidx:appcompat"));
        }
    }

    public c() {
        I0();
    }

    private void I0() {
        t().h("androidx:appcompat", new a());
        h0(new b());
    }

    private void J0() {
        T.b(getWindow().getDecorView(), this);
        U.b(getWindow().getDecorView(), this);
        AbstractC7419g.b(getWindow().getDecorView(), this);
        AbstractC4145N.b(getWindow().getDecorView(), this);
    }

    private boolean Q0(KeyEvent keyEvent) {
        return false;
    }

    public f G0() {
        if (this.f26488B == null) {
            this.f26488B = f.j(this, this);
        }
        return this.f26488B;
    }

    public androidx.appcompat.app.a H0() {
        return G0().t();
    }

    public void K0(s1.u uVar) {
        uVar.f(this);
    }

    protected void L0(A1.j jVar) {
    }

    protected void M0(int i10) {
    }

    public void N0(s1.u uVar) {
    }

    public void O0() {
    }

    public boolean P0() {
        Intent intentM = m();
        if (intentM == null) {
            return false;
        }
        if (!S0(intentM)) {
            R0(intentM);
            return true;
        }
        s1.u uVarI = s1.u.i(this);
        K0(uVarI);
        N0(uVarI);
        uVarI.m();
        try {
            AbstractC7874b.p(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void R0(Intent intent) {
        s1.i.e(this, intent);
    }

    public boolean S0(Intent intent) {
        return s1.i.f(this, intent);
    }

    @Override // c.AbstractActivityC4155j, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J0();
        G0().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(G0().i(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a aVarH0 = H0();
        if (getWindow().hasFeature(0)) {
            if (aVarH0 == null || !aVarH0.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // s1.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a aVarH0 = H0();
        if (keyCode == 82 && aVarH0 != null && aVarH0.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.app.d
    public void e(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void f(androidx.appcompat.view.b bVar) {
    }

    @Override // android.app.Activity
    public View findViewById(int i10) {
        return G0().l(i10);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return G0().r();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f26489C == null && h0.c()) {
            this.f26489C = new h0(this, super.getResources());
        }
        Resources resources = this.f26489C;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        G0().v();
    }

    @Override // s1.u.a
    public Intent m() {
        return s1.i.a(this);
    }

    @Override // c.AbstractActivityC4155j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        G0().y(configuration);
        if (this.f26489C != null) {
            this.f26489C.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        O0();
    }

    @Override // androidx.fragment.app.AbstractActivityC3999j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        G0().A();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (Q0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.AbstractActivityC3999j, c.AbstractActivityC4155j, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a aVarH0 = H0();
        if (menuItem.getItemId() != 16908332 || aVarH0 == null || (aVarH0.j() & 4) == 0) {
            return false;
        }
        return P0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // c.AbstractActivityC4155j, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        G0().B(bundle);
    }

    @Override // androidx.fragment.app.AbstractActivityC3999j, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        G0().C();
    }

    @Override // androidx.fragment.app.AbstractActivityC3999j, android.app.Activity
    protected void onStart() {
        super.onStart();
        G0().E();
    }

    @Override // androidx.fragment.app.AbstractActivityC3999j, android.app.Activity
    protected void onStop() {
        super.onStop();
        G0().F();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        G0().P(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a aVarH0 = H0();
        if (getWindow().hasFeature(0)) {
            if (aVarH0 == null || !aVarH0.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b s(b.a aVar) {
        return null;
    }

    @Override // c.AbstractActivityC4155j, android.app.Activity
    public void setContentView(int i10) {
        J0();
        G0().J(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        G0().O(i10);
    }

    @Override // c.AbstractActivityC4155j, android.app.Activity
    public void setContentView(View view) {
        J0();
        G0().K(view);
    }

    @Override // c.AbstractActivityC4155j, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J0();
        G0().L(view, layoutParams);
    }
}
