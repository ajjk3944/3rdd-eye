package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity;

import B2.r;
import I2.m;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.github.anastr.speedviewlib.PointerSpeedometer;
import com.zipoapps.premiumhelper.e;
import io.appmetrica.analytics.impl.Oo;
import k3.b;
import x2.AbstractActivityC5757a;

/* loaded from: classes.dex */
public class CameraDetectorActivity extends AbstractActivityC5757a implements SensorEventListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f22050n = 0;

    /* renamed from: e, reason: collision with root package name */
    public MediaPlayer f22051e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f22052f = {R.raw.beep};

    /* renamed from: g, reason: collision with root package name */
    public Dialog f22053g;

    /* renamed from: h, reason: collision with root package name */
    public m f22054h;
    public TextView i;

    /* renamed from: j, reason: collision with root package name */
    public SensorManager f22055j;

    /* renamed from: k, reason: collision with root package name */
    public Vibrator f22056k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f22057l;

    /* renamed from: m, reason: collision with root package name */
    public PointerSpeedometer f22058m;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CameraDetectorActivity.this.f22053g.dismiss();
        }
    }

    @Override // x2.AbstractActivityC5757a
    public final int k() {
        return R.layout.activity_camera_detector;
    }

    @Override // x2.AbstractActivityC5757a
    public final void l() {
        e.f37006D.getClass();
        e.a.a().f37021k.s("detect_cameras", new Bundle[0]);
        this.f22058m = (PointerSpeedometer) findViewById(R.id.speedcalculator);
        this.f22054h = new m(this);
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.soundBtn_id);
        ToggleButton toggleButton2 = (ToggleButton) findViewById(R.id.vibrate_id);
        findViewById(R.id.tips_tricks).setOnClickListener(new r(this, 6));
        this.f22057l = Boolean.TRUE;
        this.i = (TextView) findViewById(R.id.status);
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        this.f22055j = sensorManager;
        boolean zRegisterListener = sensorManager.registerListener(this, sensorManager.getDefaultSensor(2), 3);
        this.f22056k = (Vibrator) getSystemService("vibrator");
        this.f22051e = MediaPlayer.create(this, this.f22052f[0]);
        toggleButton.setChecked(this.f22054h.f2429a.getBoolean("SOUND", true));
        toggleButton2.setChecked(this.f22054h.f2429a.getBoolean("VIBRATE", false));
        toggleButton.setOnCheckedChangeListener(this);
        toggleButton2.setOnCheckedChangeListener(this);
        Dialog dialog = new Dialog(this);
        this.f22053g = dialog;
        dialog.requestWindowFeature(1);
        this.f22053g.getWindow().getAttributes();
        this.f22053g.getWindow().setLayout(-1, -1);
        this.f22053g.setCancelable(false);
        this.f22053g.setContentView(R.layout.sensor_info_dialog);
        this.f22053g.findViewById(R.id.ok).setOnClickListener(new a());
        if (zRegisterListener) {
            return;
        }
        this.f22053g.show();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        int id = compoundButton.getId();
        if (id == R.id.soundBtn_id) {
            Oo.j(this.f22054h.f2429a, "SOUND", z10);
        } else {
            if (id != R.id.vibrate_id) {
                return;
            }
            Oo.j(this.f22054h.f2429a, "VIBRATE", z10);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final void onDestroy() {
        this.f22055j.unregisterListener(this);
        super.onDestroy();
        try {
            this.f22056k.cancel();
            this.f22051e.release();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f22055j.unregisterListener(this);
    }

    @Override // x2.AbstractActivityC5757a, androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final void onResume() {
        super.onResume();
        SensorManager sensorManager = this.f22055j;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(2), 3);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) throws IllegalStateException {
        if (sensorEvent.sensor.getType() == 2) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            long jSqrt = (long) Math.sqrt((f12 * f12) + (f11 * f11) + (f10 * f10));
            if (this.f22057l.equals(Boolean.TRUE)) {
                if (jSqrt < 45) {
                    this.i.setText(R.string.low_radiation);
                } else if (jSqrt >= 45 && jSqrt <= 80) {
                    this.i.setText(getString(R.string.normal_radiation));
                } else if (jSqrt > 80 && jSqrt <= 120) {
                    this.i.setText(R.string.high_radiation);
                } else if (jSqrt > 120) {
                    this.i.setText(R.string.extreme_radiation);
                }
                long j4 = (long) ((jSqrt / 200.0d) * 100.0d);
                PointerSpeedometer pointerSpeedometer = this.f22058m;
                float minSpeed = j4;
                if (minSpeed > pointerSpeedometer.getMaxSpeed()) {
                    minSpeed = pointerSpeedometer.getMaxSpeed();
                } else if (minSpeed < pointerSpeedometer.getMinSpeed()) {
                    minSpeed = pointerSpeedometer.getMinSpeed();
                }
                if (minSpeed != pointerSpeedometer.f43327j) {
                    pointerSpeedometer.f43327j = minSpeed;
                    pointerSpeedometer.f43330m = minSpeed > pointerSpeedometer.f43329l;
                    pointerSpeedometer.c();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(pointerSpeedometer.f43329l, minSpeed);
                    valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                    valueAnimatorOfFloat.setDuration(2000L);
                    valueAnimatorOfFloat.addUpdateListener(new b(pointerSpeedometer, 0));
                    valueAnimatorOfFloat.addListener(pointerSpeedometer.f43338u);
                    C1992A c1992a = C1992A.f18074a;
                    pointerSpeedometer.f43333p = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.start();
                }
                if (j4 >= 50) {
                    boolean z10 = this.f22054h.f2429a.getBoolean("SOUND", true);
                    int[] iArr = this.f22052f;
                    if (z10 && this.f22054h.f2429a.getBoolean("VIBRATE", false)) {
                        if (this.f22051e == null) {
                            this.f22051e = MediaPlayer.create(this, iArr[0]);
                        }
                        this.f22051e.start();
                        if (Build.VERSION.SDK_INT >= 26) {
                            this.f22056k.vibrate(VibrationEffect.createOneShot(500L, -1));
                        } else {
                            this.f22056k.vibrate(500L);
                        }
                    } else if (this.f22054h.f2429a.getBoolean("VIBRATE", false)) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            this.f22056k.vibrate(VibrationEffect.createOneShot(500L, -1));
                        } else {
                            this.f22056k.vibrate(500L);
                        }
                    }
                    if (this.f22054h.f2429a.getBoolean("SOUND", true)) {
                        if (this.f22051e == null) {
                            this.f22051e = MediaPlayer.create(this, iArr[0]);
                        }
                        this.f22051e.start();
                    }
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
