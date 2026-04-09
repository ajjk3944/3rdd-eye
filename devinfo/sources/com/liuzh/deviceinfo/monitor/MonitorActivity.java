package com.liuzh.deviceinfo.monitor;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.slider.Slider;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.monitor.MonitorActivity;
import com.liuzh.deviceinfo.utilities.f;
import com.liuzh.deviceinfo.utilities.l;
import d.m;
import dj.b;
import e4.m0;
import e4.v0;
import gd.g;
import hg.a;
import java.util.WeakHashMap;
import ki.h;
import ki.j;
import nk.k;
import wg.p;
import wg.r;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class MonitorActivity extends a {
    public static final /* synthetic */ int B = 0;

    public final void D(int i4, int i10, String str) throws Resources.NotFoundException {
        f fVar = f.f21256b;
        int iA = f.a();
        SwitchCompat switchCompat = (SwitchCompat) findViewById(i10);
        b.p(switchCompat, iA);
        int i11 = 1;
        switchCompat.setChecked(MonitorManager.f21223f.f21227d.get(str) != null);
        switchCompat.setOnCheckedChangeListener(new j(this, switchCompat, str, i11));
        findViewById(i4).setOnClickListener(new h(switchCompat, 1));
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) throws NoSuchFieldException, Resources.NotFoundException, SecurityException {
        super.onCreate(bundle);
        m.a(this);
        setContentView(R.layout.activity_monitor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        i.e(toolbar);
        z(toolbar);
        A();
        f fVar = f.f21256b;
        final int iD = f.d();
        final int iA = f.a();
        ((TextView) findViewById(R.id.category_settings)).setTextColor(iD);
        ((TextView) findViewById(R.id.category_monitors)).setTextColor(iD);
        int iA2 = f.a();
        int iD2 = f.d();
        Slider slider = (Slider) findViewById(R.id.slider_transparency);
        b.o(slider, iD2);
        SharedPreferences sharedPreferences = f.f21257c;
        slider.setValue(sharedPreferences.getInt("monitor_bg_transparency", 40));
        final int i4 = 0;
        slider.setLabelFormatter(new p(i4));
        slider.a(new g() { // from class: wg.q
            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
            @Override // gd.g
            public final /* bridge */ /* synthetic */ void a(gd.e eVar, float f10, boolean z3) {
                switch (i4) {
                }
                b((Slider) eVar, f10, z3);
            }

            public final void b(Slider slider2, float f10, boolean z3) {
                switch (i4) {
                    case 0:
                        com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        int i10 = MonitorActivity.B;
                        if (z3) {
                            com.liuzh.deviceinfo.utilities.f.l(Math.round(f10), "monitor_bg_transparency");
                            break;
                        }
                        break;
                    case 1:
                        com.liuzh.deviceinfo.utilities.f fVar3 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        int i11 = MonitorActivity.B;
                        if (z3) {
                            com.liuzh.deviceinfo.utilities.f.l(Math.round(f10), "monitor_text_size");
                            break;
                        }
                        break;
                    default:
                        com.liuzh.deviceinfo.utilities.f fVar4 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        int i12 = MonitorActivity.B;
                        if (z3) {
                            com.liuzh.deviceinfo.utilities.f.l(Math.round(f10), "monitor_spacing");
                            break;
                        }
                        break;
                }
            }
        });
        Slider slider2 = (Slider) findViewById(R.id.slider_text_size);
        b.o(slider2, iD2);
        slider2.setValue(f.c());
        final int i10 = 1;
        slider2.setLabelFormatter(new p(i10));
        slider2.a(new g() { // from class: wg.q
            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
            @Override // gd.g
            public final /* bridge */ /* synthetic */ void a(gd.e eVar, float f10, boolean z3) {
                switch (i10) {
                }
                b((Slider) eVar, f10, z3);
            }

            public final void b(Slider slider22, float f10, boolean z3) {
                switch (i10) {
                    case 0:
                        com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        int i102 = MonitorActivity.B;
                        if (z3) {
                            com.liuzh.deviceinfo.utilities.f.l(Math.round(f10), "monitor_bg_transparency");
                            break;
                        }
                        break;
                    case 1:
                        com.liuzh.deviceinfo.utilities.f fVar3 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        int i11 = MonitorActivity.B;
                        if (z3) {
                            com.liuzh.deviceinfo.utilities.f.l(Math.round(f10), "monitor_text_size");
                            break;
                        }
                        break;
                    default:
                        com.liuzh.deviceinfo.utilities.f fVar4 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        int i12 = MonitorActivity.B;
                        if (z3) {
                            com.liuzh.deviceinfo.utilities.f.l(Math.round(f10), "monitor_spacing");
                            break;
                        }
                        break;
                }
            }
        });
        Slider slider3 = (Slider) findViewById(R.id.slider_spacing);
        b.o(slider3, iD2);
        slider3.setValue(sharedPreferences.getInt("monitor_spacing", 10));
        final int i11 = 2;
        slider3.setLabelFormatter(new p(i11));
        slider3.a(new g() { // from class: wg.q
            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
            @Override // gd.g
            public final /* bridge */ /* synthetic */ void a(gd.e eVar, float f10, boolean z3) {
                switch (i11) {
                }
                b((Slider) eVar, f10, z3);
            }

            public final void b(Slider slider22, float f10, boolean z3) {
                switch (i11) {
                    case 0:
                        com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        int i102 = MonitorActivity.B;
                        if (z3) {
                            com.liuzh.deviceinfo.utilities.f.l(Math.round(f10), "monitor_bg_transparency");
                            break;
                        }
                        break;
                    case 1:
                        com.liuzh.deviceinfo.utilities.f fVar3 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        int i112 = MonitorActivity.B;
                        if (z3) {
                            com.liuzh.deviceinfo.utilities.f.l(Math.round(f10), "monitor_text_size");
                            break;
                        }
                        break;
                    default:
                        com.liuzh.deviceinfo.utilities.f fVar4 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        int i12 = MonitorActivity.B;
                        if (z3) {
                            com.liuzh.deviceinfo.utilities.f.l(Math.round(f10), "monitor_spacing");
                            break;
                        }
                        break;
                }
            }
        });
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group_text_color);
        radioGroup.check(f.i() ? R.id.radio_text_light : R.id.radio_text_dark);
        radioGroup.setOnCheckedChangeListener(new r());
        RadioButton radioButton = (RadioButton) findViewById(R.id.radio_text_light);
        k.e(radioButton, "radio");
        radioButton.setButtonTintList(b.c(iA2));
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_text_dark);
        k.e(radioButton2, "radio");
        radioButton2.setButtonTintList(b.c(iA2));
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.switch_fixed_position);
        b.p(switchCompat, iA2);
        switchCompat.setChecked(sharedPreferences.getBoolean("monitor_fixed_position", false));
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: wg.o
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                switch (i4) {
                    case 0:
                        com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        int i12 = MonitorActivity.B;
                        com.liuzh.deviceinfo.utilities.f.k("monitor_fixed_position", z3);
                        break;
                    default:
                        int i13 = MonitorActivity.B;
                        com.liuzh.deviceinfo.utilities.f fVar3 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        com.liuzh.deviceinfo.utilities.f.k("monitor_record_status", z3);
                        break;
                }
            }
        });
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R.id.switch_record);
        b.p(switchCompat2, iA2);
        switchCompat2.setChecked(sharedPreferences.getBoolean("monitor_record_status", false));
        switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: wg.o
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                switch (i10) {
                    case 0:
                        com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        int i12 = MonitorActivity.B;
                        com.liuzh.deviceinfo.utilities.f.k("monitor_fixed_position", z3);
                        break;
                    default:
                        int i13 = MonitorActivity.B;
                        com.liuzh.deviceinfo.utilities.f fVar3 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        com.liuzh.deviceinfo.utilities.f.k("monitor_record_status", z3);
                        break;
                }
            }
        });
        D(R.id.item_battery, R.id.battery_switch, "monitor_battery");
        D(R.id.item_cpu, R.id.cpu_switch, "monitor_cpu");
        D(R.id.item_gpu, R.id.gpu_switch, "monitor_gpu");
        D(R.id.item_ram, R.id.ram_switch, "monitor_ram");
        D(R.id.item_fps, R.id.fps_switch, "monitor_fps");
        D(R.id.item_signal, R.id.signal_switch, "monitor_signal");
        D(R.id.item_speed, R.id.speed_switch, "monitor_speed");
        findViewById(R.id.btn_helper_record_status).setOnClickListener(new View.OnClickListener(iA, iD, i4) { // from class: wg.n

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f36689a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f36690b;

            {
                this.f36689a = i4;
                this.f36690b = iD;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = this.f36689a;
                int i13 = this.f36690b;
                switch (i12) {
                    case 0:
                        int i14 = MonitorActivity.B;
                        t7.m mVar = new t7.m(view.getContext());
                        mVar.y(R.string.record_switch_status);
                        mVar.v(R.string.monitor_record_status_helper);
                        mVar.x(android.R.string.ok, null);
                        dj.b.t(mVar.A(), i13);
                        break;
                    default:
                        int i15 = MonitorActivity.B;
                        t7.m mVar2 = new t7.m(view.getContext());
                        mVar2.y(R.string.fixed_position);
                        mVar2.v(R.string.monitor_fixed_position_helper);
                        mVar2.x(android.R.string.ok, null);
                        dj.b.t(mVar2.A(), i13);
                        break;
                }
            }
        });
        findViewById(R.id.btn_helper_touch_mode).setOnClickListener(new View.OnClickListener(iA, iD, i10) { // from class: wg.n

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f36689a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f36690b;

            {
                this.f36689a = i10;
                this.f36690b = iD;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = this.f36689a;
                int i13 = this.f36690b;
                switch (i12) {
                    case 0:
                        int i14 = MonitorActivity.B;
                        t7.m mVar = new t7.m(view.getContext());
                        mVar.y(R.string.record_switch_status);
                        mVar.v(R.string.monitor_record_status_helper);
                        mVar.x(android.R.string.ok, null);
                        dj.b.t(mVar.A(), i13);
                        break;
                    default:
                        int i15 = MonitorActivity.B;
                        t7.m mVar2 = new t7.m(view.getContext());
                        mVar2.y(R.string.fixed_position);
                        mVar2.v(R.string.monitor_fixed_position_helper);
                        mVar2.x(android.R.string.ok, null);
                        dj.b.t(mVar2.A(), i13);
                        break;
                }
            }
        });
        ScrollView scrollView = (ScrollView) findViewById(R.id.scroll_view);
        b.m(scrollView, iD);
        if (l.A() <= 0.0f) {
            findViewById(R.id.item_gpu).setVisibility(8);
        }
        findViewById(R.id.custom_monitor_entrance).setOnClickListener(new aa.j(14, this));
        View viewFindViewById = findViewById(R.id.root_container);
        oi.h hVar = new oi.h(toolbar, scrollView, i10);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(viewFindViewById, hVar);
    }
}
