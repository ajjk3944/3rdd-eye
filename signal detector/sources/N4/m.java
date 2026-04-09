package N4;

import Y4.U;
import android.app.Dialog;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.widget.TextView;
import androidx.lifecycle.D;
import c5.C0409f;
import c5.C0410g;
import c5.C0412i;
import com.apm.insight.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.lefan.signal.ui.wifi.WifiSignalView;
import com.lefan.signal.view.DiagnosisLevelView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import o.m1;

/* loaded from: classes.dex */
public final class m extends k3.f implements Runnable {

    /* renamed from: A0, reason: collision with root package name */
    public m1 f3013A0;

    /* renamed from: B0, reason: collision with root package name */
    public final String f3014B0 = "android.permission.ACCESS_FINE_LOCATION";

    /* renamed from: C0, reason: collision with root package name */
    public final ArrayList f3015C0 = new ArrayList();

    /* renamed from: D0, reason: collision with root package name */
    public final j f3016D0;

    /* renamed from: E0, reason: collision with root package name */
    public final C0410g f3017E0;

    /* renamed from: F0, reason: collision with root package name */
    public final Handler f3018F0;

    /* renamed from: G0, reason: collision with root package name */
    public TextView f3019G0;

    /* renamed from: H0, reason: collision with root package name */
    public WifiSignalView f3020H0;

    /* renamed from: I0, reason: collision with root package name */
    public DiagnosisLevelView f3021I0;

    /* renamed from: J0, reason: collision with root package name */
    public WifiManager f3022J0;

    /* renamed from: K0, reason: collision with root package name */
    public U f3023K0;

    /* renamed from: L0, reason: collision with root package name */
    public WifiInfo f3024L0;

    /* renamed from: M0, reason: collision with root package name */
    public ScanResult f3025M0;

