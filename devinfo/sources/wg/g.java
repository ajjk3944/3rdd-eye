package wg;

import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b5.i0;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.monitor.CustomMonitorConfig;
import j$.util.Objects;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends a {

    /* renamed from: b, reason: collision with root package name */
    public final DeviceInfoApp f36664b;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayout f36665c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f36666d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f36667e;

    /* renamed from: f, reason: collision with root package name */
    public final SimpleDateFormat f36668f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public final d f36669h;

    /* renamed from: i, reason: collision with root package name */
    public String f36670i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public final e f36671k;

    /* renamed from: l, reason: collision with root package name */
    public final f f36672l;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f36673m;

    /* renamed from: n, reason: collision with root package name */
    public final i0 f36674n;

    /* renamed from: o, reason: collision with root package name */
    public CustomMonitorConfig f36675o;

    /* JADX WARN: Type inference failed for: r0v4, types: [wg.d] */
    public g() {
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        nk.k.d(deviceInfoApp, "instance");
        this.f36664b = deviceInfoApp;
        this.f36666d = new Paint();
        this.f36667e = new LinkedHashMap();
        this.f36668f = new SimpleDateFormat("HH:mm:ss", Locale.US);
        this.f36669h = new com.liuzh.deviceinfo.utilities.i() { // from class: wg.d
            @Override // com.liuzh.deviceinfo.utilities.i
            public final void a(int i4) {
                g gVar = this.f36659a;
                gVar.g = i4;
                gVar.j(s.f36700i);
            }
        };
        this.f36670i = "0K/s";
        this.j = "0K/s";
        this.f36671k = new e(this, 0);
        this.f36672l = new f(this, 0);
        this.f36673m = new Handler(Looper.getMainLooper());
        a6.e eVar = new a6.e(27, this);
        i0 i0Var = new i0();
        i0Var.f1821b = eVar;
        i0Var.f1822c = new Handler(Looper.getMainLooper());
        i0Var.f1823d = new b5.o(26, i0Var);
        this.f36674n = i0Var;
    }

    @Override // wg.a
    public final void a() {
        LinearLayout linearLayout = new LinearLayout(this.f36664b);
        linearLayout.addView(g());
        int iJ = pd.b.j(4);
        linearLayout.setPadding(iJ, iJ, iJ, iJ);
        this.f36665c = linearLayout;
    }

    @Override // wg.a
    public final View b() {
        return this.f36665c;
    }

    @Override // wg.a
    public final void d() {
        i0 i0Var = this.f36674n;
        if (!i0Var.f1820a) {
            i0Var.f1820a = true;
            long j = 1000;
            ((Handler) i0Var.f1822c).postDelayed((b5.o) i0Var.f1823d, (j - (System.currentTimeMillis() % j)) + 1);
        }
        com.liuzh.deviceinfo.utilities.j.f21262h.a(this.f36669h);
        com.liuzh.deviceinfo.utilities.r.f21296f.a(this.f36671k);
        this.f36673m.post(this.f36672l);
    }

    @Override // wg.a
    public final void e() {
        i0 i0Var = this.f36674n;
        i0Var.f1820a = false;
        ((Handler) i0Var.f1822c).removeCallbacks((b5.o) i0Var.f1823d);
        com.liuzh.deviceinfo.utilities.j.f21262h.b(this.f36669h);
        com.liuzh.deviceinfo.utilities.r.f21296f.b(this.f36671k);
        this.f36673m.removeCallbacksAndMessages(null);
    }

    public final int f(s sVar, CustomMonitorConfig customMonitorConfig) {
        Objects.toString(sVar);
        int iOrdinal = sVar.ordinal();
        DeviceInfoApp deviceInfoApp = this.f36664b;
        switch (iOrdinal) {
            case 0:
                return i(customMonitorConfig.getTextSizeSp(), customMonitorConfig.getShowName() ? d.h.s(deviceInfoApp.getString(R.string.battery_level), ": 999%") : "999%");
            case 1:
                return i(customMonitorConfig.getTextSizeSp(), customMonitorConfig.getShowName() ? d.h.s(deviceInfoApp.getString(R.string.battery_current), ": -999 mA") : "-999 mA");
            case 2:
                return i(customMonitorConfig.getTextSizeSp(), customMonitorConfig.getShowName() ? d.h.s(deviceInfoApp.getString(R.string.voltage), ": 99.99 V") : "99.99 V");
            case 3:
                return i(customMonitorConfig.getTextSizeSp(), customMonitorConfig.getShowName() ? d.h.s(deviceInfoApp.getString(R.string.temperature_short), ": -999.9℃") : "-999.9℃");
            case 4:
                return i(customMonitorConfig.getTextSizeSp(), customMonitorConfig.getShowName() ? d.h.s(deviceInfoApp.getString(R.string.battery_power), ": -99.99 W") : "-99.99 W");
            case 5:
                return i(customMonitorConfig.getTextSizeSp(), customMonitorConfig.getShowName() ? "RAM: 199%" : "199%");
            case 6:
                return i(customMonitorConfig.getTextSizeSp(), customMonitorConfig.getShowName() ? "RAM: 19.99G/19.99G" : "19.99G/19.99G");
            case 7:
                return i(customMonitorConfig.getTextSizeSp(), customMonitorConfig.getShowName() ? "FPS: 999" : "999 fps");
            case 8:
                return i(customMonitorConfig.getTextSizeSp(), "↑ 999.99K/s");
            case 9:
                return i(customMonitorConfig.getTextSizeSp(), "↓ 999.99K/s");
            case 10:
                return i(customMonitorConfig.getTextSizeSp(), customMonitorConfig.getShowName() ? d.h.s(deviceInfoApp.getString(R.string.time), ": 99:99:99") : "99:99:99");
            default:
                throw new ac.m();
        }
    }

    public final TextView g() {
        TextView textView = new TextView(this.f36664b);
        textView.setText(textView.getContext().getString(R.string.custom_monitor_preview_tips));
        textView.setTextColor(-1);
        textView.setPadding(pd.b.j(8), pd.b.j(8), pd.b.j(8), pd.b.j(8));
        return textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h(wg.s r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.g.h(wg.s, boolean):java.lang.String");
    }

    public final int i(float f10, String str) {
        DisplayMetrics displayMetrics = this.f36664b.getResources().getDisplayMetrics();
        nk.k.d(displayMetrics, "getDisplayMetrics(...)");
        float fS = pk.a.s(TypedValue.applyDimension(2, f10, displayMetrics));
        Paint paint = this.f36666d;
        paint.setTextSize(fS);
        return (int) paint.measureText(str);
    }

    public final void j(s sVar) {
        ViewGroup viewGroup;
        if (this.f36640a || (viewGroup = (ViewGroup) this.f36667e.get(sVar.name())) == null) {
            return;
        }
        boolean z3 = false;
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null || !(childAt instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) childAt;
        CustomMonitorConfig customMonitorConfig = this.f36675o;
        if (customMonitorConfig != null && customMonitorConfig.getShowName()) {
            z3 = true;
        }
        textView.setText(h(sVar, z3));
    }

    public final void k(View view, s sVar, CustomMonitorConfig customMonitorConfig) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                k(viewGroup.getChildAt(i4), sVar, customMonitorConfig);
            }
            return;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setTextColor(customMonitorConfig.getDarkText() ? -16777216 : -1);
            textView.getLayoutParams().width = f(sVar, customMonitorConfig);
            textView.setTextSize(customMonitorConfig.getTextSizeSp());
        }
    }

    @Override // wg.a
    public final void c() {
    }
}
