package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.google.android.gms.internal.ads.fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1164fg extends AbstractC1341ix {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f14109a;

    /* renamed from: c, reason: collision with root package name */
    public final Display f14111c;

    /* renamed from: f, reason: collision with root package name */
    public float[] f14114f;

    /* renamed from: g, reason: collision with root package name */
    public W2.e f14115g;

    /* renamed from: h, reason: collision with root package name */
    public C1218gg f14116h;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f14112d = new float[9];

    /* renamed from: e, reason: collision with root package name */
    public final float[] f14113e = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final Object f14110b = new Object();

    public C1164fg(Context context) {
        this.f14109a = (SensorManager) context.getSystemService("sensor");
        this.f14111c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1341ix
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f14110b) {
            try {
                if (this.f14114f == null) {
                    this.f14114f = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        float[] fArr2 = this.f14112d;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f14111c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(fArr2, 2, 129, this.f14113e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(fArr2, 129, 130, this.f14113e);
        } else if (rotation != 3) {
            System.arraycopy(fArr2, 0, this.f14113e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(fArr2, 130, 1, this.f14113e);
        }
        float[] fArr3 = this.f14113e;
        float f2 = fArr3[1];
        fArr3[1] = fArr3[3];
        fArr3[3] = f2;
        float f5 = fArr3[2];
        fArr3[2] = fArr3[6];
        fArr3[6] = f5;
        float f6 = fArr3[5];
        fArr3[5] = fArr3[7];
        fArr3[7] = f6;
        synchronized (this.f14110b) {
            System.arraycopy(fArr3, 0, this.f14114f, 0, 9);
        }
        C1218gg c1218gg = this.f14116h;
        if (c1218gg != null) {
            c1218gg.a();
        }
    }

    public final void b() {
        if (this.f14115g == null) {
            return;
        }
        this.f14109a.unregisterListener(this);
        this.f14115g.post(new RunnableC1944u6(3));
        this.f14115g = null;
    }

    public final boolean c(float[] fArr) {
        synchronized (this.f14110b) {
            try {
                float[] fArr2 = this.f14114f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
