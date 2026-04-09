package com.liuzh.deviceinfo.card;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cm.g;
import com.github.mikephil.charting.charts.LineChart;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import com.liuzh.deviceinfo.view.circleprogress.ArcProgress;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import n9.h;
import o9.d;
import o9.e;
import s9.a;
import vg.c;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class RamUsageCard extends ConstraintLayout {

    /* renamed from: q, reason: collision with root package name */
    public final ArcProgress f21204q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f21205r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f21206s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f21207t;

    /* renamed from: u, reason: collision with root package name */
    public final LineChart f21208u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21209v;

    /* renamed from: w, reason: collision with root package name */
    public final c f21210w;

    public RamUsageCard(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, 0);
        this.f21209v = false;
        this.f21210w = new c(getContext());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dashboard_ram_card_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setClipChildren(false);
        setClipToPadding(false);
        View.inflate(getContext(), R.layout.card_ram_useage, this);
        this.f21204q = (ArcProgress) findViewById(R.id.ram_arc_progress);
        ArrayList arrayList = i.f38298a;
        f fVar = f.f21256b;
        int iD = f.d();
        this.f21204q.setUnfinishedStrokeColor(g.H(iD, 0.4f));
        this.f21204q.setFinishedStrokeColor(iD);
        this.f21204q.setTextColor(iD);
        this.f21205r = (TextView) findViewById(R.id.ram_used);
        this.f21206s = (TextView) findViewById(R.id.ram_free);
        this.f21208u = (LineChart) findViewById(R.id.line_chart_ram);
        this.f21207t = (TextView) findViewById(R.id.ram_total);
        int iL = g.l(android.R.attr.textColorPrimary, getContext());
        this.f21208u.setDrawGridBackground(false);
        this.f21208u.getDescription().f29850a = false;
        this.f21208u.setBackgroundColor(0);
        e eVar = new e();
        ArrayList arrayList2 = eVar.f30440i;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            ArrayList arrayList3 = ((o9.c) ((a) obj)).f30442b;
            arrayList3.clear();
            arrayList3.add(Integer.valueOf(iL));
        }
        this.f21208u.setData(eVar);
        this.f21208u.getLegend().f29850a = false;
        this.f21208u.setTouchEnabled(false);
        this.f21208u.getXAxis().f29850a = false;
        this.f21208u.getAxisLeft().f29850a = false;
        h axisRight = this.f21208u.getAxisRight();
        axisRight.getClass();
        axisRight.f29841n = 3;
        axisRight.f29854e = iL;
        axisRight.f29842o = false;
        axisRight.f29853d = w9.g.c(9.0f);
        setBackgroundResource(R.drawable.bg_common_card);
    }

    @SuppressLint({"SetTextI18n"})
    private void setupTotalRam(c cVar) {
        String str;
        if (this.f21209v) {
            return;
        }
        double d10 = cVar.f36222b;
        if (d10 > 1024.0d) {
            str = String.format(Locale.US, "%.2f", Double.valueOf(d10 / 1024.0d)) + " " + getContext().getString(R.string.size_gb);
        } else {
            str = ((int) d10) + " " + getContext().getString(R.string.size_mb);
        }
        this.f21207t.setText(str);
        this.f21209v = true;
    }

    public final void m() {
        c cVar = this.f21210w;
        cVar.e();
        setupTotalRam(cVar);
        this.f21204q.setProgress((int) cVar.f36225e);
        float f10 = (float) cVar.f36224d;
        this.f21205r.setText(String.valueOf((int) f10));
        this.f21206s.setText(String.valueOf((int) cVar.f36223c));
        LineChart lineChart = this.f21208u;
        e eVar = (e) lineChart.getData();
        if (eVar != null) {
            o9.f fVar = (o9.f) eVar.d(0);
            if (fVar == null) {
                ArrayList arrayList = i.f38298a;
                f fVar2 = f.f21256b;
                int iD = f.d();
                o9.f fVar3 = new o9.f("Dynamic Data", null);
                fVar3.f30444d = 2;
                if (fVar3.f30441a == null) {
                    fVar3.f30441a = new ArrayList();
                }
                fVar3.f30441a.clear();
                fVar3.f30441a.add(Integer.valueOf(iD));
                fVar3.E = false;
                fVar3.f30465x = 3;
                fVar3.f30463v = w9.g.c(2.0f);
                fVar3.f30446f = false;
                fVar3.f30464w = true;
                fVar3.f30461t = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{g.H(iD, 0.65f), 0});
                eVar.a(fVar3);
                fVar = fVar3;
            }
            float size = fVar.j.size();
            d dVar = new d(size, f10);
            ArrayList arrayList2 = eVar.f30440i;
            if (arrayList2.size() > 0) {
                o9.c cVar2 = (o9.c) ((a) arrayList2.get(0));
                List arrayList3 = cVar2.j;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                cVar2.a(dVar);
                if (arrayList3.add(dVar)) {
                    int i4 = cVar2.f30444d;
                    float f11 = eVar.f30433a;
                    float f12 = dVar.f30453a;
                    if (f11 < f12) {
                        eVar.f30433a = f12;
                    }
                    if (eVar.f30434b > f12) {
                        eVar.f30434b = f12;
                    }
                    if (eVar.f30435c < size) {
                        eVar.f30435c = size;
                    }
                    if (eVar.f30436d > size) {
                        eVar.f30436d = size;
                    }
                    if (i4 == 1) {
                        if (eVar.f30437e < f12) {
                            eVar.f30437e = f12;
                        }
                        if (eVar.f30438f > f12) {
                            eVar.f30438f = f12;
                        }
                    } else {
                        if (eVar.g < f12) {
                            eVar.g = f12;
                        }
                        if (eVar.f30439h > f12) {
                            eVar.f30439h = f12;
                        }
                    }
                }
            } else {
                Log.e("addEntry", "Cannot add Entry because dataSetIndex too high or too low.");
            }
            eVar.b();
            lineChart.f();
            lineChart.setVisibleXRangeMaximum(20.0f);
            float fE = eVar.e();
            w9.h hVar = lineChart.f29012s;
            pe.c cVar3 = lineChart.f28986a0;
            t9.a aVar = (t9.a) t9.a.g.b();
            aVar.f34524c = hVar;
            aVar.f34525d = fE;
            aVar.f34526e = cVar3;
            aVar.f34527f = lineChart;
            if (hVar.f36566d <= 0.0f || hVar.f36565c <= 0.0f) {
                lineChart.B.add(aVar);
            } else {
                lineChart.post(aVar);
            }
        }
    }
}
