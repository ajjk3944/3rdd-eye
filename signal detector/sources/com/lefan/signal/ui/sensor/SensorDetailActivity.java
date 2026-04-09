package com.lefan.signal.ui.sensor;

import B4.g;
import B4.r;
import F4.e;
import W4.a;
import W4.b;
import W4.c;
import W4.d;
import a4.p;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import c.AbstractC0391p;
import com.apm.insight.R;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.ads.C1277hl;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.lefan.ads.banner.BannerView;
import h.AbstractActivityC2349g;
import java.util.Arrays;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class SensorDetailActivity extends AbstractActivityC2349g implements SensorEventListener {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f19251h0 = 0;

    /* renamed from: O, reason: collision with root package name */
    public C1277hl f19252O;

    /* renamed from: P, reason: collision with root package name */
    public SensorManager f19253P;

    /* renamed from: Q, reason: collision with root package name */
    public Sensor f19254Q;

    /* renamed from: R, reason: collision with root package name */
    public TemperatureView f19255R;

    /* renamed from: S, reason: collision with root package name */
    public a f19256S;

    /* renamed from: T, reason: collision with root package name */
    public b f19257T;

    /* renamed from: U, reason: collision with root package name */
    public d f19258U;

    /* renamed from: V, reason: collision with root package name */
    public c f19259V;

    /* renamed from: W, reason: collision with root package name */
    public TextView f19260W;

    /* renamed from: X, reason: collision with root package name */
    public TextView f19261X;

    /* renamed from: Y, reason: collision with root package name */
    public AppCompatImageView f19262Y;

    /* renamed from: Z, reason: collision with root package name */
    public TextView f19263Z;

    /* renamed from: a0, reason: collision with root package name */
    public TextView f19264a0;
    public TextView b0;

    /* renamed from: c0, reason: collision with root package name */
    public TextView f19265c0;

    /* renamed from: d0, reason: collision with root package name */
    public TextView f19266d0;

    /* renamed from: e0, reason: collision with root package name */
    public TextView f19267e0;

    /* renamed from: f0, reason: collision with root package name */
    public FrameLayout f19268f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f19269g0 = true;

    public static String C(float[] fArr) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (float f2 : fArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            Float fValueOf = Float.valueOf(f2);
            if (R2.a.f3390d) {
                Locale locale = e.f1457a;
                str = String.format(e.b(), "%.4f", Arrays.copyOf(new Object[]{fValueOf}, 1));
            } else {
                str = String.format(Locale.ENGLISH, "%.4f", Arrays.copyOf(new Object[]{fValueOf}, 1));
            }
            sb.append((CharSequence) str);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        com.bumptech.glide.d dVarR;
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_sensor_detail, (ViewGroup) null, false);
        int i = R.id.ad_view;
        if (((BannerView) p.e(R.id.ad_view, viewInflate)) != null) {
            i = R.id.app_bar;
            AppBarLayout appBarLayout = (AppBarLayout) p.e(R.id.app_bar, viewInflate);
            if (appBarLayout != null) {
                i = R.id.bottom_layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) p.e(R.id.bottom_layout, viewInflate);
                if (constraintLayout != null) {
                    i = R.id.custom_view;
                    FrameLayout frameLayout = (FrameLayout) p.e(R.id.custom_view, viewInflate);
                    if (frameLayout != null) {
                        i = R.id.net_scroll;
                        if (((NestedScrollView) p.e(R.id.net_scroll, viewInflate)) != null) {
                            i = R.id.sensor_img;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) p.e(R.id.sensor_img, viewInflate);
                            if (appCompatImageView != null) {
                                i = R.id.sensor_info;
                                TextView textView = (TextView) p.e(R.id.sensor_info, viewInflate);
                                if (textView != null) {
                                    i = R.id.sensor_maximumRange;
                                    TextView textView2 = (TextView) p.e(R.id.sensor_maximumRange, viewInflate);
                                    if (textView2 != null) {
                                        i = R.id.sensor_name;
                                        TextView textView3 = (TextView) p.e(R.id.sensor_name, viewInflate);
                                        if (textView3 != null) {
                                            i = R.id.sensor_power;
                                            TextView textView4 = (TextView) p.e(R.id.sensor_power, viewInflate);
                                            if (textView4 != null) {
                                                i = R.id.sensor_resolution;
                                                TextView textView5 = (TextView) p.e(R.id.sensor_resolution, viewInflate);
                                                if (textView5 != null) {
                                                    NestedScrollView nestedScrollView = (NestedScrollView) p.e(R.id.sensor_scroll, viewInflate);
                                                    i = R.id.sensor_value;
                                                    TextView textView6 = (TextView) p.e(R.id.sensor_value, viewInflate);
                                                    if (textView6 != null) {
                                                        i = R.id.sensor_ventor;
                                                        TextView textView7 = (TextView) p.e(R.id.sensor_ventor, viewInflate);
                                                        if (textView7 != null) {
                                                            i = R.id.sensor_version;
                                                            TextView textView8 = (TextView) p.e(R.id.sensor_version, viewInflate);
                                                            if (textView8 != null) {
                                                                i = R.id.start_btn;
                                                                MaterialButton materialButton = (MaterialButton) p.e(R.id.start_btn, viewInflate);
                                                                if (materialButton != null) {
                                                                    i = R.id.toolbar;
                                                                    Toolbar toolbar = (Toolbar) p.e(R.id.toolbar, viewInflate);
                                                                    if (toolbar != null) {
                                                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                                                                        this.f19252O = new C1277hl(linearLayoutCompat, appBarLayout, constraintLayout, frameLayout, appCompatImageView, textView, textView2, textView3, textView4, textView5, nestedScrollView, textView6, textView7, textView8, materialButton, toolbar);
                                                                        setContentView(linearLayoutCompat);
                                                                        C1277hl c1277hl = this.f19252O;
                                                                        if (c1277hl == null) {
                                                                            i.g("binding");
                                                                            throw null;
                                                                        }
                                                                        AppBarLayout appBarLayout2 = (AppBarLayout) c1277hl.f14545c;
                                                                        if (c1277hl == null) {
                                                                            i.g("binding");
                                                                            throw null;
                                                                        }
                                                                        F4.d.a(appBarLayout2, (ConstraintLayout) c1277hl.f14546d);
                                                                        C1277hl c1277hl2 = this.f19252O;
                                                                        if (c1277hl2 == null) {
                                                                            i.g("binding");
                                                                            throw null;
                                                                        }
                                                                        Toolbar toolbar2 = (Toolbar) c1277hl2.f14542E;
                                                                        B(toolbar2);
                                                                        com.bumptech.glide.d dVarR2 = r();
                                                                        if (dVarR2 != null) {
                                                                            dVarR2.S(true);
                                                                        }
                                                                        toolbar2.setNavigationOnClickListener(new g(22, this));
                                                                        int intExtra = getIntent().getIntExtra("sensor_type", -1);
                                                                        String stringExtra = getIntent().getStringExtra("sensor_name");
                                                                        if (stringExtra != null && (dVarR = r()) != null) {
                                                                            dVarR.X(stringExtra);
                                                                        }
                                                                        C1277hl c1277hl3 = this.f19252O;
                                                                        if (c1277hl3 == null) {
                                                                            i.g("binding");
                                                                            throw null;
                                                                        }
                                                                        this.f19260W = (TextView) c1277hl3.i;
                                                                        this.f19261X = (TextView) c1277hl3.f14549g;
                                                                        this.f19262Y = (AppCompatImageView) c1277hl3.f14548f;
                                                                        this.f19263Z = (TextView) c1277hl3.f14555n;
                                                                        this.f19264a0 = (TextView) c1277hl3.f14540C;
                                                                        this.b0 = (TextView) c1277hl3.f14550h;
                                                                        this.f19265c0 = (TextView) c1277hl3.f14552k;
                                                                        this.f19266d0 = (TextView) c1277hl3.f14551j;
                                                                        this.f19267e0 = (TextView) c1277hl3.f14554m;
                                                                        this.f19268f0 = (FrameLayout) c1277hl3.f14547e;
                                                                        MaterialButton materialButton2 = (MaterialButton) c1277hl3.f14541D;
                                                                        materialButton2.setOnClickListener(new r(this, 11, materialButton2));
                                                                        if (intExtra == -1) {
                                                                            F4.d.b(this, getString(R.string.device_not_support_this_sensor));
                                                                            return;
                                                                        }
                                                                        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
                                                                        this.f19253P = sensorManager;
                                                                        if (sensorManager == null) {
                                                                            F4.d.b(this, getString(R.string.not_support_sensor));
                                                                            return;
                                                                        }
                                                                        Sensor defaultSensor = sensorManager.getDefaultSensor(intExtra);
                                                                        this.f19254Q = defaultSensor;
                                                                        if (defaultSensor == null) {
                                                                            F4.d.b(this, getString(R.string.device_not_support_this_sensor));
                                                                            return;
                                                                        }
                                                                        TextView textView9 = this.f19260W;
                                                                        if (textView9 != null) {
                                                                            textView9.setText(defaultSensor.getName());
                                                                        }
                                                                        FrameLayout frameLayout2 = this.f19268f0;
                                                                        if (frameLayout2 != null) {
                                                                            frameLayout2.removeAllViews();
                                                                        }
                                                                        int type = defaultSensor.getType();
                                                                        switch (type) {
                                                                            case 1:
                                                                                AppCompatImageView appCompatImageView2 = this.f19262Y;
                                                                                if (appCompatImageView2 != null) {
                                                                                    appCompatImageView2.setImageResource(R.drawable.ic_accelerometer);
                                                                                }
                                                                                TextView textView10 = this.f19261X;
                                                                                if (textView10 != null) {
                                                                                    textView10.setText(getString(R.string.sensor_accelerometer));
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                AppCompatImageView appCompatImageView3 = this.f19262Y;
                                                                                if (appCompatImageView3 != null) {
                                                                                    appCompatImageView3.setImageResource(R.drawable.ic_magnetic);
                                                                                }
                                                                                TextView textView11 = this.f19261X;
                                                                                if (textView11 != null) {
                                                                                    textView11.setText(getString(R.string.sensor_magnetic_field));
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 3:
                                                                                AppCompatImageView appCompatImageView4 = this.f19262Y;
                                                                                if (appCompatImageView4 != null) {
                                                                                    appCompatImageView4.setImageResource(R.drawable.ic_orientation);
                                                                                }
                                                                                TextView textView12 = this.f19261X;
                                                                                if (textView12 != null) {
                                                                                    textView12.setText(getString(R.string.sensor_orientation));
                                                                                }
                                                                                b bVar = new b(this);
                                                                                this.f19257T = bVar;
                                                                                FrameLayout frameLayout3 = this.f19268f0;
                                                                                if (frameLayout3 != null) {
                                                                                    frameLayout3.addView(bVar);
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 4:
                                                                                AppCompatImageView appCompatImageView5 = this.f19262Y;
                                                                                if (appCompatImageView5 != null) {
                                                                                    appCompatImageView5.setImageResource(R.drawable.ic_gyroscope);
                                                                                }
                                                                                TextView textView13 = this.f19261X;
                                                                                if (textView13 != null) {
                                                                                    textView13.setText(getString(R.string.sensor_gyroscope));
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 5:
                                                                                AppCompatImageView appCompatImageView6 = this.f19262Y;
                                                                                if (appCompatImageView6 != null) {
                                                                                    appCompatImageView6.setImageResource(R.drawable.ic_light);
                                                                                }
                                                                                TextView textView14 = this.f19261X;
                                                                                if (textView14 != null) {
                                                                                    textView14.setText(getString(R.string.sensor_light));
                                                                                }
                                                                                a aVar = new a(this);
                                                                                this.f19256S = aVar;
                                                                                FrameLayout frameLayout4 = this.f19268f0;
                                                                                if (frameLayout4 != null) {
                                                                                    frameLayout4.addView(aVar);
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 6:
                                                                                AppCompatImageView appCompatImageView7 = this.f19262Y;
                                                                                if (appCompatImageView7 != null) {
                                                                                    appCompatImageView7.setImageResource(R.drawable.ic_pressure);
                                                                                }
                                                                                TextView textView15 = this.f19261X;
                                                                                if (textView15 != null) {
                                                                                    textView15.setText(getString(R.string.sensor_pressure));
                                                                                }
                                                                                d dVar = new d(this);
                                                                                this.f19258U = dVar;
                                                                                FrameLayout frameLayout5 = this.f19268f0;
                                                                                if (frameLayout5 != null) {
                                                                                    frameLayout5.addView(dVar);
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 7:
                                                                                AppCompatImageView appCompatImageView8 = this.f19262Y;
                                                                                if (appCompatImageView8 != null) {
                                                                                    appCompatImageView8.setImageResource(R.drawable.ic_temperature);
                                                                                }
                                                                                TextView textView16 = this.f19261X;
                                                                                if (textView16 != null) {
                                                                                    textView16.setText(getString(R.string.sensor_temperature));
                                                                                }
                                                                                TemperatureView temperatureView = new TemperatureView(this);
                                                                                this.f19255R = temperatureView;
                                                                                FrameLayout frameLayout6 = this.f19268f0;
                                                                                if (frameLayout6 != null) {
                                                                                    frameLayout6.addView(temperatureView);
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 8:
                                                                                AppCompatImageView appCompatImageView9 = this.f19262Y;
                                                                                if (appCompatImageView9 != null) {
                                                                                    appCompatImageView9.setImageResource(R.drawable.ic_proximity);
                                                                                }
                                                                                TextView textView17 = this.f19261X;
                                                                                if (textView17 != null) {
                                                                                    textView17.setText(getString(R.string.sensor_proximity));
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 9:
                                                                                AppCompatImageView appCompatImageView10 = this.f19262Y;
                                                                                if (appCompatImageView10 != null) {
                                                                                    appCompatImageView10.setImageResource(R.drawable.ic_gravity);
                                                                                }
                                                                                TextView textView18 = this.f19261X;
                                                                                if (textView18 != null) {
                                                                                    textView18.setText(getString(R.string.sensor_gravity));
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 10:
                                                                                AppCompatImageView appCompatImageView11 = this.f19262Y;
                                                                                if (appCompatImageView11 != null) {
                                                                                    appCompatImageView11.setImageResource(R.drawable.ic_linear_acceleration);
                                                                                }
                                                                                TextView textView19 = this.f19261X;
                                                                                if (textView19 != null) {
                                                                                    textView19.setText(getString(R.string.sensor_linear_acceleration));
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 11:
                                                                                AppCompatImageView appCompatImageView12 = this.f19262Y;
                                                                                if (appCompatImageView12 != null) {
                                                                                    appCompatImageView12.setImageResource(R.drawable.ic_rotation);
                                                                                }
                                                                                TextView textView20 = this.f19261X;
                                                                                if (textView20 != null) {
                                                                                    textView20.setText(getString(R.string.sensor_rotation_vector));
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 12:
                                                                                AppCompatImageView appCompatImageView13 = this.f19262Y;
                                                                                if (appCompatImageView13 != null) {
                                                                                    appCompatImageView13.setImageResource(R.drawable.ic_humidity);
                                                                                }
                                                                                TextView textView21 = this.f19261X;
                                                                                if (textView21 != null) {
                                                                                    textView21.setText(getString(R.string.sensor_relative_humidity));
                                                                                }
                                                                                c cVar = new c(this);
                                                                                this.f19259V = cVar;
                                                                                FrameLayout frameLayout7 = this.f19268f0;
                                                                                if (frameLayout7 != null) {
                                                                                    frameLayout7.addView(cVar);
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 13:
                                                                                AppCompatImageView appCompatImageView14 = this.f19262Y;
                                                                                if (appCompatImageView14 != null) {
                                                                                    appCompatImageView14.setImageResource(R.drawable.ic_temperature);
                                                                                }
                                                                                TextView textView22 = this.f19261X;
                                                                                if (textView22 != null) {
                                                                                    textView22.setText(getString(R.string.sensor_temperature));
                                                                                }
                                                                                TemperatureView temperatureView2 = new TemperatureView(this);
                                                                                this.f19255R = temperatureView2;
                                                                                FrameLayout frameLayout8 = this.f19268f0;
                                                                                if (frameLayout8 != null) {
                                                                                    frameLayout8.addView(temperatureView2);
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 14:
                                                                                AppCompatImageView appCompatImageView15 = this.f19262Y;
                                                                                if (appCompatImageView15 != null) {
                                                                                    appCompatImageView15.setImageResource(R.drawable.ic_magnetic);
                                                                                }
                                                                                TextView textView23 = this.f19261X;
                                                                                if (textView23 != null) {
                                                                                    textView23.setText(getString(R.string.sensor_magnetic_field_uncalibrated));
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 15:
                                                                                AppCompatImageView appCompatImageView16 = this.f19262Y;
                                                                                if (appCompatImageView16 != null) {
                                                                                    appCompatImageView16.setImageResource(R.drawable.ic_game);
                                                                                }
                                                                                TextView textView24 = this.f19261X;
                                                                                if (textView24 != null) {
                                                                                    textView24.setText(getString(R.string.sensor_game_rotation_vector_vector));
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 16:
                                                                                AppCompatImageView appCompatImageView17 = this.f19262Y;
                                                                                if (appCompatImageView17 != null) {
                                                                                    appCompatImageView17.setImageResource(R.drawable.ic_gyroscope);
                                                                                }
                                                                                TextView textView25 = this.f19261X;
                                                                                if (textView25 != null) {
                                                                                    textView25.setText(getString(R.string.sensor_gyroscope_uncaltibrated));
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 17:
                                                                                AppCompatImageView appCompatImageView18 = this.f19262Y;
                                                                                if (appCompatImageView18 != null) {
                                                                                    appCompatImageView18.setImageResource(R.drawable.ic_motion_detect);
                                                                                }
                                                                                TextView textView26 = this.f19261X;
                                                                                if (textView26 != null) {
                                                                                    textView26.setText(getString(R.string.sensor_significant_motion));
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 18:
                                                                                AppCompatImageView appCompatImageView19 = this.f19262Y;
                                                                                if (appCompatImageView19 != null) {
                                                                                    appCompatImageView19.setImageResource(R.drawable.ic_step);
                                                                                }
                                                                                TextView textView27 = this.f19261X;
                                                                                if (textView27 != null) {
                                                                                    textView27.setText(getString(R.string.sensor_step_detector));
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 19:
                                                                                AppCompatImageView appCompatImageView20 = this.f19262Y;
                                                                                if (appCompatImageView20 != null) {
                                                                                    appCompatImageView20.setImageResource(R.drawable.ic_step);
                                                                                }
                                                                                TextView textView28 = this.f19261X;
                                                                                if (textView28 != null) {
                                                                                    textView28.setText(getString(R.string.sensor_step_counter));
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 20:
                                                                                AppCompatImageView appCompatImageView21 = this.f19262Y;
                                                                                if (appCompatImageView21 != null) {
                                                                                    appCompatImageView21.setImageResource(R.drawable.ic_rotation);
                                                                                }
                                                                                TextView textView29 = this.f19261X;
                                                                                if (textView29 != null) {
                                                                                    textView29.setText(getString(R.string.sensor_geomagnetic_rotation_vector));
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 21:
                                                                                AppCompatImageView appCompatImageView22 = this.f19262Y;
                                                                                if (appCompatImageView22 != null) {
                                                                                    appCompatImageView22.setImageResource(R.drawable.ic_heart_rate);
                                                                                }
                                                                                TextView textView30 = this.f19261X;
                                                                                if (textView30 != null) {
                                                                                    textView30.setText(getString(R.string.sensor_heart_rate));
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                switch (type) {
                                                                                    case 28:
                                                                                        AppCompatImageView appCompatImageView23 = this.f19262Y;
                                                                                        if (appCompatImageView23 != null) {
                                                                                            appCompatImageView23.setImageResource(R.drawable.ic_pose_6dof);
                                                                                        }
                                                                                        TextView textView31 = this.f19261X;
                                                                                        if (textView31 != null) {
                                                                                            textView31.setText(getString(R.string.sensor_pose_6dof));
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 29:
                                                                                        AppCompatImageView appCompatImageView24 = this.f19262Y;
                                                                                        if (appCompatImageView24 != null) {
                                                                                            appCompatImageView24.setImageResource(R.drawable.ic_stationary_detect);
                                                                                        }
                                                                                        TextView textView32 = this.f19261X;
                                                                                        if (textView32 != null) {
                                                                                            textView32.setText(getString(R.string.sensor_stationary_detect));
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 30:
                                                                                        AppCompatImageView appCompatImageView25 = this.f19262Y;
                                                                                        if (appCompatImageView25 != null) {
                                                                                            appCompatImageView25.setImageResource(R.drawable.ic_motion_detect);
                                                                                        }
                                                                                        TextView textView33 = this.f19261X;
                                                                                        if (textView33 != null) {
                                                                                            textView33.setText(getString(R.string.sensor_motion_detect));
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 31:
                                                                                        AppCompatImageView appCompatImageView26 = this.f19262Y;
                                                                                        if (appCompatImageView26 != null) {
                                                                                            appCompatImageView26.setImageResource(R.drawable.ic_heart_beat);
                                                                                        }
                                                                                        TextView textView34 = this.f19261X;
                                                                                        if (textView34 != null) {
                                                                                            textView34.setText(getString(R.string.sensor_heart_beat));
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        switch (type) {
                                                                                            case 34:
                                                                                                AppCompatImageView appCompatImageView27 = this.f19262Y;
                                                                                                if (appCompatImageView27 != null) {
                                                                                                    appCompatImageView27.setImageResource(R.drawable.ic_low_latency_offbody_detect);
                                                                                                }
                                                                                                TextView textView35 = this.f19261X;
                                                                                                if (textView35 != null) {
                                                                                                    textView35.setText(getString(R.string.sensor_low_latency_offbody_detect));
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 35:
                                                                                                AppCompatImageView appCompatImageView28 = this.f19262Y;
                                                                                                if (appCompatImageView28 != null) {
                                                                                                    appCompatImageView28.setImageResource(R.drawable.ic_accelerometer);
                                                                                                }
                                                                                                TextView textView36 = this.f19261X;
                                                                                                if (textView36 != null) {
                                                                                                    textView36.setText(getString(R.string.sensor_accelerometer_uncalibrated));
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                                                                                                AppCompatImageView appCompatImageView29 = this.f19262Y;
                                                                                                if (appCompatImageView29 != null) {
                                                                                                    appCompatImageView29.setImageResource(R.drawable.ic_hinge_angle);
                                                                                                }
                                                                                                TextView textView37 = this.f19261X;
                                                                                                if (textView37 != null) {
                                                                                                    textView37.setText(getString(R.string.sensor_hinge_angle));
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 37:
                                                                                                AppCompatImageView appCompatImageView30 = this.f19262Y;
                                                                                                if (appCompatImageView30 != null) {
                                                                                                    appCompatImageView30.setImageResource(R.drawable.ic_head_tracker);
                                                                                                }
                                                                                                TextView textView38 = this.f19261X;
                                                                                                if (textView38 != null) {
                                                                                                    textView38.setText(getString(R.string.sensor_head_tracker));
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                                                                                                AppCompatImageView appCompatImageView31 = this.f19262Y;
                                                                                                if (appCompatImageView31 != null) {
                                                                                                    appCompatImageView31.setImageResource(R.drawable.ic_accelerometer);
                                                                                                }
                                                                                                TextView textView39 = this.f19261X;
                                                                                                if (textView39 != null) {
                                                                                                    textView39.setText(getString(R.string.sensor_accelerometer_limited_axes));
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                                                                                                AppCompatImageView appCompatImageView32 = this.f19262Y;
                                                                                                if (appCompatImageView32 != null) {
                                                                                                    appCompatImageView32.setImageResource(R.drawable.ic_gyroscope);
                                                                                                }
                                                                                                TextView textView40 = this.f19261X;
                                                                                                if (textView40 != null) {
                                                                                                    textView40.setText(getString(R.string.sensor_gyroscope_limited_axes));
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                                                                                                AppCompatImageView appCompatImageView33 = this.f19262Y;
                                                                                                if (appCompatImageView33 != null) {
                                                                                                    appCompatImageView33.setImageResource(R.drawable.ic_accelerometer);
                                                                                                }
                                                                                                TextView textView41 = this.f19261X;
                                                                                                if (textView41 != null) {
                                                                                                    textView41.setText(getString(R.string.sensor_accelerometer_limited_axes_uncalibrated));
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                                                                                                AppCompatImageView appCompatImageView34 = this.f19262Y;
                                                                                                if (appCompatImageView34 != null) {
                                                                                                    appCompatImageView34.setImageResource(R.drawable.ic_gyroscope);
                                                                                                }
                                                                                                TextView textView42 = this.f19261X;
                                                                                                if (textView42 != null) {
                                                                                                    textView42.setText(getString(R.string.sensor_gyroscope_limited_axes_uncalibrated));
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 42:
                                                                                                AppCompatImageView appCompatImageView35 = this.f19262Y;
                                                                                                if (appCompatImageView35 != null) {
                                                                                                    appCompatImageView35.setImageResource(R.drawable.ic_heading);
                                                                                                }
                                                                                                TextView textView43 = this.f19261X;
                                                                                                if (textView43 != null) {
                                                                                                    textView43.setText(getString(R.string.sensor_heading));
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                AppCompatImageView appCompatImageView36 = this.f19262Y;
                                                                                                if (appCompatImageView36 != null) {
                                                                                                    appCompatImageView36.setImageResource(R.drawable.ic_sensor);
                                                                                                }
                                                                                                TextView textView44 = this.f19261X;
                                                                                                if (textView44 != null) {
                                                                                                    textView44.setText(getString(R.string.default_value));
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                        }
                                                                                }
                                                                        }
                                                                        FrameLayout frameLayout9 = this.f19268f0;
                                                                        if (frameLayout9 != null && frameLayout9.getChildCount() != 0) {
                                                                            C1277hl c1277hl4 = this.f19252O;
                                                                            if (c1277hl4 == null) {
                                                                                i.g("binding");
                                                                                throw null;
                                                                            }
                                                                            NestedScrollView nestedScrollView2 = (NestedScrollView) c1277hl4.f14553l;
                                                                            if (nestedScrollView2 != null) {
                                                                                nestedScrollView2.setVisibility(0);
                                                                            }
                                                                        }
                                                                        TextView textView45 = this.f19263Z;
                                                                        if (textView45 != null) {
                                                                            textView45.setText(defaultSensor.getVendor());
                                                                        }
                                                                        TextView textView46 = this.f19264a0;
                                                                        if (textView46 != null) {
                                                                            Integer numValueOf = Integer.valueOf(defaultSensor.getVersion());
                                                                            if (R2.a.f3390d) {
                                                                                Locale locale = e.f1457a;
                                                                                str4 = String.format(e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                                                                            } else {
                                                                                str4 = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                                                                            }
                                                                            textView46.setText(str4);
                                                                        }
                                                                        TextView textView47 = this.b0;
                                                                        if (textView47 != null) {
                                                                            Float fValueOf = Float.valueOf(defaultSensor.getMaximumRange());
                                                                            if (R2.a.f3390d) {
                                                                                Locale locale2 = e.f1457a;
                                                                                str3 = String.format(e.b(), "%.1f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                                                                            } else {
                                                                                str3 = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{fValueOf}, 1));
                                                                            }
                                                                            textView47.setText(str3);
                                                                        }
                                                                        TextView textView48 = this.f19265c0;
                                                                        if (textView48 != null) {
                                                                            Float fValueOf2 = Float.valueOf(defaultSensor.getResolution());
                                                                            if (R2.a.f3390d) {
                                                                                Locale locale3 = e.f1457a;
                                                                                str2 = String.format(e.b(), "%.1f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                                                                            } else {
                                                                                str2 = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{fValueOf2}, 1));
                                                                            }
                                                                            textView48.setText(str2);
                                                                        }
                                                                        TextView textView49 = this.f19266d0;
                                                                        if (textView49 != null) {
                                                                            Float fValueOf3 = Float.valueOf(defaultSensor.getPower());
                                                                            if (R2.a.f3390d) {
                                                                                Locale locale4 = e.f1457a;
                                                                                str = String.format(e.b(), "%.1f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                                                                            } else {
                                                                                str = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{fValueOf3}, 1));
                                                                            }
                                                                            textView49.setText(str);
                                                                            return;
                                                                        }
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onPause() {
        super.onPause();
        SensorManager sensorManager = this.f19253P;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            SensorManager sensorManager = this.f19253P;
            if (sensorManager != null) {
                sensorManager.registerListener(this, this.f19254Q, 3);
            }
        } catch (Throwable th) {
            R2.a.d(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:7:0x0009, B:19:0x0025, B:21:0x0029, B:24:0x003c, B:26:0x0040, B:28:0x004e, B:30:0x006f, B:29:0x0061, B:31:0x0072, B:33:0x0076, B:34:0x007f, B:36:0x0083, B:38:0x0091, B:40:0x00b2, B:39:0x00a4, B:41:0x00b5, B:43:0x00b9, B:44:0x00c2, B:46:0x00c6, B:48:0x00d4, B:50:0x00f5, B:49:0x00e7, B:51:0x00f8, B:53:0x00fc, B:54:0x0105, B:56:0x0109, B:58:0x0124, B:60:0x0149, B:59:0x0139, B:61:0x014c, B:63:0x0150, B:64:0x0158, B:66:0x015c, B:68:0x016a, B:70:0x018b, B:69:0x017d, B:71:0x018e, B:73:0x0192, B:76:0x01a4), top: B:82:0x0009 }] */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSensorChanged(android.hardware.SensorEvent r10) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.sensor.SensorDetailActivity.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
