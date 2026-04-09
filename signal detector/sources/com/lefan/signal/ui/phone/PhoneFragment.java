package com.lefan.signal.ui.phone;

import D3.f;
import D4.a;
import F4.b;
import U4.c;
import U4.h;
import U4.j;
import U4.k;
import U4.o;
import U4.p;
import U4.q;
import U4.r;
import U4.v;
import V2.e;
import a4.t;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.CellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.SubscriptionInfo;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import c1.g;
import com.apm.insight.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;
import com.lefan.signal.db.CellInfoBean;
import com.lefan.signal.view.DiagnosisLevelView;
import f.C2314a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.AbstractComponentCallbacksC2617v;
import k0.C2611o;
import n0.d;
import q5.i;

/* loaded from: classes.dex */
public final class PhoneFragment extends AbstractComponentCallbacksC2617v {

    /* renamed from: A0, reason: collision with root package name */
    public TextView f19111A0;

    /* renamed from: B0, reason: collision with root package name */
    public DiagnosisLevelView f19112B0;

    /* renamed from: C0, reason: collision with root package name */
    public TextView f19113C0;

    /* renamed from: D0, reason: collision with root package name */
    public TextView f19114D0;

    /* renamed from: E0, reason: collision with root package name */
    public String f19115E0;

    /* renamed from: F0, reason: collision with root package name */
    public String f19116F0;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f19119I0;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f19120J0;

    /* renamed from: L0, reason: collision with root package name */
    public final Object f19122L0;

    /* renamed from: M0, reason: collision with root package name */
    public final Object f19123M0;

    /* renamed from: N0, reason: collision with root package name */
    public long f19124N0;

    /* renamed from: O0, reason: collision with root package name */
    public final C2611o f19125O0;

    /* renamed from: P0, reason: collision with root package name */
    public final C2611o f19126P0;

    /* renamed from: Q0, reason: collision with root package name */
    public final C2611o f19127Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final C2611o f19128R0;

    /* renamed from: k0, reason: collision with root package name */
    public g f19129k0;

    /* renamed from: o0, reason: collision with root package name */
    public MaterialCardView f19133o0;

    /* renamed from: p0, reason: collision with root package name */
    public MaterialCardView f19134p0;

    /* renamed from: q0, reason: collision with root package name */
    public v f19135q0;

    /* renamed from: s0, reason: collision with root package name */
    public TelephonyManager f19137s0;

    /* renamed from: t0, reason: collision with root package name */
    public SubscriptionInfo f19138t0;

    /* renamed from: y0, reason: collision with root package name */
    public PhoneTrendView f19142y0;

    /* renamed from: z0, reason: collision with root package name */
    public PhoneSignalView f19143z0;

    /* renamed from: l0, reason: collision with root package name */
    public final Handler f19130l0 = new Handler(Looper.getMainLooper());

    /* renamed from: m0, reason: collision with root package name */
    public final String f19131m0 = "android.permission.READ_PHONE_STATE";

    /* renamed from: n0, reason: collision with root package name */
    public final String f19132n0 = "android.permission.ACCESS_FINE_LOCATION";

    /* renamed from: r0, reason: collision with root package name */
    public final ArrayList f19136r0 = new ArrayList();

    /* renamed from: u0, reason: collision with root package name */
    public final a f19139u0 = new a(10);
    public final ArrayList v0 = new ArrayList();

    /* renamed from: w0, reason: collision with root package name */
    public final a f19140w0 = new a(10);

    /* renamed from: x0, reason: collision with root package name */
    public final ArrayList f19141x0 = new ArrayList();

    /* renamed from: G0, reason: collision with root package name */
    public String f19117G0 = "gsm";

    /* renamed from: H0, reason: collision with root package name */
    public final AtomicBoolean f19118H0 = new AtomicBoolean(false);

    /* renamed from: K0, reason: collision with root package name */
    public final ArrayList f19121K0 = new ArrayList();

