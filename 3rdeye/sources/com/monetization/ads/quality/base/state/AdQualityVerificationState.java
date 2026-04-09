package com.monetization.ads.quality.base.state;

import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public interface AdQualityVerificationState {

    public static final class Blocked implements AdQualityVerificationState {
        private final AdQualityVerificationBlockingReasons reason;

        public Blocked(AdQualityVerificationBlockingReasons reason) {
            l.f(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ Blocked copy$default(Blocked blocked, AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons, int i, Object obj) {
            if ((i & 1) != 0) {
                adQualityVerificationBlockingReasons = blocked.reason;
            }
            return blocked.copy(adQualityVerificationBlockingReasons);
        }

        public final AdQualityVerificationBlockingReasons component1() {
            return this.reason;
        }

        public final Blocked copy(AdQualityVerificationBlockingReasons reason) {
            l.f(reason, "reason");
            return new Blocked(reason);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Blocked) && l.b(this.reason, ((Blocked) obj).reason);
        }

        public final AdQualityVerificationBlockingReasons getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "Blocked(reason=" + this.reason + ")";
        }
    }

    public static final class Error implements AdQualityVerificationState {
        private final AdQualityVerificationError error;

        public Error(AdQualityVerificationError error) {
            l.f(error, "error");
            this.error = error;
        }

        public static /* synthetic */ Error copy$default(Error error, AdQualityVerificationError adQualityVerificationError, int i, Object obj) {
            if ((i & 1) != 0) {
                adQualityVerificationError = error.error;
            }
            return error.copy(adQualityVerificationError);
        }

        public final AdQualityVerificationError component1() {
            return this.error;
        }

        public final Error copy(AdQualityVerificationError error) {
            l.f(error, "error");
            return new Error(error);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && l.b(this.error, ((Error) obj).error);
        }

        public final AdQualityVerificationError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }
    }

    public static final class NotStarted implements AdQualityVerificationState {
        public static final NotStarted INSTANCE = new NotStarted();

        private NotStarted() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotStarted);
        }

        public int hashCode() {
            return 1691080461;
        }

        public String toString() {
            return "NotStarted";
        }
    }

    public static final class ShouldBeBlockedOnDisplay implements AdQualityVerificationState {
        private final AdQualityVerificationBlockingReasons reason;

        public ShouldBeBlockedOnDisplay(AdQualityVerificationBlockingReasons reason) {
            l.f(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ ShouldBeBlockedOnDisplay copy$default(ShouldBeBlockedOnDisplay shouldBeBlockedOnDisplay, AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons, int i, Object obj) {
            if ((i & 1) != 0) {
                adQualityVerificationBlockingReasons = shouldBeBlockedOnDisplay.reason;
            }
            return shouldBeBlockedOnDisplay.copy(adQualityVerificationBlockingReasons);
        }

        public final AdQualityVerificationBlockingReasons component1() {
            return this.reason;
        }

        public final ShouldBeBlockedOnDisplay copy(AdQualityVerificationBlockingReasons reason) {
            l.f(reason, "reason");
            return new ShouldBeBlockedOnDisplay(reason);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShouldBeBlockedOnDisplay) && l.b(this.reason, ((ShouldBeBlockedOnDisplay) obj).reason);
        }

        public final AdQualityVerificationBlockingReasons getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "ShouldBeBlockedOnDisplay(reason=" + this.reason + ")";
        }
    }

    public static final class Verified implements AdQualityVerificationState {
        public static final Verified INSTANCE = new Verified();

        private Verified() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Verified);
        }

        public int hashCode() {
            return -800540825;
        }

        public String toString() {
            return "Verified";
        }
    }
}
