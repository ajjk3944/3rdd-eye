package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.instagram.common.viewpoint.core.FL;
import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public interface FI<T extends FL> {
    void AEc(T t10, long j10, long j11, boolean z10);

    void AEe(T t10, long j10, long j11);

    FJ AEf(T t10, long j10, long j11, IOException iOException, int i10);

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "For Media3 Migration Backward Compatibility")
    void AEi(T t10, long j10, long j11, int i10);
}
