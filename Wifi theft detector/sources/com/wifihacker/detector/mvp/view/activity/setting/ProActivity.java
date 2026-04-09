package com.wifihacker.detector.mvp.view.activity.setting;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.wifihacker.detector.HackerApplication;
import com.wifihacker.detector.common.bill.BillingDataSource;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.s;
import l8.u;

/* loaded from: classes3.dex */
public class ProActivity extends BaseActivity<u> {
    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return getString(R.string.pro_version);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return null;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_pro1;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) {
        ((u) this.f20418i).A.getPaint().setFlags(16);
        ((u) this.f20418i).E.setText(BillingDataSource.l(HackerApplication.l()).m("hacker_pro"));
        ((u) this.f20418i).A.setText("(" + BillingDataSource.l(HackerApplication.l()).m("hacker_pro_pro") + ")");
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
    }

    public void onCloseClick(View view) {
        Y();
    }

    public void onUpgradeClick(View view) {
        s.v(this, "com.wifisecurity.whousemywifi.wifirouter.pro");
    }
}
