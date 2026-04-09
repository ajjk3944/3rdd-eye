package com.lefan.signal.ui.wifi;

import A1.t;
import D4.c;
import F4.b;
import K4.o;
import R2.a;
import V2.e;
import Y4.L;
import Y4.M;
import Y4.S;
import Y4.U;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.C0314k;
import androidx.recyclerview.widget.RecyclerView;
import c5.C0408e;
import c5.C0409f;
import c5.C0410g;
import c5.C0412i;
import com.apm.insight.R;
import com.lefan.signal.MyApplication;
import com.lefan.signal.view.DiagnosisLevelView;
import f.C2314a;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Locale;
import k0.AbstractComponentCallbacksC2617v;
import k0.C2611o;
import n0.d;
import q5.i;
import q5.p;

/* loaded from: classes.dex */
public final class WifiFragment extends AbstractComponentCallbacksC2617v implements Runnable {

    /* renamed from: A0, reason: collision with root package name */
    public TextView f19412A0;

    /* renamed from: B0, reason: collision with root package name */
    public TextView f19413B0;

    /* renamed from: C0, reason: collision with root package name */
    public LinearLayoutCompat f19414C0;

    /* renamed from: D0, reason: collision with root package name */
    public WifiListView f19415D0;

    /* renamed from: E0, reason: collision with root package name */
    public TextView f19416E0;

    /* renamed from: F0, reason: collision with root package name */
    public WifiSignalView f19417F0;

    /* renamed from: G0, reason: collision with root package name */
    public ProgressBar f19418G0;

    /* renamed from: H0, reason: collision with root package name */
    public TextView f19419H0;

    /* renamed from: I0, reason: collision with root package name */
    public DiagnosisLevelView f19420I0;

    /* renamed from: J0, reason: collision with root package name */
    public AppCompatImageView f19421J0;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f19422K0;

    /* renamed from: Q0, reason: collision with root package name */
    public long f19428Q0;

    /* renamed from: k0, reason: collision with root package name */
    public o f19431k0;

    /* renamed from: o0, reason: collision with root package name */
    public WifiManager f19435o0;

    /* renamed from: p0, reason: collision with root package name */
    public U f19436p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f19437q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f19438r0;

    /* renamed from: s0, reason: collision with root package name */
    public e f19439s0;

    /* renamed from: t0, reason: collision with root package name */
    public e f19440t0;

    /* renamed from: u0, reason: collision with root package name */
    public LinearLayoutCompat f19441u0;
    public AppCompatTextView v0;

    /* renamed from: w0, reason: collision with root package name */
    public TextView f19442w0;

    /* renamed from: x0, reason: collision with root package name */
    public TextView f19443x0;

    /* renamed from: y0, reason: collision with root package name */
    public AppCompatTextView f19444y0;

    /* renamed from: z0, reason: collision with root package name */
    public TextView f19445z0;

    /* renamed from: l0, reason: collision with root package name */
    public final C0410g f19432l0 = new C0410g(new c(11, this));

    /* renamed from: m0, reason: collision with root package name */
    public final Handler f19433m0 = new Handler(Looper.getMainLooper());

    /* renamed from: n0, reason: collision with root package name */
    public final String f19434n0 = "android.permission.ACCESS_FINE_LOCATION";

    /* renamed from: L0, reason: collision with root package name */
    public final t f19423L0 = new t(4, this);

    /* renamed from: M0, reason: collision with root package name */
    public final ArrayList f19424M0 = new ArrayList();

    /* renamed from: N0, reason: collision with root package name */
    public final S f19425N0 = new S(R.layout.item_wifi_info2);

    /* renamed from: O0, reason: collision with root package name */
    public final int[] f19426O0 = {Color.parseColor("#FAD455"), Color.parseColor("#FA8855"), Color.parseColor("#87BDE3"), Color.parseColor("#5F76FA"), Color.parseColor("#E55D5D"), Color.parseColor("#46D0C1"), Color.parseColor("#B58EEA"), Color.parseColor("#E9DFD5"), Color.parseColor("#EA8EE6")};

    /* renamed from: P0, reason: collision with root package name */
    public final ArrayList f19427P0 = new ArrayList();

    /* renamed from: R0, reason: collision with root package name */
    public final C2611o f19429R0 = (C2611o) P(new C2314a(2), new M(this));

