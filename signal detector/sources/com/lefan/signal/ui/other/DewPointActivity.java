package com.lefan.signal.ui.other;

import B4.g;
import F4.e;
import J4.a;
import J4.c;
import J4.d;
import K4.b;
import a4.p;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import c.AbstractC0391p;
import com.apm.insight.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.lefan.ads.banner.BannerView;
import com.lefan.signal.ui.other.DewPointActivity;
import com.lefan.signal.ui.other.HumidityView2;
import com.lefan.signal.ui.sensor.TemperatureView;
import d5.AbstractC2283k;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import o4.AbstractC2763b;
import q5.i;

/* loaded from: classes.dex */
public final class DewPointActivity extends AbstractActivityC2349g implements SensorEventListener {

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f19048u0 = 0;

    /* renamed from: O, reason: collision with root package name */
    public b f19049O;

    /* renamed from: P, reason: collision with root package name */
    public SensorManager f19050P;

    /* renamed from: Q, reason: collision with root package name */
    public Sensor f19051Q;

    /* renamed from: R, reason: collision with root package name */
    public Sensor f19052R;

    /* renamed from: S, reason: collision with root package name */
    public Sensor f19053S;

    /* renamed from: U, reason: collision with root package name */
    public boolean f19055U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f19056V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f19057W;

    /* renamed from: Z, reason: collision with root package name */
    public AppCompatTextView f19060Z;

    /* renamed from: a0, reason: collision with root package name */
    public TemperatureView f19061a0;
    public HumidityView2 b0;

    /* renamed from: c0, reason: collision with root package name */
    public TextInputLayout f19062c0;

    /* renamed from: d0, reason: collision with root package name */
    public TextInputLayout f19063d0;

    /* renamed from: e0, reason: collision with root package name */
    public TextInputLayout f19064e0;

    /* renamed from: f0, reason: collision with root package name */
    public TextInputEditText f19065f0;

    /* renamed from: g0, reason: collision with root package name */
    public TextInputLayout f19066g0;

    /* renamed from: h0, reason: collision with root package name */
    public TextInputEditText f19067h0;

    /* renamed from: i0, reason: collision with root package name */
    public TextInputEditText f19068i0;

    /* renamed from: j0, reason: collision with root package name */
    public SwitchMaterial f19069j0;

    /* renamed from: k0, reason: collision with root package name */
    public SwitchMaterial f19070k0;

    /* renamed from: l0, reason: collision with root package name */
    public SwitchMaterial f19071l0;

    /* renamed from: m0, reason: collision with root package name */
    public AppCompatTextView f19072m0;

    /* renamed from: n0, reason: collision with root package name */
    public final c f19073n0;

    /* renamed from: o0, reason: collision with root package name */
    public final ArrayList f19074o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f19075p0;

    /* renamed from: q0, reason: collision with root package name */
    public final ArrayList f19076q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f19077r0;

    /* renamed from: s0, reason: collision with root package name */
    public float f19078s0;

    /* renamed from: t0, reason: collision with root package name */
    public float f19079t0;

    /* renamed from: T, reason: collision with root package name */
    public boolean f19054T = true;

    /* renamed from: X, reason: collision with root package name */
    public boolean f19058X = true;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f19059Y = true;

    public DewPointActivity() {
        c cVar = new c();
        a aVar = new a();
        HashMap map = cVar.f2142l;
        int size = map.size() + 1;
        map.put(d.class, Integer.valueOf(size));
        cVar.f2143m.append(size, aVar);
        this.f19073n0 = cVar;
        this.f19074o0 = new ArrayList();
        this.f19076q0 = AbstractC2283k.K("hPa", "kPa", "Pa", "bar", "mbar", "atm", "mmHg", "inHg", "psi");
        this.f19078s0 = 100.0f;
        this.f19079t0 = 1013.25f;
    }

