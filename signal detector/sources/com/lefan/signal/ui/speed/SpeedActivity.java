package com.lefan.signal.ui.speed;

import F4.b;
import F4.c;
import K4.i;
import V4.a;
import V4.d;
import V4.l;
import a4.p;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import c.AbstractC0391p;
import com.apm.insight.R;
import com.bumptech.glide.e;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.lefan.signal.ui.satellite.SatelliteView;
import e.C2291h;
import f.C2314a;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class SpeedActivity extends AbstractActivityC2349g implements a {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f19295f0 = 0;

    /* renamed from: O, reason: collision with root package name */
    public i f19296O;

    /* renamed from: S, reason: collision with root package name */
    public MaterialCardView f19300S;

    /* renamed from: T, reason: collision with root package name */
    public TextView f19301T;

    /* renamed from: U, reason: collision with root package name */
    public TextView f19302U;

    /* renamed from: V, reason: collision with root package name */
    public TextView f19303V;

    /* renamed from: W, reason: collision with root package name */
    public TextView f19304W;

    /* renamed from: X, reason: collision with root package name */
    public TextView f19305X;

    /* renamed from: Y, reason: collision with root package name */
    public SatelliteView f19306Y;

    /* renamed from: Z, reason: collision with root package name */
    public SpeedView f19307Z;

    /* renamed from: a0, reason: collision with root package name */
    public CompassView2 f19308a0;
    public SpeedTrendView b0;

    /* renamed from: c0, reason: collision with root package name */
    public long f19309c0;

    /* renamed from: P, reason: collision with root package name */
    public final String f19297P = "android.permission.ACCESS_FINE_LOCATION";

    /* renamed from: Q, reason: collision with root package name */
    public final d f19298Q = new d();

    /* renamed from: R, reason: collision with root package name */
    public String f19299R = "KM/H";

    /* renamed from: d0, reason: collision with root package name */
    public final C2291h f19310d0 = (C2291h) p(new C2314a(2), new c(16, this));

    /* renamed from: e0, reason: collision with root package name */
    public final C2291h f19311e0 = (C2291h) p(new C2314a(3), new b(22));

    public final void C(String str) {
        if (str.equals(this.f19299R)) {
            return;
        }
        this.f19299R = str;
        e.z(this, "speed_unit_string", str);
        SpeedView speedView = this.f19307Z;
        if (speedView != null) {
            speedView.setUnit(this.f19299R);
        }
        SpeedTrendView speedTrendView = this.b0;
        if (speedTrendView != null) {
            speedTrendView.setUnit(this.f19299R);
        }
        String str2 = this.f19299R;
        int iHashCode = str2.hashCode();
        if (iHashCode == 2403) {
            if (str2.equals("KN")) {
                i iVar = this.f19296O;
                if (iVar == null) {
                    q5.i.g("binding");
                    throw null;
                }
                iVar.f2307f.setTextColor(Color.parseColor("#999999"));
                i iVar2 = this.f19296O;
                if (iVar2 == null) {
                    q5.i.g("binding");
                    throw null;
                }
                iVar2.f2308g.setTextColor(Color.parseColor("#999999"));
                i iVar3 = this.f19296O;
                if (iVar3 == null) {
                    q5.i.g("binding");
                    throw null;
                }
                iVar3.i.setTextColor(Color.parseColor("#999999"));
                i iVar4 = this.f19296O;
                if (iVar4 == null) {
                    q5.i.g("binding");
                    throw null;
                }
                iVar4.f2310j.setTextColor(Color.parseColor("#999999"));
                i iVar5 = this.f19296O;
                if (iVar5 == null) {
                    q5.i.g("binding");
                    throw null;
                }
                iVar5.f2305d.setTextColor(Color.parseColor("#2196F3"));
                i iVar6 = this.f19296O;
                if (iVar6 != null) {
                    iVar6.f2306e.setTextColor(Color.parseColor("#2196F3"));
                    return;
                } else {
                    q5.i.g("binding");
                    throw null;
                }
            }
            return;
        }
        if (iHashCode == 76549) {
            if (str2.equals("MPH")) {
                i iVar7 = this.f19296O;
                if (iVar7 == null) {
                    q5.i.g("binding");
                    throw null;
                }
                iVar7.f2307f.setTextColor(Color.parseColor("#999999"));
                i iVar8 = this.f19296O;
                if (iVar8 == null) {
                    q5.i.g("binding");
                    throw null;
                }
                iVar8.f2308g.setTextColor(Color.parseColor("#999999"));
                i iVar9 = this.f19296O;
                if (iVar9 == null) {
                    q5.i.g("binding");
                    throw null;
                }
                iVar9.i.setTextColor(Color.parseColor("#2196F3"));
                i iVar10 = this.f19296O;
                if (iVar10 == null) {
                    q5.i.g("binding");
                    throw null;
                }
                iVar10.f2310j.setTextColor(Color.parseColor("#2196F3"));
                i iVar11 = this.f19296O;
                if (iVar11 == null) {
                    q5.i.g("binding");
                    throw null;
                }
                iVar11.f2305d.setTextColor(Color.parseColor("#999999"));
                i iVar12 = this.f19296O;
                if (iVar12 != null) {
                    iVar12.f2306e.setTextColor(Color.parseColor("#999999"));
                    return;
                } else {
                    q5.i.g("binding");
                    throw null;
                }
            }
            return;
        }
        if (iHashCode == 2309851 && str2.equals("KM/H")) {
            i iVar13 = this.f19296O;
            if (iVar13 == null) {
                q5.i.g("binding");
                throw null;
            }
            iVar13.f2307f.setTextColor(Color.parseColor("#2196F3"));
            i iVar14 = this.f19296O;
            if (iVar14 == null) {
                q5.i.g("binding");
                throw null;
            }
            iVar14.f2308g.setTextColor(Color.parseColor("#2196F3"));
            i iVar15 = this.f19296O;
            if (iVar15 == null) {
                q5.i.g("binding");
                throw null;
            }
            iVar15.i.setTextColor(Color.parseColor("#999999"));
            i iVar16 = this.f19296O;
            if (iVar16 == null) {
                q5.i.g("binding");
                throw null;
            }
            iVar16.f2310j.setTextColor(Color.parseColor("#999999"));
            i iVar17 = this.f19296O;
            if (iVar17 == null) {
                q5.i.g("binding");
                throw null;
            }
            iVar17.f2305d.setTextColor(Color.parseColor("#999999"));
            i iVar18 = this.f19296O;
            if (iVar18 != null) {
                iVar18.f2306e.setTextColor(Color.parseColor("#999999"));
            } else {
                q5.i.g("binding");
                throw null;
            }
        }
    }

    @Override // V4.a
    public final void b() {
        MaterialCardView materialCardView = this.f19300S;
        if (materialCardView != null) {
            materialCardView.setVisibility(0);
        }
        TextView textView = this.f19302U;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.f19301T;
        if (textView2 != null) {
            textView2.setText(getString(R.string.not_support_gps));
        }
    }

    @Override // V4.a
    public final void e(ArrayList arrayList) {
        String str;
        Spanned spannedFromHtml;
        String str2;
        String str3;
        Spanned spannedFromHtml2;
        String str4;
        q5.i.e(arrayList, "satelliteBeans");
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((l) obj).f3905a) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        SatelliteView satelliteView = this.f19306Y;
        if (satelliteView != null) {
            satelliteView.setSatellites(size2);
        }
        TextView textView = this.f19305X;
        if (textView != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                String string = getString(R.string.satellites_found);
                q5.i.d(string, "getString(...)");
                Integer numValueOf = Integer.valueOf(arrayList.size());
                if (R2.a.f3390d) {
                    Locale locale = F4.e.f1457a;
                    str4 = String.format(F4.e.b(), string, Arrays.copyOf(new Object[]{numValueOf}, 1));
                } else {
                    str4 = String.format(Locale.ENGLISH, string, Arrays.copyOf(new Object[]{numValueOf}, 1));
                }
                spannedFromHtml2 = Html.fromHtml(str4, 0);
            } else {
                String string2 = getString(R.string.satellites_found);
                q5.i.d(string2, "getString(...)");
                Integer numValueOf2 = Integer.valueOf(arrayList.size());
                if (R2.a.f3390d) {
                    Locale locale2 = F4.e.f1457a;
                    str3 = String.format(F4.e.b(), string2, Arrays.copyOf(new Object[]{numValueOf2}, 1));
                } else {
                    str3 = String.format(Locale.ENGLISH, string2, Arrays.copyOf(new Object[]{numValueOf2}, 1));
                }
                spannedFromHtml2 = Html.fromHtml(str3);
            }
            textView.setText(spannedFromHtml2);
        }
        TextView textView2 = this.f19304W;
        if (textView2 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                String string3 = getString(R.string.satellites_used);
                q5.i.d(string3, "getString(...)");
                Integer numValueOf3 = Integer.valueOf(size2);
                if (R2.a.f3390d) {
                    Locale locale3 = F4.e.f1457a;
                    str2 = String.format(F4.e.b(), string3, Arrays.copyOf(new Object[]{numValueOf3}, 1));
                } else {
                    str2 = String.format(Locale.ENGLISH, string3, Arrays.copyOf(new Object[]{numValueOf3}, 1));
                }
                spannedFromHtml = Html.fromHtml(str2, 0);
            } else {
                String string4 = getString(R.string.satellites_used);
                q5.i.d(string4, "getString(...)");
                Integer numValueOf4 = Integer.valueOf(size2);
                if (R2.a.f3390d) {
                    Locale locale4 = F4.e.f1457a;
                    str = String.format(F4.e.b(), string4, Arrays.copyOf(new Object[]{numValueOf4}, 1));
                } else {
                    str = String.format(Locale.ENGLISH, string4, Arrays.copyOf(new Object[]{numValueOf4}, 1));
                }
                spannedFromHtml = Html.fromHtml(str);
            }
            textView2.setText(spannedFromHtml);
        }
        if (size2 > 4) {
            TextView textView3 = this.f19303V;
            if (textView3 != null) {
                textView3.setText(getString(R.string.gps_fix_acquired));
                return;
            }
            return;
        }
        TextView textView4 = this.f19303V;
        if (textView4 != null) {
            textView4.setText(getString(R.string.gps_fix_weak));
        }
    }

    @Override // V4.a
    public final void h(boolean z6) {
        if (z6) {
            MaterialCardView materialCardView = this.f19300S;
            if (materialCardView != null) {
                materialCardView.setVisibility(8);
                return;
            }
            return;
        }
        MaterialCardView materialCardView2 = this.f19300S;
        if (materialCardView2 != null) {
            materialCardView2.setVisibility(0);
        }
        TextView textView = this.f19301T;
        if (textView != null) {
            textView.setText(getString(R.string.speed_need_gps));
        }
        TextView textView2 = this.f19302U;
        if (textView2 != null) {
            textView2.setOnClickListener(new X4.a(this, 5));
        }
    }

    @Override // V4.a
    public final void i(Location location) {
        CompassView2 compassView2 = this.f19308a0;
        if (compassView2 != null) {
            compassView2.setDirection(location.getBearing());
        }
        float speed = location.getSpeed() * 3.6f;
        SpeedView speedView = this.f19307Z;
        if (speedView != null) {
            speedView.setSpeed(speed);
        }
        SpeedTrendView speedTrendView = this.b0;
        if (speedTrendView != null) {
            speedTrendView.setSpeed(speed);
        }
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_speed, (ViewGroup) null, false);
        int i = R.id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) p.e(R.id.app_bar, viewInflate);
        if (appBarLayout != null) {
            i = R.id.bottom_layout;
            View viewE = p.e(R.id.bottom_layout, viewInflate);
            if (viewE != null) {
                i = R.id.compass_text;
                if (((TextView) p.e(R.id.compass_text, viewInflate)) != null) {
                    i = R.id.kn_t1;
                    TextView textView = (TextView) p.e(R.id.kn_t1, viewInflate);
                    if (textView != null) {
                        i = R.id.kn_t2;
                        TextView textView2 = (TextView) p.e(R.id.kn_t2, viewInflate);
                        if (textView2 != null) {
                            i = R.id.kph_t1;
                            TextView textView3 = (TextView) p.e(R.id.kph_t1, viewInflate);
                            if (textView3 != null) {
                                i = R.id.kph_t2;
                                TextView textView4 = (TextView) p.e(R.id.kph_t2, viewInflate);
                                if (textView4 != null) {
                                    i = R.id.location_perm_card;
                                    MaterialCardView materialCardView = (MaterialCardView) p.e(R.id.location_perm_card, viewInflate);
                                    if (materialCardView != null) {
                                        i = R.id.mph_t1;
                                        TextView textView5 = (TextView) p.e(R.id.mph_t1, viewInflate);
                                        if (textView5 != null) {
                                            i = R.id.mph_t2;
                                            TextView textView6 = (TextView) p.e(R.id.mph_t2, viewInflate);
                                            if (textView6 != null) {
                                                i = R.id.request_perm_btn;
                                                TextView textView7 = (TextView) p.e(R.id.request_perm_btn, viewInflate);
                                                if (textView7 != null) {
                                                    i = R.id.request_perm_text;
                                                    TextView textView8 = (TextView) p.e(R.id.request_perm_text, viewInflate);
                                                    if (textView8 != null) {
                                                        i = R.id.sate_found;
                                                        TextView textView9 = (TextView) p.e(R.id.sate_found, viewInflate);
                                                        if (textView9 != null) {
                                                            i = R.id.sate_used;
                                                            TextView textView10 = (TextView) p.e(R.id.sate_used, viewInflate);
                                                            if (textView10 != null) {
                                                                i = R.id.speed_direction;
                                                                CompassView2 compassView2 = (CompassView2) p.e(R.id.speed_direction, viewInflate);
                                                                if (compassView2 != null) {
                                                                    i = R.id.speed_gps_info;
                                                                    TextView textView11 = (TextView) p.e(R.id.speed_gps_info, viewInflate);
                                                                    if (textView11 != null) {
                                                                        i = R.id.speed_sate_view;
                                                                        SatelliteView satelliteView = (SatelliteView) p.e(R.id.speed_sate_view, viewInflate);
                                                                        if (satelliteView != null) {
                                                                            i = R.id.speed_speed;
                                                                            SpeedView speedView = (SpeedView) p.e(R.id.speed_speed, viewInflate);
                                                                            if (speedView != null) {
                                                                                i = R.id.speed_trend;
                                                                                SpeedTrendView speedTrendView = (SpeedTrendView) p.e(R.id.speed_trend, viewInflate);
                                                                                if (speedTrendView != null) {
                                                                                    i = R.id.speed_unit_liner;
                                                                                    if (((LinearLayoutCompat) p.e(R.id.speed_unit_liner, viewInflate)) != null) {
                                                                                        i = R.id.speed_unit_text;
                                                                                        if (((TextView) p.e(R.id.speed_unit_text, viewInflate)) != null) {
                                                                                            i = R.id.toolbar;
                                                                                            Toolbar toolbar = (Toolbar) p.e(R.id.toolbar, viewInflate);
                                                                                            if (toolbar != null) {
                                                                                                i = R.id.unit_kn;
                                                                                                LinearLayout linearLayout = (LinearLayout) p.e(R.id.unit_kn, viewInflate);
                                                                                                if (linearLayout != null) {
                                                                                                    i = R.id.unit_kph;
                                                                                                    LinearLayout linearLayout2 = (LinearLayout) p.e(R.id.unit_kph, viewInflate);
                                                                                                    if (linearLayout2 != null) {
                                                                                                        i = R.id.unit_mph;
                                                                                                        LinearLayout linearLayout3 = (LinearLayout) p.e(R.id.unit_mph, viewInflate);
                                                                                                        if (linearLayout3 != null) {
                                                                                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                                                                                                            this.f19296O = new i(linearLayoutCompat, appBarLayout, viewE, textView, textView2, textView3, textView4, materialCardView, textView5, textView6, textView7, textView8, textView9, textView10, compassView2, textView11, satelliteView, speedView, speedTrendView, toolbar, linearLayout, linearLayout2, linearLayout3);
                                                                                                            setContentView(linearLayoutCompat);
                                                                                                            i iVar = this.f19296O;
                                                                                                            if (iVar == null) {
                                                                                                                q5.i.g("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            AppBarLayout appBarLayout2 = iVar.f2303b;
                                                                                                            if (iVar == null) {
                                                                                                                q5.i.g("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            F4.d.a(appBarLayout2, iVar.f2304c);
                                                                                                            i iVar2 = this.f19296O;
                                                                                                            if (iVar2 == null) {
                                                                                                                q5.i.g("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            Toolbar toolbar2 = iVar2.f2298H;
                                                                                                            B(toolbar2);
                                                                                                            com.bumptech.glide.d dVarR = r();
                                                                                                            if (dVarR != null) {
                                                                                                                dVarR.S(true);
                                                                                                            }
                                                                                                            toolbar2.setNavigationOnClickListener(new X4.a(this, 0));
                                                                                                            i iVar3 = this.f19296O;
                                                                                                            if (iVar3 == null) {
                                                                                                                q5.i.g("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            this.f19306Y = iVar3.f2295E;
                                                                                                            this.f19305X = iVar3.f2313m;
                                                                                                            this.f19304W = iVar3.f2314n;
                                                                                                            this.f19303V = iVar3.f2294D;
                                                                                                            this.f19308a0 = iVar3.f2293C;
                                                                                                            this.f19307Z = iVar3.f2296F;
                                                                                                            this.b0 = iVar3.f2297G;
                                                                                                            this.f19300S = iVar3.f2309h;
                                                                                                            this.f19302U = iVar3.f2311k;
                                                                                                            this.f19301T = iVar3.f2312l;
                                                                                                            String string = getSharedPreferences("sp", 0).getString("speed_unit_string", "KM/H");
                                                                                                            C(string != null ? string : "KM/H");
                                                                                                            i iVar4 = this.f19296O;
                                                                                                            if (iVar4 == null) {
                                                                                                                q5.i.g("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            iVar4.f2300J.setOnClickListener(new X4.a(this, 1));
                                                                                                            i iVar5 = this.f19296O;
                                                                                                            if (iVar5 == null) {
                                                                                                                q5.i.g("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            iVar5.f2301K.setOnClickListener(new X4.a(this, 2));
                                                                                                            i iVar6 = this.f19296O;
                                                                                                            if (iVar6 == null) {
                                                                                                                q5.i.g("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            iVar6.f2299I.setOnClickListener(new X4.a(this, 3));
                                                                                                            d dVar = this.f19298Q;
                                                                                                            dVar.getClass();
                                                                                                            dVar.f3880b = this;
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

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f19298Q.c();
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f19297P;
        q5.i.e(str, "string");
        if (G.c.a(this, str) == 0) {
            this.f19298Q.b(this);
            MaterialCardView materialCardView = this.f19300S;
            if (materialCardView != null) {
                materialCardView.setVisibility(8);
                return;
            }
            return;
        }
        MaterialCardView materialCardView2 = this.f19300S;
        if (materialCardView2 != null) {
            materialCardView2.setVisibility(0);
        }
        TextView textView = this.f19301T;
        if (textView != null) {
            textView.setText(getString(R.string.speed_need_location));
        }
        TextView textView2 = this.f19302U;
        if (textView2 != null) {
            textView2.setOnClickListener(new X4.a(this, 4));
        }
    }
}
