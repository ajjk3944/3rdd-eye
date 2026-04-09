package com.lefan.signal.ui.sensor;

import B4.g;
import E.h;
import F4.c;
import F4.d;
import K4.f;
import N4.j;
import W4.e;
import a4.p;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import c.AbstractC0391p;
import com.apm.insight.R;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.material.appbar.AppBarLayout;
import com.lefan.base.activity.HelpActivity;
import d5.o;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import java.util.List;
import q5.i;

/* loaded from: classes.dex */
public final class SensorActivity extends AbstractActivityC2349g {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f19247R = 0;

    /* renamed from: O, reason: collision with root package name */
    public f f19248O;

    /* renamed from: P, reason: collision with root package name */
    public final j f19249P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f19250Q;

    public SensorActivity() {
        j jVar = new j(1);
        jVar.q(-99, R.layout.item_sensor_header);
        jVar.q(-100, R.layout.item_sensor);
        this.f19249P = jVar;
        this.f19250Q = new ArrayList();
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_sensor, (ViewGroup) null, false);
        int i = R.id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) p.e(R.id.app_bar, viewInflate);
        if (appBarLayout != null) {
            i = R.id.sensor_recycler;
            RecyclerView recyclerView = (RecyclerView) p.e(R.id.sensor_recycler, viewInflate);
            if (recyclerView != null) {
                i = R.id.toolbar;
                Toolbar toolbar = (Toolbar) p.e(R.id.toolbar, viewInflate);
                if (toolbar != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                    this.f19248O = new f(linearLayoutCompat, appBarLayout, recyclerView, toolbar);
                    setContentView(linearLayoutCompat);
                    f fVar = this.f19248O;
                    if (fVar == null) {
                        i.g("binding");
                        throw null;
                    }
                    AppBarLayout appBarLayout2 = fVar.f2252c;
                    if (fVar == null) {
                        i.g("binding");
                        throw null;
                    }
                    d.a(appBarLayout2, fVar.f2253d);
                    f fVar2 = this.f19248O;
                    if (fVar2 == null) {
                        i.g("binding");
                        throw null;
                    }
                    Toolbar toolbar2 = fVar2.f2254e;
                    B(toolbar2);
                    com.bumptech.glide.d dVarR = r();
                    if (dVarR != null) {
                        dVarR.S(true);
                    }
                    toolbar2.setNavigationOnClickListener(new g(21, this));
                    f fVar3 = this.f19248O;
                    if (fVar3 == null) {
                        i.g("binding");
                        throw null;
                    }
                    RecyclerView recyclerView2 = fVar3.f2253d;
                    j jVar = this.f19249P;
                    recyclerView2.setAdapter(jVar);
                    jVar.n(R.layout.empty_sensor);
                    jVar.f4672f = new c(15, this);
                    SensorManager sensorManager = (SensorManager) getSystemService("sensor");
                    if (sensorManager == null) {
                        return;
                    }
                    List<Sensor> sensorList = sensorManager.getSensorList(-1);
                    ArrayList arrayList = this.f19250Q;
                    arrayList.clear();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    i.b(sensorList);
                    for (Sensor sensor : sensorList) {
                        i.b(sensor);
                        e eVar = new e(false);
                        eVar.f4104e = sensor.getType();
                        int type = sensor.getType();
                        switch (type) {
                            case 1:
                                eVar.f4102c = 0;
                                eVar.f4101b = getString(R.string.string_sensor_accelerometer);
                                eVar.f4103d = R.drawable.ic_accelerometer;
                                break;
                            case 2:
                                eVar.f4102c = 1;
                                eVar.f4101b = getString(R.string.string_sensor_magnetic_field_sensor);
                                eVar.f4103d = R.drawable.ic_magnetic;
                                break;
                            case 3:
                                eVar.f4102c = 1;
                                eVar.f4101b = getString(R.string.string_sensor_orientation_sensor_type);
                                eVar.f4103d = R.drawable.ic_orientation;
                                break;
                            case 4:
                                eVar.f4102c = 0;
                                eVar.f4101b = getString(R.string.string_sensor_gyroscope);
                                eVar.f4103d = R.drawable.ic_gyroscope;
                                break;
                            case 5:
                                eVar.f4102c = 2;
                                eVar.f4101b = getString(R.string.string_sensor_light_sensor);
                                eVar.f4103d = R.drawable.ic_light;
                                break;
                            case 6:
                                eVar.f4102c = 2;
                                eVar.f4101b = getString(R.string.string_sensor_pressure_sensor);
                                eVar.f4103d = R.drawable.ic_pressure;
                                break;
                            case 7:
                            case 13:
                                eVar.f4102c = 2;
                                eVar.f4101b = getString(R.string.string_sensor_temperature);
                                eVar.f4103d = R.drawable.ic_temperature;
                                break;
                            case 8:
                                eVar.f4102c = 1;
                                eVar.f4101b = getString(R.string.string_sensor_proximity_sensor_type);
                                eVar.f4103d = R.drawable.ic_proximity;
                                break;
                            case 9:
                                eVar.f4102c = 0;
                                eVar.f4101b = getString(R.string.string_sensor_gravity);
                                eVar.f4103d = R.drawable.ic_gravity;
                                break;
                            case 10:
                                eVar.f4102c = 0;
                                eVar.f4101b = getString(R.string.string_sensor_linear_acceleration_sensor);
                                eVar.f4103d = R.drawable.ic_linear_acceleration;
                                break;
                            case 11:
                                eVar.f4102c = 0;
                                eVar.f4101b = getString(R.string.string_sensor_rotation_vector);
                                eVar.f4103d = R.drawable.ic_rotation;
                                break;
                            case 12:
                                eVar.f4102c = 2;
                                eVar.f4101b = getString(R.string.string_sensor_relative_humidity_sensor);
                                eVar.f4103d = R.drawable.ic_humidity;
                                break;
                            case 14:
                                eVar.f4102c = 1;
                                eVar.f4101b = getString(R.string.string_sensor_uncalibrated_magnetic_field_sensor);
                                eVar.f4103d = R.drawable.ic_magnetic;
                                break;
                            case 15:
                                eVar.f4102c = 1;
                                eVar.f4101b = getString(R.string.string_sensor_game_rotation_vector);
                                eVar.f4103d = R.drawable.ic_game;
                                break;
                            case 16:
                                eVar.f4102c = 0;
                                eVar.f4101b = getString(R.string.string_sensor_uncalibrated_gyroscope);
                                eVar.f4103d = R.drawable.ic_gyroscope;
                                break;
                            case 17:
                                eVar.f4102c = 0;
                                eVar.f4101b = getString(R.string.string_sensor_significant_motion_trigger_sensor);
                                eVar.f4103d = R.drawable.ic_motion_detect;
                                break;
                            case 18:
                                eVar.f4102c = 0;
                                eVar.f4101b = getString(R.string.string_sensor_step_detector_sensor);
                                eVar.f4103d = R.drawable.ic_step;
                                break;
                            case 19:
                                eVar.f4102c = 0;
                                eVar.f4101b = getString(R.string.string_sensor_step_counter_sensor);
                                eVar.f4103d = R.drawable.ic_step_counter;
                                break;
                            case 20:
                                eVar.f4102c = 1;
                                eVar.f4101b = getString(R.string.string_sensor_geomagnetic_rotation_vector);
                                eVar.f4103d = R.drawable.ic_geomagnetic;
                                break;
                            case 21:
                                eVar.f4103d = R.drawable.ic_heart_rate;
                                eVar.f4101b = getString(R.string.string_sensor_heart_rate);
                                break;
                            default:
                                switch (type) {
                                    case 28:
                                        eVar.f4103d = R.drawable.ic_pose_6dof;
                                        eVar.f4101b = getString(R.string.string_sensor_pose_6dof);
                                        break;
                                    case 29:
                                        eVar.f4103d = R.drawable.ic_stationary_detect;
                                        eVar.f4101b = getString(R.string.string_sensor_stationary_detect);
                                        break;
                                    case 30:
                                        eVar.f4103d = R.drawable.ic_motion_detect;
                                        eVar.f4101b = getString(R.string.string_sensor_motion_detect);
                                        break;
                                    case 31:
                                        eVar.f4103d = R.drawable.ic_heart_beat;
                                        eVar.f4101b = getString(R.string.string_sensor_heart_beat);
                                        break;
                                    default:
                                        switch (type) {
                                            case 34:
                                                eVar.f4103d = R.drawable.ic_low_latency_offbody_detect;
                                                eVar.f4101b = getString(R.string.string_sensor_low_latency_offbody_detect);
                                                break;
                                            case 35:
                                                eVar.f4102c = 0;
                                                eVar.f4101b = getString(R.string.string_sensor_accelerometer_uncalibrated);
                                                eVar.f4103d = R.drawable.ic_accelerometer;
                                                break;
                                            case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                                                eVar.f4103d = R.drawable.ic_hinge_angle;
                                                eVar.f4101b = getString(R.string.string_sensor_hinge_angle);
                                                break;
                                            case 37:
                                                eVar.f4103d = R.drawable.ic_head_tracker;
                                                eVar.f4101b = getString(R.string.string_sensor_head_tracker);
                                                break;
                                            case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                                                eVar.f4101b = getString(R.string.string_sensor_accelerometer_limited_axes);
                                                eVar.f4103d = R.drawable.ic_accelerometer;
                                                break;
                                            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                                                eVar.f4103d = R.drawable.ic_gyroscope;
                                                eVar.f4101b = getString(R.string.string_sensor_gyroscope_limited_axes);
                                                break;
                                            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                                                eVar.f4103d = R.drawable.ic_accelerometer;
                                                eVar.f4101b = getString(R.string.string_sensor_accelerometer_limited_axes_uncalibrated);
                                                break;
                                            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                                                eVar.f4103d = R.drawable.ic_gyroscope;
                                                eVar.f4101b = getString(R.string.string_sensor_gyroscope_limited_axes_uncalibrated);
                                                break;
                                            case 42:
                                                eVar.f4103d = R.drawable.ic_heading;
                                                eVar.f4101b = getString(R.string.string_sensor_heading);
                                                break;
                                            default:
                                                eVar.f4103d = R.drawable.ic_sensor;
                                                eVar.f4101b = sensor.getName();
                                                break;
                                        }
                                }
                        }
                        int i3 = eVar.f4102c;
                        if (i3 == -1) {
                            arrayList5.add(eVar);
                        } else if (i3 == 0) {
                            arrayList2.add(eVar);
                        } else if (i3 == 1) {
                            arrayList3.add(eVar);
                        } else if (i3 == 2) {
                            arrayList4.add(eVar);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        if (arrayList2.size() > 1) {
                            o.Q(arrayList2, new h(7));
                        }
                        e eVar2 = new e(true);
                        eVar2.f4102c = 0;
                        eVar2.f4101b = getString(R.string.sensors_motion);
                        arrayList2.add(0, eVar2);
                        arrayList.addAll(arrayList2);
                    }
                    if (!arrayList3.isEmpty()) {
                        if (arrayList3.size() > 1) {
                            o.Q(arrayList3, new h(8));
                        }
                        e eVar3 = new e(true);
                        eVar3.f4102c = 1;
                        eVar3.f4101b = getString(R.string.sensors_position);
                        arrayList3.add(0, eVar3);
                        arrayList.addAll(arrayList3);
                    }
                    if (!arrayList4.isEmpty()) {
                        if (arrayList4.size() > 1) {
                            o.Q(arrayList4, new h(9));
                        }
                        e eVar4 = new e(true);
                        eVar4.f4102c = 2;
                        eVar4.f4101b = getString(R.string.sensors_environment);
                        arrayList4.add(0, eVar4);
                        arrayList.addAll(arrayList4);
                    }
                    if (!arrayList5.isEmpty()) {
                        if (arrayList5.size() > 1) {
                            o.Q(arrayList5, new h(10));
                        }
                        e eVar5 = new e(true);
                        eVar5.f4102c = -1;
                        eVar5.f4101b = getString(R.string.sensors_other);
                        arrayList5.add(0, eVar5);
                        arrayList.addAll(arrayList5);
                    }
                    jVar.o(arrayList);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        i.e(menu, "menu");
        getMenuInflater().inflate(R.menu.activity_help, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.e(menuItem, "item");
        if (menuItem.getItemId() == R.id.action_help) {
            Intent intent = new Intent(this, (Class<?>) HelpActivity.class);
            intent.putExtra("help_layout", R.layout.activity_sensor_help);
            intent.putExtra("help_name", getString(R.string.summary_issues));
            startActivity(intent);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
