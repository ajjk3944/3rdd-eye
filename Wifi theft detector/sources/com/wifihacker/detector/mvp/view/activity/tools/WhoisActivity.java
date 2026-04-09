package com.wifihacker.detector.mvp.view.activity.tools;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.s;
import l8.k0;
import t8.e;

/* loaded from: classes3.dex */
public class WhoisActivity extends BaseActivity<k0> {

    public class a implements m8.a {
        public a() {
        }

        @Override // m8.a
        public void a(boolean z10) {
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return getString(R.string.menu_whois);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return ((k0) this.f20418i).f23277x.f23339w;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_whois;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) {
        z().p().b(R.id.lv_whois, Fragment.instantiate(this, e.class.getName(), null)).g();
        s.d(this, new a());
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
    }
}
