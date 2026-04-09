package com.unity3d.ads.core.domain.om;

import c9.c;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/om/CommonGetOmData;", "Lcom/unity3d/ads/core/domain/om/GetOmData;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "openMeasurementRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "Lcom/unity3d/ads/core/data/model/OMData;", "invoke", "(Lc9/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommonGetOmData implements GetOmData {

    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonGetOmData(@NotNull OpenMeasurementRepository openMeasurementRepository) {
        p.e(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.om.GetOmData
    @Nullable
    public Object invoke(@NotNull c cVar) {
        return this.openMeasurementRepository.getOmData();
    }
}