    public PhoneFragment() {
        int i = Build.VERSION.SDK_INT;
        this.f19122L0 = i >= 31 ? new h(1, this) : new r(this, 0);
        this.f19123M0 = i >= 31 ? new k(1, this) : new r(this, 1);
        this.f19125O0 = (C2611o) P(new C2314a(2), new p(this, 2));
        this.f19126P0 = (C2611o) P(new C2314a(3), new p(this, 3));
        this.f19127Q0 = (C2611o) P(new C2314a(2), new p(this, 4));
        this.f19128R0 = (C2611o) P(new C2314a(3), new b(20));
    }

    public static final void X(PhoneFragment phoneFragment, List list) {
        Object obj;
        a aVar = phoneFragment.f19139u0;
        a aVar2 = phoneFragment.f19140w0;
        ArrayList arrayList = phoneFragment.v0;
        ArrayList arrayList2 = phoneFragment.f19141x0;
        ArrayList arrayList3 = phoneFragment.f19121K0;
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
            arrayList3.add(R2.a.m(phoneFragment.f19115E0, phoneFragment.f19116F0, (CellInfo) it.next(), phoneFragment.m()));
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
        if (phoneFragment.v()) {
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
    public static final void Y(com.lefan.signal.ui.phone.PhoneFragment r22, android.telephony.SignalStrength r23) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.phone.PhoneFragment.Y(com.lefan.signal.ui.phone.PhoneFragment, android.telephony.SignalStrength):void");
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) throws NumberFormatException {
        Button button;
        i.e(layoutInflater, "inflater");
        a0 a0VarD = d();
        Z zN = n();
        d dVarC = c();
        i.e(zN, "factory");
        e eVar = new e(a0VarD, zN, dVarC);
        q5.d dVarA = q5.p.a(v.class);
        String strS = com.bumptech.glide.d.s(dVarA);
        if (strS == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f19135q0 = (v) eVar.q(dVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strS));
        View viewInflate = layoutInflater.inflate(R.layout.fragment_phone, viewGroup, false);
        int i = R.id.mobile_info;
        View viewE = a4.p.e(R.id.mobile_info, viewInflate);
        if (viewE != null) {
            K4.b bVarA = K4.b.a(viewE);
            i = R.id.tab_layout;
            TabLayout tabLayout = (TabLayout) a4.p.e(R.id.tab_layout, viewInflate);
            if (tabLayout != null) {
                i = R.id.viewpage;
                ViewPager2 viewPager2 = (ViewPager2) a4.p.e(R.id.viewpage, viewInflate);
                if (viewPager2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.f19129k0 = new g(constraintLayout, bVarA, tabLayout, viewPager2, 7);
                    i.d(constraintLayout, "getRoot(...)");
                    g gVar = this.f19129k0;
                    i.b(gVar);
                    this.f19133o0 = (MaterialCardView) ((K4.b) gVar.f5897c).f2204k;
                    g gVar2 = this.f19129k0;
                    i.b(gVar2);
                    ((K4.b) gVar2.f5897c).f2205l.setOnClickListener(new q(this, 1));
                    g gVar3 = this.f19129k0;
                    i.b(gVar3);
                    this.f19134p0 = ((K4.b) gVar3.f5897c).f2197c;
                    g gVar4 = this.f19129k0;
                    i.b(gVar4);
                    this.f19142y0 = (PhoneTrendView) ((K4.b) gVar4.f5897c).f2194J;
                    g gVar5 = this.f19129k0;
                    i.b(gVar5);
                    this.f19143z0 = (PhoneSignalView) ((K4.b) gVar5.f5897c).f2187C;
                    g gVar6 = this.f19129k0;
                    i.b(gVar6);
                    this.f19111A0 = (TextView) ((K4.b) gVar6.f5897c).f2207n;
                    g gVar7 = this.f19129k0;
                    i.b(gVar7);
                    this.f19112B0 = (DiagnosisLevelView) ((K4.b) gVar7.f5897c).f2206m;
                    g gVar8 = this.f19129k0;
                    i.b(gVar8);
                    this.f19113C0 = (TextView) ((K4.b) gVar8.f5897c).f2193I;
                    g gVar9 = this.f19129k0;
                    i.b(gVar9);
                    this.f19114D0 = ((K4.b) gVar9.f5897c).f2192H;
                    g gVar10 = this.f19129k0;
                    i.b(gVar10);
                    ((MaterialCardView) ((K4.b) gVar10.f5897c).f2189E).setOnClickListener(new q(this, 3));
                    DiagnosisLevelView diagnosisLevelView = this.f19112B0;
                    if (diagnosisLevelView == null) {
                        i.g("signalLevelView");
                        throw null;
                    }
                    diagnosisLevelView.setOnClickListener(new q(this, 4));
                    g gVar11 = this.f19129k0;
                    i.b(gVar11);
                    ((MaterialCardView) ((K4.b) gVar11.f5897c).f2188D).setOnClickListener(new q(this, 5));
                    g gVar12 = this.f19129k0;
                    i.b(gVar12);
                    RecyclerView recyclerView = (RecyclerView) ((K4.b) gVar12.f5897c).f2199e;
                    a aVar = this.f19140w0;
                    recyclerView.setAdapter(aVar);
                    aVar.n(R.layout.empty_no_data_tip);
                    FrameLayout frameLayout = aVar.f4670d;
                    FrameLayout frameLayout2 = frameLayout != null ? frameLayout : null;
                    if (frameLayout2 != null && (button = (Button) frameLayout2.findViewById(R.id.empty_tip_btn)) != null) {
                        button.setOnClickListener(new q(this, 2));
                    }
                    aVar.p(this.f19141x0);
                    g gVar13 = this.f19129k0;
                    i.b(gVar13);
                    RecyclerView recyclerView2 = ((K4.b) gVar13.f5897c).f2196b;
                    a aVar2 = this.f19139u0;
                    recyclerView2.setAdapter(aVar2);
                    aVar2.n(R.layout.empty_no_data);
                    aVar2.p(this.v0);
                    Z();
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void D() {
        this.f21694R = true;
        this.f19130l0.removeCallbacksAndMessages(null);
        this.f19118H0.set(false);
        this.f19129k0 = null;
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void H() {
        this.f21694R = true;
        if (this.f19120J0) {
            this.f19120J0 = false;
            int i = Build.VERSION.SDK_INT;
            Object obj = this.f19123M0;
            if (i >= 31) {
                TelephonyManager telephonyManager = this.f19137s0;
                if (telephonyManager != null) {
                    i.c(obj, "null cannot be cast to non-null type android.telephony.TelephonyCallback");
                    telephonyManager.unregisterTelephonyCallback(f.h(obj));
                }
            } else {
                TelephonyManager telephonyManager2 = this.f19137s0;
                if (telephonyManager2 != null) {
                    i.c(obj, "null cannot be cast to non-null type android.telephony.PhoneStateListener");
                    telephonyManager2.listen((PhoneStateListener) obj, 0);
                }
            }
        }
        if (this.f19119I0) {
            this.f19119I0 = false;
            int i3 = Build.VERSION.SDK_INT;
            Object obj2 = this.f19122L0;
            if (i3 >= 31) {
                TelephonyManager telephonyManager3 = this.f19137s0;
                if (telephonyManager3 != null) {
                    i.c(obj2, "null cannot be cast to non-null type com.lefan.signal.ui.phone.CellInfoListenerApis");
                    telephonyManager3.unregisterTelephonyCallback(f.h((c) obj2));
                    return;
                }
                return;
            }
            TelephonyManager telephonyManager4 = this.f19137s0;
            if (telephonyManager4 != null) {
                i.c(obj2, "null cannot be cast to non-null type android.telephony.PhoneStateListener");
                telephonyManager4.listen((PhoneStateListener) obj2, 0);
            }
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void I() {
        PackageManager packageManager;
        this.f21694R = true;
        if (this.f19137s0 == null) {
            return;
        }
        Context contextM = m();
        String str = this.f19131m0;
        i.e(str, "string");
        if (contextM != null && G.c.a(contextM, str) == 0) {
            Context contextM2 = m();
            String str2 = this.f19132n0;
            i.e(str2, "string");
            if (contextM2 == null || G.c.a(contextM2, str2) != 0) {
                MaterialCardView materialCardView = this.f19134p0;
                if (materialCardView == null) {
                    i.g("locationTip");
                    throw null;
                }
                materialCardView.setVisibility(0);
                g gVar = this.f19129k0;
                i.b(gVar);
                ((K4.b) gVar.f5897c).f2200f.setText(r(R.string.mobile_cell_need_location));
                g gVar2 = this.f19129k0;
                i.b(gVar2);
                ((K4.b) gVar2.f5897c).f2201g.setOnClickListener(new q(this, 6));
                b0();
                return;
            }
            if (!t.l(m())) {
                b0();
                g gVar3 = this.f19129k0;
                i.b(gVar3);
                ((K4.b) gVar3.f5897c).f2200f.setText(r(R.string.phone_is_need_gps));
                g gVar4 = this.f19129k0;
                i.b(gVar4);
                ((K4.b) gVar4.f5897c).f2201g.setOnClickListener(new q(this, 7));
                MaterialCardView materialCardView2 = this.f19134p0;
                if (materialCardView2 != null) {
                    materialCardView2.setVisibility(0);
                    return;
                } else {
                    i.g("locationTip");
                    throw null;
                }
            }
            MaterialCardView materialCardView3 = this.f19134p0;
            if (materialCardView3 == null) {
                i.g("locationTip");
                throw null;
            }
            materialCardView3.setVisibility(8);
            if (this.f19119I0) {
                return;
            }
            this.f19119I0 = true;
            int i = Build.VERSION.SDK_INT;
            Object obj = this.f19122L0;
            if (i >= 31) {
                TelephonyManager telephonyManager = this.f19137s0;
                if (telephonyManager != null) {
                    o oVar = new o(this, 0);
                    i.c(obj, "null cannot be cast to non-null type com.lefan.signal.ui.phone.CellInfoListenerApis");
                    telephonyManager.registerTelephonyCallback(oVar, f.h((c) obj));
                }
            } else {
                TelephonyManager telephonyManager2 = this.f19137s0;
                if (telephonyManager2 != null) {
                    i.c(obj, "null cannot be cast to non-null type android.telephony.PhoneStateListener");
                    telephonyManager2.listen((PhoneStateListener) obj, 1281);
                }
            }
            if (this.f19121K0.isEmpty()) {
                if (i < 29) {
                    TelephonyManager telephonyManager3 = this.f19137s0;
                    if (telephonyManager3 != null) {
                        telephonyManager3.getAllCellInfo();
                        return;
                    }
                    return;
                }
                Context contextM3 = m();
                if (contextM3 == null || (packageManager = contextM3.getPackageManager()) == null || !packageManager.hasSystemFeature("android.hardware.telephony.radio.access")) {
                    TelephonyManager telephonyManager4 = this.f19137s0;
                    if (telephonyManager4 != null) {
                        telephonyManager4.getAllCellInfo();
                        return;
                    }
                    return;
                }
                TelephonyManager telephonyManager5 = this.f19137s0;
                if (telephonyManager5 != null) {
                    telephonyManager5.requestCellInfoUpdate(new o(this, 1), new j());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z() throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.phone.PhoneFragment.Z():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0() {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.phone.PhoneFragment.a0():void");
    }

    public final void b0() {
        if (this.f19120J0) {
            return;
        }
        this.f19120J0 = true;
        int i = Build.VERSION.SDK_INT;
        Object obj = this.f19123M0;
        if (i < 31) {
            TelephonyManager telephonyManager = this.f19137s0;
            if (telephonyManager != null) {
                i.c(obj, "null cannot be cast to non-null type android.telephony.PhoneStateListener");
                telephonyManager.listen((PhoneStateListener) obj, 257);
                return;
            }
            return;
        }
        TelephonyManager telephonyManager2 = this.f19137s0;
        if (telephonyManager2 != null) {
            o oVar = new o(this, 2);
            i.c(obj, "null cannot be cast to non-null type android.telephony.TelephonyCallback");
            telephonyManager2.registerTelephonyCallback(oVar, f.h(obj));
        }
    }
}
