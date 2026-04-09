package com.wifihacker.detector.mvp.view.activity;

import android.net.DhcpInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.widget.Toolbar;
import com.nads.nsdk.WADModel;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.m;
import g8.s;
import g8.t;
import g8.u;
import java.io.IOException;
import l8.m0;

/* loaded from: classes3.dex */
public class WiFiInfoActivity extends BaseActivity<m0> {

    public class a extends AsyncTask {
        public a() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voidArr) {
            return s.k();
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            if (TextUtils.isEmpty(str) || str.length() >= 100) {
                return;
            }
            ((m0) WiFiInfoActivity.this.f20418i).A.setVisibility(0);
            ((m0) WiFiInfoActivity.this.f20418i).H.setText(WiFiInfoActivity.this.getString(R.string.host) + ": ");
            ((m0) WiFiInfoActivity.this.f20418i).E.setText(str);
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
                WiFiInfoActivity.this.i0();
            }
        }

        public b() {
        }

        @Override // a7.a
        public void a() {
            h8.a aVarF = h8.a.f();
            WiFiInfoActivity wiFiInfoActivity = WiFiInfoActivity.this;
            aVarF.h(wiFiInfoActivity, ((m0) wiFiInfoActivity.f20418i).f23288y, "wifi_finfo", WADModel.AD_MODEL_LIGHT_MIDDLE, false, new a());
        }

        @Override // a7.a
        public void onAdClicked() {
        }

        @Override // a7.a
        public void onAdLoaded() {
            WiFiInfoActivity.this.i0();
        }
    }

    private void h0() {
        h8.a.f().h(this, ((m0) this.f20418i).f23288y, "wifi_info", WADModel.AD_MODEL_LIGHT_MIDDLE, false, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        ((m0) this.f20418i).f23286w.setVisibility(0);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return getString(R.string.wifi_info);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return ((m0) this.f20418i).B.f23339w;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_wifi_info;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) {
        g0();
        h0();
        new a().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
    }

    public final void g0() {
        DhcpInfo dhcpInfo = ((WifiManager) getApplicationContext().getSystemService("wifi")).getDhcpInfo();
        ((m0) this.f20418i).N.setText(getString(R.string.gate_way) + ": ");
        ((m0) this.f20418i).P.setText(getString(R.string.subnet_mask) + ": ");
        ((m0) this.f20418i).O.setText(getString(R.string.mac_address));
        ((m0) this.f20418i).K.setText(getString(R.string.dns) + "1 : ");
        ((m0) this.f20418i).L.setText(getString(R.string.dns) + "2 : ");
        ((m0) this.f20418i).I.setText(getString(R.string.broadcast_address) + ": ");
        ((m0) this.f20418i).M.setText(getString(R.string.frequency) + ": ");
        ((m0) this.f20418i).J.setText(getString(R.string.channel) + ": ");
        ((m0) this.f20418i).F.setText(getString(R.string.ip_address));
        ((m0) this.f20418i).G.setText(getString(R.string.mac_address));
        if (dhcpInfo != null) {
            String strQ = s.q(dhcpInfo.gateway);
            String strQ2 = s.q(dhcpInfo.netmask);
            String strQ3 = s.q(dhcpInfo.dns1);
            String strQ4 = s.q(dhcpInfo.dns2);
            ((m0) this.f20418i).S.setText(strQ3);
            ((m0) this.f20418i).T.setText(strQ4);
            ((m0) this.f20418i).V.setText(strQ);
            ((m0) this.f20418i).X.setText(strQ2);
        }
        WifiInfo wifiInfoD = u.d(this);
        if (wifiInfoD != null) {
            ((m0) this.f20418i).W.setText(wifiInfoD.getBSSID());
            ((m0) this.f20418i).U.setText(wifiInfoD.getFrequency() + " MHz");
            ((m0) this.f20418i).R.setText(String.valueOf(t.a(wifiInfoD.getFrequency())));
            ((m0) this.f20418i).C.setText(s.q((long) wifiInfoD.getIpAddress()));
            String strJ = s.j(this);
            if (TextUtils.isEmpty(strJ)) {
                ((m0) this.f20418i).f23289z.setVisibility(8);
            } else {
                ((m0) this.f20418i).D.setText(strJ);
            }
        }
        try {
            ((m0) this.f20418i).Q.setText(m.a(this).getHostAddress());
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }
}
