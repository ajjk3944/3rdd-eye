package U4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.CellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.SubscriptionInfo;
import android.telephony.TelephonyManager;
import android.widget.TextView;
import com.apm.insight.R;
import com.google.android.material.card.MaterialCardView;
import com.lefan.signal.db.CellInfoBean;
import com.lefan.signal.ui.phone.PhoneSignalView;
import com.lefan.signal.ui.phone.PhoneTrendView;
import com.lefan.signal.view.DiagnosisLevelView;
import f.C2314a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.AbstractComponentCallbacksC2617v;
import k0.C2611o;

/* loaded from: classes.dex */
public final class l extends AbstractComponentCallbacksC2617v {

    /* renamed from: A0, reason: collision with root package name */
    public TextView f3720A0;

    /* renamed from: B0, reason: collision with root package name */
    public TextView f3721B0;

    /* renamed from: C0, reason: collision with root package name */
    public String f3722C0;

    /* renamed from: D0, reason: collision with root package name */
    public String f3723D0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f3725F0;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f3726G0;

    /* renamed from: J0, reason: collision with root package name */
    public final Object f3729J0;

    /* renamed from: K0, reason: collision with root package name */
    public final Object f3730K0;

    /* renamed from: L0, reason: collision with root package name */
    public long f3731L0;

    /* renamed from: M0, reason: collision with root package name */
    public final C2611o f3732M0;

    /* renamed from: N0, reason: collision with root package name */
    public final C2611o f3733N0;

    /* renamed from: k0, reason: collision with root package name */
    public K4.b f3734k0;

    /* renamed from: o0, reason: collision with root package name */
    public TelephonyManager f3738o0;

    /* renamed from: p0, reason: collision with root package name */
    public SubscriptionInfo f3739p0;

    /* renamed from: q0, reason: collision with root package name */
    public v f3740q0;

    /* renamed from: r0, reason: collision with root package name */
    public MaterialCardView f3741r0;

    /* renamed from: s0, reason: collision with root package name */
    public PhoneTrendView f3742s0;

    /* renamed from: t0, reason: collision with root package name */
    public PhoneSignalView f3743t0;

    /* renamed from: u0, reason: collision with root package name */
    public TextView f3744u0;
    public DiagnosisLevelView v0;

    /* renamed from: l0, reason: collision with root package name */
    public final String f3735l0 = "android.permission.ACCESS_FINE_LOCATION";

    /* renamed from: m0, reason: collision with root package name */
    public final String f3736m0 = "android.permission.READ_PHONE_STATE";

    /* renamed from: n0, reason: collision with root package name */
    public final Handler f3737n0 = new Handler(Looper.getMainLooper());

    /* renamed from: w0, reason: collision with root package name */
    public final D4.a f3745w0 = new D4.a(10);

    /* renamed from: x0, reason: collision with root package name */
    public final ArrayList f3746x0 = new ArrayList();

    /* renamed from: y0, reason: collision with root package name */
    public final D4.a f3747y0 = new D4.a(10);

    /* renamed from: z0, reason: collision with root package name */
    public final ArrayList f3748z0 = new ArrayList();

    /* renamed from: E0, reason: collision with root package name */
    public final ArrayList f3724E0 = new ArrayList();

    /* renamed from: H0, reason: collision with root package name */
    public String f3727H0 = "gsm";

    /* renamed from: I0, reason: collision with root package name */
    public final AtomicBoolean f3728I0 = new AtomicBoolean(false);

    public l() {
        int i = Build.VERSION.SDK_INT;
        this.f3729J0 = i >= 31 ? new h(0, this) : new i(this, 0);
        this.f3730K0 = i >= 31 ? new k(0, this) : new i(this, 1);
        this.f3732M0 = (C2611o) P(new C2314a(2), new F4.c(11, this));
        this.f3733N0 = (C2611o) P(new C2314a(3), new F4.b(19));
    }

