package com.lefan.signal.ui.magnetic;

import B4.g;
import B4.h;
import F4.d;
import F4.e;
import K4.c;
import R4.a;
import a4.p;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import c.AbstractC0391p;
import com.apm.insight.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.slider.Slider;
import com.lefan.ads.banner.BannerView;
import d5.C2280h;
import h.AbstractActivityC2349g;
import java.util.Arrays;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class MagneticActivity extends AbstractActivityC2349g implements SensorEventListener {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f18919f0 = 0;

    /* renamed from: O, reason: collision with root package name */
    public c f18920O;

    /* renamed from: P, reason: collision with root package name */
    public SensorManager f18921P;

    /* renamed from: Q, reason: collision with root package name */
    public Sensor f18922Q;

    /* renamed from: R, reason: collision with root package name */
    public Sensor f18923R;

    /* renamed from: S, reason: collision with root package name */
    public MagneticView f18924S;

    /* renamed from: T, reason: collision with root package name */
    public LinearProgressIndicator f18925T;

    /* renamed from: W, reason: collision with root package name */
    public TextView f18928W;

    /* renamed from: X, reason: collision with root package name */
    public MagneticTrendView f18929X;
    public SoundPool b0;

    /* renamed from: c0, reason: collision with root package name */
    public Integer f18933c0;

    /* renamed from: e0, reason: collision with root package name */
    public Integer f18935e0;

    /* renamed from: U, reason: collision with root package name */
    public float f18926U = 100.0f;

    /* renamed from: V, reason: collision with root package name */
    public final int f18927V = 520;

    /* renamed from: Y, reason: collision with root package name */
    public final float f18930Y = 0.8f;

    /* renamed from: Z, reason: collision with root package name */
    public final float[] f18931Z = new float[3];

    /* renamed from: a0, reason: collision with root package name */
    public final float[] f18932a0 = new float[3];

    /* renamed from: d0, reason: collision with root package name */
    public boolean f18934d0 = true;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_magnetic, (ViewGroup) null, false);
        int i = R.id.ad_view;
        if (((BannerView) p.e(R.id.ad_view, viewInflate)) != null) {
            i = R.id.app_bar;
            AppBarLayout appBarLayout = (AppBarLayout) p.e(R.id.app_bar, viewInflate);
            if (appBarLayout != null) {
                i = R.id.bottom_layout;
                View viewE = p.e(R.id.bottom_layout, viewInflate);
                if (viewE != null) {
                    i = R.id.magnetic_progress;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) p.e(R.id.magnetic_progress, viewInflate);
                    if (linearProgressIndicator != null) {
                        i = R.id.magnetic_trend;
                        MagneticTrendView magneticTrendView = (MagneticTrendView) p.e(R.id.magnetic_trend, viewInflate);
                        if (magneticTrendView != null) {
                            i = R.id.magnetic_view;
                            MagneticView magneticView = (MagneticView) p.e(R.id.magnetic_view, viewInflate);
                            if (magneticView != null) {
                                i = R.id.magnetic_warn;
                                Slider slider = (Slider) p.e(R.id.magnetic_warn, viewInflate);
                                if (slider != null) {
                                    i = R.id.magnetic_xyz;
                                    TextView textView = (TextView) p.e(R.id.magnetic_xyz, viewInflate);
                                    if (textView != null) {
                                        i = R.id.toolbar;
                                        Toolbar toolbar = (Toolbar) p.e(R.id.toolbar, viewInflate);
                                        if (toolbar != null) {
                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                                            this.f18920O = new c(linearLayoutCompat, appBarLayout, viewE, linearProgressIndicator, magneticTrendView, magneticView, slider, textView, toolbar);
                                            setContentView(linearLayoutCompat);
                                            c cVar = this.f18920O;
                                            if (cVar == null) {
                                                i.g("binding");
                                                throw null;
                                            }
                                            AppBarLayout appBarLayout2 = (AppBarLayout) cVar.f2210c;
                                            if (cVar == null) {
                                                i.g("binding");
                                                throw null;
                                            }
                                            d.a(appBarLayout2, (View) cVar.f2212e);
                                            c cVar2 = this.f18920O;
                                            if (cVar2 == null) {
                                                i.g("binding");
                                                throw null;
                                            }
                                            Toolbar toolbar2 = (Toolbar) cVar2.f2211d;
                                            B(toolbar2);
                                            com.bumptech.glide.d dVarR = r();
                                            if (dVarR != null) {
                                                dVarR.S(true);
                                            }
                                            toolbar2.setNavigationOnClickListener(new g(14, this));
                                            SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(1).build();
                                            this.b0 = soundPoolBuild;
                                            this.f18933c0 = soundPoolBuild != null ? Integer.valueOf(soundPoolBuild.load(this, R.raw.magnetic_warn, 1)) : null;
                                            c cVar3 = this.f18920O;
                                            if (cVar3 == null) {
                                                i.g("binding");
                                                throw null;
                                            }
                                            this.f18924S = (MagneticView) cVar3.f2215h;
                                            this.f18925T = (LinearProgressIndicator) cVar3.f2213f;
                                            this.f18928W = (TextView) cVar3.f2216j;
                                            this.f18929X = (MagneticTrendView) cVar3.f2214g;
                                            SensorManager sensorManager = (SensorManager) getSystemService("sensor");
                                            this.f18921P = sensorManager;
                                            this.f18922Q = sensorManager != null ? sensorManager.getDefaultSensor(2) : null;
                                            SensorManager sensorManager2 = this.f18921P;
                                            this.f18923R = sensorManager2 != null ? sensorManager2.getDefaultSensor(1) : null;
                                            c cVar4 = this.f18920O;
                                            if (cVar4 == null) {
                                                i.g("binding");
                                                throw null;
                                            }
                                            Slider slider2 = (Slider) cVar4.i;
                                            slider2.setCustomThumbDrawable(R.drawable.ic_warn);
                                            float f2 = getSharedPreferences("sp", 0).getInt("warn_value", 100);
                                            this.f18926U = f2;
                                            slider2.setValue(f2);
                                            slider2.f1979m.add(new a(this, 0));
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        i.e(menu, "menu");
        getMenuInflater().inflate(R.menu.activity_help, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SoundPool soundPool = this.b0;
        if (soundPool != null) {
            soundPool.release();
        }
        int i = (int) this.f18926U;
        SharedPreferences sharedPreferences = getSharedPreferences("sp", 0);
        i.b(sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt("warn_value", i);
        editorEdit.apply();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.e(menuItem, "item");
        if (menuItem.getItemId() == R.id.action_help) {
            h hVar = new h();
            hVar.g0(R.string.string_magnetic_tip, getString(R.string.string_magnetic));
            hVar.e0(s(), "magnetic_help");
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onPause() {
        super.onPause();
        SensorManager sensorManager = this.f18921P;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        Integer num = this.f18935e0;
        if (num != null) {
            int iIntValue = num.intValue();
            SoundPool soundPool = this.b0;
            if (soundPool != null) {
                soundPool.pause(iIntValue);
            }
        }
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onResume() {
        super.onResume();
        SensorManager sensorManager = this.f18921P;
        if (sensorManager != null) {
            sensorManager.registerListener(this, this.f18922Q, 2);
        }
        SensorManager sensorManager2 = this.f18921P;
        if (sensorManager2 != null) {
            sensorManager2.registerListener(this, this.f18923R, 2);
        }
        Integer num = this.f18935e0;
        if (num != null) {
            int iIntValue = num.intValue();
            SoundPool soundPool = this.b0;
            if (soundPool != null) {
                soundPool.resume(iIntValue);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        SoundPool soundPool;
        Integer num;
        String str;
        if (sensorEvent != null) {
            synchronized (this) {
                try {
                    if (sensorEvent.sensor.getType() == 1) {
                        float[] fArr = this.f18931Z;
                        float f2 = this.f18930Y;
                        float f5 = fArr[0] * f2;
                        float f6 = 1 - f2;
                        float[] fArr2 = sensorEvent.values;
                        float f7 = (fArr2[0] * f6) + f5;
                        fArr[0] = f7;
                        float f8 = (fArr2[1] * f6) + (fArr[1] * f2);
                        fArr[1] = f8;
                        float f9 = (f6 * fArr2[2]) + (f2 * fArr[2]);
                        fArr[2] = f9;
                        fArr[0] = fArr2[0] - f7;
                        fArr[1] = fArr2[1] - f8;
                        fArr[2] = fArr2[2] - f9;
                    }
                    if (sensorEvent.sensor.getType() == 2) {
                        float[] fArr3 = this.f18932a0;
                        float f10 = this.f18930Y;
                        float f11 = fArr3[0] * f10;
                        float f12 = 1 - f10;
                        float[] fArr4 = sensorEvent.values;
                        float f13 = (fArr4[0] * f12) + f11;
                        fArr3[0] = f13;
                        fArr3[1] = (fArr4[1] * f12) + (fArr3[1] * f10);
                        fArr3[2] = (f12 * fArr4[2]) + (f10 * fArr3[2]);
                        TextView textView = this.f18928W;
                        if (textView != null) {
                            Float fValueOf = Float.valueOf(f13);
                            Float fValueOf2 = Float.valueOf(this.f18932a0[1]);
                            Float fValueOf3 = Float.valueOf(this.f18932a0[2]);
                            if (R2.a.f3390d) {
                                Locale locale = e.f1457a;
                                str = String.format(e.b(), "x:%.2f,   y:%.2f,   z:%.2f", Arrays.copyOf(new Object[]{fValueOf, fValueOf2, fValueOf3}, 3));
                            } else {
                                str = String.format(Locale.ENGLISH, "x:%.2f,   y:%.2f,   z:%.2f", Arrays.copyOf(new Object[]{fValueOf, fValueOf2, fValueOf3}, 3));
                            }
                            textView.setText(str);
                        }
                    }
                    float[] fArr5 = new float[9];
                    float[] fArr6 = new float[9];
                    if (SensorManager.getRotationMatrix(fArr5, fArr6, this.f18931Z, this.f18932a0)) {
                        float f14 = fArr6[3];
                        float f15 = fArr5[0] * f14;
                        float f16 = fArr6[4];
                        float f17 = (fArr5[3] * f16) + f15;
                        float f18 = fArr6[5];
                        float f19 = (fArr5[6] * f18) + f17;
                        float[] fArr7 = this.f18932a0;
                        float f20 = (((f18 * fArr5[8]) + (f16 * fArr5[5]) + (f14 * fArr5[2])) * fArr7[2]) + (((fArr5[7] * f18) + (fArr5[4] * f16) + (fArr5[1] * f14)) * fArr7[1]) + (f19 * fArr7[0]);
                        if (f20 > this.f18926U) {
                            if (this.f18934d0 && (num = this.f18933c0) != null) {
                                this.f18934d0 = false;
                                SoundPool soundPool2 = this.b0;
                                this.f18935e0 = soundPool2 != null ? Integer.valueOf(soundPool2.play(num.intValue(), 1.0f, 1.0f, 0, -1, 1.0f)) : null;
                            }
                        } else if (!this.f18934d0) {
                            this.f18934d0 = true;
                            Integer num2 = this.f18935e0;
                            if (num2 != null && (soundPool = this.b0) != null) {
                                soundPool.stop(num2.intValue());
                            }
                        }
                        MagneticView magneticView = this.f18924S;
                        if (magneticView != null) {
                            magneticView.setSpeed(f20);
                        }
                        MagneticTrendView magneticTrendView = this.f18929X;
                        if (magneticTrendView != null) {
                            C2280h c2280h = magneticTrendView.f18949m;
                            if (f20 > magneticTrendView.f18942e) {
                                magneticTrendView.f18942e = 30.0f + f20;
                            }
                            if (c2280h.f19820c > magneticTrendView.f18941d + 1) {
                                c2280h.removeFirst();
                            }
                            c2280h.addLast(Float.valueOf(f20));
                            magneticTrendView.invalidate();
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            LinearProgressIndicator linearProgressIndicator = this.f18925T;
                            if (linearProgressIndicator != null) {
                                int i = this.f18927V;
                                if (f20 < i) {
                                    i = (int) f20;
                                }
                                linearProgressIndicator.setProgress(i, true);
                            }
                        } else {
                            LinearProgressIndicator linearProgressIndicator2 = this.f18925T;
                            if (linearProgressIndicator2 != null) {
                                int i3 = this.f18927V;
                                if (f20 < i3) {
                                    i3 = (int) f20;
                                }
                                linearProgressIndicator2.setProgress(i3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
