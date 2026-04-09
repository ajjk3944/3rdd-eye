package u1;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;

/* loaded from: classes.dex */
public abstract /* synthetic */ class v {
    public static /* bridge */ /* synthetic */ MeasurementManager c(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ GetTopicsRequest.Builder d() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse h(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic i(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager j(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void m() {
        new DeletionRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ Class t() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void u() {
    }

    public static /* synthetic */ void v() {
    }
}
