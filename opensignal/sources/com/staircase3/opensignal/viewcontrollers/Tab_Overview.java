package com.staircase3.opensignal.viewcontrollers;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.e0;
import bf.n;
import bu.t;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.maps.model.LatLng;
import com.staircase3.opensignal.activities.TowersActivity;
import com.staircase3.opensignal.goldstar.widget.NetworkInfoView;
import com.staircase3.opensignal.goldstar.widget.NetworkStatusView;
import com.staircase3.opensignal.library.cells.Cell;
import com.staircase3.opensignal.library.cells.NewCell;
import com.staircase3.opensignal.models.NetworkUiState;
import com.staircase3.opensignal.osca.domain.model.ResolutionCardInfo;
import com.staircase3.opensignal.ui.views.CustRotatingCompassBg;
import com.staircase3.opensignal.utils.u;
import dn.i;
import java.util.ArrayList;
import java.util.List;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import lq.q;
import mn.g;
import mq.b0;
import qk.m;
import qm.f;
import qm.h;
import qm.j;
import qm.k;
import qm.l;
import zt.o0;

/* loaded from: classes.dex */
public class Tab_Overview extends l implements View.OnClickListener, h, qm.b {

    /* renamed from: n1, reason: collision with root package name */
    public static final Cell f6222n1 = new Cell();
    public RotateDrawable A0;
    public CustRotatingCompassBg B0;
    public RelativeLayout F0;
    public View G0;
    public Button H0;
    public TextView I0;
    public TextView J0;
    public NetworkInfoView K0;
    public LinearLayout M0;
    public NetworkUiState S0;

    /* renamed from: i1, reason: collision with root package name */
    public fl.b f6231i1;

    /* renamed from: j1, reason: collision with root package name */
    public k f6232j1;

    /* renamed from: k1, reason: collision with root package name */
    public qm.c f6233k1;

    /* renamed from: l1, reason: collision with root package name */
    public NetworkStatusView f6234l1;

    /* renamed from: x0, reason: collision with root package name */
    public TextView f6236x0;

    /* renamed from: y0, reason: collision with root package name */
    public TextView f6237y0;

    /* renamed from: z0, reason: collision with root package name */
    public RotateDrawable f6238z0;
    public View C0 = null;
    public boolean D0 = false;
    public boolean E0 = false;
    public final AtomicBoolean L0 = new AtomicBoolean(false);
    public String N0 = "Congratulations!";
    public String O0 = "We would like to chat with you to improve the Opensignal application, do you want to be part of it? We just need your contact.";
    public String P0 = "hi@opensignal.com";
    public String Q0 = "I want to be part of it!";
    public String R0 = "";
    public dn.d T0 = null;
    public i U0 = null;
    public final Object V0 = y3.A(qm.e.class);
    public final Object W0 = y3.A(f.class);
    public final Object X0 = y3.A(SensorManager.class);
    public final Object Y0 = y3.A(bn.e.class);
    public final Object Z0 = y3.A(ll.c.class);

    /* renamed from: a1, reason: collision with root package name */
    public final Object f6223a1 = y3.A(com.staircase3.opensignal.utils.a.class);

    /* renamed from: b1, reason: collision with root package name */
    public final Object f6224b1 = y3.A(an.a.class);

    /* renamed from: c1, reason: collision with root package name */
    public final Object f6225c1 = y3.A(el.b.class);

    /* renamed from: d1, reason: collision with root package name */
    public final Object f6226d1 = y3.A(el.c.class);

    /* renamed from: e1, reason: collision with root package name */
    public final Object f6227e1 = y3.A(kn.d.class);

    /* renamed from: f1, reason: collision with root package name */
    public final Object f6228f1 = y3.A(wm.a.class);

