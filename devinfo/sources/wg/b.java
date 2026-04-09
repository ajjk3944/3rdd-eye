package wg;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.internal.ads.kf;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import ec.p2;
import java.util.ArrayList;
import p.o1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: h, reason: collision with root package name */
    public View f36646h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f36647i;
    public TextView j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f36648k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f36649l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f36650m;

    /* renamed from: n, reason: collision with root package name */
    public float f36651n;

    /* renamed from: b, reason: collision with root package name */
    public final DeviceInfoApp f36641b = DeviceInfoApp.f21145f;

    /* renamed from: c, reason: collision with root package name */
    public int f36642c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final kf f36643d = new kf(12, this);

    /* renamed from: e, reason: collision with root package name */
    public final o1 f36644e = new o1(14, this);

    /* renamed from: f, reason: collision with root package name */
    public final p2 f36645f = new p2(1, this);
    public final Handler g = new Handler(Looper.getMainLooper());

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f36652o = new ArrayList();

    @Override // wg.a
    public final void a() {
        View viewInflate = LayoutInflater.from(this.f36641b).inflate(R.layout.monitor_battery, (ViewGroup) null);
        this.f36646h = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(R.id.val_level);
        this.f36647i = textView;
        ArrayList arrayList = this.f36652o;
        arrayList.add(textView);
        TextView textView2 = (TextView) this.f36646h.findViewById(R.id.val_current);
        this.j = textView2;
        arrayList.add(textView2);
        TextView textView3 = (TextView) this.f36646h.findViewById(R.id.val_voltage);
        this.f36648k = textView3;
        arrayList.add(textView3);
        TextView textView4 = (TextView) this.f36646h.findViewById(R.id.val_temperature);
        this.f36649l = textView4;
        arrayList.add(textView4);
        TextView textView5 = (TextView) this.f36646h.findViewById(R.id.val_power);
        this.f36650m = textView5;
        arrayList.add(textView5);
        arrayList.add((TextView) this.f36646h.findViewById(R.id.label_level));
        arrayList.add((TextView) this.f36646h.findViewById(R.id.label_current));
        arrayList.add((TextView) this.f36646h.findViewById(R.id.label_voltage));
        arrayList.add((TextView) this.f36646h.findViewById(R.id.label_temperature));
        arrayList.add((TextView) this.f36646h.findViewById(R.id.label_power));
    }

    @Override // wg.a
    public final View b() {
        return this.f36646h;
    }

    @Override // wg.a
    public final void c() {
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iC = com.liuzh.deviceinfo.utilities.f.c();
        boolean zI = com.liuzh.deviceinfo.utilities.f.i();
        ArrayList arrayList = this.f36652o;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            TextView textView = (TextView) obj;
            textView.setTextSize(iC);
            textView.setTextColor(zI ? -1 : -16777216);
        }
    }

    @Override // wg.a
    public final void d() {
        this.f36641b.registerReceiver(this.f36643d, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.g.post(this.f36644e);
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        com.liuzh.deviceinfo.utilities.f.n(this.f36645f);
    }

    @Override // wg.a
    public final void e() {
        try {
            this.f36641b.unregisterReceiver(this.f36643d);
        } catch (Exception unused) {
        }
        this.g.removeCallbacks(this.f36644e);
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        com.liuzh.deviceinfo.utilities.f.f21257c.unregisterOnSharedPreferenceChangeListener(this.f36645f);
    }
}
