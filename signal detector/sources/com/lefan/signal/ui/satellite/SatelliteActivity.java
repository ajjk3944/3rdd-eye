package com.lefan.signal.ui.satellite;

import A2.C0115c;
import B4.A;
import F4.b;
import K4.h;
import Q4.j;
import S4.c;
import V4.a;
import V4.d;
import V4.f;
import V4.k;
import V4.m;
import V4.r;
import V4.u;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.D;
import androidx.lifecycle.Q;
import androidx.recyclerview.widget.C0314k;
import androidx.recyclerview.widget.RecyclerView;
import c.AbstractC0391p;
import c5.C0412i;
import com.apm.insight.R;
import com.bumptech.glide.e;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.lefan.signal.MyApplication;
import com.lefan.signal.ui.satellite.SatelliteActivity;
import com.lefan.signal.view.CopyVerLinerLayout;
import d5.AbstractC2282j;
import d5.AbstractC2283k;
import e.C2291h;
import f.C2314a;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k0.K;
import q5.i;
import q5.l;
import q5.p;
import z5.AbstractC3046w;

/* loaded from: classes.dex */
public final class SatelliteActivity extends AbstractActivityC2349g implements a {

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f19187g0 = 0;

    /* renamed from: O, reason: collision with root package name */
    public final D4.a f19188O = new D4.a(13);

    /* renamed from: P, reason: collision with root package name */
    public final D4.a f19189P = new D4.a(R.layout.satellite_country_item, 14);

    /* renamed from: Q, reason: collision with root package name */
    public final m f19190Q;

    /* renamed from: R, reason: collision with root package name */
    public final m f19191R;

    /* renamed from: S, reason: collision with root package name */
    public final m f19192S;

    /* renamed from: T, reason: collision with root package name */
    public final m f19193T;

    /* renamed from: U, reason: collision with root package name */
    public final m f19194U;

    /* renamed from: V, reason: collision with root package name */
    public final m f19195V;

    /* renamed from: W, reason: collision with root package name */
    public final m f19196W;

    /* renamed from: X, reason: collision with root package name */
    public final m f19197X;

    /* renamed from: Y, reason: collision with root package name */
    public final ArrayList f19198Y;

    /* renamed from: Z, reason: collision with root package name */
    public final d f19199Z;

    /* renamed from: a0, reason: collision with root package name */
    public final String f19200a0;
    public h b0;

    /* renamed from: c0, reason: collision with root package name */
    public final C0115c f19201c0;

    /* renamed from: d0, reason: collision with root package name */
    public long f19202d0;

    /* renamed from: e0, reason: collision with root package name */
    public final C2291h f19203e0;

    /* renamed from: f0, reason: collision with root package name */
    public final C2291h f19204f0;

    public SatelliteActivity() {
        m mVar = new m(R.drawable.flag_china, R.string.grs_country_cn);
        this.f19190Q = mVar;
        m mVar2 = new m(R.drawable.flag_us, R.string.grs_country_us);
        this.f19191R = mVar2;
        m mVar3 = new m(R.drawable.flag_russia, R.string.country_russia);
        this.f19192S = mVar3;
        m mVar4 = new m(R.drawable.flag_japan, R.string.grs_country_jp);
        this.f19193T = mVar4;
        m mVar5 = new m(R.drawable.flag_india, R.string.grs_country_in);
        this.f19194U = mVar5;
        m mVar6 = new m(R.drawable.flag_eu, R.string.grs_country_eu);
        this.f19195V = mVar6;
        m mVar7 = new m(R.drawable.flag_unknown, R.string.grs_country_sbas);
        this.f19196W = mVar7;
        m mVar8 = new m(R.drawable.flag_unknown, R.string.string_other);
        this.f19197X = mVar8;
        this.f19198Y = AbstractC2283k.K(mVar2, mVar3, mVar, mVar6, mVar4, mVar5, mVar7, mVar8);
        this.f19199Z = new d();
        this.f19200a0 = "android.permission.ACCESS_FINE_LOCATION";
        this.f19201c0 = new C0115c(p.a(u.class), new k(this, 1), new k(this, 0), new k(this, 2));
        this.f19203e0 = (C2291h) p(new C2314a(2), new f(this));
        this.f19204f0 = (C2291h) p(new C2314a(3), new b(21));
    }

    public final u C() {
        return (u) this.f19201c0.getValue();
    }

    @Override // V4.a
    public final void b() {
        C().f3951m.j(Boolean.FALSE);
    }

    @Override // V4.a
    public final void e(ArrayList arrayList) {
        i.e(arrayList, "satelliteBeans");
        C().f3946g.j(arrayList);
    }

    @Override // V4.a
    public final void h(boolean z6) {
        C().f3949k.j(Boolean.valueOf(z6));
    }