    public final void C() {
        String string;
        int i;
        String str;
        float f2;
        float f5;
        String str2;
        float fPow = (float) (Math.pow(10.0d, 8.07131d - (1730.63d / (this.f19077r0 + 233.426d))) * 133.322d);
        float f6 = (this.f19078s0 / 100) * fPow;
        float f7 = this.f19077r0;
        float f8 = (float) ((f6 * 18.016d) / ((f7 + 273.15f) * 8.314d));
        float f9 = (float) ((fPow * 18.016d) / ((f7 + 273.15f) * 8.314d));
        float f10 = -40.0f;
        float f11 = 100.0f;
        while (f11 - f10 > 0.001f) {
            float f12 = (f10 + f11) / 2;
            if (((float) (Math.pow(10.0d, 8.07131d - (1730.63d / (f12 + 233.426d))) * 133.322d)) > f6) {
                f11 = f12;
            } else {
                f10 = f12;
            }
        }
        float f13 = (f10 + f11) / 2;
        float f14 = this.f19078s0;
        if (f14 < 30.0f) {
            string = getString(R.string.humidity_dry);
            i.d(string, "getString(...)");
        } else if (f14 < 60.0f) {
            string = getString(R.string.humidity_suitable);
            i.d(string, "getString(...)");
        } else {
            string = getString(R.string.humidity_damp);
            i.d(string, "getString(...)");
        }
        float f15 = f6 / (this.f19079t0 * 1000.0f);
        ArrayList arrayList = this.f19074o0;
        if (!arrayList.isEmpty()) {
            d dVar = (d) arrayList.get(0);
            if (this.f19058X) {
                Float fValueOf = Float.valueOf(this.f19077r0);
                if (R2.a.f3390d) {
                    Locale locale = e.f1457a;
                    str = String.format(e.b(), "%.1f℃", Arrays.copyOf(new Object[]{fValueOf}, 1));
                } else {
                    str = String.format(Locale.ENGLISH, "%.1f℃", Arrays.copyOf(new Object[]{fValueOf}, 1));
                }
                i = 1;
            } else {
                Float fValueOf2 = Float.valueOf(((this.f19077r0 * 9) / 5) + 32.0f);
                if (R2.a.f3390d) {
                    Locale locale2 = e.f1457a;
                    i = 1;
                    str = String.format(e.b(), "%.1f℉", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                } else {
                    i = 1;
                    str = String.format(Locale.ENGLISH, "%.1f℉", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                }
            }
            dVar.b(str);
            ((d) arrayList.get(i)).b(R2.a.k(Float.valueOf(this.f19078s0), "%.1f%%"));
            ((d) arrayList.get(2)).b(R2.a.k(Float.valueOf(f8), "%.1fg/m³"));
            ((d) arrayList.get(3)).b(R2.a.k(Float.valueOf(f13), "%.1f℃"));
            ((d) arrayList.get(4)).b(R2.a.k(Float.valueOf(fPow), "%.1fPa"));
            ((d) arrayList.get(5)).b(R2.a.k(Float.valueOf(f6), "%.1fPa"));
            ((d) arrayList.get(6)).b(R2.a.k(Float.valueOf(f9), "%.1fg/m³"));
            ((d) arrayList.get(7)).b(string);
            ((d) arrayList.get(8)).b(R2.a.k(Float.valueOf(f15), "%.1f%%"));
            return;
        }
        String string2 = getString(R.string.temperature);
        if (this.f19058X) {
            Float fValueOf3 = Float.valueOf(this.f19077r0);
            if (R2.a.f3390d) {
                Locale locale3 = e.f1457a;
                f2 = f6;
                str2 = String.format(e.b(), "%.1f℃", Arrays.copyOf(new Object[]{fValueOf3}, 1));
            } else {
                f2 = f6;
                str2 = String.format(Locale.ENGLISH, "%.1f℃", Arrays.copyOf(new Object[]{fValueOf3}, 1));
            }
            f5 = f8;
        } else {
            f2 = f6;
            Float fValueOf4 = Float.valueOf(((this.f19077r0 * 9) / 5) + 32.0f);
            if (R2.a.f3390d) {
                Locale locale4 = e.f1457a;
                f5 = f8;
                str2 = String.format(e.b(), "%.1f℉", Arrays.copyOf(new Object[]{fValueOf4}, 1));
            } else {
                f5 = f8;
                str2 = String.format(Locale.ENGLISH, "%.1f℉", Arrays.copyOf(new Object[]{fValueOf4}, 1));
            }
        }
        arrayList.add(new d(string2, str2));
        arrayList.add(new d(getString(R.string.humidity), R2.a.k(Float.valueOf(this.f19078s0), "%.1f%%")));
        arrayList.add(new d(getString(R.string.string_absolute_humidity), R2.a.k(Float.valueOf(f5), "%.1fg/m³")));
        arrayList.add(new d(getString(R.string.dew_point), R2.a.k(Float.valueOf(f13), "%.1f℃")));
        arrayList.add(new d(getString(R.string.vapor_pressure), R2.a.k(Float.valueOf(fPow), "%.1fPa")));
        arrayList.add(new d(getString(R.string.vapor_partial_pressure), R2.a.k(Float.valueOf(f2), "%.1fPa")));
        arrayList.add(new d(getString(R.string.saturated_steam_content), R2.a.k(Float.valueOf(f9), "%.1fg/m³")));
        arrayList.add(new d(getString(R.string.humidity_level), string));
        arrayList.add(new d(getString(R.string.steam_ratio), R2.a.k(Float.valueOf(f15), "%.1f%%")));
        this.f19073n0.o(arrayList);
    }

    public final float D() {
        return (float) ((((this.f19078s0 / 100) * ((float) (Math.pow(10.0d, 8.07131d - (1730.63d / (this.f19077r0 + 233.426d))) * 133.322d))) * 18.016d) / ((this.f19077r0 + 273.15f) * 8.314d));
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String strF;
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_dew_point, (ViewGroup) null, false);
        int i = R.id.ad_view;
        if (((BannerView) p.e(R.id.ad_view, viewInflate)) != null) {
            i = R.id.app_bar;
            AppBarLayout appBarLayout = (AppBarLayout) p.e(R.id.app_bar, viewInflate);
            if (appBarLayout != null) {
                i = R.id.auto_get_switch;
                SwitchMaterial switchMaterial = (SwitchMaterial) p.e(R.id.auto_get_switch, viewInflate);
                if (switchMaterial != null) {
                    i = R.id.bottom_layout;
                    RelativeLayout relativeLayout = (RelativeLayout) p.e(R.id.bottom_layout, viewInflate);
                    if (relativeLayout != null) {
                        i = R.id.cal_recycler;
                        RecyclerView recyclerView = (RecyclerView) p.e(R.id.cal_recycler, viewInflate);
                        if (recyclerView != null) {
                            i = R.id.dew_point_card;
                            if (((MaterialCardView) p.e(R.id.dew_point_card, viewInflate)) != null) {
                                i = R.id.humidity_card;
                                if (((MaterialCardView) p.e(R.id.humidity_card, viewInflate)) != null) {
                                    i = R.id.humidity_edit;
                                    TextInputEditText textInputEditText = (TextInputEditText) p.e(R.id.humidity_edit, viewInflate);
                                    if (textInputEditText != null) {
                                        i = R.id.humidity_input_layout;
                                        TextInputLayout textInputLayout = (TextInputLayout) p.e(R.id.humidity_input_layout, viewInflate);
                                        if (textInputLayout != null) {
                                            i = R.id.humidity_title;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) p.e(R.id.humidity_title, viewInflate);
                                            if (appCompatTextView != null) {
                                                i = R.id.humidity_unit_switch;
                                                SwitchMaterial switchMaterial2 = (SwitchMaterial) p.e(R.id.humidity_unit_switch, viewInflate);
                                                if (switchMaterial2 != null) {
                                                    i = R.id.humidity_view;
                                                    HumidityView2 humidityView2 = (HumidityView2) p.e(R.id.humidity_view, viewInflate);
                                                    if (humidityView2 != null) {
                                                        i = R.id.input_type;
                                                        if (((AppCompatTextView) p.e(R.id.input_type, viewInflate)) != null) {
                                                            i = R.id.not_support_card;
                                                            MaterialCardView materialCardView = (MaterialCardView) p.e(R.id.not_support_card, viewInflate);
                                                            if (materialCardView != null) {
                                                                i = R.id.not_support_text;
                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) p.e(R.id.not_support_text, viewInflate);
                                                                if (appCompatTextView2 != null) {
                                                                    i = R.id.pressure_edit;
                                                                    TextInputEditText textInputEditText2 = (TextInputEditText) p.e(R.id.pressure_edit, viewInflate);
                                                                    if (textInputEditText2 != null) {
                                                                        i = R.id.pressure_input_layout;
                                                                        TextInputLayout textInputLayout2 = (TextInputLayout) p.e(R.id.pressure_input_layout, viewInflate);
                                                                        if (textInputLayout2 != null) {
                                                                            i = R.id.pressure_title;
                                                                            if (((AppCompatTextView) p.e(R.id.pressure_title, viewInflate)) != null) {
                                                                                i = R.id.pressure_unit;
                                                                                AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) p.e(R.id.pressure_unit, viewInflate);
                                                                                if (appCompatAutoCompleteTextView != null) {
                                                                                    i = R.id.pressure_unit_layout;
                                                                                    TextInputLayout textInputLayout3 = (TextInputLayout) p.e(R.id.pressure_unit_layout, viewInflate);
                                                                                    if (textInputLayout3 != null) {
                                                                                        i = R.id.temperature_card;
                                                                                        if (((MaterialCardView) p.e(R.id.temperature_card, viewInflate)) != null) {
                                                                                            i = R.id.temperature_edit;
                                                                                            TextInputEditText textInputEditText3 = (TextInputEditText) p.e(R.id.temperature_edit, viewInflate);
                                                                                            if (textInputEditText3 != null) {
                                                                                                i = R.id.temperature_input_layout;
                                                                                                TextInputLayout textInputLayout4 = (TextInputLayout) p.e(R.id.temperature_input_layout, viewInflate);
                                                                                                if (textInputLayout4 != null) {
                                                                                                    i = R.id.temperature_unit_switch;
                                                                                                    SwitchMaterial switchMaterial3 = (SwitchMaterial) p.e(R.id.temperature_unit_switch, viewInflate);
                                                                                                    if (switchMaterial3 != null) {
                                                                                                        i = R.id.temperature_view;
                                                                                                        TemperatureView temperatureView = (TemperatureView) p.e(R.id.temperature_view, viewInflate);
                                                                                                        if (temperatureView != null) {
                                                                                                            i = R.id.toolbar;
                                                                                                            Toolbar toolbar = (Toolbar) p.e(R.id.toolbar, viewInflate);
                                                                                                            if (toolbar != null) {
                                                                                                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                                                                                                                this.f19049O = new b(linearLayoutCompat, appBarLayout, switchMaterial, relativeLayout, recyclerView, textInputEditText, textInputLayout, appCompatTextView, switchMaterial2, humidityView2, materialCardView, appCompatTextView2, textInputEditText2, textInputLayout2, appCompatAutoCompleteTextView, textInputLayout3, textInputEditText3, textInputLayout4, switchMaterial3, temperatureView, toolbar);
                                                                                                                setContentView(linearLayoutCompat);
                                                                                                                b bVar = this.f19049O;
                                                                                                                if (bVar == null) {
                                                                                                                    i.g("binding");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                AppBarLayout appBarLayout2 = (AppBarLayout) bVar.f2199e;
                                                                                                                if (bVar == null) {
                                                                                                                    i.g("binding");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                F4.d.a(appBarLayout2, (RelativeLayout) bVar.i);
                                                                                                                b bVar2 = this.f19049O;
                                                                                                                if (bVar2 == null) {
                                                                                                                    i.g("binding");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                Toolbar toolbar2 = (Toolbar) bVar2.f2194J;
                                                                                                                B(toolbar2);
                                                                                                                com.bumptech.glide.d dVarR = r();
                                                                                                                if (dVarR != null) {
                                                                                                                    dVarR.S(true);
                                                                                                                }
                                                                                                                toolbar2.setNavigationOnClickListener(new g(16, this));
                                                                                                                this.f19050P = (SensorManager) getSystemService("sensor");
                                                                                                                b bVar3 = this.f19049O;
                                                                                                                if (bVar3 == null) {
                                                                                                                    i.g("binding");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                this.f19066g0 = (TextInputLayout) bVar3.f2187C;
                                                                                                                this.f19060Z = (AppCompatTextView) bVar3.f2189E;
                                                                                                                this.f19061a0 = (TemperatureView) bVar3.f2193I;
                                                                                                                this.b0 = (HumidityView2) bVar3.f2191G;
                                                                                                                this.f19062c0 = (TextInputLayout) bVar3.f2188D;
                                                                                                                this.f19063d0 = (TextInputLayout) bVar3.f2206m;
                                                                                                                this.f19064e0 = (TextInputLayout) bVar3.f2207n;
                                                                                                                this.f19065f0 = (TextInputEditText) bVar3.f2204k;
                                                                                                                this.f19067h0 = (TextInputEditText) bVar3.f2205l;
                                                                                                                this.f19068i0 = (TextInputEditText) bVar3.f2203j;
                                                                                                                this.f19069j0 = (SwitchMaterial) bVar3.f2202h;
                                                                                                                this.f19070k0 = (SwitchMaterial) bVar3.f2201g;
                                                                                                                this.f19071l0 = (SwitchMaterial) bVar3.f2200f;
                                                                                                                this.f19072m0 = (AppCompatTextView) bVar3.f2190F;
                                                                                                                RecyclerView recyclerView2 = bVar3.f2196b;
                                                                                                                c cVar = this.f19073n0;
                                                                                                                recyclerView2.setAdapter(cVar);
                                                                                                                ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, this.f19076q0);
                                                                                                                b bVar4 = this.f19049O;
                                                                                                                if (bVar4 == null) {
                                                                                                                    i.g("binding");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                ((AppCompatAutoCompleteTextView) bVar4.f2192H).setAdapter(arrayAdapter);
                                                                                                                b bVar5 = this.f19049O;
                                                                                                                if (bVar5 == null) {
                                                                                                                    i.g("binding");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                ((AppCompatAutoCompleteTextView) bVar5.f2192H).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: T4.b
                                                                                                                    @Override // android.widget.AdapterView.OnItemClickListener
                                                                                                                    public final void onItemClick(AdapterView adapterView, View view, int i3, long j6) {
                                                                                                                        DewPointActivity dewPointActivity = this.f3591a;
                                                                                                                        dewPointActivity.f19075p0 = i3;
                                                                                                                        switch (i3) {
                                                                                                                            case 0:
                                                                                                                                TextInputEditText textInputEditText4 = dewPointActivity.f19065f0;
                                                                                                                                if (textInputEditText4 != null) {
                                                                                                                                    textInputEditText4.setText(String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(dewPointActivity.f19079t0)}, 1)));
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    q5.i.g("pressureInput");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            case 1:
                                                                                                                                TextInputEditText textInputEditText5 = dewPointActivity.f19065f0;
                                                                                                                                if (textInputEditText5 != null) {
                                                                                                                                    textInputEditText5.setText(String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(dewPointActivity.f19079t0 / 1000.0f)}, 1)));
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    q5.i.g("pressureInput");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            case 2:
                                                                                                                                TextInputEditText textInputEditText6 = dewPointActivity.f19065f0;
                                                                                                                                if (textInputEditText6 != null) {
                                                                                                                                    textInputEditText6.setText(String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(dewPointActivity.f19079t0 / 0.01f)}, 1)));
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    q5.i.g("pressureInput");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            case 3:
                                                                                                                                TextInputEditText textInputEditText7 = dewPointActivity.f19065f0;
                                                                                                                                if (textInputEditText7 != null) {
                                                                                                                                    textInputEditText7.setText(String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(dewPointActivity.f19079t0 / 100.0f)}, 1)));
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    q5.i.g("pressureInput");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            case 4:
                                                                                                                                TextInputEditText textInputEditText8 = dewPointActivity.f19065f0;
                                                                                                                                if (textInputEditText8 != null) {
                                                                                                                                    textInputEditText8.setText(String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(dewPointActivity.f19079t0 / 10.0f)}, 1)));
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    q5.i.g("pressureInput");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            case 5:
                                                                                                                                TextInputEditText textInputEditText9 = dewPointActivity.f19065f0;
                                                                                                                                if (textInputEditText9 != null) {
                                                                                                                                    textInputEditText9.setText(String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(dewPointActivity.f19079t0 / 1013.25f)}, 1)));
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    q5.i.g("pressureInput");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            case 6:
                                                                                                                                TextInputEditText textInputEditText10 = dewPointActivity.f19065f0;
                                                                                                                                if (textInputEditText10 != null) {
                                                                                                                                    textInputEditText10.setText(String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(dewPointActivity.f19079t0 / 760.0f)}, 1)));
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    q5.i.g("pressureInput");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            case 7:
                                                                                                                                TextInputEditText textInputEditText11 = dewPointActivity.f19065f0;
                                                                                                                                if (textInputEditText11 != null) {
                                                                                                                                    textInputEditText11.setText(String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(dewPointActivity.f19079t0 / 3386.39f)}, 1)));
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    q5.i.g("pressureInput");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            case 8:
                                                                                                                                TextInputEditText textInputEditText12 = dewPointActivity.f19065f0;
                                                                                                                                if (textInputEditText12 != null) {
                                                                                                                                    textInputEditText12.setText(String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(dewPointActivity.f19079t0 / 6894.76f)}, 1)));
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    q5.i.g("pressureInput");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            default:
                                                                                                                                return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                cVar.f4672f = new F4.c(10, this);
                                                                                                                SensorManager sensorManager = this.f19050P;
                                                                                                                this.f19051Q = sensorManager != null ? sensorManager.getDefaultSensor(13) : null;
                                                                                                                SensorManager sensorManager2 = this.f19050P;
                                                                                                                this.f19052R = sensorManager2 != null ? sensorManager2.getDefaultSensor(12) : null;
                                                                                                                SensorManager sensorManager3 = this.f19050P;
                                                                                                                this.f19053S = sensorManager3 != null ? sensorManager3.getDefaultSensor(6) : null;
                                                                                                                SwitchMaterial switchMaterial4 = this.f19069j0;
                                                                                                                if (switchMaterial4 == null) {
                                                                                                                    i.g("temperatureUnitSwitch");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                final int i3 = 0;
                                                                                                                switchMaterial4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: T4.a

                                                                                                                    /* renamed from: b, reason: collision with root package name */
                                                                                                                    public final /* synthetic */ DewPointActivity f3590b;

                                                                                                                    {
                                                                                                                        this.f3590b = this;
                                                                                                                    }

                                                                                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                                                                                                                        String str;
                                                                                                                        String str2;
                                                                                                                        String str3;
                                                                                                                        String str4;
                                                                                                                        int i6 = i3;
                                                                                                                        DewPointActivity dewPointActivity = this.f3590b;
                                                                                                                        switch (i6) {
                                                                                                                            case 0:
                                                                                                                                dewPointActivity.f19058X = !z6;
                                                                                                                                if (z6) {
                                                                                                                                    TextInputLayout textInputLayout5 = dewPointActivity.f19062c0;
                                                                                                                                    if (textInputLayout5 == null) {
                                                                                                                                        q5.i.g("temperatureInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout5.setSuffixText("℉");
                                                                                                                                    TextInputEditText textInputEditText4 = dewPointActivity.f19067h0;
                                                                                                                                    if (textInputEditText4 == null) {
                                                                                                                                        q5.i.g("temperatureInput");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    Float fValueOf = Float.valueOf(((dewPointActivity.f19077r0 * 9) / 5) + 32.0f);
                                                                                                                                    if (R2.a.f3390d) {
                                                                                                                                        Locale locale = F4.e.f1457a;
                                                                                                                                        str = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                                                                                                                                    } else {
                                                                                                                                        str = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                                                                                                                                    }
                                                                                                                                    textInputEditText4.setText(str);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                TextInputLayout textInputLayout6 = dewPointActivity.f19062c0;
                                                                                                                                if (textInputLayout6 == null) {
                                                                                                                                    q5.i.g("temperatureInputLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout6.setSuffixText("℃");
                                                                                                                                TextInputEditText textInputEditText5 = dewPointActivity.f19067h0;
                                                                                                                                if (textInputEditText5 == null) {
                                                                                                                                    q5.i.g("temperatureInput");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                Float fValueOf2 = Float.valueOf(dewPointActivity.f19077r0);
                                                                                                                                if (R2.a.f3390d) {
                                                                                                                                    Locale locale2 = F4.e.f1457a;
                                                                                                                                    str2 = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                                                                                                                                } else {
                                                                                                                                    str2 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                                                                                                                                }
                                                                                                                                textInputEditText5.setText(str2);
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                                boolean z7 = !z6;
                                                                                                                                dewPointActivity.f19059Y = z7;
                                                                                                                                HumidityView2 humidityView22 = dewPointActivity.b0;
                                                                                                                                if (humidityView22 == null) {
                                                                                                                                    q5.i.g("humidityView2");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                humidityView22.setUnitPercent(z7);
                                                                                                                                if (dewPointActivity.f19059Y) {
                                                                                                                                    AppCompatTextView appCompatTextView3 = dewPointActivity.f19060Z;
                                                                                                                                    if (appCompatTextView3 == null) {
                                                                                                                                        q5.i.g("humidityTitle");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    appCompatTextView3.setText(dewPointActivity.getString(R.string.humidity));
                                                                                                                                    TextInputLayout textInputLayout7 = dewPointActivity.f19063d0;
                                                                                                                                    if (textInputLayout7 == null) {
                                                                                                                                        q5.i.g("humidityInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout7.setSuffixText("%");
                                                                                                                                    TextInputEditText textInputEditText6 = dewPointActivity.f19068i0;
                                                                                                                                    if (textInputEditText6 == null) {
                                                                                                                                        q5.i.g("humidityInput");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    Float fValueOf3 = Float.valueOf(dewPointActivity.f19078s0);
                                                                                                                                    if (R2.a.f3390d) {
                                                                                                                                        Locale locale3 = F4.e.f1457a;
                                                                                                                                        str4 = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                                                                                                                                    } else {
                                                                                                                                        str4 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                                                                                                                                    }
                                                                                                                                    textInputEditText6.setText(str4);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                AppCompatTextView appCompatTextView4 = dewPointActivity.f19060Z;
                                                                                                                                if (appCompatTextView4 == null) {
                                                                                                                                    q5.i.g("humidityTitle");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                appCompatTextView4.setText(dewPointActivity.getString(R.string.string_absolute_humidity));
                                                                                                                                TextInputLayout textInputLayout8 = dewPointActivity.f19063d0;
                                                                                                                                if (textInputLayout8 == null) {
                                                                                                                                    q5.i.g("humidityInputLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout8.setSuffixText("g/m³");
                                                                                                                                float fD = dewPointActivity.D();
                                                                                                                                TextInputEditText textInputEditText7 = dewPointActivity.f19068i0;
                                                                                                                                if (textInputEditText7 == null) {
                                                                                                                                    q5.i.g("humidityInput");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                Float fValueOf4 = Float.valueOf(fD);
                                                                                                                                if (R2.a.f3390d) {
                                                                                                                                    Locale locale4 = F4.e.f1457a;
                                                                                                                                    str3 = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf4}, 1));
                                                                                                                                } else {
                                                                                                                                    str3 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf4}, 1));
                                                                                                                                }
                                                                                                                                textInputEditText7.setText(str3);
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                dewPointActivity.f19054T = z6;
                                                                                                                                if (!z6) {
                                                                                                                                    TextInputLayout textInputLayout9 = dewPointActivity.f19062c0;
                                                                                                                                    if (textInputLayout9 == null) {
                                                                                                                                        q5.i.g("temperatureInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout9.setEnabled(true);
                                                                                                                                    TextInputLayout textInputLayout10 = dewPointActivity.f19063d0;
                                                                                                                                    if (textInputLayout10 == null) {
                                                                                                                                        q5.i.g("humidityInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout10.setEnabled(true);
                                                                                                                                    TextInputLayout textInputLayout11 = dewPointActivity.f19064e0;
                                                                                                                                    if (textInputLayout11 == null) {
                                                                                                                                        q5.i.g("pressureInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout11.setEnabled(true);
                                                                                                                                    TextInputLayout textInputLayout12 = dewPointActivity.f19066g0;
                                                                                                                                    if (textInputLayout12 != null) {
                                                                                                                                        textInputLayout12.setEnabled(true);
                                                                                                                                        return;
                                                                                                                                    } else {
                                                                                                                                        q5.i.g("pressureUnitLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                dewPointActivity.f19054T = true;
                                                                                                                                TextInputLayout textInputLayout13 = dewPointActivity.f19062c0;
                                                                                                                                if (textInputLayout13 == null) {
                                                                                                                                    q5.i.g("temperatureInputLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout13.setEnabled(false);
                                                                                                                                TextInputLayout textInputLayout14 = dewPointActivity.f19063d0;
                                                                                                                                if (textInputLayout14 == null) {
                                                                                                                                    q5.i.g("humidityInputLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout14.setEnabled(false);
                                                                                                                                TextInputLayout textInputLayout15 = dewPointActivity.f19064e0;
                                                                                                                                if (textInputLayout15 == null) {
                                                                                                                                    q5.i.g("pressureInputLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout15.setEnabled(false);
                                                                                                                                TextInputLayout textInputLayout16 = dewPointActivity.f19066g0;
                                                                                                                                if (textInputLayout16 == null) {
                                                                                                                                    q5.i.g("pressureUnitLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout16.setEnabled(false);
                                                                                                                                if (!dewPointActivity.f19055U) {
                                                                                                                                    TextInputLayout textInputLayout17 = dewPointActivity.f19062c0;
                                                                                                                                    if (textInputLayout17 == null) {
                                                                                                                                        q5.i.g("temperatureInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout17.setEnabled(true);
                                                                                                                                }
                                                                                                                                if (!dewPointActivity.f19056V) {
                                                                                                                                    TextInputLayout textInputLayout18 = dewPointActivity.f19063d0;
                                                                                                                                    if (textInputLayout18 == null) {
                                                                                                                                        q5.i.g("humidityInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout18.setEnabled(true);
                                                                                                                                }
                                                                                                                                if (!dewPointActivity.f19057W) {
                                                                                                                                    TextInputLayout textInputLayout19 = dewPointActivity.f19064e0;
                                                                                                                                    if (textInputLayout19 == null) {
                                                                                                                                        q5.i.g("pressureInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout19.setEnabled(true);
                                                                                                                                    TextInputLayout textInputLayout20 = dewPointActivity.f19066g0;
                                                                                                                                    if (textInputLayout20 == null) {
                                                                                                                                        q5.i.g("pressureUnitLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout20.setEnabled(true);
                                                                                                                                }
                                                                                                                                if (dewPointActivity.f19056V || dewPointActivity.f19055U || dewPointActivity.f19057W) {
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                SwitchMaterial switchMaterial5 = dewPointActivity.f19071l0;
                                                                                                                                if (switchMaterial5 != null) {
                                                                                                                                    switchMaterial5.setChecked(false);
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    q5.i.g("autoGetSwitch");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                SwitchMaterial switchMaterial5 = this.f19070k0;
                                                                                                                if (switchMaterial5 == null) {
                                                                                                                    i.g("humidityUnitSwitch");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                final int i6 = 1;
                                                                                                                switchMaterial5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: T4.a

                                                                                                                    /* renamed from: b, reason: collision with root package name */
                                                                                                                    public final /* synthetic */ DewPointActivity f3590b;

                                                                                                                    {
                                                                                                                        this.f3590b = this;
                                                                                                                    }

                                                                                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                                                                                                                        String str;
                                                                                                                        String str2;
                                                                                                                        String str3;
                                                                                                                        String str4;
                                                                                                                        int i62 = i6;
                                                                                                                        DewPointActivity dewPointActivity = this.f3590b;
                                                                                                                        switch (i62) {
                                                                                                                            case 0:
                                                                                                                                dewPointActivity.f19058X = !z6;
                                                                                                                                if (z6) {
                                                                                                                                    TextInputLayout textInputLayout5 = dewPointActivity.f19062c0;
                                                                                                                                    if (textInputLayout5 == null) {
                                                                                                                                        q5.i.g("temperatureInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout5.setSuffixText("℉");
                                                                                                                                    TextInputEditText textInputEditText4 = dewPointActivity.f19067h0;
                                                                                                                                    if (textInputEditText4 == null) {
                                                                                                                                        q5.i.g("temperatureInput");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    Float fValueOf = Float.valueOf(((dewPointActivity.f19077r0 * 9) / 5) + 32.0f);
                                                                                                                                    if (R2.a.f3390d) {
                                                                                                                                        Locale locale = F4.e.f1457a;
                                                                                                                                        str = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                                                                                                                                    } else {
                                                                                                                                        str = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                                                                                                                                    }
                                                                                                                                    textInputEditText4.setText(str);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                TextInputLayout textInputLayout6 = dewPointActivity.f19062c0;
                                                                                                                                if (textInputLayout6 == null) {
                                                                                                                                    q5.i.g("temperatureInputLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout6.setSuffixText("℃");
                                                                                                                                TextInputEditText textInputEditText5 = dewPointActivity.f19067h0;
                                                                                                                                if (textInputEditText5 == null) {
                                                                                                                                    q5.i.g("temperatureInput");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                Float fValueOf2 = Float.valueOf(dewPointActivity.f19077r0);
                                                                                                                                if (R2.a.f3390d) {
                                                                                                                                    Locale locale2 = F4.e.f1457a;
                                                                                                                                    str2 = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                                                                                                                                } else {
                                                                                                                                    str2 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                                                                                                                                }
                                                                                                                                textInputEditText5.setText(str2);
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                                boolean z7 = !z6;
                                                                                                                                dewPointActivity.f19059Y = z7;
                                                                                                                                HumidityView2 humidityView22 = dewPointActivity.b0;
                                                                                                                                if (humidityView22 == null) {
                                                                                                                                    q5.i.g("humidityView2");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                humidityView22.setUnitPercent(z7);
                                                                                                                                if (dewPointActivity.f19059Y) {
                                                                                                                                    AppCompatTextView appCompatTextView3 = dewPointActivity.f19060Z;
                                                                                                                                    if (appCompatTextView3 == null) {
                                                                                                                                        q5.i.g("humidityTitle");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    appCompatTextView3.setText(dewPointActivity.getString(R.string.humidity));
                                                                                                                                    TextInputLayout textInputLayout7 = dewPointActivity.f19063d0;
                                                                                                                                    if (textInputLayout7 == null) {
                                                                                                                                        q5.i.g("humidityInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout7.setSuffixText("%");
                                                                                                                                    TextInputEditText textInputEditText6 = dewPointActivity.f19068i0;
                                                                                                                                    if (textInputEditText6 == null) {
                                                                                                                                        q5.i.g("humidityInput");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    Float fValueOf3 = Float.valueOf(dewPointActivity.f19078s0);
                                                                                                                                    if (R2.a.f3390d) {
                                                                                                                                        Locale locale3 = F4.e.f1457a;
                                                                                                                                        str4 = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                                                                                                                                    } else {
                                                                                                                                        str4 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                                                                                                                                    }
                                                                                                                                    textInputEditText6.setText(str4);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                AppCompatTextView appCompatTextView4 = dewPointActivity.f19060Z;
                                                                                                                                if (appCompatTextView4 == null) {
                                                                                                                                    q5.i.g("humidityTitle");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                appCompatTextView4.setText(dewPointActivity.getString(R.string.string_absolute_humidity));
                                                                                                                                TextInputLayout textInputLayout8 = dewPointActivity.f19063d0;
                                                                                                                                if (textInputLayout8 == null) {
                                                                                                                                    q5.i.g("humidityInputLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout8.setSuffixText("g/m³");
                                                                                                                                float fD = dewPointActivity.D();
                                                                                                                                TextInputEditText textInputEditText7 = dewPointActivity.f19068i0;
                                                                                                                                if (textInputEditText7 == null) {
                                                                                                                                    q5.i.g("humidityInput");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                Float fValueOf4 = Float.valueOf(fD);
                                                                                                                                if (R2.a.f3390d) {
                                                                                                                                    Locale locale4 = F4.e.f1457a;
                                                                                                                                    str3 = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf4}, 1));
                                                                                                                                } else {
                                                                                                                                    str3 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf4}, 1));
                                                                                                                                }
                                                                                                                                textInputEditText7.setText(str3);
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                dewPointActivity.f19054T = z6;
                                                                                                                                if (!z6) {
                                                                                                                                    TextInputLayout textInputLayout9 = dewPointActivity.f19062c0;
                                                                                                                                    if (textInputLayout9 == null) {
                                                                                                                                        q5.i.g("temperatureInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout9.setEnabled(true);
                                                                                                                                    TextInputLayout textInputLayout10 = dewPointActivity.f19063d0;
                                                                                                                                    if (textInputLayout10 == null) {
                                                                                                                                        q5.i.g("humidityInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout10.setEnabled(true);
                                                                                                                                    TextInputLayout textInputLayout11 = dewPointActivity.f19064e0;
                                                                                                                                    if (textInputLayout11 == null) {
                                                                                                                                        q5.i.g("pressureInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout11.setEnabled(true);
                                                                                                                                    TextInputLayout textInputLayout12 = dewPointActivity.f19066g0;
                                                                                                                                    if (textInputLayout12 != null) {
                                                                                                                                        textInputLayout12.setEnabled(true);
                                                                                                                                        return;
                                                                                                                                    } else {
                                                                                                                                        q5.i.g("pressureUnitLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                dewPointActivity.f19054T = true;
                                                                                                                                TextInputLayout textInputLayout13 = dewPointActivity.f19062c0;
                                                                                                                                if (textInputLayout13 == null) {
                                                                                                                                    q5.i.g("temperatureInputLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout13.setEnabled(false);
                                                                                                                                TextInputLayout textInputLayout14 = dewPointActivity.f19063d0;
                                                                                                                                if (textInputLayout14 == null) {
                                                                                                                                    q5.i.g("humidityInputLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout14.setEnabled(false);
                                                                                                                                TextInputLayout textInputLayout15 = dewPointActivity.f19064e0;
                                                                                                                                if (textInputLayout15 == null) {
                                                                                                                                    q5.i.g("pressureInputLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout15.setEnabled(false);
                                                                                                                                TextInputLayout textInputLayout16 = dewPointActivity.f19066g0;
                                                                                                                                if (textInputLayout16 == null) {
                                                                                                                                    q5.i.g("pressureUnitLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout16.setEnabled(false);
                                                                                                                                if (!dewPointActivity.f19055U) {
                                                                                                                                    TextInputLayout textInputLayout17 = dewPointActivity.f19062c0;
                                                                                                                                    if (textInputLayout17 == null) {
                                                                                                                                        q5.i.g("temperatureInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout17.setEnabled(true);
                                                                                                                                }
                                                                                                                                if (!dewPointActivity.f19056V) {
                                                                                                                                    TextInputLayout textInputLayout18 = dewPointActivity.f19063d0;
                                                                                                                                    if (textInputLayout18 == null) {
                                                                                                                                        q5.i.g("humidityInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout18.setEnabled(true);
                                                                                                                                }
                                                                                                                                if (!dewPointActivity.f19057W) {
                                                                                                                                    TextInputLayout textInputLayout19 = dewPointActivity.f19064e0;
                                                                                                                                    if (textInputLayout19 == null) {
                                                                                                                                        q5.i.g("pressureInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout19.setEnabled(true);
                                                                                                                                    TextInputLayout textInputLayout20 = dewPointActivity.f19066g0;
                                                                                                                                    if (textInputLayout20 == null) {
                                                                                                                                        q5.i.g("pressureUnitLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout20.setEnabled(true);
                                                                                                                                }
                                                                                                                                if (dewPointActivity.f19056V || dewPointActivity.f19055U || dewPointActivity.f19057W) {
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                SwitchMaterial switchMaterial52 = dewPointActivity.f19071l0;
                                                                                                                                if (switchMaterial52 != null) {
                                                                                                                                    switchMaterial52.setChecked(false);
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    q5.i.g("autoGetSwitch");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                SwitchMaterial switchMaterial6 = this.f19071l0;
                                                                                                                if (switchMaterial6 == null) {
                                                                                                                    i.g("autoGetSwitch");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                final int i7 = 2;
                                                                                                                switchMaterial6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: T4.a

                                                                                                                    /* renamed from: b, reason: collision with root package name */
                                                                                                                    public final /* synthetic */ DewPointActivity f3590b;

                                                                                                                    {
                                                                                                                        this.f3590b = this;
                                                                                                                    }

                                                                                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                                                                                                                        String str;
                                                                                                                        String str2;
                                                                                                                        String str3;
                                                                                                                        String str4;
                                                                                                                        int i62 = i7;
                                                                                                                        DewPointActivity dewPointActivity = this.f3590b;
                                                                                                                        switch (i62) {
                                                                                                                            case 0:
                                                                                                                                dewPointActivity.f19058X = !z6;
                                                                                                                                if (z6) {
                                                                                                                                    TextInputLayout textInputLayout5 = dewPointActivity.f19062c0;
                                                                                                                                    if (textInputLayout5 == null) {
                                                                                                                                        q5.i.g("temperatureInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout5.setSuffixText("℉");
                                                                                                                                    TextInputEditText textInputEditText4 = dewPointActivity.f19067h0;
                                                                                                                                    if (textInputEditText4 == null) {
                                                                                                                                        q5.i.g("temperatureInput");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    Float fValueOf = Float.valueOf(((dewPointActivity.f19077r0 * 9) / 5) + 32.0f);
                                                                                                                                    if (R2.a.f3390d) {
                                                                                                                                        Locale locale = F4.e.f1457a;
                                                                                                                                        str = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                                                                                                                                    } else {
                                                                                                                                        str = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                                                                                                                                    }
                                                                                                                                    textInputEditText4.setText(str);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                TextInputLayout textInputLayout6 = dewPointActivity.f19062c0;
                                                                                                                                if (textInputLayout6 == null) {
                                                                                                                                    q5.i.g("temperatureInputLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout6.setSuffixText("℃");
                                                                                                                                TextInputEditText textInputEditText5 = dewPointActivity.f19067h0;
                                                                                                                                if (textInputEditText5 == null) {
                                                                                                                                    q5.i.g("temperatureInput");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                Float fValueOf2 = Float.valueOf(dewPointActivity.f19077r0);
                                                                                                                                if (R2.a.f3390d) {
                                                                                                                                    Locale locale2 = F4.e.f1457a;
                                                                                                                                    str2 = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                                                                                                                                } else {
                                                                                                                                    str2 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                                                                                                                                }
                                                                                                                                textInputEditText5.setText(str2);
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                                boolean z7 = !z6;
                                                                                                                                dewPointActivity.f19059Y = z7;
                                                                                                                                HumidityView2 humidityView22 = dewPointActivity.b0;
                                                                                                                                if (humidityView22 == null) {
                                                                                                                                    q5.i.g("humidityView2");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                humidityView22.setUnitPercent(z7);
                                                                                                                                if (dewPointActivity.f19059Y) {
                                                                                                                                    AppCompatTextView appCompatTextView3 = dewPointActivity.f19060Z;
                                                                                                                                    if (appCompatTextView3 == null) {
                                                                                                                                        q5.i.g("humidityTitle");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    appCompatTextView3.setText(dewPointActivity.getString(R.string.humidity));
                                                                                                                                    TextInputLayout textInputLayout7 = dewPointActivity.f19063d0;
                                                                                                                                    if (textInputLayout7 == null) {
                                                                                                                                        q5.i.g("humidityInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout7.setSuffixText("%");
                                                                                                                                    TextInputEditText textInputEditText6 = dewPointActivity.f19068i0;
                                                                                                                                    if (textInputEditText6 == null) {
                                                                                                                                        q5.i.g("humidityInput");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    Float fValueOf3 = Float.valueOf(dewPointActivity.f19078s0);
                                                                                                                                    if (R2.a.f3390d) {
                                                                                                                                        Locale locale3 = F4.e.f1457a;
                                                                                                                                        str4 = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                                                                                                                                    } else {
                                                                                                                                        str4 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                                                                                                                                    }
                                                                                                                                    textInputEditText6.setText(str4);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                AppCompatTextView appCompatTextView4 = dewPointActivity.f19060Z;
                                                                                                                                if (appCompatTextView4 == null) {
                                                                                                                                    q5.i.g("humidityTitle");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                appCompatTextView4.setText(dewPointActivity.getString(R.string.string_absolute_humidity));
                                                                                                                                TextInputLayout textInputLayout8 = dewPointActivity.f19063d0;
                                                                                                                                if (textInputLayout8 == null) {
                                                                                                                                    q5.i.g("humidityInputLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout8.setSuffixText("g/m³");
                                                                                                                                float fD = dewPointActivity.D();
                                                                                                                                TextInputEditText textInputEditText7 = dewPointActivity.f19068i0;
                                                                                                                                if (textInputEditText7 == null) {
                                                                                                                                    q5.i.g("humidityInput");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                Float fValueOf4 = Float.valueOf(fD);
                                                                                                                                if (R2.a.f3390d) {
                                                                                                                                    Locale locale4 = F4.e.f1457a;
                                                                                                                                    str3 = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf4}, 1));
                                                                                                                                } else {
                                                                                                                                    str3 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf4}, 1));
                                                                                                                                }
                                                                                                                                textInputEditText7.setText(str3);
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                dewPointActivity.f19054T = z6;
                                                                                                                                if (!z6) {
                                                                                                                                    TextInputLayout textInputLayout9 = dewPointActivity.f19062c0;
                                                                                                                                    if (textInputLayout9 == null) {
                                                                                                                                        q5.i.g("temperatureInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout9.setEnabled(true);
                                                                                                                                    TextInputLayout textInputLayout10 = dewPointActivity.f19063d0;
                                                                                                                                    if (textInputLayout10 == null) {
                                                                                                                                        q5.i.g("humidityInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout10.setEnabled(true);
                                                                                                                                    TextInputLayout textInputLayout11 = dewPointActivity.f19064e0;
                                                                                                                                    if (textInputLayout11 == null) {
                                                                                                                                        q5.i.g("pressureInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout11.setEnabled(true);
                                                                                                                                    TextInputLayout textInputLayout12 = dewPointActivity.f19066g0;
                                                                                                                                    if (textInputLayout12 != null) {
                                                                                                                                        textInputLayout12.setEnabled(true);
                                                                                                                                        return;
                                                                                                                                    } else {
                                                                                                                                        q5.i.g("pressureUnitLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                dewPointActivity.f19054T = true;
                                                                                                                                TextInputLayout textInputLayout13 = dewPointActivity.f19062c0;
                                                                                                                                if (textInputLayout13 == null) {
                                                                                                                                    q5.i.g("temperatureInputLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout13.setEnabled(false);
                                                                                                                                TextInputLayout textInputLayout14 = dewPointActivity.f19063d0;
                                                                                                                                if (textInputLayout14 == null) {
                                                                                                                                    q5.i.g("humidityInputLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout14.setEnabled(false);
                                                                                                                                TextInputLayout textInputLayout15 = dewPointActivity.f19064e0;
                                                                                                                                if (textInputLayout15 == null) {
                                                                                                                                    q5.i.g("pressureInputLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout15.setEnabled(false);
                                                                                                                                TextInputLayout textInputLayout16 = dewPointActivity.f19066g0;
                                                                                                                                if (textInputLayout16 == null) {
                                                                                                                                    q5.i.g("pressureUnitLayout");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                textInputLayout16.setEnabled(false);
                                                                                                                                if (!dewPointActivity.f19055U) {
                                                                                                                                    TextInputLayout textInputLayout17 = dewPointActivity.f19062c0;
                                                                                                                                    if (textInputLayout17 == null) {
                                                                                                                                        q5.i.g("temperatureInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout17.setEnabled(true);
                                                                                                                                }
                                                                                                                                if (!dewPointActivity.f19056V) {
                                                                                                                                    TextInputLayout textInputLayout18 = dewPointActivity.f19063d0;
                                                                                                                                    if (textInputLayout18 == null) {
                                                                                                                                        q5.i.g("humidityInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout18.setEnabled(true);
                                                                                                                                }
                                                                                                                                if (!dewPointActivity.f19057W) {
                                                                                                                                    TextInputLayout textInputLayout19 = dewPointActivity.f19064e0;
                                                                                                                                    if (textInputLayout19 == null) {
                                                                                                                                        q5.i.g("pressureInputLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout19.setEnabled(true);
                                                                                                                                    TextInputLayout textInputLayout20 = dewPointActivity.f19066g0;
                                                                                                                                    if (textInputLayout20 == null) {
                                                                                                                                        q5.i.g("pressureUnitLayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    textInputLayout20.setEnabled(true);
                                                                                                                                }
                                                                                                                                if (dewPointActivity.f19056V || dewPointActivity.f19055U || dewPointActivity.f19057W) {
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                SwitchMaterial switchMaterial52 = dewPointActivity.f19071l0;
                                                                                                                                if (switchMaterial52 != null) {
                                                                                                                                    switchMaterial52.setChecked(false);
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    q5.i.g("autoGetSwitch");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                TextInputEditText textInputEditText4 = this.f19067h0;
                                                                                                                if (textInputEditText4 == null) {
                                                                                                                    i.g("temperatureInput");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                textInputEditText4.addTextChangedListener(new T4.c(this, 0));
                                                                                                                TextInputEditText textInputEditText5 = this.f19068i0;
                                                                                                                if (textInputEditText5 == null) {
                                                                                                                    i.g("humidityInput");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                textInputEditText5.addTextChangedListener(new T4.c(this, 1));
                                                                                                                TextInputEditText textInputEditText6 = this.f19065f0;
                                                                                                                if (textInputEditText6 == null) {
                                                                                                                    i.g("pressureInput");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                textInputEditText6.addTextChangedListener(new T4.c(this, 2));
                                                                                                                if (this.f19050P == null) {
                                                                                                                    AppCompatTextView appCompatTextView3 = this.f19072m0;
                                                                                                                    if (appCompatTextView3 == null) {
                                                                                                                        i.g("notSupportTextView");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    appCompatTextView3.setText(getString(R.string.not_support_sensor));
                                                                                                                    b bVar6 = this.f19049O;
                                                                                                                    if (bVar6 == null) {
                                                                                                                        i.g("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    bVar6.f2197c.setVisibility(0);
                                                                                                                    this.f19057W = false;
                                                                                                                    this.f19055U = false;
                                                                                                                    this.f19056V = false;
                                                                                                                    SwitchMaterial switchMaterial7 = this.f19071l0;
                                                                                                                    if (switchMaterial7 == null) {
                                                                                                                        i.g("autoGetSwitch");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    switchMaterial7.setChecked(false);
                                                                                                                } else {
                                                                                                                    if (this.f19051Q == null) {
                                                                                                                        this.f19055U = false;
                                                                                                                        TextInputLayout textInputLayout5 = this.f19062c0;
                                                                                                                        if (textInputLayout5 == null) {
                                                                                                                            i.g("temperatureInputLayout");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        textInputLayout5.setEnabled(true);
                                                                                                                        strF = getString(R.string.device_not_support_temperature);
                                                                                                                        i.d(strF, "getString(...)");
                                                                                                                        HumidityView2 humidityView22 = this.b0;
                                                                                                                        if (humidityView22 == null) {
                                                                                                                            i.g("humidityView2");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        humidityView22.setHumidity(100.0f);
                                                                                                                    } else {
                                                                                                                        this.f19055U = true;
                                                                                                                        strF = "";
                                                                                                                    }
                                                                                                                    if (this.f19052R == null) {
                                                                                                                        this.f19056V = false;
                                                                                                                        TextInputLayout textInputLayout6 = this.f19063d0;
                                                                                                                        if (textInputLayout6 == null) {
                                                                                                                            i.g("humidityInputLayout");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        textInputLayout6.setEnabled(true);
                                                                                                                        strF = AbstractC2763b.f(strF, "\n", getString(R.string.device_not_support_humidity));
                                                                                                                    } else {
                                                                                                                        this.f19056V = true;
                                                                                                                    }
                                                                                                                    if (this.f19053S == null) {
                                                                                                                        this.f19057W = false;
                                                                                                                        TextInputLayout textInputLayout7 = this.f19064e0;
                                                                                                                        if (textInputLayout7 == null) {
                                                                                                                            i.g("pressureInputLayout");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        textInputLayout7.setEnabled(true);
                                                                                                                        TextInputLayout textInputLayout8 = this.f19066g0;
                                                                                                                        if (textInputLayout8 == null) {
                                                                                                                            i.g("pressureUnitLayout");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        textInputLayout8.setEnabled(true);
                                                                                                                        strF = AbstractC2763b.f(strF, "\n", getString(R.string.device_not_support_pressure));
                                                                                                                    } else {
                                                                                                                        this.f19057W = true;
                                                                                                                    }
                                                                                                                    if (strF.length() > 0) {
                                                                                                                        AppCompatTextView appCompatTextView4 = this.f19072m0;
                                                                                                                        if (appCompatTextView4 == null) {
                                                                                                                            i.g("notSupportTextView");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        appCompatTextView4.setText(strF);
                                                                                                                        b bVar7 = this.f19049O;
                                                                                                                        if (bVar7 == null) {
                                                                                                                            i.g("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        bVar7.f2197c.setVisibility(0);
                                                                                                                    }
                                                                                                                    SwitchMaterial switchMaterial8 = this.f19071l0;
                                                                                                                    if (switchMaterial8 == null) {
                                                                                                                        i.g("autoGetSwitch");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    switchMaterial8.setChecked(this.f19055U || this.f19056V || this.f19057W);
                                                                                                                    SwitchMaterial switchMaterial9 = this.f19071l0;
                                                                                                                    if (switchMaterial9 == null) {
                                                                                                                        i.g("autoGetSwitch");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    this.f19054T = switchMaterial9.isChecked();
                                                                                                                }
                                                                                                                C();
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onPause() {
        super.onPause();
        SensorManager sensorManager = this.f19050P;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onResume() {
        super.onResume();
        SensorManager sensorManager = this.f19050P;
        if (sensorManager != null) {
            sensorManager.registerListener(this, this.f19051Q, 3);
        }
        SensorManager sensorManager2 = this.f19050P;
        if (sensorManager2 != null) {
            sensorManager2.registerListener(this, this.f19052R, 3);
        }
        SensorManager sensorManager3 = this.f19050P;
        if (sensorManager3 != null) {
            sensorManager3.registerListener(this, this.f19053S, 3);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        if (this.f19054T && sensorEvent != null) {
            if (sensorEvent.sensor.getType() == 13) {
                float f2 = sensorEvent.values[0];
                this.f19077r0 = f2;
                if (this.f19058X) {
                    TextInputEditText textInputEditText = this.f19067h0;
                    if (textInputEditText == null) {
                        i.g("temperatureInput");
                        throw null;
                    }
                    Float fValueOf = Float.valueOf(f2);
                    if (R2.a.f3390d) {
                        Locale locale = e.f1457a;
                        str13 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                    } else {
                        str13 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                    }
                    textInputEditText.setText(str13);
                } else {
                    TextInputEditText textInputEditText2 = this.f19067h0;
                    if (textInputEditText2 == null) {
                        i.g("temperatureInput");
                        throw null;
                    }
                    Float fValueOf2 = Float.valueOf(((f2 * 9) / 5) + 32.0f);
                    if (R2.a.f3390d) {
                        Locale locale2 = e.f1457a;
                        str12 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                    } else {
                        str12 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                    }
                    textInputEditText2.setText(str12);
                }
                TemperatureView temperatureView = this.f19061a0;
                if (temperatureView == null) {
                    i.g("temperatureView");
                    throw null;
                }
                temperatureView.setTemperature(this.f19077r0);
            }
            if (sensorEvent.sensor.getType() == 12) {
                float f5 = sensorEvent.values[0];
                this.f19078s0 = f5;
                if (this.f19059Y) {
                    TextInputEditText textInputEditText3 = this.f19068i0;
                    if (textInputEditText3 == null) {
                        i.g("humidityInput");
                        throw null;
                    }
                    Float fValueOf3 = Float.valueOf(f5);
                    if (R2.a.f3390d) {
                        Locale locale3 = e.f1457a;
                        str11 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                    } else {
                        str11 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                    }
                    textInputEditText3.setText(str11);
                } else {
                    float fD = D();
                    TextInputEditText textInputEditText4 = this.f19068i0;
                    if (textInputEditText4 == null) {
                        i.g("humidityInput");
                        throw null;
                    }
                    Float fValueOf4 = Float.valueOf(fD);
                    if (R2.a.f3390d) {
                        Locale locale4 = e.f1457a;
                        str10 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf4}, 1));
                    } else {
                        str10 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf4}, 1));
                    }
                    textInputEditText4.setText(str10);
                }
            }
            if (sensorEvent.sensor.getType() == 6) {
                float f6 = sensorEvent.values[0];
                this.f19079t0 = f6;
                switch (this.f19075p0) {
                    case 0:
                        TextInputEditText textInputEditText5 = this.f19065f0;
                        if (textInputEditText5 == null) {
                            i.g("pressureInput");
                            throw null;
                        }
                        Float fValueOf5 = Float.valueOf(f6);
                        if (R2.a.f3390d) {
                            Locale locale5 = e.f1457a;
                            str = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf5}, 1));
                        } else {
                            str = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf5}, 1));
                        }
                        textInputEditText5.setText(str);
                        break;
                    case 1:
                        TextInputEditText textInputEditText6 = this.f19065f0;
                        if (textInputEditText6 == null) {
                            i.g("pressureInput");
                            throw null;
                        }
                        Float fValueOf6 = Float.valueOf(f6 / 1000.0f);
                        if (R2.a.f3390d) {
                            Locale locale6 = e.f1457a;
                            str2 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf6}, 1));
                        } else {
                            str2 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf6}, 1));
                        }
                        textInputEditText6.setText(str2);
                        break;
                    case 2:
                        TextInputEditText textInputEditText7 = this.f19065f0;
                        if (textInputEditText7 == null) {
                            i.g("pressureInput");
                            throw null;
                        }
                        Float fValueOf7 = Float.valueOf(f6 / 0.01f);
                        if (R2.a.f3390d) {
                            Locale locale7 = e.f1457a;
                            str3 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf7}, 1));
                        } else {
                            str3 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf7}, 1));
                        }
                        textInputEditText7.setText(str3);
                        break;
                    case 3:
                        TextInputEditText textInputEditText8 = this.f19065f0;
                        if (textInputEditText8 == null) {
                            i.g("pressureInput");
                            throw null;
                        }
                        Float fValueOf8 = Float.valueOf(f6 / 100.0f);
                        if (R2.a.f3390d) {
                            Locale locale8 = e.f1457a;
                            str4 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf8}, 1));
                        } else {
                            str4 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf8}, 1));
                        }
                        textInputEditText8.setText(str4);
                        break;
                    case 4:
                        TextInputEditText textInputEditText9 = this.f19065f0;
                        if (textInputEditText9 == null) {
                            i.g("pressureInput");
                            throw null;
                        }
                        Float fValueOf9 = Float.valueOf(f6 / 10.0f);
                        if (R2.a.f3390d) {
                            Locale locale9 = e.f1457a;
                            str5 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf9}, 1));
                        } else {
                            str5 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf9}, 1));
                        }
                        textInputEditText9.setText(str5);
                        break;
                    case 5:
                        TextInputEditText textInputEditText10 = this.f19065f0;
                        if (textInputEditText10 == null) {
                            i.g("pressureInput");
                            throw null;
                        }
                        Float fValueOf10 = Float.valueOf(f6 / 1013.25f);
                        if (R2.a.f3390d) {
                            Locale locale10 = e.f1457a;
                            str6 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf10}, 1));
                        } else {
                            str6 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf10}, 1));
                        }
                        textInputEditText10.setText(str6);
                        break;
                    case 6:
                        TextInputEditText textInputEditText11 = this.f19065f0;
                        if (textInputEditText11 == null) {
                            i.g("pressureInput");
                            throw null;
                        }
                        Float fValueOf11 = Float.valueOf(f6 / 760.0f);
                        if (R2.a.f3390d) {
                            Locale locale11 = e.f1457a;
                            str7 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf11}, 1));
                        } else {
                            str7 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf11}, 1));
                        }
                        textInputEditText11.setText(str7);
                        break;
                    case 7:
                        TextInputEditText textInputEditText12 = this.f19065f0;
                        if (textInputEditText12 == null) {
                            i.g("pressureInput");
                            throw null;
                        }
                        Float fValueOf12 = Float.valueOf(f6 / 3386.39f);
                        if (R2.a.f3390d) {
                            Locale locale12 = e.f1457a;
                            str8 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf12}, 1));
                        } else {
                            str8 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf12}, 1));
                        }
                        textInputEditText12.setText(str8);
                        break;
                    case 8:
                        TextInputEditText textInputEditText13 = this.f19065f0;
                        if (textInputEditText13 == null) {
                            i.g("pressureInput");
                            throw null;
                        }
                        Float fValueOf13 = Float.valueOf(f6 / 6894.76f);
                        if (R2.a.f3390d) {
                            Locale locale13 = e.f1457a;
                            str9 = String.format(e.b(), "%.2f", Arrays.copyOf(new Object[]{fValueOf13}, 1));
                        } else {
                            str9 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{fValueOf13}, 1));
                        }
                        textInputEditText13.setText(str9);
                        break;
                }
            }
            C();
        }
    }
}
