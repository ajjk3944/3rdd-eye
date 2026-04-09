package com.yandex.mobile.ads.impl;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: classes3.dex */
final class hf1 implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f28194a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f28195b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f28196c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    private final float[] f28197d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    private final Display f28198e;

    /* renamed from: f, reason: collision with root package name */
    private final a[] f28199f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f28200g;

    public interface a {
        void a(float[] fArr, float f10);
    }

    public hf1(Display display, a... aVarArr) {
        this.f28198e = display;
        this.f28199f = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        SensorManager.getRotationMatrixFromVector(this.f28194a, sensorEvent.values);
        float[] fArr = this.f28194a;
        int rotation = this.f28198e.getRotation();
        if (rotation != 0) {
            int i10 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i10 = 130;
                    i = 1;
                }
            } else {
                i = 129;
                i10 = 2;
            }
            float[] fArr2 = this.f28195b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f28195b, i10, i, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f28194a, 1, 131, this.f28195b);
        SensorManager.getOrientation(this.f28195b, this.f28197d);
        float f10 = this.f28197d[2];
        Matrix.rotateM(this.f28194a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.f28194a;
        if (!this.f28200g) {
            kc0.a(this.f28196c, fArr3);
            this.f28200g = true;
        }
        float[] fArr4 = this.f28195b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f28195b, 0, this.f28196c, 0);
        float[] fArr5 = this.f28194a;
        for (a aVar : this.f28199f) {
            aVar.a(fArr5, f10);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
