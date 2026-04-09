package com.unity3d.ads.core.domain;

import c9.c;
import com.unity3d.ads.TokenConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H¦Bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "", "", "tokenNumber", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "", "scarSignalsCollected", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "invoke", "(ILcom/unity3d/ads/TokenConfiguration;ZLc9/c;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BuildHeaderBiddingToken {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(BuildHeaderBiddingToken buildHeaderBiddingToken, int i10, TokenConfiguration tokenConfiguration, boolean z10, c cVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i11 & 2) != 0) {
                tokenConfiguration = null;
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            return buildHeaderBiddingToken.invoke(i10, tokenConfiguration, z10, cVar);
        }
    }

    @Nullable
    Object invoke(int i10, @Nullable TokenConfiguration tokenConfiguration, boolean z10, @NotNull c cVar);
}
