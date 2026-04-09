package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wx extends mw0 {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f18227a;

    /* renamed from: c, reason: collision with root package name */
    public final Display f18229c;

    /* renamed from: f, reason: collision with root package name */
    public float[] f18232f;
    public ac.k g;

    /* renamed from: h, reason: collision with root package name */
    public xx f18233h;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f18230d = new float[9];

    /* renamed from: e, reason: collision with root package name */
    public final float[] f18231e = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final Object f18228b = new Object();

    public wx(Context context) {
        this.f18227a = (SensorManager) context.getSystemService("sensor");
        this.f18229c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f18228b) {
            try {
                if (this.f18232f == null) {
                    this.f18232f = new float[9];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        float[] fArr2 = this.f18230d;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f18229c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(fArr2, 2, 129, this.f18231e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(fArr2, 129, 130, this.f18231e);
        } else if (rotation != 3) {
            System.arraycopy(fArr2, 0, this.f18231e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(fArr2, 130, 1, this.f18231e);
        }
        float[] fArr3 = this.f18231e;
        float f10 = fArr3[1];
        fArr3[1] = fArr3[3];
        fArr3[3] = f10;
        float f11 = fArr3[2];
        fArr3[2] = fArr3[6];
        fArr3[6] = f11;
        float f12 = fArr3[5];
        fArr3[5] = fArr3[7];
        fArr3[7] = f12;
        synchronized (this.f18228b) {
            System.arraycopy(fArr3, 0, this.f18232f, 0, 9);
        }
        xx xxVar = this.f18233h;
        if (xxVar != null) {
            xxVar.a();
        }
    }

    public final void b() {
        if (this.g == null) {
            return;
        }
        this.f18227a.unregisterListener(this);
        this.g.post(new ce(3));
        this.g = null;
    }

    public final boolean c(float[] fArr) {
        synchronized (this.f18228b) {
            try {
                float[] fArr2 = this.f18232f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
