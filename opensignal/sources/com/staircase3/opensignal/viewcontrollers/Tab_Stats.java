package com.staircase3.opensignal.viewcontrollers;

import ah.f;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.y3;
import com.staircase3.opensignal.ui.views.CustStackedBarConnectionStats;
import com.staircase3.opensignal.utils.g;
import com.staircase3.opensignal.utils.h;
import com.staircase3.opensignal.utils.i;
import com.staircase3.opensignal.utils.o;
import com.staircase3.opensignal.utils.u;
import h7.r1;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import lq.q;
import qk.j;
import qk.m;
import qm.l;

/* loaded from: classes.dex */
public class Tab_Stats extends l {
    public int A0;
    public LayoutInflater B0;
    public Spinner C0;
    public Factoid E0;
    public r1 F0;
    public boolean G0;
    public PartialDialog H0;
    public ArrayAdapter I0;
    public bm.e J0;
    public long O0;

    /* renamed from: x0, reason: collision with root package name */
    public Context f6270x0;

    /* renamed from: y0, reason: collision with root package name */
    public View f6271y0;

    /* renamed from: z0, reason: collision with root package name */
    public RelativeLayout f6272z0;
    public int D0 = -1;
    public final Object K0 = y3.A(jn.c.class);
    public final Object L0 = y3.A(qm.e.class);
    public final Object M0 = y3.A(com.staircase3.opensignal.utils.a.class);
    public final Object N0 = y3.A(el.b.class);

    public class DataUsageFactoid extends Factoid {

        /* renamed from: d, reason: collision with root package name */
        public ProgressBar f6275d;

        /* renamed from: e, reason: collision with root package name */
        public ProgressBar f6276e;

        /* renamed from: f, reason: collision with root package name */
        public TextView f6277f;

        /* renamed from: g, reason: collision with root package name */
        public TextView f6278g;

        /* renamed from: h, reason: collision with root package name */
        public TextView f6279h;

        /* renamed from: i, reason: collision with root package name */
        public TextView f6280i;
        public TextView j;
        public TextView k;

        /* renamed from: l, reason: collision with root package name */
        public TextView f6281l;

        /* renamed from: m, reason: collision with root package name */
        public TextView f6282m;

        /* renamed from: n, reason: collision with root package name */
        public TextView f6283n;

        /* renamed from: o, reason: collision with root package name */
        public TextView f6284o;

        /* renamed from: p, reason: collision with root package name */
        public String f6285p;

        /* renamed from: q, reason: collision with root package name */
        public final r1 f6286q;

        public class RefreshGraphicsTask extends AsyncTask<Void, Void, sm.b> {

            /* renamed from: a, reason: collision with root package name */
            public final WeakReference f6288a;

            public RefreshGraphicsTask(DataUsageFactoid dataUsageFactoid) {
                this.f6288a = new WeakReference(dataUsageFactoid);
            }

