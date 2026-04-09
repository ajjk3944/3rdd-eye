package ph;

import ah.n;
import ah.o;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.f1;
import b5.z;
import bh.i;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.gms.internal.measurement.j4;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import e4.m0;
import e4.v0;
import java.text.DecimalFormat;
import java.util.WeakHashMap;
import nk.k;
import nk.v;
import yj.u;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends hg.d implements n {
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public n.a f31979a0;

    /* renamed from: b0, reason: collision with root package name */
    public qg.e f31980b0;

    /* renamed from: c0, reason: collision with root package name */
    public final f1 f31981c0;

    /* renamed from: d0, reason: collision with root package name */
    public final DecimalFormat f31982d0;

    public e() {
        a6.e eVar = new a6.e(18, this);
        yj.f fVarT = a.a.t(yj.g.f37636b, new b2.b(22, new b2.b(21, this)));
        this.f31981c0 = new f1(v.a(f.class), new ej.h(fVarT, 10), eVar, new ej.h(fVarT, 11));
        this.f31982d0 = new DecimalFormat("#0.00");
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        Bundle bundle2 = this.g;
        if (bundle2 != null && bundle2.containsKey("type")) {
            this.Z = bundle2.getInt("type");
        }
        if (!k.a(i0().f31988h.d(), Boolean.FALSE)) {
            o.f400d.b(this);
            return;
        }
        if (c0()) {
            return;
        }
        String strU = u(R.string.failed);
        Context contextP = p();
        if (contextP != null) {
            Toast.makeText(contextP, strU, 0).show();
        }
        U().finish();
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) throws NoSuchFieldException, SecurityException {
        k.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sensors_detail, viewGroup, false);
        int i4 = R.id.ad_container;
        CardView cardView = (CardView) wb.e.s(R.id.ad_container, viewInflate);
        if (cardView != null) {
            i4 = R.id.head_card;
            if (((CardView) wb.e.s(R.id.head_card, viewInflate)) != null) {
                i4 = R.id.line_chart;
                LineChart lineChart = (LineChart) wb.e.s(R.id.line_chart, viewInflate);
                if (lineChart != null) {
                    i4 = R.id.sensor_icon;
                    ImageView imageView = (ImageView) wb.e.s(R.id.sensor_icon, viewInflate);
                    if (imageView != null) {
                        i4 = R.id.top_container;
                        if (((ConstraintLayout) wb.e.s(R.id.top_container, viewInflate)) != null) {
                            i4 = R.id.tv_int_type;
                            TextView textView = (TextView) wb.e.s(R.id.tv_int_type, viewInflate);
                            if (textView != null) {
                                i4 = R.id.tv_is_dynamic_sensor;
                                TextView textView2 = (TextView) wb.e.s(R.id.tv_is_dynamic_sensor, viewInflate);
                                if (textView2 != null) {
                                    i4 = R.id.tv_is_wakeup_sensor;
                                    TextView textView3 = (TextView) wb.e.s(R.id.tv_is_wakeup_sensor, viewInflate);
                                    if (textView3 != null) {
                                        i4 = R.id.tv_maximum_range;
                                        TextView textView4 = (TextView) wb.e.s(R.id.tv_maximum_range, viewInflate);
                                        if (textView4 != null) {
                                            i4 = R.id.tv_power;
                                            TextView textView5 = (TextView) wb.e.s(R.id.tv_power, viewInflate);
                                            if (textView5 != null) {
                                                i4 = R.id.tv_reporting_mode;
                                                TextView textView6 = (TextView) wb.e.s(R.id.tv_reporting_mode, viewInflate);
                                                if (textView6 != null) {
                                                    i4 = R.id.tv_resolution;
                                                    TextView textView7 = (TextView) wb.e.s(R.id.tv_resolution, viewInflate);
                                                    if (textView7 != null) {
                                                        i4 = R.id.tv_sensor_id;
                                                        TextView textView8 = (TextView) wb.e.s(R.id.tv_sensor_id, viewInflate);
                                                        if (textView8 != null) {
                                                            i4 = R.id.tv_sensor_name;
                                                            TextView textView9 = (TextView) wb.e.s(R.id.tv_sensor_name, viewInflate);
                                                            if (textView9 != null) {
                                                                i4 = R.id.tv_vendor;
                                                                TextView textView10 = (TextView) wb.e.s(R.id.tv_vendor, viewInflate);
                                                                if (textView10 != null) {
                                                                    i4 = R.id.tv_version;
                                                                    TextView textView11 = (TextView) wb.e.s(R.id.tv_version, viewInflate);
                                                                    if (textView11 != null) {
                                                                        i4 = R.id.tv_x;
                                                                        TextView textView12 = (TextView) wb.e.s(R.id.tv_x, viewInflate);
                                                                        if (textView12 != null) {
                                                                            i4 = R.id.tv_y;
                                                                            TextView textView13 = (TextView) wb.e.s(R.id.tv_y, viewInflate);
                                                                            if (textView13 != null) {
                                                                                i4 = R.id.tv_z;
                                                                                TextView textView14 = (TextView) wb.e.s(R.id.tv_z, viewInflate);
                                                                                if (textView14 != null) {
                                                                                    ScrollView scrollView = (ScrollView) viewInflate;
                                                                                    qg.e eVar = new qg.e(scrollView, cardView, lineChart, imageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14);
                                                                                    com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                                                                                    int iD = com.liuzh.deviceinfo.utilities.f.d();
                                                                                    int iE = com.liuzh.deviceinfo.utilities.f.e();
                                                                                    k.d(scrollView, "getRoot(...)");
                                                                                    dj.b.m(scrollView, iD);
                                                                                    textView9.setTextColor(iE);
                                                                                    textView.setTextColor(iE);
                                                                                    textView10.setTextColor(iE);
                                                                                    textView11.setTextColor(iE);
                                                                                    textView7.setTextColor(iE);
                                                                                    textView5.setTextColor(iE);
                                                                                    textView4.setTextColor(iE);
                                                                                    textView8.setTextColor(iE);
                                                                                    textView3.setTextColor(iE);
                                                                                    textView2.setTextColor(iE);
                                                                                    textView6.setTextColor(iE);
                                                                                    if (m.K(Integer.valueOf(this.Z), i0().f31985d)) {
                                                                                        n9.c description = lineChart.getDescription();
                                                                                        if (description != null) {
                                                                                            description.f29850a = false;
                                                                                        }
                                                                                        n9.e legend = lineChart.getLegend();
                                                                                        if (legend != null) {
                                                                                            legend.f29850a = false;
                                                                                        }
                                                                                        n9.h axisRight = lineChart.getAxisRight();
                                                                                        if (axisRight != null) {
                                                                                            axisRight.f29850a = false;
                                                                                        }
                                                                                        lineChart.setTouchEnabled(false);
                                                                                        n9.h axisLeft = lineChart.getAxisLeft();
                                                                                        if (axisLeft != null) {
                                                                                            axisLeft.g = W().getColor(R.color.black_white_22);
                                                                                            axisLeft.f29837i = W().getColor(R.color.black_white_88);
                                                                                            axisLeft.f29854e = W().getColor(R.color.black_white_88);
                                                                                            axisLeft.f29836h = w9.g.c(1.0f);
                                                                                            axisLeft.f29843p = false;
                                                                                            axisLeft.f29835f = new p9.b();
                                                                                        }
                                                                                        n9.g xAxis = lineChart.getXAxis();
                                                                                        if (xAxis != null) {
                                                                                            xAxis.f29876x = 2;
                                                                                            xAxis.g = W().getColor(R.color.black_white_22);
                                                                                            xAxis.f29837i = W().getColor(R.color.black_white_88);
                                                                                            xAxis.f29844q = false;
                                                                                            xAxis.f29842o = false;
                                                                                            xAxis.f29843p = false;
                                                                                        }
                                                                                        lineChart.setData(i0().g);
                                                                                    } else {
                                                                                        lineChart.setVisibility(8);
                                                                                    }
                                                                                    this.f31980b0 = eVar;
                                                                                    j0();
                                                                                    qg.e eVar2 = this.f31980b0;
                                                                                    if (eVar2 == null) {
                                                                                        k.k("binding");
                                                                                        throw null;
                                                                                    }
                                                                                    ScrollView scrollView2 = (ScrollView) eVar2.f32345b;
                                                                                    k.d(scrollView2, "getRoot(...)");
                                                                                    return scrollView2;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // b5.z
    public final void H() {
        this.F = true;
        n.a aVar = this.f31979a0;
        if (aVar != null) {
            aVar.b();
        }
        this.f31979a0 = null;
        o.f400d.h(this);
    }

    @Override // b5.z
    public final void L() {
        this.F = true;
        f fVarI0 = i0();
        SensorManager sensorManager = fVarI0.f31986e;
        if (sensorManager != null) {
            sensorManager.unregisterListener(fVarI0);
        }
    }

    @Override // b5.z
    public final void N() {
        this.F = true;
        f fVarI0 = i0();
        Sensor sensor = fVarI0.f31987f;
        if (sensor == null) {
            return;
        }
        SensorManager sensorManager = fVarI0.f31986e;
        if (sensorManager != null) {
            sensorManager.registerListener(fVarI0, sensor, 3);
        }
        fVarI0.f31989i.j(j4.e(sensor));
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        k.e(view, "view");
        Bundle bundle2 = this.g;
        if (bundle2 != null) {
            if (bundle2.containsKey("name")) {
                qg.e eVar = this.f31980b0;
                if (eVar == null) {
                    k.k("binding");
                    throw null;
                }
                ((TextView) eVar.f32354m).setText(bundle2.getString("name"));
            }
            if (bundle2.containsKey("icon")) {
                int i4 = bundle2.getInt("icon");
                qg.e eVar2 = this.f31980b0;
                if (eVar2 == null) {
                    k.k("binding");
                    throw null;
                }
                eVar2.f32344a.setImageResource(i4);
            }
        }
        final int i10 = 0;
        int i11 = 9;
        i0().j.e(v(), new i(new mk.c(this) { // from class: ph.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f31976b;

            {
                this.f31976b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) throws Resources.NotFoundException {
                String strValueOf;
                switch (i10) {
                    case 0:
                        b bVar = (b) obj;
                        k.b(bVar);
                        e eVar3 = this.f31976b;
                        eVar3.getClass();
                        Resources resources = DeviceInfoApp.f21145f.getResources();
                        qg.e eVar4 = eVar3.f31980b0;
                        if (eVar4 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((TextView) eVar4.f32348e).setText(bVar.f31968b);
                        qg.e eVar5 = eVar3.f31980b0;
                        if (eVar5 == null) {
                            k.k("binding");
                            throw null;
                        }
                        eVar5.f32355n.setText(bVar.f31969c);
                        qg.e eVar6 = eVar3.f31980b0;
                        if (eVar6 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((TextView) eVar6.f32356o).setText(String.valueOf(bVar.f31970d));
                        qg.e eVar7 = eVar3.f31980b0;
                        if (eVar7 == null) {
                            k.k("binding");
                            throw null;
                        }
                        eVar7.f32352k.setText(bVar.f31971e + " " + a.a.n(eVar3.Z));
                        qg.e eVar8 = eVar3.f31980b0;
                        if (eVar8 == null) {
                            k.k("binding");
                            throw null;
                        }
                        eVar8.f32351i.setText(bVar.f31972f + " " + resources.getString(R.string.ma));
                        qg.e eVar9 = eVar3.f31980b0;
                        if (eVar9 == null) {
                            k.k("binding");
                            throw null;
                        }
                        eVar9.f32350h.setText(bVar.g + " " + a.a.n(eVar3.Z));
                        String string = resources.getString(R.string.yes);
                        k.d(string, "getString(...)");
                        String string2 = resources.getString(R.string.no);
                        k.d(string2, "getString(...)");
                        qg.e eVar10 = eVar3.f31980b0;
                        if (eVar10 == null) {
                            k.k("binding");
                            throw null;
                        }
                        TextView textView = eVar10.f32353l;
                        Integer num = bVar.f31967a;
                        if (num == null || (strValueOf = String.valueOf(num.intValue())) == null) {
                            strValueOf = "-";
                        }
                        textView.setText(strValueOf);
                        Boolean bool = bVar.f31973h;
                        if (bool != null) {
                            qg.e eVar11 = eVar3.f31980b0;
                            if (eVar11 == null) {
                                k.k("binding");
                                throw null;
                            }
                            eVar11.f32349f.setText(bool.booleanValue() ? string : string2);
                        } else {
                            qg.e eVar12 = eVar3.f31980b0;
                            if (eVar12 == null) {
                                k.k("binding");
                                throw null;
                            }
                            eVar12.f32349f.setText("-");
                        }
                        Boolean bool2 = bVar.f31974i;
                        if (bool2 != null) {
                            qg.e eVar13 = eVar3.f31980b0;
                            if (eVar13 == null) {
                                k.k("binding");
                                throw null;
                            }
                            TextView textView2 = eVar13.g;
                            if (!bool2.booleanValue()) {
                                string = string2;
                            }
                            textView2.setText(string);
                        } else {
                            qg.e eVar14 = eVar3.f31980b0;
                            if (eVar14 == null) {
                                k.k("binding");
                                throw null;
                            }
                            eVar14.g.setText("-");
                        }
                        Integer num2 = bVar.j;
                        if (num2 != null) {
                            qg.e eVar15 = eVar3.f31980b0;
                            if (eVar15 == null) {
                                k.k("binding");
                                throw null;
                            }
                            TextView textView3 = eVar15.j;
                            int iIntValue = num2.intValue();
                            String string3 = DeviceInfoApp.f21145f.getResources().getString(iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? R.string.unknown : R.string.reporting_mode_special_trigger : R.string.reporting_mode_one_shot : R.string.reporting_mode_on_change : R.string.reporting_mode_continuous);
                            k.d(string3, "getString(...)");
                            textView3.setText(string3);
                        } else {
                            qg.e eVar16 = eVar3.f31980b0;
                            if (eVar16 == null) {
                                k.k("binding");
                                throw null;
                            }
                            eVar16.j.setText("-");
                        }
                        return u.f37649a;
                    case 1:
                        h hVar = (h) obj;
                        e eVar17 = this.f31976b;
                        qg.e eVar18 = eVar17.f31980b0;
                        if (eVar18 == null) {
                            k.k("binding");
                            throw null;
                        }
                        TextView textView4 = (TextView) eVar18.f32357p;
                        k.d(textView4, "tvX");
                        textView4.setVisibility(0);
                        qg.e eVar19 = eVar17.f31980b0;
                        if (eVar19 == null) {
                            k.k("binding");
                            throw null;
                        }
                        TextView textView5 = (TextView) eVar19.f32357p;
                        float f10 = hVar.f31997a;
                        Float f11 = hVar.f31999c;
                        Float f12 = hVar.f31998b;
                        String str = hVar.f32001e;
                        textView5.setText("X: " + eVar17.h0(f10) + " " + str);
                        qg.e eVar20 = eVar17.f31980b0;
                        if (eVar20 == null) {
                            k.k("binding");
                            throw null;
                        }
                        TextView textView6 = (TextView) eVar20.f32358q;
                        k.d(textView6, "tvY");
                        textView6.setVisibility(f12 != null ? 0 : 8);
                        qg.e eVar21 = eVar17.f31980b0;
                        if (eVar21 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((TextView) eVar21.f32358q).setText(f12 == null ? "" : je.u.u("Y: ", eVar17.h0(f12.floatValue()), " ", str));
                        qg.e eVar22 = eVar17.f31980b0;
                        if (eVar22 == null) {
                            k.k("binding");
                            throw null;
                        }
                        TextView textView7 = (TextView) eVar22.f32359r;
                        k.d(textView7, "tvZ");
                        textView7.setVisibility(f11 == null ? 8 : 0);
                        qg.e eVar23 = eVar17.f31980b0;
                        if (eVar23 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((TextView) eVar23.f32359r).setText(f11 != null ? je.u.u("Z: ", eVar17.h0(f11.floatValue()), " ", str) : "");
                        break;
                    default:
                        e eVar24 = this.f31976b;
                        qg.e eVar25 = eVar24.f31980b0;
                        if (eVar25 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((LineChart) eVar25.f32347d).f();
                        qg.e eVar26 = eVar24.f31980b0;
                        if (eVar26 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((LineChart) eVar26.f32347d).invalidate();
                        break;
                }
                return u.f37649a;
            }
        }, i11));
        final int i12 = 1;
        i0().f31991l.e(v(), new i(new mk.c(this) { // from class: ph.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f31976b;

            {
                this.f31976b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) throws Resources.NotFoundException {
                String strValueOf;
                switch (i12) {
                    case 0:
                        b bVar = (b) obj;
                        k.b(bVar);
                        e eVar3 = this.f31976b;
                        eVar3.getClass();
                        Resources resources = DeviceInfoApp.f21145f.getResources();
                        qg.e eVar4 = eVar3.f31980b0;
                        if (eVar4 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((TextView) eVar4.f32348e).setText(bVar.f31968b);
                        qg.e eVar5 = eVar3.f31980b0;
                        if (eVar5 == null) {
                            k.k("binding");
                            throw null;
                        }
                        eVar5.f32355n.setText(bVar.f31969c);
                        qg.e eVar6 = eVar3.f31980b0;
                        if (eVar6 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((TextView) eVar6.f32356o).setText(String.valueOf(bVar.f31970d));
                        qg.e eVar7 = eVar3.f31980b0;
                        if (eVar7 == null) {
                            k.k("binding");
                            throw null;
                        }
                        eVar7.f32352k.setText(bVar.f31971e + " " + a.a.n(eVar3.Z));
                        qg.e eVar8 = eVar3.f31980b0;
                        if (eVar8 == null) {
                            k.k("binding");
                            throw null;
                        }
                        eVar8.f32351i.setText(bVar.f31972f + " " + resources.getString(R.string.ma));
                        qg.e eVar9 = eVar3.f31980b0;
                        if (eVar9 == null) {
                            k.k("binding");
                            throw null;
                        }
                        eVar9.f32350h.setText(bVar.g + " " + a.a.n(eVar3.Z));
                        String string = resources.getString(R.string.yes);
                        k.d(string, "getString(...)");
                        String string2 = resources.getString(R.string.no);
                        k.d(string2, "getString(...)");
                        qg.e eVar10 = eVar3.f31980b0;
                        if (eVar10 == null) {
                            k.k("binding");
                            throw null;
                        }
                        TextView textView = eVar10.f32353l;
                        Integer num = bVar.f31967a;
                        if (num == null || (strValueOf = String.valueOf(num.intValue())) == null) {
                            strValueOf = "-";
                        }
                        textView.setText(strValueOf);
                        Boolean bool = bVar.f31973h;
                        if (bool != null) {
                            qg.e eVar11 = eVar3.f31980b0;
                            if (eVar11 == null) {
                                k.k("binding");
                                throw null;
                            }
                            eVar11.f32349f.setText(bool.booleanValue() ? string : string2);
                        } else {
                            qg.e eVar12 = eVar3.f31980b0;
                            if (eVar12 == null) {
                                k.k("binding");
                                throw null;
                            }
                            eVar12.f32349f.setText("-");
                        }
                        Boolean bool2 = bVar.f31974i;
                        if (bool2 != null) {
                            qg.e eVar13 = eVar3.f31980b0;
                            if (eVar13 == null) {
                                k.k("binding");
                                throw null;
                            }
                            TextView textView2 = eVar13.g;
                            if (!bool2.booleanValue()) {
                                string = string2;
                            }
                            textView2.setText(string);
                        } else {
                            qg.e eVar14 = eVar3.f31980b0;
                            if (eVar14 == null) {
                                k.k("binding");
                                throw null;
                            }
                            eVar14.g.setText("-");
                        }
                        Integer num2 = bVar.j;
                        if (num2 != null) {
                            qg.e eVar15 = eVar3.f31980b0;
                            if (eVar15 == null) {
                                k.k("binding");
                                throw null;
                            }
                            TextView textView3 = eVar15.j;
                            int iIntValue = num2.intValue();
                            String string3 = DeviceInfoApp.f21145f.getResources().getString(iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? R.string.unknown : R.string.reporting_mode_special_trigger : R.string.reporting_mode_one_shot : R.string.reporting_mode_on_change : R.string.reporting_mode_continuous);
                            k.d(string3, "getString(...)");
                            textView3.setText(string3);
                        } else {
                            qg.e eVar16 = eVar3.f31980b0;
                            if (eVar16 == null) {
                                k.k("binding");
                                throw null;
                            }
                            eVar16.j.setText("-");
                        }
                        return u.f37649a;
                    case 1:
                        h hVar = (h) obj;
                        e eVar17 = this.f31976b;
                        qg.e eVar18 = eVar17.f31980b0;
                        if (eVar18 == null) {
                            k.k("binding");
                            throw null;
                        }
                        TextView textView4 = (TextView) eVar18.f32357p;
                        k.d(textView4, "tvX");
                        textView4.setVisibility(0);
                        qg.e eVar19 = eVar17.f31980b0;
                        if (eVar19 == null) {
                            k.k("binding");
                            throw null;
                        }
                        TextView textView5 = (TextView) eVar19.f32357p;
                        float f10 = hVar.f31997a;
                        Float f11 = hVar.f31999c;
                        Float f12 = hVar.f31998b;
                        String str = hVar.f32001e;
                        textView5.setText("X: " + eVar17.h0(f10) + " " + str);
                        qg.e eVar20 = eVar17.f31980b0;
                        if (eVar20 == null) {
                            k.k("binding");
                            throw null;
                        }
                        TextView textView6 = (TextView) eVar20.f32358q;
                        k.d(textView6, "tvY");
                        textView6.setVisibility(f12 != null ? 0 : 8);
                        qg.e eVar21 = eVar17.f31980b0;
                        if (eVar21 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((TextView) eVar21.f32358q).setText(f12 == null ? "" : je.u.u("Y: ", eVar17.h0(f12.floatValue()), " ", str));
                        qg.e eVar22 = eVar17.f31980b0;
                        if (eVar22 == null) {
                            k.k("binding");
                            throw null;
                        }
                        TextView textView7 = (TextView) eVar22.f32359r;
                        k.d(textView7, "tvZ");
                        textView7.setVisibility(f11 == null ? 8 : 0);
                        qg.e eVar23 = eVar17.f31980b0;
                        if (eVar23 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((TextView) eVar23.f32359r).setText(f11 != null ? je.u.u("Z: ", eVar17.h0(f11.floatValue()), " ", str) : "");
                        break;
                    default:
                        e eVar24 = this.f31976b;
                        qg.e eVar25 = eVar24.f31980b0;
                        if (eVar25 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((LineChart) eVar25.f32347d).f();
                        qg.e eVar26 = eVar24.f31980b0;
                        if (eVar26 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((LineChart) eVar26.f32347d).invalidate();
                        break;
                }
                return u.f37649a;
            }
        }, i11));
        final int i13 = 2;
        i0().f31994o.e(v(), new i(new mk.c(this) { // from class: ph.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f31976b;

            {
                this.f31976b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) throws Resources.NotFoundException {
                String strValueOf;
                switch (i13) {
                    case 0:
                        b bVar = (b) obj;
                        k.b(bVar);
                        e eVar3 = this.f31976b;
                        eVar3.getClass();
                        Resources resources = DeviceInfoApp.f21145f.getResources();
                        qg.e eVar4 = eVar3.f31980b0;
                        if (eVar4 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((TextView) eVar4.f32348e).setText(bVar.f31968b);
                        qg.e eVar5 = eVar3.f31980b0;
                        if (eVar5 == null) {
                            k.k("binding");
                            throw null;
                        }
                        eVar5.f32355n.setText(bVar.f31969c);
                        qg.e eVar6 = eVar3.f31980b0;
                        if (eVar6 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((TextView) eVar6.f32356o).setText(String.valueOf(bVar.f31970d));
                        qg.e eVar7 = eVar3.f31980b0;
                        if (eVar7 == null) {
                            k.k("binding");
                            throw null;
                        }
                        eVar7.f32352k.setText(bVar.f31971e + " " + a.a.n(eVar3.Z));
                        qg.e eVar8 = eVar3.f31980b0;
                        if (eVar8 == null) {
                            k.k("binding");
                            throw null;
                        }
                        eVar8.f32351i.setText(bVar.f31972f + " " + resources.getString(R.string.ma));
                        qg.e eVar9 = eVar3.f31980b0;
                        if (eVar9 == null) {
                            k.k("binding");
                            throw null;
                        }
                        eVar9.f32350h.setText(bVar.g + " " + a.a.n(eVar3.Z));
                        String string = resources.getString(R.string.yes);
                        k.d(string, "getString(...)");
                        String string2 = resources.getString(R.string.no);
                        k.d(string2, "getString(...)");
                        qg.e eVar10 = eVar3.f31980b0;
                        if (eVar10 == null) {
                            k.k("binding");
                            throw null;
                        }
                        TextView textView = eVar10.f32353l;
                        Integer num = bVar.f31967a;
                        if (num == null || (strValueOf = String.valueOf(num.intValue())) == null) {
                            strValueOf = "-";
                        }
                        textView.setText(strValueOf);
                        Boolean bool = bVar.f31973h;
                        if (bool != null) {
                            qg.e eVar11 = eVar3.f31980b0;
                            if (eVar11 == null) {
                                k.k("binding");
                                throw null;
                            }
                            eVar11.f32349f.setText(bool.booleanValue() ? string : string2);
                        } else {
                            qg.e eVar12 = eVar3.f31980b0;
                            if (eVar12 == null) {
                                k.k("binding");
                                throw null;
                            }
                            eVar12.f32349f.setText("-");
                        }
                        Boolean bool2 = bVar.f31974i;
                        if (bool2 != null) {
                            qg.e eVar13 = eVar3.f31980b0;
                            if (eVar13 == null) {
                                k.k("binding");
                                throw null;
                            }
                            TextView textView2 = eVar13.g;
                            if (!bool2.booleanValue()) {
                                string = string2;
                            }
                            textView2.setText(string);
                        } else {
                            qg.e eVar14 = eVar3.f31980b0;
                            if (eVar14 == null) {
                                k.k("binding");
                                throw null;
                            }
                            eVar14.g.setText("-");
                        }
                        Integer num2 = bVar.j;
                        if (num2 != null) {
                            qg.e eVar15 = eVar3.f31980b0;
                            if (eVar15 == null) {
                                k.k("binding");
                                throw null;
                            }
                            TextView textView3 = eVar15.j;
                            int iIntValue = num2.intValue();
                            String string3 = DeviceInfoApp.f21145f.getResources().getString(iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? R.string.unknown : R.string.reporting_mode_special_trigger : R.string.reporting_mode_one_shot : R.string.reporting_mode_on_change : R.string.reporting_mode_continuous);
                            k.d(string3, "getString(...)");
                            textView3.setText(string3);
                        } else {
                            qg.e eVar16 = eVar3.f31980b0;
                            if (eVar16 == null) {
                                k.k("binding");
                                throw null;
                            }
                            eVar16.j.setText("-");
                        }
                        return u.f37649a;
                    case 1:
                        h hVar = (h) obj;
                        e eVar17 = this.f31976b;
                        qg.e eVar18 = eVar17.f31980b0;
                        if (eVar18 == null) {
                            k.k("binding");
                            throw null;
                        }
                        TextView textView4 = (TextView) eVar18.f32357p;
                        k.d(textView4, "tvX");
                        textView4.setVisibility(0);
                        qg.e eVar19 = eVar17.f31980b0;
                        if (eVar19 == null) {
                            k.k("binding");
                            throw null;
                        }
                        TextView textView5 = (TextView) eVar19.f32357p;
                        float f10 = hVar.f31997a;
                        Float f11 = hVar.f31999c;
                        Float f12 = hVar.f31998b;
                        String str = hVar.f32001e;
                        textView5.setText("X: " + eVar17.h0(f10) + " " + str);
                        qg.e eVar20 = eVar17.f31980b0;
                        if (eVar20 == null) {
                            k.k("binding");
                            throw null;
                        }
                        TextView textView6 = (TextView) eVar20.f32358q;
                        k.d(textView6, "tvY");
                        textView6.setVisibility(f12 != null ? 0 : 8);
                        qg.e eVar21 = eVar17.f31980b0;
                        if (eVar21 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((TextView) eVar21.f32358q).setText(f12 == null ? "" : je.u.u("Y: ", eVar17.h0(f12.floatValue()), " ", str));
                        qg.e eVar22 = eVar17.f31980b0;
                        if (eVar22 == null) {
                            k.k("binding");
                            throw null;
                        }
                        TextView textView7 = (TextView) eVar22.f32359r;
                        k.d(textView7, "tvZ");
                        textView7.setVisibility(f11 == null ? 8 : 0);
                        qg.e eVar23 = eVar17.f31980b0;
                        if (eVar23 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((TextView) eVar23.f32359r).setText(f11 != null ? je.u.u("Z: ", eVar17.h0(f11.floatValue()), " ", str) : "");
                        break;
                    default:
                        e eVar24 = this.f31976b;
                        qg.e eVar25 = eVar24.f31980b0;
                        if (eVar25 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((LineChart) eVar25.f32347d).f();
                        qg.e eVar26 = eVar24.f31980b0;
                        if (eVar26 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((LineChart) eVar26.f32347d).invalidate();
                        break;
                }
                return u.f37649a;
            }
        }, i11));
        d dVar = new d(0, view);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(view, dVar);
    }

    public final String h0(float f10) {
        return d.h.s(f10 >= 0.0f ? "+" : "", this.f31982d0.format(f10));
    }

    @Override // ah.n
    public final void i(boolean z3) {
        if (z3) {
            k0();
        } else {
            j0();
        }
    }

    public final f i0() {
        return (f) this.f31981c0.getValue();
    }

    public final void j0() {
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        if (com.liuzh.deviceinfo.utilities.f.g()) {
            k0();
            return;
        }
        pi.a aVarC = ag.a.c(R.layout.ad_native_common);
        cg.a.f2848b.f(r5.c.g("action", "load"), "ad_sensor_detail");
        qg.e eVar = this.f31980b0;
        if (eVar == null) {
            k.k("binding");
            throw null;
        }
        pd.b.p((CardView) eVar.f32346c, true);
        je.u.k(W(), new ej.f(1, (z) this), aVarC);
    }

    public final void k0() {
        qg.e eVar = this.f31980b0;
        if (eVar == null) {
            k.k("binding");
            throw null;
        }
        ((CardView) eVar.f32346c).removeAllViews();
        qg.e eVar2 = this.f31980b0;
        if (eVar2 == null) {
            k.k("binding");
            throw null;
        }
        CardView cardView = (CardView) eVar2.f32346c;
        k.d(cardView, "adContainer");
        cardView.setVisibility(8);
    }
}
