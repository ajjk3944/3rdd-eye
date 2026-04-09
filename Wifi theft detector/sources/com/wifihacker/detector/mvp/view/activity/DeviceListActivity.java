package com.wifihacker.detector.mvp.view.activity;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import l8.e;
import t8.a;

/* loaded from: classes3.dex */
public class DeviceListActivity extends BaseActivity<e> {
    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return getString(R.string.who_wifi);
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
        z().p().b(R.id.fl_password, Fragment.instantiate(this, a.class.getName(), null)).g();
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
    }
}
