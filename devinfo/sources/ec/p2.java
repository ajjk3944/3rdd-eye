package ec;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.widget.TextView;
import com.liuzh.deviceinfo.monitor.CustomMonitorActivity;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22990b;

    public /* synthetic */ p2(int i4, Object obj) {
        this.f22989a = i4;
        this.f22990b = obj;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        wg.b bVar;
        TextView textView;
        int i4 = this.f22989a;
        Object obj = this.f22990b;
        switch (i4) {
            case 0:
                q2 q2Var = (q2) obj;
                o1 o1Var = (o1) q2Var.f218b;
                g gVar = o1Var.f22952d;
                s0 s0Var = o1Var.f22954f;
                if (!gVar.L(null, d0.f22618a1)) {
                    if (Objects.equals(str, "IABTCF_TCString")) {
                        o1.m(s0Var);
                        s0Var.f23060o.d("IABTCF_TCString change picked up in listener.");
                        f2 f2Var = q2Var.f23026w;
                        pb.y.h(f2Var);
                        f2Var.b(500L);
                        break;
                    }
                } else if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
                    o1.m(s0Var);
                    s0Var.f23060o.d("IABTCF_TCString change picked up in listener.");
                    f2 f2Var2 = q2Var.f23026w;
                    pb.y.h(f2Var2);
                    f2Var2.b(500L);
                    break;
                }
                break;
            case 1:
                if (TextUtils.equals(str, "temperature_unit") && (textView = (bVar = (wg.b) obj).f36649l) != null) {
                    textView.setText(com.liuzh.deviceinfo.utilities.d.f(bVar.f36651n));
                    break;
                }
                break;
            default:
                if (str != null && str.equals("custom_monitor_configs")) {
                    List listB = com.liuzh.deviceinfo.utilities.f.f21256b.b();
                    nk.k.d(listB, "getCustomMonitors(...)");
                    int i10 = CustomMonitorActivity.F;
                    ((CustomMonitorActivity) obj).E(listB);
                    break;
                }
                break;
        }
    }
}
