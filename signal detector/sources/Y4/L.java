package Y4;

import B4.C0141c;
import B4.C0144f;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import c5.C0409f;
import c5.C0412i;
import com.apm.insight.R;
import com.lefan.signal.MyApplication;
import com.lefan.signal.ui.wifi.PingActivity;
import com.lefan.signal.ui.wifi.SquatterActivity;
import com.lefan.signal.ui.wifi.TraceRouteActivity;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;
import com.lefan.signal.ui.wifi.WifiFragment;
import h.AbstractActivityC2349g;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WifiFragment f4420b;

    public /* synthetic */ L(WifiFragment wifiFragment, int i) {
        this.f4419a = i;
        this.f4420b = wifiFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intentX;
        AbstractActivityC2349g abstractActivityC2349gK;
        k0.K kS;
        WifiInfo connectionInfo;
        WifiInfo connectionInfo2;
        WifiInfo connectionInfo3;
        WifiInfo connectionInfo4;
        Object objD;
        Intent intentX2;
        Intent intentX3;
        switch (this.f4419a) {
            case 0:
                C0144f c0144f = new C0144f();
                q5.i.b(view);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                if (!view.isLaidOut()) {
                    throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.translate(-view.getScrollX(), -view.getScrollY());
                view.draw(canvas);
                c0144f.f713A0 = bitmapCreateBitmap;
                c0144f.f0(this.f4420b.l(), "full_screen");
                return;
            case 1:
                WifiFragment wifiFragment = this.f4420b;
                if (wifiFragment.m() == null || (intentX = com.bumptech.glide.d.x(wifiFragment.m(), "android.settings.WIFI_SETTINGS")) == null) {
                    return;
                }
                MyApplication.f18812d = true;
                wifiFragment.W(intentX);
                return;
            case 2:
                WifiFragment wifiFragment2 = this.f4420b;
                WifiManager wifiManager = wifiFragment2.f19435o0;
                if ((wifiManager != null ? wifiManager.getConnectionInfo() : null) == null) {
                    F4.d.b(wifiFragment2.m(), wifiFragment2.r(R.string.wifi_not_connected));
                    return;
                }
                N4.m mVar = new N4.m();
                WifiManager wifiManager2 = wifiFragment2.f19435o0;
                WifiInfo connectionInfo5 = wifiManager2 != null ? wifiManager2.getConnectionInfo() : null;
                q5.i.b(connectionInfo5);
                mVar.f3024L0 = connectionInfo5;
                U u6 = wifiFragment2.f19436p0;
                if (u6 == null) {
                    q5.i.g("viewModel");
                    throw null;
                }
                mVar.f3023K0 = u6;
                mVar.f0(wifiFragment2.l(), "router_info");
                return;
            case 3:
                WifiFragment wifiFragment3 = this.f4420b;
                if (wifiFragment3.f19435o0 == null || (abstractActivityC2349gK = wifiFragment3.k()) == null || (kS = abstractActivityC2349gK.s()) == null) {
                    return;
                }
                new N4.q().f0(kS, "wifi_manager_bottom");
                return;
            case 4:
                WifiFragment wifiFragment4 = this.f4420b;
                wifiFragment4.W(new Intent(wifiFragment4.m(), (Class<?>) PingActivity.class));
                return;
            case 5:
                WifiFragment wifiFragment5 = this.f4420b;
                try {
                    wifiFragment5.f19428Q0 = System.currentTimeMillis();
                    wifiFragment5.f19429R0.a(wifiFragment5.f19434n0);
                    return;
                } catch (Throwable th) {
                    R2.a.d(th);
                    return;
                }
            case 6:
                WifiFragment wifiFragment6 = this.f4420b;
                Intent intentX4 = com.bumptech.glide.d.x(wifiFragment6.m(), "android.settings.LOCATION_SOURCE_SETTINGS");
                if (intentX4 != null) {
                    MyApplication.f18812d = true;
                    wifiFragment6.W(intentX4);
                    return;
                }
                return;
            case 7:
                B4.h hVar = new B4.h();
                WifiFragment wifiFragment7 = this.f4420b;
                hVar.g0(R.string.wifi_signal_tip, wifiFragment7.r(R.string.wifi_signal));
                hVar.e0(wifiFragment7.l(), "wifi_signal_help");
                return;
            case 8:
                WifiFragment wifiFragment8 = this.f4420b;
                WifiManager wifiManager3 = wifiFragment8.f19435o0;
                if (wifiManager3 == null) {
                    F4.d.b(wifiFragment8.m(), wifiFragment8.r(R.string.phone_is_not_support));
                    return;
                }
                if (!wifiManager3.isWifiEnabled()) {
                    F4.d.b(wifiFragment8.m(), wifiFragment8.r(R.string.wifi_not_open));
                    return;
                }
                WifiManager wifiManager4 = wifiFragment8.f19435o0;
                SupplicantState supplicantState = null;
                if ((wifiManager4 != null ? wifiManager4.getConnectionInfo() : null) == null) {
                    F4.d.b(wifiFragment8.m(), wifiFragment8.r(R.string.wifi_not_connected));
                    return;
                }
                WifiManager wifiManager5 = wifiFragment8.f19435o0;
                if (((wifiManager5 == null || (connectionInfo2 = wifiManager5.getConnectionInfo()) == null) ? null : connectionInfo2.getSupplicantState()) != SupplicantState.ASSOCIATING) {
                    WifiManager wifiManager6 = wifiFragment8.f19435o0;
                    if (wifiManager6 != null && (connectionInfo = wifiManager6.getConnectionInfo()) != null) {
                        supplicantState = connectionInfo.getSupplicantState();
                    }
                    if (supplicantState != SupplicantState.DISCONNECTED) {
                        wifiFragment8.W(new Intent(wifiFragment8.m(), (Class<?>) WifiDetectionActivity.class));
                        return;
                    }
                }
                F4.d.b(wifiFragment8.m(), wifiFragment8.r(R.string.wifi_not_connected));
                return;
            case 9:
                WifiFragment wifiFragment9 = this.f4420b;
                WifiManager wifiManager7 = wifiFragment9.f19435o0;
                if (wifiManager7 == null) {
                    F4.d.b(wifiFragment9.m(), wifiFragment9.r(R.string.phone_is_not_support));
                    return;
                }
                if (!wifiManager7.isWifiEnabled()) {
                    F4.d.b(wifiFragment9.m(), wifiFragment9.r(R.string.wifi_not_open));
                    return;
                }
                WifiManager wifiManager8 = wifiFragment9.f19435o0;
                if ((wifiManager8 != null ? wifiManager8.getConnectionInfo() : null) == null) {
                    F4.d.b(wifiFragment9.m(), wifiFragment9.r(R.string.wifi_not_connected));
                    return;
                }
                WifiManager wifiManager9 = wifiFragment9.f19435o0;
                if (((wifiManager9 == null || (connectionInfo4 = wifiManager9.getConnectionInfo()) == null) ? null : connectionInfo4.getSupplicantState()) != SupplicantState.ASSOCIATING) {
                    WifiManager wifiManager10 = wifiFragment9.f19435o0;
                    if (((wifiManager10 == null || (connectionInfo3 = wifiManager10.getConnectionInfo()) == null) ? null : connectionInfo3.getSupplicantState()) != SupplicantState.DISCONNECTED) {
                        Intent intent = new Intent(wifiFragment9.m(), (Class<?>) SquatterActivity.class);
                        TextView textView = wifiFragment9.f19442w0;
                        if (textView == null) {
                            q5.i.g("devicePhoneMac");
                            throw null;
                        }
                        intent.putExtra("my_mac_address", textView.getText());
                        intent.putExtra("my_squatter_ssid", wifiFragment9.f19438r0);
                        wifiFragment9.W(intent);
                        return;
                    }
                }
                F4.d.b(wifiFragment9.m(), wifiFragment9.r(R.string.wifi_not_connected));
                return;
            case 10:
                WifiFragment wifiFragment10 = this.f4420b;
                wifiFragment10.W(new Intent(wifiFragment10.m(), (Class<?>) TraceRouteActivity.class));
                return;
            case 11:
                WifiFragment wifiFragment11 = this.f4420b;
                if (wifiFragment11.m() == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    Intent intentX5 = com.bumptech.glide.d.x(wifiFragment11.m(), "android.settings.WIFI_SETTINGS");
                    if (intentX5 != null) {
                        MyApplication.f18812d = true;
                        wifiFragment11.W(intentX5);
                        return;
                    }
                    return;
                }
                try {
                    WifiManager wifiManager11 = wifiFragment11.f19435o0;
                    if (wifiManager11 != null && !wifiManager11.setWifiEnabled(true) && (intentX3 = com.bumptech.glide.d.x(wifiFragment11.m(), "android.settings.WIFI_SETTINGS")) != null) {
                        MyApplication.f18812d = true;
                        wifiFragment11.W(intentX3);
                    }
                    objD = C0412i.f5929a;
                } catch (Throwable th2) {
                    objD = R2.a.d(th2);
                }
                if (C0409f.a(objD) == null || (intentX2 = com.bumptech.glide.d.x(wifiFragment11.m(), "android.settings.WIFI_SETTINGS")) == null) {
                    return;
                }
                MyApplication.f18812d = true;
                wifiFragment11.W(intentX2);
                return;
            default:
                WifiFragment wifiFragment12 = this.f4420b;
                K4.o oVar = wifiFragment12.f19431k0;
                q5.i.b(oVar);
                String string = oVar.f2391n.getText().toString();
                if (string.length() == 0) {
                    F4.d.b(wifiFragment12.m(), wifiFragment12.r(R.string.wifi_not_connected));
                    return;
                }
                k0.K kL = wifiFragment12.l();
                c1.g gVar = new c1.g(27, false);
                gVar.f5897c = wifiFragment12.r(R.string.string_tip);
                gVar.f5896b = wifiFragment12.r(R.string.wifi_open_manager_tip);
                gVar.f5898d = wifiFragment12.r(R.string.string_go);
                V2.h hVar2 = new V2.h(string, 15, wifiFragment12);
                if (kL == null) {
                    return;
                }
                C0141c c0141c = new C0141c();
                c0141c.f704C0 = gVar;
                c0141c.f703B0 = hVar2;
                c0141c.e0(kL, "custom_dialog");
                return;
        }
    }
}
