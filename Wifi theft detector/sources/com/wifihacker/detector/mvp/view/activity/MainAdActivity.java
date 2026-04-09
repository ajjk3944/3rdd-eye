package com.wifihacker.detector.mvp.view.activity;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.nads.nsdk.WADModel;
import com.wifihacker.detector.HackerApplication;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.h;
import g8.k;
import g8.s;
import l8.e0;

/* loaded from: classes3.dex */
public class MainAdActivity extends BaseActivity<e0> implements View.OnClickListener {

    /* renamed from: j, reason: collision with root package name */
    public boolean f20379j = true;

    /* renamed from: k, reason: collision with root package name */
    public int f20380k = 0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20381l = false;

    public class a implements a7.a {
        public a() {
        }

        @Override // a7.a
        public void a() {
            MainAdActivity.this.e0();
        }

        @Override // a7.a
        public void onAdClicked() {
            MainAdActivity.this.f20381l = true;
        }

        @Override // a7.a
        public void onAdLoaded() {
        }
    }

    private void d0() {
        this.f20381l = false;
        h8.a.f().h(this, ((e0) this.f20418i).f23241z, !this.f20379j ? "resume_ad_page" : "show_ad_page", WADModel.AD_MODEL_LIGHT_BIG, false, new a());
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return null;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return null;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_show_ad;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) {
        if (this.f20379j) {
            k.a("MainAdActivity startSplashActivity");
            h.n(this);
            d0();
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Y() {
        e0();
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
        this.f20379j = getIntent().getBooleanExtra("main", true);
        k.a("MainAdActivity readIntent : " + this.f20379j);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
    }

    public final void e0() {
        HackerApplication.l().t();
        if (this.f20379j) {
            h.g(this, 1002);
        }
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e0();
    }

    public void onCloseClick(View view) {
        e0();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f20381l) {
            e0();
            return;
        }
        this.f20380k++;
        k.a("MainAdActivity onResume resumeTimes : " + this.f20380k);
        if (this.f20380k > 2 || !this.f20379j) {
            k.a("MainAdActivity loadAd");
            d0();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (!z10 || ((e0) this.f20418i).f23240y.getHeight() >= s.g(this, 120.0f)) {
            return;
        }
        ((e0) this.f20418i).A.setVisibility(8);
    }
}
