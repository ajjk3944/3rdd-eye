package com.unity3d.ads.core.domain.scar;

import c9.c;
import com.google.protobuf.ByteString;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦Bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/scar/GetHbTokenEventRequest;", "", "Lcom/google/protobuf/ByteString;", "tokenId", "Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;", "biddingSignals", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "invoke", "(Lcom/google/protobuf/ByteString;Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;Lc9/c;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface GetHbTokenEventRequest {
    @Nullable
    Object invoke(@NotNull ByteString byteString, @NotNull BiddingSignals biddingSignals, @NotNull c cVar);
}
