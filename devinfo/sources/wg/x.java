package wg;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.CellSignalStrength;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import java.util.Iterator;
import sh.i0;
import sh.j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x extends a {

    /* renamed from: b, reason: collision with root package name */
    public View f36731b;

    /* renamed from: c, reason: collision with root package name */
    public final DeviceInfoApp f36732c;

    /* renamed from: d, reason: collision with root package name */
    public final TelephonyManager f36733d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f36734e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f36735f;
    public TextView g;

    /* renamed from: h, reason: collision with root package name */
    public final j0 f36736h;

    /* renamed from: i, reason: collision with root package name */
    public final i0 f36737i;

    public x() {
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        this.f36732c = deviceInfoApp;
        this.f36733d = (TelephonyManager) deviceInfoApp.getSystemService("phone");
        this.f36734e = new Handler(Looper.getMainLooper());
        this.f36736h = new j0(1, this);
        this.f36737i = new i0(1, this);
    }

    public static void f(x xVar) {
        if (xVar.g == null) {
            return;
        }
        if (a4.a.w()) {
            xVar.g.setText(R.string.wifi);
        } else if (a4.a.t()) {
            xVar.g.setText(R.string.mobile_data);
        } else {
            xVar.g.setText(R.string.no_connect);
        }
    }

    public static void g(x xVar, SignalStrength signalStrength) {
        int asuLevel;
        int dbm;
        if (Build.VERSION.SDK_INT < 29) {
            xVar.f36735f.setText(a4.a.n(signalStrength));
            return;
        }
        Iterator<CellSignalStrength> it = signalStrength.getCellSignalStrengths().iterator();
        while (true) {
            if (!it.hasNext()) {
                asuLevel = 0;
                dbm = Integer.MAX_VALUE;
                break;
            } else {
                CellSignalStrength next = it.next();
                dbm = next.getDbm();
                if (dbm != Integer.MAX_VALUE) {
                    asuLevel = next.getAsuLevel();
                    break;
                }
            }
        }
        if (dbm == Integer.MAX_VALUE) {
            xVar.f36735f.setText("- dBm");
            return;
        }
        xVar.f36735f.setText(dbm + " dBm, " + asuLevel + " asu");
    }

    @Override // wg.a
    public final void a() {
        View viewInflate = LayoutInflater.from(this.f36732c).inflate(R.layout.monitor_signal, (ViewGroup) null);
        this.f36731b = viewInflate;
        this.f36735f = (TextView) viewInflate.findViewById(R.id.value);
        this.g = (TextView) this.f36731b.findViewById(R.id.label);
    }

    @Override // wg.a
    public final View b() {
        return this.f36731b;
    }

    @Override // wg.a
    public final void c() {
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iC = com.liuzh.deviceinfo.utilities.f.c();
        boolean zI = com.liuzh.deviceinfo.utilities.f.i();
        float f10 = iC;
        this.f36735f.setTextSize(f10);
        this.f36735f.setTextColor(zI ? -1 : -16777216);
        this.g.setTextSize(f10);
        this.g.setTextColor(zI ? -1 : -16777216);
    }

    @Override // wg.a
    public final void d() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36734e.post(this.f36737i);
        } else {
            this.f36733d.listen(this.f36736h, 256);
        }
    }

    @Override // wg.a
    public final void e() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36734e.removeCallbacks(this.f36737i);
        } else {
            this.f36733d.listen(this.f36736h, 0);
        }
    }
}
