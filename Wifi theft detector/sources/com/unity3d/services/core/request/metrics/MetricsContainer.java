package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z8.h0;
import z8.s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0013R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \r*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/unity3d/services/core/request/metrics/MetricsContainer;", "", "metricSampleRate", "", "commonTags", "Lcom/unity3d/services/core/request/metrics/MetricCommonTags;", "metrics", "", "Lcom/unity3d/services/core/request/metrics/Metric;", MetricsContainer.METRIC_CONTAINER_SESSION_TOKEN, "(Ljava/lang/String;Lcom/unity3d/services/core/request/metrics/MetricCommonTags;Ljava/util/List;Ljava/lang/String;)V", "apiLevel", "deviceManufacturer", "kotlin.jvm.PlatformType", MetricsContainer.METRIC_CONTAINER_DEVICE_MODEL, MetricsContainer.METRIC_CONTAINER_DEVICE_NAME, "gameId", MetricsContainer.METRIC_CONTAINER_SHARED_SESSION_ID, "toMap", "", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMetricsContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetricsContainer.kt\ncom/unity3d/services/core/request/metrics/MetricsContainer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1549#2:51\n1620#2,3:52\n1#3:55\n*S KotlinDebug\n*F\n+ 1 MetricsContainer.kt\ncom/unity3d/services/core/request/metrics/MetricsContainer\n*L\n20#1:51\n20#1:52,3\n*E\n"})
/* loaded from: classes3.dex */
public final class MetricsContainer {

    @NotNull
    private static final String METRICS_CONTAINER = "m";

    @NotNull
    private static final String METRICS_CONTAINER_TAGS = "t";

    @NotNull
    private static final String METRIC_CONTAINER_API_LEVEL = "apil";

    @NotNull
    private static final String METRIC_CONTAINER_DEVICE_MAKE = "deviceMake";

    @NotNull
    private static final String METRIC_CONTAINER_DEVICE_MODEL = "deviceModel";

    @NotNull
    private static final String METRIC_CONTAINER_DEVICE_NAME = "deviceName";

    @NotNull
    private static final String METRIC_CONTAINER_GAME_ID = "gameId";

    @NotNull
    private static final String METRIC_CONTAINER_SAMPLE_RATE = "msr";

    @NotNull
    private static final String METRIC_CONTAINER_SESSION_TOKEN = "sTkn";

    @NotNull
    private static final String METRIC_CONTAINER_SHARED_SESSION_ID = "shSid";

    @NotNull
    private final String apiLevel;

    @NotNull
    private final MetricCommonTags commonTags;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final String deviceName;
    private final String gameId;

    @NotNull
    private final String metricSampleRate;

    @NotNull
    private final List<Metric> metrics;

    @Nullable
    private final String sTkn;

    @NotNull
    private final String shSid;

    public MetricsContainer(@NotNull String metricSampleRate, @NotNull MetricCommonTags commonTags, @NotNull List<Metric> metrics, @Nullable String str) {
        p.e(metricSampleRate, "metricSampleRate");
        p.e(commonTags, "commonTags");
        p.e(metrics, "metrics");
        this.metricSampleRate = metricSampleRate;
        this.commonTags = commonTags;
        this.metrics = metrics;
        this.sTkn = str;
        this.shSid = Session.INSTANCE.getId();
        this.apiLevel = String.valueOf(Device.getApiLevel());
        this.deviceModel = Device.getModel();
        this.deviceName = Device.getDevice();
        this.deviceManufacturer = Device.getManufacturer();
        this.gameId = ClientProperties.getGameId();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        List<Metric> list = this.metrics;
        ArrayList arrayList = new ArrayList(s.s(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Metric) it.next()).toMap());
        }
        Map mapC = h0.c();
        mapC.put(METRIC_CONTAINER_SAMPLE_RATE, this.metricSampleRate);
        mapC.put(METRICS_CONTAINER, arrayList);
        mapC.put(METRICS_CONTAINER_TAGS, this.commonTags.toMap());
        mapC.put(METRIC_CONTAINER_SHARED_SESSION_ID, this.shSid);
        mapC.put(METRIC_CONTAINER_API_LEVEL, this.apiLevel);
        String str = this.sTkn;
        if (str != null) {
            mapC.put(METRIC_CONTAINER_SESSION_TOKEN, str);
        }
        String deviceModel = this.deviceModel;
        if (deviceModel != null) {
            p.d(deviceModel, "deviceModel");
            mapC.put(METRIC_CONTAINER_DEVICE_MODEL, deviceModel);
        }
        String deviceName = this.deviceName;
        if (deviceName != null) {
            p.d(deviceName, "deviceName");
            mapC.put(METRIC_CONTAINER_DEVICE_NAME, deviceName);
        }
        String deviceManufacturer = this.deviceManufacturer;
        if (deviceManufacturer != null) {
            p.d(deviceManufacturer, "deviceManufacturer");
            mapC.put(METRIC_CONTAINER_DEVICE_MAKE, deviceManufacturer);
        }
        String gameId = this.gameId;
        if (gameId != null) {
            p.d(gameId, "gameId");
            mapC.put("gameId", gameId);
        }
        return h0.b(mapC);
    }
}
