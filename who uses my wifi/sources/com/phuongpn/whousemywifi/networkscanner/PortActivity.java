package com.phuongpn.whousemywifi.networkscanner;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.format.Formatter;
import android.util.Patterns;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import defpackage.a30;
import defpackage.c10;
import defpackage.e3;
import defpackage.fo;
import defpackage.h2;
import defpackage.i30;
import defpackage.i5;
import defpackage.iu0;
import defpackage.jj;
import defpackage.jq3;
import defpackage.kl0;
import defpackage.ll0;
import defpackage.m;
import defpackage.nl0;
import defpackage.o00;
import defpackage.ol0;
import defpackage.p21;
import defpackage.ql0;
import defpackage.sy0;
import defpackage.ue;
import defpackage.wk0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class PortActivity extends i5 {
    public static final /* synthetic */ int K = 0;
    public ql0 D;
    public h2 E;
    public c10 F;
    public ArrayList G;
    public e3 I;
    public boolean J;
    public final ArrayList C = new ArrayList();
    public String H = "";

    public final void doShare(View view) {
        i30.m(view, "v");
        ArrayList arrayList = this.G;
        if (arrayList == null) {
            i30.S("dataList");
            throw null;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = this.G;
        if (arrayList2 == null) {
            i30.S("dataList");
            throw null;
        }
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            ol0 ol0Var = (ol0) obj;
            if (this.G == null) {
                i30.S("dataList");
                throw null;
            }
            if (i == r9.size() - 1) {
                sb.append(">> " + ol0Var.b + "\n" + ol0Var.c + "\n");
            } else {
                sb.append(i3 + ". " + ol0Var.b + " [" + ol0Var.d + "]\n" + ol0Var.c + "\n");
            }
            i = i3;
        }
        String str = getString(R.string.action_port_scan) + ": " + this.H;
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.SUBJECT", str);
            intent.putExtra("android.intent.extra.TEXT", sb.toString());
            intent.setType("text/plain");
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), e.getLocalizedMessage(), 0).show();
        }
    }

    @Override // defpackage.i5, defpackage.ch, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException, NumberFormatException {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_port, (ViewGroup) null, false);
        int i = R.id.adPreLoad;
        FrameLayout frameLayout = (FrameLayout) a30.e(viewInflate, R.id.adPreLoad);
        if (frameLayout != null) {
            i = R.id.adViewContainer;
            FrameLayout frameLayout2 = (FrameLayout) a30.e(viewInflate, R.id.adViewContainer);
            if (frameLayout2 != null) {
                i = R.id.btn_share;
                Button button = (Button) a30.e(viewInflate, R.id.btn_share);
                if (button != null) {
                    i = R.id.btn_start;
                    Button button2 = (Button) a30.e(viewInflate, R.id.btn_start);
                    if (button2 != null) {
                        i = R.id.gr_start_layout;
                        Group group = (Group) a30.e(viewInflate, R.id.gr_start_layout);
                        if (group != null) {
                            i = R.id.iv_s_background;
                            if (((ImageView) a30.e(viewInflate, R.id.iv_s_background)) != null) {
                                i = R.id.iv_s_icon;
                                if (((ImageView) a30.e(viewInflate, R.id.iv_s_icon)) != null) {
                                    i = R.id.progress_bar;
                                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) a30.e(viewInflate, R.id.progress_bar);
                                    if (linearProgressIndicator != null) {
                                        i = R.id.rv_port;
                                        RecyclerView recyclerView = (RecyclerView) a30.e(viewInflate, R.id.rv_port);
                                        if (recyclerView != null) {
                                            i = R.id.toolbar_layout;
                                            View viewE = a30.e(viewInflate, R.id.toolbar_layout);
                                            if (viewE != null) {
                                                p21 p21VarH = p21.h(viewE);
                                                if (((TextView) a30.e(viewInflate, R.id.tv_port_header)) != null) {
                                                    h2 h2Var = new h2();
                                                    h2Var.a = (CoordinatorLayout) viewInflate;
                                                    h2Var.b = frameLayout;
                                                    h2Var.c = frameLayout2;
                                                    h2Var.d = button;
                                                    h2Var.e = button2;
                                                    h2Var.f = group;
                                                    h2Var.g = linearProgressIndicator;
                                                    h2Var.h = recyclerView;
                                                    h2Var.i = p21VarH;
                                                    this.E = h2Var;
                                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) y().a;
                                                    i30.l(coordinatorLayout, "getRoot(...)");
                                                    setContentView(coordinatorLayout);
                                                    this.I = new e3(this);
                                                    FrameLayout frameLayout3 = (FrameLayout) y().c;
                                                    e3 e3Var = this.I;
                                                    if (e3Var == null) {
                                                        i30.S("adView");
                                                        throw null;
                                                    }
                                                    frameLayout3.addView(e3Var);
                                                    ((FrameLayout) y().c).getViewTreeObserver().addOnGlobalLayoutListener(new o00(this, 2));
                                                    new Handler(Looper.getMainLooper()).postDelayed(new ll0(this, 3), 5000L);
                                                    TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(R.array.portsDataBase);
                                                    i30.l(typedArrayObtainTypedArray, "obtainTypedArray(...)");
                                                    ArrayList arrayList = this.C;
                                                    if (arrayList.size() > 0) {
                                                        arrayList.clear();
                                                    }
                                                    int length = typedArrayObtainTypedArray.length();
                                                    for (int i2 = 0; i2 < length; i2++) {
                                                        String string = typedArrayObtainTypedArray.getString(i2);
                                                        List listF = string != null ? iu0.F(new fo(2, new m(3, string), sy0.E(string, new String[]{"*"}))) : null;
                                                        if (listF != null) {
                                                            int i3 = Integer.parseInt((String) listF.get(0));
                                                            String str = (String) listF.get(1);
                                                            String str2 = (String) listF.get(2);
                                                            i30.m(str, "protocal");
                                                            i30.m(str2, "fullName");
                                                            nl0 nl0Var = new nl0();
                                                            nl0Var.a = i3;
                                                            nl0Var.b = str;
                                                            nl0Var.c = str2;
                                                            arrayList.add(nl0Var);
                                                        }
                                                    }
                                                    typedArrayObtainTypedArray.recycle();
                                                    String stringExtra = getIntent().getStringExtra("scan_ip_arg");
                                                    p21 p21Var = (p21) y().i;
                                                    MaterialButton materialButton = (MaterialButton) p21Var.g;
                                                    TextInputEditText textInputEditText = (TextInputEditText) p21Var.i;
                                                    MaterialButton materialButton2 = (MaterialButton) p21Var.h;
                                                    materialButton.setVisibility(8);
                                                    try {
                                                        if (stringExtra == null || stringExtra.length() == 0) {
                                                            Object systemService = getApplicationContext().getSystemService("wifi");
                                                            i30.k(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                                                            String ipAddress = Formatter.formatIpAddress(((WifiManager) systemService).getDhcpInfo().gateway);
                                                            i30.l(ipAddress, "formatIpAddress(...)");
                                                            textInputEditText.setText(ipAddress);
                                                            materialButton2.performClick();
                                                        } else {
                                                            textInputEditText.setText(stringExtra);
                                                            materialButton2.performClick();
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    ((MaterialButton) p21Var.f).setOnClickListener(new kl0(this, 0));
                                                    materialButton2.setOnClickListener(new kl0(this, 1));
                                                    ((Button) y().e).setOnClickListener(new kl0(this, 2));
                                                    ArrayList arrayList2 = new ArrayList();
                                                    this.G = arrayList2;
                                                    this.F = new c10(arrayList2, new wk0(1), 2);
                                                    RecyclerView recyclerView2 = (RecyclerView) y().h;
                                                    recyclerView2.setHasFixedSize(true);
                                                    c10 c10Var = this.F;
                                                    if (c10Var != null) {
                                                        recyclerView2.setAdapter(c10Var);
                                                        return;
                                                    } else {
                                                        i30.S("portAdapter");
                                                        throw null;
                                                    }
                                                }
                                                i = R.id.tv_port_header;
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

    @Override // defpackage.i5, android.app.Activity
    public final void onDestroy() {
        e3 e3Var = this.I;
        if (e3Var == null) {
            i30.S("adView");
            throw null;
        }
        e3Var.a();
        super.onDestroy();
    }

    @Override // defpackage.i5, android.app.Activity
    public final void onPause() {
        ql0 ql0Var;
        e3 e3Var = this.I;
        if (e3Var == null) {
            i30.S("adView");
            throw null;
        }
        e3Var.c();
        try {
            ql0Var = this.D;
        } catch (Exception unused) {
        }
        if (ql0Var == null) {
            i30.S("portScan");
            throw null;
        }
        ql0Var.d = true;
        super.onPause();
    }

    @Override // defpackage.i5, android.app.Activity
    public final void onResume() {
        super.onResume();
        e3 e3Var = this.I;
        if (e3Var != null) {
            e3Var.d();
        } else {
            i30.S("adView");
            throw null;
        }
    }

    public final void x() {
        TextInputEditText textInputEditText = (TextInputEditText) ((p21) y().i).i;
        String string = sy0.J(String.valueOf(textInputEditText.getText())).toString();
        if (!Patterns.IP_ADDRESS.matcher(string).matches()) {
            this.H = "";
            runOnUiThread(new ll0(this, 2));
            return;
        }
        textInputEditText.onEditorAction(6);
        runOnUiThread(new ll0(this, 1));
        ArrayList arrayList = this.G;
        if (arrayList == null) {
            i30.S("dataList");
            throw null;
        }
        if (arrayList.size() > 0) {
            c10 c10Var = this.F;
            if (c10Var == null) {
                i30.S("portAdapter");
                throw null;
            }
            ArrayList arrayList2 = this.G;
            if (arrayList2 == null) {
                i30.S("dataList");
                throw null;
            }
            c10Var.f.e(0, arrayList2.size());
            ArrayList arrayList3 = this.G;
            if (arrayList3 == null) {
                i30.S("dataList");
                throw null;
            }
            arrayList3.clear();
        }
        this.H = string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ql0 ql0VarA = ql0.a(string);
        ql0VarA.e.clear();
        ArrayList arrayList4 = new ArrayList();
        for (String str : "19-8884".split(",")) {
            if (str.contains("-")) {
                int i = Integer.parseInt(str.split("-")[0]);
                int i2 = Integer.parseInt(str.split("-")[1]);
                ql0.b(i);
                ql0.b(i2);
                if (i2 <= i) {
                    throw new IllegalArgumentException("Start port cannot be greater than or equal to the end port");
                }
                while (i <= i2) {
                    arrayList4.add(Integer.valueOf(i));
                    i++;
                }
            } else {
                int i3 = Integer.parseInt(str);
                ql0.b(i3);
                arrayList4.add(Integer.valueOf(i3));
            }
        }
        ql0VarA.e = arrayList4;
        ql0VarA.c = 60;
        ue ueVar = new ue(this, jCurrentTimeMillis, 1);
        ql0VarA.g = ueVar;
        ql0VarA.f.clear();
        ql0VarA.d = false;
        new Thread(new jq3(ql0VarA, ueVar, 13, false)).start();
        this.D = ql0VarA;
    }

    public final h2 y() {
        h2 h2Var = this.E;
        if (h2Var != null) {
            return h2Var;
        }
        i30.S("binding");
        throw null;
    }

    public final void z(boolean z) {
        h2 h2VarY = y();
        Button button = (Button) h2VarY.d;
        Group group = (Group) h2VarY.f;
        p21 p21Var = (p21) h2VarY.i;
        TextInputEditText textInputEditText = (TextInputEditText) p21Var.i;
        MaterialButton materialButton = (MaterialButton) p21Var.h;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) h2VarY.g;
        if (!z) {
            materialButton.setIcon(jj.b(this, R.drawable.ic_do_action));
            materialButton.setOnClickListener(new kl0(this, 4));
            linearProgressIndicator.setVisibility(4);
            textInputEditText.setEnabled(true);
            button.setVisibility(0);
            return;
        }
        if (group.getVisibility() == 0) {
            group.setVisibility(8);
        }
        if (linearProgressIndicator.getVisibility() == 4) {
            linearProgressIndicator.setVisibility(0);
        }
        materialButton.setIcon(jj.b(this, R.drawable.ic_outline_stop_circle_24));
        materialButton.setOnClickListener(new kl0(this, 3));
        textInputEditText.onEditorAction(6);
        textInputEditText.setEnabled(false);
        button.setVisibility(4);
    }
}
