package com.vungle.ads.internal.load;

import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.vungle.ads.a0;
import com.vungle.ads.internal.model.BidPayload;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/internal/load/AdRequest;", "Ljava/io/Serializable;", "Lq7/h;", "placement", "Lcom/vungle/ads/internal/model/BidPayload;", LegacyLoadUseCase.KEY_AD_MARKUP, "Lcom/vungle/ads/a0;", "requestAdSize", "<init>", "(Lq7/h;Lcom/vungle/ads/internal/model/BidPayload;Lcom/vungle/ads/a0;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lq7/h;", "getPlacement", "()Lq7/h;", "Lcom/vungle/ads/internal/model/BidPayload;", "getAdMarkup", "()Lcom/vungle/ads/internal/model/BidPayload;", "Lcom/vungle/ads/a0;", "getRequestAdSize", "()Lcom/vungle/ads/a0;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class AdRequest implements Serializable {

    @Nullable
    private final BidPayload adMarkup;

    @NotNull
    private final q7.h placement;

    @Nullable
    private final a0 requestAdSize;

    public AdRequest(@NotNull q7.h placement, @Nullable BidPayload bidPayload, @Nullable a0 a0Var) {
        p.e(placement, "placement");
        this.placement = placement;
        this.adMarkup = bidPayload;
        this.requestAdSize = a0Var;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && p.a(AdRequest.class, other.getClass())) {
            AdRequest adRequest = (AdRequest) other;
            if (!p.a(this.placement.getReferenceId(), adRequest.placement.getReferenceId()) || !p.a(this.requestAdSize, adRequest.requestAdSize)) {
                return false;
            }
            BidPayload bidPayload = this.adMarkup;
            BidPayload bidPayload2 = adRequest.adMarkup;
            if (bidPayload != null) {
                return p.a(bidPayload, bidPayload2);
            }
            if (bidPayload2 == null) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final BidPayload getAdMarkup() {
        return this.adMarkup;
    }

    @NotNull
    public final q7.h getPlacement() {
        return this.placement;
    }

    @Nullable
    public final a0 getRequestAdSize() {
        return this.requestAdSize;
    }

    public int hashCode() {
        int iHashCode = this.placement.getReferenceId().hashCode() * 31;
        a0 a0Var = this.requestAdSize;
        int iHashCode2 = (iHashCode + (a0Var != null ? a0Var.hashCode() : 0)) * 31;
        BidPayload bidPayload = this.adMarkup;
        return iHashCode2 + (bidPayload != null ? bidPayload.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdRequest{placementId='" + this.placement.getReferenceId() + "', adMarkup=" + this.adMarkup + ", requestAdSize=" + this.requestAdSize + '}';
    }
}
