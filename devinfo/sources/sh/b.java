package sh;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.kf;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.card.BatteryCard;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import p.o1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class b extends a {
    public View Z;

    /* renamed from: a0, reason: collision with root package name */
    public final o1 f33636a0 = new o1(3, this);

    /* renamed from: b0, reason: collision with root package name */
    public final Handler f33637b0 = new Handler(Looper.getMainLooper());

    /* renamed from: c0, reason: collision with root package name */
    public int f33638c0 = -1;

    /* renamed from: d0, reason: collision with root package name */
    public int f33639d0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    public int f33640e0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    public final kf f33641f0 = new kf(11, this);

    /* renamed from: g0, reason: collision with root package name */
    public BatteryCard f33642g0;

    /* renamed from: h0, reason: collision with root package name */
    public TextView f33643h0;

    /* renamed from: i0, reason: collision with root package name */
    public TextView f33644i0;

    /* renamed from: j0, reason: collision with root package name */
    public TextView f33645j0;

    /* renamed from: k0, reason: collision with root package name */
    public TextView f33646k0;

    public static void h0(b bVar) {
        String str;
        boolean z3 = bVar.f33638c0 == 2;
        TextView textView = bVar.f33644i0;
        if (textView != null) {
            String strM = com.liuzh.deviceinfo.utilities.l.m(bVar.f33638c0, textView.getContext());
            if (wi.h.f36759d && z3) {
                long jF = com.liuzh.deviceinfo.utilities.l.f();
                if (jF > 0) {
                    StringBuilder sbB = i3.e.b(strM, "  ");
                    if (jF < 0) {
                        str = "0";
                    } else {
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        long hours = timeUnit.toHours(jF);
                        str = String.format(Locale.getDefault(), "%02dh %02dm", Long.valueOf(hours), Long.valueOf(timeUnit.toMinutes(jF) - TimeUnit.HOURS.toMinutes(hours)));
                    }
                    sbB.append(str);
                    strM = sbB.toString();
                }
            }
            bVar.f33644i0.setText(strM);
        }
        if (bVar.f33646k0 != null) {
            float fA = com.liuzh.deviceinfo.utilities.b.a(bVar.f33639d0, bVar.f33640e0);
            bVar.f33646k0.setText(DeviceInfoApp.f21145f.getString(R.string.battery_power) + String.format(Locale.US, ": %.2f W", Float.valueOf(fA)));
        }
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) throws NoSuchFieldException, SecurityException {
        if (this.Z == null) {
            View viewInflate = layoutInflater.inflate(R.layout.tab_battery, viewGroup, false);
            this.Z = viewInflate;
            this.f33642g0 = (BatteryCard) viewInflate.findViewById(R.id.battery_card);
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            int iE = com.liuzh.deviceinfo.utilities.f.e();
            TextView textView = (TextView) this.Z.findViewById(R.id.battery_level);
            this.f33643h0 = textView;
            textView.setTextColor(iE);
            TextView textView2 = (TextView) this.Z.findViewById(R.id.battery_status);
            this.f33644i0 = textView2;
            textView2.setTextColor(iE);
            TextView textView3 = (TextView) this.Z.findViewById(R.id.battery_current);
            this.f33645j0 = textView3;
            textView3.setTextColor(iE);
            TextView textView4 = (TextView) this.Z.findViewById(R.id.battery_power);
            this.f33646k0 = textView4;
            textView4.setTextColor(iE);
            dj.b.m((ScrollView) this.Z, com.liuzh.deviceinfo.utilities.f.d());
            this.Z.findViewById(R.id.tv_double_battery).setOnClickListener(new aa.j(9, this));
            View viewFindViewById = this.Z.findViewById(R.id.battery_settings);
            viewFindViewById.setVisibility(8);
            Intent intentAddFlags = new Intent("android.intent.action.POWER_USAGE_SUMMARY").addFlags(268435456);
            viewFindViewById.setOnClickListener(new ah.g(11, this, intentAddFlags));
            bi.d.c(new k1.b(14, intentAddFlags, viewFindViewById));
        }
        return this.Z;
    }

    @Override // b5.z
    public final void P() {
        this.F = true;
        W().registerReceiver(this.f33641f0, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f33637b0.post(this.f33636a0);
    }

    @Override // b5.z
    public final void Q() {
        this.F = true;
        W().unregisterReceiver(this.f33641f0);
        this.f33637b0.removeCallbacks(this.f33636a0);
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        ph.d dVar = new ph.d(1, view);
        WeakHashMap weakHashMap = e4.v0.f22405a;
        e4.m0.j(view, dVar);
    }
}
