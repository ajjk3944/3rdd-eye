package com.staircase3.opensignal.activities;

import a5.s;
import android.R;
import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.exoplayer2.ui.e0;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.squareup.picasso.f0;
import com.staircase3.opensignal.OpensignalApplication;
import com.staircase3.opensignal.utils.k;
import com.staircase3.opensignal.utils.q;
import com.staircase3.opensignal.utils.r;
import com.staircase3.opensignal.utils.u;
import com.staircase3.opensignal.viewcontrollers.TabCoverage;
import com.staircase3.opensignal.viewcontrollers.Tab_Overview;
import d8.e;
import fj.o;
import i.j;
import io.sentry.internal.debugmeta.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import lq.h;
import oh.p;
import org.json.JSONException;
import org.json.JSONObject;
import p.l2;
import pm.b;
import qk.i;
import qk.l;
import qm.f;
import qm.g;
import wt.d0;
import wt.w;
import xu.d;

@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class MainActivity extends j implements b, qm.b {
    public static Boolean A0 = null;
    public static Boolean B0 = null;
    public static boolean C0 = false;
    public static boolean D0 = false;
    public static boolean E0 = false;

    /* renamed from: x0, reason: collision with root package name */
    public static boolean f5997x0 = false;

    /* renamed from: y0, reason: collision with root package name */
    public static boolean f5998y0 = false;

    /* renamed from: z0, reason: collision with root package name */
    public static Boolean f5999z0 = Boolean.TRUE;
    public MainActivity T;
    public Uri U;
    public qm.a V;
    public Toolbar W;
    public TextView X;
    public final Object Y;
    public final s Z;

    /* renamed from: a0, reason: collision with root package name */
    public final IntentFilter f6000a0;

    /* renamed from: b0, reason: collision with root package name */
    public BottomNavigationView f6001b0;

    /* renamed from: c0, reason: collision with root package name */
    public o f6002c0;

    /* renamed from: d0, reason: collision with root package name */
    public AsyncTask f6003d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6004e0;

    /* renamed from: f0, reason: collision with root package name */
    public TelephonyManager f6005f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Object f6006g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Object f6007h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Object f6008i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Object f6009j0;

    /* renamed from: k0, reason: collision with root package name */
    public final Object f6010k0;

    /* renamed from: l0, reason: collision with root package name */
    public final Object f6011l0;

    /* renamed from: m0, reason: collision with root package name */
    public final Object f6012m0;

    /* renamed from: n0, reason: collision with root package name */
    public final Object f6013n0;

    /* renamed from: o0, reason: collision with root package name */
    public final Object f6014o0;

    /* renamed from: p0, reason: collision with root package name */
    public final Object f6015p0;

    /* renamed from: q0, reason: collision with root package name */
    public final Object f6016q0;

    /* renamed from: r0, reason: collision with root package name */
    public hn.b f6017r0;

    /* renamed from: s0, reason: collision with root package name */
    public c f6018s0;

    /* renamed from: t0, reason: collision with root package name */
    public final AtomicBoolean f6019t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f6020u0;

    /* renamed from: v0, reason: collision with root package name */
    public qm.c f6021v0;

    /* renamed from: w0, reason: collision with root package name */
    public final p f6022w0;

    static {
        Boolean bool = Boolean.FALSE;
        A0 = bool;
        B0 = bool;
        D0 = false;
        E0 = false;
    }

    public MainActivity() {
        h hVarA = y3.A(com.staircase3.opensignal.utils.o.class);
        this.Y = hVarA;
        this.Z = new s((com.staircase3.opensignal.utils.o) hVarA.getValue());
        this.f6000a0 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        this.f6004e0 = false;
        this.f6006g0 = y3.A(g.class);
        this.f6007h0 = y3.A(vl.a.class);
        this.f6008i0 = y3.A(cm.a.class);
        this.f6009j0 = y3.A(f.class);
        this.f6010k0 = y3.A(r.class);
        this.f6011l0 = y3.A(jn.b.class);
        this.f6012m0 = y3.A(ch.f.class);
        this.f6013n0 = y3.A(com.staircase3.opensignal.utils.a.class);
        this.f6014o0 = y3.A(k.class);
        this.f6015p0 = y3.A(el.b.class);
        this.f6016q0 = y3.A(xm.a.class);
        this.f6019t0 = new AtomicBoolean(false);
        this.f6020u0 = false;
        this.f6022w0 = new p(10, this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lq.h] */
    public final void A() {
        C0 = false;
        ?? r12 = this.f6007h0;
        SharedPreferences.Editor editorEdit = ((vl.a) r12.getValue()).f23928a.edit();
        editorEdit.putBoolean("first_use", false);
        editorEdit.apply();
        SharedPreferences.Editor editorEdit2 = ((vl.a) r12.getValue()).f23928a.edit();
        editorEdit2.putBoolean("first_use", false);
        editorEdit2.apply();
        if (q.c(this).getInt("session_nr", 0) < y().A) {
            return;
        }
        if (y().f8226z) {
            q.a(this).putBoolean("prefs_survey_dialog_shown", false).commit();
        }
        boolean z10 = q.c(this).getBoolean("prefs_survey_dialog_shown", false);
        if (!y().f8225y || z10) {
            return;
        }
        o oVar = new o(this, i.custom_dialog, (RelativeLayout) findViewById(qk.h.dialogPlaceholder));
        this.f6002c0 = oVar;
        oVar.f8947f = new o2.g(12, this);
        oVar.f8948g = new l2(10, this);
        el.b bVarY = y();
        o oVar2 = this.f6002c0;
        String str = bVarY.f8212l;
        ImageView imageView = (ImageView) oVar2.k;
        if (!TextUtils.isEmpty(str)) {
            f0.f((MainActivity) oVar2.f8952m).d(str).c(imageView, null);
        }
        o oVar3 = this.f6002c0;
        String str2 = bVarY.f8213m;
        ImageView imageView2 = (ImageView) oVar3.f8951l;
        if (!TextUtils.isEmpty(str2)) {
            f0.f((MainActivity) oVar3.f8952m).d(str2).c(imageView2, null);
        }
        o oVar4 = this.f6002c0;
        String str3 = bVarY.f8214n;
        oVar4.getClass();
        if (!TextUtils.isEmpty(str3)) {
            ((TextView) oVar4.f8949h).setText(str3);
        }
        o oVar5 = this.f6002c0;
        float f10 = (float) bVarY.f8215o;
        TextView textView = (TextView) oVar5.f8949h;
        if (textView != null) {
            textView.setTextSize(f10);
        }
        o oVar6 = this.f6002c0;
        String str4 = bVarY.f8216p;
        oVar6.getClass();
        if (!TextUtils.isEmpty(str4)) {
            ((TextView) oVar6.f8950i).setText(str4);
        }
        o oVar7 = this.f6002c0;
        float f11 = (float) bVarY.f8217q;
        TextView textView2 = (TextView) oVar7.f8950i;
        if (textView2 != null) {
            textView2.setTextSize(f11);
        }
        o oVar8 = this.f6002c0;
        String str5 = bVarY.f8218r;
        oVar8.getClass();
        if (!TextUtils.isEmpty(str5)) {
            ((TextView) oVar8.j).setText(str5);
        }
        o oVar9 = this.f6002c0;
        float f12 = (float) bVarY.f8219s;
        TextView textView3 = (TextView) oVar9.j;
        if (textView3 != null) {
            textView3.setTextSize(f12);
        }
        o oVar10 = this.f6002c0;
        String str6 = bVarY.f8220t;
        Button button = (Button) oVar10.f8944c;
        if (button != null && !TextUtils.isEmpty(str6)) {
            button.setText(str6);
        }
        o oVar11 = this.f6002c0;
        String str7 = bVarY.f8221u;
        Button button2 = (Button) oVar11.f8945d;
        if (button2 != null && !TextUtils.isEmpty(str7)) {
            button2.setText(str7);
        }
        o oVar12 = this.f6002c0;
        boolean z11 = bVarY.f8222v;
        Button button3 = (Button) oVar12.f8944c;
        if (button3 != null) {
            button3.setVisibility(z11 ? 0 : 8);
        }
        o oVar13 = this.f6002c0;
        boolean z12 = bVarY.f8223w;
        Button button4 = (Button) oVar13.f8945d;
        if (button4 != null) {
            button4.setVisibility(z12 ? 0 : 8);
        }
        this.f6002c0.getClass();
        this.f6002c0.f8946e = bVarY.f8224x;
        new Handler().postDelayed(new rk.c(this, 1), y().B);
    }

    public final void B(MainActivity mainActivity) {
        String string = mainActivity.getString(l.sutel_header);
        String string2 = mainActivity.getString(l.sutel_and_opensignal_message);
        i.f fVar = new i.f(mainActivity);
        LayoutInflater layoutInflater = mainActivity.getLayoutInflater();
        if (layoutInflater != null) {
            View viewInflate = layoutInflater.inflate(i.dialog_sutel_branding, (ViewGroup) null);
            fVar.setView(viewInflate);
            TextView textView = (TextView) viewInflate.findViewById(qk.h.tvTitle);
            TextView textView2 = (TextView) viewInflate.findViewById(qk.h.tvMessage);
            if (textView != null) {
                textView.setText(string);
            }
            if (textView2 != null) {
                textView2.setText(Html.fromHtml(string2));
            }
        }
        fVar.f11045a.k = false;
        int i10 = l.positive_button;
        int i11 = l.cancel;
        Linkify.addLinks(new SpannableString(Html.fromHtml(string2)), 15);
        fVar.setPositiveButton(i10, new rk.b(this, mainActivity, string));
        fVar.setNegativeButton(i11, new rk.b(this, string));
        fVar.create().show();
    }

    public final void C(String str) {
        ge.j jVarF = ge.j.f(findViewById(R.id.content), str);
        jVarF.g(getString(l.settings), new e0(6, this));
        jVarF.h();
    }

    /* JADX WARN: Type inference failed for: r11v39, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r11v46, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r11v50, types: [java.lang.Object, lq.h] */
    @Override // i.j, c.l, g3.g, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        hn.a aVar;
        super.onCreate(bundle);
        this.T = this;
        getResources();
        this.f6004e0 = y().C;
        AsyncTask.execute(new rk.c(this, 0));
        d.f25537c = Build.MODEL;
        TelephonyManager telephonyManagerA = ((r) this.f6010k0.getValue()).a(getApplicationContext());
        this.f6005f0 = telephonyManagerA;
        Context context = (Context) y3.s(Context.class);
        String string = q.c(context).getString("phonetype", context.getString(l.wifi_type));
        int phoneType = telephonyManagerA.getPhoneType();
        if (phoneType == 0) {
            string = "WIFI";
        } else if (phoneType == 1) {
            string = "GSM";
        } else if (phoneType == 2) {
            string = "CDMA";
        } else if (phoneType == 3) {
            string = "SIP";
        }
        string.equalsIgnoreCase("WIFI");
        q.a((Context) y3.s(Context.class)).putString("phonetype", string).apply();
        d.f25536b = string.equalsIgnoreCase("CDMA");
        string.equalsIgnoreCase("WIFI");
        setContentView(i.tabs_nonhoneycomb_alpha);
        kc.f.j(findViewById(qk.h.main_layout));
        Toolbar toolbar = (Toolbar) findViewById(qk.h.toolbar);
        this.W = toolbar;
        toolbar.setTitle("");
        this.W.setSubtitle("");
        w(this.W);
        TextView textView = (TextView) this.W.findViewById(qk.h.toolbarTitle);
        this.X = textView;
        textView.setText(l.opensignal_test);
        this.X.setVisibility(8);
        this.W.setBackgroundDrawable(new ColorDrawable(getResources().getColor(qk.d.navy_blue)));
        this.W.setOverflowIcon(this.T.getDrawable(qk.f.ic_contextual_menu_36dp));
        n().S(false);
        this.W.setClickable(true);
        this.W.setOnClickListener(new rk.d(this, 0));
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(qk.h.navigation);
        this.f6001b0 = bottomNavigationView;
        bottomNavigationView.setOnItemSelectedListener(this.f6022w0);
        boolean z10 = !this.f6004e0;
        MenuItem menuItemFindItem = this.f6001b0.getMenu().findItem(qk.h.bottomTabStats);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(z10);
        }
        this.f6001b0.setSelectedItemId(qk.h.bottomTabSpeedtest);
        x();
        if (((vl.a) this.f6007h0.getValue()).f23928a.getBoolean("first_use", true)) {
            View viewFindViewById = findViewById(qk.h.all_set_view);
            viewFindViewById.setVisibility(0);
            new Handler().postDelayed(new re.a(21, this, viewFindViewById, false), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        } else {
            A();
        }
        MainActivity mainActivity = this.T;
        String str = y().G;
        if (tt.l.D0(str)) {
            aVar = new hn.a();
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                aVar = new hn.a(jSONObject.getInt("daysBetweenPrompts"), jSONObject.getInt("daysSinceFirstUse"), jSONObject.getBoolean("isEnabled"), jSONObject.getInt("numberOfSpeedTestsBeforePrompt"), jSONObject.getInt("numberOfVideoTestsBeforePrompt"), jSONObject.getInt("secondsWaitAfterSpeedTestEnd"));
            } catch (JSONException unused) {
                aVar = new hn.a();
            }
        }
        this.f6017r0 = new hn.b(mainActivity, System.currentTimeMillis(), aVar);
        this.f6018s0 = new c(mainActivity, new q3.a(4, this, mainActivity, false));
        j().a(this, new am.d(3, this));
        if (((ch.f) this.f6012m0.getValue()).f3941a >= 25) {
            g gVar = (g) this.f6006g0.getValue();
            gVar.getClass();
            w.s(w.b(d0.f24610a), null, null, new e(gVar, null, 3), 3);
        }
    }

    @Override // i.j, android.app.Activity
    public final void onDestroy() {
        AsyncTask asyncTask = this.f6003d0;
        if (asyncTask != null && !asyncTask.isCancelled()) {
            this.f6003d0.cancel(true);
        }
        ((CopyOnWriteArrayList) this.f6021v0.f20918d).remove(this);
        super.onDestroy();
    }

    @Override // qm.b
    public final void onLocationChanged(Location location) {
        if (location != null) {
            vc.e.f23907a = new LatLng(location.getLatitude(), location.getLongitude());
        }
    }

    @Override // c.l, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        z(intent);
    }

    @Override // i.j, android.app.Activity
    public final void onPause() {
        try {
            unregisterReceiver(this.Z);
        } catch (IllegalArgumentException unused) {
        }
        ((CopyOnWriteArrayList) this.f6021v0.f20918d).remove(this);
        super.onPause();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, lq.h] */
    @Override // i.j, c.l, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        String str;
        if (iArr.length == 0) {
            return;
        }
        ?? r12 = this.f6009j0;
        ?? r42 = this.f6013n0;
        str = "_never_ask_again";
        switch (i10) {
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                TabCoverage tabCoverage = (TabCoverage) o().E("Map");
                int i11 = iArr[0];
                if (i11 == 0) {
                    if (!u.e(this.T)) {
                        try {
                            ge.j.f(findViewById(R.id.content), getString(l.please_enable_location)).h();
                        } catch (Exception unused) {
                        }
                    } else if (tabCoverage != null) {
                        tabCoverage.v0();
                        tabCoverage.l0();
                        tabCoverage.x0(false);
                    }
                } else if (tabCoverage != null) {
                    tabCoverage.x0(true);
                }
                f fVar = (f) r12.getValue();
                String str2 = strArr[0];
                fVar.getClass();
                br.l.e(str2, "permission");
                ((com.staircase3.opensignal.utils.a) r42.getValue()).c("permission_coverage", i11 != 0 ? "action_denied".concat(shouldShowRequestPermissionRationale(str2) ? "" : "_never_ask_again") : "action_granted", strArr[0]);
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                if (iArr[0] != 0) {
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sb2 = new StringBuilder(getString(l.permissions_needed));
                    sb2.append(" ");
                    f fVar2 = (f) r12.getValue();
                    MainActivity mainActivity = this.T;
                    fVar2.getClass();
                    if (!f.a(mainActivity)) {
                        arrayList.add(getString(l.location));
                    }
                    f fVar3 = (f) r12.getValue();
                    MainActivity mainActivity2 = this.T;
                    fVar3.getClass();
                    if (!f.c(mainActivity2, "android.permission.READ_PHONE_STATE")) {
                        arrayList.add(getString(l.Telephone));
                    }
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        sb2.append((String) arrayList.get(i12));
                        if (i12 < arrayList.size() - 1) {
                            sb2.append(", ");
                        }
                    }
                    C(sb2.toString());
                } else {
                    str = "";
                }
                ((com.staircase3.opensignal.utils.a) r42.getValue()).c("permission_speedtest", iArr[0] == 0 ? "action_granted" : "action_denied".concat(str), strArr[0]);
                if (iArr.length == 2 && strArr.length == 2) {
                    ((com.staircase3.opensignal.utils.a) r42.getValue()).c("permission_speedtest", iArr[1] != 0 ? "action_denied".concat(str) : "action_granted", strArr[1]);
                    break;
                }
                break;
            case 9:
                if (iArr[0] == 0) {
                    Tab_Overview tab_Overview = (Tab_Overview) o().E("Overview");
                    if (tab_Overview != null) {
                        tab_Overview.k0(this);
                    }
                    str = "";
                } else {
                    C(getString(l.location_permission_needed));
                }
                ((com.staircase3.opensignal.utils.a) r42.getValue()).c("permission_compass", iArr[0] != 0 ? "action_denied".concat(str) : "action_granted", strArr[0]);
                break;
            case 10:
                if (iArr[0] != 0) {
                    C(getString(l.telephone_permission_needed));
                } else {
                    str = "";
                }
                ((com.staircase3.opensignal.utils.a) r42.getValue()).c("permission_dashboard", iArr[0] != 0 ? "action_denied".concat(str) : "action_granted", strArr[0]);
                break;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, lq.h] */
    @Override // i.j, android.app.Activity
    public final void onResume() throws NumberFormatException {
        Toolbar toolbar;
        super.onResume();
        this.T.registerReceiver(this.Z, this.f6000a0);
        if (this.f6001b0.getSelectedItemId() == qk.h.bottomTabCoverage && (toolbar = this.W) != null) {
            toolbar.setVisibility(8);
        }
        NotificationManager notificationManager = (NotificationManager) getApplicationContext().getSystemService("notification");
        notificationManager.cancel(87345824);
        notificationManager.cancel(87345825);
        try {
            this.U = getIntent().getData();
            getIntent().setData(Uri.parse("ignore"));
        } catch (Exception unused) {
        }
        Uri uri = this.U;
        if (uri != null) {
            String string = uri.toString();
            if (string.length() <= 3 || !string.startsWith("http")) {
                if (string.equals("data_sharing")) {
                    this.U = Uri.parse("ignore");
                    if (B0.booleanValue()) {
                        startActivity(SettingsActivity.y(this, ((cm.a) this.f6008i0.getValue()).a(), false));
                    }
                } else if (!string.equals("ignore")) {
                    try {
                        int i10 = Integer.parseInt(this.U.toString().substring(13, 14));
                        int i11 = i10 != 1 ? i10 != 2 ? i10 != 3 ? qk.h.bottomTabSpeedtest : qk.h.bottomTabDashboard : qk.h.bottomTabCoverage : qk.h.bottomTabStats;
                        if (this.f6004e0 && i11 == qk.h.bottomTabStats) {
                            i11 = qk.h.bottomTabSpeedtest;
                        }
                        this.f6001b0.setSelectedItemId(i11);
                    } catch (Exception unused2) {
                    }
                }
            } else if (string.contains("network-coverage-maps") || string.contains("networks") || string.equals("https://opensignal.com/") || string.equals("https://opensignal.com")) {
                this.f6001b0.setSelectedItemId(qk.h.bottomTabCoverage);
            } else {
                this.f6001b0.setSelectedItemId(qk.h.bottomTabDashboard);
            }
        }
        AtomicBoolean atomicBoolean = this.f6019t0;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            ge.j.f(findViewById(R.id.content), getResources().getString(l.rating_thanks)).h();
        }
        AsyncTask.execute(new io.sentry.cache.e(this, 24, this.T));
        qm.c cVarY = qm.c.y();
        this.f6021v0 = cVarY;
        Context applicationContext = getApplicationContext();
        if (((pc.a) cVarY.f20919g) == null) {
            int i12 = tc.a.f22695a;
            cVarY.f20919g = new pc.a(applicationContext, null, pc.a.j, ac.b.f322a, ac.e.f324b);
        }
        this.f6021v0.u(this);
        z(getIntent());
    }

    @Override // i.j, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        super.onStart();
        this.U = getIntent().getData();
        if (C0) {
            TelephonyManager telephonyManager = this.f6005f0;
            lq.q qVar = u.f6195a;
            br.l.e(telephonyManager, "telephonyManager");
            if (br.l.a(u.d(this, telephonyManager), "712") && (getResources().getConfiguration().getLocales().get(0).getLanguage().equals("en") || getResources().getConfiguration().getLocales().get(0).getLanguage().equals("es"))) {
                try {
                    B(this);
                } catch (Exception unused) {
                }
            }
        }
        new IntentFilter("android.intent.action.SCREEN_ON").addAction("android.intent.action.SCREEN_OFF");
    }

    @Override // i.j, android.app.Activity
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AsyncTask.execute(new rk.a(this, 0));
        super.onStop();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lq.h] */
    public final void x() {
        if (uk.b.f23575e == null) {
            try {
                k kVar = (k) this.f6014o0.getValue();
                MainActivity mainActivity = this.T;
                r rVar = (r) this.f6010k0.getValue();
                kVar.getClass();
                this.f6003d0 = new uk.b(this.T, new tm.f(k.a(mainActivity, rVar)), null).execute(new Void[0]);
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    public final el.b y() {
        return (el.b) this.f6015p0.getValue();
    }

    public final void z(Intent intent) {
        String action;
        MenuItem item;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        if (action.equalsIgnoreCase("shortcuts.action.run_speed_test")) {
            item = this.f6001b0.getMenu().getItem(0);
            OpensignalApplication.D.set(true);
        } else if (action.equalsIgnoreCase("shortcuts.action.run_video_test")) {
            item = this.f6001b0.getMenu().getItem(0);
            OpensignalApplication.B.set(true);
        } else if (action.equalsIgnoreCase("shortcuts.action.show_coverage_map")) {
            item = this.f6001b0.getMenu().getItem(2);
        } else if (action.equalsIgnoreCase("shortcuts.action.show_compass")) {
            item = this.f6001b0.getMenu().getItem(3);
        } else {
            intent.getAction();
            Bundle extras = intent.getExtras();
            if (extras != null) {
                StringBuilder sb2 = new StringBuilder(" Bundle extras: [");
                for (String str : extras.keySet()) {
                    sb2.append(" {");
                    sb2.append(str);
                    sb2.append(':');
                    sb2.append(extras.get(str));
                    sb2.append("} ");
                }
            }
            item = null;
        }
        if (item != null) {
            this.f6001b0.setSelectedItemId(item.getItemId());
            item.setChecked(true);
            intent.setAction(null);
        }
    }
}
