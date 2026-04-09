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
import androidx.appcompat.widget.b1;
import f.b;
import q.g;

/* loaded from: classes.dex */
public class c extends androidx.fragment.app.c implements b.a, g.a {

    /* renamed from: s, reason: collision with root package name */
    private d f369s;

    /* renamed from: t, reason: collision with root package name */
    private Resources f370t;

    private boolean D(int i2, KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    public void A(q.g gVar) {
    }

    @Deprecated
    public void B() {
    }

    public boolean C() {
        Intent intentJ = j();
        if (intentJ == null) {
            return false;
        }
        if (!F(intentJ)) {
            E(intentJ);
            return true;
        }
        q.g gVarD = q.g.d(this);
        y(gVarD);
        A(gVarD);
        gVarD.e();
        try {
            q.a.e(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void E(Intent intent) {
        q.e.e(this, intent);
    }

    public boolean F(Intent intent) {
        return q.e.f(this, intent);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        w().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        w().d(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a aVarX = x();
        if (getWindow().hasFeature(0)) {
            if (aVarX == null || !aVarX.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // q.d, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a aVarX = x();
        if (keyCode == 82 && aVarX != null && aVarX.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // b.a
    public void f(f.b bVar) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        return (T) w().g(i2);
    }

    @Override // b.a
    public f.b g(b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return w().j();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f370t == null && b1.b()) {
            this.f370t = new b1(this, super.getResources());
        }
        Resources resources = this.f370t;
        return resources == null ? super.getResources() : resources;
    }

    @Override // b.a
    public void h(f.b bVar) {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        w().m();
    }

    @Override // q.g.a
    public Intent j() {
        return q.e.a(this);
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f370t != null) {
            this.f370t.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        w().p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        B();
    }

    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, q.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        d dVarW = w();
        dVarW.l();
        dVarW.q(bundle);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.c, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        w().r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (D(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a aVarX = x();
        if (menuItem.getItemId() != 16908332 || aVarX == null || (aVarX.j() & 4) == 0) {
            return false;
        }
        return C();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        w().s(bundle);
    }

    @Override // androidx.fragment.app.c, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        w().t();
    }

    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, q.d, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        w().u(bundle);
    }

    @Override // androidx.fragment.app.c, android.app.Activity
    protected void onStart() {
        super.onStart();
        w().v();
    }

    @Override // androidx.fragment.app.c, android.app.Activity
    protected void onStop() {
        super.onStop();
        w().w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        w().D(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a aVarX = x();
        if (getWindow().hasFeature(0)) {
            if (aVarX == null || !aVarX.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        w().z(i2);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        w().A(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        w().B(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        super.setTheme(i2);
        w().C(i2);
    }

    @Override // androidx.fragment.app.c
    public void v() {
        w().m();
    }

    public d w() {
        if (this.f369s == null) {
            this.f369s = d.e(this, this);
        }
        return this.f369s;
    }

    public a x() {
        return w().k();
    }

    public void y(q.g gVar) {
        gVar.b(this);
    }

    protected void z(int i2) {
    }
}