    public m() {
        j jVar = new j(0);
        jVar.q(0, R.layout.item_wifi_info);
        jVar.q(1, R.layout.wifi_mlo_link);
        jVar.f4671e = new F4.b(11);
        this.f3016D0 = jVar;
        this.f3017E0 = new C0410g(new D4.c(2, this));
        this.f3018F0 = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x08eb  */
    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r6v89 */
    /* JADX WARN: Type inference failed for: r6v90 */
    /* JADX WARN: Type inference failed for: r6v91, types: [java.lang.Object] */
    @Override // k0.AbstractComponentCallbacksC2617v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View C(android.view.LayoutInflater r30, android.view.ViewGroup r31) {
        /*
            Method dump skipped, instructions count: 2496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.m.C(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void D() {
        super.D();
        this.f3013A0 = null;
        this.f3018F0.removeCallbacksAndMessages(null);
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void K() {
        BottomSheetBehavior bottomSheetBehaviorH;
        super.K();
        Dialog dialog = this.v0;
        k3.e eVar = dialog instanceof k3.e ? (k3.e) dialog : null;
        if (eVar == null || (bottomSheetBehaviorH = eVar.h()) == null) {
            return;
        }
        DisplayMetrics displayMetrics = q().getDisplayMetrics();
        q5.i.d(displayMetrics, "getDisplayMetrics(...)");
        int i = displayMetrics.heightPixels;
        bottomSheetBehaviorH.f18157l = i > displayMetrics.widthPixels ? (i * 2) / 3 : (i * 4) / 5;
        bottomSheetBehaviorH.I(3);
        bottomSheetBehaviorH.f18134X = true;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.bottomDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        WifiInfo connectionInfo;
        Integer numValueOf;
        String str2;
        D d6;
        List<ScanResult> list;
        this.f3018F0.postDelayed(this, 1000L);
        ScanResult scanResult = this.f3025M0;
        Object objD = C0412i.f5929a;
        int rssi = -100;
        Integer numValueOf2 = null;
        if (scanResult == null) {
            if (this.f3024L0 != null) {
                WifiManager wifiManager = this.f3022J0;
                if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                    rssi = connectionInfo.getRssi();
                }
                WifiSignalView wifiSignalView = this.f3020H0;
                if (wifiSignalView != null) {
                    wifiSignalView.a(rssi);
                }
                TextView textView = this.f3019G0;
                if (textView != null) {
                    Integer numValueOf3 = Integer.valueOf(rssi);
                    if (R2.a.f3390d) {
                        Locale locale = F4.e.f1457a;
                        str = String.format(F4.e.b(), "%d dBm", Arrays.copyOf(new Object[]{numValueOf3}, 1));
                    } else {
                        str = String.format(Locale.ENGLISH, "%d dBm", Arrays.copyOf(new Object[]{numValueOf3}, 1));
                    }
                    textView.setText(str);
                }
                DiagnosisLevelView diagnosisLevelView = this.f3021I0;
                if (diagnosisLevelView != null) {
                    WifiManager wifiManager2 = this.f3022J0;
                    try {
                        if (Build.VERSION.SDK_INT < 30) {
                            numValueOf2 = Integer.valueOf(WifiManager.calculateSignalLevel(rssi, 5));
                        } else if (wifiManager2 != null) {
                            numValueOf2 = Integer.valueOf(wifiManager2.calculateSignalLevel(rssi));
                        }
                    } catch (Throwable th) {
                        objD = R2.a.d(th);
                    }
                    if (C0409f.a(objD) != null) {
                        numValueOf2 = Integer.valueOf(a4.p.b(rssi));
                    }
                    diagnosisLevelView.setLevel(numValueOf2 != null ? numValueOf2.intValue() : -1);
                    return;
                }
                return;
            }
            return;
        }
        U u6 = this.f3023K0;
        if (u6 == null || (d6 = u6.f4444e) == null || (list = (List) d6.d()) == null) {
            numValueOf = null;
        } else {
            for (ScanResult scanResult2 : list) {
                if (q5.i.a(scanResult.BSSID, scanResult2.BSSID)) {
                    numValueOf = Integer.valueOf(scanResult2.level);
                    break;
                }
            }
            numValueOf = null;
        }
        if (numValueOf == null) {
            WifiSignalView wifiSignalView2 = this.f3020H0;
            if (wifiSignalView2 != null) {
                wifiSignalView2.a(-100);
            }
            TextView textView2 = this.f3019G0;
            if (textView2 != null) {
                textView2.setText(r(R.string.no_signal));
            }
            DiagnosisLevelView diagnosisLevelView2 = this.f3021I0;
            if (diagnosisLevelView2 != null) {
                diagnosisLevelView2.setLevel(-1);
            }
            m1 m1Var = this.f3013A0;
            q5.i.b(m1Var);
            ((MaterialButton) m1Var.f22585e).setEnabled(false);
            return;
        }
        WifiSignalView wifiSignalView3 = this.f3020H0;
        if (wifiSignalView3 != null) {
            wifiSignalView3.a(numValueOf.intValue());
        }
        TextView textView3 = this.f3019G0;
        if (textView3 != null) {
            if (R2.a.f3390d) {
                Locale locale2 = F4.e.f1457a;
                str2 = String.format(F4.e.b(), "%d dBm", Arrays.copyOf(new Object[]{numValueOf}, 1));
            } else {
                str2 = String.format(Locale.ENGLISH, "%d dBm", Arrays.copyOf(new Object[]{numValueOf}, 1));
            }
            textView3.setText(str2);
        }
        DiagnosisLevelView diagnosisLevelView3 = this.f3021I0;
        if (diagnosisLevelView3 != null) {
            int iIntValue = numValueOf.intValue();
            WifiManager wifiManager3 = this.f3022J0;
            try {
                if (Build.VERSION.SDK_INT < 30) {
                    numValueOf2 = Integer.valueOf(WifiManager.calculateSignalLevel(iIntValue, 5));
                } else if (wifiManager3 != null) {
                    numValueOf2 = Integer.valueOf(wifiManager3.calculateSignalLevel(iIntValue));
                }
            } catch (Throwable th2) {
                objD = R2.a.d(th2);
            }
            if (C0409f.a(objD) != null) {
                numValueOf2 = Integer.valueOf(a4.p.b(iIntValue));
            }
            diagnosisLevelView3.setLevel(numValueOf2 != null ? numValueOf2.intValue() : -1);
        }
        m1 m1Var2 = this.f3013A0;
        q5.i.b(m1Var2);
        ((MaterialButton) m1Var2.f22585e).setEnabled(true);
    }
}
