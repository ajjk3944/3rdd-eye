package Y4;

import a2.AbstractC0271g;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.view.View;
import com.lefan.signal.MyApplication;
import com.lefan.signal.ui.wifi.WifiFragment;
import d5.AbstractC2282j;
import e.InterfaceC2285b;
import e2.InterfaceC2302a;

/* loaded from: classes.dex */
public final /* synthetic */ class M implements InterfaceC2285b, InterfaceC2302a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WifiFragment f4421a;

    public /* synthetic */ M(WifiFragment wifiFragment) {
        this.f4421a = wifiFragment;
    }

    @Override // e2.InterfaceC2302a
    public void a(AbstractC0271g abstractC0271g, View view, int i) {
        ScanResult scanResult;
        WifiFragment wifiFragment = this.f4421a;
        T t6 = (T) AbstractC2282j.V(i, wifiFragment.f19424M0);
        if (t6 == null || (scanResult = t6.i) == null) {
            return;
        }
        if (!q5.i.a(scanResult.BSSID, wifiFragment.f19437q0)) {
            N4.m mVar = new N4.m();
            mVar.f3025M0 = scanResult;
            U u6 = wifiFragment.f19436p0;
            if (u6 == null) {
                q5.i.g("viewModel");
                throw null;
            }
            mVar.f3023K0 = u6;
            mVar.f0(wifiFragment.l(), "router_info");
            return;
        }
        N4.m mVar2 = new N4.m();
        U u7 = wifiFragment.f19436p0;
        if (u7 == null) {
            q5.i.g("viewModel");
            throw null;
        }
        Object objD = u7.f4442c.d();
        q5.i.b(objD);
        mVar2.f3024L0 = (WifiInfo) objD;
        U u8 = wifiFragment.f19436p0;
        if (u8 == null) {
            q5.i.g("viewModel");
            throw null;
        }
        mVar2.f3023K0 = u8;
        mVar2.f0(wifiFragment.l(), "router_info");
    }

    @Override // e.InterfaceC2285b
    public void b(Object obj) {
        Boolean bool = (Boolean) obj;
        q5.i.e(bool, "it");
        if (bool.booleanValue()) {
            return;
        }
        WifiFragment wifiFragment = this.f4421a;
        if (wifiFragment.V(wifiFragment.f19434n0) || System.currentTimeMillis() - wifiFragment.f19428Q0 >= 500) {
            return;
        }
        wifiFragment.f19430S0.a(com.bumptech.glide.d.x(wifiFragment.m(), "android.settings.APPLICATION_DETAILS_SETTINGS"));
        MyApplication.f18812d = true;
    }
}
