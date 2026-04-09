package io.appmetrica.analytics.coreutils.internal.services;

import androidx.work.s;
import kotlin.jvm.internal.g;

/* loaded from: classes3.dex */
public final class UtilityServiceConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final long f38976a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38977b;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ UtilityServiceConfiguration copy$default(UtilityServiceConfiguration utilityServiceConfiguration, long j4, long j10, int i, Object obj) {
        if ((i & 1) != 0) {
            j4 = utilityServiceConfiguration.f38976a;
        }
        if ((i & 2) != 0) {
            j10 = utilityServiceConfiguration.f38977b;
        }
        return utilityServiceConfiguration.copy(j4, j10);
    }

    public final long component1() {
        return this.f38976a;
    }

    public final long component2() {
        return this.f38977b;
    }

    public final UtilityServiceConfiguration copy(long j4, long j10) {
        return new UtilityServiceConfiguration(j4, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilityServiceConfiguration)) {
            return false;
        }
        UtilityServiceConfiguration utilityServiceConfiguration = (UtilityServiceConfiguration) obj;
        return this.f38976a == utilityServiceConfiguration.f38976a && this.f38977b == utilityServiceConfiguration.f38977b;
    }

    public final long getInitialConfigTime() {
        return this.f38976a;
    }

    public final long getLastUpdateConfigTime() {
        return this.f38977b;
    }

    public int hashCode() {
        long j4 = this.f38976a;
        int i = ((int) (j4 ^ (j4 >>> 32))) * 31;
        long j10 = this.f38977b;
        return ((int) ((j10 >>> 32) ^ j10)) + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UtilityServiceConfiguration(initialConfigTime=");
        sb.append(this.f38976a);
        sb.append(", lastUpdateConfigTime=");
        return s.f(sb, this.f38977b, ')');
    }

    public UtilityServiceConfiguration(long j4, long j10) {
        this.f38976a = j4;
        this.f38977b = j10;
    }

    public /* synthetic */ UtilityServiceConfiguration(long j4, long j10, int i, g gVar) {
        this((i & 1) != 0 ? 0L : j4, (i & 2) != 0 ? 0L : j10);
    }
}
