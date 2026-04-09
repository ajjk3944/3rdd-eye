package com.phuongpn.whousemywifi.networkscanner;

import android.content.Intent;
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
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import defpackage.a30;
import defpackage.c10;
import defpackage.e3;
import defpackage.eb1;
import defpackage.f23;
import defpackage.g2;
import defpackage.h80;
import defpackage.i30;
import defpackage.i41;
import defpackage.i5;
import defpackage.j60;
import defpackage.jj;
import defpackage.jq3;
import defpackage.k41;
import defpackage.l60;
import defpackage.o00;
import defpackage.o9;
import defpackage.p21;
import defpackage.q10;
import defpackage.sy0;
import defpackage.tk0;
import defpackage.vy2;
import defpackage.wk0;
import defpackage.xk0;
import defpackage.yf;
import defpackage.zk0;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class PingActivity extends i5 {
    public static final /* synthetic */ int L = 0;
    public float C;
    public g2 D;
    public e3 E;
    public boolean F;
    public vy2 G;
    public c10 H;
    public ArrayList I;
    public final DecimalFormat J = new DecimalFormat("#,##0");
    public o9 K;

    public final void doShare(View view) {
        i30.m(view, "v");
        ArrayList arrayList = this.I;
        if (arrayList == null) {
            i30.S("dataList");
            throw null;
        }
        if (arrayList.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = this.I;
        if (arrayList2 == null) {
            i30.S("dataList");
            throw null;
        }
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            zk0 zk0Var = (zk0) obj;
            sb.append("- " + zk0Var.b + "\n");
            sb.append(zk0Var.c + "\n");
        }
        ArrayList arrayList3 = this.I;
        if (arrayList3 == null) {
            i30.S("dataList");
            throw null;
        }
        String str = ((zk0) yf.n0(arrayList3)).b;
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
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_ping, (ViewGroup) null, false);
        int i = R.id.adPreLoad;
        FrameLayout frameLayout = (FrameLayout) a30.e(viewInflate, R.id.adPreLoad);
        if (frameLayout != null) {
            i = R.id.adViewContainer;
            FrameLayout frameLayout2 = (FrameLayout) a30.e(viewInflate, R.id.adViewContainer);
            if (frameLayout2 != null) {
                i = R.id.btn_share;
                Button button = (Button) a30.e(viewInflate, R.id.btn_share);
                if (button != null) {
                    i = R.id.gr_start_layout;
                    Group group = (Group) a30.e(viewInflate, R.id.gr_start_layout);
                    if (group != null) {
                        i = R.id.iv_s_background;
                        if (((ImageView) a30.e(viewInflate, R.id.iv_s_background)) != null) {
                            i = R.id.iv_s_icon;
                            if (((ImageView) a30.e(viewInflate, R.id.iv_s_icon)) != null) {
                                i = R.id.lb_average;
                                if (((TextView) a30.e(viewInflate, R.id.lb_average)) != null) {
                                    i = R.id.lb_maximum;
                                    if (((TextView) a30.e(viewInflate, R.id.lb_maximum)) != null) {
                                        i = R.id.lb_minimum;
                                        if (((TextView) a30.e(viewInflate, R.id.lb_minimum)) != null) {
                                            i = R.id.lb_packet_loss;
                                            if (((TextView) a30.e(viewInflate, R.id.lb_packet_loss)) != null) {
                                                i = R.id.lb_target_host;
                                                if (((TextView) a30.e(viewInflate, R.id.lb_target_host)) != null) {
                                                    i = R.id.ping_chart;
                                                    LineChart lineChart = (LineChart) a30.e(viewInflate, R.id.ping_chart);
                                                    if (lineChart != null) {
                                                        i = R.id.progress_bar;
                                                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) a30.e(viewInflate, R.id.progress_bar);
                                                        if (linearProgressIndicator != null) {
                                                            i = R.id.rv_ping;
                                                            RecyclerView recyclerView = (RecyclerView) a30.e(viewInflate, R.id.rv_ping);
                                                            if (recyclerView != null) {
                                                                i = R.id.toolbar_layout;
                                                                View viewE = a30.e(viewInflate, R.id.toolbar_layout);
                                                                if (viewE != null) {
                                                                    p21 p21VarH = p21.h(viewE);
                                                                    i = R.id.tv_average;
                                                                    TextView textView = (TextView) a30.e(viewInflate, R.id.tv_average);
                                                                    if (textView != null) {
                                                                        i = R.id.tv_maximum;
                                                                        TextView textView2 = (TextView) a30.e(viewInflate, R.id.tv_maximum);
                                                                        if (textView2 != null) {
                                                                            i = R.id.tv_minimum;
                                                                            TextView textView3 = (TextView) a30.e(viewInflate, R.id.tv_minimum);
                                                                            if (textView3 != null) {
                                                                                i = R.id.tv_packet_loss;
                                                                                TextView textView4 = (TextView) a30.e(viewInflate, R.id.tv_packet_loss);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.tv_ping_header;
                                                                                    if (((TextView) a30.e(viewInflate, R.id.tv_ping_header)) != null) {
                                                                                        i = R.id.tv_target_host;
                                                                                        TextView textView5 = (TextView) a30.e(viewInflate, R.id.tv_target_host);
                                                                                        if (textView5 != null) {
                                                                                            i = R.id.view1;
                                                                                            View viewE2 = a30.e(viewInflate, R.id.view1);
                                                                                            if (viewE2 != null) {
                                                                                                i = R.id.view2;
                                                                                                View viewE3 = a30.e(viewInflate, R.id.view2);
                                                                                                if (viewE3 != null) {
                                                                                                    i = R.id.view3;
                                                                                                    View viewE4 = a30.e(viewInflate, R.id.view3);
                                                                                                    if (viewE4 != null) {
                                                                                                        i = R.id.view4;
                                                                                                        View viewE5 = a30.e(viewInflate, R.id.view4);
                                                                                                        if (viewE5 != null) {
                                                                                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                                                                                                            this.D = new g2(coordinatorLayout, frameLayout, frameLayout2, button, group, lineChart, linearProgressIndicator, recyclerView, p21VarH, textView, textView2, textView3, textView4, textView5, viewE2, viewE3, viewE4, viewE5);
                                                                                                            i30.l(coordinatorLayout, "getRoot(...)");
                                                                                                            setContentView(coordinatorLayout);
                                                                                                            e3 e3Var = new e3(this);
                                                                                                            this.E = e3Var;
                                                                                                            g2 g2Var = this.D;
                                                                                                            if (g2Var == null) {
                                                                                                                i30.S("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            g2Var.b.addView(e3Var);
                                                                                                            g2 g2Var2 = this.D;
                                                                                                            if (g2Var2 == null) {
                                                                                                                i30.S("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            int i2 = 1;
                                                                                                            g2Var2.b.getViewTreeObserver().addOnGlobalLayoutListener(new o00(this, i2));
                                                                                                            new Handler(Looper.getMainLooper()).postDelayed(new xk0(this, i2), 5000L);
                                                                                                            String stringExtra = getIntent().getStringExtra("ping_ip_arg");
                                                                                                            g2 g2Var3 = this.D;
                                                                                                            if (g2Var3 == null) {
                                                                                                                i30.S("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            p21 p21Var = g2Var3.h;
                                                                                                            MaterialButton materialButton = (MaterialButton) p21Var.g;
                                                                                                            MaterialButton materialButton2 = (MaterialButton) p21Var.h;
                                                                                                            TextInputEditText textInputEditText = (TextInputEditText) p21Var.i;
                                                                                                            materialButton.setVisibility(8);
                                                                                                            if (stringExtra == null || stringExtra.length() == 0) {
                                                                                                                Object systemService = getApplicationContext().getSystemService("wifi");
                                                                                                                i30.k(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                                                                                                                String ipAddress = Formatter.formatIpAddress(((WifiManager) systemService).getDhcpInfo().gateway);
                                                                                                                i30.l(ipAddress, "formatIpAddress(...)");
                                                                                                                textInputEditText.setText(ipAddress);
                                                                                                            } else {
                                                                                                                textInputEditText.setText(stringExtra);
                                                                                                                try {
                                                                                                                    materialButton2.performClick();
                                                                                                                } catch (Exception unused) {
                                                                                                                }
                                                                                                            }
                                                                                                            ((MaterialButton) p21Var.f).setOnClickListener(new tk0(this, 0));
                                                                                                            materialButton2.setOnClickListener(new tk0(this, 1));
                                                                                                            ArrayList arrayList = new ArrayList();
                                                                                                            this.I = arrayList;
                                                                                                            this.H = new c10(arrayList, new wk0(0), 1);
                                                                                                            g2 g2Var4 = this.D;
                                                                                                            if (g2Var4 == null) {
                                                                                                                i30.S("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            RecyclerView recyclerView2 = g2Var4.g;
                                                                                                            recyclerView2.setHasFixedSize(true);
                                                                                                            c10 c10Var = this.H;
                                                                                                            if (c10Var == null) {
                                                                                                                i30.S("pingAdapter");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            recyclerView2.setAdapter(c10Var);
                                                                                                            x();
                                                                                                            g2 g2Var5 = this.D;
                                                                                                            if (g2Var5 == null) {
                                                                                                                i30.S("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            o9 o9Var = new o9();
                                                                                                            o9Var.d = g2Var5;
                                                                                                            int iH = i41.h(this, R.attr.colorOnSurfaceVariant, -16777216);
                                                                                                            int color = getColor(R.color.colorDownload);
                                                                                                            o9Var.a = color;
                                                                                                            o9Var.b = getColor(R.color.colorDownloadBg);
                                                                                                            o9Var.c = getColor(R.color.colorDownload);
                                                                                                            LineChart lineChart2 = g2Var5.e;
                                                                                                            lineChart2.setTouchEnabled(false);
                                                                                                            lineChart2.getXAxis().a = false;
                                                                                                            lineChart2.getAxisLeft().a = true;
                                                                                                            lineChart2.getAxisLeft().B = 0.0f;
                                                                                                            lineChart2.getAxisLeft().A = 0.0f;
                                                                                                            lineChart2.getAxisLeft().d();
                                                                                                            eb1 axisLeft = lineChart2.getAxisLeft();
                                                                                                            i30.l(axisLeft, "getAxisLeft(...)");
                                                                                                            axisLeft.n = 6;
                                                                                                            axisLeft.o = true;
                                                                                                            axisLeft.e = iH;
                                                                                                            axisLeft.C = 1;
                                                                                                            axisLeft.p = true;
                                                                                                            axisLeft.i = color;
                                                                                                            lineChart2.getAxisRight().a = false;
                                                                                                            lineChart2.setLogEnabled(false);
                                                                                                            lineChart2.setDescription(null);
                                                                                                            lineChart2.setDragEnabled(false);
                                                                                                            lineChart2.setScaleEnabled(false);
                                                                                                            lineChart2.setDrawBorders(false);
                                                                                                            lineChart2.setPinchZoom(false);
                                                                                                            lineChart2.setMaxHighlightDistance(300.0f);
                                                                                                            lineChart2.setDrawGridBackground(false);
                                                                                                            lineChart2.setAutoScaleMinMaxEnabled(true);
                                                                                                            lineChart2.getAxisRight().d();
                                                                                                            lineChart2.setMaxVisibleValueCount(12);
                                                                                                            j60 j60Var = new j60();
                                                                                                            j60Var.a(o9Var.b());
                                                                                                            ArrayList arrayList2 = j60Var.i;
                                                                                                            int size = arrayList2.size();
                                                                                                            int i3 = 0;
                                                                                                            while (i3 < size) {
                                                                                                                Object obj = arrayList2.get(i3);
                                                                                                                i3++;
                                                                                                                l60 l60Var = (l60) ((q10) obj);
                                                                                                                l60Var.getClass();
                                                                                                                l60Var.m = k41.c(7.0f);
                                                                                                            }
                                                                                                            ArrayList arrayList3 = j60Var.i;
                                                                                                            int size2 = arrayList3.size();
                                                                                                            int i4 = 0;
                                                                                                            while (i4 < size2) {
                                                                                                                Object obj2 = arrayList3.get(i4);
                                                                                                                i4++;
                                                                                                                ArrayList arrayList4 = ((l60) ((q10) obj2)).b;
                                                                                                                arrayList4.clear();
                                                                                                                arrayList4.add(Integer.valueOf(iH));
                                                                                                            }
                                                                                                            lineChart2.setData(j60Var);
                                                                                                            lineChart2.getLegend().a = false;
                                                                                                            g2 g2Var6 = (g2) o9Var.d;
                                                                                                            ((j60) g2Var6.e.getData()).i.clear();
                                                                                                            g2Var6.e.invalidate();
                                                                                                            this.K = o9Var;
                                                                                                            return;
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

    @Override // defpackage.i5, android.app.Activity
    public final void onDestroy() {
        e3 e3Var = this.E;
        if (e3Var == null) {
            i30.S("adView");
            throw null;
        }
        e3Var.a();
        super.onDestroy();
    }

    @Override // defpackage.i5, android.app.Activity
    public final void onPause() {
        vy2 vy2Var;
        e3 e3Var = this.E;
        if (e3Var == null) {
            i30.S("adView");
            throw null;
        }
        e3Var.c();
        try {
            vy2Var = this.G;
        } catch (Exception unused) {
        }
        if (vy2Var == null) {
            i30.S("ping");
            throw null;
        }
        vy2Var.b = true;
        super.onPause();
    }

    @Override // defpackage.i5, android.app.Activity
    public final void onResume() {
        super.onResume();
        e3 e3Var = this.E;
        if (e3Var != null) {
            e3Var.d();
        } else {
            i30.S("adView");
            throw null;
        }
    }

    public final void x() {
        g2 g2Var = this.D;
        if (g2Var == null) {
            i30.S("binding");
            throw null;
        }
        g2Var.m.setText("");
        g2Var.i.setText("- ms");
        g2Var.j.setText("- ms");
        g2Var.k.setText("- ms");
        g2Var.l.setText("- %");
    }

    public final void y() {
        g2 g2Var = this.D;
        if (g2Var == null) {
            i30.S("binding");
            throw null;
        }
        String string = sy0.J(String.valueOf(((TextInputEditText) g2Var.h.i).getText())).toString();
        if (!Patterns.IP_ADDRESS.matcher(string).matches() && !Patterns.WEB_URL.matcher(string).matches()) {
            runOnUiThread(new xk0(this, 2));
            return;
        }
        runOnUiThread(new xk0(this, 0));
        ArrayList arrayList = this.I;
        if (arrayList == null) {
            i30.S("dataList");
            throw null;
        }
        if (!arrayList.isEmpty()) {
            c10 c10Var = this.H;
            if (c10Var == null) {
                i30.S("pingAdapter");
                throw null;
            }
            ArrayList arrayList2 = this.I;
            if (arrayList2 == null) {
                i30.S("dataList");
                throw null;
            }
            c10Var.f.e(0, arrayList2.size());
            ArrayList arrayList3 = this.I;
            if (arrayList3 == null) {
                i30.S("dataList");
                throw null;
            }
            arrayList3.clear();
        }
        this.C = 0.0f;
        vy2 vy2Var = new vy2();
        vy2Var.c = string;
        ((h80) vy2Var.e).g = Math.max(1000, 1000);
        vy2Var.a = 12;
        new Thread(new jq3(vy2Var, new f23(6, this), 12, false)).start();
        this.G = vy2Var;
    }

    public final void z(boolean z) {
        g2 g2Var = this.D;
        if (g2Var == null) {
            i30.S("binding");
            throw null;
        }
        Button button = g2Var.c;
        Group group = g2Var.d;
        p21 p21Var = g2Var.h;
        TextInputEditText textInputEditText = (TextInputEditText) p21Var.i;
        MaterialButton materialButton = (MaterialButton) p21Var.h;
        LinearProgressIndicator linearProgressIndicator = g2Var.f;
        if (!z) {
            materialButton.setIcon(jj.b(this, R.drawable.ic_do_action));
            materialButton.setOnClickListener(new tk0(this, 3));
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
        materialButton.setOnClickListener(new tk0(this, 2));
        textInputEditText.onEditorAction(6);
        textInputEditText.setEnabled(false);
        button.setVisibility(4);
    }
}
