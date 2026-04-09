package A1;

import A2.C;
import Y4.U;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.ProgressBar;
import b4.C0340e;
import c1.AbstractC0399c;
import c1.C0401e;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.C0447Bq;
import com.google.android.gms.internal.ads.C0729Sj;
import com.google.android.gms.internal.ads.C0855Zq;
import com.google.android.gms.internal.ads.C1231gt;
import com.google.android.gms.internal.ads.C1394jw;
import com.google.android.gms.internal.ads.N7;
import com.google.android.gms.internal.ads.OO;
import com.google.android.gms.internal.ads.Ou;
import com.google.android.gms.internal.ads.RunnableC0786Vp;
import com.google.android.gms.internal.ads.RunnableC1944u6;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC0919b7;
import com.google.android.gms.internal.ads.W9;
import com.google.android.play.core.install.zza;
import com.lefan.signal.ui.other.OtherFragment;
import com.lefan.signal.ui.wifi.SquatterActivity;
import com.lefan.signal.ui.wifi.WifiFragment;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import t2.C2911G;

/* loaded from: classes.dex */
public final class t extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f127b;

    public /* synthetic */ t(int i, Object obj) {
        this.f126a = i;
        this.f127b = obj;
    }

    private final void a(Context context, Intent intent) {
        Ou ou = (Ou) this.f127b;
        synchronized (ou) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((WeakHashMap) ou.f10272d).entrySet()) {
                    if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                        arrayList.add((BroadcastReceiver) entry.getKey());
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String strR;
        String strConcat;
        String str;
        String str2;
        String str3;
        int i = 4;
        int i3 = 2;
        int i6 = 1;
        switch (this.f126a) {
            case 0:
                v.f130g.execute(new u((v) this.f127b, i3));
                return;
            case 1:
                R3.c cVar = (R3.c) this.f127b;
                if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
                    cVar.f3400a.d("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                cVar.f3400a.d("List of extras in received intent:", new Object[0]);
                for (String str4 : intent.getExtras().keySet()) {
                    cVar.f3400a.d("Key: %s; value: %s", str4, intent.getExtras().get(str4));
                }
                B2.a aVar = cVar.f3400a;
                aVar.d("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                aVar.d("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                aVar.d("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                zza zzaVar = new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
                cVar.f3400a.d("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVar);
                synchronized (cVar) {
                    Iterator it = new HashSet(cVar.f3403d).iterator();
                    while (it.hasNext()) {
                        ((V3.a) it.next()).a(zzaVar);
                    }
                }
                return;
            case 2:
                OtherFragment otherFragment = (OtherFragment) this.f127b;
                ArrayList arrayList = otherFragment.f19108x0;
                if (intent != null && "android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    arrayList.clear();
                    T4.d dVar = new T4.d(null);
                    dVar.f3595b = otherFragment.r(R.string.string_state);
                    int intExtra = intent.getIntExtra("status", 0);
                    dVar.f3596c = intExtra != 1 ? intExtra != 2 ? intExtra != 3 ? intExtra != 4 ? intExtra != 5 ? otherFragment.r(R.string.string_unknown) : otherFragment.r(R.string.battery_full) : otherFragment.r(R.string.uncharged) : otherFragment.r(R.string.in_discharge) : otherFragment.r(R.string.charging) : otherFragment.r(R.string.string_unknown);
                    arrayList.add(dVar);
                    if (intent.getIntExtra("status", 0) != 4) {
                        T4.d dVar2 = new T4.d(null);
                        dVar2.f3595b = otherFragment.r(R.string.charging_power_supply);
                        int intExtra2 = intent.getIntExtra("plugged", 0);
                        dVar2.f3596c = intExtra2 != 1 ? intExtra2 != 2 ? intExtra2 != 4 ? otherFragment.r(R.string.string_unknown) : otherFragment.r(R.string.wireless_charging) : "USB" : otherFragment.r(R.string.charger);
                        arrayList.add(dVar2);
                    }
                    T4.d dVar3 = new T4.d(null);
                    dVar3.f3595b = otherFragment.r(R.string.string_type);
                    String stringExtra = intent.getStringExtra("technology");
                    if (stringExtra == null) {
                        stringExtra = "--";
                    }
                    dVar3.f3596c = stringExtra;
                    arrayList.add(dVar3);
                    T4.d dVar4 = new T4.d(null);
                    dVar4.f3595b = otherFragment.r(R.string.battery_healthy);
                    switch (intent.getIntExtra("health", 0)) {
                        case 1:
                            strR = otherFragment.r(R.string.string_unknown);
                            break;
                        case 2:
                            strR = otherFragment.r(R.string.battery_good);
                            break;
                        case 3:
                            strR = otherFragment.r(R.string.overheated);
                            break;
                        case 4:
                            strR = otherFragment.r(R.string.no_electricity);
                            break;
                        case 5:
                            strR = otherFragment.r(R.string.overvoltage);
                            break;
                        case 6:
                            strR = otherFragment.r(R.string.unknown_error);
                            break;
                        case 7:
                            strR = otherFragment.r(R.string.temperature_too_low);
                            break;
                        default:
                            strR = otherFragment.r(R.string.string_unknown);
                            break;
                    }
                    dVar4.f3596c = strR;
                    arrayList.add(dVar4);
                    if (OtherFragment.X(otherFragment) > 0.0d) {
                        T4.d dVar5 = new T4.d(null);
                        dVar5.f3595b = otherFragment.r(R.string.battery_capacity);
                        Double dValueOf = Double.valueOf(OtherFragment.X(otherFragment));
                        if (R2.a.f3390d) {
                            Locale locale = F4.e.f1457a;
                            str3 = String.format(F4.e.b(), "%.0f mAh", Arrays.copyOf(new Object[]{dValueOf}, 1));
                        } else {
                            str3 = String.format(Locale.ENGLISH, "%.0f mAh", Arrays.copyOf(new Object[]{dValueOf}, 1));
                        }
                        dVar5.f3596c = str3;
                        arrayList.add(dVar5);
                    }
                    T4.d dVar6 = new T4.d(null);
                    dVar6.f3595b = otherFragment.r(R.string.battery_health_left_battery_text);
                    int intExtra3 = intent.getIntExtra("level", 0);
                    if (OtherFragment.X(otherFragment) > 0.0d) {
                        strConcat = R2.a.k(Integer.valueOf(intExtra3), "%d %%").concat(R2.a.k(Double.valueOf((OtherFragment.X(otherFragment) * intExtra3) / 100.0d), " [%.0f mAh]"));
                    } else {
                        Integer numValueOf = Integer.valueOf(intExtra3);
                        if (R2.a.f3390d) {
                            Locale locale2 = F4.e.f1457a;
                            strConcat = String.format(F4.e.b(), "%d %%", Arrays.copyOf(new Object[]{numValueOf}, 1));
                        } else {
                            strConcat = String.format(Locale.ENGLISH, "%d %%", Arrays.copyOf(new Object[]{numValueOf}, 1));
                        }
                    }
                    dVar6.f3596c = strConcat;
                    arrayList.add(dVar6);
                    T4.d dVar7 = new T4.d(null);
                    dVar7.f3595b = otherFragment.r(R.string.voltage);
                    Integer numValueOf2 = Integer.valueOf(intent.getIntExtra("voltage", 0));
                    if (R2.a.f3390d) {
                        Locale locale3 = F4.e.f1457a;
                        str = String.format(F4.e.b(), "%d mV", Arrays.copyOf(new Object[]{numValueOf2}, 1));
                    } else {
                        str = String.format(Locale.ENGLISH, "%d mV", Arrays.copyOf(new Object[]{numValueOf2}, 1));
                    }
                    dVar7.f3596c = str;
                    arrayList.add(dVar7);
                    T4.d dVar8 = new T4.d(null);
                    dVar8.f3595b = otherFragment.r(R.string.temperature);
                    float intExtra4 = intent.getIntExtra("temperature", 0) / 10.0f;
                    Float fValueOf = Float.valueOf(intExtra4);
                    Float fValueOf2 = Float.valueOf(((intExtra4 * 9) / 5) + 32.0f);
                    if (R2.a.f3390d) {
                        Locale locale4 = F4.e.f1457a;
                        str2 = String.format(F4.e.b(), "%.1f℃ [%.1f℉]", Arrays.copyOf(new Object[]{fValueOf, fValueOf2}, 2));
                    } else {
                        str2 = String.format(Locale.ENGLISH, "%.1f℃ [%.1f℉]", Arrays.copyOf(new Object[]{fValueOf, fValueOf2}, 2));
                    }
                    dVar8.f3596c = str2;
                    arrayList.add(dVar8);
                    otherFragment.f19107w0.notifyDataSetChanged();
                    return;
                }
                return;
            case 3:
                SquatterActivity squatterActivity = (SquatterActivity) this.f127b;
                String action = intent != null ? intent.getAction() : null;
                if (action != null) {
                    int iHashCode = action.hashCode();
                    if (iHashCode == -1875733435) {
                        if (action.equals("android.net.wifi.WIFI_STATE_CHANGED") && squatterActivity.getIntent().getIntExtra("wifi_state", 0) == 1) {
                            F4.d.b(squatterActivity, squatterActivity.getString(R.string.wifi_not_open));
                            squatterActivity.finish();
                            return;
                        }
                        return;
                    }
                    if (iHashCode == -343630553 && action.equals("android.net.wifi.STATE_CHANGE")) {
                        WifiManager wifiManager = squatterActivity.f19362Q;
                        WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
                        if (connectionInfo != null) {
                            SupplicantState supplicantState = connectionInfo.getSupplicantState();
                            SupplicantState supplicantState2 = SupplicantState.DISCONNECTED;
                            if (supplicantState != supplicantState2 && connectionInfo.getSupplicantState() != supplicantState2) {
                                return;
                            }
                        }
                        F4.d.b(squatterActivity, squatterActivity.getString(R.string.wifi_not_connected));
                        squatterActivity.finish();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                WifiFragment wifiFragment = (WifiFragment) this.f127b;
                String action2 = intent != null ? intent.getAction() : null;
                if (action2 != null) {
                    int iHashCode2 = action2.hashCode();
                    if (iHashCode2 != -1875733435) {
                        if (iHashCode2 != -343630553) {
                            if (iHashCode2 == 1878357501 && action2.equals("android.net.wifi.SCAN_RESULTS")) {
                                wifiFragment.Y();
                                return;
                            }
                            return;
                        }
                        if (action2.equals("android.net.wifi.STATE_CHANGE")) {
                            U u6 = wifiFragment.f19436p0;
                            if (u6 == null) {
                                q5.i.g("viewModel");
                                throw null;
                            }
                            WifiManager wifiManager2 = wifiFragment.f19435o0;
                            u6.e(wifiManager2 != null ? wifiManager2.getConnectionInfo() : null);
                            return;
                        }
                        return;
                    }
                    if (action2.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                        int intExtra5 = intent.getIntExtra("wifi_state", 0);
                        if (intExtra5 == 1) {
                            U u7 = wifiFragment.f19436p0;
                            if (u7 != null) {
                                u7.e(null);
                                return;
                            } else {
                                q5.i.g("viewModel");
                                throw null;
                            }
                        }
                        if (intExtra5 == 2) {
                            ProgressBar progressBar = wifiFragment.f19418G0;
                            if (progressBar != null) {
                                progressBar.setVisibility(0);
                                return;
                            } else {
                                q5.i.g("connectionLoad");
                                throw null;
                            }
                        }
                        if (intExtra5 != 3) {
                            return;
                        }
                        ProgressBar progressBar2 = wifiFragment.f19418G0;
                        if (progressBar2 == null) {
                            q5.i.g("connectionLoad");
                            throw null;
                        }
                        progressBar2.setVisibility(8);
                        U u8 = wifiFragment.f19436p0;
                        if (u8 == null) {
                            q5.i.g("viewModel");
                            throw null;
                        }
                        WifiManager wifiManager3 = wifiFragment.f19435o0;
                        u8.e(wifiManager3 != null ? wifiManager3.getConnectionInfo() : null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                a4.v vVar = (a4.v) this.f127b;
                Bundle bundleExtra = intent.getBundleExtra("session_state");
                if (bundleExtra == null) {
                    return;
                }
                a4.d dVarB = a4.d.b(bundleExtra);
                vVar.f4732a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", dVarB);
                vVar.f4739h.getClass();
                C0340e c0340e = (C0340e) a4.q.f4716b.get();
                if (dVarB.f4680b != 3 || c0340e == null) {
                    vVar.f(dVarB);
                    return;
                }
                List list = dVarB.i;
                c1.g gVar = new c1.g((Object) vVar, (Object) dVarB, (Cloneable) intent, (Object) context, 15);
                if (Z3.a.f4523e.get() == null) {
                    throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
                }
                c0340e.f5752d.execute(new C(c0340e, list, gVar, 12, false));
                return;
            case 6:
                if (intent != null) {
                    ((AbstractC0399c) this.f127b).g(intent);
                    return;
                }
                return;
            case 7:
                if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    return;
                }
                V0.m.f().a(C0401e.f5890j, "Network broadcast received", new Throwable[0]);
                C0401e c0401e = (C0401e) this.f127b;
                c0401e.c(c0401e.f());
                return;
            case 8:
                ((ViewOnAttachStateChangeListenerC0919b7) this.f127b).c();
                return;
            case 9:
                ((N7) this.f127b).d(3);
                return;
            case 10:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((C1231gt) this.f127b).e(new RunnableC1944u6(i6));
                    return;
                }
                return;
            case 11:
                ((Executor) ((C0855Zq) this.f127b).f12974c).execute(new RunnableC0786Vp(this, i, context));
                return;
            case 12:
                C1394jw c1394jw = (C1394jw) this.f127b;
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    c1394jw.a(true, c1394jw.f15020c);
                    c1394jw.f15019b = true;
                    return;
                } else {
                    if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        c1394jw.a(false, c1394jw.f15020c);
                        c1394jw.f15019b = false;
                        return;
                    }
                    return;
                }
            case 13:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                C0447Bq c0447Bq = (C0447Bq) this.f127b;
                c0447Bq.a(OO.b(context, intent, (C0729Sj) c0447Bq.f7453j, (AudioDeviceInfo) c0447Bq.i));
                return;
            case 14:
                ((B3.u) this.f127b).s();
                return;
            case 15:
                a(context, intent);
                return;
            default:
                C2911G c2911g = (C2911G) this.f127b;
                if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
                    c2911g.f23581e = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        c2911g.f23581e = false;
                        return;
                    }
                    return;
                }
        }
    }

    public t() {
        this.f126a = 12;
        this.f127b = C1394jw.f15017d;
    }

    public /* synthetic */ t(W9 w9, C1231gt c1231gt) {
        this.f126a = 10;
        this.f127b = c1231gt;
    }
}
