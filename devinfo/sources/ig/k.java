package ig;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.liuzh.deviceinfo.card.SensorAppCard;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SensorAppCard f25988b;

    public /* synthetic */ k(SensorAppCard sensorAppCard, int i4) {
        this.f25987a = i4;
        this.f25988b = sensorAppCard;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25987a) {
            case 0:
                SensorAppCard sensorAppCard = this.f25988b;
                int i4 = SensorAppCard.j;
                sensorAppCard.a();
                SensorManager sensorManager = (SensorManager) sensorAppCard.getContext().getSystemService("sensor");
                if (sensorManager != null) {
                    List<Sensor> sensorList = sensorManager.getSensorList(-1);
                    sensorAppCard.f21214d = sensorList == null ? 0 : sensorList.size();
                }
                bi.d.b(sensorAppCard.f21218i);
                break;
            default:
                SensorAppCard sensorAppCard2 = this.f25988b;
                int i10 = SensorAppCard.j;
                sensorAppCard2.a();
                bi.d.b(sensorAppCard2.f21218i);
                break;
        }
    }
}
