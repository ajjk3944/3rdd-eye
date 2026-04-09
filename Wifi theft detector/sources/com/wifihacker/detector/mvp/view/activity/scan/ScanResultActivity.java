package com.wifihacker.detector.mvp.view.activity.scan;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.nads.nsdk.WADModel;
import com.wifi.netdiscovery.data.HostInfo;
import com.wifihacker.detector.HackerApplication;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.h;
import g8.o;
import g8.s;
import g8.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l8.a0;

/* loaded from: classes3.dex */
public class ScanResultActivity extends BaseActivity<a0> implements OnUserEarnedRewardListener {

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f20466j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20467k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20468l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20469m = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            ScanResultActivity.this.j0();
        }
    }

    public class b implements Runnable {

        public class a implements Animation.AnimationListener {
            public a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                ((a0) ScanResultActivity.this.f20418i).f23212w.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            ((a0) ScanResultActivity.this.f20418i).B.setVisibility(0);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(ScanResultActivity.this, R.anim.push_left_alpha_in);
            ((a0) ScanResultActivity.this.f20418i).B.startAnimation(animationLoadAnimation);
            animationLoadAnimation.setAnimationListener(new a());
        }
    }

    public class c implements a7.a {

        public class a implements a7.a {
            public a() {
            }

            @Override // a7.a
            public void a() {
            }

            @Override // a7.a
            public void onAdClicked() {
            }

            @Override // a7.a
            public void onAdLoaded() {
            }
        }

        public c() {
        }

        @Override // a7.a
        public void a() {
            h8.a aVarF = h8.a.f();
            ScanResultActivity scanResultActivity = ScanResultActivity.this;
            aVarF.h(scanResultActivity, ((a0) scanResultActivity.f20418i).f23214y, "wifi_finfo", WADModel.AD_MODEL_LIGHT_MIDDLE, false, new a());
        }

        @Override // a7.a
        public void onAdClicked() {
        }

        @Override // a7.a
        public void onAdLoaded() {
        }
    }

    public class d implements m8.a {
        public d() {
        }

        @Override // m8.a
        public void a(boolean z10) {
            try {
                HackerApplication.l().t();
                HackerApplication.l().w(true);
                if (!s.t()) {
                    h8.c.d().g();
                }
                h.g(ScanResultActivity.this, 1002);
                ScanResultActivity.this.finish();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) throws Resources.NotFoundException {
            ScanResultActivity.this.m0();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class f implements Animation.AnimationListener {
        public f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ((a0) ScanResultActivity.this.f20418i).f23212w.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    private List l0(List list, List list2) {
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((HostInfo) it.next()).hardwareAddress);
            }
        }
        if (arrayList.size() > 0) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (arrayList.contains(((HostInfo) it2.next()).hardwareAddress)) {
                    it2.remove();
                }
            }
        }
        return list2;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return getString(R.string.who_wifi);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return ((a0) this.f20418i).D.f23339w;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_scan_result;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) {
        if (u.f(this)) {
            ((a0) this.f20418i).K.setText(u.c(this));
        } else {
            ((a0) this.f20418i).K.setText(Build.MODEL);
        }
        k0();
        if (Build.VERSION.SDK_INT < 30) {
            ((a0) this.f20418i).H.setText(String.valueOf(this.f20466j.size()));
            ((a0) this.f20418i).E.setText(String.valueOf(this.f20466j.size()));
            List listB = g8.f.b(this);
            i0(listB);
            List listL0 = l0(this.f20466j, listB);
            ((a0) this.f20418i).G.setText(String.valueOf(listL0 != null ? listL0.size() : 0));
            new Handler().postDelayed(new a(), 500L);
            return;
        }
        if (this.f20466j.size() != 0 || HackerApplication.l().m() <= 10000) {
            ((a0) this.f20418i).I.setText(String.valueOf(this.f20466j.size()));
            ((a0) this.f20418i).E.setText(String.valueOf(this.f20466j.size()));
        } else {
            ((a0) this.f20418i).I.setText(String.valueOf(HackerApplication.l().m() - 10000));
            ((a0) this.f20418i).E.setText(String.valueOf(HackerApplication.l().m() - 10000));
        }
        new Handler().postDelayed(new b(), 500L);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Y() {
        HackerApplication.l().t();
        HackerApplication.l().w(true);
        if (!s.t()) {
            h8.c.d().g();
        }
        if (!this.f20468l) {
            super.Y();
        } else {
            h.g(this, 1002);
            finish();
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
        this.f20467k = getIntent().getBooleanExtra("main", false);
        this.f20468l = getIntent().getBooleanExtra("back_main", false);
        ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra("online_devices");
        this.f20466j = arrayList;
        if (arrayList == null) {
            this.f20466j = new ArrayList();
        }
        HackerApplication.l().x(this.f20466j);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
    }

    public final void i0(List list) {
        int size;
        int i10 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            int i11 = 0;
            size = 0;
            while (it.hasNext()) {
                if (o.c().a(this, "device_marked", ((HostInfo) it.next()).hardwareAddress, false)) {
                    i11++;
                } else {
                    size++;
                }
            }
            i10 = i11;
        } else {
            size = this.f20466j.size();
        }
        ((a0) this.f20418i).F.setText(String.valueOf(i10));
        ((a0) this.f20418i).J.setText(String.valueOf(size));
    }

    public final void j0() throws Resources.NotFoundException {
        ((a0) this.f20418i).C.setVisibility(0);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.push_left_alpha_in);
        ((a0) this.f20418i).C.startAnimation(animationLoadAnimation);
        animationLoadAnimation.setAnimationListener(new e());
    }

    public final void k0() {
        h8.a.f().h(this, ((a0) this.f20418i).f23214y, "wifi_info", WADModel.AD_MODEL_LIGHT_MIDDLE, false, new c());
    }

    public final void m0() throws Resources.NotFoundException {
        ((a0) this.f20418i).A.setVisibility(0);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.push_right_alpha_in);
        ((a0) this.f20418i).A.startAnimation(animationLoadAnimation);
        animationLoadAnimation.setAnimationListener(new f());
    }

    public void onDeviceDetailClick(View view) {
        s.d(this, new d());
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        this.f20469m = true;
    }

    public void onWiFiInfoClick(View view) {
        try {
            HackerApplication.l().t();
            h.q(this);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
