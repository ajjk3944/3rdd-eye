package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ap implements hs1 {

    /* renamed from: a, reason: collision with root package name */
    private final js1 f24774a;

    /* renamed from: b, reason: collision with root package name */
    private final dw1 f24775b;

    public ap(bp clientSideReward, js1 rewardedListener, dw1 reward) {
        kotlin.jvm.internal.l.f(clientSideReward, "clientSideReward");
        kotlin.jvm.internal.l.f(rewardedListener, "rewardedListener");
        kotlin.jvm.internal.l.f(reward, "reward");
        this.f24774a = rewardedListener;
        this.f24775b = reward;
    }

    @Override // com.yandex.mobile.ads.impl.hs1
    public final void a() {
        this.f24774a.a(this.f24775b);
    }
}
