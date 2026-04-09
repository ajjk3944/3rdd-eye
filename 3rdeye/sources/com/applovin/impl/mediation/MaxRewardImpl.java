package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;

/* loaded from: classes.dex */
public class MaxRewardImpl implements MaxReward {

    /* renamed from: a, reason: collision with root package name */
    private final String f20201a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20202b;

    private MaxRewardImpl(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f20201a = str;
        this.f20202b = i;
    }

    public static MaxReward create(int i, String str) {
        return new MaxRewardImpl(i, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f20202b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f20201a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxReward{amount=");
        sb.append(this.f20202b);
        sb.append(", label=");
        return B4.f.c(sb, this.f20201a, "}");
    }
}
