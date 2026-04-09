package com.wifihacker.detector.mvp.view.activity.setting;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import l8.a;

/* loaded from: classes3.dex */
public class AboutActivity extends BaseActivity<a> {
    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return getString(R.string.menu_about_us);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return ((a) this.f20418i).f23210w.f23339w;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_about;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) {
        try {
            String str = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            ((a) this.f20418i).f23211x.setText(getString(R.string.version_info) + ":" + str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
    }
}
