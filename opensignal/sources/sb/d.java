package sb;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: classes.dex */
public final class d implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f21945a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f21946b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f21947c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f21948d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    public final Display f21949e;

    /* renamed from: f, reason: collision with root package name */
    public final c[] f21950f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21951g;

    public d(Display display, c... cVarArr) {
        this.f21949e = display;
        this.f21950f = cVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f21945a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f21949e.getRotation();
        float[] fArr3 = this.f21946b;
        if (rotation != 0) {
            int i11 = 129;
            if (rotation != 1) {
                i10 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i11 = 130;
                    i10 = 1;
                }
            } else {
                i10 = 129;
                i11 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i11, i10, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f21948d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f10 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z10 = this.f21951g;
        float[] fArr5 = this.f21947c;
        if (!z10) {
            d8.a.d(fArr5, fArr2);
            this.f21951g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (int i12 = 0; i12 < 2; i12++) {
            this.f21950f[i12].a(fArr2, f10);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