    /* renamed from: S0, reason: collision with root package name */
    public final C2611o f19430S0 = (C2611o) P(new C2314a(3), new b(23));

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object X(com.lefan.signal.ui.wifi.WifiFragment r5, java.lang.String r6, j5.b r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof Y4.O
            if (r0 == 0) goto L13
            r0 = r7
            Y4.O r0 = (Y4.O) r0
            int r1 = r0.f4426g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4426g = r1
            goto L18
        L13:
            Y4.O r0 = new Y4.O
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f4424e
            int r1 = r0.f4426g
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            q5.o r5 = r0.f4423d
            R2.a.H(r7)
            goto L4d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            R2.a.H(r7)
            q5.o r7 = new q5.o
            r7.<init>()
            G5.d r1 = z5.D.f24486b
            Y4.P r3 = new Y4.P
            r4 = 0
            r3.<init>(r7, r6, r5, r4)
            r0.f4423d = r7
            r0.f4426g = r2
            java.lang.Object r5 = z5.AbstractC3046w.r(r1, r0, r3)
            i5.a r6 = i5.EnumC2380a.f20635a
            if (r5 != r6) goto L4c
            return r6
        L4c:
            r5 = r7
        L4d:
            java.lang.Object r5 = r5.f23299a
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L55
            java.lang.String r5 = "--"
        L55:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.wifi.WifiFragment.X(com.lefan.signal.ui.wifi.WifiFragment, java.lang.String, j5.b):java.lang.Object");
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        i.e(layoutInflater, "inflater");
        a0 a0VarD = d();
        Z zN = n();
        d dVarC = c();
        i.e(zN, "factory");
        e eVar = new e(a0VarD, zN, dVarC);
        q5.d dVarA = p.a(U.class);
        String strS = com.bumptech.glide.d.s(dVarA);
        if (strS == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f19436p0 = (U) eVar.q(dVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strS));
        View viewInflate = layoutInflater.inflate(R.layout.fragment_wifi, viewGroup, false);
        int i = R.id.scan_result_num;
        TextView textView = (TextView) a4.p.e(R.id.scan_result_num, viewInflate);
        if (textView != null) {
            i = R.id.signal_level_view;
            DiagnosisLevelView diagnosisLevelView = (DiagnosisLevelView) a4.p.e(R.id.signal_level_view, viewInflate);
            if (diagnosisLevelView != null) {
                i = R.id.wifi_connection_btn;
                AppCompatTextView appCompatTextView = (AppCompatTextView) a4.p.e(R.id.wifi_connection_btn, viewInflate);
                if (appCompatTextView != null) {
                    i = R.id.wifi_connection_loading;
                    ProgressBar progressBar = (ProgressBar) a4.p.e(R.id.wifi_connection_loading, viewInflate);
                    if (progressBar != null) {
                        i = R.id.wifi_connection_name;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) a4.p.e(R.id.wifi_connection_name, viewInflate);
                        if (appCompatTextView2 != null) {
                            i = R.id.wifi_detection;
                            LinearLayout linearLayout = (LinearLayout) a4.p.e(R.id.wifi_detection, viewInflate);
                            if (linearLayout != null) {
                                i = R.id.wifi_device;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) a4.p.e(R.id.wifi_device, viewInflate);
                                if (linearLayoutCompat != null) {
                                    i = R.id.wifi_device_phone;
                                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) a4.p.e(R.id.wifi_device_phone, viewInflate);
                                    if (linearLayoutCompat2 != null) {
                                        i = R.id.wifi_device_phone_ip;
                                        TextView textView2 = (TextView) a4.p.e(R.id.wifi_device_phone_ip, viewInflate);
                                        if (textView2 != null) {
                                            i = R.id.wifi_device_phone_mac;
                                            TextView textView3 = (TextView) a4.p.e(R.id.wifi_device_phone_mac, viewInflate);
                                            if (textView3 != null) {
                                                i = R.id.wifi_device_phone_name;
                                                TextView textView4 = (TextView) a4.p.e(R.id.wifi_device_phone_name, viewInflate);
                                                if (textView4 != null) {
                                                    i = R.id.wifi_device_router;
                                                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) a4.p.e(R.id.wifi_device_router, viewInflate);
                                                    if (linearLayoutCompat3 != null) {
                                                        i = R.id.wifi_device_router_ip;
                                                        TextView textView5 = (TextView) a4.p.e(R.id.wifi_device_router_ip, viewInflate);
                                                        if (textView5 != null) {
                                                            i = R.id.wifi_device_router_mac;
                                                            TextView textView6 = (TextView) a4.p.e(R.id.wifi_device_router_mac, viewInflate);
                                                            if (textView6 != null) {
                                                                i = R.id.wifi_device_router_name;
                                                                TextView textView7 = (TextView) a4.p.e(R.id.wifi_device_router_name, viewInflate);
                                                                if (textView7 != null) {
                                                                    i = R.id.wifi_exchange;
                                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) a4.p.e(R.id.wifi_exchange, viewInflate);
                                                                    if (appCompatImageView != null) {
                                                                        i = R.id.wifi_info_empty;
                                                                        View viewE = a4.p.e(R.id.wifi_info_empty, viewInflate);
                                                                        if (viewE != null) {
                                                                            e eVarK = e.k(viewE);
                                                                            i = R.id.wifi_list_recycler;
                                                                            RecyclerView recyclerView = (RecyclerView) a4.p.e(R.id.wifi_list_recycler, viewInflate);
                                                                            if (recyclerView != null) {
                                                                                i = R.id.wifi_list_view;
                                                                                WifiListView wifiListView = (WifiListView) a4.p.e(R.id.wifi_list_view, viewInflate);
                                                                                if (wifiListView != null) {
                                                                                    i = R.id.wifi_not_location;
                                                                                    View viewE2 = a4.p.e(R.id.wifi_not_location, viewInflate);
                                                                                    if (viewE2 != null) {
                                                                                        e eVarK2 = e.k(viewE2);
                                                                                        i = R.id.wifi_ping_more;
                                                                                        LinearLayout linearLayout2 = (LinearLayout) a4.p.e(R.id.wifi_ping_more, viewInflate);
                                                                                        if (linearLayout2 != null) {
                                                                                            i = R.id.wifi_router_rel;
                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) a4.p.e(R.id.wifi_router_rel, viewInflate);
                                                                                            if (constraintLayout != null) {
                                                                                                i = R.id.wifi_signal_val;
                                                                                                TextView textView8 = (TextView) a4.p.e(R.id.wifi_signal_val, viewInflate);
                                                                                                if (textView8 != null) {
                                                                                                    i = R.id.wifi_signal_view;
                                                                                                    WifiSignalView wifiSignalView = (WifiSignalView) a4.p.e(R.id.wifi_signal_view, viewInflate);
                                                                                                    if (wifiSignalView != null) {
                                                                                                        i = R.id.wifi_standard_img;
                                                                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) a4.p.e(R.id.wifi_standard_img, viewInflate);
                                                                                                        if (appCompatImageView2 != null) {
                                                                                                            i = R.id.wifi_survey;
                                                                                                            LinearLayout linearLayout3 = (LinearLayout) a4.p.e(R.id.wifi_survey, viewInflate);
                                                                                                            if (linearLayout3 != null) {
                                                                                                                i = R.id.wifi_trace;
                                                                                                                LinearLayout linearLayout4 = (LinearLayout) a4.p.e(R.id.wifi_trace, viewInflate);
                                                                                                                if (linearLayout4 != null) {
                                                                                                                    NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                                                                                                    this.f19431k0 = new o(nestedScrollView, textView, diagnosisLevelView, appCompatTextView, progressBar, appCompatTextView2, linearLayout, linearLayoutCompat, linearLayoutCompat2, textView2, textView3, textView4, linearLayoutCompat3, textView5, textView6, textView7, appCompatImageView, eVarK, recyclerView, wifiListView, eVarK2, linearLayout2, constraintLayout, textView8, wifiSignalView, appCompatImageView2, linearLayout3, linearLayout4);
                                                                                                                    i.d(nestedScrollView, "getRoot(...)");
                                                                                                                    return nestedScrollView;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void D() {
        this.f21694R = true;
        this.f19431k0 = null;
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void H() {
        this.f21694R = true;
        try {
            Context contextM = m();
            if (contextM != null) {
                contextM.unregisterReceiver(this.f19423L0);
            }
        } catch (Throwable th) {
            a.d(th);
        }
        this.f19433m0.removeCallbacks(this);
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void I() {
        this.f21694R = true;
        U u6 = this.f19436p0;
        if (u6 == null) {
            i.g("viewModel");
            throw null;
        }
        WifiManager wifiManager = this.f19435o0;
        u6.e(wifiManager != null ? wifiManager.getConnectionInfo() : null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("wifi_state");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        int i = Build.VERSION.SDK_INT;
        t tVar = this.f19423L0;
        if (i >= 33) {
            Context contextM = m();
            if (contextM != null) {
                contextM.registerReceiver(tVar, intentFilter, 4);
            }
        } else {
            Context contextM2 = m();
            if (contextM2 != null) {
                contextM2.registerReceiver(tVar, intentFilter);
            }
        }
        this.f19433m0.postDelayed(this, 1000L);
        Y();
        boolean z6 = MyApplication.f18812d;
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void M(View view) {
        Object objD;
        Object obj;
        i.e(view, "view");
        Context contextM = m();
        this.f19435o0 = (WifiManager) (contextM != null ? contextM.getSystemService("wifi") : null);
        o oVar = this.f19431k0;
        i.b(oVar);
        this.f19439s0 = oVar.f2369F;
        o oVar2 = this.f19431k0;
        i.b(oVar2);
        this.f19441u0 = oVar2.f2386h;
        o oVar3 = this.f19431k0;
        i.b(oVar3);
        DiagnosisLevelView diagnosisLevelView = oVar3.f2381c;
        this.f19420I0 = diagnosisLevelView;
        diagnosisLevelView.setOnClickListener(new L(this, 7));
        o oVar4 = this.f19431k0;
        i.b(oVar4);
        this.f19421J0 = oVar4.f2376N;
        e eVar = this.f19439s0;
        if (eVar == null) {
            i.g("wifiNoOpenView");
            throw null;
        }
        ((TextView) eVar.f3870d).setText(r(R.string.wifi_not_open));
        e eVar2 = this.f19439s0;
        if (eVar2 == null) {
            i.g("wifiNoOpenView");
            throw null;
        }
        ((TextView) eVar2.f3869c).setText(r(R.string.go_open));
        e eVar3 = this.f19439s0;
        if (eVar3 == null) {
            i.g("wifiNoOpenView");
            throw null;
        }
        ((TextView) eVar3.f3869c).setOnClickListener(new L(this, 11));
        o oVar5 = this.f19431k0;
        i.b(oVar5);
        AppCompatTextView appCompatTextView = oVar5.f2384f;
        this.v0 = appCompatTextView;
        appCompatTextView.setText(r(R.string.wifi_not_open));
        AppCompatTextView appCompatTextView2 = this.v0;
        if (appCompatTextView2 == null) {
            i.g("wifiName");
            throw null;
        }
        appCompatTextView2.setOnClickListener(new L(this, 12));
        o oVar6 = this.f19431k0;
        i.b(oVar6);
        oVar6.f2389l.setText(Build.BRAND);
        o oVar7 = this.f19431k0;
        i.b(oVar7);
        TextView textView = oVar7.f2387j;
        this.f19443x0 = textView;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            i.d(networkInterfaces, "getNetworkInterfaces(...)");
            ArrayList list = Collections.list(networkInterfaces);
            i.d(list, "list(...)");
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            int i = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = list.get(i3);
                i3++;
                Enumeration<InetAddress> inetAddresses = ((NetworkInterface) obj2).getInetAddresses();
                i.d(inetAddresses, "getInetAddresses(...)");
                ArrayList list2 = Collections.list(inetAddresses);
                i.d(list2, "list(...)");
                d5.p.R(list2, arrayList);
            }
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                InetAddress inetAddress = (InetAddress) obj;
                if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                    break;
                }
            }
            InetAddress inetAddress2 = (InetAddress) obj;
            objD = inetAddress2 != null ? inetAddress2.getHostAddress() : null;
        } catch (Throwable th) {
            objD = a.d(th);
        }
        if (objD instanceof C0408e) {
            objD = null;
        }
        textView.setText((String) objD);
        o oVar8 = this.f19431k0;
        i.b(oVar8);
        this.f19442w0 = oVar8.f2388k;
        o oVar9 = this.f19431k0;
        i.b(oVar9);
        this.f19419H0 = oVar9.f2380b;
        o oVar10 = this.f19431k0;
        i.b(oVar10);
        oVar10.f2368E.setAnimation(AnimationUtils.loadAnimation(m(), R.anim.wifi_exchange_anim));
        o oVar11 = this.f19431k0;
        i.b(oVar11);
        RecyclerView recyclerView = oVar11.f2370G;
        recyclerView.g(new C0314k(m()));
        S s5 = this.f19425N0;
        recyclerView.setAdapter(s5);
        s5.n(R.layout.empty_no_data);
        s5.f4672f = new M(this);
        o oVar12 = this.f19431k0;
        i.b(oVar12);
        WifiListView wifiListView = oVar12.f2371H;
        this.f19415D0 = wifiListView;
        wifiListView.setOnClickListener(new L(this, 0));
        o oVar13 = this.f19431k0;
        i.b(oVar13);
        AppCompatTextView appCompatTextView3 = oVar13.f2382d;
        this.f19444y0 = appCompatTextView3;
        appCompatTextView3.setOnClickListener(new L(this, 1));
        o oVar14 = this.f19431k0;
        i.b(oVar14);
        this.f19414C0 = oVar14.f2390m;
        o oVar15 = this.f19431k0;
        i.b(oVar15);
        oVar15.f2374K.setOnClickListener(new L(this, 2));
        o oVar16 = this.f19431k0;
        i.b(oVar16);
        this.f19445z0 = oVar16.f2367D;
        o oVar17 = this.f19431k0;
        i.b(oVar17);
        this.f19412A0 = oVar17.f2391n;
        o oVar18 = this.f19431k0;
        i.b(oVar18);
        this.f19413B0 = oVar18.f2366C;
        o oVar19 = this.f19431k0;
        i.b(oVar19);
        this.f19417F0 = oVar19.M;
        o oVar20 = this.f19431k0;
        i.b(oVar20);
        this.f19416E0 = oVar20.f2375L;
        o oVar21 = this.f19431k0;
        i.b(oVar21);
        this.f19440t0 = oVar21.f2372I;
        o oVar22 = this.f19431k0;
        i.b(oVar22);
        this.f19418G0 = oVar22.f2383e;
        U u6 = this.f19436p0;
        if (u6 == null) {
            i.g("viewModel");
            throw null;
        }
        u6.f4442c.e(s(), new N4.b(new Q4.e(5, this), 7));
        o oVar23 = this.f19431k0;
        i.b(oVar23);
        oVar23.i.setOnClickListener(new L(this, 3));
        o oVar24 = this.f19431k0;
        i.b(oVar24);
        oVar24.f2373J.setOnClickListener(new L(this, 4));
        o oVar25 = this.f19431k0;
        i.b(oVar25);
        oVar25.f2385g.setOnClickListener(new L(this, 8));
        o oVar26 = this.f19431k0;
        i.b(oVar26);
        oVar26.f2377O.setOnClickListener(new L(this, 9));
        o oVar27 = this.f19431k0;
        i.b(oVar27);
        oVar27.f2378P.setOnClickListener(new L(this, 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y() {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.wifi.WifiFragment.Y():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        String str;
        Object objD;
        if (this.f19422K0 && (wifiManager = this.f19435o0) != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
            int rssi = connectionInfo.getRssi();
            TextView textView = this.f19416E0;
            Integer numValueOf = null;
            if (textView == null) {
                i.g("signalVal");
                throw null;
            }
            Integer numValueOf2 = Integer.valueOf(rssi);
            if (a.f3390d) {
                Locale locale = F4.e.f1457a;
                str = String.format(F4.e.b(), "%d  dBm", Arrays.copyOf(new Object[]{numValueOf2}, 1));
            } else {
                str = String.format(Locale.ENGLISH, "%d  dBm", Arrays.copyOf(new Object[]{numValueOf2}, 1));
            }
            textView.setText(str);
            WifiSignalView wifiSignalView = this.f19417F0;
            if (wifiSignalView == null) {
                i.g("signalView");
                throw null;
            }
            wifiSignalView.a(rssi);
            DiagnosisLevelView diagnosisLevelView = this.f19420I0;
            if (diagnosisLevelView == null) {
                i.g("signalLevelView");
                throw null;
            }
            WifiManager wifiManager2 = this.f19435o0;
            try {
                if (Build.VERSION.SDK_INT < 30) {
                    numValueOf = Integer.valueOf(WifiManager.calculateSignalLevel(rssi, 5));
                } else if (wifiManager2 != null) {
                    numValueOf = Integer.valueOf(wifiManager2.calculateSignalLevel(rssi));
                }
                objD = C0412i.f5929a;
            } catch (Throwable th) {
                objD = a.d(th);
            }
            if (C0409f.a(objD) != null) {
                numValueOf = Integer.valueOf((rssi != 0 && rssi > -100) ? rssi >= -55 ? 4 : (int) (((rssi - (-100)) * 4.0f) / 45.0f) : -1);
            }
            diagnosisLevelView.setLevel(numValueOf != null ? numValueOf.intValue() : -1);
        }
        this.f19433m0.postDelayed(this, 1000L);
    }
}
