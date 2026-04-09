package com.staircase3.opensignal.viewcontrollers;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewpager.widget.ViewPager;
import bf.n;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.f0;
import com.squareup.picasso.l0;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.goldstar.tabcoverage.SuperUserActivity;
import com.staircase3.opensignal.utils.q;
import com.staircase3.opensignal.utils.u;
import com.staircase3.opensignal.viewcontrollers.CityProvider;
import com.staircase3.opensignal.viewcontrollers.TabCoverage;
import com.staircase3.opensignal.viewcontrollers.TabCoverage.HmapProvider;
import h9.r2;
import i.g;
import i.j;
import io.sentry.h4;
import io.sentry.t;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import kg.r;
import lf.t1;
import oh.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ou.c0;
import ou.x;
import qk.h;
import qk.i;
import qk.k;
import qm.f;
import qm.l;

/* loaded from: classes.dex */
public class TabCoverage extends l implements qm.b {
    public static ColorStateList R0;
    public g A0;
    public ViewPager B0;
    public ProgressBar C0;
    public LatLng D0;
    public LatLng E0;
    public LatLng F0;
    public int G0;
    public ArrayList H0;
    public qm.c K0;
    public boolean P0;
    public ThankYouConfirmationMessageThread Q0;

    /* renamed from: x0, reason: collision with root package name */
    public al.e f6203x0;

    /* renamed from: y0, reason: collision with root package name */
    public q3.a f6204y0;

    /* renamed from: z0, reason: collision with root package name */
    public wc.e f6205z0;
    public final ArrayList I0 = new ArrayList();
    public final NetworksForFilters J0 = new NetworksForFilters();
    public boolean L0 = false;
    public final Object M0 = y3.A(f.class);
    public final Object N0 = y3.A(com.staircase3.opensignal.utils.a.class);
    public final Object O0 = y3.A(el.b.class);

    public class HmapProvider implements wc.f {
        public HmapProvider() {
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, lq.h] */
        @Override // wc.f
        public final Tile a(int i10, int i11, int i12) {
            String str;
            String str2 = (String) ((jn.b) y3.s(jn.b.class)).f13781b.getValue();
            TabCoverage tabCoverage = TabCoverage.this;
            f fVar = (f) tabCoverage.M0.getValue();
            Context contextN = tabCoverage.n();
            fVar.getClass();
            if (f.a(contextN) && u.e(tabCoverage.n())) {
                try {
                    StringBuilder sb2 = new StringBuilder("https://tiles-prod.opensignal.com/?client=android&version_code=8.3.2-1&device_id=");
                    sb2.append(str2);
                    sb2.append("&device_type=");
                    if (xu.d.f25538d.equals("")) {
                        try {
                            if (xu.d.f25537c.equals("")) {
                                xu.d.f25537c = Build.MODEL;
                            }
                            xu.d.f25538d = URLEncoder.encode(xu.d.f25537c, "UTF-8");
                        } catch (UnsupportedEncodingException unused) {
                        }
                    }
                    sb2.append(xu.d.f25538d);
                    sb2.append("&api_level=");
                    sb2.append(Build.VERSION.SDK_INT);
                    sb2.append("&zoom=");
                    sb2.append(i12);
                    sb2.append("&x=");
                    sb2.append(i10);
                    sb2.append("&y=");
                    sb2.append(i11);
                    String string = sb2.toString();
                    if (q.d(tabCoverage.n())) {
                        string = string + "&netwkType[]=2G&netwkType[]=3G";
                    }
                    if (q.e(tabCoverage.n())) {
                        string = string + "&netwkType[]=4G";
                    }
                    if (q.f(tabCoverage.n())) {
                        string = string + "&netwkType[]=5G";
                    }
                    if (q.c(tabCoverage.n()).getBoolean("settings.color_blind_mode", false)) {
                        string = string + "&cmap=linear(b35806 22.5%,542788 45%)";
                    }
                    int iB = q.b(tabCoverage.n());
                    if (iB != 0) {
                        str = string + "&netwkID=" + iB;
                    } else {
                        str = string + "&netwkID=all";
                    }
                    try {
                        if (i12 == tabCoverage.G0) {
                            str.substring(str.indexOf("&zoom"));
                        }
                    } catch (Exception unused2) {
                    }
                    x xVar = (x) u.f6195a.getValue();
                    cj.a aVar = new cj.a();
                    aVar.N(str);
                    c0 c0VarE = xVar.a(aVar.r()).e();
                    byte[] bArrF = u.f(c0VarE.B.h().l0());
                    c0VarE.B.close();
                    if (bArrF.length != 0) {
                        return new Tile(bArrF, 256, 256);
                    }
                } catch (Exception unused3) {
                }
            }
            return wc.f.f24412a;
        }
    }

    public class NetworksForFilters {

        /* renamed from: a, reason: collision with root package name */
        public g f6212a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6213b = false;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f6214c = new ArrayList();

