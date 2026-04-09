package J8;

import J8.L;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.Iterator;

/* compiled from: ShakeDetector.kt */
/* loaded from: classes3.dex */
public final class M implements SensorEventListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f2838b;

    public M(L l5) {
        this.f2838b = l5;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        kotlin.jvm.internal.l.f(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        kotlin.jvm.internal.l.f(event, "event");
        float[] fArr = event.values;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        L l5 = this.f2838b;
        l5.f2833c = l5.f2832b;
        float f13 = f12 * f12;
        float fSqrt = (float) Math.sqrt(f13 + (f11 * f11) + (f10 * f10));
        l5.f2832b = fSqrt;
        float f14 = (l5.f2831a * 0.9f) + (fSqrt - l5.f2833c);
        l5.f2831a = f14;
        if (f14 > 20.0f) {
            Iterator it = l5.f2834d.iterator();
            while (it.hasNext()) {
                ((L.a) it.next()).a();
            }
        }
    }
}
