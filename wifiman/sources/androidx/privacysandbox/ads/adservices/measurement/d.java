package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class d extends l {
    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context) {
        AbstractC6492s.i(context, "context");
        MeasurementManager measurementManager = MeasurementManager.get(context);
        AbstractC6492s.h(measurementManager, "get(context)");
        super(measurementManager);
    }
}