    /* renamed from: g1, reason: collision with root package name */
    public final e0 f6229g1 = new e0() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_Overview.1
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, lq.h] */
        /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, lq.h] */
        @Override // androidx.lifecycle.e0
        public final void b(Object obj) {
            double dG;
            double d6;
            double d10;
            NetworkUiState networkUiState = (NetworkUiState) obj;
            Objects.toString(networkUiState);
            Tab_Overview tab_Overview = Tab_Overview.this;
            tab_Overview.S0 = networkUiState;
            Objects.toString(networkUiState);
            if (!tab_Overview.Y && tab_Overview.w()) {
                k kVar = tab_Overview.f6232j1;
                f fVar = (f) tab_Overview.W0.getValue();
                kVar.getClass();
                float[] fArr = kVar.f20932d;
                try {
                    LatLng latLngA = vc.e.f23907a;
                    if (latLngA == null || latLngA.f5347a == 0.0d) {
                        latLngA = kVar.a(fVar);
                    }
                    NewCell newCell = kc.f.f14287c;
                    if (newCell != null && latLngA != null) {
                        double d11 = latLngA.f5347a;
                        if (d11 != 0.0d) {
                            if (Math.abs((newCell == null ? 0.0d : newCell.f()) - d11) < 2.0d) {
                                NewCell newCell2 = kc.f.f14287c;
                                if (Math.abs((newCell2 == null ? 0.0d : newCell2.g()) - latLngA.f5348d) < 2.0d) {
                                    double d12 = latLngA.f5347a;
                                    double d13 = latLngA.f5348d;
                                    NewCell newCell3 = kc.f.f14287c;
                                    double dF = newCell3 == null ? 0.0d : newCell3.f();
                                    NewCell newCell4 = kc.f.f14287c;
                                    if (newCell4 == null) {
                                        d6 = d13;
                                        d10 = d12;
                                        dG = 0.0d;
                                    } else {
                                        dG = newCell4.g();
                                        d6 = d13;
                                        d10 = d12;
                                    }
                                    Location.distanceBetween(d10, d6, dF, dG, fArr);
                                    kVar.f20935g = 0 - fArr[1];
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                NewCell newCell5 = kc.f.f14287c;
                if (newCell5 == null) {
                    kc.f.f14287c = new NewCell(networkUiState);
                } else {
                    rm.a aVar = newCell5.E;
                    if (aVar.f21658a == networkUiState.I && aVar.f21659b == networkUiState.H && aVar.f21660c == networkUiState.G) {
                        newCell5.D = networkUiState;
                    } else {
                        newCell5 = new NewCell(networkUiState);
                    }
                    kc.f.f14287c = newCell5;
                }
                if (!tab_Overview.E0) {
                    tab_Overview.E0 = true;
                    LatLng latLng = vc.e.f23907a;
                    if (latLng != null) {
                        el.b bVar = (el.b) tab_Overview.f6225c1.getValue();
                        int i10 = TowersActivity.Y0;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("2");
                        arrayList.add("3");
                        arrayList.add("4");
                        double d14 = latLng.f5347a;
                        double d15 = 0.1f;
                        double d16 = latLng.f5348d;
                        new uk.e(bVar, new tm.i(new tm.a(d14 + d15, d16 + d15, d14 - d15, d16 - d15, 12), arrayList), null).execute(new Void[0]);
                    }
                }
                NetworkUiState networkUiState2 = tab_Overview.S0;
                Objects.toString(networkUiState2);
                String str = networkUiState2.E;
                um.a aVar2 = networkUiState2.B;
                if (!str.isEmpty() && aVar2 == um.a.WIFI) {
                    tab_Overview.f6236x0.setText(tab_Overview.q().getString(qk.l.wifi) + "\n" + str);
                } else if (aVar2 == um.a.MOBILE) {
                    tab_Overview.f6236x0.setText(tab_Overview.r(qk.l.mobile) + "\n" + networkUiState2.F);
                } else {
                    tab_Overview.f6236x0.setText(qk.l.cell_radio_off);
                }
                tab_Overview.f6236x0.setSelected(true);
            }
            tab_Overview.K0.setNetworkInformation(networkUiState);
            if (tab_Overview.S0.D != com.staircase3.opensignal.utils.l.FIVE_G) {
                tab_Overview.f6237y0.setVisibility(8);
            } else {
                tab_Overview.f6237y0.setVisibility(0);
                tab_Overview.f6237y0.setText(qk.l.disclaimer);
            }
        }
    };

    /* renamed from: h1, reason: collision with root package name */
    public final mn.f f6230h1 = new mn.f(this, 0);

    /* renamed from: m1, reason: collision with root package name */
    public final mn.f f6235m1 = new mn.f(this, 1);

    @Override // androidx.fragment.app.b
    public final void D(Bundle bundle) {
        b0();
        super.D(bundle);
        this.f6232j1 = j.f20928a;
        this.f6231i1 = ((fl.c) y3.s(fl.c.class)).a();
    }

    @Override // androidx.fragment.app.b
    public final void E(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(qk.j.tab_overview_menu, menu);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v74, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, lq.h] */
    @Override // androidx.fragment.app.b
    public final View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.j jVarL = l();
        se.b.W(l(), qk.d.status_bar_background);
        k kVar = this.f6232j1;
        SensorManager sensorManager = (SensorManager) this.X0.getValue();
        kVar.getClass();
        try {
            sensorManager.unregisterListener(kVar.f20929a);
        } catch (Exception unused) {
        }
        try {
            sensorManager.unregisterListener(kVar.f20930b);
        } catch (Exception unused2) {
        }
        kVar.f20929a = new qm.i(kVar, 0);
        kVar.f20930b = new qm.i(kVar, 1);
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (defaultSensor != null) {
            sensorManager.registerListener(kVar.f20930b, defaultSensor, 2);
        } else {
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(3);
            if (defaultSensor2 != null) {
                sensorManager.registerListener(kVar.f20929a, defaultSensor2, 2);
            }
        }
        View view = this.C0;
        if (view != null) {
            View view2 = (View) view.getParent();
            if (view2 != viewGroup && view2 != null) {
                ((ViewGroup) view2).removeView(this.C0);
            }
            k0(jVarL);
            return this.C0;
        }
        this.C0 = layoutInflater.inflate(qk.i.tab_overview, (ViewGroup) null, true);
        Intent intent = l().getIntent();
        ?? r92 = this.f6226d1;
        if (intent != null && intent.hasExtra("NOTIFICATION_CONGRATULATIONS_MESSAGE")) {
            this.O0 = intent.getStringExtra("NOTIFICATION_CONGRATULATIONS_MESSAGE");
            if (intent.hasExtra("NOTIFICATION_CONGRATULATIONS_TITLE")) {
                this.N0 = intent.getStringExtra("NOTIFICATION_CONGRATULATIONS_TITLE");
            }
            if (intent.hasExtra("NOTIFICATION_EMAIL_TO")) {
                this.P0 = intent.getStringExtra("NOTIFICATION_EMAIL_TO");
            }
            if (intent.hasExtra("NOTIFICATION_EMAIL_SUBJECT")) {
                this.Q0 = intent.getStringExtra("NOTIFICATION_EMAIL_SUBJECT");
            }
            if (intent.hasExtra("NOTIFICATION_EMAIL_MESSAGE")) {
                this.R0 = intent.getStringExtra("NOTIFICATION_EMAIL_MESSAGE");
            }
            ((com.staircase3.opensignal.utils.a) this.f6223a1.getValue()).c("os_firebase_messaging_service", "notification", "received_positive_open_app");
            SharedPreferences.Editor editorEdit = ((el.c) r92.getValue()).f8227a.edit();
            editorEdit.putBoolean("preference_firebase_show_notification_dialog", true);
            editorEdit.apply();
            ((NotificationManager) n().getSystemService("notification")).cancel(5315);
        }
        LinearLayout linearLayout = (LinearLayout) this.C0.findViewById(qk.h.notificationDialog);
        this.M0 = linearLayout;
        ((TextView) linearLayout.findViewById(qk.h.speetest_dialog_title)).setText(this.N0);
        ((TextView) this.M0.findViewById(qk.h.speetest_dialog_message)).setText(this.O0);
        if (((el.c) r92.getValue()).f8227a.getBoolean("preference_firebase_show_notification_dialog", false) && this.M0 != null) {
            SharedPreferences.Editor editorEdit2 = ((el.c) r92.getValue()).f8227a.edit();
            editorEdit2.putBoolean("preference_firebase_show_notification_dialog", false);
            editorEdit2.apply();
            this.M0.setVisibility(0);
            Button button = (Button) this.M0.findViewById(qk.h.primary);
            Button button2 = (Button) this.M0.findViewById(qk.h.secondary);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_Overview.4
                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lq.h] */
                /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, lq.h] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Activity activity;
                    jn.b bVar = (jn.b) y3.s(jn.b.class);
                    Tab_Overview tab_Overview = Tab_Overview.this;
                    ((com.staircase3.opensignal.utils.a) tab_Overview.f6223a1.getValue()).c("os_firebase_messaging_service", "notification", "i_am_in_dialog_with_userflow_=_");
                    StringBuilder sb2 = new StringBuilder("\n");
                    sb2.append(tab_Overview.R0);
                    sb2.append("\n\nDebug information:\n\nReference number: ");
                    String string = ((el.c) tab_Overview.f6226d1.getValue()).f8227a.getString("preference_firebase_token", "");
                    sb2.append(string != null ? string : "");
                    sb2.append("\n\nDevice info: ");
                    sb2.append((String) bVar.f13781b.getValue());
                    sb2.append("\n\nModel: ");
                    sb2.append(Build.MODEL);
                    String string2 = sb2.toString();
                    i.j jVarL2 = tab_Overview.l();
                    jVarL2.getClass();
                    Intent action = new Intent().setAction("android.intent.action.SEND");
                    action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", jVarL2.getPackageName());
                    action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", jVarL2.getPackageName());
                    action.addFlags(524288);
                    Context baseContext = jVarL2;
                    while (true) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        } else {
                            if (baseContext instanceof Activity) {
                                activity = (Activity) baseContext;
                                break;
                            }
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    }
                    if (activity != null) {
                        ComponentName componentName = activity.getComponentName();
                        action.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
                        action.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
                    }
                    action.setType("message/rfc822");
                    String str = tab_Overview.P0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    action.putExtra("android.intent.extra.SUBJECT", tab_Overview.Q0);
                    action.putExtra("android.intent.extra.TEXT", (CharSequence) string2);
                    String[] stringArrayExtra = action.getStringArrayExtra("android.intent.extra.EMAIL");
                    int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
                    String[] strArr = new String[arrayList.size() + length];
                    arrayList.toArray(strArr);
                    if (stringArrayExtra != null) {
                        System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
                    }
                    action.putExtra("android.intent.extra.EMAIL", strArr);
                    action.setAction("android.intent.action.SEND");
                    action.removeExtra("android.intent.extra.STREAM");
                    action.setClipData(null);
                    action.setFlags(action.getFlags() & (-2));
                    jVarL2.startActivity(Intent.createChooser(action, "Send email..."));
                    tab_Overview.M0.setVisibility(8);
                }
            });
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_Overview.5
                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Tab_Overview tab_Overview = Tab_Overview.this;
                    ((com.staircase3.opensignal.utils.a) tab_Overview.f6223a1.getValue()).c("os_firebase_messaging_service", "notification", "dismiss_dialog_with_userflow_=_");
                    tab_Overview.M0.setVisibility(8);
                }
            });
        }
        TextView textView = (TextView) this.C0.findViewById(qk.h.introTextView);
        this.K0 = (NetworkInfoView) this.C0.findViewById(qk.h.networkInfoView);
        String strR = r(qk.l.compass_description);
        q qVar = u.f6195a;
        textView.setText(Html.fromHtml(strR, 0));
        NetworkStatusView networkStatusView = (NetworkStatusView) this.C0.findViewById(qk.h.networkStatusView);
        this.f6234l1 = networkStatusView;
        networkStatusView.setOnClickListener(new am.b(17, this));
        if (com.staircase3.opensignal.utils.q.c(X()).getBoolean("prefs_connectivity_assistant_enabled", false)) {
            this.f6234l1.setVisibility(0);
        } else {
            this.f6234l1.setVisibility(8);
        }
        this.f6236x0 = (TextView) this.C0.findViewById(qk.h.networkInfoTextView);
        this.f6237y0 = (TextView) this.C0.findViewById(qk.h.disclaimer);
        this.B0 = (CustRotatingCompassBg) this.C0.findViewById(qk.h.cvRotatingCompassBg);
        this.G0 = this.C0.findViewById(qk.h.vSignalArrow);
        this.F0 = (RelativeLayout) this.C0.findViewById(qk.h.rlNoLocationPermission);
        Button button3 = (Button) this.C0.findViewById(qk.h.btGrantPermission);
        this.H0 = button3;
        button3.setOnClickListener(new View.OnClickListener() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_Overview.2
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Tab_Overview tab_Overview = Tab_Overview.this;
                f fVar = (f) tab_Overview.W0.getValue();
                i.j jVarL2 = tab_Overview.l();
                fVar.getClass();
                f.d(jVarL2, 9);
            }
        });
        this.I0 = (TextView) this.C0.findViewById(qk.h.tvNoLocationPermissionTitle);
        this.J0 = (TextView) this.C0.findViewById(qk.h.tvNoLocationPermissionExplanation);
        k0(l());
        ((RelativeLayout) this.C0.findViewById(qk.h.rlBottomPanel)).setEnabled(false);
        View view3 = this.C0;
        ((Button) view3.findViewById(qk.h.bt_cell_maps)).setOnClickListener(this);
        LayerDrawable layerDrawable = (LayerDrawable) view3.findViewById(qk.h.vSignalArrow).getBackground();
        this.f6238z0 = (RotateDrawable) layerDrawable.getDrawable(1);
        this.A0 = (RotateDrawable) layerDrawable.getDrawable(0);
        if (!this.D0) {
            this.D0 = true;
        }
        this.C0.findViewById(qk.h.rlBottomPanel).setOnClickListener(new View.OnClickListener() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_Overview.3
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                Tab_Overview tab_Overview = Tab_Overview.this;
                com.staircase3.opensignal.utils.a aVar = (com.staircase3.opensignal.utils.a) tab_Overview.f6223a1.getValue();
                aVar.getClass();
                com.staircase3.opensignal.utils.a.e(aVar, "tab_dashboard", "click_compass", null, 12);
                if (tab_Overview.Y || !tab_Overview.w()) {
                    return;
                }
                i.f fVar = new i.f(tab_Overview.l(), m.CustomAlertDialogTheme);
                int i10 = qk.l.signal_compass;
                i.b bVar = fVar.f11045a;
                bVar.f10993d = bVar.f10990a.getText(i10);
                bVar.f10995f = bVar.f10990a.getText(qk.l.compass_info);
                fVar.setPositiveButton(qk.l.positive_button, new DialogInterface.OnClickListener() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_Overview.3.1
                    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, lq.h] */
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        dialogInterface.dismiss();
                        ((com.staircase3.opensignal.utils.a) Tab_Overview.this.f6223a1.getValue()).c("tab_dashboard", "click_dialog", "button_ok");
                    }
                });
                fVar.create().show();
            }
        });
        return this.C0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lq.h] */
    @Override // androidx.fragment.app.b
    public final void H() {
        k kVar = this.f6232j1;
        SensorManager sensorManager = (SensorManager) this.X0.getValue();
        kVar.getClass();
        try {
            sensorManager.unregisterListener(kVar.f20929a);
        } catch (Exception unused) {
        }
        try {
            sensorManager.unregisterListener(kVar.f20930b);
        } catch (Exception unused2) {
        }
        this.B0 = null;
        this.f6236x0 = null;
        this.f6238z0 = null;
        this.A0 = null;
        this.C0 = null;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.J0 = null;
        this.I0 = null;
        this.M0 = null;
        this.f6237y0 = null;
        this.K0 = null;
        this.f6234l1 = null;
        this.f1410c0 = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // androidx.fragment.app.b
    public final boolean M(MenuItem menuItem) {
        ((qm.e) this.V0.getValue()).a(l(), menuItem.getItemId());
        return false;
    }

    @Override // androidx.fragment.app.b
    public final void N() {
        this.D0 = false;
        ((CopyOnWriteArrayList) this.f6233k1.f20918d).remove(this);
        qm.c cVar = this.f6233k1;
        ((pc.a) cVar.f20919g).d((ji.a) cVar.f20920r);
        this.f1410c0 = true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, lq.h] */
    @Override // qm.l, androidx.fragment.app.b
    public final void O() {
        k0(l());
        super.O();
        try {
            if (!this.D0) {
                this.D0 = true;
            }
        } catch (Exception unused) {
        }
        qm.c cVarY = qm.c.y();
        this.f6233k1 = cVarY;
        Context contextX = X();
        if (((pc.a) cVarY.f20919g) == null) {
            int i10 = tc.a.f22695a;
            cVarY.f20919g = new pc.a(contextX, null, pc.a.j, ac.b.f322a, ac.e.f324b);
        }
        this.f6233k1.u(this);
        this.f6233k1.Q(X(), (f) this.W0.getValue());
        this.L0.set(false);
        l0(((bn.e) this.Y0.getValue()).f2839a);
    }

    @Override // androidx.fragment.app.b
    public final void P(Bundle bundle) {
        e0(true);
    }

    @Override // androidx.fragment.app.b
    public final void Q() {
        this.f1410c0 = true;
        ah.e.c(X(), this.f6230h1);
        this.f6231i1.d(t(), this.f6229g1);
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6232j1.f20933e;
        if (copyOnWriteArrayList.contains(this)) {
            return;
        }
        copyOnWriteArrayList.add(this);
    }

    @Override // androidx.fragment.app.b
    public final void R() {
        ah.e.d(X(), this.f6230h1);
        this.f6232j1.f20933e.remove(this);
        this.f6231i1.i(t());
        this.f1410c0 = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, lq.h] */
    public final void g0(fn.a aVar) {
        Object value;
        ((an.a) this.f6224b1.getValue()).c(((bn.e) this.Y0.getValue()).f2839a, 0L, true, true);
        if (this.T0 == null) {
            dn.d dVar = new dn.d();
            this.T0 = dVar;
            dVar.M0 = new dn.b() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_Overview.6
                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lq.h] */
                @Override // dn.b
                public final void a(bn.d dVar2) throws MissingResourceException {
                    int i10;
                    Tab_Overview tab_Overview = Tab_Overview.this;
                    ((an.a) tab_Overview.f6224b1.getValue()).a(dVar2.a());
                    if (dVar2 instanceof bn.b) {
                        bh.a aVar2 = ((bn.b) dVar2).f2834a;
                        bh.e eVar = aVar2.f2747d;
                        br.l.e(eVar, "assistantExplanation");
                        switch (tk.a.f22878a[eVar.ordinal()]) {
                            case 1:
                                i10 = qk.l.connectivity_assistant_mobile_data_reason_policy;
                                break;
                            case 2:
                                i10 = qk.l.connectivity_assistant_mobile_data_reason_carrier;
                                break;
                            case 3:
                                i10 = qk.l.connectivity_assistant_mobile_data_reason_thermal;
                                break;
                            case 4:
                                i10 = qk.l.connectivity_assistant_mobile_data_reason_airplane_mode_on;
                                break;
                            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                                i10 = qk.l.connectivity_assistant_mobile_data_reason_data_disabled;
                                break;
                            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                i10 = qk.l.connectivity_assistant_mobile_data_reason_roaming_data_disabled;
                                break;
                            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                                i10 = qk.l.connectivity_assistant_connected_to_mobile_network_but_has_internet_issues;
                                break;
                            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                                i10 = qk.l.connectivity_assistant_connected_to_wifi_requires_login;
                                break;
                            case 9:
                                i10 = qk.l.connectivity_assistant_connected_to_wifi_but_has_internet_issues;
                                break;
                            case 10:
                                i10 = qk.l.connectivity_assistant_problem_with_internet_connection;
                                break;
                            case 11:
                                i10 = qk.l.connectivity_assistant_poor_wifi_signal;
                                break;
                            case 12:
                                i10 = qk.l.connectivity_assistant_poor_4g_mobile_signal;
                                break;
                            case 13:
                                i10 = qk.l.connectivity_assistant_slow_mobile_connection_data_saver_on;
                                break;
                            case 14:
                                i10 = qk.l.connectivity_assistant_mobile_connection_slow;
                                break;
                            case 15:
                                i10 = qk.l.connectivity_assistant_internet_connection_slower_than_usual;
                                break;
                            case 16:
                                i10 = qk.l.connectivity_assistant_connected_to_2g_network;
                                break;
                            case 17:
                                i10 = qk.l.connectivity_assistant_poor_3g_mobile_signal;
                                break;
                            case 18:
                                i10 = qk.l.connectivity_assistant_poor_5g_mobile_signal;
                                break;
                            case 19:
                                i10 = qk.l.connectivity_assistant_mobile_network_congested;
                                break;
                            default:
                                throw new n();
                        }
                        String strR = tab_Overview.r(i10);
                        ArrayList arrayList = new ArrayList();
                        List list = aVar2.f2749f;
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            arrayList.add(io.sentry.config.a.P(tab_Overview.X(), (bh.m) list.get(i11), aVar2.f2745b));
                        }
                        if (arrayList.size() == 1) {
                            tab_Overview.h0();
                            String str = ((ResolutionCardInfo) arrayList.get(0)).f6135g;
                            if (str != null) {
                                tab_Overview.i0(str);
                            }
                        } else {
                            String strR2 = tab_Overview.r(qk.l.connectivity_assistant_status_possible_issues);
                            if (tab_Overview.U0 == null) {
                                br.l.e(strR2, "title");
                                br.l.e(strR, "content");
                                i iVar = new i();
                                Bundle bundle = new Bundle(0);
                                bundle.putString("title", strR2);
                                bundle.putString("content", strR);
                                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                                arrayList2.addAll(arrayList);
                                bundle.putParcelableArrayList("cards", arrayList2);
                                iVar.a0(bundle);
                                tab_Overview.U0 = iVar;
                                iVar.P0 = new g(tab_Overview);
                                iVar.O0 = new g(tab_Overview);
                                iVar.j0(tab_Overview.m(), "OSCA");
                            }
                        }
                    }
                    dn.d dVar3 = tab_Overview.T0;
                    if (dVar3 != null) {
                        dVar3.g0(false, false);
                        tab_Overview.T0 = null;
                    }
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lq.h] */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lq.h] */
                @Override // dn.b
                public final void b() {
                    Tab_Overview tab_Overview = Tab_Overview.this;
                    ((bn.e) tab_Overview.Y0.getValue()).f2841c = true;
                    an.a aVar2 = (an.a) tab_Overview.f6224b1.getValue();
                    aVar2.f882a.d("CATEGORY_OSCA", "osca_cancel_button_clicked", b0.Q(new lq.l("connection", aVar2.b())));
                    dn.d dVar2 = tab_Overview.T0;
                    if (dVar2 != null) {
                        dVar2.g0(false, false);
                        tab_Overview.T0 = null;
                    }
                }

                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lq.h] */
                /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, lq.h] */
                @Override // dn.b
                public final void c() {
                    Tab_Overview tab_Overview = Tab_Overview.this;
                    ?? r22 = tab_Overview.f6224b1;
                    an.a aVar2 = (an.a) r22.getValue();
                    aVar2.f882a.d("CATEGORY_OSCA", "osca_run_again_button_clicked", b0.Q(new lq.l("connection", aVar2.b())));
                    tab_Overview.g0(new fn.a(qk.l.connectivity_assistant_starting_title, qk.l.connectivity_assistant_starting_status, qk.l.connectivity_assistant_starting_description, null, bh.g.TESTING, null, qk.l.connectivity_assistant_button_cancel_label, null, fn.c.CANCEL, new bn.c("", 0L), 168));
                    ((wm.a) tab_Overview.f6228f1.getValue()).a(tab_Overview.f6235m1);
                    ((an.a) r22.getValue()).d();
                }

                @Override // dn.b
                public final void d() {
                    Tab_Overview tab_Overview = Tab_Overview.this;
                    dn.d dVar2 = tab_Overview.T0;
                    if (dVar2 != null) {
                        dVar2.g0(false, false);
                        tab_Overview.T0 = null;
                    }
                }
            };
            dVar.j0(m(), "OSCA");
        }
        o0 o0Var = this.T0.N0;
        do {
            value = o0Var.getValue();
            t tVar = au.c.f2321b;
            if (value == null) {
                value = tVar;
            }
        } while (!o0Var.h(value, aVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lq.h] */
    public final void h0() throws MissingResourceException {
        bn.d dVar = ((bn.e) this.Y0.getValue()).f2839a;
        ?? r12 = this.f6227e1;
        kn.d dVar2 = (kn.d) r12.getValue();
        dVar2.getClass();
        dVar2.e(dVar2.f14457f, null, "post_assistant_result", -1L);
        ((kn.d) r12.getValue()).d(dVar.a());
    }

    public final void i0(String str) {
        if (str == null || str.isEmpty() || str.equals("compass_uri")) {
            return;
        }
        Intent intent = new Intent(str);
        intent.setFlags(268435456);
        try {
            X().startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final void j0(float f10) {
        RotateDrawable rotateDrawable = this.f6238z0;
        if (rotateDrawable != null) {
            rotateDrawable.setLevel((int) ((f10 * 10000.0f) / 360.0f));
        }
        RotateDrawable rotateDrawable2 = this.A0;
        if (rotateDrawable2 != null) {
            rotateDrawable2.setLevel((int) ((10000.0f * f10) / 360.0f));
        }
        CustRotatingCompassBg custRotatingCompassBg = this.B0;
        if (custRotatingCompassBg != null) {
            custRotatingCompassBg.f6153r = f10 - 90.0f;
            custRotatingCompassBg.invalidate();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    public final void k0(i.j jVar) {
        f fVar = (f) this.W0.getValue();
        Context contextN = n();
        fVar.getClass();
        if (!f.a(contextN)) {
            this.F0.setVisibility(0);
            this.H0.setVisibility(0);
            this.G0.setVisibility(8);
            this.B0.setAntennaVisibility(false);
            this.I0.setText(qk.l.no_location_permission);
            this.J0.setText("");
            return;
        }
        if (u.e(jVar)) {
            this.F0.setVisibility(8);
            this.H0.setVisibility(8);
            this.G0.setVisibility(0);
            this.B0.setAntennaVisibility(true);
            j0(0.0f);
            return;
        }
        this.F0.setVisibility(0);
        this.H0.setVisibility(8);
        this.G0.setVisibility(8);
        this.B0.setAntennaVisibility(false);
        this.I0.setText(qk.l.location_disabled);
        this.J0.setText(qk.l.please_enable_location);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, lq.h] */
    public final void l0(bn.d dVar) {
        NetworkStatusView.a aVar = dVar instanceof bn.a ? null : dVar instanceof bn.b ? ((bn.b) dVar).f2834a.f2746c == bh.c.NO_INTERNET_CONNECTION ? NetworkStatusView.a.NOT_CONNECTED : NetworkStatusView.a.POSSIBLE_ISSUES : NetworkStatusView.a.CONNECTED;
        if (aVar != null) {
            this.f6234l1.setVisibility(0);
            this.f6234l1.setCurrentConnectionType(aVar);
        } else {
            this.f6234l1.setVisibility(8);
        }
        ?? r02 = this.Y0;
        bn.e eVar = (bn.e) r02.getValue();
        eVar.getClass();
        br.l.e(dVar, "<set-?>");
        eVar.f2839a = dVar;
        ((bn.e) r02.getValue()).f2840b = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, lq.h] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AtomicBoolean atomicBoolean = this.L0;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        Intent intent = new Intent(l(), (Class<?>) TowersActivity.class);
        if (view.getId() == qk.h.bt_cell_maps) {
            intent.putExtra("map_type", TowersActivity.b.CELL);
            i.j jVarL = l();
            ((com.staircase3.opensignal.utils.a) this.f6223a1.getValue()).c("tab_overview", "button_press", "go_to_map_cells");
            AtomicBoolean atomicBoolean2 = zb.f.f26819a;
            if (zb.f.b(jVarL, 12451000) == 0) {
                f0(intent);
                return;
            }
            try {
                int iB = zb.f.b(jVarL, 12451000);
                i.j jVarL2 = l();
                if (true == (iB == 18 ? true : iB == 1 ? zb.f.c(jVarL2) : false)) {
                    iB = 18;
                }
                zb.c.f26814e.c(jVarL2, iB, 0, null).show();
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.fragment.app.b, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1410c0 = true;
    }

    @Override // qm.b
    public final void onLocationChanged(Location location) {
        if (location != null) {
            f6222n1.D = location;
        }
    }
}
