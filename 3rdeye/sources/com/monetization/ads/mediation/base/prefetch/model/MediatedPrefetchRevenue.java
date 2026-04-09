package com.monetization.ads.mediation.base.prefetch.model;

/* loaded from: classes2.dex */
public final class MediatedPrefetchRevenue {

    /* renamed from: a, reason: collision with root package name */
    private final double f23712a;

    public MediatedPrefetchRevenue(double d10) {
        this.f23712a = d10;
    }

    public static /* synthetic */ MediatedPrefetchRevenue copy$default(MediatedPrefetchRevenue mediatedPrefetchRevenue, double d10, int i, Object obj) {
        if ((i & 1) != 0) {
            d10 = mediatedPrefetchRevenue.f23712a;
        }
        return mediatedPrefetchRevenue.copy(d10);
    }

    public final double component1() {
        return this.f23712a;
    }

    public final MediatedPrefetchRevenue copy(double d10) {
        return new MediatedPrefetchRevenue(d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MediatedPrefetchRevenue) && Double.compare(this.f23712a, ((MediatedPrefetchRevenue) obj).f23712a) == 0;
    }

    public final double getValue() {
        return this.f23712a;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f23712a);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public String toString() {
        return "MediatedPrefetchRevenue(value=" + this.f23712a + ")";
    }
}