        public NetworksForFilters() {
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, lq.h] */
        public final void a(final boolean z10) {
            TabCoverage tabCoverage = TabCoverage.this;
            uk.c cVar = new uk.c((el.b) tabCoverage.O0.getValue(), tabCoverage.m0(false), false, new pm.a() { // from class: com.staircase3.opensignal.viewcontrollers.d
                /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, lq.h] */
                @Override // pm.a
                public final void b(String str) {
                    TabCoverage.NetworksForFilters networksForFilters = this.f6334a;
                    TabCoverage tabCoverage2 = TabCoverage.this;
                    networksForFilters.f6214c = TabCoverage.n0(str);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = networksForFilters.f6214c.iterator();
                    while (it.hasNext()) {
                        sm.d dVar = (sm.d) it.next();
                        int i10 = dVar.f22120c;
                        cj.a aVarG = sm.f.G(i10);
                        if (aVarG != null) {
                            String str2 = (String) aVarG.f3974d;
                            br.l.e(str2, "<set-?>");
                            dVar.f22121d = str2;
                            br.l.e((String) aVarG.f3975g, "<set-?>");
                            String str3 = (String) aVarG.f3976r;
                            br.l.e(str3, "<set-?>");
                            dVar.f22118a = str3;
                        } else {
                            arrayList.add(Integer.valueOf(i10));
                        }
                    }
                    if (z10) {
                        TabCoverage.g0(tabCoverage2, networksForFilters.f6212a.getWindow().getDecorView(), networksForFilters.f6214c);
                        TabCoverage.h0(tabCoverage2, networksForFilters.f6212a.getWindow().getDecorView());
                    }
                    networksForFilters.f6213b = false;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    uk.c cVar2 = new uk.c((el.b) tabCoverage2.O0.getValue(), tabCoverage2.m0(false), false, new a(networksForFilters));
                    tabCoverage2.H0.add(cVar2);
                    cVar2.execute(new Void[0]);
                }
            });
            tabCoverage.H0.add(cVar);
            cVar.execute(new Void[0]);
        }
    }

    public static class ThankYouConfirmationMessageThread extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6216a;

        /* renamed from: d, reason: collision with root package name */
        public final int f6217d;

        /* renamed from: g, reason: collision with root package name */
        public final CountDownLatch f6218g;

        /* renamed from: r, reason: collision with root package name */
        public final TabCoverage f6219r;

        public ThankYouConfirmationMessageThread(TabCoverage tabCoverage, CountDownLatch countDownLatch, boolean z10) {
            super("ThankYouConfirmation [thread]");
            this.f6217d = 3000;
            this.f6218g = countDownLatch;
            this.f6216a = z10;
            this.f6219r = tabCoverage;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws InterruptedException {
            j jVarL;
            try {
                this.f6218g.countDown();
                TabCoverage tabCoverage = this.f6219r;
                if (tabCoverage == null || (jVarL = tabCoverage.l()) == null) {
                    return;
                }
                jVarL.runOnUiThread(new Runnable() { // from class: com.staircase3.opensignal.viewcontrollers.TabCoverage.ThankYouConfirmationMessageThread.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ThankYouConfirmationMessageThread thankYouConfirmationMessageThread = ThankYouConfirmationMessageThread.this;
                        al.e eVar = thankYouConfirmationMessageThread.f6219r.f6203x0;
                        if (eVar != null) {
                            eVar.f842n.setVisibility(thankYouConfirmationMessageThread.f6216a ? 0 : 8);
                        }
                    }
                });
                Thread.sleep(this.f6217d);
                if (Thread.interrupted()) {
                    return;
                }
                jVarL.runOnUiThread(new Runnable() { // from class: com.staircase3.opensignal.viewcontrollers.TabCoverage.ThankYouConfirmationMessageThread.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        al.e eVar = ThankYouConfirmationMessageThread.this.f6219r.f6203x0;
                        if (eVar != null) {
                            eVar.f842n.setVisibility(4);
                        }
                    }
                });
            } catch (InterruptedException unused) {
            }
        }
    }

    public static void B0(JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    sm.f.E((JSONObject) jSONArray.get(i10));
                } catch (JSONException unused) {
                }
            }
        }
        sm.f.I();
        sm.f.f22128r.compileStatement("select count(*) from logo_cache").simpleQueryForLong();
    }

    public static void g0(TabCoverage tabCoverage, View view, List list) {
        RadioGroup radioGroup = (RadioGroup) view.findViewById(h.rgOperators);
        radioGroup.removeAllViews();
        float f10 = tabCoverage.q().getDisplayMetrics().density;
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams((int) (240.0f * f10), (int) (f10 * 50.0f));
        sm.g gVar = new sm.g(tabCoverage.r(qk.l.all_operators), 0);
        int iB = q.b(tabCoverage.n());
        boolean z10 = iB != 0;
        AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(tabCoverage.n(), null);
        appCompatRadioButton.setPadding(10, 10, 10, 0);
        appCompatRadioButton.setChecked(!z10);
        if (appCompatRadioButton.isChecked()) {
            appCompatRadioButton.setTextColor(u.b(tabCoverage.n(), qk.d.os4_blue_main));
        } else {
            appCompatRadioButton.setTextColor(u.b(tabCoverage.n(), qk.d.coverage_info_dialogs_header_text));
        }
        appCompatRadioButton.setText(tabCoverage.r(qk.l.show_all));
        appCompatRadioButton.setEllipsize(TextUtils.TruncateAt.END);
        appCompatRadioButton.setLines(1);
        appCompatRadioButton.setTag(gVar);
        appCompatRadioButton.setId(0);
        appCompatRadioButton.setButtonTintList(R0);
        appCompatRadioButton.setOnCheckedChangeListener(new mn.d(0, tabCoverage));
        radioGroup.addView(appCompatRadioButton, layoutParams);
        Iterator it = list.iterator();
        int i10 = 99999;
        while (it.hasNext()) {
            sm.d dVar = (sm.d) it.next();
            sm.g gVar2 = new sm.g(dVar.f22121d, dVar.f22120c);
            AppCompatRadioButton appCompatRadioButton2 = new AppCompatRadioButton(tabCoverage.n(), null);
            appCompatRadioButton2.setText(dVar.f22121d);
            appCompatRadioButton2.setEllipsize(TextUtils.TruncateAt.END);
            appCompatRadioButton2.setLines(1);
            appCompatRadioButton2.setPadding(10, 0, 20, 0);
            appCompatRadioButton2.setTag(gVar2);
            int i11 = i10 + 1;
            appCompatRadioButton2.setId(i10);
            appCompatRadioButton2.setChecked(iB == dVar.f22120c);
            if (appCompatRadioButton2.isChecked()) {
                appCompatRadioButton2.setTextColor(u.b(tabCoverage.n(), qk.d.os4_blue_main));
            } else {
                appCompatRadioButton2.setTextColor(u.b(tabCoverage.n(), qk.d.coverage_info_dialogs_header_text));
            }
            appCompatRadioButton2.setButtonTintList(R0);
            appCompatRadioButton2.setOnCheckedChangeListener(new mn.d(1, tabCoverage));
            radioGroup.addView(appCompatRadioButton2, layoutParams);
            i10 = i11;
        }
    }

    public static void h0(final TabCoverage tabCoverage, View view) {
        final CheckBox checkBox = (CheckBox) view.findViewById(h.cb2G3G);
        final CheckBox checkBox2 = (CheckBox) view.findViewById(h.cb4G);
        final CheckBox checkBox3 = (CheckBox) view.findViewById(h.cb5G);
        if (tabCoverage.P0) {
            checkBox3.setVisibility(0);
        }
        boolean zD = q.d(tabCoverage.n());
        boolean zE = q.e(tabCoverage.n());
        boolean zF = q.f(tabCoverage.n());
        checkBox.setChecked(zD);
        checkBox2.setChecked(zE);
        checkBox3.setChecked(zF);
        final int i10 = 0;
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(tabCoverage) { // from class: mn.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabCoverage f16890b;

            {
                this.f16890b = tabCoverage;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                switch (i10) {
                    case 0:
                        TabCoverage tabCoverage2 = this.f16890b;
                        if (!q.e(tabCoverage2.n()) && !q.f(tabCoverage2.n())) {
                            if (!z10) {
                                se.b.a0(tabCoverage2.n(), tabCoverage2.n().getString(qk.l.select_at_least_one_network_type));
                                checkBox.setChecked(true);
                                break;
                            } else {
                                q.a(tabCoverage2.n()).putBoolean("network_type_2G_3G_selected", true).apply();
                                tabCoverage2.t0();
                                break;
                            }
                        } else {
                            q.a(tabCoverage2.n()).putBoolean("network_type_2G_3G_selected", z10).apply();
                            tabCoverage2.t0();
                            break;
                        }
                    case 1:
                        TabCoverage tabCoverage3 = this.f16890b;
                        if (!q.d(tabCoverage3.n()) && !q.f(tabCoverage3.n())) {
                            if (!z10) {
                                se.b.a0(tabCoverage3.n(), tabCoverage3.n().getString(qk.l.select_at_least_one_network_type));
                                checkBox.setChecked(true);
                                break;
                            } else {
                                q.a(tabCoverage3.n()).putBoolean("network_type_4G_selected", true).apply();
                                tabCoverage3.t0();
                                break;
                            }
                        } else {
                            q.a(tabCoverage3.n()).putBoolean("network_type_4G_selected", z10).apply();
                            tabCoverage3.t0();
                            break;
                        }
                        break;
                    default:
                        TabCoverage tabCoverage4 = this.f16890b;
                        if (!q.d(tabCoverage4.n()) && !q.e(tabCoverage4.n())) {
                            if (!z10) {
                                se.b.a0(tabCoverage4.n(), tabCoverage4.n().getString(qk.l.select_at_least_one_network_type));
                                checkBox.setChecked(true);
                                break;
                            } else {
                                q.a(tabCoverage4.n()).putBoolean("network_type_5G_selected", true).apply();
                                tabCoverage4.t0();
                                break;
                            }
                        } else {
                            q.a(tabCoverage4.n()).putBoolean("network_type_5G_selected", z10).apply();
                            tabCoverage4.t0();
                            break;
                        }
                        break;
                }
            }
        });
        final int i11 = 1;
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(tabCoverage) { // from class: mn.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabCoverage f16890b;

            {
                this.f16890b = tabCoverage;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                switch (i11) {
                    case 0:
                        TabCoverage tabCoverage2 = this.f16890b;
                        if (!q.e(tabCoverage2.n()) && !q.f(tabCoverage2.n())) {
                            if (!z10) {
                                se.b.a0(tabCoverage2.n(), tabCoverage2.n().getString(qk.l.select_at_least_one_network_type));
                                checkBox2.setChecked(true);
                                break;
                            } else {
                                q.a(tabCoverage2.n()).putBoolean("network_type_2G_3G_selected", true).apply();
                                tabCoverage2.t0();
                                break;
                            }
                        } else {
                            q.a(tabCoverage2.n()).putBoolean("network_type_2G_3G_selected", z10).apply();
                            tabCoverage2.t0();
                            break;
                        }
                    case 1:
                        TabCoverage tabCoverage3 = this.f16890b;
                        if (!q.d(tabCoverage3.n()) && !q.f(tabCoverage3.n())) {
                            if (!z10) {
                                se.b.a0(tabCoverage3.n(), tabCoverage3.n().getString(qk.l.select_at_least_one_network_type));
                                checkBox2.setChecked(true);
                                break;
                            } else {
                                q.a(tabCoverage3.n()).putBoolean("network_type_4G_selected", true).apply();
                                tabCoverage3.t0();
                                break;
                            }
                        } else {
                            q.a(tabCoverage3.n()).putBoolean("network_type_4G_selected", z10).apply();
                            tabCoverage3.t0();
                            break;
                        }
                        break;
                    default:
                        TabCoverage tabCoverage4 = this.f16890b;
                        if (!q.d(tabCoverage4.n()) && !q.e(tabCoverage4.n())) {
                            if (!z10) {
                                se.b.a0(tabCoverage4.n(), tabCoverage4.n().getString(qk.l.select_at_least_one_network_type));
                                checkBox2.setChecked(true);
                                break;
                            } else {
                                q.a(tabCoverage4.n()).putBoolean("network_type_5G_selected", true).apply();
                                tabCoverage4.t0();
                                break;
                            }
                        } else {
                            q.a(tabCoverage4.n()).putBoolean("network_type_5G_selected", z10).apply();
                            tabCoverage4.t0();
                            break;
                        }
                        break;
                }
            }
        });
        final int i12 = 2;
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(tabCoverage) { // from class: mn.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabCoverage f16890b;

            {
                this.f16890b = tabCoverage;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                switch (i12) {
                    case 0:
                        TabCoverage tabCoverage2 = this.f16890b;
                        if (!q.e(tabCoverage2.n()) && !q.f(tabCoverage2.n())) {
                            if (!z10) {
                                se.b.a0(tabCoverage2.n(), tabCoverage2.n().getString(qk.l.select_at_least_one_network_type));
                                checkBox3.setChecked(true);
                                break;
                            } else {
                                q.a(tabCoverage2.n()).putBoolean("network_type_2G_3G_selected", true).apply();
                                tabCoverage2.t0();
                                break;
                            }
                        } else {
                            q.a(tabCoverage2.n()).putBoolean("network_type_2G_3G_selected", z10).apply();
                            tabCoverage2.t0();
                            break;
                        }
                    case 1:
                        TabCoverage tabCoverage3 = this.f16890b;
                        if (!q.d(tabCoverage3.n()) && !q.f(tabCoverage3.n())) {
                            if (!z10) {
                                se.b.a0(tabCoverage3.n(), tabCoverage3.n().getString(qk.l.select_at_least_one_network_type));
                                checkBox3.setChecked(true);
                                break;
                            } else {
                                q.a(tabCoverage3.n()).putBoolean("network_type_4G_selected", true).apply();
                                tabCoverage3.t0();
                                break;
                            }
                        } else {
                            q.a(tabCoverage3.n()).putBoolean("network_type_4G_selected", z10).apply();
                            tabCoverage3.t0();
                            break;
                        }
                        break;
                    default:
                        TabCoverage tabCoverage4 = this.f16890b;
                        if (!q.d(tabCoverage4.n()) && !q.e(tabCoverage4.n())) {
                            if (!z10) {
                                se.b.a0(tabCoverage4.n(), tabCoverage4.n().getString(qk.l.select_at_least_one_network_type));
                                checkBox3.setChecked(true);
                                break;
                            } else {
                                q.a(tabCoverage4.n()).putBoolean("network_type_5G_selected", true).apply();
                                tabCoverage4.t0();
                                break;
                            }
                        } else {
                            q.a(tabCoverage4.n()).putBoolean("network_type_5G_selected", z10).apply();
                            tabCoverage4.t0();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static ArrayList n0(String str) {
        try {
            JSONArray jSONArrayO0 = o0(str);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayO0.length(); i10++) {
                arrayList.add(new sm.d(jSONArrayO0.getJSONObject(i10).toString()));
            }
            return arrayList;
        } catch (NullPointerException | JSONException unused) {
            return new ArrayList();
        }
    }

    public static JSONArray o0(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.getJSONObject("meta").getInt("status_code") == 200) {
                return jSONObject.getJSONObject("content").getJSONArray("networks");
            }
        } catch (NullPointerException | JSONException unused) {
        }
        return new JSONArray();
    }

    public final void A0(boolean z10) {
        ((LinearLayout) this.f6203x0.f834d.f2830d).setVisibility(0);
        ((TextView) this.f6203x0.f834d.f2831g).setText(z10 ? qk.l.no_data_zoomed_in : qk.l.no_data_zoomed_out);
        ((Button) this.f6203x0.f831a.f14398r).setEnabled(false);
        y0(true);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, lq.h] */
    @Override // androidx.fragment.app.b
    public final void D(Bundle bundle) {
        super.D(bundle);
        this.P0 = ((el.b) this.O0.getValue()).f8210h;
        CityProviderParams cityProviderParams = new CityProviderParams(n(), k.worldcities, this);
        synchronized (new CityProvider()) {
            new CityProvider.LoadCitiesAsyncTask(0).execute(cityProviderParams);
        }
    }

    @Override // androidx.fragment.app.b
    public final View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewA;
        View viewA2;
        View viewA3;
        View viewA4;
        MapView mapView;
        uc.d dVar;
        View viewInflate = layoutInflater.inflate(i.tab_coverage_layout, viewGroup, false);
        int i10 = h.coverage_filters_widget;
        View viewA5 = b4.A(viewInflate, i10);
        if (viewA5 != null) {
            int i11 = h.divider;
            View viewA6 = b4.A(viewA5, i11);
            if (viewA6 != null && (viewA = b4.A(viewA5, (i11 = h.filter_operator_and_network_type))) != null) {
                int i12 = h.operatorLogoOnFilter;
                ImageView imageView = (ImageView) b4.A(viewA, i12);
                if (imageView != null) {
                    i12 = h.operatorLogoOnFilterBackground;
                    ImageView imageView2 = (ImageView) b4.A(viewA, i12);
                    if (imageView2 != null) {
                        i12 = h.rlOperatorLogoOnFilter;
                        RelativeLayout relativeLayout = (RelativeLayout) b4.A(viewA, i12);
                        if (relativeLayout != null) {
                            i12 = h.tvNetworkType;
                            TextView textView = (TextView) b4.A(viewA, i12);
                            if (textView != null) {
                                i12 = h.tvOperator;
                                TextView textView2 = (TextView) b4.A(viewA, i12);
                                if (textView2 != null) {
                                    r2 r2Var = new r2((RelativeLayout) viewA, imageView, imageView2, relativeLayout, textView, textView2);
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewA5;
                                    int i13 = h.showNetworkRankButton;
                                    Button button = (Button) b4.A(viewA5, i13);
                                    if (button != null) {
                                        r rVar = new r(viewA6, r2Var, constraintLayout, button);
                                        i10 = h.coverage_search_widget;
                                        View viewA7 = b4.A(viewInflate, i10);
                                        if (viewA7 != null) {
                                            int i14 = h.btClearPlaceFilter;
                                            ImageButton imageButton = (ImageButton) b4.A(viewA7, i14);
                                            if (imageButton != null) {
                                                i14 = h.btExitPlaceFilter;
                                                ImageButton imageButton2 = (ImageButton) b4.A(viewA7, i14);
                                                if (imageButton2 != null) {
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) viewA7;
                                                    int i15 = h.tvSearchLocation;
                                                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) b4.A(viewA7, i15);
                                                    if (autoCompleteTextView != null) {
                                                        r rVar2 = new r(imageButton, imageButton2, relativeLayout2, autoCompleteTextView);
                                                        i10 = h.coverage_tab_network_details_layout;
                                                        View viewA8 = b4.A(viewInflate, i10);
                                                        if (viewA8 != null) {
                                                            int i16 = h.pbNetworkDetailsRefresh;
                                                            ProgressBar progressBar = (ProgressBar) b4.A(viewA8, i16);
                                                            if (progressBar != null) {
                                                                i16 = h.tvDownload;
                                                                TextView textView3 = (TextView) b4.A(viewA8, i16);
                                                                if (textView3 != null) {
                                                                    i16 = h.tvLatency;
                                                                    TextView textView4 = (TextView) b4.A(viewA8, i16);
                                                                    if (textView4 != null) {
                                                                        i16 = h.tvUpload;
                                                                        TextView textView5 = (TextView) b4.A(viewA8, i16);
                                                                        if (textView5 != null && (viewA2 = b4.A(viewA8, (i16 = h.vDimBackground))) != null) {
                                                                            r2 r2Var2 = new r2((RelativeLayout) viewA8, progressBar, textView3, textView4, textView5, viewA2);
                                                                            i10 = h.coverage_tab_no_data_wrong_zoom;
                                                                            View viewA9 = b4.A(viewInflate, i10);
                                                                            if (viewA9 != null) {
                                                                                int i17 = h.tvNoDataWrongZoomMessage;
                                                                                TextView textView6 = (TextView) b4.A(viewA9, i17);
                                                                                if (textView6 == null) {
                                                                                    throw new NullPointerException("Missing required view with ID: ".concat(viewA9.getResources().getResourceName(i17)));
                                                                                }
                                                                                bm.e eVar = new bm.e((LinearLayout) viewA9, 2, textView6);
                                                                                int i18 = h.fabLegend;
                                                                                FloatingActionButton floatingActionButton = (FloatingActionButton) b4.A(viewInflate, i18);
                                                                                if (floatingActionButton != null) {
                                                                                    i18 = h.fabLocation;
                                                                                    FloatingActionButton floatingActionButton2 = (FloatingActionButton) b4.A(viewInflate, i18);
                                                                                    if (floatingActionButton2 != null) {
                                                                                        i18 = h.fabSearch;
                                                                                        FloatingActionButton floatingActionButton3 = (FloatingActionButton) b4.A(viewInflate, i18);
                                                                                        if (floatingActionButton3 != null) {
                                                                                            i18 = h.ivMapLegend;
                                                                                            ImageView imageView3 = (ImageView) b4.A(viewInflate, i18);
                                                                                            if (imageView3 != null) {
                                                                                                i18 = h.layoutNetworkRank;
                                                                                                RelativeLayout relativeLayout3 = (RelativeLayout) b4.A(viewInflate, i18);
                                                                                                if (relativeLayout3 != null) {
                                                                                                    i18 = h.locationServicesWidgetLayout;
                                                                                                    LinearLayout linearLayout = (LinearLayout) b4.A(viewInflate, i18);
                                                                                                    if (linearLayout != null) {
                                                                                                        i18 = h.map_legend;
                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) b4.A(viewInflate, i18);
                                                                                                        if (constraintLayout2 != null) {
                                                                                                            i18 = h.mapView;
                                                                                                            MapView mapView2 = (MapView) b4.A(viewInflate, i18);
                                                                                                            if (mapView2 != null) {
                                                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate;
                                                                                                                i18 = h.superUserWidgetLayout;
                                                                                                                LinearLayout linearLayout2 = (LinearLayout) b4.A(viewInflate, i18);
                                                                                                                if (linearLayout2 != null) {
                                                                                                                    i18 = h.thankYouConfirmationTabCoverage;
                                                                                                                    LinearLayout linearLayout3 = (LinearLayout) b4.A(viewInflate, i18);
                                                                                                                    if (linearLayout3 != null) {
                                                                                                                        i18 = h.tvBad;
                                                                                                                        if (((TextView) b4.A(viewInflate, i18)) != null && (viewA3 = b4.A(viewInflate, (i18 = h.vZoomOutHidden))) != null) {
                                                                                                                            this.f6203x0 = new al.e(constraintLayout3, rVar, rVar2, r2Var2, eVar, floatingActionButton, floatingActionButton2, floatingActionButton3, imageView3, relativeLayout3, linearLayout, constraintLayout2, mapView2, linearLayout2, linearLayout3, viewA3);
                                                                                                                            this.H0 = new ArrayList();
                                                                                                                            b0();
                                                                                                                            MapView mapView3 = this.f6203x0.f840l;
                                                                                                                            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                                                                                                                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
                                                                                                                            try {
                                                                                                                                uc.i iVar = mapView3.f5336a;
                                                                                                                                iVar.getClass();
                                                                                                                                iVar.d(bundle, new jc.f(iVar, bundle));
                                                                                                                                if (iVar.f13586a == null) {
                                                                                                                                    jc.a.b(mapView3);
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    mapView = this.f6203x0.f840l;
                                                                                                                                    dVar = new uc.d() { // from class: com.staircase3.opensignal.viewcontrollers.b
                                                                                                                                        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, lq.h] */
                                                                                                                                        /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, lq.h] */
                                                                                                                                        /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, lq.h] */
                                                                                                                                        @Override // uc.d
                                                                                                                                        public final void c(q3.a aVar) {
                                                                                                                                            qc.i gVar;
                                                                                                                                            TabCoverage tabCoverage = this.f6331a;
                                                                                                                                            tabCoverage.f6204y0 = aVar;
                                                                                                                                            aVar.G0().g0(false);
                                                                                                                                            try {
                                                                                                                                                LatLng latLng = vc.e.f23907a;
                                                                                                                                                lq.q qVar = u.f6195a;
                                                                                                                                                if (latLng != null) {
                                                                                                                                                    double d6 = latLng.f5348d;
                                                                                                                                                    double d10 = latLng.f5347a;
                                                                                                                                                    if (d10 != 0.0d || d6 != 0.0d) {
                                                                                                                                                        tabCoverage.f6204y0.s0(xu.d.V(new LatLng(d10, d6), ((el.b) tabCoverage.O0.getValue()).f8205c));
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } catch (Exception unused) {
                                                                                                                                            }
                                                                                                                                            f fVar = (f) tabCoverage.M0.getValue();
                                                                                                                                            Context contextN = tabCoverage.n();
                                                                                                                                            fVar.getClass();
                                                                                                                                            if (f.a(contextN)) {
                                                                                                                                                tabCoverage.f6204y0.O0();
                                                                                                                                            } else {
                                                                                                                                                ((com.staircase3.opensignal.utils.a) tabCoverage.N0.getValue()).c("tab_coverage", "setup_map", "no_location_permission");
                                                                                                                                            }
                                                                                                                                            q3.a aVar2 = tabCoverage.f6204y0;
                                                                                                                                            TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
                                                                                                                                            tileOverlayOptions.f5378d = true;
                                                                                                                                            tileOverlayOptions.f5381x = 0.0f;
                                                                                                                                            tileOverlayOptions.f5380r = false;
                                                                                                                                            tileOverlayOptions.f5377a = new wc.g(tabCoverage.new HmapProvider());
                                                                                                                                            aVar2.getClass();
                                                                                                                                            try {
                                                                                                                                                vc.g gVar2 = (vc.g) aVar2.f20679d;
                                                                                                                                                Parcel parcelR = gVar2.R();
                                                                                                                                                qc.l.c(parcelR, tileOverlayOptions);
                                                                                                                                                Parcel parcelE = gVar2.e(parcelR, 13);
                                                                                                                                                IBinder strongBinder = parcelE.readStrongBinder();
                                                                                                                                                int i19 = qc.h.f20841e;
                                                                                                                                                if (strongBinder == null) {
                                                                                                                                                    gVar = null;
                                                                                                                                                } else {
                                                                                                                                                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                                                                                                                                                    gVar = iInterfaceQueryLocalInterface instanceof qc.i ? (qc.i) iInterfaceQueryLocalInterface : new qc.g(strongBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate", 4);
                                                                                                                                                }
                                                                                                                                                parcelE.recycle();
                                                                                                                                                tabCoverage.f6205z0 = gVar != null ? new wc.e(gVar) : null;
                                                                                                                                                tabCoverage.f6204y0.P0(new a(tabCoverage));
                                                                                                                                            } catch (RemoteException e4) {
                                                                                                                                                throw new n(e4);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    };
                                                                                                                                } catch (Exception unused) {
                                                                                                                                }
                                                                                                                                if (Looper.getMainLooper() != Looper.myLooper()) {
                                                                                                                                    throw new IllegalStateException("getMapAsync() must be called on the main thread");
                                                                                                                                }
                                                                                                                                uc.i iVar2 = mapView.f5336a;
                                                                                                                                jc.c cVar = iVar2.f13586a;
                                                                                                                                if (cVar != null) {
                                                                                                                                    ((uc.h) cVar).k(dVar);
                                                                                                                                } else {
                                                                                                                                    iVar2.f23532i.add(dVar);
                                                                                                                                }
                                                                                                                                R0 = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{u.b(n(), qk.d.os4_blue_dark), u.b(n(), qk.d.os4_blue_main)});
                                                                                                                                if (q.c(n()).getBoolean("settings.color_blind_mode", false)) {
                                                                                                                                    this.f6203x0.f838h.setImageResource(qk.f.coverage_map_legend_bar_colorblind);
                                                                                                                                } else {
                                                                                                                                    this.f6203x0.f838h.setImageResource(qk.f.coverage_map_legend_bar);
                                                                                                                                }
                                                                                                                                this.f6203x0.f843o.setOnClickListener(new mn.e(this, 3));
                                                                                                                                final int i19 = 0;
                                                                                                                                ((RelativeLayout) ((r2) this.f6203x0.f831a.f14396d).f10470a).setOnClickListener(new View.OnClickListener(this) { // from class: com.staircase3.opensignal.viewcontrollers.c

                                                                                                                                    /* renamed from: d, reason: collision with root package name */
                                                                                                                                    public final /* synthetic */ TabCoverage f6333d;

                                                                                                                                    {
                                                                                                                                        this.f6333d = this;
                                                                                                                                    }

                                                                                                                                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lq.h] */
                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                    public final void onClick(View view) {
                                                                                                                                        switch (i19) {
                                                                                                                                            case 0:
                                                                                                                                                TabCoverage tabCoverage = this.f6333d;
                                                                                                                                                f fVar = (f) tabCoverage.M0.getValue();
                                                                                                                                                Context contextN = tabCoverage.n();
                                                                                                                                                fVar.getClass();
                                                                                                                                                if (!f.a(contextN)) {
                                                                                                                                                    tabCoverage.i0();
                                                                                                                                                    break;
                                                                                                                                                } else if (!u.e(tabCoverage.n())) {
                                                                                                                                                    try {
                                                                                                                                                        ge.j.f(view, tabCoverage.r(qk.l.please_enable_location)).h();
                                                                                                                                                        break;
                                                                                                                                                    } catch (Exception unused2) {
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                } else if (tabCoverage.E0 != null && tabCoverage.F0 != null) {
                                                                                                                                                    final TabCoverage.NetworksForFilters networksForFilters = tabCoverage.J0;
                                                                                                                                                    ArrayList arrayList = networksForFilters.f6214c;
                                                                                                                                                    TabCoverage tabCoverage2 = TabCoverage.this;
                                                                                                                                                    View viewInflate2 = LayoutInflater.from(tabCoverage2.n()).inflate(i.dialog_network_filters, (ViewGroup) null, false);
                                                                                                                                                    TabCoverage.g0(tabCoverage2, viewInflate2, arrayList);
                                                                                                                                                    TabCoverage.h0(tabCoverage2, viewInflate2);
                                                                                                                                                    final int i20 = 0;
                                                                                                                                                    viewInflate2.findViewById(h.vShowNetworkTypesInfo).setOnClickListener(new View.OnClickListener() { // from class: com.staircase3.opensignal.viewcontrollers.e
                                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                                        public final void onClick(View view2) {
                                                                                                                                                            switch (i20) {
                                                                                                                                                                case 0:
                                                                                                                                                                    se.b.Y(TabCoverage.this.n(), i.dialog_network_types_info);
                                                                                                                                                                    break;
                                                                                                                                                                default:
                                                                                                                                                                    networksForFilters.f6212a.dismiss();
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    if (networksForFilters.f6212a == null) {
                                                                                                                                                        networksForFilters.f6212a = new i.f(tabCoverage2.n()).setView(viewInflate2).create();
                                                                                                                                                    }
                                                                                                                                                    networksForFilters.f6212a.show();
                                                                                                                                                    se.b.S(networksForFilters.f6212a, tabCoverage2.l(), 0.3f);
                                                                                                                                                    final int i21 = 1;
                                                                                                                                                    viewInflate2.findViewById(h.vBackArrowFiltersDialog).setOnClickListener(new View.OnClickListener() { // from class: com.staircase3.opensignal.viewcontrollers.e
                                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                                        public final void onClick(View view2) {
                                                                                                                                                            switch (i21) {
                                                                                                                                                                case 0:
                                                                                                                                                                    se.b.Y(TabCoverage.this.n(), i.dialog_network_types_info);
                                                                                                                                                                    break;
                                                                                                                                                                default:
                                                                                                                                                                    networksForFilters.f6212a.dismiss();
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    if (!networksForFilters.f6213b) {
                                                                                                                                                        TabCoverage.g0(tabCoverage2, networksForFilters.f6212a.getWindow().getDecorView(), networksForFilters.f6214c);
                                                                                                                                                        TabCoverage.h0(tabCoverage2, networksForFilters.f6212a.getWindow().getDecorView());
                                                                                                                                                        break;
                                                                                                                                                    } else {
                                                                                                                                                        networksForFilters.a(true);
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                } else if (!tabCoverage.p0()) {
                                                                                                                                                    se.b.a0(tabCoverage.n(), tabCoverage.n().getString(qk.l.cannot_refresh_map));
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                final TabCoverage tabCoverage3 = this.f6333d;
                                                                                                                                                tabCoverage3.f6203x0.f839i.animate().alpha(0.0f).setDuration(200L);
                                                                                                                                                tabCoverage3.f6203x0.f837g.animate().scaleX(0.01f).scaleY(0.01f).alpha(0.0f).setDuration(400L);
                                                                                                                                                ((ConstraintLayout) tabCoverage3.f6203x0.f831a.f14397g).animate().rotationX(89.0f).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: com.staircase3.opensignal.viewcontrollers.TabCoverage.3
                                                                                                                                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                                                                                                                                    public final void onAnimationEnd(Animator animator) {
                                                                                                                                                        TabCoverage tabCoverage4 = TabCoverage.this;
                                                                                                                                                        ((ConstraintLayout) tabCoverage4.f6203x0.f831a.f14397g).setVisibility(8);
                                                                                                                                                        ((RelativeLayout) tabCoverage4.f6203x0.f832b.f14397g).setVisibility(0);
                                                                                                                                                        ((RelativeLayout) tabCoverage4.f6203x0.f832b.f14397g).setRotationX(-89.0f);
                                                                                                                                                        ((RelativeLayout) tabCoverage4.f6203x0.f832b.f14397g).animate().rotationX(0.0f).setDuration(200L).setListener(null);
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                });
                                                                                                                                ((Button) this.f6203x0.f831a.f14398r).setOnClickListener(new mn.e(this, 4));
                                                                                                                                s0();
                                                                                                                                r0();
                                                                                                                                this.f6203x0.f835e.setOnClickListener(new mn.e(this, 5));
                                                                                                                                final int i20 = 1;
                                                                                                                                this.f6203x0.f837g.setOnClickListener(new View.OnClickListener(this) { // from class: com.staircase3.opensignal.viewcontrollers.c

                                                                                                                                    /* renamed from: d, reason: collision with root package name */
                                                                                                                                    public final /* synthetic */ TabCoverage f6333d;

                                                                                                                                    {
                                                                                                                                        this.f6333d = this;
                                                                                                                                    }

                                                                                                                                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lq.h] */
                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                    public final void onClick(View view) {
                                                                                                                                        switch (i20) {
                                                                                                                                            case 0:
                                                                                                                                                TabCoverage tabCoverage = this.f6333d;
                                                                                                                                                f fVar = (f) tabCoverage.M0.getValue();
                                                                                                                                                Context contextN = tabCoverage.n();
                                                                                                                                                fVar.getClass();
                                                                                                                                                if (!f.a(contextN)) {
                                                                                                                                                    tabCoverage.i0();
                                                                                                                                                    break;
                                                                                                                                                } else if (!u.e(tabCoverage.n())) {
                                                                                                                                                    try {
                                                                                                                                                        ge.j.f(view, tabCoverage.r(qk.l.please_enable_location)).h();
                                                                                                                                                        break;
                                                                                                                                                    } catch (Exception unused2) {
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                } else if (tabCoverage.E0 != null && tabCoverage.F0 != null) {
                                                                                                                                                    final TabCoverage.NetworksForFilters networksForFilters = tabCoverage.J0;
                                                                                                                                                    ArrayList arrayList = networksForFilters.f6214c;
                                                                                                                                                    TabCoverage tabCoverage2 = TabCoverage.this;
                                                                                                                                                    View viewInflate2 = LayoutInflater.from(tabCoverage2.n()).inflate(i.dialog_network_filters, (ViewGroup) null, false);
                                                                                                                                                    TabCoverage.g0(tabCoverage2, viewInflate2, arrayList);
                                                                                                                                                    TabCoverage.h0(tabCoverage2, viewInflate2);
                                                                                                                                                    final int i202 = 0;
                                                                                                                                                    viewInflate2.findViewById(h.vShowNetworkTypesInfo).setOnClickListener(new View.OnClickListener() { // from class: com.staircase3.opensignal.viewcontrollers.e
                                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                                        public final void onClick(View view2) {
                                                                                                                                                            switch (i202) {
                                                                                                                                                                case 0:
                                                                                                                                                                    se.b.Y(TabCoverage.this.n(), i.dialog_network_types_info);
                                                                                                                                                                    break;
                                                                                                                                                                default:
                                                                                                                                                                    networksForFilters.f6212a.dismiss();
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    if (networksForFilters.f6212a == null) {
                                                                                                                                                        networksForFilters.f6212a = new i.f(tabCoverage2.n()).setView(viewInflate2).create();
                                                                                                                                                    }
                                                                                                                                                    networksForFilters.f6212a.show();
                                                                                                                                                    se.b.S(networksForFilters.f6212a, tabCoverage2.l(), 0.3f);
                                                                                                                                                    final int i21 = 1;
                                                                                                                                                    viewInflate2.findViewById(h.vBackArrowFiltersDialog).setOnClickListener(new View.OnClickListener() { // from class: com.staircase3.opensignal.viewcontrollers.e
                                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                                        public final void onClick(View view2) {
                                                                                                                                                            switch (i21) {
                                                                                                                                                                case 0:
                                                                                                                                                                    se.b.Y(TabCoverage.this.n(), i.dialog_network_types_info);
                                                                                                                                                                    break;
                                                                                                                                                                default:
                                                                                                                                                                    networksForFilters.f6212a.dismiss();
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    if (!networksForFilters.f6213b) {
                                                                                                                                                        TabCoverage.g0(tabCoverage2, networksForFilters.f6212a.getWindow().getDecorView(), networksForFilters.f6214c);
                                                                                                                                                        TabCoverage.h0(tabCoverage2, networksForFilters.f6212a.getWindow().getDecorView());
                                                                                                                                                        break;
                                                                                                                                                    } else {
                                                                                                                                                        networksForFilters.a(true);
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                } else if (!tabCoverage.p0()) {
                                                                                                                                                    se.b.a0(tabCoverage.n(), tabCoverage.n().getString(qk.l.cannot_refresh_map));
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                final TabCoverage tabCoverage3 = this.f6333d;
                                                                                                                                                tabCoverage3.f6203x0.f839i.animate().alpha(0.0f).setDuration(200L);
                                                                                                                                                tabCoverage3.f6203x0.f837g.animate().scaleX(0.01f).scaleY(0.01f).alpha(0.0f).setDuration(400L);
                                                                                                                                                ((ConstraintLayout) tabCoverage3.f6203x0.f831a.f14397g).animate().rotationX(89.0f).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: com.staircase3.opensignal.viewcontrollers.TabCoverage.3
                                                                                                                                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                                                                                                                                    public final void onAnimationEnd(Animator animator) {
                                                                                                                                                        TabCoverage tabCoverage4 = TabCoverage.this;
                                                                                                                                                        ((ConstraintLayout) tabCoverage4.f6203x0.f831a.f14397g).setVisibility(8);
                                                                                                                                                        ((RelativeLayout) tabCoverage4.f6203x0.f832b.f14397g).setVisibility(0);
                                                                                                                                                        ((RelativeLayout) tabCoverage4.f6203x0.f832b.f14397g).setRotationX(-89.0f);
                                                                                                                                                        ((RelativeLayout) tabCoverage4.f6203x0.f832b.f14397g).animate().rotationX(0.0f).setDuration(200L).setListener(null);
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                });
                                                                                                                                this.f6203x0.f836f.setOnClickListener(new mn.e(this, 6));
                                                                                                                                Toolbar toolbar = ((MainActivity) l()).W;
                                                                                                                                if (toolbar != null) {
                                                                                                                                    toolbar.setVisibility(8);
                                                                                                                                }
                                                                                                                                v0();
                                                                                                                                se.b.W((Activity) n(), qk.d.status_bar_background);
                                                                                                                                s0();
                                                                                                                                i0();
                                                                                                                                ((ImageButton) this.f6203x0.f832b.f14395a).setOnClickListener(new mn.e(this, 7));
                                                                                                                                ((ImageButton) this.f6203x0.f832b.f14396d).setOnClickListener(new mn.e(this, 8));
                                                                                                                                Context contextN = n();
                                                                                                                                if (contextN != null) {
                                                                                                                                    ((AutoCompleteTextView) this.f6203x0.f832b.f14398r).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: mn.b
                                                                                                                                        @Override // android.widget.TextView.OnEditorActionListener
                                                                                                                                        public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                                                                                                                                            if ((keyEvent == null || keyEvent.getKeyCode() != 66) && i21 != 6) {
                                                                                                                                                return false;
                                                                                                                                            }
                                                                                                                                            TabCoverage tabCoverage = this.f16888a;
                                                                                                                                            ((AutoCompleteTextView) tabCoverage.f6203x0.f832b.f14398r).setText("");
                                                                                                                                            ((AutoCompleteTextView) tabCoverage.f6203x0.f832b.f14398r).dismissDropDown();
                                                                                                                                            kc.f.m(tabCoverage.n(), (RelativeLayout) tabCoverage.f6203x0.f832b.f14397g);
                                                                                                                                            tabCoverage.j0();
                                                                                                                                            return false;
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    sk.b bVar = new sk.b(contextN, i.coverage_search_widget_row, this.I0);
                                                                                                                                    bVar.f22065c = new mn.a(this);
                                                                                                                                    ((AutoCompleteTextView) this.f6203x0.f832b.f14398r).setAdapter(bVar);
                                                                                                                                }
                                                                                                                                p pVar = new p(2);
                                                                                                                                View viewInflate2 = layoutInflater.inflate(i.location_services_disabled, (ViewGroup) null, false);
                                                                                                                                int i21 = h.locationServicesDisabledText;
                                                                                                                                TextView textView7 = (TextView) b4.A(viewInflate2, i21);
                                                                                                                                if (textView7 != null) {
                                                                                                                                    i21 = h.locationServicesDisabledTitle;
                                                                                                                                    TextView textView8 = (TextView) b4.A(viewInflate2, i21);
                                                                                                                                    if (textView8 != null) {
                                                                                                                                        i21 = h.takeMeToSettingsButton;
                                                                                                                                        Button button2 = (Button) b4.A(viewInflate2, i21);
                                                                                                                                        if (button2 != null) {
                                                                                                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) viewInflate2;
                                                                                                                                            Resources resources = constraintLayout4.getResources();
                                                                                                                                            textView8.setText(resources != null ? resources.getString(qk.l.coverage_location_disabled_title) : null);
                                                                                                                                            Resources resources2 = constraintLayout4.getResources();
                                                                                                                                            textView7.setText(resources2 != null ? resources2.getString(qk.l.coverage_location_disabled_message) : null);
                                                                                                                                            button2.setOnClickListener(new am.b(19, pVar));
                                                                                                                                            pVar.f19481d = new mn.a(this);
                                                                                                                                            button2.setBackgroundColor(n().getColor(qk.d.primary_1));
                                                                                                                                            button2.setVisibility(0);
                                                                                                                                            this.f6203x0.j.addView(constraintLayout4);
                                                                                                                                            final t tVar = new t();
                                                                                                                                            View viewInflate3 = layoutInflater.inflate(i.background_location_tab_coverage_widget, (ViewGroup) null, false);
                                                                                                                                            int i22 = h.backgroundLocationText;
                                                                                                                                            TextView textView9 = (TextView) b4.A(viewInflate3, i22);
                                                                                                                                            if (textView9 != null) {
                                                                                                                                                i22 = h.dismissButton;
                                                                                                                                                Button button3 = (Button) b4.A(viewInflate3, i22);
                                                                                                                                                if (button3 != null) {
                                                                                                                                                    i22 = h.guideline;
                                                                                                                                                    Guideline guideline = (Guideline) b4.A(viewInflate3, i22);
                                                                                                                                                    if (guideline != null) {
                                                                                                                                                        i22 = h.learnHowButton;
                                                                                                                                                        Button button4 = (Button) b4.A(viewInflate3, i22);
                                                                                                                                                        if (button4 != null) {
                                                                                                                                                            i22 = h.map_location;
                                                                                                                                                            ImageView imageView4 = (ImageView) b4.A(viewInflate3, i22);
                                                                                                                                                            if (imageView4 != null && (viewA4 = b4.A(viewInflate3, (i22 = h.view3))) != null) {
                                                                                                                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) viewInflate3;
                                                                                                                                                                tVar.f12736a = new bm.d(constraintLayout5, textView9, button3, guideline, button4, imageView4, viewA4);
                                                                                                                                                                Resources resources3 = constraintLayout5.getResources();
                                                                                                                                                                Spanned spannedFromHtml = Html.fromHtml(resources3 != null ? resources3.getString(qk.l.coverage_background_location_disabled_message) : null);
                                                                                                                                                                br.l.d(spannedFromHtml, "fromHtml(...)");
                                                                                                                                                                textView9.setText(spannedFromHtml);
                                                                                                                                                                final int i23 = 0;
                                                                                                                                                                button3.setOnClickListener(new View.OnClickListener() { // from class: om.c
                                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                                    public final void onClick(View view) {
                                                                                                                                                                        switch (i23) {
                                                                                                                                                                            case 0:
                                                                                                                                                                                d dVar2 = (d) tVar.f12737d;
                                                                                                                                                                                if (dVar2 != null) {
                                                                                                                                                                                    dVar2.c();
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            case 1:
                                                                                                                                                                                d dVar3 = (d) tVar.f12737d;
                                                                                                                                                                                if (dVar3 != null) {
                                                                                                                                                                                    dVar3.a();
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                d dVar4 = (d) tVar.f12737d;
                                                                                                                                                                                if (dVar4 != null) {
                                                                                                                                                                                    dVar4.b();
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                });
                                                                                                                                                                final int i24 = 1;
                                                                                                                                                                button4.setOnClickListener(new View.OnClickListener() { // from class: om.c
                                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                                    public final void onClick(View view) {
                                                                                                                                                                        switch (i24) {
                                                                                                                                                                            case 0:
                                                                                                                                                                                d dVar2 = (d) tVar.f12737d;
                                                                                                                                                                                if (dVar2 != null) {
                                                                                                                                                                                    dVar2.c();
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            case 1:
                                                                                                                                                                                d dVar3 = (d) tVar.f12737d;
                                                                                                                                                                                if (dVar3 != null) {
                                                                                                                                                                                    dVar3.a();
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                d dVar4 = (d) tVar.f12737d;
                                                                                                                                                                                if (dVar4 != null) {
                                                                                                                                                                                    dVar4.b();
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                });
                                                                                                                                                                final int i25 = 2;
                                                                                                                                                                imageView4.setOnClickListener(new View.OnClickListener() { // from class: om.c
                                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                                    public final void onClick(View view) {
                                                                                                                                                                        switch (i25) {
                                                                                                                                                                            case 0:
                                                                                                                                                                                d dVar2 = (d) tVar.f12737d;
                                                                                                                                                                                if (dVar2 != null) {
                                                                                                                                                                                    dVar2.c();
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            case 1:
                                                                                                                                                                                d dVar3 = (d) tVar.f12737d;
                                                                                                                                                                                if (dVar3 != null) {
                                                                                                                                                                                    dVar3.a();
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                d dVar4 = (d) tVar.f12737d;
                                                                                                                                                                                if (dVar4 != null) {
                                                                                                                                                                                    dVar4.b();
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                });
                                                                                                                                                                tVar.f12737d = new om.d() { // from class: com.staircase3.opensignal.viewcontrollers.TabCoverage.1
                                                                                                                                                                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lq.h] */
                                                                                                                                                                    @Override // om.d
                                                                                                                                                                    public final void a() {
                                                                                                                                                                        TabCoverage tabCoverage = TabCoverage.this;
                                                                                                                                                                        ((com.staircase3.opensignal.utils.a) tabCoverage.N0.getValue()).c("tab_coverage", "learn_how_super_user_button", "clicked_learn_how_button");
                                                                                                                                                                        tabCoverage.f0(new Intent(tabCoverage.n(), (Class<?>) SuperUserActivity.class));
                                                                                                                                                                        tabCoverage.f6203x0.k.setVisibility(0);
                                                                                                                                                                    }

                                                                                                                                                                    @Override // om.d
                                                                                                                                                                    public final void b() {
                                                                                                                                                                        bm.d dVar2 = (bm.d) tVar.f12736a;
                                                                                                                                                                        if (dVar2 == null) {
                                                                                                                                                                            br.l.l("binding");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((ConstraintLayout) dVar2.f2826d, "translationY", 0.0f);
                                                                                                                                                                        objectAnimatorOfFloat.setInterpolator(new q4.a(2));
                                                                                                                                                                        objectAnimatorOfFloat.setDuration(250L);
                                                                                                                                                                        objectAnimatorOfFloat.start();
                                                                                                                                                                        TabCoverage tabCoverage = TabCoverage.this;
                                                                                                                                                                        d(tabCoverage.f6203x0.k, true);
                                                                                                                                                                        d(tabCoverage.f6203x0.f836f, true);
                                                                                                                                                                        d(tabCoverage.f6203x0.f837g, true);
                                                                                                                                                                    }

                                                                                                                                                                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lq.h] */
                                                                                                                                                                    @Override // om.d
                                                                                                                                                                    public final void c() {
                                                                                                                                                                        TabCoverage tabCoverage = TabCoverage.this;
                                                                                                                                                                        ((com.staircase3.opensignal.utils.a) tabCoverage.N0.getValue()).c("tab_coverage", "exit_super_user_dialog", "x_on_learn_how_dialog_clicked");
                                                                                                                                                                        bm.d dVar2 = (bm.d) tVar.f12736a;
                                                                                                                                                                        if (dVar2 == null) {
                                                                                                                                                                            br.l.l("binding");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((ConstraintLayout) dVar2.f2826d, "translationY", r2.getHeight() - ((Guideline) dVar2.f2827g).getY());
                                                                                                                                                                        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator());
                                                                                                                                                                        objectAnimatorOfFloat.setDuration(250L);
                                                                                                                                                                        objectAnimatorOfFloat.start();
                                                                                                                                                                        d(tabCoverage.f6203x0.k, false);
                                                                                                                                                                        d(tabCoverage.f6203x0.f836f, false);
                                                                                                                                                                        d(tabCoverage.f6203x0.f837g, false);
                                                                                                                                                                    }

                                                                                                                                                                    public final void d(View view, boolean z10) {
                                                                                                                                                                        TabCoverage tabCoverage = TabCoverage.this;
                                                                                                                                                                        int iU = se.b.u(tabCoverage.X(), 75);
                                                                                                                                                                        float height = tabCoverage.f6203x0.f841m.getHeight();
                                                                                                                                                                        if (z10) {
                                                                                                                                                                            height = iU;
                                                                                                                                                                        }
                                                                                                                                                                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", height);
                                                                                                                                                                        objectAnimatorOfFloat.setInterpolator(!z10 ? new OvershootInterpolator() : new q4.a(2));
                                                                                                                                                                        objectAnimatorOfFloat.setStartDelay(50L);
                                                                                                                                                                        objectAnimatorOfFloat.setDuration(250L);
                                                                                                                                                                        objectAnimatorOfFloat.start();
                                                                                                                                                                    }
                                                                                                                                                                };
                                                                                                                                                                this.f6203x0.f841m.addView(constraintLayout5);
                                                                                                                                                                LinearLayout linearLayout4 = this.f6203x0.f842n;
                                                                                                                                                                View viewInflate4 = layoutInflater.inflate(i.thank_you_confirmation, (ViewGroup) null, false);
                                                                                                                                                                int i26 = h.thankYouConfirmation;
                                                                                                                                                                TextView textView10 = (TextView) b4.A(viewInflate4, i26);
                                                                                                                                                                if (textView10 == null) {
                                                                                                                                                                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i26)));
                                                                                                                                                                }
                                                                                                                                                                ConstraintLayout constraintLayout6 = (ConstraintLayout) viewInflate4;
                                                                                                                                                                Resources resources4 = constraintLayout6.getResources();
                                                                                                                                                                textView10.setText(resources4 != null ? resources4.getString(qk.l.thank_you_confirmation) : null);
                                                                                                                                                                linearLayout4.addView(constraintLayout6);
                                                                                                                                                                return constraintLayout3;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i22)));
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i21)));
                                                                                                                            } finally {
                                                                                                                                StrictMode.setThreadPolicy(threadPolicy);
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
                                                                                i10 = i18;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            throw new NullPointerException("Missing required view with ID: ".concat(viewA8.getResources().getResourceName(i16)));
                                                        }
                                                    } else {
                                                        i14 = i15;
                                                    }
                                                }
                                            }
                                            throw new NullPointerException("Missing required view with ID: ".concat(viewA7.getResources().getResourceName(i14)));
                                        }
                                    } else {
                                        i11 = i13;
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i12)));
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewA5.getResources().getResourceName(i11)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.b
    public final void G() {
        e0(false);
        this.f1410c0 = true;
    }

    @Override // androidx.fragment.app.b
    public final void H() {
        ArrayList arrayList = this.H0;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((uk.c) it.next()).cancel(true);
            }
            this.H0.clear();
        }
        uc.i iVar = this.f6203x0.f840l.f5336a;
        jc.c cVar = iVar.f13586a;
        if (cVar != null) {
            cVar.g();
        } else {
            iVar.c(1);
        }
        this.C0 = null;
        this.f6205z0 = null;
        this.f6204y0 = null;
        this.f6203x0 = null;
        this.f1410c0 = true;
    }

    @Override // androidx.fragment.app.b
    public final void N() {
        uc.i iVar = this.f6203x0.f840l.f5336a;
        jc.c cVar = iVar.f13586a;
        if (cVar != null) {
            cVar.e();
        } else {
            iVar.c(5);
        }
        ThankYouConfirmationMessageThread thankYouConfirmationMessageThread = this.Q0;
        if (thankYouConfirmationMessageThread != null) {
            thankYouConfirmationMessageThread.interrupt();
        }
        qm.c cVar2 = this.K0;
        ((pc.a) cVar2.f20919g).d((ji.a) cVar2.f20920r);
        ((CopyOnWriteArrayList) this.K0.f20918d).remove(this);
        this.f1410c0 = true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, lq.h] */
    @Override // qm.l, androidx.fragment.app.b
    public final void O() throws InterruptedException {
        super.O();
        uc.i iVar = this.f6203x0.f840l.f5336a;
        iVar.getClass();
        iVar.d(null, new jc.i(iVar, 1));
        qm.c cVarY = qm.c.y();
        this.K0 = cVarY;
        Context contextX = X();
        if (((pc.a) cVarY.f20919g) == null) {
            int i10 = tc.a.f22695a;
            cVarY.f20919g = new pc.a(contextX, null, pc.a.j, ac.b.f322a, ac.e.f324b);
        }
        this.K0.u(this);
        qm.c cVar = this.K0;
        Context contextX2 = X();
        ?? r32 = this.M0;
        cVar.Q(contextX2, (f) r32.getValue());
        f fVar = (f) r32.getValue();
        j jVarW = W();
        fVar.getClass();
        boolean zA = f.a(jVarW);
        f fVar2 = (f) r32.getValue();
        Context contextX3 = X();
        fVar2.getClass();
        boolean zB = f.b(contextX3);
        x0(!zA);
        q3.a aVar = this.f6204y0;
        if (aVar != null && zA) {
            aVar.O0();
        }
        if (Build.VERSION.SDK_INT < 29 || !zA) {
            return;
        }
        this.f6203x0.f841m.setVisibility(!zB ? 0 : 8);
        float fU = se.b.u(X(), !zB ? 75 : 0);
        this.f6203x0.k.setTranslationY(fU);
        this.f6203x0.f837g.setTranslationY(fU);
        this.f6203x0.f836f.setTranslationY(fU);
        if (zB) {
            boolean z10 = q.c(n()).getBoolean("key_thank_you_confirmation", false);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ThankYouConfirmationMessageThread thankYouConfirmationMessageThread = new ThankYouConfirmationMessageThread(this, countDownLatch, z10);
            this.Q0 = thankYouConfirmationMessageThread;
            thankYouConfirmationMessageThread.start();
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
            q.a(n()).putBoolean("key_thank_you_confirmation", false).apply();
        }
    }

    @Override // androidx.fragment.app.b
    public final void P(Bundle bundle) {
        al.e eVar = this.f6203x0;
        if (eVar != null) {
            uc.i iVar = eVar.f840l.f5336a;
            jc.c cVar = iVar.f13586a;
            if (cVar != null) {
                cVar.f(bundle);
            } else {
                Bundle bundle2 = iVar.f13587b;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
            }
        }
        e0(true);
    }

    @Override // androidx.fragment.app.b
    public final void R() {
        Toolbar toolbar = ((MainActivity) l()).W;
        if (toolbar != null) {
            toolbar.setVisibility(0);
        }
        this.f1410c0 = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    public final void i0() {
        f fVar = (f) this.M0.getValue();
        j jVarL = l();
        fVar.getClass();
        f.d(jVarL, 6);
    }

    public final void j0() {
        this.f6203x0.f839i.animate().alpha(1.0f).setDuration(200L);
        this.f6203x0.f837g.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(400L);
        ((RelativeLayout) this.f6203x0.f832b.f14397g).animate().rotationX(-89.0f).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: com.staircase3.opensignal.viewcontrollers.TabCoverage.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                TabCoverage tabCoverage = TabCoverage.this;
                ((RelativeLayout) tabCoverage.f6203x0.f832b.f14397g).setVisibility(8);
                ((ConstraintLayout) tabCoverage.f6203x0.f831a.f14397g).setVisibility(0);
                ((ConstraintLayout) tabCoverage.f6203x0.f831a.f14397g).setRotationX(89.0f);
                ((ConstraintLayout) tabCoverage.f6203x0.f831a.f14397g).animate().rotationX(0.0f).setDuration(200L).setListener(null);
            }
        });
        kc.f.m(n(), (RelativeLayout) this.f6203x0.f832b.f14397g);
    }

    public final String k0() {
        boolean zD = q.d(n());
        boolean zE = q.e(n());
        boolean zF = q.f(n());
        String strF = zD ? "2G/3G" : "";
        if (zE) {
            if (zD) {
                strF = strF.concat("/");
            }
            strF = w.g.f(strF, "4G");
        }
        if (!zF) {
            return strF;
        }
        if (zD || zE) {
            strF = w.g.f(strF, "/");
        }
        return w.g.f(strF, "5G");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, lq.h] */
    public final void l0() {
        q3.a aVar = this.f6204y0;
        if (aVar != null) {
            try {
                vc.g gVar = (vc.g) aVar.f20679d;
                Parcel parcelE = gVar.e(gVar.R(), 21);
                int i10 = qc.l.f20842a;
                boolean z10 = parcelE.readInt() != 0;
                parcelE.recycle();
                if (z10) {
                    Runnable runnable = new Runnable() { // from class: com.staircase3.opensignal.viewcontrollers.TabCoverage.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            TabCoverage tabCoverage = TabCoverage.this;
                            if (tabCoverage.f6203x0 != null) {
                                tabCoverage.w0();
                            }
                        }
                    };
                    LatLng latLng = this.D0;
                    if (latLng != null) {
                        t1.e(this.f6204y0, latLng, ((el.b) this.O0.getValue()).f8205c, runnable);
                    }
                }
            } catch (RemoteException e4) {
                throw new n(e4);
            }
        }
    }

    public final tm.g m0(boolean z10) {
        LatLng latLng;
        p0();
        ArrayList arrayList = new ArrayList();
        if (q.d(n())) {
            arrayList.add("2");
            arrayList.add("3");
        }
        if (q.e(n())) {
            arrayList.add("4");
        }
        if (q.f(n())) {
            arrayList.add("5");
        }
        ArrayList arrayList2 = new ArrayList();
        if (z10) {
            arrayList2.add(Integer.valueOf(q.b(n())));
        }
        LatLng latLng2 = this.E0;
        if (latLng2 == null || (latLng = this.F0) == null) {
            return null;
        }
        return new tm.g(new tm.a(latLng2.f5347a, latLng.f5348d, latLng.f5347a, latLng2.f5348d, this.G0), arrayList, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lq.h] */
    @Override // qm.b
    public final void onLocationChanged(Location location) {
        if (location != null) {
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
            vc.e.f23907a = latLng;
            this.D0 = latLng;
            if (this.L0) {
                return;
            }
            t1.e(this.f6204y0, latLng, ((el.b) this.O0.getValue()).f8205c, null);
            this.L0 = true;
        }
    }

    @Override // androidx.fragment.app.b, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1410c0 = true;
        jc.c cVar = this.f6203x0.f840l.f5336a.f13586a;
        if (cVar != null) {
            cVar.onLowMemory();
        }
    }

    public final boolean p0() {
        try {
            this.E0 = this.f6204y0.E0().B().f5384g;
            this.F0 = this.f6204y0.E0().B().f5383d;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void q0() {
        cj.a aVarG = sm.f.G(q.b(n()));
        if (aVarG != null) {
            String str = (String) aVarG.f3977x;
            if (str != null && !str.isEmpty()) {
                try {
                    int color = Color.parseColor("#" + str.toUpperCase());
                    if (((ImageView) ((r2) this.f6203x0.f831a.f14396d).f10472g).getBackground() != null) {
                        ((ImageView) ((r2) this.f6203x0.f831a.f14396d).f10472g).getBackground().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP));
                    }
                } catch (Exception unused) {
                    if (((ImageView) ((r2) this.f6203x0.f831a.f14396d).f10472g).getBackground() != null) {
                        ((ImageView) ((r2) this.f6203x0.f831a.f14396d).f10472g).getBackground().setColorFilter(null);
                    }
                }
            }
            try {
                l0 l0VarD = f0.f(n()).d((String) aVarG.f3975g);
                int i10 = qk.f.ic_logo_placeholder;
                if (i10 == 0) {
                    throw new IllegalArgumentException("Placeholder image resource invalid.");
                }
                l0VarD.f5930d = i10;
                l0VarD.c((ImageView) ((r2) this.f6203x0.f831a.f14396d).f10471d, null);
            } catch (Exception unused2) {
                f0 f0VarF = f0.f(n());
                int i11 = qk.f.ic_logo_placeholder;
                f0VarF.getClass();
                if (i11 == 0) {
                    throw new IllegalArgumentException("Resource ID must not be zero.");
                }
                new l0(f0VarF, null, i11).c((ImageView) ((r2) this.f6203x0.f831a.f14396d).f10471d, null);
            }
        }
    }

    public final void r0() {
        Context contextN = n();
        String string = q.c(contextN).getString("filtered_network_name", contextN.getString(qk.l.all_operators));
        ((TextView) ((r2) this.f6203x0.f831a.f14396d).f10475y).setText(string);
        RelativeLayout relativeLayout = (RelativeLayout) ((r2) this.f6203x0.f831a.f14396d).f10473r;
        if (string.equalsIgnoreCase(r(qk.l.all_operators))) {
            ((ImageView) ((r2) this.f6203x0.f831a.f14396d).f10471d).setVisibility(8);
            ((ImageView) ((r2) this.f6203x0.f831a.f14396d).f10472g).setVisibility(8);
            relativeLayout.setVisibility(8);
        } else {
            ((ImageView) ((r2) this.f6203x0.f831a.f14396d).f10471d).setVisibility(0);
            ((ImageView) ((r2) this.f6203x0.f831a.f14396d).f10472g).setVisibility(0);
            relativeLayout.setVisibility(0);
        }
    }

    public final void s0() {
        ((TextView) ((r2) this.f6203x0.f831a.f14396d).f10474x).setText(k0());
    }

    public final void t0() {
        s0();
        v0();
        if (q.b(n()) != 0) {
            u0();
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, lq.h] */
    public final void u0() {
        tm.g gVarM0 = m0(true);
        r2 r2Var = this.f6203x0.f833c;
        View view = (View) r2Var.f10475y;
        ProgressBar progressBar = (ProgressBar) r2Var.f10471d;
        progressBar.setVisibility(0);
        view.setVisibility(0);
        uk.c cVar = new uk.c((el.b) this.O0.getValue(), gVarM0, true, new h4(this, progressBar, view, 5));
        this.H0.add(cVar);
        cVar.execute(new Void[0]);
    }

    public final void v0() {
        wc.e eVar = this.f6205z0;
        if (eVar != null) {
            eVar.getClass();
            try {
                qc.g gVar = (qc.g) eVar.f24411a;
                gVar.S(gVar.R(), 2);
            } catch (RemoteException e4) {
                throw new n(e4);
            }
        }
    }

    public final void w0() {
        Context contextN = n();
        q.a(contextN).putString("filtered_network_name", r(qk.l.all_operators)).apply();
        q.a(n()).putInt("filtered_network_id", 0).apply();
        r0();
        ((ImageView) ((r2) this.f6203x0.f831a.f14396d).f10471d).setBackground(null);
        ((RelativeLayout) this.f6203x0.f833c.f10470a).setVisibility(8);
        y0(false);
        v0();
    }

    public final void x0(boolean z10) {
        this.f6203x0.j.setVisibility(z10 ? 0 : 8);
        this.f6203x0.f836f.setVisibility(!z10 ? 0 : 8);
        this.f6203x0.f837g.setVisibility(z10 ? 8 : 0);
    }

    public final void y0(boolean z10) {
        this.f6203x0.f839i.setVisibility(z10 ? 0 : 8);
    }

    @Override // androidx.fragment.app.b
    public final void z(Bundle bundle) {
        this.f1410c0 = true;
        i0();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, lq.h] */
    public final void z0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            se.b.a0(n(), n().getString(qk.l.no_data_change_filter));
            return;
        }
        Collections.sort(arrayList, new androidx.media3.exoplayer.trackselection.d(18));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((sm.d) it.next()).getClass();
        }
        this.B0.setAdapter(new sk.h(n(), (com.staircase3.opensignal.utils.a) this.N0.getValue(), arrayList, k0()));
    }
}