            @Override // android.os.AsyncTask
            public final sm.b doInBackground(Void[] voidArr) {
                DataUsageFactoid dataUsageFactoid = DataUsageFactoid.this;
                r1 r1Var = dataUsageFactoid.f6286q;
                bm.e eVar = Tab_Stats.this.J0;
                r1Var.getClass();
                br.l.e(eVar, "timeFilterUtils");
                boolean z10 = f.f371a;
                ArrayList arrayListB = ch.l.f3962t5.R0().b();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (eVar.C(((bj.a) next).f2774e)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (((bj.a) next2).f2772c == 1) {
                        arrayList2.add(next2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    if (((bj.a) next3).f2772c == 0) {
                        arrayList3.add(next3);
                    }
                }
                Iterator it4 = arrayList2.iterator();
                long j = 0;
                while (it4.hasNext()) {
                    bj.a aVar = (bj.a) it4.next();
                    j += aVar.k + aVar.j;
                }
                Iterator it5 = arrayList3.iterator();
                long j7 = 0;
                while (it5.hasNext()) {
                    bj.a aVar2 = (bj.a) it5.next();
                    j7 += aVar2.k + aVar2.j;
                }
                Iterator it6 = arrayList2.iterator();
                long j10 = 0;
                while (it6.hasNext()) {
                    bj.a aVar3 = (bj.a) it6.next();
                    j10 += aVar3.f2780m + aVar3.f2779l;
                }
                Iterator it7 = arrayList3.iterator();
                long j11 = 0;
                while (it7.hasNext()) {
                    bj.a aVar4 = (bj.a) it7.next();
                    j11 += aVar4.f2780m + aVar4.f2779l;
                }
                return new sm.b(j, j10, j7, j11);
            }

            @Override // android.os.AsyncTask
            public final void onPostExecute(sm.b bVar) {
                sm.b bVar2 = bVar;
                DataUsageFactoid dataUsageFactoid = (DataUsageFactoid) this.f6288a.get();
                if (dataUsageFactoid != null) {
                    Tab_Stats tab_Stats = Tab_Stats.this;
                    if (tab_Stats.w()) {
                        long j = bVar2.f22108a;
                        long j7 = bVar2.f22109b;
                        long j10 = bVar2.f22110c;
                        long j11 = bVar2.f22111d;
                        long j12 = j + j7;
                        if (j12 + j10 + j11 == 0) {
                            dataUsageFactoid.b(PartialDialog.Position.MIDDLE);
                            return;
                        }
                        if (j12 > 0) {
                            dataUsageFactoid.f6275d.setVisibility(0);
                            ProgressBar progressBar = dataUsageFactoid.f6275d;
                            progressBar.setSecondaryProgress(progressBar.getMax());
                            dataUsageFactoid.f6275d.setProgress((int) ((j * 1000) / j12));
                        }
                        g gVarC = i.c(j12);
                        h hVar = gVarC.f6181b;
                        String str = gVarC.f6180a;
                        StringBuilder sbT = c7.a.t(str);
                        sbT.append(tab_Stats.q().getString(hVar.getResourceId()));
                        String string = sbT.toString();
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.3f), str.length(), string.length(), 18);
                        spannableStringBuilder.setSpan(new StyleSpan(0), str.length(), string.length(), 18);
                        dataUsageFactoid.f6283n.setText(spannableStringBuilder);
                        dataUsageFactoid.k.setText(String.format(dataUsageFactoid.f6285p, i.d(j7, hVar).f6180a));
                        dataUsageFactoid.j.setText(String.format(dataUsageFactoid.f6285p, i.d(j, hVar).f6180a));
                        long j13 = j10 + j11;
                        if (j13 > 0) {
                            dataUsageFactoid.f6276e.setVisibility(0);
                            ProgressBar progressBar2 = dataUsageFactoid.f6276e;
                            progressBar2.setSecondaryProgress(progressBar2.getMax());
                            dataUsageFactoid.f6276e.setProgress((int) ((j10 * 1000) / j13));
                        }
                        g gVarC2 = i.c(j13);
                        h hVar2 = gVarC2.f6181b;
                        String str2 = gVarC2.f6180a;
                        StringBuilder sbT2 = c7.a.t(str2);
                        sbT2.append(tab_Stats.q().getString(hVar2.getResourceId()));
                        String string2 = sbT2.toString();
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string2);
                        spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.3f), str2.length(), string2.length(), 18);
                        spannableStringBuilder2.setSpan(new StyleSpan(0), str2.length(), string2.length(), 18);
                        dataUsageFactoid.f6284o.setText(spannableStringBuilder2);
                        dataUsageFactoid.f6282m.setText(String.format(dataUsageFactoid.f6285p, i.d(j11, hVar2).f6180a));
                        dataUsageFactoid.f6281l.setText(String.format(dataUsageFactoid.f6285p, i.d(j10, hVar2).f6180a));
                    }
                }
            }
        }

        public DataUsageFactoid(r1 r1Var) {
            super();
            this.f6286q = r1Var;
        }

        @Override // com.staircase3.opensignal.viewcontrollers.Tab_Stats.Factoid
        public final void a() throws Resources.NotFoundException {
            Tab_Stats tab_Stats = Tab_Stats.this;
            if (tab_Stats.w()) {
                PartialDialog partialDialog = tab_Stats.H0;
                if (partialDialog != null) {
                    partialDialog.f6307a.setVisibility(4);
                    partialDialog.f6308b.setVisibility(4);
                }
                if (this.f6290a == null) {
                    this.f6290a = tab_Stats.B0.inflate(qk.i.tab_stat_mod_data_use, tab_Stats.f6272z0);
                    this.f6285p = tab_Stats.q().getString(qk.l.misc_string_bracketed);
                    tab_Stats.q().getString(qk.l.misc_number_bracketed);
                    new DecimalFormat("#");
                    this.f6275d = (ProgressBar) this.f6290a.findViewById(qk.h.wifi_usage_bar);
                    this.f6276e = (ProgressBar) this.f6290a.findViewById(qk.h.cellular_usage_bar);
                    this.f6283n = (TextView) this.f6290a.findViewById(qk.h.tvWifi_total);
                    this.f6284o = (TextView) this.f6290a.findViewById(qk.h.tvCell_total);
                    this.f6277f = (TextView) this.f6290a.findViewById(qk.h.tvWifi_legend_download_title);
                    this.f6278g = (TextView) this.f6290a.findViewById(qk.h.tvWifi_legend_upload_title);
                    this.f6279h = (TextView) this.f6290a.findViewById(qk.h.tvCell_legend_download_title);
                    this.f6280i = (TextView) this.f6290a.findViewById(qk.h.tvCell_legend_upload_title);
                    this.f6277f.setText(u.a(tab_Stats.q().getString(qk.l.download)));
                    this.f6278g.setText(u.a(tab_Stats.q().getString(qk.l.upload)));
                    this.f6279h.setText(u.a(tab_Stats.q().getString(qk.l.download)));
                    this.f6280i.setText(u.a(tab_Stats.q().getString(qk.l.upload)));
                    this.j = (TextView) this.f6290a.findViewById(qk.h.tvWifi_legend_download_value);
                    this.k = (TextView) this.f6290a.findViewById(qk.h.tvWifi_legend_upload_value);
                    this.f6281l = (TextView) this.f6290a.findViewById(qk.h.tvCell_legend_download_value);
                    this.f6282m = (TextView) this.f6290a.findViewById(qk.h.tvCell_legend_upload_value);
                }
            }
        }

        @Override // com.staircase3.opensignal.viewcontrollers.Tab_Stats.Factoid
        public final void c() throws Resources.NotFoundException {
            if (this.f6291b) {
                a();
            }
            new RefreshGraphicsTask(this).execute(new Void[0]);
        }
    }

    public abstract class Factoid {

        /* renamed from: a, reason: collision with root package name */
        public View f6290a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6291b = false;

        public Factoid() {
        }

        public abstract void a();

        public final void b(PartialDialog.Position position) {
            int iApplyDimension;
            this.f6291b = true;
            PartialDialog.Builder builder = new PartialDialog.Builder();
            Tab_Stats tab_Stats = Tab_Stats.this;
            View view = tab_Stats.f6271y0;
            builder.f6309a = view;
            builder.f6311c = qk.l.stats_error_no_data_because_time;
            builder.f6310b = qk.l.no_data;
            builder.f6312d = position;
            PartialDialog partialDialog = new PartialDialog();
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(qk.h.dialogContainer);
            partialDialog.f6307a = relativeLayout;
            View viewFindViewById = view.findViewById(qk.h.dialogOverlay);
            partialDialog.f6308b = viewFindViewById;
            ((TextView) view.findViewById(qk.h.dialog_title)).setText(builder.f6310b);
            ((TextView) view.findViewById(qk.h.dialog_detail)).setText(builder.f6311c);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (builder.f6312d == PartialDialog.Position.MIDDLE) {
                iApplyDimension = 0;
            } else {
                q qVar = u.f6195a;
                iApplyDimension = (int) TypedValue.applyDimension(1, 176, ((Context) y3.s(Context.class)).getResources().getDisplayMetrics());
            }
            int i10 = layoutParams.leftMargin;
            int i11 = layoutParams.rightMargin;
            layoutParams.setMargins(i10, iApplyDimension, i11, i11);
            relativeLayout.setLayoutParams(layoutParams);
            relativeLayout.requestLayout();
            tab_Stats.H0 = partialDialog;
            relativeLayout.setVisibility(0);
            viewFindViewById.setVisibility(0);
        }

        public abstract void c();
    }

    public class NetworkTypeFactoid extends Factoid {

        /* renamed from: d, reason: collision with root package name */
        public TextView f6293d;

        /* renamed from: e, reason: collision with root package name */
        public TextView f6294e;

        /* renamed from: f, reason: collision with root package name */
        public TextView f6295f;

        /* renamed from: g, reason: collision with root package name */
        public TextView f6296g;

        /* renamed from: h, reason: collision with root package name */
        public TextView f6297h;

        /* renamed from: i, reason: collision with root package name */
        public View f6298i;
        public TextView j;
        public TextView k;

        /* renamed from: l, reason: collision with root package name */
        public TextView f6299l;

        /* renamed from: m, reason: collision with root package name */
        public TextView f6300m;

        /* renamed from: n, reason: collision with root package name */
        public CustStackedBarConnectionStats f6301n;

        /* renamed from: o, reason: collision with root package name */
        public final r1 f6302o;

        public class RefreshGraphicsTask extends AsyncTask<Void, Void, sm.c> {

            /* renamed from: a, reason: collision with root package name */
            public final WeakReference f6305a;

            public RefreshGraphicsTask(NetworkTypeFactoid networkTypeFactoid) {
                this.f6305a = new WeakReference(networkTypeFactoid);
            }

            @Override // android.os.AsyncTask
            public final sm.c doInBackground(Void[] voidArr) {
                NetworkTypeFactoid networkTypeFactoid = NetworkTypeFactoid.this;
                r1 r1Var = networkTypeFactoid.f6302o;
                bm.e eVar = Tab_Stats.this.J0;
                r1Var.getClass();
                br.l.e(eVar, "timeFilterUtils");
                boolean z10 = f.f371a;
                ArrayList arrayListB = ch.l.f3962t5.R0().b();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    bj.a aVar = (bj.a) next;
                    if (eVar.C(aVar.f2774e) && br.l.a(aVar.f2770a, "core")) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() == 0) {
                    return new sm.c(0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                }
                int iX = r1Var.X(arrayList, hm.a.TWO_G);
                int iX2 = r1Var.X(arrayList, hm.a.THREE_G);
                int iX3 = r1Var.X(arrayList, hm.a.FOUR_G);
                int iX4 = r1Var.X(arrayList, hm.a.FIVE_G);
                int iX5 = r1Var.X(arrayList, hm.a.NO_DATA_CONNECTION);
                int i10 = iX + iX2 + iX3 + iX4 + iX5;
                float f10 = i10;
                return new sm.c(i10, iX5 / f10, iX / f10, iX2 / f10, iX3 / f10, iX4 / f10);
            }

            @Override // android.os.AsyncTask
            public final void onPostExecute(sm.c cVar) {
                sm.c cVar2 = cVar;
                NetworkTypeFactoid networkTypeFactoid = (NetworkTypeFactoid) this.f6305a.get();
                if (networkTypeFactoid != null) {
                    Tab_Stats tab_Stats = Tab_Stats.this;
                    if (tab_Stats.w()) {
                        long j = cVar2.f22112a;
                        tab_Stats.J0.getClass();
                        if (j < 1) {
                            networkTypeFactoid.b(PartialDialog.Position.BOTTOM);
                        } else {
                            PartialDialog partialDialog = tab_Stats.H0;
                            if (partialDialog != null) {
                                partialDialog.f6307a.setVisibility(4);
                                partialDialog.f6308b.setVisibility(4);
                            }
                        }
                        DecimalFormat decimalFormat = new DecimalFormat("#.#");
                        float f10 = cVar2.f22113b;
                        float f11 = cVar2.f22114c;
                        float f12 = cVar2.f22115d;
                        float f13 = cVar2.f22116e;
                        float f14 = cVar2.f22117f;
                        String strD = NetworkTypeFactoid.d(decimalFormat, f10);
                        String strD2 = NetworkTypeFactoid.d(decimalFormat, f11);
                        String strD3 = NetworkTypeFactoid.d(decimalFormat, f12);
                        String strD4 = NetworkTypeFactoid.d(decimalFormat, f13);
                        String strD5 = NetworkTypeFactoid.d(decimalFormat, f14);
                        networkTypeFactoid.f6294e.setText(strD);
                        networkTypeFactoid.f6295f.setText(strD2);
                        networkTypeFactoid.f6296g.setText(strD3);
                        networkTypeFactoid.f6297h.setText(strD4);
                        if (f14 == -1.0f) {
                            networkTypeFactoid.f6298i.setVisibility(8);
                            networkTypeFactoid.j.setVisibility(8);
                            networkTypeFactoid.k.setVisibility(8);
                            networkTypeFactoid.f6299l.setVisibility(8);
                        } else {
                            networkTypeFactoid.f6299l.setText(strD5);
                        }
                        networkTypeFactoid.f6300m.setText(qk.l.no_data_connection);
                        String str = decimalFormat.format(Math.round((f11 + f12 + f13 + (f14 == -1.0f ? 0.0f : f14)) * 100.0f));
                        String str2 = String.format(tab_Stats.q().getString(qk.l.stat_percent_timeconnected), str);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.3f), str.length(), str2.length(), 18);
                        spannableStringBuilder.setSpan(new StyleSpan(0), str.length(), str2.length(), 18);
                        networkTypeFactoid.f6293d.setText(spannableStringBuilder);
                        CustStackedBarConnectionStats custStackedBarConnectionStats = networkTypeFactoid.f6301n;
                        float f15 = 10000;
                        custStackedBarConnectionStats.f6160x.setLevel((int) (f14 * f15));
                        float f16 = f14 + f13;
                        custStackedBarConnectionStats.f6159r.setLevel((int) (f16 * f15));
                        float f17 = f16 + f12;
                        custStackedBarConnectionStats.f6158g.setLevel((int) (f17 * f15));
                        custStackedBarConnectionStats.f6157d.setLevel((int) ((f17 + f11) * f15));
                        custStackedBarConnectionStats.invalidate();
                    }
                }
            }

            @Override // android.os.AsyncTask
            public final void onPreExecute() {
                NetworkTypeFactoid networkTypeFactoid = (NetworkTypeFactoid) this.f6305a.get();
                if (networkTypeFactoid != null) {
                    networkTypeFactoid.a();
                }
            }
        }

        public NetworkTypeFactoid(r1 r1Var) {
            super();
            this.f6302o = r1Var;
        }

        public static String d(DecimalFormat decimalFormat, float f10) {
            return decimalFormat.format(f10 * 100.0f) + "%";
        }

        @Override // com.staircase3.opensignal.viewcontrollers.Tab_Stats.Factoid
        public final void a() {
            if (this.f6290a == null) {
                Tab_Stats tab_Stats = Tab_Stats.this;
                View viewInflate = tab_Stats.B0.inflate(qk.i.tab_stat_mod_time_network_type, tab_Stats.f6272z0);
                this.f6290a = viewInflate;
                ImageView imageView = (ImageView) viewInflate.findViewById(qk.h.show_info_view);
                imageView.setImageTintList(ColorStateList.valueOf(this.f6290a.getContext().getColor(qk.d.neutral_1)));
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_Stats.NetworkTypeFactoid.1

                    /* renamed from: com.staircase3.opensignal.viewcontrollers.Tab_Stats$NetworkTypeFactoid$1$1, reason: invalid class name and collision with other inner class name */
                    class DialogInterfaceOnClickListenerC00001 implements DialogInterface.OnClickListener {
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            dialogInterface.dismiss();
                        }
                    }

                    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, lq.h] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Tab_Stats tab_Stats2 = Tab_Stats.this;
                        i.f fVar = new i.f(tab_Stats2.f6270x0, m.CustomAlertDialogTheme);
                        i.b bVar = fVar.f11045a;
                        bVar.k = true;
                        fVar.setNegativeButton(qk.l.close, new DialogInterfaceOnClickListenerC00001());
                        bVar.f10993d = bVar.f10990a.getText(qk.l.my_stats);
                        String strR = tab_Stats2.r(qk.l.stat_measurements_dialog_message);
                        q qVar = u.f6195a;
                        bVar.f10995f = Html.fromHtml(strR, 0);
                        if (!tab_Stats2.Y && tab_Stats2.w()) {
                            fVar.create().show();
                        }
                        ((com.staircase3.opensignal.utils.a) tab_Stats2.M0.getValue()).c("tab_stats_network_availability", "button_press", "button_network_availability_info");
                    }
                });
                this.f6293d = (TextView) this.f6290a.findViewById(qk.h.tvConnected_total);
                this.f6294e = (TextView) this.f6290a.findViewById(qk.h.tvSignalStats_legend_noSignal_value);
                this.f6295f = (TextView) this.f6290a.findViewById(qk.h.tvSignalStats_legend_2G_value);
                this.f6296g = (TextView) this.f6290a.findViewById(qk.h.tvSignalStats_legend_3G_value);
                this.f6297h = (TextView) this.f6290a.findViewById(qk.h.tvSignalStats_legend_4G_value);
                this.f6298i = this.f6290a.findViewById(qk.h.vSignalStats_legend_5G_icon);
                this.j = (TextView) this.f6290a.findViewById(qk.h.tvSignalStats_legend_5G_title);
                this.k = (TextView) this.f6290a.findViewById(qk.h.tvSignalStats_legend_5G_separator);
                this.f6299l = (TextView) this.f6290a.findViewById(qk.h.tvSignalStats_legend_5G_value);
                this.f6301n = (CustStackedBarConnectionStats) this.f6290a.findViewById(qk.h.cvConnectionStats_stacked_bar);
                this.f6300m = (TextView) this.f6290a.findViewById(qk.h.tvSignalStats_noDataConnection_title);
            }
        }

        @Override // com.staircase3.opensignal.viewcontrollers.Tab_Stats.Factoid
        public final void c() {
            if (this.f6291b) {
                a();
            }
            new RefreshGraphicsTask(this).execute(new Void[0]);
        }
    }

    public static class PartialDialog {

        /* renamed from: a, reason: collision with root package name */
        public RelativeLayout f6307a;

        /* renamed from: b, reason: collision with root package name */
        public View f6308b;

        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            public View f6309a;

            /* renamed from: b, reason: collision with root package name */
            public int f6310b;

            /* renamed from: c, reason: collision with root package name */
            public int f6311c;

            /* renamed from: d, reason: collision with root package name */
            public Position f6312d = Position.MIDDLE;
        }

        public enum Position {
            MIDDLE,
            BOTTOM
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, lq.h] */
    @Override // androidx.fragment.app.b
    public final void D(Bundle bundle) {
        b0();
        super.D(bundle);
        this.F0 = new r1((o) ((jn.c) this.K0.getValue()).f13783a.getValue());
        this.J0 = new bm.e(26);
        this.G0 = ((el.b) this.N0.getValue()).D;
    }

    @Override // androidx.fragment.app.b
    public final void E(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(j.tab_overview_menu, menu);
    }

    @Override // androidx.fragment.app.b
    public final View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.B0 = layoutInflater;
        i.j jVarL = l();
        this.f6270x0 = jVarL;
        if (jVarL == null) {
            this.f6270x0 = viewGroup.getContext();
        }
        se.b.W((Activity) this.f6270x0, qk.d.status_bar_background);
        View view = this.f6271y0;
        if (view != null) {
            View view2 = (View) view.getParent();
            if (view2 != viewGroup && view2 != null) {
                ((ViewGroup) view2).removeView(this.f6271y0);
            }
        } else {
            View viewInflate = layoutInflater.inflate(qk.i.tab_stats, (ViewGroup) null);
            this.f6271y0 = viewInflate;
            this.f6272z0 = (RelativeLayout) viewInflate.findViewById(qk.h.stat_graphic);
            Spinner spinner = (Spinner) this.f6271y0.findViewById(qk.h.stat_type_spinner);
            ArrayList arrayList = new ArrayList(Arrays.asList(q().getStringArray(qk.c.stat_type)));
            if (this.G0) {
                arrayList.remove(0);
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(this.f6270x0, qk.i.simple_spinner_item_whitetext, arrayList);
            arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter((SpinnerAdapter) arrayAdapter);
            spinner.setSelection(0, false);
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_Stats.1
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView adapterView, View view3, int i10, long j) throws Resources.NotFoundException {
                    String[] stringArray;
                    Tab_Stats tab_Stats = Tab_Stats.this;
                    if (tab_Stats.G0) {
                        tab_Stats.A0 = 1;
                    } else {
                        tab_Stats.A0 = i10;
                    }
                    tab_Stats.h0();
                    int i11 = tab_Stats.A0;
                    tab_Stats.I0.clear();
                    if (i11 == 1) {
                        Resources resourcesQ = tab_Stats.q();
                        tab_Stats.J0.getClass();
                        stringArray = resourcesQ.getStringArray(qk.c.time_period_new);
                    } else {
                        Resources resourcesQ2 = tab_Stats.q();
                        tab_Stats.J0.getClass();
                        stringArray = resourcesQ2.getStringArray(qk.c.time_period_new);
                    }
                    tab_Stats.I0.addAll(stringArray);
                    tab_Stats.I0.notifyDataSetChanged();
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView adapterView) {
                }
            });
            this.C0 = (Spinner) this.f6271y0.findViewById(qk.h.time_period_spinner);
            g0();
            this.C0.setSelection(0, false);
            this.C0.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.staircase3.opensignal.viewcontrollers.Tab_Stats.2
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView adapterView, View view3, int i10, long j) {
                    Tab_Stats tab_Stats = Tab_Stats.this;
                    bm.e eVar = tab_Stats.J0;
                    eVar.getClass();
                    hm.d.Companion.getClass();
                    eVar.f2830d = i10 > ((mq.a) hm.d.getEntries()).size() + (-1) ? hm.d.SAME_DAY : (hm.d) ((sq.b) hm.d.getEntries()).get(i10);
                    tab_Stats.h0();
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView adapterView) {
                }
            });
        }
        return this.f6271y0;
    }

    @Override // androidx.fragment.app.b
    public final void H() {
        this.f6271y0 = null;
        this.f6272z0 = null;
        this.C0 = null;
        this.H0 = null;
        this.E0 = null;
        this.I0 = null;
        this.f1410c0 = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // androidx.fragment.app.b
    public final boolean M(MenuItem menuItem) {
        ((qm.e) this.L0.getValue()).a(l(), menuItem.getItemId());
        return false;
    }

    @Override // qm.l, androidx.fragment.app.b
    public final void O() {
        super.O();
        if (this.f6270x0 == null) {
            this.f6270x0 = l();
        }
        h0();
        this.O0 = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.b
    public final void P(Bundle bundle) {
        e0(true);
    }

    public final void g0() {
        this.C0.setVisibility(0);
        Resources resources = this.f6270x0.getResources();
        this.J0.getClass();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.f6270x0, qk.i.simple_spinner_item_whitetext, R.id.text1, new ArrayList(Arrays.asList(resources.getStringArray(qk.c.time_period_new))));
        this.I0 = arrayAdapter;
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.C0.setAdapter((SpinnerAdapter) this.I0);
        this.C0.setSelection(((hm.d) this.J0.f2830d).ordinal());
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, lq.h] */
    public final void h0() {
        Factoid factoid = this.E0;
        if (factoid == null || this.D0 != this.A0) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.O0) / 1000;
            this.O0 = System.currentTimeMillis();
            this.f6272z0.removeAllViews();
            if (this.G0) {
                this.A0 = 1;
            }
            this.E0 = this.A0 != 1 ? new NetworkTypeFactoid(this.F0) : new DataUsageFactoid(this.F0);
            com.staircase3.opensignal.utils.a aVar = (com.staircase3.opensignal.utils.a) this.M0.getValue();
            String name = this.E0.getClass().getName();
            q qVar = u.f6195a;
            int iF0 = tt.l.F0(name, '.', 0, 6);
            if (iF0 != -1) {
                name = name.substring(iF0 + 1);
                br.l.d(name, "substring(...)");
            }
            aVar.b(jCurrentTimeMillis, "tab_stats", "stat_type_selected", "stat_selection_".concat(name));
            Factoid factoid2 = this.E0;
            factoid2.a();
            Tab_Stats.this.g0();
            this.E0.c();
        } else {
            factoid.c();
        }
        this.D0 = this.A0;
    }
}
