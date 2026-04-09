package p5;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends d {
    /* JADX WARN: Illegal instructions before constructor call */
    public c(Context context, int i4) {
        switch (i4) {
            case 1:
                k.e(context, "context");
                Object systemService = context.getSystemService((Class<Object>) MeasurementManager.class);
                k.d(systemService, "context.getSystemService…ementManager::class.java)");
                super((MeasurementManager) systemService);
                break;
            default:
                k.e(context, "context");
                MeasurementManager measurementManager = MeasurementManager.get(context);
                k.d(measurementManager, "get(context)");
                super(measurementManager);
                break;
        }
    }
}
