package ki;

import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.monitor.MonitorActivity;
import com.liuzh.deviceinfo.monitor.MonitorManager;
import com.liuzh.deviceinfo.view.SettingsItemView;
import x.n0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwitchCompat f28326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28327c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f28328d;

    public /* synthetic */ j(KeyEvent.Callback callback, SwitchCompat switchCompat, String str, int i4) {
        this.f28325a = i4;
        this.f28328d = callback;
        this.f28326b = switchCompat;
        this.f28327c = str;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) throws Resources.NotFoundException {
        wg.a aVar;
        switch (this.f28325a) {
            case 0:
                SwitchCompat switchCompat = this.f28326b;
                SettingsItemView settingsItemView = (SettingsItemView) this.f28328d;
                l lVar = settingsItemView.f21354u;
                if (lVar != null && lVar.d(z3)) {
                    switchCompat.setOnCheckedChangeListener(null);
                    switchCompat.setChecked(!z3);
                    switchCompat.setOnCheckedChangeListener(this);
                    return;
                } else {
                    com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                    com.liuzh.deviceinfo.utilities.f.k(this.f28327c, z3);
                    l lVar2 = settingsItemView.f21354u;
                    if (lVar2 != null) {
                        lVar2.c(z3);
                        return;
                    }
                    return;
                }
            default:
                MonitorActivity monitorActivity = (MonitorActivity) this.f28328d;
                SwitchCompat switchCompat2 = this.f28326b;
                String str = this.f28327c;
                int i4 = MonitorActivity.B;
                if (!switchCompat2.isChecked()) {
                    MonitorManager monitorManager = MonitorManager.f21223f;
                    synchronized (monitorManager.f21227d) {
                        aVar = (wg.a) monitorManager.f21227d.get(str);
                    }
                    if (aVar == null) {
                        return;
                    }
                    View viewB = aVar.b();
                    viewB.animate().alpha(0.0f).setListener(new androidx.recyclerview.widget.g(monitorManager, viewB, aVar, str));
                    return;
                }
                Context context = switchCompat2.getContext();
                n0 n0Var = wi.i.f36764a;
                if (Settings.canDrawOverlays(context)) {
                    MonitorManager.f21223f.h(str);
                    return;
                }
                rg.f.k0(monitorActivity, R.string.monitor_floating_permission_desc, new ig.l(22, monitorActivity));
                switchCompat2.setOnCheckedChangeListener(null);
                switchCompat2.setChecked(false);
                switchCompat2.setOnCheckedChangeListener(this);
                return;
        }
    }
}
