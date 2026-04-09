package com.wifihacker.detector.mvp.view.activity;

import android.content.DialogInterface;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import com.nads.nsdk.WADModel;
import com.wifi.netdiscovery.data.HostInfo;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.h;
import g8.o;
import g8.q;
import g8.s;

/* loaded from: classes3.dex */
public class DeviceDetailActivity extends BaseActivity<l8.c> implements r8.a, View.OnClickListener {

    /* renamed from: j, reason: collision with root package name */
    public HostInfo f20330j;

    /* renamed from: k, reason: collision with root package name */
    public p8.a f20331k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20332l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20333m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20334n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20335o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20336p;

    public class a implements m8.a {
        public a() {
        }

        @Override // m8.a
        public void a(boolean z10) {
            DeviceDetailActivity.this.f20336p = !z10;
            DeviceDetailActivity.this.j0();
        }
    }

    public class b implements a7.a {

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
                DeviceDetailActivity.this.k0();
            }
        }

        public b() {
        }

        @Override // a7.a
        public void a() {
            h8.a aVarF = h8.a.f();
            DeviceDetailActivity deviceDetailActivity = DeviceDetailActivity.this;
            aVarF.h(deviceDetailActivity, ((l8.c) deviceDetailActivity.f20418i).G, "wifi_finfo", WADModel.AD_MODEL_LIGHT_MIDDLE, false, new a());
        }

        @Override // a7.a
        public void onAdClicked() {
        }

        @Override // a7.a
        public void onAdLoaded() {
            DeviceDetailActivity.this.k0();
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ EditText f20340a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HostInfo f20341b;

        public c(EditText editText, HostInfo hostInfo) {
            this.f20340a = editText;
            this.f20341b = hostInfo;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            String strTrim = this.f20340a.getText().toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                DeviceDetailActivity.this.f20332l = true;
                if (this.f20341b.isMine) {
                    o oVarC = o.c();
                    DeviceDetailActivity deviceDetailActivity = DeviceDetailActivity.this;
                    oVarC.r(deviceDetailActivity, "edit_device_name", deviceDetailActivity.f20330j.hardwareAddress, strTrim + "(" + q.b(R.string.my_device) + ")");
                    ((l8.c) DeviceDetailActivity.this.f20418i).f23223x.setText(strTrim + "(" + q.b(R.string.my_device) + ")");
                } else {
                    o oVarC2 = o.c();
                    DeviceDetailActivity deviceDetailActivity2 = DeviceDetailActivity.this;
                    oVarC2.r(deviceDetailActivity2, "edit_device_name", deviceDetailActivity2.f20330j.hardwareAddress, strTrim);
                    ((l8.c) DeviceDetailActivity.this.f20418i).f23223x.setText(strTrim);
                }
            }
            dialogInterface.cancel();
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        if (this.f20334n || this.f20336p) {
            h8.a.f().h(this, ((l8.c) this.f20418i).G, "wifi_info", WADModel.AD_MODEL_LIGHT_MIDDLE, false, new b());
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return q.b(R.string.device_detail);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return ((l8.c) this.f20418i).X.f23339w;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_device_detail;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) {
        this.f20335o = Build.VERSION.SDK_INT >= 30;
        if (this.f20334n) {
            ((l8.c) this.f20418i).I.setVisibility(8);
            ((l8.c) this.f20418i).f23225z.setEnabled(false);
            ((l8.c) this.f20418i).H.setVisibility(8);
            ((l8.c) this.f20418i).T.setVisibility(8);
        }
        if (this.f20335o) {
            ((l8.c) this.f20418i).P.setVisibility(8);
            ((l8.c) this.f20418i).J.setVisibility(8);
            ((l8.c) this.f20418i).O.setVisibility(8);
            ((l8.c) this.f20418i).N.setVisibility(8);
            ((l8.c) this.f20418i).M.setVisibility(0);
            ((l8.c) this.f20418i).K.setVisibility(0);
            ((l8.c) this.f20418i).L.setVisibility(0);
            DhcpInfo dhcpInfo = ((WifiManager) getApplicationContext().getSystemService("wifi")).getDhcpInfo();
            if (dhcpInfo != null) {
                ((l8.c) this.f20418i).W.setText(getString(R.string.gate_way) + ": ");
                ((l8.c) this.f20418i).S.setText(s.q((long) dhcpInfo.gateway));
                ((l8.c) this.f20418i).U.setText(getString(R.string.dns) + "1 : ");
                ((l8.c) this.f20418i).Q.setText(s.q((long) dhcpInfo.dns1));
                ((l8.c) this.f20418i).V.setText(getString(R.string.dns) + "2 : ");
                ((l8.c) this.f20418i).R.setText(s.q((long) dhcpInfo.dns2));
            }
        }
        p8.a aVar = new p8.a(this);
        this.f20331k = aVar;
        aVar.d(this);
        HostInfo hostInfo = this.f20330j;
        if (hostInfo != null) {
            this.f20331k.b(hostInfo);
        }
        s.d(this, new a());
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Y() {
        if (this.f20333m || this.f20332l) {
            setResult(2);
        }
        super.Y();
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
        this.f20330j = (HostInfo) getIntent().getSerializableExtra("device_detail_info");
        this.f20334n = getIntent().getBooleanExtra("is_only_read", false);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
        ((l8.c) this.f20418i).f23225z.setOnClickListener(this);
        ((l8.c) this.f20418i).I.setOnClickListener(this);
        ((l8.c) this.f20418i).H.setOnClickListener(this);
    }

    @Override // r8.a
    public void e(k8.a aVar) {
        if (aVar == null) {
            return;
        }
        ((l8.c) this.f20418i).f23223x.setText(aVar.f21889a);
        ((l8.c) this.f20418i).E.setText(aVar.f21890b);
        ((l8.c) this.f20418i).F.setText(aVar.f21891c);
        ((l8.c) this.f20418i).C.setText(aVar.f21893e);
        ((l8.c) this.f20418i).D.setText(aVar.f21894f);
        ((l8.c) this.f20418i).B.setText(aVar.f21892d);
        if (aVar.f21895g) {
            ((l8.c) this.f20418i).f23225z.setText(R.string.known);
            ((l8.c) this.f20418i).f23225z.setBackgroundResource(R.drawable.btn_theme_rectangle);
        } else {
            ((l8.c) this.f20418i).f23225z.setText(R.string.stranger);
            ((l8.c) this.f20418i).f23225z.setBackgroundResource(R.drawable.btn_gray_bg_rectangle);
        }
        int i10 = aVar.f21896h;
        if (i10 == 0) {
            ((l8.c) this.f20418i).f23222w.setImageResource(R.drawable.ic_unknow);
            return;
        }
        if (i10 == 1) {
            ((l8.c) this.f20418i).f23222w.setImageResource(R.drawable.ic_android);
        } else if (i10 == 2) {
            ((l8.c) this.f20418i).f23222w.setImageResource(R.drawable.ic_apple);
        } else {
            if (i10 != 3) {
                return;
            }
            ((l8.c) this.f20418i).f23222w.setImageResource(R.drawable.ic_pc);
        }
    }

    public final void k0() {
        ((l8.c) this.f20418i).A.setVisibility(0);
    }

    public final void l0(HostInfo hostInfo) {
        View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.edit_dialog_layout, (ViewGroup) null);
        EditText editText = (EditText) viewInflate.findViewById(R.id.et_dialog);
        String strTrim = ((l8.c) this.f20418i).f23223x.getText().toString().trim();
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(15)});
        editText.setHint(strTrim);
        b.a aVar = new b.a(this);
        aVar.q(viewInflate);
        aVar.i("Cancel", null).m("OK", new c(editText, hostInfo));
        androidx.appcompat.app.b bVarR = aVar.r();
        bVarR.i(-1).setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
        bVarR.i(-2).setTextColor(ContextCompat.getColor(this, R.color.translucent_black));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        HostInfo hostInfo;
        int id = view.getId();
        if (id != R.id.btn_sign) {
            if (id != R.id.go_to_route) {
                if (id == R.id.iv_edit && (hostInfo = this.f20330j) != null) {
                    l0(hostInfo);
                    return;
                }
                return;
            }
            h8.c.d().g();
            if (this.f20336p) {
                h.j(this, true);
                return;
            } else {
                h.j(this, false);
                return;
            }
        }
        this.f20333m = !this.f20333m;
        if (this.f20330j != null) {
            boolean zA = o.c().a(this, "device_marked", this.f20330j.hardwareAddress, false);
            o.c().k(this, "device_marked", this.f20330j.hardwareAddress, !zA);
            if (zA) {
                ((l8.c) this.f20418i).f23225z.setText(R.string.stranger);
                ((l8.c) this.f20418i).f23225z.setBackgroundResource(R.drawable.btn_gray_bg_rectangle);
            } else {
                ((l8.c) this.f20418i).f23225z.setText(R.string.known);
                ((l8.c) this.f20418i).f23225z.setBackgroundResource(R.drawable.btn_theme_rectangle);
            }
        }
    }
}
