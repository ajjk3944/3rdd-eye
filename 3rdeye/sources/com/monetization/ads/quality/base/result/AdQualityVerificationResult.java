package com.monetization.ads.quality.base.result;

import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public interface AdQualityVerificationResult {

    public static final class NotImplemented implements AdQualityVerificationResult {
        public static final NotImplemented INSTANCE = new NotImplemented();

        private NotImplemented() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotImplemented);
        }

        public int hashCode() {
            return -293539646;
        }

        public String toString() {
            return "NotImplemented";
        }
    }

    public static final class NotVerified implements AdQualityVerificationResult {
        private final AdQualityVerificationError reason;

        public NotVerified(AdQualityVerificationError reason) {
            l.f(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ NotVerified copy$default(NotVerified notVerified, AdQualityVerificationError adQualityVerificationError, int i, Object obj) {
            if ((i & 1) != 0) {
                adQualityVerificationError = notVerified.reason;
            }
            return notVerified.copy(adQualityVerificationError);
        }

        public final AdQualityVerificationError component1() {
            return this.reason;
        }

        public final NotVerified copy(AdQualityVerificationError reason) {
            l.f(reason, "reason");
            return new NotVerified(reason);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotVerified) && l.b(this.reason, ((NotVerified) obj).reason);
        }

        public final AdQualityVerificationError getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "NotVerified(reason=" + this.reason + ")";
        }
    }

    public static final class Verified implements AdQualityVerificationResult {
        private final AdQualityVerificationStateFlow verifiedAd;

        public Verified(AdQualityVerificationStateFlow verifiedAd) {
            l.f(verifiedAd, "verifiedAd");
            this.verifiedAd = verifiedAd;
        }

        public static /* synthetic */ Verified copy$default(Verified verified, AdQualityVerificationStateFlow adQualityVerificationStateFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                adQualityVerificationStateFlow = verified.verifiedAd;
            }
            return verified.copy(adQualityVerificationStateFlow);
        }

        public final AdQualityVerificationStateFlow component1() {
            return this.verifiedAd;
        }

        public final Verified copy(AdQualityVerificationStateFlow verifiedAd) {
            l.f(verifiedAd, "verifiedAd");
            return new Verified(verifiedAd);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Verified) && l.b(this.verifiedAd, ((Verified) obj).verifiedAd);
        }

        public final AdQualityVerificationStateFlow getVerifiedAd() {
            return this.verifiedAd;
        }

        public int hashCode() {
            return this.verifiedAd.hashCode();
        }

        public String toString() {
            return "Verified(verifiedAd=" + this.verifiedAd + ")";
        }
    }

    public static final class WaitingForVerification implements AdQualityVerificationResult {
        public static final WaitingForVerification INSTANCE = new WaitingForVerification();

        private WaitingForVerification() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WaitingForVerification);
        }

        public int hashCode() {
            return 393213194;
        }

        public String toString() {
            return "WaitingForVerification";
        }
    }
}
