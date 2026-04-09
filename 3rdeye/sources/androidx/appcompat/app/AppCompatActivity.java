package androidx.appcompat.app;

import A9.I;
import D1.c;
import G0.j;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC1762o;
import c.ActivityC2008f;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import h.AbstractC4397a;
import h.AbstractC4401e;
import h.InterfaceC4398b;
import h.InterfaceC4400d;
import h.LayoutInflaterFactory2C4402f;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import m.AbstractC5304a;
import o.e0;
import y0.k;
import y0.z;
import z0.C5848a;

/* loaded from: classes.dex */
public class AppCompatActivity extends ActivityC1762o implements InterfaceC4400d, z.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC4401e mDelegate;
    private Resources mResources;

    public class a implements c.b {
        public a() {
        }

        @Override // D1.c.b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.getDelegate().getClass();
            return bundle;
        }
    }

    public class b implements d.b {
        public b() {
        }

        @Override // d.b
        public final void a(ActivityC2008f activityC2008f) {
            AppCompatActivity appCompatActivity = AppCompatActivity.this;
            AbstractC4401e delegate = appCompatActivity.getDelegate();
            delegate.l();
            appCompatActivity.getSavedStateRegistry().a(AppCompatActivity.DELEGATE_TAG);
            delegate.p();
        }
    }

    public AppCompatActivity() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().c(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        B7.d.A(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        l.f(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        I.A(getWindow().getDecorView(), this);
        A2.l.D(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // c.ActivityC2008f, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().e(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC4397a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // y0.h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC4397a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().f(i);
    }

    public AbstractC4401e getDelegate() {
        if (this.mDelegate == null) {
            AbstractC4401e.c cVar = AbstractC4401e.f37967b;
            this.mDelegate = new LayoutInflaterFactory2C4402f(this, null, this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC4398b getDrawerToggleDelegate() {
        return getDelegate().h();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().j();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = e0.f44658a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC4397a getSupportActionBar() {
        return getDelegate().k();
    }

    @Override // y0.z.a
    public Intent getSupportParentActivityIntent() {
        return k.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().m();
    }

    @Override // c.ActivityC2008f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().o(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(z zVar) {
        zVar.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = k.a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            AppCompatActivity appCompatActivity = zVar.f47920c;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(appCompatActivity.getPackageManager());
            }
            ArrayList<Intent> arrayList = zVar.f47919b;
            int size = arrayList.size();
            try {
                for (Intent intentB = k.b(appCompatActivity, component); intentB != null; intentB = k.b(appCompatActivity, intentB.getComponent())) {
                    arrayList.add(size, intentB);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e4);
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC1762o, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().q();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC4397a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // c.ActivityC2008f, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().r();
    }

    @Override // androidx.fragment.app.ActivityC1762o, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().s();
    }

    @Override // androidx.fragment.app.ActivityC1762o, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().t();
    }

    @Override // androidx.fragment.app.ActivityC1762o, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().u();
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        z zVar = new z(this);
        onCreateSupportNavigateUpTaskStack(zVar);
        onPrepareSupportNavigateUpTaskStack(zVar);
        ArrayList<Intent> arrayList = zVar.f47919b;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        AppCompatActivity appCompatActivity = zVar.f47920c;
        if (!C5848a.startActivities(appCompatActivity, intentArr, null)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            appCompatActivity.startActivity(intent);
        }
        try {
            finishAffinity();
        } catch (IllegalStateException unused) {
            finish();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().C(charSequence);
    }

    @Override // h.InterfaceC4400d
    public AbstractC5304a onWindowStartingSupportActionMode(AbstractC5304a.InterfaceC0495a interfaceC0495a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC4397a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // c.ActivityC2008f, android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        getDelegate().x(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().A(toolbar);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().B(i);
    }

    public AbstractC5304a startSupportActionMode(AbstractC5304a.InterfaceC0495a interfaceC0495a) {
        return getDelegate().D(interfaceC0495a);
    }

    @Override // androidx.fragment.app.ActivityC1762o
    public void supportInvalidateOptionsMenu() {
        getDelegate().m();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().w(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    public AppCompatActivity(int i) {
        super(i);
        initDelegate();
    }

    @Override // c.ActivityC2008f, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().y(view);
    }

    @Override // c.ActivityC2008f, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().z(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(j jVar) {
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(z zVar) {
    }

    @Override // h.InterfaceC4400d
    public void onSupportActionModeFinished(AbstractC5304a abstractC5304a) {
    }

    @Override // h.InterfaceC4400d
    public void onSupportActionModeStarted(AbstractC5304a abstractC5304a) {
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }
}
