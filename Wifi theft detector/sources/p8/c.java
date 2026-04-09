package p8;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.BuildConfig;
import f8.a;
import g8.k;
import g8.o;
import l8.w0;

/* loaded from: classes3.dex */
public class c implements q8.b {

    /* renamed from: a, reason: collision with root package name */
    public r8.b f23918a;

    /* renamed from: b, reason: collision with root package name */
    public Context f23919b;

    @Override // q8.b
    public void e(Context context) {
        this.f23919b = context;
    }

    @Override // q8.b
    public void f(String str, String str2) {
        try {
            if (str2.startsWith("PING")) {
                this.f23918a.j(str2.substring(0, 4) + " " + str, str2.substring(5), null);
            } else if (str2.contains("icmp_seq")) {
                int iIndexOf = str2.indexOf("from");
                int iIndexOf2 = str2.indexOf(":");
                int iLastIndexOf = str2.lastIndexOf("=");
                r8.b bVar = this.f23918a;
                StringBuilder sb = new StringBuilder();
                int i10 = iIndexOf + 1;
                sb.append(str2.substring(iIndexOf, i10).toUpperCase());
                sb.append(str2.substring(i10, iIndexOf2));
                bVar.j(sb.toString(), str2, str2.substring(iLastIndexOf + 1));
            } else if (str2.contains("transmitted")) {
                this.f23918a.j("Ping Statistics", str2, null);
            } else if (str2.contains("rtt")) {
                this.f23918a.j("Time Statistics", str2.substring(4), null);
            } else if (str2.contains("DNS error")) {
                this.f23918a.j("DNS error", str2.substring(10), null);
            } else {
                this.f23918a.j(str2, null, null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            k.c("appendPingProgress exception", e10);
            this.f23918a.j(str2, null, null);
        }
        this.f23918a.n();
    }

    @Override // q8.b
    public void g(w0 w0Var) {
        o.c().q(this.f23919b, "ping_count", w0Var.f23349x.getText().toString());
        o.c().q(this.f23919b, "port_timeout", w0Var.f23351z.getText().toString());
        o.c().q(this.f23919b, "packet_size", w0Var.f23348w.getText().toString());
        o.c().q(this.f23919b, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, w0Var.A.getText().toString());
        o.c().q(this.f23919b, "ping_interval", w0Var.f23350y.getText().toString());
    }

    @Override // q8.b
    public void h(w0 w0Var) {
        o.c().i(this.f23919b, BuildConfig.FLAVOR, "ping_count");
        o.c().i(this.f23919b, BuildConfig.FLAVOR, "port_timeout");
        o.c().i(this.f23919b, BuildConfig.FLAVOR, "packet_size");
        o.c().i(this.f23919b, BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        o.c().i(this.f23919b, BuildConfig.FLAVOR, "ping_interval");
        w0Var.f23349x.setText(CampaignEx.CLICKMODE_ON);
        w0Var.f23351z.setText("10");
        w0Var.f23348w.setText("58");
        w0Var.A.setText("64");
        w0Var.f23350y.setText("1");
    }

    @Override // q8.b
    public f8.a i(String str) {
        a.b bVar = new a.b();
        String strF = o.c().f(this.f23919b, "ping_count", null);
        if (TextUtils.isEmpty(strF)) {
            bVar.j(5);
        } else {
            bVar.j(Integer.parseInt(strF));
        }
        String strF2 = o.c().f(this.f23919b, "port_timeout", null);
        if (TextUtils.isEmpty(strF2)) {
            bVar.l(5);
        } else {
            bVar.l(Integer.parseInt(strF2));
        }
        String strF3 = o.c().f(this.f23919b, "packet_size", null);
        if (TextUtils.isEmpty(strF3)) {
            bVar.i(58);
        } else {
            bVar.i(Integer.parseInt(strF3));
        }
        String strF4 = o.c().f(this.f23919b, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, null);
        if (TextUtils.isEmpty(strF4)) {
            bVar.m(64);
        } else {
            bVar.m(Integer.parseInt(strF4));
        }
        String strF5 = o.c().f(this.f23919b, "ping_interval", null);
        if (TextUtils.isEmpty(strF5)) {
            bVar.h(1);
        } else {
            bVar.h(Integer.parseInt(strF5));
        }
        bVar.k(str);
        return bVar.g();
    }

    @Override // q8.b
    public void j(r8.b bVar) {
        this.f23918a = bVar;
    }

    @Override // q8.b
    public void k(w0 w0Var) {
        String strF = o.c().f(this.f23919b, "ping_count", null);
        if (!TextUtils.isEmpty(strF)) {
            w0Var.f23349x.setText(strF);
        }
        String strF2 = o.c().f(this.f23919b, "port_timeout", null);
        if (!TextUtils.isEmpty(strF2)) {
            w0Var.f23351z.setText(strF2);
        }
        String strF3 = o.c().f(this.f23919b, "packet_size", null);
        if (!TextUtils.isEmpty(strF3)) {
            w0Var.f23348w.setText(strF3);
        }
        String strF4 = o.c().f(this.f23919b, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, null);
        if (!TextUtils.isEmpty(strF4)) {
            w0Var.A.setText(strF4);
        }
        String strF5 = o.c().f(this.f23919b, "ping_interval", null);
        if (TextUtils.isEmpty(strF5)) {
            return;
        }
        w0Var.f23350y.setText(strF5);
    }
}
