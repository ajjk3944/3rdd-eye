package com.wifihacker.detector.mvp.view.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.h;
import g8.s;
import l8.e;
import t8.c;

/* loaded from: classes3.dex */
public class RouterSettingsActivity extends BaseActivity<e> {

    /* renamed from: j, reason: collision with root package name */
    public Fragment f20383j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20384k;

    public class a implements m8.a {
        public a() {
        }

        @Override // m8.a
        public void a(boolean z10) {
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return getString(R.string.router_setting);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return ((e) this.f20418i).f23237x.f23339w;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_fragment;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) {
        this.f20383j = Fragment.instantiate(this, c.class.getName(), null);
        z().p().b(R.id.fl_password, this.f20383j).g();
        if (this.f20384k) {
            s.d(this, new a());
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Y() {
        Fragment fragment = this.f20383j;
        if (fragment != null && (fragment instanceof c)) {
            ((c) fragment).z();
        }
        super.Y();
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
        this.f20384k = getIntent().getBooleanExtra("showInter", true);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.web_toolbar_menu, menu);
        return true;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity, androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_help) {
            return super.onMenuItemClick(menuItem);
        }
        h.e(this);
        return true;
    }
}
