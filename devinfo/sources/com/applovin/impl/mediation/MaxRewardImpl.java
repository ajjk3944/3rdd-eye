package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxRewardImpl implements MaxReward {

    /* renamed from: a, reason: collision with root package name */
    private final String f4545a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4546b;

    private MaxRewardImpl(int i4, String str) {
        if (i4 < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f4545a = str;
        this.f4546b = i4;
    }

    public static MaxReward create(int i4, String str) {
        return new MaxRewardImpl(i4, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f4546b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f4545a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxReward{amount=");
        sb2.append(this.f4546b);
        sb2.append(", label=");
        return d.h.w(sb2, this.f4545a, "}");
    }
}
