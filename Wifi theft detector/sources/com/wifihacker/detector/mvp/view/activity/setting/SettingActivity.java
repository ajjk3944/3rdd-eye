package com.wifihacker.detector.mvp.view.activity.setting;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.h;
import g8.j;
import g8.o;
import g8.s;
import l8.c0;

/* loaded from: classes3.dex */
public class SettingActivity extends BaseActivity<c0> implements View.OnClickListener {

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            o.c().m(SettingActivity.this, "switch_notification", z10);
            if (z10) {
                w8.a.b().f(SettingActivity.this.getApplicationContext());
            } else {
                w8.a.b().a(SettingActivity.this.getApplicationContext());
            }
        }
    }

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            o.c().m(SettingActivity.this, "switch_open_lock_screen", z10);
        }
    }

    public class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f20480a;

        public c(Dialog dialog) {
            this.f20480a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20480a.dismiss();
        }
    }

    public class d implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f20482a;

        public d(Dialog dialog) {
            this.f20482a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o.c().n(SettingActivity.this, "user_use_times", 8);
            this.f20482a.dismiss();
            j.a(SettingActivity.this);
        }
    }

    public class e implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f20484a;

        public e(Dialog dialog) {
            this.f20484a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20484a.dismiss();
            o.c().n(SettingActivity.this, "user_use_times", 8);
            try {
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:happyemilyu@outlook.com"));
                intent.putExtra("android.intent.extra.SUBJECT", "WiFi Detector");
                intent.putExtra("android.intent.extra.TEXT", "Send us: ");
                SettingActivity.this.startActivity(intent);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return getString(R.string.setting);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return ((c0) this.f20418i).C.f23339w;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_setting;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) throws Resources.NotFoundException {
        ((c0) this.f20418i).A.setChecked(o.c().b(this, "switch_notification", true));
        ((c0) this.f20418i).B.setChecked(o.c().b(this, "switch_open_lock_screen", true));
        if (h8.a.f().e() > 2) {
            ((c0) this.f20418i).f23228y.setVisibility(8);
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
        ((c0) this.f20418i).f23228y.setOnClickListener(this);
        ((c0) this.f20418i).f23227x.setOnClickListener(this);
        ((c0) this.f20418i).f23226w.setOnClickListener(this);
        ((c0) this.f20418i).f23229z.setOnClickListener(this);
        ((c0) this.f20418i).A.setOnCheckedChangeListener(new a());
        ((c0) this.f20418i).B.setOnCheckedChangeListener(new b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_setting_about /* 2131231481 */:
                h.a(this);
                break;
            case R.id.rl_setting_rate_us /* 2131231483 */:
                b.a aVar = new b.a(this);
                View viewInflate = LayoutInflater.from(this).inflate(R.layout.dialog_rate_us_guide, (ViewGroup) null);
                aVar.q(viewInflate);
                androidx.appcompat.app.b bVarA = aVar.a();
                bVarA.show();
                viewInflate.findViewById(R.id.im_close).setOnClickListener(new c(bVarA));
                viewInflate.findViewById(R.id.tv_rate).setOnClickListener(new d(bVarA));
                viewInflate.findViewById(R.id.tv_tousu).setOnClickListener(new e(bVarA));
                break;
            case R.id.rl_setting_share /* 2131231484 */:
                s.s(this);
                break;
        }
    }
}
