package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.internal.ads.kf;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.card.BatteryCard;
import com.liuzh.deviceinfo.card.PercentCardGroup;
import com.liuzh.deviceinfo.monitor.MonitorManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kf extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13149a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13150b;

    public /* synthetic */ kf(int i4, Object obj) {
        this.f13149a = i4;
        this.f13150b = obj;
    }

    private final void a(Context context, Intent intent) {
        ya.y yVar = (ya.y) this.f13150b;
        synchronized (yVar) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : yVar.f37497b.entrySet()) {
                    if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                        arrayList.add((BroadcastReceiver) entry.getKey());
                    }
                }
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((BroadcastReceiver) arrayList.get(i4)).onReceive(context, intent);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i4 = 3;
        boolean z3 = true;
        final int i10 = 0;
        switch (this.f13149a) {
            case 0:
                ((lf) this.f13150b).c();
                return;
            case 1:
                ((yg) this.f13150b).d(3);
                return;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((no0) this.f13150b).e(new ce(1));
                    return;
                }
                return;
            case 3:
                ((yj0) this.f13150b).f18777a.execute(new uh0(i4, this, context));
                return;
            case 4:
                ou0 ou0Var = (ou0) this.f13150b;
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    ou0Var.a(true, ou0Var.f14805c);
                    ou0Var.f14804b = true;
                    return;
                } else {
                    if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        ou0Var.a(false, ou0Var.f14805c);
                        ou0Var.f14804b = false;
                        return;
                    }
                    return;
                }
            case 5:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                xi0 xi0Var = (xi0) this.f13150b;
                xi0Var.h(ev1.b(context, intent, (p50) xi0Var.j, (AudioDeviceInfo) xi0Var.f18399i));
                return;
            case 6:
                ec.o1 o1Var = (ec.o1) this.f13150b;
                if (intent == null) {
                    ec.s0 s0Var = o1Var.f22954f;
                    ec.o1.m(s0Var);
                    s0Var.j.d("App receiver called with null intent");
                    return;
                }
                String action = intent.getAction();
                if (action == null) {
                    ec.s0 s0Var2 = o1Var.f22954f;
                    ec.o1.m(s0Var2);
                    s0Var2.j.d("App receiver called with null action");
                    return;
                }
                int iHashCode = action.hashCode();
                if (iHashCode != -1928239649) {
                    if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                        ec.s0 s0Var3 = o1Var.f22954f;
                        ec.o1.m(s0Var3);
                        s0Var3.f23060o.d("[sgtm] App Receiver notified batches are available");
                        ec.l1 l1Var = o1Var.g;
                        ec.o1.m(l1Var);
                        l1Var.K(new b5.o(15, this));
                        return;
                    }
                } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                    com.google.android.gms.internal.measurement.p8.a();
                    if (o1Var.f22952d.L(null, ec.d0.R0)) {
                        ec.s0 s0Var4 = o1Var.f22954f;
                        ec.o1.m(s0Var4);
                        s0Var4.f23060o.d("App receiver notified triggers are available");
                        ec.l1 l1Var2 = o1Var.g;
                        ec.o1.m(l1Var2);
                        l1Var2.K(new b5.o(16, o1Var));
                        return;
                    }
                    return;
                }
                ec.s0 s0Var5 = o1Var.f22954f;
                ec.o1.m(s0Var5);
                s0Var5.j.d("App receiver called with unknown action");
                return;
            case 7:
                ((sh.k0) this.f13150b).l0(context);
                return;
            case 8:
                ((androidx.recyclerview.widget.d0) this.f13150b).q();
                return;
            case 9:
                int intExtra = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                PercentCardGroup percentCardGroup = (PercentCardGroup) this.f13150b;
                percentCardGroup.f21202d = intent.getIntExtra("status", -1);
                percentCardGroup.f21201c = intent.getIntExtra("voltage", 0);
                percentCardGroup.f21201c = com.liuzh.deviceinfo.utilities.b.b(percentCardGroup.f21201c);
                percentCardGroup.f21200b.setSummary(percentCardGroup.getResources().getString(R.string.voltage) + ": " + com.liuzh.deviceinfo.utilities.b.d(percentCardGroup.f21201c) + "  " + percentCardGroup.getResources().getString(R.string.temperature) + ": " + com.liuzh.deviceinfo.utilities.d.f(intent.getIntExtra("temperature", 0) / 10.0f));
                percentCardGroup.f21200b.setProgressIndeterminate(percentCardGroup.f21202d == 2);
                percentCardGroup.f21200b.setTitle(percentCardGroup.getResources().getString(R.string.battery) + " (" + com.liuzh.deviceinfo.utilities.l.m(percentCardGroup.f21202d, percentCardGroup.getContext()) + ")");
                percentCardGroup.f21200b.setPercent(((float) intExtra) / 100.0f);
                percentCardGroup.b();
                return;
            case 10:
                m8.r.g.execute(new m8.q((m8.r) this.f13150b, 2));
                return;
            case 11:
                sh.b bVar = (sh.b) this.f13150b;
                if (bVar.c0() || intent == null || context == null) {
                    return;
                }
                int intExtra2 = intent.getIntExtra("voltage", 0);
                bVar.f33640e0 = intExtra2;
                bVar.f33640e0 = com.liuzh.deviceinfo.utilities.b.b(intExtra2);
                bVar.f33639d0 = com.liuzh.deviceinfo.utilities.l.j();
                bVar.f33638c0 = intent.getIntExtra("status", -1);
                int intExtra3 = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0);
                BatteryCard batteryCard = bVar.f33642g0;
                if (batteryCard != null) {
                    Context context2 = batteryCard.getContext();
                    int iB = com.liuzh.deviceinfo.utilities.b.b(intent.getIntExtra("voltage", 0));
                    int intExtra4 = intent.getIntExtra("plugged", -1);
                    int intExtra5 = intent.getIntExtra("health", -1);
                    String stringExtra = intent.getStringExtra("technology");
                    ((TextView) batteryCard.f21168a.f36148d).setText(com.liuzh.deviceinfo.utilities.l.l(intExtra4, context2));
                    ((TextView) batteryCard.f21168a.f36147c).setText(com.liuzh.deviceinfo.utilities.l.k(intExtra5, context2));
                    ((TextView) batteryCard.f21168a.f36149e).setText(stringExtra);
                    ((TextView) batteryCard.f21168a.g).setText(com.liuzh.deviceinfo.utilities.b.d(iB));
                    ((TextView) batteryCard.f21168a.f36150f).setText(com.liuzh.deviceinfo.utilities.d.f(intent.getIntExtra("temperature", 0) / 10.0f));
                    bi.d.c(new androidx.lifecycle.o0(25, batteryCard));
                }
                TextView textView = bVar.f33643h0;
                if (textView != null) {
                    textView.setText(intExtra3 + "%");
                }
                sh.b.h0(bVar);
                TextView textView2 = bVar.f33645j0;
                if (textView2 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    r5.c.r(context, R.string.battery_current, sb2, ": ");
                    sb2.append(com.liuzh.deviceinfo.utilities.b.c(bVar.f33639d0));
                    textView2.setText(sb2.toString());
                    return;
                }
                return;
            case 12:
                wg.b bVar2 = (wg.b) this.f13150b;
                if (intent == null || bVar2.f36640a) {
                    return;
                }
                int intExtra6 = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0);
                bVar2.f36651n = intent.getIntExtra("temperature", 0) / 10.0f;
                TextView textView3 = bVar2.f36647i;
                if (textView3 != null) {
                    textView3.setText(intExtra6 + "%");
                }
                int iJ = com.liuzh.deviceinfo.utilities.l.j();
                TextView textView4 = bVar2.j;
                if (textView4 != null) {
                    textView4.setText(com.liuzh.deviceinfo.utilities.b.c(iJ));
                }
                TextView textView5 = bVar2.f36649l;
                if (textView5 != null) {
                    textView5.setText(com.liuzh.deviceinfo.utilities.d.f(bVar2.f36651n));
                }
                int intExtra7 = intent.getIntExtra("voltage", 0);
                bVar2.f36642c = intExtra7;
                int iB2 = com.liuzh.deviceinfo.utilities.b.b(intExtra7);
                bVar2.f36642c = iB2;
                TextView textView6 = bVar2.f36648k;
                if (textView6 != null) {
                    textView6.setText(com.liuzh.deviceinfo.utilities.b.d(iB2));
                }
                if (bVar2.f36650m != null) {
                    bVar2.f36650m.setText(String.format(Locale.US, "%.2f W", Float.valueOf(com.liuzh.deviceinfo.utilities.b.a(iJ, bVar2.f36642c))));
                    return;
                }
                return;
            case 13:
                if (intent == null) {
                    return;
                }
                synchronized (((MonitorManager) this.f13150b).f21227d) {
                    try {
                        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                            Iterator it = ((MonitorManager) this.f13150b).f21227d.entrySet().iterator();
                            while (it.hasNext()) {
                                ((wg.a) ((Map.Entry) it.next()).getValue()).d();
                            }
                        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                            Iterator it2 = ((MonitorManager) this.f13150b).f21227d.entrySet().iterator();
                            while (it2.hasNext()) {
                                ((wg.a) ((Map.Entry) it2.next()).getValue()).e();
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 14:
                xh.d dVar = (xh.d) this.f13150b;
                if (dVar.f37117e0 == null || dVar.c0()) {
                    return;
                }
                int intExtra8 = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", LinearLayoutManager.INVALID_OFFSET);
                if (intExtra8 == 4) {
                    dVar.Z.setImageResource(R.drawable.img_bluetooth_failed);
                    dVar.f37113a0.setText(R.string.test_failed);
                    je.u.z(com.liuzh.deviceinfo.utilities.t.f21303b.f21304a, "test_bluetooth", 0);
                    return;
                }
                switch (intExtra8) {
                    case 10:
                        if (wi.h.f36762h && dVar.f37116d0 == 2) {
                            dVar.f37116d0 = 0;
                            bi.d.b(new Runnable(this) { // from class: xh.c

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ kf f37112b;

                                {
                                    this.f37112b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            ((d) this.f37112b.f13150b).h0();
                                            break;
                                        default:
                                            ((d) this.f37112b.f13150b).h0();
                                            break;
                                    }
                                }
                            });
                            return;
                        } else if (dVar.f37116d0 != 1) {
                            dVar.Z.setImageResource(R.drawable.img_bluetooth);
                            dVar.f37114b0.setVisibility(8);
                            return;
                        } else {
                            dVar.Z.setImageResource(R.drawable.img_bluetooth_passed);
                            dVar.f37113a0.setText(R.string.test_passed);
                            dVar.f37114b0.setVisibility(0);
                            je.u.z(com.liuzh.deviceinfo.utilities.t.f21303b.f21304a, "test_bluetooth", 1);
                            return;
                        }
                    case 11:
                        dVar.Z.setImageResource(R.drawable.img_bluetooth);
                        dVar.f37114b0.setVisibility(8);
                        dVar.f37113a0.setText(R.string.bluetooth_test_start);
                        return;
                    case 12:
                        if (wi.h.f36762h && dVar.f37116d0 == 2) {
                            dVar.f37116d0 = 1;
                            final boolean z10 = z3 ? 1 : 0;
                            bi.d.b(new Runnable(this) { // from class: xh.c

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ kf f37112b;

                                {
                                    this.f37112b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (z10) {
                                        case 0:
                                            ((d) this.f37112b.f13150b).h0();
                                            break;
                                        default:
                                            ((d) this.f37112b.f13150b).h0();
                                            break;
                                    }
                                }
                            });
                            return;
                        } else if (dVar.f37116d0 != 0) {
                            dVar.Z.setImageResource(R.drawable.img_bluetooth);
                            dVar.f37114b0.setVisibility(8);
                            return;
                        } else {
                            dVar.Z.setImageResource(R.drawable.img_bluetooth_passed);
                            dVar.f37113a0.setText(R.string.test_passed);
                            dVar.f37114b0.setVisibility(0);
                            je.u.z(com.liuzh.deviceinfo.utilities.t.f21303b.f21304a, "test_bluetooth", 1);
                            return;
                        }
                    case 13:
                        dVar.Z.setImageResource(R.drawable.img_bluetooth);
                        dVar.f37114b0.setVisibility(8);
                        return;
                    default:
                        return;
                }
            case 15:
                xh.w wVar = (xh.w) this.f13150b;
                int intExtra9 = intent.getIntExtra("wifi_state", 4);
                if (intExtra9 == 0) {
                    wVar.Z.setImageResource(R.drawable.img_wifi);
                    wVar.f37158b0.setVisibility(8);
                    return;
                }
                if (intExtra9 == 1) {
                    if (wVar.f37160d0 != 1) {
                        wVar.Z.setImageResource(R.drawable.img_wifi);
                        wVar.f37158b0.setVisibility(8);
                        return;
                    } else {
                        wVar.Z.setImageResource(R.drawable.img_wifi_passed);
                        wVar.f37157a0.setText(R.string.test_passed);
                        wVar.f37158b0.setVisibility(0);
                        com.liuzh.deviceinfo.utilities.t.f21303b.b(1);
                        return;
                    }
                }
                if (intExtra9 == 2) {
                    wVar.Z.setImageResource(R.drawable.img_wifi);
                    wVar.f37158b0.setVisibility(8);
                    wVar.f37157a0.setText(R.string.wifi_test_start);
                    return;
                }
                if (intExtra9 != 3) {
                    if (intExtra9 != 4) {
                        return;
                    }
                    wVar.Z.setImageResource(R.drawable.img_wifi_failed);
                    wVar.f37158b0.setVisibility(8);
                    wVar.f37157a0.setText(R.string.test_failed);
                    com.liuzh.deviceinfo.utilities.t.f21303b.b(0);
                    return;
                }
                if (wVar.f37160d0 != 0) {
                    wVar.Z.setImageResource(R.drawable.img_wifi);
                    wVar.f37158b0.setVisibility(8);
                    return;
                } else {
                    wVar.Z.setImageResource(R.drawable.img_wifi_passed);
                    wVar.f37157a0.setText(R.string.test_passed);
                    wVar.f37158b0.setVisibility(0);
                    com.liuzh.deviceinfo.utilities.t.f21303b.b(1);
                    return;
                }
            case 16:
                a(context, intent);
                return;
            case 17:
                ya.f0 f0Var = (ya.f0) this.f13150b;
                if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
                    f0Var.f37445e = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        f0Var.f37445e = false;
                        return;
                    }
                    return;
                }
            default:
                nk.k.e(context, "context");
                nk.k.e(intent, "intent");
                ((z6.d) this.f13150b).f(intent);
                return;
        }
    }

    public /* synthetic */ kf(int i4, Object obj, boolean z3) {
        this.f13149a = i4;
        this.f13150b = obj;
    }

    public kf() {
        this.f13149a = 4;
        this.f13150b = ou0.f14802d;
    }

    public /* synthetic */ kf(hl hlVar, no0 no0Var) {
        this.f13149a = 2;
        this.f13150b = no0Var;
    }
}
