package com.monetization.ads.quality.base.model;

import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class AdQualityVerificationBlockingReasons {
    private final List<String> blockReasons;
    private final List<String> reportReasons;

    public AdQualityVerificationBlockingReasons(List<String> blockReasons, List<String> reportReasons) {
        l.f(blockReasons, "blockReasons");
        l.f(reportReasons, "reportReasons");
        this.blockReasons = blockReasons;
        this.reportReasons = reportReasons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdQualityVerificationBlockingReasons copy$default(AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = adQualityVerificationBlockingReasons.blockReasons;
        }
        if ((i & 2) != 0) {
            list2 = adQualityVerificationBlockingReasons.reportReasons;
        }
        return adQualityVerificationBlockingReasons.copy(list, list2);
    }

    public final List<String> component1() {
        return this.blockReasons;
    }

    public final List<String> component2() {
        return this.reportReasons;
    }

    public final AdQualityVerificationBlockingReasons copy(List<String> blockReasons, List<String> reportReasons) {
        l.f(blockReasons, "blockReasons");
        l.f(reportReasons, "reportReasons");
        return new AdQualityVerificationBlockingReasons(blockReasons, reportReasons);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityVerificationBlockingReasons)) {
            return false;
        }
        AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons = (AdQualityVerificationBlockingReasons) obj;
        return l.b(this.blockReasons, adQualityVerificationBlockingReasons.blockReasons) && l.b(this.reportReasons, adQualityVerificationBlockingReasons.reportReasons);
    }

    public final List<String> getBlockReasons() {
        return this.blockReasons;
    }

    public final List<String> getReportReasons() {
        return this.reportReasons;
    }

    public int hashCode() {
        return this.reportReasons.hashCode() + (this.blockReasons.hashCode() * 31);
    }

    public String toString() {
        return "AdQualityVerificationBlockingReasons(blockReasons=" + this.blockReasons + ", reportReasons=" + this.reportReasons + ")";
    }
}
