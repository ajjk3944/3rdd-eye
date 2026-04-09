package com.phuongpn.whousemywifi.networkscanner;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkRequest;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import defpackage.a10;
import defpackage.a30;
import defpackage.ah0;
import defpackage.ap0;
import defpackage.bp0;
import defpackage.c10;
import defpackage.da0;
import defpackage.ea0;
import defpackage.f10;
import defpackage.f2;
import defpackage.f20;
import defpackage.fa0;
import defpackage.fp;
import defpackage.ga0;
import defpackage.gi2;
import defpackage.gm0;
import defpackage.ha0;
import defpackage.i30;
import defpackage.i5;
import defpackage.ia0;
import defpackage.ka0;
import defpackage.la0;
import defpackage.m;
import defpackage.na0;
import defpackage.nm;
import defpackage.on;
import defpackage.ra0;
import defpackage.s5;
import defpackage.so1;
import defpackage.t90;
import defpackage.tr;
import defpackage.u5;
import defpackage.ua0;
import defpackage.um;
import defpackage.v8;
import defpackage.vb;
import defpackage.vq2;
import defpackage.wl2;
import defpackage.x00;
import defpackage.x30;
import defpackage.xi;
import defpackage.ya0;
import defpackage.yn;
import defpackage.z41;
import defpackage.za0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class MainActivity extends i5 {
    public static final int[] d0 = {22, 80, 443, 554, 631, 8883, 9100};
    public static int e0 = 1;
    public f2 C;
    public SharedPreferences E;
    public ConnectivityManager F;
    public WifiManager G;
    public Timer H;
    public t90 I;
    public long J;
    public long K;
    public long L;
    public boolean M;
    public ArrayList N;
    public c10 O;
    public LinkedHashMap S;
    public ArrayList T;
    public f10 U;
    public vb W;
    public f20 X;
    public yn Z;
    public boolean a0;
    public vq2 c0;
    public final ra0 D = new ra0(0, this);
    public String P = "0.0.0.0";
    public int Q = 24;
    public String R = "0.0.0.0";
    public final ArrayList V = new ArrayList();
    public final AtomicBoolean Y = new AtomicBoolean(false);
    public final ArrayList b0 = new ArrayList();

    public static final void x(MainActivity mainActivity, int i) {
        if (i == 0) {
            mainActivity.A();
            mainActivity.M = false;
            mainActivity.runOnUiThread(new la0(mainActivity, 4));
            return;
        }
        if (i != 1) {
            if (i != 2) {
                mainActivity.M = false;
                mainActivity.A();
                return;
            } else {
                mainActivity.M = false;
                mainActivity.A();
                mainActivity.runOnUiThread(new la0(mainActivity, 5));
                return;
            }
        }
        WifiManager wifiManager = mainActivity.G;
        if (wifiManager == null) {
            i30.S("wifiManager");
            throw null;
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
            mainActivity.M = true;
            WifiManager wifiManager2 = mainActivity.G;
            if (wifiManager2 == null) {
                i30.S("wifiManager");
                throw null;
            }
            DhcpInfo dhcpInfo = wifiManager2.getDhcpInfo();
            mainActivity.runOnUiThread(new tr(mainActivity, dhcpInfo, connectionInfo, 1));
            int i2 = dhcpInfo.gateway;
            String str = "";
            for (int i3 = 0; i3 < 4; i3++) {
                str = str + ((i2 >> (i3 * 8)) & 255) + ".";
            }
            String strSubstring = str.substring(0, str.length() - 1);
            i30.l(strSubstring, "substring(...)");
            new Thread(new ka0(strSubstring, mainActivity)).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object y(com.phuongpn.whousemywifi.networkscanner.MainActivity r21, defpackage.d10 r22, defpackage.qj r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.phuongpn.whousemywifi.networkscanner.MainActivity.y(com.phuongpn.whousemywifi.networkscanner.MainActivity, d10, qj):java.lang.Object");
    }

    public final void A() {
        runOnUiThread(new la0(this, 3));
    }

    public final String B() {
        try {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            String string = Settings.Global.getString(getContentResolver(), "device_name");
            i30.j(string);
            if (string.length() > 0) {
                return string;
            }
            i30.j(str2);
            if (str2.length() > 0) {
                return um.e(str2);
            }
            i30.j(str);
            if (str.length() > 0) {
                return um.e(str);
            }
            String string2 = getString(R.string.txt_your_device);
            i30.j(string2);
            return string2;
        } catch (Exception unused) {
            String string3 = getString(R.string.txt_your_device);
            i30.l(string3, "getString(...)");
            return string3;
        }
    }

    public final SharedPreferences C() {
        SharedPreferences sharedPreferences = this.E;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        i30.S("pref");
        throw null;
    }

    public final void D() {
        long j;
        long j2;
        int i = 0;
        if (!this.M) {
            Toast.makeText(getApplicationContext(), getString(R.string.txt_please_connect_wifi), 0).show();
            return;
        }
        f2 f2Var = this.C;
        if (f2Var == null) {
            i30.S("binding");
            throw null;
        }
        ((TextView) f2Var.l).setText(getString(R.string.txt_host_size, "0", getString(R.string.title_host_discovered)));
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            i30.S("hosts");
            throw null;
        }
        if (!arrayList.isEmpty()) {
            c10 c10Var = this.O;
            if (c10Var == null) {
                i30.S("hostAdapter");
                throw null;
            }
            ArrayList arrayList2 = this.N;
            if (arrayList2 == null) {
                i30.S("hosts");
                throw null;
            }
            c10Var.f.e(0, arrayList2.size());
            ArrayList arrayList3 = this.N;
            if (arrayList3 == null) {
                i30.S("hosts");
                throw null;
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.T;
        if (arrayList4 == null) {
            i30.S("hostTypes");
            throw null;
        }
        if (!arrayList4.isEmpty()) {
            f10 f10Var = this.U;
            if (f10Var == null) {
                i30.S("hostTypeAdapter");
                throw null;
            }
            ArrayList arrayList5 = this.T;
            if (arrayList5 == null) {
                i30.S("hostTypes");
                throw null;
            }
            f10Var.f.e(0, arrayList5.size());
            ArrayList arrayList6 = this.T;
            if (arrayList6 == null) {
                i30.S("hostTypes");
                throw null;
            }
            arrayList6.clear();
        }
        String str = this.R;
        int i2 = this.Q;
        i30.m(str, "ip");
        long jN = um.n(str);
        int i3 = 32 - i2;
        int i4 = 1;
        if (i2 < 31) {
            j = ((jN >> i3) << i3) + 1;
            j2 = (((1 << i3) - 1) | j) - 1;
        } else {
            j = (jN >> i3) << i3;
            j2 = ((1 << i3) - 1) | j;
        }
        Long lValueOf = Long.valueOf(jN);
        Long lValueOf2 = Long.valueOf(j);
        Long lValueOf3 = Long.valueOf(j2);
        bp0 bp0Var = new bp0();
        bp0Var.f = lValueOf.longValue();
        bp0 bp0Var2 = new bp0();
        bp0Var2.f = lValueOf2.longValue();
        bp0 bp0Var3 = new bp0();
        long jLongValue = lValueOf3.longValue();
        bp0Var3.f = jLongValue;
        bp0 bp0Var4 = new bp0();
        bp0Var4.f = (jLongValue - bp0Var2.f) + 1;
        so1 so1Var = new so1(5, false);
        ap0 ap0Var = new ap0();
        on onVar = fp.a;
        this.Z = gi2.q(wl2.a(za0.a), null, new nm(new ga0(i, this), this, new ya0(bp0Var2, bp0Var, bp0Var3, bp0Var4, this, so1Var, null), new ha0(this, ap0Var, bp0Var4), new m(i4, this), null), 3);
    }

    @Override // defpackage.i5, defpackage.ch, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        s5 s5Var = u5.f;
        int i2 = z41.a;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
        int i3 = R.id.ad_layout;
        MaterialCardView materialCardView = (MaterialCardView) a30.e(viewInflate, R.id.ad_layout);
        if (materialCardView != null) {
            i3 = R.id.ad_loading;
            MaterialCardView materialCardView2 = (MaterialCardView) a30.e(viewInflate, R.id.ad_loading);
            if (materialCardView2 != null) {
                i3 = R.id.adsPlaceholder;
                FrameLayout frameLayout = (FrameLayout) a30.e(viewInflate, R.id.adsPlaceholder);
                if (frameLayout != null) {
                    i3 = R.id.bar;
                    BottomAppBar bottomAppBar = (BottomAppBar) a30.e(viewInflate, R.id.bar);
                    if (bottomAppBar != null) {
                        i3 = R.id.connectInfoCard;
                        View viewE = a30.e(viewInflate, R.id.connectInfoCard);
                        if (viewE != null) {
                            int i4 = R.id.btn_wifi_info_more;
                            Button button = (Button) a30.e(viewE, R.id.btn_wifi_info_more);
                            if (button != null) {
                                i4 = R.id.dotted_view;
                                View viewE2 = a30.e(viewE, R.id.dotted_view);
                                if (viewE2 != null) {
                                    i4 = R.id.guideline1;
                                    if (((Guideline) a30.e(viewE, R.id.guideline1)) != null) {
                                        i4 = R.id.guideline2;
                                        if (((Guideline) a30.e(viewE, R.id.guideline2)) != null) {
                                            i4 = R.id.iv_connected;
                                            ImageView imageView = (ImageView) a30.e(viewE, R.id.iv_connected);
                                            if (imageView != null) {
                                                i4 = R.id.iv_device;
                                                if (((ImageView) a30.e(viewE, R.id.iv_device)) != null) {
                                                    i4 = R.id.iv_router;
                                                    ImageView imageView2 = (ImageView) a30.e(viewE, R.id.iv_router);
                                                    if (imageView2 != null) {
                                                        i4 = R.id.line_connect_status;
                                                        View viewE3 = a30.e(viewE, R.id.line_connect_status);
                                                        if (viewE3 != null) {
                                                            i4 = R.id.tv_device_ip;
                                                            TextView textView = (TextView) a30.e(viewE, R.id.tv_device_ip);
                                                            if (textView != null) {
                                                                i4 = R.id.tv_device_name;
                                                                TextView textView2 = (TextView) a30.e(viewE, R.id.tv_device_name);
                                                                if (textView2 != null) {
                                                                    i4 = R.id.tv_dns1;
                                                                    TextView textView3 = (TextView) a30.e(viewE, R.id.tv_dns1);
                                                                    if (textView3 != null) {
                                                                        i4 = R.id.tv_dns2;
                                                                        TextView textView4 = (TextView) a30.e(viewE, R.id.tv_dns2);
                                                                        if (textView4 != null) {
                                                                            i4 = R.id.tv_internet_label;
                                                                            if (((TextView) a30.e(viewE, R.id.tv_internet_label)) != null) {
                                                                                i4 = R.id.tv_network_info;
                                                                                if (((TextView) a30.e(viewE, R.id.tv_network_info)) != null) {
                                                                                    i4 = R.id.tv_public_ip;
                                                                                    TextView textView5 = (TextView) a30.e(viewE, R.id.tv_public_ip);
                                                                                    if (textView5 != null) {
                                                                                        i4 = R.id.tv_router;
                                                                                        TextView textView6 = (TextView) a30.e(viewE, R.id.tv_router);
                                                                                        if (textView6 != null) {
                                                                                            i4 = R.id.tv_router_ip;
                                                                                            TextView textView7 = (TextView) a30.e(viewE, R.id.tv_router_ip);
                                                                                            if (textView7 != null) {
                                                                                                i4 = R.id.tv_ssid;
                                                                                                TextView textView8 = (TextView) a30.e(viewE, R.id.tv_ssid);
                                                                                                if (textView8 != null) {
                                                                                                    i4 = R.id.tv_wifi_standard;
                                                                                                    TextView textView9 = (TextView) a30.e(viewE, R.id.tv_wifi_standard);
                                                                                                    if (textView9 != null) {
                                                                                                        xi xiVar = new xi(button, viewE2, imageView, imageView2, viewE3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                                                                        i3 = R.id.fab;
                                                                                                        FloatingActionButton floatingActionButton = (FloatingActionButton) a30.e(viewInflate, R.id.fab);
                                                                                                        if (floatingActionButton != null) {
                                                                                                            i3 = R.id.homeLayout;
                                                                                                            MaterialCardView materialCardView3 = (MaterialCardView) a30.e(viewInflate, R.id.homeLayout);
                                                                                                            if (materialCardView3 != null) {
                                                                                                                i3 = R.id.netTrafficChart;
                                                                                                                LineChart lineChart = (LineChart) a30.e(viewInflate, R.id.netTrafficChart);
                                                                                                                if (lineChart != null) {
                                                                                                                    i3 = R.id.progress_bar;
                                                                                                                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) a30.e(viewInflate, R.id.progress_bar);
                                                                                                                    if (linearProgressIndicator != null) {
                                                                                                                        i3 = R.id.rvHome;
                                                                                                                        RecyclerView recyclerView = (RecyclerView) a30.e(viewInflate, R.id.rvHome);
                                                                                                                        if (recyclerView != null) {
                                                                                                                            RecyclerView recyclerView2 = (RecyclerView) a30.e(viewInflate, R.id.rv_host_type);
                                                                                                                            if (recyclerView2 != null) {
                                                                                                                                TextView textView10 = (TextView) a30.e(viewInflate, R.id.tvHostDiscovered);
                                                                                                                                if (textView10 == null) {
                                                                                                                                    i3 = R.id.tvHostDiscovered;
                                                                                                                                } else {
                                                                                                                                    if (((MaterialCardView) a30.e(viewInflate, R.id.updownChartOuter)) != null) {
                                                                                                                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                                                                                                                                        f2 f2Var = new f2();
                                                                                                                                        f2Var.a = materialCardView;
                                                                                                                                        f2Var.b = materialCardView2;
                                                                                                                                        f2Var.d = frameLayout;
                                                                                                                                        f2Var.e = bottomAppBar;
                                                                                                                                        f2Var.f = xiVar;
                                                                                                                                        f2Var.g = floatingActionButton;
                                                                                                                                        f2Var.c = materialCardView3;
                                                                                                                                        f2Var.h = lineChart;
                                                                                                                                        f2Var.i = linearProgressIndicator;
                                                                                                                                        f2Var.j = recyclerView;
                                                                                                                                        f2Var.k = recyclerView2;
                                                                                                                                        f2Var.l = textView10;
                                                                                                                                        this.C = f2Var;
                                                                                                                                        i30.l(coordinatorLayout, "getRoot(...)");
                                                                                                                                        setContentView(coordinatorLayout);
                                                                                                                                        Context applicationContext = getApplicationContext();
                                                                                                                                        i30.l(applicationContext, "getApplicationContext(...)");
                                                                                                                                        f20 f20VarE = f20.h.e(applicationContext);
                                                                                                                                        this.X = f20VarE;
                                                                                                                                        f20VarE.g(this, new da0(this));
                                                                                                                                        SharedPreferences sharedPreferences = getSharedPreferences(gm0.a(this), 0);
                                                                                                                                        i30.l(sharedPreferences, "getDefaultSharedPreferences(...)");
                                                                                                                                        this.E = sharedPreferences;
                                                                                                                                        Object systemService = getSystemService("connectivity");
                                                                                                                                        i30.k(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                                                                                                                                        this.F = (ConnectivityManager) systemService;
                                                                                                                                        Object systemService2 = getApplicationContext().getSystemService("wifi");
                                                                                                                                        i30.k(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                                                                                                                                        this.G = (WifiManager) systemService2;
                                                                                                                                        f2 f2Var2 = this.C;
                                                                                                                                        if (f2Var2 == null) {
                                                                                                                                            i30.S("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        ((BottomAppBar) f2Var2.e).setNavigationOnClickListener(new ea0(this, 4));
                                                                                                                                        A();
                                                                                                                                        f2 f2Var3 = this.C;
                                                                                                                                        if (f2Var3 == null) {
                                                                                                                                            i30.S("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        this.I = new t90(this, f2Var3);
                                                                                                                                        f2 f2Var4 = this.C;
                                                                                                                                        if (f2Var4 == null) {
                                                                                                                                            i30.S("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        ((xi) f2Var4.f).a.setOnClickListener(new ea0(this, 0));
                                                                                                                                        f2 f2Var5 = this.C;
                                                                                                                                        if (f2Var5 == null) {
                                                                                                                                            i30.S("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        ((FloatingActionButton) f2Var5.g).setVisibility(8);
                                                                                                                                        f2 f2Var6 = this.C;
                                                                                                                                        if (f2Var6 == null) {
                                                                                                                                            i30.S("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        int i5 = 1;
                                                                                                                                        ((FloatingActionButton) f2Var6.g).setOnClickListener(new ea0(this, i5));
                                                                                                                                        ArrayList arrayList = new ArrayList();
                                                                                                                                        this.N = arrayList;
                                                                                                                                        int i6 = 0;
                                                                                                                                        this.O = new c10(arrayList, new fa0(i6, this), i6);
                                                                                                                                        f2 f2Var7 = this.C;
                                                                                                                                        if (f2Var7 == null) {
                                                                                                                                            i30.S("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        RecyclerView recyclerView3 = (RecyclerView) f2Var7.j;
                                                                                                                                        recyclerView3.setHasFixedSize(true);
                                                                                                                                        recyclerView3.setNestedScrollingEnabled(false);
                                                                                                                                        c10 c10Var = this.O;
                                                                                                                                        if (c10Var == null) {
                                                                                                                                            i30.S("hostAdapter");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        recyclerView3.setAdapter(c10Var);
                                                                                                                                        this.T = new ArrayList();
                                                                                                                                        Context applicationContext2 = getApplicationContext();
                                                                                                                                        i30.l(applicationContext2, "getApplicationContext(...)");
                                                                                                                                        ArrayList arrayList2 = this.T;
                                                                                                                                        if (arrayList2 == null) {
                                                                                                                                            i30.S("hostTypes");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        this.U = new f10(applicationContext2, arrayList2);
                                                                                                                                        f2 f2Var8 = this.C;
                                                                                                                                        if (f2Var8 == null) {
                                                                                                                                            i30.S("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        RecyclerView recyclerView4 = (RecyclerView) f2Var8.k;
                                                                                                                                        recyclerView4.setHasFixedSize(false);
                                                                                                                                        f10 f10Var = this.U;
                                                                                                                                        if (f10Var == null) {
                                                                                                                                            i30.S("hostTypeAdapter");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        recyclerView4.setAdapter(f10Var);
                                                                                                                                        vq2 vq2Var = new vq2(this);
                                                                                                                                        SQLiteDatabase writableDatabase = ((ah0) vq2Var.g).getWritableDatabase();
                                                                                                                                        i30.l(writableDatabase, "getWritableDatabase(...)");
                                                                                                                                        vq2Var.h = writableDatabase;
                                                                                                                                        this.c0 = vq2Var;
                                                                                                                                        this.b0.addAll(new v8(d0));
                                                                                                                                        vb vbVar = new vb(this, 0);
                                                                                                                                        TypedArray typedArrayObtainStyledAttributes = vbVar.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
                                                                                                                                        vbVar.t = typedArrayObtainStyledAttributes.getBoolean(0, false);
                                                                                                                                        typedArrayObtainStyledAttributes.recycle();
                                                                                                                                        this.W = vbVar;
                                                                                                                                        vbVar.setContentView(R.layout.bottomsheet_host_menu);
                                                                                                                                        vb vbVar2 = this.W;
                                                                                                                                        if (vbVar2 == null) {
                                                                                                                                            i30.S("bottomSheetDialog");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        vbVar2.o = true;
                                                                                                                                        vbVar2.setOnShowListener(new x00(i5));
                                                                                                                                        if (bundle == null && C().getBoolean("ratedialog", true)) {
                                                                                                                                            long j = C().getLong("date_first_launch", 0L);
                                                                                                                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                                                                                                                            if (j == 0) {
                                                                                                                                                SharedPreferences.Editor editorEdit = C().edit();
                                                                                                                                                editorEdit.putLong("date_first_launch", jCurrentTimeMillis);
                                                                                                                                                editorEdit.apply();
                                                                                                                                            } else if (jCurrentTimeMillis >= j + 172800000 && !isFinishing()) {
                                                                                                                                                Dialog dialog = new Dialog(this, R.style.DialogStyle);
                                                                                                                                                dialog.requestWindowFeature(1);
                                                                                                                                                dialog.setContentView(R.layout.dialog_rate);
                                                                                                                                                dialog.setCanceledOnTouchOutside(false);
                                                                                                                                                Button button2 = (Button) dialog.findViewById(R.id.btn_cancel);
                                                                                                                                                Button button3 = (Button) dialog.findViewById(R.id.btn_rate);
                                                                                                                                                button2.setOnClickListener(new a10((CheckBox) dialog.findViewById(R.id.cb_dont_ask), this, dialog, 2));
                                                                                                                                                i = 0;
                                                                                                                                                button3.setOnClickListener(new ia0(this, dialog, i));
                                                                                                                                                dialog.show();
                                                                                                                                            }
                                                                                                                                            i = 0;
                                                                                                                                        } else {
                                                                                                                                            i = 0;
                                                                                                                                        }
                                                                                                                                        new Handler(Looper.getMainLooper()).postDelayed(new la0(this, i), 7000L);
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    i3 = R.id.updownChartOuter;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i3 = R.id.rv_host_type;
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
                            throw new NullPointerException("Missing required view with ID: ".concat(viewE.getResources().getResourceName(i4)));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }

    @Override // defpackage.i5, android.app.Activity
    public final void onPause() {
        Timer timer;
        try {
            timer = this.H;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (timer == null) {
            i30.S("chartTimer");
            throw null;
        }
        timer.cancel();
        Timer timer2 = this.H;
        if (timer2 == null) {
            i30.S("chartTimer");
            throw null;
        }
        timer2.purge();
        try {
            if (this.a0) {
                z();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        super.onPause();
    }

    @Override // defpackage.i5, android.app.Activity
    public final void onResume() {
        super.onResume();
        ConnectivityManager connectivityManager = this.F;
        if (connectivityManager == null) {
            i30.S("conMgr");
            throw null;
        }
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(1).addTransportType(0).addTransportType(2).build();
        i30.l(networkRequestBuild, "build(...)");
        connectivityManager.registerNetworkCallback(networkRequestBuild, this.D);
        ua0 ua0Var = new ua0(this);
        Timer timer = new Timer();
        this.H = timer;
        timer.schedule(ua0Var, 100L, 2000L);
    }

    @Override // defpackage.i5, android.app.Activity
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ConnectivityManager connectivityManager;
        try {
            connectivityManager = this.F;
        } catch (Exception unused) {
        }
        if (connectivityManager == null) {
            i30.S("conMgr");
            throw null;
        }
        connectivityManager.unregisterNetworkCallback(this.D);
        super.onStop();
    }

    public final void z() {
        yn ynVar;
        boolean z = false;
        if (this.a0) {
            Toast.makeText(getApplicationContext(), getString(R.string.txt_task_stopped), 0).show();
        }
        try {
            ynVar = this.Z;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (ynVar == null) {
            i30.S("job");
            throw null;
        }
        ynVar.o(new x30(ynVar.q(), null, ynVar));
        runOnUiThread(new na0(z, this, 0));
    }
}
