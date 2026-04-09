package U4;

import android.app.Dialog;
import android.telephony.SubscriptionInfo;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.apm.insight.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z extends k3.f {

    /* renamed from: A0, reason: collision with root package name */
    public V2.e f3779A0;

    /* renamed from: B0, reason: collision with root package name */
    public final D4.a f3780B0 = new D4.a(12, false);

    /* renamed from: C0, reason: collision with root package name */
    public final ArrayList f3781C0 = new ArrayList();

    /* renamed from: D0, reason: collision with root package name */
    public final D4.a f3782D0 = new D4.a(12, false);

    /* renamed from: E0, reason: collision with root package name */
    public final ArrayList f3783E0 = new ArrayList();

    /* renamed from: F0, reason: collision with root package name */
    public TelephonyManager f3784F0;

    /* renamed from: G0, reason: collision with root package name */
    public SubscriptionInfo f3785G0;

    /* JADX WARN: Removed duplicated region for block: B:140:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x096b A[Catch: all -> 0x097b, LOOP:0: B:299:0x0965->B:301:0x096b, LOOP_END, TryCatch #0 {all -> 0x097b, blocks: (B:298:0x0949, B:299:0x0965, B:301:0x096b, B:304:0x097d), top: B:410:0x0949 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0a43  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0b0d  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0b7a  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0c5a  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0c70  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0c94  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b1  */
    @Override // k0.AbstractComponentCallbacksC2617v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View C(android.view.LayoutInflater r27, android.view.ViewGroup r28) {
        /*
            Method dump skipped, instructions count: 3354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.z.C(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void D() {
        super.D();
        this.f3779A0 = null;
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
}
