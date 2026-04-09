package ek;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import br.l;
import ch.n;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f8195a;

    /* renamed from: b, reason: collision with root package name */
    public final df.c f8196b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f8197c;

    /* renamed from: d, reason: collision with root package name */
    public Float f8198d;

    /* renamed from: e, reason: collision with root package name */
    public long f8199e;

    /* renamed from: f, reason: collision with root package name */
    public Sensor f8200f;

    public d(SensorManager sensorManager, df.c cVar) {
        l.e(sensorManager, "sensorManager");
        this.f8195a = sensorManager;
        this.f8196b = cVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Float fValueOf;
        float[] fArr;
        StringBuilder sb2 = new StringBuilder("onSensorChanged() called with: event = ");
        String string = Arrays.toString(sensorEvent != null ? sensorEvent.values : null);
        l.d(string, "toString(...)");
        sb2.append(string);
        sb2.append(", accuracy: ");
        sb2.append(sensorEvent != null ? Integer.valueOf(sensorEvent.accuracy) : null);
        n.b("LightSensorRepository", sb2.toString());
        this.f8196b.getClass();
        this.f8199e = System.currentTimeMillis();
        if (sensorEvent == null || (fArr = sensorEvent.values) == null) {
            fValueOf = null;
        } else {
            if (fArr.length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            fValueOf = Float.valueOf(fArr[0]);
        }
        this.f8198d = fValueOf;
        this.f8197c = sensorEvent != null ? Integer.valueOf(sensorEvent.accuracy) : null;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
