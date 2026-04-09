package com.unity3d.ads.core.domain.work;

import androidx.work.d;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/work/UniversalRequestWorkerData;", "", "", UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID, "<init>", "(Ljava/lang/String;)V", "Landroidx/work/d;", "invoke", "()Landroidx/work/d;", "Ljava/lang/String;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UniversalRequestWorkerData {

    @NotNull
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";

    @NotNull
    private final String universalRequestId;

    public UniversalRequestWorkerData(@NotNull String universalRequestId) {
        p.e(universalRequestId, "universalRequestId");
        this.universalRequestId = universalRequestId;
    }

    @NotNull
    public final d invoke() throws Throwable {
        d dVarA = new d.a().e(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId).a();
        p.d(dVarA, "Builder()\n            .p…tId)\n            .build()");
        return dVarA;
    }
}
