package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity;

import I2.a;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.x;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.receiver.AdminReceiver;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.settings.c;
import kotlin.jvm.internal.l;
import l8.d;
import v8.b;
import z0.C5848a;

/* loaded from: classes.dex */
public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    /* renamed from: c, reason: collision with root package name */
    public DevicePolicyManager f22112c;

    /* renamed from: d, reason: collision with root package name */
    public ComponentName f22113d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f22114e;

    /* renamed from: f, reason: collision with root package name */
    public ConstraintLayout f22115f;

    /* renamed from: g, reason: collision with root package name */
    public LinearLayout f22116g;

    @Override // c.ActivityC2008f, android.app.Activity
    public final void onBackPressed() {
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.feedback /* 2131362209 */:
                e.f37006D.getClass();
                b bVar = e.a.a().f37036z;
                bVar.getClass();
                d<String> PH_SUPPORT_EMAIL = i8.d.f38558f0;
                l.e(PH_SUPPORT_EMAIL, "PH_SUPPORT_EMAIL");
                l8.b bVar2 = bVar.f47070b;
                Object objH = bVar2.h(PH_SUPPORT_EMAIL);
                l.e(objH, "get(...)");
                d<String> PH_SUPPORT_VIP_EMAIL = i8.d.f38560g0;
                l.e(PH_SUPPORT_VIP_EMAIL, "PH_SUPPORT_VIP_EMAIL");
                bVar.e(this, (String) objH, (String) bVar2.h(PH_SUPPORT_VIP_EMAIL));
                break;
            case R.id.help /* 2131362263 */:
                startActivity(new Intent(this, (Class<?>) HelpIntro.class));
                break;
            case R.id.language /* 2131362362 */:
                startActivity(new Intent(this, (Class<?>) LanguageActivity.class));
                finish();
                break;
            case R.id.personalized_ads /* 2131362572 */:
                e.f37006D.getClass();
                e.a.a().f37011C.getClass();
                c.a(this);
                break;
            case R.id.privacy /* 2131362602 */:
                e.f37006D.getClass();
                e.a.a().l(this);
                break;
            case R.id.pro /* 2131362603 */:
                e.f37006D.getClass();
                e.a.a();
                e.j(this, "settings");
                break;
            case R.id.rate /* 2131362615 */:
                x fm = getSupportFragmentManager();
                l.f(fm, "fm");
                e.f37006D.getClass();
                e.m(e.a.a(), fm, 14);
                break;
            case R.id.share /* 2131362692 */:
                e.f37006D.getClass();
                e.a.a().f37009A.f(this);
                break;
            case R.id.terms /* 2131362778 */:
                e.f37006D.getClass();
                e.a.a().n(this);
                break;
            case R.id.uninstall /* 2131362871 */:
                if (this.f22112c.isAdminActive(this.f22113d)) {
                    ((DevicePolicyManager) getSystemService("device_policy")).removeActiveAdmin(this.f22113d);
                    break;
                } else {
                    try {
                        Intent intent = new Intent("android.intent.action.DELETE");
                        intent.setData(Uri.parse("package:" + getPackageName()));
                        startActivity(intent);
                        break;
                    } catch (Exception e4) {
                        Toast.makeText(this, getResources().getString(R.string.admin_deactivated_now), 1).show();
                        e4.printStackTrace();
                        return;
                    }
                }
        }
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.c(this);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(RecyclerView.UNDEFINED_DURATION);
        window.setStatusBarColor(C5848a.getColor(this, R.color.settingBar));
        requestWindowFeature(1);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        setContentView(R.layout.activity_settings);
        this.f22112c = (DevicePolicyManager) getSystemService("device_policy");
        this.f22113d = new ComponentName(this, (Class<?>) AdminReceiver.class);
        this.f22114e = (TextView) findViewById(R.id.tv_customer_support);
        findViewById(R.id.uninstall).setOnClickListener(this);
        findViewById(R.id.privacy).setOnClickListener(this);
        findViewById(R.id.terms).setOnClickListener(this);
        findViewById(R.id.share).setOnClickListener(this);
        findViewById(R.id.rate).setOnClickListener(this);
        findViewById(R.id.feedback).setOnClickListener(this);
        findViewById(R.id.help).setOnClickListener(this);
        findViewById(R.id.language).setOnClickListener(this);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.pro);
        this.f22115f = constraintLayout;
        constraintLayout.setOnClickListener(this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.personalized_ads);
        this.f22116g = linearLayout;
        linearLayout.setOnClickListener(this);
    }

    @Override // androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final void onResume() {
        super.onResume();
        e.a aVar = e.f37006D;
        aVar.getClass();
        if (e.a.a().i.j()) {
            this.f22115f.setVisibility(8);
            this.f22114e.setText(getString(R.string.ph_vip_customer_support));
        } else {
            this.f22115f.setVisibility(0);
            this.f22114e.setText(getString(R.string.ph_customer_support));
        }
        LinearLayout linearLayout = this.f22116g;
        aVar.getClass();
        linearLayout.setVisibility(e.a.a().g() ? 0 : 8);
    }
}