    public static final void X(l lVar, List list) {
        Object obj;
        D4.a aVar = lVar.f3745w0;
        D4.a aVar2 = lVar.f3747y0;
        ArrayList arrayList = lVar.f3746x0;
        ArrayList arrayList2 = lVar.f3748z0;
        ArrayList arrayList3 = lVar.f3724E0;
        arrayList3.clear();
        if (list == null) {
            arrayList2.clear();
            arrayList.clear();
            aVar2.notifyDataSetChanged();
            aVar.notifyDataSetChanged();
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(R2.a.m(lVar.f3722C0, lVar.f3723D0, (CellInfo) it.next(), lVar.m()));
        }
        int size = arrayList3.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList3.get(i);
            i++;
            if (((CellInfoBean) obj).isRegistered()) {
                break;
            }
        }
        CellInfoBean cellInfoBean = (CellInfoBean) obj;
        arrayList2.clear();
        arrayList.clear();
        if (cellInfoBean != null) {
            arrayList2.add(cellInfoBean);
            arrayList3.remove(cellInfoBean);
        }
        arrayList.addAll(arrayList3);
        if (lVar.v()) {
            aVar2.notifyDataSetChanged();
            aVar.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Y(U4.l r22, android.telephony.SignalStrength r23) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.l.Y(U4.l, android.telephony.SignalStrength):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ec  */
    @Override // k0.AbstractComponentCallbacksC2617v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View C(android.view.LayoutInflater r6, android.view.ViewGroup r7) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.l.C(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void D() {
        this.f21694R = true;
        this.f3734k0 = null;
        this.f3737n0.removeCallbacksAndMessages(null);
        this.f3728I0.set(false);
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void H() {
        this.f21694R = true;
        if (this.f3726G0) {
            this.f3726G0 = false;
            int i = Build.VERSION.SDK_INT;
            Object obj = this.f3730K0;
            if (i >= 31) {
                TelephonyManager telephonyManager = this.f3738o0;
                if (telephonyManager != null) {
                    q5.i.c(obj, "null cannot be cast to non-null type android.telephony.TelephonyCallback");
                    telephonyManager.unregisterTelephonyCallback(D3.f.h(obj));
                }
            } else {
                TelephonyManager telephonyManager2 = this.f3738o0;
                if (telephonyManager2 != null) {
                    q5.i.c(obj, "null cannot be cast to non-null type android.telephony.PhoneStateListener");
                    telephonyManager2.listen((PhoneStateListener) obj, 0);
                }
            }
        }
        if (this.f3725F0) {
            this.f3725F0 = false;
            int i3 = Build.VERSION.SDK_INT;
            Object obj2 = this.f3729J0;
            if (i3 >= 31) {
                TelephonyManager telephonyManager3 = this.f3738o0;
                if (telephonyManager3 != null) {
                    q5.i.c(obj2, "null cannot be cast to non-null type com.lefan.signal.ui.phone.CellInfoListenerApis");
                    telephonyManager3.unregisterTelephonyCallback(D3.f.h((c) obj2));
                    return;
                }
                return;
            }
            TelephonyManager telephonyManager4 = this.f3738o0;
            if (telephonyManager4 != null) {
                q5.i.c(obj2, "null cannot be cast to non-null type android.telephony.PhoneStateListener");
                telephonyManager4.listen((PhoneStateListener) obj2, 0);
            }
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void I() {
        LocationManager locationManager;
        PackageManager packageManager;
        this.f21694R = true;
        if (this.f3738o0 == null) {
            return;
        }
        Context contextM = m();
        String str = this.f3736m0;
        q5.i.e(str, "string");
        if (contextM != null && G.c.a(contextM, str) == 0) {
            Context contextM2 = m();
            String str2 = this.f3735l0;
            q5.i.e(str2, "string");
            if (contextM2 == null || G.c.a(contextM2, str2) != 0) {
                MaterialCardView materialCardView = this.f3741r0;
                if (materialCardView == null) {
                    q5.i.g("locationTip");
                    throw null;
                }
                materialCardView.setVisibility(0);
                K4.b bVar = this.f3734k0;
                q5.i.b(bVar);
                bVar.f2200f.setText(r(R.string.mobile_cell_need_location));
                K4.b bVar2 = this.f3734k0;
                q5.i.b(bVar2);
                bVar2.f2201g.setOnClickListener(new f(this, 0));
                Z();
                return;
            }
            Context contextM3 = m();
            if (!((contextM3 == null || (locationManager = (LocationManager) contextM3.getSystemService("location")) == null || !locationManager.getAllProviders().contains("gps")) ? false : locationManager.isProviderEnabled("gps"))) {
                Z();
                K4.b bVar3 = this.f3734k0;
                q5.i.b(bVar3);
                bVar3.f2200f.setText(r(R.string.phone_is_need_gps));
                K4.b bVar4 = this.f3734k0;
                q5.i.b(bVar4);
                bVar4.f2201g.setOnClickListener(new f(this, 1));
                MaterialCardView materialCardView2 = this.f3741r0;
                if (materialCardView2 != null) {
                    materialCardView2.setVisibility(0);
                    return;
                } else {
                    q5.i.g("locationTip");
                    throw null;
                }
            }
            MaterialCardView materialCardView3 = this.f3741r0;
            if (materialCardView3 == null) {
                q5.i.g("locationTip");
                throw null;
            }
            materialCardView3.setVisibility(8);
            if (this.f3725F0) {
                return;
            }
            this.f3725F0 = true;
            int i = Build.VERSION.SDK_INT;
            Object obj = this.f3729J0;
            if (i >= 31) {
                TelephonyManager telephonyManager = this.f3738o0;
                if (telephonyManager != null) {
                    g gVar = new g(0, this);
                    q5.i.c(obj, "null cannot be cast to non-null type com.lefan.signal.ui.phone.CellInfoListenerApis");
                    telephonyManager.registerTelephonyCallback(gVar, D3.f.h((c) obj));
                }
            } else {
                TelephonyManager telephonyManager2 = this.f3738o0;
                if (telephonyManager2 != null) {
                    q5.i.c(obj, "null cannot be cast to non-null type android.telephony.PhoneStateListener");
                    telephonyManager2.listen((PhoneStateListener) obj, 1281);
                }
            }
            if (this.f3724E0.isEmpty()) {
                if (i < 29) {
                    TelephonyManager telephonyManager3 = this.f3738o0;
                    if (telephonyManager3 != null) {
                        telephonyManager3.getAllCellInfo();
                        return;
                    }
                    return;
                }
                Context contextM4 = m();
                if (contextM4 == null || (packageManager = contextM4.getPackageManager()) == null || !packageManager.hasSystemFeature("android.hardware.telephony.radio.access")) {
                    TelephonyManager telephonyManager4 = this.f3738o0;
                    if (telephonyManager4 != null) {
                        telephonyManager4.getAllCellInfo();
                        return;
                    }
                    return;
                }
                TelephonyManager telephonyManager5 = this.f3738o0;
                if (telephonyManager5 != null) {
                    telephonyManager5.requestCellInfoUpdate(new g(2, this), new j());
                }
            }
        }
    }

    public final void Z() {
        if (this.f3726G0) {
            return;
        }
        this.f3726G0 = true;
        int i = Build.VERSION.SDK_INT;
        Object obj = this.f3730K0;
        if (i < 31) {
            TelephonyManager telephonyManager = this.f3738o0;
            if (telephonyManager != null) {
                q5.i.c(obj, "null cannot be cast to non-null type android.telephony.PhoneStateListener");
                telephonyManager.listen((PhoneStateListener) obj, 257);
                return;
            }
            return;
        }
        TelephonyManager telephonyManager2 = this.f3738o0;
        if (telephonyManager2 != null) {
            g gVar = new g(1, this);
            q5.i.c(obj, "null cannot be cast to non-null type android.telephony.TelephonyCallback");
            telephonyManager2.registerTelephonyCallback(gVar, D3.f.h(obj));
        }
    }
}
