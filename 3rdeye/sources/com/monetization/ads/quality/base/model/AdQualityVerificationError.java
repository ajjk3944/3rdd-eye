package com.monetization.ads.quality.base.model;

import N7.C1154e9;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import io.appmetrica.analytics.impl.Oo;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public abstract class AdQualityVerificationError {
    private static final a Code = new a(0);

    @Deprecated
    public static final int INTERNAL_ERROR = 1;

    @Deprecated
    public static final int INVALID_REQUEST = 2;

    @Deprecated
    public static final int UNKNOWN_ERROR = 0;
    private final int code;
    private final String description;

    public static final class DisabledError extends AdQualityVerificationError {
        public DisabledError() {
            super(1, "The ad verification is disabled by configuration", null);
        }
    }

    public static final class InitializationAlreadyInProcess extends AdQualityVerificationError {
        public InitializationAlreadyInProcess() {
            super(1, "The verification initialization is already in progress", null);
        }
    }

    public static final class InternalError extends AdQualityVerificationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalError(String description) {
            super(1, "The ad verification build in error: ".concat(description), null);
            l.f(description, "description");
        }
    }

    public static final class InvalidAdObject extends AdQualityVerificationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidAdObject(AdQualityVerifiableNetwork network) {
            super(2, C1154e9.i("The ad object for verification ", network.name(), " is invalid"), null);
            l.f(network, "network");
        }
    }

    public static final class InvalidInit extends AdQualityVerificationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidInit(String errorDescription) {
            super(1, "The verifier initialization error: ".concat(errorDescription), null);
            l.f(errorDescription, "errorDescription");
        }
    }

    public static final class LowUsagePercent extends AdQualityVerificationError {
        public LowUsagePercent() {
            super(1, "The ad verification is not in percent usage", null);
        }
    }

    public static final class TimeoutError extends AdQualityVerificationError {
        public TimeoutError(long j4) {
            super(1, Oo.d(j4, "The ad verifications timed out after "), null);
        }
    }

    public static final class UnknownError extends AdQualityVerificationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(String description) {
            super(0, "The ad verification failed with error: ".concat(description), null);
            l.f(description, "description");
        }
    }

    public static final class UnsupportedNetwork extends AdQualityVerificationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnsupportedNetwork(AdQualityVerifiableNetwork network) {
            super(2, C1154e9.i("The ", network.name(), " is unsupported for verification"), null);
            l.f(network, "network");
        }
    }

    public static final class a {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ AdQualityVerificationError(int i, String str, g gVar) {
        this(i, str);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public String toString() {
        return "Ad verification error: (code: " + this.code + ", description: " + this.description + ")";
    }

    private AdQualityVerificationError(int i, String str) {
        this.code = i;
        this.description = str;
    }
}
