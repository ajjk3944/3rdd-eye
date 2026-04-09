package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j1;
import androidx.fragment.app.FragmentActivity;
import androidx.savedstate.a;
import f0.u;
import h.b;

/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements c, u.a, a.c {

    /* renamed from: f, reason: collision with root package name */
    public AppCompatDelegate f405f;

    /* renamed from: g, reason: collision with root package name */
    public Resources f406g;

    public class a implements a.c {
        public a() {
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.F().B(bundle);
            return bundle;
        }
    }

    public class b implements androidx.activity.contextaware.d {
        public b() {
        }

        @Override // androidx.activity.contextaware.d
        public void a(Context context) {
            AppCompatDelegate appCompatDelegateF = AppCompatActivity.this.F();
            appCompatDelegateF.t();
            appCompatDelegateF.x(AppCompatActivity.this.getSavedStateRegistry().b("androidx:appcompat"));
        }
    }

    public AppCompatActivity() {
        H();
    }

    public AppCompatDelegate F() {
        if (this.f405f == null) {
            this.f405f = AppCompatDelegate.h(this, this);
        }
        return this.f405f;
    }

    public ActionBar G() {
        return F().s();
    }

    public final void H() {
        getSavedStateRegistry().h("androidx:appcompat", new a());
        addOnContextAvailableListener(new b());
    }

    public void I(f0.u uVar) {
        uVar.c(this);
    }

    public void K(int i10) {
    }

    public void M() {
    }

    public boolean N() {
        Intent intentB = b();
        if (intentB == null) {
            return false;
        }
        if (!R(intentB)) {
            Q(intentB);
            return true;
        }
        f0.u uVarE = f0.u.e(this);
        I(uVarE);
        L(uVarE);
        uVarE.f();
        try {
            f0.b.b(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public final boolean O(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    public void P(Toolbar toolbar) {
        F().L(toolbar);
    }

    public void Q(Intent intent) {
        f0.n.e(this, intent);
    }

    public boolean R(Intent intent) {
        return f0.n.f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        F().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(F().g(context));
    }

    @Override // f0.u.a
    public Intent b() {
        return f0.n.a(this);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar actionBarG = G();
        if (getWindow().hasFeature(0)) {
            if (actionBarG == null || !actionBarG.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar actionBarG = G();
        if (keyCode == 82 && actionBarG != null && actionBarG.o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i10) {
        return F().j(i10);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return F().q();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f406g == null && j1.c()) {
            this.f406g = new j1(this, super.getResources());
        }
        Resources resources = this.f406g;
        return resources == null ? super.getResources() : resources;
    }

    @Override // androidx.appcompat.app.a.c
    public a.b h() {
        return F().n();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        F().u();
    }

    @Override // androidx.appcompat.app.c
    public h.b m(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        F().w(configuration);
        if (this.f406g != null) {
            this.f406g.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        M();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        F().y();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (O(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        ActionBar actionBarG = G();
        if (menuItem.getItemId() != 16908332 || actionBarG == null || (actionBarG.i() & 4) == 0) {
            return false;
        }
        return N();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        F().z(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        F().A();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        F().C();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        F().D();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        F().N(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar actionBarG = G();
        if (getWindow().hasFeature(0)) {
            if (actionBarG == null || !actionBarG.p()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        F().H(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        F().M(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        F().I(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        F().J(view, layoutParams);
    }

    public void J(n0.g gVar) {
    }

    public void L(f0.u uVar) {
    }

    @Override // androidx.appcompat.app.c
    public void k(h.b bVar) {
    }

    @Override // androidx.appcompat.app.c
    public void o(h.b bVar) {
    }
}
