package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.rewarded.Reward;

/* loaded from: classes3.dex */
public final class nm2 implements Reward {

    /* renamed from: a, reason: collision with root package name */
    private final pr1 f30940a;

    public nm2(pr1 rewardData) {
        kotlin.jvm.internal.l.f(rewardData, "rewardData");
        this.f30940a = rewardData;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nm2) && kotlin.jvm.internal.l.b(((nm2) obj).f30940a, this.f30940a);
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final int getAmount() {
        return this.f30940a.getAmount();
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final String getType() {
        return this.f30940a.getType();
    }

    public final int hashCode() {
        return this.f30940a.hashCode();
    }
}