    @Override // V4.a
    public final void i(Location location) {
        CharSequence charSequence;
        u uVarC = C();
        D d6 = uVarC.f3944e;
        Location location2 = (Location) d6.d();
        if (location2 != null) {
            float[] fArr = new float[1];
            Location.distanceBetween(location2.getLatitude(), location2.getLongitude(), location.getLatitude(), location.getLongitude(), fArr);
            if (fArr[0] > 500.0f || (charSequence = (CharSequence) uVarC.f3942c.d()) == null || charSequence.length() == 0) {
                AbstractC3046w.l(Q.h(uVarC), null, new r(uVarC, location.getLatitude(), location.getLongitude(), null), 3);
            }
        } else {
            AbstractC3046w.l(Q.h(uVarC), null, new r(uVarC, location.getLatitude(), location.getLongitude(), null), 3);
        }
        d6.j(location);
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_satellite, (ViewGroup) null, false);
        int i = R.id.address;
        TextView textView = (TextView) a4.p.e(R.id.address, viewInflate);
        if (textView != null) {
            i = R.id.app_bar;
            AppBarLayout appBarLayout = (AppBarLayout) a4.p.e(R.id.app_bar, viewInflate);
            if (appBarLayout != null) {
                i = R.id.bottom_layout;
                NestedScrollView nestedScrollView = (NestedScrollView) a4.p.e(R.id.bottom_layout, viewInflate);
                if (nestedScrollView != null) {
                    i = R.id.decimal_switch;
                    SwitchCompat switchCompat = (SwitchCompat) a4.p.e(R.id.decimal_switch, viewInflate);
                    if (switchCompat != null) {
                        i = R.id.gps_info_recycler;
                        RecyclerView recyclerView = (RecyclerView) a4.p.e(R.id.gps_info_recycler, viewInflate);
                        if (recyclerView != null) {
                            i = R.id.location_perm_card;
                            MaterialCardView materialCardView = (MaterialCardView) a4.p.e(R.id.location_perm_card, viewInflate);
                            if (materialCardView != null) {
                                i = R.id.more_satellite;
                                MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.more_satellite, viewInflate);
                                if (materialButton != null) {
                                    i = R.id.request_perm_btn;
                                    TextView textView2 = (TextView) a4.p.e(R.id.request_perm_btn, viewInflate);
                                    if (textView2 != null) {
                                        i = R.id.request_perm_text;
                                        TextView textView3 = (TextView) a4.p.e(R.id.request_perm_text, viewInflate);
                                        if (textView3 != null) {
                                            i = R.id.sate_found;
                                            TextView textView4 = (TextView) a4.p.e(R.id.sate_found, viewInflate);
                                            if (textView4 != null) {
                                                i = R.id.sate_gps_info;
                                                TextView textView5 = (TextView) a4.p.e(R.id.sate_gps_info, viewInflate);
                                                if (textView5 != null) {
                                                    i = R.id.sate_info_liner;
                                                    if (((LinearLayout) a4.p.e(R.id.sate_info_liner, viewInflate)) != null) {
                                                        i = R.id.sate_latitude;
                                                        CopyVerLinerLayout copyVerLinerLayout = (CopyVerLinerLayout) a4.p.e(R.id.sate_latitude, viewInflate);
                                                        if (copyVerLinerLayout != null) {
                                                            i = R.id.sate_longitude;
                                                            CopyVerLinerLayout copyVerLinerLayout2 = (CopyVerLinerLayout) a4.p.e(R.id.sate_longitude, viewInflate);
                                                            if (copyVerLinerLayout2 != null) {
                                                                i = R.id.sate_sate_view;
                                                                SatelliteView satelliteView = (SatelliteView) a4.p.e(R.id.sate_sate_view, viewInflate);
                                                                if (satelliteView != null) {
                                                                    i = R.id.sate_switch;
                                                                    SwitchCompat switchCompat2 = (SwitchCompat) a4.p.e(R.id.sate_switch, viewInflate);
                                                                    if (switchCompat2 != null) {
                                                                        i = R.id.sate_used;
                                                                        TextView textView6 = (TextView) a4.p.e(R.id.sate_used, viewInflate);
                                                                        if (textView6 != null) {
                                                                            i = R.id.satellite_cloud_chart;
                                                                            SatelliteCloudChart satelliteCloudChart = (SatelliteCloudChart) a4.p.e(R.id.satellite_cloud_chart, viewInflate);
                                                                            if (satelliteCloudChart != null) {
                                                                                i = R.id.satellite_cloud_recycler;
                                                                                RecyclerView recyclerView2 = (RecyclerView) a4.p.e(R.id.satellite_cloud_recycler, viewInflate);
                                                                                if (recyclerView2 != null) {
                                                                                    i = R.id.satellite_info_title;
                                                                                    if (((TextView) a4.p.e(R.id.satellite_info_title, viewInflate)) != null) {
                                                                                        i = R.id.satellite_lat_lon;
                                                                                        if (((LinearLayout) a4.p.e(R.id.satellite_lat_lon, viewInflate)) != null) {
                                                                                            i = R.id.tip_available;
                                                                                            TextView textView7 = (TextView) a4.p.e(R.id.tip_available, viewInflate);
                                                                                            if (textView7 != null) {
                                                                                                i = R.id.tip_azimuth;
                                                                                                TextView textView8 = (TextView) a4.p.e(R.id.tip_azimuth, viewInflate);
                                                                                                if (textView8 != null) {
                                                                                                    i = R.id.tip_carrierFrequencyHz;
                                                                                                    TextView textView9 = (TextView) a4.p.e(R.id.tip_carrierFrequencyHz, viewInflate);
                                                                                                    if (textView9 != null) {
                                                                                                        i = R.id.tip_country;
                                                                                                        TextView textView10 = (TextView) a4.p.e(R.id.tip_country, viewInflate);
                                                                                                        if (textView10 != null) {
                                                                                                            i = R.id.tip_elevation;
                                                                                                            TextView textView11 = (TextView) a4.p.e(R.id.tip_elevation, viewInflate);
                                                                                                            if (textView11 != null) {
                                                                                                                i = R.id.tip_id;
                                                                                                                TextView textView12 = (TextView) a4.p.e(R.id.tip_id, viewInflate);
                                                                                                                if (textView12 != null) {
                                                                                                                    i = R.id.tip_signal;
                                                                                                                    TextView textView13 = (TextView) a4.p.e(R.id.tip_signal, viewInflate);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i = R.id.toolbar;
                                                                                                                        Toolbar toolbar = (Toolbar) a4.p.e(R.id.toolbar, viewInflate);
                                                                                                                        if (toolbar != null) {
                                                                                                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                                                                                                                            this.b0 = new h(linearLayoutCompat, textView, appBarLayout, nestedScrollView, switchCompat, recyclerView, materialCardView, materialButton, textView2, textView3, textView4, textView5, copyVerLinerLayout, copyVerLinerLayout2, satelliteView, switchCompat2, textView6, satelliteCloudChart, recyclerView2, textView7, textView8, textView9, textView10, textView11, textView12, textView13, toolbar);
                                                                                                                            setContentView(linearLayoutCompat);
                                                                                                                            h hVar = this.b0;
                                                                                                                            if (hVar == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            AppBarLayout appBarLayout2 = hVar.f2282c;
                                                                                                                            if (hVar == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            F4.d.a(appBarLayout2, hVar.f2283d);
                                                                                                                            h hVar2 = this.b0;
                                                                                                                            if (hVar2 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            Toolbar toolbar2 = hVar2.f2279O;
                                                                                                                            B(toolbar2);
                                                                                                                            com.bumptech.glide.d dVarR = r();
                                                                                                                            if (dVarR != null) {
                                                                                                                                dVarR.S(true);
                                                                                                                            }
                                                                                                                            final int i3 = 3;
                                                                                                                            toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: V4.e

                                                                                                                                /* renamed from: b, reason: collision with root package name */
                                                                                                                                public final /* synthetic */ SatelliteActivity f3885b;

                                                                                                                                {
                                                                                                                                    this.f3885b = this;
                                                                                                                                }

                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                public final void onClick(View view) {
                                                                                                                                    int i6 = i3;
                                                                                                                                    SatelliteActivity satelliteActivity = this.f3885b;
                                                                                                                                    switch (i6) {
                                                                                                                                        case 0:
                                                                                                                                            int i7 = SatelliteActivity.f19187g0;
                                                                                                                                            new q().f0(satelliteActivity.s(), "satellite_list_dialog");
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            int i8 = SatelliteActivity.f19187g0;
                                                                                                                                            Object objD = satelliteActivity.C().f3948j.d();
                                                                                                                                            Boolean bool = Boolean.FALSE;
                                                                                                                                            if (!q5.i.a(objD, bool)) {
                                                                                                                                                if (q5.i.a(satelliteActivity.C().f3950l.d(), bool)) {
                                                                                                                                                    MyApplication.f18812d = true;
                                                                                                                                                    satelliteActivity.startActivity(com.bumptech.glide.d.x(satelliteActivity, "android.settings.LOCATION_SOURCE_SETTINGS"));
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                try {
                                                                                                                                                    satelliteActivity.f19202d0 = System.currentTimeMillis();
                                                                                                                                                    satelliteActivity.f19203e0.a(satelliteActivity.f19200a0);
                                                                                                                                                    break;
                                                                                                                                                } catch (Throwable th) {
                                                                                                                                                    R2.a.d(th);
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            int i9 = SatelliteActivity.f19187g0;
                                                                                                                                            if (satelliteActivity.C().f3943d.d() != null) {
                                                                                                                                                K kS = satelliteActivity.s();
                                                                                                                                                String str = (String) satelliteActivity.C().f3943d.d();
                                                                                                                                                String string = satelliteActivity.getString(R.string.address_title);
                                                                                                                                                if (kS != null) {
                                                                                                                                                    A a6 = new A();
                                                                                                                                                    a6.f687A0 = str;
                                                                                                                                                    a6.f688B0 = string;
                                                                                                                                                    a6.e0(kS, "share_copy_dialog");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            int i10 = SatelliteActivity.f19187g0;
                                                                                                                                            satelliteActivity.finish();
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            int i11 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_country));
                                                                                                                                            break;
                                                                                                                                        case 5:
                                                                                                                                            int i12 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_id));
                                                                                                                                            break;
                                                                                                                                        case 6:
                                                                                                                                            int i13 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_azimuth));
                                                                                                                                            break;
                                                                                                                                        case 7:
                                                                                                                                            int i14 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_elevation));
                                                                                                                                            break;
                                                                                                                                        case 8:
                                                                                                                                            int i15 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_carrier_frequency_hz));
                                                                                                                                            break;
                                                                                                                                        case 9:
                                                                                                                                            int i16 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_available));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            int i17 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, Build.VERSION.SDK_INT >= 24 ? satelliteActivity.getString(R.string.tip_satellite_signal_n) : satelliteActivity.getString(R.string.tip_satellite_signal));
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                            d dVar = this.f19199Z;
                                                                                                                            dVar.getClass();
                                                                                                                            dVar.f3880b = this;
                                                                                                                            h hVar3 = this.b0;
                                                                                                                            if (hVar3 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final int i6 = 1;
                                                                                                                            hVar3.i.setOnClickListener(new View.OnClickListener(this) { // from class: V4.e

                                                                                                                                /* renamed from: b, reason: collision with root package name */
                                                                                                                                public final /* synthetic */ SatelliteActivity f3885b;

                                                                                                                                {
                                                                                                                                    this.f3885b = this;
                                                                                                                                }

                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                public final void onClick(View view) {
                                                                                                                                    int i62 = i6;
                                                                                                                                    SatelliteActivity satelliteActivity = this.f3885b;
                                                                                                                                    switch (i62) {
                                                                                                                                        case 0:
                                                                                                                                            int i7 = SatelliteActivity.f19187g0;
                                                                                                                                            new q().f0(satelliteActivity.s(), "satellite_list_dialog");
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            int i8 = SatelliteActivity.f19187g0;
                                                                                                                                            Object objD = satelliteActivity.C().f3948j.d();
                                                                                                                                            Boolean bool = Boolean.FALSE;
                                                                                                                                            if (!q5.i.a(objD, bool)) {
                                                                                                                                                if (q5.i.a(satelliteActivity.C().f3950l.d(), bool)) {
                                                                                                                                                    MyApplication.f18812d = true;
                                                                                                                                                    satelliteActivity.startActivity(com.bumptech.glide.d.x(satelliteActivity, "android.settings.LOCATION_SOURCE_SETTINGS"));
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                try {
                                                                                                                                                    satelliteActivity.f19202d0 = System.currentTimeMillis();
                                                                                                                                                    satelliteActivity.f19203e0.a(satelliteActivity.f19200a0);
                                                                                                                                                    break;
                                                                                                                                                } catch (Throwable th) {
                                                                                                                                                    R2.a.d(th);
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            int i9 = SatelliteActivity.f19187g0;
                                                                                                                                            if (satelliteActivity.C().f3943d.d() != null) {
                                                                                                                                                K kS = satelliteActivity.s();
                                                                                                                                                String str = (String) satelliteActivity.C().f3943d.d();
                                                                                                                                                String string = satelliteActivity.getString(R.string.address_title);
                                                                                                                                                if (kS != null) {
                                                                                                                                                    A a6 = new A();
                                                                                                                                                    a6.f687A0 = str;
                                                                                                                                                    a6.f688B0 = string;
                                                                                                                                                    a6.e0(kS, "share_copy_dialog");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            int i10 = SatelliteActivity.f19187g0;
                                                                                                                                            satelliteActivity.finish();
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            int i11 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_country));
                                                                                                                                            break;
                                                                                                                                        case 5:
                                                                                                                                            int i12 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_id));
                                                                                                                                            break;
                                                                                                                                        case 6:
                                                                                                                                            int i13 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_azimuth));
                                                                                                                                            break;
                                                                                                                                        case 7:
                                                                                                                                            int i14 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_elevation));
                                                                                                                                            break;
                                                                                                                                        case 8:
                                                                                                                                            int i15 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_carrier_frequency_hz));
                                                                                                                                            break;
                                                                                                                                        case 9:
                                                                                                                                            int i16 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_available));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            int i17 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, Build.VERSION.SDK_INT >= 24 ? satelliteActivity.getString(R.string.tip_satellite_signal_n) : satelliteActivity.getString(R.string.tip_satellite_signal));
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                            h hVar4 = this.b0;
                                                                                                                            if (hVar4 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final CopyVerLinerLayout copyVerLinerLayout3 = hVar4.f2291m;
                                                                                                                            if (hVar4 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final CopyVerLinerLayout copyVerLinerLayout4 = hVar4.f2292n;
                                                                                                                            final l lVar = new l();
                                                                                                                            boolean zK = e.k(this, "lat_lon_decimal", false);
                                                                                                                            lVar.f23296a = zK;
                                                                                                                            h hVar5 = this.b0;
                                                                                                                            if (hVar5 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            SwitchCompat switchCompat3 = hVar5.f2284e;
                                                                                                                            switchCompat3.setChecked(zK);
                                                                                                                            switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: V4.g
                                                                                                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                                                                                                                                    int i7 = SatelliteActivity.f19187g0;
                                                                                                                                    q5.l lVar2 = lVar;
                                                                                                                                    lVar2.f23296a = z6;
                                                                                                                                    SatelliteActivity satelliteActivity = this;
                                                                                                                                    com.bumptech.glide.e.k(satelliteActivity, "lat_lon_decimal", z6);
                                                                                                                                    Location location = (Location) satelliteActivity.C().f3945f.d();
                                                                                                                                    if (location == null) {
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    boolean z7 = lVar2.f23296a;
                                                                                                                                    CopyVerLinerLayout copyVerLinerLayout5 = copyVerLinerLayout3;
                                                                                                                                    CopyVerLinerLayout copyVerLinerLayout6 = copyVerLinerLayout4;
                                                                                                                                    if (z7) {
                                                                                                                                        copyVerLinerLayout5.setInfo(R2.a.k(Double.valueOf(location.getLatitude()), "%.4f"));
                                                                                                                                        copyVerLinerLayout6.setInfo(R2.a.k(Double.valueOf(location.getLongitude()), "%.4f"));
                                                                                                                                    } else {
                                                                                                                                        copyVerLinerLayout5.setInfo(R3.b.j(Double.valueOf(location.getLatitude())));
                                                                                                                                        copyVerLinerLayout6.setInfo(R3.b.j(Double.valueOf(location.getLongitude())));
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                            C().f3945f.e(this, new j(new c(lVar, copyVerLinerLayout3, copyVerLinerLayout4, 2), 4));
                                                                                                                            h hVar6 = this.b0;
                                                                                                                            if (hVar6 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final TextView textView14 = hVar6.f2290l;
                                                                                                                            if (hVar6 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final SatelliteCloudChart satelliteCloudChart2 = hVar6.f2271F;
                                                                                                                            if (hVar6 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final SatelliteView satelliteView2 = hVar6.f2268C;
                                                                                                                            if (hVar6 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final TextView textView15 = hVar6.f2289k;
                                                                                                                            if (hVar6 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final TextView textView16 = hVar6.f2270E;
                                                                                                                            if (hVar6 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            hVar6.f2272G.setAdapter(this.f19189P);
                                                                                                                            h hVar7 = this.b0;
                                                                                                                            if (hVar7 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            RecyclerView recyclerView3 = hVar7.f2285f;
                                                                                                                            recyclerView3.g(new C0314k(this));
                                                                                                                            D4.a aVar = this.f19188O;
                                                                                                                            aVar.setHasStableIds(true);
                                                                                                                            recyclerView3.setAdapter(aVar);
                                                                                                                            C().f3947h.e(this, new j(new p5.l() { // from class: V4.h
                                                                                                                                @Override // p5.l
                                                                                                                                public final Object f(Object obj) {
                                                                                                                                    ArrayList arrayList;
                                                                                                                                    int i7;
                                                                                                                                    String str;
                                                                                                                                    Spanned spannedFromHtml;
                                                                                                                                    String str2;
                                                                                                                                    Spanned spannedFromHtml2;
                                                                                                                                    ArrayList arrayList2;
                                                                                                                                    String str3;
                                                                                                                                    String str4;
                                                                                                                                    List<l> list = (List) obj;
                                                                                                                                    int i8 = SatelliteActivity.f19187g0;
                                                                                                                                    q5.i.b(list);
                                                                                                                                    satelliteCloudChart2.setSatellites(list);
                                                                                                                                    if (list.size() > 1) {
                                                                                                                                        d5.o.Q(list, new E.h(4));
                                                                                                                                    }
                                                                                                                                    SatelliteActivity satelliteActivity = this;
                                                                                                                                    D4.a aVar2 = satelliteActivity.f19188O;
                                                                                                                                    ArrayList arrayList3 = satelliteActivity.f19198Y;
                                                                                                                                    m mVar = satelliteActivity.f19197X;
                                                                                                                                    m mVar2 = satelliteActivity.f19195V;
                                                                                                                                    m mVar3 = satelliteActivity.f19194U;
                                                                                                                                    m mVar4 = satelliteActivity.f19193T;
                                                                                                                                    m mVar5 = satelliteActivity.f19192S;
                                                                                                                                    m mVar6 = satelliteActivity.f19191R;
                                                                                                                                    m mVar7 = satelliteActivity.f19190Q;
                                                                                                                                    aVar2.o(AbstractC2282j.g0(6, list));
                                                                                                                                    ArrayList arrayList4 = new ArrayList();
                                                                                                                                    for (Object obj2 : list) {
                                                                                                                                        if (((l) obj2).f3905a) {
                                                                                                                                            arrayList4.add(obj2);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    int size = arrayList4.size();
                                                                                                                                    satelliteView2.setSatellites(size);
                                                                                                                                    int i9 = Build.VERSION.SDK_INT;
                                                                                                                                    if (i9 >= 24) {
                                                                                                                                        String string = satelliteActivity.getString(R.string.satellites_found);
                                                                                                                                        q5.i.d(string, "getString(...)");
                                                                                                                                        Integer numValueOf = Integer.valueOf(list.size());
                                                                                                                                        if (R2.a.f3390d) {
                                                                                                                                            Locale locale = F4.e.f1457a;
                                                                                                                                            i7 = 0;
                                                                                                                                            arrayList = arrayList3;
                                                                                                                                            str4 = String.format(F4.e.b(), string, Arrays.copyOf(new Object[]{numValueOf}, 1));
                                                                                                                                        } else {
                                                                                                                                            arrayList = arrayList3;
                                                                                                                                            i7 = 0;
                                                                                                                                            str4 = String.format(Locale.ENGLISH, string, Arrays.copyOf(new Object[]{numValueOf}, 1));
                                                                                                                                        }
                                                                                                                                        spannedFromHtml = Html.fromHtml(str4, 0);
                                                                                                                                    } else {
                                                                                                                                        arrayList = arrayList3;
                                                                                                                                        i7 = 0;
                                                                                                                                        String string2 = satelliteActivity.getString(R.string.satellites_found);
                                                                                                                                        q5.i.d(string2, "getString(...)");
                                                                                                                                        Integer numValueOf2 = Integer.valueOf(list.size());
                                                                                                                                        if (R2.a.f3390d) {
                                                                                                                                            Locale locale2 = F4.e.f1457a;
                                                                                                                                            str = String.format(F4.e.b(), string2, Arrays.copyOf(new Object[]{numValueOf2}, 1));
                                                                                                                                        } else {
                                                                                                                                            str = String.format(Locale.ENGLISH, string2, Arrays.copyOf(new Object[]{numValueOf2}, 1));
                                                                                                                                        }
                                                                                                                                        spannedFromHtml = Html.fromHtml(str);
                                                                                                                                    }
                                                                                                                                    textView15.setText(spannedFromHtml);
                                                                                                                                    if (i9 >= 24) {
                                                                                                                                        String string3 = satelliteActivity.getString(R.string.satellites_used);
                                                                                                                                        q5.i.d(string3, "getString(...)");
                                                                                                                                        Integer numValueOf3 = Integer.valueOf(size);
                                                                                                                                        if (R2.a.f3390d) {
                                                                                                                                            Locale locale3 = F4.e.f1457a;
                                                                                                                                            Locale localeB = F4.e.b();
                                                                                                                                            Object[] objArr = new Object[1];
                                                                                                                                            objArr[i7] = numValueOf3;
                                                                                                                                            str3 = String.format(localeB, string3, Arrays.copyOf(objArr, 1));
                                                                                                                                        } else {
                                                                                                                                            Locale locale4 = Locale.ENGLISH;
                                                                                                                                            Object[] objArr2 = new Object[1];
                                                                                                                                            objArr2[i7] = numValueOf3;
                                                                                                                                            str3 = String.format(locale4, string3, Arrays.copyOf(objArr2, 1));
                                                                                                                                        }
                                                                                                                                        spannedFromHtml2 = Html.fromHtml(str3, 0);
                                                                                                                                    } else {
                                                                                                                                        String string4 = satelliteActivity.getString(R.string.satellites_used);
                                                                                                                                        q5.i.d(string4, "getString(...)");
                                                                                                                                        Integer numValueOf4 = Integer.valueOf(size);
                                                                                                                                        if (R2.a.f3390d) {
                                                                                                                                            Locale locale5 = F4.e.f1457a;
                                                                                                                                            Locale localeB2 = F4.e.b();
                                                                                                                                            Object[] objArr3 = new Object[1];
                                                                                                                                            objArr3[i7] = numValueOf4;
                                                                                                                                            str2 = String.format(localeB2, string4, Arrays.copyOf(objArr3, 1));
                                                                                                                                        } else {
                                                                                                                                            Locale locale6 = Locale.ENGLISH;
                                                                                                                                            Object[] objArr4 = new Object[1];
                                                                                                                                            objArr4[i7] = numValueOf4;
                                                                                                                                            str2 = String.format(locale6, string4, Arrays.copyOf(objArr4, 1));
                                                                                                                                        }
                                                                                                                                        spannedFromHtml2 = Html.fromHtml(str2);
                                                                                                                                    }
                                                                                                                                    textView16.setText(spannedFromHtml2);
                                                                                                                                    TextView textView17 = textView14;
                                                                                                                                    if (size > 5) {
                                                                                                                                        textView17.setText(satelliteActivity.getString(R.string.gps_fix_acquired));
                                                                                                                                    } else {
                                                                                                                                        textView17.setText(satelliteActivity.getString(R.string.gps_fix_weak));
                                                                                                                                    }
                                                                                                                                    int i10 = i7;
                                                                                                                                    mVar7.f3915c = i10;
                                                                                                                                    mVar6.f3915c = i10;
                                                                                                                                    mVar5.f3915c = i10;
                                                                                                                                    mVar4.f3915c = i10;
                                                                                                                                    mVar3.f3915c = i10;
                                                                                                                                    mVar2.f3915c = i10;
                                                                                                                                    mVar.f3915c = i10;
                                                                                                                                    Iterator<T> it = list.iterator();
                                                                                                                                    while (it.hasNext()) {
                                                                                                                                        switch (((l) it.next()).f3909e) {
                                                                                                                                            case 1:
                                                                                                                                                mVar6.f3915c++;
                                                                                                                                                break;
                                                                                                                                            case 2:
                                                                                                                                                satelliteActivity.f19196W.f3915c++;
                                                                                                                                                break;
                                                                                                                                            case 3:
                                                                                                                                                mVar5.f3915c++;
                                                                                                                                                break;
                                                                                                                                            case 4:
                                                                                                                                                mVar4.f3915c++;
                                                                                                                                                break;
                                                                                                                                            case 5:
                                                                                                                                                mVar7.f3915c++;
                                                                                                                                                break;
                                                                                                                                            case 6:
                                                                                                                                                mVar2.f3915c++;
                                                                                                                                                break;
                                                                                                                                            case 7:
                                                                                                                                                mVar3.f3915c++;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                mVar.f3915c++;
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (arrayList.size() > 1) {
                                                                                                                                        arrayList2 = arrayList;
                                                                                                                                        d5.o.Q(arrayList2, new E.h(5));
                                                                                                                                    } else {
                                                                                                                                        arrayList2 = arrayList;
                                                                                                                                    }
                                                                                                                                    satelliteActivity.f19189P.o(arrayList2);
                                                                                                                                    return C0412i.f5929a;
                                                                                                                                }
                                                                                                                            }, 4));
                                                                                                                            h hVar8 = this.b0;
                                                                                                                            if (hVar8 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            SwitchCompat switchCompat4 = hVar8.f2269D;
                                                                                                                            switchCompat4.setChecked(e.k(this, "sate_compass", true));
                                                                                                                            satelliteCloudChart2.setUseCompass(switchCompat4.isChecked());
                                                                                                                            switchCompat4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: V4.i
                                                                                                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                                                                                                                                    int i7 = SatelliteActivity.f19187g0;
                                                                                                                                    satelliteCloudChart2.setUseCompass(z6);
                                                                                                                                    SatelliteActivity satelliteActivity = this;
                                                                                                                                    q5.i.e(satelliteActivity, "context");
                                                                                                                                    SharedPreferences sharedPreferences = satelliteActivity.getSharedPreferences("sp", 0);
                                                                                                                                    q5.i.b(sharedPreferences);
                                                                                                                                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                                                                                                    editorEdit.putBoolean("sate_compass", z6);
                                                                                                                                    editorEdit.apply();
                                                                                                                                }
                                                                                                                            });
                                                                                                                            h hVar9 = this.b0;
                                                                                                                            if (hVar9 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            TextView textView17 = hVar9.f2281b;
                                                                                                                            C().f3943d.e(this, new j(new Q4.f(textView17, 3), 4));
                                                                                                                            final int i7 = 2;
                                                                                                                            textView17.setOnClickListener(new View.OnClickListener(this) { // from class: V4.e

                                                                                                                                /* renamed from: b, reason: collision with root package name */
                                                                                                                                public final /* synthetic */ SatelliteActivity f3885b;

                                                                                                                                {
                                                                                                                                    this.f3885b = this;
                                                                                                                                }

                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                public final void onClick(View view) {
                                                                                                                                    int i62 = i7;
                                                                                                                                    SatelliteActivity satelliteActivity = this.f3885b;
                                                                                                                                    switch (i62) {
                                                                                                                                        case 0:
                                                                                                                                            int i72 = SatelliteActivity.f19187g0;
                                                                                                                                            new q().f0(satelliteActivity.s(), "satellite_list_dialog");
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            int i8 = SatelliteActivity.f19187g0;
                                                                                                                                            Object objD = satelliteActivity.C().f3948j.d();
                                                                                                                                            Boolean bool = Boolean.FALSE;
                                                                                                                                            if (!q5.i.a(objD, bool)) {
                                                                                                                                                if (q5.i.a(satelliteActivity.C().f3950l.d(), bool)) {
                                                                                                                                                    MyApplication.f18812d = true;
                                                                                                                                                    satelliteActivity.startActivity(com.bumptech.glide.d.x(satelliteActivity, "android.settings.LOCATION_SOURCE_SETTINGS"));
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                try {
                                                                                                                                                    satelliteActivity.f19202d0 = System.currentTimeMillis();
                                                                                                                                                    satelliteActivity.f19203e0.a(satelliteActivity.f19200a0);
                                                                                                                                                    break;
                                                                                                                                                } catch (Throwable th) {
                                                                                                                                                    R2.a.d(th);
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            int i9 = SatelliteActivity.f19187g0;
                                                                                                                                            if (satelliteActivity.C().f3943d.d() != null) {
                                                                                                                                                K kS = satelliteActivity.s();
                                                                                                                                                String str = (String) satelliteActivity.C().f3943d.d();
                                                                                                                                                String string = satelliteActivity.getString(R.string.address_title);
                                                                                                                                                if (kS != null) {
                                                                                                                                                    A a6 = new A();
                                                                                                                                                    a6.f687A0 = str;
                                                                                                                                                    a6.f688B0 = string;
                                                                                                                                                    a6.e0(kS, "share_copy_dialog");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            int i10 = SatelliteActivity.f19187g0;
                                                                                                                                            satelliteActivity.finish();
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            int i11 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_country));
                                                                                                                                            break;
                                                                                                                                        case 5:
                                                                                                                                            int i12 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_id));
                                                                                                                                            break;
                                                                                                                                        case 6:
                                                                                                                                            int i13 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_azimuth));
                                                                                                                                            break;
                                                                                                                                        case 7:
                                                                                                                                            int i14 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_elevation));
                                                                                                                                            break;
                                                                                                                                        case 8:
                                                                                                                                            int i15 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_carrier_frequency_hz));
                                                                                                                                            break;
                                                                                                                                        case 9:
                                                                                                                                            int i16 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_available));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            int i17 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, Build.VERSION.SDK_INT >= 24 ? satelliteActivity.getString(R.string.tip_satellite_signal_n) : satelliteActivity.getString(R.string.tip_satellite_signal));
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                            h hVar10 = this.b0;
                                                                                                                            if (hVar10 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            MaterialCardView materialCardView2 = hVar10.f2286g;
                                                                                                                            if (hVar10 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            TextView textView18 = hVar10.f2288j;
                                                                                                                            C().f3952n.e(this, new j(new V4.j(materialCardView2, this, textView18, 0), 4));
                                                                                                                            C().f3950l.e(this, new j(new V4.j(materialCardView2, textView18, this), 4));
                                                                                                                            C().f3948j.e(this, new j(new V4.j(materialCardView2, this, textView18, 2), 4));
                                                                                                                            h hVar11 = this.b0;
                                                                                                                            if (hVar11 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final int i8 = 4;
                                                                                                                            hVar11.f2276K.setOnClickListener(new View.OnClickListener(this) { // from class: V4.e

                                                                                                                                /* renamed from: b, reason: collision with root package name */
                                                                                                                                public final /* synthetic */ SatelliteActivity f3885b;

                                                                                                                                {
                                                                                                                                    this.f3885b = this;
                                                                                                                                }

                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                public final void onClick(View view) {
                                                                                                                                    int i62 = i8;
                                                                                                                                    SatelliteActivity satelliteActivity = this.f3885b;
                                                                                                                                    switch (i62) {
                                                                                                                                        case 0:
                                                                                                                                            int i72 = SatelliteActivity.f19187g0;
                                                                                                                                            new q().f0(satelliteActivity.s(), "satellite_list_dialog");
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            int i82 = SatelliteActivity.f19187g0;
                                                                                                                                            Object objD = satelliteActivity.C().f3948j.d();
                                                                                                                                            Boolean bool = Boolean.FALSE;
                                                                                                                                            if (!q5.i.a(objD, bool)) {
                                                                                                                                                if (q5.i.a(satelliteActivity.C().f3950l.d(), bool)) {
                                                                                                                                                    MyApplication.f18812d = true;
                                                                                                                                                    satelliteActivity.startActivity(com.bumptech.glide.d.x(satelliteActivity, "android.settings.LOCATION_SOURCE_SETTINGS"));
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                try {
                                                                                                                                                    satelliteActivity.f19202d0 = System.currentTimeMillis();
                                                                                                                                                    satelliteActivity.f19203e0.a(satelliteActivity.f19200a0);
                                                                                                                                                    break;
                                                                                                                                                } catch (Throwable th) {
                                                                                                                                                    R2.a.d(th);
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            int i9 = SatelliteActivity.f19187g0;
                                                                                                                                            if (satelliteActivity.C().f3943d.d() != null) {
                                                                                                                                                K kS = satelliteActivity.s();
                                                                                                                                                String str = (String) satelliteActivity.C().f3943d.d();
                                                                                                                                                String string = satelliteActivity.getString(R.string.address_title);
                                                                                                                                                if (kS != null) {
                                                                                                                                                    A a6 = new A();
                                                                                                                                                    a6.f687A0 = str;
                                                                                                                                                    a6.f688B0 = string;
                                                                                                                                                    a6.e0(kS, "share_copy_dialog");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            int i10 = SatelliteActivity.f19187g0;
                                                                                                                                            satelliteActivity.finish();
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            int i11 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_country));
                                                                                                                                            break;
                                                                                                                                        case 5:
                                                                                                                                            int i12 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_id));
                                                                                                                                            break;
                                                                                                                                        case 6:
                                                                                                                                            int i13 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_azimuth));
                                                                                                                                            break;
                                                                                                                                        case 7:
                                                                                                                                            int i14 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_elevation));
                                                                                                                                            break;
                                                                                                                                        case 8:
                                                                                                                                            int i15 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_carrier_frequency_hz));
                                                                                                                                            break;
                                                                                                                                        case 9:
                                                                                                                                            int i16 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_available));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            int i17 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, Build.VERSION.SDK_INT >= 24 ? satelliteActivity.getString(R.string.tip_satellite_signal_n) : satelliteActivity.getString(R.string.tip_satellite_signal));
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                            h hVar12 = this.b0;
                                                                                                                            if (hVar12 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final int i9 = 5;
                                                                                                                            hVar12.M.setOnClickListener(new View.OnClickListener(this) { // from class: V4.e

                                                                                                                                /* renamed from: b, reason: collision with root package name */
                                                                                                                                public final /* synthetic */ SatelliteActivity f3885b;

                                                                                                                                {
                                                                                                                                    this.f3885b = this;
                                                                                                                                }

                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                public final void onClick(View view) {
                                                                                                                                    int i62 = i9;
                                                                                                                                    SatelliteActivity satelliteActivity = this.f3885b;
                                                                                                                                    switch (i62) {
                                                                                                                                        case 0:
                                                                                                                                            int i72 = SatelliteActivity.f19187g0;
                                                                                                                                            new q().f0(satelliteActivity.s(), "satellite_list_dialog");
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            int i82 = SatelliteActivity.f19187g0;
                                                                                                                                            Object objD = satelliteActivity.C().f3948j.d();
                                                                                                                                            Boolean bool = Boolean.FALSE;
                                                                                                                                            if (!q5.i.a(objD, bool)) {
                                                                                                                                                if (q5.i.a(satelliteActivity.C().f3950l.d(), bool)) {
                                                                                                                                                    MyApplication.f18812d = true;
                                                                                                                                                    satelliteActivity.startActivity(com.bumptech.glide.d.x(satelliteActivity, "android.settings.LOCATION_SOURCE_SETTINGS"));
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                try {
                                                                                                                                                    satelliteActivity.f19202d0 = System.currentTimeMillis();
                                                                                                                                                    satelliteActivity.f19203e0.a(satelliteActivity.f19200a0);
                                                                                                                                                    break;
                                                                                                                                                } catch (Throwable th) {
                                                                                                                                                    R2.a.d(th);
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            int i92 = SatelliteActivity.f19187g0;
                                                                                                                                            if (satelliteActivity.C().f3943d.d() != null) {
                                                                                                                                                K kS = satelliteActivity.s();
                                                                                                                                                String str = (String) satelliteActivity.C().f3943d.d();
                                                                                                                                                String string = satelliteActivity.getString(R.string.address_title);
                                                                                                                                                if (kS != null) {
                                                                                                                                                    A a6 = new A();
                                                                                                                                                    a6.f687A0 = str;
                                                                                                                                                    a6.f688B0 = string;
                                                                                                                                                    a6.e0(kS, "share_copy_dialog");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            int i10 = SatelliteActivity.f19187g0;
                                                                                                                                            satelliteActivity.finish();
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            int i11 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_country));
                                                                                                                                            break;
                                                                                                                                        case 5:
                                                                                                                                            int i12 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_id));
                                                                                                                                            break;
                                                                                                                                        case 6:
                                                                                                                                            int i13 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_azimuth));
                                                                                                                                            break;
                                                                                                                                        case 7:
                                                                                                                                            int i14 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_elevation));
                                                                                                                                            break;
                                                                                                                                        case 8:
                                                                                                                                            int i15 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_carrier_frequency_hz));
                                                                                                                                            break;
                                                                                                                                        case 9:
                                                                                                                                            int i16 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_available));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            int i17 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, Build.VERSION.SDK_INT >= 24 ? satelliteActivity.getString(R.string.tip_satellite_signal_n) : satelliteActivity.getString(R.string.tip_satellite_signal));
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                            h hVar13 = this.b0;
                                                                                                                            if (hVar13 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final int i10 = 6;
                                                                                                                            hVar13.f2274I.setOnClickListener(new View.OnClickListener(this) { // from class: V4.e

                                                                                                                                /* renamed from: b, reason: collision with root package name */
                                                                                                                                public final /* synthetic */ SatelliteActivity f3885b;

                                                                                                                                {
                                                                                                                                    this.f3885b = this;
                                                                                                                                }

                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                public final void onClick(View view) {
                                                                                                                                    int i62 = i10;
                                                                                                                                    SatelliteActivity satelliteActivity = this.f3885b;
                                                                                                                                    switch (i62) {
                                                                                                                                        case 0:
                                                                                                                                            int i72 = SatelliteActivity.f19187g0;
                                                                                                                                            new q().f0(satelliteActivity.s(), "satellite_list_dialog");
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            int i82 = SatelliteActivity.f19187g0;
                                                                                                                                            Object objD = satelliteActivity.C().f3948j.d();
                                                                                                                                            Boolean bool = Boolean.FALSE;
                                                                                                                                            if (!q5.i.a(objD, bool)) {
                                                                                                                                                if (q5.i.a(satelliteActivity.C().f3950l.d(), bool)) {
                                                                                                                                                    MyApplication.f18812d = true;
                                                                                                                                                    satelliteActivity.startActivity(com.bumptech.glide.d.x(satelliteActivity, "android.settings.LOCATION_SOURCE_SETTINGS"));
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                try {
                                                                                                                                                    satelliteActivity.f19202d0 = System.currentTimeMillis();
                                                                                                                                                    satelliteActivity.f19203e0.a(satelliteActivity.f19200a0);
                                                                                                                                                    break;
                                                                                                                                                } catch (Throwable th) {
                                                                                                                                                    R2.a.d(th);
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            int i92 = SatelliteActivity.f19187g0;
                                                                                                                                            if (satelliteActivity.C().f3943d.d() != null) {
                                                                                                                                                K kS = satelliteActivity.s();
                                                                                                                                                String str = (String) satelliteActivity.C().f3943d.d();
                                                                                                                                                String string = satelliteActivity.getString(R.string.address_title);
                                                                                                                                                if (kS != null) {
                                                                                                                                                    A a6 = new A();
                                                                                                                                                    a6.f687A0 = str;
                                                                                                                                                    a6.f688B0 = string;
                                                                                                                                                    a6.e0(kS, "share_copy_dialog");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            int i102 = SatelliteActivity.f19187g0;
                                                                                                                                            satelliteActivity.finish();
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            int i11 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_country));
                                                                                                                                            break;
                                                                                                                                        case 5:
                                                                                                                                            int i12 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_id));
                                                                                                                                            break;
                                                                                                                                        case 6:
                                                                                                                                            int i13 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_azimuth));
                                                                                                                                            break;
                                                                                                                                        case 7:
                                                                                                                                            int i14 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_elevation));
                                                                                                                                            break;
                                                                                                                                        case 8:
                                                                                                                                            int i15 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_carrier_frequency_hz));
                                                                                                                                            break;
                                                                                                                                        case 9:
                                                                                                                                            int i16 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_available));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            int i17 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, Build.VERSION.SDK_INT >= 24 ? satelliteActivity.getString(R.string.tip_satellite_signal_n) : satelliteActivity.getString(R.string.tip_satellite_signal));
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                            h hVar14 = this.b0;
                                                                                                                            if (hVar14 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final int i11 = 7;
                                                                                                                            hVar14.f2277L.setOnClickListener(new View.OnClickListener(this) { // from class: V4.e

                                                                                                                                /* renamed from: b, reason: collision with root package name */
                                                                                                                                public final /* synthetic */ SatelliteActivity f3885b;

                                                                                                                                {
                                                                                                                                    this.f3885b = this;
                                                                                                                                }

                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                public final void onClick(View view) {
                                                                                                                                    int i62 = i11;
                                                                                                                                    SatelliteActivity satelliteActivity = this.f3885b;
                                                                                                                                    switch (i62) {
                                                                                                                                        case 0:
                                                                                                                                            int i72 = SatelliteActivity.f19187g0;
                                                                                                                                            new q().f0(satelliteActivity.s(), "satellite_list_dialog");
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            int i82 = SatelliteActivity.f19187g0;
                                                                                                                                            Object objD = satelliteActivity.C().f3948j.d();
                                                                                                                                            Boolean bool = Boolean.FALSE;
                                                                                                                                            if (!q5.i.a(objD, bool)) {
                                                                                                                                                if (q5.i.a(satelliteActivity.C().f3950l.d(), bool)) {
                                                                                                                                                    MyApplication.f18812d = true;
                                                                                                                                                    satelliteActivity.startActivity(com.bumptech.glide.d.x(satelliteActivity, "android.settings.LOCATION_SOURCE_SETTINGS"));
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                try {
                                                                                                                                                    satelliteActivity.f19202d0 = System.currentTimeMillis();
                                                                                                                                                    satelliteActivity.f19203e0.a(satelliteActivity.f19200a0);
                                                                                                                                                    break;
                                                                                                                                                } catch (Throwable th) {
                                                                                                                                                    R2.a.d(th);
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            int i92 = SatelliteActivity.f19187g0;
                                                                                                                                            if (satelliteActivity.C().f3943d.d() != null) {
                                                                                                                                                K kS = satelliteActivity.s();
                                                                                                                                                String str = (String) satelliteActivity.C().f3943d.d();
                                                                                                                                                String string = satelliteActivity.getString(R.string.address_title);
                                                                                                                                                if (kS != null) {
                                                                                                                                                    A a6 = new A();
                                                                                                                                                    a6.f687A0 = str;
                                                                                                                                                    a6.f688B0 = string;
                                                                                                                                                    a6.e0(kS, "share_copy_dialog");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            int i102 = SatelliteActivity.f19187g0;
                                                                                                                                            satelliteActivity.finish();
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            int i112 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_country));
                                                                                                                                            break;
                                                                                                                                        case 5:
                                                                                                                                            int i12 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_id));
                                                                                                                                            break;
                                                                                                                                        case 6:
                                                                                                                                            int i13 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_azimuth));
                                                                                                                                            break;
                                                                                                                                        case 7:
                                                                                                                                            int i14 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_elevation));
                                                                                                                                            break;
                                                                                                                                        case 8:
                                                                                                                                            int i15 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_carrier_frequency_hz));
                                                                                                                                            break;
                                                                                                                                        case 9:
                                                                                                                                            int i16 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_available));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            int i17 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, Build.VERSION.SDK_INT >= 24 ? satelliteActivity.getString(R.string.tip_satellite_signal_n) : satelliteActivity.getString(R.string.tip_satellite_signal));
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                            h hVar15 = this.b0;
                                                                                                                            if (hVar15 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final int i12 = 8;
                                                                                                                            hVar15.f2275J.setOnClickListener(new View.OnClickListener(this) { // from class: V4.e

                                                                                                                                /* renamed from: b, reason: collision with root package name */
                                                                                                                                public final /* synthetic */ SatelliteActivity f3885b;

                                                                                                                                {
                                                                                                                                    this.f3885b = this;
                                                                                                                                }

                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                public final void onClick(View view) {
                                                                                                                                    int i62 = i12;
                                                                                                                                    SatelliteActivity satelliteActivity = this.f3885b;
                                                                                                                                    switch (i62) {
                                                                                                                                        case 0:
                                                                                                                                            int i72 = SatelliteActivity.f19187g0;
                                                                                                                                            new q().f0(satelliteActivity.s(), "satellite_list_dialog");
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            int i82 = SatelliteActivity.f19187g0;
                                                                                                                                            Object objD = satelliteActivity.C().f3948j.d();
                                                                                                                                            Boolean bool = Boolean.FALSE;
                                                                                                                                            if (!q5.i.a(objD, bool)) {
                                                                                                                                                if (q5.i.a(satelliteActivity.C().f3950l.d(), bool)) {
                                                                                                                                                    MyApplication.f18812d = true;
                                                                                                                                                    satelliteActivity.startActivity(com.bumptech.glide.d.x(satelliteActivity, "android.settings.LOCATION_SOURCE_SETTINGS"));
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                try {
                                                                                                                                                    satelliteActivity.f19202d0 = System.currentTimeMillis();
                                                                                                                                                    satelliteActivity.f19203e0.a(satelliteActivity.f19200a0);
                                                                                                                                                    break;
                                                                                                                                                } catch (Throwable th) {
                                                                                                                                                    R2.a.d(th);
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            int i92 = SatelliteActivity.f19187g0;
                                                                                                                                            if (satelliteActivity.C().f3943d.d() != null) {
                                                                                                                                                K kS = satelliteActivity.s();
                                                                                                                                                String str = (String) satelliteActivity.C().f3943d.d();
                                                                                                                                                String string = satelliteActivity.getString(R.string.address_title);
                                                                                                                                                if (kS != null) {
                                                                                                                                                    A a6 = new A();
                                                                                                                                                    a6.f687A0 = str;
                                                                                                                                                    a6.f688B0 = string;
                                                                                                                                                    a6.e0(kS, "share_copy_dialog");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            int i102 = SatelliteActivity.f19187g0;
                                                                                                                                            satelliteActivity.finish();
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            int i112 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_country));
                                                                                                                                            break;
                                                                                                                                        case 5:
                                                                                                                                            int i122 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_id));
                                                                                                                                            break;
                                                                                                                                        case 6:
                                                                                                                                            int i13 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_azimuth));
                                                                                                                                            break;
                                                                                                                                        case 7:
                                                                                                                                            int i14 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_elevation));
                                                                                                                                            break;
                                                                                                                                        case 8:
                                                                                                                                            int i15 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_carrier_frequency_hz));
                                                                                                                                            break;
                                                                                                                                        case 9:
                                                                                                                                            int i16 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_available));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            int i17 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, Build.VERSION.SDK_INT >= 24 ? satelliteActivity.getString(R.string.tip_satellite_signal_n) : satelliteActivity.getString(R.string.tip_satellite_signal));
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                            h hVar16 = this.b0;
                                                                                                                            if (hVar16 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final int i13 = 9;
                                                                                                                            hVar16.f2273H.setOnClickListener(new View.OnClickListener(this) { // from class: V4.e

                                                                                                                                /* renamed from: b, reason: collision with root package name */
                                                                                                                                public final /* synthetic */ SatelliteActivity f3885b;

                                                                                                                                {
                                                                                                                                    this.f3885b = this;
                                                                                                                                }

                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                public final void onClick(View view) {
                                                                                                                                    int i62 = i13;
                                                                                                                                    SatelliteActivity satelliteActivity = this.f3885b;
                                                                                                                                    switch (i62) {
                                                                                                                                        case 0:
                                                                                                                                            int i72 = SatelliteActivity.f19187g0;
                                                                                                                                            new q().f0(satelliteActivity.s(), "satellite_list_dialog");
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            int i82 = SatelliteActivity.f19187g0;
                                                                                                                                            Object objD = satelliteActivity.C().f3948j.d();
                                                                                                                                            Boolean bool = Boolean.FALSE;
                                                                                                                                            if (!q5.i.a(objD, bool)) {
                                                                                                                                                if (q5.i.a(satelliteActivity.C().f3950l.d(), bool)) {
                                                                                                                                                    MyApplication.f18812d = true;
                                                                                                                                                    satelliteActivity.startActivity(com.bumptech.glide.d.x(satelliteActivity, "android.settings.LOCATION_SOURCE_SETTINGS"));
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                try {
                                                                                                                                                    satelliteActivity.f19202d0 = System.currentTimeMillis();
                                                                                                                                                    satelliteActivity.f19203e0.a(satelliteActivity.f19200a0);
                                                                                                                                                    break;
                                                                                                                                                } catch (Throwable th) {
                                                                                                                                                    R2.a.d(th);
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            int i92 = SatelliteActivity.f19187g0;
                                                                                                                                            if (satelliteActivity.C().f3943d.d() != null) {
                                                                                                                                                K kS = satelliteActivity.s();
                                                                                                                                                String str = (String) satelliteActivity.C().f3943d.d();
                                                                                                                                                String string = satelliteActivity.getString(R.string.address_title);
                                                                                                                                                if (kS != null) {
                                                                                                                                                    A a6 = new A();
                                                                                                                                                    a6.f687A0 = str;
                                                                                                                                                    a6.f688B0 = string;
                                                                                                                                                    a6.e0(kS, "share_copy_dialog");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            int i102 = SatelliteActivity.f19187g0;
                                                                                                                                            satelliteActivity.finish();
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            int i112 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_country));
                                                                                                                                            break;
                                                                                                                                        case 5:
                                                                                                                                            int i122 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_id));
                                                                                                                                            break;
                                                                                                                                        case 6:
                                                                                                                                            int i132 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_azimuth));
                                                                                                                                            break;
                                                                                                                                        case 7:
                                                                                                                                            int i14 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_elevation));
                                                                                                                                            break;
                                                                                                                                        case 8:
                                                                                                                                            int i15 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_carrier_frequency_hz));
                                                                                                                                            break;
                                                                                                                                        case 9:
                                                                                                                                            int i16 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_available));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            int i17 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, Build.VERSION.SDK_INT >= 24 ? satelliteActivity.getString(R.string.tip_satellite_signal_n) : satelliteActivity.getString(R.string.tip_satellite_signal));
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                            h hVar17 = this.b0;
                                                                                                                            if (hVar17 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            hVar17.f2278N.setText(Build.VERSION.SDK_INT >= 24 ? getString(R.string.satellite_noise) : getString(R.string.satellite_noise_n));
                                                                                                                            h hVar18 = this.b0;
                                                                                                                            if (hVar18 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final int i14 = 10;
                                                                                                                            hVar18.f2278N.setOnClickListener(new View.OnClickListener(this) { // from class: V4.e

                                                                                                                                /* renamed from: b, reason: collision with root package name */
                                                                                                                                public final /* synthetic */ SatelliteActivity f3885b;

                                                                                                                                {
                                                                                                                                    this.f3885b = this;
                                                                                                                                }

                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                public final void onClick(View view) {
                                                                                                                                    int i62 = i14;
                                                                                                                                    SatelliteActivity satelliteActivity = this.f3885b;
                                                                                                                                    switch (i62) {
                                                                                                                                        case 0:
                                                                                                                                            int i72 = SatelliteActivity.f19187g0;
                                                                                                                                            new q().f0(satelliteActivity.s(), "satellite_list_dialog");
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            int i82 = SatelliteActivity.f19187g0;
                                                                                                                                            Object objD = satelliteActivity.C().f3948j.d();
                                                                                                                                            Boolean bool = Boolean.FALSE;
                                                                                                                                            if (!q5.i.a(objD, bool)) {
                                                                                                                                                if (q5.i.a(satelliteActivity.C().f3950l.d(), bool)) {
                                                                                                                                                    MyApplication.f18812d = true;
                                                                                                                                                    satelliteActivity.startActivity(com.bumptech.glide.d.x(satelliteActivity, "android.settings.LOCATION_SOURCE_SETTINGS"));
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                try {
                                                                                                                                                    satelliteActivity.f19202d0 = System.currentTimeMillis();
                                                                                                                                                    satelliteActivity.f19203e0.a(satelliteActivity.f19200a0);
                                                                                                                                                    break;
                                                                                                                                                } catch (Throwable th) {
                                                                                                                                                    R2.a.d(th);
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            int i92 = SatelliteActivity.f19187g0;
                                                                                                                                            if (satelliteActivity.C().f3943d.d() != null) {
                                                                                                                                                K kS = satelliteActivity.s();
                                                                                                                                                String str = (String) satelliteActivity.C().f3943d.d();
                                                                                                                                                String string = satelliteActivity.getString(R.string.address_title);
                                                                                                                                                if (kS != null) {
                                                                                                                                                    A a6 = new A();
                                                                                                                                                    a6.f687A0 = str;
                                                                                                                                                    a6.f688B0 = string;
                                                                                                                                                    a6.e0(kS, "share_copy_dialog");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            int i102 = SatelliteActivity.f19187g0;
                                                                                                                                            satelliteActivity.finish();
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            int i112 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_country));
                                                                                                                                            break;
                                                                                                                                        case 5:
                                                                                                                                            int i122 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_id));
                                                                                                                                            break;
                                                                                                                                        case 6:
                                                                                                                                            int i132 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_azimuth));
                                                                                                                                            break;
                                                                                                                                        case 7:
                                                                                                                                            int i142 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_elevation));
                                                                                                                                            break;
                                                                                                                                        case 8:
                                                                                                                                            int i15 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_carrier_frequency_hz));
                                                                                                                                            break;
                                                                                                                                        case 9:
                                                                                                                                            int i16 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_available));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            int i17 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, Build.VERSION.SDK_INT >= 24 ? satelliteActivity.getString(R.string.tip_satellite_signal_n) : satelliteActivity.getString(R.string.tip_satellite_signal));
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                            h hVar19 = this.b0;
                                                                                                                            if (hVar19 == null) {
                                                                                                                                i.g("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            final int i15 = 0;
                                                                                                                            hVar19.f2287h.setOnClickListener(new View.OnClickListener(this) { // from class: V4.e

                                                                                                                                /* renamed from: b, reason: collision with root package name */
                                                                                                                                public final /* synthetic */ SatelliteActivity f3885b;

                                                                                                                                {
                                                                                                                                    this.f3885b = this;
                                                                                                                                }

                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                public final void onClick(View view) {
                                                                                                                                    int i62 = i15;
                                                                                                                                    SatelliteActivity satelliteActivity = this.f3885b;
                                                                                                                                    switch (i62) {
                                                                                                                                        case 0:
                                                                                                                                            int i72 = SatelliteActivity.f19187g0;
                                                                                                                                            new q().f0(satelliteActivity.s(), "satellite_list_dialog");
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            int i82 = SatelliteActivity.f19187g0;
                                                                                                                                            Object objD = satelliteActivity.C().f3948j.d();
                                                                                                                                            Boolean bool = Boolean.FALSE;
                                                                                                                                            if (!q5.i.a(objD, bool)) {
                                                                                                                                                if (q5.i.a(satelliteActivity.C().f3950l.d(), bool)) {
                                                                                                                                                    MyApplication.f18812d = true;
                                                                                                                                                    satelliteActivity.startActivity(com.bumptech.glide.d.x(satelliteActivity, "android.settings.LOCATION_SOURCE_SETTINGS"));
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                try {
                                                                                                                                                    satelliteActivity.f19202d0 = System.currentTimeMillis();
                                                                                                                                                    satelliteActivity.f19203e0.a(satelliteActivity.f19200a0);
                                                                                                                                                    break;
                                                                                                                                                } catch (Throwable th) {
                                                                                                                                                    R2.a.d(th);
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            int i92 = SatelliteActivity.f19187g0;
                                                                                                                                            if (satelliteActivity.C().f3943d.d() != null) {
                                                                                                                                                K kS = satelliteActivity.s();
                                                                                                                                                String str = (String) satelliteActivity.C().f3943d.d();
                                                                                                                                                String string = satelliteActivity.getString(R.string.address_title);
                                                                                                                                                if (kS != null) {
                                                                                                                                                    A a6 = new A();
                                                                                                                                                    a6.f687A0 = str;
                                                                                                                                                    a6.f688B0 = string;
                                                                                                                                                    a6.e0(kS, "share_copy_dialog");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            int i102 = SatelliteActivity.f19187g0;
                                                                                                                                            satelliteActivity.finish();
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            int i112 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_country));
                                                                                                                                            break;
                                                                                                                                        case 5:
                                                                                                                                            int i122 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_id));
                                                                                                                                            break;
                                                                                                                                        case 6:
                                                                                                                                            int i132 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_azimuth));
                                                                                                                                            break;
                                                                                                                                        case 7:
                                                                                                                                            int i142 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_elevation));
                                                                                                                                            break;
                                                                                                                                        case 8:
                                                                                                                                            int i152 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_carrier_frequency_hz));
                                                                                                                                            break;
                                                                                                                                        case 9:
                                                                                                                                            int i16 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, satelliteActivity.getString(R.string.tip_satellite_available));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            int i17 = SatelliteActivity.f19187g0;
                                                                                                                                            q5.i.b(view);
                                                                                                                                            B4.s.a(satelliteActivity, view, Build.VERSION.SDK_INT >= 24 ? satelliteActivity.getString(R.string.tip_satellite_signal_n) : satelliteActivity.getString(R.string.tip_satellite_signal));
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                            aVar.f4672f = new f(this);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f19199Z.c();
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onResume() {
        super.onResume();
        D d6 = C().f3951m;
        Boolean bool = Boolean.TRUE;
        d6.j(bool);
        String str = this.f19200a0;
        i.e(str, "string");
        if (G.c.a(this, str) != 0) {
            C().i.j(Boolean.FALSE);
        } else {
            this.f19199Z.b(this);
            C().i.j(bool);
        }
    }
}
