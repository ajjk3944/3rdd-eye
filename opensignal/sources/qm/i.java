package qm;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.staircase3.opensignal.viewcontrollers.Tab_Overview;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f20927b;

    public /* synthetic */ i(k kVar, int i10) {
        this.f20926a = i10;
        this.f20927b = kVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
        int i11 = this.f20926a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10 = this.f20926a;
        k kVar = this.f20927b;
        switch (i10) {
            case 0:
                float f10 = sensorEvent.values[0];
                if (340.0f < Math.abs(f10 - kVar.f20937i)) {
                    float f11 = kVar.f20937i;
                    f10 = (f10 > f11 ? 5 : -5) + f11;
                }
                float f12 = ((int) (-f10)) + 180;
                kVar.f20934f = f12;
                kVar.f20937i = f10;
                float f13 = f12 - kVar.f20935g;
                if (kVar.f20936h != f12) {
                    Iterator it = kVar.f20933e.iterator();
                    while (it.hasNext()) {
                        ((Tab_Overview) ((h) it.next())).j0(f13);
                    }
                    kVar.f20936h = kVar.f20934f;
                    break;
                }
                break;
            default:
                float[] fArr = new float[16];
                try {
                    SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
                } catch (IllegalArgumentException unused) {
                    float[] fArr2 = sensorEvent.values;
                    if (fArr2.length > 3) {
                        SensorManager.getRotationMatrixFromVector(fArr, new float[]{fArr2[0], fArr2[1], fArr2[2]});
                    }
                }
                float[] fArr3 = new float[3];
                SensorManager.getOrientation(fArr, fArr3);
                float f14 = kVar.f20934f;
                kVar.f20936h = f14;
                float f15 = ((-fArr3[0]) * 180.0f) / 3.1415927f;
                kVar.f20934f = f15;
                float f16 = f15 - kVar.f20935g;
                if (f14 != f15) {
                    Iterator it2 = kVar.f20933e.iterator();
                    while (it2.hasNext()) {
                        ((Tab_Overview) ((h) it2.next())).j0(f16);
                    }
                    kVar.f20936h = kVar.f20934f;
                    break;
                }
                break;
        }
    }

    private final void a(Sensor sensor, int i10) {
    }

    private final void b(Sensor sensor, int i10) {
    }
}
